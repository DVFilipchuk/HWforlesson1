package Actions;

import Creatures.Human;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HumanActionsTest {

    private HumanActions humanActions;

    @Test
    void ifHumanCanClimb() {

        Human human = new Human("Fedya", 1, 10);


        boolean a = humanActions.IfHumanCanClimb(human);
        boolean b = humanActions.IfHumanCanRun(human);


        Assertions.assertTrue(a);
        Assertions.assertTrue(b);
    }
}