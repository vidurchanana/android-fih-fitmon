package com.fih.scu.fitnessmonkey;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.android.gms.common.SignInButton;

public class MainActivity extends AppCompatActivity {

    private SignInButton mGoogleBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mGoogleBtn = (SignInButton) findViewById(R.id.googleBtn);
    }
}
