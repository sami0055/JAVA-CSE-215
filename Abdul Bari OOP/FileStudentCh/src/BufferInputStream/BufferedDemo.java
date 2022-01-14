package BufferInputStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BufferedDemo {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("Source1.txt");
		BufferedInputStream bis=new BufferedInputStream(fis);
		int x;
		while((x=bis.read())!=-1) {
			System.out.print((char)x);
		}

	}

}
