import org.junit.jupiter.api.*;

import java.nio.file.AccessDeniedException;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @BeforeAll
    static void setUpAll(){
        System.out.println("BeforeAll is executed");
    }

    @AfterAll
    static void tearDownAll(){
        System.out.println("AfterAll is executed");
    }

    @BeforeEach
    void setUpEach(){
        System.out.println("BeforeEach is executed");
    }

    @AfterEach
    void tearDownEach(){
        System.out.println("AfterEach is executed");
    }

    @Test
    @DisplayName("My Method") //on the left side - if not it will show method name
    void add() {
        System.out.println("Add Method");
        int actual = Calculator.add(2,3);
        assertEquals(5,actual,"Test Failed");
    }

    @Test
    void add2(){
        System.out.println("Add 2 Method");
//        assertThrows(IllegalArgumentException.class, () -> Calculator.add2(3,2));
//        assertThrows(AccessDeniedException.class, ()-> Calculator.add2(3,2));
        assertThrows(IllegalArgumentException.class, ()->Calculator.add2(2,3));
    }

    @Test
    void testCase1(){
        //System.out.println("Test Case 1");
        fail("Not Implemented Yet");
    }

    @Test
    void testCase2(){
        System.out.println("Test Case 2");
        assertTrue(Calculator.operator.equals("add"));
        assertEquals("add",Calculator.operator);

    }

    @Test
    void testCase3(){
        System.out.println("Test Case 3");
        assertArrayEquals(new int[]{1,3,2}, new int[]{1,2,3}, "Arrays are not same.");
    }

    @Test
    void testCase4(){
        System.out.println("Test Case 4");

        String nullString = null;
        String notNullString = "Cydeo";

        //assertNull(notNullString);
        assertNotNull(nullString);

    }

    @Test
    void testCase5(){
        System.out.println("Test Case 5");

        Calculator c1 = new Calculator();
        Calculator c2 = c1;
        Calculator c3 = new Calculator();

        assertSame(c1,c2);
        assertNotSame(c1,c3);


        // maven-surefire-plugin
        // with this we can use terminal to run the test


    }



}