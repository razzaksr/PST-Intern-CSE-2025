package design.lld;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        OfferService offerService = new OfferService();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Zealous Finance Limited");
        while (true) {
            System.out.println("1. Create new loan offer\n2. View all Offers\n3. Update Exists offer\n4. Cancel exists offer\nAny to logout");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    Offers offers = new Offers();
                    System.out.println("Enter the id, name, roi, type ");
                    offers.setOfferId(scanner.nextInt());
                    offers.setOfferName(scanner.next());
                    offers.setOfferRoi(scanner.nextDouble());
                    offers.setOfferType(scanner.next());
                    System.out.println(offerService.newOffer(offers));
                    break;
                case 2:
                    System.out.println("Following are available offers\n"+offerService.viewOffers());
                    break;
                case 3:
                    System.out.println("Enter the offer id");
                    offerService.alterOffer(scanner.nextInt());
                    break;
                case 4:
                    System.out.println("Enter the offer id");
                    System.out.println(offerService.discontinue(scanner.nextInt()));
                    break;
                default:
                    return;
            }
        }
    }
}
