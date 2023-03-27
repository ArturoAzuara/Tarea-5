import java.util.Scanner;

public class CafeteraDriver {
    public static void main(String[] args) {
        Coffee coffee = new Coffee(5000,1000,1500,50);
        Scanner teclado = new Scanner(System.in);
        boolean salir = false;
        int opcion;
        while (!salir){
            System.out.print("""
                    Bienvenido, ¿Que café gusta servirse el día de hoy?
                    
                    1) Americano
                    2) Expreso
                    3) Capuchino
                    4) Total de ingredientes
                    5) Salir
                    
                    Escribe alguna de las opciones: """);
            opcion = teclado.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("Has seleccionado café Americano");
                    if (coffee.ingredientes()){
                        coffee.americano();
                        if (coffee.ingredientes2("americano")){
                            System.out.println("Ingredientes insuficientes");
                        }else{
                            System.out.println("Aun queda ingredientes");
                        }
                    }
                    break;
                case 2:
                    System.out.println("Has seleccionado café Expreso");
                    if (coffee.ingredientes()){
                        coffee.expreso();
                        if (coffee.ingredientes2("expreso")){
                            System.out.println("Ingredientes insuficientes");
                        }else{
                            System.out.println("Aun quedan ingredientes");
                        }
                    }
                    break;
                case 3:
                    System.out.println("Has seleccionado Capuchino");
                    if (coffee.ingredientes()){
                        coffee.capuchino();
                        if (coffee.ingredientes2("capuchino")){
                            System.out.println("Ingredientes insuficientes");
                        }else{
                            System.out.println("Aun quedan ingredientes");
                        }
                    }
                    break;
                case 4:
                    System.out.println("El estado de la cafetera es el siguientes: ");
                    System.out.println(coffee);
                    break;
                case 5:
                    System.out.println("Adios, vuelva pronto");
                    salir = true;
                    break;
                default:
                    System.out.println("Error, elige otra opción entre 1 y 4");
            }
        }
    }
}
