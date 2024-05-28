package fr.maboite;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Factorial {

	private static final Logger logger = LoggerFactory.getLogger(Factorial.class);

	public Integer compute(int n) {
		logger.debug("compute called with n = {}", n);
		if (n < 0) {
			logger.error("Cannot compute factorial of negative number: {}", n);
			throw new IllegalArgumentException("Number must be non-negative");
		}
		int result = 1;
		for (int i = 1; i <= n; i++) {
			result *= i;
		}
		logger.info("Factorial of {} is {}", n, result);
		return result;
	}

	public static void main(String[] args) {
		Factorial factorial = new Factorial();
		int number = 5;
		logger.info("Starting factorial computation for {}", number);
		try {
			int result = factorial.compute(number);
			logger.info("Computed factorial: {}", result);
		} catch (IllegalArgumentException e) {
			logger.error("Error computing factorial: {}", e.getMessage());
		}
		logger.info("Factorial computation ended");
	}
}
