package epam_practice;
public class E42 
{
		String s1,s2;
		double d1,d2;
		E42(String s1,String s2,double d1,double d2)
		{
			this.s1=s1;
			this.s2=s2;
			this.d1=d1;
			this.d2=d2;
		}
		double getChangepercent(double d1,double d2)
		{
			double a=((d2-d1)/d1)*100;
			return a;
		}
		public static void main(String args[])
		{
			E42 e =new E42("ab","bc",10,20);
			System.out.println(e.getChangepercent(10, 20));
		}
}
