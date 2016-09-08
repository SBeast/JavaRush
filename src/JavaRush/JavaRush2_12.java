package JavaRush;

public class JavaRush2_12

/* У каждого животного должна быть хозяйка.
Создайте объект типа Cat(кот), объект типа Dog (собака), объект типа Fish (рыбка) 
и объект типа Woman.
Присвойте каждому животному владельца (owner).
*/

{
    public static void main(String[] args)
    {
        //напишите тут ваш код
    	Cat cat = new Cat();
    	Dog dog = new Dog();
    	Fish fish = new Fish();
    	Woman woman = new Woman();
    	cat.owner = woman;
    	dog.owner = woman;
    	fish.owner = woman;
    	//System.out.println(cat.owner);
    	//System.out.println(dog.owner);
    	//System.out.println(fish.owner);
    }

    public static class Cat
    {
        public Woman owner;
    }

    public static class Dog
    {
        public Woman owner;
    }

    public static class Fish
    {
        public Woman owner;
    }

    public static class Woman
    {
    }
}