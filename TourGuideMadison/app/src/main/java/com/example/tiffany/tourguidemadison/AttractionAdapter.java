package com.example.tiffany.tourguidemadison;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AttractionAdapter extends ArrayAdapter<Attraction> {
    public AttractionAdapter(Activity context, ArrayList<Attraction> attractionArrayList) {
        super(context, 0, attractionArrayList);
    }
    @Override

    public View getView (int position, View convertView, ViewGroup parent){
        Attraction currentAttraction = getItem(position);

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.attraction_name);
        nameTextView.setText(currentAttraction.getAttractionName());

        TextView addressTextView = (TextView) listItemView.findViewById(R.id.attraction_address);
        addressTextView.setText(currentAttraction.getAttractionAddress());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.attraction_image);
        if (currentAttraction.hasImage()) {
            imageView.setImageResource(currentAttraction.getImageResourceId());
            imageView.setVisibility(View.VISIBLE);
        } else {
            imageView.setVisibility(View.GONE);
        }

        return listItemView;
    }
}

