package com.javarush.test.level06.lesson08.task01;

/*  ласс Cat и статическа€ переменна€ catCount
—оздать статическую переменную int catCount в классе Cat. —оздай конструктор [public Cat()], в котором увеличивай данную переменную на 1.

@author Nikolaieva Natalia
*/

public class Cat
{
    static int catCount;
    public Cat() {
        catCount++;
    }
}
