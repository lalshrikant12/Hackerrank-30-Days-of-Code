import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);

        int myi;
        double myd;
        String mys;
        myi=scan.nextInt();
        myd=scan.nextDouble();
        scan.nextLine();
        mys=scan.nextLine();
        System.out.println(i+myi);
        System.out.println(d+myd);
        System.out.println(s+mys);

        scan.close();
    }
}
