package com.javarush.test.level08.lesson08.task02;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* ������� ��� ����� ������ 10
������� ��������� �����(Set<Integer>), ������� ���� 20 ��������� �����.
������� �� ��������� ��� ����� ������ 10.
*/

public class Solution
{
	public static void main(String[] args) {
		createSet();
		removeAllNumbersMoreThen10(set);
		System.out.println(set);
	}
    static HashSet<Integer> set = new HashSet<Integer>();

    public static HashSet<Integer> createSet()
    {
        for (int i = 0; i < 20; i++) {
            set.add(i);
        }
        return set;
    }

    public static HashSet<Integer> removeAllNumbersMoreThen10(HashSet<Integer> set)
    {
          Iterator<Integer> iterator = set.iterator();
          while(iterator.hasNext()) {
        	  if (iterator.next() > 10) {
        		  iterator.remove();
        	  }
          }
        return set;
    }
}