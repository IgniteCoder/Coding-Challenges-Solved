/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;
*/
import java.util.*;
import java.lang.Math;
// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClass {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        */

        // Write your code here
        Scanner ip = new Scanner(System.in);
        
        int T = ip.nextInt();
        for(int t=0;t<T;t++)
        {
            int N = ip.nextInt();
            int K = ip.nextInt();
            ip.nextLine();
            String bip= ip.nextLine();
            /*Test Input code
            System.out.println(T+" "+N+" "+K);
            System.out.println(bip);
            */
            int arr[]= new int[bip.length()];
            int bval[]= new int[bip.length()+1];
            for(int i=0;i<bip.length();i++)
            {
                arr[i]=Character.getNumericValue(bip.charAt(i));
                /*Test Arr values
                System.out.print(arr[i]);*/
            }
            int count =0;
            int flag=0;
            bval[0]=getBinaryValue(arr);
            int hb_val=bval[0];
            int index_hb=0;
            for(int kl=1;kl<=K;kl++)
            {
                for(int i=0;i<arr.length;i++)
                {
                    int temp = arr[0];
                    for(int j=0;j<arr.length-1;j++)
                    {
                        int jtemp= arr[j+1];
                        arr[j]=jtemp;                      
                    }
                    count++;
                    arr[arr.length-1]=temp;
                    //1 rotaion complete
                    bval[i+1]= getBinaryValue(arr);
                   /*checking binary values
                    System.out.println(Arrays.toString(arr));
                    System.out.println(bval[i+1]);*/
                                    //finding higest binary value
                
                    if(bval[i+1]>hb_val)
                    { 
                        hb_val=bval[i+1];
                        index_hb=i; //getting index of hb_val
                        continue;
                    }
                    if((hb_val==bval[i+1])&&flag==0)
                    {
                        System.out.println(count);
                        flag=1;
                        break;
                    }



                }
                if(flag==1)
                break;




            }

        }
        

    }
    public static int getBinaryValue(int[] arr)
    {
        int val=0,fval=0;;
        for(int j=0;j<arr.length-1;j++)
        {
           /* val=1;
            for(int i=arr.length-j-1;i>0;i--)
            val*=2;
            fval=fval + arr[j]*val; */
            fval= fval + arr[j]*((int)Math.pow(2,arr.length-j-1));

        }
        fval=fval+arr[arr.length-1]*1;
        return fval;
    }
}
