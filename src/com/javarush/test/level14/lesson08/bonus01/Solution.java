package com.javarush.test.level14.lesson08.bonus01;

import java.util.ArrayList;
import java.util.List;

/* Нашествие эксепшенов
Заполни массив exceptions 10 различными эксепшенами.
Первое исключение уже реализовано в методе initExceptions.

@author Nikolaieva Natalia
*/

public class Solution
{
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args)
    {
        initExceptions();

        for (Exception exception : exceptions)
        {
            System.out.println(exception);
        }
    }

    private static void initExceptions()
    {   //it's first exception
        try
        {
            float i = 1 / 0;

        } catch (ArithmeticException e) {
            exceptions.add(e);
        } try {
            throw new NullPointerException();
        } catch (NullPointerException e) {
            exceptions.add(e);
        } try {
            throw new ArrayIndexOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            exceptions.add(e);
        } try {
            throw new IndexOutOfBoundsException();
        } catch (IndexOutOfBoundsException e) {
            exceptions.add(e);
        } try {
             throw new NegativeArraySizeException();
        } catch (NegativeArraySizeException e) {
            exceptions.add(e);
        } try {
            throw new UnsupportedOperationException();
        } catch (UnsupportedOperationException e) {
            exceptions.add(e);
        } try {
            throw new ArrayStoreException();
        } catch (ArrayStoreException e) {
            exceptions.add(e);
        } try {
            throw new IllegalStateException();
        } catch (IllegalStateException e) {
            exceptions.add(e);
        } try {
            throw new ClassCastException();
        } catch (ClassCastException e) {
            exceptions.add(e);
        } try {
            throw new Exception();
        } catch (Exception e) {
    exceptions.add(e);

    }
    }
}