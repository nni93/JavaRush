package com.javarush.test.level14.lesson06.home01;

class RussianHen extends Hen {
    @Override
    public int getCountOfEggsPerMonth()
    {
        return 10;
    }

    @Override
    String getDescription()
    {
        return super.getDescription() + " ћо€ страна - " + Country.RUSSIA + ". я несу " + getCountOfEggsPerMonth() + " €иц в мес€ц.";
    }
}