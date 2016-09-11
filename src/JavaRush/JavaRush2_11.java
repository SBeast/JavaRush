

public class JavaRush2_11

/* Минимум четырех чисел
Написать функцию, которая вычисляет минимум из четырёх чисел.
Функция min(a,b,c,d) должна использовать (вызывать) функцию min(a,b)
Подсказка:
Нужно написать тело обеих существующих функций min и исправить их возвращаемые значения.
*/

{
    public static int min(int a, int b, int c, int d)
    {
        //напишите тут ваш код
    		int m3 = min( a, b);
    		int m1;
    		if (m3 < c & m3 < d)
	          m1 = m3;
    		else
    		if (c < m3 & c < d)
	    	  m1 = c;
    		else
	           m1 = d;

	      return m1;

    }

    public static int min(int a, int b)
    {
        //напишите тут ваш код
    		int m2;
    		if (a < b)
	           m2 = a;
    		else
	           m2 = b;

	      return m2;

    }

    public static void main(String[] args) throws Exception
    {
        System.out.println( min(-20, -10) );
        System.out.println( min(-20, -10, -30, -40) );
        System.out.println( min(-20, -10, -30, 40) );
        //System.out.println( min(-20, -30, 40) );
    }
}