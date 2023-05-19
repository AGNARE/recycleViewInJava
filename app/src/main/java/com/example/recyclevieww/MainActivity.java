package com.example.recyclevieww;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements ItemClick{

    private ArrayList<Model> contact = new ArrayList<>();
    private RecyclerView contactRecycleView;
    private ContactAdapter adapter = new ContactAdapter(contact,this::onClick);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        contactRecycleView = findViewById(R.id.recycle_view);
        adapter = new ContactAdapter(contact,this::onClick);
        contactRecycleView.setAdapter(adapter);
        initdata();
    }

    private void initdata() {
        contact.add(new Model("Виктор", "Петрович", "20", R.mipmap.ic_launcher));
        contact.add(new Model("Виктор", "Петрович", "20", R.mipmap.ic_launcher));
        contact.add(new Model("Виктор", "Петрович", "20", R.mipmap.ic_launcher));
        contact.add(new Model("Виктор", "Петрович", "20", R.mipmap.ic_launcher));
        contact.add(new Model("Виктор", "Петрович", "20", R.mipmap.ic_launcher));
        contact.add(new Model("Виктор", "Петрович", "20", R.mipmap.ic_launcher));
        contact.add(new Model("Виктор", "Петрович", "20", R.mipmap.ic_launcher));
        contact.add(new Model("Виктор", "Петрович", "20", R.mipmap.ic_launcher));
        contact.add(new Model("Виктор", "Петрович", "20", R.mipmap.ic_launcher));
        contact.add(new Model("Виктор", "Петрович", "20", R.mipmap.ic_launcher));
        contact.add(new Model("Виктор", "Петрович", "20", R.mipmap.ic_launcher));
        contact.add(new Model("Виктор", "Петрович", "20", R.mipmap.ic_launcher));
        contact.add(new Model("Виктор", "Петрович", "20", R.mipmap.ic_launcher));
    }

    @Override
    public void onClick(Model model) {
        Intent intent = new Intent(MainActivity.this,DetailActivity.class);
        intent.putExtra("key1",model.getName());
        intent.putExtra("key2",model.getAge());
        intent.putExtra("key3",model.getImg());
        startActivity(intent);
    }
}