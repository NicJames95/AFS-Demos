package demo;

import java.io.IOException;
import java.io.PrintWriter;

public interface SampleFunctionalInterface {
	// abstract method
	public void execute();
	// default method 
	public default void print(String text) {
		System.out.println(text);
	}
	// static method 
	public static void print(String text, PrintWriter writer) throws IOException {
		writer.write(text);
	}
	// Providing implementation to the interface
	// no argument for the lambda after arrows we have the implementation statement which is System.out.println 
	// Can have multiple implementation statements 
	SampleFunctionalInterface Lambda = () -> {
		System.out.println("Executing...");
	};

}
