package com.example.componentesbasicos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private CheckBox FebreId;
    private CheckBox DorCabecaId;
    private CheckBox DorCorpoId;
    private CheckBox DorJuntasId;
    private CheckBox DorOlhoId;

    private TextView resultadoId ;
    private EditText nomeId ;
    private EditText emailId ;

    //
    //
    private Button buttonEnviarParaSegunda;
    private Button buttonEnviarParaMapa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(getApplicationContext(), "onCreate", Toast.LENGTH_SHORT).show();

        resultadoId = findViewById(R.id.textViewResultadoId);
        nomeId = findViewById(R.id.editTextNomeId);
        emailId = findViewById(R.id.textInputEmailId);

        FebreId = findViewById(R.id.checkBoxFebreId);
        DorCabecaId = findViewById(R.id.checkBoxDorCabecaId);
        DorCorpoId = findViewById(R.id.checkBoxDorCorpoId);
        DorJuntasId = findViewById(R.id.checkBoxDorJuntasId);
        DorOlhoId = findViewById(R.id.checkBoxDorOlhoId);

        /**
         *
         *
         *
         */
        buttonEnviarParaSegunda = findViewById(R.id.buttonEnviarParaSegundaId);
        buttonEnviarParaSegunda.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), SegundaActivity.class));
            }
        });
        /**
         *
         *
         *
         */
        buttonEnviarParaMapa = findViewById(R.id.buttonEnviarParaMapaId);
        buttonEnviarParaMapa.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), MapsActivity.class));
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(getApplicationContext(), "onStart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(getApplicationContext(), "onResume", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(getApplicationContext(), "onPause", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(getApplicationContext(), "onStop", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(getApplicationContext(), "onDestroy", Toast.LENGTH_SHORT).show();
    }

    public void clicar(View view){
        String nome = nomeId.getText().toString();
        String email = emailId.getText().toString();

        resultadoId.setText("Nome: " + nome + " . Email: " + email);
    }

    public void limpar(View view){
        nomeId.setText("");
        emailId.setText("");
        resultadoId.setText("");
    }
}
