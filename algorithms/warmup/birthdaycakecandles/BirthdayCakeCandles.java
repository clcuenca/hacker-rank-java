/// Hacker Rank - Algorithms - Warmup
/// Birthday Cake Candles
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

public class BirthdayCakeCandles {

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

			System.out.println(birthdayCakeCandles(numbers));

			inputCount--;

		}

	}

	/// ------------------------
	/// Function Implementations

	public static int birthdayCakeCandles(int[] candles) {

		int maximum = -999999999;
		int maximumCount = 0;

		for(int index = 0; index < candles.length; index++) {

			if(candles[index] > maximum) {

				maximum = candles[index];

				maximumCount = 1;

			} else if(candles[index] == maximum) {

				maximumCount++;

			}

		}

		return maximumCount;

	}

}


