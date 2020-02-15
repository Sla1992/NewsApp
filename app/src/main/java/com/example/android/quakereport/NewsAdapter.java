package com.example.android.quakereport;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import android.graphics.drawable.GradientDrawable;

public class NewsAdapter extends ArrayAdapter<News> {

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

        ImageView defaultImageView = (ImageView) listItemView.findViewById(R.id.image_view);

        defaultImageView.setImageResource(R.drawable.gaming);
        defaultImageView.setVisibility(View.VISIBLE);


        TextView titleTextView = (TextView) listItemView.findViewById(R.id.title);
        titleTextView.setText(currentNews.getmTitle());

        TextView infoTextView = (TextView) listItemView.findViewById(R.id.info);
        infoTextView.setText(currentNews.getmInfo());

        return listItemView;

    }
}
