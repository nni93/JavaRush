package com.javarush.test.level07.lesson12.home06;

/* �����
������ ����� Human � ������ ���(String), ���(boolean),�������(int), ����(Human), ����(Human). ������ ������� � ������� �� ���, ����� ����������: ��� �������, ��� �������, ����, ����, ���� �����. ������� ������� �� �����.
����������:
���� �������� ���� ����� String toString() � ������ Human, �� ������ �� ����� �������������� ��� ������ ������� �� �����.
������ ������:
���: ���, ���: �������, �������: 21, ����: �����, ����: ����
���: ����, ���: �������, �������: 55
���: �����, ���: �������, �������: 2, ����: ������, ����: ���
�

@author Nikolaieva Natalia
*/

public class Solution
{
    public static void main(String[] args)
    {
        Human grandfather1 = new Human("grandfather1 name", true, 70, null, null);
        Human grandfather2 = new Human("grandfather2 name", true, 75, null, null);
        Human grandmother1 = new Human("grandmother1 name", false, 70, null, null);
        Human grandmother2 = new Human("grandmother2 name", false, 75, null, null);
        Human father = new Human("father name", true, 50, grandfather1, grandmother1);
        Human mother = new Human("mother name", false, 40, grandfather2, grandmother2);
        Human child1 = new Human("child1 name", true, 15, father, mother);
        Human child2 = new Human("child2 name", true, 20, father, mother);
        Human child3 = new Human("child3 name", true, 20, father, mother);


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
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age, Human father, Human mother){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString()
        {
            String text = "";
            text += "���: " + this.name;
            text += ", ���: " + (this.sex ? "�������" : "�������");
            text += ", �������: " + this.age;

            if (this.father != null)
                text += ", ����: " + this.father.name;

            if (this.mother != null)
                text += ", ����: " + this.mother.name;

            return text;
        }
    }

}
