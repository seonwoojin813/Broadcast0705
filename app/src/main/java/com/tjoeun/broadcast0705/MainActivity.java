package com.tjoeun.broadcast0705;

import androidx.appcompat.app.AppCompatActivity;

import android.content.IntentFilter;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //리시버를 등록 - 오레오 버전 이후에는 이렇게 직접 등록해야 합니다.
        registerReceiver(new MyReceiver(),
                new IntentFilter(
                        "com.example.sendbroadcast"));
    }
}
