package com.example.aluno.aplicativo_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText edtInput;
    EditText edtLog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtInput = (EditText) findViewById(R.id.edtInput);
        edtLog = (EditText) findViewById(R.id.edtLog);

    }

    public void onClickAddContato ( View view ){
        String addTexto = edtInput.getText().toString();
        edtInput.setText("");

        String textLog = edtLog.getText().toString();
        textLog += " - " + addTexto;

        edtLog.setText(textLog);

    }
}
