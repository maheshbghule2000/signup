package com.example.signup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText etname;
String mName="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etname=findViewById(R.id.mName);
        mName=etname.getText().toString();
    }
    public void save(View view){
        mName=etname.getText().toString();
        Toast.makeText(this,mName+"saved",Toast.LENGTH_LONG).show();
    }
}

