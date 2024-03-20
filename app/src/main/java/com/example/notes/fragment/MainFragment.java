package com.example.notes.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.notes.R;
import com.example.notes.databinding.FragmentMainBinding;


public class MainFragment extends Fragment  {
    private FragmentMainBinding binding;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentMainBinding.inflate(inflater,container,false);

        binding.btnAdd.setOnClickListener(v -> {
            AddFragment addFragment = new AddFragment();
            getActivity().getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, addFragment, "fidThisFragment").addToBackStack(null)
                    .commit();
        });


        return binding.getRoot();
    }


}