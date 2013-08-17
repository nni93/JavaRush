package com.javarush.test.level05.lesson09.task02;

/* ������� ����� Cat
������� ����� Cat (���) � ����� ��������������:
- ���,
- ���, ���, �������
- ���, ������� (��� �����������)
- ���, ����, (���, ����� � ������� � �����������. ��� - ���������)
- ���, ����, ����� ( ����� �������� ���)
������ �������������� � ������� ������ ��������. ��������, ���� ��� �� ��������, �� ����� ������� �����-������ ������� ���. ��� �� ����� ������ �� ������. �� �� ���������� ��������. � ��� ����� ����� � �� ���� (null). �� �� �������� ������: null.

@author Nikolaieva Natalia
*/

public class Cat
{
    String name, color, address;
    int weight, age;
    Integer standardWeight = 2;

    public Cat(String name) {
        this.name = name;
    }
    public Cat(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
    }
    public Cat(String name, int age, Integer weight) {
        this.standardWeight = weight;
    }
     public Cat(String name, int weight, int age, String color, String address) {
         this.weight = weight;
         this.color = color;
     }
    public Cat(int weight, String color, String address) {
        this.weight = weight;
        this.color = color;
        address = "Some address";
    }
}
