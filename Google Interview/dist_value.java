import java.util.*;
import java.lang.*;
class dist_value
{
	public static int find_dist_value(int[] ar)
	{
		int n= ar.length,count;
		if(n==2||n==1)
        {
        	return ar[0];
        }
		int dval[] = new int[256];
		for(int i=0;i<n;i++)
		{

			count=0;
			for(int j=0;j<n;j++)
			{
				if(ar[i]==ar[j])
					{
						count++;
					}
			}

			if(count==1)
			{
				return ar[i];
			}
		}
		return 0;
	}


	public static void main(String[] args)
	{
		int[] ar={3,1,2,1,2,4,4,3,5,5};

		System.out.println(find_dist_value(ar));

	}

}