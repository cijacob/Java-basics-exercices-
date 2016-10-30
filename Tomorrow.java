public class Tomorrow{
  public static void main(String [] args){
    
    int jour, mois, annee, dernier_jour; 
    
    System.out.println("Veuillez indiquer le jour, au format jj");
      jour  = Clavier.lireInt();
    System.out.println("Veuillez indiquer le mois, au format mm");
      mois = Clavier.lireInt();
    System.out.println("Veuillez indiquer l'année, au format aaaa"); 
      annee  = Clavier.lireInt(); 
      
     dernier_jour = 0; 
     switch(mois){
     case 1: case 3: case 5: case 7: case 8: case 10: case 12: dernier_jour = 31; break; 
     case 4: case 6: case 9: case 11: dernier_jour = 30; break; 
     case 2: if (((annee % 4 == 0) && (annee % 100 != 0))||(annee % 400 == 0 )){
         dernier_jour = 28; 
       }else{ 
         dernier_jour = 27; 
       }break;
      }
    
     if((jour == dernier_jour) && (mois == 12)) {
       jour = 1;
       mois = 1;
       annee ++;
     }
     else if((jour == dernier_jour) && ( mois != 12)){
       jour = 1;
       mois ++ ;
     }
     else{
       jour ++; 
     }
      System.out.print("Le lendemain sera: " + jour + "/" + mois + "/" + annee);
  }
}