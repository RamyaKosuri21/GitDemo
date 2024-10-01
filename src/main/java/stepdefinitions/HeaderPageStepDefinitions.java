package stepdefinitions;

import iConnectAutomation.pageObjects.HomePage;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

public class HeaderPageStepDefinitions extends HomePage {


    @When("User clicks on Pricing Header Link")
    public void user_clicks_on_pricing_header_link() {
        WebElement pricingLink = driver.get().findElement(By.xpath("//a[@class='nav-link' and text()='Pricing']"));
        try {
            pricingLink.click();
            // System.out.println("Navigated to PricingPage");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @When("User verify Pricing text presence in Pricing page")
    public boolean user_verify_pricing_text_presence_in_pricing_page() {
        WebElement pricingText = driver.get().findElement(By.xpath("//h1[@class='text-white mb-1' and text()='Pricing']"));
        try {
            boolean actualresult = pricingText.isDisplayed();
            boolean expectedresult = true;
            SoftAssert sa = new SoftAssert();
            sa.assertEquals(actualresult, expectedresult);
            //  System.out.println("PricingPage Text verified");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return false;
    }
}
