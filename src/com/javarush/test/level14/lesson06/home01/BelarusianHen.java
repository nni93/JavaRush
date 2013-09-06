package com.javarush.test.level14.lesson06.home01;


class BelarusianHen extends Hen {
    @Override
    public int getCountOfEggsPerMonth()
    {
        return 40;
    }

    @Override
    String getDescription()
    {
        return super.getDescription() + " ћо€ страна - " + Country.BELARUS + ". я несу " + getCountOfEggsPerMonth() + " €иц в мес€ц.";
    }
}