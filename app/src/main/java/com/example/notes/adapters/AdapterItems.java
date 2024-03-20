package com.example.notes.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.notes.R;
import com.example.notes.models.List;

import java.util.ArrayList;


public class AdapterItems extends RecyclerView.Adapter<AdapterItems.viewHolder> {

    ArrayList<List> items;
    AdapterItems(ArrayList<List> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public AdapterItems.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inFlate = LayoutInflater.from(parent.getContext()).inflate(R.layout.holder,parent,false);
        return new viewHolder(inFlate);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterItems.viewHolder holder, int position) {
        holder.tvPepsi.setText(String.valueOf(items.get(position).getCooking()));
        holder.tvMilk.setText(String.valueOf(items.get(position).getCooking()));
        holder.tvEgg.setText(String.valueOf(items.get(position).getCooking()));
        holder.tvFish.setText(String.valueOf(items.get(position).getCooking()));
        holder.tvBreed.setText(String.valueOf(items.get(position).getCooking()));
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {

        TextView tvBreed, tvEgg,tvMilk,tvPepsi,tvFish;


        public viewHolder(@NonNull View itemView) {
            super(itemView);


            tvBreed = itemView.findViewById(R.id.tvBreed );
            tvEgg = itemView.findViewById(R.id.tvEgg);
            tvFish = itemView.findViewById(R.id.tvFish);
            tvMilk = itemView.findViewById(R.id.tvMilk);
            tvPepsi = itemView.findViewById(R.id.tvPepsi);
        }
    }
}
