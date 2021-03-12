package com.advdz3;
import java.util.Locale;
import java.util.Scanner;

public class dz3 {

    Scanner scan = new Scanner(System.in);
        System.out.println("Введите текст ниже:");
    String s = scan.nextLine();
    String noSpaces = s.replace(" ", "");
    String lowNoSpace = noSpaces.toLowerCase(Locale.ROOT);
        System.out.println(lowNoSpace);

    String reverseString = reverseWithCharArray(lowNoSpace);
        System.out.println(reverseString);

        if (lowNoSpace.equals(reverseString)) {
        System.out.println("Строка является полиндромом");
    }else {
        System.out.println("Нет, строка не является полиндромом");
    }
}

    public static String reverseWithCharArray(String inputString) {
        char[] charArray = inputString.toCharArray();
        String resultString = "";
        for (int i = charArray.length - 1; i >= 0; i--) {
            resultString += charArray[i];
        }
        return resultString;
    }
}
