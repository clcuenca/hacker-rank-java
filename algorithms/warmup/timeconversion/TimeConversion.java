/// Hacker Rank - Algorithms - Warmup
/// Time Conversion
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

public class TimeConversion {

	public static void main(String[] args) throws IOException {

		/// -----------------
		/// Program Variables

		int inputCount;

		/// -------------
		/// Program Start

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		inputCount = Integer.parseInt(reader.readLine());

		while(inputCount != 0) {

			String line = reader.readLine();

			System.out.println(timeConversion(line));

			inputCount--;

		}

	}

	/// ------------------------
	/// Function Implementations

	public static String timeConversion(String time) {

		int hours         = Integer.parseInt(String.valueOf(time.charAt(0)) + String.valueOf(time.charAt(1)));
		int minutes       = Integer.parseInt(String.valueOf(time.charAt(3)) + String.valueOf(time.charAt(4)));
		int seconds       = Integer.parseInt(String.valueOf(time.charAt(6)) + String.valueOf(time.charAt(7)));
		String timePeriod = String.valueOf(time.charAt(8)) + String.valueOf(time.charAt(9));

		String newTime = "";

		hours = hours % 12;

		if(timePeriod.equals("PM")) {

			hours += 12;

		}

		if(hours < 10){

			newTime += ("0" + String.valueOf(hours));

		} else {

			newTime += (String.valueOf(hours));

		}

		newTime += ":";

		if(minutes < 10) {

			newTime += ("0" + String.valueOf(minutes));

		} else {

			newTime += (String.valueOf(minutes));

		}

		newTime += ":";

		if(seconds < 10) {

			newTime += ("0" + String.valueOf(seconds));

		} else {

			newTime += (String.valueOf(seconds));

		}

		return newTime;


	}

}


