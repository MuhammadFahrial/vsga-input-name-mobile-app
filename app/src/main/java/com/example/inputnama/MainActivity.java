package com.example.inputnama;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView1 = findViewById(R.id.textview1);
        TextView textView2 = findViewById(R.id.textview2);

        EditText editTextname = findViewById(R.id.editTextname);
        Button button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView1.setText("Halo " +editTextname.getText() + ", Tetap Semangat Jalani Hidup");
                textView2.setText ("😄");
            }
        });
    }
}