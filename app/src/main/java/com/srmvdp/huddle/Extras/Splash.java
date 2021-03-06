package com.srmvdp.huddle.Extras;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.srmvdp.huddle.LocalStorage.SessionManagement;
import com.srmvdp.huddle.LoginRegisterTabbed;

public class Splash extends AppCompatActivity {

    private SessionManagement session;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        session = new SessionManagement(getApplicationContext());

        Intent intent = new Intent(this, LoginRegisterTabbed.class);
        startActivity(intent);
        finish();
    }
}