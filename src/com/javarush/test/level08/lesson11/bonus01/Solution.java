package com.javarush.test.level08.lesson11.bonus01;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* Номер месяца
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: «May is 5 month».

@author Nikolaieva Natalia
*/

public class Solution
{
    public static void main(String[] args) throws IOException, Exception
    {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        scanner.close();

        Date date = new SimpleDateFormat("MMM", Locale.ENGLISH).parse(month);
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        int monthNumber = cal.get(Calendar.MONTH) + 1;

        System.out.println(month + " is " + monthNumber  + " month");
    }

}
