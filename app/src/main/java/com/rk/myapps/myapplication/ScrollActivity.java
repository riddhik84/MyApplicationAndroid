package com.rk.myapps.myapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

public class ScrollActivity extends AppCompatActivity {

    @Bind(R.id.movie_image)
    ImageView movie_image;
    @Bind(R.id.movie_name)
    TextView movie_name;
    @Bind(R.id.movie_rlease_date)
    TextView movie_release_date;
    @Bind(R.id.movie_ratings)
    TextView movie_ratings;
    @Bind(R.id.movie_overview)
    TextView movie_overview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ButterKnife.bind(this);

        toolbar.setTitle("Tamasha");

        movie_image.setImageResource(R.drawable.tamasha);
        movie_name.setText("Tamasha");
        movie_release_date.setText("Release Date: 2016-May-01");
        movie_ratings.setText("Movie ratings: 10.0");
        movie_overview.setText("Tamasha (English: Spectacle[4]) is a 2015 Indian romantic drama film written and directed by Imtiaz Ali and produced by Sajid Nadiadwala under his banner, Nadiadwala Grandson Entertainment. It features Ranbir Kapoor and Deepika Padukone in lead roles. The film score and soundtrack album was composed by A. R. Rahman, with lyrics from Irshad Kamil.\n" +
                "\n" +
                "Filmed briefly in Corsica, Indian cities–Shimla, Delhi, Gurgaon, Kolkata; followed by two-day schedule in Tokyo, Tamasha tells the story of character Ved Vardhan Sahni (played by Kapoor) who loses his self by living according to the social conventions expected of him. The film portrays Ved's life in three stages–as a nine-year-old child, a 19-year-old adolescent and a 30-year-old adult in a spectacle-based non-linear screenplay. Tara Maheshwari (played by Padukone) identifies herself more with Ved's life, helping him to come out of his split personality and become a spectacle-oriented performer. The story is based on the central theme of abrasion and loss of self resulting from a constant attempt to fit in oneself back.\n" +
                "\n" +
                "The film was released on November 27, 2015 to mixed reviews by film critics.[5] However, they praised the performances of lead actors but criticised the unsatisfactory togetherness of the plot. The film received nominations for direction, music and performances of the lead actors, notably Kapoor being nominated under Filmfare Award for Best Actor category and Irshad Kamil winning the Filmfare Award for Best Lyrics for his lyrical work to the soundtrack album of the film.");
    }

}
