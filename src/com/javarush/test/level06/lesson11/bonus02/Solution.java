package com.javarush.test.level06.lesson11.bonus02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* ����� �������� � ��������� ����� ����������������
������: � ������ ����� ���� ��� � �����-����. ������� �����, ������� �� �������� ������ ��������. ������� ��� �������: �����-���� � �����-����. ������� �� �� �����.
����� ������: � ������ ����� ���� ���, �����-���� � �����-����. �������� ����� Cat ���, ����� �� ��� ������� ������ ��������.
������� 6 ��������: ����, ����, ����, ����, �������(������ ����) � �������(����� ����).
������� �� ���� �� ����� � �������: �������, �������, ����, ����, ���, ����.

������ �����:
������� ����
������� �����
���� �������
���� ��������
��� ������
���� �������

������ ������:
Cat name is ������� ����, no mother, no father
Cat name is ������� �����, no mother, no father
Cat name is ���� �������, no mother, father is ������� ����
Cat name is ���� ��������, mother is ������� �����, no father
Cat name is ��� ������, mother is ���� ��������, father is ���� �������
Cat name is ���� �������, mother is ���� ��������, father is ���� �������

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
