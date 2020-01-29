package epam_practice;
class Randomhelpe {
public static int randint(int a,int b)
{
	return (int)(Math.random() * ((b - a) + 1)) + a;
}
public static double randdouble(int a,int b)
{
	return (Math.random() * ((b - a) + 1)) + a;
}
}
public class E43 {
public static void main(String args[])
{
	//E43 e=new Randomhelpe();
	System.out.println(Randomhelpe.randint(1, 10));
	System.out.println(Randomhelpe.randdouble(1, 10));
}
}
