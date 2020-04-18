package com.example.musicalapp;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class SongActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song);

        //Set song name, artist name, and imageview from currentSong object

        String value = getIntent().getStringExtra("message");
        String value1 = getIntent().getStringExtra("message1");
        int imageId = getIntent().getIntExtra("imageId", R.id.song_image);

        TextView song = findViewById(R.id.song_name_text_view);
        song.setText(value);

        TextView song1 = findViewById(R.id.artist_name_text_view);
        song1.setText(value1);

        ImageView image = findViewById(R.id.song_image);
        image.setImageResource(imageId);

        //Set a Listener on button to open the MainActtivity
        Button back = findViewById(R.id.back_button);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent backIntent = new Intent(SongActivity.this, MainActivity.class);
                startActivity(backIntent);
            }
        });

    }
}
