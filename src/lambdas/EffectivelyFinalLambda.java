package lambdas;

public class EffectivelyFinalLambda {

	// Instance variable
	private String instanceVariable = "Instance Variable";
	private void modifyLocalVariable() {
		// Local non-final variable
		int count = 0;
	}

	private void modifyClassInstanceVariable() {
		// Local non-final variable
		instanceVariable = "Modified Instance Variable";
		 new Thread(() -> System.out.println(instanceVariable) ).start();
	}
	public static void main(String[] args) {
		new EffectivelyFinalLambda().modifyLocalVariable();
		new EffectivelyFinalLambda().modifyClassInstanceVariable();
	}
}