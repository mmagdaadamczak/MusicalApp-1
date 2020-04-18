
package com.example.musicalapp;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;


public class SongAdapter extends ArrayAdapter<Song> {
    private Context context;

    /**
     * Create a new SongAdapter object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param songs   is the list of songs to be displayed.
     */
    public SongAdapter(Context context, ArrayList<Song> songs) {
        super(context, 0, songs);
        this.context = context;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.item_view, parent, false);
        }

        // Get the Song object located at this position in the list
        final Song currentSong = getItem(position);

        // Find the TextView in the item_view.xml layout with the ID artist_text_view.
        TextView artistTextView = (TextView) listItemView.findViewById(R.id.artist_text_view);
        // Get the artist name from the currentSong object and set this text on
        // the default TextView.
        artistTextView.setText(currentSong.getArtistName());


        // Find the TextView in the item_view.xml layout with the ID song_text_view.
        TextView songTextView = (TextView) listItemView.findViewById(R.id.song_text_view);
        // Get the song name from the currentSong object and set this text on
        // the default TextView.
        songTextView.setText(currentSong.getSongName());

        // Find the ImageView in the item_view.xml layout with the ID image_view.
        ImageView image = listItemView.findViewById(R.id.image_view);
        // Get the song image from the currentSong object and set this text on
        // the default ImageView .
        image.setImageResource(currentSong.getImageResourceId());

        // Find the Button in the item_view.xml layout with the ID play_button.
        Button play = listItemView.findViewById(R.id.play_button);
        // Set a click listener on that View
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Create a new intent to open the SongActivity
                Intent intent = new Intent(context, SongActivity.class);

                //Set song name, artist name, and imageview from currentSong object
                intent.putExtra("message", currentSong.getSongName());
                intent.putExtra("message1", currentSong.getArtistName());
                intent.putExtra("imageId", currentSong.getImageResourceId());

                context.startActivity(intent);

            }
        });

        // Return the whole list item layout, so that it can be shown in
        // the ListView.

        return listItemView;
    }
}
