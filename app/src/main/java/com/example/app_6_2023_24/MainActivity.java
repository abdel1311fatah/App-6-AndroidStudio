package com.example.app_6_2023_24;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText n1;
    private EditText n2;
    private RadioGroup rg1;
    private RadioButton suma;
    private RadioButton resta;
    private RadioButton multi;
    private RadioButton div;
    private RadioButton elevar;
    private RadioButton mod;
    private RadioButton arrel;
    private Button clean;
    private Button back;
    private Button exit;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        n1 = (EditText) findViewById(R.id.n1);
        n2 = (EditText) findViewById(R.id.n2);
        suma = (RadioButton) findViewById(R.id.check_suma);
        resta = (RadioButton) findViewById(R.id.check_resta);
        multi = (RadioButton) findViewById(R.id.check_multi);
        div = (RadioButton) findViewById(R.id.check_div);
        elevar = (RadioButton) findViewById(R.id.check_elevar);
        mod = (RadioButton) findViewById(R.id.check_mod);
        arrel = (RadioButton) findViewById(R.id.check_arrel);
        clean = (android.widget.Button) findViewById(R.id.btn_clean);
        exit = (android.widget.Button) findViewById(R.id.btn_exit);
        result = (TextView) findViewById(R.id.result);
    }

    public void calculate(View view) {

        Intent intent = new Intent(this, layout_resultat.class);

        result.clearComposingText();

        String valor1 = n1.getText().toString();
        String valor2 = n2.getText().toString();

        if (suma.isChecked()) {
            try {
                long n1 = Long.parseLong(valor1);
                long n2 = Long.parseLong(valor2);

                long suma = n1 + n2;

                String resultat_suma = String.valueOf(suma);
                intent.putExtra("resultat_main", resultat_suma);
                startActivity(intent);

            } catch (
                    NumberFormatException e) { // Per si fiques caracters no valids, en aquest cas deixar en blanc
                result.setText("Ingresa numeros valids");
            }
        }
        if (resta.isChecked()) {
            try {
                long n1 = Long.parseLong(valor1);
                long n2 = Long.parseLong(valor2);

                long resta = n1 - n2;

                String resultat_resta = String.valueOf(resta);
                intent.putExtra("resultat_main", resultat_resta);
                startActivity(intent);

            } catch (
                    NumberFormatException e) { // Per si fiques caracters no valids, en aquest cas deixar en blanc
                result.setText("Ingresa numeros valids");
            }
        }
        if (multi.isChecked()) {
            try {
                long n1 = Long.parseLong(valor1);
                long n2 = Long.parseLong(valor2);

                long multi = n1 * n2;

                String resultat_multi = String.valueOf(multi);
                intent.putExtra("resultat_main", resultat_multi);
                startActivity(intent);

            } catch (
                    NumberFormatException e) { // Per si fiques caracters no valids, en aquest cas deixar en blanc
                result.setText("Ingresa numeros valids");
            }
        }
        if (div.isChecked()) {
            try {
                long n1 = Long.parseLong(valor1);
                long n2 = Long.parseLong(valor2);

                long div = n1 / n2;


                String resultat_div = String.valueOf(div);
                intent.putExtra("resultat_main", resultat_div);
                startActivity(intent);

            } catch (
                    NumberFormatException e) { // Per si fiques caracters no valids, en aquest cas deixar en blanc
                result.setText("Ingresa numeros valids");
            }
        }
        if (elevar.isChecked()) {
            try {
                long n1 = Long.parseLong(valor1);
                long n2 = Long.parseLong(valor2);

                for (int i = 0; i < n2; i++) {
                    n1 *= n1;
                }

                long elevar = n1;

                String resultat_elevar = String.valueOf(elevar);
                intent.putExtra("resultat_main", resultat_elevar);
                startActivity(intent);

            } catch (
                    NumberFormatException e) { // Per si fiques caracters no valids, en aquest cas deixar en blanc
                result.setText("Ingresa numeros valids");
            }
        }
        if (mod.isChecked()) {
            try {
                long n1 = Long.parseLong(valor1);
                long n2 = Long.parseLong(valor2);

                long mod = n1 % n2;

                String resultat_mod = String.valueOf(mod);
                intent.putExtra("resultat_main", resultat_mod);
                startActivity(intent);

            } catch (
                    NumberFormatException e) { // Per si fiques caracters no valids, en aquest cas deixar en blanc
                result.setText("Ingresa numeros valids");
            }
        }
        if (arrel.isChecked()) {
            try {
                long n1 = Long.parseLong(valor1);
                long n2 = Long.parseLong(valor2);

                long arrel = (long) Math.sqrt(n1);

                String resultat_arrel = String.valueOf(arrel);
                intent.putExtra("resultat_main", resultat_arrel);
                startActivity(intent);

            } catch (
                    NumberFormatException e) { // Per si fiques caracters no valids, en aquest cas deixar en blanc
                result.setText("Ingresa numeros valids");
            }
        }

        clean.setActivated(false);

    }

    public void clean(View view) {
        if (clean.isActivated()) {

            n1.setText(""); //neteje el texte de l edittext
            n2.setText("");
            result.setText("");

            suma.setChecked(false);
            resta.setChecked(false);
            multi.setChecked(false);
            div.setChecked(false);
            elevar.setChecked(false);
            mod.setChecked(false);
            arrel.setChecked(false);
        }
        clean.setActivated(false); //desactive el checkbox per a poder utilitzar les altres checkbox per que si no estan sempre en false
    }

    public void exit(View view) {
        finish();
        System.exit(0);
        // https://stackoverflow.com/questions/6014028/closing-application-with-exit-button
    }

}