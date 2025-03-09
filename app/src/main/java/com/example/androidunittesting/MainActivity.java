package com.example.androidunittesting;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText num1EditText, num2EditText;
    private Button addButton, subtractButton;
    private TextView resultTextView;
    private Calculator calculator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inisialisasi view
        num1EditText = findViewById(R.id.num1EditText);
        num2EditText = findViewById(R.id.num2EditText);
        addButton = findViewById(R.id.addButton);
        subtractButton = findViewById(R.id.subtractButton);
        resultTextView = findViewById(R.id.resultTextView);

        // Inisialisasi calculator
        calculator = new Calculator();

        // Set onClickListener untuk tombol add
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateResult(true);
            }
        });

        // Set onClickListener untuk tombol subtract
        subtractButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateResult(false);
            }
        });
    }

    private void calculateResult(boolean isAddition) {
        try {
            double number1 = Double.parseDouble(num1EditText.getText().toString());
            double number2 = Double.parseDouble(num2EditText.getText().toString());
            double result;

            if (isAddition) {
                result = calculator.add(number1, number2);
                resultTextView.setText("Hasil: " + result);
            } else {
                result = calculator.subtract(number1, number2);
                resultTextView.setText("Hasil: " + result);
            }
        } catch (NumberFormatException e) {
            Toast.makeText(this, "Masukkan angka yang valid", Toast.LENGTH_SHORT).show();
        }
    }

    // Metode untuk validasi input (akan diuji dalam UI test)
    public boolean validateInput(String input1, String input2) {
        return !input1.isEmpty() && !input2.isEmpty();
    }
}