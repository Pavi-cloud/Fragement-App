package com.example.fragements;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

public class FragementSearch extends Fragment {

    private static final String TAG = "";

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        Log.d(TAG, "  onAttach");
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.d(TAG, "  onCreate");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_fragement_search, container, false);

        TextView view1,view2;
        view1=view.findViewById(R.id.createView);
        view2=view.findViewById(R.id.start);

        view1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager manager=getActivity().getSupportFragmentManager();
                FragmentTransaction transaction=manager.beginTransaction();
                transaction.replace(R.id.searchFragment,new Fragement_Add());
                transaction.addToBackStack("Pavia");
                transaction.commit();
            }
        });

        view2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager manager=getActivity().getSupportFragmentManager();
                FragmentTransaction transaction=manager.beginTransaction();
                transaction.replace(R.id.searchFragment,new imageFragment(),"New Fragment Tag");
                transaction.addToBackStack("Pavia");
                transaction.commit();
            }
        });

        Log.d(TAG, "  onCreateView");

        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Log.d(TAG, "  onViewCreated");
    }

    @Override
    public void onStart() {
        super.onStart();

        Log.d(TAG, "  onStart");
    }

    @Override
    public void onResume() {
        super.onResume();

        Log.d(TAG, "  onResume");
    }

    @Override
    public void onPause() {
        super.onPause();

        Log.d(TAG, "  onPause");
    }

    @Override
    public void onStop() {
        super.onStop();

        Log.d(TAG, "  onStop");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();

        Log.d(TAG, "  onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();

        Log.d(TAG, "  onDestroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();

        Log.d(TAG, "  onDetach");
    }
}