package design.lld;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OfferService implements OfferRemote{

    // temp storage
    private List<Offers> tempOffers = new ArrayList<>();

    // perm storage
    private File file = new File("loanoffers.doc");

    private void readFile(){
        try{
            if(!file.exists()){
                writeFile();
                return;
            }
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            tempOffers = (List<Offers>)ois.readObject();
            ois.close();
            fis.close();
        }
        catch(Exception i){}
    }

    private void writeFile(){
        try{
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(tempOffers);
            oos.close();
            fos.close();
            tempOffers.clear();
        }
        catch(IOException ioException){}
    }

    private Scanner scanner = new Scanner(System.in);

    // public OfferService() {
    //     tempOffers = Stream.of(
    //         new Offers(9837,"Mudra","business",12.4),
    //         new Offers(1121,"TNPS","personal",16.8),
    //         new Offers(3434,"Awas Yojana","education",7.8),
    //         new Offers(3453,"PMKAY","house",9.1)
    //     ).collect(Collectors.toList());
    // }

    @Override
    public String newOffer(Offers offers) {
        readFile();
        tempOffers.add(offers);
        writeFile();
        return offers.getOfferName()+" has been introduced";
    }

    @Override
    public List<Offers> viewOffers() {
        // TODO Auto-generated method stub
        readFile();
        return tempOffers;
    }

    @Override
    public void alterOffer(int offerId) {
        // TODO Auto-generated method stub
        readFile();
        tempOffers = tempOffers.stream().map(v->{
            if(v.getOfferId() == offerId){
                System.out.println(v);
                System.out.println("Tell us what to update name/roi/type ");
                String choice = scanner.next();
                switch (choice) {
                    case "name":
                        System.out.println("Entre the new name ");
                        v.setOfferName(scanner.next());
                        System.out.println(offerId+" impacted");
                        break;
                    case "roi":
                        System.out.println("entre the new ROI ");
                        v.setOfferRoi(scanner.nextDouble());
                        System.out.println(offerId+" impacted");
                        break;
                    case "type":
                        System.out.println("Enter the new type of the loan ");
                        v.setOfferType(scanner.next());
                        System.out.println(offerId+" impacted");
                        break;
                    default:
                        System.out.println("Invalid property to update");
                        break;
                }
            }
            return v;
        }).collect(Collectors.toList());
        writeFile();
    }

    @Override
    public String discontinue(int offerId) {
        readFile();
        // TODO Auto-generated method stub
        int beforeSize = tempOffers.size();
        tempOffers = tempOffers.stream().filter(v->{
            return v.getOfferId()!=offerId;
        }).collect(Collectors.toList());
        if(beforeSize!=tempOffers.size()){
            writeFile();
            return offerId+" has been discontinued";
        }
        return offerId+" not available";
    }
}
