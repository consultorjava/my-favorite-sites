import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("---------MEUS SITES FAVORITOS----------");

        Scanner scanner = new Scanner(System.in);
        List<Website> meusWebSites = new ArrayList<>();

        System.out.print("Qual o nome do site: ");
        String nome = scanner.nextLine();
        System.out.print("Qual o enederço do site: ");
        String url = scanner.nextLine();

        Website website = new Website();
        website.setNome(nome);
        website.setUrl(url);

        meusWebSites.add(website);
    }
}