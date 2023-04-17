package experiment.util.test;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Regression_StackTest_939145594_256_s {

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
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test001");
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
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test002");
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
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test003");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        java.lang.Class<?> wildcardClass2 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test004");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test005");
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
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test006");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        int int2 = stackTestDriver0.size();
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test007");
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
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test008");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Class<?> wildcardClass1 = stackTestDriver0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test009");
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
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test010");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test011");
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
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test012");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test013");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        int int2 = stackTestDriver0.size();
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test014");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test015");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test016");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        int int6 = stackTestDriver4.size();
        stackTestDriver4.clear();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test017");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        java.lang.Class<?> wildcardClass3 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test018");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
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
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test019");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        int int2 = stackTestDriver0.size();
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
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test020");
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
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test021");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test022");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        int int6 = stackTestDriver4.size();
        stackTestDriver4.clear();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        stackTestDriver0.clear();
        int int10 = stackTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test023");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        int int6 = stackTestDriver4.size();
        stackTestDriver4.clear();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        stackTestDriver0.clear();
        int int10 = stackTestDriver0.size();
        int int11 = stackTestDriver0.size();
        int int12 = stackTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test024");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        int int6 = stackTestDriver4.size();
        stackTestDriver4.clear();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        stackTestDriver0.clear();
        int int10 = stackTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test025");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        int int6 = stackTestDriver4.size();
        stackTestDriver4.clear();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        int int11 = stackTestDriver10.size();
        int int12 = stackTestDriver10.size();
        int int13 = stackTestDriver10.size();
        java.lang.Object obj14 = stackTestDriver0.push((java.lang.Object) int13);
        java.lang.Object obj15 = stackTestDriver0.pop();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 0 + "'", obj14, 0);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 0 + "'", obj15, 0);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test026");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        int int2 = stackTestDriver0.size();
        boolean boolean3 = stackTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test027");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        int int2 = stackTestDriver0.size();
        boolean boolean3 = stackTestDriver0.isEmpty();
        int int4 = stackTestDriver0.size();
        java.lang.Class<?> wildcardClass5 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test028");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test029");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        int int6 = stackTestDriver4.size();
        stackTestDriver4.clear();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        boolean boolean9 = stackTestDriver0.isEmpty();
        java.lang.Object obj10 = stackTestDriver0.peek();
        experiment.util.StackTestDriver stackTestDriver11 = new experiment.util.StackTestDriver();
        int int12 = stackTestDriver11.size();
        stackTestDriver11.clear();
        boolean boolean14 = stackTestDriver11.isEmpty();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        int int16 = stackTestDriver15.size();
        int int17 = stackTestDriver15.size();
        stackTestDriver15.clear();
        java.lang.Object obj19 = stackTestDriver11.push((java.lang.Object) stackTestDriver15);
        boolean boolean20 = stackTestDriver11.isEmpty();
        java.lang.Object obj21 = stackTestDriver0.push((java.lang.Object) stackTestDriver11);
        java.lang.Class<?> wildcardClass22 = obj21.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test030");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        int int6 = stackTestDriver4.size();
        stackTestDriver4.clear();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        boolean boolean9 = stackTestDriver0.isEmpty();
        java.lang.Object obj10 = stackTestDriver0.peek();
        java.lang.Class<?> wildcardClass11 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test031");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        boolean boolean4 = stackTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test032");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        java.lang.Object obj3 = stackTestDriver0.push((java.lang.Object) (short) 0);
        int int4 = stackTestDriver0.size();
        java.lang.Object obj5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = stackTestDriver0.push(obj5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (short) 0 + "'", obj3, (short) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test033");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        boolean boolean4 = stackTestDriver0.isEmpty();
        boolean boolean5 = stackTestDriver0.isEmpty();
        boolean boolean6 = stackTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test034");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        boolean boolean4 = stackTestDriver0.isEmpty();
        java.lang.Class<?> wildcardClass5 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test035");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj1 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test036");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        int int6 = stackTestDriver4.size();
        stackTestDriver4.clear();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        stackTestDriver0.clear();
        int int10 = stackTestDriver0.size();
        int int11 = stackTestDriver0.size();
        int int12 = stackTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test037");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        int int6 = stackTestDriver4.size();
        stackTestDriver4.clear();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        stackTestDriver0.clear();
        int int10 = stackTestDriver0.size();
        int int11 = stackTestDriver0.size();
        java.lang.Class<?> wildcardClass12 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test038");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        int int2 = stackTestDriver0.size();
        boolean boolean3 = stackTestDriver0.isEmpty();
        int int4 = stackTestDriver0.size();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        int int7 = stackTestDriver6.size();
        stackTestDriver6.clear();
        boolean boolean9 = stackTestDriver6.isEmpty();
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        int int11 = stackTestDriver10.size();
        int int12 = stackTestDriver10.size();
        stackTestDriver10.clear();
        java.lang.Object obj14 = stackTestDriver6.push((java.lang.Object) stackTestDriver10);
        stackTestDriver6.clear();
        int int16 = stackTestDriver6.size();
        experiment.util.StackTestDriver stackTestDriver17 = new experiment.util.StackTestDriver();
        int int18 = stackTestDriver17.size();
        stackTestDriver17.clear();
        boolean boolean20 = stackTestDriver17.isEmpty();
        experiment.util.StackTestDriver stackTestDriver21 = new experiment.util.StackTestDriver();
        int int22 = stackTestDriver21.size();
        int int23 = stackTestDriver21.size();
        stackTestDriver21.clear();
        java.lang.Object obj25 = stackTestDriver17.push((java.lang.Object) stackTestDriver21);
        boolean boolean26 = stackTestDriver17.isEmpty();
        java.lang.Object obj27 = stackTestDriver17.peek();
        experiment.util.StackTestDriver stackTestDriver28 = new experiment.util.StackTestDriver();
        int int29 = stackTestDriver28.size();
        stackTestDriver28.clear();
        boolean boolean31 = stackTestDriver28.isEmpty();
        experiment.util.StackTestDriver stackTestDriver32 = new experiment.util.StackTestDriver();
        int int33 = stackTestDriver32.size();
        int int34 = stackTestDriver32.size();
        stackTestDriver32.clear();
        java.lang.Object obj36 = stackTestDriver28.push((java.lang.Object) stackTestDriver32);
        boolean boolean37 = stackTestDriver28.isEmpty();
        java.lang.Object obj38 = stackTestDriver17.push((java.lang.Object) stackTestDriver28);
        java.lang.Object obj39 = stackTestDriver6.push((java.lang.Object) stackTestDriver17);
        java.lang.Object obj40 = stackTestDriver6.pop();
        java.lang.Object obj41 = stackTestDriver0.push(obj40);
        java.lang.Class<?> wildcardClass42 = obj41.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test039");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        java.lang.Object obj3 = stackTestDriver0.push((java.lang.Object) (short) 0);
        int int4 = stackTestDriver0.size();
        java.lang.Class<?> wildcardClass5 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (short) 0 + "'", obj3, (short) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test040");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        java.lang.Object obj3 = stackTestDriver0.push((java.lang.Object) (short) 0);
        int int4 = stackTestDriver0.size();
        java.lang.Object obj5 = stackTestDriver0.pop();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (short) 0 + "'", obj3, (short) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) 0 + "'", obj5, (short) 0);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test041");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        int int6 = stackTestDriver4.size();
        stackTestDriver4.clear();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        stackTestDriver0.clear();
        int int10 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver11 = new experiment.util.StackTestDriver();
        int int12 = stackTestDriver11.size();
        stackTestDriver11.clear();
        boolean boolean14 = stackTestDriver11.isEmpty();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        int int16 = stackTestDriver15.size();
        int int17 = stackTestDriver15.size();
        stackTestDriver15.clear();
        java.lang.Object obj19 = stackTestDriver11.push((java.lang.Object) stackTestDriver15);
        boolean boolean20 = stackTestDriver11.isEmpty();
        java.lang.Object obj21 = stackTestDriver11.peek();
        experiment.util.StackTestDriver stackTestDriver22 = new experiment.util.StackTestDriver();
        int int23 = stackTestDriver22.size();
        stackTestDriver22.clear();
        boolean boolean25 = stackTestDriver22.isEmpty();
        experiment.util.StackTestDriver stackTestDriver26 = new experiment.util.StackTestDriver();
        int int27 = stackTestDriver26.size();
        int int28 = stackTestDriver26.size();
        stackTestDriver26.clear();
        java.lang.Object obj30 = stackTestDriver22.push((java.lang.Object) stackTestDriver26);
        boolean boolean31 = stackTestDriver22.isEmpty();
        java.lang.Object obj32 = stackTestDriver11.push((java.lang.Object) stackTestDriver22);
        java.lang.Object obj33 = stackTestDriver0.push((java.lang.Object) stackTestDriver11);
        java.lang.Object obj34 = stackTestDriver0.pop();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj35 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertNotNull(obj34);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test042");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        int int6 = stackTestDriver4.size();
        stackTestDriver4.clear();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        boolean boolean9 = stackTestDriver0.isEmpty();
        java.lang.Object obj10 = stackTestDriver0.peek();
        experiment.util.StackTestDriver stackTestDriver11 = new experiment.util.StackTestDriver();
        int int12 = stackTestDriver11.size();
        stackTestDriver11.clear();
        boolean boolean14 = stackTestDriver11.isEmpty();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        int int16 = stackTestDriver15.size();
        int int17 = stackTestDriver15.size();
        stackTestDriver15.clear();
        java.lang.Object obj19 = stackTestDriver11.push((java.lang.Object) stackTestDriver15);
        boolean boolean20 = stackTestDriver11.isEmpty();
        java.lang.Object obj21 = stackTestDriver0.push((java.lang.Object) stackTestDriver11);
        java.lang.Class<?> wildcardClass22 = stackTestDriver11.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test043");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        int int6 = stackTestDriver4.size();
        stackTestDriver4.clear();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        boolean boolean9 = stackTestDriver0.isEmpty();
        java.lang.Object obj10 = stackTestDriver0.peek();
        java.lang.Object obj11 = stackTestDriver0.peek();
        java.lang.Object obj12 = stackTestDriver0.peek();
        java.lang.Class<?> wildcardClass13 = obj12.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test044");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
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
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test045");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        boolean boolean4 = stackTestDriver0.isEmpty();
        boolean boolean5 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        stackTestDriver6.clear();
        stackTestDriver6.clear();
        stackTestDriver6.clear();
        java.lang.Object obj10 = stackTestDriver0.push((java.lang.Object) stackTestDriver6);
        java.lang.Class<?> wildcardClass11 = obj10.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test046");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        int int2 = stackTestDriver0.size();
        stackTestDriver0.clear();
        int int4 = stackTestDriver0.size();
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test047");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean5 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        int int7 = stackTestDriver6.size();
        stackTestDriver6.clear();
        boolean boolean9 = stackTestDriver6.isEmpty();
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        int int11 = stackTestDriver10.size();
        int int12 = stackTestDriver10.size();
        stackTestDriver10.clear();
        java.lang.Object obj14 = stackTestDriver6.push((java.lang.Object) stackTestDriver10);
        boolean boolean15 = stackTestDriver6.isEmpty();
        java.lang.Object obj16 = stackTestDriver0.push((java.lang.Object) boolean15);
        java.lang.Class<?> wildcardClass17 = obj16.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + false + "'", obj16, false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test048");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        int int6 = stackTestDriver4.size();
        stackTestDriver4.clear();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        stackTestDriver0.clear();
        int int10 = stackTestDriver0.size();
        int int11 = stackTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test049");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        int int6 = stackTestDriver4.size();
        stackTestDriver4.clear();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        int int11 = stackTestDriver10.size();
        int int12 = stackTestDriver10.size();
        int int13 = stackTestDriver10.size();
        java.lang.Object obj14 = stackTestDriver0.push((java.lang.Object) int13);
        java.lang.Object obj15 = stackTestDriver0.pop();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 0 + "'", obj14, 0);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 0 + "'", obj15, 0);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test050");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        int int6 = stackTestDriver4.size();
        stackTestDriver4.clear();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        boolean boolean9 = stackTestDriver0.isEmpty();
        java.lang.Object obj10 = stackTestDriver0.peek();
        experiment.util.StackTestDriver stackTestDriver11 = new experiment.util.StackTestDriver();
        int int12 = stackTestDriver11.size();
        stackTestDriver11.clear();
        boolean boolean14 = stackTestDriver11.isEmpty();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        int int16 = stackTestDriver15.size();
        int int17 = stackTestDriver15.size();
        stackTestDriver15.clear();
        java.lang.Object obj19 = stackTestDriver11.push((java.lang.Object) stackTestDriver15);
        boolean boolean20 = stackTestDriver11.isEmpty();
        java.lang.Object obj21 = stackTestDriver0.push((java.lang.Object) stackTestDriver11);
        boolean boolean22 = stackTestDriver0.isEmpty();
        java.lang.Object obj23 = stackTestDriver0.pop();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(obj23);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test051");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        java.lang.Object obj3 = stackTestDriver0.push((java.lang.Object) (short) 0);
        boolean boolean4 = stackTestDriver0.isEmpty();
        boolean boolean5 = stackTestDriver0.isEmpty();
        java.lang.Class<?> wildcardClass6 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (short) 0 + "'", obj3, (short) 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test052");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        int int6 = stackTestDriver4.size();
        stackTestDriver4.clear();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        stackTestDriver4.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = stackTestDriver4.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test053");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        int int6 = stackTestDriver4.size();
        stackTestDriver4.clear();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        stackTestDriver0.clear();
        int int10 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver11 = new experiment.util.StackTestDriver();
        int int12 = stackTestDriver11.size();
        stackTestDriver11.clear();
        boolean boolean14 = stackTestDriver11.isEmpty();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        int int16 = stackTestDriver15.size();
        int int17 = stackTestDriver15.size();
        stackTestDriver15.clear();
        java.lang.Object obj19 = stackTestDriver11.push((java.lang.Object) stackTestDriver15);
        boolean boolean20 = stackTestDriver11.isEmpty();
        java.lang.Object obj21 = stackTestDriver11.peek();
        experiment.util.StackTestDriver stackTestDriver22 = new experiment.util.StackTestDriver();
        int int23 = stackTestDriver22.size();
        stackTestDriver22.clear();
        boolean boolean25 = stackTestDriver22.isEmpty();
        experiment.util.StackTestDriver stackTestDriver26 = new experiment.util.StackTestDriver();
        int int27 = stackTestDriver26.size();
        int int28 = stackTestDriver26.size();
        stackTestDriver26.clear();
        java.lang.Object obj30 = stackTestDriver22.push((java.lang.Object) stackTestDriver26);
        boolean boolean31 = stackTestDriver22.isEmpty();
        java.lang.Object obj32 = stackTestDriver11.push((java.lang.Object) stackTestDriver22);
        java.lang.Object obj33 = stackTestDriver0.push((java.lang.Object) stackTestDriver11);
        java.lang.Object obj34 = stackTestDriver0.pop();
        java.lang.Class<?> wildcardClass35 = obj34.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test054");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean5 = stackTestDriver0.isEmpty();
        java.lang.Class<?> wildcardClass6 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test055");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        int int4 = stackTestDriver0.size();
        boolean boolean5 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        int int7 = stackTestDriver6.size();
        int int8 = stackTestDriver6.size();
        int int9 = stackTestDriver6.size();
        boolean boolean10 = stackTestDriver6.isEmpty();
        java.lang.Object obj11 = stackTestDriver0.push((java.lang.Object) stackTestDriver6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = stackTestDriver6.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test056");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        int int6 = stackTestDriver4.size();
        stackTestDriver4.clear();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        stackTestDriver0.clear();
        int int10 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver11 = new experiment.util.StackTestDriver();
        int int12 = stackTestDriver11.size();
        stackTestDriver11.clear();
        boolean boolean14 = stackTestDriver11.isEmpty();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        int int16 = stackTestDriver15.size();
        int int17 = stackTestDriver15.size();
        stackTestDriver15.clear();
        java.lang.Object obj19 = stackTestDriver11.push((java.lang.Object) stackTestDriver15);
        boolean boolean20 = stackTestDriver11.isEmpty();
        java.lang.Object obj21 = stackTestDriver11.peek();
        experiment.util.StackTestDriver stackTestDriver22 = new experiment.util.StackTestDriver();
        int int23 = stackTestDriver22.size();
        stackTestDriver22.clear();
        boolean boolean25 = stackTestDriver22.isEmpty();
        experiment.util.StackTestDriver stackTestDriver26 = new experiment.util.StackTestDriver();
        int int27 = stackTestDriver26.size();
        int int28 = stackTestDriver26.size();
        stackTestDriver26.clear();
        java.lang.Object obj30 = stackTestDriver22.push((java.lang.Object) stackTestDriver26);
        boolean boolean31 = stackTestDriver22.isEmpty();
        java.lang.Object obj32 = stackTestDriver11.push((java.lang.Object) stackTestDriver22);
        java.lang.Object obj33 = stackTestDriver0.push((java.lang.Object) stackTestDriver11);
        java.lang.Object obj34 = stackTestDriver11.peek();
        java.lang.Class<?> wildcardClass35 = stackTestDriver11.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test057");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        int int2 = stackTestDriver0.size();
        stackTestDriver0.clear();
        int int4 = stackTestDriver0.size();
        java.lang.Object obj5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = stackTestDriver0.push(obj5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test058");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        boolean boolean4 = stackTestDriver0.isEmpty();
        boolean boolean5 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        stackTestDriver6.clear();
        stackTestDriver6.clear();
        stackTestDriver6.clear();
        java.lang.Object obj10 = stackTestDriver0.push((java.lang.Object) stackTestDriver6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = stackTestDriver6.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test059");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        int int2 = stackTestDriver0.size();
        stackTestDriver0.clear();
        int int4 = stackTestDriver0.size();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test060");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        boolean boolean4 = stackTestDriver0.isEmpty();
        boolean boolean5 = stackTestDriver0.isEmpty();
        java.lang.Class<?> wildcardClass6 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test061");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver3 = new experiment.util.StackTestDriver();
        int int4 = stackTestDriver3.size();
        int int5 = stackTestDriver3.size();
        stackTestDriver3.clear();
        int int7 = stackTestDriver3.size();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) int7);
        boolean boolean9 = stackTestDriver0.isEmpty();
        java.lang.Object obj10 = stackTestDriver0.pop();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0 + "'", obj8, 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 0 + "'", obj10, 0);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test062");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        boolean boolean4 = stackTestDriver0.isEmpty();
        int int5 = stackTestDriver0.size();
        java.lang.Class<?> wildcardClass6 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test063");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean5 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        int int7 = stackTestDriver6.size();
        stackTestDriver6.clear();
        boolean boolean9 = stackTestDriver6.isEmpty();
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        int int11 = stackTestDriver10.size();
        int int12 = stackTestDriver10.size();
        stackTestDriver10.clear();
        java.lang.Object obj14 = stackTestDriver6.push((java.lang.Object) stackTestDriver10);
        boolean boolean15 = stackTestDriver6.isEmpty();
        java.lang.Object obj16 = stackTestDriver0.push((java.lang.Object) boolean15);
        boolean boolean17 = stackTestDriver0.isEmpty();
        java.lang.Class<?> wildcardClass18 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + false + "'", obj16, false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test064");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean5 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        int int7 = stackTestDriver6.size();
        stackTestDriver6.clear();
        boolean boolean9 = stackTestDriver6.isEmpty();
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        int int11 = stackTestDriver10.size();
        int int12 = stackTestDriver10.size();
        stackTestDriver10.clear();
        java.lang.Object obj14 = stackTestDriver6.push((java.lang.Object) stackTestDriver10);
        boolean boolean15 = stackTestDriver6.isEmpty();
        java.lang.Object obj16 = stackTestDriver0.push((java.lang.Object) boolean15);
        boolean boolean17 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + false + "'", obj16, false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test065");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        int int2 = stackTestDriver0.size();
        boolean boolean3 = stackTestDriver0.isEmpty();
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test066");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        int int6 = stackTestDriver4.size();
        stackTestDriver4.clear();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        boolean boolean9 = stackTestDriver0.isEmpty();
        java.lang.Object obj10 = stackTestDriver0.peek();
        java.lang.Object obj11 = stackTestDriver0.peek();
        boolean boolean12 = stackTestDriver0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test067");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        boolean boolean4 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test068");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        int int6 = stackTestDriver4.size();
        stackTestDriver4.clear();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        boolean boolean9 = stackTestDriver0.isEmpty();
        java.lang.Object obj10 = stackTestDriver0.peek();
        java.lang.Object obj11 = stackTestDriver0.peek();
        java.lang.Object obj12 = stackTestDriver0.peek();
        boolean boolean13 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver14 = new experiment.util.StackTestDriver();
        int int15 = stackTestDriver14.size();
        stackTestDriver14.clear();
        boolean boolean17 = stackTestDriver14.isEmpty();
        experiment.util.StackTestDriver stackTestDriver18 = new experiment.util.StackTestDriver();
        int int19 = stackTestDriver18.size();
        int int20 = stackTestDriver18.size();
        stackTestDriver18.clear();
        java.lang.Object obj22 = stackTestDriver14.push((java.lang.Object) stackTestDriver18);
        stackTestDriver14.clear();
        int int24 = stackTestDriver14.size();
        experiment.util.StackTestDriver stackTestDriver25 = new experiment.util.StackTestDriver();
        int int26 = stackTestDriver25.size();
        stackTestDriver25.clear();
        boolean boolean28 = stackTestDriver25.isEmpty();
        experiment.util.StackTestDriver stackTestDriver29 = new experiment.util.StackTestDriver();
        int int30 = stackTestDriver29.size();
        int int31 = stackTestDriver29.size();
        stackTestDriver29.clear();
        java.lang.Object obj33 = stackTestDriver25.push((java.lang.Object) stackTestDriver29);
        boolean boolean34 = stackTestDriver25.isEmpty();
        java.lang.Object obj35 = stackTestDriver25.peek();
        experiment.util.StackTestDriver stackTestDriver36 = new experiment.util.StackTestDriver();
        int int37 = stackTestDriver36.size();
        stackTestDriver36.clear();
        boolean boolean39 = stackTestDriver36.isEmpty();
        experiment.util.StackTestDriver stackTestDriver40 = new experiment.util.StackTestDriver();
        int int41 = stackTestDriver40.size();
        int int42 = stackTestDriver40.size();
        stackTestDriver40.clear();
        java.lang.Object obj44 = stackTestDriver36.push((java.lang.Object) stackTestDriver40);
        boolean boolean45 = stackTestDriver36.isEmpty();
        java.lang.Object obj46 = stackTestDriver25.push((java.lang.Object) stackTestDriver36);
        java.lang.Object obj47 = stackTestDriver14.push((java.lang.Object) stackTestDriver25);
        experiment.util.StackTestDriver stackTestDriver48 = new experiment.util.StackTestDriver();
        stackTestDriver48.clear();
        stackTestDriver48.clear();
        java.lang.Class<?> wildcardClass51 = stackTestDriver48.getClass();
        java.lang.Object obj52 = stackTestDriver14.push((java.lang.Object) wildcardClass51);
        stackTestDriver14.clear();
        java.lang.Object obj54 = stackTestDriver0.push((java.lang.Object) stackTestDriver14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj55 = stackTestDriver14.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNotNull(obj52);
        org.junit.Assert.assertEquals(obj52.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj52), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj52), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertNotNull(obj54);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test069");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        boolean boolean4 = stackTestDriver0.isEmpty();
        int int5 = stackTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test070");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean5 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        int int7 = stackTestDriver0.size();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver9 = new experiment.util.StackTestDriver();
        java.lang.Object obj10 = stackTestDriver0.push((java.lang.Object) stackTestDriver9);
        java.lang.Class<?> wildcardClass11 = obj10.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test071");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver3 = new experiment.util.StackTestDriver();
        int int4 = stackTestDriver3.size();
        int int5 = stackTestDriver3.size();
        stackTestDriver3.clear();
        int int7 = stackTestDriver3.size();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) int7);
        experiment.util.StackTestDriver stackTestDriver9 = new experiment.util.StackTestDriver();
        int int10 = stackTestDriver9.size();
        stackTestDriver9.clear();
        boolean boolean12 = stackTestDriver9.isEmpty();
        experiment.util.StackTestDriver stackTestDriver13 = new experiment.util.StackTestDriver();
        int int14 = stackTestDriver13.size();
        int int15 = stackTestDriver13.size();
        stackTestDriver13.clear();
        java.lang.Object obj17 = stackTestDriver9.push((java.lang.Object) stackTestDriver13);
        boolean boolean18 = stackTestDriver9.isEmpty();
        java.lang.Object obj19 = stackTestDriver9.peek();
        experiment.util.StackTestDriver stackTestDriver20 = new experiment.util.StackTestDriver();
        int int21 = stackTestDriver20.size();
        stackTestDriver20.clear();
        boolean boolean23 = stackTestDriver20.isEmpty();
        experiment.util.StackTestDriver stackTestDriver24 = new experiment.util.StackTestDriver();
        int int25 = stackTestDriver24.size();
        int int26 = stackTestDriver24.size();
        stackTestDriver24.clear();
        java.lang.Object obj28 = stackTestDriver20.push((java.lang.Object) stackTestDriver24);
        boolean boolean29 = stackTestDriver20.isEmpty();
        java.lang.Object obj30 = stackTestDriver9.push((java.lang.Object) stackTestDriver20);
        java.lang.Object obj31 = stackTestDriver0.push((java.lang.Object) stackTestDriver9);
        int int32 = stackTestDriver0.size();
        java.lang.Object obj33 = stackTestDriver0.peek();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0 + "'", obj8, 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2 + "'", int32 == 2);
        org.junit.Assert.assertNotNull(obj33);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test072");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        int int6 = stackTestDriver4.size();
        stackTestDriver4.clear();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        boolean boolean9 = stackTestDriver0.isEmpty();
        java.lang.Object obj10 = stackTestDriver0.peek();
        experiment.util.StackTestDriver stackTestDriver11 = new experiment.util.StackTestDriver();
        int int12 = stackTestDriver11.size();
        stackTestDriver11.clear();
        boolean boolean14 = stackTestDriver11.isEmpty();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        int int16 = stackTestDriver15.size();
        int int17 = stackTestDriver15.size();
        stackTestDriver15.clear();
        java.lang.Object obj19 = stackTestDriver11.push((java.lang.Object) stackTestDriver15);
        boolean boolean20 = stackTestDriver11.isEmpty();
        java.lang.Object obj21 = stackTestDriver0.push((java.lang.Object) stackTestDriver11);
        java.lang.Object obj22 = stackTestDriver11.peek();
        java.lang.Class<?> wildcardClass23 = obj22.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test073");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        int int2 = stackTestDriver0.size();
        stackTestDriver0.clear();
        int int4 = stackTestDriver0.size();
        int int5 = stackTestDriver0.size();
        boolean boolean6 = stackTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test074");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        int int6 = stackTestDriver4.size();
        stackTestDriver4.clear();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = stackTestDriver4.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test075");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        int int6 = stackTestDriver4.size();
        stackTestDriver4.clear();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        stackTestDriver4.clear();
        boolean boolean10 = stackTestDriver4.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = stackTestDriver4.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test076");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        int int6 = stackTestDriver4.size();
        stackTestDriver4.clear();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        boolean boolean9 = stackTestDriver0.isEmpty();
        java.lang.Object obj10 = stackTestDriver0.peek();
        experiment.util.StackTestDriver stackTestDriver11 = new experiment.util.StackTestDriver();
        int int12 = stackTestDriver11.size();
        stackTestDriver11.clear();
        boolean boolean14 = stackTestDriver11.isEmpty();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        int int16 = stackTestDriver15.size();
        int int17 = stackTestDriver15.size();
        stackTestDriver15.clear();
        java.lang.Object obj19 = stackTestDriver11.push((java.lang.Object) stackTestDriver15);
        boolean boolean20 = stackTestDriver11.isEmpty();
        java.lang.Object obj21 = stackTestDriver0.push((java.lang.Object) stackTestDriver11);
        java.lang.Object obj22 = stackTestDriver0.peek();
        java.lang.Class<?> wildcardClass23 = obj22.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test077");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        int int6 = stackTestDriver4.size();
        stackTestDriver4.clear();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        boolean boolean9 = stackTestDriver0.isEmpty();
        java.lang.Object obj10 = stackTestDriver0.peek();
        experiment.util.StackTestDriver stackTestDriver11 = new experiment.util.StackTestDriver();
        int int12 = stackTestDriver11.size();
        stackTestDriver11.clear();
        boolean boolean14 = stackTestDriver11.isEmpty();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        int int16 = stackTestDriver15.size();
        int int17 = stackTestDriver15.size();
        stackTestDriver15.clear();
        java.lang.Object obj19 = stackTestDriver11.push((java.lang.Object) stackTestDriver15);
        boolean boolean20 = stackTestDriver11.isEmpty();
        java.lang.Object obj21 = stackTestDriver0.push((java.lang.Object) stackTestDriver11);
        java.lang.Object obj22 = stackTestDriver0.peek();
        java.lang.Class<?> wildcardClass23 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test078");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean5 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test079");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        int int6 = stackTestDriver4.size();
        stackTestDriver4.clear();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        boolean boolean9 = stackTestDriver0.isEmpty();
        java.lang.Object obj10 = stackTestDriver0.peek();
        int int11 = stackTestDriver0.size();
        java.lang.Object obj12 = stackTestDriver0.peek();
        java.lang.Class<?> wildcardClass13 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test080");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        java.lang.Object obj3 = stackTestDriver0.push((java.lang.Object) (short) 0);
        int int4 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        int int6 = stackTestDriver5.size();
        stackTestDriver5.clear();
        boolean boolean8 = stackTestDriver5.isEmpty();
        boolean boolean9 = stackTestDriver5.isEmpty();
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        int int11 = stackTestDriver10.size();
        stackTestDriver10.clear();
        boolean boolean13 = stackTestDriver10.isEmpty();
        experiment.util.StackTestDriver stackTestDriver14 = new experiment.util.StackTestDriver();
        int int15 = stackTestDriver14.size();
        int int16 = stackTestDriver14.size();
        stackTestDriver14.clear();
        java.lang.Object obj18 = stackTestDriver10.push((java.lang.Object) stackTestDriver14);
        boolean boolean19 = stackTestDriver10.isEmpty();
        java.lang.Object obj20 = stackTestDriver5.push((java.lang.Object) boolean19);
        java.lang.Object obj21 = stackTestDriver5.pop();
        java.lang.Object obj22 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = stackTestDriver5.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (short) 0 + "'", obj3, (short) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + false + "'", obj20, false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + false + "'", obj21, false);
        org.junit.Assert.assertNotNull(obj22);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test081");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        int int6 = stackTestDriver4.size();
        stackTestDriver4.clear();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        stackTestDriver0.clear();
        int int10 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver11 = new experiment.util.StackTestDriver();
        int int12 = stackTestDriver11.size();
        stackTestDriver11.clear();
        boolean boolean14 = stackTestDriver11.isEmpty();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        int int16 = stackTestDriver15.size();
        int int17 = stackTestDriver15.size();
        stackTestDriver15.clear();
        java.lang.Object obj19 = stackTestDriver11.push((java.lang.Object) stackTestDriver15);
        boolean boolean20 = stackTestDriver11.isEmpty();
        java.lang.Object obj21 = stackTestDriver11.peek();
        experiment.util.StackTestDriver stackTestDriver22 = new experiment.util.StackTestDriver();
        int int23 = stackTestDriver22.size();
        stackTestDriver22.clear();
        boolean boolean25 = stackTestDriver22.isEmpty();
        experiment.util.StackTestDriver stackTestDriver26 = new experiment.util.StackTestDriver();
        int int27 = stackTestDriver26.size();
        int int28 = stackTestDriver26.size();
        stackTestDriver26.clear();
        java.lang.Object obj30 = stackTestDriver22.push((java.lang.Object) stackTestDriver26);
        boolean boolean31 = stackTestDriver22.isEmpty();
        java.lang.Object obj32 = stackTestDriver11.push((java.lang.Object) stackTestDriver22);
        java.lang.Object obj33 = stackTestDriver0.push((java.lang.Object) stackTestDriver11);
        experiment.util.StackTestDriver stackTestDriver34 = new experiment.util.StackTestDriver();
        int int35 = stackTestDriver34.size();
        stackTestDriver34.clear();
        boolean boolean37 = stackTestDriver34.isEmpty();
        experiment.util.StackTestDriver stackTestDriver38 = new experiment.util.StackTestDriver();
        int int39 = stackTestDriver38.size();
        int int40 = stackTestDriver38.size();
        stackTestDriver38.clear();
        java.lang.Object obj42 = stackTestDriver34.push((java.lang.Object) stackTestDriver38);
        stackTestDriver34.clear();
        int int44 = stackTestDriver34.size();
        experiment.util.StackTestDriver stackTestDriver45 = new experiment.util.StackTestDriver();
        int int46 = stackTestDriver45.size();
        stackTestDriver45.clear();
        boolean boolean48 = stackTestDriver45.isEmpty();
        experiment.util.StackTestDriver stackTestDriver49 = new experiment.util.StackTestDriver();
        int int50 = stackTestDriver49.size();
        int int51 = stackTestDriver49.size();
        stackTestDriver49.clear();
        java.lang.Object obj53 = stackTestDriver45.push((java.lang.Object) stackTestDriver49);
        boolean boolean54 = stackTestDriver45.isEmpty();
        java.lang.Object obj55 = stackTestDriver45.peek();
        experiment.util.StackTestDriver stackTestDriver56 = new experiment.util.StackTestDriver();
        int int57 = stackTestDriver56.size();
        stackTestDriver56.clear();
        boolean boolean59 = stackTestDriver56.isEmpty();
        experiment.util.StackTestDriver stackTestDriver60 = new experiment.util.StackTestDriver();
        int int61 = stackTestDriver60.size();
        int int62 = stackTestDriver60.size();
        stackTestDriver60.clear();
        java.lang.Object obj64 = stackTestDriver56.push((java.lang.Object) stackTestDriver60);
        boolean boolean65 = stackTestDriver56.isEmpty();
        java.lang.Object obj66 = stackTestDriver45.push((java.lang.Object) stackTestDriver56);
        java.lang.Object obj67 = stackTestDriver34.push((java.lang.Object) stackTestDriver45);
        java.lang.Object obj68 = stackTestDriver34.pop();
        java.lang.Object obj69 = stackTestDriver0.push((java.lang.Object) stackTestDriver34);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj70 = stackTestDriver34.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(obj53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(obj55);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(obj64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(obj66);
        org.junit.Assert.assertNotNull(obj67);
        org.junit.Assert.assertNotNull(obj68);
        org.junit.Assert.assertNotNull(obj69);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test082");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        int int2 = stackTestDriver0.size();
        stackTestDriver0.clear();
        int int4 = stackTestDriver0.size();
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
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test083");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        int int6 = stackTestDriver4.size();
        stackTestDriver4.clear();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        stackTestDriver0.clear();
        int int10 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver11 = new experiment.util.StackTestDriver();
        int int12 = stackTestDriver11.size();
        stackTestDriver11.clear();
        boolean boolean14 = stackTestDriver11.isEmpty();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        int int16 = stackTestDriver15.size();
        int int17 = stackTestDriver15.size();
        stackTestDriver15.clear();
        java.lang.Object obj19 = stackTestDriver11.push((java.lang.Object) stackTestDriver15);
        boolean boolean20 = stackTestDriver11.isEmpty();
        java.lang.Object obj21 = stackTestDriver11.peek();
        experiment.util.StackTestDriver stackTestDriver22 = new experiment.util.StackTestDriver();
        int int23 = stackTestDriver22.size();
        stackTestDriver22.clear();
        boolean boolean25 = stackTestDriver22.isEmpty();
        experiment.util.StackTestDriver stackTestDriver26 = new experiment.util.StackTestDriver();
        int int27 = stackTestDriver26.size();
        int int28 = stackTestDriver26.size();
        stackTestDriver26.clear();
        java.lang.Object obj30 = stackTestDriver22.push((java.lang.Object) stackTestDriver26);
        boolean boolean31 = stackTestDriver22.isEmpty();
        java.lang.Object obj32 = stackTestDriver11.push((java.lang.Object) stackTestDriver22);
        java.lang.Object obj33 = stackTestDriver0.push((java.lang.Object) stackTestDriver11);
        experiment.util.StackTestDriver stackTestDriver34 = new experiment.util.StackTestDriver();
        int int35 = stackTestDriver34.size();
        stackTestDriver34.clear();
        boolean boolean37 = stackTestDriver34.isEmpty();
        experiment.util.StackTestDriver stackTestDriver38 = new experiment.util.StackTestDriver();
        int int39 = stackTestDriver38.size();
        int int40 = stackTestDriver38.size();
        stackTestDriver38.clear();
        java.lang.Object obj42 = stackTestDriver34.push((java.lang.Object) stackTestDriver38);
        stackTestDriver34.clear();
        int int44 = stackTestDriver34.size();
        experiment.util.StackTestDriver stackTestDriver45 = new experiment.util.StackTestDriver();
        int int46 = stackTestDriver45.size();
        stackTestDriver45.clear();
        boolean boolean48 = stackTestDriver45.isEmpty();
        experiment.util.StackTestDriver stackTestDriver49 = new experiment.util.StackTestDriver();
        int int50 = stackTestDriver49.size();
        int int51 = stackTestDriver49.size();
        stackTestDriver49.clear();
        java.lang.Object obj53 = stackTestDriver45.push((java.lang.Object) stackTestDriver49);
        boolean boolean54 = stackTestDriver45.isEmpty();
        java.lang.Object obj55 = stackTestDriver45.peek();
        experiment.util.StackTestDriver stackTestDriver56 = new experiment.util.StackTestDriver();
        int int57 = stackTestDriver56.size();
        stackTestDriver56.clear();
        boolean boolean59 = stackTestDriver56.isEmpty();
        experiment.util.StackTestDriver stackTestDriver60 = new experiment.util.StackTestDriver();
        int int61 = stackTestDriver60.size();
        int int62 = stackTestDriver60.size();
        stackTestDriver60.clear();
        java.lang.Object obj64 = stackTestDriver56.push((java.lang.Object) stackTestDriver60);
        boolean boolean65 = stackTestDriver56.isEmpty();
        java.lang.Object obj66 = stackTestDriver45.push((java.lang.Object) stackTestDriver56);
        java.lang.Object obj67 = stackTestDriver34.push((java.lang.Object) stackTestDriver45);
        java.lang.Object obj68 = stackTestDriver34.pop();
        java.lang.Object obj69 = stackTestDriver0.push((java.lang.Object) stackTestDriver34);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj70 = stackTestDriver34.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(obj53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(obj55);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(obj64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(obj66);
        org.junit.Assert.assertNotNull(obj67);
        org.junit.Assert.assertNotNull(obj68);
        org.junit.Assert.assertNotNull(obj69);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test084");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        boolean boolean5 = stackTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test085");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        int int6 = stackTestDriver4.size();
        stackTestDriver4.clear();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        boolean boolean9 = stackTestDriver0.isEmpty();
        java.lang.Object obj10 = stackTestDriver0.peek();
        java.lang.Object obj11 = stackTestDriver0.peek();
        java.lang.Object obj12 = stackTestDriver0.peek();
        boolean boolean13 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver14 = new experiment.util.StackTestDriver();
        int int15 = stackTestDriver14.size();
        stackTestDriver14.clear();
        boolean boolean17 = stackTestDriver14.isEmpty();
        experiment.util.StackTestDriver stackTestDriver18 = new experiment.util.StackTestDriver();
        int int19 = stackTestDriver18.size();
        int int20 = stackTestDriver18.size();
        stackTestDriver18.clear();
        java.lang.Object obj22 = stackTestDriver14.push((java.lang.Object) stackTestDriver18);
        stackTestDriver14.clear();
        int int24 = stackTestDriver14.size();
        experiment.util.StackTestDriver stackTestDriver25 = new experiment.util.StackTestDriver();
        int int26 = stackTestDriver25.size();
        stackTestDriver25.clear();
        boolean boolean28 = stackTestDriver25.isEmpty();
        experiment.util.StackTestDriver stackTestDriver29 = new experiment.util.StackTestDriver();
        int int30 = stackTestDriver29.size();
        int int31 = stackTestDriver29.size();
        stackTestDriver29.clear();
        java.lang.Object obj33 = stackTestDriver25.push((java.lang.Object) stackTestDriver29);
        boolean boolean34 = stackTestDriver25.isEmpty();
        java.lang.Object obj35 = stackTestDriver25.peek();
        experiment.util.StackTestDriver stackTestDriver36 = new experiment.util.StackTestDriver();
        int int37 = stackTestDriver36.size();
        stackTestDriver36.clear();
        boolean boolean39 = stackTestDriver36.isEmpty();
        experiment.util.StackTestDriver stackTestDriver40 = new experiment.util.StackTestDriver();
        int int41 = stackTestDriver40.size();
        int int42 = stackTestDriver40.size();
        stackTestDriver40.clear();
        java.lang.Object obj44 = stackTestDriver36.push((java.lang.Object) stackTestDriver40);
        boolean boolean45 = stackTestDriver36.isEmpty();
        java.lang.Object obj46 = stackTestDriver25.push((java.lang.Object) stackTestDriver36);
        java.lang.Object obj47 = stackTestDriver14.push((java.lang.Object) stackTestDriver25);
        experiment.util.StackTestDriver stackTestDriver48 = new experiment.util.StackTestDriver();
        stackTestDriver48.clear();
        stackTestDriver48.clear();
        java.lang.Class<?> wildcardClass51 = stackTestDriver48.getClass();
        java.lang.Object obj52 = stackTestDriver14.push((java.lang.Object) wildcardClass51);
        stackTestDriver14.clear();
        java.lang.Object obj54 = stackTestDriver0.push((java.lang.Object) stackTestDriver14);
        int int55 = stackTestDriver14.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj56 = stackTestDriver14.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNotNull(obj52);
        org.junit.Assert.assertEquals(obj52.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj52), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj52), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertNotNull(obj54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test086");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        java.lang.Object obj3 = stackTestDriver0.push((java.lang.Object) (short) 0);
        stackTestDriver0.clear();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (short) 0 + "'", obj3, (short) 0);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test087");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        int int6 = stackTestDriver4.size();
        stackTestDriver4.clear();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        stackTestDriver0.clear();
        int int10 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver11 = new experiment.util.StackTestDriver();
        int int12 = stackTestDriver11.size();
        int int13 = stackTestDriver11.size();
        int int14 = stackTestDriver11.size();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        int int16 = stackTestDriver15.size();
        stackTestDriver15.clear();
        boolean boolean18 = stackTestDriver15.isEmpty();
        experiment.util.StackTestDriver stackTestDriver19 = new experiment.util.StackTestDriver();
        int int20 = stackTestDriver19.size();
        int int21 = stackTestDriver19.size();
        stackTestDriver19.clear();
        java.lang.Object obj23 = stackTestDriver15.push((java.lang.Object) stackTestDriver19);
        stackTestDriver15.clear();
        int int25 = stackTestDriver15.size();
        experiment.util.StackTestDriver stackTestDriver26 = new experiment.util.StackTestDriver();
        int int27 = stackTestDriver26.size();
        stackTestDriver26.clear();
        boolean boolean29 = stackTestDriver26.isEmpty();
        experiment.util.StackTestDriver stackTestDriver30 = new experiment.util.StackTestDriver();
        int int31 = stackTestDriver30.size();
        int int32 = stackTestDriver30.size();
        stackTestDriver30.clear();
        java.lang.Object obj34 = stackTestDriver26.push((java.lang.Object) stackTestDriver30);
        boolean boolean35 = stackTestDriver26.isEmpty();
        java.lang.Object obj36 = stackTestDriver26.peek();
        experiment.util.StackTestDriver stackTestDriver37 = new experiment.util.StackTestDriver();
        int int38 = stackTestDriver37.size();
        stackTestDriver37.clear();
        boolean boolean40 = stackTestDriver37.isEmpty();
        experiment.util.StackTestDriver stackTestDriver41 = new experiment.util.StackTestDriver();
        int int42 = stackTestDriver41.size();
        int int43 = stackTestDriver41.size();
        stackTestDriver41.clear();
        java.lang.Object obj45 = stackTestDriver37.push((java.lang.Object) stackTestDriver41);
        boolean boolean46 = stackTestDriver37.isEmpty();
        java.lang.Object obj47 = stackTestDriver26.push((java.lang.Object) stackTestDriver37);
        java.lang.Object obj48 = stackTestDriver15.push((java.lang.Object) stackTestDriver26);
        java.lang.Object obj49 = stackTestDriver15.pop();
        java.lang.Object obj50 = stackTestDriver11.push((java.lang.Object) stackTestDriver15);
        java.lang.Object obj51 = stackTestDriver0.push((java.lang.Object) stackTestDriver15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj52 = stackTestDriver15.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertNotNull(obj50);
        org.junit.Assert.assertNotNull(obj51);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test088");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        int int2 = stackTestDriver0.size();
        stackTestDriver0.clear();
        int int4 = stackTestDriver0.size();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test089");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        boolean boolean4 = stackTestDriver0.isEmpty();
        boolean boolean5 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        stackTestDriver6.clear();
        stackTestDriver6.clear();
        stackTestDriver6.clear();
        java.lang.Object obj10 = stackTestDriver0.push((java.lang.Object) stackTestDriver6);
        java.lang.Object obj11 = stackTestDriver0.pop();
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test090");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        boolean boolean4 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        java.lang.Class<?> wildcardClass6 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test091");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        java.lang.Object obj3 = stackTestDriver0.push((java.lang.Object) (short) 0);
        boolean boolean4 = stackTestDriver0.isEmpty();
        int int5 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        int int7 = stackTestDriver6.size();
        stackTestDriver6.clear();
        boolean boolean9 = stackTestDriver6.isEmpty();
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        int int11 = stackTestDriver10.size();
        int int12 = stackTestDriver10.size();
        stackTestDriver10.clear();
        java.lang.Object obj14 = stackTestDriver6.push((java.lang.Object) stackTestDriver10);
        stackTestDriver6.clear();
        int int16 = stackTestDriver6.size();
        java.lang.Class<?> wildcardClass17 = stackTestDriver6.getClass();
        java.lang.Object obj18 = stackTestDriver0.push((java.lang.Object) stackTestDriver6);
        experiment.util.StackTestDriver stackTestDriver19 = new experiment.util.StackTestDriver();
        int int20 = stackTestDriver19.size();
        int int21 = stackTestDriver19.size();
        int int22 = stackTestDriver19.size();
        boolean boolean23 = stackTestDriver19.isEmpty();
        boolean boolean24 = stackTestDriver19.isEmpty();
        experiment.util.StackTestDriver stackTestDriver25 = new experiment.util.StackTestDriver();
        int int26 = stackTestDriver25.size();
        stackTestDriver25.clear();
        stackTestDriver25.clear();
        experiment.util.StackTestDriver stackTestDriver29 = new experiment.util.StackTestDriver();
        int int30 = stackTestDriver29.size();
        stackTestDriver29.clear();
        boolean boolean32 = stackTestDriver29.isEmpty();
        boolean boolean33 = stackTestDriver29.isEmpty();
        java.lang.Object obj34 = stackTestDriver25.push((java.lang.Object) boolean33);
        java.lang.Class<?> wildcardClass35 = obj34.getClass();
        java.lang.Object obj36 = stackTestDriver19.push((java.lang.Object) wildcardClass35);
        experiment.util.StackTestDriver stackTestDriver37 = new experiment.util.StackTestDriver();
        int int38 = stackTestDriver37.size();
        stackTestDriver37.clear();
        boolean boolean40 = stackTestDriver37.isEmpty();
        experiment.util.StackTestDriver stackTestDriver41 = new experiment.util.StackTestDriver();
        int int42 = stackTestDriver41.size();
        int int43 = stackTestDriver41.size();
        stackTestDriver41.clear();
        java.lang.Object obj45 = stackTestDriver37.push((java.lang.Object) stackTestDriver41);
        boolean boolean46 = stackTestDriver37.isEmpty();
        java.lang.Object obj47 = stackTestDriver37.peek();
        java.lang.Object obj48 = stackTestDriver37.peek();
        java.lang.Object obj49 = stackTestDriver37.peek();
        boolean boolean50 = stackTestDriver37.isEmpty();
        experiment.util.StackTestDriver stackTestDriver51 = new experiment.util.StackTestDriver();
        int int52 = stackTestDriver51.size();
        stackTestDriver51.clear();
        boolean boolean54 = stackTestDriver51.isEmpty();
        experiment.util.StackTestDriver stackTestDriver55 = new experiment.util.StackTestDriver();
        int int56 = stackTestDriver55.size();
        int int57 = stackTestDriver55.size();
        stackTestDriver55.clear();
        java.lang.Object obj59 = stackTestDriver51.push((java.lang.Object) stackTestDriver55);
        stackTestDriver51.clear();
        int int61 = stackTestDriver51.size();
        experiment.util.StackTestDriver stackTestDriver62 = new experiment.util.StackTestDriver();
        int int63 = stackTestDriver62.size();
        stackTestDriver62.clear();
        boolean boolean65 = stackTestDriver62.isEmpty();
        experiment.util.StackTestDriver stackTestDriver66 = new experiment.util.StackTestDriver();
        int int67 = stackTestDriver66.size();
        int int68 = stackTestDriver66.size();
        stackTestDriver66.clear();
        java.lang.Object obj70 = stackTestDriver62.push((java.lang.Object) stackTestDriver66);
        boolean boolean71 = stackTestDriver62.isEmpty();
        java.lang.Object obj72 = stackTestDriver62.peek();
        experiment.util.StackTestDriver stackTestDriver73 = new experiment.util.StackTestDriver();
        int int74 = stackTestDriver73.size();
        stackTestDriver73.clear();
        boolean boolean76 = stackTestDriver73.isEmpty();
        experiment.util.StackTestDriver stackTestDriver77 = new experiment.util.StackTestDriver();
        int int78 = stackTestDriver77.size();
        int int79 = stackTestDriver77.size();
        stackTestDriver77.clear();
        java.lang.Object obj81 = stackTestDriver73.push((java.lang.Object) stackTestDriver77);
        boolean boolean82 = stackTestDriver73.isEmpty();
        java.lang.Object obj83 = stackTestDriver62.push((java.lang.Object) stackTestDriver73);
        java.lang.Object obj84 = stackTestDriver51.push((java.lang.Object) stackTestDriver62);
        experiment.util.StackTestDriver stackTestDriver85 = new experiment.util.StackTestDriver();
        stackTestDriver85.clear();
        stackTestDriver85.clear();
        java.lang.Class<?> wildcardClass88 = stackTestDriver85.getClass();
        java.lang.Object obj89 = stackTestDriver51.push((java.lang.Object) wildcardClass88);
        stackTestDriver51.clear();
        java.lang.Object obj91 = stackTestDriver37.push((java.lang.Object) stackTestDriver51);
        int int92 = stackTestDriver51.size();
        boolean boolean93 = stackTestDriver51.isEmpty();
        java.lang.Object obj94 = stackTestDriver19.push((java.lang.Object) boolean93);
        java.lang.Object obj95 = stackTestDriver6.push(obj94);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (short) 0 + "'", obj3, (short) 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + true + "'", obj34, true);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertEquals(obj36.toString(), "class java.lang.Boolean");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj36), "class java.lang.Boolean");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj36), "class java.lang.Boolean");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(obj59);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNotNull(obj70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(obj72);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertNotNull(obj81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(obj83);
        org.junit.Assert.assertNotNull(obj84);
        org.junit.Assert.assertNotNull(wildcardClass88);
        org.junit.Assert.assertNotNull(obj89);
        org.junit.Assert.assertEquals(obj89.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj89), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj89), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertNotNull(obj91);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 0 + "'", int92 == 0);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertEquals("'" + obj94 + "' != '" + true + "'", obj94, true);
        org.junit.Assert.assertEquals("'" + obj95 + "' != '" + true + "'", obj95, true);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test092");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean5 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        int int7 = stackTestDriver6.size();
        stackTestDriver6.clear();
        boolean boolean9 = stackTestDriver6.isEmpty();
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        int int11 = stackTestDriver10.size();
        int int12 = stackTestDriver10.size();
        stackTestDriver10.clear();
        java.lang.Object obj14 = stackTestDriver6.push((java.lang.Object) stackTestDriver10);
        boolean boolean15 = stackTestDriver6.isEmpty();
        java.lang.Object obj16 = stackTestDriver0.push((java.lang.Object) boolean15);
        int int17 = stackTestDriver0.size();
        java.lang.Object obj19 = stackTestDriver0.push((java.lang.Object) (-1L));
        stackTestDriver0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + false + "'", obj16, false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (-1L) + "'", obj19, (-1L));
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test093");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test094");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver3 = new experiment.util.StackTestDriver();
        int int4 = stackTestDriver3.size();
        int int5 = stackTestDriver3.size();
        stackTestDriver3.clear();
        int int7 = stackTestDriver3.size();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) int7);
        experiment.util.StackTestDriver stackTestDriver9 = new experiment.util.StackTestDriver();
        int int10 = stackTestDriver9.size();
        stackTestDriver9.clear();
        boolean boolean12 = stackTestDriver9.isEmpty();
        experiment.util.StackTestDriver stackTestDriver13 = new experiment.util.StackTestDriver();
        int int14 = stackTestDriver13.size();
        int int15 = stackTestDriver13.size();
        stackTestDriver13.clear();
        java.lang.Object obj17 = stackTestDriver9.push((java.lang.Object) stackTestDriver13);
        boolean boolean18 = stackTestDriver9.isEmpty();
        java.lang.Object obj19 = stackTestDriver9.peek();
        experiment.util.StackTestDriver stackTestDriver20 = new experiment.util.StackTestDriver();
        int int21 = stackTestDriver20.size();
        stackTestDriver20.clear();
        boolean boolean23 = stackTestDriver20.isEmpty();
        experiment.util.StackTestDriver stackTestDriver24 = new experiment.util.StackTestDriver();
        int int25 = stackTestDriver24.size();
        int int26 = stackTestDriver24.size();
        stackTestDriver24.clear();
        java.lang.Object obj28 = stackTestDriver20.push((java.lang.Object) stackTestDriver24);
        boolean boolean29 = stackTestDriver20.isEmpty();
        java.lang.Object obj30 = stackTestDriver9.push((java.lang.Object) stackTestDriver20);
        java.lang.Object obj31 = stackTestDriver0.push((java.lang.Object) stackTestDriver9);
        int int32 = stackTestDriver0.size();
        boolean boolean33 = stackTestDriver0.isEmpty();
        int int34 = stackTestDriver0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0 + "'", obj8, 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2 + "'", int32 == 2);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2 + "'", int34 == 2);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test095");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        int int4 = stackTestDriver0.size();
        stackTestDriver0.clear();
        int int6 = stackTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test096");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        int int6 = stackTestDriver4.size();
        stackTestDriver4.clear();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        stackTestDriver0.clear();
        int int10 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver11 = new experiment.util.StackTestDriver();
        int int12 = stackTestDriver11.size();
        stackTestDriver11.clear();
        boolean boolean14 = stackTestDriver11.isEmpty();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        int int16 = stackTestDriver15.size();
        int int17 = stackTestDriver15.size();
        stackTestDriver15.clear();
        java.lang.Object obj19 = stackTestDriver11.push((java.lang.Object) stackTestDriver15);
        boolean boolean20 = stackTestDriver11.isEmpty();
        java.lang.Object obj21 = stackTestDriver11.peek();
        experiment.util.StackTestDriver stackTestDriver22 = new experiment.util.StackTestDriver();
        int int23 = stackTestDriver22.size();
        stackTestDriver22.clear();
        boolean boolean25 = stackTestDriver22.isEmpty();
        experiment.util.StackTestDriver stackTestDriver26 = new experiment.util.StackTestDriver();
        int int27 = stackTestDriver26.size();
        int int28 = stackTestDriver26.size();
        stackTestDriver26.clear();
        java.lang.Object obj30 = stackTestDriver22.push((java.lang.Object) stackTestDriver26);
        boolean boolean31 = stackTestDriver22.isEmpty();
        java.lang.Object obj32 = stackTestDriver11.push((java.lang.Object) stackTestDriver22);
        java.lang.Object obj33 = stackTestDriver0.push((java.lang.Object) stackTestDriver11);
        experiment.util.StackTestDriver stackTestDriver34 = new experiment.util.StackTestDriver();
        stackTestDriver34.clear();
        stackTestDriver34.clear();
        java.lang.Class<?> wildcardClass37 = stackTestDriver34.getClass();
        java.lang.Object obj38 = stackTestDriver0.push((java.lang.Object) wildcardClass37);
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver40 = new experiment.util.StackTestDriver();
        int int41 = stackTestDriver40.size();
        int int42 = stackTestDriver40.size();
        boolean boolean43 = stackTestDriver40.isEmpty();
        int int44 = stackTestDriver40.size();
        stackTestDriver40.clear();
        experiment.util.StackTestDriver stackTestDriver46 = new experiment.util.StackTestDriver();
        int int47 = stackTestDriver46.size();
        stackTestDriver46.clear();
        boolean boolean49 = stackTestDriver46.isEmpty();
        experiment.util.StackTestDriver stackTestDriver50 = new experiment.util.StackTestDriver();
        int int51 = stackTestDriver50.size();
        int int52 = stackTestDriver50.size();
        stackTestDriver50.clear();
        java.lang.Object obj54 = stackTestDriver46.push((java.lang.Object) stackTestDriver50);
        stackTestDriver46.clear();
        int int56 = stackTestDriver46.size();
        experiment.util.StackTestDriver stackTestDriver57 = new experiment.util.StackTestDriver();
        int int58 = stackTestDriver57.size();
        stackTestDriver57.clear();
        boolean boolean60 = stackTestDriver57.isEmpty();
        experiment.util.StackTestDriver stackTestDriver61 = new experiment.util.StackTestDriver();
        int int62 = stackTestDriver61.size();
        int int63 = stackTestDriver61.size();
        stackTestDriver61.clear();
        java.lang.Object obj65 = stackTestDriver57.push((java.lang.Object) stackTestDriver61);
        boolean boolean66 = stackTestDriver57.isEmpty();
        java.lang.Object obj67 = stackTestDriver57.peek();
        experiment.util.StackTestDriver stackTestDriver68 = new experiment.util.StackTestDriver();
        int int69 = stackTestDriver68.size();
        stackTestDriver68.clear();
        boolean boolean71 = stackTestDriver68.isEmpty();
        experiment.util.StackTestDriver stackTestDriver72 = new experiment.util.StackTestDriver();
        int int73 = stackTestDriver72.size();
        int int74 = stackTestDriver72.size();
        stackTestDriver72.clear();
        java.lang.Object obj76 = stackTestDriver68.push((java.lang.Object) stackTestDriver72);
        boolean boolean77 = stackTestDriver68.isEmpty();
        java.lang.Object obj78 = stackTestDriver57.push((java.lang.Object) stackTestDriver68);
        java.lang.Object obj79 = stackTestDriver46.push((java.lang.Object) stackTestDriver57);
        java.lang.Object obj80 = stackTestDriver46.pop();
        java.lang.Object obj81 = stackTestDriver40.push(obj80);
        java.lang.Object obj82 = stackTestDriver0.push((java.lang.Object) stackTestDriver40);
        java.lang.Class<?> wildcardClass83 = obj82.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertEquals(obj38.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj38), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj38), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(obj54);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNotNull(obj65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(obj67);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertNotNull(obj76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(obj78);
        org.junit.Assert.assertNotNull(obj79);
        org.junit.Assert.assertNotNull(obj80);
        org.junit.Assert.assertNotNull(obj81);
        org.junit.Assert.assertNotNull(obj82);
        org.junit.Assert.assertNotNull(wildcardClass83);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test097");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        java.lang.Object obj3 = stackTestDriver0.push((java.lang.Object) (short) 0);
        int int4 = stackTestDriver0.size();
        java.lang.Object obj5 = stackTestDriver0.pop();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (short) 0 + "'", obj3, (short) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) 0 + "'", obj5, (short) 0);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test098");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test099");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean5 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        int int7 = stackTestDriver6.size();
        stackTestDriver6.clear();
        boolean boolean9 = stackTestDriver6.isEmpty();
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        int int11 = stackTestDriver10.size();
        int int12 = stackTestDriver10.size();
        stackTestDriver10.clear();
        java.lang.Object obj14 = stackTestDriver6.push((java.lang.Object) stackTestDriver10);
        boolean boolean15 = stackTestDriver6.isEmpty();
        java.lang.Object obj16 = stackTestDriver0.push((java.lang.Object) boolean15);
        boolean boolean17 = stackTestDriver0.isEmpty();
        java.lang.Object obj18 = stackTestDriver0.pop();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + false + "'", obj16, false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + false + "'", obj18, false);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test100");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        int int6 = stackTestDriver4.size();
        stackTestDriver4.clear();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        stackTestDriver0.clear();
        int int10 = stackTestDriver0.size();
        int int11 = stackTestDriver0.size();
        int int12 = stackTestDriver0.size();
        boolean boolean13 = stackTestDriver0.isEmpty();
        java.lang.Class<?> wildcardClass14 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test101");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean5 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        int int7 = stackTestDriver0.size();
        stackTestDriver0.clear();
        int int9 = stackTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test102");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        int int6 = stackTestDriver4.size();
        stackTestDriver4.clear();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        boolean boolean9 = stackTestDriver0.isEmpty();
        java.lang.Object obj10 = stackTestDriver0.peek();
        int int11 = stackTestDriver0.size();
        java.lang.Object obj12 = stackTestDriver0.peek();
        experiment.util.StackTestDriver stackTestDriver13 = new experiment.util.StackTestDriver();
        int int14 = stackTestDriver13.size();
        int int15 = stackTestDriver13.size();
        boolean boolean16 = stackTestDriver13.isEmpty();
        java.lang.Object obj17 = stackTestDriver0.push((java.lang.Object) stackTestDriver13);
        java.lang.Class<?> wildcardClass18 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test103");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        int int6 = stackTestDriver4.size();
        stackTestDriver4.clear();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        boolean boolean9 = stackTestDriver0.isEmpty();
        java.lang.Object obj10 = stackTestDriver0.peek();
        java.lang.Object obj11 = stackTestDriver0.peek();
        java.lang.Object obj12 = stackTestDriver0.peek();
        boolean boolean13 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver14 = new experiment.util.StackTestDriver();
        int int15 = stackTestDriver14.size();
        stackTestDriver14.clear();
        boolean boolean17 = stackTestDriver14.isEmpty();
        experiment.util.StackTestDriver stackTestDriver18 = new experiment.util.StackTestDriver();
        int int19 = stackTestDriver18.size();
        int int20 = stackTestDriver18.size();
        stackTestDriver18.clear();
        java.lang.Object obj22 = stackTestDriver14.push((java.lang.Object) stackTestDriver18);
        stackTestDriver14.clear();
        int int24 = stackTestDriver14.size();
        experiment.util.StackTestDriver stackTestDriver25 = new experiment.util.StackTestDriver();
        int int26 = stackTestDriver25.size();
        stackTestDriver25.clear();
        boolean boolean28 = stackTestDriver25.isEmpty();
        experiment.util.StackTestDriver stackTestDriver29 = new experiment.util.StackTestDriver();
        int int30 = stackTestDriver29.size();
        int int31 = stackTestDriver29.size();
        stackTestDriver29.clear();
        java.lang.Object obj33 = stackTestDriver25.push((java.lang.Object) stackTestDriver29);
        boolean boolean34 = stackTestDriver25.isEmpty();
        java.lang.Object obj35 = stackTestDriver25.peek();
        experiment.util.StackTestDriver stackTestDriver36 = new experiment.util.StackTestDriver();
        int int37 = stackTestDriver36.size();
        stackTestDriver36.clear();
        boolean boolean39 = stackTestDriver36.isEmpty();
        experiment.util.StackTestDriver stackTestDriver40 = new experiment.util.StackTestDriver();
        int int41 = stackTestDriver40.size();
        int int42 = stackTestDriver40.size();
        stackTestDriver40.clear();
        java.lang.Object obj44 = stackTestDriver36.push((java.lang.Object) stackTestDriver40);
        boolean boolean45 = stackTestDriver36.isEmpty();
        java.lang.Object obj46 = stackTestDriver25.push((java.lang.Object) stackTestDriver36);
        java.lang.Object obj47 = stackTestDriver14.push((java.lang.Object) stackTestDriver25);
        experiment.util.StackTestDriver stackTestDriver48 = new experiment.util.StackTestDriver();
        stackTestDriver48.clear();
        stackTestDriver48.clear();
        java.lang.Class<?> wildcardClass51 = stackTestDriver48.getClass();
        java.lang.Object obj52 = stackTestDriver14.push((java.lang.Object) wildcardClass51);
        stackTestDriver14.clear();
        java.lang.Object obj54 = stackTestDriver0.push((java.lang.Object) stackTestDriver14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj55 = stackTestDriver14.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNotNull(obj52);
        org.junit.Assert.assertEquals(obj52.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj52), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj52), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertNotNull(obj54);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test104");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        int int6 = stackTestDriver4.size();
        stackTestDriver4.clear();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        boolean boolean9 = stackTestDriver0.isEmpty();
        java.lang.Object obj10 = stackTestDriver0.peek();
        experiment.util.StackTestDriver stackTestDriver11 = new experiment.util.StackTestDriver();
        int int12 = stackTestDriver11.size();
        stackTestDriver11.clear();
        boolean boolean14 = stackTestDriver11.isEmpty();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        int int16 = stackTestDriver15.size();
        int int17 = stackTestDriver15.size();
        stackTestDriver15.clear();
        java.lang.Object obj19 = stackTestDriver11.push((java.lang.Object) stackTestDriver15);
        boolean boolean20 = stackTestDriver11.isEmpty();
        java.lang.Object obj21 = stackTestDriver0.push((java.lang.Object) stackTestDriver11);
        java.lang.Object obj22 = stackTestDriver11.peek();
        int int23 = stackTestDriver11.size();
        experiment.util.StackTestDriver stackTestDriver24 = new experiment.util.StackTestDriver();
        stackTestDriver24.clear();
        experiment.util.StackTestDriver stackTestDriver26 = new experiment.util.StackTestDriver();
        int int27 = stackTestDriver26.size();
        stackTestDriver26.clear();
        boolean boolean29 = stackTestDriver26.isEmpty();
        experiment.util.StackTestDriver stackTestDriver30 = new experiment.util.StackTestDriver();
        int int31 = stackTestDriver30.size();
        int int32 = stackTestDriver30.size();
        stackTestDriver30.clear();
        java.lang.Object obj34 = stackTestDriver26.push((java.lang.Object) stackTestDriver30);
        stackTestDriver26.clear();
        int int36 = stackTestDriver26.size();
        experiment.util.StackTestDriver stackTestDriver37 = new experiment.util.StackTestDriver();
        int int38 = stackTestDriver37.size();
        stackTestDriver37.clear();
        boolean boolean40 = stackTestDriver37.isEmpty();
        experiment.util.StackTestDriver stackTestDriver41 = new experiment.util.StackTestDriver();
        int int42 = stackTestDriver41.size();
        int int43 = stackTestDriver41.size();
        stackTestDriver41.clear();
        java.lang.Object obj45 = stackTestDriver37.push((java.lang.Object) stackTestDriver41);
        boolean boolean46 = stackTestDriver37.isEmpty();
        java.lang.Object obj47 = stackTestDriver37.peek();
        experiment.util.StackTestDriver stackTestDriver48 = new experiment.util.StackTestDriver();
        int int49 = stackTestDriver48.size();
        stackTestDriver48.clear();
        boolean boolean51 = stackTestDriver48.isEmpty();
        experiment.util.StackTestDriver stackTestDriver52 = new experiment.util.StackTestDriver();
        int int53 = stackTestDriver52.size();
        int int54 = stackTestDriver52.size();
        stackTestDriver52.clear();
        java.lang.Object obj56 = stackTestDriver48.push((java.lang.Object) stackTestDriver52);
        boolean boolean57 = stackTestDriver48.isEmpty();
        java.lang.Object obj58 = stackTestDriver37.push((java.lang.Object) stackTestDriver48);
        java.lang.Object obj59 = stackTestDriver26.push((java.lang.Object) stackTestDriver37);
        java.lang.Object obj60 = stackTestDriver24.push((java.lang.Object) stackTestDriver37);
        java.lang.Object obj61 = stackTestDriver11.push((java.lang.Object) stackTestDriver24);
        java.lang.Class<?> wildcardClass62 = obj61.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(obj56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(obj58);
        org.junit.Assert.assertNotNull(obj59);
        org.junit.Assert.assertNotNull(obj60);
        org.junit.Assert.assertNotNull(obj61);
        org.junit.Assert.assertNotNull(wildcardClass62);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test105");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver3 = new experiment.util.StackTestDriver();
        int int4 = stackTestDriver3.size();
        int int5 = stackTestDriver3.size();
        stackTestDriver3.clear();
        int int7 = stackTestDriver3.size();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) int7);
        experiment.util.StackTestDriver stackTestDriver9 = new experiment.util.StackTestDriver();
        int int10 = stackTestDriver9.size();
        stackTestDriver9.clear();
        boolean boolean12 = stackTestDriver9.isEmpty();
        experiment.util.StackTestDriver stackTestDriver13 = new experiment.util.StackTestDriver();
        int int14 = stackTestDriver13.size();
        int int15 = stackTestDriver13.size();
        stackTestDriver13.clear();
        java.lang.Object obj17 = stackTestDriver9.push((java.lang.Object) stackTestDriver13);
        boolean boolean18 = stackTestDriver9.isEmpty();
        java.lang.Object obj19 = stackTestDriver9.peek();
        experiment.util.StackTestDriver stackTestDriver20 = new experiment.util.StackTestDriver();
        int int21 = stackTestDriver20.size();
        stackTestDriver20.clear();
        boolean boolean23 = stackTestDriver20.isEmpty();
        experiment.util.StackTestDriver stackTestDriver24 = new experiment.util.StackTestDriver();
        int int25 = stackTestDriver24.size();
        int int26 = stackTestDriver24.size();
        stackTestDriver24.clear();
        java.lang.Object obj28 = stackTestDriver20.push((java.lang.Object) stackTestDriver24);
        boolean boolean29 = stackTestDriver20.isEmpty();
        java.lang.Object obj30 = stackTestDriver9.push((java.lang.Object) stackTestDriver20);
        java.lang.Object obj31 = stackTestDriver0.push((java.lang.Object) stackTestDriver9);
        int int32 = stackTestDriver0.size();
        boolean boolean33 = stackTestDriver0.isEmpty();
        java.lang.Class<?> wildcardClass34 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0 + "'", obj8, 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2 + "'", int32 == 2);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test106");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test107");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        int int4 = stackTestDriver0.size();
        stackTestDriver0.clear();
        int int6 = stackTestDriver0.size();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) (short) 100);
        boolean boolean9 = stackTestDriver0.isEmpty();
        java.lang.Class<?> wildcardClass10 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (short) 100 + "'", obj8, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test108");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        int int6 = stackTestDriver4.size();
        stackTestDriver4.clear();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        boolean boolean9 = stackTestDriver0.isEmpty();
        java.lang.Object obj10 = stackTestDriver0.peek();
        java.lang.Object obj11 = stackTestDriver0.peek();
        java.lang.Object obj12 = stackTestDriver0.peek();
        boolean boolean13 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver14 = new experiment.util.StackTestDriver();
        int int15 = stackTestDriver14.size();
        stackTestDriver14.clear();
        boolean boolean17 = stackTestDriver14.isEmpty();
        experiment.util.StackTestDriver stackTestDriver18 = new experiment.util.StackTestDriver();
        int int19 = stackTestDriver18.size();
        int int20 = stackTestDriver18.size();
        stackTestDriver18.clear();
        java.lang.Object obj22 = stackTestDriver14.push((java.lang.Object) stackTestDriver18);
        stackTestDriver14.clear();
        int int24 = stackTestDriver14.size();
        experiment.util.StackTestDriver stackTestDriver25 = new experiment.util.StackTestDriver();
        int int26 = stackTestDriver25.size();
        stackTestDriver25.clear();
        boolean boolean28 = stackTestDriver25.isEmpty();
        experiment.util.StackTestDriver stackTestDriver29 = new experiment.util.StackTestDriver();
        int int30 = stackTestDriver29.size();
        int int31 = stackTestDriver29.size();
        stackTestDriver29.clear();
        java.lang.Object obj33 = stackTestDriver25.push((java.lang.Object) stackTestDriver29);
        boolean boolean34 = stackTestDriver25.isEmpty();
        java.lang.Object obj35 = stackTestDriver25.peek();
        experiment.util.StackTestDriver stackTestDriver36 = new experiment.util.StackTestDriver();
        int int37 = stackTestDriver36.size();
        stackTestDriver36.clear();
        boolean boolean39 = stackTestDriver36.isEmpty();
        experiment.util.StackTestDriver stackTestDriver40 = new experiment.util.StackTestDriver();
        int int41 = stackTestDriver40.size();
        int int42 = stackTestDriver40.size();
        stackTestDriver40.clear();
        java.lang.Object obj44 = stackTestDriver36.push((java.lang.Object) stackTestDriver40);
        boolean boolean45 = stackTestDriver36.isEmpty();
        java.lang.Object obj46 = stackTestDriver25.push((java.lang.Object) stackTestDriver36);
        java.lang.Object obj47 = stackTestDriver14.push((java.lang.Object) stackTestDriver25);
        experiment.util.StackTestDriver stackTestDriver48 = new experiment.util.StackTestDriver();
        stackTestDriver48.clear();
        stackTestDriver48.clear();
        java.lang.Class<?> wildcardClass51 = stackTestDriver48.getClass();
        java.lang.Object obj52 = stackTestDriver14.push((java.lang.Object) wildcardClass51);
        stackTestDriver14.clear();
        java.lang.Object obj54 = stackTestDriver0.push((java.lang.Object) stackTestDriver14);
        boolean boolean55 = stackTestDriver0.isEmpty();
        java.lang.Object obj56 = stackTestDriver0.pop();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNotNull(obj52);
        org.junit.Assert.assertEquals(obj52.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj52), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj52), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertNotNull(obj54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(obj56);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test109");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        stackTestDriver4.clear();
        boolean boolean7 = stackTestDriver4.isEmpty();
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        int int9 = stackTestDriver8.size();
        int int10 = stackTestDriver8.size();
        stackTestDriver8.clear();
        java.lang.Object obj12 = stackTestDriver4.push((java.lang.Object) stackTestDriver8);
        stackTestDriver4.clear();
        int int14 = stackTestDriver4.size();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        int int16 = stackTestDriver15.size();
        stackTestDriver15.clear();
        boolean boolean18 = stackTestDriver15.isEmpty();
        experiment.util.StackTestDriver stackTestDriver19 = new experiment.util.StackTestDriver();
        int int20 = stackTestDriver19.size();
        int int21 = stackTestDriver19.size();
        stackTestDriver19.clear();
        java.lang.Object obj23 = stackTestDriver15.push((java.lang.Object) stackTestDriver19);
        boolean boolean24 = stackTestDriver15.isEmpty();
        java.lang.Object obj25 = stackTestDriver15.peek();
        experiment.util.StackTestDriver stackTestDriver26 = new experiment.util.StackTestDriver();
        int int27 = stackTestDriver26.size();
        stackTestDriver26.clear();
        boolean boolean29 = stackTestDriver26.isEmpty();
        experiment.util.StackTestDriver stackTestDriver30 = new experiment.util.StackTestDriver();
        int int31 = stackTestDriver30.size();
        int int32 = stackTestDriver30.size();
        stackTestDriver30.clear();
        java.lang.Object obj34 = stackTestDriver26.push((java.lang.Object) stackTestDriver30);
        boolean boolean35 = stackTestDriver26.isEmpty();
        java.lang.Object obj36 = stackTestDriver15.push((java.lang.Object) stackTestDriver26);
        java.lang.Object obj37 = stackTestDriver4.push((java.lang.Object) stackTestDriver15);
        java.lang.Object obj38 = stackTestDriver4.pop();
        java.lang.Object obj39 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        boolean boolean40 = stackTestDriver0.isEmpty();
        java.lang.Object obj41 = stackTestDriver0.peek();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(obj41);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test110");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        int int6 = stackTestDriver4.size();
        stackTestDriver4.clear();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        stackTestDriver0.clear();
        int int10 = stackTestDriver0.size();
        boolean boolean11 = stackTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test111");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        int int6 = stackTestDriver4.size();
        stackTestDriver4.clear();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        boolean boolean9 = stackTestDriver0.isEmpty();
        java.lang.Object obj10 = stackTestDriver0.peek();
        experiment.util.StackTestDriver stackTestDriver11 = new experiment.util.StackTestDriver();
        int int12 = stackTestDriver11.size();
        stackTestDriver11.clear();
        boolean boolean14 = stackTestDriver11.isEmpty();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        int int16 = stackTestDriver15.size();
        int int17 = stackTestDriver15.size();
        stackTestDriver15.clear();
        java.lang.Object obj19 = stackTestDriver11.push((java.lang.Object) stackTestDriver15);
        boolean boolean20 = stackTestDriver11.isEmpty();
        java.lang.Object obj21 = stackTestDriver0.push((java.lang.Object) stackTestDriver11);
        boolean boolean22 = stackTestDriver0.isEmpty();
        boolean boolean23 = stackTestDriver0.isEmpty();
        java.lang.Object obj24 = stackTestDriver0.peek();
        experiment.util.StackTestDriver stackTestDriver25 = new experiment.util.StackTestDriver();
        int int26 = stackTestDriver25.size();
        stackTestDriver25.clear();
        boolean boolean28 = stackTestDriver25.isEmpty();
        experiment.util.StackTestDriver stackTestDriver29 = new experiment.util.StackTestDriver();
        int int30 = stackTestDriver29.size();
        int int31 = stackTestDriver29.size();
        stackTestDriver29.clear();
        java.lang.Object obj33 = stackTestDriver25.push((java.lang.Object) stackTestDriver29);
        stackTestDriver25.clear();
        experiment.util.StackTestDriver stackTestDriver35 = new experiment.util.StackTestDriver();
        int int36 = stackTestDriver35.size();
        int int37 = stackTestDriver35.size();
        int int38 = stackTestDriver35.size();
        java.lang.Object obj39 = stackTestDriver25.push((java.lang.Object) int38);
        java.lang.Object obj40 = stackTestDriver25.pop();
        java.lang.Object obj41 = stackTestDriver0.push((java.lang.Object) stackTestDriver25);
        java.lang.Class<?> wildcardClass42 = obj41.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + 0 + "'", obj39, 0);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + 0 + "'", obj40, 0);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test112");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean5 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        int int7 = stackTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test113");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver3 = new experiment.util.StackTestDriver();
        int int4 = stackTestDriver3.size();
        int int5 = stackTestDriver3.size();
        stackTestDriver3.clear();
        int int7 = stackTestDriver3.size();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) int7);
        experiment.util.StackTestDriver stackTestDriver9 = new experiment.util.StackTestDriver();
        int int10 = stackTestDriver9.size();
        stackTestDriver9.clear();
        boolean boolean12 = stackTestDriver9.isEmpty();
        experiment.util.StackTestDriver stackTestDriver13 = new experiment.util.StackTestDriver();
        int int14 = stackTestDriver13.size();
        int int15 = stackTestDriver13.size();
        stackTestDriver13.clear();
        java.lang.Object obj17 = stackTestDriver9.push((java.lang.Object) stackTestDriver13);
        boolean boolean18 = stackTestDriver9.isEmpty();
        java.lang.Object obj19 = stackTestDriver9.peek();
        experiment.util.StackTestDriver stackTestDriver20 = new experiment.util.StackTestDriver();
        int int21 = stackTestDriver20.size();
        stackTestDriver20.clear();
        boolean boolean23 = stackTestDriver20.isEmpty();
        experiment.util.StackTestDriver stackTestDriver24 = new experiment.util.StackTestDriver();
        int int25 = stackTestDriver24.size();
        int int26 = stackTestDriver24.size();
        stackTestDriver24.clear();
        java.lang.Object obj28 = stackTestDriver20.push((java.lang.Object) stackTestDriver24);
        boolean boolean29 = stackTestDriver20.isEmpty();
        java.lang.Object obj30 = stackTestDriver9.push((java.lang.Object) stackTestDriver20);
        java.lang.Object obj31 = stackTestDriver0.push((java.lang.Object) stackTestDriver9);
        java.lang.Class<?> wildcardClass32 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0 + "'", obj8, 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test114");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        int int4 = stackTestDriver0.size();
        boolean boolean5 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        int int7 = stackTestDriver6.size();
        stackTestDriver6.clear();
        experiment.util.StackTestDriver stackTestDriver9 = new experiment.util.StackTestDriver();
        int int10 = stackTestDriver9.size();
        int int11 = stackTestDriver9.size();
        stackTestDriver9.clear();
        int int13 = stackTestDriver9.size();
        java.lang.Object obj14 = stackTestDriver6.push((java.lang.Object) int13);
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        int int16 = stackTestDriver15.size();
        stackTestDriver15.clear();
        boolean boolean18 = stackTestDriver15.isEmpty();
        experiment.util.StackTestDriver stackTestDriver19 = new experiment.util.StackTestDriver();
        int int20 = stackTestDriver19.size();
        int int21 = stackTestDriver19.size();
        stackTestDriver19.clear();
        java.lang.Object obj23 = stackTestDriver15.push((java.lang.Object) stackTestDriver19);
        boolean boolean24 = stackTestDriver15.isEmpty();
        java.lang.Object obj25 = stackTestDriver15.peek();
        experiment.util.StackTestDriver stackTestDriver26 = new experiment.util.StackTestDriver();
        int int27 = stackTestDriver26.size();
        stackTestDriver26.clear();
        boolean boolean29 = stackTestDriver26.isEmpty();
        experiment.util.StackTestDriver stackTestDriver30 = new experiment.util.StackTestDriver();
        int int31 = stackTestDriver30.size();
        int int32 = stackTestDriver30.size();
        stackTestDriver30.clear();
        java.lang.Object obj34 = stackTestDriver26.push((java.lang.Object) stackTestDriver30);
        boolean boolean35 = stackTestDriver26.isEmpty();
        java.lang.Object obj36 = stackTestDriver15.push((java.lang.Object) stackTestDriver26);
        java.lang.Object obj37 = stackTestDriver6.push((java.lang.Object) stackTestDriver15);
        java.lang.Object obj38 = stackTestDriver0.push((java.lang.Object) stackTestDriver6);
        stackTestDriver6.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 0 + "'", obj14, 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertNotNull(obj38);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test115");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        int int6 = stackTestDriver4.size();
        stackTestDriver4.clear();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        boolean boolean9 = stackTestDriver0.isEmpty();
        java.lang.Object obj10 = stackTestDriver0.peek();
        experiment.util.StackTestDriver stackTestDriver11 = new experiment.util.StackTestDriver();
        int int12 = stackTestDriver11.size();
        stackTestDriver11.clear();
        boolean boolean14 = stackTestDriver11.isEmpty();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        int int16 = stackTestDriver15.size();
        int int17 = stackTestDriver15.size();
        stackTestDriver15.clear();
        java.lang.Object obj19 = stackTestDriver11.push((java.lang.Object) stackTestDriver15);
        boolean boolean20 = stackTestDriver11.isEmpty();
        java.lang.Object obj21 = stackTestDriver0.push((java.lang.Object) stackTestDriver11);
        boolean boolean22 = stackTestDriver0.isEmpty();
        java.lang.Object obj23 = stackTestDriver0.peek();
        java.lang.Class<?> wildcardClass24 = obj23.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test116");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        int int6 = stackTestDriver4.size();
        stackTestDriver4.clear();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        stackTestDriver0.clear();
        int int10 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver11 = new experiment.util.StackTestDriver();
        int int12 = stackTestDriver11.size();
        stackTestDriver11.clear();
        boolean boolean14 = stackTestDriver11.isEmpty();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        int int16 = stackTestDriver15.size();
        int int17 = stackTestDriver15.size();
        stackTestDriver15.clear();
        java.lang.Object obj19 = stackTestDriver11.push((java.lang.Object) stackTestDriver15);
        boolean boolean20 = stackTestDriver11.isEmpty();
        java.lang.Object obj21 = stackTestDriver11.peek();
        experiment.util.StackTestDriver stackTestDriver22 = new experiment.util.StackTestDriver();
        int int23 = stackTestDriver22.size();
        stackTestDriver22.clear();
        boolean boolean25 = stackTestDriver22.isEmpty();
        experiment.util.StackTestDriver stackTestDriver26 = new experiment.util.StackTestDriver();
        int int27 = stackTestDriver26.size();
        int int28 = stackTestDriver26.size();
        stackTestDriver26.clear();
        java.lang.Object obj30 = stackTestDriver22.push((java.lang.Object) stackTestDriver26);
        boolean boolean31 = stackTestDriver22.isEmpty();
        java.lang.Object obj32 = stackTestDriver11.push((java.lang.Object) stackTestDriver22);
        java.lang.Object obj33 = stackTestDriver0.push((java.lang.Object) stackTestDriver11);
        experiment.util.StackTestDriver stackTestDriver34 = new experiment.util.StackTestDriver();
        stackTestDriver34.clear();
        stackTestDriver34.clear();
        java.lang.Class<?> wildcardClass37 = stackTestDriver34.getClass();
        java.lang.Object obj38 = stackTestDriver0.push((java.lang.Object) wildcardClass37);
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver40 = new experiment.util.StackTestDriver();
        int int41 = stackTestDriver40.size();
        int int42 = stackTestDriver40.size();
        boolean boolean43 = stackTestDriver40.isEmpty();
        int int44 = stackTestDriver40.size();
        stackTestDriver40.clear();
        experiment.util.StackTestDriver stackTestDriver46 = new experiment.util.StackTestDriver();
        int int47 = stackTestDriver46.size();
        stackTestDriver46.clear();
        boolean boolean49 = stackTestDriver46.isEmpty();
        experiment.util.StackTestDriver stackTestDriver50 = new experiment.util.StackTestDriver();
        int int51 = stackTestDriver50.size();
        int int52 = stackTestDriver50.size();
        stackTestDriver50.clear();
        java.lang.Object obj54 = stackTestDriver46.push((java.lang.Object) stackTestDriver50);
        stackTestDriver46.clear();
        int int56 = stackTestDriver46.size();
        experiment.util.StackTestDriver stackTestDriver57 = new experiment.util.StackTestDriver();
        int int58 = stackTestDriver57.size();
        stackTestDriver57.clear();
        boolean boolean60 = stackTestDriver57.isEmpty();
        experiment.util.StackTestDriver stackTestDriver61 = new experiment.util.StackTestDriver();
        int int62 = stackTestDriver61.size();
        int int63 = stackTestDriver61.size();
        stackTestDriver61.clear();
        java.lang.Object obj65 = stackTestDriver57.push((java.lang.Object) stackTestDriver61);
        boolean boolean66 = stackTestDriver57.isEmpty();
        java.lang.Object obj67 = stackTestDriver57.peek();
        experiment.util.StackTestDriver stackTestDriver68 = new experiment.util.StackTestDriver();
        int int69 = stackTestDriver68.size();
        stackTestDriver68.clear();
        boolean boolean71 = stackTestDriver68.isEmpty();
        experiment.util.StackTestDriver stackTestDriver72 = new experiment.util.StackTestDriver();
        int int73 = stackTestDriver72.size();
        int int74 = stackTestDriver72.size();
        stackTestDriver72.clear();
        java.lang.Object obj76 = stackTestDriver68.push((java.lang.Object) stackTestDriver72);
        boolean boolean77 = stackTestDriver68.isEmpty();
        java.lang.Object obj78 = stackTestDriver57.push((java.lang.Object) stackTestDriver68);
        java.lang.Object obj79 = stackTestDriver46.push((java.lang.Object) stackTestDriver57);
        java.lang.Object obj80 = stackTestDriver46.pop();
        java.lang.Object obj81 = stackTestDriver40.push(obj80);
        java.lang.Object obj82 = stackTestDriver0.push((java.lang.Object) stackTestDriver40);
        java.lang.Class<?> wildcardClass83 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertEquals(obj38.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj38), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj38), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(obj54);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNotNull(obj65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(obj67);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertNotNull(obj76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(obj78);
        org.junit.Assert.assertNotNull(obj79);
        org.junit.Assert.assertNotNull(obj80);
        org.junit.Assert.assertNotNull(obj81);
        org.junit.Assert.assertNotNull(obj82);
        org.junit.Assert.assertNotNull(wildcardClass83);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test117");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        int int2 = stackTestDriver0.size();
        stackTestDriver0.clear();
        int int4 = stackTestDriver0.size();
        int int5 = stackTestDriver0.size();
        boolean boolean6 = stackTestDriver0.isEmpty();
        boolean boolean7 = stackTestDriver0.isEmpty();
        boolean boolean8 = stackTestDriver0.isEmpty();
        boolean boolean9 = stackTestDriver0.isEmpty();
        java.lang.Class<?> wildcardClass10 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test118");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        int int4 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        int int6 = stackTestDriver5.size();
        stackTestDriver5.clear();
        boolean boolean8 = stackTestDriver5.isEmpty();
        boolean boolean9 = stackTestDriver5.isEmpty();
        java.lang.Object obj10 = stackTestDriver0.push((java.lang.Object) boolean9);
        java.lang.Object obj11 = stackTestDriver0.pop();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + true + "'", obj10, true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + true + "'", obj11, true);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test119");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        java.lang.Object obj3 = stackTestDriver0.push((java.lang.Object) (short) 0);
        int int4 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        int int6 = stackTestDriver5.size();
        stackTestDriver5.clear();
        boolean boolean8 = stackTestDriver5.isEmpty();
        boolean boolean9 = stackTestDriver5.isEmpty();
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        int int11 = stackTestDriver10.size();
        stackTestDriver10.clear();
        boolean boolean13 = stackTestDriver10.isEmpty();
        experiment.util.StackTestDriver stackTestDriver14 = new experiment.util.StackTestDriver();
        int int15 = stackTestDriver14.size();
        int int16 = stackTestDriver14.size();
        stackTestDriver14.clear();
        java.lang.Object obj18 = stackTestDriver10.push((java.lang.Object) stackTestDriver14);
        boolean boolean19 = stackTestDriver10.isEmpty();
        java.lang.Object obj20 = stackTestDriver5.push((java.lang.Object) boolean19);
        java.lang.Object obj21 = stackTestDriver5.pop();
        java.lang.Object obj22 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        java.lang.Class<?> wildcardClass23 = stackTestDriver5.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (short) 0 + "'", obj3, (short) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + false + "'", obj20, false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + false + "'", obj21, false);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test120");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        java.lang.Object obj3 = stackTestDriver0.push((java.lang.Object) (short) 0);
        int int4 = stackTestDriver0.size();
        int int5 = stackTestDriver0.size();
        java.lang.Class<?> wildcardClass6 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (short) 0 + "'", obj3, (short) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test121");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver3 = new experiment.util.StackTestDriver();
        int int4 = stackTestDriver3.size();
        int int5 = stackTestDriver3.size();
        stackTestDriver3.clear();
        int int7 = stackTestDriver3.size();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) int7);
        int int9 = stackTestDriver0.size();
        boolean boolean10 = stackTestDriver0.isEmpty();
        java.lang.Object obj11 = stackTestDriver0.peek();
        java.lang.Class<?> wildcardClass12 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0 + "'", obj8, 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 0 + "'", obj11, 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test122");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        int int6 = stackTestDriver4.size();
        stackTestDriver4.clear();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        boolean boolean9 = stackTestDriver0.isEmpty();
        java.lang.Object obj10 = stackTestDriver0.peek();
        int int11 = stackTestDriver0.size();
        java.lang.Object obj12 = stackTestDriver0.peek();
        experiment.util.StackTestDriver stackTestDriver13 = new experiment.util.StackTestDriver();
        int int14 = stackTestDriver13.size();
        int int15 = stackTestDriver13.size();
        boolean boolean16 = stackTestDriver13.isEmpty();
        java.lang.Object obj17 = stackTestDriver0.push((java.lang.Object) stackTestDriver13);
        boolean boolean18 = stackTestDriver0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test123");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        int int6 = stackTestDriver4.size();
        int int7 = stackTestDriver4.size();
        boolean boolean8 = stackTestDriver4.isEmpty();
        boolean boolean9 = stackTestDriver4.isEmpty();
        boolean boolean10 = stackTestDriver4.isEmpty();
        java.lang.Object obj11 = stackTestDriver0.push((java.lang.Object) boolean10);
        java.lang.Class<?> wildcardClass12 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + true + "'", obj11, true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test124");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        java.lang.Object obj3 = stackTestDriver0.push((java.lang.Object) (short) 0);
        int int4 = stackTestDriver0.size();
        boolean boolean5 = stackTestDriver0.isEmpty();
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) (-1.0d));
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        stackTestDriver8.clear();
        java.lang.Object obj11 = stackTestDriver8.push((java.lang.Object) (short) 0);
        int int12 = stackTestDriver8.size();
        boolean boolean13 = stackTestDriver8.isEmpty();
        java.lang.Object obj14 = stackTestDriver0.push((java.lang.Object) stackTestDriver8);
        boolean boolean15 = stackTestDriver0.isEmpty();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (short) 0 + "'", obj3, (short) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (short) 0 + "'", obj11, (short) 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test125");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        java.lang.Object obj3 = stackTestDriver0.push((java.lang.Object) (short) 0);
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) 100);
        int int6 = stackTestDriver0.size();
        java.lang.Object obj7 = stackTestDriver0.peek();
        java.lang.Object obj8 = stackTestDriver0.peek();
        boolean boolean9 = stackTestDriver0.isEmpty();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (short) 0 + "'", obj3, (short) 0);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100 + "'", obj5, 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 100 + "'", obj7, 100);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 100 + "'", obj8, 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test126");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        int int6 = stackTestDriver4.size();
        stackTestDriver4.clear();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        stackTestDriver0.clear();
        java.lang.Object obj11 = stackTestDriver0.push((java.lang.Object) 10L);
        java.lang.Object obj12 = stackTestDriver0.peek();
        java.lang.Object obj13 = stackTestDriver0.peek();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 10L + "'", obj11, 10L);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 10L + "'", obj12, 10L);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 10L + "'", obj13, 10L);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test127");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        stackTestDriver0.clear();
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
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test128");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        int int2 = stackTestDriver0.size();
        stackTestDriver0.clear();
        int int4 = stackTestDriver0.size();
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
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test129");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        int int6 = stackTestDriver4.size();
        stackTestDriver4.clear();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        boolean boolean9 = stackTestDriver0.isEmpty();
        java.lang.Object obj10 = stackTestDriver0.peek();
        int int11 = stackTestDriver0.size();
        boolean boolean12 = stackTestDriver0.isEmpty();
        int int13 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver14 = new experiment.util.StackTestDriver();
        int int15 = stackTestDriver14.size();
        int int16 = stackTestDriver14.size();
        boolean boolean17 = stackTestDriver14.isEmpty();
        int int18 = stackTestDriver14.size();
        stackTestDriver14.clear();
        java.lang.Class<?> wildcardClass20 = stackTestDriver14.getClass();
        java.lang.Object obj21 = stackTestDriver0.push((java.lang.Object) stackTestDriver14);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(obj21);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test130");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        int int4 = stackTestDriver0.size();
        boolean boolean5 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        int int7 = stackTestDriver6.size();
        int int8 = stackTestDriver6.size();
        int int9 = stackTestDriver6.size();
        boolean boolean10 = stackTestDriver6.isEmpty();
        java.lang.Object obj11 = stackTestDriver0.push((java.lang.Object) stackTestDriver6);
        java.lang.Object obj12 = stackTestDriver0.peek();
        int int13 = stackTestDriver0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test131");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        int int2 = stackTestDriver0.size();
        boolean boolean3 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        stackTestDriver4.clear();
        boolean boolean7 = stackTestDriver4.isEmpty();
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        int int9 = stackTestDriver8.size();
        int int10 = stackTestDriver8.size();
        stackTestDriver8.clear();
        java.lang.Object obj12 = stackTestDriver4.push((java.lang.Object) stackTestDriver8);
        stackTestDriver4.clear();
        int int14 = stackTestDriver4.size();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        int int16 = stackTestDriver15.size();
        int int17 = stackTestDriver15.size();
        int int18 = stackTestDriver15.size();
        experiment.util.StackTestDriver stackTestDriver19 = new experiment.util.StackTestDriver();
        int int20 = stackTestDriver19.size();
        stackTestDriver19.clear();
        boolean boolean22 = stackTestDriver19.isEmpty();
        experiment.util.StackTestDriver stackTestDriver23 = new experiment.util.StackTestDriver();
        int int24 = stackTestDriver23.size();
        int int25 = stackTestDriver23.size();
        stackTestDriver23.clear();
        java.lang.Object obj27 = stackTestDriver19.push((java.lang.Object) stackTestDriver23);
        stackTestDriver19.clear();
        int int29 = stackTestDriver19.size();
        experiment.util.StackTestDriver stackTestDriver30 = new experiment.util.StackTestDriver();
        int int31 = stackTestDriver30.size();
        stackTestDriver30.clear();
        boolean boolean33 = stackTestDriver30.isEmpty();
        experiment.util.StackTestDriver stackTestDriver34 = new experiment.util.StackTestDriver();
        int int35 = stackTestDriver34.size();
        int int36 = stackTestDriver34.size();
        stackTestDriver34.clear();
        java.lang.Object obj38 = stackTestDriver30.push((java.lang.Object) stackTestDriver34);
        boolean boolean39 = stackTestDriver30.isEmpty();
        java.lang.Object obj40 = stackTestDriver30.peek();
        experiment.util.StackTestDriver stackTestDriver41 = new experiment.util.StackTestDriver();
        int int42 = stackTestDriver41.size();
        stackTestDriver41.clear();
        boolean boolean44 = stackTestDriver41.isEmpty();
        experiment.util.StackTestDriver stackTestDriver45 = new experiment.util.StackTestDriver();
        int int46 = stackTestDriver45.size();
        int int47 = stackTestDriver45.size();
        stackTestDriver45.clear();
        java.lang.Object obj49 = stackTestDriver41.push((java.lang.Object) stackTestDriver45);
        boolean boolean50 = stackTestDriver41.isEmpty();
        java.lang.Object obj51 = stackTestDriver30.push((java.lang.Object) stackTestDriver41);
        java.lang.Object obj52 = stackTestDriver19.push((java.lang.Object) stackTestDriver30);
        java.lang.Object obj53 = stackTestDriver19.pop();
        java.lang.Object obj54 = stackTestDriver15.push((java.lang.Object) stackTestDriver19);
        java.lang.Object obj55 = stackTestDriver4.push((java.lang.Object) stackTestDriver19);
        int int56 = stackTestDriver4.size();
        boolean boolean57 = stackTestDriver4.isEmpty();
        java.lang.Object obj58 = stackTestDriver0.push((java.lang.Object) boolean57);
        java.lang.Class<?> wildcardClass59 = obj58.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(obj51);
        org.junit.Assert.assertNotNull(obj52);
        org.junit.Assert.assertNotNull(obj53);
        org.junit.Assert.assertNotNull(obj54);
        org.junit.Assert.assertNotNull(obj55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertEquals("'" + obj58 + "' != '" + false + "'", obj58, false);
        org.junit.Assert.assertNotNull(wildcardClass59);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test132");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        int int4 = stackTestDriver0.size();
        boolean boolean5 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        int int7 = stackTestDriver6.size();
        int int8 = stackTestDriver6.size();
        int int9 = stackTestDriver6.size();
        boolean boolean10 = stackTestDriver6.isEmpty();
        java.lang.Object obj11 = stackTestDriver0.push((java.lang.Object) stackTestDriver6);
        java.lang.Object obj12 = stackTestDriver0.peek();
        java.lang.Object obj13 = stackTestDriver0.pop();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test133");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        java.lang.Object obj3 = stackTestDriver0.push((java.lang.Object) (short) 0);
        int int4 = stackTestDriver0.size();
        boolean boolean5 = stackTestDriver0.isEmpty();
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) (-1.0d));
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        stackTestDriver8.clear();
        java.lang.Object obj11 = stackTestDriver8.push((java.lang.Object) (short) 0);
        int int12 = stackTestDriver8.size();
        boolean boolean13 = stackTestDriver8.isEmpty();
        java.lang.Object obj14 = stackTestDriver0.push((java.lang.Object) stackTestDriver8);
        java.lang.Object obj15 = stackTestDriver8.peek();
        experiment.util.StackTestDriver stackTestDriver16 = new experiment.util.StackTestDriver();
        int int17 = stackTestDriver16.size();
        stackTestDriver16.clear();
        boolean boolean19 = stackTestDriver16.isEmpty();
        int int20 = stackTestDriver16.size();
        boolean boolean21 = stackTestDriver16.isEmpty();
        experiment.util.StackTestDriver stackTestDriver22 = new experiment.util.StackTestDriver();
        stackTestDriver22.clear();
        stackTestDriver22.clear();
        java.lang.Object obj26 = stackTestDriver22.push((java.lang.Object) 1L);
        java.lang.Object obj27 = stackTestDriver16.push((java.lang.Object) stackTestDriver22);
        java.lang.Object obj28 = stackTestDriver16.peek();
        java.lang.Object obj29 = stackTestDriver8.push(obj28);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (short) 0 + "'", obj3, (short) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (short) 0 + "'", obj11, (short) 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (short) 0 + "'", obj15, (short) 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 1L + "'", obj26, 1L);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertNotNull(obj29);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test134");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        java.lang.Object obj3 = stackTestDriver0.push((java.lang.Object) (short) 0);
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) 100);
        int int6 = stackTestDriver0.size();
        int int7 = stackTestDriver0.size();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (short) 0 + "'", obj3, (short) 0);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100 + "'", obj5, 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test135");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        int int6 = stackTestDriver4.size();
        stackTestDriver4.clear();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        stackTestDriver0.clear();
        int int10 = stackTestDriver0.size();
        boolean boolean11 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test136");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        int int6 = stackTestDriver4.size();
        stackTestDriver4.clear();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        boolean boolean9 = stackTestDriver0.isEmpty();
        java.lang.Object obj10 = stackTestDriver0.peek();
        java.lang.Object obj11 = stackTestDriver0.peek();
        java.lang.Object obj12 = stackTestDriver0.peek();
        boolean boolean13 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver14 = new experiment.util.StackTestDriver();
        int int15 = stackTestDriver14.size();
        stackTestDriver14.clear();
        boolean boolean17 = stackTestDriver14.isEmpty();
        experiment.util.StackTestDriver stackTestDriver18 = new experiment.util.StackTestDriver();
        int int19 = stackTestDriver18.size();
        int int20 = stackTestDriver18.size();
        stackTestDriver18.clear();
        java.lang.Object obj22 = stackTestDriver14.push((java.lang.Object) stackTestDriver18);
        stackTestDriver14.clear();
        int int24 = stackTestDriver14.size();
        experiment.util.StackTestDriver stackTestDriver25 = new experiment.util.StackTestDriver();
        int int26 = stackTestDriver25.size();
        stackTestDriver25.clear();
        boolean boolean28 = stackTestDriver25.isEmpty();
        experiment.util.StackTestDriver stackTestDriver29 = new experiment.util.StackTestDriver();
        int int30 = stackTestDriver29.size();
        int int31 = stackTestDriver29.size();
        stackTestDriver29.clear();
        java.lang.Object obj33 = stackTestDriver25.push((java.lang.Object) stackTestDriver29);
        boolean boolean34 = stackTestDriver25.isEmpty();
        java.lang.Object obj35 = stackTestDriver25.peek();
        experiment.util.StackTestDriver stackTestDriver36 = new experiment.util.StackTestDriver();
        int int37 = stackTestDriver36.size();
        stackTestDriver36.clear();
        boolean boolean39 = stackTestDriver36.isEmpty();
        experiment.util.StackTestDriver stackTestDriver40 = new experiment.util.StackTestDriver();
        int int41 = stackTestDriver40.size();
        int int42 = stackTestDriver40.size();
        stackTestDriver40.clear();
        java.lang.Object obj44 = stackTestDriver36.push((java.lang.Object) stackTestDriver40);
        boolean boolean45 = stackTestDriver36.isEmpty();
        java.lang.Object obj46 = stackTestDriver25.push((java.lang.Object) stackTestDriver36);
        java.lang.Object obj47 = stackTestDriver14.push((java.lang.Object) stackTestDriver25);
        experiment.util.StackTestDriver stackTestDriver48 = new experiment.util.StackTestDriver();
        stackTestDriver48.clear();
        stackTestDriver48.clear();
        java.lang.Class<?> wildcardClass51 = stackTestDriver48.getClass();
        java.lang.Object obj52 = stackTestDriver14.push((java.lang.Object) wildcardClass51);
        stackTestDriver14.clear();
        java.lang.Object obj54 = stackTestDriver0.push((java.lang.Object) stackTestDriver14);
        stackTestDriver0.clear();
        boolean boolean56 = stackTestDriver0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNotNull(obj52);
        org.junit.Assert.assertEquals(obj52.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj52), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj52), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertNotNull(obj54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test137");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        int int4 = stackTestDriver0.size();
        boolean boolean5 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        int int7 = stackTestDriver6.size();
        int int8 = stackTestDriver6.size();
        int int9 = stackTestDriver6.size();
        boolean boolean10 = stackTestDriver6.isEmpty();
        java.lang.Object obj11 = stackTestDriver0.push((java.lang.Object) stackTestDriver6);
        java.lang.Object obj12 = stackTestDriver0.peek();
        java.lang.Class<?> wildcardClass13 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test138");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver3 = new experiment.util.StackTestDriver();
        int int4 = stackTestDriver3.size();
        int int5 = stackTestDriver3.size();
        stackTestDriver3.clear();
        int int7 = stackTestDriver3.size();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) int7);
        int int9 = stackTestDriver0.size();
        java.lang.Object obj10 = stackTestDriver0.peek();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0 + "'", obj8, 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 0 + "'", obj10, 0);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test139");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        java.lang.Object obj3 = stackTestDriver0.push((java.lang.Object) (short) 0);
        boolean boolean4 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        int int6 = stackTestDriver5.size();
        stackTestDriver5.clear();
        boolean boolean8 = stackTestDriver5.isEmpty();
        experiment.util.StackTestDriver stackTestDriver9 = new experiment.util.StackTestDriver();
        int int10 = stackTestDriver9.size();
        int int11 = stackTestDriver9.size();
        stackTestDriver9.clear();
        java.lang.Object obj13 = stackTestDriver5.push((java.lang.Object) stackTestDriver9);
        boolean boolean14 = stackTestDriver5.isEmpty();
        java.lang.Object obj15 = stackTestDriver5.peek();
        java.lang.Object obj16 = stackTestDriver5.peek();
        java.lang.Object obj17 = stackTestDriver5.peek();
        java.lang.Object obj18 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        java.lang.Class<?> wildcardClass19 = obj18.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (short) 0 + "'", obj3, (short) 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test140");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        int int6 = stackTestDriver4.size();
        stackTestDriver4.clear();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        boolean boolean9 = stackTestDriver0.isEmpty();
        java.lang.Object obj10 = stackTestDriver0.peek();
        int int11 = stackTestDriver0.size();
        java.lang.Object obj12 = stackTestDriver0.peek();
        experiment.util.StackTestDriver stackTestDriver13 = new experiment.util.StackTestDriver();
        int int14 = stackTestDriver13.size();
        int int15 = stackTestDriver13.size();
        boolean boolean16 = stackTestDriver13.isEmpty();
        java.lang.Object obj17 = stackTestDriver0.push((java.lang.Object) stackTestDriver13);
        int int18 = stackTestDriver13.size();
        stackTestDriver13.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = stackTestDriver13.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test141");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        int int6 = stackTestDriver4.size();
        stackTestDriver4.clear();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        boolean boolean9 = stackTestDriver0.isEmpty();
        java.lang.Object obj10 = stackTestDriver0.peek();
        int int11 = stackTestDriver0.size();
        java.lang.Object obj12 = stackTestDriver0.peek();
        experiment.util.StackTestDriver stackTestDriver13 = new experiment.util.StackTestDriver();
        int int14 = stackTestDriver13.size();
        int int15 = stackTestDriver13.size();
        boolean boolean16 = stackTestDriver13.isEmpty();
        java.lang.Object obj17 = stackTestDriver0.push((java.lang.Object) stackTestDriver13);
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test142");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        boolean boolean4 = stackTestDriver0.isEmpty();
        boolean boolean5 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        stackTestDriver6.clear();
        stackTestDriver6.clear();
        stackTestDriver6.clear();
        java.lang.Object obj10 = stackTestDriver0.push((java.lang.Object) stackTestDriver6);
        stackTestDriver6.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = stackTestDriver6.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test143");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        int int6 = stackTestDriver4.size();
        stackTestDriver4.clear();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        stackTestDriver0.clear();
        java.lang.Object obj11 = stackTestDriver0.push((java.lang.Object) 10L);
        boolean boolean12 = stackTestDriver0.isEmpty();
        boolean boolean13 = stackTestDriver0.isEmpty();
        boolean boolean14 = stackTestDriver0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 10L + "'", obj11, 10L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test144");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        int int6 = stackTestDriver4.size();
        stackTestDriver4.clear();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        stackTestDriver0.clear();
        int int10 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver11 = new experiment.util.StackTestDriver();
        int int12 = stackTestDriver11.size();
        int int13 = stackTestDriver11.size();
        int int14 = stackTestDriver11.size();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        int int16 = stackTestDriver15.size();
        stackTestDriver15.clear();
        boolean boolean18 = stackTestDriver15.isEmpty();
        experiment.util.StackTestDriver stackTestDriver19 = new experiment.util.StackTestDriver();
        int int20 = stackTestDriver19.size();
        int int21 = stackTestDriver19.size();
        stackTestDriver19.clear();
        java.lang.Object obj23 = stackTestDriver15.push((java.lang.Object) stackTestDriver19);
        stackTestDriver15.clear();
        int int25 = stackTestDriver15.size();
        experiment.util.StackTestDriver stackTestDriver26 = new experiment.util.StackTestDriver();
        int int27 = stackTestDriver26.size();
        stackTestDriver26.clear();
        boolean boolean29 = stackTestDriver26.isEmpty();
        experiment.util.StackTestDriver stackTestDriver30 = new experiment.util.StackTestDriver();
        int int31 = stackTestDriver30.size();
        int int32 = stackTestDriver30.size();
        stackTestDriver30.clear();
        java.lang.Object obj34 = stackTestDriver26.push((java.lang.Object) stackTestDriver30);
        boolean boolean35 = stackTestDriver26.isEmpty();
        java.lang.Object obj36 = stackTestDriver26.peek();
        experiment.util.StackTestDriver stackTestDriver37 = new experiment.util.StackTestDriver();
        int int38 = stackTestDriver37.size();
        stackTestDriver37.clear();
        boolean boolean40 = stackTestDriver37.isEmpty();
        experiment.util.StackTestDriver stackTestDriver41 = new experiment.util.StackTestDriver();
        int int42 = stackTestDriver41.size();
        int int43 = stackTestDriver41.size();
        stackTestDriver41.clear();
        java.lang.Object obj45 = stackTestDriver37.push((java.lang.Object) stackTestDriver41);
        boolean boolean46 = stackTestDriver37.isEmpty();
        java.lang.Object obj47 = stackTestDriver26.push((java.lang.Object) stackTestDriver37);
        java.lang.Object obj48 = stackTestDriver15.push((java.lang.Object) stackTestDriver26);
        java.lang.Object obj49 = stackTestDriver15.pop();
        java.lang.Object obj50 = stackTestDriver11.push((java.lang.Object) stackTestDriver15);
        java.lang.Object obj51 = stackTestDriver0.push((java.lang.Object) stackTestDriver15);
        java.lang.Object obj52 = stackTestDriver0.peek();
        int int53 = stackTestDriver0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertNotNull(obj50);
        org.junit.Assert.assertNotNull(obj51);
        org.junit.Assert.assertNotNull(obj52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test145");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        stackTestDriver4.clear();
        boolean boolean7 = stackTestDriver4.isEmpty();
        boolean boolean8 = stackTestDriver4.isEmpty();
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) boolean8);
        boolean boolean10 = stackTestDriver0.isEmpty();
        java.lang.Object obj11 = stackTestDriver0.peek();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + true + "'", obj9, true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + true + "'", obj11, true);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test146");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        stackTestDriver4.clear();
        boolean boolean7 = stackTestDriver4.isEmpty();
        boolean boolean8 = stackTestDriver4.isEmpty();
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) boolean8);
        java.lang.Object obj11 = stackTestDriver0.push((java.lang.Object) (byte) 100);
        java.lang.Class<?> wildcardClass12 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + true + "'", obj9, true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 100 + "'", obj11, (byte) 100);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test147");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        boolean boolean4 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        int int6 = stackTestDriver5.size();
        stackTestDriver5.clear();
        boolean boolean8 = stackTestDriver5.isEmpty();
        experiment.util.StackTestDriver stackTestDriver9 = new experiment.util.StackTestDriver();
        int int10 = stackTestDriver9.size();
        int int11 = stackTestDriver9.size();
        stackTestDriver9.clear();
        java.lang.Object obj13 = stackTestDriver5.push((java.lang.Object) stackTestDriver9);
        boolean boolean14 = stackTestDriver5.isEmpty();
        java.lang.Object obj15 = stackTestDriver0.push((java.lang.Object) boolean14);
        int int16 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver17 = new experiment.util.StackTestDriver();
        int int18 = stackTestDriver17.size();
        stackTestDriver17.clear();
        boolean boolean20 = stackTestDriver17.isEmpty();
        experiment.util.StackTestDriver stackTestDriver21 = new experiment.util.StackTestDriver();
        int int22 = stackTestDriver21.size();
        int int23 = stackTestDriver21.size();
        stackTestDriver21.clear();
        java.lang.Object obj25 = stackTestDriver17.push((java.lang.Object) stackTestDriver21);
        boolean boolean26 = stackTestDriver17.isEmpty();
        java.lang.Object obj27 = stackTestDriver17.peek();
        java.lang.Object obj28 = stackTestDriver0.push(obj27);
        java.lang.Class<?> wildcardClass29 = obj27.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + false + "'", obj15, false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test148");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        int int2 = stackTestDriver0.size();
        stackTestDriver0.clear();
        int int4 = stackTestDriver0.size();
        int int5 = stackTestDriver0.size();
        boolean boolean6 = stackTestDriver0.isEmpty();
        boolean boolean7 = stackTestDriver0.isEmpty();
        boolean boolean8 = stackTestDriver0.isEmpty();
        boolean boolean9 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test149");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        int int6 = stackTestDriver4.size();
        stackTestDriver4.clear();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        boolean boolean9 = stackTestDriver0.isEmpty();
        java.lang.Object obj10 = stackTestDriver0.peek();
        java.lang.Object obj11 = stackTestDriver0.peek();
        java.lang.Object obj12 = stackTestDriver0.peek();
        boolean boolean13 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver14 = new experiment.util.StackTestDriver();
        int int15 = stackTestDriver14.size();
        stackTestDriver14.clear();
        boolean boolean17 = stackTestDriver14.isEmpty();
        experiment.util.StackTestDriver stackTestDriver18 = new experiment.util.StackTestDriver();
        int int19 = stackTestDriver18.size();
        int int20 = stackTestDriver18.size();
        stackTestDriver18.clear();
        java.lang.Object obj22 = stackTestDriver14.push((java.lang.Object) stackTestDriver18);
        stackTestDriver14.clear();
        int int24 = stackTestDriver14.size();
        experiment.util.StackTestDriver stackTestDriver25 = new experiment.util.StackTestDriver();
        int int26 = stackTestDriver25.size();
        stackTestDriver25.clear();
        boolean boolean28 = stackTestDriver25.isEmpty();
        experiment.util.StackTestDriver stackTestDriver29 = new experiment.util.StackTestDriver();
        int int30 = stackTestDriver29.size();
        int int31 = stackTestDriver29.size();
        stackTestDriver29.clear();
        java.lang.Object obj33 = stackTestDriver25.push((java.lang.Object) stackTestDriver29);
        boolean boolean34 = stackTestDriver25.isEmpty();
        java.lang.Object obj35 = stackTestDriver25.peek();
        experiment.util.StackTestDriver stackTestDriver36 = new experiment.util.StackTestDriver();
        int int37 = stackTestDriver36.size();
        stackTestDriver36.clear();
        boolean boolean39 = stackTestDriver36.isEmpty();
        experiment.util.StackTestDriver stackTestDriver40 = new experiment.util.StackTestDriver();
        int int41 = stackTestDriver40.size();
        int int42 = stackTestDriver40.size();
        stackTestDriver40.clear();
        java.lang.Object obj44 = stackTestDriver36.push((java.lang.Object) stackTestDriver40);
        boolean boolean45 = stackTestDriver36.isEmpty();
        java.lang.Object obj46 = stackTestDriver25.push((java.lang.Object) stackTestDriver36);
        java.lang.Object obj47 = stackTestDriver14.push((java.lang.Object) stackTestDriver25);
        experiment.util.StackTestDriver stackTestDriver48 = new experiment.util.StackTestDriver();
        stackTestDriver48.clear();
        stackTestDriver48.clear();
        java.lang.Class<?> wildcardClass51 = stackTestDriver48.getClass();
        java.lang.Object obj52 = stackTestDriver14.push((java.lang.Object) wildcardClass51);
        stackTestDriver14.clear();
        java.lang.Object obj54 = stackTestDriver0.push((java.lang.Object) stackTestDriver14);
        int int55 = stackTestDriver14.size();
        int int56 = stackTestDriver14.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNotNull(obj52);
        org.junit.Assert.assertEquals(obj52.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj52), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj52), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertNotNull(obj54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test150");
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
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test151");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean5 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        int int7 = stackTestDriver6.size();
        stackTestDriver6.clear();
        boolean boolean9 = stackTestDriver6.isEmpty();
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        int int11 = stackTestDriver10.size();
        int int12 = stackTestDriver10.size();
        stackTestDriver10.clear();
        java.lang.Object obj14 = stackTestDriver6.push((java.lang.Object) stackTestDriver10);
        boolean boolean15 = stackTestDriver6.isEmpty();
        java.lang.Object obj16 = stackTestDriver0.push((java.lang.Object) boolean15);
        java.lang.Object obj17 = stackTestDriver0.peek();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + false + "'", obj16, false);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + false + "'", obj17, false);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test152");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver3 = new experiment.util.StackTestDriver();
        int int4 = stackTestDriver3.size();
        int int5 = stackTestDriver3.size();
        stackTestDriver3.clear();
        int int7 = stackTestDriver3.size();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) int7);
        experiment.util.StackTestDriver stackTestDriver9 = new experiment.util.StackTestDriver();
        int int10 = stackTestDriver9.size();
        stackTestDriver9.clear();
        boolean boolean12 = stackTestDriver9.isEmpty();
        experiment.util.StackTestDriver stackTestDriver13 = new experiment.util.StackTestDriver();
        int int14 = stackTestDriver13.size();
        int int15 = stackTestDriver13.size();
        stackTestDriver13.clear();
        java.lang.Object obj17 = stackTestDriver9.push((java.lang.Object) stackTestDriver13);
        boolean boolean18 = stackTestDriver9.isEmpty();
        java.lang.Object obj19 = stackTestDriver9.peek();
        experiment.util.StackTestDriver stackTestDriver20 = new experiment.util.StackTestDriver();
        int int21 = stackTestDriver20.size();
        stackTestDriver20.clear();
        boolean boolean23 = stackTestDriver20.isEmpty();
        experiment.util.StackTestDriver stackTestDriver24 = new experiment.util.StackTestDriver();
        int int25 = stackTestDriver24.size();
        int int26 = stackTestDriver24.size();
        stackTestDriver24.clear();
        java.lang.Object obj28 = stackTestDriver20.push((java.lang.Object) stackTestDriver24);
        boolean boolean29 = stackTestDriver20.isEmpty();
        java.lang.Object obj30 = stackTestDriver9.push((java.lang.Object) stackTestDriver20);
        java.lang.Object obj31 = stackTestDriver0.push((java.lang.Object) stackTestDriver9);
        int int32 = stackTestDriver0.size();
        boolean boolean33 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0 + "'", obj8, 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2 + "'", int32 == 2);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test153");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        int int6 = stackTestDriver4.size();
        stackTestDriver4.clear();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        stackTestDriver0.clear();
        int int10 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver11 = new experiment.util.StackTestDriver();
        int int12 = stackTestDriver11.size();
        stackTestDriver11.clear();
        boolean boolean14 = stackTestDriver11.isEmpty();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        int int16 = stackTestDriver15.size();
        int int17 = stackTestDriver15.size();
        stackTestDriver15.clear();
        java.lang.Object obj19 = stackTestDriver11.push((java.lang.Object) stackTestDriver15);
        boolean boolean20 = stackTestDriver11.isEmpty();
        java.lang.Object obj21 = stackTestDriver11.peek();
        experiment.util.StackTestDriver stackTestDriver22 = new experiment.util.StackTestDriver();
        int int23 = stackTestDriver22.size();
        stackTestDriver22.clear();
        boolean boolean25 = stackTestDriver22.isEmpty();
        experiment.util.StackTestDriver stackTestDriver26 = new experiment.util.StackTestDriver();
        int int27 = stackTestDriver26.size();
        int int28 = stackTestDriver26.size();
        stackTestDriver26.clear();
        java.lang.Object obj30 = stackTestDriver22.push((java.lang.Object) stackTestDriver26);
        boolean boolean31 = stackTestDriver22.isEmpty();
        java.lang.Object obj32 = stackTestDriver11.push((java.lang.Object) stackTestDriver22);
        java.lang.Object obj33 = stackTestDriver0.push((java.lang.Object) stackTestDriver11);
        experiment.util.StackTestDriver stackTestDriver34 = new experiment.util.StackTestDriver();
        int int35 = stackTestDriver34.size();
        stackTestDriver34.clear();
        boolean boolean37 = stackTestDriver34.isEmpty();
        experiment.util.StackTestDriver stackTestDriver38 = new experiment.util.StackTestDriver();
        int int39 = stackTestDriver38.size();
        int int40 = stackTestDriver38.size();
        stackTestDriver38.clear();
        java.lang.Object obj42 = stackTestDriver34.push((java.lang.Object) stackTestDriver38);
        stackTestDriver34.clear();
        int int44 = stackTestDriver34.size();
        experiment.util.StackTestDriver stackTestDriver45 = new experiment.util.StackTestDriver();
        int int46 = stackTestDriver45.size();
        stackTestDriver45.clear();
        boolean boolean48 = stackTestDriver45.isEmpty();
        experiment.util.StackTestDriver stackTestDriver49 = new experiment.util.StackTestDriver();
        int int50 = stackTestDriver49.size();
        int int51 = stackTestDriver49.size();
        stackTestDriver49.clear();
        java.lang.Object obj53 = stackTestDriver45.push((java.lang.Object) stackTestDriver49);
        boolean boolean54 = stackTestDriver45.isEmpty();
        java.lang.Object obj55 = stackTestDriver45.peek();
        experiment.util.StackTestDriver stackTestDriver56 = new experiment.util.StackTestDriver();
        int int57 = stackTestDriver56.size();
        stackTestDriver56.clear();
        boolean boolean59 = stackTestDriver56.isEmpty();
        experiment.util.StackTestDriver stackTestDriver60 = new experiment.util.StackTestDriver();
        int int61 = stackTestDriver60.size();
        int int62 = stackTestDriver60.size();
        stackTestDriver60.clear();
        java.lang.Object obj64 = stackTestDriver56.push((java.lang.Object) stackTestDriver60);
        boolean boolean65 = stackTestDriver56.isEmpty();
        java.lang.Object obj66 = stackTestDriver45.push((java.lang.Object) stackTestDriver56);
        java.lang.Object obj67 = stackTestDriver34.push((java.lang.Object) stackTestDriver45);
        java.lang.Object obj68 = stackTestDriver34.pop();
        java.lang.Object obj69 = stackTestDriver0.push((java.lang.Object) stackTestDriver34);
        java.lang.Object obj70 = stackTestDriver0.peek();
        java.lang.Class<?> wildcardClass71 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(obj53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(obj55);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(obj64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(obj66);
        org.junit.Assert.assertNotNull(obj67);
        org.junit.Assert.assertNotNull(obj68);
        org.junit.Assert.assertNotNull(obj69);
        org.junit.Assert.assertNotNull(obj70);
        org.junit.Assert.assertNotNull(wildcardClass71);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test154");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        boolean boolean4 = stackTestDriver0.isEmpty();
        boolean boolean5 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        int int7 = stackTestDriver6.size();
        stackTestDriver6.clear();
        stackTestDriver6.clear();
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        int int11 = stackTestDriver10.size();
        stackTestDriver10.clear();
        boolean boolean13 = stackTestDriver10.isEmpty();
        boolean boolean14 = stackTestDriver10.isEmpty();
        java.lang.Object obj15 = stackTestDriver6.push((java.lang.Object) boolean14);
        java.lang.Class<?> wildcardClass16 = obj15.getClass();
        java.lang.Object obj17 = stackTestDriver0.push((java.lang.Object) wildcardClass16);
        java.lang.Object obj18 = stackTestDriver0.peek();
        boolean boolean19 = stackTestDriver0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + true + "'", obj15, true);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "class java.lang.Boolean");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "class java.lang.Boolean");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "class java.lang.Boolean");
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals(obj18.toString(), "class java.lang.Boolean");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj18), "class java.lang.Boolean");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj18), "class java.lang.Boolean");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test155");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        int int6 = stackTestDriver4.size();
        stackTestDriver4.clear();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        boolean boolean9 = stackTestDriver0.isEmpty();
        java.lang.Object obj10 = stackTestDriver0.peek();
        experiment.util.StackTestDriver stackTestDriver11 = new experiment.util.StackTestDriver();
        int int12 = stackTestDriver11.size();
        stackTestDriver11.clear();
        boolean boolean14 = stackTestDriver11.isEmpty();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        int int16 = stackTestDriver15.size();
        int int17 = stackTestDriver15.size();
        stackTestDriver15.clear();
        java.lang.Object obj19 = stackTestDriver11.push((java.lang.Object) stackTestDriver15);
        boolean boolean20 = stackTestDriver11.isEmpty();
        java.lang.Object obj21 = stackTestDriver0.push((java.lang.Object) stackTestDriver11);
        boolean boolean22 = stackTestDriver0.isEmpty();
        int int23 = stackTestDriver0.size();
        stackTestDriver0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test156");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        int int4 = stackTestDriver0.size();
        stackTestDriver0.clear();
        int int6 = stackTestDriver0.size();
        stackTestDriver0.clear();
        java.lang.Class<?> wildcardClass8 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test157");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        int int4 = stackTestDriver0.size();
        boolean boolean5 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        int int7 = stackTestDriver6.size();
        int int8 = stackTestDriver6.size();
        int int9 = stackTestDriver6.size();
        boolean boolean10 = stackTestDriver6.isEmpty();
        java.lang.Object obj11 = stackTestDriver0.push((java.lang.Object) stackTestDriver6);
        stackTestDriver6.clear();
        java.lang.Object obj14 = stackTestDriver6.push((java.lang.Object) 10.0f);
        java.lang.Class<?> wildcardClass15 = stackTestDriver6.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 10.0f + "'", obj14, 10.0f);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test158");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        int int6 = stackTestDriver4.size();
        stackTestDriver4.clear();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        boolean boolean9 = stackTestDriver0.isEmpty();
        java.lang.Object obj10 = stackTestDriver0.peek();
        java.lang.Object obj11 = stackTestDriver0.peek();
        java.lang.Object obj12 = stackTestDriver0.peek();
        boolean boolean13 = stackTestDriver0.isEmpty();
        boolean boolean14 = stackTestDriver0.isEmpty();
        java.lang.Object obj15 = stackTestDriver0.pop();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test159");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver3 = new experiment.util.StackTestDriver();
        int int4 = stackTestDriver3.size();
        int int5 = stackTestDriver3.size();
        stackTestDriver3.clear();
        int int7 = stackTestDriver3.size();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) int7);
        boolean boolean9 = stackTestDriver0.isEmpty();
        java.lang.Object obj10 = stackTestDriver0.pop();
        stackTestDriver0.clear();
        int int12 = stackTestDriver0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0 + "'", obj8, 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 0 + "'", obj10, 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test160");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        int int6 = stackTestDriver4.size();
        stackTestDriver4.clear();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        stackTestDriver0.clear();
        java.lang.Object obj11 = stackTestDriver0.push((java.lang.Object) 10L);
        java.lang.Object obj12 = stackTestDriver0.peek();
        experiment.util.StackTestDriver stackTestDriver13 = new experiment.util.StackTestDriver();
        int int14 = stackTestDriver13.size();
        stackTestDriver13.clear();
        boolean boolean16 = stackTestDriver13.isEmpty();
        int int17 = stackTestDriver13.size();
        boolean boolean18 = stackTestDriver13.isEmpty();
        experiment.util.StackTestDriver stackTestDriver19 = new experiment.util.StackTestDriver();
        stackTestDriver19.clear();
        stackTestDriver19.clear();
        java.lang.Object obj23 = stackTestDriver19.push((java.lang.Object) 1L);
        java.lang.Object obj24 = stackTestDriver13.push((java.lang.Object) stackTestDriver19);
        java.lang.Object obj25 = stackTestDriver0.push((java.lang.Object) stackTestDriver13);
        java.lang.Object obj26 = stackTestDriver0.peek();
        stackTestDriver0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 10L + "'", obj11, 10L);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 10L + "'", obj12, 10L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 1L + "'", obj23, 1L);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNotNull(obj26);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test161");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        boolean boolean4 = stackTestDriver0.isEmpty();
        boolean boolean5 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        stackTestDriver6.clear();
        stackTestDriver6.clear();
        stackTestDriver6.clear();
        java.lang.Object obj10 = stackTestDriver0.push((java.lang.Object) stackTestDriver6);
        experiment.util.StackTestDriver stackTestDriver11 = new experiment.util.StackTestDriver();
        int int12 = stackTestDriver11.size();
        stackTestDriver11.clear();
        boolean boolean14 = stackTestDriver11.isEmpty();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        int int16 = stackTestDriver15.size();
        int int17 = stackTestDriver15.size();
        stackTestDriver15.clear();
        java.lang.Object obj19 = stackTestDriver11.push((java.lang.Object) stackTestDriver15);
        boolean boolean20 = stackTestDriver11.isEmpty();
        java.lang.Object obj21 = stackTestDriver11.peek();
        experiment.util.StackTestDriver stackTestDriver22 = new experiment.util.StackTestDriver();
        int int23 = stackTestDriver22.size();
        stackTestDriver22.clear();
        boolean boolean25 = stackTestDriver22.isEmpty();
        experiment.util.StackTestDriver stackTestDriver26 = new experiment.util.StackTestDriver();
        int int27 = stackTestDriver26.size();
        int int28 = stackTestDriver26.size();
        stackTestDriver26.clear();
        java.lang.Object obj30 = stackTestDriver22.push((java.lang.Object) stackTestDriver26);
        boolean boolean31 = stackTestDriver22.isEmpty();
        java.lang.Object obj32 = stackTestDriver11.push((java.lang.Object) stackTestDriver22);
        java.lang.Object obj33 = stackTestDriver22.peek();
        java.lang.Object obj34 = stackTestDriver6.push(obj33);
        int int35 = stackTestDriver6.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test162");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        boolean boolean4 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        java.lang.Class<?> wildcardClass7 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test163");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        int int2 = stackTestDriver0.size();
        boolean boolean3 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        stackTestDriver4.clear();
        boolean boolean7 = stackTestDriver4.isEmpty();
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        int int9 = stackTestDriver8.size();
        int int10 = stackTestDriver8.size();
        stackTestDriver8.clear();
        java.lang.Object obj12 = stackTestDriver4.push((java.lang.Object) stackTestDriver8);
        stackTestDriver4.clear();
        int int14 = stackTestDriver4.size();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        int int16 = stackTestDriver15.size();
        int int17 = stackTestDriver15.size();
        int int18 = stackTestDriver15.size();
        experiment.util.StackTestDriver stackTestDriver19 = new experiment.util.StackTestDriver();
        int int20 = stackTestDriver19.size();
        stackTestDriver19.clear();
        boolean boolean22 = stackTestDriver19.isEmpty();
        experiment.util.StackTestDriver stackTestDriver23 = new experiment.util.StackTestDriver();
        int int24 = stackTestDriver23.size();
        int int25 = stackTestDriver23.size();
        stackTestDriver23.clear();
        java.lang.Object obj27 = stackTestDriver19.push((java.lang.Object) stackTestDriver23);
        stackTestDriver19.clear();
        int int29 = stackTestDriver19.size();
        experiment.util.StackTestDriver stackTestDriver30 = new experiment.util.StackTestDriver();
        int int31 = stackTestDriver30.size();
        stackTestDriver30.clear();
        boolean boolean33 = stackTestDriver30.isEmpty();
        experiment.util.StackTestDriver stackTestDriver34 = new experiment.util.StackTestDriver();
        int int35 = stackTestDriver34.size();
        int int36 = stackTestDriver34.size();
        stackTestDriver34.clear();
        java.lang.Object obj38 = stackTestDriver30.push((java.lang.Object) stackTestDriver34);
        boolean boolean39 = stackTestDriver30.isEmpty();
        java.lang.Object obj40 = stackTestDriver30.peek();
        experiment.util.StackTestDriver stackTestDriver41 = new experiment.util.StackTestDriver();
        int int42 = stackTestDriver41.size();
        stackTestDriver41.clear();
        boolean boolean44 = stackTestDriver41.isEmpty();
        experiment.util.StackTestDriver stackTestDriver45 = new experiment.util.StackTestDriver();
        int int46 = stackTestDriver45.size();
        int int47 = stackTestDriver45.size();
        stackTestDriver45.clear();
        java.lang.Object obj49 = stackTestDriver41.push((java.lang.Object) stackTestDriver45);
        boolean boolean50 = stackTestDriver41.isEmpty();
        java.lang.Object obj51 = stackTestDriver30.push((java.lang.Object) stackTestDriver41);
        java.lang.Object obj52 = stackTestDriver19.push((java.lang.Object) stackTestDriver30);
        java.lang.Object obj53 = stackTestDriver19.pop();
        java.lang.Object obj54 = stackTestDriver15.push((java.lang.Object) stackTestDriver19);
        java.lang.Object obj55 = stackTestDriver4.push((java.lang.Object) stackTestDriver19);
        int int56 = stackTestDriver4.size();
        boolean boolean57 = stackTestDriver4.isEmpty();
        java.lang.Object obj58 = stackTestDriver0.push((java.lang.Object) boolean57);
        int int59 = stackTestDriver0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(obj51);
        org.junit.Assert.assertNotNull(obj52);
        org.junit.Assert.assertNotNull(obj53);
        org.junit.Assert.assertNotNull(obj54);
        org.junit.Assert.assertNotNull(obj55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertEquals("'" + obj58 + "' != '" + false + "'", obj58, false);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1 + "'", int59 == 1);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test164");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        boolean boolean4 = stackTestDriver0.isEmpty();
        int int5 = stackTestDriver0.size();
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) 0.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0.0f + "'", obj7, 0.0f);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test165");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver3 = new experiment.util.StackTestDriver();
        int int4 = stackTestDriver3.size();
        int int5 = stackTestDriver3.size();
        stackTestDriver3.clear();
        int int7 = stackTestDriver3.size();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) int7);
        experiment.util.StackTestDriver stackTestDriver9 = new experiment.util.StackTestDriver();
        int int10 = stackTestDriver9.size();
        stackTestDriver9.clear();
        boolean boolean12 = stackTestDriver9.isEmpty();
        experiment.util.StackTestDriver stackTestDriver13 = new experiment.util.StackTestDriver();
        int int14 = stackTestDriver13.size();
        int int15 = stackTestDriver13.size();
        stackTestDriver13.clear();
        java.lang.Object obj17 = stackTestDriver9.push((java.lang.Object) stackTestDriver13);
        boolean boolean18 = stackTestDriver9.isEmpty();
        java.lang.Object obj19 = stackTestDriver9.peek();
        experiment.util.StackTestDriver stackTestDriver20 = new experiment.util.StackTestDriver();
        int int21 = stackTestDriver20.size();
        stackTestDriver20.clear();
        boolean boolean23 = stackTestDriver20.isEmpty();
        experiment.util.StackTestDriver stackTestDriver24 = new experiment.util.StackTestDriver();
        int int25 = stackTestDriver24.size();
        int int26 = stackTestDriver24.size();
        stackTestDriver24.clear();
        java.lang.Object obj28 = stackTestDriver20.push((java.lang.Object) stackTestDriver24);
        boolean boolean29 = stackTestDriver20.isEmpty();
        java.lang.Object obj30 = stackTestDriver9.push((java.lang.Object) stackTestDriver20);
        java.lang.Object obj31 = stackTestDriver0.push((java.lang.Object) stackTestDriver9);
        stackTestDriver0.clear();
        java.lang.Class<?> wildcardClass33 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0 + "'", obj8, 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test166");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        java.lang.Object obj3 = stackTestDriver0.push((java.lang.Object) (short) 0);
        boolean boolean4 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        int int6 = stackTestDriver5.size();
        int int7 = stackTestDriver5.size();
        int int8 = stackTestDriver5.size();
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) int8);
        java.lang.Object obj10 = stackTestDriver0.peek();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (short) 0 + "'", obj3, (short) 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0 + "'", obj9, 0);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 0 + "'", obj10, 0);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test167");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (short) 0);
        java.lang.Object obj3 = stackTestDriver0.peek();
        boolean boolean4 = stackTestDriver0.isEmpty();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (short) 0 + "'", obj2, (short) 0);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (short) 0 + "'", obj3, (short) 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test168");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        int int2 = stackTestDriver0.size();
        boolean boolean3 = stackTestDriver0.isEmpty();
        int int4 = stackTestDriver0.size();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        int int7 = stackTestDriver6.size();
        stackTestDriver6.clear();
        boolean boolean9 = stackTestDriver6.isEmpty();
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        int int11 = stackTestDriver10.size();
        int int12 = stackTestDriver10.size();
        stackTestDriver10.clear();
        java.lang.Object obj14 = stackTestDriver6.push((java.lang.Object) stackTestDriver10);
        stackTestDriver6.clear();
        int int16 = stackTestDriver6.size();
        experiment.util.StackTestDriver stackTestDriver17 = new experiment.util.StackTestDriver();
        int int18 = stackTestDriver17.size();
        stackTestDriver17.clear();
        boolean boolean20 = stackTestDriver17.isEmpty();
        experiment.util.StackTestDriver stackTestDriver21 = new experiment.util.StackTestDriver();
        int int22 = stackTestDriver21.size();
        int int23 = stackTestDriver21.size();
        stackTestDriver21.clear();
        java.lang.Object obj25 = stackTestDriver17.push((java.lang.Object) stackTestDriver21);
        boolean boolean26 = stackTestDriver17.isEmpty();
        java.lang.Object obj27 = stackTestDriver17.peek();
        experiment.util.StackTestDriver stackTestDriver28 = new experiment.util.StackTestDriver();
        int int29 = stackTestDriver28.size();
        stackTestDriver28.clear();
        boolean boolean31 = stackTestDriver28.isEmpty();
        experiment.util.StackTestDriver stackTestDriver32 = new experiment.util.StackTestDriver();
        int int33 = stackTestDriver32.size();
        int int34 = stackTestDriver32.size();
        stackTestDriver32.clear();
        java.lang.Object obj36 = stackTestDriver28.push((java.lang.Object) stackTestDriver32);
        boolean boolean37 = stackTestDriver28.isEmpty();
        java.lang.Object obj38 = stackTestDriver17.push((java.lang.Object) stackTestDriver28);
        java.lang.Object obj39 = stackTestDriver6.push((java.lang.Object) stackTestDriver17);
        java.lang.Object obj40 = stackTestDriver6.pop();
        java.lang.Object obj41 = stackTestDriver0.push(obj40);
        stackTestDriver0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertNotNull(obj41);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test169");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        int int6 = stackTestDriver4.size();
        stackTestDriver4.clear();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        boolean boolean9 = stackTestDriver0.isEmpty();
        java.lang.Object obj10 = stackTestDriver0.peek();
        int int11 = stackTestDriver0.size();
        java.lang.Object obj12 = stackTestDriver0.peek();
        experiment.util.StackTestDriver stackTestDriver13 = new experiment.util.StackTestDriver();
        int int14 = stackTestDriver13.size();
        int int15 = stackTestDriver13.size();
        boolean boolean16 = stackTestDriver13.isEmpty();
        java.lang.Object obj17 = stackTestDriver0.push((java.lang.Object) stackTestDriver13);
        stackTestDriver13.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(obj17);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test170");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        int int6 = stackTestDriver4.size();
        stackTestDriver4.clear();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        stackTestDriver0.clear();
        int int10 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver11 = new experiment.util.StackTestDriver();
        int int12 = stackTestDriver11.size();
        int int13 = stackTestDriver11.size();
        int int14 = stackTestDriver11.size();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        int int16 = stackTestDriver15.size();
        stackTestDriver15.clear();
        boolean boolean18 = stackTestDriver15.isEmpty();
        experiment.util.StackTestDriver stackTestDriver19 = new experiment.util.StackTestDriver();
        int int20 = stackTestDriver19.size();
        int int21 = stackTestDriver19.size();
        stackTestDriver19.clear();
        java.lang.Object obj23 = stackTestDriver15.push((java.lang.Object) stackTestDriver19);
        stackTestDriver15.clear();
        int int25 = stackTestDriver15.size();
        experiment.util.StackTestDriver stackTestDriver26 = new experiment.util.StackTestDriver();
        int int27 = stackTestDriver26.size();
        stackTestDriver26.clear();
        boolean boolean29 = stackTestDriver26.isEmpty();
        experiment.util.StackTestDriver stackTestDriver30 = new experiment.util.StackTestDriver();
        int int31 = stackTestDriver30.size();
        int int32 = stackTestDriver30.size();
        stackTestDriver30.clear();
        java.lang.Object obj34 = stackTestDriver26.push((java.lang.Object) stackTestDriver30);
        boolean boolean35 = stackTestDriver26.isEmpty();
        java.lang.Object obj36 = stackTestDriver26.peek();
        experiment.util.StackTestDriver stackTestDriver37 = new experiment.util.StackTestDriver();
        int int38 = stackTestDriver37.size();
        stackTestDriver37.clear();
        boolean boolean40 = stackTestDriver37.isEmpty();
        experiment.util.StackTestDriver stackTestDriver41 = new experiment.util.StackTestDriver();
        int int42 = stackTestDriver41.size();
        int int43 = stackTestDriver41.size();
        stackTestDriver41.clear();
        java.lang.Object obj45 = stackTestDriver37.push((java.lang.Object) stackTestDriver41);
        boolean boolean46 = stackTestDriver37.isEmpty();
        java.lang.Object obj47 = stackTestDriver26.push((java.lang.Object) stackTestDriver37);
        java.lang.Object obj48 = stackTestDriver15.push((java.lang.Object) stackTestDriver26);
        java.lang.Object obj49 = stackTestDriver15.pop();
        java.lang.Object obj50 = stackTestDriver11.push((java.lang.Object) stackTestDriver15);
        java.lang.Object obj51 = stackTestDriver0.push((java.lang.Object) stackTestDriver15);
        int int52 = stackTestDriver0.size();
        boolean boolean53 = stackTestDriver0.isEmpty();
        boolean boolean54 = stackTestDriver0.isEmpty();
        java.lang.Object obj55 = stackTestDriver0.peek();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertNotNull(obj50);
        org.junit.Assert.assertNotNull(obj51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(obj55);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test171");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        java.lang.Object obj3 = stackTestDriver0.push((java.lang.Object) (short) 0);
        int int4 = stackTestDriver0.size();
        boolean boolean5 = stackTestDriver0.isEmpty();
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) (-1.0d));
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        stackTestDriver8.clear();
        java.lang.Object obj11 = stackTestDriver8.push((java.lang.Object) (short) 0);
        int int12 = stackTestDriver8.size();
        boolean boolean13 = stackTestDriver8.isEmpty();
        java.lang.Object obj14 = stackTestDriver0.push((java.lang.Object) stackTestDriver8);
        stackTestDriver0.clear();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (short) 0 + "'", obj3, (short) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (short) 0 + "'", obj11, (short) 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test172");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        int int2 = stackTestDriver0.size();
        boolean boolean3 = stackTestDriver0.isEmpty();
        int int4 = stackTestDriver0.size();
        stackTestDriver0.clear();
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) (short) 1);
        java.lang.Object obj8 = stackTestDriver0.peek();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (short) 1 + "'", obj7, (short) 1);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (short) 1 + "'", obj8, (short) 1);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test173");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        int int6 = stackTestDriver4.size();
        stackTestDriver4.clear();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        boolean boolean9 = stackTestDriver0.isEmpty();
        java.lang.Object obj10 = stackTestDriver0.peek();
        java.lang.Object obj11 = stackTestDriver0.peek();
        java.lang.Object obj12 = stackTestDriver0.peek();
        boolean boolean13 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver14 = new experiment.util.StackTestDriver();
        int int15 = stackTestDriver14.size();
        stackTestDriver14.clear();
        boolean boolean17 = stackTestDriver14.isEmpty();
        experiment.util.StackTestDriver stackTestDriver18 = new experiment.util.StackTestDriver();
        int int19 = stackTestDriver18.size();
        int int20 = stackTestDriver18.size();
        stackTestDriver18.clear();
        java.lang.Object obj22 = stackTestDriver14.push((java.lang.Object) stackTestDriver18);
        stackTestDriver14.clear();
        int int24 = stackTestDriver14.size();
        experiment.util.StackTestDriver stackTestDriver25 = new experiment.util.StackTestDriver();
        int int26 = stackTestDriver25.size();
        stackTestDriver25.clear();
        boolean boolean28 = stackTestDriver25.isEmpty();
        experiment.util.StackTestDriver stackTestDriver29 = new experiment.util.StackTestDriver();
        int int30 = stackTestDriver29.size();
        int int31 = stackTestDriver29.size();
        stackTestDriver29.clear();
        java.lang.Object obj33 = stackTestDriver25.push((java.lang.Object) stackTestDriver29);
        boolean boolean34 = stackTestDriver25.isEmpty();
        java.lang.Object obj35 = stackTestDriver25.peek();
        experiment.util.StackTestDriver stackTestDriver36 = new experiment.util.StackTestDriver();
        int int37 = stackTestDriver36.size();
        stackTestDriver36.clear();
        boolean boolean39 = stackTestDriver36.isEmpty();
        experiment.util.StackTestDriver stackTestDriver40 = new experiment.util.StackTestDriver();
        int int41 = stackTestDriver40.size();
        int int42 = stackTestDriver40.size();
        stackTestDriver40.clear();
        java.lang.Object obj44 = stackTestDriver36.push((java.lang.Object) stackTestDriver40);
        boolean boolean45 = stackTestDriver36.isEmpty();
        java.lang.Object obj46 = stackTestDriver25.push((java.lang.Object) stackTestDriver36);
        java.lang.Object obj47 = stackTestDriver14.push((java.lang.Object) stackTestDriver25);
        experiment.util.StackTestDriver stackTestDriver48 = new experiment.util.StackTestDriver();
        stackTestDriver48.clear();
        stackTestDriver48.clear();
        java.lang.Class<?> wildcardClass51 = stackTestDriver48.getClass();
        java.lang.Object obj52 = stackTestDriver14.push((java.lang.Object) wildcardClass51);
        stackTestDriver14.clear();
        java.lang.Object obj54 = stackTestDriver0.push((java.lang.Object) stackTestDriver14);
        int int55 = stackTestDriver14.size();
        java.lang.Class<?> wildcardClass56 = stackTestDriver14.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNotNull(obj52);
        org.junit.Assert.assertEquals(obj52.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj52), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj52), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertNotNull(obj54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(wildcardClass56);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test174");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean5 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        int int7 = stackTestDriver0.size();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver9 = new experiment.util.StackTestDriver();
        java.lang.Object obj10 = stackTestDriver0.push((java.lang.Object) stackTestDriver9);
        boolean boolean11 = stackTestDriver9.isEmpty();
        stackTestDriver9.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test175");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver2 = new experiment.util.StackTestDriver();
        int int3 = stackTestDriver2.size();
        stackTestDriver2.clear();
        boolean boolean5 = stackTestDriver2.isEmpty();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        int int7 = stackTestDriver6.size();
        int int8 = stackTestDriver6.size();
        stackTestDriver6.clear();
        java.lang.Object obj10 = stackTestDriver2.push((java.lang.Object) stackTestDriver6);
        stackTestDriver2.clear();
        int int12 = stackTestDriver2.size();
        experiment.util.StackTestDriver stackTestDriver13 = new experiment.util.StackTestDriver();
        int int14 = stackTestDriver13.size();
        stackTestDriver13.clear();
        boolean boolean16 = stackTestDriver13.isEmpty();
        experiment.util.StackTestDriver stackTestDriver17 = new experiment.util.StackTestDriver();
        int int18 = stackTestDriver17.size();
        int int19 = stackTestDriver17.size();
        stackTestDriver17.clear();
        java.lang.Object obj21 = stackTestDriver13.push((java.lang.Object) stackTestDriver17);
        boolean boolean22 = stackTestDriver13.isEmpty();
        java.lang.Object obj23 = stackTestDriver13.peek();
        experiment.util.StackTestDriver stackTestDriver24 = new experiment.util.StackTestDriver();
        int int25 = stackTestDriver24.size();
        stackTestDriver24.clear();
        boolean boolean27 = stackTestDriver24.isEmpty();
        experiment.util.StackTestDriver stackTestDriver28 = new experiment.util.StackTestDriver();
        int int29 = stackTestDriver28.size();
        int int30 = stackTestDriver28.size();
        stackTestDriver28.clear();
        java.lang.Object obj32 = stackTestDriver24.push((java.lang.Object) stackTestDriver28);
        boolean boolean33 = stackTestDriver24.isEmpty();
        java.lang.Object obj34 = stackTestDriver13.push((java.lang.Object) stackTestDriver24);
        java.lang.Object obj35 = stackTestDriver2.push((java.lang.Object) stackTestDriver13);
        java.lang.Object obj36 = stackTestDriver0.push((java.lang.Object) stackTestDriver13);
        java.lang.Class<?> wildcardClass37 = stackTestDriver13.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test176");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        int int6 = stackTestDriver4.size();
        stackTestDriver4.clear();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        boolean boolean9 = stackTestDriver0.isEmpty();
        java.lang.Object obj10 = stackTestDriver0.peek();
        java.lang.Object obj11 = stackTestDriver0.peek();
        java.lang.Object obj12 = stackTestDriver0.peek();
        boolean boolean13 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver14 = new experiment.util.StackTestDriver();
        int int15 = stackTestDriver14.size();
        stackTestDriver14.clear();
        boolean boolean17 = stackTestDriver14.isEmpty();
        experiment.util.StackTestDriver stackTestDriver18 = new experiment.util.StackTestDriver();
        int int19 = stackTestDriver18.size();
        int int20 = stackTestDriver18.size();
        stackTestDriver18.clear();
        java.lang.Object obj22 = stackTestDriver14.push((java.lang.Object) stackTestDriver18);
        stackTestDriver14.clear();
        int int24 = stackTestDriver14.size();
        experiment.util.StackTestDriver stackTestDriver25 = new experiment.util.StackTestDriver();
        int int26 = stackTestDriver25.size();
        stackTestDriver25.clear();
        boolean boolean28 = stackTestDriver25.isEmpty();
        experiment.util.StackTestDriver stackTestDriver29 = new experiment.util.StackTestDriver();
        int int30 = stackTestDriver29.size();
        int int31 = stackTestDriver29.size();
        stackTestDriver29.clear();
        java.lang.Object obj33 = stackTestDriver25.push((java.lang.Object) stackTestDriver29);
        boolean boolean34 = stackTestDriver25.isEmpty();
        java.lang.Object obj35 = stackTestDriver25.peek();
        experiment.util.StackTestDriver stackTestDriver36 = new experiment.util.StackTestDriver();
        int int37 = stackTestDriver36.size();
        stackTestDriver36.clear();
        boolean boolean39 = stackTestDriver36.isEmpty();
        experiment.util.StackTestDriver stackTestDriver40 = new experiment.util.StackTestDriver();
        int int41 = stackTestDriver40.size();
        int int42 = stackTestDriver40.size();
        stackTestDriver40.clear();
        java.lang.Object obj44 = stackTestDriver36.push((java.lang.Object) stackTestDriver40);
        boolean boolean45 = stackTestDriver36.isEmpty();
        java.lang.Object obj46 = stackTestDriver25.push((java.lang.Object) stackTestDriver36);
        java.lang.Object obj47 = stackTestDriver14.push((java.lang.Object) stackTestDriver25);
        experiment.util.StackTestDriver stackTestDriver48 = new experiment.util.StackTestDriver();
        stackTestDriver48.clear();
        stackTestDriver48.clear();
        java.lang.Class<?> wildcardClass51 = stackTestDriver48.getClass();
        java.lang.Object obj52 = stackTestDriver14.push((java.lang.Object) wildcardClass51);
        stackTestDriver14.clear();
        java.lang.Object obj54 = stackTestDriver0.push((java.lang.Object) stackTestDriver14);
        int int55 = stackTestDriver14.size();
        boolean boolean56 = stackTestDriver14.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj57 = stackTestDriver14.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNotNull(obj52);
        org.junit.Assert.assertEquals(obj52.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj52), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj52), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertNotNull(obj54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test177");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test178");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        boolean boolean4 = stackTestDriver0.isEmpty();
        boolean boolean5 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        int int7 = stackTestDriver6.size();
        int int8 = stackTestDriver6.size();
        int int9 = stackTestDriver6.size();
        stackTestDriver6.clear();
        stackTestDriver6.clear();
        java.lang.Object obj12 = stackTestDriver0.push((java.lang.Object) stackTestDriver6);
        java.lang.Object obj13 = stackTestDriver0.peek();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test179");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean5 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        int int7 = stackTestDriver6.size();
        stackTestDriver6.clear();
        boolean boolean9 = stackTestDriver6.isEmpty();
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        int int11 = stackTestDriver10.size();
        int int12 = stackTestDriver10.size();
        stackTestDriver10.clear();
        java.lang.Object obj14 = stackTestDriver6.push((java.lang.Object) stackTestDriver10);
        boolean boolean15 = stackTestDriver6.isEmpty();
        java.lang.Object obj16 = stackTestDriver0.push((java.lang.Object) boolean15);
        boolean boolean17 = stackTestDriver0.isEmpty();
        java.lang.Object obj18 = stackTestDriver0.pop();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + false + "'", obj16, false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + false + "'", obj18, false);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test180");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        java.lang.Object obj3 = stackTestDriver0.push((java.lang.Object) (short) 0);
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) 100);
        java.lang.Object obj6 = stackTestDriver0.peek();
        java.lang.Object obj7 = stackTestDriver0.pop();
        java.lang.Object obj8 = stackTestDriver0.pop();
        int int9 = stackTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (short) 0 + "'", obj3, (short) 0);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100 + "'", obj5, 100);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 100 + "'", obj6, 100);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 100 + "'", obj7, 100);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (short) 0 + "'", obj8, (short) 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test181");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        int int6 = stackTestDriver4.size();
        stackTestDriver4.clear();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        boolean boolean9 = stackTestDriver0.isEmpty();
        java.lang.Object obj10 = stackTestDriver0.peek();
        experiment.util.StackTestDriver stackTestDriver11 = new experiment.util.StackTestDriver();
        int int12 = stackTestDriver11.size();
        stackTestDriver11.clear();
        boolean boolean14 = stackTestDriver11.isEmpty();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        int int16 = stackTestDriver15.size();
        int int17 = stackTestDriver15.size();
        stackTestDriver15.clear();
        java.lang.Object obj19 = stackTestDriver11.push((java.lang.Object) stackTestDriver15);
        boolean boolean20 = stackTestDriver11.isEmpty();
        java.lang.Object obj21 = stackTestDriver0.push((java.lang.Object) stackTestDriver11);
        java.lang.Object obj22 = stackTestDriver11.peek();
        int int23 = stackTestDriver11.size();
        experiment.util.StackTestDriver stackTestDriver24 = new experiment.util.StackTestDriver();
        stackTestDriver24.clear();
        experiment.util.StackTestDriver stackTestDriver26 = new experiment.util.StackTestDriver();
        int int27 = stackTestDriver26.size();
        stackTestDriver26.clear();
        boolean boolean29 = stackTestDriver26.isEmpty();
        experiment.util.StackTestDriver stackTestDriver30 = new experiment.util.StackTestDriver();
        int int31 = stackTestDriver30.size();
        int int32 = stackTestDriver30.size();
        stackTestDriver30.clear();
        java.lang.Object obj34 = stackTestDriver26.push((java.lang.Object) stackTestDriver30);
        stackTestDriver26.clear();
        int int36 = stackTestDriver26.size();
        experiment.util.StackTestDriver stackTestDriver37 = new experiment.util.StackTestDriver();
        int int38 = stackTestDriver37.size();
        stackTestDriver37.clear();
        boolean boolean40 = stackTestDriver37.isEmpty();
        experiment.util.StackTestDriver stackTestDriver41 = new experiment.util.StackTestDriver();
        int int42 = stackTestDriver41.size();
        int int43 = stackTestDriver41.size();
        stackTestDriver41.clear();
        java.lang.Object obj45 = stackTestDriver37.push((java.lang.Object) stackTestDriver41);
        boolean boolean46 = stackTestDriver37.isEmpty();
        java.lang.Object obj47 = stackTestDriver37.peek();
        experiment.util.StackTestDriver stackTestDriver48 = new experiment.util.StackTestDriver();
        int int49 = stackTestDriver48.size();
        stackTestDriver48.clear();
        boolean boolean51 = stackTestDriver48.isEmpty();
        experiment.util.StackTestDriver stackTestDriver52 = new experiment.util.StackTestDriver();
        int int53 = stackTestDriver52.size();
        int int54 = stackTestDriver52.size();
        stackTestDriver52.clear();
        java.lang.Object obj56 = stackTestDriver48.push((java.lang.Object) stackTestDriver52);
        boolean boolean57 = stackTestDriver48.isEmpty();
        java.lang.Object obj58 = stackTestDriver37.push((java.lang.Object) stackTestDriver48);
        java.lang.Object obj59 = stackTestDriver26.push((java.lang.Object) stackTestDriver37);
        java.lang.Object obj60 = stackTestDriver24.push((java.lang.Object) stackTestDriver37);
        java.lang.Object obj61 = stackTestDriver11.push((java.lang.Object) stackTestDriver24);
        stackTestDriver11.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(obj56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(obj58);
        org.junit.Assert.assertNotNull(obj59);
        org.junit.Assert.assertNotNull(obj60);
        org.junit.Assert.assertNotNull(obj61);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test182");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        int int6 = stackTestDriver4.size();
        stackTestDriver4.clear();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        boolean boolean9 = stackTestDriver0.isEmpty();
        java.lang.Object obj10 = stackTestDriver0.peek();
        java.lang.Object obj11 = stackTestDriver0.peek();
        java.lang.Object obj12 = stackTestDriver0.peek();
        int int13 = stackTestDriver0.size();
        int int14 = stackTestDriver0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test183");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean5 = stackTestDriver0.isEmpty();
        boolean boolean6 = stackTestDriver0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test184");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        boolean boolean4 = stackTestDriver0.isEmpty();
        boolean boolean5 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        int int7 = stackTestDriver6.size();
        stackTestDriver6.clear();
        stackTestDriver6.clear();
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        int int11 = stackTestDriver10.size();
        stackTestDriver10.clear();
        boolean boolean13 = stackTestDriver10.isEmpty();
        boolean boolean14 = stackTestDriver10.isEmpty();
        java.lang.Object obj15 = stackTestDriver6.push((java.lang.Object) boolean14);
        java.lang.Class<?> wildcardClass16 = obj15.getClass();
        java.lang.Object obj17 = stackTestDriver0.push((java.lang.Object) wildcardClass16);
        java.lang.Object obj18 = stackTestDriver0.pop();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + true + "'", obj15, true);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "class java.lang.Boolean");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "class java.lang.Boolean");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "class java.lang.Boolean");
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals(obj18.toString(), "class java.lang.Boolean");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj18), "class java.lang.Boolean");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj18), "class java.lang.Boolean");
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test185");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        int int2 = stackTestDriver0.size();
        boolean boolean3 = stackTestDriver0.isEmpty();
        int int4 = stackTestDriver0.size();
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test186");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        int int6 = stackTestDriver4.size();
        stackTestDriver4.clear();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        stackTestDriver0.clear();
        int int10 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver11 = new experiment.util.StackTestDriver();
        int int12 = stackTestDriver11.size();
        int int13 = stackTestDriver11.size();
        int int14 = stackTestDriver11.size();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        int int16 = stackTestDriver15.size();
        stackTestDriver15.clear();
        boolean boolean18 = stackTestDriver15.isEmpty();
        experiment.util.StackTestDriver stackTestDriver19 = new experiment.util.StackTestDriver();
        int int20 = stackTestDriver19.size();
        int int21 = stackTestDriver19.size();
        stackTestDriver19.clear();
        java.lang.Object obj23 = stackTestDriver15.push((java.lang.Object) stackTestDriver19);
        stackTestDriver15.clear();
        int int25 = stackTestDriver15.size();
        experiment.util.StackTestDriver stackTestDriver26 = new experiment.util.StackTestDriver();
        int int27 = stackTestDriver26.size();
        stackTestDriver26.clear();
        boolean boolean29 = stackTestDriver26.isEmpty();
        experiment.util.StackTestDriver stackTestDriver30 = new experiment.util.StackTestDriver();
        int int31 = stackTestDriver30.size();
        int int32 = stackTestDriver30.size();
        stackTestDriver30.clear();
        java.lang.Object obj34 = stackTestDriver26.push((java.lang.Object) stackTestDriver30);
        boolean boolean35 = stackTestDriver26.isEmpty();
        java.lang.Object obj36 = stackTestDriver26.peek();
        experiment.util.StackTestDriver stackTestDriver37 = new experiment.util.StackTestDriver();
        int int38 = stackTestDriver37.size();
        stackTestDriver37.clear();
        boolean boolean40 = stackTestDriver37.isEmpty();
        experiment.util.StackTestDriver stackTestDriver41 = new experiment.util.StackTestDriver();
        int int42 = stackTestDriver41.size();
        int int43 = stackTestDriver41.size();
        stackTestDriver41.clear();
        java.lang.Object obj45 = stackTestDriver37.push((java.lang.Object) stackTestDriver41);
        boolean boolean46 = stackTestDriver37.isEmpty();
        java.lang.Object obj47 = stackTestDriver26.push((java.lang.Object) stackTestDriver37);
        java.lang.Object obj48 = stackTestDriver15.push((java.lang.Object) stackTestDriver26);
        java.lang.Object obj49 = stackTestDriver15.pop();
        java.lang.Object obj50 = stackTestDriver11.push((java.lang.Object) stackTestDriver15);
        java.lang.Object obj51 = stackTestDriver0.push((java.lang.Object) stackTestDriver15);
        stackTestDriver15.clear();
        int int53 = stackTestDriver15.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj54 = stackTestDriver15.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertNotNull(obj50);
        org.junit.Assert.assertNotNull(obj51);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test187");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        boolean boolean4 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = stackTestDriver0.pop();
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
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test188");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        java.lang.Object obj3 = stackTestDriver0.push((java.lang.Object) (short) 0);
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) 100);
        java.lang.Object obj6 = stackTestDriver0.peek();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (short) 0 + "'", obj3, (short) 0);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100 + "'", obj5, 100);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 100 + "'", obj6, 100);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test189");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        int int6 = stackTestDriver4.size();
        stackTestDriver4.clear();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        stackTestDriver0.clear();
        int int10 = stackTestDriver0.size();
        int int11 = stackTestDriver0.size();
        int int12 = stackTestDriver0.size();
        int int13 = stackTestDriver0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test190");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        int int4 = stackTestDriver0.size();
        boolean boolean5 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        int int7 = stackTestDriver6.size();
        int int8 = stackTestDriver6.size();
        int int9 = stackTestDriver6.size();
        boolean boolean10 = stackTestDriver6.isEmpty();
        java.lang.Object obj11 = stackTestDriver0.push((java.lang.Object) stackTestDriver6);
        experiment.util.StackTestDriver stackTestDriver12 = new experiment.util.StackTestDriver();
        stackTestDriver12.clear();
        experiment.util.StackTestDriver stackTestDriver14 = new experiment.util.StackTestDriver();
        int int15 = stackTestDriver14.size();
        stackTestDriver14.clear();
        boolean boolean17 = stackTestDriver14.isEmpty();
        experiment.util.StackTestDriver stackTestDriver18 = new experiment.util.StackTestDriver();
        int int19 = stackTestDriver18.size();
        int int20 = stackTestDriver18.size();
        stackTestDriver18.clear();
        java.lang.Object obj22 = stackTestDriver14.push((java.lang.Object) stackTestDriver18);
        stackTestDriver14.clear();
        int int24 = stackTestDriver14.size();
        experiment.util.StackTestDriver stackTestDriver25 = new experiment.util.StackTestDriver();
        int int26 = stackTestDriver25.size();
        stackTestDriver25.clear();
        boolean boolean28 = stackTestDriver25.isEmpty();
        experiment.util.StackTestDriver stackTestDriver29 = new experiment.util.StackTestDriver();
        int int30 = stackTestDriver29.size();
        int int31 = stackTestDriver29.size();
        stackTestDriver29.clear();
        java.lang.Object obj33 = stackTestDriver25.push((java.lang.Object) stackTestDriver29);
        boolean boolean34 = stackTestDriver25.isEmpty();
        java.lang.Object obj35 = stackTestDriver25.peek();
        experiment.util.StackTestDriver stackTestDriver36 = new experiment.util.StackTestDriver();
        int int37 = stackTestDriver36.size();
        stackTestDriver36.clear();
        boolean boolean39 = stackTestDriver36.isEmpty();
        experiment.util.StackTestDriver stackTestDriver40 = new experiment.util.StackTestDriver();
        int int41 = stackTestDriver40.size();
        int int42 = stackTestDriver40.size();
        stackTestDriver40.clear();
        java.lang.Object obj44 = stackTestDriver36.push((java.lang.Object) stackTestDriver40);
        boolean boolean45 = stackTestDriver36.isEmpty();
        java.lang.Object obj46 = stackTestDriver25.push((java.lang.Object) stackTestDriver36);
        java.lang.Object obj47 = stackTestDriver14.push((java.lang.Object) stackTestDriver25);
        java.lang.Object obj48 = stackTestDriver12.push((java.lang.Object) stackTestDriver25);
        experiment.util.StackTestDriver stackTestDriver49 = new experiment.util.StackTestDriver();
        stackTestDriver49.clear();
        stackTestDriver49.clear();
        java.lang.Object obj52 = stackTestDriver12.push((java.lang.Object) stackTestDriver49);
        java.lang.Object obj53 = stackTestDriver6.push((java.lang.Object) stackTestDriver49);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertNotNull(obj52);
        org.junit.Assert.assertNotNull(obj53);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test191");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        boolean boolean4 = stackTestDriver0.isEmpty();
        boolean boolean5 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        int int7 = stackTestDriver6.size();
        int int8 = stackTestDriver6.size();
        int int9 = stackTestDriver6.size();
        stackTestDriver6.clear();
        stackTestDriver6.clear();
        java.lang.Object obj12 = stackTestDriver0.push((java.lang.Object) stackTestDriver6);
        int int13 = stackTestDriver6.size();
        int int14 = stackTestDriver6.size();
        java.lang.Class<?> wildcardClass15 = stackTestDriver6.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test192");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        boolean boolean4 = stackTestDriver0.isEmpty();
        boolean boolean5 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) '#');
        stackTestDriver0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + '#' + "'", obj8, '#');
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test193");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        int int6 = stackTestDriver4.size();
        stackTestDriver4.clear();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        stackTestDriver0.clear();
        int int10 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver11 = new experiment.util.StackTestDriver();
        int int12 = stackTestDriver11.size();
        int int13 = stackTestDriver11.size();
        int int14 = stackTestDriver11.size();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        int int16 = stackTestDriver15.size();
        stackTestDriver15.clear();
        boolean boolean18 = stackTestDriver15.isEmpty();
        experiment.util.StackTestDriver stackTestDriver19 = new experiment.util.StackTestDriver();
        int int20 = stackTestDriver19.size();
        int int21 = stackTestDriver19.size();
        stackTestDriver19.clear();
        java.lang.Object obj23 = stackTestDriver15.push((java.lang.Object) stackTestDriver19);
        stackTestDriver15.clear();
        int int25 = stackTestDriver15.size();
        experiment.util.StackTestDriver stackTestDriver26 = new experiment.util.StackTestDriver();
        int int27 = stackTestDriver26.size();
        stackTestDriver26.clear();
        boolean boolean29 = stackTestDriver26.isEmpty();
        experiment.util.StackTestDriver stackTestDriver30 = new experiment.util.StackTestDriver();
        int int31 = stackTestDriver30.size();
        int int32 = stackTestDriver30.size();
        stackTestDriver30.clear();
        java.lang.Object obj34 = stackTestDriver26.push((java.lang.Object) stackTestDriver30);
        boolean boolean35 = stackTestDriver26.isEmpty();
        java.lang.Object obj36 = stackTestDriver26.peek();
        experiment.util.StackTestDriver stackTestDriver37 = new experiment.util.StackTestDriver();
        int int38 = stackTestDriver37.size();
        stackTestDriver37.clear();
        boolean boolean40 = stackTestDriver37.isEmpty();
        experiment.util.StackTestDriver stackTestDriver41 = new experiment.util.StackTestDriver();
        int int42 = stackTestDriver41.size();
        int int43 = stackTestDriver41.size();
        stackTestDriver41.clear();
        java.lang.Object obj45 = stackTestDriver37.push((java.lang.Object) stackTestDriver41);
        boolean boolean46 = stackTestDriver37.isEmpty();
        java.lang.Object obj47 = stackTestDriver26.push((java.lang.Object) stackTestDriver37);
        java.lang.Object obj48 = stackTestDriver15.push((java.lang.Object) stackTestDriver26);
        java.lang.Object obj49 = stackTestDriver15.pop();
        java.lang.Object obj50 = stackTestDriver11.push((java.lang.Object) stackTestDriver15);
        java.lang.Object obj51 = stackTestDriver0.push((java.lang.Object) stackTestDriver15);
        java.lang.Object obj52 = stackTestDriver0.peek();
        java.lang.Object obj53 = stackTestDriver0.peek();
        boolean boolean54 = stackTestDriver0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertNotNull(obj50);
        org.junit.Assert.assertNotNull(obj51);
        org.junit.Assert.assertNotNull(obj52);
        org.junit.Assert.assertNotNull(obj53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test194");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        stackTestDriver4.clear();
        stackTestDriver4.clear();
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        boolean boolean8 = stackTestDriver0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test195");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver3 = new experiment.util.StackTestDriver();
        int int4 = stackTestDriver3.size();
        int int5 = stackTestDriver3.size();
        stackTestDriver3.clear();
        int int7 = stackTestDriver3.size();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) int7);
        boolean boolean9 = stackTestDriver0.isEmpty();
        java.lang.Object obj10 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver11 = new experiment.util.StackTestDriver();
        int int12 = stackTestDriver11.size();
        stackTestDriver11.clear();
        boolean boolean14 = stackTestDriver11.isEmpty();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        int int16 = stackTestDriver15.size();
        int int17 = stackTestDriver15.size();
        stackTestDriver15.clear();
        java.lang.Object obj19 = stackTestDriver11.push((java.lang.Object) stackTestDriver15);
        boolean boolean20 = stackTestDriver11.isEmpty();
        java.lang.Object obj21 = stackTestDriver11.peek();
        java.lang.Object obj22 = stackTestDriver11.peek();
        java.lang.Object obj23 = stackTestDriver0.push(obj22);
        java.lang.Object obj24 = stackTestDriver0.peek();
        experiment.util.StackTestDriver stackTestDriver25 = new experiment.util.StackTestDriver();
        int int26 = stackTestDriver25.size();
        int int27 = stackTestDriver25.size();
        int int28 = stackTestDriver25.size();
        java.lang.Class<?> wildcardClass29 = stackTestDriver25.getClass();
        java.lang.Object obj30 = stackTestDriver0.push((java.lang.Object) stackTestDriver25);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0 + "'", obj8, 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 0 + "'", obj10, 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(obj30);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test196");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        int int6 = stackTestDriver4.size();
        stackTestDriver4.clear();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        boolean boolean9 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        int int11 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver12 = new experiment.util.StackTestDriver();
        int int13 = stackTestDriver12.size();
        stackTestDriver12.clear();
        boolean boolean15 = stackTestDriver12.isEmpty();
        experiment.util.StackTestDriver stackTestDriver16 = new experiment.util.StackTestDriver();
        int int17 = stackTestDriver16.size();
        int int18 = stackTestDriver16.size();
        stackTestDriver16.clear();
        java.lang.Object obj20 = stackTestDriver12.push((java.lang.Object) stackTestDriver16);
        stackTestDriver12.clear();
        experiment.util.StackTestDriver stackTestDriver22 = new experiment.util.StackTestDriver();
        int int23 = stackTestDriver22.size();
        int int24 = stackTestDriver22.size();
        int int25 = stackTestDriver22.size();
        java.lang.Object obj26 = stackTestDriver12.push((java.lang.Object) int25);
        java.lang.Class<?> wildcardClass27 = stackTestDriver12.getClass();
        java.lang.Object obj28 = stackTestDriver0.push((java.lang.Object) stackTestDriver12);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 0 + "'", obj26, 0);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(obj28);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test197");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        int int6 = stackTestDriver4.size();
        stackTestDriver4.clear();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        stackTestDriver0.clear();
        java.lang.Object obj11 = stackTestDriver0.push((java.lang.Object) 10L);
        java.lang.Object obj12 = stackTestDriver0.peek();
        experiment.util.StackTestDriver stackTestDriver13 = new experiment.util.StackTestDriver();
        int int14 = stackTestDriver13.size();
        stackTestDriver13.clear();
        boolean boolean16 = stackTestDriver13.isEmpty();
        int int17 = stackTestDriver13.size();
        boolean boolean18 = stackTestDriver13.isEmpty();
        experiment.util.StackTestDriver stackTestDriver19 = new experiment.util.StackTestDriver();
        stackTestDriver19.clear();
        stackTestDriver19.clear();
        java.lang.Object obj23 = stackTestDriver19.push((java.lang.Object) 1L);
        java.lang.Object obj24 = stackTestDriver13.push((java.lang.Object) stackTestDriver19);
        java.lang.Object obj25 = stackTestDriver0.push((java.lang.Object) stackTestDriver13);
        experiment.util.StackTestDriver stackTestDriver26 = new experiment.util.StackTestDriver();
        stackTestDriver26.clear();
        java.lang.Object obj29 = stackTestDriver26.push((java.lang.Object) (short) 0);
        boolean boolean30 = stackTestDriver26.isEmpty();
        boolean boolean31 = stackTestDriver26.isEmpty();
        java.lang.Object obj32 = stackTestDriver0.push((java.lang.Object) stackTestDriver26);
        stackTestDriver26.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 10L + "'", obj11, 10L);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 10L + "'", obj12, 10L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 1L + "'", obj23, 1L);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + (short) 0 + "'", obj29, (short) 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(obj32);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test198");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        int int6 = stackTestDriver4.size();
        stackTestDriver4.clear();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        boolean boolean9 = stackTestDriver0.isEmpty();
        java.lang.Object obj10 = stackTestDriver0.peek();
        experiment.util.StackTestDriver stackTestDriver11 = new experiment.util.StackTestDriver();
        int int12 = stackTestDriver11.size();
        stackTestDriver11.clear();
        boolean boolean14 = stackTestDriver11.isEmpty();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        int int16 = stackTestDriver15.size();
        int int17 = stackTestDriver15.size();
        stackTestDriver15.clear();
        java.lang.Object obj19 = stackTestDriver11.push((java.lang.Object) stackTestDriver15);
        boolean boolean20 = stackTestDriver11.isEmpty();
        java.lang.Object obj21 = stackTestDriver0.push((java.lang.Object) stackTestDriver11);
        java.lang.Object obj22 = stackTestDriver11.peek();
        stackTestDriver11.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = stackTestDriver11.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(obj22);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test199");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        boolean boolean4 = stackTestDriver0.isEmpty();
        boolean boolean5 = stackTestDriver0.isEmpty();
        boolean boolean6 = stackTestDriver0.isEmpty();
        boolean boolean7 = stackTestDriver0.isEmpty();
        boolean boolean8 = stackTestDriver0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test200");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        int int6 = stackTestDriver4.size();
        stackTestDriver4.clear();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        boolean boolean9 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        int int11 = stackTestDriver10.size();
        int int12 = stackTestDriver10.size();
        int int13 = stackTestDriver10.size();
        boolean boolean14 = stackTestDriver10.isEmpty();
        boolean boolean15 = stackTestDriver10.isEmpty();
        experiment.util.StackTestDriver stackTestDriver16 = new experiment.util.StackTestDriver();
        int int17 = stackTestDriver16.size();
        stackTestDriver16.clear();
        stackTestDriver16.clear();
        experiment.util.StackTestDriver stackTestDriver20 = new experiment.util.StackTestDriver();
        int int21 = stackTestDriver20.size();
        stackTestDriver20.clear();
        boolean boolean23 = stackTestDriver20.isEmpty();
        boolean boolean24 = stackTestDriver20.isEmpty();
        java.lang.Object obj25 = stackTestDriver16.push((java.lang.Object) boolean24);
        java.lang.Class<?> wildcardClass26 = obj25.getClass();
        java.lang.Object obj27 = stackTestDriver10.push((java.lang.Object) wildcardClass26);
        experiment.util.StackTestDriver stackTestDriver28 = new experiment.util.StackTestDriver();
        int int29 = stackTestDriver28.size();
        stackTestDriver28.clear();
        boolean boolean31 = stackTestDriver28.isEmpty();
        experiment.util.StackTestDriver stackTestDriver32 = new experiment.util.StackTestDriver();
        int int33 = stackTestDriver32.size();
        int int34 = stackTestDriver32.size();
        stackTestDriver32.clear();
        java.lang.Object obj36 = stackTestDriver28.push((java.lang.Object) stackTestDriver32);
        boolean boolean37 = stackTestDriver28.isEmpty();
        java.lang.Object obj38 = stackTestDriver28.peek();
        java.lang.Object obj39 = stackTestDriver28.peek();
        java.lang.Object obj40 = stackTestDriver28.peek();
        boolean boolean41 = stackTestDriver28.isEmpty();
        experiment.util.StackTestDriver stackTestDriver42 = new experiment.util.StackTestDriver();
        int int43 = stackTestDriver42.size();
        stackTestDriver42.clear();
        boolean boolean45 = stackTestDriver42.isEmpty();
        experiment.util.StackTestDriver stackTestDriver46 = new experiment.util.StackTestDriver();
        int int47 = stackTestDriver46.size();
        int int48 = stackTestDriver46.size();
        stackTestDriver46.clear();
        java.lang.Object obj50 = stackTestDriver42.push((java.lang.Object) stackTestDriver46);
        stackTestDriver42.clear();
        int int52 = stackTestDriver42.size();
        experiment.util.StackTestDriver stackTestDriver53 = new experiment.util.StackTestDriver();
        int int54 = stackTestDriver53.size();
        stackTestDriver53.clear();
        boolean boolean56 = stackTestDriver53.isEmpty();
        experiment.util.StackTestDriver stackTestDriver57 = new experiment.util.StackTestDriver();
        int int58 = stackTestDriver57.size();
        int int59 = stackTestDriver57.size();
        stackTestDriver57.clear();
        java.lang.Object obj61 = stackTestDriver53.push((java.lang.Object) stackTestDriver57);
        boolean boolean62 = stackTestDriver53.isEmpty();
        java.lang.Object obj63 = stackTestDriver53.peek();
        experiment.util.StackTestDriver stackTestDriver64 = new experiment.util.StackTestDriver();
        int int65 = stackTestDriver64.size();
        stackTestDriver64.clear();
        boolean boolean67 = stackTestDriver64.isEmpty();
        experiment.util.StackTestDriver stackTestDriver68 = new experiment.util.StackTestDriver();
        int int69 = stackTestDriver68.size();
        int int70 = stackTestDriver68.size();
        stackTestDriver68.clear();
        java.lang.Object obj72 = stackTestDriver64.push((java.lang.Object) stackTestDriver68);
        boolean boolean73 = stackTestDriver64.isEmpty();
        java.lang.Object obj74 = stackTestDriver53.push((java.lang.Object) stackTestDriver64);
        java.lang.Object obj75 = stackTestDriver42.push((java.lang.Object) stackTestDriver53);
        experiment.util.StackTestDriver stackTestDriver76 = new experiment.util.StackTestDriver();
        stackTestDriver76.clear();
        stackTestDriver76.clear();
        java.lang.Class<?> wildcardClass79 = stackTestDriver76.getClass();
        java.lang.Object obj80 = stackTestDriver42.push((java.lang.Object) wildcardClass79);
        stackTestDriver42.clear();
        java.lang.Object obj82 = stackTestDriver28.push((java.lang.Object) stackTestDriver42);
        int int83 = stackTestDriver42.size();
        boolean boolean84 = stackTestDriver42.isEmpty();
        java.lang.Object obj85 = stackTestDriver10.push((java.lang.Object) boolean84);
        java.lang.Object obj86 = stackTestDriver0.push((java.lang.Object) boolean84);
        stackTestDriver0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + true + "'", obj25, true);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertEquals(obj27.toString(), "class java.lang.Boolean");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj27), "class java.lang.Boolean");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj27), "class java.lang.Boolean");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(obj50);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNotNull(obj61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(obj63);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertNotNull(obj72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(obj74);
        org.junit.Assert.assertNotNull(obj75);
        org.junit.Assert.assertNotNull(wildcardClass79);
        org.junit.Assert.assertNotNull(obj80);
        org.junit.Assert.assertEquals(obj80.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj80), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj80), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertNotNull(obj82);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertEquals("'" + obj85 + "' != '" + true + "'", obj85, true);
        org.junit.Assert.assertEquals("'" + obj86 + "' != '" + true + "'", obj86, true);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test201");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        stackTestDriver4.clear();
        boolean boolean7 = stackTestDriver4.isEmpty();
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        int int9 = stackTestDriver8.size();
        int int10 = stackTestDriver8.size();
        stackTestDriver8.clear();
        java.lang.Object obj12 = stackTestDriver4.push((java.lang.Object) stackTestDriver8);
        stackTestDriver4.clear();
        int int14 = stackTestDriver4.size();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        int int16 = stackTestDriver15.size();
        stackTestDriver15.clear();
        boolean boolean18 = stackTestDriver15.isEmpty();
        experiment.util.StackTestDriver stackTestDriver19 = new experiment.util.StackTestDriver();
        int int20 = stackTestDriver19.size();
        int int21 = stackTestDriver19.size();
        stackTestDriver19.clear();
        java.lang.Object obj23 = stackTestDriver15.push((java.lang.Object) stackTestDriver19);
        boolean boolean24 = stackTestDriver15.isEmpty();
        java.lang.Object obj25 = stackTestDriver15.peek();
        experiment.util.StackTestDriver stackTestDriver26 = new experiment.util.StackTestDriver();
        int int27 = stackTestDriver26.size();
        stackTestDriver26.clear();
        boolean boolean29 = stackTestDriver26.isEmpty();
        experiment.util.StackTestDriver stackTestDriver30 = new experiment.util.StackTestDriver();
        int int31 = stackTestDriver30.size();
        int int32 = stackTestDriver30.size();
        stackTestDriver30.clear();
        java.lang.Object obj34 = stackTestDriver26.push((java.lang.Object) stackTestDriver30);
        boolean boolean35 = stackTestDriver26.isEmpty();
        java.lang.Object obj36 = stackTestDriver15.push((java.lang.Object) stackTestDriver26);
        java.lang.Object obj37 = stackTestDriver4.push((java.lang.Object) stackTestDriver15);
        java.lang.Object obj38 = stackTestDriver4.pop();
        java.lang.Object obj39 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        boolean boolean40 = stackTestDriver4.isEmpty();
        experiment.util.StackTestDriver stackTestDriver41 = new experiment.util.StackTestDriver();
        int int42 = stackTestDriver41.size();
        stackTestDriver41.clear();
        boolean boolean44 = stackTestDriver41.isEmpty();
        experiment.util.StackTestDriver stackTestDriver45 = new experiment.util.StackTestDriver();
        int int46 = stackTestDriver45.size();
        int int47 = stackTestDriver45.size();
        stackTestDriver45.clear();
        java.lang.Object obj49 = stackTestDriver41.push((java.lang.Object) stackTestDriver45);
        boolean boolean50 = stackTestDriver41.isEmpty();
        java.lang.Object obj51 = stackTestDriver41.peek();
        int int52 = stackTestDriver41.size();
        java.lang.Object obj53 = stackTestDriver4.push((java.lang.Object) stackTestDriver41);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(obj51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertNotNull(obj53);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test202");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        int int4 = stackTestDriver0.size();
        boolean boolean5 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        stackTestDriver6.clear();
        stackTestDriver6.clear();
        java.lang.Object obj10 = stackTestDriver6.push((java.lang.Object) 1L);
        java.lang.Object obj11 = stackTestDriver0.push((java.lang.Object) stackTestDriver6);
        boolean boolean12 = stackTestDriver6.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 1L + "'", obj10, 1L);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test203");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        int int6 = stackTestDriver4.size();
        stackTestDriver4.clear();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        boolean boolean9 = stackTestDriver0.isEmpty();
        java.lang.Object obj10 = stackTestDriver0.peek();
        experiment.util.StackTestDriver stackTestDriver11 = new experiment.util.StackTestDriver();
        int int12 = stackTestDriver11.size();
        stackTestDriver11.clear();
        boolean boolean14 = stackTestDriver11.isEmpty();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        int int16 = stackTestDriver15.size();
        int int17 = stackTestDriver15.size();
        stackTestDriver15.clear();
        java.lang.Object obj19 = stackTestDriver11.push((java.lang.Object) stackTestDriver15);
        boolean boolean20 = stackTestDriver11.isEmpty();
        java.lang.Object obj21 = stackTestDriver0.push((java.lang.Object) stackTestDriver11);
        java.lang.Object obj22 = stackTestDriver0.peek();
        java.lang.Object obj23 = stackTestDriver0.pop();
        boolean boolean24 = stackTestDriver0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test204");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        int int2 = stackTestDriver0.size();
        stackTestDriver0.clear();
        int int4 = stackTestDriver0.size();
        int int5 = stackTestDriver0.size();
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) "hi!");
        java.lang.Object obj8 = stackTestDriver0.pop();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + "hi!" + "'", obj7, "hi!");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "hi!" + "'", obj8, "hi!");
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test205");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        int int6 = stackTestDriver4.size();
        stackTestDriver4.clear();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        boolean boolean9 = stackTestDriver0.isEmpty();
        java.lang.Object obj10 = stackTestDriver0.peek();
        java.lang.Object obj12 = stackTestDriver0.push((java.lang.Object) (-1L));
        boolean boolean13 = stackTestDriver0.isEmpty();
        int int14 = stackTestDriver0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (-1L) + "'", obj12, (-1L));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test206");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        int int6 = stackTestDriver4.size();
        stackTestDriver4.clear();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        boolean boolean9 = stackTestDriver0.isEmpty();
        java.lang.Object obj10 = stackTestDriver0.peek();
        experiment.util.StackTestDriver stackTestDriver11 = new experiment.util.StackTestDriver();
        int int12 = stackTestDriver11.size();
        stackTestDriver11.clear();
        boolean boolean14 = stackTestDriver11.isEmpty();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        int int16 = stackTestDriver15.size();
        int int17 = stackTestDriver15.size();
        stackTestDriver15.clear();
        java.lang.Object obj19 = stackTestDriver11.push((java.lang.Object) stackTestDriver15);
        boolean boolean20 = stackTestDriver11.isEmpty();
        java.lang.Object obj21 = stackTestDriver0.push((java.lang.Object) stackTestDriver11);
        java.lang.Object obj22 = stackTestDriver11.peek();
        int int23 = stackTestDriver11.size();
        experiment.util.StackTestDriver stackTestDriver24 = new experiment.util.StackTestDriver();
        stackTestDriver24.clear();
        experiment.util.StackTestDriver stackTestDriver26 = new experiment.util.StackTestDriver();
        int int27 = stackTestDriver26.size();
        stackTestDriver26.clear();
        boolean boolean29 = stackTestDriver26.isEmpty();
        experiment.util.StackTestDriver stackTestDriver30 = new experiment.util.StackTestDriver();
        int int31 = stackTestDriver30.size();
        int int32 = stackTestDriver30.size();
        stackTestDriver30.clear();
        java.lang.Object obj34 = stackTestDriver26.push((java.lang.Object) stackTestDriver30);
        stackTestDriver26.clear();
        int int36 = stackTestDriver26.size();
        experiment.util.StackTestDriver stackTestDriver37 = new experiment.util.StackTestDriver();
        int int38 = stackTestDriver37.size();
        stackTestDriver37.clear();
        boolean boolean40 = stackTestDriver37.isEmpty();
        experiment.util.StackTestDriver stackTestDriver41 = new experiment.util.StackTestDriver();
        int int42 = stackTestDriver41.size();
        int int43 = stackTestDriver41.size();
        stackTestDriver41.clear();
        java.lang.Object obj45 = stackTestDriver37.push((java.lang.Object) stackTestDriver41);
        boolean boolean46 = stackTestDriver37.isEmpty();
        java.lang.Object obj47 = stackTestDriver37.peek();
        experiment.util.StackTestDriver stackTestDriver48 = new experiment.util.StackTestDriver();
        int int49 = stackTestDriver48.size();
        stackTestDriver48.clear();
        boolean boolean51 = stackTestDriver48.isEmpty();
        experiment.util.StackTestDriver stackTestDriver52 = new experiment.util.StackTestDriver();
        int int53 = stackTestDriver52.size();
        int int54 = stackTestDriver52.size();
        stackTestDriver52.clear();
        java.lang.Object obj56 = stackTestDriver48.push((java.lang.Object) stackTestDriver52);
        boolean boolean57 = stackTestDriver48.isEmpty();
        java.lang.Object obj58 = stackTestDriver37.push((java.lang.Object) stackTestDriver48);
        java.lang.Object obj59 = stackTestDriver26.push((java.lang.Object) stackTestDriver37);
        java.lang.Object obj60 = stackTestDriver24.push((java.lang.Object) stackTestDriver37);
        java.lang.Object obj61 = stackTestDriver11.push((java.lang.Object) stackTestDriver24);
        java.lang.Object obj62 = stackTestDriver24.peek();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(obj56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(obj58);
        org.junit.Assert.assertNotNull(obj59);
        org.junit.Assert.assertNotNull(obj60);
        org.junit.Assert.assertNotNull(obj61);
        org.junit.Assert.assertNotNull(obj62);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test207");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        int int6 = stackTestDriver4.size();
        stackTestDriver4.clear();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        stackTestDriver0.clear();
        java.lang.Object obj11 = stackTestDriver0.push((java.lang.Object) 10L);
        java.lang.Object obj12 = stackTestDriver0.peek();
        experiment.util.StackTestDriver stackTestDriver13 = new experiment.util.StackTestDriver();
        int int14 = stackTestDriver13.size();
        stackTestDriver13.clear();
        boolean boolean16 = stackTestDriver13.isEmpty();
        int int17 = stackTestDriver13.size();
        boolean boolean18 = stackTestDriver13.isEmpty();
        experiment.util.StackTestDriver stackTestDriver19 = new experiment.util.StackTestDriver();
        stackTestDriver19.clear();
        stackTestDriver19.clear();
        java.lang.Object obj23 = stackTestDriver19.push((java.lang.Object) 1L);
        java.lang.Object obj24 = stackTestDriver13.push((java.lang.Object) stackTestDriver19);
        java.lang.Object obj25 = stackTestDriver0.push((java.lang.Object) stackTestDriver13);
        experiment.util.StackTestDriver stackTestDriver26 = new experiment.util.StackTestDriver();
        stackTestDriver26.clear();
        java.lang.Object obj29 = stackTestDriver26.push((java.lang.Object) (short) 0);
        boolean boolean30 = stackTestDriver26.isEmpty();
        boolean boolean31 = stackTestDriver26.isEmpty();
        java.lang.Object obj32 = stackTestDriver0.push((java.lang.Object) stackTestDriver26);
        int int33 = stackTestDriver0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 10L + "'", obj11, 10L);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 10L + "'", obj12, 10L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 1L + "'", obj23, 1L);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + (short) 0 + "'", obj29, (short) 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 3 + "'", int33 == 3);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test208");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        int int6 = stackTestDriver4.size();
        stackTestDriver4.clear();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        boolean boolean9 = stackTestDriver0.isEmpty();
        java.lang.Object obj10 = stackTestDriver0.peek();
        java.lang.Object obj11 = stackTestDriver0.peek();
        java.lang.Object obj12 = stackTestDriver0.peek();
        boolean boolean13 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver14 = new experiment.util.StackTestDriver();
        int int15 = stackTestDriver14.size();
        stackTestDriver14.clear();
        boolean boolean17 = stackTestDriver14.isEmpty();
        experiment.util.StackTestDriver stackTestDriver18 = new experiment.util.StackTestDriver();
        int int19 = stackTestDriver18.size();
        int int20 = stackTestDriver18.size();
        stackTestDriver18.clear();
        java.lang.Object obj22 = stackTestDriver14.push((java.lang.Object) stackTestDriver18);
        stackTestDriver14.clear();
        int int24 = stackTestDriver14.size();
        experiment.util.StackTestDriver stackTestDriver25 = new experiment.util.StackTestDriver();
        int int26 = stackTestDriver25.size();
        stackTestDriver25.clear();
        boolean boolean28 = stackTestDriver25.isEmpty();
        experiment.util.StackTestDriver stackTestDriver29 = new experiment.util.StackTestDriver();
        int int30 = stackTestDriver29.size();
        int int31 = stackTestDriver29.size();
        stackTestDriver29.clear();
        java.lang.Object obj33 = stackTestDriver25.push((java.lang.Object) stackTestDriver29);
        boolean boolean34 = stackTestDriver25.isEmpty();
        java.lang.Object obj35 = stackTestDriver25.peek();
        experiment.util.StackTestDriver stackTestDriver36 = new experiment.util.StackTestDriver();
        int int37 = stackTestDriver36.size();
        stackTestDriver36.clear();
        boolean boolean39 = stackTestDriver36.isEmpty();
        experiment.util.StackTestDriver stackTestDriver40 = new experiment.util.StackTestDriver();
        int int41 = stackTestDriver40.size();
        int int42 = stackTestDriver40.size();
        stackTestDriver40.clear();
        java.lang.Object obj44 = stackTestDriver36.push((java.lang.Object) stackTestDriver40);
        boolean boolean45 = stackTestDriver36.isEmpty();
        java.lang.Object obj46 = stackTestDriver25.push((java.lang.Object) stackTestDriver36);
        java.lang.Object obj47 = stackTestDriver14.push((java.lang.Object) stackTestDriver25);
        experiment.util.StackTestDriver stackTestDriver48 = new experiment.util.StackTestDriver();
        stackTestDriver48.clear();
        stackTestDriver48.clear();
        java.lang.Class<?> wildcardClass51 = stackTestDriver48.getClass();
        java.lang.Object obj52 = stackTestDriver14.push((java.lang.Object) wildcardClass51);
        stackTestDriver14.clear();
        java.lang.Object obj54 = stackTestDriver0.push((java.lang.Object) stackTestDriver14);
        int int55 = stackTestDriver14.size();
        boolean boolean56 = stackTestDriver14.isEmpty();
        java.lang.Class<?> wildcardClass57 = stackTestDriver14.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNotNull(obj52);
        org.junit.Assert.assertEquals(obj52.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj52), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj52), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertNotNull(obj54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test209");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        int int6 = stackTestDriver4.size();
        stackTestDriver4.clear();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        boolean boolean9 = stackTestDriver4.isEmpty();
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        stackTestDriver10.clear();
        java.lang.Object obj13 = stackTestDriver10.push((java.lang.Object) (short) 0);
        boolean boolean14 = stackTestDriver10.isEmpty();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        int int16 = stackTestDriver15.size();
        stackTestDriver15.clear();
        boolean boolean18 = stackTestDriver15.isEmpty();
        experiment.util.StackTestDriver stackTestDriver19 = new experiment.util.StackTestDriver();
        int int20 = stackTestDriver19.size();
        int int21 = stackTestDriver19.size();
        stackTestDriver19.clear();
        java.lang.Object obj23 = stackTestDriver15.push((java.lang.Object) stackTestDriver19);
        boolean boolean24 = stackTestDriver15.isEmpty();
        java.lang.Object obj25 = stackTestDriver15.peek();
        java.lang.Object obj26 = stackTestDriver15.peek();
        java.lang.Object obj27 = stackTestDriver15.peek();
        java.lang.Object obj28 = stackTestDriver10.push((java.lang.Object) stackTestDriver15);
        int int29 = stackTestDriver15.size();
        java.lang.Object obj30 = stackTestDriver4.push((java.lang.Object) int29);
        java.lang.Object obj31 = stackTestDriver4.peek();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (short) 0 + "'", obj13, (short) 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + 1 + "'", obj30, 1);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 1 + "'", obj31, 1);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test210");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver3 = new experiment.util.StackTestDriver();
        int int4 = stackTestDriver3.size();
        int int5 = stackTestDriver3.size();
        stackTestDriver3.clear();
        int int7 = stackTestDriver3.size();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) int7);
        experiment.util.StackTestDriver stackTestDriver9 = new experiment.util.StackTestDriver();
        int int10 = stackTestDriver9.size();
        stackTestDriver9.clear();
        boolean boolean12 = stackTestDriver9.isEmpty();
        experiment.util.StackTestDriver stackTestDriver13 = new experiment.util.StackTestDriver();
        int int14 = stackTestDriver13.size();
        int int15 = stackTestDriver13.size();
        stackTestDriver13.clear();
        java.lang.Object obj17 = stackTestDriver9.push((java.lang.Object) stackTestDriver13);
        boolean boolean18 = stackTestDriver9.isEmpty();
        java.lang.Object obj19 = stackTestDriver9.peek();
        experiment.util.StackTestDriver stackTestDriver20 = new experiment.util.StackTestDriver();
        int int21 = stackTestDriver20.size();
        stackTestDriver20.clear();
        boolean boolean23 = stackTestDriver20.isEmpty();
        experiment.util.StackTestDriver stackTestDriver24 = new experiment.util.StackTestDriver();
        int int25 = stackTestDriver24.size();
        int int26 = stackTestDriver24.size();
        stackTestDriver24.clear();
        java.lang.Object obj28 = stackTestDriver20.push((java.lang.Object) stackTestDriver24);
        boolean boolean29 = stackTestDriver20.isEmpty();
        java.lang.Object obj30 = stackTestDriver9.push((java.lang.Object) stackTestDriver20);
        java.lang.Object obj31 = stackTestDriver0.push((java.lang.Object) stackTestDriver9);
        java.lang.Object obj32 = stackTestDriver9.peek();
        java.lang.Class<?> wildcardClass33 = stackTestDriver9.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0 + "'", obj8, 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test211");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver2 = new experiment.util.StackTestDriver();
        int int3 = stackTestDriver2.size();
        stackTestDriver2.clear();
        boolean boolean5 = stackTestDriver2.isEmpty();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        int int7 = stackTestDriver6.size();
        int int8 = stackTestDriver6.size();
        stackTestDriver6.clear();
        java.lang.Object obj10 = stackTestDriver2.push((java.lang.Object) stackTestDriver6);
        stackTestDriver2.clear();
        int int12 = stackTestDriver2.size();
        experiment.util.StackTestDriver stackTestDriver13 = new experiment.util.StackTestDriver();
        int int14 = stackTestDriver13.size();
        stackTestDriver13.clear();
        boolean boolean16 = stackTestDriver13.isEmpty();
        experiment.util.StackTestDriver stackTestDriver17 = new experiment.util.StackTestDriver();
        int int18 = stackTestDriver17.size();
        int int19 = stackTestDriver17.size();
        stackTestDriver17.clear();
        java.lang.Object obj21 = stackTestDriver13.push((java.lang.Object) stackTestDriver17);
        boolean boolean22 = stackTestDriver13.isEmpty();
        java.lang.Object obj23 = stackTestDriver13.peek();
        experiment.util.StackTestDriver stackTestDriver24 = new experiment.util.StackTestDriver();
        int int25 = stackTestDriver24.size();
        stackTestDriver24.clear();
        boolean boolean27 = stackTestDriver24.isEmpty();
        experiment.util.StackTestDriver stackTestDriver28 = new experiment.util.StackTestDriver();
        int int29 = stackTestDriver28.size();
        int int30 = stackTestDriver28.size();
        stackTestDriver28.clear();
        java.lang.Object obj32 = stackTestDriver24.push((java.lang.Object) stackTestDriver28);
        boolean boolean33 = stackTestDriver24.isEmpty();
        java.lang.Object obj34 = stackTestDriver13.push((java.lang.Object) stackTestDriver24);
        java.lang.Object obj35 = stackTestDriver2.push((java.lang.Object) stackTestDriver13);
        java.lang.Object obj36 = stackTestDriver0.push((java.lang.Object) stackTestDriver13);
        experiment.util.StackTestDriver stackTestDriver37 = new experiment.util.StackTestDriver();
        stackTestDriver37.clear();
        stackTestDriver37.clear();
        java.lang.Object obj40 = stackTestDriver0.push((java.lang.Object) stackTestDriver37);
        experiment.util.StackTestDriver stackTestDriver41 = new experiment.util.StackTestDriver();
        int int42 = stackTestDriver41.size();
        stackTestDriver41.clear();
        boolean boolean44 = stackTestDriver41.isEmpty();
        experiment.util.StackTestDriver stackTestDriver45 = new experiment.util.StackTestDriver();
        int int46 = stackTestDriver45.size();
        int int47 = stackTestDriver45.size();
        stackTestDriver45.clear();
        java.lang.Object obj49 = stackTestDriver41.push((java.lang.Object) stackTestDriver45);
        boolean boolean50 = stackTestDriver41.isEmpty();
        java.lang.Object obj51 = stackTestDriver41.peek();
        java.lang.Object obj52 = stackTestDriver0.push(obj51);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(obj51);
        org.junit.Assert.assertNotNull(obj52);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test212");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        int int6 = stackTestDriver4.size();
        stackTestDriver4.clear();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        stackTestDriver0.clear();
        int int10 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver11 = new experiment.util.StackTestDriver();
        int int12 = stackTestDriver11.size();
        int int13 = stackTestDriver11.size();
        int int14 = stackTestDriver11.size();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        int int16 = stackTestDriver15.size();
        stackTestDriver15.clear();
        boolean boolean18 = stackTestDriver15.isEmpty();
        experiment.util.StackTestDriver stackTestDriver19 = new experiment.util.StackTestDriver();
        int int20 = stackTestDriver19.size();
        int int21 = stackTestDriver19.size();
        stackTestDriver19.clear();
        java.lang.Object obj23 = stackTestDriver15.push((java.lang.Object) stackTestDriver19);
        stackTestDriver15.clear();
        int int25 = stackTestDriver15.size();
        experiment.util.StackTestDriver stackTestDriver26 = new experiment.util.StackTestDriver();
        int int27 = stackTestDriver26.size();
        stackTestDriver26.clear();
        boolean boolean29 = stackTestDriver26.isEmpty();
        experiment.util.StackTestDriver stackTestDriver30 = new experiment.util.StackTestDriver();
        int int31 = stackTestDriver30.size();
        int int32 = stackTestDriver30.size();
        stackTestDriver30.clear();
        java.lang.Object obj34 = stackTestDriver26.push((java.lang.Object) stackTestDriver30);
        boolean boolean35 = stackTestDriver26.isEmpty();
        java.lang.Object obj36 = stackTestDriver26.peek();
        experiment.util.StackTestDriver stackTestDriver37 = new experiment.util.StackTestDriver();
        int int38 = stackTestDriver37.size();
        stackTestDriver37.clear();
        boolean boolean40 = stackTestDriver37.isEmpty();
        experiment.util.StackTestDriver stackTestDriver41 = new experiment.util.StackTestDriver();
        int int42 = stackTestDriver41.size();
        int int43 = stackTestDriver41.size();
        stackTestDriver41.clear();
        java.lang.Object obj45 = stackTestDriver37.push((java.lang.Object) stackTestDriver41);
        boolean boolean46 = stackTestDriver37.isEmpty();
        java.lang.Object obj47 = stackTestDriver26.push((java.lang.Object) stackTestDriver37);
        java.lang.Object obj48 = stackTestDriver15.push((java.lang.Object) stackTestDriver26);
        java.lang.Object obj49 = stackTestDriver15.pop();
        java.lang.Object obj50 = stackTestDriver11.push((java.lang.Object) stackTestDriver15);
        java.lang.Object obj51 = stackTestDriver0.push((java.lang.Object) stackTestDriver15);
        experiment.util.StackTestDriver stackTestDriver52 = new experiment.util.StackTestDriver();
        int int53 = stackTestDriver52.size();
        int int54 = stackTestDriver52.size();
        int int55 = stackTestDriver52.size();
        boolean boolean56 = stackTestDriver52.isEmpty();
        boolean boolean57 = stackTestDriver52.isEmpty();
        experiment.util.StackTestDriver stackTestDriver58 = new experiment.util.StackTestDriver();
        stackTestDriver58.clear();
        stackTestDriver58.clear();
        stackTestDriver58.clear();
        java.lang.Object obj62 = stackTestDriver52.push((java.lang.Object) stackTestDriver58);
        experiment.util.StackTestDriver stackTestDriver63 = new experiment.util.StackTestDriver();
        int int64 = stackTestDriver63.size();
        stackTestDriver63.clear();
        boolean boolean66 = stackTestDriver63.isEmpty();
        experiment.util.StackTestDriver stackTestDriver67 = new experiment.util.StackTestDriver();
        int int68 = stackTestDriver67.size();
        int int69 = stackTestDriver67.size();
        stackTestDriver67.clear();
        java.lang.Object obj71 = stackTestDriver63.push((java.lang.Object) stackTestDriver67);
        boolean boolean72 = stackTestDriver63.isEmpty();
        java.lang.Object obj73 = stackTestDriver63.peek();
        experiment.util.StackTestDriver stackTestDriver74 = new experiment.util.StackTestDriver();
        int int75 = stackTestDriver74.size();
        stackTestDriver74.clear();
        boolean boolean77 = stackTestDriver74.isEmpty();
        experiment.util.StackTestDriver stackTestDriver78 = new experiment.util.StackTestDriver();
        int int79 = stackTestDriver78.size();
        int int80 = stackTestDriver78.size();
        stackTestDriver78.clear();
        java.lang.Object obj82 = stackTestDriver74.push((java.lang.Object) stackTestDriver78);
        boolean boolean83 = stackTestDriver74.isEmpty();
        java.lang.Object obj84 = stackTestDriver63.push((java.lang.Object) stackTestDriver74);
        java.lang.Object obj85 = stackTestDriver74.peek();
        java.lang.Object obj86 = stackTestDriver58.push(obj85);
        java.lang.Object obj87 = stackTestDriver15.push(obj86);
        java.lang.Class<?> wildcardClass88 = obj87.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertNotNull(obj50);
        org.junit.Assert.assertNotNull(obj51);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(obj62);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNotNull(obj71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(obj73);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
        org.junit.Assert.assertNotNull(obj82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(obj84);
        org.junit.Assert.assertNotNull(obj85);
        org.junit.Assert.assertNotNull(obj86);
        org.junit.Assert.assertNotNull(obj87);
        org.junit.Assert.assertNotNull(wildcardClass88);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test213");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        int int6 = stackTestDriver4.size();
        stackTestDriver4.clear();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        stackTestDriver0.clear();
        int int10 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver11 = new experiment.util.StackTestDriver();
        int int12 = stackTestDriver11.size();
        int int13 = stackTestDriver11.size();
        int int14 = stackTestDriver11.size();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        int int16 = stackTestDriver15.size();
        stackTestDriver15.clear();
        boolean boolean18 = stackTestDriver15.isEmpty();
        experiment.util.StackTestDriver stackTestDriver19 = new experiment.util.StackTestDriver();
        int int20 = stackTestDriver19.size();
        int int21 = stackTestDriver19.size();
        stackTestDriver19.clear();
        java.lang.Object obj23 = stackTestDriver15.push((java.lang.Object) stackTestDriver19);
        stackTestDriver15.clear();
        int int25 = stackTestDriver15.size();
        experiment.util.StackTestDriver stackTestDriver26 = new experiment.util.StackTestDriver();
        int int27 = stackTestDriver26.size();
        stackTestDriver26.clear();
        boolean boolean29 = stackTestDriver26.isEmpty();
        experiment.util.StackTestDriver stackTestDriver30 = new experiment.util.StackTestDriver();
        int int31 = stackTestDriver30.size();
        int int32 = stackTestDriver30.size();
        stackTestDriver30.clear();
        java.lang.Object obj34 = stackTestDriver26.push((java.lang.Object) stackTestDriver30);
        boolean boolean35 = stackTestDriver26.isEmpty();
        java.lang.Object obj36 = stackTestDriver26.peek();
        experiment.util.StackTestDriver stackTestDriver37 = new experiment.util.StackTestDriver();
        int int38 = stackTestDriver37.size();
        stackTestDriver37.clear();
        boolean boolean40 = stackTestDriver37.isEmpty();
        experiment.util.StackTestDriver stackTestDriver41 = new experiment.util.StackTestDriver();
        int int42 = stackTestDriver41.size();
        int int43 = stackTestDriver41.size();
        stackTestDriver41.clear();
        java.lang.Object obj45 = stackTestDriver37.push((java.lang.Object) stackTestDriver41);
        boolean boolean46 = stackTestDriver37.isEmpty();
        java.lang.Object obj47 = stackTestDriver26.push((java.lang.Object) stackTestDriver37);
        java.lang.Object obj48 = stackTestDriver15.push((java.lang.Object) stackTestDriver26);
        java.lang.Object obj49 = stackTestDriver15.pop();
        java.lang.Object obj50 = stackTestDriver11.push((java.lang.Object) stackTestDriver15);
        java.lang.Object obj51 = stackTestDriver0.push((java.lang.Object) stackTestDriver15);
        java.lang.Object obj52 = stackTestDriver0.peek();
        java.lang.Object obj53 = stackTestDriver0.peek();
        java.lang.Object obj54 = stackTestDriver0.pop();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertNotNull(obj50);
        org.junit.Assert.assertNotNull(obj51);
        org.junit.Assert.assertNotNull(obj52);
        org.junit.Assert.assertNotNull(obj53);
        org.junit.Assert.assertNotNull(obj54);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test214");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        boolean boolean4 = stackTestDriver0.isEmpty();
        boolean boolean5 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test215");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        boolean boolean4 = stackTestDriver0.isEmpty();
        boolean boolean5 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        int int7 = stackTestDriver0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test216");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        int int6 = stackTestDriver4.size();
        stackTestDriver4.clear();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        boolean boolean9 = stackTestDriver0.isEmpty();
        java.lang.Object obj10 = stackTestDriver0.peek();
        int int11 = stackTestDriver0.size();
        boolean boolean12 = stackTestDriver0.isEmpty();
        java.lang.Object obj13 = stackTestDriver0.peek();
        java.lang.Object obj14 = stackTestDriver0.peek();
        java.lang.Object obj15 = stackTestDriver0.peek();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test217");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        java.lang.Object obj3 = stackTestDriver0.push((java.lang.Object) (short) 0);
        int int4 = stackTestDriver0.size();
        boolean boolean5 = stackTestDriver0.isEmpty();
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) (-1.0d));
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        stackTestDriver8.clear();
        java.lang.Object obj11 = stackTestDriver8.push((java.lang.Object) (short) 0);
        int int12 = stackTestDriver8.size();
        boolean boolean13 = stackTestDriver8.isEmpty();
        java.lang.Object obj14 = stackTestDriver0.push((java.lang.Object) stackTestDriver8);
        java.lang.Object obj15 = stackTestDriver8.peek();
        experiment.util.StackTestDriver stackTestDriver16 = new experiment.util.StackTestDriver();
        int int17 = stackTestDriver16.size();
        stackTestDriver16.clear();
        boolean boolean19 = stackTestDriver16.isEmpty();
        experiment.util.StackTestDriver stackTestDriver20 = new experiment.util.StackTestDriver();
        int int21 = stackTestDriver20.size();
        int int22 = stackTestDriver20.size();
        stackTestDriver20.clear();
        java.lang.Object obj24 = stackTestDriver16.push((java.lang.Object) stackTestDriver20);
        stackTestDriver16.clear();
        int int26 = stackTestDriver16.size();
        experiment.util.StackTestDriver stackTestDriver27 = new experiment.util.StackTestDriver();
        int int28 = stackTestDriver27.size();
        stackTestDriver27.clear();
        boolean boolean30 = stackTestDriver27.isEmpty();
        experiment.util.StackTestDriver stackTestDriver31 = new experiment.util.StackTestDriver();
        int int32 = stackTestDriver31.size();
        int int33 = stackTestDriver31.size();
        stackTestDriver31.clear();
        java.lang.Object obj35 = stackTestDriver27.push((java.lang.Object) stackTestDriver31);
        boolean boolean36 = stackTestDriver27.isEmpty();
        java.lang.Object obj37 = stackTestDriver27.peek();
        experiment.util.StackTestDriver stackTestDriver38 = new experiment.util.StackTestDriver();
        int int39 = stackTestDriver38.size();
        stackTestDriver38.clear();
        boolean boolean41 = stackTestDriver38.isEmpty();
        experiment.util.StackTestDriver stackTestDriver42 = new experiment.util.StackTestDriver();
        int int43 = stackTestDriver42.size();
        int int44 = stackTestDriver42.size();
        stackTestDriver42.clear();
        java.lang.Object obj46 = stackTestDriver38.push((java.lang.Object) stackTestDriver42);
        boolean boolean47 = stackTestDriver38.isEmpty();
        java.lang.Object obj48 = stackTestDriver27.push((java.lang.Object) stackTestDriver38);
        java.lang.Object obj49 = stackTestDriver16.push((java.lang.Object) stackTestDriver27);
        experiment.util.StackTestDriver stackTestDriver50 = new experiment.util.StackTestDriver();
        int int51 = stackTestDriver50.size();
        stackTestDriver50.clear();
        boolean boolean53 = stackTestDriver50.isEmpty();
        experiment.util.StackTestDriver stackTestDriver54 = new experiment.util.StackTestDriver();
        int int55 = stackTestDriver54.size();
        int int56 = stackTestDriver54.size();
        stackTestDriver54.clear();
        java.lang.Object obj58 = stackTestDriver50.push((java.lang.Object) stackTestDriver54);
        stackTestDriver50.clear();
        int int60 = stackTestDriver50.size();
        experiment.util.StackTestDriver stackTestDriver61 = new experiment.util.StackTestDriver();
        int int62 = stackTestDriver61.size();
        stackTestDriver61.clear();
        boolean boolean64 = stackTestDriver61.isEmpty();
        experiment.util.StackTestDriver stackTestDriver65 = new experiment.util.StackTestDriver();
        int int66 = stackTestDriver65.size();
        int int67 = stackTestDriver65.size();
        stackTestDriver65.clear();
        java.lang.Object obj69 = stackTestDriver61.push((java.lang.Object) stackTestDriver65);
        boolean boolean70 = stackTestDriver61.isEmpty();
        java.lang.Object obj71 = stackTestDriver61.peek();
        experiment.util.StackTestDriver stackTestDriver72 = new experiment.util.StackTestDriver();
        int int73 = stackTestDriver72.size();
        stackTestDriver72.clear();
        boolean boolean75 = stackTestDriver72.isEmpty();
        experiment.util.StackTestDriver stackTestDriver76 = new experiment.util.StackTestDriver();
        int int77 = stackTestDriver76.size();
        int int78 = stackTestDriver76.size();
        stackTestDriver76.clear();
        java.lang.Object obj80 = stackTestDriver72.push((java.lang.Object) stackTestDriver76);
        boolean boolean81 = stackTestDriver72.isEmpty();
        java.lang.Object obj82 = stackTestDriver61.push((java.lang.Object) stackTestDriver72);
        java.lang.Object obj83 = stackTestDriver50.push((java.lang.Object) stackTestDriver61);
        java.lang.Object obj84 = stackTestDriver50.pop();
        java.lang.Object obj85 = stackTestDriver16.push((java.lang.Object) stackTestDriver50);
        java.lang.Object obj86 = stackTestDriver8.push((java.lang.Object) stackTestDriver50);
        stackTestDriver50.clear();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (short) 0 + "'", obj3, (short) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (short) 0 + "'", obj11, (short) 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (short) 0 + "'", obj15, (short) 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(obj58);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNotNull(obj69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(obj71);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertNotNull(obj80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(obj82);
        org.junit.Assert.assertNotNull(obj83);
        org.junit.Assert.assertNotNull(obj84);
        org.junit.Assert.assertNotNull(obj85);
        org.junit.Assert.assertNotNull(obj86);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test218");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        int int6 = stackTestDriver4.size();
        stackTestDriver4.clear();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        stackTestDriver0.clear();
        java.lang.Object obj11 = stackTestDriver0.push((java.lang.Object) 10L);
        java.lang.Object obj12 = stackTestDriver0.peek();
        experiment.util.StackTestDriver stackTestDriver13 = new experiment.util.StackTestDriver();
        int int14 = stackTestDriver13.size();
        stackTestDriver13.clear();
        boolean boolean16 = stackTestDriver13.isEmpty();
        int int17 = stackTestDriver13.size();
        boolean boolean18 = stackTestDriver13.isEmpty();
        experiment.util.StackTestDriver stackTestDriver19 = new experiment.util.StackTestDriver();
        stackTestDriver19.clear();
        stackTestDriver19.clear();
        java.lang.Object obj23 = stackTestDriver19.push((java.lang.Object) 1L);
        java.lang.Object obj24 = stackTestDriver13.push((java.lang.Object) stackTestDriver19);
        java.lang.Object obj25 = stackTestDriver0.push((java.lang.Object) stackTestDriver13);
        experiment.util.StackTestDriver stackTestDriver26 = new experiment.util.StackTestDriver();
        stackTestDriver26.clear();
        java.lang.Object obj29 = stackTestDriver26.push((java.lang.Object) (short) 0);
        boolean boolean30 = stackTestDriver26.isEmpty();
        boolean boolean31 = stackTestDriver26.isEmpty();
        java.lang.Object obj32 = stackTestDriver0.push((java.lang.Object) stackTestDriver26);
        stackTestDriver0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 10L + "'", obj11, 10L);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 10L + "'", obj12, 10L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 1L + "'", obj23, 1L);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + (short) 0 + "'", obj29, (short) 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(obj32);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test219");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        int int6 = stackTestDriver4.size();
        stackTestDriver4.clear();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        boolean boolean9 = stackTestDriver0.isEmpty();
        java.lang.Object obj10 = stackTestDriver0.peek();
        experiment.util.StackTestDriver stackTestDriver11 = new experiment.util.StackTestDriver();
        int int12 = stackTestDriver11.size();
        stackTestDriver11.clear();
        boolean boolean14 = stackTestDriver11.isEmpty();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        int int16 = stackTestDriver15.size();
        int int17 = stackTestDriver15.size();
        stackTestDriver15.clear();
        java.lang.Object obj19 = stackTestDriver11.push((java.lang.Object) stackTestDriver15);
        boolean boolean20 = stackTestDriver11.isEmpty();
        java.lang.Object obj21 = stackTestDriver0.push((java.lang.Object) stackTestDriver11);
        boolean boolean22 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver23 = new experiment.util.StackTestDriver();
        int int24 = stackTestDriver23.size();
        stackTestDriver23.clear();
        boolean boolean26 = stackTestDriver23.isEmpty();
        experiment.util.StackTestDriver stackTestDriver27 = new experiment.util.StackTestDriver();
        int int28 = stackTestDriver27.size();
        int int29 = stackTestDriver27.size();
        stackTestDriver27.clear();
        java.lang.Object obj31 = stackTestDriver23.push((java.lang.Object) stackTestDriver27);
        stackTestDriver23.clear();
        int int33 = stackTestDriver23.size();
        experiment.util.StackTestDriver stackTestDriver34 = new experiment.util.StackTestDriver();
        int int35 = stackTestDriver34.size();
        stackTestDriver34.clear();
        boolean boolean37 = stackTestDriver34.isEmpty();
        experiment.util.StackTestDriver stackTestDriver38 = new experiment.util.StackTestDriver();
        int int39 = stackTestDriver38.size();
        int int40 = stackTestDriver38.size();
        stackTestDriver38.clear();
        java.lang.Object obj42 = stackTestDriver34.push((java.lang.Object) stackTestDriver38);
        boolean boolean43 = stackTestDriver34.isEmpty();
        java.lang.Object obj44 = stackTestDriver34.peek();
        experiment.util.StackTestDriver stackTestDriver45 = new experiment.util.StackTestDriver();
        int int46 = stackTestDriver45.size();
        stackTestDriver45.clear();
        boolean boolean48 = stackTestDriver45.isEmpty();
        experiment.util.StackTestDriver stackTestDriver49 = new experiment.util.StackTestDriver();
        int int50 = stackTestDriver49.size();
        int int51 = stackTestDriver49.size();
        stackTestDriver49.clear();
        java.lang.Object obj53 = stackTestDriver45.push((java.lang.Object) stackTestDriver49);
        boolean boolean54 = stackTestDriver45.isEmpty();
        java.lang.Object obj55 = stackTestDriver34.push((java.lang.Object) stackTestDriver45);
        java.lang.Object obj56 = stackTestDriver23.push((java.lang.Object) stackTestDriver34);
        java.lang.Object obj57 = stackTestDriver34.peek();
        int int58 = stackTestDriver34.size();
        int int59 = stackTestDriver34.size();
        java.lang.Class<?> wildcardClass60 = stackTestDriver34.getClass();
        java.lang.Object obj61 = stackTestDriver0.push((java.lang.Object) wildcardClass60);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(obj53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(obj55);
        org.junit.Assert.assertNotNull(obj56);
        org.junit.Assert.assertNotNull(obj57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 2 + "'", int58 == 2);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 2 + "'", int59 == 2);
        org.junit.Assert.assertNotNull(wildcardClass60);
        org.junit.Assert.assertNotNull(obj61);
        org.junit.Assert.assertEquals(obj61.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj61), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj61), "class experiment.util.StackTestDriver");
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test220");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        int int6 = stackTestDriver4.size();
        stackTestDriver4.clear();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        int int11 = stackTestDriver10.size();
        int int12 = stackTestDriver10.size();
        int int13 = stackTestDriver10.size();
        java.lang.Object obj14 = stackTestDriver0.push((java.lang.Object) int13);
        java.lang.Object obj15 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver16 = new experiment.util.StackTestDriver();
        int int17 = stackTestDriver16.size();
        int int18 = stackTestDriver16.size();
        int int19 = stackTestDriver16.size();
        stackTestDriver16.clear();
        boolean boolean21 = stackTestDriver16.isEmpty();
        experiment.util.StackTestDriver stackTestDriver22 = new experiment.util.StackTestDriver();
        int int23 = stackTestDriver22.size();
        stackTestDriver22.clear();
        boolean boolean25 = stackTestDriver22.isEmpty();
        experiment.util.StackTestDriver stackTestDriver26 = new experiment.util.StackTestDriver();
        int int27 = stackTestDriver26.size();
        int int28 = stackTestDriver26.size();
        stackTestDriver26.clear();
        java.lang.Object obj30 = stackTestDriver22.push((java.lang.Object) stackTestDriver26);
        boolean boolean31 = stackTestDriver22.isEmpty();
        java.lang.Object obj32 = stackTestDriver16.push((java.lang.Object) boolean31);
        java.lang.Object obj33 = stackTestDriver0.push(obj32);
        experiment.util.StackTestDriver stackTestDriver34 = new experiment.util.StackTestDriver();
        int int35 = stackTestDriver34.size();
        stackTestDriver34.clear();
        boolean boolean37 = stackTestDriver34.isEmpty();
        experiment.util.StackTestDriver stackTestDriver38 = new experiment.util.StackTestDriver();
        int int39 = stackTestDriver38.size();
        int int40 = stackTestDriver38.size();
        stackTestDriver38.clear();
        java.lang.Object obj42 = stackTestDriver34.push((java.lang.Object) stackTestDriver38);
        boolean boolean43 = stackTestDriver34.isEmpty();
        java.lang.Object obj44 = stackTestDriver34.peek();
        java.lang.Object obj45 = stackTestDriver34.peek();
        java.lang.Object obj46 = stackTestDriver34.peek();
        boolean boolean47 = stackTestDriver34.isEmpty();
        boolean boolean48 = stackTestDriver34.isEmpty();
        java.lang.Class<?> wildcardClass49 = stackTestDriver34.getClass();
        java.lang.Object obj50 = stackTestDriver0.push((java.lang.Object) wildcardClass49);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 0 + "'", obj14, 0);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 0 + "'", obj15, 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + false + "'", obj32, false);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + false + "'", obj33, false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertNotNull(obj50);
        org.junit.Assert.assertEquals(obj50.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj50), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj50), "class experiment.util.StackTestDriver");
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test221");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        int int6 = stackTestDriver4.size();
        stackTestDriver4.clear();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        boolean boolean9 = stackTestDriver0.isEmpty();
        java.lang.Object obj10 = stackTestDriver0.peek();
        experiment.util.StackTestDriver stackTestDriver11 = new experiment.util.StackTestDriver();
        int int12 = stackTestDriver11.size();
        stackTestDriver11.clear();
        boolean boolean14 = stackTestDriver11.isEmpty();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        int int16 = stackTestDriver15.size();
        int int17 = stackTestDriver15.size();
        stackTestDriver15.clear();
        java.lang.Object obj19 = stackTestDriver11.push((java.lang.Object) stackTestDriver15);
        boolean boolean20 = stackTestDriver11.isEmpty();
        java.lang.Object obj21 = stackTestDriver0.push((java.lang.Object) stackTestDriver11);
        java.lang.Object obj22 = stackTestDriver11.peek();
        stackTestDriver11.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = stackTestDriver11.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(obj22);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test222");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        java.lang.Object obj3 = stackTestDriver0.push((java.lang.Object) (short) 0);
        int int4 = stackTestDriver0.size();
        boolean boolean5 = stackTestDriver0.isEmpty();
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) (-1.0d));
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        stackTestDriver8.clear();
        java.lang.Object obj11 = stackTestDriver8.push((java.lang.Object) (short) 0);
        int int12 = stackTestDriver8.size();
        boolean boolean13 = stackTestDriver8.isEmpty();
        java.lang.Object obj14 = stackTestDriver0.push((java.lang.Object) stackTestDriver8);
        java.lang.Object obj15 = stackTestDriver8.peek();
        experiment.util.StackTestDriver stackTestDriver16 = new experiment.util.StackTestDriver();
        int int17 = stackTestDriver16.size();
        stackTestDriver16.clear();
        boolean boolean19 = stackTestDriver16.isEmpty();
        experiment.util.StackTestDriver stackTestDriver20 = new experiment.util.StackTestDriver();
        int int21 = stackTestDriver20.size();
        int int22 = stackTestDriver20.size();
        stackTestDriver20.clear();
        java.lang.Object obj24 = stackTestDriver16.push((java.lang.Object) stackTestDriver20);
        stackTestDriver16.clear();
        int int26 = stackTestDriver16.size();
        experiment.util.StackTestDriver stackTestDriver27 = new experiment.util.StackTestDriver();
        int int28 = stackTestDriver27.size();
        stackTestDriver27.clear();
        boolean boolean30 = stackTestDriver27.isEmpty();
        experiment.util.StackTestDriver stackTestDriver31 = new experiment.util.StackTestDriver();
        int int32 = stackTestDriver31.size();
        int int33 = stackTestDriver31.size();
        stackTestDriver31.clear();
        java.lang.Object obj35 = stackTestDriver27.push((java.lang.Object) stackTestDriver31);
        boolean boolean36 = stackTestDriver27.isEmpty();
        java.lang.Object obj37 = stackTestDriver27.peek();
        experiment.util.StackTestDriver stackTestDriver38 = new experiment.util.StackTestDriver();
        int int39 = stackTestDriver38.size();
        stackTestDriver38.clear();
        boolean boolean41 = stackTestDriver38.isEmpty();
        experiment.util.StackTestDriver stackTestDriver42 = new experiment.util.StackTestDriver();
        int int43 = stackTestDriver42.size();
        int int44 = stackTestDriver42.size();
        stackTestDriver42.clear();
        java.lang.Object obj46 = stackTestDriver38.push((java.lang.Object) stackTestDriver42);
        boolean boolean47 = stackTestDriver38.isEmpty();
        java.lang.Object obj48 = stackTestDriver27.push((java.lang.Object) stackTestDriver38);
        java.lang.Object obj49 = stackTestDriver16.push((java.lang.Object) stackTestDriver27);
        experiment.util.StackTestDriver stackTestDriver50 = new experiment.util.StackTestDriver();
        int int51 = stackTestDriver50.size();
        stackTestDriver50.clear();
        boolean boolean53 = stackTestDriver50.isEmpty();
        experiment.util.StackTestDriver stackTestDriver54 = new experiment.util.StackTestDriver();
        int int55 = stackTestDriver54.size();
        int int56 = stackTestDriver54.size();
        stackTestDriver54.clear();
        java.lang.Object obj58 = stackTestDriver50.push((java.lang.Object) stackTestDriver54);
        stackTestDriver50.clear();
        int int60 = stackTestDriver50.size();
        experiment.util.StackTestDriver stackTestDriver61 = new experiment.util.StackTestDriver();
        int int62 = stackTestDriver61.size();
        stackTestDriver61.clear();
        boolean boolean64 = stackTestDriver61.isEmpty();
        experiment.util.StackTestDriver stackTestDriver65 = new experiment.util.StackTestDriver();
        int int66 = stackTestDriver65.size();
        int int67 = stackTestDriver65.size();
        stackTestDriver65.clear();
        java.lang.Object obj69 = stackTestDriver61.push((java.lang.Object) stackTestDriver65);
        boolean boolean70 = stackTestDriver61.isEmpty();
        java.lang.Object obj71 = stackTestDriver61.peek();
        experiment.util.StackTestDriver stackTestDriver72 = new experiment.util.StackTestDriver();
        int int73 = stackTestDriver72.size();
        stackTestDriver72.clear();
        boolean boolean75 = stackTestDriver72.isEmpty();
        experiment.util.StackTestDriver stackTestDriver76 = new experiment.util.StackTestDriver();
        int int77 = stackTestDriver76.size();
        int int78 = stackTestDriver76.size();
        stackTestDriver76.clear();
        java.lang.Object obj80 = stackTestDriver72.push((java.lang.Object) stackTestDriver76);
        boolean boolean81 = stackTestDriver72.isEmpty();
        java.lang.Object obj82 = stackTestDriver61.push((java.lang.Object) stackTestDriver72);
        java.lang.Object obj83 = stackTestDriver50.push((java.lang.Object) stackTestDriver61);
        java.lang.Object obj84 = stackTestDriver50.pop();
        java.lang.Object obj85 = stackTestDriver16.push((java.lang.Object) stackTestDriver50);
        java.lang.Object obj86 = stackTestDriver8.push((java.lang.Object) stackTestDriver50);
        experiment.util.StackTestDriver stackTestDriver87 = new experiment.util.StackTestDriver();
        int int88 = stackTestDriver87.size();
        stackTestDriver87.clear();
        boolean boolean90 = stackTestDriver87.isEmpty();
        int int91 = stackTestDriver87.size();
        boolean boolean92 = stackTestDriver87.isEmpty();
        experiment.util.StackTestDriver stackTestDriver93 = new experiment.util.StackTestDriver();
        stackTestDriver93.clear();
        stackTestDriver93.clear();
        java.lang.Object obj97 = stackTestDriver93.push((java.lang.Object) 1L);
        java.lang.Object obj98 = stackTestDriver87.push((java.lang.Object) stackTestDriver93);
        java.lang.Object obj99 = stackTestDriver50.push((java.lang.Object) stackTestDriver87);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (short) 0 + "'", obj3, (short) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (short) 0 + "'", obj11, (short) 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (short) 0 + "'", obj15, (short) 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(obj58);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNotNull(obj69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(obj71);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertNotNull(obj80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(obj82);
        org.junit.Assert.assertNotNull(obj83);
        org.junit.Assert.assertNotNull(obj84);
        org.junit.Assert.assertNotNull(obj85);
        org.junit.Assert.assertNotNull(obj86);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 0 + "'", int88 == 0);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 0 + "'", int91 == 0);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertEquals("'" + obj97 + "' != '" + 1L + "'", obj97, 1L);
        org.junit.Assert.assertNotNull(obj98);
        org.junit.Assert.assertNotNull(obj99);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test223");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        int int6 = stackTestDriver4.size();
        stackTestDriver4.clear();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        stackTestDriver0.clear();
        int int10 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver11 = new experiment.util.StackTestDriver();
        int int12 = stackTestDriver11.size();
        stackTestDriver11.clear();
        boolean boolean14 = stackTestDriver11.isEmpty();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        int int16 = stackTestDriver15.size();
        int int17 = stackTestDriver15.size();
        stackTestDriver15.clear();
        java.lang.Object obj19 = stackTestDriver11.push((java.lang.Object) stackTestDriver15);
        boolean boolean20 = stackTestDriver11.isEmpty();
        java.lang.Object obj21 = stackTestDriver11.peek();
        experiment.util.StackTestDriver stackTestDriver22 = new experiment.util.StackTestDriver();
        int int23 = stackTestDriver22.size();
        stackTestDriver22.clear();
        boolean boolean25 = stackTestDriver22.isEmpty();
        experiment.util.StackTestDriver stackTestDriver26 = new experiment.util.StackTestDriver();
        int int27 = stackTestDriver26.size();
        int int28 = stackTestDriver26.size();
        stackTestDriver26.clear();
        java.lang.Object obj30 = stackTestDriver22.push((java.lang.Object) stackTestDriver26);
        boolean boolean31 = stackTestDriver22.isEmpty();
        java.lang.Object obj32 = stackTestDriver11.push((java.lang.Object) stackTestDriver22);
        java.lang.Object obj33 = stackTestDriver0.push((java.lang.Object) stackTestDriver11);
        int int34 = stackTestDriver11.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2 + "'", int34 == 2);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test224");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        boolean boolean4 = stackTestDriver0.isEmpty();
        boolean boolean5 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        stackTestDriver6.clear();
        stackTestDriver6.clear();
        stackTestDriver6.clear();
        java.lang.Object obj10 = stackTestDriver0.push((java.lang.Object) stackTestDriver6);
        java.lang.Object obj11 = stackTestDriver0.pop();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test225");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        int int6 = stackTestDriver4.size();
        stackTestDriver4.clear();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        stackTestDriver0.clear();
        int int10 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver11 = new experiment.util.StackTestDriver();
        int int12 = stackTestDriver11.size();
        int int13 = stackTestDriver11.size();
        int int14 = stackTestDriver11.size();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        int int16 = stackTestDriver15.size();
        stackTestDriver15.clear();
        boolean boolean18 = stackTestDriver15.isEmpty();
        experiment.util.StackTestDriver stackTestDriver19 = new experiment.util.StackTestDriver();
        int int20 = stackTestDriver19.size();
        int int21 = stackTestDriver19.size();
        stackTestDriver19.clear();
        java.lang.Object obj23 = stackTestDriver15.push((java.lang.Object) stackTestDriver19);
        stackTestDriver15.clear();
        int int25 = stackTestDriver15.size();
        experiment.util.StackTestDriver stackTestDriver26 = new experiment.util.StackTestDriver();
        int int27 = stackTestDriver26.size();
        stackTestDriver26.clear();
        boolean boolean29 = stackTestDriver26.isEmpty();
        experiment.util.StackTestDriver stackTestDriver30 = new experiment.util.StackTestDriver();
        int int31 = stackTestDriver30.size();
        int int32 = stackTestDriver30.size();
        stackTestDriver30.clear();
        java.lang.Object obj34 = stackTestDriver26.push((java.lang.Object) stackTestDriver30);
        boolean boolean35 = stackTestDriver26.isEmpty();
        java.lang.Object obj36 = stackTestDriver26.peek();
        experiment.util.StackTestDriver stackTestDriver37 = new experiment.util.StackTestDriver();
        int int38 = stackTestDriver37.size();
        stackTestDriver37.clear();
        boolean boolean40 = stackTestDriver37.isEmpty();
        experiment.util.StackTestDriver stackTestDriver41 = new experiment.util.StackTestDriver();
        int int42 = stackTestDriver41.size();
        int int43 = stackTestDriver41.size();
        stackTestDriver41.clear();
        java.lang.Object obj45 = stackTestDriver37.push((java.lang.Object) stackTestDriver41);
        boolean boolean46 = stackTestDriver37.isEmpty();
        java.lang.Object obj47 = stackTestDriver26.push((java.lang.Object) stackTestDriver37);
        java.lang.Object obj48 = stackTestDriver15.push((java.lang.Object) stackTestDriver26);
        java.lang.Object obj49 = stackTestDriver15.pop();
        java.lang.Object obj50 = stackTestDriver11.push((java.lang.Object) stackTestDriver15);
        java.lang.Object obj51 = stackTestDriver0.push((java.lang.Object) stackTestDriver15);
        java.lang.Object obj52 = stackTestDriver0.peek();
        experiment.util.StackTestDriver stackTestDriver53 = new experiment.util.StackTestDriver();
        int int54 = stackTestDriver53.size();
        stackTestDriver53.clear();
        boolean boolean56 = stackTestDriver53.isEmpty();
        experiment.util.StackTestDriver stackTestDriver57 = new experiment.util.StackTestDriver();
        int int58 = stackTestDriver57.size();
        int int59 = stackTestDriver57.size();
        stackTestDriver57.clear();
        java.lang.Object obj61 = stackTestDriver53.push((java.lang.Object) stackTestDriver57);
        stackTestDriver53.clear();
        java.lang.Object obj64 = stackTestDriver53.push((java.lang.Object) 10L);
        java.lang.Object obj65 = stackTestDriver53.peek();
        experiment.util.StackTestDriver stackTestDriver66 = new experiment.util.StackTestDriver();
        int int67 = stackTestDriver66.size();
        stackTestDriver66.clear();
        boolean boolean69 = stackTestDriver66.isEmpty();
        int int70 = stackTestDriver66.size();
        boolean boolean71 = stackTestDriver66.isEmpty();
        experiment.util.StackTestDriver stackTestDriver72 = new experiment.util.StackTestDriver();
        stackTestDriver72.clear();
        stackTestDriver72.clear();
        java.lang.Object obj76 = stackTestDriver72.push((java.lang.Object) 1L);
        java.lang.Object obj77 = stackTestDriver66.push((java.lang.Object) stackTestDriver72);
        java.lang.Object obj78 = stackTestDriver53.push((java.lang.Object) stackTestDriver66);
        java.lang.Object obj79 = stackTestDriver0.push((java.lang.Object) stackTestDriver66);
        java.lang.Object obj80 = stackTestDriver0.peek();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertNotNull(obj50);
        org.junit.Assert.assertNotNull(obj51);
        org.junit.Assert.assertNotNull(obj52);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNotNull(obj61);
        org.junit.Assert.assertEquals("'" + obj64 + "' != '" + 10L + "'", obj64, 10L);
        org.junit.Assert.assertEquals("'" + obj65 + "' != '" + 10L + "'", obj65, 10L);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertEquals("'" + obj76 + "' != '" + 1L + "'", obj76, 1L);
        org.junit.Assert.assertNotNull(obj77);
        org.junit.Assert.assertNotNull(obj78);
        org.junit.Assert.assertNotNull(obj79);
        org.junit.Assert.assertNotNull(obj80);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test226");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        boolean boolean4 = stackTestDriver0.isEmpty();
        boolean boolean5 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        int int7 = stackTestDriver6.size();
        int int8 = stackTestDriver6.size();
        int int9 = stackTestDriver6.size();
        stackTestDriver6.clear();
        stackTestDriver6.clear();
        java.lang.Object obj12 = stackTestDriver0.push((java.lang.Object) stackTestDriver6);
        int int13 = stackTestDriver6.size();
        int int14 = stackTestDriver6.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = stackTestDriver6.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test227");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        int int6 = stackTestDriver4.size();
        stackTestDriver4.clear();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        boolean boolean9 = stackTestDriver0.isEmpty();
        java.lang.Object obj10 = stackTestDriver0.peek();
        java.lang.Object obj11 = stackTestDriver0.peek();
        java.lang.Object obj12 = stackTestDriver0.peek();
        boolean boolean13 = stackTestDriver0.isEmpty();
        boolean boolean14 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        int int16 = stackTestDriver15.size();
        stackTestDriver15.clear();
        boolean boolean18 = stackTestDriver15.isEmpty();
        boolean boolean19 = stackTestDriver15.isEmpty();
        experiment.util.StackTestDriver stackTestDriver20 = new experiment.util.StackTestDriver();
        int int21 = stackTestDriver20.size();
        stackTestDriver20.clear();
        boolean boolean23 = stackTestDriver20.isEmpty();
        experiment.util.StackTestDriver stackTestDriver24 = new experiment.util.StackTestDriver();
        int int25 = stackTestDriver24.size();
        int int26 = stackTestDriver24.size();
        stackTestDriver24.clear();
        java.lang.Object obj28 = stackTestDriver20.push((java.lang.Object) stackTestDriver24);
        boolean boolean29 = stackTestDriver20.isEmpty();
        java.lang.Object obj30 = stackTestDriver15.push((java.lang.Object) boolean29);
        java.lang.Object obj31 = stackTestDriver15.pop();
        java.lang.Object obj32 = stackTestDriver0.push((java.lang.Object) stackTestDriver15);
        stackTestDriver15.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + false + "'", obj30, false);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + false + "'", obj31, false);
        org.junit.Assert.assertNotNull(obj32);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test228");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        int int6 = stackTestDriver4.size();
        stackTestDriver4.clear();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        stackTestDriver0.clear();
        int int10 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver11 = new experiment.util.StackTestDriver();
        int int12 = stackTestDriver11.size();
        stackTestDriver11.clear();
        boolean boolean14 = stackTestDriver11.isEmpty();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        int int16 = stackTestDriver15.size();
        int int17 = stackTestDriver15.size();
        stackTestDriver15.clear();
        java.lang.Object obj19 = stackTestDriver11.push((java.lang.Object) stackTestDriver15);
        boolean boolean20 = stackTestDriver11.isEmpty();
        java.lang.Object obj21 = stackTestDriver11.peek();
        experiment.util.StackTestDriver stackTestDriver22 = new experiment.util.StackTestDriver();
        int int23 = stackTestDriver22.size();
        stackTestDriver22.clear();
        boolean boolean25 = stackTestDriver22.isEmpty();
        experiment.util.StackTestDriver stackTestDriver26 = new experiment.util.StackTestDriver();
        int int27 = stackTestDriver26.size();
        int int28 = stackTestDriver26.size();
        stackTestDriver26.clear();
        java.lang.Object obj30 = stackTestDriver22.push((java.lang.Object) stackTestDriver26);
        boolean boolean31 = stackTestDriver22.isEmpty();
        java.lang.Object obj32 = stackTestDriver11.push((java.lang.Object) stackTestDriver22);
        java.lang.Object obj33 = stackTestDriver0.push((java.lang.Object) stackTestDriver11);
        experiment.util.StackTestDriver stackTestDriver34 = new experiment.util.StackTestDriver();
        stackTestDriver34.clear();
        stackTestDriver34.clear();
        java.lang.Class<?> wildcardClass37 = stackTestDriver34.getClass();
        java.lang.Object obj38 = stackTestDriver0.push((java.lang.Object) wildcardClass37);
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertEquals(obj38.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj38), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj38), "class experiment.util.StackTestDriver");
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test229");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        int int6 = stackTestDriver4.size();
        stackTestDriver4.clear();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        stackTestDriver0.clear();
        int int10 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver11 = new experiment.util.StackTestDriver();
        int int12 = stackTestDriver11.size();
        stackTestDriver11.clear();
        boolean boolean14 = stackTestDriver11.isEmpty();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        int int16 = stackTestDriver15.size();
        int int17 = stackTestDriver15.size();
        stackTestDriver15.clear();
        java.lang.Object obj19 = stackTestDriver11.push((java.lang.Object) stackTestDriver15);
        boolean boolean20 = stackTestDriver11.isEmpty();
        java.lang.Object obj21 = stackTestDriver11.peek();
        experiment.util.StackTestDriver stackTestDriver22 = new experiment.util.StackTestDriver();
        int int23 = stackTestDriver22.size();
        stackTestDriver22.clear();
        boolean boolean25 = stackTestDriver22.isEmpty();
        experiment.util.StackTestDriver stackTestDriver26 = new experiment.util.StackTestDriver();
        int int27 = stackTestDriver26.size();
        int int28 = stackTestDriver26.size();
        stackTestDriver26.clear();
        java.lang.Object obj30 = stackTestDriver22.push((java.lang.Object) stackTestDriver26);
        boolean boolean31 = stackTestDriver22.isEmpty();
        java.lang.Object obj32 = stackTestDriver11.push((java.lang.Object) stackTestDriver22);
        java.lang.Object obj33 = stackTestDriver0.push((java.lang.Object) stackTestDriver11);
        experiment.util.StackTestDriver stackTestDriver34 = new experiment.util.StackTestDriver();
        stackTestDriver34.clear();
        stackTestDriver34.clear();
        java.lang.Class<?> wildcardClass37 = stackTestDriver34.getClass();
        java.lang.Object obj38 = stackTestDriver0.push((java.lang.Object) wildcardClass37);
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver40 = new experiment.util.StackTestDriver();
        int int41 = stackTestDriver40.size();
        int int42 = stackTestDriver40.size();
        boolean boolean43 = stackTestDriver40.isEmpty();
        int int44 = stackTestDriver40.size();
        stackTestDriver40.clear();
        experiment.util.StackTestDriver stackTestDriver46 = new experiment.util.StackTestDriver();
        int int47 = stackTestDriver46.size();
        stackTestDriver46.clear();
        boolean boolean49 = stackTestDriver46.isEmpty();
        experiment.util.StackTestDriver stackTestDriver50 = new experiment.util.StackTestDriver();
        int int51 = stackTestDriver50.size();
        int int52 = stackTestDriver50.size();
        stackTestDriver50.clear();
        java.lang.Object obj54 = stackTestDriver46.push((java.lang.Object) stackTestDriver50);
        stackTestDriver46.clear();
        int int56 = stackTestDriver46.size();
        experiment.util.StackTestDriver stackTestDriver57 = new experiment.util.StackTestDriver();
        int int58 = stackTestDriver57.size();
        stackTestDriver57.clear();
        boolean boolean60 = stackTestDriver57.isEmpty();
        experiment.util.StackTestDriver stackTestDriver61 = new experiment.util.StackTestDriver();
        int int62 = stackTestDriver61.size();
        int int63 = stackTestDriver61.size();
        stackTestDriver61.clear();
        java.lang.Object obj65 = stackTestDriver57.push((java.lang.Object) stackTestDriver61);
        boolean boolean66 = stackTestDriver57.isEmpty();
        java.lang.Object obj67 = stackTestDriver57.peek();
        experiment.util.StackTestDriver stackTestDriver68 = new experiment.util.StackTestDriver();
        int int69 = stackTestDriver68.size();
        stackTestDriver68.clear();
        boolean boolean71 = stackTestDriver68.isEmpty();
        experiment.util.StackTestDriver stackTestDriver72 = new experiment.util.StackTestDriver();
        int int73 = stackTestDriver72.size();
        int int74 = stackTestDriver72.size();
        stackTestDriver72.clear();
        java.lang.Object obj76 = stackTestDriver68.push((java.lang.Object) stackTestDriver72);
        boolean boolean77 = stackTestDriver68.isEmpty();
        java.lang.Object obj78 = stackTestDriver57.push((java.lang.Object) stackTestDriver68);
        java.lang.Object obj79 = stackTestDriver46.push((java.lang.Object) stackTestDriver57);
        java.lang.Object obj80 = stackTestDriver46.pop();
        java.lang.Object obj81 = stackTestDriver40.push(obj80);
        java.lang.Object obj82 = stackTestDriver0.push((java.lang.Object) stackTestDriver40);
        java.lang.Class<?> wildcardClass83 = stackTestDriver40.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertEquals(obj38.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj38), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj38), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(obj54);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNotNull(obj65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(obj67);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertNotNull(obj76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(obj78);
        org.junit.Assert.assertNotNull(obj79);
        org.junit.Assert.assertNotNull(obj80);
        org.junit.Assert.assertNotNull(obj81);
        org.junit.Assert.assertNotNull(obj82);
        org.junit.Assert.assertNotNull(wildcardClass83);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test230");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        int int6 = stackTestDriver4.size();
        stackTestDriver4.clear();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        stackTestDriver0.clear();
        int int10 = stackTestDriver0.size();
        int int11 = stackTestDriver0.size();
        int int12 = stackTestDriver0.size();
        boolean boolean13 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test231");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        int int6 = stackTestDriver4.size();
        stackTestDriver4.clear();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        stackTestDriver0.clear();
        int int10 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver11 = new experiment.util.StackTestDriver();
        int int12 = stackTestDriver11.size();
        int int13 = stackTestDriver11.size();
        int int14 = stackTestDriver11.size();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        int int16 = stackTestDriver15.size();
        stackTestDriver15.clear();
        boolean boolean18 = stackTestDriver15.isEmpty();
        experiment.util.StackTestDriver stackTestDriver19 = new experiment.util.StackTestDriver();
        int int20 = stackTestDriver19.size();
        int int21 = stackTestDriver19.size();
        stackTestDriver19.clear();
        java.lang.Object obj23 = stackTestDriver15.push((java.lang.Object) stackTestDriver19);
        stackTestDriver15.clear();
        int int25 = stackTestDriver15.size();
        experiment.util.StackTestDriver stackTestDriver26 = new experiment.util.StackTestDriver();
        int int27 = stackTestDriver26.size();
        stackTestDriver26.clear();
        boolean boolean29 = stackTestDriver26.isEmpty();
        experiment.util.StackTestDriver stackTestDriver30 = new experiment.util.StackTestDriver();
        int int31 = stackTestDriver30.size();
        int int32 = stackTestDriver30.size();
        stackTestDriver30.clear();
        java.lang.Object obj34 = stackTestDriver26.push((java.lang.Object) stackTestDriver30);
        boolean boolean35 = stackTestDriver26.isEmpty();
        java.lang.Object obj36 = stackTestDriver26.peek();
        experiment.util.StackTestDriver stackTestDriver37 = new experiment.util.StackTestDriver();
        int int38 = stackTestDriver37.size();
        stackTestDriver37.clear();
        boolean boolean40 = stackTestDriver37.isEmpty();
        experiment.util.StackTestDriver stackTestDriver41 = new experiment.util.StackTestDriver();
        int int42 = stackTestDriver41.size();
        int int43 = stackTestDriver41.size();
        stackTestDriver41.clear();
        java.lang.Object obj45 = stackTestDriver37.push((java.lang.Object) stackTestDriver41);
        boolean boolean46 = stackTestDriver37.isEmpty();
        java.lang.Object obj47 = stackTestDriver26.push((java.lang.Object) stackTestDriver37);
        java.lang.Object obj48 = stackTestDriver15.push((java.lang.Object) stackTestDriver26);
        java.lang.Object obj49 = stackTestDriver15.pop();
        java.lang.Object obj50 = stackTestDriver11.push((java.lang.Object) stackTestDriver15);
        java.lang.Object obj51 = stackTestDriver0.push((java.lang.Object) stackTestDriver15);
        int int52 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver53 = new experiment.util.StackTestDriver();
        int int54 = stackTestDriver53.size();
        int int55 = stackTestDriver53.size();
        int int56 = stackTestDriver53.size();
        boolean boolean57 = stackTestDriver53.isEmpty();
        boolean boolean58 = stackTestDriver53.isEmpty();
        experiment.util.StackTestDriver stackTestDriver59 = new experiment.util.StackTestDriver();
        stackTestDriver59.clear();
        stackTestDriver59.clear();
        stackTestDriver59.clear();
        java.lang.Object obj63 = stackTestDriver53.push((java.lang.Object) stackTestDriver59);
        stackTestDriver59.clear();
        java.lang.Object obj65 = stackTestDriver0.push((java.lang.Object) stackTestDriver59);
        int int66 = stackTestDriver59.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertNotNull(obj50);
        org.junit.Assert.assertNotNull(obj51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(obj63);
        org.junit.Assert.assertNotNull(obj65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test232");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        int int2 = stackTestDriver0.size();
        stackTestDriver0.clear();
        int int4 = stackTestDriver0.size();
        boolean boolean5 = stackTestDriver0.isEmpty();
        int int6 = stackTestDriver0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test233");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        int int6 = stackTestDriver4.size();
        stackTestDriver4.clear();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        boolean boolean9 = stackTestDriver0.isEmpty();
        java.lang.Object obj10 = stackTestDriver0.peek();
        experiment.util.StackTestDriver stackTestDriver11 = new experiment.util.StackTestDriver();
        int int12 = stackTestDriver11.size();
        stackTestDriver11.clear();
        boolean boolean14 = stackTestDriver11.isEmpty();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        int int16 = stackTestDriver15.size();
        int int17 = stackTestDriver15.size();
        stackTestDriver15.clear();
        java.lang.Object obj19 = stackTestDriver11.push((java.lang.Object) stackTestDriver15);
        boolean boolean20 = stackTestDriver11.isEmpty();
        java.lang.Object obj21 = stackTestDriver0.push((java.lang.Object) stackTestDriver11);
        java.lang.Object obj22 = stackTestDriver11.peek();
        int int23 = stackTestDriver11.size();
        experiment.util.StackTestDriver stackTestDriver24 = new experiment.util.StackTestDriver();
        stackTestDriver24.clear();
        experiment.util.StackTestDriver stackTestDriver26 = new experiment.util.StackTestDriver();
        int int27 = stackTestDriver26.size();
        stackTestDriver26.clear();
        boolean boolean29 = stackTestDriver26.isEmpty();
        experiment.util.StackTestDriver stackTestDriver30 = new experiment.util.StackTestDriver();
        int int31 = stackTestDriver30.size();
        int int32 = stackTestDriver30.size();
        stackTestDriver30.clear();
        java.lang.Object obj34 = stackTestDriver26.push((java.lang.Object) stackTestDriver30);
        stackTestDriver26.clear();
        int int36 = stackTestDriver26.size();
        experiment.util.StackTestDriver stackTestDriver37 = new experiment.util.StackTestDriver();
        int int38 = stackTestDriver37.size();
        stackTestDriver37.clear();
        boolean boolean40 = stackTestDriver37.isEmpty();
        experiment.util.StackTestDriver stackTestDriver41 = new experiment.util.StackTestDriver();
        int int42 = stackTestDriver41.size();
        int int43 = stackTestDriver41.size();
        stackTestDriver41.clear();
        java.lang.Object obj45 = stackTestDriver37.push((java.lang.Object) stackTestDriver41);
        boolean boolean46 = stackTestDriver37.isEmpty();
        java.lang.Object obj47 = stackTestDriver37.peek();
        experiment.util.StackTestDriver stackTestDriver48 = new experiment.util.StackTestDriver();
        int int49 = stackTestDriver48.size();
        stackTestDriver48.clear();
        boolean boolean51 = stackTestDriver48.isEmpty();
        experiment.util.StackTestDriver stackTestDriver52 = new experiment.util.StackTestDriver();
        int int53 = stackTestDriver52.size();
        int int54 = stackTestDriver52.size();
        stackTestDriver52.clear();
        java.lang.Object obj56 = stackTestDriver48.push((java.lang.Object) stackTestDriver52);
        boolean boolean57 = stackTestDriver48.isEmpty();
        java.lang.Object obj58 = stackTestDriver37.push((java.lang.Object) stackTestDriver48);
        java.lang.Object obj59 = stackTestDriver26.push((java.lang.Object) stackTestDriver37);
        java.lang.Object obj60 = stackTestDriver24.push((java.lang.Object) stackTestDriver37);
        java.lang.Object obj61 = stackTestDriver11.push((java.lang.Object) stackTestDriver24);
        java.lang.Object obj62 = stackTestDriver11.pop();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(obj56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(obj58);
        org.junit.Assert.assertNotNull(obj59);
        org.junit.Assert.assertNotNull(obj60);
        org.junit.Assert.assertNotNull(obj61);
        org.junit.Assert.assertNotNull(obj62);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test234");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        int int6 = stackTestDriver4.size();
        stackTestDriver4.clear();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        stackTestDriver0.clear();
        int int10 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver11 = new experiment.util.StackTestDriver();
        int int12 = stackTestDriver11.size();
        int int13 = stackTestDriver11.size();
        int int14 = stackTestDriver11.size();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        int int16 = stackTestDriver15.size();
        stackTestDriver15.clear();
        boolean boolean18 = stackTestDriver15.isEmpty();
        experiment.util.StackTestDriver stackTestDriver19 = new experiment.util.StackTestDriver();
        int int20 = stackTestDriver19.size();
        int int21 = stackTestDriver19.size();
        stackTestDriver19.clear();
        java.lang.Object obj23 = stackTestDriver15.push((java.lang.Object) stackTestDriver19);
        stackTestDriver15.clear();
        int int25 = stackTestDriver15.size();
        experiment.util.StackTestDriver stackTestDriver26 = new experiment.util.StackTestDriver();
        int int27 = stackTestDriver26.size();
        stackTestDriver26.clear();
        boolean boolean29 = stackTestDriver26.isEmpty();
        experiment.util.StackTestDriver stackTestDriver30 = new experiment.util.StackTestDriver();
        int int31 = stackTestDriver30.size();
        int int32 = stackTestDriver30.size();
        stackTestDriver30.clear();
        java.lang.Object obj34 = stackTestDriver26.push((java.lang.Object) stackTestDriver30);
        boolean boolean35 = stackTestDriver26.isEmpty();
        java.lang.Object obj36 = stackTestDriver26.peek();
        experiment.util.StackTestDriver stackTestDriver37 = new experiment.util.StackTestDriver();
        int int38 = stackTestDriver37.size();
        stackTestDriver37.clear();
        boolean boolean40 = stackTestDriver37.isEmpty();
        experiment.util.StackTestDriver stackTestDriver41 = new experiment.util.StackTestDriver();
        int int42 = stackTestDriver41.size();
        int int43 = stackTestDriver41.size();
        stackTestDriver41.clear();
        java.lang.Object obj45 = stackTestDriver37.push((java.lang.Object) stackTestDriver41);
        boolean boolean46 = stackTestDriver37.isEmpty();
        java.lang.Object obj47 = stackTestDriver26.push((java.lang.Object) stackTestDriver37);
        java.lang.Object obj48 = stackTestDriver15.push((java.lang.Object) stackTestDriver26);
        java.lang.Object obj49 = stackTestDriver15.pop();
        java.lang.Object obj50 = stackTestDriver11.push((java.lang.Object) stackTestDriver15);
        java.lang.Object obj51 = stackTestDriver0.push((java.lang.Object) stackTestDriver15);
        boolean boolean52 = stackTestDriver15.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj53 = stackTestDriver15.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertNotNull(obj50);
        org.junit.Assert.assertNotNull(obj51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test235");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        java.lang.Object obj3 = stackTestDriver0.push((java.lang.Object) (short) 0);
        int int4 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        int int6 = stackTestDriver5.size();
        stackTestDriver5.clear();
        boolean boolean8 = stackTestDriver5.isEmpty();
        boolean boolean9 = stackTestDriver5.isEmpty();
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        int int11 = stackTestDriver10.size();
        stackTestDriver10.clear();
        boolean boolean13 = stackTestDriver10.isEmpty();
        experiment.util.StackTestDriver stackTestDriver14 = new experiment.util.StackTestDriver();
        int int15 = stackTestDriver14.size();
        int int16 = stackTestDriver14.size();
        stackTestDriver14.clear();
        java.lang.Object obj18 = stackTestDriver10.push((java.lang.Object) stackTestDriver14);
        boolean boolean19 = stackTestDriver10.isEmpty();
        java.lang.Object obj20 = stackTestDriver5.push((java.lang.Object) boolean19);
        java.lang.Object obj21 = stackTestDriver5.pop();
        java.lang.Object obj22 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        java.lang.Object obj23 = stackTestDriver0.pop();
        java.lang.Object obj24 = stackTestDriver0.peek();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (short) 0 + "'", obj3, (short) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + false + "'", obj20, false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + false + "'", obj21, false);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (short) 0 + "'", obj24, (short) 0);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test236");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        int int6 = stackTestDriver4.size();
        stackTestDriver4.clear();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        java.lang.Class<?> wildcardClass9 = stackTestDriver4.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test237");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver2 = new experiment.util.StackTestDriver();
        int int3 = stackTestDriver2.size();
        stackTestDriver2.clear();
        boolean boolean5 = stackTestDriver2.isEmpty();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        int int7 = stackTestDriver6.size();
        int int8 = stackTestDriver6.size();
        stackTestDriver6.clear();
        java.lang.Object obj10 = stackTestDriver2.push((java.lang.Object) stackTestDriver6);
        stackTestDriver2.clear();
        int int12 = stackTestDriver2.size();
        experiment.util.StackTestDriver stackTestDriver13 = new experiment.util.StackTestDriver();
        int int14 = stackTestDriver13.size();
        stackTestDriver13.clear();
        boolean boolean16 = stackTestDriver13.isEmpty();
        experiment.util.StackTestDriver stackTestDriver17 = new experiment.util.StackTestDriver();
        int int18 = stackTestDriver17.size();
        int int19 = stackTestDriver17.size();
        stackTestDriver17.clear();
        java.lang.Object obj21 = stackTestDriver13.push((java.lang.Object) stackTestDriver17);
        boolean boolean22 = stackTestDriver13.isEmpty();
        java.lang.Object obj23 = stackTestDriver13.peek();
        experiment.util.StackTestDriver stackTestDriver24 = new experiment.util.StackTestDriver();
        int int25 = stackTestDriver24.size();
        stackTestDriver24.clear();
        boolean boolean27 = stackTestDriver24.isEmpty();
        experiment.util.StackTestDriver stackTestDriver28 = new experiment.util.StackTestDriver();
        int int29 = stackTestDriver28.size();
        int int30 = stackTestDriver28.size();
        stackTestDriver28.clear();
        java.lang.Object obj32 = stackTestDriver24.push((java.lang.Object) stackTestDriver28);
        boolean boolean33 = stackTestDriver24.isEmpty();
        java.lang.Object obj34 = stackTestDriver13.push((java.lang.Object) stackTestDriver24);
        java.lang.Object obj35 = stackTestDriver2.push((java.lang.Object) stackTestDriver13);
        java.lang.Object obj36 = stackTestDriver0.push((java.lang.Object) stackTestDriver13);
        boolean boolean37 = stackTestDriver13.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test238");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        boolean boolean4 = stackTestDriver0.isEmpty();
        boolean boolean5 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        stackTestDriver6.clear();
        stackTestDriver6.clear();
        stackTestDriver6.clear();
        java.lang.Object obj10 = stackTestDriver0.push((java.lang.Object) stackTestDriver6);
        boolean boolean11 = stackTestDriver6.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test239");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver2 = new experiment.util.StackTestDriver();
        int int3 = stackTestDriver2.size();
        stackTestDriver2.clear();
        boolean boolean5 = stackTestDriver2.isEmpty();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        int int7 = stackTestDriver6.size();
        int int8 = stackTestDriver6.size();
        stackTestDriver6.clear();
        java.lang.Object obj10 = stackTestDriver2.push((java.lang.Object) stackTestDriver6);
        stackTestDriver2.clear();
        int int12 = stackTestDriver2.size();
        experiment.util.StackTestDriver stackTestDriver13 = new experiment.util.StackTestDriver();
        int int14 = stackTestDriver13.size();
        stackTestDriver13.clear();
        boolean boolean16 = stackTestDriver13.isEmpty();
        experiment.util.StackTestDriver stackTestDriver17 = new experiment.util.StackTestDriver();
        int int18 = stackTestDriver17.size();
        int int19 = stackTestDriver17.size();
        stackTestDriver17.clear();
        java.lang.Object obj21 = stackTestDriver13.push((java.lang.Object) stackTestDriver17);
        boolean boolean22 = stackTestDriver13.isEmpty();
        java.lang.Object obj23 = stackTestDriver13.peek();
        experiment.util.StackTestDriver stackTestDriver24 = new experiment.util.StackTestDriver();
        int int25 = stackTestDriver24.size();
        stackTestDriver24.clear();
        boolean boolean27 = stackTestDriver24.isEmpty();
        experiment.util.StackTestDriver stackTestDriver28 = new experiment.util.StackTestDriver();
        int int29 = stackTestDriver28.size();
        int int30 = stackTestDriver28.size();
        stackTestDriver28.clear();
        java.lang.Object obj32 = stackTestDriver24.push((java.lang.Object) stackTestDriver28);
        boolean boolean33 = stackTestDriver24.isEmpty();
        java.lang.Object obj34 = stackTestDriver13.push((java.lang.Object) stackTestDriver24);
        java.lang.Object obj35 = stackTestDriver2.push((java.lang.Object) stackTestDriver13);
        java.lang.Object obj36 = stackTestDriver0.push((java.lang.Object) stackTestDriver13);
        experiment.util.StackTestDriver stackTestDriver37 = new experiment.util.StackTestDriver();
        stackTestDriver37.clear();
        java.lang.Object obj40 = stackTestDriver37.push((java.lang.Object) (short) 0);
        boolean boolean41 = stackTestDriver37.isEmpty();
        java.lang.Object obj42 = stackTestDriver13.push((java.lang.Object) stackTestDriver37);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + (short) 0 + "'", obj40, (short) 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(obj42);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test240");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean5 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        boolean boolean7 = stackTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test241");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        java.lang.Object obj3 = stackTestDriver0.push((java.lang.Object) (short) 0);
        int int4 = stackTestDriver0.size();
        int int5 = stackTestDriver0.size();
        java.lang.Object obj6 = stackTestDriver0.peek();
        java.lang.Object obj7 = stackTestDriver0.pop();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (short) 0 + "'", obj3, (short) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 0 + "'", obj6, (short) 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (short) 0 + "'", obj7, (short) 0);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test242");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (short) 0);
        experiment.util.StackTestDriver stackTestDriver3 = new experiment.util.StackTestDriver();
        int int4 = stackTestDriver3.size();
        stackTestDriver3.clear();
        boolean boolean6 = stackTestDriver3.isEmpty();
        experiment.util.StackTestDriver stackTestDriver7 = new experiment.util.StackTestDriver();
        int int8 = stackTestDriver7.size();
        int int9 = stackTestDriver7.size();
        stackTestDriver7.clear();
        java.lang.Object obj11 = stackTestDriver3.push((java.lang.Object) stackTestDriver7);
        boolean boolean12 = stackTestDriver3.isEmpty();
        java.lang.Object obj13 = stackTestDriver3.peek();
        java.lang.Object obj14 = stackTestDriver3.peek();
        java.lang.Object obj15 = stackTestDriver3.peek();
        boolean boolean16 = stackTestDriver3.isEmpty();
        experiment.util.StackTestDriver stackTestDriver17 = new experiment.util.StackTestDriver();
        int int18 = stackTestDriver17.size();
        stackTestDriver17.clear();
        boolean boolean20 = stackTestDriver17.isEmpty();
        experiment.util.StackTestDriver stackTestDriver21 = new experiment.util.StackTestDriver();
        int int22 = stackTestDriver21.size();
        int int23 = stackTestDriver21.size();
        stackTestDriver21.clear();
        java.lang.Object obj25 = stackTestDriver17.push((java.lang.Object) stackTestDriver21);
        stackTestDriver17.clear();
        int int27 = stackTestDriver17.size();
        experiment.util.StackTestDriver stackTestDriver28 = new experiment.util.StackTestDriver();
        int int29 = stackTestDriver28.size();
        stackTestDriver28.clear();
        boolean boolean31 = stackTestDriver28.isEmpty();
        experiment.util.StackTestDriver stackTestDriver32 = new experiment.util.StackTestDriver();
        int int33 = stackTestDriver32.size();
        int int34 = stackTestDriver32.size();
        stackTestDriver32.clear();
        java.lang.Object obj36 = stackTestDriver28.push((java.lang.Object) stackTestDriver32);
        boolean boolean37 = stackTestDriver28.isEmpty();
        java.lang.Object obj38 = stackTestDriver28.peek();
        experiment.util.StackTestDriver stackTestDriver39 = new experiment.util.StackTestDriver();
        int int40 = stackTestDriver39.size();
        stackTestDriver39.clear();
        boolean boolean42 = stackTestDriver39.isEmpty();
        experiment.util.StackTestDriver stackTestDriver43 = new experiment.util.StackTestDriver();
        int int44 = stackTestDriver43.size();
        int int45 = stackTestDriver43.size();
        stackTestDriver43.clear();
        java.lang.Object obj47 = stackTestDriver39.push((java.lang.Object) stackTestDriver43);
        boolean boolean48 = stackTestDriver39.isEmpty();
        java.lang.Object obj49 = stackTestDriver28.push((java.lang.Object) stackTestDriver39);
        java.lang.Object obj50 = stackTestDriver17.push((java.lang.Object) stackTestDriver28);
        experiment.util.StackTestDriver stackTestDriver51 = new experiment.util.StackTestDriver();
        stackTestDriver51.clear();
        stackTestDriver51.clear();
        java.lang.Class<?> wildcardClass54 = stackTestDriver51.getClass();
        java.lang.Object obj55 = stackTestDriver17.push((java.lang.Object) wildcardClass54);
        stackTestDriver17.clear();
        java.lang.Object obj57 = stackTestDriver3.push((java.lang.Object) stackTestDriver17);
        java.lang.Object obj58 = stackTestDriver0.push(obj57);
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (short) 0 + "'", obj2, (short) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertNotNull(obj50);
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertNotNull(obj55);
        org.junit.Assert.assertEquals(obj55.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj55), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj55), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertNotNull(obj57);
        org.junit.Assert.assertNotNull(obj58);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test243");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        boolean boolean4 = stackTestDriver0.isEmpty();
        boolean boolean5 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        stackTestDriver6.clear();
        stackTestDriver6.clear();
        stackTestDriver6.clear();
        java.lang.Object obj10 = stackTestDriver0.push((java.lang.Object) stackTestDriver6);
        experiment.util.StackTestDriver stackTestDriver11 = new experiment.util.StackTestDriver();
        int int12 = stackTestDriver11.size();
        stackTestDriver11.clear();
        boolean boolean14 = stackTestDriver11.isEmpty();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        int int16 = stackTestDriver15.size();
        int int17 = stackTestDriver15.size();
        stackTestDriver15.clear();
        java.lang.Object obj19 = stackTestDriver11.push((java.lang.Object) stackTestDriver15);
        boolean boolean20 = stackTestDriver11.isEmpty();
        java.lang.Object obj21 = stackTestDriver11.peek();
        experiment.util.StackTestDriver stackTestDriver22 = new experiment.util.StackTestDriver();
        int int23 = stackTestDriver22.size();
        stackTestDriver22.clear();
        boolean boolean25 = stackTestDriver22.isEmpty();
        experiment.util.StackTestDriver stackTestDriver26 = new experiment.util.StackTestDriver();
        int int27 = stackTestDriver26.size();
        int int28 = stackTestDriver26.size();
        stackTestDriver26.clear();
        java.lang.Object obj30 = stackTestDriver22.push((java.lang.Object) stackTestDriver26);
        boolean boolean31 = stackTestDriver22.isEmpty();
        java.lang.Object obj32 = stackTestDriver11.push((java.lang.Object) stackTestDriver22);
        java.lang.Object obj33 = stackTestDriver22.peek();
        java.lang.Object obj34 = stackTestDriver6.push(obj33);
        java.lang.Class<?> wildcardClass35 = stackTestDriver6.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test244");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        int int4 = stackTestDriver0.size();
        boolean boolean5 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        int int7 = stackTestDriver6.size();
        int int8 = stackTestDriver6.size();
        int int9 = stackTestDriver6.size();
        boolean boolean10 = stackTestDriver6.isEmpty();
        java.lang.Object obj11 = stackTestDriver0.push((java.lang.Object) stackTestDriver6);
        int int12 = stackTestDriver6.size();
        boolean boolean13 = stackTestDriver6.isEmpty();
        int int14 = stackTestDriver6.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test245");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        java.lang.Object obj3 = stackTestDriver0.push((java.lang.Object) (short) 0);
        int int4 = stackTestDriver0.size();
        boolean boolean5 = stackTestDriver0.isEmpty();
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) (-1.0d));
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        stackTestDriver8.clear();
        java.lang.Object obj11 = stackTestDriver8.push((java.lang.Object) (short) 0);
        int int12 = stackTestDriver8.size();
        boolean boolean13 = stackTestDriver8.isEmpty();
        java.lang.Object obj14 = stackTestDriver0.push((java.lang.Object) stackTestDriver8);
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        int int16 = stackTestDriver15.size();
        stackTestDriver15.clear();
        boolean boolean18 = stackTestDriver15.isEmpty();
        experiment.util.StackTestDriver stackTestDriver19 = new experiment.util.StackTestDriver();
        int int20 = stackTestDriver19.size();
        int int21 = stackTestDriver19.size();
        stackTestDriver19.clear();
        java.lang.Object obj23 = stackTestDriver15.push((java.lang.Object) stackTestDriver19);
        stackTestDriver15.clear();
        int int25 = stackTestDriver15.size();
        experiment.util.StackTestDriver stackTestDriver26 = new experiment.util.StackTestDriver();
        int int27 = stackTestDriver26.size();
        stackTestDriver26.clear();
        boolean boolean29 = stackTestDriver26.isEmpty();
        experiment.util.StackTestDriver stackTestDriver30 = new experiment.util.StackTestDriver();
        int int31 = stackTestDriver30.size();
        int int32 = stackTestDriver30.size();
        stackTestDriver30.clear();
        java.lang.Object obj34 = stackTestDriver26.push((java.lang.Object) stackTestDriver30);
        boolean boolean35 = stackTestDriver26.isEmpty();
        java.lang.Object obj36 = stackTestDriver26.peek();
        experiment.util.StackTestDriver stackTestDriver37 = new experiment.util.StackTestDriver();
        int int38 = stackTestDriver37.size();
        stackTestDriver37.clear();
        boolean boolean40 = stackTestDriver37.isEmpty();
        experiment.util.StackTestDriver stackTestDriver41 = new experiment.util.StackTestDriver();
        int int42 = stackTestDriver41.size();
        int int43 = stackTestDriver41.size();
        stackTestDriver41.clear();
        java.lang.Object obj45 = stackTestDriver37.push((java.lang.Object) stackTestDriver41);
        boolean boolean46 = stackTestDriver37.isEmpty();
        java.lang.Object obj47 = stackTestDriver26.push((java.lang.Object) stackTestDriver37);
        java.lang.Object obj48 = stackTestDriver15.push((java.lang.Object) stackTestDriver26);
        experiment.util.StackTestDriver stackTestDriver49 = new experiment.util.StackTestDriver();
        int int50 = stackTestDriver49.size();
        stackTestDriver49.clear();
        boolean boolean52 = stackTestDriver49.isEmpty();
        boolean boolean53 = stackTestDriver49.isEmpty();
        java.lang.Object obj54 = stackTestDriver26.push((java.lang.Object) boolean53);
        java.lang.Object obj55 = stackTestDriver0.push((java.lang.Object) boolean53);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (short) 0 + "'", obj3, (short) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (short) 0 + "'", obj11, (short) 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertEquals("'" + obj54 + "' != '" + true + "'", obj54, true);
        org.junit.Assert.assertEquals("'" + obj55 + "' != '" + true + "'", obj55, true);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test246");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean5 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        int int7 = stackTestDriver6.size();
        stackTestDriver6.clear();
        boolean boolean9 = stackTestDriver6.isEmpty();
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        int int11 = stackTestDriver10.size();
        int int12 = stackTestDriver10.size();
        stackTestDriver10.clear();
        java.lang.Object obj14 = stackTestDriver6.push((java.lang.Object) stackTestDriver10);
        boolean boolean15 = stackTestDriver6.isEmpty();
        java.lang.Object obj16 = stackTestDriver0.push((java.lang.Object) boolean15);
        boolean boolean17 = stackTestDriver0.isEmpty();
        java.lang.Object obj18 = stackTestDriver0.pop();
        boolean boolean19 = stackTestDriver0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + false + "'", obj16, false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + false + "'", obj18, false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test247");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        int int6 = stackTestDriver4.size();
        stackTestDriver4.clear();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        boolean boolean9 = stackTestDriver0.isEmpty();
        java.lang.Object obj10 = stackTestDriver0.peek();
        experiment.util.StackTestDriver stackTestDriver11 = new experiment.util.StackTestDriver();
        int int12 = stackTestDriver11.size();
        stackTestDriver11.clear();
        boolean boolean14 = stackTestDriver11.isEmpty();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        int int16 = stackTestDriver15.size();
        int int17 = stackTestDriver15.size();
        stackTestDriver15.clear();
        java.lang.Object obj19 = stackTestDriver11.push((java.lang.Object) stackTestDriver15);
        boolean boolean20 = stackTestDriver11.isEmpty();
        java.lang.Object obj21 = stackTestDriver0.push((java.lang.Object) stackTestDriver11);
        java.lang.Object obj22 = stackTestDriver11.peek();
        int int23 = stackTestDriver11.size();
        stackTestDriver11.clear();
        java.lang.Class<?> wildcardClass25 = stackTestDriver11.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test248");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver3 = new experiment.util.StackTestDriver();
        int int4 = stackTestDriver3.size();
        int int5 = stackTestDriver3.size();
        stackTestDriver3.clear();
        int int7 = stackTestDriver3.size();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) int7);
        boolean boolean9 = stackTestDriver0.isEmpty();
        boolean boolean10 = stackTestDriver0.isEmpty();
        java.lang.Object obj11 = stackTestDriver0.peek();
        java.lang.Class<?> wildcardClass12 = obj11.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0 + "'", obj8, 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 0 + "'", obj11, 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test249");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        int int2 = stackTestDriver0.size();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) "");
        int int5 = stackTestDriver0.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + "" + "'", obj4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test250");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        int int6 = stackTestDriver4.size();
        stackTestDriver4.clear();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        boolean boolean9 = stackTestDriver0.isEmpty();
        java.lang.Object obj10 = stackTestDriver0.peek();
        int int11 = stackTestDriver0.size();
        java.lang.Object obj12 = stackTestDriver0.peek();
        experiment.util.StackTestDriver stackTestDriver13 = new experiment.util.StackTestDriver();
        int int14 = stackTestDriver13.size();
        int int15 = stackTestDriver13.size();
        boolean boolean16 = stackTestDriver13.isEmpty();
        java.lang.Object obj17 = stackTestDriver0.push((java.lang.Object) stackTestDriver13);
        int int18 = stackTestDriver13.size();
        stackTestDriver13.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = stackTestDriver13.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test251");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        int int6 = stackTestDriver4.size();
        stackTestDriver4.clear();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        boolean boolean9 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test252");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        java.lang.Object obj3 = stackTestDriver0.push((java.lang.Object) (short) 0);
        int int4 = stackTestDriver0.size();
        int int5 = stackTestDriver0.size();
        java.lang.Object obj6 = stackTestDriver0.peek();
        java.lang.Object obj7 = stackTestDriver0.pop();
        stackTestDriver0.clear();
        boolean boolean9 = stackTestDriver0.isEmpty();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (short) 0 + "'", obj3, (short) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 0 + "'", obj6, (short) 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (short) 0 + "'", obj7, (short) 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test253");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        int int6 = stackTestDriver4.size();
        stackTestDriver4.clear();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        boolean boolean9 = stackTestDriver0.isEmpty();
        java.lang.Object obj10 = stackTestDriver0.peek();
        int int11 = stackTestDriver0.size();
        boolean boolean12 = stackTestDriver0.isEmpty();
        boolean boolean13 = stackTestDriver0.isEmpty();
        java.lang.Object obj14 = stackTestDriver0.peek();
        java.lang.Object obj15 = stackTestDriver0.pop();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test254");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        int int2 = stackTestDriver0.size();
        stackTestDriver0.clear();
        int int4 = stackTestDriver0.size();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver7 = new experiment.util.StackTestDriver();
        int int8 = stackTestDriver7.size();
        stackTestDriver7.clear();
        boolean boolean10 = stackTestDriver7.isEmpty();
        experiment.util.StackTestDriver stackTestDriver11 = new experiment.util.StackTestDriver();
        int int12 = stackTestDriver11.size();
        int int13 = stackTestDriver11.size();
        stackTestDriver11.clear();
        java.lang.Object obj15 = stackTestDriver7.push((java.lang.Object) stackTestDriver11);
        stackTestDriver7.clear();
        int int17 = stackTestDriver7.size();
        experiment.util.StackTestDriver stackTestDriver18 = new experiment.util.StackTestDriver();
        int int19 = stackTestDriver18.size();
        int int20 = stackTestDriver18.size();
        int int21 = stackTestDriver18.size();
        experiment.util.StackTestDriver stackTestDriver22 = new experiment.util.StackTestDriver();
        int int23 = stackTestDriver22.size();
        stackTestDriver22.clear();
        boolean boolean25 = stackTestDriver22.isEmpty();
        experiment.util.StackTestDriver stackTestDriver26 = new experiment.util.StackTestDriver();
        int int27 = stackTestDriver26.size();
        int int28 = stackTestDriver26.size();
        stackTestDriver26.clear();
        java.lang.Object obj30 = stackTestDriver22.push((java.lang.Object) stackTestDriver26);
        stackTestDriver22.clear();
        int int32 = stackTestDriver22.size();
        experiment.util.StackTestDriver stackTestDriver33 = new experiment.util.StackTestDriver();
        int int34 = stackTestDriver33.size();
        stackTestDriver33.clear();
        boolean boolean36 = stackTestDriver33.isEmpty();
        experiment.util.StackTestDriver stackTestDriver37 = new experiment.util.StackTestDriver();
        int int38 = stackTestDriver37.size();
        int int39 = stackTestDriver37.size();
        stackTestDriver37.clear();
        java.lang.Object obj41 = stackTestDriver33.push((java.lang.Object) stackTestDriver37);
        boolean boolean42 = stackTestDriver33.isEmpty();
        java.lang.Object obj43 = stackTestDriver33.peek();
        experiment.util.StackTestDriver stackTestDriver44 = new experiment.util.StackTestDriver();
        int int45 = stackTestDriver44.size();
        stackTestDriver44.clear();
        boolean boolean47 = stackTestDriver44.isEmpty();
        experiment.util.StackTestDriver stackTestDriver48 = new experiment.util.StackTestDriver();
        int int49 = stackTestDriver48.size();
        int int50 = stackTestDriver48.size();
        stackTestDriver48.clear();
        java.lang.Object obj52 = stackTestDriver44.push((java.lang.Object) stackTestDriver48);
        boolean boolean53 = stackTestDriver44.isEmpty();
        java.lang.Object obj54 = stackTestDriver33.push((java.lang.Object) stackTestDriver44);
        java.lang.Object obj55 = stackTestDriver22.push((java.lang.Object) stackTestDriver33);
        java.lang.Object obj56 = stackTestDriver22.pop();
        java.lang.Object obj57 = stackTestDriver18.push((java.lang.Object) stackTestDriver22);
        java.lang.Object obj58 = stackTestDriver7.push((java.lang.Object) stackTestDriver22);
        java.lang.Object obj59 = stackTestDriver7.peek();
        experiment.util.StackTestDriver stackTestDriver60 = new experiment.util.StackTestDriver();
        int int61 = stackTestDriver60.size();
        stackTestDriver60.clear();
        boolean boolean63 = stackTestDriver60.isEmpty();
        experiment.util.StackTestDriver stackTestDriver64 = new experiment.util.StackTestDriver();
        int int65 = stackTestDriver64.size();
        int int66 = stackTestDriver64.size();
        stackTestDriver64.clear();
        java.lang.Object obj68 = stackTestDriver60.push((java.lang.Object) stackTestDriver64);
        stackTestDriver60.clear();
        java.lang.Object obj71 = stackTestDriver60.push((java.lang.Object) 10L);
        java.lang.Object obj72 = stackTestDriver60.peek();
        experiment.util.StackTestDriver stackTestDriver73 = new experiment.util.StackTestDriver();
        int int74 = stackTestDriver73.size();
        stackTestDriver73.clear();
        boolean boolean76 = stackTestDriver73.isEmpty();
        int int77 = stackTestDriver73.size();
        boolean boolean78 = stackTestDriver73.isEmpty();
        experiment.util.StackTestDriver stackTestDriver79 = new experiment.util.StackTestDriver();
        stackTestDriver79.clear();
        stackTestDriver79.clear();
        java.lang.Object obj83 = stackTestDriver79.push((java.lang.Object) 1L);
        java.lang.Object obj84 = stackTestDriver73.push((java.lang.Object) stackTestDriver79);
        java.lang.Object obj85 = stackTestDriver60.push((java.lang.Object) stackTestDriver73);
        java.lang.Object obj86 = stackTestDriver7.push((java.lang.Object) stackTestDriver73);
        java.lang.Object obj87 = stackTestDriver0.push(obj86);
        stackTestDriver0.clear();
        java.lang.Class<?> wildcardClass89 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(obj43);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(obj52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(obj54);
        org.junit.Assert.assertNotNull(obj55);
        org.junit.Assert.assertNotNull(obj56);
        org.junit.Assert.assertNotNull(obj57);
        org.junit.Assert.assertNotNull(obj58);
        org.junit.Assert.assertNotNull(obj59);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNotNull(obj68);
        org.junit.Assert.assertEquals("'" + obj71 + "' != '" + 10L + "'", obj71, 10L);
        org.junit.Assert.assertEquals("'" + obj72 + "' != '" + 10L + "'", obj72, 10L);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertEquals("'" + obj83 + "' != '" + 1L + "'", obj83, 1L);
        org.junit.Assert.assertNotNull(obj84);
        org.junit.Assert.assertNotNull(obj85);
        org.junit.Assert.assertNotNull(obj86);
        org.junit.Assert.assertNotNull(obj87);
        org.junit.Assert.assertNotNull(wildcardClass89);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test255");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        stackTestDriver4.clear();
        boolean boolean7 = stackTestDriver4.isEmpty();
        boolean boolean8 = stackTestDriver4.isEmpty();
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) boolean8);
        java.lang.Object obj11 = stackTestDriver0.push((java.lang.Object) (byte) 100);
        java.lang.Class<?> wildcardClass12 = obj11.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + true + "'", obj9, true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 100 + "'", obj11, (byte) 100);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_939145594_1024_0.test256");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        boolean boolean4 = stackTestDriver0.isEmpty();
        boolean boolean5 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        int int7 = stackTestDriver6.size();
        int int8 = stackTestDriver6.size();
        int int9 = stackTestDriver6.size();
        stackTestDriver6.clear();
        stackTestDriver6.clear();
        java.lang.Object obj12 = stackTestDriver0.push((java.lang.Object) stackTestDriver6);
        stackTestDriver6.clear();
        int int14 = stackTestDriver6.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

}
