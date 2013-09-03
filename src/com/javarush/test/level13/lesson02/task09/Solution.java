package com.javarush.test.level13.lesson02.task09;

/* ������������ ����������
1. ������� ��������� Movable � ������� speed.
2. ����� speed ���������� �������� ���� Double � �� ��������� ����������.
3. ������� � ������������ ��������� Runable �� ���������� Movable.
4. �������� � ��������� Runable ����� speed.
5. ����� speed ���������� �������� ���� Double � ��������� ���� �������� ���� Runable.

@author Nikolaieva Natalia
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
    }

    interface Movable{
        Double speed();
    }

    interface Runable extends Movable{

        Double speed(Runable runable);

    }

}