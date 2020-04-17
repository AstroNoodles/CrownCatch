package com.github.astronoodles.crowncatch2;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */
public class PointsFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.point_fragment, container, false);

        SharedPreferences prefs = getActivity().getSharedPreferences(MapActivity2.PREFERENCE_NAME, Context.MODE_PRIVATE);
        int points = prefs.getInt(MapActivity2.POINT_KEY, 0);
        String pointsTitle = getString(R.string.points_title, points);

        TextView pointsTitleView = v.findViewById(R.id.points_title_view);
        pointsTitleView.setText(pointsTitle);

        return v;
    }
}
