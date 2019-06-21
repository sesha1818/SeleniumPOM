package Demo;

public class SumOfDig {

int find(int n,int l)
{	int sum=0;
	while(n!=0)
	{
		sum+=n%l;
		n=n/l;
		l/=10;
	}
	return sum;
	}
	public void main(String[] args) {
	 int a=54321;int b=0;int sum=0;
	 a=b;
	 int l;
	 while(b!=0)
	 {
		 l= String.valueOf(b).length();	 
	 sum+=find(b,l);
	 b%=l;
	 l/=10;
	 }
	 System.out.println(sum);
}
}

