package com.javarush.test.level13.lesson11.home05;

/* Neo
1. ����������� ��������� DBObject � ������ User.
2. ����������� ����� initializeIdAndName ���, ����� ��������� �������� � �������� �� ����� "User has name Neo, id = 1".
3. ����� toString � ����� main ������ ������.
4. �������, ��� ������ ���������� ����� initializeIdAndName � ������ User.

@author Nikolaieva Natalia
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        System.out.println(Matrix.NEO);
    }


    static class Matrix
    {
       public static DBObject NEO = new User().initializeIdAndName(1, "Neo");
    }

    interface DBObject
    {
        DBObject initializeIdAndName(long id, String name);
    }

    static class User implements DBObject
    {
        @Override
        public DBObject initializeIdAndName(long id, String name)
        {
        	this.id = id;
        	this.name = name;
            User user = new User();
            user.id = id;
            user.name = name;
            user.toString();
            return user;
        }

		long id;
        String name;

        @Override
        public String toString()
        {
            return String.format("User has name %s, id = %d", name, id);
        }
    }
}