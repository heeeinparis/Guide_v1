package com.example.sohee.guide_v1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void OnLoginbtnClicked(View v){
        Intent loginbtnIntent = new Intent(getApplicationContext(),LoginActivity.class);
        startActivity(loginbtnIntent);
    }

}
