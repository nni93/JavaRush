package com.javarush.test.level12.lesson12.home06;

/* Fly, Run, Climb ��� ������� Cat, Dog, Tiger, Duck
1. ������ ������ Solution ������ ��������� public interface Fly(������) � ������� void fly().
2. ������ ������ Solution ������ ��������� public interface Climb(������ �� ��������) � ������� void climb().
3. ������ ������ Solution ������ ��������� public interface Run(������) � ������� void run().
4. ������� ���������, ����� ������ ���������� ����� �������� ��� ������� ������.
5. ������ ���������� ������� Cat(���), Dog(������), Tiger(����), Duck(����).

@author Nikolaieva Natalia
*/

public class Solution {

    public abstract class Cat implements Run, Climb {
    }

    public abstract class Dog implements Run{
    }

    public abstract class Tiger extends Cat implements Climb {
    }

    public abstract class Duck implements Fly, Run {
    }

    public interface Fly {
        void fly();
    }

    public interface Climb {
        void climb();
    }

    public interface Run {
        void run();
    }
}