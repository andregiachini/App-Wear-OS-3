package com.example.apprelogio;

import android.app.Activity;
import android.os.Bundle;

import com.example.apprelogio.databinding.ActivityMainBinding;

import java.util.Random;

public class MainActivity extends Activity {

    private ActivityMainBinding binding;
    private final int[] listaCores = {
            R.color.black,
            R.color.red,
            R.color.green,
            R.color.white,
            R.color.blue,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        binding.btTrocarCor.setOnClickListener(view -> trocarCorDeFundo());
    }
    private void trocarCorDeFundo(){
        Random random = new Random();
        int coresAleatorias = random.nextInt(listaCores.length);
        binding.container.setBackgroundResource(listaCores[coresAleatorias]);
    }

}