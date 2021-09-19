package Ilua;

public class Computing {

    private final static double Pi = 3.14;//f добавлять надо в типе float тут не надо
    //и такие поля надо выносить из методов

    public static double volume (double diameter) {
        return 4*Pi*Math.pow(diameter/2,3)/3;//снова лишняя переменная
        //тут еще даже компилятор ругался что риск есть ,ты передавал int а если int делится не на целом то он хуево округляет
    }

}
