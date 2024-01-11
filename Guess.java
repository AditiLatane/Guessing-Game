import java.util.Scanner;

class First{
    public static void main(String[] args){
        int num = (int)(Math.random()*100);
        System.out.println("Guess the number(1-100) : ");
        System.out.println("Enter '-1' to stop");
                    
        do
        {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            if (a<0){
                System.out.println("Thank you ");
                System.out.println("My number was :" + num);
                break;
            }
            else{
                if(a==num){
                    System.out.println("Correct");
                    break;
                }
                else{
                    if(a<num){
                        System.out.println("Guess a greater number ");
                    }
                    else{
                        System.out.println("Guess a smaller number ");
                    
                    }
                }
            }
        }while (true);
            
        }
}
