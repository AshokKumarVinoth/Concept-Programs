package test2;

public class mainclass {


	static int a[][]= new int[4][4];
	static String b[][]= new String[4][4];
	public static void main(String[] args)
	{
		GetInputValueMatrix();
		FirstAddition();


	}
	private static void FirstAddition() {
		for(int row=0;row<4;row++)
		{
			for(int column=0;column<4;column++)
			{
				int index=row+1;
				if(index==4)
					index=0;
				if (a[row][column]==1)
				{
					if(a[index][column]==1)
						b[row][column]="x";
					if(a[index][column]==0)
						b[row][column]="1";

				}
				if(a[row][column]==0)
				{
					if(a[index][column]==1)
						b[row][column]="0";
					if(a[index][column]==0)
						b[row][column]="x";
				}
			
			}
		}
		System.out.println("B Value Matrix:");
		for(int row=0;row<4;row++)
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
