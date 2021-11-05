package com.domingosfernandesrodrigues89.jardaparacentimetros;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText et_valorJardas;
    Button bt_converter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_valorJardas = findViewById(R.id.et_valorJardas);
        bt_converter = findViewById(R.id.bt_converter);

        bt_converter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double valorJardas = Double.parseDouble(et_valorJardas.getText().toString());

                if(valorJardas >= 0)
                {
                    Toast.makeText(MainActivity.this,"Centímetros: "+(valorJardas * 91.44),Toast.LENGTH_LONG).show();
                }
                else
                {
                    Toast.makeText(MainActivity.this,"Insira um valor!",Toast.LENGTH_LONG).show();
                }
                et_valorJardas.getText().clear();
            }
        });

    }
}