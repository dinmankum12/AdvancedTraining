package com.dinesh;

import java.util.Arrays;

public class Shuffle {



  static boolean checkLength(String first, String second, String third) {
    if (first.length() + second.length() != third.length()) {
      return false;
    }
    else {
      return true;
    }
  }

  static String sortString(String str) {
  
    char[] charArray = str.toCharArray();
    Arrays.sort(charArray);

    str = String.valueOf(charArray);

    return str;
  }

  static boolean shuffleCheck(String first, String second, String third) {

    first = sortString(first);
    second = sortString(second);
    third = sortString(third);

    int i = 0, j = 0, k = 0;

    while (k != third.length()) {

      if (i < first.length() && first.charAt(i) == third.charAt(k))
        i++;

      else if (j < second.length() && second.charAt(j) == third.charAt(k))
        j++;

      else {
        return false;
      }

      k++;
    }

    if(i < first.length() || j < second.length()) {
      return false;
    }

    return true;
  }

  public static void main(String[] args) {

    String first = "abc";
    String second = "def";
    String[] results = {"dabecf"};

    for (String result : results) {
      if (checkLength(first, second, result) == true && shuffleCheck(first, second, result) == true) {
        System.out.println(result + " is a valid shuffle of " + first + " and " + second);
      }
      else {
        System.out.println(result + " is not a valid shuffle of " + first + " and " + second);
      }
    }
  }
}