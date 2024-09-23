import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
  class Rectangulo {
     public static void main(String[] args) {

        // crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // solicitar al usuario los datos del rectangulo
        System.out.println("Ingrese la base del rectangulo:");
        double base = scanner.nextDouble();

        System.out.println("Ingrese la altura del rectangulo:");
        double altura = scanner.nextDouble();

        // calcular el area y perimetro
         double area = base * altura;
         double perimetro = 2*(base + altura);

         // mostrar los resultados
         System.out.println("El area del rectangulo es: " + area);
         System.out.println("El perimetro es: " + perimetro);


    }
}
