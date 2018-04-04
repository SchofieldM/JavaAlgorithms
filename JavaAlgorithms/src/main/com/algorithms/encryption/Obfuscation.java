package main.com.algorithms.encryption;

import main.com.algorithms.strings.BinaryToString;
import main.com.algorithms.strings.toBinary;

public class Obfuscation {

	public static String flipBits(String inputString, int step)
	{
		String binaryInput = toBinary.toBinary(inputString);
		System.out.println(binaryInput);
		char[] binaryInputArr = binaryInput.toCharArray();
		
		for(int i = 0; i < binaryInputArr.length; i++) {
			if(i != 0 && i%step == 0) {
				char temp = binaryInputArr[i-1];
				binaryInputArr[i-1] = binaryInputArr[i];
				binaryInputArr[i] = temp;
			}
		}
		return BinaryToString.binaryToString8Bit(new String(binaryInputArr));
	}
	
	public static void main(String[] args)
	{
		System.out.println(flipBits("abcdefghi", 3));

	}
	
}
