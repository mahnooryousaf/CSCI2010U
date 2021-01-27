public class Lab06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Towers of Hanoi:");
		solveHanoi(1, 3, 2, 4);
	}
	
	public static void solveHanoi(int source,int dest,int mid,int peg) {
		if(peg == 1) {
			move1(source,dest);
		}else {
			solveHanoi(source,mid,dest,peg-1);
			move1(source,dest);
			solveHanoi(mid,dest,source,peg-1);
		}
	}
	
	public static String move1(int source, int dest) {
		return "Move top ring from peg " + source + " to peg " + dest + ".\n";
	}

	public static void main(String[] args) {
		System.out.println("Fibonacci:");
		int n = 15;

		resetCallCount();
		int recursiveResult = fibonacciRec(n);
		int recursiveCalls = getCallCount();
		System.out.printf("Recursive result: %d (%d recursive calls)\n", recursiveResult, recursiveCalls);

		resetCallCount();
		int iterativeResult = fibonacciIter(n);
		int iterations = getCallCount();
		System.out.printf("Iterative result: %d (%d iterations)\n", iterativeResult, iterations);

		System.out.println("Towers of Hanoi:");
		String solution = solveHanoi(1, 3, 2, 3);
		System.out.print(solution);
	}
}