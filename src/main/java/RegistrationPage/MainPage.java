package RegistrationPage;

import Core.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage {

//    1
    @FindBy(id = "//input[@id='firstName']")
    private WebElement firstName;
//    2
    @FindBy(id = "//input[@id='lastName']")
    private WebElement lastName;
    //    3
    @FindBy(id = "//input[@id='userEmail']")
    private WebElement email;
//     5
    @FindBy(id = "//input[@id='userNumber']")
    private WebElement userNumber;
//    6
    @FindBy(id = "//input[@id='dateOfBirthInput']")
    private WebElement dateArea;
//    6 table
    @FindBy (id = "//input[@id='dateOfBirthInput']//div[@aria-label='Choose Wednesday, February 7th, 2024']")
    private WebElement dateAreaSelect;

    //    7
    @FindBy(css = "#subjectsContainer > div > div.subjects-auto-complete__value-container.subjects-auto-complete__value-container--is-multi.css-1hwfws3")
    private WebElement subjects;
//    9
    @FindBy(id = "//textarea[@id='currentAddress']")
    private WebElement currentAddress;
    //    10
    @FindBy(css = "#state > div > div.css-1hwfws3 > div.css-1wa3eu0-placeholder")
    private WebElement state;
    //    10
    @FindBy(css = "#state > div > div.css-1hwfws3 > div.css-1uccc91-singleValue")
    private WebElement stateSelect;

    //    11
    @FindBy(css = "#stateCity-wrapper > div:nth-child(3)")
    private WebElement city;
    // 11
    @FindBy(css = "#city > div > div.css-1hwfws3 > div.css-1uccc91-singleValue")
    private WebElement citySelect;
}
