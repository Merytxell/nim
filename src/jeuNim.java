import java.util.Scanner;

public class jeuNim {
	
public static void main (String [] args) {
	
	//initialisation des deux joueurs 
	Scanner scanner = new Scanner (System.in);
	
	System.out.println("joueur 1, indiquez votre nom");
	String name1 = scanner.nextLine();
	System.out.println("joueur 2, quel est votre nom ?");
	String name2= scanner.nextLine();
	System.out.println("Bienvenue " + name1 + " et "+  name2 + " au jeu du Nim !");
	System.out.println("voulez-vous jouer ? oui/non");
	String playAgain = scanner.nextLine();
	
	while(playAgain.equals("oui")) {
		
	
		int initialAllumettes =21;
		int players = 1;//petite modif ici
	
	
		// explication des rêgles 
	
		System.out.println("Dans ce jeu, nous avons un tas de 21 allumettes. Chaques joueur peut enlever entre 1 et 4 allumettes. Le perdant sera celui qui enlève la dernière.");

	
	//création du jeu 

		while(initialAllumettes > 1) {
			System.out.println("Allumettes restantes" + initialAllumettes);
			System.out.println("joueur " + players + " " + (players == 1 ? name1 : name2)  +" combien d'allumettes souhaitez vous retirer ?");// si joueur = 1 alors c'est joueur 1 sinon c'est joueur 2
	
			int choise = scanner.nextInt();
	
		//on vérifie si le choix est bon
	
			if (choise >=1 && choise <= 4 && choise <= initialAllumettes) {
				initialAllumettes -= choise; //	soustrait deux valeurs et stocke le résultat dans la variable
				players = (players ==1) ? 2:1; //ça sert à changer de joueur et variable ternaire pour remplacer if else
		
			} else {
				System.out.println("choix invalide");
		
			}
			if (initialAllumettes <=1 || choise==initialAllumettes) {
				System.out.println((players == 1 ? name1 :name2)+ " vous avez perdu");
			}
		
		}
	System.out.println("voulez-vous rejouer");
	playAgain = scanner.nextLine(); //ça marche pas :o
	}
	System.out.println("au revoir !");
}	
}


//créer un programme avec 21 alumettes - ok
//doit arbitrer une partie entre 2 humains dont le nom est demandé au démarrage - ok
//exposer les règles  - ok
//1 on peut retirer 1 à 4 allumette - ok
//2celui qui enlève la dernière a perdu - ok
// gérer le fait que si il reste 4 allumettes, on ne peut pas en prendre 4 ou dire si on a perdu - ok
// gérer quand on a qu'une allumette on a perdu - ok
//proposer au joueur de rejouer 