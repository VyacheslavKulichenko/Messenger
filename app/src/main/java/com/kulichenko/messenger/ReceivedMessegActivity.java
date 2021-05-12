package com.kulichenko.messenger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ReceivedMessegActivity extends AppCompatActivity {
    private TextView textViewRecivedMsg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_received_messeg);
        textViewRecivedMsg = findViewById(R.id.textViewRecivedMsg);
        Intent intent = getIntent();
        String msg = intent.getStringExtra("msg");
        textViewRecivedMsg.setText(msg);

    }
}