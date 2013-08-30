package com.javarush.test.level10.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* «адача по алгоритмам
«адача: ввести с клавиатуры 30 чисел. ¬ывести 10-е и 11-е минимальные числа.
ѕо€снение:
—амое минимальное число Ц 1-е минимальное.
—ледующее минимальное после него Ц 2-е минимальное
ѕример:
1 6 5  7  1  15   63   88
ѕервое минимальное Ц 1
¬торое минимальное Ц 1
“ретье минимальное Ц 5
„етвертое минимальное Ц 6

@author Nikolaieva Natalia
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[30];
        for (int i = 0; i < 30; i++)
        {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        System.out.println(array[9]);
        System.out.println(array[10]);
    }

    public static void sort(int[] array)
    {
        Arrays.sort(array);
    }
}