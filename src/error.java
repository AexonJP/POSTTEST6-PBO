import java.util.Scanner;

public class error {
    Scanner x = new Scanner(System.in);
    

    void cek(){
        if (x.hasNextInt()){
            System.out.println("integer");
        }
        else if(x.hasNextFloat()){
            System.out.println("float");
        }
        else if(x.hasNextDouble()){
            System.out.println("double");
        }
        else if(x.hasNextLine()){
            System.out.println("string");
        }
    }

    int cek_int(){
        if(x.hasNextInt()){
            return x.nextInt();
        }
        x.nextLine();
        System.out.print("inputkan integer : ");
        return cek_int();
    }
    
    float cek_float(){
        if(x.hasNextFloat()){
            return x.nextFloat();
        }
        x.nextLine();
        System.out.print("inputkan float : ");
        return cek_float();
    }

    double cek_double(){
        if(x.hasNextDouble()){
            return x.nextFloat();
        }
        x.nextLine();
        System.out.print("inputkan double : ");
        return cek_double();
    }

    String cek_string(){
        return x.nextLine();
    }
}
