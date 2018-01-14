package LamdaAndStream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@FunctionalInterface  
interface Sayable{  
    String say(int number);  
}  
  

public class NumToStringConvertor {
	private static final String[] tensNames = {
		    "",
		    " ten",
		    " twenty",
		    " thirty",
		    " forty",
		    " fifty",
		    " sixty",
		    " seventy",
		    " eighty",
		    " ninety"
		  };

		  private static final String[] digitNames = {
		    "",
		    " one",
		    " two",
		    " three",
		    " four",
		    " five",
		    " six",
		    " seven",
		    " eight",
		    " nine",
		    " ten",
		    " eleven",
		    " twelve",
		    " thirteen",
		    " fourteen",
		    " fifteen",
		    " sixteen",
		    " seventeen",
		    " eighteen",
		    " nineteen"
		  };

		  public static void main(String args[]) {
			  Sayable person = (number)-> {  
		        	

		        	String soFar;
		        	
				    if (number % 100 < 20){
				      soFar = digitNames[number % 100];
				      number /= 100;
				    }
				    else {
				      soFar = digitNames[number % 10];
				      number /= 10;

				      soFar = tensNames[number % 10] + soFar;
				      number /= 10;
				    }
				    if (number == 0) return soFar;
				    return digitNames[number] + " hundred" + soFar;
		        		  //private EnglishNumberToWords() {}

		        		  

		        };  
		        
		        ArrayList<Integer> a1 = new ArrayList<Integer>();
		        a1.add(23);
		        a1.add(55);
		        a1.add(60);
		        a1.add(43);
		        a1.add(30);
		        List<Integer> fivem =a1.stream().filter(x->x%5==0).collect(Collectors.toList());
		        for (Integer temp : fivem) {
					System.out.println(person.say(temp));
				};
			
		  }
}
