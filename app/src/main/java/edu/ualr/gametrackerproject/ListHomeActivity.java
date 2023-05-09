package edu.ualr.gametrackerproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import edu.ualr.gametrackerproject.model.ProfileFragment;


public class ListHomeActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    public FloatingActionButton newGame;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_activity);
        setContentView(R.layout.toolbar);
        Toolbar toolbar = findViewById(R.id.listToolBar);
        setSupportActionBar(toolbar);

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

    FloatingActionButton fab = findViewById(R.id.fab);
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
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_TEXT, "data to send");

            // start the other application
            startActivity(Intent.createChooser(intent, "Send data using:"));
        }
    });



}
