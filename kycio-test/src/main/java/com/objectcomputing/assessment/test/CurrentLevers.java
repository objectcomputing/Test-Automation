package com.objectcomputing.assessment.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//	import org.testng.Assert;

public class CurrentLevers {

    //String check = "level current";
    String check;
    String currlevel11;
    String currlevel12;
    String currlevel13;
    String currlevel14;
    String currlevel15;
    String currlevel21;
    String currlevel22;
    String currlevel23;
    String currlevel24;
    String currlevel25;
    String currlevel31;
    String currlevel32;
    String currlevel33;
    String currlevel34;
    String currlevel35;
    String currlevel41;
    String currlevel42;
    String currlevel43;
    String currlevel44;
    String currlevel45;
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


    ///*************************************************************************************************///
    ///***                                 Level current - Hosting                                   ***///
    ///*************************************************************************************************///

    public void findCurrentLevers(WebDriver driver) throws InterruptedException {

        ///***                      	Cost and Maintainability Vertical Bar Position                       ***///


        String title1 = driver.findElement(By.xpath("//*[@id='app']/div/div[5]/div[1]/div[1]")).getText();

        System.out.println(title1);

        //String check = "level current";


        String titgp1 = driver.findElement(By.xpath("//*[@id='app']/div/div[5]/div[1]/div[2]/div[1]/div[1]")).getText();
        String classes1 = driver.findElement(By.xpath("//*[@id='app']/div/div[5]/div[1]/div[2]/div[1]/div[1]")).getAttribute("class");

        String titgp2 = driver.findElement(By.xpath("//*[@id='app']/div/div[5]/div[1]/div[2]/div[2]/div[1]")).getText();
        String classes2 = driver.findElement(By.xpath("//*[@id='app']/div/div[5]/div[1]/div[2]/div[2]/div[1]")).getAttribute("class");

        String titgp3 = driver.findElement(By.xpath("//*[@id='app']/div/div[5]/div[1]/div[2]/div[3]/div[1]")).getText();
        String classes3 = driver.findElement(By.xpath("//*[@id='app']/div/div[5]/div[1]/div[2]/div[3]/div[1]")).getAttribute("class");

        String titgp4 = driver.findElement(By.xpath("//*[@id='app']/div/div[5]/div[1]/div[2]/div[4]/div[1]")).getText();
        String classes4 = driver.findElement(By.xpath("//*[@id='app']/div/div[5]/div[1]/div[2]/div[4]/div[1]")).getAttribute("class");

        String titgp5 = driver.findElement(By.xpath("//*[@id='app']/div/div[5]/div[1]/div[2]/div[5]/div[1]")).getText();
        String classes5 = driver.findElement(By.xpath("//*[@id='app']/div/div[5]/div[1]/div[2]/div[5]/div[1]")).getAttribute("class");

        //System.out.println(titgp2);
        //System.out.println(classes2);


        //if(classes1.equals("level current"))
        if (classes1.equals(check)) {
            if (classes1.equals("level current")) {
                temptest1 = titgp1;
                System.out.println("Under : " + title1 + " Your current position is: " + titgp1);

            } else if (classes1.equals("level goal")) {
                System.out.println("Under : " + title1 + " Our quick assessment of your IT maturity was : " + temptest1);
                System.out.println("Under : " + title1 + " As per your selection, your new goal is : " + titgp1);
            } else {

                System.out.println("Under : " + title1 + " Your are currely at: " + titgp5);
            }
        }

        //else if(classes2.equals("level current"))
        else if (classes2.equals(check)) {
            if (classes2.equals("level current")) {
                temptest1 = titgp2;
                System.out.println("Under : " + title1 + " Your current position is: " + titgp2);

            } else if (classes2.equals("level goal")) {
                System.out.println("Under : " + title1 + " Our quick assessment of your IT maturity was : " + temptest1);
                System.out.println("Under : " + title1 + " As per your selection, your new goal is : " + titgp2);
            }

        }
        //else if(classes3.equals("level current")) {
        else if (classes3.equals(check)) {

            if (classes3.equals("level current")) {
                temptest1 = titgp3;
                System.out.println("Under : " + title1 + " Your current position is: " + titgp3);

            } else if (classes3.equals("level goal")) {
                System.out.println("Under : " + title1 + " Our quick assessment of your IT maturity was : " + temptest1);
                System.out.println("Under : " + title1 + " As per your selection, your new goal is : " + titgp3);
            }

        }

        //else if(classes4.equals("level current") ) {
        else if (classes4.equals(check)) {

            if (classes4.equals("level current")) {
                temptest1 = titgp4;
                System.out.println("Under : " + title1 + " Your current position is: " + titgp4);

            } else if (classes4.equals("level goal")) {
                System.out.println("Under : " + title1 + " Our quick assessment of your IT maturity was : " + temptest1);
                //  System.out.println("Under : " + title1 + " As per your selection, your new goal is : " + titgp4);
            }
            //	System.out.println("Under : " + title1 + " Your current position is: " + titgp4);

        }

        //else if(classes5.equals("level current")) {
        else if (classes5.equals(check)) {

            if (classes5.equals("level current")) {
                temptest1 = titgp5;
                System.out.println("Under : " + title1 + " Your current position is: " + titgp5);

            } else if (classes5.equals("level goal")) {
                System.out.println("Under : " + title1 + " Our quick assessment of your IT maturity was : " + temptest1);
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
        String classese1 = driver.findElement(By.xpath("//*[@id='app']/div/div[5]/div[2]/div[2]/div[1]/div[1]")).getAttribute("class");

        String titep2 = driver.findElement(By.xpath("//*[@id='app']/div/div[5]/div[2]/div[2]/div[2]/div[1]")).getText();
        String classese2 = driver.findElement(By.xpath("//*[@id='app']/div/div[5]/div[2]/div[2]/div[2]/div[1]")).getAttribute("class");

        String titep3 = driver.findElement(By.xpath("//*[@id='app']/div/div[5]/div[2]/div[2]/div[3]/div[1]")).getText();
        String classese3 = driver.findElement(By.xpath("//*[@id='app']/div/div[5]/div[2]/div[2]/div[3]/div[1]")).getAttribute("class");

        String titep4 = driver.findElement(By.xpath("//*[@id='app']/div/div[5]/div[2]/div[2]/div[4]/div[1]")).getText();
        String classese4 = driver.findElement(By.xpath("//*[@id='app']/div/div[5]/div[2]/div[2]/div[4]/div[1]")).getAttribute("class");

        String titep5 = driver.findElement(By.xpath("//*[@id='app']/div/div[5]/div[2]/div[2]/div[5]/div[1]")).getText();
        String classese5 = driver.findElement(By.xpath("//*[@id='app']/div/div[5]/div[2]/div[2]/div[5]/div[1]")).getAttribute("class");


        //if(classese1.equals("level current"))
        if (classese1.equals(check)) {
            if (classese1.equals("level current")) {
                temptest2 = titep1;
                System.out.println("Under : " + title2 + " Your current position is: " + titep1);

            } else if (classese1.equals("level goal")) {
                System.out.println("Under : " + title2 + " Our quick assessment of your IT maturity was : " + temptest2);
                System.out.println("Under : " + title2 + " As per your selection, your new goal is : " + titep1);
            }
            //  System.out.println("Under : " + title2 + " Your current position is: " + titep2);
        } else if (classese2.equals(check)) {

            if (classese2.equals("level current")) {
                temptest2 = titep2;
                System.out.println("Under : " + title2 + " Your current position is: " + titep2);

            } else if (classese2.equals("level goal")) {
                System.out.println("Under : " + title2 + " Our quick assessment of your IT maturity was : " + temptest2);
                System.out.println("Under : " + title2 + " As per your selection, your new goal is : " + titep2);
            }
            //   System.out.println("Under : " + title2 + " Your current position is: " + titep2);
            //	System.out.println("Under : " + title2 + " Your current position is: " + titep2);

        } else if (classese3.equals(check)) {

            if (classese3.equals("level current")) {
                temptest2 = titep3;
                System.out.println("Under : " + title2 + " Your current position is: " + titep3);

            } else if (classese3.equals("level goal")) {
                System.out.println("Under : " + title2 + " Our quick assessment of your IT maturity was : " + temptest2);
                System.out.println("Under : " + title2 + " As per your selection, your new goal is : " + titep3);

                //	System.out.println("Under : " + title2 + " Your current position is: " + titep3);
            }
        } else if (classese4.equals(check)) {

            if (classese4.equals("level current")) {
                temptest2 = titep4;
                System.out.println("Under : " + title2 + " Your current position is: " + titep4);

            } else if (classese4.equals("level goal")) {
                System.out.println("Under : " + title2 + " Our quick assessment of your IT maturity was : " + temptest2);
                System.out.println("Under : " + title2 + " As per your selection, your new goal is : " + titep4);
                //System.out.println("Under : " + title2 + " Your current position is: " + titep4);

            }
        } else if (classese5.equals(check)) {

            if (classese5.equals("level current")) {
                temptest2 = titep5;
                System.out.println("Under : " + title2 + " Your current position is: " + titep5);

            } else if (classese5.equals("level goal")) {
                System.out.println("Under : " + title2 + " Our quick assessment of your IT maturity was : " + temptest2);
                System.out.println("Under : " + title2 + " As per your selection, your new goal is : " + titep5);
                //	System.out.println("Under :" + title2 + " Your current position is: " + titep5);

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
        String classess1 = driver.findElement(By.xpath("//*[@id='app']/div/div[5]/div[3]/div[2]/div[1]/div[1]")).getAttribute("class");

        String titsp2 = driver.findElement(By.xpath("//*[@id='app']/div/div[5]/div[3]/div[2]/div[2]/div[1]")).getText();
        String classess2 = driver.findElement(By.xpath("//*[@id='app']/div/div[5]/div[3]/div[2]/div[2]/div[1]")).getAttribute("class");

        String titsp3 = driver.findElement(By.xpath("//*[@id='app']/div/div[5]/div[3]/div[2]/div[3]/div[1]")).getText();
        String classess3 = driver.findElement(By.xpath("//*[@id='app']/div/div[5]/div[3]/div[2]/div[3]/div[1]")).getAttribute("class");

        String titsp4 = driver.findElement(By.xpath("//*[@id='app']/div/div[5]/div[3]/div[2]/div[4]/div[1]")).getText();
        String classess4 = driver.findElement(By.xpath("//*[@id='app']/div/div[5]/div[3]/div[2]/div[4]/div[1]")).getAttribute("class");

        String titsp5 = driver.findElement(By.xpath("//*[@id='app']/div/div[5]/div[3]/div[2]/div[5]/div[1]")).getText();
        String classess5 = driver.findElement(By.xpath("//*[@id='app']/div/div[5]/div[3]/div[2]/div[5]/div[1]")).getAttribute("class");


        //if(classess1.equals("level current")){
        if (classess1.equals(check)) {


            if (classess1.equals("level current")) {
                temptest3 = titsp1;
                System.out.println(temptest3);
                System.out.println("Under : " + title3 + " Your current position is: " + titsp1);

            } else if (classess1.equals("level goal")) {
                System.out.println("Under : " + title3 + " Our quick assessment of your IT maturity was : " + currlevel31);
                System.out.println("Under : " + title3 + " As per your selection, your new goal is : " + titsp1);

                //    System.out.println("Under : " + title3 + " Your current position is: " + titsp1);
            }

        } else if (classess2.equals(check)) {

            if (classess2.equals("level current")) {
                temptest3 = titsp2;
                System.out.println(temptest3);

                System.out.println("Under : " + title3 + " Your current position is: " + titsp2);

            } else if (classess2.equals("level goal")) {
                System.out.println("Under : " + title3 + " Our quick assessment of your IT maturity was : " + currlevel32);
                System.out.println("Under : " + title3 + " As per your selection, your new goal is : " + titsp2);

                //	System.out.println("Under : " + title3 + " Your current position is: " + titsp2);
            }

        } else if (classess3.equals(check)) {

            if (classess3.equals("level current")) {
                temptest3 = titsp3;
                //   System.out.println(temptest3);

                System.out.println("Under : " + title3 + " Your current position is: " + titsp3);

            } else if (classess3.equals("level goal")) {
                System.out.println("Under : " + title3 + " Our quick assessment of your IT maturity was : " + currlevel33);
                System.out.println("Under : " + title3 + " As per your selection, your new goal is : " + titsp3);

            }


            //		System.out.println("Under : " + title3 + " Your current position is: " + titsp3);

        } else if (classess4.equals(check)) {

            if (classess4.equals("level current")) {
                temptest3 = titsp4;
                System.out.println(temptest3);

                System.out.println("Under : " + title3 + " Your current position is: " + titsp4);

            } else if (classess4.equals("level goal")) {
                System.out.println("Under : " + title3 + " Our quick assessment of your IT maturity was : " + currlevel33);
                System.out.println("Under : " + title3 + " As per your selection, your new goal is : " + titsp4);

            }

            //		System.out.println("Under : " + title3 + " Your current position is: " + titsp4);

            //}else if(classess5.equals("level current")){
        } else if (classess5.equals(check)) {

            //if(check == "level current")

            if (classess5.equals("level current")) {
                temptest3 = titsp5;
                System.out.println(temptest3);

                System.out.println("Under : " + title3 + " Your current position is: " + titsp5);

            } else if (classess5.equals("level goal")) {
                System.out.println("Under : " + title3 + " Our quick assessment of your IT maturity was : " + temptest3);
                System.out.println("Under : " + title3 + " As per your selection, your new goal is : " + titsp5);

            }

            //	System.out.println("Under :" + title3 + " Your current position is: " + titsp5);
        } else

            System.out.println("Under : " + title3 + " Your current position is: " + temptest3);


        {
            System.out.println();
        }


        System.out.println();
        String title4 = driver.findElement(By.xpath("//*[@id='app']/div/div[5]/div[4]/div[1]")).getText();
        System.out.println(title4);

        String titpp1 = driver.findElement(By.xpath("//*[@id='app']/div/div[5]/div[4]/div[2]/div[1]/div[1]")).getText();
        String classesp1 = driver.findElement(By.xpath("//*[@id='app']/div/div[5]/div[4]/div[2]/div[1]/div[1]")).getAttribute("class");

        String titpp2 = driver.findElement(By.xpath("//*[@id='app']/div/div[5]/div[4]/div[2]/div[2]/div[1]")).getText();
        String classesp2 = driver.findElement(By.xpath("//*[@id='app']/div/div[5]/div[4]/div[2]/div[2]/div[1]")).getAttribute("class");

        String titpp3 = driver.findElement(By.xpath("//*[@id='app']/div/div[5]/div[4]/div[2]/div[3]/div[1]")).getText();
        String classesp3 = driver.findElement(By.xpath("//*[@id='app']/div/div[5]/div[4]/div[2]/div[3]/div[1]")).getAttribute("class");

        String titpp4 = driver.findElement(By.xpath("/*//*[@id='app']/div/div[5]/div[4]/div[2]/div[4]/div[1]")).getText();
        String classesp4 = driver.findElement(By.xpath("//*[@id='app']/div/div[5]/div[4]/div[2]/div[4]/div[1]")).getAttribute("class");

        String titpp5 = driver.findElement(By.xpath("//*[@id='app']/div/div[5]/div[4]/div[2]/div[5]/div[1]")).getText();
        String classesp5 = driver.findElement(By.xpath("//*[@id='app']/div/div[5]/div[4]/div[2]/div[5]/div[1]")).getAttribute("class");

        //if(classesp1.equals("level current")){
        if (classesp1.equals(check)) {

            if (classesp1.equals("level current")) {
                temptest4 = titpp1;
                System.out.println("Under : " + title4 + " Your current position is: " + titpp1);

            } else if (classesp1.equals("level goal")) {
                System.out.println("Under : " + title4 + " Our quick assessment of your IT maturity was : " + temptest4);
                System.out.println("Under : " + title4 + " As per your selection, your new goal is : " + titpp1);
            }

            //}else if(classesp2.equals("level current")){
        } else if (classesp2.equals(check)) {

            if (classesp2.equals("level current")) {
                temptest4 = titpp2;
                System.out.println("Under : " + title4 + " Your current position is: " + titpp2);

            } else if (classesp2.equals("level goal")) {
                System.out.println("Under : " + title4 + " Our quick assessment of your IT maturity was : " + temptest4);
                System.out.println("Under : " + title4 + " As per your selection, your new goal is : " + titpp2);
            }

            //}else if(classesp3.equals("level current")){
        } else if (classesp3.equals(check)) {

            if (classesp3.equals("level current")) {
                temptest4 = titpp3;
                System.out.println("Under : " + title4 + " Your current position is: " + titpp3);

            } else if (classesp3.equals("level goal")) {
                System.out.println("Under : " + title4 + " Our quick assessment of your IT maturity was : " + temptest4);
                System.out.println("Under : " + title4 + " As per your selection, your new goal is : " + titpp3);
            }

            //}else if(classesp4.equals("level current")){
        } else if (classesp4.equals(check)) {

            if (classesp4.equals("level current")) {
                temptest4 = titpp4;
                System.out.println("Under : " + title4 + " Your current position is: " + titpp4);

            } else if (classesp4.equals("level goal")) {
                System.out.println("Under : " + title4 + " Our quick assessment of your IT maturity was : " + temptest4);
                System.out.println("Under : " + title4 + " As per your selection, your new goal is : " + titpp4);
            }

            //}else if(classesp5.equals("level current")){
        } else if (classesp5.equals(check)) {

            //if(check == "level current")
            if (classesp5.equals("level current")) {
                temptest4 = titpp5;
                System.out.println("Under : " + title4 + " Your current position is: " + titpp5);

                // }else if (check == "level goal")
            } else if (classesp5.equals("level goal")) {
                System.out.println("Under : " + title4 + " Our quick assessment of your IT maturity was : " + temptest4);
                System.out.println("Under : " + title4 + " As per your selection, your new goal is : " + titpp5);
            }

        } else

            System.out.println("Under : " + title4 + " Your current position is: " + temptest4);

        {
            System.out.println();
        }

        System.out.println();
    }
}

	
