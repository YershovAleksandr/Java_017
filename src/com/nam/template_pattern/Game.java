package com.nam.template_pattern;

public abstract class Game {
    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();

    //template method
    public final void play(){

        //initialize game
        initialize();

        //start game
        startPlay();

        //end game
        endPlay();
    }
}
