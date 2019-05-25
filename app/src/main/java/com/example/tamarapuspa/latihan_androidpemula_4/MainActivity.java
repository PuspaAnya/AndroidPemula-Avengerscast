package com.example.tamarapuspa.latihan_androidpemula_4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    //vars
    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mNameCast = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();
    private ArrayList<String> mDescriptionCast = new ArrayList<>();
    private ArrayList<String> mBioCast = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Avengers Cast");
        Log.d(TAG, "onCreate: started.");

        initImageBitmaps();
    }

    private void initImageBitmaps(){
        Log.d(TAG, "initImageBitmaps: preparing bitmaps.");

        mImageUrls.add("https://cdn0-production-images-kly.akamaized.net/SG8AwjZR2KMSdSEw9noCYNDIfuY=/640x360/smart/filters:quality(75):strip_icc():format(jpeg)/kly-media-production/medias/649633/original/chris-evans-2013-vanity-fair-oscar-party-01.jpg");
        mNames.add("Chris Evan");
        mNameCast.add("Captain America");
        mDescriptionCast.add("Christopher Robert Evans is an American actor. Evans is known for his superhero roles as the Marvel Comics characters Captain America in the Marvel Cinematic Universe and Human Torch in Fantastic Four and its 2007 sequel.");
        mBioCast.add("Born: June 13, 1981 (age 37 years), Boston, Massachusetts, United States\n" +
                "Height: 1.83 m\n" +
                "Siblings: Scott Evans, Carly Evans, Shanna Evans");

        mImageUrls.add("https://s1.ibtimes.com/sites/www.ibtimes.com/files/styles/full/public/2018/04/22/chris-hemsworth.jpg");
        mNames.add("Chris Hemsworth");
        mNameCast.add("Thor");
        mDescriptionCast.add("Christopher Hemsworth is an Australian actor. He rose to prominence playing Kim Hyde in the Australian TV series Home and Away.");
        mBioCast.add("Born: August 11, 1983 (age 35 years), Melbourne, Australia\n" +
                "Height: 1.9 m\n" +
                "Wife: Elsa Pataky (m. 2010)\n" +
                "Children: Tristan Hemsworth, Sasha Hemsworth, India Rose Hemsworth\n" +
                "Siblings: Liam Hemsworth, Luke Hemsworth");

        mImageUrls.add("https://cbsnews1.cbsistatic.com/hub/i/2017/06/29/fe40ccf2-90d6-4b24-92bf-b8795d04c2c2/gettyimages-803015182.jpg");
        mNames.add("Robert Downey Jr.");
        mNameCast.add("Iron Man");
        mDescriptionCast.add("Robert John Downey Jr. is an American actor. His career has included critical and popular success in his youth, followed by a period of substance abuse and legal difficulties, and a resurgence of commercial success in middle age.");
        mBioCast.add("Born: April 4, 1965 (age 54 years), Manhattan, New York, United States\n" +
                "Height: 1.74 m\n" +
                "Children: Indio Falconer Downey, Exton Elias Downey, Avri Roel Downey\n" +
                "Spouse: Susan Downey (m. 2005), Deborah Falconer (m. 1992–2004)");

        mImageUrls.add("https://upload.wikimedia.org/wikipedia/commons/thumb/1/1b/Scarlett_Johansson_SDCC_2013_by_Gage_Skidmore_1.jpg/1200px-Scarlett_Johansson_SDCC_2013_by_Gage_Skidmore_1.jpg");
        mNames.add("Scarlett Johansson");
        mNameCast.add("Black Widow");
        mDescriptionCast.add("Scarlett Ingrid Johansson is an American actress and singer. Johansson is the world's highest-paid actress, has made multiple appearances in the Forbes Celebrity 100, and has a star on the Hollywood Walk of Fame. She aspired to be an actress from a young age, and first appeared on stage in an Off-Broadway play as a child.");
        mBioCast.add("Born: November 22, 1984 (age 34 years), Manhattan, New York City, New York, America\n" +
                "Tinggi: 1,6 m\n" +
                "Husband: Ryan Reynolds (k. 2008; c. 2011); Romain Dauriac (k. 2014; c. 2017)\n" +
                "Partner: Romain Dauriac (m. 2014–2017), Ryan Reynolds (m. 2008–2011)\n" +
                "Childern: Rose Dorothy Dauriac");


        mImageUrls.add("https://upload.wikimedia.org/wikipedia/commons/thumb/2/21/MarkRuffalo07TIFF.jpg/220px-MarkRuffalo07TIFF.jpg");
        mNames.add("Mark Ruffalo");
        mNameCast.add("Hulk");
        mDescriptionCast.add("Mark Alan Ruffalo is an American actor and producer. He made his screen debut in an episode of CBS Summer Playhouse, followed by minor film roles, and was part of the original cast of This Is Our Youth. Following roles were in 13 Going on 30, Eternal Sunshine of the Spotless Mind, Zodiac and What Doesn't Kill You.");
        mBioCast.add("Born: November 22, 1967 (age 51 years), Kenosha, Wisconsin, United States\n" +
                "Height: 1.73 m\n" +
                "Wife: Sunrise Coigney (m. 2000)\n" +
                "Children: Keen Ruffalo, Odette Ruffalo, Bella Noche Ruffalo\n" +
                "Siblings: Scott Ruffalo, Tania Ruffalo, Nicole Ruffalo");

        mImageUrls.add("https://vignette.wikia.nocookie.net/marvelmovies/images/2/24/Jeremy_Renner.jpg/revision/latest?cb=20170325215053");
        mNames.add("Jeremy Renner");
        mNameCast.add("Clint");
        mDescriptionCast.add("Jeremy Lee Renner is an American actor. He appeared largely in independent films such as Dahmer and Neo Ned. Renner earned supporting roles in bigger films, such as S.W.A.T. and 28 Weeks Later.");
        mBioCast.add("Born: January 7, 1971 (age 48 years), Modesto, California, United States\n" +
                "Height: 1.75 m\n" +
                "Wife: Sonni Pacheco (m. 2014–2015)\n" +
                "Children: Ava Berlin Renner");

        mImageUrls.add("https://www.indiewire.com/wp-content/uploads/2019/03/shutterstock_10139128cg.jpg?w=780");
        mNames.add("Brie Larson");
        mNameCast.add("Captain Marvel");
        mDescriptionCast.add("Brianne Sidonie Desaulniers (born October 1, 1989), known professionally as Brie Larson, is an American actress and filmmaker. Noted for her supporting work in comedies when a teenager, she has since expanded to leading roles in independent dramas and film franchises, receiving such accolades as an Academy Award and a Golden Globe. Time magazine named her one of the 100 most influential people in the world in 2019.");
        mBioCast.add("Born: October 1, 1989 (age 29 years), Sacramento, California, Amerika\n" +
                "Height: 1.7 m\n" +
                "Siblings: Milaine Desaulniers");

        mImageUrls.add("https://www.sheknows.com/wp-content/uploads/2019/04/paul-rudd-birthday-50-1.jpg");
        mNames.add("Paul Rudd");
        mNameCast.add("Ant Man");
        mDescriptionCast.add("Paul Stephen Rudd (born April 6, 1969) is an American actor, comedian, writer, and film producer. Rudd studied theatre at the University of Kansas and the American Academy of Dramatic Arts, before making his acting debut in 1992 with NBC's drama series Sisters.");
        mBioCast.add("Born: April 6, 1969 (age 50 years), Passaic, New Jersey, Amerika\n" +
                "Heigh: 1,78 m\n" +
                "Wife: Julie Yaeger (m. 2003)\n" +
                "Childern: Jack Sullivan Rudd, Darby Rudd\n" +
                "Parents: Gloria Rudd, Michael Rudd");

        mImageUrls.add("https://ewedit.files.wordpress.com/2016/07/tom-holland_0.jpg");
        mNames.add("Tom Holland");
        mNameCast.add("Spiderman");
        mDescriptionCast.add("Thomas Stanley Holland is an English actor and dancer. A graduate of the BRIT School in London, he is known for playing Spider-Man in the Marvel Cinematic Universe.");
        mBioCast.add("Born: June 1, 1996 (age 22 years), Kingston upon Thames, United Kingdom\n" +
                "Height: 1.73 m\n" +
                "Upcoming movies: Spider-Man: Far From Home, Chaos Walking\n" +
                "Siblings: Harry Holland, Sam Holland\n" +
                "Parents: Dominic Holland, Nicola Elizabeth Frost");

        initRecyclerView();
    }

    private void initRecyclerView(){
        Log.d(TAG, "initRecyclerView: init recyclerview.");
        RecyclerView recyclerView = findViewById(R.id.recyclerv_view);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, mNames, mImageUrls, mNameCast, mDescriptionCast, mBioCast);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
