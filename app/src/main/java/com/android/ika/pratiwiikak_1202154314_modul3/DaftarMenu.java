package com.android.ika.pratiwiikak_1202154314_modul3;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;


import java.util.ArrayList;
import java.util.List;

public class DaftarMenu extends AppCompatActivity {
    RecyclerView cd;
    menuAdapter adapter;
    List<pilihAir> listmenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_menu);
        setTitle("List Air"); //set title untuk screennya

        //untuk meng INIT kan recyclerview dan adapternya//
        listmenu = new ArrayList<>();
        cd = findViewById(R.id.listMenu);
        cd.setHasFixedSize(true);

        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
            cd.setLayoutManager(new GridLayoutManager(DaftarMenu.this, 2));
        } else {
            cd.setLayoutManager(new GridLayoutManager(DaftarMenu.this, 1));
        }
        initdata();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            cd.setLayoutManager(new GridLayoutManager(DaftarMenu.this, 2));
        } else {
            cd.setLayoutManager(new GridLayoutManager(DaftarMenu.this, 1));
        }
    }

    private void initdata() {
        listmenu.add(new pilihAir(R.drawable.ades, "Ades", "Ades Mineral Water. \n Air mineral sehat untuk tubuh "));
        listmenu.add(new pilihAir(R.drawable.amidis, "Amidis", "Amidis Mineral Water. \n Air mineral sehat untuk tubuh"));
        listmenu.add(new pilihAir(R.drawable.aqua, "Aqua", "Aqua Mineral Water. \n Air mineral sehat untuk tubuh"));
        listmenu.add(new pilihAir(R.drawable.cleo, "Cleo", "Cleo Mineral Water. \n Air mineral sehat untuk tubuh"));
        listmenu.add(new pilihAir(R.drawable.club, "Club", "Club Mineral Water. \n Air mineral sehat untuk tubuh"));
        listmenu.add(new pilihAir(R.drawable.equil, "Equil", "Equil Mineral Water. \n Air mineral sehat untuk tubuh"));
        listmenu.add(new pilihAir(R.drawable.evian, "Evian", "Evian Mineral Water. \n Air mineral sehat untuk tubuh"));
        listmenu.add(new pilihAir(R.drawable.leminerale, "Le Minerale", "Le Minerale Mineral Water. \n Air mineral sehat untuk tubuh"));
        listmenu.add(new pilihAir(R.drawable.nestle, "Nestle", "Nestle Mineral Water. \n Air mineral sehat untuk tubuh"));
        listmenu.add(new pilihAir(R.drawable.pristine, "Pristine", "Mineral Water Pristine. \n Air mineral sehat untuk tubuh"));
        listmenu.add(new pilihAir(R.drawable.vit, "Vit", "VIT Mineral Water. \n Air mineral sehat untuk tubuh"));
        adapter = new menuAdapter(this, listmenu);
        cd.setAdapter(adapter);
    }
}