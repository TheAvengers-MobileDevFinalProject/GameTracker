package edu.ualr.gametrackerproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class XBFormActivity extends AppCompatActivity {

    public EditText mgameTitle;
    public EditText mprice;
    public Button addXBgame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.xbox_form_activity);

        mgameTitle = findViewById(R.id.editXBGameName);
        mprice = findViewById(R.id.editXBPrice);
        addXBgame = findViewById(R.id.addXBtn);

        addXBgame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onAddClick();
            }
        });
    }

    public void onAddClick() {
        String gameTitle = mgameTitle.getText().toString();
        String price = mprice.getText().toString();

        Intent intent = new Intent(XBFormActivity.this, ListEntryActivity.class);
        intent.putExtra("xb_title", gameTitle);
        intent.putExtra("xb_price", price);
        startActivity(intent);
    }

}
