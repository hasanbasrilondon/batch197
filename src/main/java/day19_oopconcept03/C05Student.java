package day19_oopconcept03;

public class C05Student {
    private String stId = "TH001";
    private String illness= "depression";
    private double gpa= 3.98;
    private boolean disability= false;
    // How to read encapsulated data:
    // All get() mthds starts with "get" key word except booleans
    public String getStId(){
        return  stId;
    }
    public String getIllness(){
        return illness;
    }
    public double getGpa() {
        return gpa;
    }
    public boolean isDisability() {    // booleans getters starts with "is"
        return disability;
    }
    // If we want to update encapsulated data we use setters:
    public void setStId(String stId){
        this.stId= stId;
    }


}
