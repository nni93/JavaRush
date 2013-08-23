package com.javarush.test.level08.lesson08.task04;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* ������� ���� ����� ���������� �����
������� ������� (Map<String, Date>), � ������� � ���� ������ ������� �� ��������: ��������� - ����� ���������.
������� �� ������� ���� �����, ���������� �����.

@author Nikolaieva Natalia
*/

public class Solution
{

    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        for (int i = 0; i < 10; i++) {
            map.put("��������" + i, new Date("JUNE 1 1980"));
        }
        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        Date june = new Date();
        june.setMonth(5);
        Date july = new Date();
        july.setMonth(6);
        Date august = new Date();
        august.setMonth(7);
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()) {
            int month = iterator.next().getValue().getMonth();
            if (month == june.getMonth() || month == july.getMonth() || month == august.getMonth()){
                iterator.remove();
            }
        }
    }
}