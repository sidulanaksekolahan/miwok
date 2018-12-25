package com.example.android.miwok;

public class Word {

    //Default translation for the word
    private String mDefaultTranslation;

    //Miwok translation for the word
    private String mMiwokTranslation;

    // Image reource ID for the word
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    // Meaning that the number is out of the range of all the possible valid resource ID
    private static final int NO_IMAGE_PROVIDED = -1;

    /** Audio resource ID for the word */
    private int mAudioResourceId;

    //Constructor
    public Word(String defaultTranslation, String miwokTranslation, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = audioResourceId;
    }

    //Constructor
    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    // Return wheter or not there is an image for this word
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    // Return the audio resource ID of the word
    public int getAudioResourceId() {
        return mAudioResourceId;
    }

    public String toString() {
        return "Word{"+"mDefaultTranslation="+mDefaultTranslation+"\n"+
                "mMiwokTranslation="+mMiwokTranslation+"\n"+
                "mAudioResourceId="+mAudioResourceId+"\n"+
                "mImageResourceId="+mImageResourceId+"}";
    }
}
