package br.edu.ifsp.arq.calculoimc.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import br.edu.ifsp.arq.calculoimc.R;
import br.edu.ifsp.arq.calculoimc.model.Pessoa;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button bntImc;

    private EditText peso, altura;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bntImc = findViewById(R.id.bntCalcular);
        peso = findViewById(R.id.editext_weight);
        altura = findViewById(R.id.editext_height);


        bntImc.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        if(v == bntImc){

            calcularIMC();
        }

    }

    private void calcularIMC() {

        Pessoa pessoa;


        double readPeso, readAltura;

        try{

            readAltura = Double.valueOf(altura.getText().toString());

            readPeso =  Double.valueOf(peso.getText().toString());

        }catch (NumberFormatException nfe){

            readAltura = 0;
            readPeso = 0;
        }

        if(readAltura != 0 || readPeso != 0){

            pessoa = new Pessoa(readAltura, readPeso);

            Toast.makeText(this, String.format("IMC: %.2f ",pessoa.imc()), Toast.LENGTH_SHORT).show();

        }
        else{

            Toast.makeText(this, "Entrada de dados inválida", Toast.LENGTH_SHORT).show();


        }
    }
}
