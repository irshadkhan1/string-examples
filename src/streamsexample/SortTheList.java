package streamsexample;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class SortTheList {
	

	public static void main(String[] args) {
	List<Integer> list = Arrays.asList(10,25,5,90,70,100);
	System.out.println("Original List :"+list);
	
	//max() and min()
	Integer maxValue =list.stream().max((x,y)->Integer.compare(x, y)).get();
	System.out.println(maxValue);
	
	Integer minValue =list.stream().min((x,y)->Integer.compare(x, y)).get();
	System.out.println(minValue);
	
	// sort the list in ascending order
      List<Integer> ls =  list.stream().sorted().toList();
      System.out.println("sorted by ascending order :"+ls);
      
      //find descending order of list
      List<Integer> sortedList =  list.stream().sorted((a,b)->b.compareTo(a)).toList();
      System.out.println("sorted by descending order :"+sortedList);
      
     
      //find even number of list
      List<Integer> evenList =  list.stream().filter(i->i%2==0).collect(Collectors.toList());
      System.out.println("even  number List :"+evenList);
      
      //find odd number of list
      List<Integer> oddList =  list.stream().filter(i->i%2!=0).collect(Collectors.toList());
      System.out.println("Odd Number List :"+oddList);
      
      //find the list whose greater than 50 in list
      Long countList =  list.stream().filter(i->i>50).count();
      System.out.println("count Number of List :"+countList);
      
      //multiply by 2 in list
      List<Integer> transformList =  list.stream().map(a ->a*2).collect(Collectors.toList());
      System.out.println("Multiplied by two Number new List is :"+transformList);
      
      
      //sorting String 
      List<String> str = Arrays.asList("Tom","Cat","Naveen","Sonu","Raju","A","BB");
    
      Comparator<String> z= (a1,b1)->{
    	  int l1= a1.length();
    	  int l2= b1.length();
    	  return Integer.compare(l1,l2);
      };
      List<String> sortString =  str.stream().sorted(z).toList();
      System.out.println(sortString);
      // min() and max() both takes comparator as a argument
      // and based on the comparator result it will return the value
      //min() it will return first element of comparator result
      ////max() it will return last element of comparator result
      
      String str1 = str.stream().max(z).get();
      System.out.println(str1);
      String str2 = str.stream().min(z).get();
      System.out.println(str2);
	}

}
