package com.cursoandroid.nascimento.idadedecachorro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private TextView text_response;
    private Button btnCalc;
    private EditText text_number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text_response = findViewById(R.id.text_resp);
        btnCalc = findViewById(R.id.btn_calc);
        text_number = findViewById(R.id.txtnumber);


        btnCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //recuperar o que foi digitado

                String textoDigitado = text_number.getText().toString();
                if(textoDigitado.isEmpty()){
                    text_response.setVisibility(View.VISIBLE);
                    text_response.setText("Informe uma idade de cachorro");
                }else{
                    int valordigitado = Integer.parseInt(textoDigitado);
                    int resultadofinal = valordigitado * 7;
                    text_response.setVisibility(View.VISIBLE);
                    text_response.setText("A idade de seu cachorro em anos humanos é " + resultadofinal + " anos.");
                }

            }
        });



    }
}
