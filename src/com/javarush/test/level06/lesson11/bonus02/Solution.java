package com.javarush.test.level06.lesson11.bonus02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Нужно добавить в программу новую функциональность
Задача: У каждой кошки есть имя и кошка-мама. Создать класс, который бы описывал данную ситуацию. Создать два объекта: кошку-дочь и кошку-маму. Вывести их на экран.
Новая задача: У каждой кошки есть имя, кошка-папа и кошка-мама. Изменить класс Cat так, чтобы он мог описать данную ситуацию.
Создать 6 объектов: маму, папу, сына, дочь, бабушку(мамина мама) и дедушку(папин папа).
Вывести их всех на экран в порядке: дедушка, бабушка, папа, мама, сын, дочь.

Пример ввода:
дедушка Вася
бабушка Мурка
папа Котофей
мама Василиса
сын Мурчик
дочь Пушинка

Пример вывода:
Cat name is дедушка Вася, no mother, no father
Cat name is бабушка Мурка, no mother, no father
Cat name is папа Котофей, no mother, father is дедушка Вася
Cat name is мама Василиса, mother is бабушка Мурка, no father
Cat name is сын Мурчик, mother is мама Василиса, father is папа Котофей
Cat name is дочь Пушинка, mother is мама Василиса, father is папа Котофей

@author Nikolaieva Natalia
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
    	
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        String grandfatherName = reader.readLine();
        Cat catGrandfather = new Cat(grandfatherName);
        
        String grandmotherName = reader.readLine();
        Cat catGrandmother = new Cat(grandmotherName);
        
        String fatherName = reader.readLine();
        Cat catFather = new Cat(fatherName, null, catGrandfather);
        
        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName, catGrandmother, null);
        
        String sonName = reader.readLine();
        Cat catSon = new Cat(sonName, catMother, catFather);
        
        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catMother, catFather);

        System.out.println(catGrandfather);
        System.out.println(catGrandmother);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDaughter);
    }
    
    public static class Cat
    {
        private String name;
        private Cat motherParent;
        private Cat fatherParent;

        Cat(String name)
        {
            this.name = name;
        }

        Cat(String name, Cat catMother, Cat catFather)
        {
            this.name = name;
            this.motherParent = catMother;
            this.fatherParent = catFather;  
        }

        @Override
        public String toString()
        {
            if ((motherParent != null) & (fatherParent == null)) {
                return "Cat name is " + name + ", mother is " + motherParent.name + ", no father";
            }  else if ((motherParent == null) & (fatherParent != null)) {
                return "Cat name is " + name + ", no mother" +", father is " + fatherParent.name;
            } else if ((motherParent != null) & (fatherParent != null)) {
                return "Cat name is " + name + ", mother is " + motherParent.name  + ", father is " + fatherParent.name;
            } else {
                return "Cat name is " + name + ", no mother" + ", no father";
            }
        }
    }     
 } 
