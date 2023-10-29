package com.example.app_6_2023_24;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class layout_resultat extends AppCompatActivity {
    private TextView result;
    private Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout_resultat);
        result = (TextView) findViewById(R.id.result);
        Bundle resultat_main = this.getIntent().getExtras();
        String text_resultat = resultat_main.getString("resultat_main");
        result.setText(text_resultat);
    }

    public void exit(View view) {
        finish();
        System.exit(0);
        // https://stackoverflow.com/questions/6014028/closing-application-with-exit-button
    }

}