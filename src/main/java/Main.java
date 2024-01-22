import Client.ClientInfo;
import Person.PersonInfo;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        ClientInfo clientInfo = Converter.readXMLFromFile("ClientInfo.xml", ClientInfo.class);
        System.out.println(clientInfo);
        PersonInfo personInfo = Converter.ConvertClientToPerson(clientInfo);
        System.out.println(personInfo);
        Converter.writeJSONToFile("PersonInfo.json", personInfo);

    }
}
