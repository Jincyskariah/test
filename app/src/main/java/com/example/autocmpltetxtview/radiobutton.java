package com.example.autocmpltetxtview;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class radiobutton extends AppCompatActivity {
    RadioGroup radioGroup;
    Button clear,submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radiobutton);
        clear=findViewById(R.id.btnclear);
        submit=findViewById(R.id.btnsubmit);

        radioGroup=findViewById(R.id.radiobutton);
        radioGroup.clearCheck();

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @SuppressLint("ResourceType")
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                RadioButton rb = radioGroup.findViewById(checkedId);
                if(null !=rb && checkedId > -1)
                {
                    Toast.makeText(radiobutton.this, rb.getText(), Toast.LENGTH_SHORT).show();

                }

            }
        });
    }

    public void onClear(View view) {
        radioGroup.clearCheck();
    }

    public void onSubmit(View view) {
        RadioButton rb=radioGroup.findViewById(radioGroup.getCheckedRadioButtonId());
        Toast.makeText(radiobutton.this, rb.getText(), Toast.LENGTH_SHORT).show();
        Intent intent=new Intent(radiobutton.this,checkbox.class);
        startActivity(intent);
    }
}
