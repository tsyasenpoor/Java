import java.io.*;
import java.util.*;

public class Project2 {
	private static void print_information(File main_file)
			throws FileNotFoundException {
		Scanner main_scanner = new Scanner(main_file);
		int spc = 0;
		String temp;
		char dog;

		int a[] = new int[256];
		while (main_scanner.hasNext()) {
			spc++;
			temp = main_scanner.next();
			temp = temp.toLowerCase();
			for (int i = 0; i < temp.length(); i++) {
				dog = temp.charAt(i);
				a[(int) dog]++;
			}
		}
		for (int i = 97; i < 123; i++) {
			System.out.print((char) i + " = " + a[i] + " | ");
		}
		int sent = a[33] + a[63] + a[46];
		System.out.println();
		System.out.println("tedade jomalat = " + sent);
		System.out.println("tedade kalamt = " + spc);
	}

	private static void encode_file(File main_file)
			throws FileNotFoundException {
		Scanner scan = new Scanner(System.in);
		Scanner main_scanner = new Scanner(main_file);
		String temp;
		String reshte;
		int ts;
		int k;

		System.out.println("Enter the new file's name:");
		temp = scan.next();
		System.out.println("Enter a string as the key: ");
		reshte = scan.next();
		reshte = reshte.toLowerCase();
		
		File fout = new File(temp);
		PrintStream out = new PrintStream(fout);
		
		int[] key = new int[reshte.length()];
		for (int j = 0; j < reshte.length(); j++) {
			key[j] = ((int) reshte.charAt(j)) - 97;
		}
		
		String s = main_scanner.next();
		while (main_scanner.hasNext()){
			s = s + " " + main_scanner.next();
		}
		s = s.toLowerCase();
		char[] arr = new char[s.length()];

		for (int i = 0; i < s.length(); i++) {
			if (((int)(s.charAt(i)) <97) || ((int)(s.charAt(i)) >122))
				arr[i] = s.charAt(i);
			else{
				k = i % (key.length);
				int lool = ((int) (s.charAt(i)) - 97);
				ts = ((lool + key[k]) % 26) + 97;
				arr[i] = (char) (ts);
			}
		}

		for (int m = 0; m < s.length(); m++)
			out.print(arr[m]);

	}

	private static void decode_file(File main_file)
			throws FileNotFoundException {
		Scanner scan = new Scanner(System.in);
		String temp;
		String reshte;
		int ts;
		int k;

		Scanner main_scanner = new Scanner(main_file);

		System.out.println("Enter the new file's name: ");
		temp = scan.next();
		System.out.println("Enter a string as the key:");
		reshte = scan.next();
		reshte = reshte.toLowerCase();
		File fout = new File(temp);
		PrintStream out = new PrintStream(fout);
		int[] key = new int[reshte.length()];
		for (int j = 0; j < reshte.length(); j++) {
			key[j] = ((int) reshte.charAt(j)) - 97;
		}
		String s = main_scanner.next();
		while (main_scanner.hasNext())
			s = s + " " + main_scanner.next();
		s = s.toLowerCase();
		char[] arr = new char[s.length()];

		for (int i = 0; i < s.length(); i++) {
			if (((int)(s.charAt(i)) <97) || ((int)(s.charAt(i)) >122))
				arr[i] = s.charAt(i);
			else{
				k = i % (key.length);
				int lool = ((int) (s.charAt(i)) - 97);
				ts = ((lool - key[k] + 26) % 26) + 97;
				arr[i] = (char) (ts);
			}
		}

		for (int m = 0; m < s.length(); m++)
			out.print(arr[m]);
	}

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		File main_file;
		while (true){
			System.out.println("Enter file's name:");
			String main_file_name = scan.next();
			main_file = new File(main_file_name);
			if (main_file.exists() && !main_file.isDirectory())
				break;
			else
				System.out.println("file does not exist!");
		}

		int choice;

		while (true) {

			System.out.println("Choose one of the options below:");
			System.out.println("1. Show the file's statistical information");
			System.out.println("2. Coding the file");
			System.out.println("3. Opening a coded file");
			System.out.println("4. Exit");
			choice = scan.nextInt();
			switch (choice) {
			case 1:
				print_information(main_file);
				break;
			case 2:
				encode_file(main_file);
				break;
			case 3:
				decode_file(main_file);
				break;
			case 4:
				System.exit(0);
				break;
			default:
				break;
			}
			System.out.println("\n********\n");
		}
	}
}
