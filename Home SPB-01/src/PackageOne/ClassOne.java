package PackageOne;

import java.util.Arrays;

public class ClassOne {

	public static void main(String[] args) {

		if (args == null) {
			System.out.println("Zero");
			System.exit(1);
		}

		if (args.length == 0) {
			System.out.println("Fuck Yeah");
			System.exit(0);
		}

		String argsList = Arrays.toString(args);
		System.out.println(argsList);

	}
}
