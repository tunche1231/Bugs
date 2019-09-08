package com.example.myapplicatio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b = findViewById(R.id.button);
        int a = 15;
        a += 1;
        Log.e("Error","Error "+a);
        try{
            b.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Log.e("Error App", "Error en el boton");
                }
            });
        } catch (Exception e) {
            Log.e("Error App", e.toString());
        }finally {
            Log.d("Error App", "Llego al final");
        }
    }
}
