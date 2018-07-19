package com.example.tiffany.tourguidemadison;

public class Attraction {
    private String mName;
    private String mAddress;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    public Attraction(String name, String address, int imageResourceId) {
        mName = name;
        mAddress = address;
        mImageResourceId = imageResourceId;
    }

    public Attraction(String name, String address) {
        mName = name;
        mAddress = address;
    }

    public String getAttractionName() {
        return mName;
    }

    public String getAttractionAddress() {
        return mAddress;
    }

    public int getImageResourceId() { return mImageResourceId; }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
