package edu.ualr.gametrackerproject;

import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

public class ListEntryActivity extends AppCompatActivity {

    private String platform;
    public TextView game;
    public TextView price;

    // Constructor
    public ListEntryActivity(String platform) {
        this.platform = platform;
    }

}
