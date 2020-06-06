import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

import java.util.*;
public class Solution
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(factorial(n));
    }
    
    
    public static int factorial(int n)
    {
        if(n==1)
        {
            return 1;
            
        }
        else 
        {
            return (n*factorial(n-1));
        }
    }
}
