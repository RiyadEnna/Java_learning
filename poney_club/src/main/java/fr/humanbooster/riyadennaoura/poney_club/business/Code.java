package fr.humanbooster.riyadennaoura.poney_club.business;

public class Code {
    private String value;

    public Code(String value) {
        this.value = value;
    }

    public String getCode() {
        return value;
    }

    public void setCode(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
