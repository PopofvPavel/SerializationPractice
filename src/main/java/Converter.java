import Client.ClientInfo;
import Person.FindPersonInfo;
import Person.IdentityCard;
import Person.PersonInfo;
import Person.PersonName;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.File;
import java.io.IOException;

public class Converter {

    public static <T> T readXMLFromFile(String path, Class<T> convertedClass) throws IOException {
        XmlMapper xmlMapper = new XmlMapper();
        File clientInfoFile = new File(path);
        return xmlMapper.readValue(clientInfoFile,convertedClass);

    }

    public static PersonInfo ConvertClientToPerson(ClientInfo clientInfo) {
        PersonInfo personInfo = new PersonInfo();
        FindPersonInfo findPersonInfo = new FindPersonInfo();
        setFindPersonInfo(findPersonInfo,clientInfo);
        personInfo.setFindPersonInfo(findPersonInfo);
        return personInfo;
    }

    private static void setFindPersonInfo(FindPersonInfo findPersonInfo,ClientInfo clientInfo) {
        String firstName = clientInfo.getClientFindInfo().getDul().getFirstName();
        String lastName = clientInfo.getClientFindInfo().getDul().getLastName();
        String middleName = clientInfo.getClientFindInfo().getDul().getSecondName();
        findPersonInfo.setPersonName(new PersonName(firstName, lastName, middleName));

        int idType = clientInfo.getClientFindInfo().getDul().getDocumentType();
        int idSeries = clientInfo.getClientFindInfo().getDul().getSeries();
        int idNum = clientInfo.getClientFindInfo().getDul().getNumber();
        findPersonInfo.setIdentityCard(new IdentityCard(idType,idSeries,idNum));

        findPersonInfo.setPartyID(clientInfo.getClientFindInfo().getPartyId());
    }

    public static <T> void writeJSONToFile(String path, T object) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.enable(DeserializationFeature.UNWRAP_ROOT_VALUE);
        objectMapper.enable(SerializationFeature.WRAP_ROOT_VALUE);
        objectMapper.writeValue(new File(path), object);
    }
}
