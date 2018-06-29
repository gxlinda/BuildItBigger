package com.udacity.gradle.builditbigger.backend;

import com.udacity.gradle.jokeproviderlibrary.JokeProvider;

/** The object model for the data we are sending through endpoints */
public class MyBean {

    private JokeProvider jokeProvider;

    public MyBean() {
        jokeProvider = new JokeProvider();
    }

    public String getGreatJoke() {
        return jokeProvider.getMixedJoke();
    }
}