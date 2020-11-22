package com.prc;
import com.prc.Arithmetic;
import com.prc.Relational;
import java.util.Scanner;

public class Main2
{
	public static void main(String args[])
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int ch;
		ch=sc.nextInt();
		Arithmetic ar=new Arithmetic();
		Relational r=new Relational();
		
		do
		{
			System.out.println("Enter your choice");
			System.out.println("1.addition");
			System.out.println("2.subtraction");
			System.out.println("3.multiplication");
			System.out.println("4.division");
			System.out.println("5.moduluar");
			System.out.println("6.greaterthan");
			System.out.println("7.lessthan");
			System.out.println("8.euals");
			System.out.println("9.greaterthanequals");
			System.out.println("10.lessthanequals");
			
			switch(ch)
			{
			case 1:
				System.out.println(ar.add(4,5));
				break;
			case 2:
				System.out.println(ar.sub(5,4));
				break;
			case 3:
				System.out.println(ar.mul(4,5));
				break;
			case 4:
				System.out.println(ar.div(10,5));
				break;
			case 5:
				System.out.println(ar.mod(4,5));
				break;
			case 6:
				System.out.println(r.greaterThan(4,5));
				break;
			case 7:
				System.out.println(r.lessThan(4,5));
				break;
			case 8:
				System.out.println(r.equals(4,5));
				break;
			case 9:
				System.out.println(r.greaterThanEqual(4,5));
				break;
			case 10:
				System.out.println(r.lessThanEqual(4,5));
				break;
			default:
				System.out.println("End of the program");
			}
		}while(ch>11);
	}
}

