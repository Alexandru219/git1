package TestNG.mkyongexamles;

import mkyong.RandomEmailGenerator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EmailGeneratorTest {

    @Test()
    public void emailGeneratorTest() {

        RandomEmailGenerator obj = new RandomEmailGenerator();
        String email = obj.generate();

        Assert.assertNotNull(email);
        Assert.assertEquals(email, "feedback@yoursite.com");

    }

}