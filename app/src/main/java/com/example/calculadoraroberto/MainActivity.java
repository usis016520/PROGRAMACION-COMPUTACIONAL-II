package com.example.calculadoraroberto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calcular(View view) {
        TextView tempVal = (TextView) findViewById(R.id.txtnum1);
        double num1 = Double.parseDouble(tempVal.getText().toString());

        tempVal = (TextView) findViewById(R.id.txtnum2);
        double num2 = Double.parseDouble(tempVal.getText().toString());

        double respuesta = 1;

        RadioButton optOperacionesBasicas = findViewById(R.id.optSuma);
        if (optOperacionesBasicas.isChecked()) {
            respuesta = num1 + num2;
        }
        optOperacionesBasicas = findViewById(R.id.optResta);
        if (optOperacionesBasicas.isChecked()) {
            respuesta = num1 - num2;
        }

        optOperacionesBasicas = findViewById(R.id.optMultiplicacion);
        if (optOperacionesBasicas.isChecked()) {
            respuesta = num1 * num2;
        }

        optOperacionesBasicas = findViewById(R.id.optDivision);
        if (optOperacionesBasicas.isChecked()) {
            respuesta = num1 / num2;
        }
        optOperacionesBasicas = findViewById(R.id.optfactorial);
        // i++ -> i = i + 1 -> i+=1
        if (optOperacionesBasicas.isChecked()) {
            for (int i = 1; i <= num1; i++) {
                respuesta *= i;
            }
        }
        optOperacionesBasicas = findViewById(R.id.optPorcentaje);
        if (optOperacionesBasicas.isChecked()) {
            respuesta = ((num1 / num2) * 100);
        }
        optOperacionesBasicas = findViewById(R.id.optexpo);
        if (optOperacionesBasicas.isChecked()){
            respuesta = Math.pow(num1, num2);
        }
        optOperacionesBasicas = findViewById(R.id.optraiz);
        if (optOperacionesBasicas.isChecked()){
            double Raiz = Math.pow(num2, 1 / num1);
            respuesta = Raiz;
        }
        optOperacionesBasicas = findViewById(R.id.modulo);
        if (optOperacionesBasicas.isChecked()){
            respuesta = num1 % num2;
        }
        optOperacionesBasicas = findViewById(R.id.mayorde2);
        if (optOperacionesBasicas.isChecked()){
            if (num1 > num2){
                respuesta = num1;
            }
            if (num2 > num1){
                respuesta = num2;
            }
        }
        tempVal = findViewById(R.id.lblRespuesta);
        tempVal.setText("Respuesta" + respuesta);


    }
}