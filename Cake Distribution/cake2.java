/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.*;
import java.lang.*;
import java.text.DecimalFormat;
public class cake2
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		ArrayList<Integer> r= new ArrayList<Integer>();
		for(int i=0;i<n;i++)
		r.add(sc.nextInt());
		findlargestpiece(r);
	}
	
	static void findlargestpiece(ArrayList<Integer> ar)
	{
	    //System.out.println("succcess");
	    HashMap<Double,Integer> pie = new HashMap<Double,Integer>(); 
	    //to store pieces information with differrent sizes
	    double mid=0;
	    //Create Another ArrayList temp With Elements of input ArrayList
	    ArrayList<Integer> temp= new ArrayList<Integer>(ar); // we will use this array to avoid complexities
	    int n= temp.size();
	    //Now Sort This Array List To Get Min value at index 0 and Max Value at Last Index
	    Collections.sort(temp);
	    double low=temp.get(0);
	    double high=temp.get(n-1);
	    System.out.println("low : " +low +" high : " + high +" n :"+ n);
	    int pcount=0;
	    mid=low;
	    DecimalFormat df = new DecimalFormat(".####"); // to format or get only upto 4 decimal places
	    pcount=countpie(temp,mid);
	    pie.put(Double.valueOf(low),Integer.valueOf(pcount));
	    while(true)
	    {
	        mid= (low+high)/2;
	        mid=Double.parseDouble(df.format(mid));
	        if(mid==low||mid==high)
	        break;
	        if(pie.containsKey(mid))
	        continue;
	        else
	        {
	         pcount=countpie(temp,mid);
	         pie.put(Double.valueOf(mid),Integer.valueOf(pcount));
	         if(pcount<n)
	         high=mid;
	         else
	         low=mid;
	        }
	    }
	    
	    //implementing binary search
	    // now we need to find max value which equally distributes cake
	    ArrayList<Double> f= new ArrayList<Double>();
	    // using iterator we add all key values which satisfy condition i.e to distribute to all guests
	    Iterator hmIterator = pie.entrySet().iterator();
	    while (hmIterator.hasNext()) 
	    { 
            Map.Entry mapElement = (Map.Entry)hmIterator.next(); 
            int val = ((int)mapElement.getValue()); 
            if(val>=n)
            f.add((double)mapElement.getKey());
	    }
	    //sorting to get highest value last 
	    Collections.sort(f);
	    int sf= f.size();
	    //printing answer
	    System.out.println(f.get(sf-1));
	    
	    
	    
	}
	public static int countpie(ArrayList<Integer> ar,double d)
	{
	    //this function counts no of pieces that can be obtained for size d
	    int n= ar.size();
	    int count=0;
	    int temp=0;
	    double div=0;
	    for(int i=0;i<n;i++)
	    {
	      temp=0;
	      div= ar.get(i)/d;
	      temp=(int)div;
	        count= count+temp; //adds divisor
	    }

	    return count;
	}
}
