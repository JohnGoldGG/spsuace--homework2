package ru.spsuace.homework2.objects.simple;

/**
 * Опишите иммутабельное комплексное число, с геттерами и методами toString()
 * Так же дополните класс методами, чтобы эти объекты можно было использовать в HashMap
 * Плюс реализуйте любой метод (операцию) над комплексными числами (на ваш выбор)
 */
public class ComplexNumber {
    public static int x;
    public static int y;
    public int i;

    public ComplexNumber(int x, int y){
        this.x = x;
        this.y = y;
    }
    // Сумма комплексных чисел
    public int sum(ComplexNumber complexNumber) {
        return (x + ComplexNumber.x) + (y + ComplexNumber.y)*i;
    }
    //Вывод числа
    public void text(String number) {
        String phrase = number;
    }

}