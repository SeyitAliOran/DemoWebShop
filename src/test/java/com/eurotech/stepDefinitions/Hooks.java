package com.eurotech.stepDefinitions;

import com.eurotech.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.util.concurrent.TimeUnit;

public class Hooks { // kanca demek.Butun testlerimizden once bu kancayi takiyoruz
    // Before ve after method annotion lari gordugun de direkt calistirir
    // class in isminin bir onemi yok
    @Before
    public void setUp(){
       // System.out.println("\tThis is coming from Before Method");
        Driver.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Driver.get().manage().window().maximize();
    }
    @After
    public void tearDown(Scenario scenario){  // screenshot almak icin  olusturduk
            if(scenario.isFailed()){
                final byte [] screenschot=((TakesScreenshot)Driver.get()).getScreenshotAs(OutputType.BYTES);
                scenario.attach(screenschot,"image/png","screenshot");
            }
       // System.out.println("\tThis is coming from After Method");
       // Driver.closeDriver();
    }
    @Before("@db") // tag uzerinden secilen test senaryolari icin aktif hala gelebilir.
    public void setUpDB(){
        //System.out.println("\tConnecting DB");
    }
    @After("@db")
    public void tearDownDB(){
        //System.out.println("\tDisconnecting DB");
    }
}
