import com.google.gson.JsonObject;
import io.qameta.allure.internal.shadowed.jackson.core.type.TypeReference;
import io.qameta.allure.internal.shadowed.jackson.databind.ObjectMapper;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FootballTest extends BaseTest{

    private final static String BASE_URL = "https://football.kulichki.net/";

    ObjectMapper objectMapper = new ObjectMapper();
    JSONParser parser = new JSONParser();

    @Test
    public void searchSite() throws IOException, ParseException {
        MainPage mainPage = new MainPage(BASE_URL);
        mainPage.clickTeamItaly();
        ItalianChampionshipPage italianChampionshipPage = new ItalianChampionshipPage();
        System.out.println(italianChampionshipPage.clubsList());
        Object obj = parser.parse(new FileReader("src/test/resources/expected.json"));
        JSONArray jsonArray = (JSONArray) obj;
//        List<Clubs> clubsListActual = new ArrayList<>();
//        for (int i = 0; i < jsonArray.size(); i++) {
//            clubsListActual.add(new Clubs(jsonArray[i]));
//        }
        System.out.println(jsonArray);

//        File file = new File("src/test/resources/expected.json");
//        List <Clubs> clubsListActual = objectMapper.readValue(file, new TypeReference<>(){});
//        System.out.println(clubsListActual);
        }
}
