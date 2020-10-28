/// CodeSignal - Intro - The Journey Begins
/// Simple Array Sum
/// Author: Carlos L. Cuenca
/// Date: 10/27/20

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/// --------------
/// Driver Program

public class SimpleArraySum {

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
			String line   = reader.readLine();
			int[] numbers = Arrays.stream(line.trim().split(" ")).mapToInt(Integer::parseInt).toArray();
			
			System.out.println(simpleArraySum(numbers));

			inputCount--;

		}

	}

	/// ------------------------
	/// Function Implementations

	public static int simpleArraySum(int[] array) {

		int sum = 0;

		for(int index = 0; index < array.length; index++) {

			sum += array[index];

		}

		return sum;

	}


}


