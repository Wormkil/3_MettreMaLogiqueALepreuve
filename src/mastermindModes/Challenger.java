package mastermindModes;

public class Challenger extends ModeParent {
	

	
	public Challenger() {
		
		System.out.println("Bienvenue dans le mastermind mode challenger ! Je vais choisir un nombre et vous essayerez de le deviner");
		System.out.println("Je vous aiderais en vous indiquant le nombre de chiffre trouvé et bien placé ");
		
		
		String nbRandom = "";
		for(int i = 0;i<nbCase;i++) {
			nbRandom += Math.round((Math.floor(Math.random() * (Integer.parseInt(intMax) - 0 +1)) + 0));
		}
			 	
		
		loopAndCheckWinMastermind(nbRandom,tryMax);
	}
		
	
	private static void loopAndCheckWinMastermind(String nbRandom, int nbTry) {
		int cpt = 0;
		boolean haveWin = false;
		
		while ( cpt < nbTry && haveWin == false) {
			if (outOneLoopChallengeur(nbRandom)){ haveWin = true; }
			else { haveWin = false; }
			cpt++;
		}
		
		if (haveWin) {
			System.out.println("Bravo vous avez trouvé ! La solution était bien "+nbRandom);
		}
		else {
			System.out.println("Vous avez perdu ... La solution était "+nbRandom);
		}
	}
}
