package quizz_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ControllerDemo {
    
    public static void main(String[] args) throws FileNotFoundException {
        File txtFile = new File("Numbers.txt");
        Scanner question = new Scanner(System.in);
        NumberController object = new NumberController(txtFile);
        System.out.println("Lutfen 'searchBinary' methodu ile dizide aranacak sayiyi giriniz:");
        int searchBinaryNumber = question.nextInt();
        boolean searchBinaryCondition = object.searchBinary(searchBinaryNumber);
        if (searchBinaryCondition == true){
            System.out.println("Aradiginiz sayi dizide bulunuyor!");
        }
        else{
            System.out.println("Aradiginiz sayi dizide bulunmuyor!");
        }
        System.out.println("Lutfen 'searchSequential' methodu ile dizide aranacak sayiyi giriniz:");
        int searchSequentialNumber = question.nextInt();
        boolean searchSequentialCondition = object.searchSequential(searchSequentialNumber);
        if (searchSequentialCondition == true){
            System.out.println("Aradiginiz sayi dizide bulunuyor!");
        }
        else{
            System.out.println("Aradiginiz sayi dizide bulunmuyor!");
        }
    }
}
