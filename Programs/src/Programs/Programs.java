package Programs;
import java.util.Scanner;
import java.math.BigInteger;
class Rough{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner sc1=new Scanner(System.in);
		int n= sc.nextInt();
		String input = sc1.nextLine(); 
		String[] s = input.split(" ");
		for(String i:s) {
			int c=0;
			for (String j:s) {
				if(i.equals(j)) {
				}
				else if(!i.equals(j) && (c<n-1)) {
					c=c+1;
					if(!i.equals(j) && (c==n-1))
						System.out.println(i);
				}
			}
		}
	}
}
class AddTwoMatrix
{
   public static void main(String args[])
   {
      int m, n, c, d;
      Scanner in = new Scanner(System.in);
 
      System.out.println("Enter the number of rows and columns of matrix");
      m = in.nextInt();
      n  = in.nextInt();
 
      int first[][] = new int[m][n];
      int second[][] = new int[m][n];
      int sum[][] = new int[m][n];
 
      System.out.println("Enter the elements of first matrix");
 
      for (  c = 0 ; c < m ; c++ )
         for ( d = 0 ; d < n ; d++ )
            first[c][d] = in.nextInt();
 
      System.out.println("Enter the elements of second matrix");
 
      for ( c = 0 ; c < m ; c++ )
         for ( d = 0 ; d < n ; d++ )
            second[c][d] = in.nextInt();
 
      for ( c = 0 ; c < m ; c++ )
         for ( d = 0 ; d < n ; d++ )
             sum[c][d] = first[c][d] + second[c][d];  //replace '+' with '-' to subtract matrices
 
      System.out.println("Sum of entered matrices:-");
 
      for ( c = 0 ; c < m ; c++ )
      {
         for ( d = 0 ; d < n ; d++ )
            System.out.print(sum[c][d]+"\t");
 
         System.out.println();
      }
   }
}
class TransposeAMatrix
{
   public static void main(String args[])
   {
      int m, n, c, d;
 
      Scanner in = new Scanner(System.in);
      System.out.println("Enter the number of rows and columns of matrix");
      m = in.nextInt();
      n = in.nextInt();
 
      int matrix[][] = new int[m][n];
 
      System.out.println("Enter the elements of matrix");
 
      for ( c = 0 ; c < m ; c++ )
         for ( d = 0 ; d < n ; d++ )
            matrix[c][d] = in.nextInt();
 
      int transpose[][] = new int[n][m];
 
      for ( c = 0 ; c < m ; c++ )
      {
         for ( d = 0 ; d < n ; d++ )               
            transpose[d][c] = matrix[c][d];
      }
 
      System.out.println("Transpose of entered matrix:-");
 
      for ( c = 0 ; c < n ; c++ )
      {
         for ( d = 0 ; d < m ; d++ )
               System.out.print(transpose[c][d]+"\t");
 
         System.out.print("\n");
      }
   }
}

 
class SubstringsOfAString
{
   public static void main(String args[])
   {
      String string, sub;
      int i, c, length;
 
      Scanner in = new Scanner(System.in);
      System.out.println("Enter a string to print it's all substrings");
      string  = in.nextLine();
 
      length = string.length();   
 
      System.out.println("Substrings of \""+string+"\" are :-");
 
      for( c = 0 ; c < length ; c++ )
      {
         for( i = 1 ; i <= length - c ; i++ )
         {
            sub = string.substring(c, c+i);
            System.out.println(sub);
         }
      }
   }
}

class FloydTriangle
{
   public static void main(String args[])
   {
      int n, num = 1, c, d;
      Scanner in = new Scanner(System.in);
 
      System.out.println("Enter the number of rows of floyd's triangle you want");
      n = in.nextInt();
 
      System.out.println("Floyd's triangle :-");
 
      for ( c = 1 ; c <= n ; c++ )
      {
         for ( d = 1 ; d <= c ; d++ )
         {
            System.out.print(num+" ");
            num++;
         }
 
         System.out.println();
      }
   }
}

class BigFactorial
{
  public static void main(String args[])
  {
    int n, c;
    BigInteger inc = new BigInteger("1");
    BigInteger fact = new BigInteger("1");
 
    Scanner input = new Scanner(System.in);
 
    System.out.println("Input an integer");
    n = input.nextInt();
 
    for (c = 1; c <= n; c++) {
      fact = fact.multiply(inc);
      inc = inc.add(BigInteger.TWO);
      System.out.println(inc);
    }
 
    System.out.println(n + "! = " + fact);
  }
}
