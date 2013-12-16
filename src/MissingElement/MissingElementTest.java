package MissingElement;

import org.junit.After;
import org.junit.Before;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;


@RunWith(JUnit4.class)
public class MissingElementTest {

    @Test
    public void tryStuff() {
        assertEquals("test equality", 1,1);
        assertTrue("test true", true);
        assertFalse("test false", false);
        org.junit.Assert.assertEquals("test equals", "test", "test");
        org.junit.Assert.assertEquals("test equals", 51, 51);
    }

}
