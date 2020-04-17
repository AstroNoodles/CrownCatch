package com.github.astronoodles.crowncatch2;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class RecyclerFragment extends Fragment {

    public RecyclerFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.rss, container, true);
        RecyclerView rv = v.findViewById(R.id.recycler);
        rv.setLayoutManager(new LinearLayoutManager(getActivity()));

        return v;
    }

    private class RecyclerCardAdapter extends RecyclerView.Adapter<RecyclerFragment.ViewHolder>{

        private List<Bitmap> imageList;
        private List<String> sourceList;
        private List<String> hoursAgoList;

        private RecyclerCardAdapter(List<Bitmap> imageList, List<String> sourceList, List<String> hoursAgoList){
            this.imageList = imageList;
            this.sourceList = sourceList;
            this.hoursAgoList = hoursAgoList;

            if(sourceList.size() != hoursAgoList.size()){
                System.out.println("Make sure that the lists are the same size!");
            }
        }

        @NonNull
        @Override
        public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View v = LayoutInflater.from(getContext()).inflate(R.layout.recyclerlayout, parent, false);
            return new ViewHolder(v);
        }

        @Override
        public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        }

        @Override
        public int getItemCount() {
            return sourceList.size();
        }
    }


    private class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView imView;
        private TextView from;
        private TextView hoursago;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imView = itemView.findViewById(R.id.rssPhoto);
            from = itemView.findViewById(R.id.from);
            hoursago = itemView.findViewById(R.id.hoursago);
        }

        public ImageView getImView() {
            return imView;
        }

        public TextView getFrom() {
            return from;
        }

        public TextView getHoursago() {
            return hoursago;
        }
    }
}
