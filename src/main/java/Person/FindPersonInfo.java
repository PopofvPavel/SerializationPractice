package Person;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FindPersonInfo {
    @JsonProperty(value = "PartyID")
    private int partyID;
    @JsonProperty(value = "IdentityCard")
    private IdentityCard identityCard;
    @JsonProperty(value = "PersonName")
    private PersonName personName;

    @Override
    public String toString() {
        return "FindPersonInfo{" +
                "partyID=" + partyID +
                ", identityCard=" + identityCard +
                ", personName=" + personName +
                '}';
    }

    public PersonName getPersonName() {
        return personName;
    }

    public void setPersonName(PersonName personName) {
        this.personName = personName;
    }

    public IdentityCard getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(IdentityCard identityCard) {
        this.identityCard = identityCard;
    }
    public int getPartyID() {
        return partyID;
    }
    public void setPartyID(int partyID) {
        this.partyID = partyID;
    }

}
