package com.example.a3112project;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.a3112project.data.Employee;
import com.example.a3112project.data.Employer;
import com.example.a3112project.databinding.FragmentEmployerLoginBinding;
import com.example.a3112project.MainActivity;

import java.util.ArrayList;

public class EmployerLoginFragment extends Fragment {



    public EmployerLoginFragment() {
        // Required empty public constructor
    }


    FragmentEmployerLoginBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        // Inflate the layout for this fragment
        binding = FragmentEmployerLoginBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        MainActivity.testing.add("this is a string");
        getActivity().setTitle(MainActivity.testing.get(0));

        binding.buttonGoToHome2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mListener.GoBackHomeFragment();
            }
        });

        binding.buttonEmployerLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //when the login is successful then go to the employerdashboard
                mListener.EmployerLoginSuccessful();
            }
        });

    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        mListener = (EmployerLoginListener) context;

    }

    EmployerLoginListener mListener;
    interface EmployerLoginListener{
        void EmployerLoginSuccessful();
        void GoBackHomeFragment();
    }
}