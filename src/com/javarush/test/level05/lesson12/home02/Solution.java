package com.javarush.test.level05.lesson12.home02;

/* Man and Woman
1. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля: name(String), age(int), address(String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате [name + " " + age + " " + address].

@author Nikolaieva Natalia
*/

public class Solution {

    public static void main(String[] args)
    {
        Man man1 = new Man("Man name ", 20, " Some address");
        Man man2 = new Man("Man name ", 20, " Some address");

        Woman woman1 = new Woman("Woman name ", 20, " Some address");
        Woman woman2 = new Woman("Woman name ", 20, " Some address");

        System.out.println(man1.getName() + " " + man1.getAge() + " " + man1.getAddress());
        System.out.println(man2.getName() + " " + man2.getAge() + " " + man2.getAddress());

        System.out.println(woman1.getName() + " " + woman1.getAge() + " " + woman1.getAddress());
        System.out.println(woman1.getName() + " " + woman1.getAge() + " " + woman1.getAddress());
    }

    public static class Man {
            private String name, address;
			private int age;
			public Man(String name, int age, String address) {
            	 this.name = name;
            	 this.age = age;
            	 this.address = address;
             }
             public String getName() {
                 return name;
             }
             public int getAge() {
                 return age;
             }
             public String getAddress() {
                 return address;
             }
    }

    public static class Woman {
        private String name, address;
		private int age;
		public Woman(String name, int age, String address) {
        	this.name = name;
        	this.age = age;
        	this.address = address;
        }
        public String getName() {
            return name;
        }
        public int getAge() {
            return age;
        }
        public String getAddress() {
            return address;
        }
    }
}
