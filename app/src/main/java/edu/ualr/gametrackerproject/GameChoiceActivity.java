package edu.ualr.gametrackerproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;


public class GameChoiceActivity extends AppCompatActivity {
    public ImageButton psBtn;
    public ImageButton ntBtn;
    public ImageButton xbBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_choice_activity);

        psBtn = (ImageButton) findViewById(R.id.playstationBtn);
        ntBtn = (ImageButton) findViewById(R.id.nintendoBtn);
        xbBtn = (ImageButton) findViewById(R.id.xboxBtn);

        psBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadingNewActivity = new Intent(GameChoiceActivity.this, PSFormActivity.class);
                startActivity(intentLoadingNewActivity);
            }
        });


        ntBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onNTButtonClick();
            }
        });

        xbBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onXBButtonClick();
            }
        });

    }

    public void onNTButtonClick() {
//        Intent intent = new Intent(GameChoiceActivity.this, NTFormActivity.class);
//        startActivity(intent);
        setContentView(R.layout.nintendo_form_activity);

    }

    public void onXBButtonClick() {
//        Intent intent = new Intent(GameChoiceActivity.this, XBFormActivity.class);
//        startActivity(intent);
        setContentView(R.layout.xbox_form_activity);

    }
}

