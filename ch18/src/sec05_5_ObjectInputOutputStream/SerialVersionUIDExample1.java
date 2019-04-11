package sec05_5_ObjectInputOutputStream;

import java.io.*;

public class SerialVersionUIDExample1 {

	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("C:/Temp/Object.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		ClassC classC = new ClassC();
		classC.field1 = 1;
		oos.writeObject(classC);
		oos.flush(); oos.close(); fos.close();
	}

}
