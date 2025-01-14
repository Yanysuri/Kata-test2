import java.util.Scanner;

class myException extends java.lang.Exception{
    public myException(String message) {
        super(message);
    }
}

public class Main {
    public static void main(String[] args) throws myException {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        scanner.close();
        String end = calc(userInput);
        System.out.println(end);


    }

    public static String calc(String input) throws myException {
        String[] parties = input.split(" ");
        myException exception = new myException("throws Exception");
        String[] arabNums = new String[]{
                "1", "2", "3", "4", "5", "6", "7", "8", "9", "10",
                "11", "12", "13", "14", "15", "16", "17", "18", "19", "20",
                "21", "22", "23", "24", "25", "26", "27", "28", "29", "30",
                "31", "32", "33", "34", "35", "36", "37", "38", "39", "40",
                "41", "42", "43", "44", "45", "46", "47", "48", "49", "50",
                "51", "52", "53", "54", "55", "56", "57", "58", "59", "60",
                "61", "62", "63", "64", "65", "66", "67", "68", "69", "70",
                "71", "72", "73", "74", "75", "76", "77", "78", "79", "80",
                "81", "82", "83", "84", "85", "86", "87", "88", "89", "90",
                "91", "92", "93", "94", "95", "96", "97", "98", "99", "100"
        };

        String[] romanNums = new String[]{
                "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X",
                "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
                "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX",
                "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
                "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L",
                "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
                "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
                "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
                "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
                "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"
        };

        boolean firstNumIsArab = false;
        boolean secondNumIsArab = false;
        boolean firstNumIsRoman = false;
        boolean secondNumIsRoman = false;
        int firstNum = 0;
        int secondNum = 0;
        String resultString = "";
        if ( parties.length >= 4 || parties.length <= 2) throw exception;
        for (int i = 0; i < arabNums.length; i++) {
            if (arabNums[i].equals(parties[0])) {
                firstNumIsArab = true;
                firstNum = Integer.parseInt(arabNums[i]);
                break;
            }
        }
        for (int i = 0; i < arabNums.length; i++) {
            if (arabNums[i].equals(parties[2])) {
                secondNumIsArab = true;
                secondNum = Integer.parseInt(arabNums[i]);
                break;
            }
        }
        for (int i = 0; i < romanNums.length; i++) {
            if (romanNums[i].equals(parties[0])) {
                firstNumIsRoman = true;
                firstNum = Integer.parseInt(arabNums[i]);
                break;
            }
        }
        for (int i = 0; i < romanNums.length; i++) {
            if (romanNums[i].equals(parties[2])) {
                secondNumIsRoman = true;
                secondNum = Integer.parseInt(arabNums[i]);
                break;
            }
        }
        boolean isAllNumsArab = firstNumIsArab && secondNumIsArab;
        boolean isAllNumsRoman = firstNumIsRoman && secondNumIsRoman;
        int result = 0;
        if (isAllNumsRoman) {
            switch (parties[1]) {
                case "+":
                    result = firstNum + secondNum;
                    break;
                case "-":
                    result = firstNum - secondNum;
                    break;
                case "*":
                    result = firstNum * secondNum;
                    break;
                case "/":
                    result = firstNum / secondNum;
                    break;
                default:
                    throw exception;
            }
            if (result < 1) throw exception;

        }
        if (isAllNumsArab) {
            switch (parties[1]) {
                case "+":
                    result = firstNum + secondNum;
                    break;
                case "-":
                    result = firstNum - secondNum;
                    break;
                case "*":
                    result = firstNum * secondNum;
                    break;
                case "/":
                    result = firstNum / secondNum;
                    break;
                default: throw exception;
            }
        }
        if (!isAllNumsArab && !isAllNumsRoman){throw exception;}
        if (isAllNumsArab){resultString = Integer.toString(result);}
        if (isAllNumsRoman){resultString = romanNums[(result - 1)];}
        return resultString;
    }
}
