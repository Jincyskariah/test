package com.example.autocmpltetxtview;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    String[] fruits={"Apple","Orange"," Grape","Cherry","Date","Banana","Kiwi"};
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.btnradio);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(MainActivity.this,android.R.layout.select_dialog_item,fruits);
        AutoCompleteTextView actv=(AutoCompleteTextView) findViewById(R.id.autoCompleteTextView);
        actv.setThreshold(1);
        actv.setAdapter(adapter);
        actv.setTextColor(Color.BLUE);

    }

    public void radiobuttonpage(View view) {
        Intent intent=new Intent(MainActivity.this,radiobutton.class);
        startActivity(intent);
    }
}
