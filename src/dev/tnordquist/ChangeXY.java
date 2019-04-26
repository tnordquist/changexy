package dev.tnordquist;

/**
 * CodingBat: Given a string, compute recursively (no loops) a new string where all the lowercase
 * 'x' chars have been changed to 'y' chars.
 */

public class ChangeXY {


  public static String changeXY(String str) {

    String newStr = "";
    String end;

    if (str.length() == 0) {

      return str;

    } else if (str.substring(str.length() - 1).equals("x")) {
      newStr = "y";
      return changeXY(str.substring(0, str.length() - 1)) + newStr;
    } else {
      end = str.substring(str.length() - 1);
      return changeXY(str.substring(0, str.length() - 1)) + end;
    }

  }

}
