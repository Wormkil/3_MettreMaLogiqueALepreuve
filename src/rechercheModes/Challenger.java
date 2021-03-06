package rechercheModes;



public class Challenger extends ModeParent{
	
	static boolean loop = true;
	static String nbRandom = "";
	static int currentTry = 1;
	
	public Challenger() {
		nbRandom = u.randomGenerator(nbCase);
		System.out.println("Je vais maintenant tirer un nombre aléatoire, à vous de me faire une proposition et je vous dirais si "+'\n'+"chaque chiffre est plus petit, égal ou plus grand ! "+'\n'+'\n');
		loop = true;
		loopsChallengerRecherche();
		
	}
	
	private static void loopsChallengerRecherche() {

		while (loop) {

			if (oneLoopChallenger(nbRandom)) {
				System.out.println("Bravo vous avez trouvé ! La solution était bien : " +nbRandom);
				loop = false;
			}
			else if (currentTry < tryMax ){
				currentTry++;
			}
			else {
				loop = false;
				System.out.println("Vous avez perdu, désolé ... La solution était : "+nbRandom+'\n'+"Mais vous pouvez recommencer encore et encore !"+'\n'+'\n'+'\n');
			}
		}
		

		
	}
}
