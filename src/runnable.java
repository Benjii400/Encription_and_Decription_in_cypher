import java.util.Scanner;
public class runnable {
    public static void main(String[] args){
        Scanner x=new Scanner(System.in);
        Scanner y=new Scanner(System.in);
        dec obj =new dec();
        String data;
        System.out.println("\n\n\n\n");
        System.out.println("                                      #################    Welcome to data encripting and decripting system.      #############");
        System.out.println("\n\n\n\n");
        System.out.println("Do you want encription or dicription (E/D):");
        char cho=x.next().charAt(0);

        if(cho=='E'||cho=='e'){
            System.out.println("Enter the data you want to encript :");
            data=y.nextLine();
            obj.enc(data);
            System.out.println("Your encripted data is : "+obj.encData);
            System.out.println("Do you want dicrite is again (Y/N):");
            cho=x.next().charAt(0);
            if(cho=='y'||cho=='Y'){
                obj.dec(obj.encData);
                System.out.println("The orginal text you entered is: "+obj.decData);
                System.out.println("Thank you for using this system.");
            }
            else System.out.println("Thank you for using this system.");
        }
        else if(cho=='D'||cho=='d'){
            System.out.println("Enter the data you want to decript :");
            data=y.nextLine();
            obj.dec(data);
            System.out.println("Your decripted data is :"+obj.decData);
            System.out.println("Do you want encript is again (Y/N):");
            cho=x.next().charAt(0);
            if(cho=='y'||cho=='Y'){
                System.out.println("The orginal text you entered is:"+obj.decData);
                System.out.println("Thank you for using this system.");
            }
            else System.out.println("Thank you for using this system.");
        }
        else System.out.println("Wrong in put!!");
    }
}