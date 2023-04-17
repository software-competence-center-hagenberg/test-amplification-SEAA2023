package experiment.util.test;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Regression_StackTest_379375655_128_s {

    public static boolean debug = false;

    @Before
    public void setup() {
        // Note: code added via randoop --junit-before-each option (has to be java 8 compatible)
        System.setProperty("testId", java.time.Instant.now().toEpochMilli() + "#" + java.util.UUID.randomUUID().toString());
    }

    @After
    public void teardown() {
        // Note: code added via randoop --junit-after-each option (has to be java 8 compatible)
        Class<?> testClass = this.getClass();
        String testClassName = testClass.getName();
        String testPackageName = testClass.getPackage().getName();
        int startIndex = testClassName.indexOf("_") + 1;
        int endIndex = testClassName.indexOf("Test");
        String sutClassName = testClassName.substring(startIndex, endIndex);
        startIndex = 0;
        endIndex = testPackageName.indexOf(".test");
        String testDriverPackageName = testPackageName.substring(startIndex, endIndex);
        String testDriverClassName = testDriverPackageName + "." + sutClassName + "TestDriver";
        try {
            Class<?> clazz = Class.forName(testDriverClassName);
            java.lang.reflect.Method method = clazz.getMethod("matchInternalStateSnapshot");
            boolean result = ((Boolean) method.invoke(null)).booleanValue();
            org.junit.Assert.assertTrue(result);
        } catch (IllegalAccessException | IllegalArgumentException | java.lang.reflect.InvocationTargetException | ClassNotFoundException | NoSuchMethodException | SecurityException e) {
            e.printStackTrace();
            org.junit.Assert.fail(e.getMessage());
        }
    }

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test001");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test002");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        boolean boolean3 = stackTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test003");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test004");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        int int2 = stackTestDriver0.size();
        boolean boolean3 = stackTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test005");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        int int2 = stackTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test006");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test007");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test008");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test009");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test010");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        int int2 = stackTestDriver0.size();
        boolean boolean3 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test011");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test012");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test013");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        int int2 = stackTestDriver0.size();
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Class<?> wildcardClass4 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test014");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        boolean boolean4 = stackTestDriver0.isEmpty();
        int int5 = stackTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test015");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        boolean boolean3 = stackTestDriver0.isEmpty();
        boolean boolean4 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test016");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        boolean boolean6 = stackTestDriver4.isEmpty();
        java.lang.Object obj8 = stackTestDriver4.push((java.lang.Object) (-1.0f));
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        java.lang.Object obj10 = stackTestDriver4.pop();
        java.lang.Class<?> wildcardClass11 = stackTestDriver4.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0f) + "'", obj8, (-1.0f));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (-1.0f) + "'", obj10, (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test017");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        java.lang.Class<?> wildcardClass2 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test018");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        boolean boolean6 = stackTestDriver4.isEmpty();
        java.lang.Object obj8 = stackTestDriver4.push((java.lang.Object) (-1.0f));
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        java.lang.Object obj10 = stackTestDriver4.pop();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = stackTestDriver4.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0f) + "'", obj8, (-1.0f));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (-1.0f) + "'", obj10, (-1.0f));
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test019");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) (short) 1);
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1.0f) + "'", obj4, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 1 + "'", obj6, (short) 1);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test020");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test021");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        int int4 = stackTestDriver0.size();
        java.lang.Class<?> wildcardClass5 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test022");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        int int3 = stackTestDriver0.size();
        int int4 = stackTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test023");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (-1.0f));
        stackTestDriver0.clear();
        java.lang.Class<?> wildcardClass6 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1.0f) + "'", obj4, (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test024");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (-1.0f));
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1.0f) + "'", obj4, (-1.0f));
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test025");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (-1.0f));
        boolean boolean5 = stackTestDriver0.isEmpty();
        int int6 = stackTestDriver0.size();
        java.lang.Class<?> wildcardClass7 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1.0f) + "'", obj4, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test026");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        boolean boolean3 = stackTestDriver0.isEmpty();
        boolean boolean4 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        int int6 = stackTestDriver0.size();
        java.lang.Class<?> wildcardClass7 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test027");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (-1.0f));
        java.lang.Object obj5 = stackTestDriver0.pop();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1.0f) + "'", obj4, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0f) + "'", obj5, (-1.0f));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test028");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) (short) 1);
        java.lang.Class<?> wildcardClass7 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1.0f) + "'", obj4, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 1 + "'", obj6, (short) 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test029");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        boolean boolean3 = stackTestDriver0.isEmpty();
        boolean boolean4 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        boolean boolean6 = stackTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test030");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver2 = new experiment.util.StackTestDriver();
        stackTestDriver2.clear();
        boolean boolean4 = stackTestDriver2.isEmpty();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) stackTestDriver2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = stackTestDriver2.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test031");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Class<?> wildcardClass4 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test032");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver2 = new experiment.util.StackTestDriver();
        stackTestDriver2.clear();
        boolean boolean4 = stackTestDriver2.isEmpty();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) stackTestDriver2);
        java.lang.Class<?> wildcardClass6 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test033");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        int int3 = stackTestDriver0.size();
        int int4 = stackTestDriver0.size();
        java.lang.Class<?> wildcardClass5 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test034");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        boolean boolean3 = stackTestDriver0.isEmpty();
        boolean boolean4 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        boolean boolean6 = stackTestDriver0.isEmpty();
        boolean boolean7 = stackTestDriver0.isEmpty();
        java.lang.Class<?> wildcardClass8 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test035");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) (short) 1);
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1.0f) + "'", obj4, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 1 + "'", obj6, (short) 1);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test036");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (-1.0f));
        boolean boolean5 = stackTestDriver0.isEmpty();
        int int6 = stackTestDriver0.size();
        boolean boolean7 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        int int9 = stackTestDriver8.size();
        int int10 = stackTestDriver8.size();
        int int11 = stackTestDriver8.size();
        boolean boolean12 = stackTestDriver8.isEmpty();
        java.lang.Object obj13 = stackTestDriver0.push((java.lang.Object) boolean12);
        stackTestDriver0.clear();
        java.lang.Class<?> wildcardClass15 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1.0f) + "'", obj4, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + true + "'", obj13, true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test037");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        boolean boolean2 = stackTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test038");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        java.lang.Class<?> wildcardClass2 = stackTestDriver0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test039");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        int int3 = stackTestDriver0.size();
        int int4 = stackTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test040");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test041");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (-1.0f));
        boolean boolean5 = stackTestDriver0.isEmpty();
        java.lang.Object obj6 = stackTestDriver0.peek();
        java.lang.Object obj7 = stackTestDriver0.pop();
        boolean boolean8 = stackTestDriver0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1.0f) + "'", obj4, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1.0f) + "'", obj6, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0f) + "'", obj7, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test042");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        int int3 = stackTestDriver0.size();
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test043");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test044");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        int int4 = stackTestDriver0.size();
        java.lang.Class<?> wildcardClass5 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test045");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test046");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        boolean boolean6 = stackTestDriver4.isEmpty();
        java.lang.Object obj8 = stackTestDriver4.push((java.lang.Object) (-1.0f));
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        java.lang.Class<?> wildcardClass10 = stackTestDriver4.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0f) + "'", obj8, (-1.0f));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test047");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) (short) 1);
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) (short) 10);
        stackTestDriver0.clear();
        java.lang.Class<?> wildcardClass10 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1.0f) + "'", obj4, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 1 + "'", obj6, (short) 1);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (short) 10 + "'", obj8, (short) 10);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test048");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test049");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        boolean boolean3 = stackTestDriver0.isEmpty();
        boolean boolean4 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        boolean boolean6 = stackTestDriver0.isEmpty();
        int int7 = stackTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test050");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        boolean boolean2 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver3 = new experiment.util.StackTestDriver();
        int int4 = stackTestDriver3.size();
        boolean boolean5 = stackTestDriver3.isEmpty();
        java.lang.Object obj7 = stackTestDriver3.push((java.lang.Object) (-1.0f));
        java.lang.Object obj9 = stackTestDriver3.push((java.lang.Object) (short) 1);
        int int10 = stackTestDriver3.size();
        int int11 = stackTestDriver3.size();
        java.lang.Object obj12 = stackTestDriver3.pop();
        java.lang.Object obj13 = stackTestDriver0.push((java.lang.Object) stackTestDriver3);
        stackTestDriver3.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = stackTestDriver3.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0f) + "'", obj7, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (short) 1 + "'", obj9, (short) 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (short) 1 + "'", obj12, (short) 1);
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test051");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        boolean boolean6 = stackTestDriver4.isEmpty();
        java.lang.Object obj8 = stackTestDriver4.push((java.lang.Object) (-1.0f));
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        java.lang.Object obj10 = stackTestDriver0.peek();
        java.lang.Object obj11 = stackTestDriver0.peek();
        java.lang.Class<?> wildcardClass12 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0f) + "'", obj8, (-1.0f));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test052");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        boolean boolean3 = stackTestDriver0.isEmpty();
        boolean boolean4 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        boolean boolean6 = stackTestDriver0.isEmpty();
        boolean boolean7 = stackTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test053");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        int int3 = stackTestDriver0.size();
        boolean boolean4 = stackTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test054");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        boolean boolean6 = stackTestDriver4.isEmpty();
        java.lang.Object obj8 = stackTestDriver4.push((java.lang.Object) (-1.0f));
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        java.lang.Object obj10 = stackTestDriver4.pop();
        stackTestDriver4.clear();
        boolean boolean12 = stackTestDriver4.isEmpty();
        experiment.util.StackTestDriver stackTestDriver13 = new experiment.util.StackTestDriver();
        boolean boolean14 = stackTestDriver13.isEmpty();
        int int15 = stackTestDriver13.size();
        stackTestDriver13.clear();
        java.lang.Class<?> wildcardClass17 = stackTestDriver13.getClass();
        java.lang.Object obj18 = stackTestDriver4.push((java.lang.Object) stackTestDriver13);
        java.lang.Class<?> wildcardClass19 = stackTestDriver4.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0f) + "'", obj8, (-1.0f));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (-1.0f) + "'", obj10, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test055");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        boolean boolean6 = stackTestDriver4.isEmpty();
        java.lang.Object obj8 = stackTestDriver4.push((java.lang.Object) (-1.0f));
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0f) + "'", obj8, (-1.0f));
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test056");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        boolean boolean3 = stackTestDriver0.isEmpty();
        boolean boolean4 = stackTestDriver0.isEmpty();
        java.lang.Class<?> wildcardClass5 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test057");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        boolean boolean3 = stackTestDriver0.isEmpty();
        boolean boolean4 = stackTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test058");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) (short) 1);
        stackTestDriver0.clear();
        java.lang.Class<?> wildcardClass8 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1.0f) + "'", obj4, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 1 + "'", obj6, (short) 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test059");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test060");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        int int2 = stackTestDriver0.size();
        boolean boolean3 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        boolean boolean5 = stackTestDriver4.isEmpty();
        stackTestDriver4.clear();
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = stackTestDriver4.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test061");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) (short) 1);
        int int7 = stackTestDriver0.size();
        int int8 = stackTestDriver0.size();
        java.lang.Object obj9 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        int int11 = stackTestDriver10.size();
        int int12 = stackTestDriver10.size();
        int int13 = stackTestDriver10.size();
        boolean boolean14 = stackTestDriver10.isEmpty();
        java.lang.Object obj15 = stackTestDriver0.push((java.lang.Object) stackTestDriver10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = stackTestDriver10.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1.0f) + "'", obj4, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 1 + "'", obj6, (short) 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (short) 1 + "'", obj9, (short) 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test062");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        stackTestDriver0.clear();
        int int4 = stackTestDriver0.size();
        int int5 = stackTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test063");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver2 = new experiment.util.StackTestDriver();
        int int3 = stackTestDriver2.size();
        boolean boolean4 = stackTestDriver2.isEmpty();
        java.lang.Object obj6 = stackTestDriver2.push((java.lang.Object) (-1.0f));
        java.lang.Object obj8 = stackTestDriver2.push((java.lang.Object) (short) 1);
        int int9 = stackTestDriver2.size();
        int int10 = stackTestDriver2.size();
        java.lang.Object obj11 = stackTestDriver2.pop();
        java.lang.Object obj12 = stackTestDriver0.push((java.lang.Object) stackTestDriver2);
        experiment.util.StackTestDriver stackTestDriver13 = new experiment.util.StackTestDriver();
        int int14 = stackTestDriver13.size();
        boolean boolean15 = stackTestDriver13.isEmpty();
        java.lang.Class<?> wildcardClass16 = stackTestDriver13.getClass();
        java.lang.Object obj17 = stackTestDriver0.push((java.lang.Object) stackTestDriver13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = stackTestDriver13.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1.0f) + "'", obj6, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (short) 1 + "'", obj8, (short) 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (short) 1 + "'", obj11, (short) 1);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(obj17);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test064");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (-1.0f));
        boolean boolean5 = stackTestDriver0.isEmpty();
        java.lang.Object obj6 = stackTestDriver0.peek();
        experiment.util.StackTestDriver stackTestDriver7 = new experiment.util.StackTestDriver();
        int int8 = stackTestDriver7.size();
        boolean boolean9 = stackTestDriver7.isEmpty();
        int int10 = stackTestDriver7.size();
        boolean boolean11 = stackTestDriver7.isEmpty();
        java.lang.Object obj12 = stackTestDriver0.push((java.lang.Object) stackTestDriver7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = stackTestDriver7.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1.0f) + "'", obj4, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1.0f) + "'", obj6, (-1.0f));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test065");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        int int2 = stackTestDriver0.size();
        java.lang.Class<?> wildcardClass3 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test066");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        int int4 = stackTestDriver0.size();
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test067");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        int int3 = stackTestDriver0.size();
        java.lang.Class<?> wildcardClass4 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test068");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        boolean boolean3 = stackTestDriver0.isEmpty();
        int int4 = stackTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test069");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        boolean boolean6 = stackTestDriver4.isEmpty();
        java.lang.Object obj8 = stackTestDriver4.push((java.lang.Object) (-1.0f));
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        java.lang.Object obj10 = stackTestDriver4.pop();
        stackTestDriver4.clear();
        boolean boolean12 = stackTestDriver4.isEmpty();
        experiment.util.StackTestDriver stackTestDriver13 = new experiment.util.StackTestDriver();
        boolean boolean14 = stackTestDriver13.isEmpty();
        int int15 = stackTestDriver13.size();
        stackTestDriver13.clear();
        java.lang.Class<?> wildcardClass17 = stackTestDriver13.getClass();
        java.lang.Object obj18 = stackTestDriver4.push((java.lang.Object) stackTestDriver13);
        int int19 = stackTestDriver4.size();
        java.lang.Class<?> wildcardClass20 = stackTestDriver4.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0f) + "'", obj8, (-1.0f));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (-1.0f) + "'", obj10, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test070");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test071");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        int int2 = stackTestDriver0.size();
        boolean boolean3 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        boolean boolean5 = stackTestDriver4.isEmpty();
        stackTestDriver4.clear();
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        int int8 = stackTestDriver0.size();
        java.lang.Object obj9 = stackTestDriver0.pop();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test072");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver2 = new experiment.util.StackTestDriver();
        stackTestDriver2.clear();
        boolean boolean4 = stackTestDriver2.isEmpty();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) stackTestDriver2);
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) 2);
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        int int9 = stackTestDriver8.size();
        boolean boolean10 = stackTestDriver8.isEmpty();
        stackTestDriver8.clear();
        int int12 = stackTestDriver8.size();
        boolean boolean13 = stackTestDriver8.isEmpty();
        java.lang.Object obj14 = stackTestDriver0.push((java.lang.Object) boolean13);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 2 + "'", obj7, 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + true + "'", obj14, true);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test073");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        boolean boolean4 = stackTestDriver0.isEmpty();
        boolean boolean5 = stackTestDriver0.isEmpty();
        int int6 = stackTestDriver0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test074");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (-1.0f));
        boolean boolean5 = stackTestDriver0.isEmpty();
        int int6 = stackTestDriver0.size();
        boolean boolean7 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        int int9 = stackTestDriver8.size();
        int int10 = stackTestDriver8.size();
        int int11 = stackTestDriver8.size();
        boolean boolean12 = stackTestDriver8.isEmpty();
        java.lang.Object obj13 = stackTestDriver0.push((java.lang.Object) boolean12);
        java.lang.Class<?> wildcardClass14 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1.0f) + "'", obj4, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + true + "'", obj13, true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test075");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (-1.0f));
        stackTestDriver0.clear();
        boolean boolean6 = stackTestDriver0.isEmpty();
        boolean boolean7 = stackTestDriver0.isEmpty();
        java.lang.Class<?> wildcardClass8 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1.0f) + "'", obj4, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test076");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        int int3 = stackTestDriver0.size();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (byte) 100);
        java.lang.Class<?> wildcardClass6 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) 100 + "'", obj5, (byte) 100);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test077");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test078");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver2 = new experiment.util.StackTestDriver();
        stackTestDriver2.clear();
        boolean boolean4 = stackTestDriver2.isEmpty();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) stackTestDriver2);
        int int6 = stackTestDriver2.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = stackTestDriver2.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test079");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        int int4 = stackTestDriver0.size();
        stackTestDriver0.clear();
        java.lang.Class<?> wildcardClass6 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test080");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) 10.0d);
        java.lang.Class<?> wildcardClass5 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 10.0d + "'", obj4, 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test081");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver2 = new experiment.util.StackTestDriver();
        stackTestDriver2.clear();
        boolean boolean4 = stackTestDriver2.isEmpty();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) stackTestDriver2);
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) 2);
        boolean boolean8 = stackTestDriver0.isEmpty();
        java.lang.Object obj10 = stackTestDriver0.push((java.lang.Object) (short) -1);
        experiment.util.StackTestDriver stackTestDriver11 = new experiment.util.StackTestDriver();
        int int12 = stackTestDriver11.size();
        int int13 = stackTestDriver11.size();
        boolean boolean14 = stackTestDriver11.isEmpty();
        stackTestDriver11.clear();
        boolean boolean16 = stackTestDriver11.isEmpty();
        java.lang.Class<?> wildcardClass17 = stackTestDriver11.getClass();
        java.lang.Object obj18 = stackTestDriver0.push((java.lang.Object) stackTestDriver11);
        java.lang.Class<?> wildcardClass19 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 2 + "'", obj7, 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (short) -1 + "'", obj10, (short) -1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test082");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        int int2 = stackTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test083");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (-1.0f));
        boolean boolean5 = stackTestDriver0.isEmpty();
        java.lang.Object obj6 = stackTestDriver0.peek();
        java.lang.Object obj7 = stackTestDriver0.pop();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1.0f) + "'", obj4, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1.0f) + "'", obj6, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0f) + "'", obj7, (-1.0f));
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test084");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        stackTestDriver0.clear();
        int int4 = stackTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test085");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        boolean boolean6 = stackTestDriver4.isEmpty();
        java.lang.Object obj8 = stackTestDriver4.push((java.lang.Object) (-1.0f));
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        java.lang.Object obj10 = stackTestDriver4.pop();
        stackTestDriver4.clear();
        boolean boolean12 = stackTestDriver4.isEmpty();
        experiment.util.StackTestDriver stackTestDriver13 = new experiment.util.StackTestDriver();
        boolean boolean14 = stackTestDriver13.isEmpty();
        int int15 = stackTestDriver13.size();
        stackTestDriver13.clear();
        java.lang.Class<?> wildcardClass17 = stackTestDriver13.getClass();
        java.lang.Object obj18 = stackTestDriver4.push((java.lang.Object) stackTestDriver13);
        int int19 = stackTestDriver4.size();
        java.lang.Object obj20 = stackTestDriver4.pop();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = stackTestDriver4.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0f) + "'", obj8, (-1.0f));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (-1.0f) + "'", obj10, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(obj20);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test086");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        boolean boolean6 = stackTestDriver4.isEmpty();
        stackTestDriver4.clear();
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        int int9 = stackTestDriver8.size();
        boolean boolean10 = stackTestDriver8.isEmpty();
        java.lang.Object obj12 = stackTestDriver8.push((java.lang.Object) (-1.0f));
        java.lang.Object obj13 = stackTestDriver4.push((java.lang.Object) stackTestDriver8);
        experiment.util.StackTestDriver stackTestDriver14 = new experiment.util.StackTestDriver();
        int int15 = stackTestDriver14.size();
        boolean boolean16 = stackTestDriver14.isEmpty();
        boolean boolean17 = stackTestDriver14.isEmpty();
        java.lang.Class<?> wildcardClass18 = stackTestDriver14.getClass();
        java.lang.Object obj19 = stackTestDriver4.push((java.lang.Object) stackTestDriver14);
        java.lang.Object obj20 = stackTestDriver4.pop();
        java.lang.Object obj21 = stackTestDriver0.push(obj20);
        java.lang.Class<?> wildcardClass22 = obj21.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (-1.0f) + "'", obj12, (-1.0f));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test087");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        int int3 = stackTestDriver0.size();
        boolean boolean4 = stackTestDriver0.isEmpty();
        int int5 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        stackTestDriver6.clear();
        boolean boolean8 = stackTestDriver6.isEmpty();
        java.lang.Class<?> wildcardClass9 = stackTestDriver6.getClass();
        java.lang.Object obj10 = stackTestDriver0.push((java.lang.Object) wildcardClass9);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "class experiment.util.StackTestDriver");
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test088");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (-1.0f));
        boolean boolean5 = stackTestDriver0.isEmpty();
        java.lang.Object obj6 = stackTestDriver0.peek();
        java.lang.Object obj7 = stackTestDriver0.pop();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1.0f) + "'", obj4, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1.0f) + "'", obj6, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0f) + "'", obj7, (-1.0f));
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test089");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test090");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        boolean boolean6 = stackTestDriver4.isEmpty();
        java.lang.Object obj8 = stackTestDriver4.push((java.lang.Object) (-1.0f));
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        java.lang.Object obj10 = stackTestDriver4.pop();
        stackTestDriver4.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = stackTestDriver4.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0f) + "'", obj8, (-1.0f));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (-1.0f) + "'", obj10, (-1.0f));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test091");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        int int6 = stackTestDriver4.size();
        int int7 = stackTestDriver4.size();
        boolean boolean8 = stackTestDriver4.isEmpty();
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) boolean8);
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        int int11 = stackTestDriver10.size();
        boolean boolean12 = stackTestDriver10.isEmpty();
        stackTestDriver10.clear();
        experiment.util.StackTestDriver stackTestDriver14 = new experiment.util.StackTestDriver();
        int int15 = stackTestDriver14.size();
        boolean boolean16 = stackTestDriver14.isEmpty();
        java.lang.Object obj18 = stackTestDriver14.push((java.lang.Object) (-1.0f));
        java.lang.Object obj19 = stackTestDriver10.push((java.lang.Object) stackTestDriver14);
        java.lang.Object obj20 = stackTestDriver0.push(obj19);
        java.lang.Class<?> wildcardClass21 = obj20.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + true + "'", obj9, true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (-1.0f) + "'", obj18, (-1.0f));
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test092");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (-1.0f));
        boolean boolean5 = stackTestDriver0.isEmpty();
        java.lang.Object obj6 = stackTestDriver0.peek();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1.0f) + "'", obj4, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1.0f) + "'", obj6, (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test093");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) (short) 1);
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) (short) 10);
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1.0f) + "'", obj4, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 1 + "'", obj6, (short) 1);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (short) 10 + "'", obj8, (short) 10);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test094");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        boolean boolean2 = stackTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test095");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        int int4 = stackTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test096");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test097");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        boolean boolean3 = stackTestDriver0.isEmpty();
        boolean boolean4 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        boolean boolean6 = stackTestDriver0.isEmpty();
        int int7 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        boolean boolean9 = stackTestDriver8.isEmpty();
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        stackTestDriver10.clear();
        boolean boolean12 = stackTestDriver10.isEmpty();
        java.lang.Object obj13 = stackTestDriver8.push((java.lang.Object) stackTestDriver10);
        java.lang.Object obj14 = stackTestDriver0.push((java.lang.Object) stackTestDriver8);
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test098");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        boolean boolean6 = stackTestDriver4.isEmpty();
        java.lang.Object obj8 = stackTestDriver4.push((java.lang.Object) (-1.0f));
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        stackTestDriver0.clear();
        boolean boolean11 = stackTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0f) + "'", obj8, (-1.0f));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test099");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        boolean boolean3 = stackTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test100");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        boolean boolean6 = stackTestDriver4.isEmpty();
        java.lang.Object obj8 = stackTestDriver4.push((java.lang.Object) (-1.0f));
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        int int11 = stackTestDriver10.size();
        boolean boolean12 = stackTestDriver10.isEmpty();
        boolean boolean13 = stackTestDriver10.isEmpty();
        java.lang.Class<?> wildcardClass14 = stackTestDriver10.getClass();
        java.lang.Object obj15 = stackTestDriver0.push((java.lang.Object) stackTestDriver10);
        int int16 = stackTestDriver10.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0f) + "'", obj8, (-1.0f));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test101");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        boolean boolean5 = stackTestDriver4.isEmpty();
        stackTestDriver4.clear();
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = stackTestDriver4.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test102");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        int int2 = stackTestDriver0.size();
        boolean boolean3 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test103");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        boolean boolean4 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test104");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver2 = new experiment.util.StackTestDriver();
        stackTestDriver2.clear();
        boolean boolean4 = stackTestDriver2.isEmpty();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) stackTestDriver2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = stackTestDriver2.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test105");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        int int3 = stackTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test106");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        int int4 = stackTestDriver0.size();
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test107");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        int int3 = stackTestDriver0.size();
        java.lang.Class<?> wildcardClass4 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test108");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (-1.0f));
        java.lang.Object obj5 = stackTestDriver0.pop();
        stackTestDriver0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1.0f) + "'", obj4, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0f) + "'", obj5, (-1.0f));
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test109");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (-1.0f));
        boolean boolean5 = stackTestDriver0.isEmpty();
        java.lang.Class<?> wildcardClass6 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1.0f) + "'", obj4, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test110");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        boolean boolean6 = stackTestDriver4.isEmpty();
        java.lang.Object obj8 = stackTestDriver4.push((java.lang.Object) (-1.0f));
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        int int11 = stackTestDriver10.size();
        boolean boolean12 = stackTestDriver10.isEmpty();
        boolean boolean13 = stackTestDriver10.isEmpty();
        java.lang.Class<?> wildcardClass14 = stackTestDriver10.getClass();
        java.lang.Object obj15 = stackTestDriver0.push((java.lang.Object) stackTestDriver10);
        java.lang.Object obj16 = stackTestDriver0.pop();
        java.lang.Object obj17 = stackTestDriver0.peek();
        java.lang.Object obj18 = stackTestDriver0.peek();
        stackTestDriver0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0f) + "'", obj8, (-1.0f));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNotNull(obj18);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test111");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) (short) 1);
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1.0f) + "'", obj4, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 1 + "'", obj6, (short) 1);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test112");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        int int6 = stackTestDriver4.size();
        int int7 = stackTestDriver4.size();
        boolean boolean8 = stackTestDriver4.isEmpty();
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) boolean8);
        boolean boolean10 = stackTestDriver0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + true + "'", obj9, true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test113");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) (short) 1);
        int int7 = stackTestDriver0.size();
        int int8 = stackTestDriver0.size();
        int int9 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        int int11 = stackTestDriver10.size();
        boolean boolean12 = stackTestDriver10.isEmpty();
        java.lang.Object obj14 = stackTestDriver10.push((java.lang.Object) (-1.0f));
        java.lang.Class<?> wildcardClass15 = stackTestDriver10.getClass();
        java.lang.Object obj16 = stackTestDriver0.push((java.lang.Object) stackTestDriver10);
        java.lang.Class<?> wildcardClass17 = obj16.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1.0f) + "'", obj4, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 1 + "'", obj6, (short) 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1.0f) + "'", obj14, (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test114");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) (short) 1);
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        int int10 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver11 = new experiment.util.StackTestDriver();
        int int12 = stackTestDriver11.size();
        boolean boolean13 = stackTestDriver11.isEmpty();
        stackTestDriver11.clear();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        int int16 = stackTestDriver15.size();
        boolean boolean17 = stackTestDriver15.isEmpty();
        java.lang.Object obj19 = stackTestDriver15.push((java.lang.Object) (-1.0f));
        java.lang.Object obj20 = stackTestDriver11.push((java.lang.Object) stackTestDriver15);
        stackTestDriver11.clear();
        stackTestDriver11.clear();
        java.lang.Object obj23 = stackTestDriver0.push((java.lang.Object) stackTestDriver11);
        boolean boolean24 = stackTestDriver11.isEmpty();
        experiment.util.StackTestDriver stackTestDriver25 = new experiment.util.StackTestDriver();
        stackTestDriver25.clear();
        java.lang.Object obj27 = stackTestDriver11.push((java.lang.Object) stackTestDriver25);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1.0f) + "'", obj4, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 1 + "'", obj6, (short) 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (-1.0f) + "'", obj19, (-1.0f));
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(obj27);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test115");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) (short) 1);
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        int int10 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver11 = new experiment.util.StackTestDriver();
        int int12 = stackTestDriver11.size();
        boolean boolean13 = stackTestDriver11.isEmpty();
        stackTestDriver11.clear();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        int int16 = stackTestDriver15.size();
        boolean boolean17 = stackTestDriver15.isEmpty();
        java.lang.Object obj19 = stackTestDriver15.push((java.lang.Object) (-1.0f));
        java.lang.Object obj20 = stackTestDriver11.push((java.lang.Object) stackTestDriver15);
        stackTestDriver11.clear();
        stackTestDriver11.clear();
        java.lang.Object obj23 = stackTestDriver0.push((java.lang.Object) stackTestDriver11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = stackTestDriver11.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1.0f) + "'", obj4, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 1 + "'", obj6, (short) 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (-1.0f) + "'", obj19, (-1.0f));
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(obj23);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test116");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        boolean boolean6 = stackTestDriver4.isEmpty();
        java.lang.Object obj8 = stackTestDriver4.push((java.lang.Object) (-1.0f));
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        int int11 = stackTestDriver10.size();
        boolean boolean12 = stackTestDriver10.isEmpty();
        boolean boolean13 = stackTestDriver10.isEmpty();
        java.lang.Class<?> wildcardClass14 = stackTestDriver10.getClass();
        java.lang.Object obj15 = stackTestDriver0.push((java.lang.Object) stackTestDriver10);
        boolean boolean16 = stackTestDriver0.isEmpty();
        java.lang.Object obj17 = stackTestDriver0.peek();
        stackTestDriver0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0f) + "'", obj8, (-1.0f));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(obj17);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test117");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        int int3 = stackTestDriver0.size();
        boolean boolean4 = stackTestDriver0.isEmpty();
        int int5 = stackTestDriver0.size();
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test118");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (-1.0f));
        boolean boolean5 = stackTestDriver0.isEmpty();
        java.lang.Object obj6 = stackTestDriver0.peek();
        experiment.util.StackTestDriver stackTestDriver7 = new experiment.util.StackTestDriver();
        int int8 = stackTestDriver7.size();
        boolean boolean9 = stackTestDriver7.isEmpty();
        int int10 = stackTestDriver7.size();
        boolean boolean11 = stackTestDriver7.isEmpty();
        java.lang.Object obj12 = stackTestDriver0.push((java.lang.Object) stackTestDriver7);
        java.lang.Object obj13 = stackTestDriver0.pop();
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1.0f) + "'", obj4, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1.0f) + "'", obj6, (-1.0f));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test119");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver2 = new experiment.util.StackTestDriver();
        int int3 = stackTestDriver2.size();
        boolean boolean4 = stackTestDriver2.isEmpty();
        java.lang.Object obj6 = stackTestDriver2.push((java.lang.Object) (-1.0f));
        java.lang.Object obj8 = stackTestDriver2.push((java.lang.Object) (short) 1);
        int int9 = stackTestDriver2.size();
        int int10 = stackTestDriver2.size();
        java.lang.Object obj11 = stackTestDriver2.pop();
        java.lang.Object obj12 = stackTestDriver0.push((java.lang.Object) stackTestDriver2);
        stackTestDriver2.clear();
        experiment.util.StackTestDriver stackTestDriver14 = new experiment.util.StackTestDriver();
        int int15 = stackTestDriver14.size();
        boolean boolean16 = stackTestDriver14.isEmpty();
        java.lang.Object obj18 = stackTestDriver14.push((java.lang.Object) (-1.0f));
        boolean boolean19 = stackTestDriver14.isEmpty();
        int int20 = stackTestDriver14.size();
        boolean boolean21 = stackTestDriver14.isEmpty();
        java.lang.Class<?> wildcardClass22 = stackTestDriver14.getClass();
        java.lang.Object obj23 = stackTestDriver2.push((java.lang.Object) stackTestDriver14);
        java.lang.Class<?> wildcardClass24 = obj23.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1.0f) + "'", obj6, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (short) 1 + "'", obj8, (short) 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (short) 1 + "'", obj11, (short) 1);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (-1.0f) + "'", obj18, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test120");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver2 = new experiment.util.StackTestDriver();
        int int3 = stackTestDriver2.size();
        boolean boolean4 = stackTestDriver2.isEmpty();
        java.lang.Object obj6 = stackTestDriver2.push((java.lang.Object) (-1.0f));
        java.lang.Object obj8 = stackTestDriver2.push((java.lang.Object) (short) 1);
        stackTestDriver2.clear();
        stackTestDriver2.clear();
        experiment.util.StackTestDriver stackTestDriver11 = new experiment.util.StackTestDriver();
        int int12 = stackTestDriver11.size();
        boolean boolean13 = stackTestDriver11.isEmpty();
        stackTestDriver11.clear();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        int int16 = stackTestDriver15.size();
        boolean boolean17 = stackTestDriver15.isEmpty();
        java.lang.Object obj19 = stackTestDriver15.push((java.lang.Object) (-1.0f));
        java.lang.Object obj20 = stackTestDriver11.push((java.lang.Object) stackTestDriver15);
        java.lang.Object obj21 = stackTestDriver11.peek();
        java.lang.Object obj22 = stackTestDriver11.peek();
        java.lang.Object obj23 = stackTestDriver2.push(obj22);
        java.lang.Object obj24 = stackTestDriver0.push(obj22);
        java.lang.Class<?> wildcardClass25 = obj22.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1.0f) + "'", obj6, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (short) 1 + "'", obj8, (short) 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (-1.0f) + "'", obj19, (-1.0f));
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test121");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        int int2 = stackTestDriver0.size();
        boolean boolean3 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        boolean boolean5 = stackTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test122");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) (short) 1);
        int int7 = stackTestDriver0.size();
        int int8 = stackTestDriver0.size();
        java.lang.Object obj9 = stackTestDriver0.pop();
        java.lang.Object obj10 = stackTestDriver0.peek();
        java.lang.Object obj12 = stackTestDriver0.push((java.lang.Object) "");
        java.lang.Object obj13 = stackTestDriver0.pop();
        java.lang.Class<?> wildcardClass14 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1.0f) + "'", obj4, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 1 + "'", obj6, (short) 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (short) 1 + "'", obj9, (short) 1);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (-1.0f) + "'", obj10, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + "" + "'", obj12, "");
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + "" + "'", obj13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test123");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver2 = new experiment.util.StackTestDriver();
        stackTestDriver2.clear();
        boolean boolean4 = stackTestDriver2.isEmpty();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) stackTestDriver2);
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) 2);
        boolean boolean8 = stackTestDriver0.isEmpty();
        java.lang.Object obj10 = stackTestDriver0.push((java.lang.Object) (short) -1);
        experiment.util.StackTestDriver stackTestDriver11 = new experiment.util.StackTestDriver();
        int int12 = stackTestDriver11.size();
        int int13 = stackTestDriver11.size();
        boolean boolean14 = stackTestDriver11.isEmpty();
        stackTestDriver11.clear();
        boolean boolean16 = stackTestDriver11.isEmpty();
        java.lang.Class<?> wildcardClass17 = stackTestDriver11.getClass();
        java.lang.Object obj18 = stackTestDriver0.push((java.lang.Object) stackTestDriver11);
        java.lang.Object obj19 = stackTestDriver0.peek();
        stackTestDriver0.clear();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 2 + "'", obj7, 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (short) -1 + "'", obj10, (short) -1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(obj19);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test124");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver2 = new experiment.util.StackTestDriver();
        stackTestDriver2.clear();
        boolean boolean4 = stackTestDriver2.isEmpty();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) stackTestDriver2);
        java.lang.Class<?> wildcardClass6 = stackTestDriver2.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test125");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        int int4 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean6 = stackTestDriver0.isEmpty();
        boolean boolean7 = stackTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test126");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        boolean boolean6 = stackTestDriver4.isEmpty();
        java.lang.Object obj8 = stackTestDriver4.push((java.lang.Object) (-1.0f));
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        int int11 = stackTestDriver10.size();
        boolean boolean12 = stackTestDriver10.isEmpty();
        boolean boolean13 = stackTestDriver10.isEmpty();
        java.lang.Class<?> wildcardClass14 = stackTestDriver10.getClass();
        java.lang.Object obj15 = stackTestDriver0.push((java.lang.Object) stackTestDriver10);
        java.lang.Object obj16 = stackTestDriver0.pop();
        java.lang.Object obj17 = stackTestDriver0.pop();
        stackTestDriver0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0f) + "'", obj8, (-1.0f));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(obj17);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test127");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        boolean boolean2 = stackTestDriver0.isEmpty();
        boolean boolean3 = stackTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test128");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        boolean boolean6 = stackTestDriver4.isEmpty();
        java.lang.Object obj8 = stackTestDriver4.push((java.lang.Object) (-1.0f));
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        int int11 = stackTestDriver10.size();
        boolean boolean12 = stackTestDriver10.isEmpty();
        boolean boolean13 = stackTestDriver10.isEmpty();
        java.lang.Class<?> wildcardClass14 = stackTestDriver10.getClass();
        java.lang.Object obj15 = stackTestDriver0.push((java.lang.Object) stackTestDriver10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = stackTestDriver10.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0f) + "'", obj8, (-1.0f));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(obj15);
    }

}
