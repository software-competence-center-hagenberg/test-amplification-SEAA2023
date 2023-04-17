package experiment.util.test;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Regression_StackTest_1321793073_128_s {

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
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test001");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test002");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj1 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test003");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 0);
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 0 + "'", obj2, (byte) 0);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test004");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) false);
        java.lang.Object obj3 = stackTestDriver0.pop();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + false + "'", obj2, false);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test005");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 0);
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 0 + "'", obj2, (byte) 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test006");
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
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test007");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) false);
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + false + "'", obj2, false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test008");
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
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test009");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 0);
        java.lang.Object obj3 = stackTestDriver0.pop();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 0 + "'", obj2, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 0 + "'", obj3, (byte) 0);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test010");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 0);
        stackTestDriver0.clear();
        java.lang.Class<?> wildcardClass4 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 0 + "'", obj2, (byte) 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test011");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver1 = new experiment.util.StackTestDriver();
        java.lang.Object obj3 = stackTestDriver1.push((java.lang.Object) (byte) 0);
        java.lang.Object obj4 = stackTestDriver0.push(obj3);
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) 1L);
        java.lang.Class<?> wildcardClass7 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 0 + "'", obj3, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 0 + "'", obj4, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1L + "'", obj6, 1L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test012");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 0);
        stackTestDriver0.clear();
        boolean boolean4 = stackTestDriver0.isEmpty();
        java.lang.Class<?> wildcardClass5 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 0 + "'", obj2, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test013");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) false);
        java.lang.Object obj3 = stackTestDriver0.peek();
        stackTestDriver0.clear();
        int int5 = stackTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + false + "'", obj2, false);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test014");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test015");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 0);
        stackTestDriver0.clear();
        int int4 = stackTestDriver0.size();
        int int5 = stackTestDriver0.size();
        java.lang.Class<?> wildcardClass6 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 0 + "'", obj2, (byte) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test016");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 0);
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
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 0 + "'", obj2, (byte) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test017");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test018");
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
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test019");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) false);
        stackTestDriver0.clear();
        boolean boolean4 = stackTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + false + "'", obj2, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test020");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) false);
        java.lang.Object obj3 = stackTestDriver0.peek();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        java.lang.Object obj6 = stackTestDriver4.push((java.lang.Object) (byte) 0);
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) (byte) 0);
        java.lang.Object obj8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = stackTestDriver0.push(obj8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + false + "'", obj2, false);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 0 + "'", obj6, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 0 + "'", obj7, (byte) 0);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test021");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) false);
        java.lang.Object obj3 = stackTestDriver0.peek();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        java.lang.Object obj6 = stackTestDriver4.push((java.lang.Object) (byte) 0);
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) (byte) 0);
        boolean boolean8 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + false + "'", obj2, false);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 0 + "'", obj6, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 0 + "'", obj7, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test022");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) false);
        java.lang.Object obj3 = stackTestDriver0.peek();
        stackTestDriver0.clear();
        int int5 = stackTestDriver0.size();
        java.lang.Class<?> wildcardClass6 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + false + "'", obj2, false);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test023");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
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
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test024");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test025");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver1 = new experiment.util.StackTestDriver();
        java.lang.Object obj3 = stackTestDriver1.push((java.lang.Object) (byte) 0);
        java.lang.Object obj4 = stackTestDriver0.push(obj3);
        java.lang.Class<?> wildcardClass5 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 0 + "'", obj3, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 0 + "'", obj4, (byte) 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test026");
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
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test027");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        boolean boolean4 = stackTestDriver0.isEmpty();
        java.lang.Class<?> wildcardClass5 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test028");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) 0);
        stackTestDriver5.clear();
        int int9 = stackTestDriver5.size();
        java.lang.Object obj10 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        stackTestDriver5.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = stackTestDriver5.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 0 + "'", obj7, (byte) 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test029");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) false);
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        java.lang.Object obj6 = stackTestDriver4.push((java.lang.Object) false);
        java.lang.Object obj7 = stackTestDriver4.peek();
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        java.lang.Object obj10 = stackTestDriver8.push((java.lang.Object) (byte) 0);
        java.lang.Object obj11 = stackTestDriver4.push((java.lang.Object) (byte) 0);
        java.lang.Object obj12 = stackTestDriver4.peek();
        java.lang.Object obj13 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + false + "'", obj2, false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + false + "'", obj6, false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + false + "'", obj7, false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) 0 + "'", obj10, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 0 + "'", obj11, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) 0 + "'", obj12, (byte) 0);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test030");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 0);
        stackTestDriver0.clear();
        int int4 = stackTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 0 + "'", obj2, (byte) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test031");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test032");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver1 = new experiment.util.StackTestDriver();
        java.lang.Object obj3 = stackTestDriver1.push((java.lang.Object) (byte) 0);
        java.lang.Object obj4 = stackTestDriver0.push(obj3);
        int int5 = stackTestDriver0.size();
        java.lang.Object obj6 = stackTestDriver0.peek();
        boolean boolean7 = stackTestDriver0.isEmpty();
        boolean boolean8 = stackTestDriver0.isEmpty();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 0 + "'", obj3, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 0 + "'", obj4, (byte) 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 0 + "'", obj6, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test033");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver1 = new experiment.util.StackTestDriver();
        java.lang.Object obj3 = stackTestDriver1.push((java.lang.Object) (byte) 0);
        java.lang.Object obj4 = stackTestDriver0.push(obj3);
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) 1L);
        int int7 = stackTestDriver0.size();
        boolean boolean8 = stackTestDriver0.isEmpty();
        java.lang.Object obj9 = stackTestDriver0.peek();
        stackTestDriver0.clear();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 0 + "'", obj3, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 0 + "'", obj4, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1L + "'", obj6, 1L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 1L + "'", obj9, 1L);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test034");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        int int5 = stackTestDriver0.size();
        boolean boolean6 = stackTestDriver0.isEmpty();
        int int7 = stackTestDriver0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test035");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) false);
        java.lang.Object obj3 = stackTestDriver0.peek();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        java.lang.Object obj6 = stackTestDriver4.push((java.lang.Object) (byte) 0);
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) (byte) 0);
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + false + "'", obj2, false);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 0 + "'", obj6, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 0 + "'", obj7, (byte) 0);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test036");
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
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test037");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) false);
        java.lang.Object obj3 = stackTestDriver0.peek();
        java.lang.Object obj4 = stackTestDriver0.peek();
        java.lang.Object obj5 = stackTestDriver0.pop();
        java.lang.Class<?> wildcardClass6 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + false + "'", obj2, false);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + false + "'", obj4, false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + false + "'", obj5, false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test038");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver1 = new experiment.util.StackTestDriver();
        java.lang.Object obj3 = stackTestDriver1.push((java.lang.Object) (byte) 0);
        java.lang.Object obj4 = stackTestDriver0.push(obj3);
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) 1L);
        int int7 = stackTestDriver0.size();
        boolean boolean8 = stackTestDriver0.isEmpty();
        java.lang.Object obj9 = stackTestDriver0.peek();
        java.lang.Object obj10 = stackTestDriver0.pop();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 0 + "'", obj3, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 0 + "'", obj4, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1L + "'", obj6, 1L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 1L + "'", obj9, 1L);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 1L + "'", obj10, 1L);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test039");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        boolean boolean5 = stackTestDriver0.isEmpty();
        java.lang.Class<?> wildcardClass6 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test040");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 0);
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        java.lang.Class<?> wildcardClass5 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 0 + "'", obj2, (byte) 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test041");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver1 = new experiment.util.StackTestDriver();
        java.lang.Object obj3 = stackTestDriver1.push((java.lang.Object) (byte) 0);
        java.lang.Object obj4 = stackTestDriver0.push(obj3);
        int int5 = stackTestDriver0.size();
        boolean boolean6 = stackTestDriver0.isEmpty();
        java.lang.Class<?> wildcardClass7 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 0 + "'", obj3, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 0 + "'", obj4, (byte) 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test042");
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
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test043");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test044");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 0);
        stackTestDriver0.clear();
        boolean boolean4 = stackTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 0 + "'", obj2, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test045");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) false);
        java.lang.Object obj3 = stackTestDriver0.peek();
        java.lang.Object obj4 = stackTestDriver0.peek();
        java.lang.Object obj5 = stackTestDriver0.pop();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + false + "'", obj2, false);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + false + "'", obj4, false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + false + "'", obj5, false);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test046");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver1 = new experiment.util.StackTestDriver();
        java.lang.Object obj3 = stackTestDriver1.push((java.lang.Object) (byte) 0);
        java.lang.Object obj4 = stackTestDriver0.push(obj3);
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) 1L);
        int int7 = stackTestDriver0.size();
        boolean boolean8 = stackTestDriver0.isEmpty();
        java.lang.Object obj9 = stackTestDriver0.peek();
        java.lang.Object obj10 = stackTestDriver0.peek();
        int int11 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver12 = new experiment.util.StackTestDriver();
        int int13 = stackTestDriver12.size();
        boolean boolean14 = stackTestDriver12.isEmpty();
        stackTestDriver12.clear();
        stackTestDriver12.clear();
        experiment.util.StackTestDriver stackTestDriver17 = new experiment.util.StackTestDriver();
        java.lang.Object obj19 = stackTestDriver17.push((java.lang.Object) (byte) 0);
        stackTestDriver17.clear();
        int int21 = stackTestDriver17.size();
        java.lang.Object obj22 = stackTestDriver12.push((java.lang.Object) stackTestDriver17);
        java.lang.Object obj23 = stackTestDriver0.push((java.lang.Object) stackTestDriver17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = stackTestDriver17.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 0 + "'", obj3, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 0 + "'", obj4, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1L + "'", obj6, 1L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 1L + "'", obj9, 1L);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 1L + "'", obj10, 1L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (byte) 0 + "'", obj19, (byte) 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(obj23);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test047");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) "");
        java.lang.Class<?> wildcardClass5 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + "" + "'", obj4, "");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test048");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 0);
        stackTestDriver0.clear();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (-1.0d));
        int int6 = stackTestDriver0.size();
        boolean boolean7 = stackTestDriver0.isEmpty();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 0 + "'", obj2, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test049");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) false);
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        java.lang.Object obj6 = stackTestDriver4.push((java.lang.Object) false);
        java.lang.Object obj7 = stackTestDriver4.peek();
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        java.lang.Object obj10 = stackTestDriver8.push((java.lang.Object) (byte) 0);
        java.lang.Object obj11 = stackTestDriver4.push((java.lang.Object) (byte) 0);
        java.lang.Object obj12 = stackTestDriver4.peek();
        java.lang.Object obj13 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        java.lang.Object obj14 = stackTestDriver0.peek();
        java.lang.Object obj15 = stackTestDriver0.pop();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + false + "'", obj2, false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + false + "'", obj6, false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + false + "'", obj7, false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) 0 + "'", obj10, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 0 + "'", obj11, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) 0 + "'", obj12, (byte) 0);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test050");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        java.lang.Class<?> wildcardClass3 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test051");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) false);
        java.lang.Object obj3 = stackTestDriver0.peek();
        java.lang.Object obj4 = stackTestDriver0.peek();
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + false + "'", obj2, false);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + false + "'", obj4, false);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test052");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        int int3 = stackTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test053");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 0);
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 0 + "'", obj2, (byte) 0);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test054");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        int int3 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        java.lang.Object obj6 = stackTestDriver4.push((java.lang.Object) false);
        java.lang.Object obj7 = stackTestDriver4.peek();
        java.lang.Class<?> wildcardClass8 = stackTestDriver4.getClass();
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) wildcardClass8);
        java.lang.Class<?> wildcardClass10 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + false + "'", obj6, false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + false + "'", obj7, false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test055");
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
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test056");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) false);
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        java.lang.Object obj6 = stackTestDriver4.push((java.lang.Object) false);
        java.lang.Object obj7 = stackTestDriver4.peek();
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        java.lang.Object obj10 = stackTestDriver8.push((java.lang.Object) (byte) 0);
        java.lang.Object obj11 = stackTestDriver4.push((java.lang.Object) (byte) 0);
        java.lang.Object obj12 = stackTestDriver4.peek();
        java.lang.Object obj13 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        java.lang.Object obj14 = stackTestDriver0.peek();
        java.lang.Object obj15 = stackTestDriver0.pop();
        stackTestDriver0.clear();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + false + "'", obj2, false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + false + "'", obj6, false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + false + "'", obj7, false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) 0 + "'", obj10, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 0 + "'", obj11, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) 0 + "'", obj12, (byte) 0);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test057");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) false);
        java.lang.Object obj3 = stackTestDriver0.peek();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        java.lang.Object obj6 = stackTestDriver4.push((java.lang.Object) (byte) 0);
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) (byte) 0);
        boolean boolean8 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        java.lang.Class<?> wildcardClass10 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + false + "'", obj2, false);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 0 + "'", obj6, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 0 + "'", obj7, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test058");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        boolean boolean5 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test059");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        int int5 = stackTestDriver0.size();
        boolean boolean6 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver7 = new experiment.util.StackTestDriver();
        java.lang.Object obj9 = stackTestDriver7.push((java.lang.Object) false);
        java.lang.Object obj10 = stackTestDriver7.peek();
        stackTestDriver7.clear();
        java.lang.Object obj12 = stackTestDriver0.push((java.lang.Object) stackTestDriver7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = stackTestDriver7.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + false + "'", obj9, false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test060");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) false);
        stackTestDriver0.clear();
        int int4 = stackTestDriver0.size();
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) false);
        experiment.util.StackTestDriver stackTestDriver7 = new experiment.util.StackTestDriver();
        java.lang.Object obj9 = stackTestDriver7.push((java.lang.Object) (byte) 0);
        stackTestDriver7.clear();
        java.lang.Object obj12 = stackTestDriver7.push((java.lang.Object) (-1.0d));
        boolean boolean13 = stackTestDriver7.isEmpty();
        experiment.util.StackTestDriver stackTestDriver14 = new experiment.util.StackTestDriver();
        java.lang.Object obj16 = stackTestDriver14.push((java.lang.Object) false);
        java.lang.Object obj17 = stackTestDriver14.peek();
        experiment.util.StackTestDriver stackTestDriver18 = new experiment.util.StackTestDriver();
        java.lang.Object obj20 = stackTestDriver18.push((java.lang.Object) (byte) 0);
        java.lang.Object obj21 = stackTestDriver14.push((java.lang.Object) (byte) 0);
        java.lang.Object obj22 = stackTestDriver14.peek();
        java.lang.Class<?> wildcardClass23 = stackTestDriver14.getClass();
        java.lang.Object obj24 = stackTestDriver7.push((java.lang.Object) wildcardClass23);
        java.lang.Object obj25 = stackTestDriver7.peek();
        java.lang.Object obj26 = stackTestDriver0.push(obj25);
        java.lang.Object obj27 = stackTestDriver0.peek();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + false + "'", obj2, false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + false + "'", obj6, false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) 0 + "'", obj9, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (-1.0d) + "'", obj12, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + false + "'", obj16, false);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + false + "'", obj17, false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (byte) 0 + "'", obj20, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (byte) 0 + "'", obj21, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (byte) 0 + "'", obj22, (byte) 0);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals(obj24.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj24), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj24), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertEquals(obj25.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj25), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj25), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertEquals(obj26.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj26), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj26), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertEquals(obj27.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj27), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj27), "class experiment.util.StackTestDriver");
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test061");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 0);
        stackTestDriver0.clear();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (-1.0d));
        java.lang.Class<?> wildcardClass6 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 0 + "'", obj2, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test062");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        java.lang.Class<?> wildcardClass4 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test063");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver1 = new experiment.util.StackTestDriver();
        java.lang.Object obj3 = stackTestDriver1.push((java.lang.Object) (byte) 0);
        java.lang.Object obj4 = stackTestDriver0.push(obj3);
        boolean boolean5 = stackTestDriver0.isEmpty();
        java.lang.Class<?> wildcardClass6 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 0 + "'", obj3, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 0 + "'", obj4, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test064");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        boolean boolean5 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        int int7 = stackTestDriver0.size();
        stackTestDriver0.clear();
        java.lang.Class<?> wildcardClass9 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test065");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) false);
        java.lang.Object obj3 = stackTestDriver0.pop();
        int int4 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        int int6 = stackTestDriver5.size();
        boolean boolean7 = stackTestDriver5.isEmpty();
        stackTestDriver5.clear();
        stackTestDriver5.clear();
        boolean boolean10 = stackTestDriver5.isEmpty();
        stackTestDriver5.clear();
        int int12 = stackTestDriver5.size();
        java.lang.Object obj13 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        java.lang.Object obj15 = stackTestDriver5.push((java.lang.Object) (short) 1);
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + false + "'", obj2, false);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (short) 1 + "'", obj15, (short) 1);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test066");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) false);
        stackTestDriver0.clear();
        boolean boolean4 = stackTestDriver0.isEmpty();
        java.lang.Class<?> wildcardClass5 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + false + "'", obj2, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test067");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        int int5 = stackTestDriver0.size();
        boolean boolean6 = stackTestDriver0.isEmpty();
        java.lang.Class<?> wildcardClass7 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test068");
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
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test069");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) false);
        java.lang.Object obj3 = stackTestDriver0.pop();
        int int4 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        int int6 = stackTestDriver5.size();
        boolean boolean7 = stackTestDriver5.isEmpty();
        stackTestDriver5.clear();
        stackTestDriver5.clear();
        boolean boolean10 = stackTestDriver5.isEmpty();
        stackTestDriver5.clear();
        int int12 = stackTestDriver5.size();
        java.lang.Object obj13 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        java.lang.Object obj14 = stackTestDriver0.peek();
        java.lang.Class<?> wildcardClass15 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + false + "'", obj2, false);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test070");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) false);
        java.lang.Object obj3 = stackTestDriver0.peek();
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + false + "'", obj2, false);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test071");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) 0);
        stackTestDriver5.clear();
        int int9 = stackTestDriver5.size();
        java.lang.Object obj10 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 0 + "'", obj7, (byte) 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test072");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver1 = new experiment.util.StackTestDriver();
        java.lang.Object obj3 = stackTestDriver1.push((java.lang.Object) (byte) 0);
        java.lang.Object obj4 = stackTestDriver0.push(obj3);
        java.lang.Object obj5 = stackTestDriver0.peek();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        java.lang.Object obj8 = stackTestDriver6.push((java.lang.Object) false);
        java.lang.Object obj9 = stackTestDriver6.pop();
        int int10 = stackTestDriver6.size();
        java.lang.Object obj11 = stackTestDriver0.push((java.lang.Object) stackTestDriver6);
        java.lang.Object obj13 = stackTestDriver0.push((java.lang.Object) 1.0f);
        int int14 = stackTestDriver0.size();
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 0 + "'", obj3, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 0 + "'", obj4, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) 0 + "'", obj5, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + false + "'", obj8, false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + false + "'", obj9, false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 1.0f + "'", obj13, 1.0f);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test073");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) false);
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        java.lang.Object obj6 = stackTestDriver4.push((java.lang.Object) false);
        java.lang.Object obj7 = stackTestDriver4.peek();
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        java.lang.Object obj10 = stackTestDriver8.push((java.lang.Object) (byte) 0);
        java.lang.Object obj11 = stackTestDriver4.push((java.lang.Object) (byte) 0);
        java.lang.Object obj12 = stackTestDriver4.peek();
        java.lang.Object obj13 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        java.lang.Object obj14 = stackTestDriver0.peek();
        java.lang.Object obj15 = stackTestDriver0.pop();
        boolean boolean16 = stackTestDriver0.isEmpty();
        java.lang.Class<?> wildcardClass17 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + false + "'", obj2, false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + false + "'", obj6, false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + false + "'", obj7, false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) 0 + "'", obj10, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 0 + "'", obj11, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) 0 + "'", obj12, (byte) 0);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test074");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver1 = new experiment.util.StackTestDriver();
        java.lang.Object obj3 = stackTestDriver1.push((java.lang.Object) (byte) 0);
        java.lang.Object obj4 = stackTestDriver0.push(obj3);
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) 1L);
        int int7 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        java.lang.Object obj10 = stackTestDriver8.push((java.lang.Object) false);
        stackTestDriver8.clear();
        experiment.util.StackTestDriver stackTestDriver12 = new experiment.util.StackTestDriver();
        java.lang.Object obj14 = stackTestDriver12.push((java.lang.Object) false);
        java.lang.Object obj15 = stackTestDriver12.peek();
        experiment.util.StackTestDriver stackTestDriver16 = new experiment.util.StackTestDriver();
        java.lang.Object obj18 = stackTestDriver16.push((java.lang.Object) (byte) 0);
        java.lang.Object obj19 = stackTestDriver12.push((java.lang.Object) (byte) 0);
        java.lang.Object obj20 = stackTestDriver12.peek();
        java.lang.Object obj21 = stackTestDriver8.push((java.lang.Object) stackTestDriver12);
        java.lang.Class<?> wildcardClass22 = stackTestDriver12.getClass();
        java.lang.Object obj23 = stackTestDriver0.push((java.lang.Object) stackTestDriver12);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 0 + "'", obj3, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 0 + "'", obj4, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1L + "'", obj6, 1L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + false + "'", obj14, false);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + false + "'", obj15, false);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (byte) 0 + "'", obj18, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (byte) 0 + "'", obj19, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (byte) 0 + "'", obj20, (byte) 0);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(obj23);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test075");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        java.lang.Class<?> wildcardClass2 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test076");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) false);
        java.lang.Object obj3 = stackTestDriver0.peek();
        java.lang.Object obj4 = stackTestDriver0.peek();
        java.lang.Object obj5 = stackTestDriver0.pop();
        int int6 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver7 = new experiment.util.StackTestDriver();
        int int8 = stackTestDriver7.size();
        boolean boolean9 = stackTestDriver7.isEmpty();
        stackTestDriver7.clear();
        stackTestDriver7.clear();
        int int12 = stackTestDriver7.size();
        boolean boolean13 = stackTestDriver7.isEmpty();
        experiment.util.StackTestDriver stackTestDriver14 = new experiment.util.StackTestDriver();
        java.lang.Object obj16 = stackTestDriver14.push((java.lang.Object) false);
        java.lang.Object obj17 = stackTestDriver14.peek();
        stackTestDriver14.clear();
        java.lang.Object obj19 = stackTestDriver7.push((java.lang.Object) stackTestDriver14);
        java.lang.Class<?> wildcardClass20 = stackTestDriver7.getClass();
        java.lang.Object obj21 = stackTestDriver0.push((java.lang.Object) stackTestDriver7);
        int int22 = stackTestDriver7.size();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + false + "'", obj2, false);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + false + "'", obj4, false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + false + "'", obj5, false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + false + "'", obj16, false);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + false + "'", obj17, false);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test077");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) false);
        java.lang.Object obj3 = stackTestDriver0.peek();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        java.lang.Object obj6 = stackTestDriver4.push((java.lang.Object) (byte) 0);
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) (byte) 0);
        boolean boolean8 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        int int10 = stackTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + false + "'", obj2, false);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 0 + "'", obj6, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 0 + "'", obj7, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test078");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) false);
        java.lang.Object obj3 = stackTestDriver0.peek();
        stackTestDriver0.clear();
        int int5 = stackTestDriver0.size();
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) 0);
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + false + "'", obj2, false);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0 + "'", obj7, 0);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test079");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver1 = new experiment.util.StackTestDriver();
        java.lang.Object obj3 = stackTestDriver1.push((java.lang.Object) (byte) 0);
        java.lang.Object obj4 = stackTestDriver0.push(obj3);
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        java.lang.Object obj7 = stackTestDriver0.pop();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 0 + "'", obj3, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 0 + "'", obj4, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 1 + "'", obj6, (byte) 1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 1 + "'", obj7, (byte) 1);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test080");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) 0);
        stackTestDriver5.clear();
        int int9 = stackTestDriver5.size();
        java.lang.Object obj10 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        stackTestDriver5.clear();
        stackTestDriver5.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = stackTestDriver5.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 0 + "'", obj7, (byte) 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test081");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) false);
        stackTestDriver0.clear();
        boolean boolean4 = stackTestDriver0.isEmpty();
        boolean boolean5 = stackTestDriver0.isEmpty();
        java.lang.Class<?> wildcardClass6 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + false + "'", obj2, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test082");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) "");
        java.lang.Object obj5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = stackTestDriver0.push(obj5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + "" + "'", obj4, "");
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test083");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) false);
        stackTestDriver0.clear();
        int int4 = stackTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + false + "'", obj2, false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test084");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) false);
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
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + false + "'", obj2, false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test085");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Class<?> wildcardClass1 = stackTestDriver0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test086");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 0);
        stackTestDriver0.clear();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (-1.0d));
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver7 = new experiment.util.StackTestDriver();
        java.lang.Object obj9 = stackTestDriver7.push((java.lang.Object) (byte) 0);
        java.lang.Object obj10 = stackTestDriver6.push(obj9);
        java.lang.Object obj11 = stackTestDriver0.push(obj9);
        stackTestDriver0.clear();
        java.lang.Class<?> wildcardClass13 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 0 + "'", obj2, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) 0 + "'", obj9, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) 0 + "'", obj10, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 0 + "'", obj11, (byte) 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test087");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        int int5 = stackTestDriver0.size();
        boolean boolean6 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver7 = new experiment.util.StackTestDriver();
        java.lang.Object obj9 = stackTestDriver7.push((java.lang.Object) false);
        java.lang.Object obj10 = stackTestDriver7.peek();
        stackTestDriver7.clear();
        java.lang.Object obj12 = stackTestDriver0.push((java.lang.Object) stackTestDriver7);
        boolean boolean13 = stackTestDriver0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + false + "'", obj9, false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test088");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        int int5 = stackTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test089");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) false);
        java.lang.Object obj3 = stackTestDriver0.peek();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        java.lang.Object obj6 = stackTestDriver4.push((java.lang.Object) (byte) 0);
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) (byte) 0);
        boolean boolean8 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        boolean boolean10 = stackTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + false + "'", obj2, false);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 0 + "'", obj6, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 0 + "'", obj7, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test090");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 0);
        java.lang.Object obj3 = stackTestDriver0.pop();
        java.lang.Class<?> wildcardClass4 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 0 + "'", obj2, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 0 + "'", obj3, (byte) 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test091");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver1 = new experiment.util.StackTestDriver();
        java.lang.Object obj3 = stackTestDriver1.push((java.lang.Object) (byte) 0);
        java.lang.Object obj4 = stackTestDriver0.push(obj3);
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) 1L);
        int int7 = stackTestDriver0.size();
        boolean boolean8 = stackTestDriver0.isEmpty();
        java.lang.Object obj9 = stackTestDriver0.peek();
        int int10 = stackTestDriver0.size();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 0 + "'", obj3, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 0 + "'", obj4, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1L + "'", obj6, 1L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 1L + "'", obj9, 1L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test092");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        boolean boolean4 = stackTestDriver0.isEmpty();
        int int5 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        int int7 = stackTestDriver6.size();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver6);
        java.lang.Object obj9 = stackTestDriver0.pop();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test093");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver1 = new experiment.util.StackTestDriver();
        java.lang.Object obj3 = stackTestDriver1.push((java.lang.Object) (byte) 0);
        java.lang.Object obj4 = stackTestDriver0.push(obj3);
        java.lang.Object obj5 = stackTestDriver0.peek();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        java.lang.Object obj8 = stackTestDriver6.push((java.lang.Object) false);
        java.lang.Object obj9 = stackTestDriver6.pop();
        int int10 = stackTestDriver6.size();
        java.lang.Object obj11 = stackTestDriver0.push((java.lang.Object) stackTestDriver6);
        java.lang.Object obj13 = stackTestDriver0.push((java.lang.Object) 1.0f);
        int int14 = stackTestDriver0.size();
        java.lang.Object obj15 = stackTestDriver0.peek();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 0 + "'", obj3, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 0 + "'", obj4, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) 0 + "'", obj5, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + false + "'", obj8, false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + false + "'", obj9, false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 1.0f + "'", obj13, 1.0f);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 1.0f + "'", obj15, 1.0f);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test094");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        boolean boolean5 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test095");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test096");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 0);
        stackTestDriver0.clear();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (-1.0d));
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        java.lang.Object obj8 = stackTestDriver6.push((java.lang.Object) false);
        java.lang.Object obj9 = stackTestDriver6.peek();
        java.lang.Class<?> wildcardClass10 = stackTestDriver6.getClass();
        java.lang.Object obj11 = stackTestDriver0.push((java.lang.Object) stackTestDriver6);
        java.lang.Class<?> wildcardClass12 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 0 + "'", obj2, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + false + "'", obj8, false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + false + "'", obj9, false);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test097");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) false);
        java.lang.Object obj3 = stackTestDriver0.peek();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        java.lang.Object obj6 = stackTestDriver4.push((java.lang.Object) (byte) 0);
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) (byte) 0);
        java.lang.Object obj8 = stackTestDriver0.peek();
        java.lang.Object obj9 = stackTestDriver0.pop();
        java.lang.Object obj10 = stackTestDriver0.pop();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + false + "'", obj2, false);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 0 + "'", obj6, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 0 + "'", obj7, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) 0 + "'", obj8, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) 0 + "'", obj9, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test098");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) false);
        java.lang.Object obj3 = stackTestDriver0.peek();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        java.lang.Object obj6 = stackTestDriver4.push((java.lang.Object) (byte) 0);
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) (byte) 0);
        java.lang.Object obj8 = stackTestDriver0.peek();
        java.lang.Object obj9 = stackTestDriver0.pop();
        stackTestDriver0.clear();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + false + "'", obj2, false);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 0 + "'", obj6, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 0 + "'", obj7, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) 0 + "'", obj8, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) 0 + "'", obj9, (byte) 0);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test099");
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
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test100");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver1 = new experiment.util.StackTestDriver();
        java.lang.Object obj3 = stackTestDriver1.push((java.lang.Object) (byte) 0);
        java.lang.Object obj4 = stackTestDriver0.push(obj3);
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) 1L);
        int int7 = stackTestDriver0.size();
        stackTestDriver0.clear();
        int int9 = stackTestDriver0.size();
        java.lang.Class<?> wildcardClass10 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 0 + "'", obj3, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 0 + "'", obj4, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1L + "'", obj6, 1L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test101");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver1 = new experiment.util.StackTestDriver();
        java.lang.Object obj3 = stackTestDriver1.push((java.lang.Object) (byte) 0);
        java.lang.Object obj4 = stackTestDriver0.push(obj3);
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) 1L);
        int int7 = stackTestDriver0.size();
        boolean boolean8 = stackTestDriver0.isEmpty();
        java.lang.Object obj9 = stackTestDriver0.peek();
        java.lang.Object obj10 = stackTestDriver0.peek();
        java.lang.Object obj11 = stackTestDriver0.peek();
        java.lang.Object obj12 = stackTestDriver0.peek();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 0 + "'", obj3, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 0 + "'", obj4, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1L + "'", obj6, 1L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 1L + "'", obj9, 1L);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 1L + "'", obj10, 1L);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 1L + "'", obj11, 1L);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 1L + "'", obj12, 1L);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test102");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        boolean boolean4 = stackTestDriver0.isEmpty();
        int int5 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        int int7 = stackTestDriver6.size();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = stackTestDriver6.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test103");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) false);
        java.lang.Object obj3 = stackTestDriver0.peek();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        java.lang.Object obj6 = stackTestDriver4.push((java.lang.Object) (byte) 0);
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) (byte) 0);
        java.lang.Object obj8 = stackTestDriver0.peek();
        boolean boolean9 = stackTestDriver0.isEmpty();
        java.lang.Class<?> wildcardClass10 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + false + "'", obj2, false);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 0 + "'", obj6, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 0 + "'", obj7, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) 0 + "'", obj8, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test104");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver1 = new experiment.util.StackTestDriver();
        java.lang.Object obj3 = stackTestDriver1.push((java.lang.Object) (byte) 0);
        java.lang.Object obj4 = stackTestDriver0.push(obj3);
        java.lang.Object obj5 = stackTestDriver0.peek();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        java.lang.Object obj8 = stackTestDriver6.push((java.lang.Object) false);
        java.lang.Object obj9 = stackTestDriver6.pop();
        int int10 = stackTestDriver6.size();
        java.lang.Object obj11 = stackTestDriver0.push((java.lang.Object) stackTestDriver6);
        java.lang.Class<?> wildcardClass12 = obj11.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 0 + "'", obj3, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 0 + "'", obj4, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) 0 + "'", obj5, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + false + "'", obj8, false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + false + "'", obj9, false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test105");
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
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test106");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        boolean boolean5 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        int int7 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        java.lang.Object obj10 = stackTestDriver8.push((java.lang.Object) (byte) 0);
        int int11 = stackTestDriver8.size();
        java.lang.Object obj12 = stackTestDriver8.peek();
        java.lang.Object obj13 = stackTestDriver0.push((java.lang.Object) stackTestDriver8);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) 0 + "'", obj10, (byte) 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) 0 + "'", obj12, (byte) 0);
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test107");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver1 = new experiment.util.StackTestDriver();
        java.lang.Object obj3 = stackTestDriver1.push((java.lang.Object) (byte) 0);
        java.lang.Object obj4 = stackTestDriver0.push(obj3);
        java.lang.Object obj5 = stackTestDriver0.peek();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        java.lang.Object obj8 = stackTestDriver6.push((java.lang.Object) false);
        java.lang.Object obj9 = stackTestDriver6.pop();
        int int10 = stackTestDriver6.size();
        java.lang.Object obj11 = stackTestDriver0.push((java.lang.Object) stackTestDriver6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = stackTestDriver6.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 0 + "'", obj3, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 0 + "'", obj4, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) 0 + "'", obj5, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + false + "'", obj8, false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + false + "'", obj9, false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test108");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test109");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 0);
        stackTestDriver0.clear();
        int int4 = stackTestDriver0.size();
        int int5 = stackTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 0 + "'", obj2, (byte) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test110");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) false);
        java.lang.Object obj3 = stackTestDriver0.peek();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        java.lang.Object obj6 = stackTestDriver4.push((java.lang.Object) (byte) 0);
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) (byte) 0);
        java.lang.Object obj8 = stackTestDriver0.peek();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + false + "'", obj2, false);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 0 + "'", obj6, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 0 + "'", obj7, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) 0 + "'", obj8, (byte) 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test111");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 0);
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 0 + "'", obj2, (byte) 0);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test112");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) false);
        java.lang.Object obj3 = stackTestDriver0.peek();
        stackTestDriver0.clear();
        int int5 = stackTestDriver0.size();
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) 0);
        boolean boolean8 = stackTestDriver0.isEmpty();
        java.lang.Class<?> wildcardClass9 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + false + "'", obj2, false);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0 + "'", obj7, 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test113");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) false);
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        java.lang.Object obj6 = stackTestDriver4.push((java.lang.Object) false);
        java.lang.Object obj7 = stackTestDriver4.peek();
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        java.lang.Object obj10 = stackTestDriver8.push((java.lang.Object) (byte) 0);
        java.lang.Object obj11 = stackTestDriver4.push((java.lang.Object) (byte) 0);
        java.lang.Object obj12 = stackTestDriver4.peek();
        java.lang.Object obj13 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        java.lang.Object obj14 = stackTestDriver0.peek();
        java.lang.Object obj15 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver16 = new experiment.util.StackTestDriver();
        java.lang.Object obj18 = stackTestDriver16.push((java.lang.Object) (byte) 0);
        stackTestDriver16.clear();
        java.lang.Object obj21 = stackTestDriver16.push((java.lang.Object) (-1.0d));
        boolean boolean22 = stackTestDriver16.isEmpty();
        experiment.util.StackTestDriver stackTestDriver23 = new experiment.util.StackTestDriver();
        java.lang.Object obj25 = stackTestDriver23.push((java.lang.Object) false);
        java.lang.Object obj26 = stackTestDriver23.peek();
        experiment.util.StackTestDriver stackTestDriver27 = new experiment.util.StackTestDriver();
        java.lang.Object obj29 = stackTestDriver27.push((java.lang.Object) (byte) 0);
        java.lang.Object obj30 = stackTestDriver23.push((java.lang.Object) (byte) 0);
        java.lang.Object obj31 = stackTestDriver23.peek();
        java.lang.Class<?> wildcardClass32 = stackTestDriver23.getClass();
        java.lang.Object obj33 = stackTestDriver16.push((java.lang.Object) wildcardClass32);
        java.lang.Object obj34 = stackTestDriver0.push(obj33);
        java.lang.Class<?> wildcardClass35 = obj33.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + false + "'", obj2, false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + false + "'", obj6, false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + false + "'", obj7, false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) 0 + "'", obj10, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 0 + "'", obj11, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) 0 + "'", obj12, (byte) 0);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (byte) 0 + "'", obj18, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (-1.0d) + "'", obj21, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + false + "'", obj25, false);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + false + "'", obj26, false);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + (byte) 0 + "'", obj29, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + (byte) 0 + "'", obj30, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + (byte) 0 + "'", obj31, (byte) 0);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertEquals(obj33.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj33), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj33), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertEquals(obj34.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj34), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj34), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test114");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) false);
        java.lang.Object obj3 = stackTestDriver0.peek();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        java.lang.Object obj6 = stackTestDriver4.push((java.lang.Object) (byte) 0);
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) (byte) 0);
        boolean boolean8 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        int int10 = stackTestDriver0.size();
        boolean boolean11 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver12 = new experiment.util.StackTestDriver();
        java.lang.Object obj14 = stackTestDriver12.push((java.lang.Object) false);
        stackTestDriver12.clear();
        experiment.util.StackTestDriver stackTestDriver16 = new experiment.util.StackTestDriver();
        java.lang.Object obj18 = stackTestDriver16.push((java.lang.Object) false);
        java.lang.Object obj19 = stackTestDriver16.peek();
        experiment.util.StackTestDriver stackTestDriver20 = new experiment.util.StackTestDriver();
        java.lang.Object obj22 = stackTestDriver20.push((java.lang.Object) (byte) 0);
        java.lang.Object obj23 = stackTestDriver16.push((java.lang.Object) (byte) 0);
        java.lang.Object obj24 = stackTestDriver16.peek();
        java.lang.Object obj25 = stackTestDriver12.push((java.lang.Object) stackTestDriver16);
        java.lang.Object obj26 = stackTestDriver12.peek();
        java.lang.Object obj27 = stackTestDriver0.push(obj26);
        java.lang.Class<?> wildcardClass28 = obj27.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + false + "'", obj2, false);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 0 + "'", obj6, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 0 + "'", obj7, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + false + "'", obj14, false);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + false + "'", obj18, false);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + false + "'", obj19, false);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (byte) 0 + "'", obj22, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (byte) 0 + "'", obj23, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (byte) 0 + "'", obj24, (byte) 0);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test115");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        boolean boolean2 = stackTestDriver0.isEmpty();
        int int3 = stackTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test116");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver1 = new experiment.util.StackTestDriver();
        java.lang.Object obj3 = stackTestDriver1.push((java.lang.Object) (byte) 0);
        java.lang.Object obj4 = stackTestDriver0.push(obj3);
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        int int7 = stackTestDriver0.size();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 0 + "'", obj3, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 0 + "'", obj4, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 1 + "'", obj6, (byte) 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test117");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver1 = new experiment.util.StackTestDriver();
        java.lang.Object obj3 = stackTestDriver1.push((java.lang.Object) (byte) 0);
        java.lang.Object obj4 = stackTestDriver0.push(obj3);
        int int5 = stackTestDriver0.size();
        boolean boolean6 = stackTestDriver0.isEmpty();
        java.lang.Object obj7 = stackTestDriver0.pop();
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 0 + "'", obj3, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 0 + "'", obj4, (byte) 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 0 + "'", obj7, (byte) 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test118");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) false);
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + false + "'", obj2, false);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test119");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) 0);
        java.lang.Object obj8 = stackTestDriver4.push(obj7);
        java.lang.Object obj10 = stackTestDriver4.push((java.lang.Object) 1L);
        int int11 = stackTestDriver4.size();
        int int12 = stackTestDriver4.size();
        java.lang.Object obj13 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        java.lang.Object obj14 = stackTestDriver0.peek();
        boolean boolean15 = stackTestDriver0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 0 + "'", obj7, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) 0 + "'", obj8, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 1L + "'", obj10, 1L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test120");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 0);
        stackTestDriver0.clear();
        int int4 = stackTestDriver0.size();
        int int5 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        java.lang.Object obj8 = stackTestDriver6.push((java.lang.Object) false);
        stackTestDriver6.clear();
        java.lang.Object obj10 = stackTestDriver0.push((java.lang.Object) stackTestDriver6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = stackTestDriver6.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 0 + "'", obj2, (byte) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + false + "'", obj8, false);
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test121");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver1 = new experiment.util.StackTestDriver();
        java.lang.Object obj3 = stackTestDriver1.push((java.lang.Object) (byte) 0);
        java.lang.Object obj4 = stackTestDriver0.push(obj3);
        boolean boolean5 = stackTestDriver0.isEmpty();
        java.lang.Object obj6 = stackTestDriver0.pop();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 0 + "'", obj3, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 0 + "'", obj4, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 0 + "'", obj6, (byte) 0);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test122");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) false);
        stackTestDriver0.clear();
        int int4 = stackTestDriver0.size();
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) false);
        experiment.util.StackTestDriver stackTestDriver7 = new experiment.util.StackTestDriver();
        java.lang.Object obj9 = stackTestDriver7.push((java.lang.Object) (byte) 0);
        stackTestDriver7.clear();
        java.lang.Object obj12 = stackTestDriver7.push((java.lang.Object) (-1.0d));
        boolean boolean13 = stackTestDriver7.isEmpty();
        experiment.util.StackTestDriver stackTestDriver14 = new experiment.util.StackTestDriver();
        java.lang.Object obj16 = stackTestDriver14.push((java.lang.Object) false);
        java.lang.Object obj17 = stackTestDriver14.peek();
        experiment.util.StackTestDriver stackTestDriver18 = new experiment.util.StackTestDriver();
        java.lang.Object obj20 = stackTestDriver18.push((java.lang.Object) (byte) 0);
        java.lang.Object obj21 = stackTestDriver14.push((java.lang.Object) (byte) 0);
        java.lang.Object obj22 = stackTestDriver14.peek();
        java.lang.Class<?> wildcardClass23 = stackTestDriver14.getClass();
        java.lang.Object obj24 = stackTestDriver7.push((java.lang.Object) wildcardClass23);
        java.lang.Object obj25 = stackTestDriver7.peek();
        java.lang.Object obj26 = stackTestDriver0.push(obj25);
        boolean boolean27 = stackTestDriver0.isEmpty();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + false + "'", obj2, false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + false + "'", obj6, false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) 0 + "'", obj9, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (-1.0d) + "'", obj12, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + false + "'", obj16, false);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + false + "'", obj17, false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (byte) 0 + "'", obj20, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (byte) 0 + "'", obj21, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (byte) 0 + "'", obj22, (byte) 0);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals(obj24.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj24), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj24), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertEquals(obj25.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj25), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj25), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertEquals(obj26.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj26), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj26), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test123");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        int int5 = stackTestDriver0.size();
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) (short) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (short) 100 + "'", obj7, (short) 100);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test124");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        int int2 = stackTestDriver0.size();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        boolean boolean6 = stackTestDriver4.isEmpty();
        stackTestDriver4.clear();
        stackTestDriver4.clear();
        int int9 = stackTestDriver4.size();
        boolean boolean10 = stackTestDriver4.isEmpty();
        experiment.util.StackTestDriver stackTestDriver11 = new experiment.util.StackTestDriver();
        java.lang.Object obj13 = stackTestDriver11.push((java.lang.Object) false);
        java.lang.Object obj14 = stackTestDriver11.peek();
        java.lang.Object obj15 = stackTestDriver11.peek();
        java.lang.Object obj16 = stackTestDriver4.push((java.lang.Object) stackTestDriver11);
        java.lang.Object obj17 = stackTestDriver0.push(obj16);
        java.lang.Class<?> wildcardClass18 = obj16.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + false + "'", obj13, false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + false + "'", obj14, false);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + false + "'", obj15, false);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test125");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
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
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test126");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 0);
        stackTestDriver0.clear();
        int int4 = stackTestDriver0.size();
        int int5 = stackTestDriver0.size();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 0 + "'", obj2, (byte) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test127");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) false);
        java.lang.Object obj3 = stackTestDriver0.peek();
        stackTestDriver0.clear();
        int int5 = stackTestDriver0.size();
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) 0);
        int int8 = stackTestDriver0.size();
        int int9 = stackTestDriver0.size();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + false + "'", obj2, false);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0 + "'", obj7, 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test128");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 0);
        stackTestDriver0.clear();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (-1.0d));
        boolean boolean6 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver7 = new experiment.util.StackTestDriver();
        java.lang.Object obj9 = stackTestDriver7.push((java.lang.Object) false);
        java.lang.Object obj10 = stackTestDriver7.peek();
        experiment.util.StackTestDriver stackTestDriver11 = new experiment.util.StackTestDriver();
        java.lang.Object obj13 = stackTestDriver11.push((java.lang.Object) (byte) 0);
        java.lang.Object obj14 = stackTestDriver7.push((java.lang.Object) (byte) 0);
        java.lang.Object obj15 = stackTestDriver7.peek();
        java.lang.Class<?> wildcardClass16 = stackTestDriver7.getClass();
        java.lang.Object obj17 = stackTestDriver0.push((java.lang.Object) wildcardClass16);
        int int18 = stackTestDriver0.size();
        java.lang.Object obj19 = stackTestDriver0.pop();
        java.lang.Object obj21 = stackTestDriver0.push((java.lang.Object) (short) 1);
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 0 + "'", obj2, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + false + "'", obj9, false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (byte) 0 + "'", obj13, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (byte) 0 + "'", obj14, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (byte) 0 + "'", obj15, (byte) 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (short) 1 + "'", obj21, (short) 1);
    }

}
