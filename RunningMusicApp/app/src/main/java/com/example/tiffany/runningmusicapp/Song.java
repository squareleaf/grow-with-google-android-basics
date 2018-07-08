package com.example.tiffany.runningmusicapp;

public class Song {

    private String mTitle;
    private String mArtist;
    private String mBeatsPerMinute;

    public Song(String title, String artist, String beatsPerMinute) {
        mTitle = title;
        mArtist = artist;
        mBeatsPerMinute = beatsPerMinute;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getArtist() {
        return mArtist;
    }

    public String getBPM() {
        return mBeatsPerMinute + "bpm";
    }
}
