package com.omabtang.lab3omabtangnorbertrussel;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {
    EditText e1, e2, e3, e4, e5, e6, e7, e8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1 = findViewById(R.id.editText);
        e2 = findViewById(R.id.editText2);
        e3 = findViewById(R.id.editText3);
        e4 = findViewById(R.id.editText4);
        e5 = findViewById(R.id.editText5);
        e6 = findViewById(R.id.editText6);
        e7 = findViewById(R.id.editText7);
        e8 = findViewById(R.id.editText8);
    }


    public void writeData(View v) {

        String c1 = e1.getText().toString();
        String c2 = e2.getText().toString();
        String c3 = e3.getText().toString();
        String c4 = e4.getText().toString();
        String c5 = e5.getText().toString();
        String c6 = e6.getText().toString();
        String c7 = e7.getText().toString();
        String c8 = e8.getText().toString();

        FileOutputStream writer = null;
        try {
            writer = openFileOutput("data1.txt", MODE_PRIVATE);
            writer.write(c1.getBytes());
            writer.write(c2.getBytes());
            writer.write(c3.getBytes());
            writer.write(c4.getBytes());
            writer.write(c5.getBytes());
            writer.write(c6.getBytes());
            writer.write(c7.getBytes());
            writer.write(c8.getBytes());
        } catch (FileNotFoundException e) {
            Log.d("error", "File not found...");
        } catch (IOException e) {
            Log.d("error", "IO error...");
        } finally {
            try {
                writer.close();
            } catch (IOException e) {
                Log.d("error", "File not found...");
            }
        }
        Toast.makeText(this, "data saved", Toast.LENGTH_LONG).show();
    }

    public void nextScreen(View V) {
        Intent i = new Intent(this, SecondActivity.class);
        startActivity(i);
        Log.d("4ITB", "next screen success");
    }
}