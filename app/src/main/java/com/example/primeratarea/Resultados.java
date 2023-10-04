package com.example.primeratarea;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.primeratarea.Entidad.operacionLogica;

public class Resultados extends AppCompatActivity {

    Button btnRegresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultados);
        btnRegresar = (Button) findViewById((R.id.btnRegresa));


        btnRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Resultados.this,Empesar.class);
                startActivity(i);

            }
        });

        Intent resultados = getIntent();
        int resultadosOperacion = resultados.getIntExtra("Operacion", 0);

        TextView vista = findViewById(R.id.txtResultadoOperacion);
        String mostrar = "El resultado de la operacion es:" + resultadosOperacion;
        vista.setText(mostrar);

    }
}