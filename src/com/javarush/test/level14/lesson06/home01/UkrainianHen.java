package com.javarush.test.level14.lesson06.home01;


class UkrainianHen extends Hen {
    @Override
    public int getCountOfEggsPerMonth()
    {
        return 20;
    }

    @Override
    String getDescription()
    {
        return super.getDescription() + " ��� ������ - " + Country.UKRAINE + ". � ���� " + getCountOfEggsPerMonth() + " ��� � �����.";
    }
}