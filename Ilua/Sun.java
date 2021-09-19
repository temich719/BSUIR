package Ilua;

//тоже самое что в классе Earth
public class Sun {

    private final static double diameter= 865000.0;

    private double computeSun(){
        return Computing.volume(diameter);
    }

    public double getSun(){
        Console.print("Sun volume - " + computeSun());
        return computeSun();
    }

}
