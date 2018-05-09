package com.example.rlesh.sliderproject;

import  android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private final long FINISH_INTERVAL_TIME = 2000;
    private long backPressedTime = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onBackPressed() {
        long tempTime = System.currentTimeMillis();
        long intervalTime = tempTime - backPressedTime;

        if (0 <= intervalTime && FINISH_INTERVAL_TIME >= intervalTime)
        {
            super.onBackPressed();
        }
        else
        {
            backPressedTime = tempTime;
            Toast.makeText(getApplicationContext(), "한 번 더 누르면 종료됩니다.", Toast.LENGTH_SHORT).show();
        }
    }


    @Override
    protected void onStart()
    {
        super.onStart();
        setContentView(R.layout.activity_main);
    }
    @Override
    protected void onPause()
  {
        super.onPause();
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStop()
    {
        super.onStop();
        setContentView(R.layout.activity_main);
    }
    @Override
    protected void onDestroy()
    {
        super.onDestroy();
        setContentView(R.layout.activity_main);
    }
}
