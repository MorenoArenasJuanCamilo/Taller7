import java.util.Scanner;

public class Operaciones {

Scanner sc =new Scanner (System.in);
	
	int a ;
	int año;
	public void AñoBisiesto() {
		
		
		do {
			System.out.println("Introduzca su Año:");
			año = sc.nextInt();
			if ((año % 4 == 0 && año % 100 != 0) || (año % 100 == 0 && año % 400 == 0)) {
	            System.out.println("El año " + año + " es bisiesto");
	        } else {
	            System.out.println("El año " + año + " no es bisiesto");
	        }
			System.out.println("Oprima 1 para introducir su año.");
			System.out.println("Oprima 2 para Salir.");
			 a= sc.nextInt();
			
		}while(a==1);
		
		
		
		
		
	}
	
	int num;
	
	char Pregunta;
	public void ContarCifras() {
		do {
			
			System.out.println("Introduzca su numero entero");
			num=sc.nextInt();
			int contar=0;
		while(num!=0) {
			num= num/10;
			contar++;
		}
			
			System.out.println("Las cifras de su numero son: "+contar+" cifras");
			
			
			System.out.println("Si quiere digitar otro numero digite S, si no N ");
			Pregunta=sc.next().charAt(Pregunta);
		}while(Pregunta=='S' || Pregunta=='s');
		
		
		
	}
	
	
	
	
}
