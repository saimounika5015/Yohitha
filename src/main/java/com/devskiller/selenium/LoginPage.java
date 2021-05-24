package com.devskiller.selenium;

import org.openqa.selenium.WebDriver;

public class LoginPage {

    private static final String URL = "http://localhost:8089/index.html";
    private final WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void open(String... queryParams) {
        String queryString = QueryStringBuilder.buildQueryString(queryParams);
        driver.get(URL + queryString);
    }

    public void fillCredentials(String username, String password) {
            
            uName = driver.find_element_by_id("uid");
            uName.clear();
            uName.send_keys(username);

            pwd = driver.find_element_by_name("pwd");
            pwd.clear();
            pwd.send_keys(password);
      
      //TODO implementation
    }

    public void clickLoginButton() {
        driver.findElement(By.linkText("Login")).click();
        //TODO implementation
    }

    public String getErrorMessage() {
        //TODO implementation
        return null;
    }

    public void setRememberMeChecked(boolean checked) {
        //TODO implementation
    }
}
