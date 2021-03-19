package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private EditText editText;
    private Button button;
    private Switch switching;
    private CheckBox checkBox;
    private ToggleButton toggleButton;
    private LinearLayout backGround;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_linear);

        initViews();
        setTextView();
        setBackGround();
        clickTask2And3();
    }

    private void initViews() {
        textView = findViewById(R.id.textView);
        editText = findViewById(R.id.editText);
        button = findViewById(R.id.button);
        switching = findViewById(R.id.switching);
        checkBox = findViewById(R.id.checkBox);
        toggleButton = findViewById(R.id.toggleButton);
        backGround = findViewById(R.id.backGround);

    }

    private void setTextView() {
        button.setOnClickListener(v -> {
            textView.setText("Супер");
            editText.setText("Ты Чудо");
        });
    }


    private void setBackGround() {
        switching.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                backGround.setBackgroundColor(Color.parseColor("#FFBB86FC"));
            } else {
                backGround.setBackgroundColor(Color.parseColor("#00D4C2"));
            }
        });
    }


    public void clickTask2And3() {
        toggleButton.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, Task2And3Layout.class);
            startActivity(intent);
        });

    }

}