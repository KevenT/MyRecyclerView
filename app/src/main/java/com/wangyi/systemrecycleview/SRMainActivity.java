package com.wangyi.systemrecycleview;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.wangyi.recyclerviewwangyi.R;
import com.wangyi.recyclerviewwangyi.Recycler;

public class SRMainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.Adapter mRecyclerAdapter;
    Handler mHandler = new Handler(){
      @Override
      public void handleMessage(Message message)  {
          mRecyclerAdapter = new SysRecyclerViewAdapter1();
          LinearLayoutManager linearLayoutManager = new LinearLayoutManager(SRMainActivity.this);
          linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
          recyclerView.setLayoutManager(linearLayoutManager);
          recyclerView.setAdapter(mRecyclerAdapter);
      }
    };

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acitvity_sr);

        recyclerView = findViewById(R.id.recyclerView);

        mRecyclerAdapter = new SysRecyclerViewAdapter();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(SRMainActivity.this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(mRecyclerAdapter);
        mHandler.sendEmptyMessageDelayed(0,5000);
    }
}
