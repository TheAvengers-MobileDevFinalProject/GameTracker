package edu.ualr.gametrackerproject.model;

public class Profile {

    public boolean hasProfile;
    public String mName;
    public String mEmailAddress;
    private String mPassword;

    public Profile() {

    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmEmailAddress() {
        return mEmailAddress;
    }

    public void setmEmailAddress(String mEmailAddress) {
        this.mEmailAddress = mEmailAddress;
    }

    public String getmPassword() {
        return mPassword;
    }

    public void setmPassword(String mPassword) {
        this.mPassword = mPassword;
    }

    public Boolean hasProfile(){return hasProfile; }

    public void setHasProfile(Boolean mProfile){ this.hasProfile = mProfile; }

}
