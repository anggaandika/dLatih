package com.rahgena.dlatih.view;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.rahgena.dlatih.R;
import com.rahgena.dlatih.view.fragment.home;
import com.rahgena.dlatih.view.fragment.pesan;
import com.rahgena.dlatih.view.fragment.profil;

public class MainActivity extends AppCompatActivity {
    private static final  String TAG = MainActivity.class.getSimpleName();
    private BottomNavigationView bottomNavigationView;
    private Fragment fragment;
    private FragmentManager fragmentManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_nav);
        bottomNavigationView.inflateMenu(R.menu.bottomnavigation_menu);
        fragmentManager = getSupportFragmentManager();

        //tampilan yang pertama
        fragmentManager.beginTransaction().replace(R.id.main_content, new home()).commit();

        //memberi listener pada menu item dalam bottom navigasi item
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                int id = menuItem.getItemId();
                switch (id){
                    case R.id.home:
                        fragment = new home();
                        break;
                    case R.id.pesan:
                        fragment = new pesan();
                        break;
                    case R.id.profil:
                        fragment = new profil();
                        break;
                }
                final FragmentTransaction transaction = fragmentManager.beginTransaction();
                transaction.replace(R.id.main_content,fragment).commit();
                return true;
            }
        });
    }
}
