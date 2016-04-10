package com.crazyfzw.tablayoutviewpager;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class TabFragment2 extends Fragment {

    private static final String ARG_PARAM1 = "param1";
    private String mParam1;
    private TextView textView;

    public static TabFragment2 newInstance(String param1) {
        TabFragment2 fragment = new TabFragment2();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        fragment.setArguments(args);
        return fragment;
    }


    public TabFragment2() {
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
        View myview = inflater.inflate(R.layout.fragment_tab2, container, false);
        textView = (TextView) myview.findViewById(R.id.textView2);
        textView.setText(mParam1);
        return myview;
    }


}
