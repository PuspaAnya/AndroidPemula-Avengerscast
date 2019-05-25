package com.example.tamarapuspa.latihan_androidpemula_4;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import org.w3c.dom.Text;

public class DetailActivity extends AppCompatActivity {

    private static final String TAG = "DetailActivity";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Log.d(TAG, "onCreate: started.");

        getIncomingIntent();
    }

    private void getIncomingIntent(){
        setTitle("Detail Cast");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Log.d(TAG, "getIncomingIntent: checking for incoming intents.");

        if(getIntent().hasExtra("image_url") && getIntent().hasExtra("image_name") && getIntent().hasExtra("image_name_cast") && getIntent().hasExtra("desc_cast") && getIntent().hasExtra("bio_cast")){
            Log.d(TAG, "getIncomingIntent: found intent extras.");

            String imageUrl = getIntent().getStringExtra("image_url");
            String imageName = getIntent().getStringExtra("image_name");
            String imageNameCast = getIntent().getStringExtra("image_name_cast");
            String descCast = getIntent().getStringExtra("desc_cast");
            String bioCast = getIntent().getStringExtra("bio_cast");

            setImage(imageUrl, imageName, imageNameCast, descCast, bioCast);
        }
    }


    private void setImage(String imageUrl, String imageName, String imageNameCast, String descCast, String bioCast){
        Log.d(TAG, "setImage: setting te image and name to widgets.");

        TextView name = findViewById(R.id.image_description);
        name.setText(imageName);

        TextView namecast = findViewById(R.id.image_desc_cast);
        namecast.setText(imageNameCast);

        TextView desccast = findViewById(R.id.description_cast);
        desccast.setText(descCast);

        TextView biocast = findViewById(R.id.bio_cast);
        biocast.setText(bioCast);

        ImageView image = findViewById(R.id.image);
        Glide.with(this)
                .asBitmap()
                .load(imageUrl)
                .into(image);
    }
}