package com.javarush.test.level14.lesson08.home03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* User, Looser, Coder and Proger
1. ������ [� �����] � ���������� ��������� ����� (������).
������(�����) ����� ���� ������: "user", "looser", "coder", "proger".
���� �������, ����� ������ �� ��������� �� � ����� �� ���� ���������.

2. ��� ������ ��������� ������ �����:
2.1. ������� ��������������� ������ [�� Person.java], ��������, ��� ������ "user" ����� ������� ������ ������ User.
2.2. �������� ���� ������ � ����� doWork.

3. �������� ���������� ������ doWork, �������:
3.1. �������� ����� live() � ����������� ������, ���� ���� ������ (person) ����� ��� User.
3.2. �������� ����� doNothing(), ���� person ����� ��� Looser.
3.3. �������� ����� coding(), ���� person ����� ��� Coder.
3.4. �������� ����� enjoy(), ���� person ����� ��� Proger.

@author Nikolaieva Natalia
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;

        while (true) {
        	String key = reader.readLine();
        	if (key.equals("user")) {
        		person = new Person.User();
        	} else if (key.equals("looser")) {
        		person = new Person.Looser();
        	} else if (key.equals("coder")) {
        		person = new Person.Coder();
        	} else if (key.equals("proger")) {
        		person = new Person.Proger();
        	} else if (!(key.equals("user")) | !(key.equals("looser")) | !(key.equals("coder")) | !(key.equals("proger"))) { 
        		break;
        	}
    		doWork(person); //�������� doWork
         } 
        }

    public static void doWork(Person person)
    {
        if (person instanceof Person.User) {
           ((Person.User) person).live();
        } else if (person instanceof Person.Looser) {
            ((Person.Looser) person).doNothing();
        } else if (person instanceof Person.Coder) {
            ((Person.Coder) person).coding();
        } else if (person instanceof Person.Proger) {
            ((Person.Proger) person).enjoy();
        }
    }
}