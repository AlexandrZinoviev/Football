
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.*;


public class MainPage {
    private final SelenideElement articleTitle = $x("//a[text () ='Италия']");

    public MainPage(String url){
        open(url);
    }

    @Step ("Переходим по ссылке 'Команды: Италия'")
    public void clickTeamItaly() {
        articleTitle.click();
    }
}
