package com.javarush.test.level13.lesson02.task01;

/* ����
1. �������, ����� �� ���� ����������� ����� ����������� � ������ Beer.
2. ������ � ������ Beer ���� ��������� � ���������� ��� ��������������� ������.
3. �������, ��� ������� ����������  READY_TO_GO_HOME � ����� isReadyToGoHome.
4. ����� �������� ���������� READY_TO_GO_HOME � ������ isReadyToGoHome.

@author Nikolaieva Natalia
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
    }

    public interface Drink
    {
        void askMore(String message);

        void sayThankYou();

        boolean isReadyToGoHome();
    }

    public interface Alcohol extends Drink
    {
        boolean READY_TO_GO_HOME = false;

        void sleepOnTheFloor();
    }

    public static class Beer implements Alcohol
    {
        @Override
        public void askMore(String message)
        {
        }

        @Override
        public void sayThankYou()
        {
        }

        @Override
        public boolean isReadyToGoHome()
        {
        return READY_TO_GO_HOME;
        }

        @Override
        public void sleepOnTheFloor()
        {
        }
    }
}