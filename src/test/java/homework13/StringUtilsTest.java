package homework13;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.Assert.*;

public class StringUtilsTest {

    @Test
    public void stringIsNotBlank(){
        String notBlankString = "Hello world!!!";
        boolean result = StringUtils.isBlank(notBlankString);
        assertFalse(result);
    }

    @Test
    public void stringIsBlank(){
        String BlankString = "";
        boolean result = StringUtils.isBlank(BlankString);
        assertTrue(result);
    }
    @Test
    public void stringContainsSpace(){
        String checkString = " ";
        boolean result = StringUtils.contains(checkString, " ");
        assertTrue(result);
    }

    @Test
    public void stringEndsWith(){
        String checkString = "Hello world!!!";
        boolean result = StringUtils.endsWith(checkString, "!");
        assertTrue(result);
    }
    @ParameterizedTest
    @ValueSource(strings = {"cat", "capable", "cap"})
    void startsWith (String listOfWords) {
        boolean result = StringUtils.startsWith(listOfWords, "ca");
        assertTrue(result);
    }

    @Test
    public void stringEndsWithAny(){
        String checkString = "Hello worldt";
        boolean result = StringUtils.endsWithAny(checkString, "!", "t");
        assertTrue(result);
    }

    @Test
    public void checkAnyEquals(){
        boolean result = StringUtils.equalsAny("123", "321", "123");
        assertTrue(result);
    }

    @Test
    public void checkEqualsIgnoreCase(){
        boolean result = StringUtils.equalsIgnoreCase("AbC", "aBc");
        assertTrue(result);
    }

    @Test
    public void findFirstNonBlank(){
        String result = StringUtils.firstNonBlank(null, "", "aBc");
        System.out.println(result);
    }

    @Test
    public void getCommonPrefix(){
        String result = StringUtils.getCommonPrefix(new String[] {"i am a puppie", "i am a parrot"});
        System.out.println(result);
    }

    @Test
    public void findIndexOf(){
        int result = StringUtils.indexOf("Trello", "e");
        System.out.println(result + 1);
    }

    @Test
    public void join(){
        String result = StringUtils.join(new String[]{"Test", "is", "done"}, ' ');
        System.out.println(result);
    }
}
