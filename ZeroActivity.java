package com.awkhan94.zero;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class ZeroActivity extends AppCompatActivity {

    private static final String TAG = "DEBUG: ZeroActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zero);

        Log.d(TAG, "onCreate running");
    }
}
