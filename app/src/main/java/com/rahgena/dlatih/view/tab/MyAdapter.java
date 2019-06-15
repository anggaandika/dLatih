package com.rahgena.dlatih.view.tab;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ImageSpan;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.rahgena.dlatih.R;
import com.rahgena.dlatih.view.fragment.profil;
import com.rahgena.dlatih.view.fragment.daftarPelatih;

public class MyAdapter extends FragmentPagerAdapter {
    private Context mContext;
    private String[] titles ={"Akun","Daftar Pelatih"};
    private int heightIcon;

    public MyAdapter(FragmentManager fm, Context c){
        super(fm);
        mContext = c;
        double scale = c.getResources().getDisplayMetrics().density;
        heightIcon=(int)(24*scale+0.5f);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment frag= null;

        if(position ==0){
            frag = new profil();
        }else if(position == 1){
            frag = new daftarPelatih();
        }

        Bundle b = new Bundle();
        b.putInt("position", position);
        frag.setArguments(b);
        return frag;
    }

    @Override
    public int getCount() {
        return titles.length;
    }

    public CharSequence getPageTitle(int position){
        Drawable d = mContext.getResources().getDrawable(Integer.parseInt(titles[position]));
        d.setBounds(0,0,heightIcon,heightIcon);
        ImageSpan is = new ImageSpan(d);

        SpannableString sp = new SpannableString(" ");
        sp.setSpan(is,0,sp.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

        return sp;
    }

}