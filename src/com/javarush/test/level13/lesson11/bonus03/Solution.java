package com.javarush.test.level13.lesson11.bonus03;

/* ����� �������
1. ����������� � ���, ��� ��� ��������.
2. http://ragecollection.com/img/ragefaces/rage-guy.png
3. ��������� �� ����� ������� � ���������� ����������� � ����.
4. ...
5. ������������, ��� �� ��� ������.

6. �������� ��� �������� ����� ����������� � �������� ����� ������:
6.1. ������� ����� AbstractRobot �����������, ������� ������ ����� � ������ �� Robot � AbstractRobot.
6.2. ��������������� ����� Robot �������� AbstractRobot.
6.3. ��������� ����� BodyPart ����� ������ ���� "�����".
6.4. �������� ����� ����� ���� � ���������� ����������� Attackable � Defensable (� ������ AbstractRobot).

7. http://ragecollection.com/img/ragefaces/fuck-yeah.png

@author Nikolaieva Natalia
*/

public class Solution
{
    public static void main(String[] args)
    {
        Robot amigo = new Robot("�����");
        Robot enemy = new Robot("����������-02");

        doMove(amigo, enemy);
        doMove(amigo, enemy);
        doMove(enemy, amigo);
        doMove(amigo, enemy);
        doMove(enemy, amigo);
        doMove(amigo, enemy);
        doMove(enemy, amigo);
        doMove(amigo, enemy);
    }

    public static void doMove(Robot robotFirst, Robot robotScond) {
        BodyPart attacked = robotFirst.attack();
        BodyPart defenced = robotFirst.defense();
        System.out.println(String.format("%s �������� ������ %s, ��������� %s, �������� %s",
                robotFirst.getName(), robotScond.getName(), attacked, defenced));
    }
}