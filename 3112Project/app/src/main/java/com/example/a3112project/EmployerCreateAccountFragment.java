package com.example.a3112project;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.a3112project.databinding.FragmentEmployerCreateAccountBinding;
import com.example.a3112project.databinding.FragmentEmployerLoginBinding;


public class EmployerCreateAccountFragment extends Fragment {



    public EmployerCreateAccountFragment() {
        // Required empty public constructor
    }

    FragmentEmployerCreateAccountBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentEmployerCreateAccountBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.buttonCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mListener.GoBackHomeFragment2();
            }
        });

        binding.buttonEmployerLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //when the employer information is correct then go to the dashboard
                mListener.AuthSuccessfulCreateAccount();
            }
        });

    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        mListener = (EmployerCreateAccount) context;

    }
    EmployerCreateAccount mListener;
    interface EmployerCreateAccount{
        void AuthSuccessfulCreateAccount();
        void GoBackHomeFragment2();
    }
}