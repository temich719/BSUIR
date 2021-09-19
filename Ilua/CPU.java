package Ilua;

//переписал фул метод тк изза изменений в других местах он уже не годится
public class CPU {
    //объвили их(в этой конкретной проге можно их сделать константами)
    private final static Earth earth;
    private final static Sun sun;

    //тут можно чето делать в таких скобках ,все что внутри них сделается еще до захода в main
    static {
        earth = new Earth();
        sun = new Sun();
    }

    public static void execute(){
        Comparator.comparison(earth, sun);
    }

}
