package milosbogdanovic;

import java.util.Scanner;

public class IF0 {

public static void main(String[] args) {
// Deklarisanje promenljivih
int x, y;

// 1 deo: Unos podataka
Scanner input = new Scanner(System.in);
System.out.println("Unesite vrednost za x: ");
x = input.nextInt();
System.out.println("Unesite vrednost za y: ");
y = input.nextInt();

// 2 deo: Obrada podataka
if (x > y)
    System.out.println("X(" + x + ") je veće od Y(" + y + ").");
else {
    System.out.println("X(" + x + ") je manje od Y(" + y + ").");
}

input.close();

}

}