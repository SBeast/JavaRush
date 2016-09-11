

public class JavaRush2_9

/* Минимум двух чисел
Написать функцию, которая возвращает минимум из двух чисел.
Подсказка:
Нужно написать тело существующей функции min и исправить возвращаемое значение.
*/

{
    public static int max(int a, int b)
    {
        //напишите тут ваш код
    	
    	      int m2;
    	      if (a > b)
    	           m2 = a;
    	      else
    	           m2 = b;

    	      return m2;
    	   
    }

    public static void main(String[] args) throws Exception
    {
    	System.out.println( max(10,20) );
        System.out.println( max(-10,-20) );
        System.out.println( max(-100,0) );
    }

}
