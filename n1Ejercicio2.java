import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class n1Ejercicio2 {

	public static void main(String[] args) {
		/*Create and populate a List<Integer>.
		Create a second List<Integer> and insert the elements of
		the first list into the second list in reverse order.
		Use ListIterator objects to read the elements of the first list
		and insert them into the second.*/
		        List<Integer> listFirst = new ArrayList<>();
		        for(int i = 0; i <= 10; i++){
		            listFirst.add(i);
		        }
		        for (int numbers : listFirst)
		        System.out.print(numbers + " ");

		        List<Integer> listSecond = new ArrayList<>();
		        listSecond = new ArrayList<>(listFirst);
		        Collections.reverse(listSecond);
		        System.out.println();
		        System.out.println(listSecond + " ");

		        listFirst.addAll(listSecond);
		        System.out.println(listFirst);
		        System.out.println();
		        System.out.println("Using ListIterator: ");
		        ListIterator<Integer> iterate = listFirst.listIterator();
		        while(iterate.hasNext()) {
		            System.out.print(iterate.next() + " ");
		        }
		        
		        System.out.println("Using ListIterator in reverse orden: ");
		        while (iterate.hasPrevious()) {
		        	System.out.println(iterate.previous() + " ");
		        }

		       // ListIterator<>;
	}

}
