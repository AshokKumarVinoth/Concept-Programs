package test1;

public class mainclass {
	static int a[][]= new int[4][4];
	static String b[][]= new String[3][4];
	static String c[][]=new String[2][4];
	static String d[][]=new String[1][4];

	public static void main(String[] args)
	{
		GetInputValueMatrix();
		FirstAddition();
		SecondAddition();
		ThirdAddition();
	}

	private static void ThirdAddition() {
		for(int row=0;row<1;row++)
		{
			for(int i=0;i<4;i++)
			{
				if (c[row][i]=="x")
				{
					if(c[row+1][i]=="1")
						d[row][i]="x";
					if(c[row+1][i]=="0")
						d[row][i]="x";
					if(c[row+1][i]=="x")
						d[row][i]="1";
				}
				if(c[row][i]=="0")
				{
					if(c[row+1][i]=="1")
						d[row][i]="0";
					if(c[row+1][i]=="0")
						d[row][i]="x";
					if(c[row+1][i]=="x")
						d[row][i]="0";
				}
				if(c[row][i]=="1")
				{
					System.out.println("i value"+i);
					if(c[row+1][i]=="1")
						d[row][i]="x";
					if(c[row+1][i]=="0")
						d[row][i]="1";
					if(c[row+1][i]=="x")
						d[row][i]="1";

				}
			}
		}
		System.out.println("D Value Matrix:");
		for(int row=0;row<1;row++)
		{
			for(int i=0;i<4;i++)

			{
				System.out.print("\t"+d[row][i]);
			}
			System.out.println("\n");
		}
	}

	private static void SecondAddition() {
		for(int row=0;row<2;row++)
		{
			for(int i=0;i<4;i++)
			{
				if (b[row][i]=="x")
				{
					if(b[row+1][i]=="1")
						c[row][i]="x";
					if(b[row+1][i]=="0")
						c[row][i]="x";
					if(b[row+1][i]=="x")
						c[row][i]="1";
				}
				if(b[row][i]=="0")
				{
					if(b[row+1][i]=="1")
						c[row][i]="0";
					if(b[row+1][i]=="0")
						c[row][i]="x";
					if(b[row+1][i]=="x")
						c[row][i]="0";
				}
				if(b[row][i]=="1")
				{
					if(b[row+1][i]=="1")
						c[row][i]="x";
					if(b[row+1][i]=="0")
						c[row][i]="1";
					if(b[row+1][i]=="x")
						c[row][i]="1";
				}
			}
		}
		System.out.println("C Value Matrix:");
		for(int row=0;row<2;row++)
		{
			for(int i=0;i<4;i++)

			{
				System.out.print("\t"+c[row][i]);
			}
			System.out.println("\n");
		}
	}

	private static void FirstAddition() {
		for(int row=0;row<3;row++)
		{
			for(int i=0;i<4;i++)
			{
				if (a[row][i]==1)
				{
					if(a[row+1][i]==1)
						b[row][i]="x";
					if(a[row+1][i]==0)
						b[row][i]="1";

				}
				if(a[row][i]==0)
				{
					if(a[row +1][i]==1)
						b[row][i]="0";
					if(a[row + 1][i]==0)
						b[row][i]="x";
				}
			}
		}
		System.out.println("B Value Matrix:");
		for(int row=0;row<3;row++)
		{
			for(int i=0;i<4;i++)

			{
				System.out.print("\t"+b[row][i]);
			}
			System.out.println("\n");
		}

	}

	private static void GetInputValueMatrix() {
		a[0][0]=1;
		a[0][1]=1;
		a[0][2]=0;
		a[0][3]=1;

		a[1][0]=1;
		a[1][1]=0;
		a[1][2]=1;
		a[1][3]=0;

		a[2][0]=1;
		a[2][1]=1;
		a[2][2]=1;
		a[2][3]=0;

		a[3][0]=0;
		a[3][1]=1;
		a[3][2]=1;
		a[3][3]=0;
	}

}
