package lab10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CharacterStreams {
	public static void main(String[] args) throws IOException {
		BufferedReader in = null;
		PrintWriter out = null;

		try {
			in = new BufferedReader(new FileReader("./lab10_IO_files/input.txt"));
			out = new PrintWriter(new FileWriter("./lab10_IO_files/cs_output.txt"));
			String line;

			while ((line = in.readLine()) != null) {
				out.println(line);
			}
			System.out.println("Success!");
		} finally {
			if (in != null)
				in.close();
			if (out != null)
				out.close();
		}
	}
}
