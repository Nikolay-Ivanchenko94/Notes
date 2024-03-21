package com.example.notes.fragment;

import android.app.AlertDialog;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.example.notes.R;
import com.example.notes.databinding.FragmentAddBinding;
import com.example.notes.databinding.FragmentMainBinding;

public class AddFragment extends Fragment {


    private FragmentAddBinding binding;

    private DBHandler dbHandler;




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentAddBinding.inflate(inflater,container,false);

        binding.btnEdit.setOnClickListener(v -> {

            EditFragment editFragment = new EditFragment();
            getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container,editFragment,"FindThisFragment").
                    addToBackStack(null).commit();
        });
        binding.btnDelete.setOnClickListener(v -> {
        });
        binding.idBtnAddCourse.setOnClickListener(v -> {
            binding.idBtnAddCourse.toString();



        });

        return  binding.getRoot();
    }
}