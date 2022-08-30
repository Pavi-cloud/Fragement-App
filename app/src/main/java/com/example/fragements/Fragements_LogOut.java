package com.example.fragements;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class Fragements_LogOut extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        EditText editText;
        Button btn;

        View view=inflater.inflate(R.layout.fragment_fragements__log_out, container, false);
        btn=view.findViewById(R.id.submit);
        editText=view.findViewById(R.id.enterData);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(editText.getText().toString().isEmpty()){
                    Toast.makeText(getActivity(), "Enter Name or Email", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(getActivity(), "Id has been LogOut", Toast.LENGTH_SHORT).show();
                    editText.setText("");
                }
            }
        });
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ConstraintLayout constraintLayout=view.findViewById(R.id.frameLayoutLogOut);
        constraintLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "It is Clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }
}