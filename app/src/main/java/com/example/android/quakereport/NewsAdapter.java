package com.example.android.quakereport;

import android.content.Context;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;


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

//        ImageView imageView =  (ImageView) listItemView.findViewById(R.id.image_view);
//        imageView.setBackground(new ImageLoader( (ImageView) listItemView.findViewById(R.id.image_view)).execute(currentNews.getmImageUrl()));
//        try {
//            ImageView imageView = (ImageView) listItemView.findViewById(R.id.image_view);
//            Bitmap bitmap = BitmapFactory.decodeStream((InputStream)new URL(currentNews.getmImageUrl()).getContent());
//            imageView.setImageBitmap(bitmap);
//        } catch (MalformedURLException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


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

    public static final String PREFS_FILE = "javaeye.prefs";

    public static Drawable getDrawableFromUrl(URL url) {
        try {
            InputStream is = url.openStream();
            Drawable d = Drawable.createFromStream(is, "newSrc");
            return d;
        } catch (MalformedURLException e) {
            // e.printStackTrace();
        } catch (IOException e) {
            // e.printStackTrace();
        }
        return null;
    }

    private static void copy(InputStream in, OutputStream out)
            throws IOException {
        byte[] b = new byte[4 * 1024];
        int read;
        while ((read = in.read(b)) != -1) {
            out.write(b, 0, read);
        }
    }

    private static void closeStream(Closeable stream) {
        if (stream != null) {
            try {
                stream.close();
            } catch (IOException e) {
                // Log.e(LOG_TAG, e.getMessage());
            }
        }
    }
}
