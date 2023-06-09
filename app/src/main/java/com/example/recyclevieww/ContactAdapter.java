package com.example.recyclevieww;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclevieww.databinding.ItemContactBinding;

import java.util.ArrayList;

public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.ViewHolder> {

    private ArrayList<Model> arrayList;
    private ItemClick onItemClick;

    public ContactAdapter(ArrayList<Model> arrayList, ItemClick itemClick) {
        this.arrayList = arrayList;
        this.onItemClick = itemClick;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater
                .from(parent.getContext())
                .inflate(R.layout.item_contact, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.onBind(arrayList.get(position));
        holder.itemView.setOnClickListener(v ->
                onItemClick.onClick(arrayList.get(holder.getAdapterPosition())));

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView name, surname, age;
        ImageView img;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }

        public void onBind(Model model) {
            name = itemView.findViewById(R.id.tv_name);
            surname = itemView.findViewById(R.id.tv_surname);
            age = itemView.findViewById(R.id.tv_age);
            img = itemView.findViewById(R.id.image_first);
            name.setText(model.getName());
            surname.setText(model.getSurname());
            age.setText(model.getAge());
            img.setImageResource(model.getImg());
        }
    }
}
