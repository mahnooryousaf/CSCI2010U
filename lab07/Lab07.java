import java.util.*;

public class Lab07 {
	public static void main(String[] args) {
        int numDigits = 4;
        String[] origNumbers = { "0011", "1001", "1000", "0111", "0101" };
        List<String> numbers = new ArrayList<String>(Arrays.asList(origNumbers));

        System.out.println("Before sorting:");
        System.out.println(BinaryRadixSorter.toString(numbers));

        numbers = BinaryRadixSorter.sort(numDigits, numbers);

        System.out.println("After sorting:");
        System.out.println(BinaryRadixSorter.toString(numbers));
	}
}
  