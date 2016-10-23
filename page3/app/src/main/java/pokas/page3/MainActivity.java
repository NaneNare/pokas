package pokas.page3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.github.clans.fab.FloatingActionButton;
import com.github.clans.fab.FloatingActionMenu;

public class MainActivity extends AppCompatActivity {

    FloatingActionMenu FAM;
    FloatingActionButton FABStory, FABFirstPart, FABSecondPart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FAM = (FloatingActionMenu) findViewById(R.id.floating_action_menu);
        FABStory = (FloatingActionButton) findViewById(R.id.floating_action_button_story);
        FABFirstPart = (FloatingActionButton) findViewById(R.id.floating_action_button_first_part);
        FABSecondPart = (FloatingActionButton) findViewById(R.id.floating_action_button_second_part);

        FABStory.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                setContentView(R.layout.add_story);
            }
        });
        FABFirstPart.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                setContentView(R.layout.add_story);
                //TODO get second part of a story from server

            }
        });
        FABSecondPart.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                setContentView(R.layout.add_story);
                //TODO get first part of a story from server

            }
        });
    }
}
