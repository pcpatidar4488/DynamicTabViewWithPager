package com.example.manjoor.customseekbarpc;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by BerylSystems on 22/11/2018.
 */

public class DetailsFragment extends Fragment {

    @RequiresApi(api = Build.VERSION_CODES.GINGERBREAD)
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout_details_fragment, container, false);


        return view;
    }

    @Override
    public void onStart() {
        super.onStart();
    }

    @Override
    public void onPause() {
        super.onPause();
    }

    @Override
    public void onStop() {
        super.onStop();
    }

    public void onResume() {
        super.onResume();
    }

}
