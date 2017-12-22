package com.nathanvinhadelli.gorgon;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.AnimationUtils;

public class OpenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open);
    }

    public void initAnimation(){
        Animation amim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim)
    }
}
