package Studentch2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class SCI2 {

	public static void main(String[] args) throws IOException {
	 
		float list []= {23f,4.5f,6.7f,7.8f};
		FileOutputStream fos=new FileOutputStream("list.txt");
		DataOutputStream dos=new DataOutputStream(fos);
		dos.writeInt(list.length);
		
		for(float f:list) {
			dos.writeFloat(f);
		}
		
		dos.close();
		fos.close();
		FileInputStream fis=new FileInputStream("list.txt");
		DataInputStream dis=new DataInputStream(fis);
		int length=dis.readInt();
		float data;
		for(int i=0; i<length; i++){
			data=dis.readFloat();
			System.out.println(data);
		}
		fis.close();
		dis.close();
		
	}

}
