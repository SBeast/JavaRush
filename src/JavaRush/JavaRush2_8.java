package JavaRush;

public class JavaRush2_8

/* Три собаки - это сила
Создать 3 объекта типа Dog (собака) и присвоить им имена "Max", "Bella", "Jack".
*/

{
    public static void main(String[] args)
    {
        Dog dog1 = new Dog();
        dog1.name = "Max";
        Dog dog2 = new Dog();
        dog2.name = "Bella";
        Dog dog3 = new Dog();
        dog3.name = "Jack";
        //System.out.println(dog1.name);
        //System.out.println(dog2.name);
        //System.out.println(dog3.name);

        //напишите тут ваш код
    }

    public static class Dog
    {
        public String name;
    }
}