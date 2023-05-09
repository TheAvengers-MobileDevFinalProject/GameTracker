package edu.ualr.gametrackerproject;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class ListHomeActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    public FloatingActionButton newGame;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_activity);

        newGame = findViewById(R.id.addgameBtn);
        newGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onButtonClick();
            }
        });

    }
    public void onButtonClick() {

        setContentView(R.layout.game_choice_activity);

    }

}
