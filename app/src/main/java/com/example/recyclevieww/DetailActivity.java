package com.example.recyclevieww;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;

import com.example.recyclevieww.databinding.ActivityDetailBinding;

public class DetailActivity extends AppCompatActivity {

    private ActivityDetailBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getInformation();
    }

    private void getInformation() {
        String carName = getIntent().getStringExtra("key1");
        String carAge = getIntent().getStringExtra("key2");
        binding.tvName.setText(carName);
        binding.infoTextView.setText(carAge);
        binding.imageViewNew.setImageResource(getIntent().getIntExtra("key3",0));
    }
}