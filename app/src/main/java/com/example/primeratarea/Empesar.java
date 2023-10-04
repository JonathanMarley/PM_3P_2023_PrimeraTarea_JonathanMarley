package com.example.primeratarea;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.primeratarea.Entidad.operacionLogica;


public class Empesar extends AppCompatActivity {
    EditText numero1, numero2;

    Button btnSumar, btnRestar, btnMulti, btnDivi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_empesar);


        numero1 = (EditText) findViewById((R.id.txtNumeroUno));
        numero2 = (EditText) findViewById((R.id.txtNumeroDos));

        btnSumar = (Button) findViewById((R.id.btnSuma));
        btnRestar = (Button) findViewById((R.id.btnResta));
        btnMulti = (Button) findViewById((R.id.btnMulti));
        btnDivi = (Button) findViewById((R.id.btnDivi));


        btnSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (validacion() == true){
                    int number1 = Integer.parseInt(String.valueOf(numero1.getText()));
                    int number2 = Integer.parseInt(String.valueOf(numero2.getText()));

                    operacionLogica logica = new operacionLogica(number1, number2);
                    Intent i = new Intent(Empesar.this,Resultados.class);

                    i.putExtra("Operacion", logica.operacionSumas());
                    startActivity(i);
                }else{

                }

            }
        });

        btnRestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (validacion() == true){
                    int number1 = Integer.parseInt(String.valueOf(numero1.getText()));
                    int number2 = Integer.parseInt(String.valueOf(numero2.getText()));

                    operacionLogica logica = new operacionLogica(number1, number2);

                    Intent i = new Intent(Empesar.this,Resultados.class);

                    i.putExtra("Operacion", logica.operacionResta());
                    startActivity(i);
                }else{

                }

            }
        });


        btnMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (validacion() == true){
                    int number1 = Integer.parseInt(String.valueOf(numero1.getText()));
                    int number2 = Integer.parseInt(String.valueOf(numero2.getText()));

                    operacionLogica logica = new operacionLogica(number1, number2);

                    Intent i = new Intent(Empesar.this,Resultados.class);

                    i.putExtra("Operacion", logica.operacionMulti());
                    startActivity(i);
                }else{

                }

            }
        });

        btnDivi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (validacion() == true){
                    int number1 = Integer.parseInt(String.valueOf(numero1.getText()));
                    int number2 = Integer.parseInt(String.valueOf(numero2.getText()));

                    operacionLogica logica = new operacionLogica(number1, number2);


                    Intent i = new Intent(Empesar.this,Resultados.class);

                    i.putExtra("Operacion", logica.operacionDivi());
                    startActivity(i);
                }else{

                }

            }
        });



    }
    //Metodo de validacion
    public boolean validacion(){
        boolean retorna = true;
        if (numero1.getText().toString().isEmpty()){
            numero1.setError("No Se permiten campos vacios");
            retorna = false;
        }
        if (numero2.getText().toString().isEmpty()){
            numero2.setError("No Se permiten campos vacios");
            retorna = false;
        }
        return retorna;
    }




}