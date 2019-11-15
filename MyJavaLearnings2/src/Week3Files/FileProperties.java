package Week3Files;

import java.io.File;
import java.io.IOException;

public class FileProperties {

	public static void main(String[] args) throws IOException {
		String fname = args[0];

		// pass the filename or directory name to file object
		File f = new File(fname);
		// using file object call file methods.
		System.out.println("File Names" + f.getName());
		System.out.println("Absolute path:	" + f.getAbsolutePath());
		System.out.println("path:	" + f.getPath());
		System.out.println("Parents :" + f.getParent());
		System.out.println("Exists:  " + f.exists());
		if (f.exists()) {
			System.out.println("Is Writable: " + f.canWrite());
			System.out.println("Is readable :" + f.canRead());
			System.out.println("Is a director: " + f.isDirectory());
			System.out.println("File Size in bytes" + f.length());
		}
	}
}