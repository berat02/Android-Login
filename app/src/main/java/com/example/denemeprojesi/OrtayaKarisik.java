package com.example.denemeprojesi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class OrtayaKarisik extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ortaya_karisik);

        ImageView img = (ImageView) findViewById(R.id.userimg);
        img.setImageResource(R.drawable.user);

        ImageView geriİmg = (ImageView) findViewById(R.id.geri);{
            geriİmg.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    Intent intent = new Intent(OrtayaKarisik.this, MainActivity.class);
                    OrtayaKarisik.this.startActivity(intent);
                }

        });
        }
    }
}