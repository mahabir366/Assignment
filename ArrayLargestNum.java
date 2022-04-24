import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayLargestNum {

	public static void main(String[] args) {
		
		Integer[] Number = {12,45,50,23,16};
		List<Integer> list = Arrays.asList(Number);
		int largestNumber = list.stream().sorted(Collections.reverseOrder()).distinct().limit(2).skip(1).findFirst().get();
		System.out.println("2nd Largest Number : "+largestNumber);
	}

}
