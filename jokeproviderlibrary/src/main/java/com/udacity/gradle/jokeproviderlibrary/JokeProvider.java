package com.udacity.gradle.jokeproviderlibrary;

import java.util.Random;

public class JokeProvider {

    private String[] jokeArray;
    private Random random;

    // Joke sources: https://www.facebook.com/HilariousAndroidJokes/
    //               http://www.helloandroid.com/content/android-jokes
    public JokeProvider() {
        jokeArray = new String[5];
        jokeArray[0] = "A pregnant fragment walks into a bar. The bartender says, " +
                "\"Whoa! Whoa! We don't support nested fragments here!\"";
        jokeArray[1] = "An Android app walks into a bar. Bartender asks, " +
                "\"Can I get you a drink?\" The app looks disappointed and says, " +
                "\"That wasn't my intent.\"";
        jokeArray[2] = "Question: Definition of an upgrade?\n" +
                "Answer: Take old bugs out, put new ones in.";
        jokeArray[3] = "Chuck Norris runs Android on his iPhone.";
        jokeArray[4] = "- Do you want to hear a dirty joke?\n" +
                "- Ok\n" +
                "- A white HTC Hero fell in the mud.";
        random = new Random();
    }

    public String[] getJokes() {
        return jokeArray;
    }

    public String getMixedJoke() {
        return jokeArray[random.nextInt(jokeArray.length)];
    }
}
