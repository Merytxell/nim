import java.util.Scanner;

public class jeuNim {
	
public static void main (String [] args) {
	
	//initialisation des deux joueurs 
	Scanner scanner = new Scanner (System.in);
	int initialAllumettes =21;
	int restAllumettes = 0;
	
	int players = 0;
	//System.out.println("le nombre d'allumettes est de " + initialAllumettes);
	
	System.out.println("joueur 1, indiquez votre nom");
	String name1 = scanner.nextLine();
	System.out.println("joueur 2, quel est votre nom ?");
	String name2= scanner.nextLine();
	System.out.println("Bienvenue " + name1 + " et "+  name2 + " au jeu du Nim !");
}
}

//créer un programme avec 21 alumettes 
//doit arbitrer une partie entre 2 humains dont le nom est demandé au démarrage - ok
//exposer les règles 
//1 on peut retirer 1 à 4 allumette
//2celui qui enlève la dernière a perdu