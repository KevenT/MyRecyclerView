package com.wangyi.systemrecycleview;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.wangyi.recyclerviewwangyi.R;

public class SysRecyclerViewAdapter extends RecyclerView.Adapter<SysRecyclerViewAdapter.SysRVViewHolder> {
    @NonNull
    @Override
    public SysRecyclerViewAdapter.SysRVViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View itemView = inflater.inflate(R.layout.item_table3, viewGroup, false);

//        TextView textView= (TextView) itemView.findViewById(R.id.text1);
//        textView.setText("网易课堂 "+i);

        return new SysRVViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull SysRVViewHolder viewHolder, int i) {
        viewHolder.textView.setText("网易课堂 "+i);
    }

    @Override
    public int getItemCount() {
        return 30;
    }


    class SysRVViewHolder extends RecyclerView.ViewHolder{
        TextView textView;

        public SysRVViewHolder(@NonNull View itemView) {
            super(itemView);
            textView= (TextView) itemView.findViewById(R.id.text1);
        }
    }
}
