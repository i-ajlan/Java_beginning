
import java.util.Scanner;

class Main{
    public static void main(String a[]){
        System.out.println("Hello");

        Field field = new Field(10,10);
        field.fill();
        Scanner reader1 = new Scanner(System.in);

        Unit unit;
        System.out.println("Choose your player:");
        System.out.println("0: Standard");
        System.out.println("1: Jumper");
        System.out.println("2: Ghost");
        System.out.println("3: Bishop");
        if(reader1.nextInt()==0){
            unit = new Standard(field,5,5);
        }else if(reader1.nextInt()==1){
            unit = new Jumper(field,5,5);
        }else if(reader1.nextInt()==2){
            unit = new Ghost(field,5,5);
        } else{
            unit = new Bishop(field,5,5);
        }

        field.output(unit);

        char key;
        Scanner reader = new Scanner(System.in);

        do{
            key = reader.next().charAt(0);
            unit.move(key);
            field.output(unit);
            
        }while(key != 'e' && unit.hp>0);
        
    }
}