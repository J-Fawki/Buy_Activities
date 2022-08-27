package com.example.buymethod;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Credit_Info extends AppCompatActivity {



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credit);

        EditText Credit_number = findViewById(R.id.CreditNb_txt);
        EditText Exp_date = findViewById(R.id.ExpDate_txt);
        EditText Digits = findViewById(R.id.Digit_txt);

        Button Pay_Btn = (Button) findViewById(R.id.Pay_btn);
        Pay_Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if((Credit_number.getText().toString().equals("")) && (Exp_date.getText().toString().equals("")) && (Digits.getText().toString().equals(""))){

                    Toast.makeText(getApplicationContext(), "Please fill all the feild", Toast.LENGTH_LONG).show();
                }
                Toast.makeText(getApplicationContext(), " Thank you for Dealing with us", Toast.LENGTH_LONG).show();

            }
        });
    }
}
