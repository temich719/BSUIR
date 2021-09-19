package Ilua;

public class Earth {

    private final static double diameter = 7600.0;// последовательность слов должна быть такая private final static double name если эти все
    //слова есть , у тебя было final private а это говно (final static обеспечивают тебе что поле будет константой)

    public Earth(){}//это конструктор, то есть функция вызывающаяся когда ты пишешь new Earth ,туда можно написать что то что ты хочешь
    //чтоб объект делал при создании

    //тут была переменная result_earth она не нужна, в этом случае лучше сделать так как я написал, тк здесь нет необходимости
    //обращаться к этой переменной и она никак не описывает этот класс

    private double computeEarth(){//нельзя делать метод с таким же названием как класс ,тк такое же название метода для конструктора забито
        return Computing.volume(diameter);
    }//метод должен выполнять одну задачу поэтому получение результата в отдельный метод вынес

    public double getEarth(){
        Console.print("Earth Volume - " + computeEarth());
        return computeEarth();
    }
}
