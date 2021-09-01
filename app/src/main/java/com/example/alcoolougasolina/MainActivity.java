package com.example.alcoolougasolina;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    TextInputEditText entradaAlcool, entradaGasolina;
    Button btnCalcular;
    TextView txtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        entradaAlcool = findViewById(R.id.entradaAlcool);
        entradaGasolina = findViewById(R.id.entradaGasolina);
        txtResultado = findViewById(R.id.txtResultado);
        btnCalcular = findViewById(R.id.btnCalcular);
    }

    public void setResult(View view) {

        if (!entradaGasolina.getText().toString().isEmpty() && !entradaAlcool.getText().toString().isEmpty()
                && (entradaGasolina.getText().toString() != "." && entradaAlcool.getText().toString() != ".")) {

            Double alcool = Double.valueOf(entradaAlcool.getText().toString());
            Double gasolina = Double.valueOf(entradaGasolina.getText().toString());
            if (gasolina > 0 && alcool > 0) {

                if (alcool / gasolina < 0.7) {
                    txtResultado.setText("Melhor usar Álcool");
                } else {
                    txtResultado.setText("Melhor usar Gasolina");
                }
            } else {
                txtResultado.setText("Resultado");
            }
        } else {
            txtResultado.setText("Resultado");
        }
    }
}