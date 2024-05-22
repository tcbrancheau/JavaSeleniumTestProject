package org.project;

import org.openqa.selenium.remote.Browser;

// import PinnacleClient.*;
// import PinnacleCardInfoPage.*;

import java.lang.Thread;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!\n");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }

        Browser bType = Browser.FIREFOX;

        PinnacleClient pClient = new PinnacleClient(bType);

        PinnacleCardInfoPage pPage = new PinnacleCardInfoPage(pClient.getWebDriver());
        try {
            Thread.sleep(8000);
        }
        catch (InterruptedException ex) {
            System.out.println(ex.getMessage());
        }
        pClient.closeBrowser();

    }
}