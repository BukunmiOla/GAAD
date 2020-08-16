package com.example.gaad;

import android.os.Bundle;

import androidx.lifecycle.ViewModel;

public class MainActivityViewModel extends ViewModel {

    public static final String ORIGINAL_NOTE_COURSE_ID = "com.example.gaad.ORIGINAL_NOTE_COURSE_ID";
    public static final String ORIGINAL_NOTE_TITLE = "com.example.gaad.ORIGINAL_NOTE_TITLE";
    public static final String ORIGINAL_NOTE_TEXT = "com.example.gaad.ORIGINAL_NOTE_TEXT";

    public String mMOriginalNoteCourseId;
    public String mOriginalNoteText;
    public String mOriginalNoteTitle;
    public boolean mIsNewlyCreated = true;

    public void saveState(Bundle outState) {
        outState.putString(ORIGINAL_NOTE_COURSE_ID,mMOriginalNoteCourseId);
        outState.putString(ORIGINAL_NOTE_TITLE,mOriginalNoteTitle);
        outState.putString(ORIGINAL_NOTE_TEXT,mOriginalNoteText);
    }

    public void  restoreState(Bundle inState){
        mMOriginalNoteCourseId = inState.getString(ORIGINAL_NOTE_COURSE_ID);
        mOriginalNoteTitle = inState.getString(ORIGINAL_NOTE_TITLE);
        mOriginalNoteText = inState.getString(ORIGINAL_NOTE_TEXT);
    }

}