import java.util.Scanner;

public class Main {

    public static boolean isEqual(StringBuilder s1, StringBuilder s2){
        if(s1.compareTo(s2)==0){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Hello World");
        StringBuilder sb1 = new StringBuilder("Hello");
        StringBuilder sb2 = new StringBuilder("Hello");

        if( isEqual(sb1, sb2)){
            System.out.println("They are equal");
        }

        System.out.println("Hello");

        sb.insert(11, "!");

        sb.reverse();
        String str = sb.toString();

        for(int i=0; i<sb.length(); i++){
            char c = sb.charAt(i);
            c = Character.toUpperCase(c);

            sb.setCharAt(i, c);
        }

        System.out.println(sb);

    }

}