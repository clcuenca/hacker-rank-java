/// Hacker Rank - Algorithms - Warmup
/// Plus Minus
/// Author: Carlos L. Cuenca
/// Date: 10/28/2020

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.stream.Collectors;

/// --------------
/// Driver Program

public class PlusMinus {

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

			plusMinus(numbers);

			System.out.println();

			inputCount--;

		}

	}

	/// ------------------------
	/// Function Implementations

	public static void plusMinus(int[] array) {

		int positiveCount = 0;
		int negativeCount = 0;
		int zeroCount     = 0;

		for(int index = 0; index < array.length; index++) {

			if(array[index] > 0) positiveCount++;
			if(array[index] < 0) negativeCount++;
			if(array[index] == 0) zeroCount++;

		}

		System.out.printf("%.6f", ((float) positiveCount / array.length));
		System.out.println();
		System.out.printf("%.6f", ((float) negativeCount / array.length));
		System.out.println();
		System.out.printf("%.6f", ((float) zeroCount     / array.length));
		System.out.println();


	}

}


