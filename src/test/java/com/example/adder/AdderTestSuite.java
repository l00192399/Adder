package com.example.adder;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({
        AdderTest.class,
        AdderSecurityTest.class
})
public class AdderTestSuite {
}
