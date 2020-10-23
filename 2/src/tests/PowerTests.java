package tests;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import bridge.*;

public class PowerTests {

    @Test
    public void recPowerTestWithForMult(){
        Power power = new Power(new RecPowerImpl(new Mult(new ForMultImpl())));
        int result = power.power(2, 3);
        assertEquals(8, result);
    }

    @Test
    public void forPowerTestWithForMult(){
        Power power = new Power(new RecPowerImpl(new Mult(new ForMultImpl())));
        int result = power.power(2, 3);
        assertEquals(8, result);
    }

    @Test
    public void recPowerTestWithRegMult(){
        Power power = new Power(new RecPowerImpl(new Mult(new RegMultImpl())));
        int result = power.power(2, 3);
        assertEquals(8, result);
    }

    @Test
    public void forPowerTestWithRegMult(){
        Power power = new Power(new RecPowerImpl(new Mult(new RegMultImpl())));
        int result = power.power(2, 3);
        assertEquals(8, result);
    }

}


