package com.javarush.test.level14.lesson08.home02;

/* ���������� ���
1. ������� ����������� ����� Drink � ������������� ������� public void taste(), ������� ������� � ������� "������"
2. ������� ����� Wine, ������� ����������� �� Drink, � ������������� ������� public String getHolidayName(), ������� ���������� ������ "���� ��������"
3. ������� ����� BubblyWine, ������� ����������� �� Wine, � ������������� ������� public String getHolidayName(), ������� ���������� ������ "����� ���"
4. �������� ���������� ������� getDeliciousDrink, getWine, getBubblyWine
5. ������ ����� � ��������� ������ ���� � ��������� ������
6. ����� main ������ ������!

@author Nikolaieva Natalia
*/

public class Solution {
    public static void main(String[] args) {
        getDeliciousDrink().taste();
        System.out.println(getWine().getHolidayName());
        System.out.println(getBubblyWine().getHolidayName());
        System.out.println(getWine().getHolidayName());
    }

    public static Drink getDeliciousDrink() {
      return new Drink()
      {
          @Override
          public void taste()
          {
              super.taste();
          }
      };
    }

    public static Wine getWine() {
        return new Wine();
    }

    public static Wine getBubblyWine() {
        return new BubblyWine();
    }
}