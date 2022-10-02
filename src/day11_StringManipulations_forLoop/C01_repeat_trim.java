package day11_StringManipulations_forLoop;

public class C01_repeat_trim {
    public static void main(String[] args) {

        String str="Java Candir";
        System.out.println(str.repeat(4));
        //Java CandirJava CandirJava Candir

        str= "  Ali kos  ";
        str=str.trim();  //basindaki ve sonundaki bosluuklardan kurtulmak icin

        System.out.println(str);  //Ali kos
    }
}
