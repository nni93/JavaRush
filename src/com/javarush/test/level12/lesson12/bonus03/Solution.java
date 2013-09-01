package com.javarush.test.level12.lesson12.bonus03;

/* «адача по алгоритмам
Ќаписать метод, который возвращает минимальное число в массиве и его позицию (индекс).

@author Nikolaieva Natalia
*/


public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int[] data = new int[]{1, 2, 3, 5, -2, -8, 0, 77, 5, 5};

        Pair<Integer, Integer> result = getMinimumAndIndex(data);

        System.out.println("Minimum is " + result.x);
        System.out.println("Index of minimum element is " + result.y);
    }

    public static Pair<Integer, Integer> getMinimumAndIndex(int[] array)
    {
        if (array == null || array.length == 0)
        {
            return new Pair<Integer, Integer>(null, null);
        }
        
    	int currentValue = array[0];
    	int index = 0;
    	for (int j=1; j < array.length; j++) {
    	if (array[j] < currentValue)
    	currentValue = array[j];
    	for (int i = 0; i < array.length; i++) {
    		if (array[i] == currentValue) {
    			index = i;
    		}
    	}
    	}
		return new Pair<Integer, Integer>(currentValue, index);
    }

	public static class Pair<X, Y>
    {
        public X x;
        public Y y;

        public Pair(X x, Y y)
        {
            this.x = x;
            this.y = y;
        }
    }
}