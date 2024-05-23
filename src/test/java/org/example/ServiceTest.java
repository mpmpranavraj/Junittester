import org.example.Service;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ServiceTest {

    @Test
    public void moviesEmptyOrNot(){
        Service movies = new Service();

        List<String> list = movies.getmovies();

        assertTrue(list.isEmpty(),()->"movies should be empty");


    }
}