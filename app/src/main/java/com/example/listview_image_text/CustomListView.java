package com.example.listview_image_text;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class CustomListView extends ArrayAdapter<String> {
    private String[] fruitName;
    private String[] desc;
    private Integer[] imgId;
    private Activity context;

    public CustomListView(Activity context, String[] fruitName, String[] desc, Integer[] imgId) {
        super(context, R.layout.listview_layout, fruitName);
        this.context = context;
        this.fruitName = fruitName;
        this.desc = desc;
        this.imgId = imgId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View r = convertView;
        ViewHolder viewHolder = null;
        if (r == null) {
            LayoutInflater layoutInflater = context.getLayoutInflater();
            r = layoutInflater.inflate(R.layout.listview_layout, null, true);
            viewHolder = new ViewHolder(r);
            r.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) r.getTag();
        }
        viewHolder.ivw.setImageResource(imgId[position]);
        viewHolder.tvw1.setText(fruitName[position]);
        viewHolder.tvw2.setText(desc[position]);
        return r;
    }

    class ViewHolder {
        TextView tvw1;
        TextView tvw2;
        ImageView ivw;

        ViewHolder(View v) {
            tvw1 = (TextView) v.findViewById(R.id.tvFruitName);
            tvw2 = (TextView) v.findViewById(R.id.tvDescription);
            ivw = (ImageView) v.findViewById(R.id.imageView);
        }
    }
}
