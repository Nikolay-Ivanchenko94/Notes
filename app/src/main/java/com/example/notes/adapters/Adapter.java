package com.example.notes.adapters;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.notes.R;
import com.example.notes.fragment.MainFragment;
import com.example.notes.models.List;

import java.util.ArrayList;


public class Adapter extends RecyclerView.Adapter<Adapter.viewHolder>{
    
    private RecyclerViewInterfece recyclerViewInterfece;
    ArrayList<List> items;

    Adapter(ArrayList<List> items) {
        this.items = items;
    }


    @NonNull
    @Override
    public Adapter.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inFlate = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_holder,parent,false);
        return new viewHolder(inFlate);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.viewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {

        TextView tvTime,tvListProduct;
        Button btnDown;

        public viewHolder(@NonNull View itemView) {
            super(itemView);


            tvTime = itemView.findViewById(R.id.tvTime);
            tvListProduct = itemView.findViewById(R.id.tvListProduct);
            btnDown = itemView.findViewById(R.id.btnDown);

        }
    }
}
