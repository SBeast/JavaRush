

public class JavaRush2_5

/* Прибавка к зарплате
Реализуй метод public static void salary(int a).
Метод должен увеличить переданное число на 100 и вывести на экран надпись: «Твоя зарплата составляет: a долларов в месяц.»
Где a - это число, которое увеличили на 100.
Пример вывода на экран для а = 700:
Твоя зарплата составляет: 800 долларов в месяц.
*/


{
    public static void main(String[] args)
    {
        salary(700);
        //int b;
    }

    public static void salary(int a)
    {
        //напишите тут ваш код
    	System.out.print("Твоя зарплата составляет: ");
    	System.out.print( a + 100);
    	System.out.print(" долларов в месяц.");
    	
    }
}
