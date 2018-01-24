// My solution to the HackerRank problem "Counting Valleys."
// https://www.hackerrank.com/challenges/counting-valleys/problem

import java.util.Arrays;
import java.util.Scanner;

public class CountingValleys {
    static int countingValleys(int n, String s) {
        // Complete this function
    	int level = 0;
    	int valleyCount = 0;
    	String[] steps = s.split("");
    	System.out.println("Steps = "+ Arrays.toString(steps));
    	for(String step: steps) {
    		if(step.equalsIgnoreCase("U")) {
    			level++;
    			if(level == 0) {
    				valleyCount++;
    			}
    		} else {
    			level--;
    		}
    	}    	
    	return valleyCount;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of steps Gary took on his hike (integer 2 - 1000000): ");
        int n = in.nextInt();
        System.out.println("Enter a string of 'U'and 'D' to represent steps taken 'up' or 'down'.: ");
        String s = in.next();
        int result = countingValleys(n, s);
        System.out.println(result);
        in.close();
    }
}
