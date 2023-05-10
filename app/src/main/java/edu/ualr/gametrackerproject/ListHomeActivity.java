package edu.ualr.gametrackerproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

import edu.ualr.gametrackerproject.model.Game;
import edu.ualr.gametrackerproject.model.ProfileFragment;


public class ListHomeActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    public FloatingActionButton newGame;
    private RecyclerView mRecyclerView;
    private GameAdapter mAdapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_activity);


        //toolbar
        Toolbar toolbar = findViewById(R.id.my_toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setLogo(R.mipmap.gametracker_logo);
        getSupportActionBar().setDisplayUseLogoEnabled(true);

        newGame = findViewById(R.id.addgameBtn);
        mRecyclerView = findViewById(R.id.recyclerView);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        mRecyclerView.setAdapter(mAdapter);

        newGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onButtonClick();
            }
        });

        FloatingActionButton fab = findViewById(R.id.addgameBtn);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //    Creating a bundle for the profile button in toolbar
                //    Bundle bundle = new Bundle();
                //    bundle.putString("name", name);
                //    bundle.putString("email", email);
                //    ProfileFragment profileFragment = new ProfileFragment();
                //    profileFragment.setArguments(bundle);
                // create an Intent to launch the other application
                //Intent intent = new Intent(Intent.ACTION_SEND);
                //intent.setType("text/plain");
                //intent.putExtra(Intent.EXTRA_TEXT, "data to send");

                // start the other application
                //startActivity(Intent.createChooser(intent, "Send data using:"));
                onButtonClick();
            }
        });
    }
    public void onButtonClick() {

        setContentView(R.layout.game_choice_activity);

    }
}
