#include <stdio.h>

int main(void) {
	int a = 10;
	int *p = &a;
	printf("%d\n", *p);
	printf("%p\n",p);
	*p = 20;
	printf("%p\n",&a);
	printf("%d\n",a);
	int ar[] ={3, 4, 6, 7};
	printf("%p\n", ar);
	printf("%p\n", &ar[0]);
	printf("%d\n", *(ar+4));
	printf("%p\n", &ar[1]);
	printf("%d\n", ar[1]);
	printf("%p\n", &ar[2]);
	printf("%d\n", ar[2]);
	printf("%p\n", &ar[3]);
	printf("%d\n", &ar[3]);
	
	//long
	
	long l[] = {342,654,234,7,45};
	printf("Address of long array %p\n", l);
	printf("add of first element %p\n", &l[0]);
	printf("first element %d\n", l[0]);
	printf("add of second element %p\n", &l[1]);
	printf("second element %d\n", l[1]);
	printf("%p\n", &l[2]);
	printf("%d\n", l[2]);
	printf("%p\n", &l[3]);
	printf("%d\n", l[3]);
	printf("%p\n", &l[4]);
	printf("%d\n", l[4]);
	
	return 0;
}

