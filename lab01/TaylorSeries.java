public class TaylorSeries {

    public static double approximateExp(int x, int numIterations)
    {
        double value = 0;
        for(int i=0;i<numIterations;i++)
        {
            value+= ((double)pow(x,i)/factorial(i));
        }
        
        return value; 
    }

    private static int factorial(int n)
    {
        if(n == 0) return 1;
        int value = 1;
        for(int i=1;i<=n;i++)
        {
            value*=i;
        }

        return value;
    }

    private static int pow(int x, int n)
    {
        if(n == 0) return 1;
        int value = 1;
        for(int i=1;i<=n;i++)
        {
            value*=x;
        }

        return value;
    }
}