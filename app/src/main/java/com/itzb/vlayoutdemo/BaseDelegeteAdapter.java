package com.itzb.vlayoutdemo;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;

import com.alibaba.android.vlayout.DelegateAdapter;
import com.alibaba.android.vlayout.LayoutHelper;

public class BaseDelegeteAdapter extends DelegateAdapter.Adapter<BaseViewHolder> {

    private LayoutHelper mLayoutHelper;
    private int mCount = -1;
    private int mLayoutId = -1;
    private int mViewTypeItem = -1;

    public BaseDelegeteAdapter(LayoutHelper layoutHelper, int layoutId, int count) {
        this.mLayoutHelper = layoutHelper;
        this.mCount = count;
        this.mLayoutId = layoutId;
    }

    @Override
    public LayoutHelper onCreateLayoutHelper() {
        return mLayoutHelper;
    }

    @NonNull
    @Override
    public BaseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new BaseViewHolder(LayoutInflater.from(parent.getContext()).inflate(mLayoutId, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull BaseViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return mCount;
    }
}
