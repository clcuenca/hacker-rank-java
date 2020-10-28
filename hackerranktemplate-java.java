/// Hacker Rank - Algorithms - Warmup
/// 
/// Author: Carlos L. Cuenca
/// Date:

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.stream.Collectors;

/// --------------
/// Driver Program

public class Add {

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
			int[] numbers = Arrays.stream(line.trim().split(" -")).mapToInt(Integer::parseInt).toArray();

			inputCount--;

		}

	}

	/// ------------------------
	/// Function Implementations

}


