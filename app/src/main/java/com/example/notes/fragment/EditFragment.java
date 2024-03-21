package com.example.notes.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.notes.R;
import com.example.notes.databinding.FragmentAddBinding;
import com.example.notes.databinding.FragmentEditBinding;


public class EditFragment extends Fragment {

    private FragmentEditBinding binding;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentEditBinding.inflate(inflater,container,false);


        binding.btnBack.setOnClickListener(v -> {

            AddFragment addFragment = new AddFragment();
            getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container,addFragment,"findThisFragment")
                    .addToBackStack(null).commit();


        });
        return binding.getRoot();
    }
}