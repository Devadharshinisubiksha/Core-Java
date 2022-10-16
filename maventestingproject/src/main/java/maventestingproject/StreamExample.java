package maventestingproject;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {

	public static void main(String[] args) {
		List<String> strList=Arrays.asList("apple","orange","guva","papaya");
		long count=strList.stream().filter(x->x.isEmpty()).count();
		System.out.println("count:"+count);
		
		List<Integer> numbers = Arrays.asList(9, 10, 3, 4, 7, 3, 4);
		 List<Integer> distinct = numbers.stream() 
		.map( i -> i*i) 
		.distinct()
		.collect(Collectors.toList());
		 
		 System.out.println(distinct);

		}
	}
