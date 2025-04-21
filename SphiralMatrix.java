package Programmimg;

public class SphiralMatrix 
{

	public static void main(String[] args) 
	{   int size=5;
		int arr[][]=sphiral(size);
		for(int[] nums:arr)
		{
			for(int n:nums)
			{   if(n<10)
				    System.out.print(n+"  ");
			    else
			    	System.out.print(n+" ");
			}
			System.out.println();
		}

	}
	public static int[][] sphiral(int size)
	{
		int [][]arr =new int[size][size];
		char dir='r';
		int row=0;
		int col=-1;
		
		for(int j=1;j<=size*size;j++)
		{
			switch (dir)
			{
			  case 'r':{
		                  col++;
		                  arr[row][col]=j;
		                  if(col==size-1 || arr[row][col+1]!=0)
		                  {
		                	  dir ='d';
		                  }
		                  break;
			            }
			  case 'd':{
                         row++;
                         arr[row][col]=j;
                         if(row==size-1 || arr[row+1][col]!=0)
                         {
                	        dir ='l';
                         }
                         break;
	                   }
			  case 'l':{
                          col--;
                          arr[row][col]=j;
                          if(col==0 || arr[row][col-1]!=0)
                          {
                	         dir ='u';
                          }
                          break;
	                   }
			  case 'u':{
                         row--;
                         arr[row][col]=j;
                         if(row==1 || arr[row-1][col]!=0)
                         {
                        	  dir ='r';
                         }
                         break;
	                   }
		}
	}
	return arr;
}
}
