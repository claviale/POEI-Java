package m9genericite.tournoiDePileOuFace;

/*
 * Chaque annee, la ville de Las Vegas organise son celebre tournoi de pile ou face (c'est faux)
 * Les regles sont comme suit : 
 *  - chaque participant doit s'inscrire avant le debut du tournoi.
 *           Seul leur nom est enregistre et il ne doit y avoir aucun doublon parmi les inscrits
 *           
 *  - les inscriptions se terminent des que le participant "dobby" s'inscrit
 *  - une fois les inscriptions terminees, chaque participant joue, chacun son tour
 *  - pour jouer, un participant annonce "pile" ou "face" (saisie utilisateur)
 *           , puis, la piece est lancee
 *     
 *  - on conserve en memoire le score de chaque joueur.
 *  - des qu'un joueur atteint le score de 4 :
 *        > s'il reste des joueurs ce tour de jeu, ils peuvent jouer leur tour normalement
 *        > s'il ne reste aucun joueur, la partie est terminee
 *  - si la partie se termine avec plus d'un joueur ayant un score de 4, on entre en mode "golden coin" : 
 *        > chaque joueur joue a tour de role
 *        > chaque joueur qui perd est elimine, sauf si tous les joueurs perdent
 *        > le golden coin se poursuit jusqu'a ce qu'il ne reste plus qu'un joueur en lice
 *  
 *  A la fin du tournoi, le nom du joueur gagnant est annonce
 */
public class TesterPileOuFace {

}
