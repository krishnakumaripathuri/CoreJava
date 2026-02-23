
package FileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;

public class TextFile {

	// WRITER //

	public static void main1(String[] args) throws IOException {
		// file path location
		File file = new File("C:\\Users\\rajas\\Videos\\test.txt");
		FileWriter fw = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw); // Buetification
		// here we can pass file path location - to write the content
		bw.write("krishna kumari");
		bw.newLine();
		bw.write("it software");
		bw.newLine();
		bw.write("chennai");
		bw.newLine();
		bw.close();
		fw.close();
		System.out.println("created file successfully");
	}

	// READER //

	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\rajas\\Videos\\test.txt");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		String line = br.readLine();

		while (line != null) {
			System.out.println(line);
			line = br.readLine();
		}
		br.close();
		fr.close();
	}
}
