import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HighestNumInArray {
public static void main(String[] args) {
	Integer a[]= {1,77,89,56,43,23};
	Integer b[]= {9887,34,33,34,445};
	System.out.println("Larget of a is"+getLargest(a,6));
	System.out.println("Larget of b is"+getLargest(b,5));
}

public static int getLargest(Integer[] a, int i) {
	
	List<Integer> ls=Arrays.asList(a);
	Collections.sort(ls);
	System.out.println(ls);
	System.out.println("___________");
	System.out.println(ls.size());
	System.out.println("___________");
	int secondLagest=ls.get(i-1);
	return secondLagest;
	
}
}
