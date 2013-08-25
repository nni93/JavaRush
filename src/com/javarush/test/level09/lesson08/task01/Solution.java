package com.javarush.test.level09.lesson08.task01;

import java.io.FileNotFoundException;
import java.net.URISyntaxException;

/* ����������
���� �����, ������� ����������� ��� ���������� �������������� �� Exception � ��� �������������� �� RuntimeException:
NullPointerException, ArithmeticException, FileNotFoundException, URISyntaxException.

����� ����������� NullPointerException � FileNotFoundException, �� �� �������������
ArithmeticException � URISyntaxException. ��� ��� �������?

@author Nikolaieva Natalia
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        try {

        method1();

        } catch (NullPointerException e) {
            System.out.println(e.toString());
        }  catch (FileNotFoundException e) {
            System.out.println(e.toString());
        }

    }

    public static void method1() throws NullPointerException, ArithmeticException, FileNotFoundException, URISyntaxException
    {
        int i = (int) (Math.random() * 4);
        if (i == 0)
            throw new NullPointerException();
        if (i == 1)
            throw new ArithmeticException();
        if (i == 2)
            throw new FileNotFoundException();
        if (i == 3)
            throw new URISyntaxException("", "");
    }
}