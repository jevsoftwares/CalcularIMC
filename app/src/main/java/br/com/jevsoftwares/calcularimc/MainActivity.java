package br.com.jevsoftwares.calcularimc;

import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private EditText peso, altura;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText ps = findViewById(R.id.editTextNumberDecimalPeso);
        EditText alt = findViewById(R.id.editTextNumberDecimalAltura);

        float psF = Float.parseFloat(ps.getText().toString());
        float altF = Float.parseFloat(alt.getText().toString());


    }
}