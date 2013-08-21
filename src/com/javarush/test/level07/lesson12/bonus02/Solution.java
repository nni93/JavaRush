package com.javarush.test.level07.lesson12.bonus02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Нужно добавить в программу новую функциональность
Задача:  Программа вводит строки, пока пользователь не введёт пустую строку (нажав enter). Потом она конвертирует строки в верхний регистр (Мама превращается в МАМА) и выводит их на экран.
Новая задача: Программа вводит строки, пока пользователь не введёт пустую строку (нажав enter). Потом программа строит новый список. Если в строке чётное число букв, строка удваивается, если нечётное – утраивается.
Пример ввода:
Кот
Коты
Я
Пример вывода:
Кот Кот Кот
Коты Коты
Я Я Я

@author Nikolaieva Natalia
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
        while (true)
        {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }
        
        ArrayList<String> stringArrayList = new ArrayList<String>();
        for (int i = 0; i < list.size(); i++) {
            if ((list.get(i).length())%2 == 0) {
            	stringArrayList.add(list.get(i));
            	stringArrayList.add(list.get(i));
            }  else if ((list.get(i).length())%2 != 0) {
            	stringArrayList.add(list.get(i));
            	stringArrayList.add(list.get(i));
            	stringArrayList.add(list.get(i));
            }
        }

        ArrayList<String> listUpperCase = new ArrayList<String>();
        for (int i = 0; i < stringArrayList.size(); i++)
        {
            String s = stringArrayList.get(i);
            listUpperCase.add(s.toUpperCase());
        }

        for (int i = 0; i < listUpperCase.size(); i++)
        {
            System.out.println(listUpperCase.get(i));
        }
    }
}
