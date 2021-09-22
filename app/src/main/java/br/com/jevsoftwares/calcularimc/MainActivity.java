package br.com.jevsoftwares.calcularimc;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    EditText ps, alt;
    TextView result;
    Button calc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ps = findViewById(R.id.editTextPeso);
        alt = findViewById(R.id.editTextAltura);
        result = findViewById(R.id.textViewResult);
        calc = findViewById(R.id.buttonCalcular);

        result.setText("");


        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String psS = "0.0";
                if (!ps.getText().toString().isEmpty())
                    psS = ps.getText().toString();
                double psF = Double.parseDouble(psS);
                String altS = "0.0";
                if (!ps.getText().toString().isEmpty())
                    altS = ps.getText().toString();
                double altF = Double.parseDouble(altS);
                double imc = psF / Math.pow(altF,2);

                result.setText(String.valueOf(imc));
            }
        });
    }
}