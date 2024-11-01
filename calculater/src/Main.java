import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello this is a calculator  ");
        Scanner input=new Scanner(System.in);
        System.out.println("Enter first_number : ");
        int num1=input.nextInt();
        System.out.println("Enter second number: ");
        int num2=input.nextInt();
        ArrayList<Integer>Allcalculator=new ArrayList<>();
        while (true){
        System.out.println("Choose an option: ");
        System.out.println("Enter 1 to addition the numbers");
        System.out.println("Enter 2 to subtraction the numbers");
        System.out.println("Enter 3 to multiplication the numbers");
        System.out.println("Enter 4 to division the numbers");
        System.out.println("Enter 5 to modulus the numbers");
        System.out.println("Enter 6 to find minimum number");
        System.out.println("Enter 7 to find maximum number");
        System.out.println("Enter 8 to find the average of numbers");
        System.out.println("Enter 9 to print the last result in calculator");
        System.out.println("Enter 10 to print the list of all results in calculato");
        System.out.println("And if you want to finish it just print 11");
            int chose=input.nextInt();
        switch (chose){
            case 1:
                System.out.println("The of subtraction the numbers is : "+(sum(num1,num2)));
                Allcalculator.add(sum(num1,num2));

                break;
            case 2:
                int sub=num1-num2;
                System.out.println("The of subtraction the numbers is: "+sub);
                Allcalculator.add(sub);
            break;
            case 3:
                int mult=num1*num2;
                System.out.println("The of  multiplication  the numbers is: "+mult);
                Allcalculator.add(mult);
            break;
            case 4:
                int div=num1/num2;
                System.out.println("The division of the numbers is: "+div);
                Allcalculator.add(div);
                break;
            case 5:
                int mod=num1%num2;
                System.out.println("The modulus of the numbers is: "+mod);
                Allcalculator.add(mod);
                break;
            case 6:
                System.out.println("The minimum of the number is : "+minmax(num1,num2));
                Allcalculator.add(minmax(num1,num2));
                break;
            case 7:
                System.out.println("The maximum of the number is: "+minmax(num1,num2));
                Allcalculator.add(minmax(num1,num2));
                break;
            case 8:
                int avr=sum(num1,num2)/2;
                System.out.println("The average of the number is: "+avr);break;
            case 9:
                System.out.println("The last result in calculator:  "+Allcalculator.get(Allcalculator.size()-1));
                break;
           case 10:
               System.out.println("The list of all results in calculato:  "+Allcalculator); break;
            case 11:
                System.out.println("Exit...");
                input.close();
                return;
            default:
                System.out.println("The number is not here choose another one .");
                }

        }
    }
        public static int minmax(int num1, int num2){
        int min=0; int max=0;
        boolean isit=false;
        if(num1<num2){
            min=num1;
      }
        else if (num2<num1){
            min=num2;
           }
        else if (num1>num2) {
            max=num1;
           }
        else if(num2>num1){
            max=num2;

        }

        return minmax(num1,num2);
    }
    public static int sum(int num1,int num2){
        int sum=num1+num2;
        System.out.println(sum);
   return sum;}


}