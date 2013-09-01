package com.javarush.test.level12.lesson12.home09;

/* –одитель класса CTO
ƒобавь такой класс-родитель к классу CTO(технический директор), чтобы класс перестал быть абстрактным.
ƒобавл€ть/реализовывать методы в классе CTO запрещаетс€.

@author Nikolaieva Natalia
*/

public class Solution
{

    public static void main(String[] args)
    {
        CTO cto = new CTO();
        System.out.println(cto);
    }

    public static interface Businessman
    {
        public void workHard();
    }

    public static class Worker{
        public void workHard(){
        }
    }

    public static class CTO extends Worker implements Businessman
    {

    }

}