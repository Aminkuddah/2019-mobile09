package com.example.recyclerviewsangatsederhanatugas2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.GridLayout;

import com.example.recyclerviewsangatsederhanatugas2.adapters.SuperHeroAdapter;
import com.example.recyclerviewsangatsederhanatugas2.models.SuperHero;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView rvSuperHero;
    List<SuperHero> listSuperHero = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvSuperHero = findViewById(R.id.rvSuperHero);

        listSuperHero.add(new SuperHero(
                "Joker 1",
                "Joker adalah sebuah karakter penjahat super fiksi yang dibuat oleh Bill Finger, Bob Kane, dan Jerry Robinson yang pertama kali muncul dalam keluaran debut buku komik Batman (25 April 1940) yang diterbitkan oleh DC Comics. Klaim atas pembuatan Joker dipersengketakan; Kane dan Robinson mengklaim tanggung jawab atas rancangan Joker, sementara Finger berkontribusi terhadap penulisannya. Meskipun Joker direncanakan untuk dimatikan pada penampilan awalnya, atas tuntutan editorial, ia menjadi karakter musuh besar pahlawan super Batman.",
                R.drawable.joker10));
        listSuperHero.add(new SuperHero(
                "Joker",
                "Joker adalah sebuah karakter penjahat super fiksi yang dibuat oleh Bill Finger, Bob Kane, dan Jerry Robinson yang pertama kali muncul dalam keluaran debut buku komik Batman (25 April 1940) yang diterbitkan oleh DC Comics. Klaim atas pembuatan Joker dipersengketakan; Kane dan Robinson mengklaim tanggung jawab atas rancangan Joker, sementara Finger berkontribusi terhadap penulisannya. Meskipun Joker direncanakan untuk dimatikan pada penampilan awalnya, atas tuntutan editorial, ia menjadi karakter musuh besar pahlawan super Batman.",
                R.drawable.joker11));
        listSuperHero.add(new SuperHero(
                "Joker",
                "Joker adalah sebuah karakter penjahat super fiksi yang dibuat oleh Bill Finger, Bob Kane, dan Jerry Robinson yang pertama kali muncul dalam keluaran debut buku komik Batman (25 April 1940) yang diterbitkan oleh DC Comics. Klaim atas pembuatan Joker dipersengketakan; Kane dan Robinson mengklaim tanggung jawab atas rancangan Joker, sementara Finger berkontribusi terhadap penulisannya. Meskipun Joker direncanakan untuk dimatikan pada penampilan awalnya, atas tuntutan editorial, ia menjadi karakter musuh besar pahlawan super Batman.",
                R.drawable.joker12));
        SuperHeroAdapter superHeroAdapter = new SuperHeroAdapter(listSuperHero);
        rvSuperHero.setAdapter(superHeroAdapter);
//        rvSuperHero.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        rvSuperHero.setLayoutManager(new GridLayoutManager(this, 2));

    }
}
