

public class JavaRush2_4
/* Man и woman
В методе main создай объект Man, занеси его ссылку в переменную man.
Создай также объект Woman и занеси его ссылку в переменную woman.
В man.wife занеси ссылку на новосозданный объект Woman.
В woman.husband занеси ссылку на новосозданный объект Man.
*/
{
    public static void main(String[] args)
    {
            //напишите тут ваш код
    		Man man = new Man();
    		Woman woman = new Woman();
    		man.wife = woman;
    		woman.husband = man;
    		//Person person = new Person();
    }

    public static class Man
    {
        public int age;
        public int height;
        public Woman wife;
    }

    public static class Woman
    {
        public int age;
        public int height;
        public Man husband;
    }
}
