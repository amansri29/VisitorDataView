package com.golchaminerals.visitorsdata;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ThisMonthFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_this_month,
                container, false);
        return view;
    }


    public static ThisMonthFragment newInstance() {
        ThisMonthFragment myFragment = new ThisMonthFragment();
        return myFragment;
    }

}