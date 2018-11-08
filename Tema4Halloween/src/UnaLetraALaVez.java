import java.util.Scanner;

public class UnaLetraALaVez {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("What is your message? ");
        String cadena=sc.nextLine();
        int longitudCadena=cadena.length();
        int ultimaPosicion=longitudCadena-1;
        System.out.println("Your message is "+longitudCadena+" characters long.");
        System.out.println("The first character is at position 0 and is '"+cadena.charAt(0)+"'.");
        System.out.println("The last character is at position "+ultimaPosicion+" and is '"+cadena.charAt(ultimaPosicion)+"'.");
        System.out.println("\nHere are all the characters, one at a time:\n");
        int numeroDeAes=0;
        for (int i = 0; i < longitudCadena; i++) {
            char caracterActual=cadena.charAt(i);
            System.out.printf("%5d - '%s'%n",i,caracterActual);
            if(Character.toUpperCase(caracterActual)=='A'){
                numeroDeAes++;
            }
        }
        System.out.println("Your message contains the letter 'a' "+numeroDeAes+" times. Isn't that interesting?");
    }

}
/*
Una letra a la vez
¿Sabía que utilizando un bucle, puede examinar una cadena de una letra a la vez? Los dos métodos de cadena incorporados clave son length () y charAt ().

length () devuelve un int que representa el número total de caracteres en la cadena (incluidos la puntuación y el espacio en blanco). Por ejemplo, si la variable str contiene la cadena "hello", entonces str.length () devolverá 5.
charAt (int n) devuelve el enésimo carácter (char) en la cadena. Las posiciones de los caracteres se basan en cero, por lo que si la variable str contiene la "ligadura" de String, entonces str.charAt (0) devolverá 'l', y str.charAt (4) devolverá 't'.

Hacer un programa que obtenga la siguiente salida (Lo que va en negrita es lo que introduce el usuario):
What is your message? A man, a plan, a canal: Panama!

Your message is 31 characters long.
The first character is at position 0 and is 'A'.
The last character is at position 30 and is '!'.

Here are all the characters, one at a time:

	0 - 'A'
	1 - ' '
	2 - 'm'
	3 - 'a'
	4 - 'n'
	5 - ','
	6 - ' '
	7 - 'a'
	8 - ' '
	9 - 'p'
	10 - 'l'
	11 - 'a'
	12 - 'n'
	13 - ','
	14 - ' '
	15 - 'a'
	16 - ' '
	17 - 'c'
	18 - 'a'
	19 - 'n'
	20 - 'a'
	21 - 'l'
	22 - ':'
	23 - ' '
	24 - 'P'
	25 - 'a'
	26 - 'n'
	27 - 'a'
	28 - 'm'
	29 - 'a'
	30 - '!'

Your message contains the letter 'a' 10 times. Isn't that interesting?
 */
