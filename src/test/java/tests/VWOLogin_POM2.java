package tests;

import com.project.pages.PageObjectModel.LoginPage_POM;
import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VWOLogin_POM2 {
    @Test
    public void VWOInvaliduser() {

        LoginPage_POM LoginPagePom = new LoginPage_POM();
        String error_msg_text=LoginPagePom.VWOInvalidCreds();
        Assert.assertEquals(error_msg_text,"Your email, password, IP address or location did not match");


    }



}
