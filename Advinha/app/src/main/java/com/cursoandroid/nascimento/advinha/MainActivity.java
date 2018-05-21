package com.cursoandroid.nascimento.advinha;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button botaoJogar;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        botaoJogar = findViewById(R.id.btn_jogar);
        resultado  = findViewById(R.id.text_resp);

        botaoJogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random randomico = new Random();

                int numeroaleatorio = randomico.nextInt(100);

                resultado.setText("Número escolhido foi: "+numeroaleatorio);

            }
        });

    }
}
