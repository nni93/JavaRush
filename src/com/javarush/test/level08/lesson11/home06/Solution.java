package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.

@author Nikolaieva Natalia
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        Human child1 = new Human("Child1 name", true, 15, null);
        Human child2 = new Human("Child2 name", true, 20, null);
        Human child3 = new Human("Child3 name", true, 25, null);
        ArrayList<Human> children = new ArrayList<Human>();
        children.add(child1);
        children.add(child2);
        children.add(child3);

        Human father = new Human("Father name", true, 50, children);
        Human mother =  new Human("Mother name", false, 45, children);
        ArrayList<Human> grandparent1Children = new ArrayList<Human>();
        grandparent1Children.add(father);
        ArrayList<Human> grandparent2Children = new ArrayList<Human>();
        grandparent2Children.add(mother);

        Human grandfather1 = new Human("Grandfather1 name", true, 70, grandparent1Children);
        Human grandfather2 = new Human("Grandfather2 name", true, 70, grandparent2Children);

        Human grandmother1 = new Human("Grandmother1 name", false, 65, grandparent1Children);
        Human grandmother2 = new Human("Grandmother2 name", false, 65, grandparent2Children);

        System.out.println(grandfather1.toString());
        System.out.println(grandfather2.toString());
        System.out.println(grandmother1.toString());
        System.out.println(grandmother2.toString());
        System.out.println(father.toString());
        System.out.println(mother.toString());
        System.out.println(child1.toString());
        System.out.println(child2.toString());
        System.out.println(child3.toString());
    }

    public static class Human
    {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<Human>();

        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;
            if (children != null) {
            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }
            }
            return text;
        }
    }
}
