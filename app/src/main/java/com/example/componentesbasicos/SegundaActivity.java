package com.example.componentesbasicos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class SegundaActivity extends AppCompatActivity {

    private TextView meuNome, minhaIdade;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        meuNome = findViewById(R.id.textViewNomeId);
        minhaIdade = findViewById(R.id.textViewIdadeId);

        Bundle dados = getIntent().getExtras();

//        // recupera dados atomicos
//        String nome = dados.getString("meuNome");
          int idade = dados.getInt("minhaIdade");
//        meuNome.setText(nome);
//        minhaIdade.setText(String.valueOf(idade));

        // recupera um objeto
        Usuario usuario = (Usuario) dados.getSerializable("objetoUsuario");
        String nome = usuario.getNomeUsuario();
        String email = usuario.getEmailUsuario();


        meuNome.setText(nome + " " + email);
        minhaIdade.setText(String.valueOf(idade));


    }
}
