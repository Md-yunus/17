public class Main
{
	public static void main(String[] args) {
		int n=10;
		System.out.println("Even Numbers");
		for(int i=1;i<=n;i++)
		{
		    
		    if(i%2==0)
		        System.out.print(" "+i);
		        
		}
		System.out.println("\nOdd Number");
		for(int i=1;i<=n;i++)
		{
		    if(i%2!=0)
		    {
		        System.out.print(" "+i);
		    }
		}
	}
}
