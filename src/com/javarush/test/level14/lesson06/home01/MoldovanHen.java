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
        return super.getDescription() + " ћо€ страна - " + Country.MOLDOVA + ". я несу " + getCountOfEggsPerMonth() + " €иц в мес€ц.";
    }
}