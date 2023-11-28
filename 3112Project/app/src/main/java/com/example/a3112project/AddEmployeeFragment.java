package com.example.a3112project;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.a3112project.databinding.FragmentAddEmployeeBinding;
import com.example.a3112project.databinding.FragmentEmployerDashboardBinding;

public class AddEmployeeFragment extends Fragment {


    public AddEmployeeFragment() {
        // Required empty public constructor
    }


    FragmentAddEmployeeBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentAddEmployeeBinding.inflate(inflater, container, false);
        return binding.getRoot();    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.buttonAddNewEmployee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mListener.AddNewEmployeeFinish();
            }
        });
        binding.buttonGoEmployerDashboard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mListener.GoBackEmployerDashboard();
            }
        });

    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        mListener = (AddEmployeeListener) context;

    }

    AddEmployeeListener mListener;
    interface AddEmployeeListener{
        void AddNewEmployeeFinish();
        void GoBackEmployerDashboard();
    }
}