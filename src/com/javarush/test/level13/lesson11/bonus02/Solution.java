package com.javarush.test.level13.lesson11.bonus02;

import java.util.ArrayList;
import java.util.List;

/* �����
������ �����:
1. ����������� ��������� RepkaItem � ������ Person.
2. � ������ Person ����������� ����� pull(Person person), ������� ������� ����� ���� '<name> �� <person>'. ������:
����� �� �����
����� �� �����
3. ��������� ���������� ������ ����� � ������ tell ������ RepkaStory.
4. ��������� ����� main � ������������ �������!
*/

public class Solution
{
    public static void main(String[] args)
    {
        List<Person> plot = new ArrayList<Person>();
        plot.add(new Person("�����", "�����"));
        plot.add(new Person("�����", "�����"));
        plot.add(new Person("�����", "�����"));
        plot.add(new Person("������", "������"));
        RepkaStory.tell(plot);
    }

}