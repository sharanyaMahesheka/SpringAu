package DateAndTimeApi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class SortDate {
	public static void main(String args[]) {
		List<Date> dateList = new ArrayList<Date>();
		dateList.add(new Date(2015-1900, 01, 11));
		dateList.add(new Date(2013-1900, 10, 21));
		dateList.add(new Date(2016-1900, 11, 5));
		dateList.add(new Date(2017-1900, 12, 27));
		dateList.add(new Date(2008-1900, 6, 9));
		dateList.add(new Date(2009-1900, 9, 1));
		Collections.sort(dateList, new Comparator<Date>(){
			 
            @Override
            public int compare(Date o1, Date o2) {
                return o1.compareTo(o2);
            }
        });
		 for(int i = 0; i < dateList.size(); i++){
	            System.out.println(dateList.get(i).toString());
	        }
		
	}

}
