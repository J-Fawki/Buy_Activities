package com.example.buymethod;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText Phone_Txt = findViewById(R.id.phone_txt);
        EditText Address_Txt = findViewById(R.id.Address_txt);

        Button Done_Btn = (Button) findViewById(R.id.Done_btn);
        Done_Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RadioButton Cash_Btn = findViewById(R.id.Cash_btn);
                RadioButton Credit_Btn = findViewById(R.id.Credit_btn);


                if((Phone_Txt.getText().toString().equals("")) && (Address_Txt.getText().toString().equals(""))){

                    Toast.makeText(getApplicationContext(), "Please fill all the feild", Toast.LENGTH_LONG).show();

                }
                else{
                    if(Cash_Btn.isChecked()){

                        Toast.makeText(getApplicationContext(), "You will Pay when you receive the order, thank you", Toast.LENGTH_LONG).show();

                    }
                    else if(Credit_Btn.isChecked()){
                        Intent i = new Intent(MainActivity.this, Credit_Info.class);
                        startActivity(i);
                    }
                }



            }
        });

    }
}