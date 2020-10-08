package com.example.exercicio1prova;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtResultado1, txtResultado2, txtResultado3;
    EditText edtNumero;
    Button btnCalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtResultado1 = (TextView) findViewById(R.id.txtResultado1);
        txtResultado2=  (TextView) findViewById(R.id.txtResultado2);
        txtResultado3=  (TextView) findViewById(R.id.txtResultado3);
        edtNumero = (EditText) findViewById(R.id.edtNumero);
        btnCalcular = (Button) findViewById(R.id.btnCalcular);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double Numero;

                Numero = Double.parseDouble(edtNumero.getText().toString());

                if(Numero%2 == 0){
                    txtResultado1.setText("Resultado: Numero é Par: "+ Numero);
                }
                else
                {
                    txtResultado1.setText("Resultado: Numero é Impar: "+ Numero);
                }

                double S = Numero + Numero;
                txtResultado2.setText("Dobro do Numero é: "+S);

                double Raiz = Math.sqrt(Numero);
                txtResultado3.setText( "Raiz quadrade é: "+Raiz);

            }
        });



    }
}