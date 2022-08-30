package com.example.fragements;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView imgLogIn,imgLogOut,imgSetting,imgSearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgLogIn=findViewById(R.id.logIn);
        imgLogOut=findViewById(R.id.logOut);
        imgSetting=findViewById(R.id.setting);
        imgSearch=findViewById(R.id.search);

        imgLogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragement_Login fragement_login=new Fragement_Login();
                FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.linear,fragement_login);
                transaction.commit();
            }
        });

        imgLogOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragements_LogOut fragements_logOut=new Fragements_LogOut();
                FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.linear,fragements_logOut);
                transaction.commit();
            }
        });

        imgSetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragementSetting setting=new FragementSetting();
                FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.linear,setting);
                transaction.commit();
            }
        });

        imgSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragementSearch search=new FragementSearch();
                FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.linear,search);
                transaction.commit();
            }
        });
    }

    public void runIt(int item){

        Log.e("Pavitra", "runIt: ");


    }
}