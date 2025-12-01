package Technical_Round_Practice_Questions;

import java.util.Scanner;

public class Largest_In_the_Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Give the size of the array : ");
		int size = sc.nextInt();

		System.out.println("Give the elements of the array : ");
		int arr[] = new int[size];
		for(int i=0; i<size; i++) {
			arr[i] = sc.nextInt();
		}
		
		int largest = arr[0];
		int second_largest = arr[1];
		for(int i=1; i<size; i++) {
			if(largest < arr[i] ){
				
				second_largest = largest;
				
				largest = arr[i];
				
			}
		}
		
		int smallest = arr[0];
		int second_smallest = arr[1];
		for(int i=1; i<size; i++) {
			if(smallest > arr[i] ){
				second_smallest = smallest;
				smallest = arr[i];
			}
		}
		
		System.out.println("The lagest element in the array : "+largest+ " and the second largest : "+second_largest);
		System.out.println("The smallest element in the array : "+smallest+ " and the second smallest : "+second_smallest);
	}

}
