package com.javarush.test.level08.lesson11.home04;

import java.io.IOException;
import java.util.*;

/* Минимальное из N чисел
1. Ввести с клавиатуры число N.
2. Считать N целых чисел и заполнить ими список - метод getIntegerList.
3. Найти минимальное число среди элементов списка - метод getMinimum.

@author Nikolaieva Natalia
*/

public class Solution
{
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {
        int[] sort = new int[array.size()];
        for (int i = 0; i < array.size(); i++) {
            sort[i] = array.get(i);
        }
        Arrays.sort(sort);
        return sort[0];
    }

    public static List<Integer> getIntegerList() throws IOException {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> list = new LinkedList<Integer>();

        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }
        scanner.close();
        return list;
    }
}
