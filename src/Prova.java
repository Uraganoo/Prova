import java.util.Scanner;

public class Prova {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci una parola");
        String parola = input.nextLine();
        System.out.println("La parola e' lunga" + parola.length());
    }}