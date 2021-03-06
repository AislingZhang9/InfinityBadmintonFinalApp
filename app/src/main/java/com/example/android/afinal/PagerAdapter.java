package com.example.android.afinal;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.Fragment;

public class PagerAdapter extends FragmentPagerAdapter {
    private int numberoftabs;

    public PagerAdapter(FragmentManager fm, int numberoftabs){
        super(fm);
        this.numberoftabs = numberoftabs;
    }

    @Override
    public Fragment getItem(int position){
        switch(position){
            case 0:
                return new tab1();
            case 1:
                return new tab2();
            case 2:
                return new tab3();
            default:
                return  null;
        }
    }

    @Override
    public int getCount(){
        return numberoftabs;
    }

    @Override
    public int getItemPosition(@NonNull Object object) {
        return POSITION_NONE;
    }
}
