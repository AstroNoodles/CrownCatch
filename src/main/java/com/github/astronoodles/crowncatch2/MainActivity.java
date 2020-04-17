package com.github.astronoodles.crowncatch2;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity implements TabLayout.OnTabSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabLayout tabs = findViewById(R.id.tabLayout);
        tabs.addOnTabSelectedListener(this);
    }

    @Override
    public void onTabSelected(TabLayout.Tab tab) {
        FragmentTransaction transact = getSupportFragmentManager().beginTransaction();
        Fragment f = null;
        if(tab.getText().equals("Intro")){
            f = new IntroFragment();
        } else if(tab.getText().equals("Map")) {
            Intent i = new Intent(this, MapActivity2.class);
            startActivity(i);
            return;
        } else if(tab.getText().equals("Points")){
            f = new PointsFragment();
        } else if(tab.getText().equals("News")){
          f = new IntroFragment();
        } else if(tab.getText().equals("Connect")){
          f = new IntroFragment();
        }
        transact.replace(R.id.main_fragment, f);
        transact.commit();
    }

    @Override
    public void onTabReselected(TabLayout.Tab tab) { }

    @Override
    public void onTabUnselected(TabLayout.Tab tab) { }
}
