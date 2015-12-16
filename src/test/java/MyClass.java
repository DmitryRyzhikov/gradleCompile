import org.junit.Assert;
import org.junit.Test;

import org.apache.commons.lang.StringUtils;

public class MyClass {

    @Test
    public void test(){
        Assert.assertTrue(StringUtils.isEmpty(null));
    }
}
