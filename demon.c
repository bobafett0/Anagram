
#include <stdio.h>
#include <stdlib.h>


int main(int argc, char **argv)
{
	int* r = calloc(1000,sizeof(int));
	operation(r,1000);
	operation2(r,1000);
	free(r);
}

void operation(int* e, int size)
{
	for(int i = 0; i < size; i++)
	{
		
	}
}

void operation2(int* e, int size)
{
	for(int i = 0; i < size; i++)
		for(int u = 0; u < size; u++)
		{
			
		}	
}
