package com.example.doacao_sangue;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void actionButton(View v) {
        EditText etT = findViewById(R.id.idT);
        TextView etR = findViewById(R.id.idR);

        String t = etT.getText().toString();

        try {
            Integer.parseInt(t);
            etR.setText("Números não são aceitos. Por favor, insira um tipo sanguíneo válido.");

        } catch (NumberFormatException e) {
            String resposta = new TipoSangue().pesquisa(t);
            etR.setText(resposta);
        }
    }
}