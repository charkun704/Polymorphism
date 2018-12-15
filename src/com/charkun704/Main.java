package com.charkun704;

class Movie{
    private String movieName;

    public Movie(String movieName) {
        this.movieName = movieName;
    }
    public String plot(){
        return "No plot here.";
    }
}

class Jaws extends Movie{
    public Jaws(){
        super("Jaws");
    }
    public String plot(){
        return "Shark eats people.";
    }
}

public class Main {

    public static void main(String[] args) {
	// write your code here
    }


}
