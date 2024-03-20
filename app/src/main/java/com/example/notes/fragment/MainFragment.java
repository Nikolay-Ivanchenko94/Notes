package com.example.notes.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.notes.R;
import com.example.notes.adapters.RecyclerViewInterfece;
import com.example.notes.databinding.FragmentMainBinding;
import com.example.notes.models.Cooking;
import com.example.notes.models.HomeWork;
import com.example.notes.models.List;

import java.util.ArrayList;


public class MainFragment extends Fragment implements RecyclerViewInterfece {
    private FragmentMainBinding binding;
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentMainBinding.inflate(inflater,container,false);

        return null;
    }


    @Override
    public void OnClickListener(int position) {

    }
}