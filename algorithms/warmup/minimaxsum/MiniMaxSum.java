/// Hacker Rank - Algorithms - Warmup
/// Mini Max Sum
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

public class MiniMaxSum {

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

			miniMaxSum(numbers);

			inputCount--;

		}

	}

	/// ------------------------
	/// Function Implementations

	public static void miniMaxSum(int[] array) {

		long minimumSum = 9999999999L;
		long maximumSum = -9999999999L;

		int n = array.length;
		int choose = 4;

		int[] combinations = new int[choose + 2];

		for(int j = 0; j < choose; j++)
			combinations[j] = j;

		combinations[choose] = n;
		combinations[choose + 1] = 0;

		int j = 0;

		while(j < choose) {

			// Visit the combination
			long sum = 0;

			for(int index = 0; index < choose; index++)
				sum += array[combinations[index]];

			if(sum < minimumSum) minimumSum = sum;
			if(sum > maximumSum) maximumSum = sum;

			j = 0;

			while(combinations[j] + 1 == combinations[j + 1]) {

				combinations[j] = j;

				j++;

			}

			combinations[j]++;

		}

		System.out.println(Long.toString(minimumSum) + " " + Long.toString(maximumSum));

	}

}


