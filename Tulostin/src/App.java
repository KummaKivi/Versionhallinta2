public class App {
    public static void main(String[] args) throws Exception {

        String tekija = "Daniel";

        double luku1 = 5; 
        double luku2 = 2; 
        double tulo;
        double erotus = luku1 - luku2;
        double summa = luku1 + luku2;
        double jako = luku1 / luku2;
        
        tulo = luku1 * luku2;
       
        System.out.println("Hei olen Tulostin-ohjelma");
        System.out.println("Ohjelman tekijä: " + tekija);
 
        System.out.println("Luku1-muuttujan arvo on " + luku1);
        System.out.println("Luku2-muuttujan arvo on " + luku2);

        System.out.println(luku1 + " * " + luku2 + " = " + tulo);

        System.out.println("Erotus tulos: " + erotus);
        System.out.println("Summa tulos: " + summa);
        System.out.println("Jako tulos: " + jako);

    }
}
