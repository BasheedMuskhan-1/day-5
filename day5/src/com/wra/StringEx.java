package com.wra;

public class StringEx {

	public static void main(String[] args)
	{	
				String str=new String("Muss");
				
				char charAt=str.charAt(0);
				System.out.println("Character At:"+charAt);
				
				String concat=str.concat("Khan");
				System.out.println("Concat:"+concat);
				
				int compareTo=str.compareTo("work");
				System.out.println("Compare to:"+compareTo);
				
				boolean endsWith=str.endsWith("s");
				System.out.println("Ends with:"+endsWith);
				
				int indexOf=str.indexOf("abc");
				System.out.println("index of:"+indexOf);
				
				boolean isEmpty=str.isEmpty();
				System.out.println("is empty:"+isEmpty);
				
				String intern=str.intern();
				System.out.println("Intern:"+intern);
				
				int length=str.length();
				System.out.println("Length:"+length);
				
				String replace=str.replace('M','K');
				System.out.println("Replace:"+replace);
				
				String toUpperCase=str.toUpperCase();
				System.out.println("to upper case:"+toUpperCase);
				
				String toLowerCase=str.toLowerCase();
				System.out.println("to lower case:"+toLowerCase);

			}

		
	}

