package edu.ualr.gametrackerproject.model;

public class Game {
    
    private String mgameTitle;
    private String mprice;
    private String mplatform;

    public Game() {

    }

    public String getMgameTitle() {
        return mgameTitle;
    }

    public void setMgameTitle(String mgameTitle) {
        this.mgameTitle = mgameTitle;
    }

    public String getMprice() {
        return mprice;
    }

    public void setMprice(String mprice) {
        this.mprice = mprice;
    }

    public String getMplatform(){ return mplatform; }

    public void setMplatform(String mplatform){ this.mplatform = mplatform; }

}

