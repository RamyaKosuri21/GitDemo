package stepdefinitions;

import iConnectAutomation.base.Base;
import iConnectAutomation.pageObjects.HomePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

public class FooterPageStepDefinitions extends HomePage {


    @When("User clicks on Privacy Policy Footer Link")
    public void user_clicks_on_privacy_policy_footer_link() {
        WebElement privacyPolicyLink = driver.get().findElement(By.xpath("//a[@class='text-white' and text()='Privacy Policy']"));
        try {
            privacyPolicyLink.click();
            // System.out.println("Navigated to PrivacyPolicyPage");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @When("User verify Privacy Policy text presence in Privacy Policy page")
    public boolean user_verify_privacy_policy_text_presence_in_privacy_policy_page() {
        WebElement privacyPolicyText = driver.get().findElement(By.xpath("//h1[@class='text-white mb-1' and text()='Privacy Policy']"));
        try {
            boolean actualresult = privacyPolicyText.isDisplayed();
            boolean expectedresult = true;
            SoftAssert sa = new SoftAssert();
            sa.assertEquals(actualresult, expectedresult);
            //  System.out.println("PrivacyPolicyPage Text verified");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return false;
    }


    @When("User clicks on TermsOfUse Footer Link")
    public void user_clicks_on_terms_of_use_footer_link() {
        WebElement termsOfUseLink = driver.get().findElement(By.xpath("//a[@class='text-white' and normalize-space()='Terms of use']"));
        try {
            termsOfUseLink.click();
            // System.out.println("Navigated to termsOfUsePage");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @When("User verify TermsOfUse text presence in TermsOfUse page")
    public boolean user_verify_terms_of_use_text_presence_in_terms_of_use_page() {
        WebElement termsOfUseText = driver.get().findElement(By.xpath("//h1[@class='text-white mb-1' and text()='Terms of Services']"));
        try {
            boolean actualresult = termsOfUseText.isDisplayed();
            boolean expectedresult = true;
            SoftAssert sa = new SoftAssert();
            sa.assertEquals(actualresult, expectedresult);
            //  System.out.println("termsOfUsePage Text verified");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return false;

    }


}
