package com.cursoandroid.nascimento.gasolinaoualcool;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView text_response;
    private Button   btn_calc;
    private EditText input_gas;
    private EditText input_etanol;
    private Button btn_sobre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text_response       = findViewById(R.id.textResp);
        btn_calc            = findViewById(R.id.btnCalc);
        input_gas           = findViewById(R.id.editGasol);
        input_etanol        = findViewById(R.id.editEtanol);

        btn_calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text_et      = input_etanol.getText().toString();
                String text_gas     = input_gas.getText().toString();

                if(text_et.isEmpty() || text_gas.isEmpty()){

                    //text_response.setText("Informe o valor do etanol e da gasolina!");
                    Toast.makeText(MainActivity.this,"Informe os preços da gasolina e do etanol!",Toast.LENGTH_SHORT).show();

                }else{
                    double val_gas       = Double.parseDouble(text_gas);
                    double val_et        = Double.parseDouble(text_et);
                    double res           = val_et / val_gas;

                    if(res >= 0.7){
                        text_response.setText("È mais vantagem usar o gasolina.");
                    }else{
                        text_response.setText("È mais vantagem usar etanol");
                    }
                }

            }
        });
    }
}
