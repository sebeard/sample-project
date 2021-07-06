/*
 * Copyright/Licence Header Notice
 */
package sample.pkg;

import nl.jqno.equalsverifier.EqualsVerifier;
import org.force66.beantester.BeanTester;
import org.junit.jupiter.api.Test;

class SampleClassTest {

    @Test
    void shouldBeAValidBean() {
        BeanTester beanTester = new BeanTester();
        beanTester.addTestValues(String.class, new Object[]{"Hello"});
        beanTester.testBean(SampleClass.class);
    }

    @Test
    void shouldHaveValidEquals() {
        EqualsVerifier.simple().forClass(SampleClass.class).verify();
    }

}