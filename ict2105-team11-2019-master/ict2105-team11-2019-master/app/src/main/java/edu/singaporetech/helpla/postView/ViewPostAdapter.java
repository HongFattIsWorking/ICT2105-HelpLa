package edu.singaporetech.helpla.postView;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class ViewPostAdapter extends FragmentPagerAdapter {
    private static final String TAG = "ViewPostAdapter";


    public ViewPostAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return null;
    }

    @Override
    public int getCount() {
        return 0;
    }
}
