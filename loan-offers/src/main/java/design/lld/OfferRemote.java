package design.lld;

import java.util.List;

public interface OfferRemote {
    // abstract methods
    String newOffer(Offers offers); // create
    List<Offers> viewOffers();
    void alterOffer(int offerId);
    String discontinue(int offerId);
}
