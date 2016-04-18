/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testing;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Hara
 */
public class DateTimeTest {

    public DateTimeTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of DayInMonth method, of class DateTime.
     */
    @Test
    public void testDayInMonth01() {
        System.out.println("DayInMonth UTCID01");
        int year = 2015;
        int month = 2;
        DateTime instance = new DateTime();
        int expResult = 31;
        int result = instance.DayInMonth(year, month);
        assertEquals(expResult, result);
    }

    @Test
    public void testDayInMonth02() {
        System.out.println("DayInMonth UTCID02");
        int year = 2015;
        int month = 4;
        DateTime instance = new DateTime();
        int expResult = 31;
        int result = instance.DayInMonth(year, month);
        assertEquals(expResult, result);
    }

    @Test
    public void testDayInMonth03() {
        System.out.println("DayInMonth UTCID03");
        int year = 2015;
        int month = 5;
        DateTime instance = new DateTime();
        int expResult = 31;
        int result = instance.DayInMonth(year, month);
        assertEquals(expResult, result);
    }

    @Test
    public void testDayInMonth04() {
        System.out.println("DayInMonth UTCID04");
        int year = 2015;
        int month = 7;
        DateTime instance = new DateTime();
        int expResult = 31;
        int result = instance.DayInMonth(year, month);
        assertEquals(expResult, result);
    }

    @Test
    public void testDayInMonth05() {
        System.out.println("DayInMonth UTCID05");
        int year = 2015;
        int month = 8;
        DateTime instance = new DateTime();
        int expResult = 31;
        int result = instance.DayInMonth(year, month);
        assertEquals(expResult, result);
    }

    @Test
    public void testDayInMonth06() {
        System.out.println("DayInMonth UTCID06");
        int year = 2015;
        int month = 10;
        DateTime instance = new DateTime();
        int expResult = 31;
        int result = instance.DayInMonth(year, month);
        assertEquals(expResult, result);
    }

    @Test
    public void testDayInMonth07() {
        System.out.println("DayInMonth UTCID07");
        int year = 2015;
        int month = 12;
        DateTime instance = new DateTime();
        int expResult = 31;
        int result = instance.DayInMonth(year, month);
        assertEquals(expResult, result);
    }

    @Test
    public void testDayInMonth08() {
        System.out.println("DayInMonth UTCID08");
        int year = 2015;
        int month = 4;
        DateTime instance = new DateTime();
        int expResult = 30;
        int result = instance.DayInMonth(year, month);
        assertEquals(expResult, result);
    }

    @Test
    public void testDayInMonth09() {
        System.out.println("DayInMonth UTCID09");
        int year = 2015;
        int month = 6;
        DateTime instance = new DateTime();
        int expResult = 30;
        int result = instance.DayInMonth(year, month);
        assertEquals(expResult, result);
    }

    @Test
    public void testDayInMonth10() {
        System.out.println("DayInMonth UTCID10");
        int year = 2015;
        int month = 9;
        DateTime instance = new DateTime();
        int expResult = 30;
        int result = instance.DayInMonth(year, month);
        assertEquals(expResult, result);
    }

    @Test
    public void testDayInMonth11() {
        System.out.println("DayInMonth UTCID11");
        int year = 2015;
        int month = 11;
        DateTime instance = new DateTime();
        int expResult = 30;
        int result = instance.DayInMonth(year, month);
        assertEquals(expResult, result);
    }

    @Test
    public void testDayInMonth12() {
        System.out.println("DayInMonth UTCID12");
        int year = 1900;
        int month = 2;
        DateTime instance = new DateTime();
        int expResult = 28;
        int result = instance.DayInMonth(year, month);
        assertEquals(expResult, result);
    }

    @Test
    public void testDayInMonth13() {
        System.out.println("DayInMonth UTCID13");
        int year = 2000;
        int month = 2;
        DateTime instance = new DateTime();
        int expResult = 29;
        int result = instance.DayInMonth(year, month);
        assertEquals(expResult, result);
    }

    @Test
    public void testDayInMonth14() {
        System.out.println("DayInMonth UTCID14");
        int year = 2012;
        int month = 2;
        DateTime instance = new DateTime();
        int expResult = 29;
        int result = instance.DayInMonth(year, month);
        assertEquals(expResult, result);
    }

    @Test
    public void testDayInMonth15() {
        System.out.println("DayInMonth UTCID15");
        int year = 2015;
        int month = 2;
        DateTime instance = new DateTime();
        int expResult = 28;
        int result = instance.DayInMonth(year, month);
        assertEquals(expResult, result);
    }

    @Test
    public void testDayInMonth16() {
        System.out.println("DayInMonth UTCID16");
        int year = 2015;
        int month = 0;
        DateTime instance = new DateTime();
        int expResult = 0;
        int result = instance.DayInMonth(year, month);
        assertEquals(expResult, result);
    }

    /**
     * Test of CheckDate method, of class DateTime.
     */
    @Test
    public void testCheckDate01() {
        System.out.println("CheckDate UTCID02");
        int day = 1;
        int month = 1;
        int year = 2015;
        DateTime instance = new DateTime();
        boolean expResult = true;
        boolean result = instance.CheckDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void testCheckDate02() {
        System.out.println("CheckDate UTCID03");
        int day = 13;
        int month = 1;
        int year = 2015;
        DateTime instance = new DateTime();
        boolean expResult = true;
        boolean result = instance.CheckDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void testCheckDate03() {
        System.out.println("CheckDate UTCID04");
        int day = 31;
        int month = 1;
        int year = 2015;
        DateTime instance = new DateTime();
        boolean expResult = true;
        boolean result = instance.CheckDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void testCheckDate04() {
        System.out.println("CheckDate UTCID07");
        int day = 1;
        int month = 3;
        int year = 2015;
        DateTime instance = new DateTime();
        boolean expResult = true;
        boolean result = instance.CheckDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void testCheckDate05() {
        System.out.println("CheckDate UTCID08");
        int day = 13;
        int month = 3;
        int year = 2015;
        DateTime instance = new DateTime();
        boolean expResult = true;
        boolean result = instance.CheckDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void testCheckDate06() {
        System.out.println("CheckDate UTCID09");
        int day = 31;
        int month = 3;
        int year = 2015;
        DateTime instance = new DateTime();
        boolean expResult = true;
        boolean result = instance.CheckDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void testCheckDate07() {
        System.out.println("CheckDate UTCID12");
        int day = 1;
        int month = 5;
        int year = 2015;
        DateTime instance = new DateTime();
        boolean expResult = true;
        boolean result = instance.CheckDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void testCheckDate08() {
        System.out.println("CheckDate UTCID13");
        int day = 13;
        int month = 5;
        int year = 2015;
        DateTime instance = new DateTime();
        boolean expResult = true;
        boolean result = instance.CheckDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void testCheckDate09() {
        System.out.println("CheckDate UTCID14");
        int day = 31;
        int month = 5;
        int year = 2015;
        DateTime instance = new DateTime();
        boolean expResult = true;
        boolean result = instance.CheckDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void testCheckDate10() {
        System.out.println("CheckDate UTCID17");
        int day = 1;
        int month = 7;
        int year = 2015;
        DateTime instance = new DateTime();
        boolean expResult = true;
        boolean result = instance.CheckDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void testCheckDate11() {
        System.out.println("CheckDate UTCID18");
        int day = 13;
        int month = 7;
        int year = 2015;
        DateTime instance = new DateTime();
        boolean expResult = true;
        boolean result = instance.CheckDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void testCheckDate12() {
        System.out.println("CheckDate UTCID19");
        int day = 31;
        int month = 7;
        int year = 2015;
        DateTime instance = new DateTime();
        boolean expResult = true;
        boolean result = instance.CheckDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void testCheckDate13() {
        System.out.println("CheckDate UTCID22");
        int day = 1;
        int month = 8;
        int year = 2015;
        DateTime instance = new DateTime();
        boolean expResult = true;
        boolean result = instance.CheckDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void testCheckDate14() {
        System.out.println("CheckDate UTCID23");
        int day = 13;
        int month = 8;
        int year = 2015;
        DateTime instance = new DateTime();
        boolean expResult = true;
        boolean result = instance.CheckDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void testCheckDate15() {
        System.out.println("CheckDate UTCID24");
        int day = 31;
        int month = 8;
        int year = 2015;
        DateTime instance = new DateTime();
        boolean expResult = true;
        boolean result = instance.CheckDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void testCheckDate16() {
        System.out.println("CheckDate UTCID27");
        int day = 1;
        int month = 10;
        int year = 2015;
        DateTime instance = new DateTime();
        boolean expResult = true;
        boolean result = instance.CheckDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void testCheckDate17() {
        System.out.println("CheckDate UTCID28");
        int day = 13;
        int month = 10;
        int year = 2015;
        DateTime instance = new DateTime();
        boolean expResult = true;
        boolean result = instance.CheckDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void testCheckDate18() {
        System.out.println("CheckDate UTCID29");
        int day = 31;
        int month = 10;
        int year = 2015;
        DateTime instance = new DateTime();
        boolean expResult = true;
        boolean result = instance.CheckDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void testCheckDate19() {
        System.out.println("CheckDate UTCID32");
        int day = 1;
        int month = 12;
        int year = 2015;
        DateTime instance = new DateTime();
        boolean expResult = true;
        boolean result = instance.CheckDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void testCheckDate20() {
        System.out.println("CheckDate UTCID33");
        int day = 13;
        int month = 12;
        int year = 2015;
        DateTime instance = new DateTime();
        boolean expResult = true;
        boolean result = instance.CheckDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void testCheckDate21() {
        System.out.println("CheckDate UTCID34");
        int day = 31;
        int month = 12;
        int year = 2015;
        DateTime instance = new DateTime();
        boolean expResult = true;
        boolean result = instance.CheckDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void testCheckDate22() {
        System.out.println("CheckDate UTCID37");
        int day = 1;
        int month = 4;
        int year = 2015;
        DateTime instance = new DateTime();
        boolean expResult = true;
        boolean result = instance.CheckDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void testCheckDate23() {
        System.out.println("CheckDate UTCID38");
        int day = 13;
        int month = 4;
        int year = 2015;
        DateTime instance = new DateTime();
        boolean expResult = true;
        boolean result = instance.CheckDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void testCheckDate24() {
        System.out.println("CheckDate UTCID39");
        int day = 30;
        int month = 4;
        int year = 2015;
        DateTime instance = new DateTime();
        boolean expResult = true;
        boolean result = instance.CheckDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void testCheckDate25() {
        System.out.println("CheckDate UTCID40");
        int day = 31;
        int month = 4;
        int year = 2015;
        DateTime instance = new DateTime();
        boolean expResult = false;
        boolean result = instance.CheckDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void testCheckDate26() {
        System.out.println("CheckDate UTCID43");
        int day = 1;
        int month = 6;
        int year = 2015;
        DateTime instance = new DateTime();
        boolean expResult = true;
        boolean result = instance.CheckDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void testCheckDate27() {
        System.out.println("CheckDate UTCID44");
        int day = 13;
        int month = 6;
        int year = 2015;
        DateTime instance = new DateTime();
        boolean expResult = true;
        boolean result = instance.CheckDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void testCheckDate28() {
        System.out.println("CheckDate UTCID45");
        int day = 30;
        int month = 6;
        int year = 2015;
        DateTime instance = new DateTime();
        boolean expResult = true;
        boolean result = instance.CheckDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void testCheckDate29() {
        System.out.println("CheckDate UTCID46");
        int day = 31;
        int month = 6;
        int year = 2015;
        DateTime instance = new DateTime();
        boolean expResult = false;
        boolean result = instance.CheckDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void testCheckDate30() {
        System.out.println("CheckDate UTCID49");
        int day = 1;
        int month = 9;
        int year = 2015;
        DateTime instance = new DateTime();
        boolean expResult = true;
        boolean result = instance.CheckDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void testCheckDate31() {
        System.out.println("CheckDate UTCID50");
        int day = 13;
        int month = 9;
        int year = 2015;
        DateTime instance = new DateTime();
        boolean expResult = true;
        boolean result = instance.CheckDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void testCheckDate32() {
        System.out.println("CheckDate UTCID51");
        int day = 30;
        int month = 9;
        int year = 2015;
        DateTime instance = new DateTime();
        boolean expResult = true;
        boolean result = instance.CheckDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void testCheckDate33() {
        System.out.println("CheckDate UTCID52");
        int day = 31;
        int month = 9;
        int year = 2015;
        DateTime instance = new DateTime();
        boolean expResult = false;
        boolean result = instance.CheckDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void testCheckDate34() {
        System.out.println("CheckDate UTCID55");
        int day = 1;
        int month = 11;
        int year = 2015;
        DateTime instance = new DateTime();
        boolean expResult = true;
        boolean result = instance.CheckDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void testCheckDate35() {
        System.out.println("CheckDate UTCID56");
        int day = 13;
        int month = 11;
        int year = 2015;
        DateTime instance = new DateTime();
        boolean expResult = true;
        boolean result = instance.CheckDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void testCheckDate36() {
        System.out.println("CheckDate UTCID57");
        int day = 30;
        int month = 11;
        int year = 2015;
        DateTime instance = new DateTime();
        boolean expResult = true;
        boolean result = instance.CheckDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void testCheckDate37() {
        System.out.println("CheckDate UTCID58");
        int day = 31;
        int month = 11;
        int year = 2015;
        DateTime instance = new DateTime();
        boolean expResult = false;
        boolean result = instance.CheckDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void testCheckDate38() {
        System.out.println("CheckDate UTCID61");
        int day = 1;
        int month = 2;
        int year = 1900;
        DateTime instance = new DateTime();
        boolean expResult = true;
        boolean result = instance.CheckDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void testCheckDate39() {
        System.out.println("CheckDate UTCID62");
        int day = 13;
        int month = 2;
        int year = 1900;
        DateTime instance = new DateTime();
        boolean expResult = true;
        boolean result = instance.CheckDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void testCheckDate40() {
        System.out.println("CheckDate UTCID63");
        int day = 28;
        int month = 2;
        int year = 1900;
        DateTime instance = new DateTime();
        boolean expResult = true;
        boolean result = instance.CheckDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void testCheckDate41() {
        System.out.println("CheckDate UTCID64");
        int day = 29;
        int month = 2;
        int year = 1900;
        DateTime instance = new DateTime();
        boolean expResult = false;
        boolean result = instance.CheckDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void testCheckDate42() {
        System.out.println("CheckDate UTCID65");
        int day = 31;
        int month = 2;
        int year = 1900;
        DateTime instance = new DateTime();
        boolean expResult = false;
        boolean result = instance.CheckDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void testCheckDate43() {
        System.out.println("CheckDate UTCID68");
        int day = 1;
        int month = 2;
        int year = 2000;
        DateTime instance = new DateTime();
        boolean expResult = true;
        boolean result = instance.CheckDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void testCheckDate44() {
        System.out.println("CheckDate UTCID69");
        int day = 13;
        int month = 2;
        int year = 2000;
        DateTime instance = new DateTime();
        boolean expResult = true;
        boolean result = instance.CheckDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void testCheckDate45() {
        System.out.println("CheckDate UTCID70");
        int day = 29;
        int month = 2;
        int year = 2000;
        DateTime instance = new DateTime();
        boolean expResult = true;
        boolean result = instance.CheckDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void testCheckDate46() {
        System.out.println("CheckDate UTCID71");
        int day = 30;
        int month = 2;
        int year = 2000;
        DateTime instance = new DateTime();
        boolean expResult = false;
        boolean result = instance.CheckDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void testCheckDate47() {
        System.out.println("CheckDate UTCID72");
        int day = 31;
        int month = 2;
        int year = 2000;
        DateTime instance = new DateTime();
        boolean expResult = false;
        boolean result = instance.CheckDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void testCheckDate48() {
        System.out.println("CheckDate UTCID75");
        int day = 1;
        int month = 2;
        int year = 2012;
        DateTime instance = new DateTime();
        boolean expResult = true;
        boolean result = instance.CheckDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void testCheckDate49() {
        System.out.println("CheckDate UTCID76");
        int day = 13;
        int month = 2;
        int year = 2012;
        DateTime instance = new DateTime();
        boolean expResult = true;
        boolean result = instance.CheckDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void testCheckDate50() {
        System.out.println("CheckDate UTCID77");
        int day = 29;
        int month = 2;
        int year = 2012;
        DateTime instance = new DateTime();
        boolean expResult = true;
        boolean result = instance.CheckDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void testCheckDate51() {
        System.out.println("CheckDate UTCID78");
        int day = 30;
        int month = 2;
        int year = 2012;
        DateTime instance = new DateTime();
        boolean expResult = false;
        boolean result = instance.CheckDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void testCheckDate52() {
        System.out.println("CheckDate UTCID79");
        int day = 31;
        int month = 2;
        int year = 2012;
        DateTime instance = new DateTime();
        boolean expResult = false;
        boolean result = instance.CheckDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void testCheckDate53() {
        System.out.println("CheckDate UTCID82");
        int day = 1;
        int month = 2;
        int year = 2015;
        DateTime instance = new DateTime();
        boolean expResult = true;
        boolean result = instance.CheckDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void testCheckDate54() {
        System.out.println("CheckDate UTCID83");
        int day = 13;
        int month = 2;
        int year = 2015;
        DateTime instance = new DateTime();
        boolean expResult = true;
        boolean result = instance.CheckDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void testCheckDate56() {
        System.out.println("CheckDate UTCID84");
        int day = 28;
        int month = 2;
        int year = 2015;
        DateTime instance = new DateTime();
        boolean expResult = true;
        boolean result = instance.CheckDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void testCheckDate57() {
        System.out.println("CheckDate UTCID85");
        int day = 29;
        int month = 2;
        int year = 2015;
        DateTime instance = new DateTime();
        boolean expResult = false;
        boolean result = instance.CheckDate(day, month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void testCheckDate58() {
        System.out.println("CheckDate UTCID86");
        int day = 31;
        int month = 2;
        int year = 2015;
        DateTime instance = new DateTime();
        boolean expResult = false;
        boolean result = instance.CheckDate(day, month, year);
        assertEquals(expResult, result);
    }

    /**
     * Test of validInput method, of class DateTime.
     */
    @Test
    public void testValidInput01() {
        System.out.println("CheckDate UTCID01");
        String dayString = "0";
        String monthString = "1";
        String yearString = "2015";
        DateTime instance = new DateTime();
        int expResult = 31;
        int result = instance.validInput(dayString, monthString, yearString);
        assertEquals(expResult, result);
    }

    @Test
    public void testValidInput02() {
        System.out.println("CheckDate UTCID05");
        String dayString = "32";
        String monthString = "1";
        String yearString = "2015";
        DateTime instance = new DateTime();
        int expResult = 31;
        int result = instance.validInput(dayString, monthString, yearString);
        assertEquals(expResult, result);
    }

    @Test
    public void testValidInput03() {
        System.out.println("CheckDate UTCID06");
        String dayString = "0";
        String monthString = "3";
        String yearString = "2015";
        DateTime instance = new DateTime();
        int expResult = 31;
        int result = instance.validInput(dayString, monthString, yearString);
        assertEquals(expResult, result);
    }

    @Test
    public void testValidInput04() {
        System.out.println("CheckDate UTCID010");
        String dayString = "32";
        String monthString = "3";
        String yearString = "2015";
        DateTime instance = new DateTime();
        int expResult = 31;
        int result = instance.validInput(dayString, monthString, yearString);
        assertEquals(expResult, result);
    }

    @Test
    public void testValidInput05() {
        System.out.println("CheckDate UTCID11");
        String dayString = "0";
        String monthString = "5";
        String yearString = "2015";
        DateTime instance = new DateTime();
        int expResult = 31;
        int result = instance.validInput(dayString, monthString, yearString);
        assertEquals(expResult, result);
    }

    @Test
    public void testValidInput06() {
        System.out.println("CheckDate UTCID15");
        String dayString = "32";
        String monthString = "5";
        String yearString = "2015";
        DateTime instance = new DateTime();
        int expResult = 31;
        int result = instance.validInput(dayString, monthString, yearString);
        assertEquals(expResult, result);
    }

    @Test
    public void testValidInput07() {
        System.out.println("CheckDate UTCID016");
        String dayString = "0";
        String monthString = "7";
        String yearString = "2015";
        DateTime instance = new DateTime();
        int expResult = 31;
        int result = instance.validInput(dayString, monthString, yearString);
        assertEquals(expResult, result);
    }

    @Test
    public void testValidInput08() {
        System.out.println("CheckDate UTCID20");
        String dayString = "32";
        String monthString = "7";
        String yearString = "2015";
        DateTime instance = new DateTime();
        int expResult = 31;
        int result = instance.validInput(dayString, monthString, yearString);
        assertEquals(expResult, result);
    }

    @Test
    public void testValidInput09() {
        System.out.println("CheckDate UTCID21");
        String dayString = "0";
        String monthString = "8";
        String yearString = "2015";
        DateTime instance = new DateTime();
        int expResult = 31;
        int result = instance.validInput(dayString, monthString, yearString);
        assertEquals(expResult, result);
    }

    @Test
    public void testValidInput10() {
        System.out.println("CheckDate UTCID25");
        String dayString = "32";
        String monthString = "8";
        String yearString = "2015";
        DateTime instance = new DateTime();
        int expResult = 31;
        int result = instance.validInput(dayString, monthString, yearString);
        assertEquals(expResult, result);
    }

    @Test
    public void testValidInput11() {
        System.out.println("CheckDate UTCID26");
        String dayString = "0";
        String monthString = "10";
        String yearString = "2015";
        DateTime instance = new DateTime();
        int expResult = 31;
        int result = instance.validInput(dayString, monthString, yearString);
        assertEquals(expResult, result);
    }

    @Test
    public void testValidInput12() {
        System.out.println("CheckDate UTCID30");
        String dayString = "32";
        String monthString = "10";
        String yearString = "2015";
        DateTime instance = new DateTime();
        int expResult = 31;
        int result = instance.validInput(dayString, monthString, yearString);
        assertEquals(expResult, result);
    }

    @Test
    public void testValidInput13() {
        System.out.println("CheckDate UTCID31");
        String dayString = "0";
        String monthString = "12";
        String yearString = "2015";
        DateTime instance = new DateTime();
        int expResult = 31;
        int result = instance.validInput(dayString, monthString, yearString);
        assertEquals(expResult, result);
    }

    @Test
    public void testValidInput14() {
        System.out.println("CheckDate UTCID35");
        String dayString = "32";
        String monthString = "12";
        String yearString = "2015";
        DateTime instance = new DateTime();
        int expResult = 31;
        int result = instance.validInput(dayString, monthString, yearString);
        assertEquals(expResult, result);
    }

    @Test
    public void testValidInput15() {
        System.out.println("CheckDate UTCID36");
        String dayString = "0";
        String monthString = "4";
        String yearString = "2015";
        DateTime instance = new DateTime();
        int expResult = 31;
        int result = instance.validInput(dayString, monthString, yearString);
        assertEquals(expResult, result);
    }

    @Test
    public void testValidInput16() {
        System.out.println("CheckDate UTCID41");
        String dayString = "32";
        String monthString = "4";
        String yearString = "2015";
        DateTime instance = new DateTime();
        int expResult = 31;
        int result = instance.validInput(dayString, monthString, yearString);
        assertEquals(expResult, result);
    }

    @Test
    public void testValidInput17() {
        System.out.println("CheckDate UTCID42");
        String dayString = "0";
        String monthString = "6";
        String yearString = "2015";
        DateTime instance = new DateTime();
        int expResult = 31;
        int result = instance.validInput(dayString, monthString, yearString);
        assertEquals(expResult, result);
    }

    @Test
    public void testValidInput18() {
        System.out.println("CheckDate UTCID47");
        String dayString = "32";
        String monthString = "6";
        String yearString = "2015";
        DateTime instance = new DateTime();
        int expResult = 31;
        int result = instance.validInput(dayString, monthString, yearString);
        assertEquals(expResult, result);
    }

    @Test
    public void testValidInput19() {
        System.out.println("CheckDate UTCID48");
        String dayString = "0";
        String monthString = "9";
        String yearString = "2015";
        DateTime instance = new DateTime();
        int expResult = 31;
        int result = instance.validInput(dayString, monthString, yearString);
        assertEquals(expResult, result);
    }

    @Test
    public void testValidInput20() {
        System.out.println("CheckDate UTCID53");
        String dayString = "32";
        String monthString = "9";
        String yearString = "2015";
        DateTime instance = new DateTime();
        int expResult = 31;
        int result = instance.validInput(dayString, monthString, yearString);
        assertEquals(expResult, result);
    }

    @Test
    public void testValidInput21() {
        System.out.println("CheckDate UTCID54");
        String dayString = "0";
        String monthString = "11";
        String yearString = "2015";
        DateTime instance = new DateTime();
        int expResult = 31;
        int result = instance.validInput(dayString, monthString, yearString);
        assertEquals(expResult, result);
    }

    @Test
    public void testValidInput22() {
        System.out.println("CheckDate UTCID59");
        String dayString = "32";
        String monthString = "11";
        String yearString = "2015";
        DateTime instance = new DateTime();
        int expResult = 31;
        int result = instance.validInput(dayString, monthString, yearString);
        assertEquals(expResult, result);
    }

    @Test
    public void testValidInput23() {
        System.out.println("CheckDate UTCID60");
        String dayString = "0";
        String monthString = "2";
        String yearString = "1900";
        DateTime instance = new DateTime();
        int expResult = 31;
        int result = instance.validInput(dayString, monthString, yearString);
        assertEquals(expResult, result);
    }

    @Test
    public void testValidInput24() {
        System.out.println("CheckDate UTCID66");
        String dayString = "32";
        String monthString = "2";
        String yearString = "1900";
        DateTime instance = new DateTime();
        int expResult = 31;
        int result = instance.validInput(dayString, monthString, yearString);
        assertEquals(expResult, result);
    }

    @Test
    public void testValidInput25() {
        System.out.println("CheckDate UTCID67");
        String dayString = "0";
        String monthString = "2";
        String yearString = "2000";
        DateTime instance = new DateTime();
        int expResult = 31;
        int result = instance.validInput(dayString, monthString, yearString);
        assertEquals(expResult, result);
    }

    @Test
    public void testValidInput26() {
        System.out.println("CheckDate UTCID73");
        String dayString = "32";
        String monthString = "2";
        String yearString = "2000";
        DateTime instance = new DateTime();
        int expResult = 31;
        int result = instance.validInput(dayString, monthString, yearString);
        assertEquals(expResult, result);
    }

    @Test
    public void testValidInput27() {
        System.out.println("CheckDate UTCID74");
        String dayString = "0";
        String monthString = "2";
        String yearString = "2012";
        DateTime instance = new DateTime();
        int expResult = 31;
        int result = instance.validInput(dayString, monthString, yearString);
        assertEquals(expResult, result);
    }

    @Test
    public void testValidInput28() {
        System.out.println("CheckDate UTCID80");
        String dayString = "32";
        String monthString = "2";
        String yearString = "2012";
        DateTime instance = new DateTime();
        int expResult = 31;
        int result = instance.validInput(dayString, monthString, yearString);
        assertEquals(expResult, result);
    }

    @Test
    public void testValidInput29() {
        System.out.println("CheckDate UTCID81");
        String dayString = "0";
        String monthString = "2";
        String yearString = "2015";
        DateTime instance = new DateTime();
        int expResult = 31;
        int result = instance.validInput(dayString, monthString, yearString);
        assertEquals(expResult, result);
    }

    @Test
    public void testValidInput30() {
        System.out.println("CheckDate UTCID87");
        String dayString = "32";
        String monthString = "2";
        String yearString = "2015";
        DateTime instance = new DateTime();
        int expResult = 31;
        int result = instance.validInput(dayString, monthString, yearString);
        assertEquals(expResult, result);
    }

    @Test
    public void testValidInput31() {
        System.out.println("CheckDate UTCID88");
        String dayString = "1,5";
        String monthString = "1";
        String yearString = "2015";
        DateTime instance = new DateTime();
        int expResult = 21;
        int result = instance.validInput(dayString, monthString, yearString);
        assertEquals(expResult, result);
    }

    @Test
    public void testValidInput32() {
        System.out.println("CheckDate UTCID89");
        String dayString = "a";
        String monthString = "1";
        String yearString = "2015";
        DateTime instance = new DateTime();
        int expResult = 21;
        int result = instance.validInput(dayString, monthString, yearString);
        assertEquals(expResult, result);
    }

    @Test
    public void testValidInput33() {
        System.out.println("CheckDate UTCID90");
        String dayString = "@";
        String monthString = "1";
        String yearString = "2015";
        DateTime instance = new DateTime();
        int expResult = 21;
        int result = instance.validInput(dayString, monthString, yearString);
        assertEquals(expResult, result);
    }

    @Test
    public void testValidInput34() {
        System.out.println("CheckDate UTCID91");
        String dayString = "";
        String monthString = "1";
        String yearString = "2015";
        DateTime instance = new DateTime();
        int expResult = 11;
        int result = instance.validInput(dayString, monthString, yearString);
        assertEquals(expResult, result);
    }

    @Test
    public void testValidInput35() {
        System.out.println("CheckDate UTCID92");
        String dayString = "13";
        String monthString = "0";
        String yearString = "2015";
        DateTime instance = new DateTime();
        int expResult = 32;
        int result = instance.validInput(dayString, monthString, yearString);
        assertEquals(expResult, result);
    }

    @Test
    public void testValidInput36() {
        System.out.println("CheckDate UTCID93");
        String dayString = "13";
        String monthString = "13";
        String yearString = "2015";
        DateTime instance = new DateTime();
        int expResult = 32;
        int result = instance.validInput(dayString, monthString, yearString);
        assertEquals(expResult, result);
    }

    @Test
    public void testValidInput37() {
        System.out.println("CheckDate UTCID94");
        String dayString = "13";
        String monthString = "1,5";
        String yearString = "2015";
        DateTime instance = new DateTime();
        int expResult = 22;
        int result = instance.validInput(dayString, monthString, yearString);
        assertEquals(expResult, result);
    }

    @Test
    public void testValidInput38() {
        System.out.println("CheckDate UTCID95");
        String dayString = "13";
        String monthString = "a";
        String yearString = "2015";
        DateTime instance = new DateTime();
        int expResult = 22;
        int result = instance.validInput(dayString, monthString, yearString);
        assertEquals(expResult, result);
    }

    @Test
    public void testValidInput39() {
        System.out.println("CheckDate UTCID96");
        String dayString = "13";
        String monthString = "@";
        String yearString = "2015";
        DateTime instance = new DateTime();
        int expResult = 22;
        int result = instance.validInput(dayString, monthString, yearString);
        assertEquals(expResult, result);
    }

    @Test
    public void testValidInput40() {
        System.out.println("CheckDate UTCID97");
        String dayString = "13";
        String monthString = "";
        String yearString = "2015";
        DateTime instance = new DateTime();
        int expResult = 12;
        int result = instance.validInput(dayString, monthString, yearString);
        assertEquals(expResult, result);
    }

    @Test
    public void testValidInput41() {
        System.out.println("CheckDate UTCID98");
        String dayString = "13";
        String monthString = "1";
        String yearString = "999";
        DateTime instance = new DateTime();
        int expResult = 33;
        int result = instance.validInput(dayString, monthString, yearString);
        assertEquals(expResult, result);
    }

    @Test
    public void testValidInput42() {
        System.out.println("CheckDate UTCID99");
        String dayString = "13";
        String monthString = "1";
        String yearString = "3001";
        DateTime instance = new DateTime();
        int expResult = 33;
        int result = instance.validInput(dayString, monthString, yearString);
        assertEquals(expResult, result);
    }

    @Test
    public void testValidInput43() {
        System.out.println("CheckDate UTCID100");
        String dayString = "13";
        String monthString = "1";
        String yearString = "1,5";
        DateTime instance = new DateTime();
        int expResult = 23;
        int result = instance.validInput(dayString, monthString, yearString);
        assertEquals(expResult, result);
    }

    @Test
    public void testValidInput44() {
        System.out.println("CheckDate UTCID101");
        String dayString = "13";
        String monthString = "1";
        String yearString = "a";
        DateTime instance = new DateTime();
        int expResult = 23;
        int result = instance.validInput(dayString, monthString, yearString);
        assertEquals(expResult, result);
    }

    @Test
    public void testValidInput45() {
        System.out.println("CheckDate UTCID102");
        String dayString = "13";
        String monthString = "1";
        String yearString = "@";
        DateTime instance = new DateTime();
        int expResult = 23;
        int result = instance.validInput(dayString, monthString, yearString);
        assertEquals(expResult, result);
    }

    @Test
    public void testValidInput46() {
        System.out.println("CheckDate UTCID103");
        String dayString = "13";
        String monthString = "1";
        String yearString = "";
        DateTime instance = new DateTime();
        int expResult = 13;
        int result = instance.validInput(dayString, monthString, yearString);
        assertEquals(expResult, result);
    }
}
