package Person;

import com.fasterxml.jackson.annotation.JsonProperty;

public class IdentityCard {
    public IdentityCard(int idType, int idSeries, int idNum) {
        this.idType = idType;
        this.idSeries = idSeries;
        this.idNum = idNum;
    }

    @JsonProperty
    private int idType;
    @JsonProperty
    private int idSeries;
    @JsonProperty
    private int idNum;

    public int getIdType() {
        return idType;
    }

    public void setIdType(int idType) {
        this.idType = idType;
    }

    public int getIdSeries() {
        return idSeries;
    }

    public void setIdSeries(int idSeries) {
        this.idSeries = idSeries;
    }

    public int getIdNum() {
        return idNum;
    }

    public void setIdNum(int idNum) {
        this.idNum = idNum;
    }

    @Override
    public String toString() {
        return "IdentityCard{" +
                "idType=" + idType +
                ", idSeries=" + idSeries +
                ", idNum=" + idNum +
                '}';
    }
}
