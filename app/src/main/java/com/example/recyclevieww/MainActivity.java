package com.example.recyclevieww;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Model> contact = new ArrayList<>();
    private RecyclerView contactRecycleView;
    private ContactAdapter adapter = new ContactAdapter(contact);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        contactRecycleView = findViewById(R.id.recycle_view);
        adapter = new ContactAdapter(contact);
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
}