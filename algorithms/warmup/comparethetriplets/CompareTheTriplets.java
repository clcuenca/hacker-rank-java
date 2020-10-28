/// Hacker Rank - Algorithms - WarmUp
/// Compare the Triplets
/// Author: Carlos L. Cuenca
/// Date: 10/27/20

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/// --------------
/// Driver Program

public class CompareTheTriplets {

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

			int[] a = Arrays.stream(reader.readLine().trim().split(" ")).mapToInt(Integer::parseInt).toArray();
			int[] b = Arrays.stream(reader.readLine().trim().split(" ")).mapToInt(Integer::parseInt).toArray();

			List<Integer> alice = Arrays.stream(a).boxed().collect(Collectors.toList());
			List<Integer> bob   = Arrays.stream(b).boxed().collect(Collectors.toList());

			System.out.println(compareTriplets(alice, bob));

			inputCount--;

		}

	}

	/// ------------------------
	/// Function Implementations

	public static List<Integer> compareTriplets(List<Integer> alice, List<Integer> bob) {

		int aliceCount = 0;
		int bobCount   = 0;

		for(int index = 0; index < 3; index++) {

			if(alice.get(index) > bob.get(index)) aliceCount++;
			if(alice.get(index) < bob.get(index)) bobCount++;

		}

		return Arrays.asList(aliceCount, bobCount);

	}

}


