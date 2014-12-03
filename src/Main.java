import aho.Bukva;

import java.util.Scanner;

public class Main {
	private static int wordCount = 9;

	public static void main (String[] args) {
	    Scanner scanner = new Scanner(System.in);
		String[] words = {"абвгдеёжз", "привет", "зачем", "некуда", "вверх", "подьем", "выход", "стрельба", "куда"};
		wordsParse(words);
    }

	public static void wordsParse (String[] words) {
			Bukva bukva = new Bukva(words[0]);
		for (int i = 0; i < wordCount; i++) {
			bukva.dobavitBukvu(words[i]);
		}
		System.out.println("готово ");
	}
}
