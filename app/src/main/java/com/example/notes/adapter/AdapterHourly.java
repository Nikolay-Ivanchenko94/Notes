package com.example.notes.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.notes.R;

import java.util.ArrayList;

public class AdapterHourly extends RecyclerView.Adapter<AdapterHourly.viewHolder> {


    ArrayList<AdapterHourly> items;


    @NonNull
    @Override
    public AdapterHourly.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterHourly.viewHolder holder, int position) {


    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder{

        EditText etText, etHolder,etHolder2,etHolder3,etHolder4;
        public viewHolder(@NonNull View itemView) {
            super(itemView);

            etText = itemView.findViewById(R.id.etText);
            etHolder = itemView.findViewById(R.id.etHolder);
            etHolder2 = itemView.findViewById(R.id.etHolder2);
            etHolder3 = itemView.findViewById(R.id.etHolder3);
            etHolder4 = itemView.findViewById(R.id.etHolder4);




        }
    }
}
