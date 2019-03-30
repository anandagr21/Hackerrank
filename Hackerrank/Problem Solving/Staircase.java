import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        double p=0,n=0,z=0;
        //double a,b,c;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<0)
                n++;
            else if(arr[i]>0)
                p++;
            else if(arr[i]==0)
                z++;
        }
        
        // a=n/arr.length;
        // b=p/arr.length;
        // c=z/arr.length;
        
        System.out.println(p/arr.length);
        System.out.println(n/arr.length);
        System.out.println(z/arr.length);
        
    
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);
    

        scanner.close();
    }
}
