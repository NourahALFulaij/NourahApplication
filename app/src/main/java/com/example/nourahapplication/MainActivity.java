package com.example.nourahapplication;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
public static final String EXTRA_MESSAGE ="com.example.myfirstapp.MESSAGE";
    private Intent packageContext;
    private Context PackageContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view){
       // Object packageContext;
        Intent intent = new Intent (  this,DisplayMessageActivity.class);
        EditText editText =(EditText) findViewById(R.id.editTextTextPersonName);
        String message;
        message = editText.getText ().toString ();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);


    }

    public void startActivity(Intent intent) {
    }

    private class DisplayMessageActivity {
    }
}