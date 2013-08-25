package com.javarush.test.level09.lesson11.home06;

import java.util.ArrayList;

/* ������ �������� �������
1. ���� ���� �������: ������� �������, �������, �������, ��������, ����.
2. � ������� ������ ���� 2 ����: ���� (killed ArrayList) � ���� (ate ArrayList).
3. ����������� ������� ������� (hood, grandmother, ...).
4. �������� ��������� �����, ��� ���� ���� � ����, ����� ���������� ������ ������ �������� �������.

@author Nikolaieva Natalia
*/

public class Solution {
    public static LittleRedRidingHood hood = new LittleRedRidingHood();
    public static Grandmother grandmother = new Grandmother();
    public static Patty patty = new Patty();
    public static Woodman woodman = new Woodman();
    public static Wolf wolf = new Wolf();

    public static void main(String[] args) {

        patty.killed.add(null);
        patty.ate.add(null);

        hood.killed.add(null);
        hood.ate.add(null);

        grandmother.killed.add(null);
        grandmother.ate.add(patty);

        wolf.ate.add(grandmother);
        wolf.ate.add(hood);

        woodman.killed.add(wolf);
        woodman.ate.add(null);

    }

    //������� �������
    public static class LittleRedRidingHood extends StoryItem {
    }

    //�������
    public static class Grandmother extends StoryItem {
    }

    //�������
    public static class Patty extends StoryItem {
    }

    //��������
    public static class Woodman extends StoryItem {
    }

    //����
    public static class Wolf extends StoryItem {
    }

    public static abstract class StoryItem {
        public ArrayList<StoryItem> killed = new ArrayList<StoryItem>();
        public ArrayList<StoryItem> ate = new ArrayList<StoryItem>();
    }
}