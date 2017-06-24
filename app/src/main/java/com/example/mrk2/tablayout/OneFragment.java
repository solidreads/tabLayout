package com.example.mrk2.tablayout;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by mrk2 on 24/06/2017.
 */

public class OneFragment extends Fragment {
    View view;
    TextView txtTitle;
    String title;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.fragment_one, container, false);
        txtTitle=(TextView)view.findViewById(R.id.txtTitle);
        if(getArguments()!=null){
            title=getArguments().getString("title");
        }
        txtTitle.setText(title);
        return view;
    }
}
