package atelier3.validation.util;

import java.util.Scanner;

public abstract class ScannerUtil {
	private static Scanner scan;
	
	public static Scanner get() {
		scan = new Scanner(System.in);
		return scan;
	}
	
	public static void close() {
		scan.close();
	}
}
