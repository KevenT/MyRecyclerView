package com.wangyi;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.wangyi.recyclerviewwangyi.MyRecyclerView;
import com.wangyi.recyclerviewwangyi.R;
import com.wangyi.systemrecycleview.SRMainActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        findViewById(R.id.btn_myrecycler_demo).setOnClickListener(this);
        findViewById(R.id.btn_syste_demo).setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        int viewId = view.getId();

        switch(view.getId()){
            case R.id.btn_myrecycler_demo:
                startActivity(new Intent(this, MyRecyclerView.class));
                break;
            case R.id.btn_syste_demo:
                startActivity(new Intent(this, SRMainActivity.class));
        }


    }
}
