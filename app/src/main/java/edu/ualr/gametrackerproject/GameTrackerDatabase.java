package edu.ualr.gametrackerproject;

import android.app.Application;

import java.util.ArrayList;

import edu.ualr.gametrackerproject.model.Game;

public class GameTrackerDatabase extends Application {

    private ArrayList<Game> mGamesList;

    @Override
    public void onCreate() {
        super.onCreate();
        mGamesList = new ArrayList<>();
    }

    public ArrayList<Game> getGamesList() {
        return mGamesList;
    }

    public void setGamesList(ArrayList<Game> gamesList) {
        mGamesList = gamesList;
    }
}

