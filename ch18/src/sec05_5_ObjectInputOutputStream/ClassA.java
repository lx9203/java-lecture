package sec05_5_ObjectInputOutputStream;

import java.io.*;

public class ClassA implements Serializable {
	int field1;
	ClassB field2 = new ClassB();
	static int field3;
	transient int field4;
}
