package com.golchaminerals.visitorsdata;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mTextMessage;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        FragmentTransaction ft1 = getFragmentManager().beginTransaction();
        ft1.replace(R.id.fragment_container,TodayFragment.newInstance(), null);
        ft1.commit();
    }


    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_today:
                    FragmentTransaction ft1 = getFragmentManager().beginTransaction();
                    ft1.replace(R.id.fragment_container,TodayFragment.newInstance(), null);
                    ft1.commit();
                    return true;
                case R.id.navigation_thisWeek:
                    FragmentTransaction ft2 = getFragmentManager().beginTransaction();
                    ft2.replace(R.id.fragment_container,ThisWeekFragment.newInstance(), null);
                    ft2.commit();
                    return true;
                case R.id.navigation_thisMonth:
                    FragmentTransaction ft3 = getFragmentManager().beginTransaction();
                    ft3.replace(R.id.fragment_container,ThisMonthFragment.newInstance(), null);
                    ft3.commit();
                    return true;
            }
            return false;
        }

    };

}
