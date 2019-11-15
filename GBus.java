import java.io.*;
import java.util.*;


public class Solution {
    public static void main(String[] args) throws IOException {
    	Scanner inputScanner = new Scanner(System.in);
//    	int cases = inputScanner.nextInt();
    	int cases = Integer.parseInt(inputScanner.nextLine());
    	for (int i = 0; i < cases; i++) {
    		
			int[] list = new Solution().solve(inputScanner);
			System.out.printf("Case #%d:", i+1);
			for (int j = 0; j < list.length; j++) {
				System.out.print(" " + list[j]);
			}
			System.out.println();
		}
    }
    public int[] solve(Scanner inputScanner) {
    	
    	int numOfBuses = Integer.parseInt(inputScanner.nextLine());
    	
		int[] intervals = new int[numOfBuses * 2];
		String line = inputScanner.nextLine();
		
		String[] cityStrings = line.split("\\s+");
		
		for (int i = 0; i < cityStrings.length; i++) {
			intervals[i] = Integer.parseInt(cityStrings[i]);
		}
		int cityInterested = Integer.parseInt(inputScanner.nextLine());
		int[] listOfCities = new int[cityInterested];
		int[] result = new int[cityInterested];
		for (int i = 0; i < cityInterested; i++) {
			listOfCities[i] = Integer.parseInt(inputScanner.nextLine());
		}
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < intervals.length; j += 2) {
				if (listOfCities[i] >= intervals[j] && listOfCities[i] <= intervals[j+1]) {
					result[i]++;
				}
			}
		}
		inputScanner.nextLine();
		return result;
		
		
	}
}
