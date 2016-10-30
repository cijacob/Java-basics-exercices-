public class Facture
{
  public static void main(String args[])
  {
    final double tremise = 0.04; 
    final int mremise = 25000;
    final int pp1 = 10, pp2 = 15, pp3 = 20; 
    final double tva1 = 0.06, tva2 = 0.21; 
    
    
    int qp1, qp2, qp3; 
    double montant_htva; 
    double montant_tvac, a_payer, rist; 
    double totaltva1, totaltva2, totaltva3;
    
    
    System.out.println("Entrez les 3 quantites:"); 
    qp1= Clavier.lireInt(); 
    qp2= Clavier.lireInt();
    qp3= Clavier.lireInt();
    
    montant_htva = qp1*pp1 + qp2*pp2 + qp3*pp3;
    totaltva1 = (qp1*pp1)*tva1;
    totaltva2 =(qp2*pp2)*tva2;
    totaltva3 =(qp3*pp3)*tva1;
    montant_tvac = montant_htva + totaltva1 + totaltva2 + totaltva3; 
    
    if(montant_tvac > mremise)
      rist = montant_tvac *tremise; 
    else rist = 0; 
    a_payer = montant_tvac - rist; 
    
    System.out.println("montant htva: "+ montant_htva + " €"); 
    System.out.println("montant tvac: "+ montant_tvac + " €"); 
    System.out.println("Ristourne accordée: " + rist + " €"); 
    System.out.println("Total à payer: "+ a_payer + " €"); 
  }
}
    
      