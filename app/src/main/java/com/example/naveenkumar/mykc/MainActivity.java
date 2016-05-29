package com.example.naveenkumar.mykc;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.parse.Parse;
import com.parse.ParseObject;
import com.parse.ParseUser;

import java.text.ParseException;

public class MainActivity extends AppCompatActivity {

    final Context cnt=this;
    public String s;
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(AppClass.parseflag==0) {
            Parse.enableLocalDatastore(this);
            Parse.initialize(this);
            AppClass.parseflag=1;
        }
        editText=(EditText)findViewById(R.id.editText);
        s=editText.getText().toString();
        Button btn=(Button)findViewById(R.id.main_menubutton);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s = editText.getText().toString();
                if (!s.equals("")) {
                    Intent intent = new Intent();
                    intent.setClass(cnt, category.class);
                    startActivity(intent);
                    AppClass.tableno = Integer.parseInt(s);
                } else {
                    Toast.makeText(getApplicationContext(), "Enter Table No.", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
