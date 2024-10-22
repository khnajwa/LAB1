package edu.my.utem.ftmk.WelcomeFirstApp;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import edu.my.utem.ftmk.WelcomeFirstApp.databinding.ActivityMainFirstBinding;

public class MainActivityFirst extends AppCompatActivity {

    ActivityMainFirstBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainFirstBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }

    @SuppressLint("SetTextI18n")
    public void fnGreet(View view) {
        binding.textView.setText("Hello welcome, " + binding.editTextText.getText());
    }
}