package com.javarush.test.level14.lesson06.home01;

/* ������� �������
�������� �������(Factory) �� ������������ ���(Hen)
1. ������� ����� Hen
1.1. ������� ��� �����������
1.2. �������� � ����� ����������� �����  int getCountOfEggsPerMonth()
1.3. �������� � ����� ����� String getDescription(), ������� ���������� ������ "� ������."

2. ������� ����� RussianHen, ������� ����������� �� Hen
3. ������� ����� UkrainianHen, ������� ����������� �� Hen
4. ������� ����� MoldovanHen, ������� ����������� �� Hen
5. ������� ����� BelarusianHen, ������� ����������� �� Hen

6. � ������ �� ������� ��������� ������� �������� ���� ���������� ������ getCountOfEggsPerMonth.
������ ������ ���������� ���������� ��� � ����� �� ������� ���� �����.

7. � ������ �� ������� ��������� ������� �������� ���� ���������� ������ getDescription.
������ ������ ���������� ������ ����:
<getDescription() ������������� ������>  + <" ��� ������ - SSSSS. � ���� N ��� � �����.">
��� SSSSS - �������� ������
��� N - ���������� ��� � �����

8. � ������ HenFactory ����������� ������ getHen, ������� ���������� ��������������� ������ ������ ���
9. ��� ������ ������ ���� � ��������� ������

@author Nikolaieva Natalia
*/

public class Solution
{
    public static void main(String[] args)
    {
        Hen hen = HenFactory.getHen(Country.BELARUS);
        hen.getCountOfEggsPerMonth();
        System.out.println(hen.getDescription());
    }
    
    static class HenFactory implements Country{

        static Hen getHen(String country) {
            if (country.equals("Russia")) {
                return new RussianHen();
            } else if (country.equals("Ukraine")) {
                return new UkrainianHen();
            } else if (country.equals("Moldova")) {
                return new MoldovanHen();
            } else if (country.equals("Belarus")) {
                return new BelarusianHen();
            }  else
                return null;
        }
    }
}