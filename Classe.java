public class Classe{
  public static void main(String [] args){
    
    int matricule; 
    double resultat_un, resultat_deux;
    double moyenne, moyenne_classe, total_math, total_physique;
    int nombre_echec_etudiant, nombre_echec_math, nombre_echec_physique, nombre_sans_echec_etudiant;
    String math, physique; 
    
    nombre_sans_echec_etudiant = 0; 
    nombre_echec_math = 0; 
    nombre_echec_physique = 0;
    total_math = total_physique = 0; 
    int nombre_etudiant = 0; 
    
    
    System.out.println("Entrer un numéro de matricule");
      matricule = Clavier.lireInt();
    //Tant que le matricule est différent de zéro on lit les deux quotes"
    while(matricule != 0){
      nombre_echec_etudiant = 0; // cette assigniation doit avoir lieu à l'intérieur de la boucle sinon les échecs des étudiants précédents s'accumulerait pour le nouvel étudiant
      nombre_etudiant ++; 
      System.out.println("Entrer la premiere note sur 20");
        resultat_un = Clavier.lireInt(); 
      System.out.println("Entrer la deuxième note sur 20");
        resultat_deux = Clavier.lireInt(); 
        moyenne = (resultat_un + resultat_deux)/2; 
        if (resultat_un < 10){
          nombre_echec_etudiant ++; 
          nombre_echec_math ++; 
          //System.out.println("total math: "+ total_math +" "+ resultat_un);
        }
        total_math += resultat_un;
        if (resultat_deux < 10){
          nombre_echec_etudiant ++;
          nombre_echec_physique ++;
        }
        
        total_physique += resultat_deux;
        if(nombre_echec_etudiant == 0){
          nombre_sans_echec_etudiant ++;    
        }
      System.out.println("moyenne: " + moyenne + ", nombre d'étudiant en echec: " + nombre_echec_etudiant);
      System.out.println("Entrer 0 pour quitter");
        matricule = Clavier.lireInt();
    }
    System.out.println("nombre d'étudiants: "+ nombre_etudiant);
    if(nombre_etudiant > 0){
      System.out.println("moyenne mathématique pour la classe: " + (total_math/nombre_etudiant)); 
      System.out.println("moyenne physique pour la classe: " + (total_physique/nombre_etudiant)); 
    } 
    else 
      System.out.println("Il n'y a pas d'étudiant dans la classe"); 
  }
}

//solution une 
//lire matricule 
//while (matricule != 0)
//lire quote_un
//lire quote_deux
//int_etudiant -> afficher etudiant
//preparer int_classe
//lire matricule
//fin while
//int classe

//-------------------------------------------------------
//solution deux 
//do {
// lire matricule 
// if matricule != 0
//lire quote_un
//lire quote_deux 
//int etudiant -> afficher 
//preparet tot classe
// }while (matricule != 0)
// total classe 