package aho;

/**
 * Created by macbook on 03.12.14.
 */
public class Bukva {
	private final static int SMESHENIE                   = 1071; //сместить номера в UTF таблице, чтоб с 1 элемента шли номера кирилического алфавита (все другие символы отбрасываются)
	private final static int KOLICHESTVO_BUKV_V_ALFOVITE = 32;
	private int[]   tekushayBukva; //1 дополнительный элемент нужен для хранения счетчика окончания слов - поэтому массив длинной 33символа
	private Bukva[] spisokSledushihBukv;

	public Bukva (String myWord) {
		tekushayBukva = new int[33];
		spisokSledushihBukv = new Bukva[32];
		dobavitBukvu(myWord);
	}

	public void dobavitBukvu (String myWord) {
		if (myWord.length()>0) {
			int indexChar = myWord.charAt(0) - SMESHENIE;
			if (indexChar > 0 & indexChar <= KOLICHESTVO_BUKV_V_ALFOVITE) {
				tekushayBukva[indexChar]++;
				myWord = myWord.substring(1); //удаляем обработанную букву из слова
				if (tekushayBukva[indexChar] == 1) {
					Bukva sledushayBukva = new Bukva(myWord);
					spisokSledushihBukv[indexChar] = sledushayBukva;
				} else spisokSledushihBukv[indexChar].dobavitBukvu(myWord);
			}
		}
	}


}
