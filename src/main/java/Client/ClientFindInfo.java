package Client;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class ClientFindInfo {
    @JacksonXmlProperty
    private Dul dul;
    @JacksonXmlProperty
    private int partyId;

    public Dul getDul() {
        return dul;
    }

    @Override
    public String toString() {
        return "Client.ClientFindInfo{" +
                "dul=" + dul +
                ", partyId=" + partyId +
                '}';
    }

    public void setDul(Dul dul) {
        this.dul = dul;
    }

    public int getPartyId() {
        return partyId;
    }

    public void setPartyId(int partyId) {
        this.partyId = partyId;
    }
}
