package com.example.flyaudioqrcode.fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.flyaudioqrcode.R;
import com.example.flyaudioqrcode.base.BaseFragment;

public class CommonFragment extends BaseFragment {

    @Override
    protected int getFragmentItemViewResId() {
        return R.layout.fragment_common_item_view;
    }

    @Override
    protected View loadRootView(LayoutInflater inflater, ViewGroup container) {
        return inflater.inflate(R.layout.fragment_common,container,false);
    }
}
