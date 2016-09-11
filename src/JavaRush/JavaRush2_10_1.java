

public class JavaRush2_10

/* Минимум трех чисел
Написать функцию, которая вычисляет минимум из трёх чисел.
Подсказка:
Нужно написать тело существующей функции min и исправить возвращаемое значение.
*/

{
    public static int min(int a, int b, int c)
    {
        //напишите тут ваш код
    	
    			//int m1;
    			//	int m2;
    			int m1;
    	      if (a < b & b < c)
    	          m1 = a;
    	      else
    	      if (b < a & b < c)
    	    	  m1 = b;
    	      else
    	           m1 = c;

    	      return m1;
    	   
    }

    public static void main(String[] args) throws Exception
    {
    	System.out.println( min(-10,-200,-50) );
        System.out.println( min(-1,-10,-3) );
        System.out.println( min(3,5,3) );
        System.out.println( min(10,5,10) );
    }

}
