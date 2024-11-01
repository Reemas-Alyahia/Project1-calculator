import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        char[][] bored = {{' ', ' ', ' '},
                          {' ', ' ', ' '},
                           {' ', ' ', ' '}};
        //or chr [] [] bored=new char [3] [3];

        Scanner input = new Scanner(System.in);
//        System.out.println("Enter how many round you want to play? ");
//        int number=input.nextInt();
//        if(number==1){onetime(bored);
//        print(bored);}
//        else if (number>1&&number<4) {
//            many(number,bored);
//            print(bored);
//        }

        while (true) {
            playing(bored, input);
            print(bored);
            computer(bored);
            print(bored);
            Theresolt(bored);

        }
        //input.close();
        //printborad(bored);
    } ///////////main

    public static void print(char[][] borad) {
        System.out.println("------");
        System.out.println(borad[0][0] + "|" + borad[0][1] + "|" + borad[0][2]);
        System.out.println("-*-*--");
        System.out.println(borad[1][0] + "|" + borad[1][1] + "|" + borad[1][2]);
        System.out.println("-*-*--");
        System.out.println(borad[2][0] + "|" + borad[2][1] + "|" + borad[2][2]);
        System.out.println("------");

    }

    public static void playing(char[][] bored, Scanner input) {
        try {
            String put;
            while (true) {
                System.out.println("Enter from 1 to 9");
                put = input.nextLine();
                if (isAvailabel(bored, Integer.parseInt(put))) {
                    break;
                } else {
                    System.out.println("chose another one : ");
                }
            }
            move(bored, put, 'X');
        } catch (NumberFormatException e) {
            System.out.println(" Only numbers please !");
        }

    }

    public static void move(char[][] borad, String inputt, char word) {
        switch (inputt) {
            case "1":
                borad[0][0] = word;
                break;
            case "2":
                borad[0][1] = word;
                break;
            case "3":
                borad[0][2] = word;
                break;
            case "4":
                borad[1][0] = word;
                break;
            case "5":
                borad[1][1] = word;
                break;
            case "6":
                borad[1][2] = word;
                break;
            case "7":
                borad[2][0] = word;
                break;
            case "8":
                borad[2][1] = word;
                break;
            case "9":
                borad[2][2] = word;
                break;
            default:
                System.out.println("Sorry but you have to chose from 1 until 9");
        }
    }

    public static boolean isAvailabel(char[][] borad, int chosenumber) {
        switch (chosenumber) {
            case 1:
                return (borad[0][0] == ' ');
            case 2:
                return (borad[0][1] == ' ');
            case 3:
                return (borad[0][2] == ' ');
            case 4:
                return (borad[1][0] == ' ');
            case 5:
                return (borad[1][1] == ' ');
            case 6:
                return (borad[1][2] == ' ');
            case 7:
                return (borad[2][0] == ' ');
            case 8:
                return (borad[2][1] == ' ');
            case 9:
                return (borad[2][2] == ' ');
            default:
                return false;
        }
    }

    public static void computer(char[][] bored) {
        Random ran = new Random();
        int computerPlay;
        while (true) {
            computerPlay = ran.nextInt(9) + 1;///the same examp at lab2 when i use random method,,
            // (9)=means how indix i will take and (+1) =means where i have to bigning
            if (isAvailabel(bored, computerPlay)) {
                break;
            }
        }
        move(bored, Integer.toString(computerPlay), 'O');
        System.out.println("~~~~~~~");
    }

    public static boolean checkresolt(char[][] bored, char word) {
        //  اللعبة تتكون من 9 خلايا، فإن عدد الطرق للفوز يمكن
        //3 خطوط أفقية
        //3 خطوط عمودية
        //2 خطوط قطرية
        ///rows
        if ((bored[0][0] == word && bored[0][1] == word && bored[0][2] == word) ||
                (bored[1][0] == word && bored[1][1] == word && bored[1][2] == word) ||
                (bored[2][0] == word && bored[2][1] == word && bored[2][2] == word) ||
                ///////////c
                (bored[0][0] == word && bored[1][0] == word && bored[2][0] == word) ||
                (bored[0][1] == word && bored[1][1] == word && bored[2][1] == word) ||
                (bored[0][2] == word && bored[1][2] == word && bored[2][2] == word) ||
                //////// ^
                (bored[0][0] == word && bored[1][1] == word && bored[2][2] == word) ||
                (bored[0][2] == word && bored[1][1] == word && bored[2][0] == word)) {
            return true;
        }
        return false;
    }

    public static boolean Theresolt(char[][] bored) {
        if (checkresolt(bored, 'X')) {
            print(bored);
            System.out.println("User wins !");
            return true;
        }
        if (checkresolt(bored, 'O')) {
            print(bored);
            System.out.println("Computer wins !");
            return true;
        }

        ///the same for weaks and days example at loops ex
        for (int i = 0; i < bored.length; i++) {
            for (int j = 0; j < bored[i].length; j++) {
                if (bored[i][j] == ' ') {
                    return false;
                } //if
            }  //j
        }//i
        System.out.println("finish...");
        print(bored);

        return true;
    }


////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//public static void onetime(char [][] borad){
//        print(borad);
//        Scanner input=new Scanner(System.in);
//        while (true){
//            playing(borad,input);
//            if(Theresolt(borad))
//            break;
//                print(borad);
//            //-----------------
//            computer(borad);
//            if(Theresolt(borad))
//            break;
//            print(borad);
//        } }
//public static void many(int number,char [][] borad){
//        int userc=0; int coc=0;
//    Scanner input=new Scanner(System.in);
//    char [][] XO= {{' ', ' ', ' '},
//                   {' ', ' ', ' '},
//                   {' ', ' ', ' '}};
//    for (int i = 0; i <= number; i++) {
//        System.out.println("Let Play Round "+i);
//        while (true){
//            playing(XO,input);
//            if(Theresolt(XO)){
//                if(checkresolt(XO,'X')){userc++;
//                    print(XO);
//                    System.out.println("User is wins");
//                    break; }
//         print(XO);  }
//            //---------------------
//            computer(XO);
//             if (Theresolt(XO)) {if (checkresolt(XO,'O')){
//                 coc++;
//                 print(XO);
//                 System.out.println("Computer is wins");
//                 break;
//                 }
//                  }
//        }
//if(userc>coc){
//    System.out.println("The user is wins !"+userc);
//}
//else if(coc>userc){
//    System.out.println("The computer is wins! "+coc);
//}
//else System.out.println(" It's win win :) all good ");
//
//    }
//}

}