package lambdas;

public class CapturingLambda {

	private String defaultGreeting = "How are you? ";

	interface Greeting {
		void sayHello(String name);
	}

	private void accessLambdaVariables() {
		Greeting g = (name) -> {
			System.out.println(name);
		};
	}

	private void accessInstanceVariables() {
		Greeting g = (name) -> {
			// Accessing an instance variable 
			System.out.println(defaultGreeting + name);
		};
	}


	public static void main(String[] args) {
		CapturingLambda cl = new CapturingLambda();

	}

}