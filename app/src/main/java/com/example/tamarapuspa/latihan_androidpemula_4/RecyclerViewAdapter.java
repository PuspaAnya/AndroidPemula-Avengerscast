package com.example.tamarapuspa.latihan_androidpemula_4;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import org.w3c.dom.Text;

import java.lang.reflect.Array;
import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by User on 1/1/2018.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>{

    private static final String TAG = "RecyclerViewAdapter";

    private ArrayList<String> mImageNames = new ArrayList<>();
    private ArrayList<String> mImages = new ArrayList<>();
    private ArrayList<String> mImageNameCast = new ArrayList<>();
    private ArrayList<String> mDescCast = new ArrayList<>();
    private ArrayList<String> mBioCast = new ArrayList<>();
    private Context mContext;

    public RecyclerViewAdapter(Context context, ArrayList<String> imageNames, ArrayList<String> images, ArrayList<String> imageNameCast, ArrayList<String> descCast, ArrayList<String> bioCast ) {
        mImageNames = imageNames;
        mImages = images;
        mImageNameCast = imageNameCast;
        mDescCast = descCast;
        mBioCast = bioCast;
        mContext = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_listitem, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        Log.d(TAG, "onBindViewHolder: called.");

        Glide.with(mContext)
                .asBitmap()
                .load(mImages.get(position))
                .into(holder.image);

        holder.imageName.setText(mImageNames.get(position));
        holder.imageNameCast.setText(mImageNameCast.get(position));
//        holder.descCast.setText(mDescCast.get(position));
//        holder.bioCast.setText(mBioCast.get(position));

        holder.parentLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: clicked on: " + mImageNames.get(position));

                  Toast.makeText(mContext, mImageNames.get(position),Toast.LENGTH_SHORT).show();
//                Toast.makeText(mContext, mImageNameCast.get(position), Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(mContext, DetailActivity.class);
                intent.putExtra("image_url", mImages.get(position));
                intent.putExtra("image_name", mImageNames.get(position));
                intent.putExtra("image_name_cast", mImageNameCast.get(position));
                intent.putExtra("desc_cast", mDescCast.get(position));
                intent.putExtra("bio_cast", mBioCast.get(position));
                mContext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mImageNames.size();
    }
//    public int getItemCountCast(){
//        return mImageNameCast.size();
//    }
//    public int getItemCountDesc(){
//        return mDescCast.size();
//    }
//    public int getItemCountBio(){
//        return mBioCast.size();
//    }


    public class ViewHolder extends RecyclerView.ViewHolder{

        CircleImageView image;
        TextView imageName;
        TextView imageNameCast;
        TextView descCast;
        TextView bioCast;
        RelativeLayout parentLayout;

        public ViewHolder(View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.image);
            imageName = itemView.findViewById(R.id.image_name);
            imageNameCast = itemView.findViewById(R.id.image_cast);
//            descCast = itemView.findViewById(R.id.description_cast);
//            bioCast = itemView.findViewById(R.id.bio_cast);
            parentLayout = itemView.findViewById(R.id.parent_layout);
        }
    }
}