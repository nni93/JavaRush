package com.javarush.test.level14.lesson08.home06;

/* MovieFactory
���������� ����������� �� ��������, ������ � �������:
1. �����������, ��� ��������� ����� ������.
2. ��� ������ ������ ���� ������ ������ Solution.
3. �������� ������ Cartoon, Triller.
4. �����������, ��� �� �������� ������ ������ SoapOpera �� ����� "soapOpera".
���������� ��������� ������� SoapOpera �������:
5. �������� � MovieFactory.getMovie ��������� ������� Cartoon ��� ����� "cartoon".
6. �������� � MovieFactory.getMovie ��������� ������� Triller ��� ����� "triller".

7. ������� � ������� ��������� ������ (�����).
7.1. ���� �������������, ��� ������ �������� ������ �� ����������� � ����� ��: "cartoon", "triller", "soapOpera".
8. ������� ���������� movie ������ Movie � ��� ������ ��������� ������(�����):
8.1. �������� ������ ��������� MovieFactory.getMovie � ��������� ��� ���������� movie.
8.2. ������� �� ����� movie.getClass().getSimpleName().

@author Nikolaieva Natalia
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Movie movie = null;
        while (true) {
            String key = reader.readLine();
            if (key.equals("cartoon")) {
                movie = new Cartoon();
            } else if (key.equals("triller")) {
                movie = new Triller();
            } else if (key.equals("soapOpera")) {
                movie = new SoapOpera();
            }  else if (!(key.equals("cartoon")) | !(key.equals("triller") | (key.equals("soapOpera")))) {
                break;
            }
            if (key.equals("cartoon")) {
                movie = MovieFactory.getMovie("cartoon");
                System.out.println(movie.getClass().getSimpleName());
            } else if (key.equals("triller")) {
            	movie = MovieFactory.getMovie("triller");
                System.out.println(movie.getClass().getSimpleName());
            } else if (key.equals("soapOpera")) {
            	movie = MovieFactory.getMovie("soapOpera");
                System.out.println(movie.getClass().getSimpleName());
            }
        }
        

    }

    static class MovieFactory
    {

        static Movie getMovie(String key)
        {
            Movie movie = null;

            //�������� ������� SoapOpera (������� �����) ��� ����� "soapOpera"
            if ("soapOpera".equals(key))
            {
                movie = new SoapOpera();
            } else if ("cartoon".equals(key)) {
                movie = new Cartoon();
            } else if ("triller".equals(key)) {
                movie = new Triller();
            }

            return movie;
        }
    }

    static abstract class Movie
    {
    }

    static class SoapOpera extends Movie
    {
    }

    static class Cartoon extends Movie{

    }

    static class Triller extends Movie{

    }
}