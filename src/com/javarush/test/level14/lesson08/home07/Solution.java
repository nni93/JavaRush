package com.javarush.test.level14.lesson08.home07;

import java.util.ArrayList;
import java.util.List;

/* ����������� �����
����������� �����
1. ����������� ����� cleanAllApartaments.
��� ������� ������� �� apartaments:
2. ��� ������������� ������� (Apt1Room) ������� ����� clean1Room.
�.�. ���� ������ ���� Apt1Room, �� ������� � ���� ����� clean1Romm.
3. ��� ������������� ������� (Apt2Room) ������� ����� clean2Rooms
�.�. ���� ������ ���� Apt2Room, �� ������� � ���� ����� clean2Rooms.
4. ��� ������������� ������� (Apt3Room) ������� ����� clean3Rooms
�.�. ���� ������ ���� Apt3Room, �� ������� � ���� ����� clean3Rooms.

@author Nikolaieva Natalia
*/

public class Solution
{
    public static void main(String[] args)
    {
        List<Apartament> apartaments = new ArrayList<Apartament>();
        apartaments.add(new Apt1Room());
        apartaments.add(new Apt2Room());
        apartaments.add(new Apt3Room());

        cleanAllApartaments(apartaments);
    }

    public static void cleanAllApartaments(List<Apartament> apartaments)
    {
        for (int i = 0; i < apartaments.size(); i++) {
        if (apartaments.get(i) instanceof Apt1Room) {
            ((Apt1Room) apartaments.get(i)).clean1Room();
        } else if (apartaments.get(i) instanceof Apt2Room) {
            ((Apt2Room) apartaments.get(i)).clean2Rooms();
        } else if (apartaments.get(i) instanceof Apt3Room) {
            ((Apt3Room) apartaments.get(i)).clean3Rooms();
        }
        }
    }

    static interface Apartament
    {
    }

    static class Apt1Room implements Apartament
    {
        void clean1Room()
        {
            System.out.println("1 room is cleaned");
        }
    }

    static class Apt2Room implements Apartament
    {
        void clean2Rooms()
        {
            System.out.println("2 rooms are cleaned");
        }
    }

    static class Apt3Room implements Apartament
    {
        void clean3Rooms()
        {
            System.out.println("3 rooms are cleaned");
        }
    }
}