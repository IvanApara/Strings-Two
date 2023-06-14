package practice.regex;

import java.util.Scanner;


public class SplitText {

  public static void main(String[] args) {
    String text = new Scanner(System.in).nextLine();
    System.out.println(splitTextIntoWords(text));
  }

  public static String splitTextIntoWords(String text) {
    String textFinish = "";
    String regex = "[^A-Za-z]";
    textFinish += text.replaceAll(regex, " ");


    StringBuilder builder = new StringBuilder();
    String[] words = textFinish.split("\\s+");
    String result = "";
    for(int i = 0; i < words.length; i++){
      if (textFinish.isEmpty()) {
        break;
      } else if(i == words.length - 1){
        builder.append(words[i]);
        break;
      }
      builder.append(words[i]).append(System.lineSeparator());
    }


     result += builder;

    //TODO реализуйте метод
    return result;
  }

}