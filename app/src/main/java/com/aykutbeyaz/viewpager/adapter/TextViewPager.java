package com.aykutbeyaz.viewpager.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.aykutbeyaz.viewpager.R;
import com.aykutbeyaz.viewpager.model.TextModel;

import java.util.ArrayList;
import java.util.List;

public class TextViewPager extends PagerAdapter {

    private Context context;
    private LayoutInflater layoutInflater;
    private List<TextModel> textModelList = new ArrayList<>();

    public TextViewPager(Context context) {
        this.context = context;
        this.layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return (textModelList != null) ? textModelList.size() : 0;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        View itemView = layoutInflater.inflate(R.layout.item_text_slider, container, false);

        TextView textViewOne = itemView.findViewById(R.id.text_slider_one);
        TextView textViewTwo = itemView.findViewById(R.id.text_slider_two);

        TextModel textModel = textModelList.get(position);

        textViewOne.setText(textModel.getTextOne());
        textViewTwo.setText(textModel.getTextTwo());

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

    public void addText(TextModel textModel){
        textModelList.add(textModel);
    }
}
