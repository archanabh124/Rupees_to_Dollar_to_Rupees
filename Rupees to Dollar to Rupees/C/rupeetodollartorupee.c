#include<stdio.h>
#include<conio.h>

void main(){
	int num;
	float rupee,dollar;
	printf("--------Choose one of the following service\n");
	printf("1.Rupee To Dollar Conversion \n");
	printf("2.Dollar To Rupee Conversion \n");
	printf("3.Exit\n");
	printf("\n----------------------------------------------\n\n");
	printf("Enter Option: \t");
	scanf("%d",&num);
	switch(num){
		case 1:
			printf("Enter Rupee:\t ");
			scanf("%f",&rupee);
			dollar = rupee * 0.013;
			printf("Dollar: %f",dollar);
			break;
		case 2:
			printf("Enter Dollar:\t ");
			scanf("%f",&dollar);
			rupee = dollar * 74.54;
			printf("Dollar: %f",rupee);
			break;
		case 3:
		    exit(0);	
		}
	
	
}
