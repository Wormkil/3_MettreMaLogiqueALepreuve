# Mettre ma logique à l'épreuve

Ce programme est une compilation de jeux. On y retrouve le jeu de recherche + ou -, et le mastermind, respectivement accompagnés par 3 modes : le mode challenger, le mode défenseur, le mode duel.

Les deux jeux consistent à retrouver un code à l'aide d'informations. Ce mode correspond au mode Challenger. L'ordinateur peut aussi essayer de trouver votre code. Pour cela, il faut lancer le mode défenseur. Enfin, si vous voulez deviner un code avant que l'ordinateur ne trouve le votre, lancez le mode duel.

### Prérequis

Un invité de commande si vous n'ètes pas sous windows.

Le dossier 3_MettreMaLogiqueALepreuve de ce repertoire git hub

### Installation

Installer java 10.0.2

```
https://www.oracle.com/technetwork/java/javase/downloads/java-archive-javase10-4425482.html
```

Si vous voulez seulement tester le programme, récupérer le Java SE Development Kit 10.0.2
Si vous voulez aussi pouvoir modifier et compiler le programme, récupérer également le Java SE Runtime Environment 10.0.2

## Lancer le programme

* **Méthode 1 :** Sous windows
-> Dans le dossier launcher, double clicker sur

```
launchByDoubleClick.bat
```

* **Méthode 2 :** Via un invité de commande, sous windows, mac OSX
et linux, dans le dossier launcher, lancer la commande 

```
java -jar launchByCommand.jar
```

## Utiliser le programme

Tout se fait à l'aide du clavier. Vous pouvez naviguer dans les menus à l'aide des chiffres 1, 2 ou 3.

Réponder aux questions que le programme vous pose avec votre clavier.

## Paramétrer le programme

Ouvrir avec un éditeur de textes le fichier : 

```
config.properties
```

Changer les valeurs des variables pour paramétrer le programme

```
nbCase
```
nbCase correspond au nombre de chiffres d'un code

```
nbTry
```
nbTry correspond au nombre d'essais qu'un mode permet, avant d'afficher le Game Over

```
nbColors
```
nbColors correspond au nombre de couleurs possibles pour le jeu du mastermind

```
devMode
```
Si le devMode est égal à 1, vous aurez accès à des informations supplémentaires pour gagner plus facilement ou simplement tester le programme

## Auteurs

* **Thibaut Jouen**

