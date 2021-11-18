package demo;

import java.util.Optional;

public class OptionalSample {

	public static void main(String[] args) {
		// 
		final Optional<String> middleName = getMiddleName();
		if (middleName.isEmpty())
		{
		System.out.println("There is no middle name!");
		}

	}
	
	public static Optional<String> getMiddleName() 
	{
		Optional<String> op = Optional.of("p");
		//return Optional.empty();
		return op;
		// returns empty whitespace not "There is no middle name!" ?
	}

}
