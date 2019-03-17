package com.example.aluno.pecaperdida;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnCalcular;
    EditText edtQuantidade, edtPecas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtPecas = findViewById(R.id.edtPecas);
        edtQuantidade = findViewById(R.id.edtQuantidade);
        btnCalcular = findViewById(R.id.btnCalcular);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int quantidade = Integer.parseInt(edtQuantidade.getText().toString());
                String[] vetor = edtPecas.getText().toString().split(",");

                for(int a=0; a<=quantidade; a++){

                    if(Integer.parseInt(vetor[a]) != a){

                        Context contexto = getApplicationContext();
                        String texto = vetor[a];
                        int duracao = Toast.LENGTH_SHORT;
                        Toast toast = Toast.makeText(contexto, texto, duracao);
                        toast.show();
                        break;
                    }


                }

                Context contexto = getApplicationContext();
                String texto = "aaaaaaaaaaaa";
                int duracao = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(contexto, texto, duracao);
                toast.show();


            }
        });

    }
}
