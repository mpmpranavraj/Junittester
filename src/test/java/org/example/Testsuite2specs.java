package org.example;




import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
import org.junit.Test;




public class Testsuite2specs {
    @Test
    public void Greet(){
        Testsuite2 g = new Testsuite2();
        Assertions.assertEquals("Hello",g.greet());


    }
}
