package br.com.jevsoftwares.calcularimc;

import android.graphics.Color;
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
                if (!alt.getText().toString().isEmpty())
                    altS = alt.getText().toString();
                double altF = Double.parseDouble(altS);
                double imc = psF / Math.pow(altF,2);

                if (imc < 18.5){
                    result.setText(String.valueOf(imc)+"\nAbaixo do peso");
                    result.setTextColor(Color.RED);
                }
                else if (imc >= 18.5 && imc <= 24.9){
                    result.setText(String.valueOf(imc)+"\nNormal");
                    result.setTextColor(Color.GREEN);
                }
                else if (imc > 24.9 && imc <= 29.9){
                    result.setText(String.valueOf(imc)+"\nSobrepeso");
                    result.setTextColor(Color.RED);

                }
                else if (imc > 29.9 && imc <= 34.9){
                    result.setText(String.valueOf(imc)+"\nObesidade nível I");
                    result.setTextColor(Color.RED);

                }
                else if (imc > 34.9 && imc <= 39.9){
                    result.setText(String.valueOf(imc)+"\nObesidade nível II");
                    result.setTextColor(Color.RED);

                }
                else if (imc > 39.9 && imc <= 49.9){
                    result.setText(String.valueOf(imc)+"\nObesidade nível III");
                    result.setTextColor(Color.RED);

                }
                else if (imc > 49.9){
                    result.setText(String.valueOf(imc)+"\nObesidade nível IV");
                    result.setTextColor(Color.RED);

                }
            }
        });
    }
}