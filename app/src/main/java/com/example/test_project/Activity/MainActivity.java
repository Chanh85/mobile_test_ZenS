package com.example.test_project.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.test_project.R;

import de.hdodenhof.circleimageview.CircleImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imageView_logo;
    TextView textView_title, textView_content, textView_story, textView_copyright, copyright;
    CircleImageView imageView_picture;
    AppCompatButton like_button, dislike_button;
    View decoratedContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mapAndInitiate();
    }

    private void mapAndInitiate() {
        imageView_logo = findViewById(R.id.imageView_logo);
        imageView_picture = findViewById(R.id.imageView_picture);
        textView_title = findViewById(R.id.textView_title);
        textView_content = findViewById(R.id.textView_content);
        textView_copyright = findViewById(R.id.textView_contentCopyright);
        textView_story = findViewById(R.id.textView_story);
        copyright = findViewById(R.id.copyright);
        like_button = findViewById(R.id.button_like);
        dislike_button = findViewById(R.id.button_dislike);
        decoratedContainer = findViewById(R.id.fragmentContainerView);

        imageView_logo.setImageResource(R.drawable.hl_logo);
        imageView_picture.setImageResource(R.drawable.smiling_sunflower);
        textView_title.setText(R.string.title);
        textView_content.setText(R.string.content);
        textView_copyright.setText(R.string.content_copyright);
        textView_story.setText(R.string.story);
        copyright.setText(R.string.copyright);
        like_button.setText(R.string.like_button);
        dislike_button.setText(R.string.dislike_button);
    }
}