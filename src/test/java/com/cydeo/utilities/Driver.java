package com.cydeo.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {

    /*
    Creat a private constructor no access to the object of this class from outside
     */
        private Driver(){ }
        /*
        Making our "driver" instance private no access from outside. making static becuase running before anything else. we can also use as static method
         */

    private static InheritableThreadLocal <WebDriver> driverPool = new InheritableThreadLocal<>() ;

    public static WebDriver getDriver(){

        if (driverPool.get() ==null){ // if driver/browser never been open

            String browserType = ConfigurationReader.getProperty("browser");

            switch (browserType){

                /*
                depending on the browserType our switch statement determine to open specific type of browser
                 */
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                   driverPool.set(new ChromeDriver());
                   driverPool.get() .manage().window().maximize();
//                   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                   break;

                case "firefox":
                    WebDriverManager.chromedriver().setup();
                    driverPool.set(new FirefoxDriver());
                    driverPool.get() .manage().window().maximize();
//                  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;
            }
        } // same driver instance will be returned everytime we call Driver.getDriver method
         return driverPool.get() ;


    }
    public static void closeDriver (){
        if (driverPool.get()!=null){
            driverPool.get().quit(); // this will kill the session.
            driverPool.remove(); // we need to assign driver to null in order to use it in next session (next test)
        }
    }
}
