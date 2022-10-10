import java.util.Comparator;

public class Exercise20_21 {
  public static void main(String[] args) {
    GeometricObject[] list = {new Circle(5), new Rectangle(4, 5),
        new Circle(5.5), new Rectangle(2.4, 5), new Circle(0.5), 
        new Rectangle(4, 65), new Circle(4.5), new Rectangle(4.4, 1),
        new Circle(6.5), new Rectangle(4, 5)};

    Circle[] list1 = {new Circle(2), new Circle(3), new Circle(2),
      new Circle(5), new Circle(6), new Circle(1), new Circle(2),
      new Circle(3), new Circle(14), new Circle(12)};
    selectionSort(list1, new GeometricObjectComparator());
    for (int i = 0; i < list1.length; i++)
      System.out.println(list1[i].getArea() + " ");
  }
  
  public static <E> void selectionSort(E[] list, Comparator<? super E> comparator) {
	  
	  E temp;
	  
	  boolean a = true;
	  
	  for (int count1 = 1; count1 < list.length && a; count1++) {
		  a = false;
		  for(int count2 = 0; count2 < list.length - count1; count2++) {
			  if (comparator.compare(list[count2], list[count2 + 1]) > 0) {
				  temp = list[count2];
				  list[count2] = list[count2 + 1];
				  list[count2 + 1] = temp;
				  a = true;
			  }
		  }
	  }
	  
	  
  }
  
}