package com.company;
class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }
    public String plot()
    {
        return "No plot";
    }

    public String getName() {
        return name;
    }
}


class ShutterIsland extends Movie{
    public ShutterIsland()
    {
        super("Shutter Island");
    }
    @Override
    public String plot()
    {
        return "A detective goes on to find a serial killer only to find out that he was a psychotic widower who was having delusions in an asylum";
    }
}
class Inception extends Movie{
    public Inception()
    {
        super("Inception");
    }

    @Override
    public String plot() {
        return "A scientist gets into someone's dream with a team to change his thoughts";
    }
}
class Departed extends Movie{
   public Departed()
   {
       super("The Departed");
   }
   @Override
   public String plot()
   {
       return "A gangster becomes an undercover cop and a cop becomes an undercover gangster";
   }
}
class WolfOfTheWallStreet extends Movie{
    public WolfOfTheWallStreet()
    {
        super("The Wolf of Wall Street");
    }
    @Override
    public String plot()
    {
        return "A stock broker turns multi-billionaire by cheating his way to the top";
    }
}
class SOTY extends Movie{
    public SOTY()
    {
        super("Student Of The Year");
    }
    //no plot
}
public class Main {

    public static void main(String[] args) {
        for(int i=0;i<=11;i++)
        {
            Movie movie=randomMovie();
            System.out.println("Movie# " + i + ":" + movie.getName() + "\n" + "Plot: " + movie.plot()); //polymorphism (Here we provide different functionality to the plot method for different classes)
        }
    }
    public static Movie randomMovie()
    {
        int randomNumber=(int)(Math.random()*5)+1; //Random is a function of Math class which return a random number from 0 to the number multiplied to it while calling the function. 1 is added to select a random number from 1 to 5. Casting used to convert random number to integer.
        System.out.println("Random number is: " + randomNumber);
        switch(randomNumber)
        {
            case 1:
                return new ShutterIsland();
            case 2:
                return new Inception();
            case 3:
                return new Departed();
            case 4:
                return new WolfOfTheWallStreet();
            case 5:
                return new SOTY();
            default:
                return null;
        }

    }
}
