package com.example.fragment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button frag1_btn,frag2_btn;
    Fragment1 fragment1;
    Fragment2 fragment2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //hooks
        frag1_btn=findViewById(R.id.frag1_btn);
        frag2_btn=findViewById(R.id.frag2_btn);
        fragment1=new Fragment1();
        fragment2=new Fragment2();

        //ClickListener
        frag1_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout,fragment1).commit();
            }
        });

        frag2_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout,fragment2).commit();
            }
        });
    }
}