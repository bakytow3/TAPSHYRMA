import java.util.Scanner;

public enum Kundor {
    DUYSHOMBU("DUYSHOMBU kunu java okuym"),
    SHEYSHEMBI("SHEYSHEMBI kunu java okuym"),
    SHARSHEMBI("SHARSHEMBI kunu java okuym"),
    BEYSHEMBI("BEYSHEMBI kunu java okuym"),
    JUMA("JUMA kunu java okuym"),
    ISHEMBI("ISHEMBI kunu java okuym"),
    JEKSHEMBI("JEKSHEMBI kunu java okuym");
private String value;

    Kundor(String value) {
        this.value=value;
    }
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }



    }

