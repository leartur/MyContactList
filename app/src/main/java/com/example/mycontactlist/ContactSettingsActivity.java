package com.example.mycontactlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class ContactSettingsActivity extends AppCompatActivity {

    public static final String TAG = "artMessage";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_settings);
        Log.i(TAG, "onCreate");
    }
}