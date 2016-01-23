package com.example.administrator.gitproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    String one="첫번쨰 커밋";
    String two="두번째 커밋";
    String three="세번째로 커밋 추가";
    String fore="네번째";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
