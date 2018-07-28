package com.iseasoft.iseatv;

import android.os.Bundle;
import android.support.v17.leanback.app.BrowseFragment;
import android.util.Log;

public class MainFragment extends BrowseFragment {
    private static final String TAG = MainFragment.class.getSimpleName();

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        Log.i(TAG, "onActivityCreated");
        super.onActivityCreated(savedInstanceState);

    }
}