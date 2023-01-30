package com.example.tiktok;

public class Model {
    String videoUrl;
    int profile;
    String name;
    public Model(String videoUrl, int profile, String name) {
        this.videoUrl = videoUrl;
        this.profile = profile;
        this.name = name;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public int getProfile() {
        return profile;
    }

    public String getName() {
        return name;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public void setProfile(int profile) {
        this.profile = profile;
    }

    public void setName(String name) {
        this.name = name;
    }
}

