package com.example.aluno.aplicativo_3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clicarAdicionar (View view){


        Log.d("MainActivity","Clique");
    }

    public void clicarAdicionar2 (View view){
        //Toast toast = new Toast(this, "clique no botao", Toast.LENGTH_LONG );
    }
}
