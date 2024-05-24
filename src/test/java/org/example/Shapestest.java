package org.example;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class Shapestest {
    @Test
     public void sqrarea(){
        Shapes shape = new Shapes();

        Assertions.assertEquals(576,shape.computesqrarea(24));

    }
    @Test
    public void circle(){
        Shapes shape = new Shapes();
        Assertions.assertEquals(78.5,shape.computecicarea(5),"ok");
    }

    @Test
    public void circle_Supplier(){

        Shapes shape = new Shapes();
       Assertions.assertEquals(78.5,shape.computecicarea(5),"ok");
    }

}
