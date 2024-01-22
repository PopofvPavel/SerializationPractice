package Person;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JsonRootName(value = "PersonInfo")
public class PersonInfo {
    @JsonProperty(value = "FindPersonInfo")
    private FindPersonInfo findPersonInfo;

    public FindPersonInfo getFindPersonInfo() {
        return findPersonInfo;
    }

    @Override
    public String toString() {
        return "PersonInfo{" +
                "findPersonInfo=" + findPersonInfo +
                '}';
    }

    public void setFindPersonInfo(FindPersonInfo findPersonInfo) {
        this.findPersonInfo = findPersonInfo;
    }
}
