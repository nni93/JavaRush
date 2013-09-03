package com.javarush.test.level13.lesson11.home08;

/* ��������� Updatable � ������ Screen
����������� ��������� Updatable � ������ Screen.

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

    interface Updatable extends Selectable
    {
        void refresh();
    }

    abstract class Screen implements Updatable
    {

    }
}