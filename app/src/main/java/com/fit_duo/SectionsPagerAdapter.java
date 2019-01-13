package com.fit_duo;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

class SectionsPagerAdapter extends FragmentPagerAdapter {

    public SectionsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                RequestsFragment requestsFragment = new RequestsFragment();
                return requestsFragment;

            case 1:
                HomeFragment homeFragment = new HomeFragment();
                return homeFragment;

            case 2:
                ChatFragment chatFragment = new ChatFragment();
                return chatFragment;

            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    public CharSequence getPageTitle(int position) {

        switch (position) {
            case 0:
                return "REQUESTS";

            case 1:
                return "HOME";

            case 2:
                return "CHAT";

            default:
                return null;
        }
    }
}
