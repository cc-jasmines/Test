package com.example.chencheng.designdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chencheng on 16/12/22.
 */
public class CardFragment extends Fragment{

    private RecyclerView recyclerView;
    private RecyclerAdapter adapter;
    private List<String> data;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_main,container,false);
        recyclerView=((RecyclerView) view.findViewById(R.id.recycle_view));
        data=new ArrayList<>();

        for (int i=0;i<30;i++){
            data.add("我是第"+i+"个cardView");
        }

        adapter=new RecyclerAdapter(getActivity(),data);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL
                , false));
        recyclerView.setAdapter(adapter);
        return view;
    }
}
