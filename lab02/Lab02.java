import java.util.function.Function;

public class Lab02 {

	public interface UnaryFunction {
		double exec(double argument);
	}


	public class helper implements UnaryFunction{

		public double exec(double argument) {
			return 2*argument;
		}

	}

	public static double[] map(double values[], Function <Integer, Integer> func ) {
		double finalList[] = new double[values.length]; 
		for(int i=0;i<values.length; i++) {
			finalList[i] = func.apply((int)values[i]);
		}
		return finalList;
	}

	public static void main(String args[]) {
		double[] values1= {1.0, 2.0, 3.0, 4.0, 5.0};
		Function <Integer, Integer> exec = e -> e * 2;
		double[] valuesFinal = map(values1, exec);
		for(int i=0; i<valuesFinal.length; i++) {
			System.out.println(valuesFinal[i]);
		}

	}
}
