package com.javarush.test.level14.lesson08.home09;

import java.util.ArrayList;
import java.util.List;

/* ������
1. �������� ����� getAmount � ������ Money:
1.1. �������, ������ ���� ����� ������� ��������� ����������, ���� ����� getAmount ����� �� ����������.
1.2. ������ ��������� ���������� ����� ���� � ����� �� � ������ getAmount.
1.3. � ������������ ������� �� ��������, ���������� ����������.
2. � ��������� ����� ������ ����� Hrivna.
3. �������� ����� Hrivna �� ������ Money.
4. � ������ Hrivna �������� ����� getCurrencyName, ������� ���������� "HRN".
5. � ��������� ����� ������ ����� USD.
6. �������� ����� USD �� ������ Money.
7. � ������ USD �������� ����� getCurrencyName, ������� ���������� "USD".
8. �������, ������� ����� ������� ����� �������� � ������(����) allMoney.
9. ������ � ����������� ������ Person ���������� ����� allMoney ��������� ���� ��������� �������.

@author Nikolaieva Natalia
*/

public class Solution
{
    public static void main(String[] args)
    {
        Person ivan = new Person("����");
        for (Money money : ivan.getAllMoney())
        {
            System.out.println(ivan.name + " ����� ������� � ������� " + money.getAmount() + " " + money.getCurrencyName());
        }
    }

    static class Person
    {
        public String name;

        Person(String name)
        {
            this.name = name;
            this.allMoney = new ArrayList<Money>();
            allMoney.add(new USD(10.2));
            allMoney.add(new Hrivna(20.3));
        }

        private List<Money> allMoney;

        public List<Money> getAllMoney()
        {
            return allMoney;
        }
    }
}