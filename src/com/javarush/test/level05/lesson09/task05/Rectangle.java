package com.javarush.test.level05.lesson09.task05;

/* ������� ����� ������������� (Rectangle)
������� ����� ������������� (Rectangle). ��� ������� ����� top, left, width, height (����� ����������, �������, ������ � ������). ������� ��� ���� ��� ����� ������ �������������:
�������:
-	������ 4 ���������: left, top, width, height
-	������/������ �� ������ (��� ����� 0)
-	������ �� ������ (����� ������) ������ �������
-	������ ����� ������� �������������� (�� � ��������� � ����������)

@author Nikolaieva Natalia
*/

public class Rectangle
{
    int left, top, width, height;

    public Rectangle(int left, int top, int width, int height) {
        this.left = left;
        this.top = top;
        this.width = 0;
        this.height = 0;
    }
    public Rectangle(int left, int top) {
        this.left = left;
        this.top = top;
    }
    public Rectangle(int left, int top, int width) {
        this.left = left;
        this.top = top;
        this.width = width;
    }
    public Rectangle(Rectangle rectangle) {
    }
}