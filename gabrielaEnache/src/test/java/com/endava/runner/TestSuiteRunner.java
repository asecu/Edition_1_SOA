package com.endava.runner;

import com.endava.generics.BookTest;
import com.endava.generics.GenericLibraryTest;
import com.endava.generics.LibraryTest;
import com.endava.generics.NewspaperTest;
import com.endava.generics.VideoTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({BookTest.class,
        GenericLibraryTest.class,
        LibraryTest.class,
        NewspaperTest.class,
        VideoTest.class})
public class TestSuiteRunner {
}
