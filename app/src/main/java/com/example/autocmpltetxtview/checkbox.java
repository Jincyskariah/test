package com.example.autocmpltetxtview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class checkbox extends AppCompatActivity {
    CheckBox checkBox;
    Button display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkbox);
        display = findViewById(R.id.btndisplay);
        checkBox = findViewById(R.id.checkBox);
        //check();

    //public void check()
    //{
    //
    // checkBox.setOnClickListener(new View.OnClickListener() {
    //  @Override
    // public void onClick(View view) {


    // if(checkbox.isChecked())
    // {
    //   Toast.makeText(checkbox.this, "Android", Toast.LENGTH_SHORT).show();
    // }
    //}
    //  });
        display.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(checkBox.isChecked())
                {

                Toast.makeText(checkbox.this, "android", Toast.LENGTH_SHORT).show();
            }
                Intent intent=new Intent(checkbox.this,spinner.class);
                startActivity(intent);

            }

        });
}

        }




