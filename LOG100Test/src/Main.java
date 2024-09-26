import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        exercice07();
//        int[] tablo1 = new int[]{3, 4, 5, 2, 12, 2};
//        int[] tablo2 = new int[]{3, 4, 5, 2, 12, 2};
//        System.out.println(exercice16(tablo1, tablo2));
//
//        printf();
//        System.out.println(calculAireCercle(2));
//        Double[][] mat1 = new Double[][] {{5.0, 6.0, 7.0}};
//        Double[][] mat2 = new Double[][] {{1.0, 0.0}, {0.0, 1.0}, {1.0, 1.0}};
//        System.out.println(multiply(mat1, mat2));
    }

    public static Double[][] multiply(Double[][] matA, Double[][] matB) {
        if (matA[0].length != matB.length) {
            return new Double[][]{{Double.NaN}};
        }
        int rows = matA.length;
        int cols = matB[0].length;
        Double[][] matC = new Double[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matC[i][j] = 0.0;
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                for (int k = 0; k < matB.length; k++) {
                    matC[i][j] += matA[i][k] * matB[k][j];
                }
            }
        }

        return matC;
    }

    public static void exercice01() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String input = myObj.nextLine();
        int nbVoyelle = 0;

        for(int i = 0; i < input.chars().count(); i++) {
            switch (input.charAt(i)) {
                case 'a':
                    nbVoyelle++;
                    break;
                case 'e':
                    nbVoyelle++;
                    break;
                case 'i':
                    nbVoyelle++;
                    break;
                case 'o':
                    nbVoyelle++;
                    break;
                case 'u':
                    nbVoyelle++;
                    break;
            }
        }

        System.out.println("There is " + nbVoyelle + " vowels in the sentence: \"" + input + "\".");
    }

    public static void exercice02() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter a sentence.");
        String input1 = myObj.nextLine();
        System.out.println("Enter a word.");
        String input2 = myObj.nextLine();
        System.out.println("Searching for word...");

        if (input1.contains(input2)) {
            System.out.println("Yes, \"" + input2 + "\" is in that sentence.");
        } else {
            System.out.println("No the word isn't in that sentence.");
        }
    }

    public static void exercice03() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter a number.");
        String input1 = myObj.nextLine();
        System.out.println("Enter another number.");
        String input2 = myObj.nextLine();
        int number1 = Integer.parseInt(input1);
        int number2 = Integer.parseInt(input2);

        System.out.println("The bigger number is... " + ((number1 > number2) ? number1 : number2));
    }

    public static void exercice04() {
        //Calcul de la note : Écrivez un programme qui demande à l'utilisateur de
        //saisir sa note sur 20, puis affiche "Bravo !" si la note est supérieure ou égale
        //à 10,sinon affiche "Essaie encore !".
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter a grade ?/20.");
        String input1 = myObj.nextLine();
        int grade = Integer.parseInt(input1);

        if(grade <= 20 && grade >= 10) {
            System.out.print("Bravo!");
        } else if (grade >= 0 && grade < 10) {
            System.out.print("Essaie encore");
        } else {
            System.out.print("Wrong input");
        }

    }

    public static void exercice05() {
        //Écrivez un programme qui demande à l'utilisateur de saisir XQ poids, puis
        //affiche Oa catégorie de poids selon les critères suivants :
        //o Moins de 50 kg : "Poids plume"
        //o Entre 50 kg et 70 kg : "Poids moyen"
        //o Plus de 70 kg : "Poids lourd"

        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter your weight in kg");
        String input1 = myObj.nextLine();
        int weight = Integer.parseInt(input1);

        if(weight < 50) {
            System.out.println("Poids plume");
        } else if (weight >= 50 && weight <= 70) {
            System.out.println("Poids moyen");

        } else if (weight > 70) {
            System.out.println("Poids lourd");
        }
    }

    public static void exercice06() {
        //Calcul du jour de la semaine : Écrivez un programme qui demande à
        //l'utilisateur de saisir un nombre entre 1 et 7, puis affiche le jour de la semaine
        //correspondant (1 = Lundi, 2 = Mardi, etc.). Si le nombre est en dehors de
        //cette plage, affiche "Nombre invalide". Utilise switch-case
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter a nubmer from 1 to 7");
        String input1 = myObj.nextLine();
        int dayNumber = Integer.parseInt(input1);

        switch(dayNumber) {
            case 1 ->
                System.out.println("Monday");
//                break;
            case 2 ->
                System.out.println("Tuesday");
//                break;
            case 3 ->
                System.out.println("Wednesday");
//                break;
            case 4 ->
                System.out.println("Thursday");
//                break;
            case 5 ->
                System.out.println("Friday");
//                break;
            case 6 ->
                System.out.println("Saturday");
//                break;
            case 7 ->
                System.out.println("Sunday");
//                break;
            default ->
                System.out.println("Invalid date");
        }
    }

    public static void exercice07() {
        //Vérification de l'année bissextile : Écrivez un programme qui demande à
        //l'utilisateur de saisir une année, puis affiche "Année bissextile" si l'année est
        //divisible par 4 et non divisible par 100, ou si elle est divisible par 400. Sinon,
        //affiche "Année non bissextile". Utiliser l'operateur ternaire

        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter a year");
        int yearNumber = 0;
        while (myObj.hasNextInt() == false) {
//            if (myObj.hasNextInt() == false ) {
            System.out.println("Invalid input, please try again.");
            myObj.next();

        }
        yearNumber = myObj.nextInt();


        System.out.println(((yearNumber % 4 == 0 && yearNumber % 100 != 0) || yearNumber % 400 == 0) && yearNumber >= 4 ? "Année bissextile" : "Année non-bissextile");
    }

    public static void exercice08() {
        //Conversion de notes : Écrivez un programme qui demande à l'utilisateur de
        //saisir sa note sur 20, puis affiche l'équivalent en lettres selon les critères
        //suivants :
        //o Note inferieure a 10 : "F"
        //o Note 13<<10 "D"
        //o Note 16<<13 : "C"
        //o Note 18<<16 : "B"
        //o Note entre 18 et 20 : "A"

        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter a grade ?/20.");
        String input1 = myObj.nextLine();
        int grade = Integer.parseInt(input1);

        if(grade <= 20 && grade >= 18) {
            System.out.print("A");
        } else if (grade >= 16  && grade < 18) {
            System.out.print("B");
        } else if (grade >= 13 && grade < 16) {
            System.out.print("C");
        } else if (grade >= 10 && grade < 13) {
            System.out.print("D");
        } else if (grade < 10) {
            System.out.print("F");
        }
    }

    public static void exercice09() {
        //Écrivez une fonction qui demande à l'utilisateur de saisir un nombre entier
        //positif, puis calcule la somme de tous les nombres de 1 jusqu'à ce nombre.
        //Affichez ensuite la somme calculée. Si le nombre saisi est inférieur ou égal à
        //0, affichez que le nombre saisi n’est pas positif et demande à l’utilisateur de
        //saisir un autre nombre jusqu’à ce que l’utilisateur saisisse un nombre entier
        //positif

        Scanner myObj = new Scanner(System.in);

        while(true) {
            System.out.println("Enter a number");
            String input1 = myObj.nextLine();
            int number = Integer.parseInt(input1);
            int totalAmount = 0;

            for (int i = 1; i <= number; i++) {
                totalAmount += i;
            }

            if (totalAmount <= 0) {
                System.out.println("The number you entered: " + number + " is invalid");
            } else {
                System.out.println(totalAmount);
                break;
            }
        }
    }

    public static void exercice10() {
        //Calcul de la puissance : Écrivez un programme qui demande à l'utilisateur de
        //saisir deux entiers, base et exposant, et utilise une boucle pour calculer la
        //valeur de base élevée à la puissance de l’exposant.

        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter a number");
//        String input1 = myObj.nextLine(); // you can do myObj.nextInt() to avoid having to convert after
        int number1 = myObj.nextInt();
        System.out.println("Enter a power");
//        String input2 = myObj.nextLine();
        int number2= myObj.nextInt();
//        int originalBase = number1;

//        if(number2 > 0) {
//            for(int i = 2; i <= number2; i++) {
//                number1 *= originalBase;
//            }
//        } else if (number1 != 0) {
//            number1 = 1;
//        } else {
//            number1 = 0;
//        }
        int resultat = 1;

        for (int i = 0; i < number2; i++) {
            resultat *= number1;
        }

        System.out.println(resultat);
    }

    public static void exercice11() {
        //Conversion de notes en lettres : Écrivez un programme qui demande à
        //l'utilisateur de saisir une série de notes (QRPEUHVHQWLHUV entre 0 et 100).Dans
        //une boucle while, vous devez continuer de demander à l’utilisateur deVDLVLU
        //un nombre. À chaque fois que l’utilisateur VDLVLW un nombre de 0 à100, vous
        //lui indiquer la lettre correspondante et vous affichez le message,VDLVLVVH]
        //une note de 0 à 100 ou taper « fin » pour terminer le programme.Quand
        //l’utilisateur WDSH « fin », vous devez sortir de la boucle pour terminerle
        //programme. Si l’utilisateur VDLVLW un chiffre qui est inférieur à 0 ousupérieur à
        //100, indiquer à l’utilisateur qu’il doit VDLVLU un chiffre compris en 0et 100
        //inclusivement. Si l’utilisateur VDLV LW un chiffre entre 0 et 100, voici leslettres
        //correspondantes que vous devez afficher.
        //o Note supérieure ou égale à 90 jusqu’à 100 : A
        //o Note entre 80 et 89 : B
        //o Note entre 70 et 79 : C
        //o Note entre 60 et 69 : D
        //o Note inférieure à 60 : F
        Scanner myScanner = new Scanner(System.in);

        while (true) {
            System.out.println("Saisissez une note de 0 a 100 ou tapez \"fin\" pour terminer le programme.");
            String input = myScanner.nextLine();
            int number;

            if (input.equals("fin")) {
                myScanner.close();
                break;
            }

            try {
                number = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number");
                continue;
            }

            if (number >= 90 && number <= 100) {
                System.out.println("A Grade");
            } else if (number >= 80 && number <= 89) {
                System.out.println("B Grade");
            } else if (number >= 70 && number <= 79) {
                System.out.println("C Grade");
            } else if (number >= 60 && number <= 69) {
                System.out.println("D Grade");
            } else if (number < 60 && number >= 0) {
                System.out.println("F Grade");
            } else {
                System.out.println("Please enter a valid number from 0 to 100");
            }
        }
    }

    public static int exercice12(int[] tab) {
        int somme = 0;
        for (int i = 0; i < tab.length; i++) {
            somme += tab[i];
        }

        return somme;
    }

    public static int exercice13(int[] tab) {
        int nbEntiers = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] % 2 == 0) {
                nbEntiers++;
            }
        }

        return nbEntiers;
    }

    public static int exercice14(int[] tab, int nb) {
        int nbEntiers = 0;
        for(int i = 0; i < tab.length; i++) {
            if(nb == tab[i]) {
                nbEntiers++;
            }
        }
        return nbEntiers;
    }

    public static int[] exercice15(int[] tab) {
        int[] copieTab = Arrays.copyOf(tab, tab.length);
        for (int i = 0; i < tab.length; i++) {
            copieTab[i] = tab[tab.length - 1 - i];
        }

        return copieTab;
    }

    public static boolean exercice16(int[] tab1, int[] tab2) {
        if (tab1.length == tab2.length) {
            for (int i = 0; i < tab1.length; i++) {
                if (tab1[i] != tab2[i]) {
                    return false;
                }
            }

            return true;
        } else {
            return false;
        }
    }

    public static void exercice17() {
        Scanner myObj = new Scanner(System.in); // declare and initialize variables
        int somme = 0;
        int min = 0;
        int max = 0;
        int loops = 0;


        while(true) { // enter loop
            System.out.println("Enter a number or \"fin\" to end");
            String input = myObj.nextLine(); // ask for input before proceeding
            int number; // local variable where inputed number will be stored

            if(input.equals("fin")) { // before trying to parse String into an int, we check for "fin" to exit the loop
                break;
            }

            try { // since user can input something other than fin or an integer, we do a try catch to end the current loop iteration early and msg the user
                number = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Not a number");
                continue;
            }

            if(loops == 0) { // after parsing has been done, if we are in the first loop iteration, we initialize the values of min and max to the number we stored
                min = number;
                max = number;
            }

            min = Math.min(min, number); // the Math min and max function compare 2 integer to see what number is higher/ smaller between the two
            max = Math.max(max, number);
            somme += number; // add up numbers inputed
            loops++; // increment number of loops for avg purposes and the earlier if condition
        }

        System.out.println("Avg: " + somme / loops);
        System.out.println("Small: " + min);
        System.out.print("Big: " + max);

    }

    public static boolean ternaire(int number) {
//    if(number % 2 == 0) {
//        return true;
//    } else {
//        return false;
//    }

    //or better

    return number % 2 == 0 ? true : false;
    }

    public static void printf() {
        String nom = "a";
        String prenom = "b";
        System.out.printf("Mon nom est %s %s", nom,prenom);
        // %s String
        // %d int and long
        // %f floats
        // %b bools
        // \n next line

    }

    public static double calculAireCercle(double rayon) {
         return Math.PI * rayon * rayon ;
    }


}
