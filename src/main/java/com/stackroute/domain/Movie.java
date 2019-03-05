package com.stackroute.domain;

public class Movie {
    private Actor actorFirst;
    private Actor actorSecond;
    private Actor actorThird;

    public Movie()
    {

    }
    public Movie(Actor actorFirst, Actor actorSecond, Actor actorThird) {
        this.actorFirst = actorFirst;
        this.actorSecond = actorSecond;
        this.actorThird = actorThird;
    }

    public Actor getActorFirst() {
        return actorFirst;
    }

    public void setActorFirst(Actor actorFirst) {
        this.actorFirst = actorFirst;
    }

    public Actor getActorSecond() {
        return actorSecond;
    }

    public void setActorSecond(Actor actorSecond) {
        this.actorSecond = actorSecond;
    }

    public Actor getActorThird() {
        return actorThird;
    }

    public void setActorThird(Actor actorThird) {
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
