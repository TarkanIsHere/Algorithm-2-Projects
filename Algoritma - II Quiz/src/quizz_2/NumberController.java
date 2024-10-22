package quizz_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class NumberController {
    private File txtFile;
    int[] numbersArray = new int[20];
    // Aşağıda, nesne oluştururken argüman olarak verilen bir diziyi küçükten 
    // büyüğe doğru sıralayan ve "initilization" yapan  bir constructor method yazılmıştır.
    public NumberController(File txtFile) throws FileNotFoundException {
        this.txtFile = txtFile;
        Scanner numbersFile = new Scanner(txtFile);
        String number;
        int index = 0;
        while(numbersFile.hasNextLine()){
            number = numbersFile.nextLine();
            numbersArray[index] = Integer.parseInt(number);
            index += 1;
        }
    numbersArray = bubbleSort(numbersArray);
    }
    //Aşağıda Bubble-Sort yöntemi ile diziyi sıralayan statik bir method yazılmıştır.
    public static int[] bubbleSort(int[] array){
        int[] sortedArray = array;
        int temp_number;
        for(int i = 0; i<=sortedArray.length -1 ;i++){
            for(int j = 1; j<= sortedArray.length-1;j++){
                    if (sortedArray[j-1] > sortedArray[j]) {
                        temp_number = sortedArray[j-1];
                        sortedArray[j-1] = sortedArray[j];
                        sortedArray[j] = temp_number;
                    }
                }
            }
        return sortedArray;
    }
    // Aşağıda Search-Binary yöntemi ile girilen bir değerin dizide olup 
    // olmadığını araştıran bir method yazılmıştır.
    public boolean searchBinary(int findingNumber){
        int minIndex = 0;
        int maxIndex = numbersArray.length-1;
        int middleIndex;
        while(minIndex <= maxIndex){
            middleIndex = (minIndex +maxIndex) / 2;
            if(numbersArray[middleIndex] == findingNumber){
                return true;
            }
            if (numbersArray[middleIndex] < findingNumber){
                minIndex =  middleIndex +1;
            }
            else{
                maxIndex = middleIndex -1;
            }
        }
        return false;
    }
    // Aşağıda Sequential-Search yöntemi ile girilen bir değerin dizide olup 
    // olmadığını araştıran bir method yazılmıştır.
    public boolean searchSequential(int findingNumber){
        for(int i = 0; i<= numbersArray.length-1; i++){
            if(numbersArray[i] == findingNumber){
                return true;
            }
        }
        return false;
    }
}



