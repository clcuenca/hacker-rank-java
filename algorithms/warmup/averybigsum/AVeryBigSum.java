/// Hacker Rank - Algorithm - Warmup
/// A Very Big Sum
/// Author: Carlos L. Cuenca
/// Date: 10/27/20

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/// --------------
/// Driver Program

public class AVeryBigSum {

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
			String line    = reader.readLine();
			long[] numbers = Arrays.stream(line.trim().split(" ")).mapToLong(Long::parseLong).toArray();

			System.out.println(aVeryBigSum(numbers));

			inputCount--;

		}

	}

	/// ------------------------
	/// Function Implementations

	public static long aVeryBigSum(long[] array) {

		Long sum = 0L;

		for(int index = 0; index < array.length; index++) {

			sum += array[index];

		}

		return sum;

	}

}


