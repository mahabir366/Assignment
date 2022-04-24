import java.util.Arrays;
import java.util.List;

public class ArrayOdd_Even {

	public static void main(String[] args) {
		Integer[] Num = {11,12,5,4,7,25,20};
		
		List<Integer> list = Arrays.asList(Num);
		
		System.out.println("This is Odd Number :");
		list.stream().filter(n -> n%2==1).forEach(System.out::println);
		System.out.println("This is Even Number :");
		list.stream().filter(n -> n%2==0).forEach(System.out::println);
	}
}
