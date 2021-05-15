public class Main {
    public static void main(String[] args) {
        for(int i=1;i<11;i++)
        {
            Movie movie = randomMovie();
            System.out.println("Movie #" + i + " : "
             + movie.getName() + "\n"
            + "Plot: " + movie.plot() + "\n");
        }
    }
    public static Movie randomMovie()
    {
        int randomNumber = (int) (Math.random() * 5) + 1;       //random no from 1 to 5
        System.out.println("Random number generated was: " + randomNumber);
        switch (randomNumber)
        {
            case 1:
                return new Jaws();

            case 2:
                return new IndependenceDay();
            case 3:
                return new JabWeMet();
            case 4:
                return new StarWars();
            case 5:
                return new Forgetable();
        }
        return null;
    }
}
class Movie{
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot()
    {
        return "No Plot here";
    }

    public String getName() {
        return name;
    }
}

class Jaws extends Movie{
    public Jaws(){
        super("Jaws");
    }

    public String plot()
    {
        return "A shark eats lots of people";
    }
}

class IndependenceDay extends Movie{

    public IndependenceDay(){
        super("Independance Day");
    }

    @Override
    public String plot() {
        return "Aliens attempts to take over planet";
    }
}

class JabWeMet extends Movie{
    public JabWeMet()
    {
        super("Jab We Met");
    }

    @Override
    public String plot() {
        return "Love story of two different personalities";
    }
}

class StarWars extends Movie{
    public StarWars()
    {
        super("Star Wars");
    }

    @Override
    public String plot() {
        return "Imperial forces try to take over the universe";
    }
}

class Forgetable extends Movie{

    public Forgetable(){
        super("Forgetable");
    }

    //no plot method
}

