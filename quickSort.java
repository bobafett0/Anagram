
public class quickSort {
	
	public quickSort()
	{
		
	}

	public boolean logAnadrome(String a, String b)
	{
		if(a.length() != b.length())
			return false;
		
		char[] t = quickSort(a.toCharArray());
		char[] u = quickSort(b.toCharArray());

		for(int i = 0; i < t.length; i++)
		{
			if(t[i] != u[i])
				return false;
		}
		return true;
	}
	
	public char[] quickSort(char [] a)
	{
		if( a.length >= 2 )
		{
		char pivot = a[a.length/2];
		char[] tempL = new char[a.length];
		char[] tempM = new char[a.length];
		char[] cen = new char[1];
		cen[0] = pivot;
		int L = 0, M = 0;

		for(int i = 0; i < a.length; i++)
		{
			if(i != a.length/2)
			{
			if(a[i] <  pivot)
			{
				tempL[L] = a[i];
				L++;
			}
			else
			{
				tempM[M] = a[i];
				M++;
			}
			}
		}
		return concatenate(quickSort(clean(tempL)),cen ,quickSort(clean(tempM) ) );
		}
		else if (a.length == 1)
		{
			return a;
		}
		else
		{
			return null;
		}
	}
	
	private char[] concatenate(char[] a, char[] b, char[] c)
	{
		 int size = 0, tempI = 0;
		 if(a != null)
		 {
			 size = size + a.length;
		 }
		 if(b != null)
		 {
			 size = size + b.length;
		 }
		 if(c != null)
		 {
			 size = size + c.length;
		 }
		 char[] temp = new char[size];
		 
		 if(a != null)
		 {
		 for(int i = 0; i < a.length; i++)
		 {
			 temp[tempI] = a[i];
			 tempI++;
		 }
		 }
		 if(b != null)
		 {
		 for(int i = 0; i < b.length; i++)
		 {
			 temp[tempI] = b[i];
			 tempI++;
		 }
		 }
		 if(c != null)
		 {
		 for(int i = 0; i < c.length; i++)
		 {
			 temp[tempI] = c[i];
			 tempI++;
		 }
		 }
		 return temp;
	}
	
	private char[] clean(char[] a)
	{
		int length = 0;
		for(int i = 0; i < a.length && (int)a[i] != 0; i++)
		{
			length++;
		}
		char [] temp = new char[length]; 
		
		for(int i = 0; i < length; i++)
		{
			temp[i] = a[i];
		}
		return temp;
	}
	
	
}
