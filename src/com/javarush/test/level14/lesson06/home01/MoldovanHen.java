package com.javarush.test.level14.lesson06.home01;


class MoldovanHen extends Hen {
    @Override
    public int getCountOfEggsPerMonth()
    {
        return 30;
    }

    @Override
    String getDescription()
    {
        return super.getDescription() + " ��� ������ - " + Country.MOLDOVA + ". � ���� " + getCountOfEggsPerMonth() + " ��� � �����.";
    }
}