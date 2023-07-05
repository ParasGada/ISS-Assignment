import java.io.*;

class FileReadWrite{

	public static void main(String args[]) throws IOException {
		FileInputStream in = null;
		FileOutputStream out = null;

		try {
			in = new FileInputStream("C:/Users/Paras/Desktop/input.txt");
			out = new FileOutputStream("C:/Users/Paras/Desktop/output.txt");

			int c;
			while ((c = in.read()) != -1) {
				out.write(c);
			}
		}finally{
			if (in != null) {
				in.close();
			}
			if (out != null) {
				out.close();
			}
		}

		InputStreamReader cin = null;
		try {
			cin = new InputStreamReader(System.in);
			System.out.println("Enter characters, 'q' to quit.");
			char c;
			do {
				c = (char) cin.read();
				System.out.print(c);
			} while(c != 'q');
		}finally {
			if (cin != null) {
				cin.close();
			}
		}
	}
}