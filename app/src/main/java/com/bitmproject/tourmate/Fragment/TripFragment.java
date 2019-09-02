package com.bitmproject.tourmate.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bitmproject.tourmate.R;
import com.bitmproject.tourmate.TripAdapter.Trip;
import com.bitmproject.tourmate.TripAdapter.TripAdapter;

import java.util.ArrayList;
import java.util.List;


public class TripFragment extends Fragment {

    private RecyclerView recyclerView;
    private TripAdapter adapter;
    private List<Trip> dataModelList;




    public TripFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_trip, container, false);

        recyclerView = v.findViewById(R.id.trip_recycler_view);

        dataModelList = new ArrayList<>();

        for (int i = 1; i <= 20; ++i) {
            dataModelList.add(new Trip("Sylhet","Nice Place"));
        }
        adapter = new TripAdapter(dataModelList, getContext());
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        recyclerView.setAdapter(adapter);

        return v;
    }



}
