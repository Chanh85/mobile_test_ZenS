package com.example.test_project.Component;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.test_project.R;

public class DecoratedContainer extends Fragment {

    View view;
    TextView story_title, story_subtitle;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.decorated_container, container, false);
        map();
        return view;

    }

    private void map() {
        story_title = view.findViewById(R.id.textView_storytitle);
        story_subtitle = view.findViewById(R.id.textView_storysubtitle);

        story_title.setText(R.string.title_story);
        story_subtitle.setText(R.string.subtitle_story);
    }
}
