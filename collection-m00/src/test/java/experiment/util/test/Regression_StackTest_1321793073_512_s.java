package experiment.util.test;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Regression_StackTest_1321793073_512_s {

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

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test129");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) false);
        java.lang.Object obj3 = stackTestDriver0.peek();
        stackTestDriver0.clear();
        int int5 = stackTestDriver0.size();
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + false + "'", obj2, false);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test130");
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
        java.lang.Object obj19 = stackTestDriver0.push((java.lang.Object) 1.0d);
        java.lang.Object obj21 = stackTestDriver0.push((java.lang.Object) (byte) 100);
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
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 1.0d + "'", obj19, 1.0d);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (byte) 100 + "'", obj21, (byte) 100);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test131");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        boolean boolean5 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test132");
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
        int int12 = stackTestDriver0.size();
        java.lang.Object obj13 = stackTestDriver0.pop();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 0 + "'", obj3, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 0 + "'", obj4, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) 0 + "'", obj5, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + false + "'", obj8, false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + false + "'", obj9, false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test133");
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
        int int27 = stackTestDriver0.size();
        java.lang.Object obj28 = stackTestDriver0.peek();
        int int29 = stackTestDriver0.size();
        stackTestDriver0.clear();
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertEquals(obj28.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj28), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj28), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2 + "'", int29 == 2);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test134");
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
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver19 = new experiment.util.StackTestDriver();
        java.lang.Object obj21 = stackTestDriver19.push((java.lang.Object) false);
        java.lang.Object obj22 = stackTestDriver19.peek();
        experiment.util.StackTestDriver stackTestDriver23 = new experiment.util.StackTestDriver();
        java.lang.Object obj25 = stackTestDriver23.push((java.lang.Object) (byte) 0);
        java.lang.Object obj26 = stackTestDriver19.push((java.lang.Object) (byte) 0);
        boolean boolean27 = stackTestDriver19.isEmpty();
        stackTestDriver19.clear();
        int int29 = stackTestDriver19.size();
        experiment.util.StackTestDriver stackTestDriver30 = new experiment.util.StackTestDriver();
        java.lang.Object obj32 = stackTestDriver30.push((java.lang.Object) false);
        java.lang.Object obj33 = stackTestDriver30.pop();
        int int34 = stackTestDriver30.size();
        experiment.util.StackTestDriver stackTestDriver35 = new experiment.util.StackTestDriver();
        int int36 = stackTestDriver35.size();
        boolean boolean37 = stackTestDriver35.isEmpty();
        stackTestDriver35.clear();
        stackTestDriver35.clear();
        boolean boolean40 = stackTestDriver35.isEmpty();
        stackTestDriver35.clear();
        int int42 = stackTestDriver35.size();
        java.lang.Object obj43 = stackTestDriver30.push((java.lang.Object) stackTestDriver35);
        java.lang.Object obj44 = stackTestDriver19.push(obj43);
        java.lang.Object obj45 = stackTestDriver19.pop();
        java.lang.Object obj46 = stackTestDriver0.push(obj45);
        java.lang.Class<?> wildcardClass47 = obj46.getClass();
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
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + false + "'", obj21, false);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + false + "'", obj22, false);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (byte) 0 + "'", obj25, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + (byte) 0 + "'", obj26, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + false + "'", obj32, false);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + false + "'", obj33, false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(obj43);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test135");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) false);
        java.lang.Object obj3 = stackTestDriver0.peek();
        java.lang.Object obj4 = stackTestDriver0.peek();
        java.lang.Object obj5 = stackTestDriver0.pop();
        boolean boolean6 = stackTestDriver0.isEmpty();
        boolean boolean7 = stackTestDriver0.isEmpty();
        java.lang.Class<?> wildcardClass8 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + false + "'", obj2, false);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + false + "'", obj4, false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + false + "'", obj5, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test136");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) false);
        stackTestDriver0.clear();
        int int4 = stackTestDriver0.size();
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) false);
        java.lang.Object obj7 = stackTestDriver0.pop();
        java.lang.Class<?> wildcardClass8 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + false + "'", obj2, false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + false + "'", obj6, false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + false + "'", obj7, false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test137");
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
        int int14 = stackTestDriver4.size();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + false + "'", obj2, false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + false + "'", obj6, false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + false + "'", obj7, false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) 0 + "'", obj10, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 0 + "'", obj11, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) 0 + "'", obj12, (byte) 0);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test138");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 0);
        stackTestDriver0.clear();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (-1.0d));
        int int6 = stackTestDriver0.size();
        java.lang.Class<?> wildcardClass7 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 0 + "'", obj2, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test139");
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
            java.lang.Object obj11 = stackTestDriver6.pop();
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
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test140");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        boolean boolean4 = stackTestDriver0.isEmpty();
        int int5 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        int int7 = stackTestDriver6.size();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver6);
        java.lang.Object obj9 = stackTestDriver0.peek();
        stackTestDriver0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test141");
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
        boolean boolean18 = stackTestDriver0.isEmpty();
        java.lang.Object obj19 = stackTestDriver0.peek();
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(obj19);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test142");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) false);
        java.lang.Object obj3 = stackTestDriver0.peek();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        java.lang.Object obj6 = stackTestDriver4.push((java.lang.Object) (byte) 0);
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) (byte) 0);
        boolean boolean8 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        int int10 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver11 = new experiment.util.StackTestDriver();
        java.lang.Object obj13 = stackTestDriver11.push((java.lang.Object) false);
        java.lang.Object obj14 = stackTestDriver11.pop();
        int int15 = stackTestDriver11.size();
        experiment.util.StackTestDriver stackTestDriver16 = new experiment.util.StackTestDriver();
        int int17 = stackTestDriver16.size();
        boolean boolean18 = stackTestDriver16.isEmpty();
        stackTestDriver16.clear();
        stackTestDriver16.clear();
        boolean boolean21 = stackTestDriver16.isEmpty();
        stackTestDriver16.clear();
        int int23 = stackTestDriver16.size();
        java.lang.Object obj24 = stackTestDriver11.push((java.lang.Object) stackTestDriver16);
        java.lang.Object obj25 = stackTestDriver0.push(obj24);
        java.lang.Object obj26 = stackTestDriver0.pop();
        int int27 = stackTestDriver0.size();
        java.lang.Class<?> wildcardClass28 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + false + "'", obj2, false);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 0 + "'", obj6, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 0 + "'", obj7, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + false + "'", obj13, false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + false + "'", obj14, false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test143");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        boolean boolean5 = stackTestDriver0.isEmpty();
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test144");
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
        java.lang.Object obj11 = stackTestDriver7.peek();
        java.lang.Object obj12 = stackTestDriver0.push((java.lang.Object) stackTestDriver7);
        experiment.util.StackTestDriver stackTestDriver13 = new experiment.util.StackTestDriver();
        java.lang.Object obj15 = stackTestDriver13.push((java.lang.Object) (byte) 0);
        java.lang.Object obj16 = stackTestDriver13.peek();
        java.lang.Object obj17 = stackTestDriver0.push((java.lang.Object) stackTestDriver13);
        java.lang.Object obj18 = stackTestDriver13.peek();
        java.lang.Object obj19 = stackTestDriver13.peek();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + false + "'", obj9, false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + false + "'", obj11, false);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (byte) 0 + "'", obj15, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (byte) 0 + "'", obj16, (byte) 0);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (byte) 0 + "'", obj18, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (byte) 0 + "'", obj19, (byte) 0);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test145");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver1 = new experiment.util.StackTestDriver();
        java.lang.Object obj3 = stackTestDriver1.push((java.lang.Object) (byte) 0);
        java.lang.Object obj4 = stackTestDriver0.push(obj3);
        java.lang.Object obj5 = stackTestDriver0.peek();
        stackTestDriver0.clear();
        java.lang.Class<?> wildcardClass7 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 0 + "'", obj3, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 0 + "'", obj4, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) 0 + "'", obj5, (byte) 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test146");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
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
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test147");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 0);
        int int3 = stackTestDriver0.size();
        java.lang.Object obj4 = stackTestDriver0.peek();
        java.lang.Class<?> wildcardClass5 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 0 + "'", obj2, (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 0 + "'", obj4, (byte) 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test148");
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
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 0 + "'", obj7, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) 0 + "'", obj8, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 1L + "'", obj10, 1L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test149");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) false);
        int int3 = stackTestDriver0.size();
        int int4 = stackTestDriver0.size();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + false + "'", obj2, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test150");
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
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 0 + "'", obj3, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 0 + "'", obj4, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) 0 + "'", obj5, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + false + "'", obj8, false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + false + "'", obj9, false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 1.0f + "'", obj13, 1.0f);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test151");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) false);
        java.lang.Object obj3 = stackTestDriver0.peek();
        java.lang.Object obj4 = stackTestDriver0.peek();
        java.lang.Class<?> wildcardClass5 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + false + "'", obj2, false);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + false + "'", obj4, false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test152");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 0);
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 0 + "'", obj2, (byte) 0);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test153");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = stackTestDriver0.pop();
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test154");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver1 = new experiment.util.StackTestDriver();
        java.lang.Object obj3 = stackTestDriver1.push((java.lang.Object) (byte) 0);
        java.lang.Object obj4 = stackTestDriver0.push(obj3);
        int int5 = stackTestDriver0.size();
        boolean boolean6 = stackTestDriver0.isEmpty();
        java.lang.Object obj7 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        int int9 = stackTestDriver8.size();
        boolean boolean10 = stackTestDriver8.isEmpty();
        stackTestDriver8.clear();
        stackTestDriver8.clear();
        boolean boolean13 = stackTestDriver8.isEmpty();
        int int14 = stackTestDriver8.size();
        boolean boolean15 = stackTestDriver8.isEmpty();
        java.lang.Object obj16 = stackTestDriver0.push((java.lang.Object) stackTestDriver8);
        java.lang.Object obj17 = stackTestDriver0.pop();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 0 + "'", obj3, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 0 + "'", obj4, (byte) 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 0 + "'", obj7, (byte) 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(obj17);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test155");
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
            java.lang.Object obj9 = stackTestDriver6.peek();
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
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test156");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        boolean boolean2 = stackTestDriver0.isEmpty();
        int int3 = stackTestDriver0.size();
        java.lang.Class<?> wildcardClass4 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test157");
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
        experiment.util.StackTestDriver stackTestDriver14 = new experiment.util.StackTestDriver();
        int int15 = stackTestDriver14.size();
        java.lang.Object obj16 = stackTestDriver5.push((java.lang.Object) int15);
        boolean boolean17 = stackTestDriver5.isEmpty();
        experiment.util.StackTestDriver stackTestDriver18 = new experiment.util.StackTestDriver();
        boolean boolean19 = stackTestDriver18.isEmpty();
        stackTestDriver18.clear();
        boolean boolean21 = stackTestDriver18.isEmpty();
        java.lang.Object obj22 = stackTestDriver5.push((java.lang.Object) stackTestDriver18);
        java.lang.Object obj23 = stackTestDriver5.peek();
        java.lang.Class<?> wildcardClass24 = stackTestDriver5.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + false + "'", obj2, false);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0 + "'", obj16, 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test158");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        int int3 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        java.lang.Object obj6 = stackTestDriver4.push((java.lang.Object) false);
        java.lang.Object obj7 = stackTestDriver4.peek();
        java.lang.Class<?> wildcardClass8 = stackTestDriver4.getClass();
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) wildcardClass8);
        stackTestDriver0.clear();
        int int11 = stackTestDriver0.size();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + false + "'", obj6, false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + false + "'", obj7, false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test159");
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
        java.lang.Object obj18 = stackTestDriver0.peek();
        boolean boolean19 = stackTestDriver0.isEmpty();
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
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals(obj18.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj18), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj18), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test160");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) false);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.peek();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + false + "'", obj2, false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + false + "'", obj4, false);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test161");
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
        boolean boolean11 = stackTestDriver5.isEmpty();
        boolean boolean12 = stackTestDriver5.isEmpty();
        java.lang.Class<?> wildcardClass13 = stackTestDriver5.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 0 + "'", obj7, (byte) 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test162");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) false);
        java.lang.Object obj3 = stackTestDriver0.peek();
        java.lang.Object obj4 = stackTestDriver0.peek();
        java.lang.Object obj5 = stackTestDriver0.pop();
        boolean boolean6 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        boolean boolean8 = stackTestDriver0.isEmpty();
        boolean boolean9 = stackTestDriver0.isEmpty();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + false + "'", obj2, false);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + false + "'", obj4, false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + false + "'", obj5, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test163");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) false);
        java.lang.Object obj3 = stackTestDriver0.peek();
        stackTestDriver0.clear();
        int int5 = stackTestDriver0.size();
        stackTestDriver0.clear();
        int int7 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        java.lang.Object obj10 = stackTestDriver8.push((java.lang.Object) (byte) 0);
        stackTestDriver8.clear();
        java.lang.Object obj13 = stackTestDriver8.push((java.lang.Object) (-1.0d));
        experiment.util.StackTestDriver stackTestDriver14 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        java.lang.Object obj17 = stackTestDriver15.push((java.lang.Object) (byte) 0);
        java.lang.Object obj18 = stackTestDriver14.push(obj17);
        java.lang.Object obj19 = stackTestDriver8.push(obj17);
        stackTestDriver8.clear();
        java.lang.Object obj21 = stackTestDriver0.push((java.lang.Object) stackTestDriver8);
        boolean boolean22 = stackTestDriver0.isEmpty();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + false + "'", obj2, false);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) 0 + "'", obj10, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (-1.0d) + "'", obj13, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) 0 + "'", obj17, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (byte) 0 + "'", obj18, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (byte) 0 + "'", obj19, (byte) 0);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test164");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        boolean boolean5 = stackTestDriver0.isEmpty();
        boolean boolean6 = stackTestDriver0.isEmpty();
        java.lang.Class<?> wildcardClass7 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test165");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver1 = new experiment.util.StackTestDriver();
        java.lang.Object obj3 = stackTestDriver1.push((java.lang.Object) (byte) 0);
        java.lang.Object obj4 = stackTestDriver0.push(obj3);
        java.lang.Object obj5 = stackTestDriver0.peek();
        boolean boolean6 = stackTestDriver0.isEmpty();
        java.lang.Object obj7 = stackTestDriver0.pop();
        java.lang.Object obj8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = stackTestDriver0.push(obj8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 0 + "'", obj3, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 0 + "'", obj4, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) 0 + "'", obj5, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 0 + "'", obj7, (byte) 0);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test166");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver1 = new experiment.util.StackTestDriver();
        java.lang.Object obj3 = stackTestDriver1.push((java.lang.Object) (byte) 0);
        java.lang.Object obj4 = stackTestDriver0.push(obj3);
        java.lang.Object obj5 = stackTestDriver0.peek();
        boolean boolean6 = stackTestDriver0.isEmpty();
        java.lang.Object obj7 = stackTestDriver0.pop();
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 0 + "'", obj3, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 0 + "'", obj4, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) 0 + "'", obj5, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 0 + "'", obj7, (byte) 0);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test167");
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
        int int13 = stackTestDriver0.size();
        java.lang.Object obj14 = stackTestDriver0.pop();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + false + "'", obj9, false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test168");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) false);
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) false);
        java.lang.Object obj8 = stackTestDriver5.peek();
        experiment.util.StackTestDriver stackTestDriver9 = new experiment.util.StackTestDriver();
        java.lang.Object obj11 = stackTestDriver9.push((java.lang.Object) (byte) 0);
        java.lang.Object obj12 = stackTestDriver5.push((java.lang.Object) (byte) 0);
        boolean boolean13 = stackTestDriver5.isEmpty();
        java.lang.Object obj14 = stackTestDriver0.push((java.lang.Object) boolean13);
        stackTestDriver0.clear();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + false + "'", obj2, false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + false + "'", obj7, false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + false + "'", obj8, false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 0 + "'", obj11, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) 0 + "'", obj12, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + false + "'", obj14, false);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test169");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) false);
        java.lang.Object obj3 = stackTestDriver0.peek();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        java.lang.Object obj6 = stackTestDriver4.push((java.lang.Object) (byte) 0);
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) (byte) 0);
        java.lang.Object obj8 = stackTestDriver0.peek();
        java.lang.Object obj9 = stackTestDriver0.pop();
        java.lang.Object obj10 = stackTestDriver0.peek();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + false + "'", obj2, false);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 0 + "'", obj6, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 0 + "'", obj7, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) 0 + "'", obj8, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) 0 + "'", obj9, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test170");
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
        java.lang.Class<?> wildcardClass15 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 0 + "'", obj3, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 0 + "'", obj4, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) 0 + "'", obj5, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + false + "'", obj8, false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + false + "'", obj9, false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 1.0f + "'", obj13, 1.0f);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test171");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        int int5 = stackTestDriver0.size();
        boolean boolean6 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        java.lang.Class<?> wildcardClass8 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test172");
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
            java.lang.Object obj13 = stackTestDriver7.peek();
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
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test173");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) false);
        java.lang.Object obj3 = stackTestDriver0.peek();
        stackTestDriver0.clear();
        int int5 = stackTestDriver0.size();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver7 = new experiment.util.StackTestDriver();
        int int8 = stackTestDriver7.size();
        boolean boolean9 = stackTestDriver7.isEmpty();
        stackTestDriver7.clear();
        stackTestDriver7.clear();
        experiment.util.StackTestDriver stackTestDriver12 = new experiment.util.StackTestDriver();
        java.lang.Object obj14 = stackTestDriver12.push((java.lang.Object) (byte) 0);
        stackTestDriver12.clear();
        int int16 = stackTestDriver12.size();
        java.lang.Object obj17 = stackTestDriver7.push((java.lang.Object) stackTestDriver12);
        stackTestDriver7.clear();
        java.lang.Object obj19 = stackTestDriver0.push((java.lang.Object) stackTestDriver7);
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + false + "'", obj2, false);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (byte) 0 + "'", obj14, (byte) 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNotNull(obj19);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test174");
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
        boolean boolean11 = stackTestDriver5.isEmpty();
        int int12 = stackTestDriver5.size();
        stackTestDriver5.clear();
        java.lang.Class<?> wildcardClass14 = stackTestDriver5.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 0 + "'", obj7, (byte) 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test175");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) false);
        java.lang.Object obj3 = stackTestDriver0.peek();
        java.lang.Object obj4 = stackTestDriver0.peek();
        java.lang.Object obj5 = stackTestDriver0.pop();
        boolean boolean6 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        boolean boolean8 = stackTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + false + "'", obj2, false);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + false + "'", obj4, false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + false + "'", obj5, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test176");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) "");
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        boolean boolean6 = stackTestDriver5.isEmpty();
        stackTestDriver5.clear();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = stackTestDriver5.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + "" + "'", obj4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test177");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 0);
        stackTestDriver0.clear();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (-1.0d));
        int int6 = stackTestDriver0.size();
        java.lang.Object obj7 = stackTestDriver0.peek();
        java.lang.Object obj8 = stackTestDriver0.pop();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 0 + "'", obj2, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test178");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 0);
        stackTestDriver0.clear();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (-1.0d));
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver7 = new experiment.util.StackTestDriver();
        java.lang.Object obj9 = stackTestDriver7.push((java.lang.Object) (byte) 0);
        java.lang.Object obj10 = stackTestDriver6.push(obj9);
        java.lang.Object obj11 = stackTestDriver0.push(obj9);
        experiment.util.StackTestDriver stackTestDriver12 = new experiment.util.StackTestDriver();
        int int13 = stackTestDriver12.size();
        boolean boolean14 = stackTestDriver12.isEmpty();
        stackTestDriver12.clear();
        int int16 = stackTestDriver12.size();
        stackTestDriver12.clear();
        experiment.util.StackTestDriver stackTestDriver18 = new experiment.util.StackTestDriver();
        boolean boolean19 = stackTestDriver18.isEmpty();
        java.lang.Class<?> wildcardClass20 = stackTestDriver18.getClass();
        java.lang.Object obj21 = stackTestDriver12.push((java.lang.Object) wildcardClass20);
        java.lang.Object obj22 = stackTestDriver0.push((java.lang.Object) stackTestDriver12);
        int int23 = stackTestDriver0.size();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 0 + "'", obj2, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) 0 + "'", obj9, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) 0 + "'", obj10, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 0 + "'", obj11, (byte) 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals(obj21.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj21), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj21), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test179");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 0);
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        int int5 = stackTestDriver0.size();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 0 + "'", obj2, (byte) 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test180");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) false);
        java.lang.Object obj3 = stackTestDriver0.peek();
        java.lang.Object obj4 = stackTestDriver0.peek();
        java.lang.Object obj5 = stackTestDriver0.pop();
        boolean boolean6 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        boolean boolean8 = stackTestDriver0.isEmpty();
        java.lang.Class<?> wildcardClass9 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + false + "'", obj2, false);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + false + "'", obj4, false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + false + "'", obj5, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test181");
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
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
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
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test182");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        int int3 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        java.lang.Object obj6 = stackTestDriver4.push((java.lang.Object) false);
        java.lang.Object obj7 = stackTestDriver4.peek();
        java.lang.Class<?> wildcardClass8 = stackTestDriver4.getClass();
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) wildcardClass8);
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
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
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test183");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 0);
        stackTestDriver0.clear();
        int int4 = stackTestDriver0.size();
        int int5 = stackTestDriver0.size();
        stackTestDriver0.clear();
        int int7 = stackTestDriver0.size();
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
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test184");
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
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test185");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 0);
        stackTestDriver0.clear();
        int int4 = stackTestDriver0.size();
        boolean boolean5 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 0 + "'", obj2, (byte) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test186");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        boolean boolean5 = stackTestDriver0.isEmpty();
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test187");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        int int4 = stackTestDriver0.size();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver7 = new experiment.util.StackTestDriver();
        java.lang.Object obj9 = stackTestDriver7.push((java.lang.Object) (byte) 0);
        java.lang.Object obj10 = stackTestDriver6.push(obj9);
        java.lang.Object obj11 = stackTestDriver6.peek();
        experiment.util.StackTestDriver stackTestDriver12 = new experiment.util.StackTestDriver();
        java.lang.Object obj14 = stackTestDriver12.push((java.lang.Object) false);
        java.lang.Object obj15 = stackTestDriver12.pop();
        int int16 = stackTestDriver12.size();
        java.lang.Object obj17 = stackTestDriver6.push((java.lang.Object) stackTestDriver12);
        java.lang.Object obj19 = stackTestDriver6.push((java.lang.Object) 1.0f);
        java.lang.Object obj20 = stackTestDriver0.push(obj19);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) 0 + "'", obj9, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) 0 + "'", obj10, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 0 + "'", obj11, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + false + "'", obj14, false);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + false + "'", obj15, false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 1.0f + "'", obj19, 1.0f);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 1.0f + "'", obj20, 1.0f);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test188");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 0);
        stackTestDriver0.clear();
        int int4 = stackTestDriver0.size();
        int int5 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        java.lang.Object obj8 = stackTestDriver6.push((java.lang.Object) false);
        stackTestDriver6.clear();
        java.lang.Object obj10 = stackTestDriver0.push((java.lang.Object) stackTestDriver6);
        experiment.util.StackTestDriver stackTestDriver11 = new experiment.util.StackTestDriver();
        int int12 = stackTestDriver11.size();
        boolean boolean13 = stackTestDriver11.isEmpty();
        stackTestDriver11.clear();
        int int15 = stackTestDriver11.size();
        stackTestDriver11.clear();
        experiment.util.StackTestDriver stackTestDriver17 = new experiment.util.StackTestDriver();
        boolean boolean18 = stackTestDriver17.isEmpty();
        java.lang.Class<?> wildcardClass19 = stackTestDriver17.getClass();
        java.lang.Object obj20 = stackTestDriver11.push((java.lang.Object) wildcardClass19);
        experiment.util.StackTestDriver stackTestDriver21 = new experiment.util.StackTestDriver();
        java.lang.Object obj23 = stackTestDriver21.push((java.lang.Object) (byte) 0);
        stackTestDriver21.clear();
        int int25 = stackTestDriver21.size();
        boolean boolean26 = stackTestDriver21.isEmpty();
        java.lang.Class<?> wildcardClass27 = stackTestDriver21.getClass();
        java.lang.Object obj28 = stackTestDriver11.push((java.lang.Object) wildcardClass27);
        java.lang.Object obj29 = stackTestDriver6.push((java.lang.Object) stackTestDriver11);
        int int30 = stackTestDriver6.size();
        java.lang.Object obj31 = stackTestDriver6.peek();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 0 + "'", obj2, (byte) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + false + "'", obj8, false);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (byte) 0 + "'", obj23, (byte) 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertEquals(obj28.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj28), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj28), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(obj31);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test189");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 0);
        stackTestDriver0.clear();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (-1.0d));
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        java.lang.Object obj8 = stackTestDriver6.push((java.lang.Object) false);
        java.lang.Object obj9 = stackTestDriver6.peek();
        java.lang.Class<?> wildcardClass10 = stackTestDriver6.getClass();
        java.lang.Object obj11 = stackTestDriver0.push((java.lang.Object) stackTestDriver6);
        int int12 = stackTestDriver6.size();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 0 + "'", obj2, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + false + "'", obj8, false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + false + "'", obj9, false);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test190");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) false);
        stackTestDriver0.clear();
        int int4 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean6 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + false + "'", obj2, false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test191");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) false);
        java.lang.Object obj3 = stackTestDriver0.pop();
        int int4 = stackTestDriver0.size();
        boolean boolean5 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        int int7 = stackTestDriver6.size();
        boolean boolean8 = stackTestDriver6.isEmpty();
        stackTestDriver6.clear();
        int int10 = stackTestDriver6.size();
        stackTestDriver6.clear();
        experiment.util.StackTestDriver stackTestDriver12 = new experiment.util.StackTestDriver();
        boolean boolean13 = stackTestDriver12.isEmpty();
        java.lang.Class<?> wildcardClass14 = stackTestDriver12.getClass();
        java.lang.Object obj15 = stackTestDriver6.push((java.lang.Object) wildcardClass14);
        experiment.util.StackTestDriver stackTestDriver16 = new experiment.util.StackTestDriver();
        java.lang.Object obj18 = stackTestDriver16.push((java.lang.Object) (byte) 0);
        stackTestDriver16.clear();
        int int20 = stackTestDriver16.size();
        boolean boolean21 = stackTestDriver16.isEmpty();
        java.lang.Class<?> wildcardClass22 = stackTestDriver16.getClass();
        java.lang.Object obj23 = stackTestDriver6.push((java.lang.Object) wildcardClass22);
        java.lang.Class<?> wildcardClass24 = obj23.getClass();
        java.lang.Object obj25 = stackTestDriver0.push(obj23);
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + false + "'", obj2, false);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (byte) 0 + "'", obj18, (byte) 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertEquals(obj23.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj23), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj23), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertEquals(obj25.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj25), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj25), "class experiment.util.StackTestDriver");
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test192");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        boolean boolean5 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver7 = new experiment.util.StackTestDriver();
        java.lang.Object obj9 = stackTestDriver7.push((java.lang.Object) (byte) 0);
        stackTestDriver7.clear();
        int int11 = stackTestDriver7.size();
        java.lang.Object obj13 = stackTestDriver7.push((java.lang.Object) ' ');
        java.lang.Object obj14 = stackTestDriver0.push((java.lang.Object) ' ');
        java.lang.Object obj15 = stackTestDriver0.peek();
        java.lang.Object obj16 = stackTestDriver0.pop();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) 0 + "'", obj9, (byte) 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + ' ' + "'", obj13, ' ');
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + ' ' + "'", obj14, ' ');
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + ' ' + "'", obj15, ' ');
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + ' ' + "'", obj16, ' ');
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test193");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) false);
        java.lang.Object obj3 = stackTestDriver0.peek();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        java.lang.Object obj6 = stackTestDriver4.push((java.lang.Object) (byte) 0);
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) (byte) 0);
        boolean boolean8 = stackTestDriver0.isEmpty();
        java.lang.Object obj9 = stackTestDriver0.peek();
        int int10 = stackTestDriver0.size();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + false + "'", obj2, false);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 0 + "'", obj6, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 0 + "'", obj7, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) 0 + "'", obj9, (byte) 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test194");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        boolean boolean5 = stackTestDriver0.isEmpty();
        boolean boolean6 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        int int8 = stackTestDriver0.size();
        boolean boolean9 = stackTestDriver0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test195");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        boolean boolean5 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver7 = new experiment.util.StackTestDriver();
        java.lang.Object obj9 = stackTestDriver7.push((java.lang.Object) (byte) 0);
        stackTestDriver7.clear();
        int int11 = stackTestDriver7.size();
        java.lang.Object obj13 = stackTestDriver7.push((java.lang.Object) ' ');
        java.lang.Object obj14 = stackTestDriver0.push((java.lang.Object) ' ');
        boolean boolean15 = stackTestDriver0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) 0 + "'", obj9, (byte) 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + ' ' + "'", obj13, ' ');
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + ' ' + "'", obj14, ' ');
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test196");
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
        boolean boolean15 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver16 = new experiment.util.StackTestDriver();
        int int17 = stackTestDriver16.size();
        boolean boolean18 = stackTestDriver16.isEmpty();
        stackTestDriver16.clear();
        stackTestDriver16.clear();
        int int21 = stackTestDriver16.size();
        boolean boolean22 = stackTestDriver16.isEmpty();
        experiment.util.StackTestDriver stackTestDriver23 = new experiment.util.StackTestDriver();
        java.lang.Object obj25 = stackTestDriver23.push((java.lang.Object) false);
        java.lang.Object obj26 = stackTestDriver23.peek();
        java.lang.Object obj27 = stackTestDriver23.peek();
        java.lang.Object obj28 = stackTestDriver16.push((java.lang.Object) stackTestDriver23);
        java.lang.Object obj29 = stackTestDriver0.push((java.lang.Object) stackTestDriver16);
        stackTestDriver0.clear();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + false + "'", obj2, false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + false + "'", obj6, false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + false + "'", obj7, false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) 0 + "'", obj10, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 0 + "'", obj11, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) 0 + "'", obj12, (byte) 0);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + false + "'", obj25, false);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + false + "'", obj26, false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + false + "'", obj27, false);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertNotNull(obj29);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test197");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 0);
        stackTestDriver0.clear();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (-1.0d));
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        java.lang.Object obj8 = stackTestDriver6.push((java.lang.Object) false);
        java.lang.Object obj9 = stackTestDriver6.peek();
        java.lang.Class<?> wildcardClass10 = stackTestDriver6.getClass();
        java.lang.Object obj11 = stackTestDriver0.push((java.lang.Object) stackTestDriver6);
        boolean boolean12 = stackTestDriver0.isEmpty();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 0 + "'", obj2, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + false + "'", obj8, false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + false + "'", obj9, false);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test198");
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
        experiment.util.StackTestDriver stackTestDriver14 = new experiment.util.StackTestDriver();
        int int15 = stackTestDriver14.size();
        java.lang.Object obj16 = stackTestDriver5.push((java.lang.Object) int15);
        boolean boolean17 = stackTestDriver5.isEmpty();
        experiment.util.StackTestDriver stackTestDriver18 = new experiment.util.StackTestDriver();
        boolean boolean19 = stackTestDriver18.isEmpty();
        stackTestDriver18.clear();
        boolean boolean21 = stackTestDriver18.isEmpty();
        java.lang.Object obj22 = stackTestDriver5.push((java.lang.Object) stackTestDriver18);
        boolean boolean23 = stackTestDriver5.isEmpty();
        java.lang.Object obj24 = stackTestDriver5.pop();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + false + "'", obj2, false);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0 + "'", obj16, 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(obj24);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test199");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        boolean boolean5 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver7 = new experiment.util.StackTestDriver();
        java.lang.Object obj9 = stackTestDriver7.push((java.lang.Object) (byte) 0);
        stackTestDriver7.clear();
        int int11 = stackTestDriver7.size();
        java.lang.Object obj13 = stackTestDriver7.push((java.lang.Object) ' ');
        java.lang.Object obj14 = stackTestDriver0.push((java.lang.Object) ' ');
        java.lang.Object obj15 = stackTestDriver0.peek();
        boolean boolean16 = stackTestDriver0.isEmpty();
        boolean boolean17 = stackTestDriver0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) 0 + "'", obj9, (byte) 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + ' ' + "'", obj13, ' ');
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + ' ' + "'", obj14, ' ');
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + ' ' + "'", obj15, ' ');
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test200");
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
        experiment.util.StackTestDriver stackTestDriver14 = new experiment.util.StackTestDriver();
        java.lang.Object obj16 = stackTestDriver14.push((java.lang.Object) false);
        java.lang.Object obj17 = stackTestDriver14.pop();
        java.lang.Object obj18 = stackTestDriver0.push((java.lang.Object) stackTestDriver14);
        int int19 = stackTestDriver0.size();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 0 + "'", obj3, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 0 + "'", obj4, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) 0 + "'", obj5, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + false + "'", obj8, false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + false + "'", obj9, false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 1.0f + "'", obj13, 1.0f);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + false + "'", obj16, false);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + false + "'", obj17, false);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test201");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver1 = new experiment.util.StackTestDriver();
        java.lang.Object obj3 = stackTestDriver1.push((java.lang.Object) (byte) 0);
        java.lang.Object obj4 = stackTestDriver0.push(obj3);
        boolean boolean5 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 0 + "'", obj3, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 0 + "'", obj4, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test202");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        int int2 = stackTestDriver0.size();
        boolean boolean3 = stackTestDriver0.isEmpty();
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test203");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test204");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        boolean boolean2 = stackTestDriver0.isEmpty();
        int int3 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean5 = stackTestDriver0.isEmpty();
        java.lang.Class<?> wildcardClass6 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test205");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) false);
        java.lang.Object obj3 = stackTestDriver0.peek();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        java.lang.Object obj6 = stackTestDriver4.push((java.lang.Object) (byte) 0);
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) (byte) 0);
        boolean boolean8 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        int int10 = stackTestDriver0.size();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver12 = new experiment.util.StackTestDriver();
        boolean boolean13 = stackTestDriver12.isEmpty();
        java.lang.Object obj14 = stackTestDriver0.push((java.lang.Object) stackTestDriver12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = stackTestDriver12.peek();
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test206");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        boolean boolean2 = stackTestDriver0.isEmpty();
        int int3 = stackTestDriver0.size();
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test207");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        boolean boolean5 = stackTestDriver0.isEmpty();
        boolean boolean6 = stackTestDriver0.isEmpty();
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test208");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) false);
        boolean boolean3 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + false + "'", obj2, false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test209");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        int int4 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) false);
        java.lang.Object obj8 = stackTestDriver5.peek();
        stackTestDriver5.clear();
        int int10 = stackTestDriver5.size();
        java.lang.Object obj12 = stackTestDriver5.push((java.lang.Object) 0);
        int int13 = stackTestDriver5.size();
        boolean boolean14 = stackTestDriver5.isEmpty();
        stackTestDriver5.clear();
        java.lang.Object obj16 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        experiment.util.StackTestDriver stackTestDriver17 = new experiment.util.StackTestDriver();
        java.lang.Object obj19 = stackTestDriver17.push((java.lang.Object) (byte) 0);
        stackTestDriver17.clear();
        java.lang.Object obj22 = stackTestDriver17.push((java.lang.Object) (-1.0d));
        experiment.util.StackTestDriver stackTestDriver23 = new experiment.util.StackTestDriver();
        java.lang.Object obj25 = stackTestDriver23.push((java.lang.Object) false);
        java.lang.Object obj26 = stackTestDriver23.peek();
        java.lang.Class<?> wildcardClass27 = stackTestDriver23.getClass();
        java.lang.Object obj28 = stackTestDriver17.push((java.lang.Object) stackTestDriver23);
        java.lang.Object obj29 = stackTestDriver5.push(obj28);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + false + "'", obj7, false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + false + "'", obj8, false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 0 + "'", obj12, 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (byte) 0 + "'", obj19, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (-1.0d) + "'", obj22, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + false + "'", obj25, false);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + false + "'", obj26, false);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertNotNull(obj29);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test210");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) false);
        java.lang.Object obj3 = stackTestDriver0.peek();
        stackTestDriver0.clear();
        int int5 = stackTestDriver0.size();
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) 0);
        boolean boolean8 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + false + "'", obj2, false);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0 + "'", obj7, 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test211");
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
        int int24 = stackTestDriver0.size();
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test212");
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
        experiment.util.StackTestDriver stackTestDriver14 = new experiment.util.StackTestDriver();
        int int15 = stackTestDriver14.size();
        java.lang.Object obj16 = stackTestDriver5.push((java.lang.Object) int15);
        experiment.util.StackTestDriver stackTestDriver17 = new experiment.util.StackTestDriver();
        java.lang.Object obj19 = stackTestDriver17.push((java.lang.Object) false);
        java.lang.Object obj20 = stackTestDriver17.peek();
        experiment.util.StackTestDriver stackTestDriver21 = new experiment.util.StackTestDriver();
        java.lang.Object obj23 = stackTestDriver21.push((java.lang.Object) (byte) 0);
        java.lang.Object obj24 = stackTestDriver17.push((java.lang.Object) (byte) 0);
        boolean boolean25 = stackTestDriver17.isEmpty();
        stackTestDriver17.clear();
        stackTestDriver17.clear();
        java.lang.Object obj28 = stackTestDriver5.push((java.lang.Object) stackTestDriver17);
        java.lang.Class<?> wildcardClass29 = stackTestDriver17.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + false + "'", obj2, false);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0 + "'", obj16, 0);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + false + "'", obj19, false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + false + "'", obj20, false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (byte) 0 + "'", obj23, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (byte) 0 + "'", obj24, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test213");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) "");
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        boolean boolean6 = stackTestDriver5.isEmpty();
        stackTestDriver5.clear();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        experiment.util.StackTestDriver stackTestDriver9 = new experiment.util.StackTestDriver();
        java.lang.Object obj11 = stackTestDriver9.push((java.lang.Object) false);
        java.lang.Object obj12 = stackTestDriver9.peek();
        stackTestDriver9.clear();
        int int14 = stackTestDriver9.size();
        stackTestDriver9.clear();
        boolean boolean16 = stackTestDriver9.isEmpty();
        java.lang.Object obj17 = stackTestDriver5.push((java.lang.Object) stackTestDriver9);
        boolean boolean18 = stackTestDriver5.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + "" + "'", obj4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + false + "'", obj11, false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + false + "'", obj12, false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test214");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        boolean boolean5 = stackTestDriver0.isEmpty();
        boolean boolean6 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        java.lang.Class<?> wildcardClass8 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test215");
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
        java.lang.Class<?> wildcardClass12 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 0 + "'", obj3, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 0 + "'", obj4, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1L + "'", obj6, 1L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 1L + "'", obj9, 1L);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 1L + "'", obj10, 1L);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 1L + "'", obj11, 1L);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test216");
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
            java.lang.Object obj16 = stackTestDriver0.peek();
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
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test217");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 0);
        java.lang.Object obj3 = stackTestDriver0.pop();
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 0 + "'", obj2, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 0 + "'", obj3, (byte) 0);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test218");
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
        experiment.util.StackTestDriver stackTestDriver14 = new experiment.util.StackTestDriver();
        java.lang.Object obj16 = stackTestDriver14.push((java.lang.Object) false);
        java.lang.Object obj17 = stackTestDriver14.pop();
        java.lang.Object obj18 = stackTestDriver0.push((java.lang.Object) stackTestDriver14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = stackTestDriver14.peek();
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
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + false + "'", obj16, false);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + false + "'", obj17, false);
        org.junit.Assert.assertNotNull(obj18);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test219");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 0);
        stackTestDriver0.clear();
        int int4 = stackTestDriver0.size();
        int int5 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        java.lang.Object obj8 = stackTestDriver6.push((java.lang.Object) false);
        stackTestDriver6.clear();
        java.lang.Object obj10 = stackTestDriver0.push((java.lang.Object) stackTestDriver6);
        java.lang.Class<?> wildcardClass11 = obj10.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 0 + "'", obj2, (byte) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + false + "'", obj8, false);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test220");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) false);
        java.lang.Object obj3 = stackTestDriver0.peek();
        stackTestDriver0.clear();
        int int5 = stackTestDriver0.size();
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) 0);
        boolean boolean8 = stackTestDriver0.isEmpty();
        boolean boolean9 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        java.lang.Object obj12 = stackTestDriver10.push((java.lang.Object) false);
        java.lang.Object obj13 = stackTestDriver10.peek();
        experiment.util.StackTestDriver stackTestDriver14 = new experiment.util.StackTestDriver();
        java.lang.Object obj16 = stackTestDriver14.push((java.lang.Object) (byte) 0);
        java.lang.Object obj17 = stackTestDriver10.push((java.lang.Object) (byte) 0);
        boolean boolean18 = stackTestDriver10.isEmpty();
        stackTestDriver10.clear();
        int int20 = stackTestDriver10.size();
        stackTestDriver10.clear();
        experiment.util.StackTestDriver stackTestDriver22 = new experiment.util.StackTestDriver();
        boolean boolean23 = stackTestDriver22.isEmpty();
        java.lang.Object obj24 = stackTestDriver10.push((java.lang.Object) stackTestDriver22);
        stackTestDriver22.clear();
        java.lang.Object obj26 = stackTestDriver0.push((java.lang.Object) stackTestDriver22);
        int int27 = stackTestDriver22.size();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + false + "'", obj2, false);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0 + "'", obj7, 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + false + "'", obj12, false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + false + "'", obj13, false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (byte) 0 + "'", obj16, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) 0 + "'", obj17, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test221");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test222");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) false);
        java.lang.Object obj3 = stackTestDriver0.peek();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        java.lang.Object obj6 = stackTestDriver4.push((java.lang.Object) (byte) 0);
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) (byte) 0);
        java.lang.Object obj8 = stackTestDriver0.peek();
        boolean boolean9 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        java.lang.Object obj11 = stackTestDriver0.push((java.lang.Object) stackTestDriver10);
        java.lang.Class<?> wildcardClass12 = obj11.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + false + "'", obj2, false);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 0 + "'", obj6, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 0 + "'", obj7, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) 0 + "'", obj8, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test223");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        int int4 = stackTestDriver0.size();
        stackTestDriver0.clear();
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) 'a');
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 'a' + "'", obj7, 'a');
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test224");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) false);
        stackTestDriver0.clear();
        int int4 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean6 = stackTestDriver0.isEmpty();
        int int7 = stackTestDriver0.size();
        boolean boolean8 = stackTestDriver0.isEmpty();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + false + "'", obj2, false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test225");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 0);
        stackTestDriver0.clear();
        int int4 = stackTestDriver0.size();
        int int5 = stackTestDriver0.size();
        stackTestDriver0.clear();
        int int7 = stackTestDriver0.size();
        boolean boolean8 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver9 = new experiment.util.StackTestDriver();
        java.lang.Object obj11 = stackTestDriver9.push((java.lang.Object) false);
        stackTestDriver9.clear();
        experiment.util.StackTestDriver stackTestDriver13 = new experiment.util.StackTestDriver();
        java.lang.Object obj15 = stackTestDriver13.push((java.lang.Object) false);
        java.lang.Object obj16 = stackTestDriver13.peek();
        experiment.util.StackTestDriver stackTestDriver17 = new experiment.util.StackTestDriver();
        java.lang.Object obj19 = stackTestDriver17.push((java.lang.Object) (byte) 0);
        java.lang.Object obj20 = stackTestDriver13.push((java.lang.Object) (byte) 0);
        java.lang.Object obj21 = stackTestDriver13.peek();
        java.lang.Object obj22 = stackTestDriver9.push((java.lang.Object) stackTestDriver13);
        java.lang.Object obj23 = stackTestDriver9.peek();
        java.lang.Object obj24 = stackTestDriver0.push(obj23);
        java.lang.Class<?> wildcardClass25 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 0 + "'", obj2, (byte) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + false + "'", obj11, false);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + false + "'", obj15, false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + false + "'", obj16, false);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (byte) 0 + "'", obj19, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (byte) 0 + "'", obj20, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (byte) 0 + "'", obj21, (byte) 0);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test226");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver3 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        java.lang.Object obj6 = stackTestDriver4.push((java.lang.Object) (byte) 0);
        java.lang.Object obj7 = stackTestDriver3.push(obj6);
        java.lang.Object obj9 = stackTestDriver3.push((java.lang.Object) 1L);
        int int10 = stackTestDriver3.size();
        stackTestDriver3.clear();
        java.lang.Object obj12 = stackTestDriver0.push((java.lang.Object) stackTestDriver3);
        java.lang.Object obj13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = stackTestDriver0.push(obj13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 0 + "'", obj6, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 0 + "'", obj7, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 1L + "'", obj9, 1L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test227");
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
        experiment.util.StackTestDriver stackTestDriver14 = new experiment.util.StackTestDriver();
        int int15 = stackTestDriver14.size();
        java.lang.Object obj16 = stackTestDriver5.push((java.lang.Object) int15);
        boolean boolean17 = stackTestDriver5.isEmpty();
        int int18 = stackTestDriver5.size();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + false + "'", obj2, false);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0 + "'", obj16, 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test228");
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
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver20 = new experiment.util.StackTestDriver();
        java.lang.Object obj22 = stackTestDriver20.push((java.lang.Object) false);
        stackTestDriver20.clear();
        boolean boolean24 = stackTestDriver20.isEmpty();
        boolean boolean25 = stackTestDriver20.isEmpty();
        experiment.util.StackTestDriver stackTestDriver26 = new experiment.util.StackTestDriver();
        java.lang.Object obj28 = stackTestDriver26.push((java.lang.Object) (byte) 0);
        stackTestDriver26.clear();
        java.lang.Object obj31 = stackTestDriver26.push((java.lang.Object) (-1.0d));
        experiment.util.StackTestDriver stackTestDriver32 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver33 = new experiment.util.StackTestDriver();
        java.lang.Object obj35 = stackTestDriver33.push((java.lang.Object) (byte) 0);
        java.lang.Object obj36 = stackTestDriver32.push(obj35);
        java.lang.Object obj37 = stackTestDriver26.push(obj35);
        experiment.util.StackTestDriver stackTestDriver38 = new experiment.util.StackTestDriver();
        int int39 = stackTestDriver38.size();
        boolean boolean40 = stackTestDriver38.isEmpty();
        stackTestDriver38.clear();
        int int42 = stackTestDriver38.size();
        stackTestDriver38.clear();
        experiment.util.StackTestDriver stackTestDriver44 = new experiment.util.StackTestDriver();
        boolean boolean45 = stackTestDriver44.isEmpty();
        java.lang.Class<?> wildcardClass46 = stackTestDriver44.getClass();
        java.lang.Object obj47 = stackTestDriver38.push((java.lang.Object) wildcardClass46);
        java.lang.Object obj48 = stackTestDriver26.push((java.lang.Object) stackTestDriver38);
        java.lang.Object obj49 = stackTestDriver20.push((java.lang.Object) stackTestDriver26);
        java.lang.Object obj50 = stackTestDriver20.pop();
        java.lang.Object obj51 = stackTestDriver0.push(obj50);
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
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + false + "'", obj22, false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + (byte) 0 + "'", obj28, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + (-1.0d) + "'", obj31, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + (byte) 0 + "'", obj35, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + (byte) 0 + "'", obj36, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + (byte) 0 + "'", obj37, (byte) 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertEquals(obj47.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj47), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj47), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertNotNull(obj50);
        org.junit.Assert.assertNotNull(obj51);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test229");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) false);
        java.lang.Object obj3 = stackTestDriver0.peek();
        stackTestDriver0.clear();
        int int5 = stackTestDriver0.size();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver7 = new experiment.util.StackTestDriver();
        int int8 = stackTestDriver7.size();
        boolean boolean9 = stackTestDriver7.isEmpty();
        stackTestDriver7.clear();
        stackTestDriver7.clear();
        experiment.util.StackTestDriver stackTestDriver12 = new experiment.util.StackTestDriver();
        java.lang.Object obj14 = stackTestDriver12.push((java.lang.Object) (byte) 0);
        stackTestDriver12.clear();
        int int16 = stackTestDriver12.size();
        java.lang.Object obj17 = stackTestDriver7.push((java.lang.Object) stackTestDriver12);
        stackTestDriver7.clear();
        java.lang.Object obj19 = stackTestDriver0.push((java.lang.Object) stackTestDriver7);
        java.lang.Object obj20 = stackTestDriver0.pop();
        java.lang.Class<?> wildcardClass21 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + false + "'", obj2, false);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (byte) 0 + "'", obj14, (byte) 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test230");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) "");
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        boolean boolean6 = stackTestDriver5.isEmpty();
        stackTestDriver5.clear();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        stackTestDriver5.clear();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + "" + "'", obj4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test231");
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
        int int12 = stackTestDriver0.size();
        boolean boolean13 = stackTestDriver0.isEmpty();
        boolean boolean14 = stackTestDriver0.isEmpty();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 0 + "'", obj3, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 0 + "'", obj4, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1L + "'", obj6, 1L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 1L + "'", obj9, 1L);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 1L + "'", obj10, 1L);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 1L + "'", obj11, 1L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test232");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        boolean boolean5 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        int int7 = stackTestDriver0.size();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        int int10 = stackTestDriver0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test233");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) false);
        java.lang.Object obj3 = stackTestDriver0.peek();
        stackTestDriver0.clear();
        int int5 = stackTestDriver0.size();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver7 = new experiment.util.StackTestDriver();
        int int8 = stackTestDriver7.size();
        boolean boolean9 = stackTestDriver7.isEmpty();
        stackTestDriver7.clear();
        stackTestDriver7.clear();
        experiment.util.StackTestDriver stackTestDriver12 = new experiment.util.StackTestDriver();
        java.lang.Object obj14 = stackTestDriver12.push((java.lang.Object) (byte) 0);
        stackTestDriver12.clear();
        int int16 = stackTestDriver12.size();
        java.lang.Object obj17 = stackTestDriver7.push((java.lang.Object) stackTestDriver12);
        stackTestDriver7.clear();
        java.lang.Object obj19 = stackTestDriver0.push((java.lang.Object) stackTestDriver7);
        java.lang.Class<?> wildcardClass20 = stackTestDriver7.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + false + "'", obj2, false);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (byte) 0 + "'", obj14, (byte) 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test234");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver1 = new experiment.util.StackTestDriver();
        java.lang.Object obj3 = stackTestDriver1.push((java.lang.Object) (byte) 0);
        java.lang.Object obj4 = stackTestDriver0.push(obj3);
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) 1L);
        int int7 = stackTestDriver0.size();
        stackTestDriver0.clear();
        int int9 = stackTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 0 + "'", obj3, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 0 + "'", obj4, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1L + "'", obj6, 1L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test235");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) false);
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) false);
        java.lang.Object obj8 = stackTestDriver5.peek();
        experiment.util.StackTestDriver stackTestDriver9 = new experiment.util.StackTestDriver();
        java.lang.Object obj11 = stackTestDriver9.push((java.lang.Object) (byte) 0);
        java.lang.Object obj12 = stackTestDriver5.push((java.lang.Object) (byte) 0);
        boolean boolean13 = stackTestDriver5.isEmpty();
        java.lang.Object obj14 = stackTestDriver0.push((java.lang.Object) boolean13);
        java.lang.Object obj15 = stackTestDriver0.peek();
        boolean boolean16 = stackTestDriver0.isEmpty();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + false + "'", obj2, false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + false + "'", obj7, false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + false + "'", obj8, false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 0 + "'", obj11, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) 0 + "'", obj12, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + false + "'", obj14, false);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + false + "'", obj15, false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test236");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) "");
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        boolean boolean6 = stackTestDriver5.isEmpty();
        stackTestDriver5.clear();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        experiment.util.StackTestDriver stackTestDriver9 = new experiment.util.StackTestDriver();
        java.lang.Object obj11 = stackTestDriver9.push((java.lang.Object) false);
        java.lang.Object obj12 = stackTestDriver9.peek();
        stackTestDriver9.clear();
        int int14 = stackTestDriver9.size();
        stackTestDriver9.clear();
        boolean boolean16 = stackTestDriver9.isEmpty();
        java.lang.Object obj17 = stackTestDriver5.push((java.lang.Object) stackTestDriver9);
        boolean boolean18 = stackTestDriver9.isEmpty();
        java.lang.Class<?> wildcardClass19 = stackTestDriver9.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + "" + "'", obj4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + false + "'", obj11, false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + false + "'", obj12, false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test237");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) false);
        java.lang.Object obj3 = stackTestDriver0.peek();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        java.lang.Object obj6 = stackTestDriver4.push((java.lang.Object) (byte) 0);
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) (byte) 0);
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = stackTestDriver0.peek();
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
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test238");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver1 = new experiment.util.StackTestDriver();
        boolean boolean2 = stackTestDriver1.isEmpty();
        stackTestDriver1.clear();
        int int4 = stackTestDriver1.size();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) false);
        java.lang.Object obj8 = stackTestDriver5.peek();
        java.lang.Class<?> wildcardClass9 = stackTestDriver5.getClass();
        java.lang.Object obj10 = stackTestDriver1.push((java.lang.Object) wildcardClass9);
        java.lang.Object obj11 = stackTestDriver0.push(obj10);
        int int12 = stackTestDriver0.size();
        boolean boolean13 = stackTestDriver0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + false + "'", obj7, false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + false + "'", obj8, false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test239");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) "");
        stackTestDriver0.clear();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + "" + "'", obj4, "");
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test240");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) false);
        stackTestDriver0.clear();
        int int4 = stackTestDriver0.size();
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) false);
        boolean boolean7 = stackTestDriver0.isEmpty();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + false + "'", obj2, false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + false + "'", obj6, false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test241");
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
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test242");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver1 = new experiment.util.StackTestDriver();
        java.lang.Object obj3 = stackTestDriver1.push((java.lang.Object) (byte) 0);
        java.lang.Object obj4 = stackTestDriver0.push(obj3);
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) 1L);
        int int7 = stackTestDriver0.size();
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 0 + "'", obj3, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 0 + "'", obj4, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1L + "'", obj6, 1L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test243");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) false);
        java.lang.Object obj3 = stackTestDriver0.peek();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        java.lang.Object obj6 = stackTestDriver4.push((java.lang.Object) (byte) 0);
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) (byte) 0);
        java.lang.Object obj8 = stackTestDriver0.peek();
        boolean boolean9 = stackTestDriver0.isEmpty();
        java.lang.Object obj10 = stackTestDriver0.peek();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + false + "'", obj2, false);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 0 + "'", obj6, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 0 + "'", obj7, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) 0 + "'", obj8, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) 0 + "'", obj10, (byte) 0);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test244");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver1 = new experiment.util.StackTestDriver();
        java.lang.Object obj3 = stackTestDriver1.push((java.lang.Object) (byte) 0);
        java.lang.Object obj4 = stackTestDriver0.push(obj3);
        int int5 = stackTestDriver0.size();
        java.lang.Object obj6 = stackTestDriver0.peek();
        boolean boolean7 = stackTestDriver0.isEmpty();
        java.lang.Object obj8 = stackTestDriver0.pop();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 0 + "'", obj3, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 0 + "'", obj4, (byte) 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 0 + "'", obj6, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) 0 + "'", obj8, (byte) 0);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test245");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        boolean boolean4 = stackTestDriver0.isEmpty();
        int int5 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        int int7 = stackTestDriver6.size();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver6);
        boolean boolean9 = stackTestDriver0.isEmpty();
        java.lang.Object obj10 = stackTestDriver0.peek();
        java.lang.Object obj11 = stackTestDriver0.pop();
        boolean boolean12 = stackTestDriver0.isEmpty();
        int int13 = stackTestDriver0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test246");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        boolean boolean5 = stackTestDriver0.isEmpty();
        int int6 = stackTestDriver0.size();
        boolean boolean7 = stackTestDriver0.isEmpty();
        boolean boolean8 = stackTestDriver0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test247");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver1 = new experiment.util.StackTestDriver();
        java.lang.Object obj3 = stackTestDriver1.push((java.lang.Object) (byte) 0);
        java.lang.Object obj4 = stackTestDriver0.push(obj3);
        int int5 = stackTestDriver0.size();
        boolean boolean6 = stackTestDriver0.isEmpty();
        java.lang.Object obj7 = stackTestDriver0.pop();
        boolean boolean8 = stackTestDriver0.isEmpty();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 0 + "'", obj3, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 0 + "'", obj4, (byte) 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 0 + "'", obj7, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test248");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 0);
        int int3 = stackTestDriver0.size();
        java.lang.Object obj4 = stackTestDriver0.pop();
        java.lang.Class<?> wildcardClass5 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 0 + "'", obj2, (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 0 + "'", obj4, (byte) 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test249");
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
        experiment.util.StackTestDriver stackTestDriver14 = new experiment.util.StackTestDriver();
        java.lang.Object obj16 = stackTestDriver14.push((java.lang.Object) false);
        java.lang.Object obj17 = stackTestDriver14.pop();
        java.lang.Object obj18 = stackTestDriver0.push((java.lang.Object) stackTestDriver14);
        stackTestDriver0.clear();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 0 + "'", obj3, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 0 + "'", obj4, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) 0 + "'", obj5, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + false + "'", obj8, false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + false + "'", obj9, false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 1.0f + "'", obj13, 1.0f);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + false + "'", obj16, false);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + false + "'", obj17, false);
        org.junit.Assert.assertNotNull(obj18);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test250");
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
        int int13 = stackTestDriver0.size();
        java.lang.Class<?> wildcardClass14 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + false + "'", obj9, false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test251");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver1 = new experiment.util.StackTestDriver();
        java.lang.Object obj3 = stackTestDriver1.push((java.lang.Object) (byte) 0);
        java.lang.Object obj4 = stackTestDriver0.push(obj3);
        java.lang.Object obj5 = stackTestDriver0.peek();
        boolean boolean6 = stackTestDriver0.isEmpty();
        java.lang.Object obj7 = stackTestDriver0.pop();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        int int10 = stackTestDriver0.size();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 0 + "'", obj3, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 0 + "'", obj4, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) 0 + "'", obj5, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 0 + "'", obj7, (byte) 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test252");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        boolean boolean5 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        boolean boolean7 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        boolean boolean9 = stackTestDriver0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test253");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 0);
        stackTestDriver0.clear();
        int int4 = stackTestDriver0.size();
        int int5 = stackTestDriver0.size();
        stackTestDriver0.clear();
        int int7 = stackTestDriver0.size();
        boolean boolean8 = stackTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 0 + "'", obj2, (byte) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test254");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        boolean boolean5 = stackTestDriver0.isEmpty();
        boolean boolean6 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        int int8 = stackTestDriver0.size();
        int int9 = stackTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test255");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) false);
        java.lang.Object obj3 = stackTestDriver0.peek();
        java.lang.Object obj4 = stackTestDriver0.peek();
        stackTestDriver0.clear();
        java.lang.Class<?> wildcardClass6 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + false + "'", obj2, false);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + false + "'", obj4, false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test256");
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
        java.lang.Object obj19 = stackTestDriver0.push((java.lang.Object) 1.0d);
        experiment.util.StackTestDriver stackTestDriver20 = new experiment.util.StackTestDriver();
        int int21 = stackTestDriver20.size();
        boolean boolean22 = stackTestDriver20.isEmpty();
        experiment.util.StackTestDriver stackTestDriver23 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver24 = new experiment.util.StackTestDriver();
        java.lang.Object obj26 = stackTestDriver24.push((java.lang.Object) (byte) 0);
        java.lang.Object obj27 = stackTestDriver23.push(obj26);
        java.lang.Object obj29 = stackTestDriver23.push((java.lang.Object) 1L);
        int int30 = stackTestDriver23.size();
        boolean boolean31 = stackTestDriver23.isEmpty();
        java.lang.Object obj32 = stackTestDriver23.peek();
        java.lang.Object obj33 = stackTestDriver23.peek();
        int int34 = stackTestDriver23.size();
        experiment.util.StackTestDriver stackTestDriver35 = new experiment.util.StackTestDriver();
        int int36 = stackTestDriver35.size();
        boolean boolean37 = stackTestDriver35.isEmpty();
        stackTestDriver35.clear();
        stackTestDriver35.clear();
        experiment.util.StackTestDriver stackTestDriver40 = new experiment.util.StackTestDriver();
        java.lang.Object obj42 = stackTestDriver40.push((java.lang.Object) (byte) 0);
        stackTestDriver40.clear();
        int int44 = stackTestDriver40.size();
        java.lang.Object obj45 = stackTestDriver35.push((java.lang.Object) stackTestDriver40);
        java.lang.Object obj46 = stackTestDriver23.push((java.lang.Object) stackTestDriver40);
        java.lang.Class<?> wildcardClass47 = obj46.getClass();
        java.lang.Object obj48 = stackTestDriver20.push((java.lang.Object) wildcardClass47);
        stackTestDriver20.clear();
        java.lang.Object obj50 = stackTestDriver0.push((java.lang.Object) stackTestDriver20);
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
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 1.0d + "'", obj19, 1.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + (byte) 0 + "'", obj26, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + (byte) 0 + "'", obj27, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 1L + "'", obj29, 1L);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 1L + "'", obj32, 1L);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + 1L + "'", obj33, 1L);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2 + "'", int34 == 2);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + (byte) 0 + "'", obj42, (byte) 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertEquals(obj48.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj48), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj48), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertNotNull(obj50);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test257");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        boolean boolean5 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        boolean boolean7 = stackTestDriver0.isEmpty();
        java.lang.Class<?> wildcardClass8 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test258");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) false);
        boolean boolean3 = stackTestDriver0.isEmpty();
        boolean boolean4 = stackTestDriver0.isEmpty();
        boolean boolean5 = stackTestDriver0.isEmpty();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + false + "'", obj2, false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test259");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) false);
        java.lang.Object obj3 = stackTestDriver0.peek();
        stackTestDriver0.clear();
        int int5 = stackTestDriver0.size();
        stackTestDriver0.clear();
        int int7 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        java.lang.Object obj10 = stackTestDriver8.push((java.lang.Object) (byte) 0);
        stackTestDriver8.clear();
        java.lang.Object obj13 = stackTestDriver8.push((java.lang.Object) (-1.0d));
        experiment.util.StackTestDriver stackTestDriver14 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        java.lang.Object obj17 = stackTestDriver15.push((java.lang.Object) (byte) 0);
        java.lang.Object obj18 = stackTestDriver14.push(obj17);
        java.lang.Object obj19 = stackTestDriver8.push(obj17);
        stackTestDriver8.clear();
        java.lang.Object obj21 = stackTestDriver0.push((java.lang.Object) stackTestDriver8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = stackTestDriver8.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + false + "'", obj2, false);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) 0 + "'", obj10, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (-1.0d) + "'", obj13, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) 0 + "'", obj17, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (byte) 0 + "'", obj18, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (byte) 0 + "'", obj19, (byte) 0);
        org.junit.Assert.assertNotNull(obj21);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test260");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 0);
        experiment.util.StackTestDriver stackTestDriver3 = new experiment.util.StackTestDriver();
        int int4 = stackTestDriver3.size();
        boolean boolean5 = stackTestDriver3.isEmpty();
        stackTestDriver3.clear();
        stackTestDriver3.clear();
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        java.lang.Object obj10 = stackTestDriver8.push((java.lang.Object) (byte) 0);
        stackTestDriver8.clear();
        int int12 = stackTestDriver8.size();
        java.lang.Object obj13 = stackTestDriver3.push((java.lang.Object) stackTestDriver8);
        boolean boolean14 = stackTestDriver8.isEmpty();
        java.lang.Object obj15 = stackTestDriver0.push((java.lang.Object) boolean14);
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 0 + "'", obj2, (byte) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) 0 + "'", obj10, (byte) 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + true + "'", obj15, true);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test261");
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
        java.lang.Object obj14 = stackTestDriver4.peek();
        java.lang.Object obj15 = stackTestDriver4.peek();
        stackTestDriver4.clear();
        experiment.util.StackTestDriver stackTestDriver17 = new experiment.util.StackTestDriver();
        java.lang.Object obj19 = stackTestDriver17.push((java.lang.Object) false);
        java.lang.Object obj20 = stackTestDriver17.peek();
        stackTestDriver17.clear();
        int int22 = stackTestDriver17.size();
        java.lang.Object obj24 = stackTestDriver17.push((java.lang.Object) 0);
        boolean boolean25 = stackTestDriver17.isEmpty();
        boolean boolean26 = stackTestDriver17.isEmpty();
        java.lang.Object obj27 = stackTestDriver4.push((java.lang.Object) boolean26);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 0 + "'", obj7, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) 0 + "'", obj8, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 1L + "'", obj10, 1L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 1L + "'", obj14, 1L);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 1L + "'", obj15, 1L);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + false + "'", obj19, false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + false + "'", obj20, false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 0 + "'", obj24, 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + false + "'", obj27, false);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test262");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) false);
        java.lang.Object obj3 = stackTestDriver0.peek();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        java.lang.Object obj6 = stackTestDriver4.push((java.lang.Object) (byte) 0);
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) (byte) 0);
        boolean boolean8 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver11 = new experiment.util.StackTestDriver();
        java.lang.Object obj13 = stackTestDriver11.push((java.lang.Object) false);
        stackTestDriver11.clear();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        java.lang.Object obj17 = stackTestDriver15.push((java.lang.Object) false);
        java.lang.Object obj18 = stackTestDriver15.peek();
        experiment.util.StackTestDriver stackTestDriver19 = new experiment.util.StackTestDriver();
        java.lang.Object obj21 = stackTestDriver19.push((java.lang.Object) (byte) 0);
        java.lang.Object obj22 = stackTestDriver15.push((java.lang.Object) (byte) 0);
        java.lang.Object obj23 = stackTestDriver15.peek();
        java.lang.Object obj24 = stackTestDriver11.push((java.lang.Object) stackTestDriver15);
        java.lang.Object obj25 = stackTestDriver11.peek();
        java.lang.Object obj26 = stackTestDriver11.pop();
        java.lang.Object obj27 = stackTestDriver0.push(obj26);
        java.lang.Object obj28 = stackTestDriver0.peek();
        java.lang.Object obj29 = stackTestDriver0.peek();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + false + "'", obj2, false);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 0 + "'", obj6, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 0 + "'", obj7, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + false + "'", obj13, false);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + false + "'", obj17, false);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + false + "'", obj18, false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (byte) 0 + "'", obj21, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (byte) 0 + "'", obj22, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (byte) 0 + "'", obj23, (byte) 0);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertNotNull(obj29);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test263");
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
        boolean boolean12 = stackTestDriver0.isEmpty();
        int int13 = stackTestDriver0.size();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 0 + "'", obj3, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 0 + "'", obj4, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) 0 + "'", obj5, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + false + "'", obj8, false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + false + "'", obj9, false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test264");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver1 = new experiment.util.StackTestDriver();
        java.lang.Object obj3 = stackTestDriver1.push((java.lang.Object) (byte) 0);
        java.lang.Object obj4 = stackTestDriver0.push(obj3);
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) 1L);
        int int7 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean9 = stackTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 0 + "'", obj3, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 0 + "'", obj4, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1L + "'", obj6, 1L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test265");
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
        java.lang.Object obj15 = stackTestDriver0.peek();
        boolean boolean16 = stackTestDriver0.isEmpty();
        java.lang.Object obj17 = stackTestDriver0.pop();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + false + "'", obj2, false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + false + "'", obj6, false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + false + "'", obj7, false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) 0 + "'", obj10, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 0 + "'", obj11, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) 0 + "'", obj12, (byte) 0);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(obj17);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test266");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) false);
        java.lang.Object obj3 = stackTestDriver0.peek();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        java.lang.Object obj6 = stackTestDriver4.push((java.lang.Object) (byte) 0);
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) (byte) 0);
        boolean boolean8 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        int int10 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver11 = new experiment.util.StackTestDriver();
        java.lang.Object obj13 = stackTestDriver11.push((java.lang.Object) false);
        java.lang.Object obj14 = stackTestDriver11.pop();
        int int15 = stackTestDriver11.size();
        experiment.util.StackTestDriver stackTestDriver16 = new experiment.util.StackTestDriver();
        int int17 = stackTestDriver16.size();
        boolean boolean18 = stackTestDriver16.isEmpty();
        stackTestDriver16.clear();
        stackTestDriver16.clear();
        boolean boolean21 = stackTestDriver16.isEmpty();
        stackTestDriver16.clear();
        int int23 = stackTestDriver16.size();
        java.lang.Object obj24 = stackTestDriver11.push((java.lang.Object) stackTestDriver16);
        java.lang.Object obj25 = stackTestDriver0.push(obj24);
        experiment.util.StackTestDriver stackTestDriver26 = new experiment.util.StackTestDriver();
        java.lang.Object obj28 = stackTestDriver26.push((java.lang.Object) (byte) 0);
        stackTestDriver26.clear();
        java.lang.Object obj31 = stackTestDriver26.push((java.lang.Object) (-1.0d));
        boolean boolean32 = stackTestDriver26.isEmpty();
        experiment.util.StackTestDriver stackTestDriver33 = new experiment.util.StackTestDriver();
        java.lang.Object obj35 = stackTestDriver33.push((java.lang.Object) false);
        java.lang.Object obj36 = stackTestDriver33.peek();
        experiment.util.StackTestDriver stackTestDriver37 = new experiment.util.StackTestDriver();
        java.lang.Object obj39 = stackTestDriver37.push((java.lang.Object) (byte) 0);
        java.lang.Object obj40 = stackTestDriver33.push((java.lang.Object) (byte) 0);
        java.lang.Object obj41 = stackTestDriver33.peek();
        java.lang.Class<?> wildcardClass42 = stackTestDriver33.getClass();
        java.lang.Object obj43 = stackTestDriver26.push((java.lang.Object) wildcardClass42);
        java.lang.Object obj44 = stackTestDriver0.push((java.lang.Object) wildcardClass42);
        java.lang.Object obj45 = stackTestDriver0.pop();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + false + "'", obj2, false);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 0 + "'", obj6, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 0 + "'", obj7, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + false + "'", obj13, false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + false + "'", obj14, false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + (byte) 0 + "'", obj28, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + (-1.0d) + "'", obj31, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + false + "'", obj35, false);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + false + "'", obj36, false);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + (byte) 0 + "'", obj39, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + (byte) 0 + "'", obj40, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + (byte) 0 + "'", obj41, (byte) 0);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertNotNull(obj43);
        org.junit.Assert.assertEquals(obj43.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj43), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj43), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertEquals(obj44.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj44), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj44), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertEquals(obj45.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj45), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj45), "class experiment.util.StackTestDriver");
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test267");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 0);
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        boolean boolean5 = stackTestDriver0.isEmpty();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 0 + "'", obj2, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test268");
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
        java.lang.Object obj18 = stackTestDriver0.pop();
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
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals(obj18.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj18), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj18), "class experiment.util.StackTestDriver");
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test269");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        boolean boolean5 = stackTestDriver0.isEmpty();
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) '#');
        int int8 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver9 = new experiment.util.StackTestDriver();
        int int10 = stackTestDriver9.size();
        int int11 = stackTestDriver9.size();
        stackTestDriver9.clear();
        experiment.util.StackTestDriver stackTestDriver13 = new experiment.util.StackTestDriver();
        int int14 = stackTestDriver13.size();
        boolean boolean15 = stackTestDriver13.isEmpty();
        stackTestDriver13.clear();
        stackTestDriver13.clear();
        int int18 = stackTestDriver13.size();
        boolean boolean19 = stackTestDriver13.isEmpty();
        experiment.util.StackTestDriver stackTestDriver20 = new experiment.util.StackTestDriver();
        java.lang.Object obj22 = stackTestDriver20.push((java.lang.Object) false);
        java.lang.Object obj23 = stackTestDriver20.peek();
        java.lang.Object obj24 = stackTestDriver20.peek();
        java.lang.Object obj25 = stackTestDriver13.push((java.lang.Object) stackTestDriver20);
        java.lang.Object obj26 = stackTestDriver9.push(obj25);
        boolean boolean27 = stackTestDriver9.isEmpty();
        java.lang.Object obj28 = stackTestDriver0.push((java.lang.Object) boolean27);
        experiment.util.StackTestDriver stackTestDriver29 = new experiment.util.StackTestDriver();
        int int30 = stackTestDriver29.size();
        boolean boolean31 = stackTestDriver29.isEmpty();
        stackTestDriver29.clear();
        stackTestDriver29.clear();
        boolean boolean34 = stackTestDriver29.isEmpty();
        int int35 = stackTestDriver29.size();
        stackTestDriver29.clear();
        java.lang.Object obj37 = stackTestDriver0.push((java.lang.Object) stackTestDriver29);
        java.lang.Class<?> wildcardClass38 = stackTestDriver29.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + '#' + "'", obj7, '#');
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + false + "'", obj22, false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + false + "'", obj23, false);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + false + "'", obj24, false);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + false + "'", obj28, false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test270");
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
        stackTestDriver6.clear();
        stackTestDriver6.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = stackTestDriver6.peek();
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
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test271");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver1 = new experiment.util.StackTestDriver();
        java.lang.Object obj3 = stackTestDriver1.push((java.lang.Object) (byte) 0);
        java.lang.Object obj4 = stackTestDriver0.push(obj3);
        int int5 = stackTestDriver0.size();
        boolean boolean6 = stackTestDriver0.isEmpty();
        int int7 = stackTestDriver0.size();
        java.lang.Object obj8 = stackTestDriver0.peek();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 0 + "'", obj3, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 0 + "'", obj4, (byte) 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) 0 + "'", obj8, (byte) 0);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test272");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        boolean boolean4 = stackTestDriver0.isEmpty();
        int int5 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        int int7 = stackTestDriver6.size();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver6);
        boolean boolean9 = stackTestDriver0.isEmpty();
        java.lang.Object obj10 = stackTestDriver0.peek();
        stackTestDriver0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test273");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        boolean boolean5 = stackTestDriver0.isEmpty();
        int int6 = stackTestDriver0.size();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test274");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) false);
        stackTestDriver0.clear();
        boolean boolean4 = stackTestDriver0.isEmpty();
        boolean boolean5 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        java.lang.Object obj8 = stackTestDriver6.push((java.lang.Object) (byte) 0);
        stackTestDriver6.clear();
        java.lang.Object obj11 = stackTestDriver6.push((java.lang.Object) (-1.0d));
        experiment.util.StackTestDriver stackTestDriver12 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver13 = new experiment.util.StackTestDriver();
        java.lang.Object obj15 = stackTestDriver13.push((java.lang.Object) (byte) 0);
        java.lang.Object obj16 = stackTestDriver12.push(obj15);
        java.lang.Object obj17 = stackTestDriver6.push(obj15);
        experiment.util.StackTestDriver stackTestDriver18 = new experiment.util.StackTestDriver();
        int int19 = stackTestDriver18.size();
        boolean boolean20 = stackTestDriver18.isEmpty();
        stackTestDriver18.clear();
        int int22 = stackTestDriver18.size();
        stackTestDriver18.clear();
        experiment.util.StackTestDriver stackTestDriver24 = new experiment.util.StackTestDriver();
        boolean boolean25 = stackTestDriver24.isEmpty();
        java.lang.Class<?> wildcardClass26 = stackTestDriver24.getClass();
        java.lang.Object obj27 = stackTestDriver18.push((java.lang.Object) wildcardClass26);
        java.lang.Object obj28 = stackTestDriver6.push((java.lang.Object) stackTestDriver18);
        java.lang.Object obj29 = stackTestDriver0.push((java.lang.Object) stackTestDriver6);
        java.lang.Object obj30 = stackTestDriver6.pop();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + false + "'", obj2, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) 0 + "'", obj8, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (-1.0d) + "'", obj11, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (byte) 0 + "'", obj15, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (byte) 0 + "'", obj16, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) 0 + "'", obj17, (byte) 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertEquals(obj27.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj27), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj27), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNotNull(obj30);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test275");
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
        java.lang.Object obj14 = stackTestDriver4.peek();
        java.lang.Object obj15 = stackTestDriver4.peek();
        stackTestDriver4.clear();
        stackTestDriver4.clear();
        java.lang.Class<?> wildcardClass18 = stackTestDriver4.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 0 + "'", obj7, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) 0 + "'", obj8, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 1L + "'", obj10, 1L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 1L + "'", obj14, 1L);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 1L + "'", obj15, 1L);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test276");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        int int4 = stackTestDriver0.size();
        stackTestDriver0.clear();
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) 'a');
        stackTestDriver0.clear();
        int int9 = stackTestDriver0.size();
        boolean boolean10 = stackTestDriver0.isEmpty();
        boolean boolean11 = stackTestDriver0.isEmpty();
        java.lang.Class<?> wildcardClass12 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 'a' + "'", obj7, 'a');
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test277");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) false);
        stackTestDriver0.clear();
        int int4 = stackTestDriver0.size();
        stackTestDriver0.clear();
        int int6 = stackTestDriver0.size();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + false + "'", obj2, false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test278");
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
        java.lang.Object obj14 = stackTestDriver4.peek();
        java.lang.Object obj15 = stackTestDriver4.pop();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 0 + "'", obj7, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) 0 + "'", obj8, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 1L + "'", obj10, 1L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 1L + "'", obj14, 1L);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 1L + "'", obj15, 1L);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test279");
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
        stackTestDriver6.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = stackTestDriver6.pop();
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
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test280");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 0);
        stackTestDriver0.clear();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (-1.0d));
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        java.lang.Object obj8 = stackTestDriver6.push((java.lang.Object) false);
        java.lang.Object obj9 = stackTestDriver6.peek();
        java.lang.Class<?> wildcardClass10 = stackTestDriver6.getClass();
        java.lang.Object obj11 = stackTestDriver0.push((java.lang.Object) stackTestDriver6);
        stackTestDriver6.clear();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 0 + "'", obj2, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + false + "'", obj8, false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + false + "'", obj9, false);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test281");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) false);
        java.lang.Object obj3 = stackTestDriver0.peek();
        stackTestDriver0.clear();
        int int5 = stackTestDriver0.size();
        stackTestDriver0.clear();
        int int7 = stackTestDriver0.size();
        stackTestDriver0.clear();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + false + "'", obj2, false);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test282");
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
            java.lang.Object obj13 = stackTestDriver5.pop();
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
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test283");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) false);
        java.lang.Object obj3 = stackTestDriver0.peek();
        java.lang.Object obj4 = stackTestDriver0.peek();
        java.lang.Object obj5 = stackTestDriver0.pop();
        boolean boolean6 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        java.lang.Object obj10 = stackTestDriver8.push((java.lang.Object) (byte) 0);
        java.lang.Object obj11 = stackTestDriver8.pop();
        java.lang.Object obj12 = stackTestDriver0.push((java.lang.Object) stackTestDriver8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = stackTestDriver8.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + false + "'", obj2, false);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + false + "'", obj4, false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + false + "'", obj5, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) 0 + "'", obj10, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 0 + "'", obj11, (byte) 0);
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test284");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 0);
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        java.lang.Class<?> wildcardClass6 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 0 + "'", obj2, (byte) 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test285");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        java.lang.Object obj6 = stackTestDriver4.push((java.lang.Object) false);
        java.lang.Object obj7 = stackTestDriver4.peek();
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        java.lang.Object obj10 = stackTestDriver8.push((java.lang.Object) (byte) 0);
        java.lang.Object obj11 = stackTestDriver4.push((java.lang.Object) (byte) 0);
        boolean boolean12 = stackTestDriver4.isEmpty();
        stackTestDriver4.clear();
        int int14 = stackTestDriver4.size();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        java.lang.Object obj17 = stackTestDriver15.push((java.lang.Object) false);
        java.lang.Object obj18 = stackTestDriver15.pop();
        int int19 = stackTestDriver15.size();
        experiment.util.StackTestDriver stackTestDriver20 = new experiment.util.StackTestDriver();
        int int21 = stackTestDriver20.size();
        boolean boolean22 = stackTestDriver20.isEmpty();
        stackTestDriver20.clear();
        stackTestDriver20.clear();
        boolean boolean25 = stackTestDriver20.isEmpty();
        stackTestDriver20.clear();
        int int27 = stackTestDriver20.size();
        java.lang.Object obj28 = stackTestDriver15.push((java.lang.Object) stackTestDriver20);
        java.lang.Object obj29 = stackTestDriver4.push(obj28);
        java.lang.Object obj30 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        stackTestDriver4.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj32 = stackTestDriver4.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + false + "'", obj6, false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + false + "'", obj7, false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) 0 + "'", obj10, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 0 + "'", obj11, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + false + "'", obj17, false);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + false + "'", obj18, false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNotNull(obj30);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test286");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        int int3 = stackTestDriver0.size();
        boolean boolean4 = stackTestDriver0.isEmpty();
        boolean boolean5 = stackTestDriver0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test287");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 0);
        stackTestDriver0.clear();
        int int4 = stackTestDriver0.size();
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) ' ');
        java.lang.Object obj7 = stackTestDriver0.peek();
        java.lang.Object obj8 = stackTestDriver0.peek();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 0 + "'", obj2, (byte) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + ' ' + "'", obj6, ' ');
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + ' ' + "'", obj7, ' ');
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + ' ' + "'", obj8, ' ');
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test288");
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
        experiment.util.StackTestDriver stackTestDriver14 = new experiment.util.StackTestDriver();
        int int15 = stackTestDriver14.size();
        java.lang.Object obj16 = stackTestDriver5.push((java.lang.Object) int15);
        boolean boolean17 = stackTestDriver5.isEmpty();
        experiment.util.StackTestDriver stackTestDriver18 = new experiment.util.StackTestDriver();
        boolean boolean19 = stackTestDriver18.isEmpty();
        stackTestDriver18.clear();
        boolean boolean21 = stackTestDriver18.isEmpty();
        java.lang.Object obj22 = stackTestDriver5.push((java.lang.Object) stackTestDriver18);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = stackTestDriver18.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + false + "'", obj2, false);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0 + "'", obj16, 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(obj22);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test289");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 0);
        stackTestDriver0.clear();
        int int4 = stackTestDriver0.size();
        int int5 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        java.lang.Object obj8 = stackTestDriver6.push((java.lang.Object) false);
        stackTestDriver6.clear();
        java.lang.Object obj10 = stackTestDriver0.push((java.lang.Object) stackTestDriver6);
        java.lang.Object obj11 = stackTestDriver0.pop();
        stackTestDriver0.clear();
        boolean boolean13 = stackTestDriver0.isEmpty();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 0 + "'", obj2, (byte) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + false + "'", obj8, false);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test290");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver1 = new experiment.util.StackTestDriver();
        java.lang.Object obj3 = stackTestDriver1.push((java.lang.Object) (byte) 0);
        java.lang.Object obj4 = stackTestDriver0.push(obj3);
        int int5 = stackTestDriver0.size();
        boolean boolean6 = stackTestDriver0.isEmpty();
        java.lang.Object obj7 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        int int9 = stackTestDriver8.size();
        boolean boolean10 = stackTestDriver8.isEmpty();
        stackTestDriver8.clear();
        stackTestDriver8.clear();
        boolean boolean13 = stackTestDriver8.isEmpty();
        int int14 = stackTestDriver8.size();
        boolean boolean15 = stackTestDriver8.isEmpty();
        java.lang.Object obj16 = stackTestDriver0.push((java.lang.Object) stackTestDriver8);
        int int17 = stackTestDriver8.size();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 0 + "'", obj3, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 0 + "'", obj4, (byte) 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 0 + "'", obj7, (byte) 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test291");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 0);
        stackTestDriver0.clear();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (-1.0d));
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        java.lang.Object obj8 = stackTestDriver6.push((java.lang.Object) false);
        java.lang.Object obj9 = stackTestDriver6.peek();
        java.lang.Class<?> wildcardClass10 = stackTestDriver6.getClass();
        java.lang.Object obj11 = stackTestDriver0.push((java.lang.Object) stackTestDriver6);
        int int12 = stackTestDriver0.size();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 0 + "'", obj2, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + false + "'", obj8, false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + false + "'", obj9, false);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test292");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) false);
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + false + "'", obj2, false);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test293");
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
        java.lang.Object obj11 = stackTestDriver7.peek();
        java.lang.Object obj12 = stackTestDriver0.push((java.lang.Object) stackTestDriver7);
        experiment.util.StackTestDriver stackTestDriver13 = new experiment.util.StackTestDriver();
        java.lang.Object obj15 = stackTestDriver13.push((java.lang.Object) (byte) 0);
        java.lang.Object obj16 = stackTestDriver13.peek();
        java.lang.Object obj17 = stackTestDriver0.push((java.lang.Object) stackTestDriver13);
        experiment.util.StackTestDriver stackTestDriver18 = new experiment.util.StackTestDriver();
        java.lang.Object obj20 = stackTestDriver18.push((java.lang.Object) false);
        java.lang.Object obj21 = stackTestDriver18.peek();
        experiment.util.StackTestDriver stackTestDriver22 = new experiment.util.StackTestDriver();
        java.lang.Object obj24 = stackTestDriver22.push((java.lang.Object) (byte) 0);
        java.lang.Object obj25 = stackTestDriver18.push((java.lang.Object) (byte) 0);
        java.lang.Object obj26 = stackTestDriver18.peek();
        boolean boolean27 = stackTestDriver18.isEmpty();
        experiment.util.StackTestDriver stackTestDriver28 = new experiment.util.StackTestDriver();
        java.lang.Object obj29 = stackTestDriver18.push((java.lang.Object) stackTestDriver28);
        java.lang.Object obj30 = stackTestDriver0.push((java.lang.Object) stackTestDriver18);
        stackTestDriver18.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + false + "'", obj9, false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + false + "'", obj11, false);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (byte) 0 + "'", obj15, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (byte) 0 + "'", obj16, (byte) 0);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + false + "'", obj20, false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + false + "'", obj21, false);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (byte) 0 + "'", obj24, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (byte) 0 + "'", obj25, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + (byte) 0 + "'", obj26, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNotNull(obj30);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test294");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 0);
        int int3 = stackTestDriver0.size();
        java.lang.Object obj4 = stackTestDriver0.peek();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) 0);
        stackTestDriver5.clear();
        java.lang.Object obj10 = stackTestDriver5.push((java.lang.Object) (-1.0d));
        boolean boolean11 = stackTestDriver5.isEmpty();
        experiment.util.StackTestDriver stackTestDriver12 = new experiment.util.StackTestDriver();
        java.lang.Object obj14 = stackTestDriver12.push((java.lang.Object) false);
        java.lang.Object obj15 = stackTestDriver12.peek();
        experiment.util.StackTestDriver stackTestDriver16 = new experiment.util.StackTestDriver();
        java.lang.Object obj18 = stackTestDriver16.push((java.lang.Object) (byte) 0);
        java.lang.Object obj19 = stackTestDriver12.push((java.lang.Object) (byte) 0);
        java.lang.Object obj20 = stackTestDriver12.peek();
        java.lang.Class<?> wildcardClass21 = stackTestDriver12.getClass();
        java.lang.Object obj22 = stackTestDriver5.push((java.lang.Object) wildcardClass21);
        java.lang.Object obj24 = stackTestDriver5.push((java.lang.Object) 1.0d);
        java.lang.Object obj25 = stackTestDriver0.push(obj24);
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 0 + "'", obj2, (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 0 + "'", obj4, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 0 + "'", obj7, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (-1.0d) + "'", obj10, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + false + "'", obj14, false);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + false + "'", obj15, false);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (byte) 0 + "'", obj18, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (byte) 0 + "'", obj19, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (byte) 0 + "'", obj20, (byte) 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals(obj22.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj22), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj22), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 1.0d + "'", obj24, 1.0d);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 1.0d + "'", obj25, 1.0d);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test295");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        int int4 = stackTestDriver0.size();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        boolean boolean7 = stackTestDriver6.isEmpty();
        java.lang.Class<?> wildcardClass8 = stackTestDriver6.getClass();
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) wildcardClass8);
        boolean boolean10 = stackTestDriver0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test296");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver1 = new experiment.util.StackTestDriver();
        java.lang.Object obj3 = stackTestDriver1.push((java.lang.Object) (byte) 0);
        java.lang.Object obj4 = stackTestDriver0.push(obj3);
        boolean boolean5 = stackTestDriver0.isEmpty();
        int int6 = stackTestDriver0.size();
        java.lang.Object obj7 = stackTestDriver0.peek();
        boolean boolean8 = stackTestDriver0.isEmpty();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 0 + "'", obj3, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 0 + "'", obj4, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 0 + "'", obj7, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test297");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) false);
        int int3 = stackTestDriver0.size();
        boolean boolean4 = stackTestDriver0.isEmpty();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + false + "'", obj2, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test298");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        boolean boolean5 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        int int7 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean9 = stackTestDriver0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test299");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        int int4 = stackTestDriver0.size();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        boolean boolean7 = stackTestDriver6.isEmpty();
        java.lang.Class<?> wildcardClass8 = stackTestDriver6.getClass();
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) wildcardClass8);
        stackTestDriver0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "class experiment.util.StackTestDriver");
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test300");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        boolean boolean2 = stackTestDriver0.isEmpty();
        int int3 = stackTestDriver0.size();
        boolean boolean4 = stackTestDriver0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test301");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver1 = new experiment.util.StackTestDriver();
        java.lang.Object obj3 = stackTestDriver1.push((java.lang.Object) (byte) 0);
        java.lang.Object obj4 = stackTestDriver0.push(obj3);
        java.lang.Object obj5 = stackTestDriver0.peek();
        java.lang.Object obj6 = stackTestDriver0.pop();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 0 + "'", obj3, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 0 + "'", obj4, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) 0 + "'", obj5, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 0 + "'", obj6, (byte) 0);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test302");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) false);
        java.lang.Object obj3 = stackTestDriver0.peek();
        java.lang.Object obj4 = stackTestDriver0.peek();
        java.lang.Object obj5 = stackTestDriver0.pop();
        boolean boolean6 = stackTestDriver0.isEmpty();
        boolean boolean7 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        boolean boolean9 = stackTestDriver0.isEmpty();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + false + "'", obj2, false);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + false + "'", obj4, false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + false + "'", obj5, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test303");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        int int4 = stackTestDriver0.size();
        stackTestDriver0.clear();
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) 'a');
        java.lang.Object obj8 = stackTestDriver0.peek();
        stackTestDriver0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 'a' + "'", obj7, 'a');
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 'a' + "'", obj8, 'a');
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test304");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) false);
        java.lang.Object obj3 = stackTestDriver0.peek();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        java.lang.Object obj6 = stackTestDriver4.push((java.lang.Object) (byte) 0);
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) (byte) 0);
        boolean boolean8 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        int int10 = stackTestDriver0.size();
        stackTestDriver0.clear();
        int int12 = stackTestDriver0.size();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + false + "'", obj2, false);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 0 + "'", obj6, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 0 + "'", obj7, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test305");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 0);
        stackTestDriver0.clear();
        int int4 = stackTestDriver0.size();
        int int5 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        java.lang.Object obj8 = stackTestDriver6.push((java.lang.Object) false);
        stackTestDriver6.clear();
        java.lang.Object obj10 = stackTestDriver0.push((java.lang.Object) stackTestDriver6);
        experiment.util.StackTestDriver stackTestDriver11 = new experiment.util.StackTestDriver();
        int int12 = stackTestDriver11.size();
        boolean boolean13 = stackTestDriver11.isEmpty();
        stackTestDriver11.clear();
        int int15 = stackTestDriver11.size();
        stackTestDriver11.clear();
        experiment.util.StackTestDriver stackTestDriver17 = new experiment.util.StackTestDriver();
        boolean boolean18 = stackTestDriver17.isEmpty();
        java.lang.Class<?> wildcardClass19 = stackTestDriver17.getClass();
        java.lang.Object obj20 = stackTestDriver11.push((java.lang.Object) wildcardClass19);
        experiment.util.StackTestDriver stackTestDriver21 = new experiment.util.StackTestDriver();
        java.lang.Object obj23 = stackTestDriver21.push((java.lang.Object) (byte) 0);
        stackTestDriver21.clear();
        int int25 = stackTestDriver21.size();
        boolean boolean26 = stackTestDriver21.isEmpty();
        java.lang.Class<?> wildcardClass27 = stackTestDriver21.getClass();
        java.lang.Object obj28 = stackTestDriver11.push((java.lang.Object) wildcardClass27);
        java.lang.Object obj29 = stackTestDriver6.push((java.lang.Object) stackTestDriver11);
        int int30 = stackTestDriver6.size();
        experiment.util.StackTestDriver stackTestDriver31 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver32 = new experiment.util.StackTestDriver();
        java.lang.Object obj34 = stackTestDriver32.push((java.lang.Object) (byte) 0);
        java.lang.Object obj35 = stackTestDriver31.push(obj34);
        java.lang.Object obj36 = stackTestDriver31.peek();
        experiment.util.StackTestDriver stackTestDriver37 = new experiment.util.StackTestDriver();
        java.lang.Object obj39 = stackTestDriver37.push((java.lang.Object) false);
        java.lang.Object obj40 = stackTestDriver37.pop();
        int int41 = stackTestDriver37.size();
        java.lang.Object obj42 = stackTestDriver31.push((java.lang.Object) stackTestDriver37);
        stackTestDriver37.clear();
        experiment.util.StackTestDriver stackTestDriver44 = new experiment.util.StackTestDriver();
        java.lang.Object obj46 = stackTestDriver44.push((java.lang.Object) (byte) 0);
        stackTestDriver44.clear();
        java.lang.Object obj49 = stackTestDriver44.push((java.lang.Object) (-1.0d));
        boolean boolean50 = stackTestDriver44.isEmpty();
        experiment.util.StackTestDriver stackTestDriver51 = new experiment.util.StackTestDriver();
        java.lang.Object obj53 = stackTestDriver51.push((java.lang.Object) false);
        java.lang.Object obj54 = stackTestDriver51.peek();
        experiment.util.StackTestDriver stackTestDriver55 = new experiment.util.StackTestDriver();
        java.lang.Object obj57 = stackTestDriver55.push((java.lang.Object) (byte) 0);
        java.lang.Object obj58 = stackTestDriver51.push((java.lang.Object) (byte) 0);
        java.lang.Object obj59 = stackTestDriver51.peek();
        java.lang.Class<?> wildcardClass60 = stackTestDriver51.getClass();
        java.lang.Object obj61 = stackTestDriver44.push((java.lang.Object) wildcardClass60);
        stackTestDriver44.clear();
        experiment.util.StackTestDriver stackTestDriver63 = new experiment.util.StackTestDriver();
        java.lang.Object obj65 = stackTestDriver63.push((java.lang.Object) false);
        java.lang.Object obj66 = stackTestDriver63.peek();
        experiment.util.StackTestDriver stackTestDriver67 = new experiment.util.StackTestDriver();
        java.lang.Object obj69 = stackTestDriver67.push((java.lang.Object) (byte) 0);
        java.lang.Object obj70 = stackTestDriver63.push((java.lang.Object) (byte) 0);
        boolean boolean71 = stackTestDriver63.isEmpty();
        stackTestDriver63.clear();
        int int73 = stackTestDriver63.size();
        experiment.util.StackTestDriver stackTestDriver74 = new experiment.util.StackTestDriver();
        java.lang.Object obj76 = stackTestDriver74.push((java.lang.Object) false);
        java.lang.Object obj77 = stackTestDriver74.pop();
        int int78 = stackTestDriver74.size();
        experiment.util.StackTestDriver stackTestDriver79 = new experiment.util.StackTestDriver();
        int int80 = stackTestDriver79.size();
        boolean boolean81 = stackTestDriver79.isEmpty();
        stackTestDriver79.clear();
        stackTestDriver79.clear();
        boolean boolean84 = stackTestDriver79.isEmpty();
        stackTestDriver79.clear();
        int int86 = stackTestDriver79.size();
        java.lang.Object obj87 = stackTestDriver74.push((java.lang.Object) stackTestDriver79);
        java.lang.Object obj88 = stackTestDriver63.push(obj87);
        java.lang.Object obj89 = stackTestDriver63.pop();
        java.lang.Object obj90 = stackTestDriver44.push(obj89);
        java.lang.Object obj91 = stackTestDriver37.push((java.lang.Object) stackTestDriver44);
        java.lang.Object obj92 = stackTestDriver6.push((java.lang.Object) stackTestDriver44);
        java.lang.Class<?> wildcardClass93 = stackTestDriver44.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 0 + "'", obj2, (byte) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + false + "'", obj8, false);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (byte) 0 + "'", obj23, (byte) 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertEquals(obj28.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj28), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj28), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + (byte) 0 + "'", obj34, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + (byte) 0 + "'", obj35, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + (byte) 0 + "'", obj36, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + false + "'", obj39, false);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + false + "'", obj40, false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + (byte) 0 + "'", obj46, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + (-1.0d) + "'", obj49, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + obj53 + "' != '" + false + "'", obj53, false);
        org.junit.Assert.assertEquals("'" + obj54 + "' != '" + false + "'", obj54, false);
        org.junit.Assert.assertEquals("'" + obj57 + "' != '" + (byte) 0 + "'", obj57, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj58 + "' != '" + (byte) 0 + "'", obj58, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj59 + "' != '" + (byte) 0 + "'", obj59, (byte) 0);
        org.junit.Assert.assertNotNull(wildcardClass60);
        org.junit.Assert.assertNotNull(obj61);
        org.junit.Assert.assertEquals(obj61.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj61), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj61), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals("'" + obj65 + "' != '" + false + "'", obj65, false);
        org.junit.Assert.assertEquals("'" + obj66 + "' != '" + false + "'", obj66, false);
        org.junit.Assert.assertEquals("'" + obj69 + "' != '" + (byte) 0 + "'", obj69, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj70 + "' != '" + (byte) 0 + "'", obj70, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertEquals("'" + obj76 + "' != '" + false + "'", obj76, false);
        org.junit.Assert.assertEquals("'" + obj77 + "' != '" + false + "'", obj77, false);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 0 + "'", int86 == 0);
        org.junit.Assert.assertNotNull(obj87);
        org.junit.Assert.assertNotNull(obj88);
        org.junit.Assert.assertNotNull(obj89);
        org.junit.Assert.assertNotNull(obj90);
        org.junit.Assert.assertNotNull(obj91);
        org.junit.Assert.assertNotNull(obj92);
        org.junit.Assert.assertNotNull(wildcardClass93);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test306");
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
        experiment.util.StackTestDriver stackTestDriver14 = new experiment.util.StackTestDriver();
        int int15 = stackTestDriver14.size();
        java.lang.Object obj16 = stackTestDriver5.push((java.lang.Object) int15);
        experiment.util.StackTestDriver stackTestDriver17 = new experiment.util.StackTestDriver();
        java.lang.Object obj19 = stackTestDriver17.push((java.lang.Object) false);
        java.lang.Object obj20 = stackTestDriver17.peek();
        experiment.util.StackTestDriver stackTestDriver21 = new experiment.util.StackTestDriver();
        java.lang.Object obj23 = stackTestDriver21.push((java.lang.Object) (byte) 0);
        java.lang.Object obj24 = stackTestDriver17.push((java.lang.Object) (byte) 0);
        boolean boolean25 = stackTestDriver17.isEmpty();
        stackTestDriver17.clear();
        stackTestDriver17.clear();
        java.lang.Object obj28 = stackTestDriver5.push((java.lang.Object) stackTestDriver17);
        stackTestDriver17.clear();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + false + "'", obj2, false);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0 + "'", obj16, 0);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + false + "'", obj19, false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + false + "'", obj20, false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (byte) 0 + "'", obj23, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (byte) 0 + "'", obj24, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(obj28);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test307");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 0);
        stackTestDriver0.clear();
        int int4 = stackTestDriver0.size();
        int int5 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean7 = stackTestDriver0.isEmpty();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 0 + "'", obj2, (byte) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test308");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) "");
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        boolean boolean6 = stackTestDriver5.isEmpty();
        stackTestDriver5.clear();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        experiment.util.StackTestDriver stackTestDriver9 = new experiment.util.StackTestDriver();
        java.lang.Object obj11 = stackTestDriver9.push((java.lang.Object) (byte) 0);
        java.lang.Object obj12 = stackTestDriver9.peek();
        java.lang.Class<?> wildcardClass13 = obj12.getClass();
        java.lang.Object obj14 = stackTestDriver5.push(obj12);
        java.lang.Object obj15 = stackTestDriver5.peek();
        java.lang.Class<?> wildcardClass16 = stackTestDriver5.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + "" + "'", obj4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 0 + "'", obj11, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) 0 + "'", obj12, (byte) 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (byte) 0 + "'", obj14, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (byte) 0 + "'", obj15, (byte) 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test309");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) false);
        java.lang.Object obj3 = stackTestDriver0.peek();
        stackTestDriver0.clear();
        int int5 = stackTestDriver0.size();
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) 0);
        int int8 = stackTestDriver0.size();
        boolean boolean9 = stackTestDriver0.isEmpty();
        java.lang.Object obj10 = stackTestDriver0.pop();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + false + "'", obj2, false);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0 + "'", obj7, 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 0 + "'", obj10, 0);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test310");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver1 = new experiment.util.StackTestDriver();
        java.lang.Object obj3 = stackTestDriver1.push((java.lang.Object) (byte) 0);
        java.lang.Object obj4 = stackTestDriver0.push(obj3);
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean7 = stackTestDriver0.isEmpty();
        java.lang.Object obj8 = stackTestDriver0.peek();
        experiment.util.StackTestDriver stackTestDriver9 = new experiment.util.StackTestDriver();
        int int10 = stackTestDriver9.size();
        int int11 = stackTestDriver9.size();
        boolean boolean12 = stackTestDriver9.isEmpty();
        int int13 = stackTestDriver9.size();
        boolean boolean14 = stackTestDriver9.isEmpty();
        java.lang.Object obj15 = stackTestDriver0.push((java.lang.Object) stackTestDriver9);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 0 + "'", obj3, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 0 + "'", obj4, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 1 + "'", obj6, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) 1 + "'", obj8, (byte) 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test311");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver1 = new experiment.util.StackTestDriver();
        java.lang.Object obj3 = stackTestDriver1.push((java.lang.Object) (byte) 0);
        java.lang.Object obj4 = stackTestDriver0.push(obj3);
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) 1L);
        int int7 = stackTestDriver0.size();
        int int8 = stackTestDriver0.size();
        boolean boolean9 = stackTestDriver0.isEmpty();
        java.lang.Object obj11 = stackTestDriver0.push((java.lang.Object) (byte) 0);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 0 + "'", obj3, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 0 + "'", obj4, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1L + "'", obj6, 1L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 0 + "'", obj11, (byte) 0);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test312");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver1 = new experiment.util.StackTestDriver();
        java.lang.Object obj3 = stackTestDriver1.push((java.lang.Object) (byte) 0);
        java.lang.Object obj4 = stackTestDriver0.push(obj3);
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) 1L);
        int int7 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean9 = stackTestDriver0.isEmpty();
        java.lang.Class<?> wildcardClass10 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 0 + "'", obj3, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 0 + "'", obj4, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1L + "'", obj6, 1L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test313");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 0);
        stackTestDriver0.clear();
        int int4 = stackTestDriver0.size();
        int int5 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        java.lang.Object obj8 = stackTestDriver6.push((java.lang.Object) false);
        stackTestDriver6.clear();
        java.lang.Object obj10 = stackTestDriver0.push((java.lang.Object) stackTestDriver6);
        experiment.util.StackTestDriver stackTestDriver11 = new experiment.util.StackTestDriver();
        int int12 = stackTestDriver11.size();
        boolean boolean13 = stackTestDriver11.isEmpty();
        stackTestDriver11.clear();
        int int15 = stackTestDriver11.size();
        stackTestDriver11.clear();
        experiment.util.StackTestDriver stackTestDriver17 = new experiment.util.StackTestDriver();
        boolean boolean18 = stackTestDriver17.isEmpty();
        java.lang.Class<?> wildcardClass19 = stackTestDriver17.getClass();
        java.lang.Object obj20 = stackTestDriver11.push((java.lang.Object) wildcardClass19);
        experiment.util.StackTestDriver stackTestDriver21 = new experiment.util.StackTestDriver();
        java.lang.Object obj23 = stackTestDriver21.push((java.lang.Object) (byte) 0);
        stackTestDriver21.clear();
        int int25 = stackTestDriver21.size();
        boolean boolean26 = stackTestDriver21.isEmpty();
        java.lang.Class<?> wildcardClass27 = stackTestDriver21.getClass();
        java.lang.Object obj28 = stackTestDriver11.push((java.lang.Object) wildcardClass27);
        java.lang.Object obj29 = stackTestDriver6.push((java.lang.Object) stackTestDriver11);
        int int30 = stackTestDriver6.size();
        experiment.util.StackTestDriver stackTestDriver31 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver32 = new experiment.util.StackTestDriver();
        java.lang.Object obj34 = stackTestDriver32.push((java.lang.Object) (byte) 0);
        java.lang.Object obj35 = stackTestDriver31.push(obj34);
        java.lang.Object obj36 = stackTestDriver31.peek();
        experiment.util.StackTestDriver stackTestDriver37 = new experiment.util.StackTestDriver();
        java.lang.Object obj39 = stackTestDriver37.push((java.lang.Object) false);
        java.lang.Object obj40 = stackTestDriver37.pop();
        int int41 = stackTestDriver37.size();
        java.lang.Object obj42 = stackTestDriver31.push((java.lang.Object) stackTestDriver37);
        stackTestDriver37.clear();
        experiment.util.StackTestDriver stackTestDriver44 = new experiment.util.StackTestDriver();
        java.lang.Object obj46 = stackTestDriver44.push((java.lang.Object) (byte) 0);
        stackTestDriver44.clear();
        java.lang.Object obj49 = stackTestDriver44.push((java.lang.Object) (-1.0d));
        boolean boolean50 = stackTestDriver44.isEmpty();
        experiment.util.StackTestDriver stackTestDriver51 = new experiment.util.StackTestDriver();
        java.lang.Object obj53 = stackTestDriver51.push((java.lang.Object) false);
        java.lang.Object obj54 = stackTestDriver51.peek();
        experiment.util.StackTestDriver stackTestDriver55 = new experiment.util.StackTestDriver();
        java.lang.Object obj57 = stackTestDriver55.push((java.lang.Object) (byte) 0);
        java.lang.Object obj58 = stackTestDriver51.push((java.lang.Object) (byte) 0);
        java.lang.Object obj59 = stackTestDriver51.peek();
        java.lang.Class<?> wildcardClass60 = stackTestDriver51.getClass();
        java.lang.Object obj61 = stackTestDriver44.push((java.lang.Object) wildcardClass60);
        stackTestDriver44.clear();
        experiment.util.StackTestDriver stackTestDriver63 = new experiment.util.StackTestDriver();
        java.lang.Object obj65 = stackTestDriver63.push((java.lang.Object) false);
        java.lang.Object obj66 = stackTestDriver63.peek();
        experiment.util.StackTestDriver stackTestDriver67 = new experiment.util.StackTestDriver();
        java.lang.Object obj69 = stackTestDriver67.push((java.lang.Object) (byte) 0);
        java.lang.Object obj70 = stackTestDriver63.push((java.lang.Object) (byte) 0);
        boolean boolean71 = stackTestDriver63.isEmpty();
        stackTestDriver63.clear();
        int int73 = stackTestDriver63.size();
        experiment.util.StackTestDriver stackTestDriver74 = new experiment.util.StackTestDriver();
        java.lang.Object obj76 = stackTestDriver74.push((java.lang.Object) false);
        java.lang.Object obj77 = stackTestDriver74.pop();
        int int78 = stackTestDriver74.size();
        experiment.util.StackTestDriver stackTestDriver79 = new experiment.util.StackTestDriver();
        int int80 = stackTestDriver79.size();
        boolean boolean81 = stackTestDriver79.isEmpty();
        stackTestDriver79.clear();
        stackTestDriver79.clear();
        boolean boolean84 = stackTestDriver79.isEmpty();
        stackTestDriver79.clear();
        int int86 = stackTestDriver79.size();
        java.lang.Object obj87 = stackTestDriver74.push((java.lang.Object) stackTestDriver79);
        java.lang.Object obj88 = stackTestDriver63.push(obj87);
        java.lang.Object obj89 = stackTestDriver63.pop();
        java.lang.Object obj90 = stackTestDriver44.push(obj89);
        java.lang.Object obj91 = stackTestDriver37.push((java.lang.Object) stackTestDriver44);
        java.lang.Object obj92 = stackTestDriver6.push((java.lang.Object) stackTestDriver44);
        boolean boolean93 = stackTestDriver44.isEmpty();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 0 + "'", obj2, (byte) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + false + "'", obj8, false);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (byte) 0 + "'", obj23, (byte) 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertEquals(obj28.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj28), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj28), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + (byte) 0 + "'", obj34, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + (byte) 0 + "'", obj35, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + (byte) 0 + "'", obj36, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + false + "'", obj39, false);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + false + "'", obj40, false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + (byte) 0 + "'", obj46, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + (-1.0d) + "'", obj49, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + obj53 + "' != '" + false + "'", obj53, false);
        org.junit.Assert.assertEquals("'" + obj54 + "' != '" + false + "'", obj54, false);
        org.junit.Assert.assertEquals("'" + obj57 + "' != '" + (byte) 0 + "'", obj57, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj58 + "' != '" + (byte) 0 + "'", obj58, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj59 + "' != '" + (byte) 0 + "'", obj59, (byte) 0);
        org.junit.Assert.assertNotNull(wildcardClass60);
        org.junit.Assert.assertNotNull(obj61);
        org.junit.Assert.assertEquals(obj61.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj61), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj61), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals("'" + obj65 + "' != '" + false + "'", obj65, false);
        org.junit.Assert.assertEquals("'" + obj66 + "' != '" + false + "'", obj66, false);
        org.junit.Assert.assertEquals("'" + obj69 + "' != '" + (byte) 0 + "'", obj69, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj70 + "' != '" + (byte) 0 + "'", obj70, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertEquals("'" + obj76 + "' != '" + false + "'", obj76, false);
        org.junit.Assert.assertEquals("'" + obj77 + "' != '" + false + "'", obj77, false);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 0 + "'", int86 == 0);
        org.junit.Assert.assertNotNull(obj87);
        org.junit.Assert.assertNotNull(obj88);
        org.junit.Assert.assertNotNull(obj89);
        org.junit.Assert.assertNotNull(obj90);
        org.junit.Assert.assertNotNull(obj91);
        org.junit.Assert.assertNotNull(obj92);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test314");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver1 = new experiment.util.StackTestDriver();
        java.lang.Object obj3 = stackTestDriver1.push((java.lang.Object) (byte) 0);
        java.lang.Object obj4 = stackTestDriver0.push(obj3);
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) 1L);
        java.lang.Object obj7 = stackTestDriver0.pop();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 0 + "'", obj3, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 0 + "'", obj4, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1L + "'", obj6, 1L);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1L + "'", obj7, 1L);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test315");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) false);
        java.lang.Object obj3 = stackTestDriver0.peek();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        java.lang.Object obj6 = stackTestDriver4.push((java.lang.Object) (byte) 0);
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) (byte) 0);
        boolean boolean8 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        boolean boolean11 = stackTestDriver0.isEmpty();
        java.lang.Class<?> wildcardClass12 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + false + "'", obj2, false);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 0 + "'", obj6, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 0 + "'", obj7, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test316");
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
        java.lang.Object obj19 = stackTestDriver0.push((java.lang.Object) 1.0d);
        boolean boolean20 = stackTestDriver0.isEmpty();
        boolean boolean21 = stackTestDriver0.isEmpty();
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
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 1.0d + "'", obj19, 1.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test317");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 0);
        int int3 = stackTestDriver0.size();
        int int4 = stackTestDriver0.size();
        java.lang.Object obj5 = stackTestDriver0.peek();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 0 + "'", obj2, (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) 0 + "'", obj5, (byte) 0);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test318");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) false);
        java.lang.Object obj3 = stackTestDriver0.peek();
        java.lang.Object obj4 = stackTestDriver0.peek();
        java.lang.Object obj5 = stackTestDriver0.pop();
        boolean boolean6 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        java.lang.Object obj10 = stackTestDriver8.push((java.lang.Object) (byte) 0);
        java.lang.Object obj11 = stackTestDriver8.pop();
        java.lang.Object obj12 = stackTestDriver0.push((java.lang.Object) stackTestDriver8);
        int int13 = stackTestDriver0.size();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + false + "'", obj2, false);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + false + "'", obj4, false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + false + "'", obj5, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) 0 + "'", obj10, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 0 + "'", obj11, (byte) 0);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test319");
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
        java.lang.Class<?> wildcardClass12 = stackTestDriver0.getClass();
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
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test320");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 0);
        stackTestDriver0.clear();
        int int4 = stackTestDriver0.size();
        int int5 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        java.lang.Object obj8 = stackTestDriver6.push((java.lang.Object) false);
        stackTestDriver6.clear();
        java.lang.Object obj10 = stackTestDriver0.push((java.lang.Object) stackTestDriver6);
        experiment.util.StackTestDriver stackTestDriver11 = new experiment.util.StackTestDriver();
        int int12 = stackTestDriver11.size();
        boolean boolean13 = stackTestDriver11.isEmpty();
        stackTestDriver11.clear();
        int int15 = stackTestDriver11.size();
        stackTestDriver11.clear();
        experiment.util.StackTestDriver stackTestDriver17 = new experiment.util.StackTestDriver();
        boolean boolean18 = stackTestDriver17.isEmpty();
        java.lang.Class<?> wildcardClass19 = stackTestDriver17.getClass();
        java.lang.Object obj20 = stackTestDriver11.push((java.lang.Object) wildcardClass19);
        experiment.util.StackTestDriver stackTestDriver21 = new experiment.util.StackTestDriver();
        java.lang.Object obj23 = stackTestDriver21.push((java.lang.Object) (byte) 0);
        stackTestDriver21.clear();
        int int25 = stackTestDriver21.size();
        boolean boolean26 = stackTestDriver21.isEmpty();
        java.lang.Class<?> wildcardClass27 = stackTestDriver21.getClass();
        java.lang.Object obj28 = stackTestDriver11.push((java.lang.Object) wildcardClass27);
        java.lang.Object obj29 = stackTestDriver6.push((java.lang.Object) stackTestDriver11);
        stackTestDriver11.clear();
        boolean boolean31 = stackTestDriver11.isEmpty();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 0 + "'", obj2, (byte) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + false + "'", obj8, false);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (byte) 0 + "'", obj23, (byte) 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertEquals(obj28.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj28), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj28), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test321");
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
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
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
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test322");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        boolean boolean5 = stackTestDriver0.isEmpty();
        int int6 = stackTestDriver0.size();
        boolean boolean7 = stackTestDriver0.isEmpty();
        int int8 = stackTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test323");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        boolean boolean4 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        boolean boolean6 = stackTestDriver0.isEmpty();
        int int7 = stackTestDriver0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test324");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        boolean boolean4 = stackTestDriver0.isEmpty();
        int int5 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        int int7 = stackTestDriver6.size();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver6);
        int int9 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        java.lang.Object obj12 = stackTestDriver10.push((java.lang.Object) (byte) 0);
        stackTestDriver10.clear();
        java.lang.Object obj14 = stackTestDriver0.push((java.lang.Object) stackTestDriver10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) 0 + "'", obj12, (byte) 0);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test325");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        boolean boolean2 = stackTestDriver0.isEmpty();
        int int3 = stackTestDriver0.size();
        stackTestDriver0.clear();
        java.lang.Class<?> wildcardClass5 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test326");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) 0);
        java.lang.Object obj8 = stackTestDriver4.push(obj7);
        int int9 = stackTestDriver4.size();
        boolean boolean10 = stackTestDriver4.isEmpty();
        java.lang.Object obj11 = stackTestDriver4.pop();
        experiment.util.StackTestDriver stackTestDriver12 = new experiment.util.StackTestDriver();
        int int13 = stackTestDriver12.size();
        boolean boolean14 = stackTestDriver12.isEmpty();
        stackTestDriver12.clear();
        stackTestDriver12.clear();
        boolean boolean17 = stackTestDriver12.isEmpty();
        int int18 = stackTestDriver12.size();
        boolean boolean19 = stackTestDriver12.isEmpty();
        java.lang.Object obj20 = stackTestDriver4.push((java.lang.Object) stackTestDriver12);
        java.lang.Object obj21 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 0 + "'", obj7, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) 0 + "'", obj8, (byte) 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 0 + "'", obj11, (byte) 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(obj21);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test327");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) false);
        java.lang.Object obj3 = stackTestDriver0.peek();
        java.lang.Object obj4 = stackTestDriver0.peek();
        int int5 = stackTestDriver0.size();
        stackTestDriver0.clear();
        int int7 = stackTestDriver0.size();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + false + "'", obj2, false);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + false + "'", obj4, false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test328");
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
        int int15 = stackTestDriver0.size();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 0 + "'", obj3, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 0 + "'", obj4, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) 0 + "'", obj5, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + false + "'", obj8, false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + false + "'", obj9, false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 1.0f + "'", obj13, 1.0f);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test329");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) false);
        java.lang.Object obj3 = stackTestDriver0.peek();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        java.lang.Object obj6 = stackTestDriver4.push((java.lang.Object) (byte) 0);
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) (byte) 0);
        java.lang.Object obj8 = stackTestDriver0.pop();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + false + "'", obj2, false);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 0 + "'", obj6, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 0 + "'", obj7, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) 0 + "'", obj8, (byte) 0);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test330");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) false);
        java.lang.Object obj3 = stackTestDriver0.peek();
        stackTestDriver0.clear();
        int int5 = stackTestDriver0.size();
        stackTestDriver0.clear();
        int int7 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        java.lang.Object obj10 = stackTestDriver8.push((java.lang.Object) (byte) 0);
        stackTestDriver8.clear();
        java.lang.Object obj13 = stackTestDriver8.push((java.lang.Object) (-1.0d));
        experiment.util.StackTestDriver stackTestDriver14 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        java.lang.Object obj17 = stackTestDriver15.push((java.lang.Object) (byte) 0);
        java.lang.Object obj18 = stackTestDriver14.push(obj17);
        java.lang.Object obj19 = stackTestDriver8.push(obj17);
        stackTestDriver8.clear();
        java.lang.Object obj21 = stackTestDriver0.push((java.lang.Object) stackTestDriver8);
        java.lang.Object obj22 = stackTestDriver0.pop();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + false + "'", obj2, false);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) 0 + "'", obj10, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (-1.0d) + "'", obj13, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) 0 + "'", obj17, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (byte) 0 + "'", obj18, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (byte) 0 + "'", obj19, (byte) 0);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(obj22);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test331");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver3 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        java.lang.Object obj6 = stackTestDriver4.push((java.lang.Object) (byte) 0);
        java.lang.Object obj7 = stackTestDriver3.push(obj6);
        java.lang.Object obj9 = stackTestDriver3.push((java.lang.Object) 1L);
        int int10 = stackTestDriver3.size();
        stackTestDriver3.clear();
        java.lang.Object obj12 = stackTestDriver0.push((java.lang.Object) stackTestDriver3);
        java.lang.Class<?> wildcardClass13 = obj12.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 0 + "'", obj6, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 0 + "'", obj7, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 1L + "'", obj9, 1L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test332");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) false);
        java.lang.Object obj3 = stackTestDriver0.peek();
        java.lang.Object obj4 = stackTestDriver0.pop();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + false + "'", obj2, false);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + false + "'", obj4, false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test333");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) false);
        java.lang.Object obj3 = stackTestDriver0.peek();
        stackTestDriver0.clear();
        int int5 = stackTestDriver0.size();
        stackTestDriver0.clear();
        int int7 = stackTestDriver0.size();
        java.lang.Class<?> wildcardClass8 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + false + "'", obj2, false);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test334");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) false);
        stackTestDriver0.clear();
        int int4 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean6 = stackTestDriver0.isEmpty();
        int int7 = stackTestDriver0.size();
        stackTestDriver0.clear();
        java.lang.Class<?> wildcardClass9 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + false + "'", obj2, false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test335");
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
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test336");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 0);
        int int3 = stackTestDriver0.size();
        int int4 = stackTestDriver0.size();
        java.lang.Object obj5 = stackTestDriver0.pop();
        int int6 = stackTestDriver0.size();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 0 + "'", obj2, (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) 0 + "'", obj5, (byte) 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test337");
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
        boolean boolean15 = stackTestDriver0.isEmpty();
        java.lang.Class<?> wildcardClass16 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 0 + "'", obj3, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 0 + "'", obj4, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) 0 + "'", obj5, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + false + "'", obj8, false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + false + "'", obj9, false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 1.0f + "'", obj13, 1.0f);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test338");
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
        int int20 = stackTestDriver0.size();
        boolean boolean21 = stackTestDriver0.isEmpty();
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test339");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) "");
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        boolean boolean6 = stackTestDriver5.isEmpty();
        stackTestDriver5.clear();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        experiment.util.StackTestDriver stackTestDriver9 = new experiment.util.StackTestDriver();
        java.lang.Object obj11 = stackTestDriver9.push((java.lang.Object) (byte) 0);
        java.lang.Object obj12 = stackTestDriver9.peek();
        java.lang.Class<?> wildcardClass13 = obj12.getClass();
        java.lang.Object obj14 = stackTestDriver5.push(obj12);
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        boolean boolean16 = stackTestDriver15.isEmpty();
        stackTestDriver15.clear();
        stackTestDriver15.clear();
        stackTestDriver15.clear();
        boolean boolean20 = stackTestDriver15.isEmpty();
        java.lang.Object obj22 = stackTestDriver15.push((java.lang.Object) '#');
        int int23 = stackTestDriver15.size();
        experiment.util.StackTestDriver stackTestDriver24 = new experiment.util.StackTestDriver();
        int int25 = stackTestDriver24.size();
        int int26 = stackTestDriver24.size();
        stackTestDriver24.clear();
        experiment.util.StackTestDriver stackTestDriver28 = new experiment.util.StackTestDriver();
        int int29 = stackTestDriver28.size();
        boolean boolean30 = stackTestDriver28.isEmpty();
        stackTestDriver28.clear();
        stackTestDriver28.clear();
        int int33 = stackTestDriver28.size();
        boolean boolean34 = stackTestDriver28.isEmpty();
        experiment.util.StackTestDriver stackTestDriver35 = new experiment.util.StackTestDriver();
        java.lang.Object obj37 = stackTestDriver35.push((java.lang.Object) false);
        java.lang.Object obj38 = stackTestDriver35.peek();
        java.lang.Object obj39 = stackTestDriver35.peek();
        java.lang.Object obj40 = stackTestDriver28.push((java.lang.Object) stackTestDriver35);
        java.lang.Object obj41 = stackTestDriver24.push(obj40);
        boolean boolean42 = stackTestDriver24.isEmpty();
        java.lang.Object obj43 = stackTestDriver15.push((java.lang.Object) boolean42);
        java.lang.Object obj44 = stackTestDriver5.push(obj43);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + "" + "'", obj4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 0 + "'", obj11, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) 0 + "'", obj12, (byte) 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (byte) 0 + "'", obj14, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + '#' + "'", obj22, '#');
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + false + "'", obj37, false);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + false + "'", obj38, false);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + false + "'", obj39, false);
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + false + "'", obj43, false);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + false + "'", obj44, false);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test340");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) false);
        stackTestDriver0.clear();
        boolean boolean4 = stackTestDriver0.isEmpty();
        boolean boolean5 = stackTestDriver0.isEmpty();
        int int6 = stackTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + false + "'", obj2, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test341");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 0);
        stackTestDriver0.clear();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (-1.0d));
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver7 = new experiment.util.StackTestDriver();
        java.lang.Object obj9 = stackTestDriver7.push((java.lang.Object) (byte) 0);
        java.lang.Object obj10 = stackTestDriver6.push(obj9);
        java.lang.Object obj11 = stackTestDriver0.push(obj9);
        java.lang.Object obj12 = stackTestDriver0.peek();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 0 + "'", obj2, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) 0 + "'", obj9, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) 0 + "'", obj10, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 0 + "'", obj11, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) 0 + "'", obj12, (byte) 0);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test342");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        boolean boolean5 = stackTestDriver0.isEmpty();
        boolean boolean6 = stackTestDriver0.isEmpty();
        boolean boolean7 = stackTestDriver0.isEmpty();
        java.lang.Class<?> wildcardClass8 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test343");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) false);
        java.lang.Object obj3 = stackTestDriver0.peek();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        java.lang.Object obj6 = stackTestDriver4.push((java.lang.Object) (byte) 0);
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) (byte) 0);
        boolean boolean8 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        int int10 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver11 = new experiment.util.StackTestDriver();
        java.lang.Object obj13 = stackTestDriver11.push((java.lang.Object) false);
        java.lang.Object obj14 = stackTestDriver11.pop();
        int int15 = stackTestDriver11.size();
        experiment.util.StackTestDriver stackTestDriver16 = new experiment.util.StackTestDriver();
        int int17 = stackTestDriver16.size();
        boolean boolean18 = stackTestDriver16.isEmpty();
        stackTestDriver16.clear();
        stackTestDriver16.clear();
        boolean boolean21 = stackTestDriver16.isEmpty();
        stackTestDriver16.clear();
        int int23 = stackTestDriver16.size();
        java.lang.Object obj24 = stackTestDriver11.push((java.lang.Object) stackTestDriver16);
        java.lang.Object obj25 = stackTestDriver0.push(obj24);
        experiment.util.StackTestDriver stackTestDriver26 = new experiment.util.StackTestDriver();
        java.lang.Object obj28 = stackTestDriver26.push((java.lang.Object) (byte) 0);
        stackTestDriver26.clear();
        java.lang.Object obj31 = stackTestDriver26.push((java.lang.Object) (-1.0d));
        boolean boolean32 = stackTestDriver26.isEmpty();
        experiment.util.StackTestDriver stackTestDriver33 = new experiment.util.StackTestDriver();
        java.lang.Object obj35 = stackTestDriver33.push((java.lang.Object) false);
        java.lang.Object obj36 = stackTestDriver33.peek();
        experiment.util.StackTestDriver stackTestDriver37 = new experiment.util.StackTestDriver();
        java.lang.Object obj39 = stackTestDriver37.push((java.lang.Object) (byte) 0);
        java.lang.Object obj40 = stackTestDriver33.push((java.lang.Object) (byte) 0);
        java.lang.Object obj41 = stackTestDriver33.peek();
        java.lang.Class<?> wildcardClass42 = stackTestDriver33.getClass();
        java.lang.Object obj43 = stackTestDriver26.push((java.lang.Object) wildcardClass42);
        java.lang.Object obj44 = stackTestDriver0.push((java.lang.Object) wildcardClass42);
        java.lang.Object obj45 = stackTestDriver0.peek();
        int int46 = stackTestDriver0.size();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + false + "'", obj2, false);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 0 + "'", obj6, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 0 + "'", obj7, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + false + "'", obj13, false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + false + "'", obj14, false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + (byte) 0 + "'", obj28, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + (-1.0d) + "'", obj31, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + false + "'", obj35, false);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + false + "'", obj36, false);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + (byte) 0 + "'", obj39, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + (byte) 0 + "'", obj40, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + (byte) 0 + "'", obj41, (byte) 0);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertNotNull(obj43);
        org.junit.Assert.assertEquals(obj43.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj43), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj43), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertEquals(obj44.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj44), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj44), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertEquals(obj45.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj45), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj45), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 2 + "'", int46 == 2);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test344");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        boolean boolean4 = stackTestDriver0.isEmpty();
        int int5 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        int int7 = stackTestDriver6.size();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver6);
        java.lang.Object obj9 = stackTestDriver0.peek();
        java.lang.Object obj10 = stackTestDriver0.pop();
        int int11 = stackTestDriver0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test345");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 0);
        int int3 = stackTestDriver0.size();
        int int4 = stackTestDriver0.size();
        java.lang.Object obj5 = stackTestDriver0.pop();
        java.lang.Object obj6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = stackTestDriver0.push(obj6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 0 + "'", obj2, (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) 0 + "'", obj5, (byte) 0);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test346");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) false);
        java.lang.Object obj3 = stackTestDriver0.peek();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        java.lang.Object obj6 = stackTestDriver4.push((java.lang.Object) (byte) 0);
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) (byte) 0);
        boolean boolean8 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver11 = new experiment.util.StackTestDriver();
        java.lang.Object obj13 = stackTestDriver11.push((java.lang.Object) false);
        stackTestDriver11.clear();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        java.lang.Object obj17 = stackTestDriver15.push((java.lang.Object) false);
        java.lang.Object obj18 = stackTestDriver15.peek();
        experiment.util.StackTestDriver stackTestDriver19 = new experiment.util.StackTestDriver();
        java.lang.Object obj21 = stackTestDriver19.push((java.lang.Object) (byte) 0);
        java.lang.Object obj22 = stackTestDriver15.push((java.lang.Object) (byte) 0);
        java.lang.Object obj23 = stackTestDriver15.peek();
        java.lang.Object obj24 = stackTestDriver11.push((java.lang.Object) stackTestDriver15);
        java.lang.Object obj25 = stackTestDriver11.peek();
        java.lang.Object obj26 = stackTestDriver11.pop();
        java.lang.Object obj27 = stackTestDriver0.push(obj26);
        stackTestDriver0.clear();
        java.lang.Class<?> wildcardClass29 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + false + "'", obj2, false);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 0 + "'", obj6, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 0 + "'", obj7, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + false + "'", obj13, false);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + false + "'", obj17, false);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + false + "'", obj18, false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (byte) 0 + "'", obj21, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (byte) 0 + "'", obj22, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (byte) 0 + "'", obj23, (byte) 0);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test347");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        int int5 = stackTestDriver0.size();
        int int6 = stackTestDriver0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test348");
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
        boolean boolean14 = stackTestDriver4.isEmpty();
        int int15 = stackTestDriver4.size();
        java.lang.Class<?> wildcardClass16 = stackTestDriver4.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + false + "'", obj2, false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + false + "'", obj6, false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + false + "'", obj7, false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) 0 + "'", obj10, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 0 + "'", obj11, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) 0 + "'", obj12, (byte) 0);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test349");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver1 = new experiment.util.StackTestDriver();
        java.lang.Object obj3 = stackTestDriver1.push((java.lang.Object) (byte) 0);
        java.lang.Object obj4 = stackTestDriver0.push(obj3);
        int int5 = stackTestDriver0.size();
        boolean boolean6 = stackTestDriver0.isEmpty();
        int int7 = stackTestDriver0.size();
        int int8 = stackTestDriver0.size();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 0 + "'", obj3, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 0 + "'", obj4, (byte) 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test350");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver1 = new experiment.util.StackTestDriver();
        java.lang.Object obj3 = stackTestDriver1.push((java.lang.Object) (byte) 0);
        java.lang.Object obj4 = stackTestDriver0.push(obj3);
        java.lang.Object obj5 = stackTestDriver0.peek();
        boolean boolean6 = stackTestDriver0.isEmpty();
        java.lang.Object obj7 = stackTestDriver0.pop();
        boolean boolean8 = stackTestDriver0.isEmpty();
        int int9 = stackTestDriver0.size();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 0 + "'", obj3, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 0 + "'", obj4, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) 0 + "'", obj5, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 0 + "'", obj7, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test351");
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
        java.lang.Object obj24 = stackTestDriver0.pop();
        java.lang.Class<?> wildcardClass25 = stackTestDriver0.getClass();
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
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test352");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        int int2 = stackTestDriver0.size();
        boolean boolean3 = stackTestDriver0.isEmpty();
        int int4 = stackTestDriver0.size();
        int int5 = stackTestDriver0.size();
        boolean boolean6 = stackTestDriver0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test353");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 0);
        stackTestDriver0.clear();
        int int4 = stackTestDriver0.size();
        int int5 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        java.lang.Object obj8 = stackTestDriver6.push((java.lang.Object) false);
        stackTestDriver6.clear();
        java.lang.Object obj10 = stackTestDriver0.push((java.lang.Object) stackTestDriver6);
        experiment.util.StackTestDriver stackTestDriver11 = new experiment.util.StackTestDriver();
        java.lang.Object obj13 = stackTestDriver11.push((java.lang.Object) false);
        java.lang.Object obj14 = stackTestDriver11.peek();
        stackTestDriver11.clear();
        int int16 = stackTestDriver11.size();
        java.lang.Object obj18 = stackTestDriver11.push((java.lang.Object) 0);
        boolean boolean19 = stackTestDriver11.isEmpty();
        java.lang.Object obj20 = stackTestDriver0.push((java.lang.Object) stackTestDriver11);
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 0 + "'", obj2, (byte) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + false + "'", obj8, false);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + false + "'", obj13, false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + false + "'", obj14, false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 0 + "'", obj18, 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(obj20);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test354");
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
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj29 = stackTestDriver0.peek();
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
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test355");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) false);
        java.lang.Object obj3 = stackTestDriver0.peek();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        java.lang.Object obj6 = stackTestDriver4.push((java.lang.Object) (byte) 0);
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) (byte) 0);
        stackTestDriver0.clear();
        boolean boolean9 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + false + "'", obj2, false);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 0 + "'", obj6, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 0 + "'", obj7, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test356");
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
        java.lang.Object obj11 = stackTestDriver7.peek();
        java.lang.Object obj12 = stackTestDriver0.push((java.lang.Object) stackTestDriver7);
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = stackTestDriver0.peek();
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
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + false + "'", obj11, false);
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test357");
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
        java.lang.Object obj18 = stackTestDriver0.peek();
        stackTestDriver0.clear();
        int int20 = stackTestDriver0.size();
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
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals(obj18.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj18), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj18), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test358");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 0);
        stackTestDriver0.clear();
        int int4 = stackTestDriver0.size();
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) ' ');
        java.lang.Class<?> wildcardClass7 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 0 + "'", obj2, (byte) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + ' ' + "'", obj6, ' ');
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test359");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) false);
        java.lang.Object obj3 = stackTestDriver0.peek();
        java.lang.Object obj4 = stackTestDriver0.peek();
        java.lang.Object obj5 = stackTestDriver0.pop();
        int int6 = stackTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + false + "'", obj2, false);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + false + "'", obj4, false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + false + "'", obj5, false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test360");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        boolean boolean5 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        java.lang.Object obj7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = stackTestDriver0.push(obj7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test361");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test362");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver1 = new experiment.util.StackTestDriver();
        java.lang.Object obj3 = stackTestDriver1.push((java.lang.Object) (byte) 0);
        java.lang.Object obj4 = stackTestDriver0.push(obj3);
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) 1L);
        int int7 = stackTestDriver0.size();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 0 + "'", obj3, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 0 + "'", obj4, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1L + "'", obj6, 1L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test363");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) false);
        java.lang.Object obj3 = stackTestDriver0.pop();
        int int4 = stackTestDriver0.size();
        int int5 = stackTestDriver0.size();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + false + "'", obj2, false);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test364");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        boolean boolean5 = stackTestDriver0.isEmpty();
        boolean boolean6 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        int int8 = stackTestDriver0.size();
        java.lang.Class<?> wildcardClass9 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test365");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) false);
        java.lang.Object obj3 = stackTestDriver0.peek();
        stackTestDriver0.clear();
        int int5 = stackTestDriver0.size();
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) 0);
        int int8 = stackTestDriver0.size();
        stackTestDriver0.clear();
        int int10 = stackTestDriver0.size();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + false + "'", obj2, false);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0 + "'", obj7, 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test366");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) false);
        java.lang.Object obj3 = stackTestDriver0.peek();
        boolean boolean4 = stackTestDriver0.isEmpty();
        java.lang.Object obj5 = stackTestDriver0.peek();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + false + "'", obj2, false);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + false + "'", obj5, false);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test367");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 0);
        stackTestDriver0.clear();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (-1.0d));
        int int6 = stackTestDriver0.size();
        int int7 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        boolean boolean9 = stackTestDriver8.isEmpty();
        stackTestDriver8.clear();
        stackTestDriver8.clear();
        stackTestDriver8.clear();
        boolean boolean13 = stackTestDriver8.isEmpty();
        java.lang.Object obj15 = stackTestDriver8.push((java.lang.Object) '#');
        int int16 = stackTestDriver8.size();
        java.lang.Object obj17 = stackTestDriver0.push((java.lang.Object) stackTestDriver8);
        int int18 = stackTestDriver0.size();
        int int19 = stackTestDriver0.size();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 0 + "'", obj2, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + '#' + "'", obj15, '#');
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test368");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver1 = new experiment.util.StackTestDriver();
        java.lang.Object obj3 = stackTestDriver1.push((java.lang.Object) (byte) 0);
        java.lang.Object obj4 = stackTestDriver0.push(obj3);
        java.lang.Object obj5 = stackTestDriver0.peek();
        boolean boolean6 = stackTestDriver0.isEmpty();
        java.lang.Object obj7 = stackTestDriver0.pop();
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
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 0 + "'", obj3, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 0 + "'", obj4, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) 0 + "'", obj5, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 0 + "'", obj7, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test369");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) false);
        java.lang.Object obj3 = stackTestDriver0.peek();
        stackTestDriver0.clear();
        int int5 = stackTestDriver0.size();
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) 0);
        int int8 = stackTestDriver0.size();
        boolean boolean9 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + false + "'", obj2, false);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0 + "'", obj7, 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test370");
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
        int int28 = stackTestDriver0.size();
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test371");
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
        java.lang.Object obj14 = stackTestDriver4.peek();
        java.lang.Object obj15 = stackTestDriver4.peek();
        stackTestDriver4.clear();
        stackTestDriver4.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = stackTestDriver4.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 0 + "'", obj7, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) 0 + "'", obj8, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 1L + "'", obj10, 1L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 1L + "'", obj14, 1L);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 1L + "'", obj15, 1L);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test372");
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
        java.lang.Object obj15 = stackTestDriver0.peek();
        int int16 = stackTestDriver0.size();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + false + "'", obj2, false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + false + "'", obj6, false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + false + "'", obj7, false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) 0 + "'", obj10, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 0 + "'", obj11, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) 0 + "'", obj12, (byte) 0);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test373");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        boolean boolean5 = stackTestDriver0.isEmpty();
        int int6 = stackTestDriver0.size();
        boolean boolean7 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver9 = new experiment.util.StackTestDriver();
        java.lang.Object obj11 = stackTestDriver9.push((java.lang.Object) (byte) 0);
        java.lang.Object obj12 = stackTestDriver8.push(obj11);
        java.lang.Object obj14 = stackTestDriver8.push((java.lang.Object) 1L);
        int int15 = stackTestDriver8.size();
        boolean boolean16 = stackTestDriver8.isEmpty();
        java.lang.Object obj17 = stackTestDriver8.peek();
        java.lang.Object obj18 = stackTestDriver8.peek();
        java.lang.Object obj19 = stackTestDriver8.peek();
        int int20 = stackTestDriver8.size();
        java.lang.Object obj21 = stackTestDriver0.push((java.lang.Object) int20);
        experiment.util.StackTestDriver stackTestDriver22 = new experiment.util.StackTestDriver();
        int int23 = stackTestDriver22.size();
        boolean boolean24 = stackTestDriver22.isEmpty();
        stackTestDriver22.clear();
        stackTestDriver22.clear();
        int int27 = stackTestDriver22.size();
        stackTestDriver22.clear();
        java.lang.Object obj29 = stackTestDriver0.push((java.lang.Object) stackTestDriver22);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 0 + "'", obj11, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) 0 + "'", obj12, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 1L + "'", obj14, 1L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 1L + "'", obj17, 1L);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 1L + "'", obj18, 1L);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 1L + "'", obj19, 1L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 2 + "'", obj21, 2);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(obj29);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test374");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        boolean boolean4 = stackTestDriver0.isEmpty();
        int int5 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        int int7 = stackTestDriver6.size();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver6);
        boolean boolean9 = stackTestDriver0.isEmpty();
        java.lang.Object obj10 = stackTestDriver0.peek();
        java.lang.Object obj11 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver12 = new experiment.util.StackTestDriver();
        int int13 = stackTestDriver12.size();
        boolean boolean14 = stackTestDriver12.isEmpty();
        stackTestDriver12.clear();
        boolean boolean16 = stackTestDriver12.isEmpty();
        stackTestDriver12.clear();
        java.lang.Object obj18 = stackTestDriver0.push((java.lang.Object) stackTestDriver12);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(obj18);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test375");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 0);
        stackTestDriver0.clear();
        int int4 = stackTestDriver0.size();
        int int5 = stackTestDriver0.size();
        stackTestDriver0.clear();
        int int7 = stackTestDriver0.size();
        boolean boolean8 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver9 = new experiment.util.StackTestDriver();
        java.lang.Object obj11 = stackTestDriver9.push((java.lang.Object) false);
        stackTestDriver9.clear();
        experiment.util.StackTestDriver stackTestDriver13 = new experiment.util.StackTestDriver();
        java.lang.Object obj15 = stackTestDriver13.push((java.lang.Object) false);
        java.lang.Object obj16 = stackTestDriver13.peek();
        experiment.util.StackTestDriver stackTestDriver17 = new experiment.util.StackTestDriver();
        java.lang.Object obj19 = stackTestDriver17.push((java.lang.Object) (byte) 0);
        java.lang.Object obj20 = stackTestDriver13.push((java.lang.Object) (byte) 0);
        java.lang.Object obj21 = stackTestDriver13.peek();
        java.lang.Object obj22 = stackTestDriver9.push((java.lang.Object) stackTestDriver13);
        java.lang.Object obj23 = stackTestDriver9.peek();
        java.lang.Object obj24 = stackTestDriver0.push(obj23);
        java.lang.Object obj25 = stackTestDriver0.pop();
        java.lang.Class<?> wildcardClass26 = obj25.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 0 + "'", obj2, (byte) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + false + "'", obj11, false);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + false + "'", obj15, false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + false + "'", obj16, false);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (byte) 0 + "'", obj19, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (byte) 0 + "'", obj20, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (byte) 0 + "'", obj21, (byte) 0);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test376");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) false);
        java.lang.Object obj3 = stackTestDriver0.peek();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        java.lang.Object obj6 = stackTestDriver4.push((java.lang.Object) (byte) 0);
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) (byte) 0);
        boolean boolean8 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        int int10 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver11 = new experiment.util.StackTestDriver();
        java.lang.Object obj13 = stackTestDriver11.push((java.lang.Object) false);
        java.lang.Object obj14 = stackTestDriver11.pop();
        int int15 = stackTestDriver11.size();
        experiment.util.StackTestDriver stackTestDriver16 = new experiment.util.StackTestDriver();
        int int17 = stackTestDriver16.size();
        boolean boolean18 = stackTestDriver16.isEmpty();
        stackTestDriver16.clear();
        stackTestDriver16.clear();
        boolean boolean21 = stackTestDriver16.isEmpty();
        stackTestDriver16.clear();
        int int23 = stackTestDriver16.size();
        java.lang.Object obj24 = stackTestDriver11.push((java.lang.Object) stackTestDriver16);
        java.lang.Object obj25 = stackTestDriver0.push(obj24);
        experiment.util.StackTestDriver stackTestDriver26 = new experiment.util.StackTestDriver();
        java.lang.Object obj28 = stackTestDriver26.push((java.lang.Object) false);
        java.lang.Object obj29 = stackTestDriver26.pop();
        int int30 = stackTestDriver26.size();
        experiment.util.StackTestDriver stackTestDriver31 = new experiment.util.StackTestDriver();
        int int32 = stackTestDriver31.size();
        boolean boolean33 = stackTestDriver31.isEmpty();
        stackTestDriver31.clear();
        stackTestDriver31.clear();
        boolean boolean36 = stackTestDriver31.isEmpty();
        stackTestDriver31.clear();
        int int38 = stackTestDriver31.size();
        java.lang.Object obj39 = stackTestDriver26.push((java.lang.Object) stackTestDriver31);
        experiment.util.StackTestDriver stackTestDriver40 = new experiment.util.StackTestDriver();
        int int41 = stackTestDriver40.size();
        java.lang.Object obj42 = stackTestDriver31.push((java.lang.Object) int41);
        boolean boolean43 = stackTestDriver31.isEmpty();
        java.lang.Object obj44 = stackTestDriver31.pop();
        java.lang.Object obj45 = stackTestDriver0.push((java.lang.Object) stackTestDriver31);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj46 = stackTestDriver31.pop();
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
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + false + "'", obj13, false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + false + "'", obj14, false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + false + "'", obj28, false);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + false + "'", obj29, false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + 0 + "'", obj42, 0);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + 0 + "'", obj44, 0);
        org.junit.Assert.assertNotNull(obj45);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test377");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 0);
        stackTestDriver0.clear();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (-1.0d));
        boolean boolean6 = stackTestDriver0.isEmpty();
        java.lang.Object obj7 = stackTestDriver0.pop();
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 0 + "'", obj2, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test378");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) false);
        java.lang.Object obj3 = stackTestDriver0.peek();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        java.lang.Object obj6 = stackTestDriver4.push((java.lang.Object) (byte) 0);
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) (byte) 0);
        stackTestDriver0.clear();
        boolean boolean9 = stackTestDriver0.isEmpty();
        int int10 = stackTestDriver0.size();
        int int11 = stackTestDriver0.size();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + false + "'", obj2, false);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 0 + "'", obj6, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 0 + "'", obj7, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test379");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        boolean boolean5 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        int int7 = stackTestDriver0.size();
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test380");
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
        java.lang.Class<?> wildcardClass12 = stackTestDriver5.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 0 + "'", obj7, (byte) 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test381");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) "");
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        boolean boolean6 = stackTestDriver5.isEmpty();
        stackTestDriver5.clear();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        experiment.util.StackTestDriver stackTestDriver9 = new experiment.util.StackTestDriver();
        java.lang.Object obj11 = stackTestDriver9.push((java.lang.Object) (byte) 0);
        java.lang.Object obj12 = stackTestDriver9.peek();
        java.lang.Class<?> wildcardClass13 = obj12.getClass();
        java.lang.Object obj14 = stackTestDriver5.push(obj12);
        java.lang.Object obj15 = stackTestDriver5.peek();
        experiment.util.StackTestDriver stackTestDriver16 = new experiment.util.StackTestDriver();
        boolean boolean17 = stackTestDriver16.isEmpty();
        stackTestDriver16.clear();
        boolean boolean19 = stackTestDriver16.isEmpty();
        experiment.util.StackTestDriver stackTestDriver20 = new experiment.util.StackTestDriver();
        java.lang.Object obj22 = stackTestDriver20.push((java.lang.Object) false);
        java.lang.Object obj23 = stackTestDriver20.peek();
        experiment.util.StackTestDriver stackTestDriver24 = new experiment.util.StackTestDriver();
        java.lang.Object obj26 = stackTestDriver24.push((java.lang.Object) (byte) 0);
        java.lang.Object obj27 = stackTestDriver20.push((java.lang.Object) (byte) 0);
        boolean boolean28 = stackTestDriver20.isEmpty();
        stackTestDriver20.clear();
        int int30 = stackTestDriver20.size();
        experiment.util.StackTestDriver stackTestDriver31 = new experiment.util.StackTestDriver();
        java.lang.Object obj33 = stackTestDriver31.push((java.lang.Object) false);
        java.lang.Object obj34 = stackTestDriver31.pop();
        int int35 = stackTestDriver31.size();
        experiment.util.StackTestDriver stackTestDriver36 = new experiment.util.StackTestDriver();
        int int37 = stackTestDriver36.size();
        boolean boolean38 = stackTestDriver36.isEmpty();
        stackTestDriver36.clear();
        stackTestDriver36.clear();
        boolean boolean41 = stackTestDriver36.isEmpty();
        stackTestDriver36.clear();
        int int43 = stackTestDriver36.size();
        java.lang.Object obj44 = stackTestDriver31.push((java.lang.Object) stackTestDriver36);
        java.lang.Object obj45 = stackTestDriver20.push(obj44);
        java.lang.Object obj46 = stackTestDriver16.push((java.lang.Object) stackTestDriver20);
        java.lang.Object obj47 = stackTestDriver5.push((java.lang.Object) stackTestDriver16);
        boolean boolean48 = stackTestDriver16.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + "" + "'", obj4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 0 + "'", obj11, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) 0 + "'", obj12, (byte) 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (byte) 0 + "'", obj14, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (byte) 0 + "'", obj15, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + false + "'", obj22, false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + false + "'", obj23, false);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + (byte) 0 + "'", obj26, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + (byte) 0 + "'", obj27, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + false + "'", obj33, false);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + false + "'", obj34, false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test382");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) false);
        java.lang.Object obj3 = stackTestDriver0.peek();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        java.lang.Object obj6 = stackTestDriver4.push((java.lang.Object) (byte) 0);
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) (byte) 0);
        boolean boolean8 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        int int10 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver11 = new experiment.util.StackTestDriver();
        java.lang.Object obj13 = stackTestDriver11.push((java.lang.Object) false);
        java.lang.Object obj14 = stackTestDriver11.pop();
        int int15 = stackTestDriver11.size();
        experiment.util.StackTestDriver stackTestDriver16 = new experiment.util.StackTestDriver();
        int int17 = stackTestDriver16.size();
        boolean boolean18 = stackTestDriver16.isEmpty();
        stackTestDriver16.clear();
        stackTestDriver16.clear();
        boolean boolean21 = stackTestDriver16.isEmpty();
        stackTestDriver16.clear();
        int int23 = stackTestDriver16.size();
        java.lang.Object obj24 = stackTestDriver11.push((java.lang.Object) stackTestDriver16);
        java.lang.Object obj25 = stackTestDriver0.push(obj24);
        java.lang.Object obj26 = stackTestDriver0.peek();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + false + "'", obj2, false);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 0 + "'", obj6, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 0 + "'", obj7, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + false + "'", obj13, false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + false + "'", obj14, false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNotNull(obj26);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test383");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 0);
        stackTestDriver0.clear();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (-1.0d));
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        java.lang.Object obj8 = stackTestDriver6.push((java.lang.Object) false);
        java.lang.Object obj9 = stackTestDriver6.peek();
        java.lang.Class<?> wildcardClass10 = stackTestDriver6.getClass();
        java.lang.Object obj11 = stackTestDriver0.push((java.lang.Object) stackTestDriver6);
        int int12 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean14 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver16 = new experiment.util.StackTestDriver();
        java.lang.Object obj18 = stackTestDriver16.push((java.lang.Object) (byte) 0);
        java.lang.Object obj19 = stackTestDriver15.push(obj18);
        java.lang.Object obj20 = stackTestDriver15.peek();
        boolean boolean21 = stackTestDriver15.isEmpty();
        java.lang.Object obj22 = stackTestDriver15.pop();
        java.lang.Class<?> wildcardClass23 = obj22.getClass();
        java.lang.Object obj24 = stackTestDriver0.push(obj22);
        java.lang.Class<?> wildcardClass25 = obj24.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 0 + "'", obj2, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + false + "'", obj8, false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + false + "'", obj9, false);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (byte) 0 + "'", obj18, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (byte) 0 + "'", obj19, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (byte) 0 + "'", obj20, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (byte) 0 + "'", obj22, (byte) 0);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (byte) 0 + "'", obj24, (byte) 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test384");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        int int4 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) false);
        java.lang.Object obj8 = stackTestDriver5.peek();
        stackTestDriver5.clear();
        int int10 = stackTestDriver5.size();
        java.lang.Object obj12 = stackTestDriver5.push((java.lang.Object) 0);
        int int13 = stackTestDriver5.size();
        boolean boolean14 = stackTestDriver5.isEmpty();
        stackTestDriver5.clear();
        java.lang.Object obj16 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        java.lang.Object obj17 = stackTestDriver0.pop();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + false + "'", obj7, false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + false + "'", obj8, false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 0 + "'", obj12, 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(obj17);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test385");
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
        boolean boolean19 = stackTestDriver0.isEmpty();
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test386");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver1 = new experiment.util.StackTestDriver();
        java.lang.Object obj3 = stackTestDriver1.push((java.lang.Object) (byte) 0);
        java.lang.Object obj4 = stackTestDriver0.push(obj3);
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) 1L);
        java.lang.Object obj7 = stackTestDriver0.peek();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 0 + "'", obj3, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 0 + "'", obj4, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1L + "'", obj6, 1L);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1L + "'", obj7, 1L);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test387");
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
        java.lang.Object obj28 = stackTestDriver0.peek();
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
        org.junit.Assert.assertNotNull(obj28);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test388");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver1 = new experiment.util.StackTestDriver();
        java.lang.Object obj3 = stackTestDriver1.push((java.lang.Object) (byte) 0);
        java.lang.Object obj4 = stackTestDriver0.push(obj3);
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) 1L);
        int int7 = stackTestDriver0.size();
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 0 + "'", obj3, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 0 + "'", obj4, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1L + "'", obj6, 1L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test389");
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
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test390");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver1 = new experiment.util.StackTestDriver();
        java.lang.Object obj3 = stackTestDriver1.push((java.lang.Object) (byte) 0);
        java.lang.Object obj4 = stackTestDriver0.push(obj3);
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) 1L);
        int int7 = stackTestDriver0.size();
        int int8 = stackTestDriver0.size();
        int int9 = stackTestDriver0.size();
        stackTestDriver0.clear();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 0 + "'", obj3, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 0 + "'", obj4, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1L + "'", obj6, 1L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test391");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver1 = new experiment.util.StackTestDriver();
        java.lang.Object obj3 = stackTestDriver1.push((java.lang.Object) (byte) 0);
        java.lang.Object obj4 = stackTestDriver0.push(obj3);
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean7 = stackTestDriver0.isEmpty();
        java.lang.Object obj8 = stackTestDriver0.peek();
        stackTestDriver0.clear();
        int int10 = stackTestDriver0.size();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 0 + "'", obj3, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 0 + "'", obj4, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 1 + "'", obj6, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) 1 + "'", obj8, (byte) 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test392");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver1 = new experiment.util.StackTestDriver();
        java.lang.Object obj3 = stackTestDriver1.push((java.lang.Object) (byte) 0);
        java.lang.Object obj4 = stackTestDriver0.push(obj3);
        int int5 = stackTestDriver0.size();
        java.lang.Object obj6 = stackTestDriver0.peek();
        boolean boolean7 = stackTestDriver0.isEmpty();
        java.lang.Class<?> wildcardClass8 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 0 + "'", obj3, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 0 + "'", obj4, (byte) 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 0 + "'", obj6, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test393");
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
        int int12 = stackTestDriver0.size();
        boolean boolean13 = stackTestDriver0.isEmpty();
        java.lang.Object obj14 = stackTestDriver0.peek();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 0 + "'", obj3, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 0 + "'", obj4, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1L + "'", obj6, 1L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 1L + "'", obj9, 1L);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 1L + "'", obj10, 1L);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 1L + "'", obj11, 1L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 1L + "'", obj14, 1L);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test394");
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
        boolean boolean11 = stackTestDriver5.isEmpty();
        int int12 = stackTestDriver5.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = stackTestDriver5.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 0 + "'", obj7, (byte) 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test395");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver1 = new experiment.util.StackTestDriver();
        java.lang.Object obj3 = stackTestDriver1.push((java.lang.Object) (byte) 0);
        java.lang.Object obj4 = stackTestDriver0.push(obj3);
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) 1L);
        int int7 = stackTestDriver0.size();
        boolean boolean8 = stackTestDriver0.isEmpty();
        java.lang.Object obj9 = stackTestDriver0.peek();
        java.lang.Object obj10 = stackTestDriver0.peek();
        stackTestDriver0.clear();
        boolean boolean12 = stackTestDriver0.isEmpty();
        boolean boolean13 = stackTestDriver0.isEmpty();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 0 + "'", obj3, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 0 + "'", obj4, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1L + "'", obj6, 1L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 1L + "'", obj9, 1L);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 1L + "'", obj10, 1L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test396");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        int int4 = stackTestDriver0.size();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        boolean boolean7 = stackTestDriver6.isEmpty();
        java.lang.Class<?> wildcardClass8 = stackTestDriver6.getClass();
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) wildcardClass8);
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        java.lang.Object obj12 = stackTestDriver10.push((java.lang.Object) (byte) 0);
        stackTestDriver10.clear();
        int int14 = stackTestDriver10.size();
        boolean boolean15 = stackTestDriver10.isEmpty();
        java.lang.Class<?> wildcardClass16 = stackTestDriver10.getClass();
        java.lang.Object obj17 = stackTestDriver0.push((java.lang.Object) wildcardClass16);
        int int18 = stackTestDriver0.size();
        java.lang.Object obj19 = stackTestDriver0.peek();
        java.lang.Class<?> wildcardClass20 = obj19.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) 0 + "'", obj12, (byte) 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
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
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test397");
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
        int int13 = stackTestDriver0.size();
        java.lang.Object obj14 = stackTestDriver0.peek();
        boolean boolean15 = stackTestDriver0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + false + "'", obj9, false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test398");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        boolean boolean5 = stackTestDriver0.isEmpty();
        boolean boolean6 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        int int8 = stackTestDriver0.size();
        int int9 = stackTestDriver0.size();
        boolean boolean10 = stackTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test399");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver1 = new experiment.util.StackTestDriver();
        java.lang.Object obj3 = stackTestDriver1.push((java.lang.Object) (byte) 0);
        java.lang.Object obj4 = stackTestDriver0.push(obj3);
        int int5 = stackTestDriver0.size();
        boolean boolean6 = stackTestDriver0.isEmpty();
        java.lang.Object obj7 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver9 = new experiment.util.StackTestDriver();
        java.lang.Object obj11 = stackTestDriver9.push((java.lang.Object) (byte) 0);
        java.lang.Object obj12 = stackTestDriver8.push(obj11);
        java.lang.Object obj14 = stackTestDriver8.push((java.lang.Object) 1L);
        int int15 = stackTestDriver8.size();
        stackTestDriver8.clear();
        int int17 = stackTestDriver8.size();
        java.lang.Object obj18 = stackTestDriver0.push((java.lang.Object) stackTestDriver8);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 0 + "'", obj3, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 0 + "'", obj4, (byte) 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 0 + "'", obj7, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 0 + "'", obj11, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) 0 + "'", obj12, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 1L + "'", obj14, 1L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(obj18);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test400");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) false);
        java.lang.Object obj3 = stackTestDriver0.peek();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        java.lang.Object obj6 = stackTestDriver4.push((java.lang.Object) (byte) 0);
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) (byte) 0);
        boolean boolean8 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        int int10 = stackTestDriver0.size();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver12 = new experiment.util.StackTestDriver();
        boolean boolean13 = stackTestDriver12.isEmpty();
        java.lang.Object obj14 = stackTestDriver0.push((java.lang.Object) stackTestDriver12);
        stackTestDriver12.clear();
        java.lang.Class<?> wildcardClass16 = stackTestDriver12.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + false + "'", obj2, false);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 0 + "'", obj6, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 0 + "'", obj7, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test401");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        int int5 = stackTestDriver0.size();
        boolean boolean6 = stackTestDriver0.isEmpty();
        boolean boolean7 = stackTestDriver0.isEmpty();
        boolean boolean8 = stackTestDriver0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test402");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver1 = new experiment.util.StackTestDriver();
        java.lang.Object obj3 = stackTestDriver1.push((java.lang.Object) (byte) 0);
        java.lang.Object obj4 = stackTestDriver0.push(obj3);
        java.lang.Object obj5 = stackTestDriver0.peek();
        boolean boolean6 = stackTestDriver0.isEmpty();
        java.lang.Object obj7 = stackTestDriver0.pop();
        boolean boolean8 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 0 + "'", obj3, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 0 + "'", obj4, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) 0 + "'", obj5, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 0 + "'", obj7, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test403");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) false);
        java.lang.Object obj3 = stackTestDriver0.peek();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        java.lang.Object obj6 = stackTestDriver4.push((java.lang.Object) (byte) 0);
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) (byte) 0);
        stackTestDriver0.clear();
        boolean boolean9 = stackTestDriver0.isEmpty();
        boolean boolean10 = stackTestDriver0.isEmpty();
        java.lang.Class<?> wildcardClass11 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + false + "'", obj2, false);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 0 + "'", obj6, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 0 + "'", obj7, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test404");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 0);
        stackTestDriver0.clear();
        int int4 = stackTestDriver0.size();
        int int5 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        java.lang.Object obj8 = stackTestDriver6.push((java.lang.Object) false);
        stackTestDriver6.clear();
        java.lang.Object obj10 = stackTestDriver0.push((java.lang.Object) stackTestDriver6);
        experiment.util.StackTestDriver stackTestDriver11 = new experiment.util.StackTestDriver();
        int int12 = stackTestDriver11.size();
        boolean boolean13 = stackTestDriver11.isEmpty();
        stackTestDriver11.clear();
        int int15 = stackTestDriver11.size();
        stackTestDriver11.clear();
        experiment.util.StackTestDriver stackTestDriver17 = new experiment.util.StackTestDriver();
        boolean boolean18 = stackTestDriver17.isEmpty();
        java.lang.Class<?> wildcardClass19 = stackTestDriver17.getClass();
        java.lang.Object obj20 = stackTestDriver11.push((java.lang.Object) wildcardClass19);
        experiment.util.StackTestDriver stackTestDriver21 = new experiment.util.StackTestDriver();
        java.lang.Object obj23 = stackTestDriver21.push((java.lang.Object) (byte) 0);
        stackTestDriver21.clear();
        int int25 = stackTestDriver21.size();
        boolean boolean26 = stackTestDriver21.isEmpty();
        java.lang.Class<?> wildcardClass27 = stackTestDriver21.getClass();
        java.lang.Object obj28 = stackTestDriver11.push((java.lang.Object) wildcardClass27);
        java.lang.Object obj29 = stackTestDriver6.push((java.lang.Object) stackTestDriver11);
        int int30 = stackTestDriver6.size();
        experiment.util.StackTestDriver stackTestDriver31 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver32 = new experiment.util.StackTestDriver();
        java.lang.Object obj34 = stackTestDriver32.push((java.lang.Object) (byte) 0);
        java.lang.Object obj35 = stackTestDriver31.push(obj34);
        java.lang.Object obj36 = stackTestDriver31.peek();
        experiment.util.StackTestDriver stackTestDriver37 = new experiment.util.StackTestDriver();
        java.lang.Object obj39 = stackTestDriver37.push((java.lang.Object) false);
        java.lang.Object obj40 = stackTestDriver37.pop();
        int int41 = stackTestDriver37.size();
        java.lang.Object obj42 = stackTestDriver31.push((java.lang.Object) stackTestDriver37);
        stackTestDriver37.clear();
        experiment.util.StackTestDriver stackTestDriver44 = new experiment.util.StackTestDriver();
        java.lang.Object obj46 = stackTestDriver44.push((java.lang.Object) (byte) 0);
        stackTestDriver44.clear();
        java.lang.Object obj49 = stackTestDriver44.push((java.lang.Object) (-1.0d));
        boolean boolean50 = stackTestDriver44.isEmpty();
        experiment.util.StackTestDriver stackTestDriver51 = new experiment.util.StackTestDriver();
        java.lang.Object obj53 = stackTestDriver51.push((java.lang.Object) false);
        java.lang.Object obj54 = stackTestDriver51.peek();
        experiment.util.StackTestDriver stackTestDriver55 = new experiment.util.StackTestDriver();
        java.lang.Object obj57 = stackTestDriver55.push((java.lang.Object) (byte) 0);
        java.lang.Object obj58 = stackTestDriver51.push((java.lang.Object) (byte) 0);
        java.lang.Object obj59 = stackTestDriver51.peek();
        java.lang.Class<?> wildcardClass60 = stackTestDriver51.getClass();
        java.lang.Object obj61 = stackTestDriver44.push((java.lang.Object) wildcardClass60);
        stackTestDriver44.clear();
        experiment.util.StackTestDriver stackTestDriver63 = new experiment.util.StackTestDriver();
        java.lang.Object obj65 = stackTestDriver63.push((java.lang.Object) false);
        java.lang.Object obj66 = stackTestDriver63.peek();
        experiment.util.StackTestDriver stackTestDriver67 = new experiment.util.StackTestDriver();
        java.lang.Object obj69 = stackTestDriver67.push((java.lang.Object) (byte) 0);
        java.lang.Object obj70 = stackTestDriver63.push((java.lang.Object) (byte) 0);
        boolean boolean71 = stackTestDriver63.isEmpty();
        stackTestDriver63.clear();
        int int73 = stackTestDriver63.size();
        experiment.util.StackTestDriver stackTestDriver74 = new experiment.util.StackTestDriver();
        java.lang.Object obj76 = stackTestDriver74.push((java.lang.Object) false);
        java.lang.Object obj77 = stackTestDriver74.pop();
        int int78 = stackTestDriver74.size();
        experiment.util.StackTestDriver stackTestDriver79 = new experiment.util.StackTestDriver();
        int int80 = stackTestDriver79.size();
        boolean boolean81 = stackTestDriver79.isEmpty();
        stackTestDriver79.clear();
        stackTestDriver79.clear();
        boolean boolean84 = stackTestDriver79.isEmpty();
        stackTestDriver79.clear();
        int int86 = stackTestDriver79.size();
        java.lang.Object obj87 = stackTestDriver74.push((java.lang.Object) stackTestDriver79);
        java.lang.Object obj88 = stackTestDriver63.push(obj87);
        java.lang.Object obj89 = stackTestDriver63.pop();
        java.lang.Object obj90 = stackTestDriver44.push(obj89);
        java.lang.Object obj91 = stackTestDriver37.push((java.lang.Object) stackTestDriver44);
        java.lang.Object obj92 = stackTestDriver6.push((java.lang.Object) stackTestDriver44);
        boolean boolean93 = stackTestDriver6.isEmpty();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 0 + "'", obj2, (byte) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + false + "'", obj8, false);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (byte) 0 + "'", obj23, (byte) 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertEquals(obj28.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj28), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj28), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + (byte) 0 + "'", obj34, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + (byte) 0 + "'", obj35, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + (byte) 0 + "'", obj36, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + false + "'", obj39, false);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + false + "'", obj40, false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + (byte) 0 + "'", obj46, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + (-1.0d) + "'", obj49, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + obj53 + "' != '" + false + "'", obj53, false);
        org.junit.Assert.assertEquals("'" + obj54 + "' != '" + false + "'", obj54, false);
        org.junit.Assert.assertEquals("'" + obj57 + "' != '" + (byte) 0 + "'", obj57, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj58 + "' != '" + (byte) 0 + "'", obj58, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj59 + "' != '" + (byte) 0 + "'", obj59, (byte) 0);
        org.junit.Assert.assertNotNull(wildcardClass60);
        org.junit.Assert.assertNotNull(obj61);
        org.junit.Assert.assertEquals(obj61.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj61), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj61), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals("'" + obj65 + "' != '" + false + "'", obj65, false);
        org.junit.Assert.assertEquals("'" + obj66 + "' != '" + false + "'", obj66, false);
        org.junit.Assert.assertEquals("'" + obj69 + "' != '" + (byte) 0 + "'", obj69, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj70 + "' != '" + (byte) 0 + "'", obj70, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertEquals("'" + obj76 + "' != '" + false + "'", obj76, false);
        org.junit.Assert.assertEquals("'" + obj77 + "' != '" + false + "'", obj77, false);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 0 + "'", int86 == 0);
        org.junit.Assert.assertNotNull(obj87);
        org.junit.Assert.assertNotNull(obj88);
        org.junit.Assert.assertNotNull(obj89);
        org.junit.Assert.assertNotNull(obj90);
        org.junit.Assert.assertNotNull(obj91);
        org.junit.Assert.assertNotNull(obj92);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test405");
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
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver19 = new experiment.util.StackTestDriver();
        java.lang.Object obj21 = stackTestDriver19.push((java.lang.Object) false);
        java.lang.Object obj22 = stackTestDriver19.peek();
        experiment.util.StackTestDriver stackTestDriver23 = new experiment.util.StackTestDriver();
        java.lang.Object obj25 = stackTestDriver23.push((java.lang.Object) (byte) 0);
        java.lang.Object obj26 = stackTestDriver19.push((java.lang.Object) (byte) 0);
        boolean boolean27 = stackTestDriver19.isEmpty();
        stackTestDriver19.clear();
        int int29 = stackTestDriver19.size();
        experiment.util.StackTestDriver stackTestDriver30 = new experiment.util.StackTestDriver();
        java.lang.Object obj32 = stackTestDriver30.push((java.lang.Object) false);
        java.lang.Object obj33 = stackTestDriver30.pop();
        int int34 = stackTestDriver30.size();
        experiment.util.StackTestDriver stackTestDriver35 = new experiment.util.StackTestDriver();
        int int36 = stackTestDriver35.size();
        boolean boolean37 = stackTestDriver35.isEmpty();
        stackTestDriver35.clear();
        stackTestDriver35.clear();
        boolean boolean40 = stackTestDriver35.isEmpty();
        stackTestDriver35.clear();
        int int42 = stackTestDriver35.size();
        java.lang.Object obj43 = stackTestDriver30.push((java.lang.Object) stackTestDriver35);
        java.lang.Object obj44 = stackTestDriver19.push(obj43);
        java.lang.Object obj45 = stackTestDriver19.pop();
        java.lang.Object obj46 = stackTestDriver0.push(obj45);
        java.lang.Class<?> wildcardClass47 = stackTestDriver0.getClass();
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
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + false + "'", obj21, false);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + false + "'", obj22, false);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (byte) 0 + "'", obj25, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + (byte) 0 + "'", obj26, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + false + "'", obj32, false);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + false + "'", obj33, false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(obj43);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test406");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        int int4 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) false);
        java.lang.Object obj8 = stackTestDriver5.peek();
        stackTestDriver5.clear();
        int int10 = stackTestDriver5.size();
        java.lang.Object obj12 = stackTestDriver5.push((java.lang.Object) 0);
        int int13 = stackTestDriver5.size();
        boolean boolean14 = stackTestDriver5.isEmpty();
        stackTestDriver5.clear();
        java.lang.Object obj16 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        java.lang.Class<?> wildcardClass17 = stackTestDriver5.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + false + "'", obj7, false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + false + "'", obj8, false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 0 + "'", obj12, 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test407");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        boolean boolean4 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        int int6 = stackTestDriver0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test408");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver1 = new experiment.util.StackTestDriver();
        java.lang.Object obj3 = stackTestDriver1.push((java.lang.Object) (byte) 0);
        java.lang.Object obj4 = stackTestDriver0.push(obj3);
        int int5 = stackTestDriver0.size();
        java.lang.Object obj6 = stackTestDriver0.pop();
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 0 + "'", obj3, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 0 + "'", obj4, (byte) 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 0 + "'", obj6, (byte) 0);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test409");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 0);
        stackTestDriver0.clear();
        int int4 = stackTestDriver0.size();
        int int5 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        java.lang.Object obj8 = stackTestDriver6.push((java.lang.Object) false);
        stackTestDriver6.clear();
        java.lang.Object obj10 = stackTestDriver0.push((java.lang.Object) stackTestDriver6);
        experiment.util.StackTestDriver stackTestDriver11 = new experiment.util.StackTestDriver();
        int int12 = stackTestDriver11.size();
        boolean boolean13 = stackTestDriver11.isEmpty();
        stackTestDriver11.clear();
        int int15 = stackTestDriver11.size();
        stackTestDriver11.clear();
        experiment.util.StackTestDriver stackTestDriver17 = new experiment.util.StackTestDriver();
        boolean boolean18 = stackTestDriver17.isEmpty();
        java.lang.Class<?> wildcardClass19 = stackTestDriver17.getClass();
        java.lang.Object obj20 = stackTestDriver11.push((java.lang.Object) wildcardClass19);
        experiment.util.StackTestDriver stackTestDriver21 = new experiment.util.StackTestDriver();
        java.lang.Object obj23 = stackTestDriver21.push((java.lang.Object) (byte) 0);
        stackTestDriver21.clear();
        int int25 = stackTestDriver21.size();
        boolean boolean26 = stackTestDriver21.isEmpty();
        java.lang.Class<?> wildcardClass27 = stackTestDriver21.getClass();
        java.lang.Object obj28 = stackTestDriver11.push((java.lang.Object) wildcardClass27);
        java.lang.Object obj29 = stackTestDriver6.push((java.lang.Object) stackTestDriver11);
        int int30 = stackTestDriver6.size();
        java.lang.Object obj31 = stackTestDriver6.pop();
        stackTestDriver6.clear();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 0 + "'", obj2, (byte) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + false + "'", obj8, false);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (byte) 0 + "'", obj23, (byte) 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertEquals(obj28.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj28), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj28), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(obj31);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test410");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        boolean boolean5 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        boolean boolean7 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test411");
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
        java.lang.Object obj19 = stackTestDriver0.push((java.lang.Object) 1.0d);
        java.lang.Object obj20 = stackTestDriver0.peek();
        experiment.util.StackTestDriver stackTestDriver21 = new experiment.util.StackTestDriver();
        int int22 = stackTestDriver21.size();
        boolean boolean23 = stackTestDriver21.isEmpty();
        stackTestDriver21.clear();
        int int25 = stackTestDriver21.size();
        stackTestDriver21.clear();
        experiment.util.StackTestDriver stackTestDriver27 = new experiment.util.StackTestDriver();
        boolean boolean28 = stackTestDriver27.isEmpty();
        java.lang.Class<?> wildcardClass29 = stackTestDriver27.getClass();
        java.lang.Object obj30 = stackTestDriver21.push((java.lang.Object) wildcardClass29);
        experiment.util.StackTestDriver stackTestDriver31 = new experiment.util.StackTestDriver();
        java.lang.Object obj33 = stackTestDriver31.push((java.lang.Object) (byte) 0);
        stackTestDriver31.clear();
        int int35 = stackTestDriver31.size();
        boolean boolean36 = stackTestDriver31.isEmpty();
        java.lang.Class<?> wildcardClass37 = stackTestDriver31.getClass();
        java.lang.Object obj38 = stackTestDriver21.push((java.lang.Object) wildcardClass37);
        int int39 = stackTestDriver21.size();
        java.lang.Object obj40 = stackTestDriver0.push((java.lang.Object) stackTestDriver21);
        experiment.util.StackTestDriver stackTestDriver41 = new experiment.util.StackTestDriver();
        java.lang.Object obj43 = stackTestDriver41.push((java.lang.Object) (byte) 0);
        stackTestDriver41.clear();
        int int45 = stackTestDriver41.size();
        java.lang.Object obj47 = stackTestDriver41.push((java.lang.Object) ' ');
        java.lang.Object obj48 = stackTestDriver41.peek();
        java.lang.Object obj49 = stackTestDriver21.push(obj48);
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
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 1.0d + "'", obj19, 1.0d);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 1.0d + "'", obj20, 1.0d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertEquals(obj30.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj30), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj30), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + (byte) 0 + "'", obj33, (byte) 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertEquals(obj38.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj38), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj38), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2 + "'", int39 == 2);
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + (byte) 0 + "'", obj43, (byte) 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + ' ' + "'", obj47, ' ');
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + ' ' + "'", obj48, ' ');
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + ' ' + "'", obj49, ' ');
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test412");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 0);
        stackTestDriver0.clear();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (-1.0d));
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        java.lang.Object obj8 = stackTestDriver6.push((java.lang.Object) false);
        java.lang.Object obj9 = stackTestDriver6.peek();
        java.lang.Class<?> wildcardClass10 = stackTestDriver6.getClass();
        java.lang.Object obj11 = stackTestDriver0.push((java.lang.Object) stackTestDriver6);
        java.lang.Object obj12 = stackTestDriver0.pop();
        java.lang.Object obj13 = stackTestDriver0.pop();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 0 + "'", obj2, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + false + "'", obj8, false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + false + "'", obj9, false);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (-1.0d) + "'", obj13, (-1.0d));
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test413");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) false);
        java.lang.Object obj3 = stackTestDriver0.peek();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        java.lang.Object obj6 = stackTestDriver4.push((java.lang.Object) (byte) 0);
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) (byte) 0);
        boolean boolean8 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        boolean boolean10 = stackTestDriver0.isEmpty();
        int int11 = stackTestDriver0.size();
        boolean boolean12 = stackTestDriver0.isEmpty();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + false + "'", obj2, false);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 0 + "'", obj6, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 0 + "'", obj7, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test414");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) "");
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        boolean boolean6 = stackTestDriver5.isEmpty();
        stackTestDriver5.clear();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        experiment.util.StackTestDriver stackTestDriver9 = new experiment.util.StackTestDriver();
        java.lang.Object obj11 = stackTestDriver9.push((java.lang.Object) (byte) 0);
        java.lang.Object obj12 = stackTestDriver9.peek();
        java.lang.Class<?> wildcardClass13 = obj12.getClass();
        java.lang.Object obj14 = stackTestDriver5.push(obj12);
        java.lang.Object obj15 = stackTestDriver5.peek();
        experiment.util.StackTestDriver stackTestDriver16 = new experiment.util.StackTestDriver();
        boolean boolean17 = stackTestDriver16.isEmpty();
        stackTestDriver16.clear();
        boolean boolean19 = stackTestDriver16.isEmpty();
        experiment.util.StackTestDriver stackTestDriver20 = new experiment.util.StackTestDriver();
        java.lang.Object obj22 = stackTestDriver20.push((java.lang.Object) false);
        java.lang.Object obj23 = stackTestDriver20.peek();
        experiment.util.StackTestDriver stackTestDriver24 = new experiment.util.StackTestDriver();
        java.lang.Object obj26 = stackTestDriver24.push((java.lang.Object) (byte) 0);
        java.lang.Object obj27 = stackTestDriver20.push((java.lang.Object) (byte) 0);
        boolean boolean28 = stackTestDriver20.isEmpty();
        stackTestDriver20.clear();
        int int30 = stackTestDriver20.size();
        experiment.util.StackTestDriver stackTestDriver31 = new experiment.util.StackTestDriver();
        java.lang.Object obj33 = stackTestDriver31.push((java.lang.Object) false);
        java.lang.Object obj34 = stackTestDriver31.pop();
        int int35 = stackTestDriver31.size();
        experiment.util.StackTestDriver stackTestDriver36 = new experiment.util.StackTestDriver();
        int int37 = stackTestDriver36.size();
        boolean boolean38 = stackTestDriver36.isEmpty();
        stackTestDriver36.clear();
        stackTestDriver36.clear();
        boolean boolean41 = stackTestDriver36.isEmpty();
        stackTestDriver36.clear();
        int int43 = stackTestDriver36.size();
        java.lang.Object obj44 = stackTestDriver31.push((java.lang.Object) stackTestDriver36);
        java.lang.Object obj45 = stackTestDriver20.push(obj44);
        java.lang.Object obj46 = stackTestDriver16.push((java.lang.Object) stackTestDriver20);
        java.lang.Object obj47 = stackTestDriver5.push((java.lang.Object) stackTestDriver16);
        java.lang.Object obj48 = stackTestDriver16.pop();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + "" + "'", obj4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 0 + "'", obj11, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) 0 + "'", obj12, (byte) 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (byte) 0 + "'", obj14, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (byte) 0 + "'", obj15, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + false + "'", obj22, false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + false + "'", obj23, false);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + (byte) 0 + "'", obj26, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + (byte) 0 + "'", obj27, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + false + "'", obj33, false);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + false + "'", obj34, false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertNotNull(obj48);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test415");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 0);
        stackTestDriver0.clear();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (-1.0d));
        int int6 = stackTestDriver0.size();
        int int7 = stackTestDriver0.size();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 0 + "'", obj2, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test416");
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
        java.lang.Object obj18 = stackTestDriver0.peek();
        java.lang.Class<?> wildcardClass19 = obj18.getClass();
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
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals(obj18.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj18), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj18), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test417");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 0);
        stackTestDriver0.clear();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (-1.0d));
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver7 = new experiment.util.StackTestDriver();
        java.lang.Object obj9 = stackTestDriver7.push((java.lang.Object) (byte) 0);
        java.lang.Object obj10 = stackTestDriver6.push(obj9);
        java.lang.Object obj11 = stackTestDriver0.push(obj9);
        experiment.util.StackTestDriver stackTestDriver12 = new experiment.util.StackTestDriver();
        int int13 = stackTestDriver12.size();
        boolean boolean14 = stackTestDriver12.isEmpty();
        stackTestDriver12.clear();
        int int16 = stackTestDriver12.size();
        stackTestDriver12.clear();
        experiment.util.StackTestDriver stackTestDriver18 = new experiment.util.StackTestDriver();
        boolean boolean19 = stackTestDriver18.isEmpty();
        java.lang.Class<?> wildcardClass20 = stackTestDriver18.getClass();
        java.lang.Object obj21 = stackTestDriver12.push((java.lang.Object) wildcardClass20);
        java.lang.Object obj22 = stackTestDriver0.push((java.lang.Object) stackTestDriver12);
        java.lang.Object obj23 = stackTestDriver0.peek();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 0 + "'", obj2, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) 0 + "'", obj9, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) 0 + "'", obj10, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 0 + "'", obj11, (byte) 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals(obj21.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj21), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj21), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(obj23);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test418");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) false);
        java.lang.Object obj3 = stackTestDriver0.peek();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        java.lang.Object obj6 = stackTestDriver4.push((java.lang.Object) (byte) 0);
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) (byte) 0);
        boolean boolean8 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        int int10 = stackTestDriver0.size();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver12 = new experiment.util.StackTestDriver();
        boolean boolean13 = stackTestDriver12.isEmpty();
        java.lang.Object obj14 = stackTestDriver0.push((java.lang.Object) stackTestDriver12);
        stackTestDriver12.clear();
        int int16 = stackTestDriver12.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = stackTestDriver12.pop();
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test419");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        int int4 = stackTestDriver0.size();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        boolean boolean7 = stackTestDriver6.isEmpty();
        java.lang.Class<?> wildcardClass8 = stackTestDriver6.getClass();
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) wildcardClass8);
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        java.lang.Object obj12 = stackTestDriver10.push((java.lang.Object) (byte) 0);
        stackTestDriver10.clear();
        int int14 = stackTestDriver10.size();
        boolean boolean15 = stackTestDriver10.isEmpty();
        java.lang.Class<?> wildcardClass16 = stackTestDriver10.getClass();
        java.lang.Object obj17 = stackTestDriver0.push((java.lang.Object) wildcardClass16);
        int int18 = stackTestDriver0.size();
        java.lang.Object obj19 = stackTestDriver0.peek();
        stackTestDriver0.clear();
        java.lang.Class<?> wildcardClass21 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) 0 + "'", obj12, (byte) 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test420");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) false);
        java.lang.Object obj3 = stackTestDriver0.peek();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + false + "'", obj2, false);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test421");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        int int3 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        java.lang.Object obj6 = stackTestDriver4.push((java.lang.Object) false);
        java.lang.Object obj7 = stackTestDriver4.peek();
        java.lang.Class<?> wildcardClass8 = stackTestDriver4.getClass();
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) wildcardClass8);
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        java.lang.Class<?> wildcardClass12 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + false + "'", obj6, false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + false + "'", obj7, false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test422");
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
        boolean boolean14 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + false + "'", obj2, false);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test423");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver1 = new experiment.util.StackTestDriver();
        java.lang.Object obj3 = stackTestDriver1.push((java.lang.Object) (byte) 0);
        java.lang.Object obj4 = stackTestDriver0.push(obj3);
        int int5 = stackTestDriver0.size();
        boolean boolean6 = stackTestDriver0.isEmpty();
        java.lang.Object obj7 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        int int9 = stackTestDriver8.size();
        boolean boolean10 = stackTestDriver8.isEmpty();
        stackTestDriver8.clear();
        stackTestDriver8.clear();
        boolean boolean13 = stackTestDriver8.isEmpty();
        int int14 = stackTestDriver8.size();
        boolean boolean15 = stackTestDriver8.isEmpty();
        java.lang.Object obj16 = stackTestDriver0.push((java.lang.Object) stackTestDriver8);
        java.lang.Class<?> wildcardClass17 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 0 + "'", obj3, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 0 + "'", obj4, (byte) 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 0 + "'", obj7, (byte) 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test424");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) false);
        stackTestDriver0.clear();
        boolean boolean4 = stackTestDriver0.isEmpty();
        boolean boolean5 = stackTestDriver0.isEmpty();
        int int6 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver7 = new experiment.util.StackTestDriver();
        java.lang.Object obj9 = stackTestDriver7.push((java.lang.Object) (byte) 0);
        stackTestDriver7.clear();
        int int11 = stackTestDriver7.size();
        int int12 = stackTestDriver7.size();
        stackTestDriver7.clear();
        java.lang.Object obj14 = stackTestDriver0.push((java.lang.Object) stackTestDriver7);
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + false + "'", obj2, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) 0 + "'", obj9, (byte) 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test425");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver1 = new experiment.util.StackTestDriver();
        java.lang.Object obj3 = stackTestDriver1.push((java.lang.Object) (byte) 0);
        java.lang.Object obj4 = stackTestDriver0.push(obj3);
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) 1L);
        int int7 = stackTestDriver0.size();
        boolean boolean8 = stackTestDriver0.isEmpty();
        java.lang.Object obj9 = stackTestDriver0.peek();
        java.lang.Object obj10 = stackTestDriver0.peek();
        stackTestDriver0.clear();
        boolean boolean12 = stackTestDriver0.isEmpty();
        java.lang.Object obj13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = stackTestDriver0.push(obj13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 0 + "'", obj3, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 0 + "'", obj4, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1L + "'", obj6, 1L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 1L + "'", obj9, 1L);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 1L + "'", obj10, 1L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test426");
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
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = stackTestDriver0.pop();
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
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 1L + "'", obj11, 1L);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test427");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        boolean boolean5 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        boolean boolean7 = stackTestDriver0.isEmpty();
        boolean boolean8 = stackTestDriver0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test428");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) false);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) 0L);
        stackTestDriver0.clear();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + false + "'", obj2, false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 0L + "'", obj5, 0L);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test429");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        boolean boolean5 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        int int7 = stackTestDriver0.size();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        java.lang.Class<?> wildcardClass10 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test430");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 0);
        stackTestDriver0.clear();
        int int4 = stackTestDriver0.size();
        int int5 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        java.lang.Object obj8 = stackTestDriver6.push((java.lang.Object) false);
        stackTestDriver6.clear();
        java.lang.Object obj10 = stackTestDriver0.push((java.lang.Object) stackTestDriver6);
        experiment.util.StackTestDriver stackTestDriver11 = new experiment.util.StackTestDriver();
        int int12 = stackTestDriver11.size();
        boolean boolean13 = stackTestDriver11.isEmpty();
        stackTestDriver11.clear();
        int int15 = stackTestDriver11.size();
        stackTestDriver11.clear();
        experiment.util.StackTestDriver stackTestDriver17 = new experiment.util.StackTestDriver();
        boolean boolean18 = stackTestDriver17.isEmpty();
        java.lang.Class<?> wildcardClass19 = stackTestDriver17.getClass();
        java.lang.Object obj20 = stackTestDriver11.push((java.lang.Object) wildcardClass19);
        experiment.util.StackTestDriver stackTestDriver21 = new experiment.util.StackTestDriver();
        java.lang.Object obj23 = stackTestDriver21.push((java.lang.Object) (byte) 0);
        stackTestDriver21.clear();
        int int25 = stackTestDriver21.size();
        boolean boolean26 = stackTestDriver21.isEmpty();
        java.lang.Class<?> wildcardClass27 = stackTestDriver21.getClass();
        java.lang.Object obj28 = stackTestDriver11.push((java.lang.Object) wildcardClass27);
        java.lang.Object obj29 = stackTestDriver6.push((java.lang.Object) stackTestDriver11);
        java.lang.Object obj30 = stackTestDriver6.peek();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 0 + "'", obj2, (byte) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + false + "'", obj8, false);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (byte) 0 + "'", obj23, (byte) 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertEquals(obj28.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj28), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj28), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNotNull(obj30);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test431");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 0);
        java.lang.Object obj3 = stackTestDriver0.pop();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) false);
        java.lang.Object obj8 = stackTestDriver5.peek();
        stackTestDriver5.clear();
        int int10 = stackTestDriver5.size();
        java.lang.Object obj12 = stackTestDriver5.push((java.lang.Object) 0);
        int int13 = stackTestDriver5.size();
        java.lang.Object obj14 = stackTestDriver5.peek();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        java.lang.Object obj16 = stackTestDriver0.push((java.lang.Object) wildcardClass15);
        int int17 = stackTestDriver0.size();
        java.lang.Class<?> wildcardClass18 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 0 + "'", obj2, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 0 + "'", obj3, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + false + "'", obj7, false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + false + "'", obj8, false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 0 + "'", obj12, 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 0 + "'", obj14, 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "class java.lang.Integer");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "class java.lang.Integer");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "class java.lang.Integer");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test432");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) false);
        java.lang.Object obj3 = stackTestDriver0.peek();
        stackTestDriver0.clear();
        int int5 = stackTestDriver0.size();
        stackTestDriver0.clear();
        int int7 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        java.lang.Object obj10 = stackTestDriver8.push((java.lang.Object) (byte) 0);
        stackTestDriver8.clear();
        java.lang.Object obj13 = stackTestDriver8.push((java.lang.Object) (-1.0d));
        experiment.util.StackTestDriver stackTestDriver14 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        java.lang.Object obj17 = stackTestDriver15.push((java.lang.Object) (byte) 0);
        java.lang.Object obj18 = stackTestDriver14.push(obj17);
        java.lang.Object obj19 = stackTestDriver8.push(obj17);
        stackTestDriver8.clear();
        java.lang.Object obj21 = stackTestDriver0.push((java.lang.Object) stackTestDriver8);
        stackTestDriver0.clear();
        java.lang.Class<?> wildcardClass23 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + false + "'", obj2, false);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) 0 + "'", obj10, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (-1.0d) + "'", obj13, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) 0 + "'", obj17, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (byte) 0 + "'", obj18, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (byte) 0 + "'", obj19, (byte) 0);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test433");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        boolean boolean5 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        boolean boolean7 = stackTestDriver0.isEmpty();
        int int8 = stackTestDriver0.size();
        java.lang.Class<?> wildcardClass9 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test434");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        boolean boolean4 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) stackTestDriver6);
        boolean boolean8 = stackTestDriver0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test435");
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
        java.lang.Object obj11 = stackTestDriver7.peek();
        java.lang.Object obj12 = stackTestDriver0.push((java.lang.Object) stackTestDriver7);
        experiment.util.StackTestDriver stackTestDriver13 = new experiment.util.StackTestDriver();
        java.lang.Object obj15 = stackTestDriver13.push((java.lang.Object) (byte) 0);
        java.lang.Object obj16 = stackTestDriver13.peek();
        java.lang.Object obj17 = stackTestDriver0.push((java.lang.Object) stackTestDriver13);
        java.lang.Object obj18 = stackTestDriver13.peek();
        boolean boolean19 = stackTestDriver13.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + false + "'", obj9, false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + false + "'", obj11, false);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (byte) 0 + "'", obj15, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (byte) 0 + "'", obj16, (byte) 0);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (byte) 0 + "'", obj18, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test436");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) false);
        java.lang.Object obj3 = stackTestDriver0.peek();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        java.lang.Object obj6 = stackTestDriver4.push((java.lang.Object) (byte) 0);
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) (byte) 0);
        boolean boolean8 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        int int10 = stackTestDriver0.size();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver12 = new experiment.util.StackTestDriver();
        boolean boolean13 = stackTestDriver12.isEmpty();
        java.lang.Object obj14 = stackTestDriver0.push((java.lang.Object) stackTestDriver12);
        int int15 = stackTestDriver0.size();
        java.lang.Object obj16 = stackTestDriver0.peek();
        java.lang.Class<?> wildcardClass17 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + false + "'", obj2, false);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 0 + "'", obj6, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 0 + "'", obj7, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test437");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver1 = new experiment.util.StackTestDriver();
        java.lang.Object obj3 = stackTestDriver1.push((java.lang.Object) (byte) 0);
        java.lang.Object obj4 = stackTestDriver0.push(obj3);
        int int5 = stackTestDriver0.size();
        java.lang.Object obj6 = stackTestDriver0.peek();
        boolean boolean7 = stackTestDriver0.isEmpty();
        java.lang.Object obj8 = stackTestDriver0.peek();
        experiment.util.StackTestDriver stackTestDriver9 = new experiment.util.StackTestDriver();
        java.lang.Object obj11 = stackTestDriver9.push((java.lang.Object) false);
        java.lang.Object obj12 = stackTestDriver9.peek();
        java.lang.Object obj13 = stackTestDriver9.peek();
        java.lang.Object obj14 = stackTestDriver9.pop();
        boolean boolean15 = stackTestDriver9.isEmpty();
        stackTestDriver9.clear();
        boolean boolean17 = stackTestDriver9.isEmpty();
        int int18 = stackTestDriver9.size();
        java.lang.Object obj19 = stackTestDriver0.push((java.lang.Object) int18);
        java.lang.Object obj20 = stackTestDriver0.peek();
        stackTestDriver0.clear();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 0 + "'", obj3, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 0 + "'", obj4, (byte) 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 0 + "'", obj6, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) 0 + "'", obj8, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + false + "'", obj11, false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + false + "'", obj12, false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + false + "'", obj13, false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + false + "'", obj14, false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 0 + "'", obj19, 0);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 0 + "'", obj20, 0);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test438");
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
        int int12 = stackTestDriver0.size();
        int int13 = stackTestDriver0.size();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 0 + "'", obj3, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 0 + "'", obj4, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1L + "'", obj6, 1L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 1L + "'", obj9, 1L);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 1L + "'", obj10, 1L);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 1L + "'", obj11, 1L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test439");
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
        boolean boolean14 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + false + "'", obj2, false);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test440");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Class<?> wildcardClass3 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test441");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) false);
        java.lang.Object obj3 = stackTestDriver0.pop();
        int int4 = stackTestDriver0.size();
        boolean boolean5 = stackTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + false + "'", obj2, false);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test442");
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
        java.lang.Object obj19 = stackTestDriver0.push((java.lang.Object) 1.0d);
        java.lang.Object obj20 = stackTestDriver0.peek();
        experiment.util.StackTestDriver stackTestDriver21 = new experiment.util.StackTestDriver();
        int int22 = stackTestDriver21.size();
        boolean boolean23 = stackTestDriver21.isEmpty();
        stackTestDriver21.clear();
        int int25 = stackTestDriver21.size();
        stackTestDriver21.clear();
        experiment.util.StackTestDriver stackTestDriver27 = new experiment.util.StackTestDriver();
        boolean boolean28 = stackTestDriver27.isEmpty();
        java.lang.Class<?> wildcardClass29 = stackTestDriver27.getClass();
        java.lang.Object obj30 = stackTestDriver21.push((java.lang.Object) wildcardClass29);
        experiment.util.StackTestDriver stackTestDriver31 = new experiment.util.StackTestDriver();
        java.lang.Object obj33 = stackTestDriver31.push((java.lang.Object) (byte) 0);
        stackTestDriver31.clear();
        int int35 = stackTestDriver31.size();
        boolean boolean36 = stackTestDriver31.isEmpty();
        java.lang.Class<?> wildcardClass37 = stackTestDriver31.getClass();
        java.lang.Object obj38 = stackTestDriver21.push((java.lang.Object) wildcardClass37);
        int int39 = stackTestDriver21.size();
        java.lang.Object obj40 = stackTestDriver0.push((java.lang.Object) stackTestDriver21);
        boolean boolean41 = stackTestDriver21.isEmpty();
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
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 1.0d + "'", obj19, 1.0d);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 1.0d + "'", obj20, 1.0d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertEquals(obj30.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj30), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj30), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + (byte) 0 + "'", obj33, (byte) 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertEquals(obj38.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj38), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj38), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2 + "'", int39 == 2);
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test443");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) false);
        java.lang.Object obj3 = stackTestDriver0.peek();
        java.lang.Object obj4 = stackTestDriver0.pop();
        stackTestDriver0.clear();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + false + "'", obj2, false);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + false + "'", obj4, false);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test444");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        int int4 = stackTestDriver0.size();
        stackTestDriver0.clear();
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) 'a');
        stackTestDriver0.clear();
        int int9 = stackTestDriver0.size();
        boolean boolean10 = stackTestDriver0.isEmpty();
        boolean boolean11 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 'a' + "'", obj7, 'a');
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test445");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) false);
        java.lang.Object obj3 = stackTestDriver0.peek();
        stackTestDriver0.clear();
        int int5 = stackTestDriver0.size();
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) 0);
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        boolean boolean10 = stackTestDriver0.isEmpty();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + false + "'", obj2, false);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0 + "'", obj7, 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test446");
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
        experiment.util.StackTestDriver stackTestDriver14 = new experiment.util.StackTestDriver();
        int int15 = stackTestDriver14.size();
        java.lang.Object obj16 = stackTestDriver5.push((java.lang.Object) int15);
        boolean boolean17 = stackTestDriver5.isEmpty();
        java.lang.Object obj18 = stackTestDriver5.pop();
        boolean boolean19 = stackTestDriver5.isEmpty();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + false + "'", obj2, false);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0 + "'", obj16, 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 0 + "'", obj18, 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test447");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
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
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test448");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        boolean boolean5 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver7 = new experiment.util.StackTestDriver();
        java.lang.Object obj9 = stackTestDriver7.push((java.lang.Object) (byte) 0);
        stackTestDriver7.clear();
        int int11 = stackTestDriver7.size();
        java.lang.Object obj13 = stackTestDriver7.push((java.lang.Object) ' ');
        java.lang.Object obj14 = stackTestDriver0.push((java.lang.Object) ' ');
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        java.lang.Object obj17 = stackTestDriver15.push((java.lang.Object) (byte) 0);
        stackTestDriver15.clear();
        java.lang.Object obj20 = stackTestDriver15.push((java.lang.Object) (-1.0d));
        experiment.util.StackTestDriver stackTestDriver21 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver22 = new experiment.util.StackTestDriver();
        java.lang.Object obj24 = stackTestDriver22.push((java.lang.Object) (byte) 0);
        java.lang.Object obj25 = stackTestDriver21.push(obj24);
        java.lang.Object obj26 = stackTestDriver15.push(obj24);
        java.lang.Object obj27 = stackTestDriver0.push(obj24);
        boolean boolean28 = stackTestDriver0.isEmpty();
        java.lang.Object obj29 = stackTestDriver0.pop();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) 0 + "'", obj9, (byte) 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + ' ' + "'", obj13, ' ');
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + ' ' + "'", obj14, ' ');
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) 0 + "'", obj17, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (-1.0d) + "'", obj20, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (byte) 0 + "'", obj24, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (byte) 0 + "'", obj25, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + (byte) 0 + "'", obj26, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + (byte) 0 + "'", obj27, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + (byte) 0 + "'", obj29, (byte) 0);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test449");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 0);
        stackTestDriver0.clear();
        int int4 = stackTestDriver0.size();
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) ' ');
        boolean boolean7 = stackTestDriver0.isEmpty();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 0 + "'", obj2, (byte) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + ' ' + "'", obj6, ' ');
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test450");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        boolean boolean4 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        boolean boolean6 = stackTestDriver0.isEmpty();
        boolean boolean7 = stackTestDriver0.isEmpty();
        int int8 = stackTestDriver0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test451");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) false);
        java.lang.Object obj3 = stackTestDriver0.peek();
        stackTestDriver0.clear();
        int int5 = stackTestDriver0.size();
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) 0);
        stackTestDriver0.clear();
        java.lang.Class<?> wildcardClass9 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + false + "'", obj2, false);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0 + "'", obj7, 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test452");
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
        java.lang.Object obj18 = stackTestDriver0.peek();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver20 = new experiment.util.StackTestDriver();
        java.lang.Object obj22 = stackTestDriver20.push((java.lang.Object) false);
        java.lang.Object obj23 = stackTestDriver20.peek();
        experiment.util.StackTestDriver stackTestDriver24 = new experiment.util.StackTestDriver();
        java.lang.Object obj26 = stackTestDriver24.push((java.lang.Object) (byte) 0);
        java.lang.Object obj27 = stackTestDriver20.push((java.lang.Object) (byte) 0);
        boolean boolean28 = stackTestDriver20.isEmpty();
        stackTestDriver20.clear();
        int int30 = stackTestDriver20.size();
        stackTestDriver20.clear();
        experiment.util.StackTestDriver stackTestDriver32 = new experiment.util.StackTestDriver();
        boolean boolean33 = stackTestDriver32.isEmpty();
        java.lang.Object obj34 = stackTestDriver20.push((java.lang.Object) stackTestDriver32);
        stackTestDriver32.clear();
        experiment.util.StackTestDriver stackTestDriver36 = new experiment.util.StackTestDriver();
        java.lang.Object obj38 = stackTestDriver36.push((java.lang.Object) (byte) 0);
        stackTestDriver36.clear();
        java.lang.Object obj41 = stackTestDriver36.push((java.lang.Object) (-1.0d));
        boolean boolean42 = stackTestDriver36.isEmpty();
        java.lang.Object obj43 = stackTestDriver32.push((java.lang.Object) stackTestDriver36);
        java.lang.Object obj44 = stackTestDriver0.push((java.lang.Object) stackTestDriver32);
        stackTestDriver32.clear();
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
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals(obj18.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj18), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj18), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + false + "'", obj22, false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + false + "'", obj23, false);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + (byte) 0 + "'", obj26, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + (byte) 0 + "'", obj27, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + (byte) 0 + "'", obj38, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + (-1.0d) + "'", obj41, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(obj43);
        org.junit.Assert.assertNotNull(obj44);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test453");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 0);
        stackTestDriver0.clear();
        int int4 = stackTestDriver0.size();
        boolean boolean5 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        java.lang.Object obj8 = stackTestDriver6.push((java.lang.Object) false);
        stackTestDriver6.clear();
        int int10 = stackTestDriver6.size();
        stackTestDriver6.clear();
        java.lang.Class<?> wildcardClass12 = stackTestDriver6.getClass();
        java.lang.Object obj13 = stackTestDriver0.push((java.lang.Object) wildcardClass12);
        int int14 = stackTestDriver0.size();
        java.lang.Class<?> wildcardClass15 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 0 + "'", obj2, (byte) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + false + "'", obj8, false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test454");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        boolean boolean4 = stackTestDriver0.isEmpty();
        int int5 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        int int7 = stackTestDriver6.size();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver6);
        boolean boolean9 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test455");
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
        java.lang.Object obj11 = stackTestDriver0.peek();
        boolean boolean12 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver13 = new experiment.util.StackTestDriver();
        boolean boolean14 = stackTestDriver13.isEmpty();
        boolean boolean15 = stackTestDriver13.isEmpty();
        int int16 = stackTestDriver13.size();
        stackTestDriver13.clear();
        experiment.util.StackTestDriver stackTestDriver18 = new experiment.util.StackTestDriver();
        int int19 = stackTestDriver18.size();
        boolean boolean20 = stackTestDriver18.isEmpty();
        stackTestDriver18.clear();
        int int22 = stackTestDriver18.size();
        java.lang.Class<?> wildcardClass23 = stackTestDriver18.getClass();
        java.lang.Object obj24 = stackTestDriver13.push((java.lang.Object) wildcardClass23);
        java.lang.Object obj25 = stackTestDriver0.push(obj24);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 0 + "'", obj7, (byte) 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals(obj24.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj24), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj24), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertEquals(obj25.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj25), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj25), "class experiment.util.StackTestDriver");
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test456");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) "");
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        boolean boolean6 = stackTestDriver5.isEmpty();
        stackTestDriver5.clear();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        experiment.util.StackTestDriver stackTestDriver9 = new experiment.util.StackTestDriver();
        java.lang.Object obj11 = stackTestDriver9.push((java.lang.Object) false);
        java.lang.Object obj12 = stackTestDriver9.peek();
        stackTestDriver9.clear();
        int int14 = stackTestDriver9.size();
        stackTestDriver9.clear();
        boolean boolean16 = stackTestDriver9.isEmpty();
        java.lang.Object obj17 = stackTestDriver5.push((java.lang.Object) stackTestDriver9);
        experiment.util.StackTestDriver stackTestDriver18 = new experiment.util.StackTestDriver();
        int int19 = stackTestDriver18.size();
        boolean boolean20 = stackTestDriver18.isEmpty();
        stackTestDriver18.clear();
        boolean boolean22 = stackTestDriver18.isEmpty();
        stackTestDriver18.clear();
        experiment.util.StackTestDriver stackTestDriver24 = new experiment.util.StackTestDriver();
        java.lang.Object obj25 = stackTestDriver18.push((java.lang.Object) stackTestDriver24);
        java.lang.Object obj26 = stackTestDriver5.push(obj25);
        experiment.util.StackTestDriver stackTestDriver27 = new experiment.util.StackTestDriver();
        int int28 = stackTestDriver27.size();
        boolean boolean29 = stackTestDriver27.isEmpty();
        stackTestDriver27.clear();
        stackTestDriver27.clear();
        int int32 = stackTestDriver27.size();
        stackTestDriver27.clear();
        java.lang.Object obj34 = stackTestDriver5.push((java.lang.Object) stackTestDriver27);
        experiment.util.StackTestDriver stackTestDriver35 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver36 = new experiment.util.StackTestDriver();
        java.lang.Object obj38 = stackTestDriver36.push((java.lang.Object) (byte) 0);
        java.lang.Object obj39 = stackTestDriver35.push(obj38);
        java.lang.Object obj40 = stackTestDriver35.peek();
        experiment.util.StackTestDriver stackTestDriver41 = new experiment.util.StackTestDriver();
        java.lang.Object obj43 = stackTestDriver41.push((java.lang.Object) false);
        java.lang.Object obj44 = stackTestDriver41.pop();
        int int45 = stackTestDriver41.size();
        java.lang.Object obj46 = stackTestDriver35.push((java.lang.Object) stackTestDriver41);
        boolean boolean47 = stackTestDriver35.isEmpty();
        java.lang.Object obj48 = stackTestDriver35.pop();
        java.lang.Object obj49 = stackTestDriver27.push(obj48);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + "" + "'", obj4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + false + "'", obj11, false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + false + "'", obj12, false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + (byte) 0 + "'", obj38, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + (byte) 0 + "'", obj39, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + (byte) 0 + "'", obj40, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + false + "'", obj43, false);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + false + "'", obj44, false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertNotNull(obj49);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test457");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        boolean boolean5 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        int int7 = stackTestDriver0.size();
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = stackTestDriver0.peek();
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
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test458");
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
        boolean boolean18 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        boolean boolean20 = stackTestDriver0.isEmpty();
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test459");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) false);
        java.lang.Object obj3 = stackTestDriver0.peek();
        stackTestDriver0.clear();
        int int5 = stackTestDriver0.size();
        stackTestDriver0.clear();
        int int7 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        java.lang.Object obj10 = stackTestDriver8.push((java.lang.Object) (byte) 0);
        stackTestDriver8.clear();
        java.lang.Object obj13 = stackTestDriver8.push((java.lang.Object) (-1.0d));
        experiment.util.StackTestDriver stackTestDriver14 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        java.lang.Object obj17 = stackTestDriver15.push((java.lang.Object) (byte) 0);
        java.lang.Object obj18 = stackTestDriver14.push(obj17);
        java.lang.Object obj19 = stackTestDriver8.push(obj17);
        stackTestDriver8.clear();
        java.lang.Object obj21 = stackTestDriver0.push((java.lang.Object) stackTestDriver8);
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        java.lang.Class<?> wildcardClass24 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + false + "'", obj2, false);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) 0 + "'", obj10, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (-1.0d) + "'", obj13, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) 0 + "'", obj17, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (byte) 0 + "'", obj18, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (byte) 0 + "'", obj19, (byte) 0);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test460");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) false);
        java.lang.Object obj3 = stackTestDriver0.peek();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        java.lang.Object obj6 = stackTestDriver4.push((java.lang.Object) (byte) 0);
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) (byte) 0);
        boolean boolean8 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        boolean boolean10 = stackTestDriver0.isEmpty();
        boolean boolean11 = stackTestDriver0.isEmpty();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + false + "'", obj2, false);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 0 + "'", obj6, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 0 + "'", obj7, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test461");
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
        java.lang.Class<?> wildcardClass27 = obj25.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test462");
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
        int int12 = stackTestDriver5.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 0 + "'", obj7, (byte) 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test463");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) false);
        java.lang.Object obj3 = stackTestDriver0.peek();
        java.lang.Object obj4 = stackTestDriver0.peek();
        java.lang.Object obj5 = stackTestDriver0.pop();
        int int6 = stackTestDriver0.size();
        int int7 = stackTestDriver0.size();
        int int8 = stackTestDriver0.size();
        boolean boolean9 = stackTestDriver0.isEmpty();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + false + "'", obj2, false);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + false + "'", obj4, false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + false + "'", obj5, false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test464");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) false);
        java.lang.Object obj3 = stackTestDriver0.peek();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        java.lang.Object obj6 = stackTestDriver4.push((java.lang.Object) (byte) 0);
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) (byte) 0);
        boolean boolean8 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        int int10 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver11 = new experiment.util.StackTestDriver();
        java.lang.Object obj13 = stackTestDriver11.push((java.lang.Object) false);
        java.lang.Object obj14 = stackTestDriver11.pop();
        int int15 = stackTestDriver11.size();
        experiment.util.StackTestDriver stackTestDriver16 = new experiment.util.StackTestDriver();
        int int17 = stackTestDriver16.size();
        boolean boolean18 = stackTestDriver16.isEmpty();
        stackTestDriver16.clear();
        stackTestDriver16.clear();
        boolean boolean21 = stackTestDriver16.isEmpty();
        stackTestDriver16.clear();
        int int23 = stackTestDriver16.size();
        java.lang.Object obj24 = stackTestDriver11.push((java.lang.Object) stackTestDriver16);
        java.lang.Object obj25 = stackTestDriver0.push(obj24);
        stackTestDriver0.clear();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + false + "'", obj2, false);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 0 + "'", obj6, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 0 + "'", obj7, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + false + "'", obj13, false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + false + "'", obj14, false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(obj25);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test465");
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
        int int15 = stackTestDriver0.size();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 0 + "'", obj7, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) 0 + "'", obj8, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 1L + "'", obj10, 1L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test466");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 0);
        stackTestDriver0.clear();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (-1.0d));
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        java.lang.Object obj8 = stackTestDriver6.push((java.lang.Object) false);
        java.lang.Object obj9 = stackTestDriver6.peek();
        java.lang.Class<?> wildcardClass10 = stackTestDriver6.getClass();
        java.lang.Object obj11 = stackTestDriver0.push((java.lang.Object) stackTestDriver6);
        int int12 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean14 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver16 = new experiment.util.StackTestDriver();
        java.lang.Object obj18 = stackTestDriver16.push((java.lang.Object) (byte) 0);
        java.lang.Object obj19 = stackTestDriver15.push(obj18);
        java.lang.Object obj20 = stackTestDriver15.peek();
        boolean boolean21 = stackTestDriver15.isEmpty();
        java.lang.Object obj22 = stackTestDriver15.pop();
        java.lang.Class<?> wildcardClass23 = obj22.getClass();
        java.lang.Object obj24 = stackTestDriver0.push(obj22);
        java.lang.Object obj25 = stackTestDriver0.pop();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 0 + "'", obj2, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + false + "'", obj8, false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + false + "'", obj9, false);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (byte) 0 + "'", obj18, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (byte) 0 + "'", obj19, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (byte) 0 + "'", obj20, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (byte) 0 + "'", obj22, (byte) 0);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (byte) 0 + "'", obj24, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (byte) 0 + "'", obj25, (byte) 0);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test467");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) false);
        java.lang.Object obj3 = stackTestDriver0.peek();
        stackTestDriver0.clear();
        int int5 = stackTestDriver0.size();
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) 0);
        boolean boolean8 = stackTestDriver0.isEmpty();
        boolean boolean9 = stackTestDriver0.isEmpty();
        java.lang.Object obj10 = stackTestDriver0.peek();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + false + "'", obj2, false);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0 + "'", obj7, 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 0 + "'", obj10, 0);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test468");
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
        int int27 = stackTestDriver0.size();
        java.lang.Object obj28 = stackTestDriver0.peek();
        boolean boolean29 = stackTestDriver0.isEmpty();
        java.lang.Class<?> wildcardClass30 = stackTestDriver0.getClass();
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertEquals(obj28.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj28), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj28), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test469");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 0);
        int int3 = stackTestDriver0.size();
        int int4 = stackTestDriver0.size();
        java.lang.Object obj5 = stackTestDriver0.pop();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 0 + "'", obj2, (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) 0 + "'", obj5, (byte) 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test470");
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
        stackTestDriver0.clear();
        java.lang.Class<?> wildcardClass18 = stackTestDriver0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test471");
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
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
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
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test472");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        java.lang.Object obj6 = stackTestDriver4.push((java.lang.Object) false);
        java.lang.Object obj7 = stackTestDriver4.peek();
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        java.lang.Object obj10 = stackTestDriver8.push((java.lang.Object) (byte) 0);
        java.lang.Object obj11 = stackTestDriver4.push((java.lang.Object) (byte) 0);
        boolean boolean12 = stackTestDriver4.isEmpty();
        stackTestDriver4.clear();
        int int14 = stackTestDriver4.size();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        java.lang.Object obj17 = stackTestDriver15.push((java.lang.Object) false);
        java.lang.Object obj18 = stackTestDriver15.pop();
        int int19 = stackTestDriver15.size();
        experiment.util.StackTestDriver stackTestDriver20 = new experiment.util.StackTestDriver();
        int int21 = stackTestDriver20.size();
        boolean boolean22 = stackTestDriver20.isEmpty();
        stackTestDriver20.clear();
        stackTestDriver20.clear();
        boolean boolean25 = stackTestDriver20.isEmpty();
        stackTestDriver20.clear();
        int int27 = stackTestDriver20.size();
        java.lang.Object obj28 = stackTestDriver15.push((java.lang.Object) stackTestDriver20);
        java.lang.Object obj29 = stackTestDriver4.push(obj28);
        java.lang.Object obj30 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        stackTestDriver4.clear();
        boolean boolean32 = stackTestDriver4.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + false + "'", obj6, false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + false + "'", obj7, false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) 0 + "'", obj10, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 0 + "'", obj11, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + false + "'", obj17, false);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + false + "'", obj18, false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test473");
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
        java.lang.Object obj11 = stackTestDriver7.peek();
        java.lang.Object obj12 = stackTestDriver0.push((java.lang.Object) stackTestDriver7);
        experiment.util.StackTestDriver stackTestDriver13 = new experiment.util.StackTestDriver();
        java.lang.Object obj15 = stackTestDriver13.push((java.lang.Object) (byte) 0);
        java.lang.Object obj16 = stackTestDriver13.peek();
        java.lang.Object obj17 = stackTestDriver0.push((java.lang.Object) stackTestDriver13);
        java.lang.Object obj18 = stackTestDriver13.pop();
        stackTestDriver13.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + false + "'", obj9, false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + false + "'", obj11, false);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (byte) 0 + "'", obj15, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (byte) 0 + "'", obj16, (byte) 0);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (byte) 0 + "'", obj18, (byte) 0);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test474");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 0);
        stackTestDriver0.clear();
        int int4 = stackTestDriver0.size();
        int int5 = stackTestDriver0.size();
        int int6 = stackTestDriver0.size();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 0 + "'", obj2, (byte) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test475");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver1 = new experiment.util.StackTestDriver();
        java.lang.Object obj3 = stackTestDriver1.push((java.lang.Object) (byte) 0);
        java.lang.Object obj4 = stackTestDriver0.push(obj3);
        int int5 = stackTestDriver0.size();
        boolean boolean6 = stackTestDriver0.isEmpty();
        int int7 = stackTestDriver0.size();
        java.lang.Object obj8 = stackTestDriver0.pop();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 0 + "'", obj3, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 0 + "'", obj4, (byte) 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) 0 + "'", obj8, (byte) 0);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test476");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        java.lang.Object obj6 = stackTestDriver4.push((java.lang.Object) false);
        java.lang.Object obj7 = stackTestDriver4.peek();
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        java.lang.Object obj10 = stackTestDriver8.push((java.lang.Object) (byte) 0);
        java.lang.Object obj11 = stackTestDriver4.push((java.lang.Object) (byte) 0);
        boolean boolean12 = stackTestDriver4.isEmpty();
        stackTestDriver4.clear();
        int int14 = stackTestDriver4.size();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        java.lang.Object obj17 = stackTestDriver15.push((java.lang.Object) false);
        java.lang.Object obj18 = stackTestDriver15.pop();
        int int19 = stackTestDriver15.size();
        experiment.util.StackTestDriver stackTestDriver20 = new experiment.util.StackTestDriver();
        int int21 = stackTestDriver20.size();
        boolean boolean22 = stackTestDriver20.isEmpty();
        stackTestDriver20.clear();
        stackTestDriver20.clear();
        boolean boolean25 = stackTestDriver20.isEmpty();
        stackTestDriver20.clear();
        int int27 = stackTestDriver20.size();
        java.lang.Object obj28 = stackTestDriver15.push((java.lang.Object) stackTestDriver20);
        java.lang.Object obj29 = stackTestDriver4.push(obj28);
        java.lang.Object obj30 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        java.lang.Object obj31 = stackTestDriver4.pop();
        java.lang.Class<?> wildcardClass32 = stackTestDriver4.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + false + "'", obj6, false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + false + "'", obj7, false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) 0 + "'", obj10, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 0 + "'", obj11, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + false + "'", obj17, false);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + false + "'", obj18, false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test477");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver1 = new experiment.util.StackTestDriver();
        boolean boolean2 = stackTestDriver1.isEmpty();
        stackTestDriver1.clear();
        int int4 = stackTestDriver1.size();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) false);
        java.lang.Object obj8 = stackTestDriver5.peek();
        java.lang.Class<?> wildcardClass9 = stackTestDriver5.getClass();
        java.lang.Object obj10 = stackTestDriver1.push((java.lang.Object) wildcardClass9);
        java.lang.Object obj11 = stackTestDriver0.push(obj10);
        int int12 = stackTestDriver0.size();
        java.lang.Class<?> wildcardClass13 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + false + "'", obj7, false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + false + "'", obj8, false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test478");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) false);
        java.lang.Object obj3 = stackTestDriver0.peek();
        stackTestDriver0.clear();
        int int5 = stackTestDriver0.size();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver7 = new experiment.util.StackTestDriver();
        int int8 = stackTestDriver7.size();
        boolean boolean9 = stackTestDriver7.isEmpty();
        stackTestDriver7.clear();
        stackTestDriver7.clear();
        experiment.util.StackTestDriver stackTestDriver12 = new experiment.util.StackTestDriver();
        java.lang.Object obj14 = stackTestDriver12.push((java.lang.Object) (byte) 0);
        stackTestDriver12.clear();
        int int16 = stackTestDriver12.size();
        java.lang.Object obj17 = stackTestDriver7.push((java.lang.Object) stackTestDriver12);
        stackTestDriver7.clear();
        java.lang.Object obj19 = stackTestDriver0.push((java.lang.Object) stackTestDriver7);
        java.lang.Object obj20 = stackTestDriver0.pop();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + false + "'", obj2, false);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (byte) 0 + "'", obj14, (byte) 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(obj20);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test479");
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
        java.lang.Object obj14 = stackTestDriver4.peek();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        java.lang.Object obj17 = stackTestDriver15.push((java.lang.Object) false);
        java.lang.Object obj18 = stackTestDriver15.peek();
        experiment.util.StackTestDriver stackTestDriver19 = new experiment.util.StackTestDriver();
        java.lang.Object obj21 = stackTestDriver19.push((java.lang.Object) (byte) 0);
        java.lang.Object obj22 = stackTestDriver15.push((java.lang.Object) (byte) 0);
        boolean boolean23 = stackTestDriver15.isEmpty();
        stackTestDriver15.clear();
        stackTestDriver15.clear();
        experiment.util.StackTestDriver stackTestDriver26 = new experiment.util.StackTestDriver();
        java.lang.Object obj28 = stackTestDriver26.push((java.lang.Object) false);
        stackTestDriver26.clear();
        experiment.util.StackTestDriver stackTestDriver30 = new experiment.util.StackTestDriver();
        java.lang.Object obj32 = stackTestDriver30.push((java.lang.Object) false);
        java.lang.Object obj33 = stackTestDriver30.peek();
        experiment.util.StackTestDriver stackTestDriver34 = new experiment.util.StackTestDriver();
        java.lang.Object obj36 = stackTestDriver34.push((java.lang.Object) (byte) 0);
        java.lang.Object obj37 = stackTestDriver30.push((java.lang.Object) (byte) 0);
        java.lang.Object obj38 = stackTestDriver30.peek();
        java.lang.Object obj39 = stackTestDriver26.push((java.lang.Object) stackTestDriver30);
        java.lang.Object obj40 = stackTestDriver26.peek();
        java.lang.Object obj41 = stackTestDriver26.pop();
        java.lang.Object obj42 = stackTestDriver15.push(obj41);
        java.lang.Object obj43 = stackTestDriver15.peek();
        stackTestDriver15.clear();
        stackTestDriver15.clear();
        java.lang.Object obj46 = stackTestDriver4.push((java.lang.Object) stackTestDriver15);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 0 + "'", obj7, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) 0 + "'", obj8, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 1L + "'", obj10, 1L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 1L + "'", obj14, 1L);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + false + "'", obj17, false);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + false + "'", obj18, false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (byte) 0 + "'", obj21, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (byte) 0 + "'", obj22, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + false + "'", obj28, false);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + false + "'", obj32, false);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + false + "'", obj33, false);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + (byte) 0 + "'", obj36, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + (byte) 0 + "'", obj37, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + (byte) 0 + "'", obj38, (byte) 0);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertNotNull(obj43);
        org.junit.Assert.assertNotNull(obj46);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test480");
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
        java.lang.Object obj19 = stackTestDriver0.push((java.lang.Object) 1.0d);
        java.lang.Object obj20 = stackTestDriver0.peek();
        java.lang.Object obj21 = stackTestDriver0.pop();
        java.lang.Object obj22 = stackTestDriver0.peek();
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
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 1.0d + "'", obj19, 1.0d);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 1.0d + "'", obj20, 1.0d);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 1.0d + "'", obj21, 1.0d);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals(obj22.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj22), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj22), "class experiment.util.StackTestDriver");
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test481");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 0);
        stackTestDriver0.clear();
        int int4 = stackTestDriver0.size();
        int int5 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        java.lang.Object obj8 = stackTestDriver6.push((java.lang.Object) false);
        stackTestDriver6.clear();
        java.lang.Object obj10 = stackTestDriver0.push((java.lang.Object) stackTestDriver6);
        experiment.util.StackTestDriver stackTestDriver11 = new experiment.util.StackTestDriver();
        int int12 = stackTestDriver11.size();
        boolean boolean13 = stackTestDriver11.isEmpty();
        stackTestDriver11.clear();
        int int15 = stackTestDriver11.size();
        stackTestDriver11.clear();
        experiment.util.StackTestDriver stackTestDriver17 = new experiment.util.StackTestDriver();
        boolean boolean18 = stackTestDriver17.isEmpty();
        java.lang.Class<?> wildcardClass19 = stackTestDriver17.getClass();
        java.lang.Object obj20 = stackTestDriver11.push((java.lang.Object) wildcardClass19);
        experiment.util.StackTestDriver stackTestDriver21 = new experiment.util.StackTestDriver();
        java.lang.Object obj23 = stackTestDriver21.push((java.lang.Object) (byte) 0);
        stackTestDriver21.clear();
        int int25 = stackTestDriver21.size();
        boolean boolean26 = stackTestDriver21.isEmpty();
        java.lang.Class<?> wildcardClass27 = stackTestDriver21.getClass();
        java.lang.Object obj28 = stackTestDriver11.push((java.lang.Object) wildcardClass27);
        java.lang.Object obj29 = stackTestDriver6.push((java.lang.Object) stackTestDriver11);
        int int30 = stackTestDriver6.size();
        experiment.util.StackTestDriver stackTestDriver31 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver32 = new experiment.util.StackTestDriver();
        boolean boolean33 = stackTestDriver32.isEmpty();
        stackTestDriver32.clear();
        int int35 = stackTestDriver32.size();
        experiment.util.StackTestDriver stackTestDriver36 = new experiment.util.StackTestDriver();
        java.lang.Object obj38 = stackTestDriver36.push((java.lang.Object) false);
        java.lang.Object obj39 = stackTestDriver36.peek();
        java.lang.Class<?> wildcardClass40 = stackTestDriver36.getClass();
        java.lang.Object obj41 = stackTestDriver32.push((java.lang.Object) wildcardClass40);
        java.lang.Object obj42 = stackTestDriver31.push(obj41);
        java.lang.Object obj43 = stackTestDriver6.push((java.lang.Object) stackTestDriver31);
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 0 + "'", obj2, (byte) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + false + "'", obj8, false);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (byte) 0 + "'", obj23, (byte) 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertEquals(obj28.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj28), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj28), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + false + "'", obj38, false);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + false + "'", obj39, false);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertEquals(obj41.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj41), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj41), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertEquals(obj42.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj42), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj42), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertNotNull(obj43);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test482");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 0);
        stackTestDriver0.clear();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (-1.0d));
        boolean boolean6 = stackTestDriver0.isEmpty();
        int int7 = stackTestDriver0.size();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 0 + "'", obj2, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test483");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) false);
        java.lang.Object obj3 = stackTestDriver0.peek();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        java.lang.Object obj6 = stackTestDriver4.push((java.lang.Object) (byte) 0);
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) (byte) 0);
        boolean boolean8 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        int int10 = stackTestDriver0.size();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver12 = new experiment.util.StackTestDriver();
        boolean boolean13 = stackTestDriver12.isEmpty();
        java.lang.Object obj14 = stackTestDriver0.push((java.lang.Object) stackTestDriver12);
        stackTestDriver12.clear();
        experiment.util.StackTestDriver stackTestDriver16 = new experiment.util.StackTestDriver();
        java.lang.Object obj18 = stackTestDriver16.push((java.lang.Object) (byte) 0);
        stackTestDriver16.clear();
        java.lang.Object obj21 = stackTestDriver16.push((java.lang.Object) (-1.0d));
        boolean boolean22 = stackTestDriver16.isEmpty();
        java.lang.Object obj23 = stackTestDriver12.push((java.lang.Object) stackTestDriver16);
        int int24 = stackTestDriver12.size();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + false + "'", obj2, false);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 0 + "'", obj6, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 0 + "'", obj7, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (byte) 0 + "'", obj18, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (-1.0d) + "'", obj21, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test484");
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
        boolean boolean15 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver16 = new experiment.util.StackTestDriver();
        int int17 = stackTestDriver16.size();
        boolean boolean18 = stackTestDriver16.isEmpty();
        stackTestDriver16.clear();
        stackTestDriver16.clear();
        int int21 = stackTestDriver16.size();
        boolean boolean22 = stackTestDriver16.isEmpty();
        experiment.util.StackTestDriver stackTestDriver23 = new experiment.util.StackTestDriver();
        java.lang.Object obj25 = stackTestDriver23.push((java.lang.Object) false);
        java.lang.Object obj26 = stackTestDriver23.peek();
        java.lang.Object obj27 = stackTestDriver23.peek();
        java.lang.Object obj28 = stackTestDriver16.push((java.lang.Object) stackTestDriver23);
        java.lang.Object obj29 = stackTestDriver0.push((java.lang.Object) stackTestDriver16);
        experiment.util.StackTestDriver stackTestDriver30 = new experiment.util.StackTestDriver();
        boolean boolean31 = stackTestDriver30.isEmpty();
        stackTestDriver30.clear();
        boolean boolean33 = stackTestDriver30.isEmpty();
        stackTestDriver30.clear();
        java.lang.Object obj35 = stackTestDriver16.push((java.lang.Object) stackTestDriver30);
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + false + "'", obj2, false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + false + "'", obj6, false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + false + "'", obj7, false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) 0 + "'", obj10, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 0 + "'", obj11, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) 0 + "'", obj12, (byte) 0);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + false + "'", obj25, false);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + false + "'", obj26, false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + false + "'", obj27, false);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(obj35);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test485");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) false);
        boolean boolean3 = stackTestDriver0.isEmpty();
        boolean boolean4 = stackTestDriver0.isEmpty();
        int int5 = stackTestDriver0.size();
        stackTestDriver0.clear();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + false + "'", obj2, false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test486");
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
        boolean boolean14 = stackTestDriver4.isEmpty();
        int int15 = stackTestDriver4.size();
        experiment.util.StackTestDriver stackTestDriver16 = new experiment.util.StackTestDriver();
        java.lang.Object obj18 = stackTestDriver16.push((java.lang.Object) false);
        stackTestDriver16.clear();
        int int20 = stackTestDriver16.size();
        java.lang.Object obj22 = stackTestDriver16.push((java.lang.Object) false);
        experiment.util.StackTestDriver stackTestDriver23 = new experiment.util.StackTestDriver();
        java.lang.Object obj25 = stackTestDriver23.push((java.lang.Object) (byte) 0);
        stackTestDriver23.clear();
        java.lang.Object obj28 = stackTestDriver23.push((java.lang.Object) (-1.0d));
        boolean boolean29 = stackTestDriver23.isEmpty();
        experiment.util.StackTestDriver stackTestDriver30 = new experiment.util.StackTestDriver();
        java.lang.Object obj32 = stackTestDriver30.push((java.lang.Object) false);
        java.lang.Object obj33 = stackTestDriver30.peek();
        experiment.util.StackTestDriver stackTestDriver34 = new experiment.util.StackTestDriver();
        java.lang.Object obj36 = stackTestDriver34.push((java.lang.Object) (byte) 0);
        java.lang.Object obj37 = stackTestDriver30.push((java.lang.Object) (byte) 0);
        java.lang.Object obj38 = stackTestDriver30.peek();
        java.lang.Class<?> wildcardClass39 = stackTestDriver30.getClass();
        java.lang.Object obj40 = stackTestDriver23.push((java.lang.Object) wildcardClass39);
        java.lang.Object obj41 = stackTestDriver23.peek();
        java.lang.Object obj42 = stackTestDriver16.push(obj41);
        int int43 = stackTestDriver16.size();
        java.lang.Class<?> wildcardClass44 = stackTestDriver16.getClass();
        java.lang.Object obj45 = stackTestDriver4.push((java.lang.Object) wildcardClass44);
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + false + "'", obj2, false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + false + "'", obj6, false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + false + "'", obj7, false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) 0 + "'", obj10, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 0 + "'", obj11, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) 0 + "'", obj12, (byte) 0);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + false + "'", obj18, false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + false + "'", obj22, false);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (byte) 0 + "'", obj25, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + (-1.0d) + "'", obj28, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + false + "'", obj32, false);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + false + "'", obj33, false);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + (byte) 0 + "'", obj36, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + (byte) 0 + "'", obj37, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + (byte) 0 + "'", obj38, (byte) 0);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertEquals(obj40.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj40), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj40), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertEquals(obj41.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj41), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj41), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertEquals(obj42.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj42), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj42), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2 + "'", int43 == 2);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertEquals(obj45.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj45), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj45), "class experiment.util.StackTestDriver");
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test487");
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
        int int20 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver21 = new experiment.util.StackTestDriver();
        java.lang.Object obj23 = stackTestDriver21.push((java.lang.Object) false);
        stackTestDriver21.clear();
        experiment.util.StackTestDriver stackTestDriver25 = new experiment.util.StackTestDriver();
        java.lang.Object obj27 = stackTestDriver25.push((java.lang.Object) false);
        java.lang.Object obj28 = stackTestDriver25.peek();
        experiment.util.StackTestDriver stackTestDriver29 = new experiment.util.StackTestDriver();
        java.lang.Object obj31 = stackTestDriver29.push((java.lang.Object) (byte) 0);
        java.lang.Object obj32 = stackTestDriver25.push((java.lang.Object) (byte) 0);
        java.lang.Object obj33 = stackTestDriver25.peek();
        java.lang.Object obj34 = stackTestDriver21.push((java.lang.Object) stackTestDriver25);
        java.lang.Object obj35 = stackTestDriver21.peek();
        java.lang.Object obj36 = stackTestDriver21.peek();
        java.lang.Object obj37 = stackTestDriver0.push(obj36);
        experiment.util.StackTestDriver stackTestDriver38 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver39 = new experiment.util.StackTestDriver();
        java.lang.Object obj41 = stackTestDriver39.push((java.lang.Object) (byte) 0);
        java.lang.Object obj42 = stackTestDriver38.push(obj41);
        java.lang.Object obj43 = stackTestDriver38.peek();
        experiment.util.StackTestDriver stackTestDriver44 = new experiment.util.StackTestDriver();
        java.lang.Object obj46 = stackTestDriver44.push((java.lang.Object) false);
        java.lang.Object obj47 = stackTestDriver44.pop();
        int int48 = stackTestDriver44.size();
        java.lang.Object obj49 = stackTestDriver38.push((java.lang.Object) stackTestDriver44);
        stackTestDriver44.clear();
        experiment.util.StackTestDriver stackTestDriver51 = new experiment.util.StackTestDriver();
        java.lang.Object obj53 = stackTestDriver51.push((java.lang.Object) (byte) 0);
        stackTestDriver51.clear();
        java.lang.Object obj56 = stackTestDriver51.push((java.lang.Object) (-1.0d));
        boolean boolean57 = stackTestDriver51.isEmpty();
        experiment.util.StackTestDriver stackTestDriver58 = new experiment.util.StackTestDriver();
        java.lang.Object obj60 = stackTestDriver58.push((java.lang.Object) false);
        java.lang.Object obj61 = stackTestDriver58.peek();
        experiment.util.StackTestDriver stackTestDriver62 = new experiment.util.StackTestDriver();
        java.lang.Object obj64 = stackTestDriver62.push((java.lang.Object) (byte) 0);
        java.lang.Object obj65 = stackTestDriver58.push((java.lang.Object) (byte) 0);
        java.lang.Object obj66 = stackTestDriver58.peek();
        java.lang.Class<?> wildcardClass67 = stackTestDriver58.getClass();
        java.lang.Object obj68 = stackTestDriver51.push((java.lang.Object) wildcardClass67);
        stackTestDriver51.clear();
        experiment.util.StackTestDriver stackTestDriver70 = new experiment.util.StackTestDriver();
        java.lang.Object obj72 = stackTestDriver70.push((java.lang.Object) false);
        java.lang.Object obj73 = stackTestDriver70.peek();
        experiment.util.StackTestDriver stackTestDriver74 = new experiment.util.StackTestDriver();
        java.lang.Object obj76 = stackTestDriver74.push((java.lang.Object) (byte) 0);
        java.lang.Object obj77 = stackTestDriver70.push((java.lang.Object) (byte) 0);
        boolean boolean78 = stackTestDriver70.isEmpty();
        stackTestDriver70.clear();
        int int80 = stackTestDriver70.size();
        experiment.util.StackTestDriver stackTestDriver81 = new experiment.util.StackTestDriver();
        java.lang.Object obj83 = stackTestDriver81.push((java.lang.Object) false);
        java.lang.Object obj84 = stackTestDriver81.pop();
        int int85 = stackTestDriver81.size();
        experiment.util.StackTestDriver stackTestDriver86 = new experiment.util.StackTestDriver();
        int int87 = stackTestDriver86.size();
        boolean boolean88 = stackTestDriver86.isEmpty();
        stackTestDriver86.clear();
        stackTestDriver86.clear();
        boolean boolean91 = stackTestDriver86.isEmpty();
        stackTestDriver86.clear();
        int int93 = stackTestDriver86.size();
        java.lang.Object obj94 = stackTestDriver81.push((java.lang.Object) stackTestDriver86);
        java.lang.Object obj95 = stackTestDriver70.push(obj94);
        java.lang.Object obj96 = stackTestDriver70.pop();
        java.lang.Object obj97 = stackTestDriver51.push(obj96);
        java.lang.Object obj98 = stackTestDriver44.push((java.lang.Object) stackTestDriver51);
        java.lang.Object obj99 = stackTestDriver0.push(obj98);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + false + "'", obj23, false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + false + "'", obj27, false);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + false + "'", obj28, false);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + (byte) 0 + "'", obj31, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + (byte) 0 + "'", obj32, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + (byte) 0 + "'", obj33, (byte) 0);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + (byte) 0 + "'", obj41, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + (byte) 0 + "'", obj42, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + (byte) 0 + "'", obj43, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + false + "'", obj46, false);
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + false + "'", obj47, false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertEquals("'" + obj53 + "' != '" + (byte) 0 + "'", obj53, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj56 + "' != '" + (-1.0d) + "'", obj56, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertEquals("'" + obj60 + "' != '" + false + "'", obj60, false);
        org.junit.Assert.assertEquals("'" + obj61 + "' != '" + false + "'", obj61, false);
        org.junit.Assert.assertEquals("'" + obj64 + "' != '" + (byte) 0 + "'", obj64, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj65 + "' != '" + (byte) 0 + "'", obj65, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj66 + "' != '" + (byte) 0 + "'", obj66, (byte) 0);
        org.junit.Assert.assertNotNull(wildcardClass67);
        org.junit.Assert.assertNotNull(obj68);
        org.junit.Assert.assertEquals(obj68.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj68), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj68), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals("'" + obj72 + "' != '" + false + "'", obj72, false);
        org.junit.Assert.assertEquals("'" + obj73 + "' != '" + false + "'", obj73, false);
        org.junit.Assert.assertEquals("'" + obj76 + "' != '" + (byte) 0 + "'", obj76, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj77 + "' != '" + (byte) 0 + "'", obj77, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
        org.junit.Assert.assertEquals("'" + obj83 + "' != '" + false + "'", obj83, false);
        org.junit.Assert.assertEquals("'" + obj84 + "' != '" + false + "'", obj84, false);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 0 + "'", int93 == 0);
        org.junit.Assert.assertNotNull(obj94);
        org.junit.Assert.assertNotNull(obj95);
        org.junit.Assert.assertNotNull(obj96);
        org.junit.Assert.assertNotNull(obj97);
        org.junit.Assert.assertNotNull(obj98);
        org.junit.Assert.assertNotNull(obj99);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test488");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 0);
        stackTestDriver0.clear();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (-1.0d));
        int int6 = stackTestDriver0.size();
        java.lang.Object obj7 = stackTestDriver0.peek();
        java.lang.Object obj8 = stackTestDriver0.pop();
        int int9 = stackTestDriver0.size();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 0 + "'", obj2, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test489");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) false);
        java.lang.Object obj3 = stackTestDriver0.peek();
        stackTestDriver0.clear();
        int int5 = stackTestDriver0.size();
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) 0);
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        int int10 = stackTestDriver0.size();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + false + "'", obj2, false);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0 + "'", obj7, 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test490");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) false);
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) false);
        java.lang.Object obj8 = stackTestDriver5.peek();
        experiment.util.StackTestDriver stackTestDriver9 = new experiment.util.StackTestDriver();
        java.lang.Object obj11 = stackTestDriver9.push((java.lang.Object) (byte) 0);
        java.lang.Object obj12 = stackTestDriver5.push((java.lang.Object) (byte) 0);
        boolean boolean13 = stackTestDriver5.isEmpty();
        java.lang.Object obj14 = stackTestDriver0.push((java.lang.Object) boolean13);
        java.lang.Object obj15 = stackTestDriver0.peek();
        java.lang.Class<?> wildcardClass16 = obj15.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + false + "'", obj2, false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + false + "'", obj7, false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + false + "'", obj8, false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 0 + "'", obj11, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) 0 + "'", obj12, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + false + "'", obj14, false);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + false + "'", obj15, false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test491");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) "");
        boolean boolean5 = stackTestDriver0.isEmpty();
        java.lang.Object obj6 = stackTestDriver0.peek();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + "" + "'", obj4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "" + "'", obj6, "");
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test492");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) false);
        stackTestDriver0.clear();
        boolean boolean4 = stackTestDriver0.isEmpty();
        boolean boolean5 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        java.lang.Object obj8 = stackTestDriver6.push((java.lang.Object) (byte) 0);
        stackTestDriver6.clear();
        java.lang.Object obj11 = stackTestDriver6.push((java.lang.Object) (-1.0d));
        experiment.util.StackTestDriver stackTestDriver12 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver13 = new experiment.util.StackTestDriver();
        java.lang.Object obj15 = stackTestDriver13.push((java.lang.Object) (byte) 0);
        java.lang.Object obj16 = stackTestDriver12.push(obj15);
        java.lang.Object obj17 = stackTestDriver6.push(obj15);
        experiment.util.StackTestDriver stackTestDriver18 = new experiment.util.StackTestDriver();
        int int19 = stackTestDriver18.size();
        boolean boolean20 = stackTestDriver18.isEmpty();
        stackTestDriver18.clear();
        int int22 = stackTestDriver18.size();
        stackTestDriver18.clear();
        experiment.util.StackTestDriver stackTestDriver24 = new experiment.util.StackTestDriver();
        boolean boolean25 = stackTestDriver24.isEmpty();
        java.lang.Class<?> wildcardClass26 = stackTestDriver24.getClass();
        java.lang.Object obj27 = stackTestDriver18.push((java.lang.Object) wildcardClass26);
        java.lang.Object obj28 = stackTestDriver6.push((java.lang.Object) stackTestDriver18);
        java.lang.Object obj29 = stackTestDriver0.push((java.lang.Object) stackTestDriver6);
        java.lang.Object obj30 = stackTestDriver0.pop();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj31 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + false + "'", obj2, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) 0 + "'", obj8, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (-1.0d) + "'", obj11, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (byte) 0 + "'", obj15, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (byte) 0 + "'", obj16, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) 0 + "'", obj17, (byte) 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertEquals(obj27.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj27), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj27), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNotNull(obj30);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test493");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        int int4 = stackTestDriver0.size();
        boolean boolean5 = stackTestDriver0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test494");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 0);
        stackTestDriver0.clear();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (-1.0d));
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver7 = new experiment.util.StackTestDriver();
        java.lang.Object obj9 = stackTestDriver7.push((java.lang.Object) (byte) 0);
        java.lang.Object obj10 = stackTestDriver6.push(obj9);
        java.lang.Object obj11 = stackTestDriver0.push(obj9);
        experiment.util.StackTestDriver stackTestDriver12 = new experiment.util.StackTestDriver();
        int int13 = stackTestDriver12.size();
        boolean boolean14 = stackTestDriver12.isEmpty();
        stackTestDriver12.clear();
        int int16 = stackTestDriver12.size();
        stackTestDriver12.clear();
        experiment.util.StackTestDriver stackTestDriver18 = new experiment.util.StackTestDriver();
        boolean boolean19 = stackTestDriver18.isEmpty();
        java.lang.Class<?> wildcardClass20 = stackTestDriver18.getClass();
        java.lang.Object obj21 = stackTestDriver12.push((java.lang.Object) wildcardClass20);
        java.lang.Object obj22 = stackTestDriver0.push((java.lang.Object) stackTestDriver12);
        experiment.util.StackTestDriver stackTestDriver23 = new experiment.util.StackTestDriver();
        java.lang.Object obj25 = stackTestDriver23.push((java.lang.Object) (byte) 0);
        stackTestDriver23.clear();
        java.lang.Object obj28 = stackTestDriver23.push((java.lang.Object) (-1.0d));
        boolean boolean29 = stackTestDriver23.isEmpty();
        experiment.util.StackTestDriver stackTestDriver30 = new experiment.util.StackTestDriver();
        java.lang.Object obj32 = stackTestDriver30.push((java.lang.Object) false);
        java.lang.Object obj33 = stackTestDriver30.peek();
        experiment.util.StackTestDriver stackTestDriver34 = new experiment.util.StackTestDriver();
        java.lang.Object obj36 = stackTestDriver34.push((java.lang.Object) (byte) 0);
        java.lang.Object obj37 = stackTestDriver30.push((java.lang.Object) (byte) 0);
        java.lang.Object obj38 = stackTestDriver30.peek();
        java.lang.Class<?> wildcardClass39 = stackTestDriver30.getClass();
        java.lang.Object obj40 = stackTestDriver23.push((java.lang.Object) wildcardClass39);
        java.lang.Object obj41 = stackTestDriver23.peek();
        java.lang.Object obj42 = stackTestDriver0.push(obj41);
        stackTestDriver0.clear();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 0 + "'", obj2, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) 0 + "'", obj9, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) 0 + "'", obj10, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 0 + "'", obj11, (byte) 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals(obj21.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj21), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj21), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (byte) 0 + "'", obj25, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + (-1.0d) + "'", obj28, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + false + "'", obj32, false);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + false + "'", obj33, false);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + (byte) 0 + "'", obj36, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + (byte) 0 + "'", obj37, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + (byte) 0 + "'", obj38, (byte) 0);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertEquals(obj40.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj40), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj40), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertEquals(obj41.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj41), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj41), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertEquals(obj42.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj42), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj42), "class experiment.util.StackTestDriver");
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test495");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver1 = new experiment.util.StackTestDriver();
        boolean boolean2 = stackTestDriver1.isEmpty();
        stackTestDriver1.clear();
        int int4 = stackTestDriver1.size();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) false);
        java.lang.Object obj8 = stackTestDriver5.peek();
        java.lang.Class<?> wildcardClass9 = stackTestDriver5.getClass();
        java.lang.Object obj10 = stackTestDriver1.push((java.lang.Object) wildcardClass9);
        java.lang.Object obj11 = stackTestDriver0.push(obj10);
        int int12 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver13 = new experiment.util.StackTestDriver();
        java.lang.Object obj15 = stackTestDriver13.push((java.lang.Object) (byte) 0);
        stackTestDriver13.clear();
        java.lang.Object obj18 = stackTestDriver13.push((java.lang.Object) (-1.0d));
        boolean boolean19 = stackTestDriver13.isEmpty();
        experiment.util.StackTestDriver stackTestDriver20 = new experiment.util.StackTestDriver();
        java.lang.Object obj22 = stackTestDriver20.push((java.lang.Object) false);
        java.lang.Object obj23 = stackTestDriver20.peek();
        experiment.util.StackTestDriver stackTestDriver24 = new experiment.util.StackTestDriver();
        java.lang.Object obj26 = stackTestDriver24.push((java.lang.Object) (byte) 0);
        java.lang.Object obj27 = stackTestDriver20.push((java.lang.Object) (byte) 0);
        java.lang.Object obj28 = stackTestDriver20.peek();
        java.lang.Class<?> wildcardClass29 = stackTestDriver20.getClass();
        java.lang.Object obj30 = stackTestDriver13.push((java.lang.Object) wildcardClass29);
        stackTestDriver13.clear();
        boolean boolean32 = stackTestDriver13.isEmpty();
        java.lang.Object obj33 = stackTestDriver0.push((java.lang.Object) boolean32);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + false + "'", obj7, false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + false + "'", obj8, false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (byte) 0 + "'", obj15, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (-1.0d) + "'", obj18, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + false + "'", obj22, false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + false + "'", obj23, false);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + (byte) 0 + "'", obj26, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + (byte) 0 + "'", obj27, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + (byte) 0 + "'", obj28, (byte) 0);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertEquals(obj30.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj30), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj30), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + true + "'", obj33, true);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test496");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver1 = new experiment.util.StackTestDriver();
        java.lang.Object obj3 = stackTestDriver1.push((java.lang.Object) (byte) 0);
        java.lang.Object obj4 = stackTestDriver0.push(obj3);
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) 1L);
        int int7 = stackTestDriver0.size();
        int int8 = stackTestDriver0.size();
        boolean boolean9 = stackTestDriver0.isEmpty();
        java.lang.Object obj10 = stackTestDriver0.pop();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 0 + "'", obj3, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 0 + "'", obj4, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1L + "'", obj6, 1L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 1L + "'", obj10, 1L);
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test497");
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
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver16 = new experiment.util.StackTestDriver();
        int int17 = stackTestDriver16.size();
        boolean boolean18 = stackTestDriver16.isEmpty();
        stackTestDriver16.clear();
        boolean boolean20 = stackTestDriver16.isEmpty();
        int int21 = stackTestDriver16.size();
        experiment.util.StackTestDriver stackTestDriver22 = new experiment.util.StackTestDriver();
        int int23 = stackTestDriver22.size();
        java.lang.Object obj24 = stackTestDriver16.push((java.lang.Object) stackTestDriver22);
        experiment.util.StackTestDriver stackTestDriver25 = new experiment.util.StackTestDriver();
        boolean boolean26 = stackTestDriver25.isEmpty();
        stackTestDriver25.clear();
        stackTestDriver25.clear();
        experiment.util.StackTestDriver stackTestDriver29 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver30 = new experiment.util.StackTestDriver();
        java.lang.Object obj32 = stackTestDriver30.push((java.lang.Object) (byte) 0);
        java.lang.Object obj33 = stackTestDriver29.push(obj32);
        java.lang.Object obj35 = stackTestDriver29.push((java.lang.Object) 1L);
        int int36 = stackTestDriver29.size();
        int int37 = stackTestDriver29.size();
        java.lang.Object obj38 = stackTestDriver25.push((java.lang.Object) stackTestDriver29);
        java.lang.Object obj39 = stackTestDriver22.push((java.lang.Object) stackTestDriver29);
        java.lang.Object obj40 = stackTestDriver22.pop();
        java.lang.Object obj41 = stackTestDriver0.push((java.lang.Object) stackTestDriver22);
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + false + "'", obj2, false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + false + "'", obj6, false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + false + "'", obj7, false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) 0 + "'", obj10, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 0 + "'", obj11, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) 0 + "'", obj12, (byte) 0);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + (byte) 0 + "'", obj32, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + (byte) 0 + "'", obj33, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 1L + "'", obj35, 1L);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2 + "'", int36 == 2);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2 + "'", int37 == 2);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertNotNull(obj41);
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test498");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        java.lang.Object obj6 = stackTestDriver4.push((java.lang.Object) false);
        java.lang.Object obj7 = stackTestDriver4.peek();
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        java.lang.Object obj10 = stackTestDriver8.push((java.lang.Object) (byte) 0);
        java.lang.Object obj11 = stackTestDriver4.push((java.lang.Object) (byte) 0);
        boolean boolean12 = stackTestDriver4.isEmpty();
        java.lang.Object obj13 = stackTestDriver4.peek();
        java.lang.Object obj14 = stackTestDriver0.push(obj13);
        boolean boolean15 = stackTestDriver0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + false + "'", obj6, false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + false + "'", obj7, false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) 0 + "'", obj10, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 0 + "'", obj11, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (byte) 0 + "'", obj13, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (byte) 0 + "'", obj14, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test499");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver1 = new experiment.util.StackTestDriver();
        java.lang.Object obj3 = stackTestDriver1.push((java.lang.Object) (byte) 0);
        java.lang.Object obj4 = stackTestDriver0.push(obj3);
        java.lang.Object obj5 = stackTestDriver0.pop();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 0 + "'", obj3, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 0 + "'", obj4, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) 0 + "'", obj5, (byte) 0);
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1321793073_1024_0.test500");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) false);
        java.lang.Object obj3 = stackTestDriver0.peek();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        java.lang.Object obj6 = stackTestDriver4.push((java.lang.Object) (byte) 0);
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) (byte) 0);
        boolean boolean8 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver11 = new experiment.util.StackTestDriver();
        java.lang.Object obj13 = stackTestDriver11.push((java.lang.Object) false);
        stackTestDriver11.clear();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        java.lang.Object obj17 = stackTestDriver15.push((java.lang.Object) false);
        java.lang.Object obj18 = stackTestDriver15.peek();
        experiment.util.StackTestDriver stackTestDriver19 = new experiment.util.StackTestDriver();
        java.lang.Object obj21 = stackTestDriver19.push((java.lang.Object) (byte) 0);
        java.lang.Object obj22 = stackTestDriver15.push((java.lang.Object) (byte) 0);
        java.lang.Object obj23 = stackTestDriver15.peek();
        java.lang.Object obj24 = stackTestDriver11.push((java.lang.Object) stackTestDriver15);
        java.lang.Object obj25 = stackTestDriver11.peek();
        java.lang.Object obj26 = stackTestDriver11.pop();
        java.lang.Object obj27 = stackTestDriver0.push(obj26);
        java.lang.Object obj28 = stackTestDriver0.peek();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        int int31 = stackTestDriver0.size();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + false + "'", obj2, false);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + false + "'", obj3, false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 0 + "'", obj6, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 0 + "'", obj7, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + false + "'", obj13, false);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + false + "'", obj17, false);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + false + "'", obj18, false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (byte) 0 + "'", obj21, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (byte) 0 + "'", obj22, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (byte) 0 + "'", obj23, (byte) 0);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }
}
