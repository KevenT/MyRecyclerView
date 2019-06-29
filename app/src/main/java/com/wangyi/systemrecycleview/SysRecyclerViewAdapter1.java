package com.wangyi.systemrecycleview;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.wangyi.recyclerviewwangyi.R;

public class SysRecyclerViewAdapter1 extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());

        if (i%2==0){
            View itemView = inflater.inflate(R.layout.item_table4, viewGroup, false);
            return new SysRVViewHolderImage(itemView);
        }else{
            View itemView = inflater.inflate(R.layout.item_table3, viewGroup, false);
            return new SysRVViewHolder(itemView);
        }

//        TextView textView= (TextView) itemView.findViewById(R.id.text1);
//        textView.setText("网易课堂 "+i);


    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        if (i%2==0 ){
//            &&viewHolder instanceof SysRVViewHolderImage
            SysRVViewHolderImage mSysRVViewHolderImage = (SysRVViewHolderImage)viewHolder;
            mSysRVViewHolderImage.textView.setText("网易课堂 "+i);
        }else{
            SysRVViewHolder mSysRVViewHolder = (SysRVViewHolder)viewHolder;
            mSysRVViewHolder.textView.setText("网易图标 "+i);
        }

    }

    @Override
    public int getItemViewType(int position) {
        if (position%2==0){

            return 0;
        }else{
            return 1;
        }


//        return super.getItemViewType(position);
    }

    @Override
    public int getItemCount() {
        return 30000;
    }


    class SysRVViewHolder extends RecyclerView.ViewHolder{
        TextView textView;

        public SysRVViewHolder(@NonNull View itemView) {
            super(itemView);
            textView= (TextView) itemView.findViewById(R.id.text1);
        }
    }

    class SysRVViewHolderImage extends RecyclerView.ViewHolder{
        TextView textView;
        ImageView imageView;

        public SysRVViewHolderImage(@NonNull View itemView) {
            super(itemView);
            textView= (TextView) itemView.findViewById(R.id.text2);
        }
    }
}
