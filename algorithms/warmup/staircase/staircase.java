/// Hacker Rank - Algorithms - Warmup
/// Staircase
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

public class Staircase {

	public static void main(String[] args) throws IOException {

		/// -----------------
		/// Program Variables

		int inputCount;

		/// -------------
		/// Program Start

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		inputCount = Integer.parseInt(reader.readLine());

		while(inputCount != 0) {

			int number = Integer.parseInt(reader.readLine());

			staircase(number);

			inputCount--;

		}

	}

	/// ------------------------
	/// Function Implementations

	public static void staircase(int number) {

		String printString = "";

		for(int line = 1; line <= number; line++) {

			for(int index = 0; index < number - line; index++) {

				printString += " ";

			}

			for(int index = 0; index < line; index++) {

				printString += "#";

			}


			if(line < number) printString += "\n";

		}

		System.out.println(printString);

	}

}


