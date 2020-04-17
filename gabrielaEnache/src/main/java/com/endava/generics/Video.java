package com.endava.generics;

public class Video extends Media {
    private float duration;

    public Video(String title, String author, float price, float duration) {
        super(title, author, price);
        if (duration > 0) {
            this.duration = duration;
        } else {
            System.out.println("Invalid duration value!");
        }
    }

    public float getDuration() {
        return duration;
    }

    public void setDuration(float duration) {
        if (duration > 0) {
            this.duration = duration;
        } else {
            System.out.println("Invalid duration value!");
        }
    }

    @Override
    public String toString() {
        return "\nVideo: " + super.toString() + ", duration: " + duration;
    }

}
