package com.udacity.gradle.builditbigger.backend;

import lastchoice.ely.com.jokelibary.JokeLib;

/** The object model for the data we are sending through endpoints */
public class MyBean {

    private String myData;

    public String getData() {
        myData = new JokeLib().getJoke();
        return  myData;
    }

}