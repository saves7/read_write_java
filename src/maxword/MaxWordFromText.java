package maxword;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class MaxWordFromText {



    public static void main(String[] args) throws IOException {

        String stringFile;
        String stringAllText="";

        //создаем объект для чтения;
        FileReader textfile = new FileReader("F:\\java\\text\\simpletext.txt");
        //передаем объект в сканнер для чтения;
        Scanner scannerfile = new Scanner(textfile);

        //читаем объект, пока есть не прочитанные символы, каждую строчку передаем в переменную, складываем все строки;
        while (scannerfile.hasNext()) {
            stringFile = scannerfile.nextLine();
            stringAllText=stringAllText + stringFile;
        }

        scannerfile.close();

        //System.out.println(stringAllText);

        createArrayWordsAndPrint(stringAllText);
        findMaxWord(createArray(stringAllText));

    }

    public static void createArrayWordsAndPrint (String s) {

        String sclean = s.replaceAll("\\,|\\;|\\.","");
        String [] wordsArray = sclean.split(" ");

        for (int i=0; i<wordsArray.length; i++) {
            System.out.println(wordsArray[i]);
        }

    }

    public static String [] createArray (String t) {
        String sclean = t.replaceAll("\\,|\\;|\\."," ");

        // c помощью .trim удаляем лишние пробелы, а с помощью split делаем разбивку
        String [] wordsArray = sclean.trim().split(" ");
        return wordsArray;
    }

    public static void findMaxWord (String [] m) {
        String maxword="";
        String word="";
        for (int k=0; k<m.length; k++) {
            word = m[k];
            if (word.length()>maxword.length()) {
                maxword = word;
            }
        }

        System.out.println("Самое длинное слово: "+maxword);
    }




}
