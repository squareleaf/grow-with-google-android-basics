package com.example.tiffany.runningmusicapp;

public class Song {

    private String mTitle;
    private String mArtist;
    private int mBeatsPerMinute;

    public Song(String title, String artist, int beatsPerMinute) {
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

    public int getBPM() {
        return mBeatsPerMinute;
    }
}
