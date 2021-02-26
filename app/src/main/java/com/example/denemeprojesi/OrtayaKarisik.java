package com.example.denemeprojesi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;

public class OrtayaKarisik extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ortaya_karisik);

        ImageView img = (ImageView) findViewById(R.id.userimg);
        img.setImageResource(R.drawable.user);
    }
}