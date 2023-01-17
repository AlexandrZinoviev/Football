import com.codeborne.selenide.ElementsCollection;
import io.qameta.allure.Step;

import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.Selenide.$$x;

public class ItalianChampionshipPage {

    private final ElementsCollection clubs = $$x("//tbody/tr/td[2]/b/font/a");
    private final ElementsCollection points = $$x("//tbody/tr/td[8]/font/b");

    List<Clubs> clubsList = new ArrayList<>();

    @Step("Получаем список клубов")
    public List<Clubs> clubsList() {
        for (int i = 0; i < clubs.size(); i++) {
            clubsList.add(new Clubs(clubs.get(i).getText(), Integer.parseInt(points.get(i).getText())));
        }
        return clubsList;
    }
}
