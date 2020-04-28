package Tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({BookTest.class,
        GenericLibraryTest.class,
        LibraryTest.class,
        VideoTest.class})
public class AllTestsRun {

    public class TestSuiteRunner {
    }
}
