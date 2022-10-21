package com.example.bio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btMaps, btnEmail, btntelp;
    //private TextView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //back = (TextView) findViewById(R.id.txt);

        btMaps = findViewById(R.id.btMaps);
        btMaps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri gmmIntentUri = Uri.parse("geo:?q=-7.0265399,110.5181459");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);
            }
        });

        btnEmail = findViewById(R.id.btnEmail);
        btnEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW , Uri.parse("mailto:" + "daffaaryatama40@gmail.com"));
                startActivity(intent);
            }
        });

        btntelp = findViewById(R.id.btntelp);
        btntelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("tel:082226418035");
                Intent it = new  Intent (Intent.ACTION_VIEW, uri);
                startActivity(it);;
            }
        });

    }
}