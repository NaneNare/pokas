package com.pokas.pokas.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RelativeLayout;

import com.github.clans.fab.FloatingActionButton;
import com.github.clans.fab.FloatingActionMenu;
import com.pokas.pokas.R;

import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity {

    FloatingActionMenu addMindMenu;
    FloatingActionButton addTheSecondPartOfAphorismButton, addTheFirstPartOfAphorismButton, addStoryButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen_3);

        addMindMenu = (FloatingActionMenu) findViewById(R.id.add_mind_menu);
        addTheSecondPartOfAphorismButton = (FloatingActionButton) findViewById(R.id.add_aphorism_first_part_button);
        addTheFirstPartOfAphorismButton = (FloatingActionButton) findViewById(R.id.add_aphorism_second_part_button);
        addStoryButton = (FloatingActionButton) findViewById(R.id.add_story_button);

        addTheSecondPartOfAphorismButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                RelativeLayout viewGroup = (RelativeLayout)findViewById(R.id.add_mind_layout);
                View bookView = getLayoutInflater().inflate(R.layout.add_mind_window_book, null);
                viewGroup.removeAllViews();
                viewGroup.addView(bookView);
            }
        });
        addTheFirstPartOfAphorismButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                RelativeLayout viewGroup = (RelativeLayout)findViewById(R.id.add_mind_layout);
                View bookView = getLayoutInflater().inflate(R.layout.add_mind_window_book, null);
                viewGroup.removeAllViews();
                viewGroup.addView(bookView);
            }
        });
        addStoryButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                RelativeLayout viewGroup = (RelativeLayout)findViewById(R.id.add_mind_layout);
                View bookView = getLayoutInflater().inflate(R.layout.add_mind_window_book, null);
                viewGroup.removeAllViews();
                viewGroup.addView(bookView);
            }
        });
    }
}
