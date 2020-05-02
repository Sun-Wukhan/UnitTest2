package internalexternal;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DataReader {

	public static void main(String[] args) throws IOException {

		FileReader fr = new FileReader("/Users/navid/Documents/JavaModuleTest/modul_02_java_test_b2001/module_02_test/src/main/resources/Key-To-Success");

		int i;

		while((i = fr.read())!= -1) {
			System.out.println((char)i);
		}
	}

}
