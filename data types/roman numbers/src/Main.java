import java.io.*;
import java.util.*;

public class Main {

    private static Map<Integer, String> romNum;
    static
    {

        romNum = new HashMap<Integer, String>();
        romNum.put(1000, "M");
        romNum.put(500, "D");
        romNum.put(100, "C");
        romNum.put(50, "L");
        romNum.put(10, "X");
        romNum.put(5, "V");
        romNum.put(1, "I");

    }

    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        String userInput;

        while (true) {
            userInput = in.next();
            // Type 'x' to quit input scanner
            if ("x".equals(userInput)) {
                break;
            } else {
                int num = Integer.parseInt(userInput);
                nums.add(num);
            }
        }

        for (int i = 0; i < nums.size(); i++) {
            Integer decNum = nums.get(i);
            Integer currentNum = nums.get(i);
            String romStr = "";

            while (currentNum > 0) {

                if (currentNum >= 1000) {
                    romStr += romNum.get(1000);
                    currentNum -= 1000;
                }
                else if (currentNum >= 500 && currentNum < 1000) {

                    if (currentNum > 900) {
                        romStr += romNum.get(100);
                        currentNum += 100;
                    }
                    else {
                        romStr += romNum.get(500);
                        currentNum -= 500;
                    }
                }
                else if (currentNum >= 100 && currentNum < 500) {
                    romStr += romNum.get(100);
                    currentNum -= 100;
                }
                else if (currentNum >= 50 && currentNum < 100) {
                    if (currentNum > 90) {
                        romStr += romNum.get(10);
                        currentNum += 10;
                    }
                    else {
                        romStr += romNum.get(50);
                        currentNum -= 50;
                    }
                }
                else if (currentNum >= 10 && currentNum < 50) {
                    if (currentNum >= 40) {
                        romStr += romNum.get(10);
                        currentNum += 10;
                    }
                    else {
                        romStr += romNum.get(10);
                        currentNum -= 10;
                    }
                }
                else if (currentNum >= 5 && currentNum < 10) {
                    if (currentNum > 8) {
                        romStr += romNum.get(1);
                        currentNum += 1;
                    }
                    else {
                        romStr += romNum.get(5);
                        currentNum -= 5;
                    }
                }
                else if (currentNum < 5) {
                    if (currentNum > 3) {
                        romStr += romNum.get(1);
                        currentNum += 1;
                    }
                    else {
                        romStr += romNum.get(1);
                        currentNum -= 1;
                    }
                }
            }

            System.out.println(String.format("%s = %s", decNum, romStr));

        }

    }


}
