package com.example.tiffany.runningmusicapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<Song> {
    public SongAdapter(Activity context, ArrayList<Song> songArrayList) {
        super(context, 0, songArrayList);
    }

    @Override
    public View getView (int position, View convertView, ViewGroup parent){
        Song currentSong = getItem(position);

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.song_item, parent, false);
        }

        TextView titleTextView = (TextView) listItemView.findViewById(R.id.song_title);
        titleTextView.setText(currentSong.getTitle());

        TextView artistTextView = (TextView) listItemView.findViewById(R.id.song_artist);
        artistTextView.setText(currentSong.getArtist());

        TextView bpmTextView = (TextView) listItemView.findViewById(R.id.song_bpm);
        bpmTextView.setText(String.valueOf(currentSong.getBPM()));

        return listItemView;
    }

}
