package �om.javarush.test.level08.lesson11.home02;

import java.util.HashSet;
import java.util.Set;

/* ��������� ���� ��������
1. ������ ������ Solution ������� public static ������ Cat, Dog.
2. ����������� ����� createCats, �������� ������ ���������� ��������� � 4 ������.
3. ����������� ����� createDogs, �������� ������ ���������� ��������� � 3 ��������.
4. ����������� ����� join, �������� ������ ���������� ������������ ��������� ���� �������� - ���� ����� � �����.
5. ����������� ����� removeCats, �������� ������ ������� �� ��������� pets ���� �����, ������� ���� � ��������� cats.
6. ����������� ����� printPets, �������� ������ �������� �� ����� ���� ��������, ������� � ��� ����. ������ �������� � ����� ������

@author Nikolaieva Natalia
*/

public class Solution
{

    public static void main(String[] args)
    {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);
        
        System.out.println();

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats()
    {
        HashSet<Cat> result = new HashSet<Cat>();

            result.add(Cat.cat1);
            result.add(Cat.cat2);
            result.add(Cat.cat3);
            result.add(Cat.cat4);

        return result;
    }

    public static Set<Dog> createDogs()
    {
        HashSet<Dog> result = new HashSet<Dog>();

            result.add(Dog.dog1);
            result.add(Dog.dog2);
            result.add(Dog.dog3);
            
            
        return result;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs)
    {
        Set<Object> joinSet = new HashSet<Object>();
        joinSet.addAll(cats);
        joinSet.addAll(dogs);

        return joinSet;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats)
    {
    	pets.removeAll(cats);
    }

    public static void printPets(Set<Object> pets)
    {
        for (Object o : pets) {
            System.out.println(o);
        }
    }

    public static class Cat {

        static Cat cat1 = new Cat();
        static Cat cat2 = new Cat();
        static Cat cat3 = new Cat();
        static Cat cat4 = new Cat();

    }

    public static class Dog {

        static Dog dog1 = new Dog();
        static Dog dog2 = new Dog();
        static Dog dog3 = new Dog();

    }
}