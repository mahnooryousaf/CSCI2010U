import java.util.*;

public class BinaryRadixSorter {

	public static void main(String[] args) {
		
		String[] origNumbers = {"0011", "1001", "1000", "0111", "0101"};
		
		List<String> numbers = new ArrayList<>();
		
		for (String num: origNumbers) {
			numbers.add(num);
		}
		
		int numDigits = 4;
		int count = 3;
		
		System.out.println(numbers);
		
		while(count>=0) {
			Buckets bucket = new Buckets();
			for(int i =0;i<numbers.size();i++) {
				
				char x = numbers.get(i).charAt(count);
			
				if(x == '0') {
					bucket.addZero(numbers.get(i));
				}else {
					bucket.addOne(numbers.get(i));
				}
				
			}
			count--;
			System.out.println(bucket.getAllInOrder());
		}
	
		
		
		
	}
}

