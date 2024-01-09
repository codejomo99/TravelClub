package travelClub.util;

import java.util.Scanner;

public class ConsoleUtil {
    private Scanner scanner;

    public  ConsoleUtil(){
        this.scanner = new Scanner(System.in);

    }

    public String getValueOf(String label){
        System.out.print(label + " : ");
        String inputStr = scanner.nextLine();
        inputStr = inputStr.trim(); // trim() 공백 생략 enter 제거 작업
        return inputStr;
    }
}
