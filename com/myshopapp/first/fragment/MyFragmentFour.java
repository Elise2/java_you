package com.myshopapp.lxc.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.myshopapp.R;
import com.myshopapp.lxc.adapter.ShopcarAdapter;


/**
 * Created by Administrator on 2015/10/12.
 */
public class MyFragmentFour extends Fragment {
    private ShopcarAdapter adapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v=LayoutInflater.from(getActivity()).inflate(R.layout.shopcar_layout,null);
        return v;

    }
}
