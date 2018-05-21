package com.cursoandroid.nascimento.frasesdodia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView text_frase;
    private Button btn_new_frase;

    private String[] frases = {
            "Talvez eu seja enganado inúmeras vezes... Mas não deixarei de acreditar que em algum lugar, alguém merece a minha confiança!",
            "Não basta saber, é preciso aplicar. Não basta querer, é preciso também agir.",
            "Não basta conquistar a sabedoria, é preciso usá-la.",
            "O comportamento é um espelho em que cada um revela a sua imagem",
            "O nosso caráter é o resultado da nossa conduta.",
            "Os erros passam, a verdade fica",
            "Um Amigo se faz rapidamente; já a amizade é um fruto que amadurece lentamente.",
            "Não espere por uma crise para descobrir o que é importante em sua vida.",
            "Nosso caráter é resultado de nossa conduta.",
            "Nosso caráter é resultado de nossa conduta.",
            "Onde quer que vá, vá com o coração.",
            "Os que muito sabem de nada se admiram, e os que nada sabem se admiram de tudo",
            "Para quê preocuparmo-nos com a morte? A vida tem tantos problemas que temos de resolver primeiro.",
            "O alimento da juventude é a ilusão.",
            "Minha solidão não tem nada a ver com a presença ou ausência de pessoas Detesto quem me rouba a solidão sem em troca me oferecer verdadeira companhia"


    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn_new_frase = findViewById(R.id.btn_nova_frase);
        text_frase = findViewById(R.id.text_frase);

        final Random randomico = new Random();



        btn_new_frase.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                text_frase.setText(frases[randomico.nextInt(15)]);
            }
        });
    }
}
