package com.javarush.test.level09.lesson08.task04;

import java.io.IOException;
import java.rmi.RemoteException;

/* �������� checked ����������
� ������ processExceptions ����������� ��� checked ����������.
����� ������� �� ����� ������ ��������� checked ����������.
����� ������������ ������ ���� ���� try..

@author Nikolaieva Natalia
*/

public class Solution {
    public static void main(String[] args) {
        processExceptions(new Solution());

    }

    public static void processExceptions(Solution obj) {

        try {
        obj.method1();
        obj.method2();
        obj.method3();
        } catch (IOException e) {
            System.out.println(e.toString());
        } catch (NoSuchFieldException e) {
            System.out.println(e.toString());
        }
    }

    public void method1() throws IOException {
        throw new IOException();
    }

    public void method2() throws NoSuchFieldException {
        throw new NoSuchFieldException();
    }

    public void method3() throws RemoteException {
        throw new RemoteException();
    }
}