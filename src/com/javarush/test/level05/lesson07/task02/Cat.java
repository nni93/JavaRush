package com.javarush.test.level05.lesson07.task02;

/* ������� ����� Cat
������� ����� Cat (���) � ����� ����������������:
- ���,
- ���, ���, �������
- ���, ������� (��� �����������)
- ���, ����, (���, ����� � ������� ����������, ��� ��������� ���)
- ���, ����, ����� ( ����� �������� ���)
������ �������������� � ������� ������ ��������. ��������, ���� ��� ����������, �� ����� ������� �����-������ ������� ���. ��� �� ����� ������ �� ������. �� �� ���������� ��������. � ��� ����� ����� � �� ���� (null). �� �� �������� ������: null.

@author Nikolaieva Natalia
*/

public class Cat
{
	Integer standardWeight = 3;
	Integer standardAge = 2;
	String name;
	String address;
	String color;
	int weight;
	int age;
	
    public void initialize(String name) {
    	this.name = name;
    }
    public void initialize(String name, int weight, int age) {
    	this.name = name;
    	this.weight = weight;
    	this.age = age;
    }
    public void initialize(String name, int age, Integer weight) {
    	this.name = name;
    	this.age = age;
    	standardWeight = weight;
    }
    public void initialize(int weight, String color, String name, String address, int age) {
    	this.weight = weight;
    	this.color = color;
    	standardAge = age;
    }
    public void initialize(int weight, String color, String address) {
    	this.weight = weight;
    	this.color = color;
    	address = "Some address";
    }
}