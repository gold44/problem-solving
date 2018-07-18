package me.patrick;

import me.patrick.problems.CambridgeEffect;
import me.patrick.problems.ExcelSheetColumnNumber;

/**
 * Hello world!
 */
public class Main {
    public static void main(String[] args) {

//        new ExcelSheetColumnNumber(0).printAnswer();
//        new ExcelSheetColumnNumber(1).printAnswer();
//        new ExcelSheetColumnNumber(26).printAnswer();
//        new ExcelSheetColumnNumber(27).printAnswer();
//        new ExcelSheetColumnNumber(777).printAnswer();

        new CambridgeEffect(5, "HE IS MY BOY FRIEND", "HE IS MY BOY FENRID").printAnswer();
        new CambridgeEffect(14, "KEY IS A DEVICE USED TO OPEN A LOCK SUCH AS IN A DOOR", "KEY IS A DIEVCE USED TO OEPN A LOCK SUCH AS IN A DOOR").printAnswer();

        new CambridgeEffect(13, "A SENSE IS A PHYSIOLOGICAL CAPACITY OF ORGANISMS THAT PROVIDES DATA FOR PERCEPTION", "A SENSE IS A HPYSIOLOGICAL CAPATCIY OF ONRGAISMS THAT ROPDVIES DATA FOR PERCEPTION").printAnswer();
    }
}
