/// Hacker Rank - Algorithms - Warmup
/// Diagonal Difference
/// Author: Carlos L. Cuenca
/// Date: 10/27/2020

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.stream.Collectors;

/// --------------
/// Driver Program

public class DiagonalDifference {

	public static void main(String[] args) throws IOException {

		/// -----------------
		/// Program Variables

		int inputCount;

		/// -------------
		/// Program Start

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		inputCount = Integer.parseInt(reader.readLine());

		while(inputCount != 0) {

			int matrixSize = Integer.parseInt(reader.readLine());

			List<List<Integer>> matrix = new ArrayList<>();

			for(int line = 0; line < matrixSize; line++) {

				List<Integer> row = Arrays.stream(reader.readLine().trim().split(" ")).map(Integer::valueOf).collect(Collectors.toList());

				matrix.add(row);

			}

			System.out.println(diagonalDifference(matrix));

			inputCount--;

		}

	}

	/// ------------------------
	/// Function Implementations

	public static int diagonalDifference(List<List<Integer>> matrix) {

		int leftDiagonal  = 0;
		int rightDiagonal = 0;

		for(int index = 0; index < matrix.size(); index++) {

			leftDiagonal += matrix.get(index).get(index);

		}

		for(int index = 0; index < matrix.size(); index++) {

			rightDiagonal += matrix.get(index).get(matrix.size() - index - 1);

		}

		return Math.abs(leftDiagonal - rightDiagonal);

	}

}


