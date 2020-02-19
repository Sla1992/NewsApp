package com.example.android.quakereport;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import android.graphics.drawable.GradientDrawable;

public class NewsAdapter extends ArrayAdapter<News> {

    public static final String LOG_TAG = NewsAdapter.class.getName();

    public NewsAdapter(Context context, List<News> news){
        super(context,0, news);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false
            );
        }

        News currentNews = getItem(position);

        TextView titleTextView = (TextView) listItemView.findViewById(R.id.title);
        titleTextView.setText(currentNews.getmTitle());

        TextView descriptionTextView = (TextView) listItemView.findViewById(R.id.description);
        descriptionTextView.setText(currentNews.getmDescription());

        String wholeTime = currentNews.getmTime();
        Log.e(LOG_TAG, wholeTime);


        if(wholeTime.contains("T")){
            String[] parts = wholeTime.split("T");
            String part1 = parts[0];
            String part2 = parts[1];
            String part3 = part2.replace("Z", "");

            TextView dateTextView = (TextView) listItemView.findViewById(R.id.date);
            dateTextView.setText(part1);

            TextView timeTextView = (TextView) listItemView.findViewById(R.id.time);
            timeTextView.setText(part3);

        } else {
            TextView dateTextView = (TextView) listItemView.findViewById(R.id.date);
            dateTextView.setText("No Date reference");

            TextView timeTextView = (TextView) listItemView.findViewById(R.id.time);
            timeTextView.setText("No Time reference");
        }

        return listItemView;

    }
}
