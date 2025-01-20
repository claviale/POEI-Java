package m0miniprojet.donjon;

/*
 * Ce mini projet consiste a creer un jeu de porte-monstre-tresor inspire de Donjon et Dragon
 * Dans ce jeu, vous incarnez un aventurier qui explore les salles d'un donjon
 * 
 * Votre aventurier dispose des caracteristiques suivantes : 
 *  - un montant de point de vie
 *  - un montant de degat
 *  - un montant de pieces d'or
 *  - une position en x
 *  - une position en y
 * Cette position represente la position de notre personnage sur la carte du donjon
 * 
 * Un donjon dispose des caracteristiques suivantes : 
 *  - une taille
 *  - une grille de salles
 *  
 * Il existe une multitude de salles differentes. Une salle dispose de 5 booleens :
 *  - dejaExploree 
 *  - porteNord
 *  - porteSud
 *  - porteOuest
 *  - porteEst
 * Cette information permet au joueur de savoir dans quelle direction il peut avancer.
 * Une salle dispose egalement de la methode "fouiller", qui a un comportement different en fonction du type de salle : 
 *  - salle vide : la methode fouiller affiche "vous ne trouvez rien"
 *  - salle monstre : la methode fouiller realise le combat entre l'aventurier et le monstre trouve
 *  - salle soin : la methode fouiller restitue un certain nombre de points de vie a l'aventurier
 *  - salle tresor : la methode fouiller augmente le montant de piece d'or du joueur
 *  - salle du boss : la methode fouiller realise le combat, puis met fin a l'exploration du donjon
 * Si un joueur retourne dans une piece deja exploree, la methode "fouiller" ne fait rien
 * 
 * Un monstre dispose des attributs suivants : 
 *  - un nom
 *  - un montant de point de vie
 *  - un montant de degats
 * 
 * Lorsqu'un combat a lieu, c'est toujours l'aventurier qui attaque le premier.
 * Des que l'aventurier ou le monstre tombe sous le seuil de 0 point de vie, le combat se termine
 * 
 * A chaque tour de jeu :
 *  - la carte du donjon s'affiche. Les salles non explorees s'affichent avec un ".". Les salles explorees s'affichent avec un "x"
 *  - les portes possibles sont affichees pour permettre au joueur de choisir sa direction
 *  - le joueur peut choisir la direction dans laquelle il souhaite avancer (haut, bas, gauche, droite)
 *  - la partie prend fin lorsque l'aventurier tombe sous le seuil de 0 point de vie ou s'il bat le boss du donjon
 *  
 * 
 * Pour aller plus loin : 
 * 
 * Ajoutez un attribut "equipements" a l'aventurier.
 * Un aventurier peut porter jusqu'a 6 equipements : une armure, une paire de botte, deux anneaux et deux armes
 * Une arme peut etre a une main ou a deux mains. Il est possible d'equiper deux armes a une main, ou une arme a deux mains
 * 
 * Lors d'un combat, les statistiques du personnages sont affectees par ses equipements
 * 
 * Ajoutez une salle magasin.
 * Cette salle magasin permet au joueur de depenser son or contre des equipements.
 * Un equipement achete est automatiquement equipe.
 * Contrairement aux autres salles, revenir dans la salle "magasin" permet de consulter a nouveau le magasin
 */
public class TesterDonjon {

}
