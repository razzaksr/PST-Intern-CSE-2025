package design.lld;

import java.io.Serializable;

public class Offers implements Serializable{
    private int offerId;
    private String offerName;
    private String offerType;
    private double offerRoi;
    public Offers(int offerId, String offerName, String offerType, double offerRoi) {
        this.offerId = offerId;
        this.offerName = offerName;
        this.offerType = offerType;
        this.offerRoi = offerRoi;
    }
    public Offers() {
    }
    @Override
    public String toString() {
        return "Offers [offerId=" + offerId + ", offerName=" + offerName + ", offerType=" + offerType + ", offerRoi="
                + offerRoi + "]\n";
    }
    public int getOfferId() {
        return offerId;
    }
    public void setOfferId(int offerId) {
        this.offerId = offerId;
    }
    public String getOfferName() {
        return offerName;
    }
    public void setOfferName(String offerName) {
        this.offerName = offerName;
    }
    public String getOfferType() {
        return offerType;
    }
    public void setOfferType(String offerType) {
        this.offerType = offerType;
    }
    public double getOfferRoi() {
        return offerRoi;
    }
    public void setOfferRoi(double offerRoi) {
        this.offerRoi = offerRoi;
    }
}
