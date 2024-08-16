package lab10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreams {
	public static void main(String[] args) throws IOException {
		FileInputStream in = null;
		FileOutputStream out = null;
		try {
			in = new FileInputStream("./lab10_IO_files/input.txt");
			out = new FileOutputStream("./lab10_IO_files/bs_output.txt");
			int c;

			while ((c = in.read()) != -1) {
				out.write(c);
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
