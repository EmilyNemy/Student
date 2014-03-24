import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StudentTest {
    private Student student_called_john;
    private int Math_Mark = 45;
    private int English_Mark = 68;
    private int Science_Mark = 73;


    @Before
    public void setUp(){
        student_called_john = new Student("S_1","John");
        student_called_john.enterMarks(this.Math_Mark, this.English_Mark, this.Science_Mark);
    }

    @Test
    public void test_getting_the_student_name(){
        assertEquals("John", student_called_john.getName());
    }

    @Test
    public void test_getting_the_student_number(){
        assertEquals("S_1", student_called_john.getNumber());
    }

    @Test
    public void test_getting_the_student_math_mark(){
        assertEquals(this.Math_Mark, student_called_john.getMathsMark());
    }

    @Test
    public void test_getting_the_student_english_mark(){
        assertEquals(this.English_Mark, student_called_john.getEnglishMark());
    }

    @Test
    public void test_getting_the_student_science_mark(){
        assertEquals(this.Science_Mark, student_called_john.getScienceMark());
    }
}
