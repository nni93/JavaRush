package com.javarush.test.level14.lesson08.home05;

/* Computer
1. ������ ��������� CompItem.
2. ������ � ���� ����� String getName().
3. ������ ������ Keyboard, Mouse, Monitor, ������� ��������� ��������� CompItem.
4. ����� getName() ������ ���������� ��� ������, ��������, ��� ������ Keyboard ����� "Keyboard".
5. ������ ����� Computer.
6. � ����� Computer ������ ��������� ���� ���� Keyboard.
7. � ����� Computer ������ ��������� ���� ���� Mouse.
8. � ����� Computer ������ ��������� ���� ���� Monitor.
9. ������ ����������� � ������ Computer ��������� ���������� ������ Alt+Insert ������ ������ (������� Constructor).
10 ������ ������������ ��������������� ��� ��� ���� (����������) ������
11. ������ ������� ��� ����� ������ Computer (� ������ ��������� ���������� ������ Alt+Insert � ������ ������� Getter).
12. ��� ��������� ������ � ��������� ������ ���� � ��������� ������.

@author Nikolaieva Natalia
*/

public class Solution
{

    public static void main(String[] args)
    {
        Computer computer = new Computer();
        if (isWork(computer.getKeyboard()) &&
                isWork(computer.getMonitor()) &&
                isWork(computer.getMouse()))
        {
            System.out.println("Work!");
        }
    }

    public static boolean isWork(CompItem item)
    {
        System.out.println(item.getName());
        return item.getName() != null && item.getName().length() > 4;
    }
}