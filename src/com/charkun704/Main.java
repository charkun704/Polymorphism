package com.charkun704;

class Movie{
    private String name;

    public Movie(String movieName) {
        this.name = movieName;
    }
    public String plot(){
        return "No plot here.";
    }
    public String getName(){
        return name;
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

class Shrek extends Movie{
    public Shrek(){
        super("Shrek");
    }
    @Override
    public String plot(){
        return "Best movie, ever.";
    }
}

class Deadpool extends Movie{
    public Deadpool(){
        super("Deadpool");
    }
    @Override
    public String plot(){
        return "Wall breaking story.";
    }
}

class StarWars extends Movie {
    public StarWars() {
        super("Star Wars");
    }

    @Override
    public String plot() {
        return "Imperial Forces try to take over the universe";
    }
}

class Forgetable extends Movie {
    public Forgetable() {
        super("Forgetable");
    }

    // No plot method
}


public class Main {
    public static void main(String[] args) {
        for(int i=1; i<11; i++) {
            Movie movie = randomMovie();
            System.out.println("Movie #" + i +
                    " : " + movie.getName() + "\n" +
                    "Plot: " + movie.plot() + "\n");
        }
    }

    public static Movie randomMovie() {
        int randomNumber = (int) (Math.random() * 5) +1;
        System.out.println("Random number generated was: " + randomNumber);
        switch (randomNumber) {
            case 1:
                return new Jaws();
            case 2:
                return new Shrek();
            case 3:
                return new Deadpool();
            case 4:
                return new StarWars();
            case 5:
                return new Forgetable();
        }

        return null;
    }
}
