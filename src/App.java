import java.util.Scanner;
public class App {
    //HOLA MUNDO
    /*
    CREE EN TI MISMO */
    public static void main(String[] args) throws Exception {

        /* 
        int a = 10 , b = 3;
        System.out.println(a + b );
        System.out.println(a - b );
        System.out.println(a * b );
        System.out.println(a / b );
        System.out.println(a % b );
        int x = 10;
        x += 5;
        x -= 5;
        x *= 5;
        x /= 5;
        x++;
        x--;

        int edad = 20;
        System.out.println(edad == 20);
        System.out.println(edad != 18);
        System.out.println(edad > 18);
        System.out.println(edad < 18);
        System.out.println(edad >= 20);
        System.out.println(edad <= 19);

        boolean mayorEdad = true;
        boolean menorEdad = false;
        System.out.println(mayorEdad && menorEdad);
        System.out.println(mayorEdad || menorEdad);
        System.out.println(!mayorEdad);

    */
                

                Scanner sc = new Scanner(System.in);
                System.out.print("Como te llamas?: ");
                String nombre = sc.nextLine();
                System.out.print("¿Cuantos años tienes?: ");
                String edad1 = sc.nextLine();
                System.out.println("Hola, " + nombre + ". Tienes " + edad1 + " años.");
                sc.close();

                
                
                
            }

        
    }

