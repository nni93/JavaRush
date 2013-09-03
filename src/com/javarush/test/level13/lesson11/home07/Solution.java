package com.javarush.test.level13.lesson11.home07;

/* ��������� SimpleObject
1. ������ ����� StringObject.
2. � ������ StringObject �������� ��������� SimpleObject � ���������� ���� String.
3. ��������� ������ ���������������.

@author Nikolaieva Natalia
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
       SimpleObject<String> stringObject = new StringObject();

    }

    interface SimpleObject<T>
    {
        SimpleObject<T> getInstance();
    }

    static class StringObject implements SimpleObject<String> {
    	
        @Override
        public SimpleObject<String> getInstance()
        {
            return null;
        }
    }
}