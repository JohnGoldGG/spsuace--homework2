package ru.spsuace.homework2.objects.simple;

/**
 * Опишите иммутабельное комплексное число, с геттерами и методами toString()
 * Так же дополните класс методами, чтобы эти объекты можно было использовать в HashMap
 * Плюс реализуйте любой метод (операцию) над комплексными числами (на ваш выбор)
 */
public class ComplexNumber {
    private double re; // real - re
    private double im; // imaginery - im

    public ComplexNumber(double re, double im){
        this.re = re;
        this.im = im;
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }

    public static ComplexNumber sum(ComplexNumber cn1, ComplexNumber cn2) {
        return new ComplexNumber(cn1.getRe() + cn2.getRe(), cn1.getIm() + cn2.getIm());
    }

    public ComplexNumber multiply(ComplexNumber cn1) {
        return new ComplexNumber(cn1.getRe() * getRe() - cn1.getIm() * getIm(), cn1.getRe() * getIm() + cn1.getIm() * getRe());
    }

    public String toString() {
        if (getIm() < 0) {
            return getRe() + " - i * " + getIm() * -1;
    } else {
            return getRe() + " + i * " + getIm();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ComplexNumber other = (ComplexNumber) obj;
        if (getIm() != other.getIm())
            return false;
        if (getRe() != other.getRe())
            return  false;
        return true;
    }

    //Проверки
    public static void main(String[] args) {
        ComplexNumber x = new ComplexNumber(2, 4);
        ComplexNumber y = new ComplexNumber(-2, -3);
        System.out.println("x = " + x + ", y = " + y);

        ComplexNumber a = new ComplexNumber(4, 3);
        System.out.println(a.toString());

        ComplexNumber c;
        c = x.multiply(y);
        System.out.println(c.toString());

        ComplexNumber z;
        z = ComplexNumber.sum(x, y);
        System.out.println("+ :" + z);

        ComplexNumber object1 = new ComplexNumber(3,4);
        ComplexNumber object2 = object1;
        System.out.println(object1.equals(object2));
    }

}