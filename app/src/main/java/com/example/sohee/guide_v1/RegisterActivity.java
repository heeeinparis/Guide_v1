package com.example.sohee.guide_v1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class RegisterActivity extends AppCompatActivity {

    ArrayAdapter<String> adapter;
    ArrayAdapter<String> nameAdapter;
    ArrayList<String> numList;
    ArrayList<String> nameList;

    EditText numname;
    EditText numname2;

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        numname = (EditText)findViewById(R.id.nameedittext);
        numname2 =(EditText)findViewById(R.id.numedittext);

        numList = new ArrayList<String>();
        nameList = new ArrayList<String>();


        adapter = new ArrayAdapter<String>(this,R.layout.simpleitem,numList);

        Button regbutton = (Button)findViewById(R.id.registbtn);

        ListView numlist = (ListView)findViewById(R.id.registlistView);
        ListView namelist = (ListView)findViewById(R.id.registlistView);


        numlist.setAdapter(adapter);
        namelist.setAdapter(adapter);

        regbutton.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v)    {

                numList.add(0,numname2.getText().toString() +" " +numname.getText().toString());
                adapter.notifyDataSetChanged();

            }
        });




    }

}
