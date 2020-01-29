package epam_practice;
 class Randomhelper {
static int randint(int a,int b)
{
	return (int)(Math.random() * ((b - a) + 1)) + a;
}
static double randdouble(int a,int b)
{
	return (Math.random() * ((b - a) + 1)) + a;
}
}
