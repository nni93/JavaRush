package com.javarush.test.level14.lesson08.home10;

import java.util.LinkedList;
import java.util.List;

/* ��������� 4 ������
��������� 4 ������ � ������������ NotIncapsulatedClass � ����������� ���
1. � ����� NotIncapsulatedClass ������� private ������ initList, printListValues, processCastedObjects.
2. ����� initList ������ ��������� ���������� �������� �������� list:
- ����� ������ ���� ���� � ������������, � ������� list ����������� ����������
- �������� ��� � ����� initList
- ����� ����������� list.
3. ����� printListValues ������ ��������� �������� list � ������� � ������� ��� �������� �� ������ list:
- ����� ������ �� ����������
- ����� ������ ���� ���� � ������������, � ������� � ����� �� ������ list ��������� � ������� ��� ��������
- �������� ��� � ����� printListValues
- ������� 2 ������ � ���� ������.
4. ����� processCastedObjects ������ ���������:
- �������� �������� ����� ��� Number
- ����� ������ �� ����������
- ����� ������ ���� ���� � ������������, � ������� � ����� ��� ������� ������� �� ������ list ����������� ��� ���
- �������� ���� ���� � ����� processCastedObjects
- ������� 2 ������ � ���� ������
- ����, ��� ��� ������� ���� Float ����� ������� "Is float value defined? " + [Float_object].isNaN()
- ����, ��� ��� ������� ���� Double ����� ������� "Is double value infinite? " + [Double_object].isInfinite().

@author Nikolaieva Natalia
*/

public class Solution
{
    public static void main(String[] args)
    {
        new NotIncapsulatedClass();
    }

    public static class NotIncapsulatedClass
    {
        List<Number> list;
        public NotIncapsulatedClass()
        {
            list = new LinkedList<Number>();
            initList(list);
            printListValues(list);
            processCastedObjects(12.3);
            
        }
        private List initList(List list) {

            list.add(new Double(1000f));
            list.add(new Double("123e-445632"));
            list.add(new Float(-90 / -3));
            list.remove(new Double("123e-445632"));

            return list;
        }

        private void printListValues(List list) {
            for (int i = 0; i < list.size(); i++)
            {
                System.out.println(list.get(i));
            }
        }

        private void processCastedObjects(Number number){
            for (Number object : list)
            {
                if (object instanceof Float)
                {
                    Float a = (Float) object;
                    System.out.println("Is float value defined? " + a.isNaN());
                } else if (object instanceof Double)
                {
                    Double a = (Double) object;
                    System.out.println("Is double value infinite? " + a.isInfinite());
                }
            }
        }
    }
}