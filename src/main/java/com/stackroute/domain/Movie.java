package com.stackroute.domain;

public class Movie {
    private Actor actorFirst;
    private Actor actorSecond;
    private Actor actorThird;

    public Movie(Actor actorFirst, Actor actorSecond, Actor actorThird) {
        this.actorFirst = actorFirst;
        this.actorSecond = actorSecond;
        this.actorThird = actorThird;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "actorFirst=" + actorFirst +
                ", actorSecond=" + actorSecond +
                ", actorThird=" + actorThird +
                '}';
    }
}
