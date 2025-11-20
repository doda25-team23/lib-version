package doda25.team23;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for VersionUtil
 */
public class VersionUtilTest
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public VersionUtilTest(String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( VersionUtilTest.class );
    }

    public void testVersionNotNull()
    {
        assertNotNull(VersionUtil.getVersion());
    }

    public void testVersionNotUnknown()
    {
        assertNotSame("unknown", VersionUtil.getVersion());
    }
}
