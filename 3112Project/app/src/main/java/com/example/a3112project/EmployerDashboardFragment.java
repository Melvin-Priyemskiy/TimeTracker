package com.example.a3112project;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.a3112project.databinding.FragmentEmployerDashboardBinding;
import com.example.a3112project.databinding.FragmentEmployerLoginBinding;

public class EmployerDashboardFragment extends Fragment {



    public EmployerDashboardFragment() {
        // Required empty public constructor
    }

    FragmentEmployerDashboardBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentEmployerDashboardBinding.inflate(inflater, container, false);
        return binding.getRoot();    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getActivity().setTitle("Employer Dashboard");

        binding.buttonLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mListener.GoBackHomeFragment4();
            }
        });

        binding.imageViewAddEmployee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mListener.AddNewEmployee();
            }
        });
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        mListener = (EmployerDashboardListener) context;

    }

    EmployerDashboardListener mListener;
    interface EmployerDashboardListener{
        void AddNewEmployee();
        void GoBackHomeFragment4();
    }
}