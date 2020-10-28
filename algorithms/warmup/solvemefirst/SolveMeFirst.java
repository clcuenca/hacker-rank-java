/// Hacker Rank - Algorithms - Warmup
/// Solve Me First
/// Author: Carlos L. Cuenca
/// Date: 10/27/20

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
/// --------------
/// Driver Program

public class SolveMeFirst {

	public static void main(String[] args) throws IOException {

		/// -----------------
		/// Program Variables

		int inputCount;

		/// -------------
		/// Program Start

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		inputCount = Integer.parseInt(reader.readLine());

		while(inputCount != 0) {

			// This is a multi-line input
			String line = reader.readLine();
			int[] numbers = Arrays.stream(line.trim().split(" ")).mapToInt(Integer::parseInt).toArray();

			int result = solveMeFirst(numbers[0], numbers[1]);

			System.out.println(result);

			inputCount--;

		}

	}

	/// ------------------------
	/// Function Implementations

	public static int solveMeFirst(int a, int b) {

		return a + b;

	}

}


