package CollectionFramework;
import java.util.*;
public class Collection {
public static void main(String[] args) {
	ArrayList<Integer> a = new ArrayList<>();
	ArrayList<Integer> b = new ArrayList<>(Arrays.asList(new Integer[a.size()]));
	a.add(11); 
	a.add(13);
	a.add(14);
	a.add(10);
	a.add(12);
	
	Collections.copy(b,a);
//	Collections.binarySearch(b, 12);
	///Collections.shuffle(a);
	//Collections.reverse(a);
	
	//Collections.sort(a);
	System.out.println(a);
	System.out.println(b);
	
	
	
	
}
}
