package com.company;

public class Main {

    public static void main(String[] args) {
	// Задача 6
        System.out.println("Задача 6");
        int a=12;
        int b=27;
        int c=44;
        int d=15;
        int e=9;
        int result=a*(b+(c-d*e));
        int result2=-result;
        System.out.println("Исходный результат: "+result+" Инвертированный результат: "+result2);
        System.out.println();//Пустая строка перед следующей задачей

        //Задача 7
        System.out.println("Задача 7");
        int a1=5;
        int b1=7;
        System.out.println("Начальное значение a: "+a1+" Начальное значение b: "+b1);
        a1=a1*b1;
        b1=a1/b1;
        a1=a1/b1;
        System.out.println("Итоговое значение a: "+a1+" Итоговое значение b: "+b1);
        System.out.println();//Пустая строка перед следующей задачей

        //Задача 8
        System.out.println("Задача 8");
        int a2=854;
        System.out.println("a= "+a2);
        int b2=a2%100;
        b2=b2/10;
        System.out.println("b= "+b2);
    }
}
