import java.util.Scanner;

public class Login {

    // kommentti git palautukseens
    public static String generateEmail(String firstName, String lastName, String domain)
    {
        // Luo emailin annetuista tiedoista 
        return firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + domain + ".fi";
    }

    public static String generateUsername(String firstName, String lastName)
    {
        // Luo käyttäjänimen nimen 4 ensimmäisestä merkistä ja sukunimen 4 viimeisestä merkistä
        String firstPart = firstName.length() >= 4 ? firstName.substring(0, 4) : firstName;
        String lastPart = lastName.length() >= 4 ? lastName.substring(lastName.length() - 4) : lastName;
        return (firstPart + lastPart).toLowerCase();
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name;
        String surname;
        String domain;

        System.out.println("Etunimi?");
        name = scanner.nextLine();

        System.out.println("Sukunimi?");
        surname = scanner.nextLine();

        System.out.println("Yrityksen verkkotunnus?");
        domain = scanner.nextLine();

        // Katsoo onko mikään kohta tyhjänä
        if (name.isEmpty() || surname.isEmpty() || domain.isEmpty())
        {
            System.out.println("Virhe! Jokin tiedoista puuttui.");
        }

        else 
        {
            // Luo käyttäjänimen ja emailin
            String email = generateEmail(name, surname, domain);
            String username = generateUsername(name, surname);
            
            // Printtaa luodut tunnukset
            System.out.println(email);
            System.out.println(username);
        }

        scanner.close();
    }

}
