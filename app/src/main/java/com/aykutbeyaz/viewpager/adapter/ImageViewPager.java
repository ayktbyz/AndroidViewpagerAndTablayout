package com.aykutbeyaz.viewpager.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.PagerAdapter;

import com.aykutbeyaz.viewpager.R;

import java.util.ArrayList;
import java.util.List;

public class ImageViewPager extends PagerAdapter {

    private Context context;
    private LayoutInflater layoutInflater;
    private List<Integer> colorList = new ArrayList<>();

    public ImageViewPager(Context context) {
        this.context = context;
        this.layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return (colorList != null) ? colorList.size() : 0;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        View itemView = layoutInflater.inflate(R.layout.item_image_slider, container, false);

        ImageView imageView = itemView.findViewById(R.id.imageView);
        imageView.setBackgroundColor(colorList.get(position));

        container.addView(itemView);
        return itemView;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((LinearLayout) object);
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    public void addColor(Integer colorIndex){
        colorList.add(colorIndex);
    }
}
