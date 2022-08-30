package com.example.fragements;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;


public class Fragement_Login extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        EditText edtName,edtPassword;
        Button btnSubmit;

        View view=inflater.inflate(R.layout.fragment_fragement__login, container, false);
        edtName=view.findViewById(R.id.enterName);
        edtPassword=view.findViewById(R.id.password);
        btnSubmit=view.findViewById(R.id.submit);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edtName.getText().toString().isEmpty() || edtPassword.getText().toString().isEmpty()){
                    Toast.makeText(getActivity(), "Enter the Credentials", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(getActivity(), "Data Submitted", Toast.LENGTH_SHORT).show();
                }
            }
        });
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        FrameLayout frameLayout=view.findViewById(R.id.frameLayout);
        frameLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "LogIn Frame is Clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }
}