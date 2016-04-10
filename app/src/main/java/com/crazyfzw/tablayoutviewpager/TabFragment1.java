package com.crazyfzw.tablayoutviewpager;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class TabFragment1 extends Fragment {

    private static final String ARG_PARAM1 = "param1";
    private String mParam1;
    private TextView textView;
    private ListView listView;

    public static TabFragment1 newInstance(String param1) {
        TabFragment1 fragment = new TabFragment1();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        fragment.setArguments(args);
        return fragment;
    }


    public TabFragment1() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View myview = inflater.inflate(R.layout.fragment_tab1, container, false);
        textView = (TextView) myview.findViewById(R.id.textView1);
        textView.setText(mParam1);
        return myview;
    }

    public List<String> getData(){

        List<String> list = new ArrayList<>();
        for (int i=0; i<20; i++){
            list.add("item"+i);
        }
        return list;
    }

}
