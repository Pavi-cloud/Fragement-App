package com.example.fragements;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;


public class FragementSetting extends Fragment {

    Switch aSwitch;
    ConstraintLayout frame;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.fragment_fragement_setting, container, false);
        aSwitch=view.findViewById(R.id.switch1);
        frame=view.findViewById(R.id.frameLayoutSetting);

        aSwitch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(aSwitch.isChecked()){
                    frame.setBackgroundColor(getResources().getColor(R.color.teal_700));
                }
                else{
                    frame.setBackgroundColor(getResources().getColor(R.color.white));
                }
            }
        });
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        frame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Setting is Clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }
}