package Actions;


import Creatures.Cat;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CatActionsTest {

    private CatActions catActions;



    @Test
    void CatCanRun() {

        Cat cat = new Cat("Persik", 3, 15);

        boolean a = catActions.IfCatCanClimb(cat);
        boolean b = catActions.IfCatCanRun(cat);

        Assertions.assertTrue(a);
        Assertions.assertTrue(b);



    }


    }
