package practice.regex;

import java.util.Scanner;

public class PhoneCleanerRegex {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    while (true) {
      String input = scanner.nextLine();
      String regex = "[^0-9]";
      String resultNumbers = input.replaceAll(regex,"");
      if (input.equals("0")) {
        scanner.close();
        break;
      }else if (resultNumbers.length() < 10) {
        System.out.println("Неверный формат номера");
        break;
      } else if (resultNumbers.length() > 11) {
        System.out.println("Неверный формат номера");
        break;
      } else if (input.startsWith("8")){
        String eight = "[^0,1,2,3,4,5,6,7,9]";
        String numberFinish = resultNumbers.replaceAll(eight, "7");
        System.out.println(numberFinish);
        break;
      } else if (resultNumbers.length() < 11 && resultNumbers.length() > 9) {
        System.out.print("7"+resultNumbers);
        break;
      } else if (input.startsWith("1") || input.startsWith("9") || input.startsWith("6")) {
        System.out.println("Неверный формат номера");
        break;
      }

      System.out.println(resultNumbers);

      // TODO:напишите ваш код тут, результат вывести в консоль.
    }
  }

}
