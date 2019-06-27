package com.wangyi.recyclerviewwangyi;

import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "wangyi";
    RecyclerView recyclerView;

    Handler handler = new Handler(){

      @Override
      public void handleMessage(Message msg){

//          recyclerView.setAdapter(new RecyclerView.Adapter() {
//              @Override
//              public View onCreateViewHodler(int position, View convertView, ViewGroup parent) {
//                  convertView=  MainActivity.this.getLayoutInflater().inflate( R.layout.item_table,parent,false);
//                  TextView textView= (TextView) convertView.findViewById(R.id.text1);
//                  textView.setText("网易课堂 "+position);
//                  Log.i(TAG, "onCreateViewHodler: " + convertView.hashCode());
//
//                  return convertView;
//              }
//
//              @Override
//              public View onBinderViewHodler(int position, View convertView, ViewGroup parent) {
//                  TextView textView= (TextView) convertView.findViewById(R.id.text1);
//                  textView.setText("网易课堂 "+position);
//                  Log.i(TAG, "onBinderViewHodler: " + convertView.hashCode());
//                  return convertView;
//              }
//
//              @Override
//              public int getItemViewType(int row) {
//                  return 0;
//              }
//
//              @Override
//              public int getViewTypeCount() {
//                  return 1;
//              }
//
//              @Override
//              public int getCount() {
//                  return 300000;
//              }
//
//              @Override
//              public int getHeight(int index) {
//                  return 100;
//              }
//          });



          recyclerView.setAdapter(new RecyclerView.Adapter() {
              @Override
              public View onCreateViewHodler(int position, View convertView, ViewGroup parent) {
//                  convertView=  MainActivity.this.getLayoutInflater().inflate( R.layout.item_table,parent,false);
//                  TextView textView= (TextView) convertView.findViewById(R.id.text1);
//                  textView.setText("网易课堂 "+position);
//                  Log.i(TAG, "onCreateViewHodler: " + convertView.hashCode());
                  if(position%2==0){
                      convertView=  MainActivity.this.getLayoutInflater().inflate( R.layout.item_table,parent,false);
                      TextView textView= (TextView) convertView.findViewById(R.id.text1);
                      textView.setText("网易课堂 "+position);
                  }else{
                      convertView=  MainActivity.this.getLayoutInflater().inflate( R.layout.item_table2,parent,false);
                      TextView textView= (TextView) convertView.findViewById(R.id.text2);
                      textView.setText("网易图标 "+position);
                  }


                  return convertView;
              }

              @Override
              public View onBinderViewHodler(int position, View convertView, ViewGroup parent) {
                  if(position%2==0) {
                      TextView textView = (TextView) convertView.findViewById(R.id.text1);
                      textView.setText("网易课堂 " + position);
                  }else{
                      TextView textView = (TextView) convertView.findViewById(R.id.text2);
                      textView.setText("网易图标 " + position);
                  }
//                  Log.i(TAG, "onBinderViewHodler: " + convertView.hashCode());
                  return convertView;
              }

              @Override
              public int getItemViewType(int row) {
                  if (row%2==0){
                      return 0;
                  }else{
                      return 1;
                  }
              }

              @Override
              public int getViewTypeCount() {
                  return 2;
              }

              @Override
              public int getCount() {
                  return 300000;
              }

              @Override
              public int getHeight(int index) {
                  return 100;
              }
          });

      }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.table);
        recyclerView.setAdapter(new RecyclerView.Adapter() {
            @Override
            public View onCreateViewHodler(int position, View convertView, ViewGroup parent) {
                convertView=  MainActivity.this.getLayoutInflater().inflate( R.layout.item_table,parent,false);
                TextView textView= (TextView) convertView.findViewById(R.id.text1);
                textView.setText("网易课堂 "+position);
                Log.i(TAG, "onCreateViewHodler: " + convertView.hashCode());
                return convertView;
              }

            @Override
            public View onBinderViewHodler(int position, View convertView, ViewGroup parent) {
                TextView textView= (TextView) convertView.findViewById(R.id.text1);
                textView.setText("网易课堂 "+position);
                Log.i(TAG, "onBinderViewHodler: " + convertView.hashCode());
                return convertView;
            }

            @Override
            public int getItemViewType(int row) {
                return 0;
            }

            @Override
            public int getViewTypeCount() {
                return 1;
            }

            @Override
            public int getCount() {
                return 30;
            }

            @Override
            public int getHeight(int index) {
                return 100;
            }
        });
//        测试不复用的内存压力
        handler.sendEmptyMessageDelayed(1,5000);
    }
}
