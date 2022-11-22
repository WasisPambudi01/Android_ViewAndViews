package com.example.myviewandviews;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private String phoneNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnPhoneCall = findViewById(R.id.btn_phone_call);
        Button btnBuy = findViewById(R.id.btn_buy);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("AGKBOTS G40");
        }

        phoneNumber = "089648939929";
        btnPhoneCall.setOnClickListener(this);
        btnBuy.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btn_phone_call) {
            Intent callPhoneIntent = new Intent();
            callPhoneIntent.setAction(Intent.ACTION_DIAL);
            callPhoneIntent.setData(Uri.parse("tel:" + phoneNumber));
            startActivity(callPhoneIntent);
        }
    }
}