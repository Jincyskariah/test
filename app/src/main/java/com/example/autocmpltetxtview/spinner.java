package com.example.autocmpltetxtview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class spinner extends AppCompatActivity  {
    Spinner sp;
    String[] fruits = {"Apple", "Orange", " Grape", "Cherry", "Date", "Banana", "Kiwi"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);

        sp = findViewById(R.id.spinner);
        //creating array adapter
        ArrayAdapter adapter = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_spinner_item, fruits);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //set adapter to spinner
        sp.setAdapter(adapter);
       sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
           @Override
           public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

               String s=adapterView.getSelectedItem().toString();
               Toast.makeText(spinner.this, s, Toast.LENGTH_SHORT).show();
           }

           @Override
           public void onNothingSelected(AdapterView<?> adapterView) {


           }
       });
    }
}