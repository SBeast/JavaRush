package JavaRush;

public class JavaRush2_13

/* У каждого животного должна быть хозяйка.
Создайте объект типа Cat(кот), объект типа Dog (собака), объект типа Fish (рыбка) 
и объект типа Woman.
Присвойте каждому животному владельца (owner).
*/

{
	  public static void main(String[] args)
	  {
	    Student olga = new Student();
	    olga.name = "Olga";
	    olga.age = 21;

	    Student vera = new Student();
	    vera.name = "Veronika";
	    vera.age = 15;

	    System.out.println("Olga is " + olga.age);
	    System.out.println("Vera is " + vera.age);

	    ageSwap(olga, vera);

	    System.out.println("Olga is " + olga.age);
	    System.out.println("Vera is " + vera.age);
	  }

	  private static void ageSwap(Student a,
	                                    Student b)
	  {
	    int c = a.age;
	    a.age = b.age;
	    b.age = c;
	  }

	  static class Student
	  {
	    String name;
	    int age;
	  }
	}