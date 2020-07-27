package com.objectcomputing.assessment.prasad.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class SummaryPage {

    String check;

    String temptest1;
    String temptest2;
    String temptest3;
    String temptest4;

    public void setCurrentLevel(String getcheck) {
        check = getcheck;
    }

    public void setGoal(String getGoal) {
        check = getGoal;
    }

    public void suggestItMaturity(WebDriver driver) throws InterruptedException {

        // *** Cost and Maintainability Vertical Bar Position ***///

        WebElement e1 = driver.findElement(By.xpath("//html/body/div/div/div[2]/div[1]/div[3]"));


        // To find and print the Top coordinates
        Point actlocation = e1.getLocation();

        int xco1 = actlocation.getX();
        int yco1 = actlocation.getY();

        System.out.println();
        System.out.println(
                "\"Cost & Maintainability assessment\"Current X-Coordinate is : " + xco1);
        System.out.println(
                "\"Cost & Maintainability assessment \"Current Y-Coordinate is :" + yco1);
        System.out.println();

        // *** Functional Range / Future Proof ***///

        WebElement e2 = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div[3]"));


        Point actlocation2 = e2.getLocation();
        // System.out.println(actlocation2);

        int xco2 = actlocation2.getX();
        int yco2 = actlocation2.getY();

        System.out
                .println("\"Functional Range / Future Proof\"Current X-Coordinate is : " + xco2);
        System.out
                .println("\"Functional Range / Future Proof \"Current Y-Coordinate is : " + yco2);

        System.out.println();

        // *** Availability ***///

        WebElement e3 = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[3]/div[3]"));


        Point actlocation3 = e3.getLocation();
        // System.out.println(actlocation3);

        int xco3 = actlocation3.getX();
        int yco3 = actlocation3.getY();

        System.out.println("\"Availability\" Current X-Coordinate is : " + xco3);
        System.out.println("\"Availability\" Current Y-Coordinate is : " + yco3);

        System.out.println();

        // *** Security ***///

        WebElement e4 = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[4]/div[3]"));


        Point actlocation4 = e4.getLocation();
        // System.out.println(actlocation4);

        int xco4 = actlocation4.getX();
        int yco4 = actlocation4.getY();

        System.out.println("\"Security\" Current X-Coordinate is : " + xco4);
        System.out.println("\"Security\" Current Y-Coordinate is : " + yco4);

        System.out.println();

        // *** Innovation / Time-to-Market ***///
        WebElement e5 = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[5]/div[3]"));

        Point actlocation5 = e5.getLocation();
        // System.out.println(actlocation5);

        int xco5 = actlocation5.getX();
        int yco5 = actlocation5.getY();

        System.out.println("\"Innovation / Time-to-Market\" Current X-Coordinate is : " + xco5);
        System.out.println("\"Innovation / Time-to-Market\" Current Y-Coordinate is : " + yco5);

        System.out.println();

    }

    public void verifyCurrentGoals(WebDriver driver) throws InterruptedException {

        // *** Cost and Maintainability Vertical Bar Position ***///

        WebElement g1 = driver.findElement(By.xpath("//html/body/div/div/div[2]/div[1]/div[4]"));

        // To find and print the Top coordinates
        Point actlocation = g1.getLocation();
        // System.out.println(actlocation);

        int xco1 = actlocation.getX();
        int yco1 = actlocation.getY();

        System.out.println();
        System.out.println(
                "********  Base on the quick assessment of your IT maturity, this is the current Position       ************");
        System.out.println();
        System.out.println("\"Cost & Maintainability assessment\" The current XY-Coordinates are: " + xco1 + " " + yco1);
        System.out.println();

        // *** Functional Range / Future Proof ***///

        WebElement g2 = driver.findElement(By.xpath("//html/body/div/div/div[2]/div[2]/div[4]"));

        Point actlocation2 = g2.getLocation();
        // System.out.println(actlocation2);

        int xco2 = actlocation2.getX();
        int yco2 = actlocation2.getY();

        //Dimension size2 = g2.getSize();

        System.out.println("\"\"Functional Range / Future Proof\"Current XY-Coordinates are: " + ":" + xco2 + " " + yco2);

        System.out.println();

        // *** Availability ***///

        WebElement g3 = driver.findElement(By.xpath("//html/body/div/div/div[2]/div[3]/div[4]"));


        Point actlocation3 = g3.getLocation();
        // System.out.println(actlocation3);

        int xco3 = actlocation3.getX();
        int yco3 = actlocation3.getY();

        System.out.println("\"Availability\"Current XY-Coordinates are: " + xco3 + " " + yco3);

        System.out.println();

        // *** Security ***///

        WebElement g4 = driver.findElement(By.xpath("//html/body/div/div/div[2]/div[4]/div[4]"));

        Point actlocation4 = g4.getLocation();
        // System.out.println(actlocation4);

        int xco4 = actlocation4.getX();
        int yco4 = actlocation4.getY();


        System.out.println("\"Security\"Current XY-Coordinates are: " + xco4 + " " + yco4);

        System.out.println();

        // *** Innovation / Time-to-Market ***///
        WebElement g5 = driver.findElement(By.xpath("//html/body/div/div/div[2]/div[5]/div[4]"));

        Point actlocation5 = g5.getLocation();
        // System.out.println(actlocation5);

        int xco5 = actlocation5.getX();
        int yco5 = actlocation5.getY();

        System.out.println("\"Innovation / Time-to-Market\"Current XY-Coordinates are: " + xco5 + " " + yco5);

        System.out.println();

    }

    public void dragGoalsHorizontally(WebDriver driver) throws InterruptedException {

        /// *** Drag the "Cost / Maintainability" ***///

        TimeUnit.SECONDS.sleep(3);

        WebElement dragElementFrom1 = driver.findElement(By.xpath("//*[@id='app']/div/div[2]/div[1]/div[4]"));
        new Actions(driver).dragAndDropBy(dragElementFrom1, (int) 631.593, 0).build().perform();
        TimeUnit.SECONDS.sleep(3);

        // WebElement dragElementFrom1 =
        // driver.findElement(By.xpath("//*[@id='app']/div/div[2]/div[1]/div[4]"));
        // Actions action1 = new Actions(driver);
        // action1.dragAndDropBy(dragElementFrom1, (int) 631.593, 0).build().perform();

        TimeUnit.SECONDS.sleep(3);

        /// *** Drag the "Functional Range / Future Proof" ***///

        WebElement dragElementFrom2 = driver.findElement(By.xpath("//*[@id='app']/div/div[2]/div[2]/div[4]"));
        new Actions(driver).dragAndDropBy(dragElementFrom2, (int) 262.56, 0).build().perform();
        TimeUnit.SECONDS.sleep(3);

        /// *** Drag the "Availability" ***///

        WebElement dragElementFrom3 = driver.findElement(By.xpath("//*[@id='app']/div/div[2]/div[3]/div[4]"));
        new Actions(driver).dragAndDropBy(dragElementFrom3, (int) 579.678, 0).build().perform();
        TimeUnit.SECONDS.sleep(3);

        /// *** Drag the "Security" ***///

        WebElement dragElementFrom4 = driver.findElement(By.xpath("//*[@id='app']/div/div[2]/div[4]/div[4]"));
        new Actions(driver).dragAndDropBy(dragElementFrom4, (int) 468.021, 0).build().perform();
        // new Actions(driver).dragAndDropBy(dragElementFrom4, (int) 468.021,
        // 0).build().perform();

        TimeUnit.SECONDS.sleep(3);

        /// *** Drag the "Innovation / Time-to-Market" ***///

        WebElement dragElementFrom5 = driver.findElement(By.xpath("//*[@id='app']/div/div[2]/div[5]/div[4]"));
        new Actions(driver).dragAndDropBy(dragElementFrom5, (int) 532.157, 0).build().perform();
        TimeUnit.SECONDS.sleep(3);

    }

    public void dragtTestGoalsHorizLoop(WebDriver driver) throws InterruptedException {

        /// *** Drag the "Cost / Maintainability" ***///

        TimeUnit.SECONDS.sleep(3);
        // float xfinalcord1 = (float) 1439.2;

        // org.openqa.selenium.Dimension wtest =
        // driver.findElement(By.xpath("//html/body/div/div/div[2]/div[1]")).getSize();

        // System.out.println("Size of the button : "+ wtest);
        // System.out.println("Width of the button with constant : "+ wtest.width);

        for (int i = 1; i < 6; i++) {

            org.openqa.selenium.Dimension wtest = driver.findElement(By.xpath("//html/body/div/div/div[2]/div[1]"))
                    .getSize();

            String dragit = "//*[@id='app']/div/div[2]/div[" + (i) + " ]/div[4]";

            WebElement dragElementFrom1 = driver.findElement(By.xpath(dragit));
            org.openqa.selenium.Point point1 = dragElementFrom1.getLocation();

            float xcord1 = point1.getX();
            float xfinalcord1 = (float) wtest.width;
            float xmovecord1 = xfinalcord1 - xcord1;
            //System.out.println("xmovecord1:" + xmovecord1);
            //System.out.println("xfinalcord1:" + xfinalcord1);
            //System.out.println("xcord1:" +xcord1);



            Actions actions1 = new Actions(driver);
            actions1.clickAndHold(dragElementFrom1).moveByOffset((int) xmovecord1, 0).release().perform();
            //dragElementFrom1.click();

            TimeUnit.SECONDS.sleep(3);

        }

    }

    /// *************************************************************************************************///
    /// *** Level current - Hosting ***///
    /// *************************************************************************************************///

    public void findCurrentLevers(WebDriver driver) throws InterruptedException {

        /// *** Cost and Maintainability Vertical Bar Position ***///

        String title1 = driver.findElement(By.xpath("//*[@id='app']/div/div[5]/div[1]/div[1]")).getText();

        System.out.println(title1);

        String titgp1 = driver.findElement(By.xpath("//*[@id='app']/div/div[5]/div[1]/div[2]/div[1]/div[1]")).getText();
        String classes1 = driver.findElement(By.xpath("//*[@id='app']/div/div[5]/div[1]/div[2]/div[1]/div[1]"))
                .getAttribute("class");

        String titgp2 = driver.findElement(By.xpath("//*[@id='app']/div/div[5]/div[1]/div[2]/div[2]/div[1]")).getText();
        String classes2 = driver.findElement(By.xpath("//*[@id='app']/div/div[5]/div[1]/div[2]/div[2]/div[1]"))
                .getAttribute("class");

        String titgp3 = driver.findElement(By.xpath("//*[@id='app']/div/div[5]/div[1]/div[2]/div[3]/div[1]")).getText();
        String classes3 = driver.findElement(By.xpath("//*[@id='app']/div/div[5]/div[1]/div[2]/div[3]/div[1]"))
                .getAttribute("class");

        String titgp4 = driver.findElement(By.xpath("//*[@id='app']/div/div[5]/div[1]/div[2]/div[4]/div[1]")).getText();
        String classes4 = driver.findElement(By.xpath("//*[@id='app']/div/div[5]/div[1]/div[2]/div[4]/div[1]"))
                .getAttribute("class");

        String titgp5 = driver.findElement(By.xpath("//*[@id='app']/div/div[5]/div[1]/div[2]/div[5]/div[1]")).getText();
        String classes5 = driver.findElement(By.xpath("//*[@id='app']/div/div[5]/div[1]/div[2]/div[5]/div[1]"))
                .getAttribute("class");

        if (classes1.equals(check)) {
            if (classes1.equals("level current")) {
                temptest1 = titgp1;
                System.out.println("Under : " + title1 + " Your current position is: " + titgp1);

            } else if (classes1.equals("level goal")) {
                System.out
                        .println("Under : " + title1 + " Our quick assessment of your IT maturity was : " + temptest1);
                System.out.println("Under : " + title1 + " As per your selection, your new goal is : " + titgp1);
            } else {

                System.out.println("Under : " + title1 + " Your are currely at: " + titgp5);
            }
        } else if (classes2.equals(check)) {
            if (classes2.equals("level current")) {
                temptest1 = titgp2;
                System.out.println("Under : " + title1 + " Your current position is: " + titgp2);

            } else if (classes2.equals("level goal")) {
                System.out
                        .println("Under : " + title1 + " Our quick assessment of your IT maturity was : " + temptest1);
                System.out.println("Under : " + title1 + " As per your selection, your new goal is : " + titgp2);
            }

        } else if (classes3.equals(check)) {

            if (classes3.equals("level current")) {
                temptest1 = titgp3;
                System.out.println("Under : " + title1 + " Your current position is: " + titgp3);

            } else if (classes3.equals("level goal")) {
                System.out
                        .println("Under : " + title1 + " Our quick assessment of your IT maturity was : " + temptest1);
                System.out.println("Under : " + title1 + " As per your selection, your new goal is : " + titgp3);
            }

        } else if (classes4.equals(check)) {

            if (classes4.equals("level current")) {
                temptest1 = titgp4;
                System.out.println("Under : " + title1 + " Your current position is: " + titgp4);

            } else if (classes4.equals("level goal")) {
                System.out
                        .println("Under : " + title1 + " Our quick assessment of your IT maturity was : " + temptest1);
            }

        } else if (classes5.equals(check)) {

            if (classes5.equals("level current")) {
                temptest1 = titgp5;
                System.out.println("Under : " + title1 + " Your current position is: " + titgp5);

            } else if (classes5.equals("level goal")) {
                System.out
                        .println("Under : " + title1 + " Our quick assessment of your IT maturity was : " + temptest1);
                System.out.println("Under : " + title1 + " As per your selection, your new goal is : " + titgp5);
            }

        } else
            System.out.println("Under : " + title1 + " Your current position is: " + temptest1);

        {
            System.out.println();
        }

        System.out.println();
        String title2 = driver.findElement(By.xpath("//*[@id='app']/div/div[5]/div[2]/div[1]")).getText();
        System.out.println(title2);

        String titep1 = driver.findElement(By.xpath("//*[@id='app']/div/div[5]/div[2]/div[2]/div[1]/div[1]")).getText();
        String classese1 = driver.findElement(By.xpath("//*[@id='app']/div/div[5]/div[2]/div[2]/div[1]/div[1]"))
                .getAttribute("class");

        String titep2 = driver.findElement(By.xpath("//*[@id='app']/div/div[5]/div[2]/div[2]/div[2]/div[1]")).getText();
        String classese2 = driver.findElement(By.xpath("//*[@id='app']/div/div[5]/div[2]/div[2]/div[2]/div[1]"))
                .getAttribute("class");

        String titep3 = driver.findElement(By.xpath("//*[@id='app']/div/div[5]/div[2]/div[2]/div[3]/div[1]")).getText();
        String classese3 = driver.findElement(By.xpath("//*[@id='app']/div/div[5]/div[2]/div[2]/div[3]/div[1]"))
                .getAttribute("class");

        String titep4 = driver.findElement(By.xpath("//*[@id='app']/div/div[5]/div[2]/div[2]/div[4]/div[1]")).getText();
        String classese4 = driver.findElement(By.xpath("//*[@id='app']/div/div[5]/div[2]/div[2]/div[4]/div[1]"))
                .getAttribute("class");

        String titep5 = driver.findElement(By.xpath("//*[@id='app']/div/div[5]/div[2]/div[2]/div[5]/div[1]")).getText();
        String classese5 = driver.findElement(By.xpath("//*[@id='app']/div/div[5]/div[2]/div[2]/div[5]/div[1]"))
                .getAttribute("class");

        if (classese1.equals(check)) {
            if (classese1.equals("level current")) {
                temptest2 = titep1;
                System.out.println("Under : " + title2 + " Your current position is: " + titep1);

            } else if (classese1.equals("level goal")) {
                System.out
                        .println("Under : " + title2 + " Our quick assessment of your IT maturity was : " + temptest2);
                System.out.println("Under : " + title2 + " As per your selection, your new goal is : " + titep1);
            }
        } else if (classese2.equals(check)) {

            if (classese2.equals("level current")) {
                temptest2 = titep2;
                System.out.println("Under : " + title2 + " Your current position is: " + titep2);

            } else if (classese2.equals("level goal")) {
                System.out
                        .println("Under : " + title2 + " Our quick assessment of your IT maturity was : " + temptest2);
                System.out.println("Under : " + title2 + " As per your selection, your new goal is : " + titep2);
            }

        } else if (classese3.equals(check)) {

            if (classese3.equals("level current")) {
                temptest2 = titep3;
                System.out.println("Under : " + title2 + " Your current position is: " + titep3);

            } else if (classese3.equals("level goal")) {
                System.out
                        .println("Under : " + title2 + " Our quick assessment of your IT maturity was : " + temptest2);
                System.out.println("Under : " + title2 + " As per your selection, your new goal is : " + titep3);

            }
        } else if (classese4.equals(check)) {

            if (classese4.equals("level current")) {
                temptest2 = titep4;
                System.out.println("Under : " + title2 + " Your current position is: " + titep4);

            } else if (classese4.equals("level goal")) {
                System.out
                        .println("Under : " + title2 + " Our quick assessment of your IT maturity was : " + temptest2);
                System.out.println("Under : " + title2 + " As per your selection, your new goal is : " + titep4);

            }
        } else if (classese5.equals(check)) {

            if (classese5.equals("level current")) {
                temptest2 = titep5;
                System.out.println("Under : " + title2 + " Your current position is: " + titep5);

            } else if (classese5.equals("level goal")) {
                System.out
                        .println("Under : " + title2 + " Our quick assessment of your IT maturity was : " + temptest2);
                System.out.println("Under : " + title2 + " As per your selection, your new goal is : " + titep5);

            }
        } else

            System.out.println("Under : " + title2 + " Your current position is: " + temptest2);

        {
            System.out.println();
        }

        System.out.println();
        String title3 = driver.findElement(By.xpath("//*[@id='app']/div/div[5]/div[3]/div[1]")).getText();
        System.out.println(title3);

        String titsp1 = driver.findElement(By.xpath("//*[@id='app']/div/div[5]/div[3]/div[2]/div[1]/div[1]")).getText();
        String classess1 = driver.findElement(By.xpath("//*[@id='app']/div/div[5]/div[3]/div[2]/div[1]/div[1]"))
                .getAttribute("class");

        String titsp2 = driver.findElement(By.xpath("//*[@id='app']/div/div[5]/div[3]/div[2]/div[2]/div[1]")).getText();
        String classess2 = driver.findElement(By.xpath("//*[@id='app']/div/div[5]/div[3]/div[2]/div[2]/div[1]"))
                .getAttribute("class");

        String titsp3 = driver.findElement(By.xpath("//*[@id='app']/div/div[5]/div[3]/div[2]/div[3]/div[1]")).getText();
        String classess3 = driver.findElement(By.xpath("//*[@id='app']/div/div[5]/div[3]/div[2]/div[3]/div[1]"))
                .getAttribute("class");

        String titsp4 = driver.findElement(By.xpath("//*[@id='app']/div/div[5]/div[3]/div[2]/div[4]/div[1]")).getText();
        String classess4 = driver.findElement(By.xpath("//*[@id='app']/div/div[5]/div[3]/div[2]/div[4]/div[1]"))
                .getAttribute("class");

        String titsp5 = driver.findElement(By.xpath("//*[@id='app']/div/div[5]/div[3]/div[2]/div[5]/div[1]")).getText();
        String classess5 = driver.findElement(By.xpath("//*[@id='app']/div/div[5]/div[3]/div[2]/div[5]/div[1]"))
                .getAttribute("class");

        if (classess1.equals(check)) {

            if (classess1.equals("level current")) {
                temptest3 = titsp1;
                System.out.println(temptest3);
                System.out.println("Under : " + title3 + " Your current position is: " + titsp1);

            } else if (classess1.equals("level goal")) {
                System.out
                        .println("Under : " + title3 + " Our quick assessment of your IT maturity was : " + temptest3);
                System.out.println("Under : " + title3 + " As per your selection, your new goal is : " + titsp1);

            }

        } else if (classess2.equals(check)) {

            if (classess2.equals("level current")) {
                temptest3 = titsp2;
                System.out.println(temptest3);

                System.out.println("Under : " + title3 + " Your current position is: " + titsp2);

            } else if (classess2.equals("level goal")) {
                System.out
                        .println("Under : " + title3 + " Our quick assessment of your IT maturity was : " + temptest3);
                System.out.println("Under : " + title3 + " As per your selection, your new goal is : " + titsp2);

            }

        } else if (classess3.equals(check)) {

            if (classess3.equals("level current")) {
                temptest3 = titsp3;

                System.out.println("Under : " + title3 + " Your current position is: " + titsp3);

            } else if (classess3.equals("level goal")) {
                System.out
                        .println("Under : " + title3 + " Our quick assessment of your IT maturity was : " + temptest3);
                System.out.println("Under : " + title3 + " As per your selection, your new goal is : " + titsp3);

            }

        } else if (classess4.equals(check)) {

            if (classess4.equals("level current")) {
                temptest3 = titsp4;
                System.out.println(temptest3);

                System.out.println("Under : " + title3 + " Your current position is: " + titsp4);

            } else if (classess4.equals("level goal")) {
                System.out
                        .println("Under : " + title3 + " Our quick assessment of your IT maturity was : " + temptest3);
                System.out.println("Under : " + title3 + " As per your selection, your new goal is : " + titsp4);

            }

        } else if (classess5.equals(check)) {

            if (classess5.equals("level current")) {
                temptest3 = titsp5;
                System.out.println(temptest3);

                System.out.println("Under : " + title3 + " Your current position is: " + titsp5);

            } else if (classess5.equals("level goal")) {
                System.out
                        .println("Under : " + title3 + " Our quick assessment of your IT maturity was : " + temptest3);
                System.out.println("Under : " + title3 + " As per your selection, your new goal is : " + titsp5);

            }

        } else

            System.out.println("Under : " + title3 + " Your current position is: " + temptest3);

        {
            System.out.println();
        }

        System.out.println();
        String title4 = driver.findElement(By.xpath("//*[@id='app']/div/div[5]/div[4]/div[1]")).getText();
        System.out.println(title4);

        String titpp1 = driver.findElement(By.xpath("//*[@id='app']/div/div[5]/div[4]/div[2]/div[1]/div[1]")).getText();
        String classesp1 = driver.findElement(By.xpath("//*[@id='app']/div/div[5]/div[4]/div[2]/div[1]/div[1]"))
                .getAttribute("class");

        String titpp2 = driver.findElement(By.xpath("//*[@id='app']/div/div[5]/div[4]/div[2]/div[2]/div[1]")).getText();
        String classesp2 = driver.findElement(By.xpath("//*[@id='app']/div/div[5]/div[4]/div[2]/div[2]/div[1]"))
                .getAttribute("class");

        String titpp3 = driver.findElement(By.xpath("//*[@id='app']/div/div[5]/div[4]/div[2]/div[3]/div[1]")).getText();
        String classesp3 = driver.findElement(By.xpath("//*[@id='app']/div/div[5]/div[4]/div[2]/div[3]/div[1]"))
                .getAttribute("class");

        String titpp4 = driver.findElement(By.xpath("/*//*[@id='app']/div/div[5]/div[4]/div[2]/div[4]/div[1]"))
                .getText();
        String classesp4 = driver.findElement(By.xpath("//*[@id='app']/div/div[5]/div[4]/div[2]/div[4]/div[1]"))
                .getAttribute("class");

        String titpp5 = driver.findElement(By.xpath("//*[@id='app']/div/div[5]/div[4]/div[2]/div[5]/div[1]")).getText();
        String classesp5 = driver.findElement(By.xpath("//*[@id='app']/div/div[5]/div[4]/div[2]/div[5]/div[1]"))
                .getAttribute("class");

        if (classesp1.equals(check)) {

            if (classesp1.equals("level current")) {
                temptest4 = titpp1;
                System.out.println("Under : " + title4 + " Your current position is: " + titpp1);

            } else if (classesp1.equals("level goal")) {
                System.out
                        .println("Under : " + title4 + " Our quick assessment of your IT maturity was : " + temptest4);
                System.out.println("Under : " + title4 + " As per your selection, your new goal is : " + titpp1);
            }

        } else if (classesp2.equals(check)) {

            if (classesp2.equals("level current")) {
                temptest4 = titpp2;
                System.out.println("Under : " + title4 + " Your current position is: " + titpp2);

            } else if (classesp2.equals("level goal")) {
                System.out
                        .println("Under : " + title4 + " Our quick assessment of your IT maturity was : " + temptest4);
                System.out.println("Under : " + title4 + " As per your selection, your new goal is : " + titpp2);
            }

        } else if (classesp3.equals(check)) {

            if (classesp3.equals("level current")) {
                temptest4 = titpp3;
                System.out.println("Under : " + title4 + " Your current position is: " + titpp3);

            } else if (classesp3.equals("level goal")) {
                System.out
                        .println("Under : " + title4 + " Our quick assessment of your IT maturity was : " + temptest4);
                System.out.println("Under : " + title4 + " As per your selection, your new goal is : " + titpp3);
            }

        } else if (classesp4.equals(check)) {

            if (classesp4.equals("level current")) {
                temptest4 = titpp4;
                System.out.println("Under : " + title4 + " Your current position is: " + titpp4);

            } else if (classesp4.equals("level goal")) {
                System.out
                        .println("Under : " + title4 + " Our quick assessment of your IT maturity was : " + temptest4);
                System.out.println("Under : " + title4 + " As per your selection, your new goal is : " + titpp4);
            }

        } else if (classesp5.equals(check)) {

            if (classesp5.equals("level current")) {
                temptest4 = titpp5;
                System.out.println("Under : " + title4 + " Your current position is: " + titpp5);

            } else if (classesp5.equals("level goal")) {
                System.out
                        .println("Under : " + title4 + " Our quick assessment of your IT maturity was : " + temptest4);
                System.out.println("Under : " + title4 + " As per your selection, your new goal is : " + titpp5);
            }

        } else

            System.out.println("Under : " + title4 + " Your current position is: " + temptest4);

        {
            System.out.println();
        }

        System.out.println();
    }

    public void verifyGettingThereE2e(WebDriver driver)  {

        // ***************************** Verifying Labels Description ONE
        // *********************************///


        driver.findElement(By.xpath("//*[@id=\"app\"]/div/header[1]")).getText();
        String actdesone = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[3]")).getText();

        String expectedDesone = "To get to where you want to be, we recommend advancing your Hosting"
                + " from PaaS to Serverless and your Practices from Catalog to Experiments.";

        System.out.println("*******  Verifying \"Getting There label and Description\" on Final Page    ******");

        System.out.println("Expected Confirmation message: " + expectedDesone);
        System.out.println("Actual Confirmation message: " + actdesone);
        System.out.println();

        Assert.assertEquals(actdesone, expectedDesone);
        


    }

    public void verifyGettingThereAllSelectE2e(WebDriver driver) {

        // ***************************** Verifying Labels Description ONE

        driver.findElement(By.xpath("//*[@id=\"app\"]/div/header[1]")).getText();
        String actdesone = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[3]")).getText();

        String expectedDesone = "To get to where you want to be, we recommend advancing your Practices from Catalog to Experiments, your Hosting from PaaS to Serverless, your Engineering from Reusable to Engaged, and your Sourcing from Hosted to SaaS.";

        System.out.println("*******  Verifying \"Getting There label and Description\" on Final Page    ******");

        System.out.println("Expected Confirmation message: " + expectedDesone);
        System.out.println("Actual Confirmation message: " + actdesone);
        System.out.println();

        Assert.assertEquals(actdesone, expectedDesone);

    }
}
