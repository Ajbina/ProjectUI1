package com.example.asus.projectui1;

public class item {
    int background;
    String profileName;
    int profilePhoto;
    int abFollowers;

    public item() {
    }
    public item(int profilePhoto) {
        this.background = background;
        this.profileName = profileName;
        this.profilePhoto = profilePhoto;
        this.abFollowers = abFollowers;
    }

    public int getBackground() {
        return background;
    }

    public String getProfileName() {
        return profileName;
    }

    public int getProfilePhoto() {
        return profilePhoto;
    }

    public int getAbFollowers() {
        return abFollowers;
    }

    public void setBackground(int background) {
        this.background = background;
    }

    public void setProfileName(String profileName) {
        this.profileName = profileName;
    }

    public void setProfilePhoto(int profilePhoto) {
        this.profilePhoto = profilePhoto;
    }

    public void setAbFollowers(int abFollowers) {
        this.abFollowers = abFollowers;
    }
}
