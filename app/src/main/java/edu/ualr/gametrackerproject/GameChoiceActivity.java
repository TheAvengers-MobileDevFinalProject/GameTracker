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

        psBtn = findViewById(R.id.playstationBtn);
        ntBtn = findViewById(R.id.nintendoBtn);
        xbBtn = findViewById(R.id.xboxBtn);

        psBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onPSButtonClick();
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

    public void onPSButtonClick() {
        setContentView(R.layout.playstation_form_activity);

    }

    public void onNTButtonClick() {
        Intent intent = new Intent(GameChoiceActivity.this, NTFormActivity.class);
        startActivity(intent);

    }

    public void onXBButtonClick() {
        Intent intent = new Intent(GameChoiceActivity.this, XBFormActivity.class);
        startActivity(intent);

    }
}

