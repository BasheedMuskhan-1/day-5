package com.wra;

public class StringBuild
{

	public static void main(String[] args)
	{
		
				String str="Muskhan";
				StringBuilder s=new StringBuilder(str);
				System.out.println(str); 
				System.out.println(s.append(10));
				System.out.println(s.length());
				System.out.println(s.insert(1,"Space"));
				System.out.println(s.replace(1,3,"Space"));
				System.out.println(s.delete(1,3));
				System.out.println(s.reverse());
				System.out.println(s.capacity());
			    s.ensureCapacity(10);
			    System.out.println(s.capacity());
		        s.ensureCapacity(50);
				System.out.println(s.capacity());
				s.trimToSize(); 
				System.out.println(s.capacity());
				
				char[] cstr = new char[] { 'i', 's', 'a','f','r','e','s','h', 'e', 'r' };  
				System.out.println(s.append(cstr, 0, 8));
				System.out.println(s.appendCodePoint(65));
				int codepoints = str.codePointCount(4, 7);
				System.out.println(codepoints);
				
				
				

			}

	}


