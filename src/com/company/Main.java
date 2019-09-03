package com.company;
import java.util.Scanner;
public class Main {


    public static void main(String[] args) {

        int x;
        int y;
        System.out.println("Quel nombre voulez-vous élevé à une puissance?");// Affichage txte utilisateur
        Scanner sc = new Scanner(System.in);// lecture texte
        x=sc.nextInt();//Affecter la valeur saisie de la lecture à x

        System.out.println("Et à quelle puissance?");
        sc=new Scanner(System.in);
        y=sc.nextInt();
        int result=1;

        for (int i=0; i<y; i++) {
            result = result * x;

        }
        System.out.println (x+ " élevé à la puissance " +y+ " vaut "+result);

        }

    }
