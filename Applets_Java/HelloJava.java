package Applets_Java;

import java.applet.*;
import java.awt.*;

/*
 * <applet code = "HelloJava" height = "100" width= "200"></applet>
 */

// @SuppressWarnings("removal")
@SuppressWarnings("removal")
public class HelloJava extends Applet {
    public void init(){
        Checkbox ch1 = new Checkbox("Hindi");
        Checkbox ch2 = new Checkbox("English");
        Checkbox ch3 = new Checkbox("Russian");

        CheckboxGroup chkgrp = new CheckboxGroup();
        Checkbox chkRed, chkBlue, chkYellow, chkGreen,chkOrange;

        chkRed = new Checkbox("Red", chkgrp, false);
        chkBlue = new Checkbox("Blue", chkgrp, false);
        chkYellow = new Checkbox("Yellow", chkgrp, false);
        chkGreen = new Checkbox("Green", chkgrp, true);
        chkOrange = new Checkbox("Orange", chkgrp, false);

        add(chkRed);
        add(chkBlue);
        add(chkYellow);
        add(chkGreen);
        add(chkOrange);

        add(ch1);
        add(ch2);
        add(ch3);
    }
    
}
