package com.javarush.test.level14.lesson04.task03;

/* Food
1. ����������� ��������� Selectable � ������ Food.
2. ����� onSelect() ������ ������ � ������� "food is selected".
3. �������, ����� ������ ����� ������� ��� ���������� food � ����� ��� selectable.
4. � ������ foodMethods ������ ������ onSelect, eat, ���� ��� ��������.
5. � ������ selectableMethods ������ ������ onSelect, eat, ���� ��� ��������.

@author Nikolaieva Natalia
*/

public class Solution
{
    public static void main(String[] args)
    {
        Food food = new Food();
        Selectable selectable = new Food();
        Food newFood = (Food) selectable;

        foodMethods(food);
        selectableMethods(selectable);
    }

    public static void foodMethods(Food food)
    {
        food.onSelect();
        food.eat();
    }

    public static void selectableMethods(Selectable selectable)
    {
        selectable.onSelect();
    }

    interface Selectable
    {
        void onSelect();
    }

    static class Food implements Selectable
    {
        @Override
        public void onSelect()
        {
            System.out.println("food is selected");
        }

        public void eat()
        {
            System.out.println("food is eaten");
        }
    }
}