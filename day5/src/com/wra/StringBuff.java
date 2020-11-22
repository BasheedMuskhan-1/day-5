package com.wra;

public class StringBuff
{

	public static void main(String[] args)
	{
		
				String str="Muskhan";
				StringBuffer sb=new StringBuffer(str);
				System.out.println(str); 
				System.out.println(sb.append(10));
				System.out.println(sb.length());
				System.out.println(sb.insert(3,"Space"));
				System.out.println(sb.replace(3,6,"Space"));
				System.out.println(sb.delete(1,3));
				System.out.println(sb.reverse());
				System.out.println(sb.capacity());
			    sb.ensureCapacity(10);
			    System.out.println(sb.capacity());
		        sb.ensureCapacity(50);
				System.out.println(sb.capacity());
				sb.trimToSize();
				System.out.println(sb.capacity());
				
				char[] cstr = new char[] { 'i', 's', 'a', 'f','r','e','s','h','e','r' };  
				System.out.println(sb.append(cstr, 0, 8));
				System.out.println(sb.appendCodePoint(65));
				int codepoints = str.codePointCount(4, 7);
				System.out.println(codepoints);
				
				
				
			}
	}


