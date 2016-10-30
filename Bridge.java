public class Bridge{
  public static void main(String [] args){
    
    
    String color, value; 
    int A = 4, R = 3, D = 2, V = 1;
    int P = 0, K = 0, T = 0, C = 0; 
    int point_honneur = 0, point_distribution = 0, total; 
    int nb_carte_pique = 0, nb_carte_trefle = 0, nb_carte_carreau = 0, nb_carte_coeur = 0;  
    
    
     for(int i = 0 ; i < 13 ; i++ ){
       System.out.println("Entrer une couleur de carte P, T, K, C");
       color = Clavier.lireString(); 
       System.out.println("Entrer la carte " + (i +1) + " A, R, D, V, X, 9, 8, 7, 6, 5, 4, 3, 2" );
       value = Clavier.lireString(); 
       
       switch(value){
       case "A": point_honneur += 4; 
       break; 
       case "R": point_honneur += 3; 
       break; 
       case "D" :point_honneur += 2; 
       break;
       case "V" : point_honneur =+ 1; 
       break;
       }
       switch(color){
         case "P" : nb_carte_pique += 1;
         break; 
         case ("P")*2 : nb_carte_pique += 2; 
         break; 
         case "P"*3 : nb_carte_pique +=3; 
         break;
       }
       switch(color){
         case "T" : nb_carte_trefle += 1;
         break; 
         case "T"*2 : nb_carte_trefle += 2; 
         break; 
         case "T"*3 : nb_carte_trefle +=3; 
         break;
       }
       switch(color){
         case "K" : nb_carte_coeur += 1;
         break; 
         case "K"*2 : nb_carte_coeur += 2; 
         break; 
         case "K"*3 : nb_carte_coeur +=3; 
         break;
       }
       switch(color){
         case "C" : nb_carte_carreau += 1;
         break; 
         case "C"*2 : nb_carte_carreau += 2; 
         break; 
         case "C"*3 : nb_carte_carreau +=3; 
         break;
       }
     }
     System.out.println("votre gain pour les points d'honneur sont de: " + point_honneur);
     System.out.println("Votre gain pour les points de distribution sont de: " + point_distribution); 
     total = (point_honneur - point_distribution); 
  }
}