package ua.com.qalight.Vovk;

import java.util.logging.Logger;

public class SumNumberRunner {

	static Logger logger = Logger.getLogger(SumNumberRunner.class.getName());

	public static void main(String[] args) {

		int number = 12345;

		logger.info(String.valueOf(getSumByDivision(number)));
		logger.info(String.valueOf(getSumBySplit(number)));

	}

	public static Integer getSumBySplit(int number) {
		Integer result = 0;
		String intAsText = String.valueOf(number);
		char[] symbols = intAsText.toCharArray();
		for (char symbol : symbols) {
			result += Character.getNumericValue(symbol);
		}

		return result;
	}

	public static Integer getSumByDivision(int number) {
		Integer result = 0;
		while (number != 0) {
			result += number % 10;
			number = number / 10;
		}

		return result;
	}
}
