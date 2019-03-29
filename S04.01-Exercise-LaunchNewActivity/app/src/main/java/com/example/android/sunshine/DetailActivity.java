package com.example.android.sunshine;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
        TextView mMessage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        mMessage = (TextView) findViewById(R.id.tv_message);
        Intent intent = getIntent();
        if(mMessage != null && intent != null)
        {
            mMessage.setText(intent.getStringExtra(Intent.EXTRA_TEXT));
        }
    }
}
