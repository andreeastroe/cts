package ro.ase.csie.cts.tests;

import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@IncludeCategory(ImportantTest.class)
@SuiteClasses({ TestCaseStudenTaxeExamMethod.class, TestCaseStudentGetMinMethod.class })
public class AllTests {

}
