package edu.ualr.gametrackerproject.model;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import edu.ualr.gametrackerproject.R;

public class ProfileFragment extends Fragment {

    TextView nameTextView;
    TextView emailTextView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_profile, container, false);

        //gets the text views
        nameTextView = view.findViewById(R.id.nameTextView);
        emailTextView = view.findViewById(R.id.emailTextView);

        // Get the arguments passed from ListHomeActivity
        Bundle bundle = getArguments();
        if (bundle != null) {
            String name = bundle.getString("name");
            String email = bundle.getString("email");

            // Set the text to the text views
            nameTextView.setText(name);
            emailTextView.setText(email);
        }

        return view;
    }
}