package experiment.util.test;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Regression_StackTest_54676380_32_s {

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
            System.out.format("%n%s%n", "Regression_StackTest_54676380_1024_0.test001");
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
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_54676380_1024_0.test002");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Class<?> wildcardClass3 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_54676380_1024_0.test003");
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
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_54676380_1024_0.test004");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        java.lang.Object obj3 = stackTestDriver0.push((java.lang.Object) 0L);
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        java.lang.Object obj7 = stackTestDriver4.push((java.lang.Object) 0L);
        stackTestDriver4.clear();
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = stackTestDriver4.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0L + "'", obj3, 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0L + "'", obj7, 0L);
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_54676380_1024_0.test005");
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
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_54676380_1024_0.test006");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_54676380_1024_0.test007");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Class<?> wildcardClass1 = stackTestDriver0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_54676380_1024_0.test008");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        boolean boolean3 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        java.lang.Object obj7 = stackTestDriver4.push((java.lang.Object) 0L);
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        int int9 = stackTestDriver8.size();
        java.lang.Object obj11 = stackTestDriver8.push((java.lang.Object) 0L);
        stackTestDriver8.clear();
        java.lang.Object obj13 = stackTestDriver4.push((java.lang.Object) stackTestDriver8);
        java.lang.Object obj14 = stackTestDriver0.push((java.lang.Object) stackTestDriver8);
        java.lang.Class<?> wildcardClass15 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0L + "'", obj7, 0L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 0L + "'", obj11, 0L);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_54676380_1024_0.test009");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver2 = new experiment.util.StackTestDriver();
        int int3 = stackTestDriver2.size();
        java.lang.Object obj5 = stackTestDriver2.push((java.lang.Object) 0L);
        java.lang.Object obj6 = stackTestDriver0.push(obj5);
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 0L + "'", obj5, 0L);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0L + "'", obj6, 0L);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_54676380_1024_0.test010");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        boolean boolean3 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        java.lang.Class<?> wildcardClass5 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_54676380_1024_0.test011");
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
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_54676380_1024_0.test012");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        boolean boolean3 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        java.lang.Object obj7 = stackTestDriver4.push((java.lang.Object) 0L);
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        int int9 = stackTestDriver8.size();
        java.lang.Object obj11 = stackTestDriver8.push((java.lang.Object) 0L);
        stackTestDriver8.clear();
        java.lang.Object obj13 = stackTestDriver4.push((java.lang.Object) stackTestDriver8);
        java.lang.Object obj14 = stackTestDriver0.push((java.lang.Object) stackTestDriver8);
        int int15 = stackTestDriver8.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = stackTestDriver8.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0L + "'", obj7, 0L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 0L + "'", obj11, 0L);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_54676380_1024_0.test013");
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
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_54676380_1024_0.test014");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        boolean boolean2 = stackTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_54676380_1024_0.test015");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver2 = new experiment.util.StackTestDriver();
        int int3 = stackTestDriver2.size();
        java.lang.Object obj5 = stackTestDriver2.push((java.lang.Object) 0L);
        java.lang.Object obj6 = stackTestDriver0.push(obj5);
        int int7 = stackTestDriver0.size();
        java.lang.Class<?> wildcardClass8 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 0L + "'", obj5, 0L);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0L + "'", obj6, 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_54676380_1024_0.test016");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        boolean boolean3 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        java.lang.Object obj7 = stackTestDriver4.push((java.lang.Object) 0L);
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        int int9 = stackTestDriver8.size();
        java.lang.Object obj11 = stackTestDriver8.push((java.lang.Object) 0L);
        stackTestDriver8.clear();
        java.lang.Object obj13 = stackTestDriver4.push((java.lang.Object) stackTestDriver8);
        java.lang.Object obj14 = stackTestDriver0.push((java.lang.Object) stackTestDriver8);
        boolean boolean15 = stackTestDriver0.isEmpty();
        java.lang.Object obj16 = stackTestDriver0.peek();
        java.lang.Class<?> wildcardClass17 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0L + "'", obj7, 0L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 0L + "'", obj11, 0L);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_54676380_1024_0.test017");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        boolean boolean3 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        java.lang.Object obj7 = stackTestDriver4.push((java.lang.Object) 0L);
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        int int9 = stackTestDriver8.size();
        java.lang.Object obj11 = stackTestDriver8.push((java.lang.Object) 0L);
        stackTestDriver8.clear();
        java.lang.Object obj13 = stackTestDriver4.push((java.lang.Object) stackTestDriver8);
        java.lang.Object obj14 = stackTestDriver0.push((java.lang.Object) stackTestDriver8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = stackTestDriver8.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0L + "'", obj7, 0L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 0L + "'", obj11, 0L);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_54676380_1024_0.test018");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        java.lang.Object obj3 = stackTestDriver0.push((java.lang.Object) 0L);
        stackTestDriver0.clear();
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) (byte) 0);
        java.lang.Object obj7 = stackTestDriver0.pop();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0L + "'", obj3, 0L);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 0 + "'", obj6, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 0 + "'", obj7, (byte) 0);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_54676380_1024_0.test019");
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
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_54676380_1024_0.test020");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        boolean boolean2 = stackTestDriver0.isEmpty();
        int int3 = stackTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_54676380_1024_0.test021");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        boolean boolean3 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        java.lang.Object obj7 = stackTestDriver4.push((java.lang.Object) 0L);
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        int int9 = stackTestDriver8.size();
        java.lang.Object obj11 = stackTestDriver8.push((java.lang.Object) 0L);
        stackTestDriver8.clear();
        java.lang.Object obj13 = stackTestDriver4.push((java.lang.Object) stackTestDriver8);
        java.lang.Object obj14 = stackTestDriver0.push((java.lang.Object) stackTestDriver8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = stackTestDriver8.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0L + "'", obj7, 0L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 0L + "'", obj11, 0L);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_54676380_1024_0.test022");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver2 = new experiment.util.StackTestDriver();
        int int3 = stackTestDriver2.size();
        java.lang.Object obj5 = stackTestDriver2.push((java.lang.Object) 0L);
        java.lang.Object obj6 = stackTestDriver0.push(obj5);
        int int7 = stackTestDriver0.size();
        boolean boolean8 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        java.lang.Class<?> wildcardClass10 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 0L + "'", obj5, 0L);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0L + "'", obj6, 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_54676380_1024_0.test023");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        java.lang.Object obj3 = stackTestDriver0.push((java.lang.Object) 0L);
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        java.lang.Object obj7 = stackTestDriver4.push((java.lang.Object) 0L);
        stackTestDriver4.clear();
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        java.lang.Object obj10 = stackTestDriver0.peek();
        java.lang.Object obj11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = stackTestDriver0.push(obj11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0L + "'", obj3, 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0L + "'", obj7, 0L);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_54676380_1024_0.test024");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        java.lang.Object obj3 = stackTestDriver0.push((java.lang.Object) 0L);
        stackTestDriver0.clear();
        java.lang.Class<?> wildcardClass5 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0L + "'", obj3, 0L);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_54676380_1024_0.test025");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        boolean boolean3 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        java.lang.Object obj7 = stackTestDriver4.push((java.lang.Object) 0L);
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        int int9 = stackTestDriver8.size();
        java.lang.Object obj11 = stackTestDriver8.push((java.lang.Object) 0L);
        stackTestDriver8.clear();
        java.lang.Object obj13 = stackTestDriver4.push((java.lang.Object) stackTestDriver8);
        java.lang.Object obj14 = stackTestDriver0.push((java.lang.Object) stackTestDriver8);
        int int15 = stackTestDriver8.size();
        int int16 = stackTestDriver8.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = stackTestDriver8.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0L + "'", obj7, 0L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 0L + "'", obj11, 0L);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_54676380_1024_0.test026");
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
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_54676380_1024_0.test027");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_54676380_1024_0.test028");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver2 = new experiment.util.StackTestDriver();
        int int3 = stackTestDriver2.size();
        java.lang.Object obj5 = stackTestDriver2.push((java.lang.Object) 0L);
        java.lang.Object obj6 = stackTestDriver0.push(obj5);
        int int7 = stackTestDriver0.size();
        boolean boolean8 = stackTestDriver0.isEmpty();
        java.lang.Object obj9 = stackTestDriver0.peek();
        java.lang.Object obj11 = stackTestDriver0.push((java.lang.Object) 10.0d);
        experiment.util.StackTestDriver stackTestDriver12 = new experiment.util.StackTestDriver();
        int int13 = stackTestDriver12.size();
        boolean boolean14 = stackTestDriver12.isEmpty();
        boolean boolean15 = stackTestDriver12.isEmpty();
        experiment.util.StackTestDriver stackTestDriver16 = new experiment.util.StackTestDriver();
        int int17 = stackTestDriver16.size();
        java.lang.Object obj19 = stackTestDriver16.push((java.lang.Object) 0L);
        experiment.util.StackTestDriver stackTestDriver20 = new experiment.util.StackTestDriver();
        int int21 = stackTestDriver20.size();
        java.lang.Object obj23 = stackTestDriver20.push((java.lang.Object) 0L);
        stackTestDriver20.clear();
        java.lang.Object obj25 = stackTestDriver16.push((java.lang.Object) stackTestDriver20);
        java.lang.Object obj26 = stackTestDriver12.push((java.lang.Object) stackTestDriver20);
        experiment.util.StackTestDriver stackTestDriver27 = new experiment.util.StackTestDriver();
        int int28 = stackTestDriver27.size();
        boolean boolean29 = stackTestDriver27.isEmpty();
        boolean boolean30 = stackTestDriver27.isEmpty();
        experiment.util.StackTestDriver stackTestDriver31 = new experiment.util.StackTestDriver();
        int int32 = stackTestDriver31.size();
        java.lang.Object obj34 = stackTestDriver31.push((java.lang.Object) 0L);
        experiment.util.StackTestDriver stackTestDriver35 = new experiment.util.StackTestDriver();
        int int36 = stackTestDriver35.size();
        java.lang.Object obj38 = stackTestDriver35.push((java.lang.Object) 0L);
        stackTestDriver35.clear();
        java.lang.Object obj40 = stackTestDriver31.push((java.lang.Object) stackTestDriver35);
        java.lang.Object obj41 = stackTestDriver27.push((java.lang.Object) stackTestDriver35);
        boolean boolean42 = stackTestDriver27.isEmpty();
        boolean boolean43 = stackTestDriver27.isEmpty();
        boolean boolean44 = stackTestDriver27.isEmpty();
        java.lang.Object obj45 = stackTestDriver12.push((java.lang.Object) stackTestDriver27);
        stackTestDriver12.clear();
        java.lang.Object obj47 = stackTestDriver0.push((java.lang.Object) stackTestDriver12);
        stackTestDriver12.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj49 = stackTestDriver12.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 0L + "'", obj5, 0L);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0L + "'", obj6, 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0L + "'", obj9, 0L);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 10.0d + "'", obj11, 10.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 0L + "'", obj19, 0L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 0L + "'", obj23, 0L);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + 0L + "'", obj34, 0L);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + 0L + "'", obj38, 0L);
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertNotNull(obj47);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_54676380_1024_0.test029");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        boolean boolean2 = stackTestDriver0.isEmpty();
        int int3 = stackTestDriver0.size();
        boolean boolean4 = stackTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_54676380_1024_0.test030");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        boolean boolean3 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        java.lang.Object obj7 = stackTestDriver4.push((java.lang.Object) 0L);
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        int int9 = stackTestDriver8.size();
        java.lang.Object obj11 = stackTestDriver8.push((java.lang.Object) 0L);
        stackTestDriver8.clear();
        java.lang.Object obj13 = stackTestDriver4.push((java.lang.Object) stackTestDriver8);
        java.lang.Object obj14 = stackTestDriver0.push((java.lang.Object) stackTestDriver8);
        boolean boolean15 = stackTestDriver8.isEmpty();
        boolean boolean16 = stackTestDriver8.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = stackTestDriver8.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0L + "'", obj7, 0L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 0L + "'", obj11, 0L);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_54676380_1024_0.test031");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver2 = new experiment.util.StackTestDriver();
        int int3 = stackTestDriver2.size();
        java.lang.Object obj5 = stackTestDriver2.push((java.lang.Object) 0L);
        java.lang.Object obj6 = stackTestDriver0.push(obj5);
        int int7 = stackTestDriver0.size();
        boolean boolean8 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 0L + "'", obj5, 0L);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0L + "'", obj6, 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_54676380_1024_0.test032");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        java.lang.Object obj3 = stackTestDriver0.push((java.lang.Object) 0L);
        stackTestDriver0.clear();
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) (byte) 0);
        java.lang.Object obj7 = stackTestDriver0.pop();
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0L + "'", obj3, 0L);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 0 + "'", obj6, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 0 + "'", obj7, (byte) 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

}
