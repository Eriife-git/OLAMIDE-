import java.util.Scanner;



public class NumberOfOdd {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	


	System.out.print("How many numbers do you want to input: ");
	int size = input.nextInt();

	int [] numodd = new int[size];


	for(int counter = 0; counter < numodd.length; counter++){

		System.out.print("Enter an integer: ");
		int number = input.nextInt();

		numodd[counter] = number;

	}


	System.out.print(ArrayKata.noOfOddNumbersIn(numodd));



  }
}