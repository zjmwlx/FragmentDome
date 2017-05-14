package com.fragment.zjmwl.fragmentdome;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by zjmwl on 2017/5/12.右边的fragment类
 */

public class RightFragment extends Fragment {

    @Nullable
    @Override
    /**
     * 通过onCreateView()方法加载定义好的布局文件
     */
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.right_fragment,container,false);
        return view;
    }
}
