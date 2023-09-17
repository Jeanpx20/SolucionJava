1.
public class Main
{
	public static void main(String[] args) {
		// Declaración de las variables
        int x = 144;
        int y = 999;
        // Mostrar el valor de cada variable
        System.out.println("El valor de x es: " + x);
        System.out.println("El valor de y es: " + y);
        // Suma
        int suma = x + y;
        System.out.println("La suma de x e y es: " + suma);
        // Resta
        int resta = x - y;
        System.out.println("La resta de x e y es: " + resta);
        // División
        int division = x / y;
        System.out.println("La división de x e y es: " + division);
        // Multiplicación
        int multiplicacion = x * y;
        System.out.println("La multiplicación de x e y es: " + multiplicacion);
	}
}
2.
public class Main
{
	public static void main(String[] args) {
		// Declaración de las variables
        String nombre = "Juan García";
        String dirección = "Calle Mayor, 123";
        String teléfono = "91 123 45 67";
        // Mostrar los valores de las variables
        System.out.println("Nombre: " + nombre);
        System.out.println("Dirección: " + dirección);
        System.out.println("Teléfono: " + teléfono);
	}
}

3.
public class Main
{
	public static void main(String[] args) {
		// Cantidad en euros a convertir
    double euros = 10.50; 
    // Factor de conversión de euros a pesetas
    double factorConversion = 166.386; 
    // Realizar la conversión
    double pesetas = euros * factorConversion; 
    System.out.println(euros + " euros equivale a " + pesetas + " pesetas");
	}
}
5.
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Introduzca la cantidad en soles que desea convertir:");
        double soles = Scanner.nextDouble();
        double euros;
        euros = soles / 3.85;
        System.out.println("La cantidad convertida en euros es: " + euros);
	}
}

6.
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca las horas trabajadas:");
        int horasTrabajadas = scanner.nextInt();
        double salario = horasTrabajadas * 12;
        System.out.println("El salario semanal es: " + salario + " euros");
	}
}
7.
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la nota del primer examen: ");
        double notaPrimerExamen = scanner.nextDouble();
        System.out.println("¿Que nota quieres sacar en el trimestre?");
        double notadeseada = scanner.nextDouble();
        double notaSegundoExamen = (notadeseada - (notaPrimerExamen * 0.4)) / 0.6;
        System.out.println("Para tener un " + notadeseada + " en el trimestre necesitas sacar un " + notaSegundoExamen + " en el segundo examen");
	}
}

8.
  import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca la hora (sólo horas, sin minutos):");
        int hora = scanner.nextInt();
        if (hora >= 6 && hora < 12) {
            System.out.println("Buenos días!");
        } else if (hora >= 13 && hora < 21) {
            System.out.println("Buenas tardes!");
        } else {
            System.out.println("Buenas noches!");
	}
}
}
9.
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca las horas trabajadas:");
        int horasTrabajadas = scanner.nextInt();
        double salarioSemanal;
        if (horasTrabajadas <= 40) {
            salarioSemanal = horasTrabajadas * 12;
        } else {
            salarioSemanal = 40 * 12 + (horasTrabajadas - 40) * 16;
        }
        System.out.println("El salario semanal es: " + salarioSemanal);
	}
}
10.
11.
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca la hora (formato 24 horas):");
        int hora = scanner.nextInt();
        System.out.println("Introduzca los minutos:");
        int minutos = scanner.nextInt();
        int segundosFaltan = (24 * 60 * 60) - (hora * 60 * 60 + minutos * 60);
        System.out.println("Faltan " + segundosFaltan + " segundos para la medianoche.");
	}
}

12.
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca un número:");
        int numero = scanner.nextInt();
        boolean esPar = numero % 2 == 0;
        boolean esDivisible5 = numero % 5 == 0;
        if (esPar && esDivisible5) {
            System.out.println("El número es par y divisible entre 5.");
        } else if (esPar) {
            System.out.println("El número es par.");
        } else if (esDivisible5) {
            System.out.println("El número es divisible entre 5.");
        } else {
            System.out.println("El número no es par ni divisible entre 5.");
	}
}
}
13.
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca un número entero:");
        int numero = scanner.nextInt();
        int digitos = 0;
        while (numero != 0) {
            numero /= 10;
            digitos++;
        }
        System.out.println("El número tiene " + digitos + " dígitos.");
	}
}
14.
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca un día de la semana (de lunes a viernes):");
        String dia = scanner.nextLine();
        System.out.println("Introduzca una hora (horas y minutos):");
        String hora = scanner.nextLine();
        int minutos = Integer.parseInt(hora.split(":")[0]) * 60 + Integer.parseInt(hora.split(":")[1]);
        int minutosFinde = 0;
        switch (dia) {
            case "lunes":
                minutosFinde = (5 * 24 * 60 + 15 * 60) - minutos;
                break;
            case "martes":
                minutosFinde = (4 * 24 * 60 + 15 * 60) - minutos;
                break;
            case "miércoles":
                minutosFinde = (3 * 24 * 60 + 15 * 60) - minutos;
                break;
            case "jueves":
                minutosFinde = (2 * 24 * 60 + 15 * 60) - minutos;
                break;
            case "viernes":
                minutosFinde = (1 * 24 * 60 + 15 * 60) - minutos;
                break;
        }
        System.out.println("Faltan " + minutosFinde + " minutos para el fin de semana.");
	}
}
//en este use integer ya que ayuda a convertir int en objeto y convertir un objeto en int según el requisito.
15.
16.
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        System.out.println("Introduzca diez números:");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = scanner.nextInt();
        }
        int positivos = 0;
        int negativos = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > 0) {
                positivos++;
            } else if (numeros[i] < 0) {
                negativos++;
            }
        }
        System.out.println("Hay " + positivos + " números positivos.");
        System.out.println("Hay " + negativos + " números negativos.");
	}
}
17.
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int contador = 0;
        int sumaImpares = 0;
        int mayorPar = 0;
        System.out.println("Introduzca números (un número negativo para terminar):");
        while (true) {
            numero = scanner.nextInt();
            if (numero < 0) {
                break;
            
            contador++;
            if (numero % 2 != 0) {
                sumaImpares += numero;
            }
            if (numero % 2 == 0 && numero > mayorPar) {
                mayorPar = numero;
            }
        }
        System.out.println("Se han introducido " + contador + " números.");
        System.out.println("La media de los impares es " + (double) sumaImpares / contador);
        System.out.println("El mayor de los pares es " + mayorPar);
	}
}

        
18.


