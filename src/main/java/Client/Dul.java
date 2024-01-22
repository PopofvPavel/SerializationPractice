package Client;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Dul {
    @JacksonXmlProperty
    private int documentType;
    @JacksonXmlProperty
    private String firstName;
    @JacksonXmlProperty
    private String lastName;
    @JacksonXmlProperty
    private String secondName;
    @JacksonXmlProperty
    private int number;
    @JacksonXmlProperty
    private int series;

    public Dul() {
    }

    @Override
    public String toString() {
        return "Client.Dul{" +
                "documentType=" + documentType +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", number=" + number +
                ", series=" + series +
                '}';
    }

    public int getDocumentType() {
        return documentType;
    }

    public void setDocumentType(int documentType) {
        this.documentType = documentType;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public Dul(int documentType, String firstName, String lastName, String secondName, int number, int series) {
        this.documentType = documentType;
        this.firstName = firstName;
        this.lastName = lastName;
        this.secondName = secondName;
        this.number = number;
        this.series = series;
    }
}
