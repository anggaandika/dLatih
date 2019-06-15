package com.rahgena.dlatih.view.fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import androidx.fragment.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.rahgena.dlatih.R;
import com.rahgena.dlatih.view.tab.MyAdapter;
import com.rahgena.dlatih.view.tab.SlidingTabLayout;

public class profil extends Fragment {
    private SlidingTabLayout mSlidingTabLayout;
    private ViewPager mViewPager;
    public profil() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_profil, container, false);
        return view;


        //(Masih Error)
//        mViewPager=(ViewPager)view.findViewById(R.id.vp_tabs);
//        mViewPager.setAdapter(new MyAdapter(getSupportFragmentManager(), this));

//        mSlidingTabLayout=(SlidingTabLayout)view.findViewById(R.id.stl_tab);
//        mSlidingTabLayout.setDistributeEvenly(true);
//        mSlidingTabLayout.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
//        mSlidingTabLayout.setSelectedIndicatorColors(getResources().getColor(R.color.colorAccent));
//        mSlidingTabLayout.setCustomTabView(R.layout.tab_view, R.id.tv_tab);
//        mSlidingTabLayout.setViewPager(mViewPager);

    }

}