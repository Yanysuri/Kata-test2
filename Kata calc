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
        String[] arabNums = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        String[] romanNums = new String[]{"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
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
