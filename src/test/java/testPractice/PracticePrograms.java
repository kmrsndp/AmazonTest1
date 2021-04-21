package testPractice;

import java.util.Arrays;
import java.util.Scanner;

import org.testng.annotations.Test;

public class PracticePrograms {
	
  @Test(enabled = false)
  public void rightStars() {
	  
	System.out.println("Enter the number of rows: ");
	Scanner scan = new Scanner(System.in);
	int num = scan.nextInt();
	
	for (int i=num+1;i>=0;i--) {
		
		for (int j=1; j<i; j++) {
			
			System.out.print("*");			
			System.out.print(" ");
			
		}
		System.out.print("\n");
	}  
  }
  
  @Test(enabled = false)
  public void leftStars() {
	
	  System.out.println("Enter the number of rows: ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		for (int i=0; i<num+1; i++) {
			
			for(int j=0; j<i; j++) {
				
				System.out.print("*");
				System.out.print("");
			}
			System.out.println("\n");
		}
	  	  
  }

  @Test(enabled = false)
  public void stringReversal() {
	  
	  System.out.println("Enter a string: ");
	  Scanner scan = new Scanner(System.in);
	  String input = scan.nextLine();
	  String reversedString = "";
	  
	  for (int i= input.length()-1; i>=0; i--) {
		  reversedString = reversedString+ input.charAt(i); 	 
	  }
	  System.out.println(reversedString);	
  }
    
  @Test(enabled = false)
  public void totalChars() {
	  
	  System.out.println("Enter the string: ");
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		int count = 0;
		
		for (int i=0; i<input.length();i++) {
			count++;	
		}
		System.out.println("size is: " +count);
  }
  
  @Test(enabled = false)
  public void totalVowelsCons() {
	  
	  System.out.println("Enter the string: ");
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		int vCount=0, cCount =0;
		
		for (int i=0; i<input.length(); i++) {
			
			if(input.charAt(i)=='a'||input.charAt(i)=='e'||input.charAt(i)=='i'||input.charAt(i)=='o'||input.charAt(i)=='u') {
				
				vCount++;
			}
			else {
				cCount++;
			}
		}
		System.out.println("Vowels count is: " +vCount + "\nConsonant count is: " +cCount);
	  
  }
  
  @Test(enabled = false)
  public void anagramCheck() {
	System.out.println("Enter first string: ");
	Scanner scan = new Scanner(System.in);
	String input1 = scan.nextLine(); 
	System.out.println("Enter second string: ");
	String input2 = scan.nextLine();
	
	char[] string1 = input1.toCharArray();
	char[] string2 = input2.toCharArray();
	
	Arrays.sort(string1);
	Arrays.sort(string2);
	
	if(Arrays.equals(string1, string2)==true) {
		System.out.println("Anagram");
	}
	else {
		System.out.println("not Anagram");
	}
  }
  
  @Test(enabled= false)
  public void stringPalindrome() {
	  
	System.out.println("Enter the string: ");
	Scanner scan = new Scanner(System.in);
	String input = scan.nextLine();
	int count =0;
	  
	for(int i=0; i<input.length()/2; i++) {
		if(input.charAt(i)== input.charAt(input.length()-i-1)) {
			count =1;
		}
		else {
			count =2;
		}
	}
	if(count ==1) {
		System.out.println("String is Palindrome");
	}
	else {
		System.out.println("Not a palindrome");
	}
  }

  @Test(enabled = false)
  public void reverseNumber() {
	  
	  System.out.println("Enter a number: ");
	  Scanner scan = new Scanner(System.in);
	  int num = scan.nextInt();
	  int reverse = 0;

	  while (num!=0) {
		  
		  int rem = num%10;
		  reverse = reverse*10 + rem;
		  num=num/10;
	  }
	  System.out.println("reverse is: " +reverse);
	  }
  















}
