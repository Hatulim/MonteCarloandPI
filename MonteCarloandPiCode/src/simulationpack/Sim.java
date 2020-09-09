package simulationpack;

public class Sim {
	
	public Sim()
	{
		
	}
	
	public double calculatePi(int n)
	{
		double a,b;
		int yes=0;
		for(int i=0; i<n; i++)
		{
			a=(Math.random())-0.5;
			b=(Math.random())-0.5;
			//System.out.println("a: "+a+"| b: "+b);
			if(a*a+b*b<=0.25)
			{
				yes++;
			}
		}
		return ((double)yes/n)*4;
	}
}

