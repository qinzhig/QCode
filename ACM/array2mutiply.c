#include <stdio.h>

int main()
{
	int al1,ac1,al2,ac2;
	
	int a[3][2]={{10,9},{1,1},{3,4}};
	int b[2][3]={{5,4,4},{1,1,1}};
	int result_array[3][3]={0};

	int i,j,k;

	for(i=0;i<3;i++)
	{
		printf("\n");
		for(j=0;j<2;j++){

			printf("%d\t",a[i][j]);
		}
	}
printf("\n\n\tX\n");

	for(i=0;i<2;i++)
	{
		printf("\n");
		for(j=0;j<3;j++){
			printf("%d\t",b[i][j]);	
		}
	}


	for(i=0;i<3;i++)
	{
		for(j=0;j<3;j++)
		{
			for(k=0;k<2;k++)
			{
				result_array[i][j]=result_array[i][j]+a[i][k] * b[k][j];
			}
		}
	}

printf("\n\n=\n\n");

	for(i=0;i<3;i++)
	{
		printf("\n");
		for(j=0;j<3;j++)
		{
			printf("%d\t",result_array[i][j]);	
		}
	}
	
	return 0;	

}
