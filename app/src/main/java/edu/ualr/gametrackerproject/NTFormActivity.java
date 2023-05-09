package edu.ualr.gametrackerproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class NTFormActivity extends AppCompatActivity {
    public EditText mgameTitle;
    public EditText mprice;
    public Button addNTgame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nintendo_form_activity);

        mgameTitle = findViewById(R.id.editNTGameName);
        mprice = findViewById(R.id.editNTPrice);
        addNTgame = findViewById(R.id.addNBtn);

        addNTgame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onAddClick();
            }
        });
    }

    public void onAddClick() {
        String gameTitle = mgameTitle.getText().toString();
        String price = mprice.getText().toString();

        Intent intent = new Intent(NTFormActivity.this, ListEntryActivity.class);
        intent.putExtra("nt_title", gameTitle);
        intent.putExtra("nt_price", price);
        startActivity(intent);
    }

}


