package org.example.SaleApartament;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class SalesServiceTest {

    @Test
    public void shouldcalculateRevenue(){
      SalesService service = new SalesService();

      int actual =service.calculateRevenue(30, 10, 10000);
      int expected = 330000;

        Assertions.assertEquals(expected, actual);

    }


}
