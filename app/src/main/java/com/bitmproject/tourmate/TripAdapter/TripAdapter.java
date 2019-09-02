package com.bitmproject.tourmate.TripAdapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.bitmproject.tourmate.R;

import java.util.List;


public class TripAdapter extends RecyclerView.Adapter<TripAdapter.ViewHolder> {

    private List<Trip> trips;
    private Context context;

    public TripAdapter(List<Trip> trips, Context context) {
        this.trips = trips;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_trip_list,
                viewGroup,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {

        Trip trip = trips.get(i);

        viewHolder.tripName.setText(trip.getTripName());
        viewHolder.tripDetails.setText(trip.getTripDetails());

    }

    @Override
    public int getItemCount() {
        return trips.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView tripName,tripDetails;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tripName = itemView.findViewById(R.id.tour_name_tv);
            tripDetails = itemView.findViewById(R.id.tour_details_tv);

        }
    }
}
