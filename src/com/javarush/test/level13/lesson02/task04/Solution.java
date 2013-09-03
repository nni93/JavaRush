package com.javarush.test.level13.lesson02.task04;

/* Selectable � Updatable
1. ������ ����� Screen.
2. �������� � ��� ���������� Selectable � ������� onSelect, Updatable � ������� refresh.

@author Nikolaieva Natalia
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
    }

    interface Selectable
    {
        void onSelect();
    }

    interface Updatable
    {
        void refresh();
    }

    class Screen implements Selectable, Updatable {

        @Override
        public void onSelect()
        {
        }

        @Override
        public void refresh()
        {
        }
    }
}