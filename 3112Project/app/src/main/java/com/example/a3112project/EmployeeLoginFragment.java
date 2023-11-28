package com.example.a3112project;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.a3112project.databinding.FragmentEmployeeLoginBinding;
import com.example.a3112project.databinding.FragmentEmployerLoginBinding;


public class EmployeeLoginFragment extends Fragment {

    public EmployeeLoginFragment() {
        // Required empty public constructor
    }
    FragmentEmployeeLoginBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentEmployeeLoginBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState)
    {
        super.onViewCreated(view, savedInstanceState);
        binding.buttonGoHomeFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mListener.GoBackHomeFragment3();
            }
        });

        binding.buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mListener.EmployeeLoginSuccessful();
            }
        });
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        mListener = (EmployeeLoginListener) context;

    }

    EmployeeLoginListener mListener;
    interface EmployeeLoginListener{
        void EmployeeLoginSuccessful();
        void GoBackHomeFragment3();
    }
}