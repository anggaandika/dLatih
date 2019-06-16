package com.rahgena.dlatih.Tab;

import android.os.Bundle;
import android.view.LayoutInflater;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.rahgena.dlatih.R;


/**
 * Created by hp1 on 21-01-2015.
 */
public class Deskripsi extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v =inflater.inflate(R.layout.tab_desc,container,false);
        return v;
    }
}