package com.example.provamobex06;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    Button btnImc, btnGraus, btnVoltar, btnLimpar, btnCalcularTemp, btnCalcularImc;

    TextView txtPesso, txtAltura, txtResult, txtGraus, txtResultTemp;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CarregarTelaPrincial();
    }


    private void CarregarTelaPrincial()
    {
        setContentView(R.layout.activity_main);
        btnImc = findViewById(R.id.btnImc);
        btnImc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CarregarImc();
            }
        });

        btnGraus = findViewById(R.id.btnGraus);
        btnGraus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CarregarGraus();
            }
        });

    }


    public void CarregarImc()
    {
        setContentView(R.layout.imc);

        txtAltura = findViewById(R.id.txtAltura);
        txtPesso = findViewById(R.id.txtPesso);
        txtResult = findViewById(R.id.txtResult);

        btnVoltar = findViewById(R.id.btnVoltar);
        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CarregarTelaPrincial();
            }
        });

        btnLimpar = findViewById(R.id.btnLimpar);
        btnLimpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtAltura.setText("");
                txtPesso.setText("");
                txtResult.setText("");
            }
        });



        btnCalcularImc = findViewById(R.id.btnCalcularImc);
        btnCalcularImc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                txtAltura = findViewById(R.id.txtAltura);
                txtPesso = findViewById(R.id.txtPesso);
                txtResult = findViewById(R.id.txtResult);

                double result, Pesso, Altura;

                Pesso = Double.parseDouble(txtPesso.getText().toString());
                Altura = Double.parseDouble(txtAltura.getText().toString());

                result = Pesso / (Altura * Altura);


                txtResult.setText(String.format("%.2f",result));

            }
        });





    }

    public void CarregarGraus()
    {
        setContentView(R.layout.graus);

        txtGraus = findViewById(R.id.txtGraus);
        txtResultTemp = findViewById(R.id.txtResultTemp);

        btnVoltar = findViewById(R.id.btnVoltar);
        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CarregarTelaPrincial();
            }
        });

        btnLimpar = findViewById(R.id.btnLimpar);
        btnLimpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtResult.setText("");
                txtGraus.setText("");
            }
        });

        btnCalcularTemp = findViewById(R.id.btnCalcularTemp);
        btnCalcularTemp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                txtGraus = findViewById(R.id.txtGraus);
                txtResultTemp = findViewById(R.id.txtResultTemp);

                double result, num1;

                num1 = Double.parseDouble(txtGraus.getText().toString());

                result = (num1 *1.8) + 32;

                txtResultTemp.setText(String.valueOf(result));

            }
        });

    }

}