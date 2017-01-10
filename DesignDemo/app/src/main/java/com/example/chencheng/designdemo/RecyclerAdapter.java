package com.example.chencheng.designdemo;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by chencheng on 16/12/22.
 */
public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder>{

    private Context context;
    private List<String> data;
    private LayoutInflater inflater;

    public RecyclerAdapter(Context context,List<String> data){

        this.context=context;
        inflater=LayoutInflater.from(context);
        this.data=data;
    }

    @Override
    public RecyclerAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view=inflater.inflate(R.layout.item_vp,parent,false);
        ViewHolder viewHolder=new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.mTextView.setText(data.get(position));
    }

    @Override
    public int getItemCount() {
        return data==null?0:data.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        TextView mTextView;

        public ViewHolder(View itemView) {
            super(itemView);
            mTextView = (TextView) itemView.findViewById(R.id.txt);
        }
    }
}
