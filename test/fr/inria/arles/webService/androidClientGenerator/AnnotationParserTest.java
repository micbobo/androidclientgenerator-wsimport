
package fr.inria.arles.webService.androidClientGenerator;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ajay
 */
public class AnnotationParserTest {

    public AnnotationParserTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testSingleProperty() {
        String[] ret = AnnotationParser.parse("@WebMethod(operationName = \"RFIDQuery\")", "WebMethod",
                "operationName");
        String[] expected={"RFIDQuery"};
        assertArrayEquals(expected, ret);
        assertEquals(expected[0], ret[0]);
    }
    
    @Test
    public void testNullProperty() {
        String[] ret = AnnotationParser.parse("@WebMethod(operationName = \"RFIDQuery\")", "WebMethod",
                "action");
        String[] expected={null};
        assertArrayEquals(expected, ret);
    }
    
    @Test
    public void testNoPropertyAnnotation() {
        String[] ret = AnnotationParser.parse("@WebMethod", "WebMethod",
                "action");
        String[] expected=null;
        assertArrayEquals(expected, ret);
    }
    
    
    @Test
    public void testMultipleProperty() {
        String[] ret = AnnotationParser.parse("@WebMethod(operationName = \"RFIDQuery\""
                + " action=\"doIt\" )", "WebMethod",
                "operationName","action");
        String[] expected={"RFIDQuery","doIt"};
        assertArrayEquals(expected, ret);
        
    }
    
}
