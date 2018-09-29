package HjemmeOpgaverTilAndenOktober;

import org.junit.Test;

import static org.junit.Assert.*;

public class MomsRegnerTest {


    //Huskeliste:
    /*
   //3. arrange/setup.
   int a = 5;
   int b = 5;

   //2. Act / Execution
   SKSKS sksks = new SKSKS();

   //1 Assert / Verifaction.
   assertEquals(9,sksks.add(5,5));
   */

    //test 1
    @Test
    public void momsudregningReturnereEtTal() {


        //
        double foer = 25;
        double efter = 5;

        //2.
        MomsRegner momsRegner = new MomsRegner();

        //1.
        assertEquals(efter,momsRegner.momsReturnerTal(foer),0.001);

    }

    //test 2
    @Test
    public void momsAendrerTallet(){
        //altså den ikke bare returnere det samme igen.
        //så vi kan se den gør noget ved tallet.

        //3.
        double foer = 5;
        double efter = 5;


        //2.
        MomsRegner momsRegner = new MomsRegner();

        //1.
        assertNotEquals(efter,momsRegner.momsReturnerTal(foer),0.000001);

    }

}