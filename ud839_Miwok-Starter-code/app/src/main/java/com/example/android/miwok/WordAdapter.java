package com.example.android.miwok;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {
    private int mCategoryColorId;

    public WordAdapter(Activity context, ArrayList<Word> wordArrayList, int categoryColorId) {
        super(context, 0, wordArrayList);

        mCategoryColorId = categoryColorId;
    }
    @Override

    public View getView (int position, View convertView, ViewGroup parent){
        Word currentWord = getItem(position);

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_word);
        miwokTextView.setText(currentWord.getMiwokTranslation());

        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.english_word);
        defaultTextView.setText(currentWord.getDefaultTranslation());

        View wordContainer = listItemView.findViewById(R.id.word_container);
        int categoryColor = ContextCompat.getColor(getContext(), mCategoryColorId);
        wordContainer.setBackgroundColor(categoryColor);

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.word_image);
        if (currentWord.hasImage()) {
            imageView.setImageResource(currentWord.getImageResourceId());
            imageView.setVisibility(View.VISIBLE);
        } else {
            imageView.setVisibility(View.GONE);
        }

        return listItemView;
    }
}
