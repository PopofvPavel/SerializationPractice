package Client;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement
public class ClientInfo {
    @JacksonXmlProperty
    private ClientFindInfo clientFindInfo;

    public void setClientFindInfo(ClientFindInfo clientFindInfo) {
        this.clientFindInfo = clientFindInfo;
    }
    public ClientInfo() {

    }

    public ClientFindInfo getClientFindInfo() {
        return clientFindInfo;
    }

    @Override
    public String toString() {
        return "Client.ClientInfo{" +
                "clientFindInfo=" + clientFindInfo +
                '}';
    }
}
