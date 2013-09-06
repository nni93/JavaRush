package com.javarush.test.level14.lesson08.home01;

/* �����
1. ������� ��������� Bridge � ������� int getCarsCount().
2. ������� ������ WaterBridge � SuspensionBridge, ������� ��������� ��������� Bridge.
3. ����� getCarsCount() ������ ���������� ����� �������� ���� int.
4. ����� getCarsCount ������ ���������� ��������� �������� ��� ��������� �������.
5. � ������ Solution ������� ��������� ����� println(Bridge bridge).
6. � ������ println ������� �� ������� �������� getCarsCount() ��� ������� bridge.
7. ������ ����� � ��������� ������ ���� � ��������� ������.

@author Nikolaieva Natalia
*/

public class Solution
{
    public static void main(String[] args)
    {
        println(new WaterBridge());
        println(new SuspensionBridge());
    }

    public static void println(Bridge bridge) {

        System.out.println(bridge.getCarsCount());
    }

}