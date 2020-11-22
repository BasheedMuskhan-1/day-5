package com.prc;

public class Relational
{
	public int greaterThan(int a,int b)
	{
		if(a>b)
		{
			return a;
		}
		else
		{
			return b;
		}
	}
	public int lessThan(int a,int b)
	{
		if(a<b)
		{
			return a;
		}
		else
		{
			return b;
		}
	}
	public boolean equals(int a,int b)
	{
		if(a==b)
		{
			return true;
		}
		else
		{
			return false;
		}	
	}
	public boolean greaterThanEqual(int a,int b)
	{
		if(a>=b)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public boolean lessThanEqual(int a,int b)
	{
		if(a<=b)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
