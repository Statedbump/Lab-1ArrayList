import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class LabOList {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		int count =0;
		
		System.out.println("Please set the amount of request operations you would like to do");
		int n = s.nextInt();
		while(count<n) {
			int operation;
			int number;
			System.out.println("What operation would you like to perform");
			System.out.println("Press 1 to add a number to the list");
			System.out.println("Press 2 to remove all of the ");
			System.out.println("Press 3 Print the list");
			operation = s.nextInt(); 
			switch(operation) {
			case 1:
				number = s.nextInt();
				list.add(number);
				break;
			case 2:
				number = s.nextInt();
				if(list.isEmpty()) {
					
				}else {
					
					
						list.removeAll(Arrays.asList(number));
		
				}
				
				
				
			case 3:
				System.out.println(list.toString());
				break;
			}
			count++;
			
			
			
		
		}
		s.close();
		
	}
	

}
