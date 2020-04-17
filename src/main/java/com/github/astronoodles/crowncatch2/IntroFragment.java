package com.github.astronoodles.crowncatch2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.annotation.IdRes;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

/**
 * A simple {@link Fragment} subclass.
 */
public class IntroFragment extends Fragment {

    public IntroFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.intro, container, false);

        Button mapButton = v.findViewById(R.id.view_map);

        mapButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), MapActivity2.class);
                startActivity(i);
            }
        });

        return v;
    }

}
