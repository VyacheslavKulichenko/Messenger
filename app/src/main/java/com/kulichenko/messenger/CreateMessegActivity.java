package com.kulichenko.messenger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class CreateMessegActivity extends AppCompatActivity {
    private EditText editTextMsg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_messeg);
        editTextMsg = findViewById(R.id.editTextMesseg);
        //ImageView imageView = findViewById(R.id.imageView4);
        //imageView.setImageResource(R.drawable.imag2);

    }

    public void onClickSendMsg(View view) {
        String msg = editTextMsg.getText().toString();
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, msg);
        Intent choesenIntent = Intent.createChooser(intent, getString(R.string.chooser_title));
        startActivity(choesenIntent);

    }
}