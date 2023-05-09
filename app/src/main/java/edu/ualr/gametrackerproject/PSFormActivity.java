package edu.ualr.gametrackerproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class PSFormActivity extends AppCompatActivity {

    public EditText mgameTitle;
    public EditText mprice;
    public Button addPSgame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.playstation_form_activity);

        mgameTitle = findViewById(R.id.editPSGameName);
        mprice = findViewById(R.id.editPSPrice);
        addPSgame = findViewById(R.id.addPSBtn);

        addPSgame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onAddClick();
            }
        });
    }

    public void onAddClick() {
        String gameTitle = mgameTitle.getText().toString();
        String price = mprice.getText().toString();
        String platform = "Playstation";

        Intent intent = new Intent(PSFormActivity.this, ListEntryActivity.class);
        intent.putExtra("ps_title", gameTitle);
        intent.putExtra("ps_price", price);
        intent.putExtra("ps_platform", platform);
        startActivity(intent);
    }

}
