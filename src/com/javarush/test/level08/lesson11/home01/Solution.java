package com.javarush.test.level08.lesson11.home01;

import java.util.HashSet;
import java.util.Set;

/* Set из котов
1. Внутри класса Solution создать public static класс кот – Cat.
2. Реализовать метод createCats, он должен создавать множество (Set) котов и добавлять в него 3 кота.
3. В методе main удалите одного кота из Set cats.
4. Реализовать метод printCats, он должен вывести на экран всех котов, которые остались во множестве. Каждый кот с новой строки.

@author Nikolaieva Natalia
*/

public class Solution
{

    public static void main(String[] args)
    {
        Set<Cat> cats = createCats();

        cats.remove(Cat.cat1);

        printCats(cats);
    }

    public static Set<Cat> createCats()
    {
        Set<Cat> set = new HashSet<Cat>();
            set.add(Cat.cat1);
            set.add(Cat.cat2);
            set.add(Cat.cat3);

        return set;
    }

    public static void printCats(Set<Cat> cats)
    {
        System.out.println(cats);
    }

    public static class Cat {

        static Cat cat1 = new Cat();
        static Cat cat2 = new Cat();
        static Cat cat3 = new Cat();
    }
}