package com.javarush.test.level10.lesson11.home06;

/* ������������ ������ Human
������ ����� Human � 6 ������. �������� � �������� 10 ��������� ������������� ��� ����. ������ ����������� ������ ����� �����.

@author Nikolaieva Natalia
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Human
    {
        String firstname;
        String lastname;
        int age;
        int weight;
        double height;
        boolean sex;
    public Human(String firstname) {
        this.firstname = firstname;
    }
    public Human(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }
    public Human(String firstname, String lastname, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }
    public Human(String firstname, int age) {
        this.firstname = firstname;
        this.age = age;
    }
    public Human(String firstname, int weight, double height) {
        this.firstname = firstname;
        this.weight = weight;
        this.height = height;
    }
    public Human(String firstname, double height) {
        this.firstname = firstname;
        this.height = height;
    }
    public Human(String firstname, String lastname, boolean sex) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.sex = sex;
    }
    public Human(String firstname, boolean sex) {
        this.firstname = firstname;
        this.sex = sex;
    }
    public Human(String firstname, int age, boolean sex) {
        this.firstname = firstname;
        this.age = age;
        this.sex = sex;
    }
    public Human(String firstname, String lastname, double height, boolean sex) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.height = height;
        this.sex = sex;
    }
    }
}