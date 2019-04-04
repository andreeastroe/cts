package ro.ase.csie.cts.tests;

import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class) // in junit3 you need to extend it from test suite
//@IncludeCategory() or @ExcludeCategory()
@SuiteClasses({ TestCaseStudenTaxeExamMethod.class, TestCaseStudentGetMinMethod.class }) // add all tests from these test cases
public class TestSuiteFunction {
	
}
