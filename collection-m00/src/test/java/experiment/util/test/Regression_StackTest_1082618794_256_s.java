package experiment.util.test;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Regression_StackTest_1082618794_256_s {

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
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test001");
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
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test002");
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
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test003");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test004");
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
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test005");
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
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test006");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Class<?> wildcardClass4 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test007");
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
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test008");
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
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test009");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        boolean boolean4 = stackTestDriver0.isEmpty();
        java.lang.Class<?> wildcardClass5 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test010");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        boolean boolean2 = stackTestDriver0.isEmpty();
        boolean boolean3 = stackTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test011");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        boolean boolean2 = stackTestDriver0.isEmpty();
        boolean boolean3 = stackTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test012");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        int int4 = stackTestDriver0.size();
        boolean boolean5 = stackTestDriver0.isEmpty();
        int int6 = stackTestDriver0.size();
        java.lang.Object obj7 = stackTestDriver0.pop();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 1 + "'", obj7, (byte) 1);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test013");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (short) 100);
        boolean boolean6 = stackTestDriver0.isEmpty();
        java.lang.Class<?> wildcardClass7 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) 100 + "'", obj5, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test014");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        java.lang.Object obj3 = stackTestDriver0.pop();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 1 + "'", obj3, (byte) 1);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test015");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        boolean boolean2 = stackTestDriver0.isEmpty();
        int int3 = stackTestDriver0.size();
        int int4 = stackTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test016");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        boolean boolean2 = stackTestDriver0.isEmpty();
        boolean boolean3 = stackTestDriver0.isEmpty();
        boolean boolean4 = stackTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test017");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        int int3 = stackTestDriver0.size();
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test018");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        java.lang.Class<?> wildcardClass3 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test019");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
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
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test020");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        int int4 = stackTestDriver0.size();
        boolean boolean5 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        java.lang.Object obj8 = stackTestDriver6.push((java.lang.Object) (byte) 1);
        boolean boolean9 = stackTestDriver6.isEmpty();
        int int10 = stackTestDriver6.size();
        boolean boolean11 = stackTestDriver6.isEmpty();
        int int12 = stackTestDriver6.size();
        java.lang.Object obj13 = stackTestDriver6.pop();
        java.lang.Object obj14 = stackTestDriver0.push((java.lang.Object) stackTestDriver6);
        java.lang.Class<?> wildcardClass15 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) 1 + "'", obj8, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (byte) 1 + "'", obj13, (byte) 1);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test021");
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
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test022");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Class<?> wildcardClass3 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test023");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        int int3 = stackTestDriver0.size();
        java.lang.Object obj4 = stackTestDriver0.peek();
        java.lang.Object obj5 = stackTestDriver0.pop();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 1 + "'", obj4, (byte) 1);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) 1 + "'", obj5, (byte) 1);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test024");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        int int3 = stackTestDriver0.size();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) 100L);
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100L + "'", obj5, 100L);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test025");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        java.lang.Object obj3 = stackTestDriver0.pop();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 1 + "'", obj3, (byte) 1);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test026");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (short) 100);
        java.lang.Object obj6 = stackTestDriver0.pop();
        stackTestDriver0.clear();
        boolean boolean8 = stackTestDriver0.isEmpty();
        int int9 = stackTestDriver0.size();
        java.lang.Object obj11 = stackTestDriver0.push((java.lang.Object) 1);
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) 100 + "'", obj5, (short) 100);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 100 + "'", obj6, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 1 + "'", obj11, 1);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test027");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        int int4 = stackTestDriver0.size();
        boolean boolean5 = stackTestDriver0.isEmpty();
        boolean boolean6 = stackTestDriver0.isEmpty();
        java.lang.Class<?> wildcardClass7 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test028");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        int int4 = stackTestDriver0.size();
        boolean boolean5 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        java.lang.Object obj8 = stackTestDriver6.push((java.lang.Object) (byte) 1);
        boolean boolean9 = stackTestDriver6.isEmpty();
        int int10 = stackTestDriver6.size();
        boolean boolean11 = stackTestDriver6.isEmpty();
        int int12 = stackTestDriver6.size();
        java.lang.Object obj13 = stackTestDriver6.pop();
        java.lang.Object obj14 = stackTestDriver0.push((java.lang.Object) stackTestDriver6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = stackTestDriver6.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) 1 + "'", obj8, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (byte) 1 + "'", obj13, (byte) 1);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test029");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        boolean boolean2 = stackTestDriver0.isEmpty();
        int int3 = stackTestDriver0.size();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (byte) 10);
        stackTestDriver0.clear();
        java.lang.Class<?> wildcardClass7 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) 10 + "'", obj5, (byte) 10);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test030");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        boolean boolean2 = stackTestDriver0.isEmpty();
        int int3 = stackTestDriver0.size();
        int int4 = stackTestDriver0.size();
        boolean boolean5 = stackTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test031");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        boolean boolean4 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) 1);
        boolean boolean8 = stackTestDriver5.isEmpty();
        int int9 = stackTestDriver5.size();
        boolean boolean10 = stackTestDriver5.isEmpty();
        int int11 = stackTestDriver5.size();
        java.lang.Object obj12 = stackTestDriver5.pop();
        java.lang.Object obj13 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 1 + "'", obj7, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) 1 + "'", obj12, (byte) 1);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test032");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        int int4 = stackTestDriver0.size();
        boolean boolean5 = stackTestDriver0.isEmpty();
        int int6 = stackTestDriver0.size();
        stackTestDriver0.clear();
        java.lang.Object obj8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = stackTestDriver0.push(obj8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test033");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (short) 100);
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) 100 + "'", obj5, (short) 100);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test034");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (short) 100);
        java.lang.Object obj6 = stackTestDriver0.pop();
        stackTestDriver0.clear();
        boolean boolean8 = stackTestDriver0.isEmpty();
        int int9 = stackTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) 100 + "'", obj5, (short) 100);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 100 + "'", obj6, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test035");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        boolean boolean2 = stackTestDriver0.isEmpty();
        int int3 = stackTestDriver0.size();
        int int4 = stackTestDriver0.size();
        stackTestDriver0.clear();
        int int6 = stackTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test036");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        int int4 = stackTestDriver0.size();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        java.lang.Object obj7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = stackTestDriver0.push(obj7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test037");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        boolean boolean2 = stackTestDriver0.isEmpty();
        int int3 = stackTestDriver0.size();
        int int4 = stackTestDriver0.size();
        stackTestDriver0.clear();
        int int6 = stackTestDriver0.size();
        int int7 = stackTestDriver0.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test038");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (short) 100);
        java.lang.Class<?> wildcardClass6 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) 100 + "'", obj5, (short) 100);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test039");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        int int4 = stackTestDriver0.size();
        boolean boolean5 = stackTestDriver0.isEmpty();
        int int6 = stackTestDriver0.size();
        java.lang.Object obj7 = stackTestDriver0.peek();
        boolean boolean8 = stackTestDriver0.isEmpty();
        java.lang.Class<?> wildcardClass9 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 1 + "'", obj7, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test040");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (short) 100);
        stackTestDriver0.clear();
        boolean boolean7 = stackTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) 100 + "'", obj5, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test041");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test042");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        boolean boolean2 = stackTestDriver0.isEmpty();
        int int3 = stackTestDriver0.size();
        int int4 = stackTestDriver0.size();
        boolean boolean5 = stackTestDriver0.isEmpty();
        java.lang.Class<?> wildcardClass6 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test043");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (short) 100);
        stackTestDriver0.clear();
        boolean boolean7 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) 100 + "'", obj5, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test044");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (short) 100);
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) 100 + "'", obj5, (short) 100);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test045");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (short) 100);
        java.lang.Object obj6 = stackTestDriver0.pop();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver9 = new experiment.util.StackTestDriver();
        java.lang.Object obj11 = stackTestDriver9.push((java.lang.Object) (byte) 1);
        boolean boolean12 = stackTestDriver9.isEmpty();
        java.lang.Object obj14 = stackTestDriver9.push((java.lang.Object) (short) 100);
        java.lang.Object obj15 = stackTestDriver0.push((java.lang.Object) (short) 100);
        boolean boolean16 = stackTestDriver0.isEmpty();
        java.lang.Object obj17 = stackTestDriver0.pop();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) 100 + "'", obj5, (short) 100);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 100 + "'", obj6, (short) 100);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 1 + "'", obj11, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (short) 100 + "'", obj14, (short) 100);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (short) 100 + "'", obj15, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (short) 100 + "'", obj17, (short) 100);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test046");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        boolean boolean2 = stackTestDriver0.isEmpty();
        int int3 = stackTestDriver0.size();
        int int4 = stackTestDriver0.size();
        boolean boolean5 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test047");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        int int3 = stackTestDriver0.size();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) 100L);
        int int6 = stackTestDriver0.size();
        boolean boolean7 = stackTestDriver0.isEmpty();
        java.lang.Class<?> wildcardClass8 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100L + "'", obj5, 100L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test048");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test049");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        boolean boolean4 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) 1);
        boolean boolean8 = stackTestDriver5.isEmpty();
        int int9 = stackTestDriver5.size();
        boolean boolean10 = stackTestDriver5.isEmpty();
        int int11 = stackTestDriver5.size();
        java.lang.Object obj12 = stackTestDriver5.pop();
        java.lang.Object obj13 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        java.lang.Class<?> wildcardClass14 = stackTestDriver5.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 1 + "'", obj7, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) 1 + "'", obj12, (byte) 1);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test050");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (short) 100);
        java.lang.Object obj6 = stackTestDriver0.pop();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver9 = new experiment.util.StackTestDriver();
        java.lang.Object obj11 = stackTestDriver9.push((java.lang.Object) (byte) 1);
        int int12 = stackTestDriver9.size();
        java.lang.Object obj13 = stackTestDriver9.peek();
        java.lang.Object obj14 = stackTestDriver9.pop();
        java.lang.Object obj15 = stackTestDriver0.push((java.lang.Object) stackTestDriver9);
        int int16 = stackTestDriver9.size();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) 100 + "'", obj5, (short) 100);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 100 + "'", obj6, (short) 100);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 1 + "'", obj11, (byte) 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (byte) 1 + "'", obj13, (byte) 1);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (byte) 1 + "'", obj14, (byte) 1);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test051");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (short) 100);
        java.lang.Object obj6 = stackTestDriver0.pop();
        stackTestDriver0.clear();
        boolean boolean8 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver9 = new experiment.util.StackTestDriver();
        java.lang.Object obj11 = stackTestDriver9.push((java.lang.Object) (byte) 1);
        boolean boolean12 = stackTestDriver9.isEmpty();
        int int13 = stackTestDriver9.size();
        boolean boolean14 = stackTestDriver9.isEmpty();
        int int15 = stackTestDriver9.size();
        java.lang.Object obj16 = stackTestDriver9.pop();
        java.lang.Object obj17 = stackTestDriver0.push(obj16);
        experiment.util.StackTestDriver stackTestDriver18 = new experiment.util.StackTestDriver();
        java.lang.Object obj20 = stackTestDriver18.push((java.lang.Object) (byte) 1);
        boolean boolean21 = stackTestDriver18.isEmpty();
        int int22 = stackTestDriver18.size();
        boolean boolean23 = stackTestDriver18.isEmpty();
        experiment.util.StackTestDriver stackTestDriver24 = new experiment.util.StackTestDriver();
        java.lang.Object obj26 = stackTestDriver24.push((java.lang.Object) (byte) 1);
        boolean boolean27 = stackTestDriver24.isEmpty();
        int int28 = stackTestDriver24.size();
        boolean boolean29 = stackTestDriver24.isEmpty();
        int int30 = stackTestDriver24.size();
        java.lang.Object obj31 = stackTestDriver24.pop();
        java.lang.Object obj32 = stackTestDriver18.push((java.lang.Object) stackTestDriver24);
        experiment.util.StackTestDriver stackTestDriver33 = new experiment.util.StackTestDriver();
        java.lang.Object obj35 = stackTestDriver33.push((java.lang.Object) (byte) 1);
        boolean boolean36 = stackTestDriver33.isEmpty();
        java.lang.Object obj38 = stackTestDriver33.push((java.lang.Object) (short) 100);
        java.lang.Object obj39 = stackTestDriver33.pop();
        stackTestDriver33.clear();
        boolean boolean41 = stackTestDriver33.isEmpty();
        java.lang.Class<?> wildcardClass42 = stackTestDriver33.getClass();
        java.lang.Object obj43 = stackTestDriver24.push((java.lang.Object) wildcardClass42);
        java.lang.Object obj44 = stackTestDriver0.push((java.lang.Object) wildcardClass42);
        java.lang.Object obj45 = stackTestDriver0.peek();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) 100 + "'", obj5, (short) 100);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 100 + "'", obj6, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 1 + "'", obj11, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (byte) 1 + "'", obj16, (byte) 1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) 1 + "'", obj17, (byte) 1);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (byte) 1 + "'", obj20, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + (byte) 1 + "'", obj26, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + (byte) 1 + "'", obj31, (byte) 1);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + (byte) 1 + "'", obj35, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + (short) 100 + "'", obj38, (short) 100);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + (short) 100 + "'", obj39, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
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
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test052");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (short) 100);
        java.lang.Object obj6 = stackTestDriver0.pop();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) 100 + "'", obj5, (short) 100);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 100 + "'", obj6, (short) 100);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test053");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (short) 100);
        java.lang.Object obj6 = stackTestDriver0.pop();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver9 = new experiment.util.StackTestDriver();
        java.lang.Object obj11 = stackTestDriver9.push((java.lang.Object) (byte) 1);
        int int12 = stackTestDriver9.size();
        java.lang.Object obj13 = stackTestDriver9.peek();
        java.lang.Object obj14 = stackTestDriver9.pop();
        java.lang.Object obj15 = stackTestDriver0.push((java.lang.Object) stackTestDriver9);
        boolean boolean16 = stackTestDriver9.isEmpty();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) 100 + "'", obj5, (short) 100);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 100 + "'", obj6, (short) 100);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 1 + "'", obj11, (byte) 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (byte) 1 + "'", obj13, (byte) 1);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (byte) 1 + "'", obj14, (byte) 1);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test054");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        int int4 = stackTestDriver0.size();
        boolean boolean5 = stackTestDriver0.isEmpty();
        int int6 = stackTestDriver0.size();
        stackTestDriver0.clear();
        java.lang.Class<?> wildcardClass8 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test055");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        int int3 = stackTestDriver0.size();
        java.lang.Object obj4 = stackTestDriver0.peek();
        java.lang.Object obj5 = stackTestDriver0.pop();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 1 + "'", obj4, (byte) 1);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) 1 + "'", obj5, (byte) 1);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test056");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        int int3 = stackTestDriver0.size();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) 1);
        int int8 = stackTestDriver5.size();
        stackTestDriver5.clear();
        java.lang.Object obj10 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        int int11 = stackTestDriver5.size();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 1 + "'", obj7, (byte) 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test057");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        int int3 = stackTestDriver0.size();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) 100L);
        int int6 = stackTestDriver0.size();
        boolean boolean7 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        java.lang.Class<?> wildcardClass9 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100L + "'", obj5, 100L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test058");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        boolean boolean2 = stackTestDriver0.isEmpty();
        int int3 = stackTestDriver0.size();
        int int4 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean6 = stackTestDriver0.isEmpty();
        java.lang.Class<?> wildcardClass7 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test059");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        int int4 = stackTestDriver0.size();
        boolean boolean5 = stackTestDriver0.isEmpty();
        int int6 = stackTestDriver0.size();
        java.lang.Object obj7 = stackTestDriver0.peek();
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 1 + "'", obj7, (byte) 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test060");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        java.lang.Class<?> wildcardClass2 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test061");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        int int4 = stackTestDriver0.size();
        boolean boolean5 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        java.lang.Object obj8 = stackTestDriver6.push((java.lang.Object) (byte) 1);
        boolean boolean9 = stackTestDriver6.isEmpty();
        int int10 = stackTestDriver6.size();
        boolean boolean11 = stackTestDriver6.isEmpty();
        int int12 = stackTestDriver6.size();
        java.lang.Object obj13 = stackTestDriver6.pop();
        java.lang.Object obj14 = stackTestDriver0.push((java.lang.Object) stackTestDriver6);
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        java.lang.Object obj17 = stackTestDriver15.push((java.lang.Object) (byte) 1);
        boolean boolean18 = stackTestDriver15.isEmpty();
        java.lang.Object obj20 = stackTestDriver15.push((java.lang.Object) (short) 100);
        java.lang.Object obj21 = stackTestDriver15.pop();
        stackTestDriver15.clear();
        boolean boolean23 = stackTestDriver15.isEmpty();
        java.lang.Class<?> wildcardClass24 = stackTestDriver15.getClass();
        java.lang.Object obj25 = stackTestDriver6.push((java.lang.Object) wildcardClass24);
        int int26 = stackTestDriver6.size();
        int int27 = stackTestDriver6.size();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) 1 + "'", obj8, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (byte) 1 + "'", obj13, (byte) 1);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) 1 + "'", obj17, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (short) 100 + "'", obj20, (short) 100);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (short) 100 + "'", obj21, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertEquals(obj25.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj25), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj25), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test062");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (short) 100);
        java.lang.Object obj6 = stackTestDriver0.pop();
        stackTestDriver0.clear();
        boolean boolean8 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver9 = new experiment.util.StackTestDriver();
        java.lang.Object obj11 = stackTestDriver9.push((java.lang.Object) (byte) 1);
        boolean boolean12 = stackTestDriver9.isEmpty();
        int int13 = stackTestDriver9.size();
        boolean boolean14 = stackTestDriver9.isEmpty();
        int int15 = stackTestDriver9.size();
        java.lang.Object obj16 = stackTestDriver9.pop();
        java.lang.Object obj17 = stackTestDriver0.push(obj16);
        stackTestDriver0.clear();
        boolean boolean19 = stackTestDriver0.isEmpty();
        java.lang.Class<?> wildcardClass20 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) 100 + "'", obj5, (short) 100);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 100 + "'", obj6, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 1 + "'", obj11, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (byte) 1 + "'", obj16, (byte) 1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) 1 + "'", obj17, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test063");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (short) 100);
        java.lang.Object obj6 = stackTestDriver0.pop();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver9 = new experiment.util.StackTestDriver();
        java.lang.Object obj11 = stackTestDriver9.push((java.lang.Object) (byte) 1);
        boolean boolean12 = stackTestDriver9.isEmpty();
        java.lang.Object obj14 = stackTestDriver9.push((java.lang.Object) (short) 100);
        java.lang.Object obj15 = stackTestDriver0.push((java.lang.Object) (short) 100);
        boolean boolean16 = stackTestDriver0.isEmpty();
        java.lang.Class<?> wildcardClass17 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) 100 + "'", obj5, (short) 100);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 100 + "'", obj6, (short) 100);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 1 + "'", obj11, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (short) 100 + "'", obj14, (short) 100);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (short) 100 + "'", obj15, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test064");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (short) 100);
        java.lang.Object obj6 = stackTestDriver0.pop();
        stackTestDriver0.clear();
        boolean boolean8 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver9 = new experiment.util.StackTestDriver();
        java.lang.Object obj11 = stackTestDriver9.push((java.lang.Object) (byte) 1);
        boolean boolean12 = stackTestDriver9.isEmpty();
        int int13 = stackTestDriver9.size();
        boolean boolean14 = stackTestDriver9.isEmpty();
        int int15 = stackTestDriver9.size();
        java.lang.Object obj16 = stackTestDriver9.pop();
        java.lang.Object obj17 = stackTestDriver0.push(obj16);
        stackTestDriver0.clear();
        java.lang.Class<?> wildcardClass19 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) 100 + "'", obj5, (short) 100);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 100 + "'", obj6, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 1 + "'", obj11, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (byte) 1 + "'", obj16, (byte) 1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) 1 + "'", obj17, (byte) 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test065");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        boolean boolean2 = stackTestDriver0.isEmpty();
        boolean boolean3 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        java.lang.Object obj6 = stackTestDriver4.push((java.lang.Object) (byte) 1);
        boolean boolean7 = stackTestDriver4.isEmpty();
        int int8 = stackTestDriver4.size();
        boolean boolean9 = stackTestDriver4.isEmpty();
        int int10 = stackTestDriver4.size();
        boolean boolean11 = stackTestDriver4.isEmpty();
        boolean boolean12 = stackTestDriver4.isEmpty();
        java.lang.Class<?> wildcardClass13 = stackTestDriver4.getClass();
        java.lang.Object obj14 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        java.lang.Class<?> wildcardClass15 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 1 + "'", obj6, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test066");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        int int3 = stackTestDriver0.size();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) 1);
        int int8 = stackTestDriver5.size();
        stackTestDriver5.clear();
        java.lang.Object obj10 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        java.lang.Class<?> wildcardClass11 = stackTestDriver5.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 1 + "'", obj7, (byte) 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test067");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        int int4 = stackTestDriver0.size();
        boolean boolean5 = stackTestDriver0.isEmpty();
        int int6 = stackTestDriver0.size();
        java.lang.Object obj7 = stackTestDriver0.peek();
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        java.lang.Object obj10 = stackTestDriver8.push((java.lang.Object) (byte) 1);
        boolean boolean11 = stackTestDriver8.isEmpty();
        int int12 = stackTestDriver8.size();
        stackTestDriver8.clear();
        stackTestDriver8.clear();
        java.lang.Object obj15 = stackTestDriver0.push((java.lang.Object) stackTestDriver8);
        experiment.util.StackTestDriver stackTestDriver16 = new experiment.util.StackTestDriver();
        java.lang.Object obj18 = stackTestDriver16.push((java.lang.Object) (byte) 1);
        boolean boolean19 = stackTestDriver16.isEmpty();
        int int20 = stackTestDriver16.size();
        stackTestDriver16.clear();
        int int22 = stackTestDriver16.size();
        java.lang.Object obj23 = stackTestDriver0.push((java.lang.Object) stackTestDriver16);
        int int24 = stackTestDriver16.size();
        java.lang.Object obj25 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = stackTestDriver16.push(obj25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 1 + "'", obj7, (byte) 1);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) 1 + "'", obj10, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (byte) 1 + "'", obj18, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test068");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        int int3 = stackTestDriver0.size();
        java.lang.Object obj4 = stackTestDriver0.peek();
        java.lang.Object obj5 = stackTestDriver0.pop();
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) (-1.0f));
        java.lang.Object obj8 = stackTestDriver0.peek();
        java.lang.Object obj9 = stackTestDriver0.peek();
        java.lang.Object obj10 = stackTestDriver0.peek();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 1 + "'", obj4, (byte) 1);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) 1 + "'", obj5, (byte) 1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0f) + "'", obj7, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0f) + "'", obj8, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (-1.0f) + "'", obj9, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (-1.0f) + "'", obj10, (-1.0f));
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test069");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        int int5 = stackTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test070");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (short) 100);
        java.lang.Object obj6 = stackTestDriver0.pop();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) 100 + "'", obj5, (short) 100);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 100 + "'", obj6, (short) 100);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test071");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        java.lang.Object obj3 = stackTestDriver0.push((java.lang.Object) 1.0d);
        boolean boolean4 = stackTestDriver0.isEmpty();
        java.lang.Class<?> wildcardClass5 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 1.0d + "'", obj3, 1.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test072");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        int int3 = stackTestDriver0.size();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) 1);
        int int8 = stackTestDriver5.size();
        stackTestDriver5.clear();
        java.lang.Object obj10 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        java.lang.Class<?> wildcardClass11 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 1 + "'", obj7, (byte) 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test073");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        int int4 = stackTestDriver0.size();
        boolean boolean5 = stackTestDriver0.isEmpty();
        int int6 = stackTestDriver0.size();
        boolean boolean7 = stackTestDriver0.isEmpty();
        boolean boolean8 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        java.lang.Class<?> wildcardClass10 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test074");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        int int3 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean5 = stackTestDriver0.isEmpty();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test075");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        int int3 = stackTestDriver0.size();
        java.lang.Object obj4 = stackTestDriver0.peek();
        java.lang.Object obj5 = stackTestDriver0.pop();
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) (-1.0f));
        java.lang.Object obj8 = stackTestDriver0.peek();
        java.lang.Object obj9 = stackTestDriver0.peek();
        java.lang.Object obj10 = stackTestDriver0.pop();
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 1 + "'", obj4, (byte) 1);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) 1 + "'", obj5, (byte) 1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0f) + "'", obj7, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0f) + "'", obj8, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (-1.0f) + "'", obj9, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (-1.0f) + "'", obj10, (-1.0f));
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test076");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (short) 100);
        java.lang.Object obj6 = stackTestDriver0.pop();
        stackTestDriver0.clear();
        boolean boolean8 = stackTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) 100 + "'", obj5, (short) 100);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 100 + "'", obj6, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test077");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        int int3 = stackTestDriver0.size();
        java.lang.Object obj4 = stackTestDriver0.peek();
        int int5 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean7 = stackTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 1 + "'", obj4, (byte) 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test078");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        int int4 = stackTestDriver0.size();
        boolean boolean5 = stackTestDriver0.isEmpty();
        boolean boolean6 = stackTestDriver0.isEmpty();
        java.lang.Object obj7 = stackTestDriver0.pop();
        java.lang.Class<?> wildcardClass8 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 1 + "'", obj7, (byte) 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test079");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        int int3 = stackTestDriver0.size();
        java.lang.Object obj4 = stackTestDriver0.peek();
        java.lang.Object obj5 = stackTestDriver0.pop();
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) (-1.0f));
        java.lang.Object obj8 = stackTestDriver0.peek();
        java.lang.Object obj9 = stackTestDriver0.peek();
        java.lang.Object obj10 = stackTestDriver0.pop();
        int int11 = stackTestDriver0.size();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 1 + "'", obj4, (byte) 1);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) 1 + "'", obj5, (byte) 1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0f) + "'", obj7, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0f) + "'", obj8, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (-1.0f) + "'", obj9, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (-1.0f) + "'", obj10, (-1.0f));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test080");
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
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test081");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        int int4 = stackTestDriver0.size();
        boolean boolean5 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        java.lang.Object obj8 = stackTestDriver6.push((java.lang.Object) (byte) 1);
        boolean boolean9 = stackTestDriver6.isEmpty();
        int int10 = stackTestDriver6.size();
        boolean boolean11 = stackTestDriver6.isEmpty();
        int int12 = stackTestDriver6.size();
        java.lang.Object obj13 = stackTestDriver6.pop();
        java.lang.Object obj14 = stackTestDriver0.push((java.lang.Object) stackTestDriver6);
        int int15 = stackTestDriver0.size();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver17 = new experiment.util.StackTestDriver();
        java.lang.Object obj19 = stackTestDriver17.push((java.lang.Object) (byte) 1);
        boolean boolean20 = stackTestDriver17.isEmpty();
        java.lang.Object obj22 = stackTestDriver17.push((java.lang.Object) (short) 100);
        java.lang.Object obj23 = stackTestDriver17.pop();
        java.lang.Class<?> wildcardClass24 = stackTestDriver17.getClass();
        java.lang.Object obj25 = stackTestDriver0.push((java.lang.Object) stackTestDriver17);
        stackTestDriver17.clear();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) 1 + "'", obj8, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (byte) 1 + "'", obj13, (byte) 1);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (byte) 1 + "'", obj19, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (short) 100 + "'", obj22, (short) 100);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (short) 100 + "'", obj23, (short) 100);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(obj25);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test082");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        boolean boolean2 = stackTestDriver0.isEmpty();
        int int3 = stackTestDriver0.size();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (byte) 10);
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) 10 + "'", obj5, (byte) 10);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test083");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        int int4 = stackTestDriver0.size();
        boolean boolean5 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        java.lang.Object obj8 = stackTestDriver6.push((java.lang.Object) (byte) 1);
        boolean boolean9 = stackTestDriver6.isEmpty();
        int int10 = stackTestDriver6.size();
        boolean boolean11 = stackTestDriver6.isEmpty();
        int int12 = stackTestDriver6.size();
        java.lang.Object obj13 = stackTestDriver6.pop();
        java.lang.Object obj14 = stackTestDriver0.push((java.lang.Object) stackTestDriver6);
        stackTestDriver6.clear();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) 1 + "'", obj8, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (byte) 1 + "'", obj13, (byte) 1);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test084");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        int int3 = stackTestDriver0.size();
        java.lang.Object obj4 = stackTestDriver0.peek();
        int int5 = stackTestDriver0.size();
        java.lang.Object obj6 = stackTestDriver0.pop();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 1 + "'", obj4, (byte) 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 1 + "'", obj6, (byte) 1);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test085");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        boolean boolean2 = stackTestDriver0.isEmpty();
        int int3 = stackTestDriver0.size();
        int int4 = stackTestDriver0.size();
        boolean boolean5 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        java.lang.Object obj8 = stackTestDriver6.push((java.lang.Object) (byte) 1);
        int int9 = stackTestDriver6.size();
        java.lang.Object obj10 = stackTestDriver6.peek();
        java.lang.Object obj11 = stackTestDriver6.pop();
        java.lang.Object obj12 = stackTestDriver0.push((java.lang.Object) stackTestDriver6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = stackTestDriver6.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) 1 + "'", obj8, (byte) 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) 1 + "'", obj10, (byte) 1);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 1 + "'", obj11, (byte) 1);
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test086");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        int int4 = stackTestDriver0.size();
        boolean boolean5 = stackTestDriver0.isEmpty();
        int int6 = stackTestDriver0.size();
        java.lang.Object obj7 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        java.lang.Object obj10 = stackTestDriver8.push((java.lang.Object) (byte) 1);
        boolean boolean11 = stackTestDriver8.isEmpty();
        int int12 = stackTestDriver8.size();
        boolean boolean13 = stackTestDriver8.isEmpty();
        experiment.util.StackTestDriver stackTestDriver14 = new experiment.util.StackTestDriver();
        java.lang.Object obj16 = stackTestDriver14.push((java.lang.Object) (byte) 1);
        boolean boolean17 = stackTestDriver14.isEmpty();
        int int18 = stackTestDriver14.size();
        boolean boolean19 = stackTestDriver14.isEmpty();
        int int20 = stackTestDriver14.size();
        java.lang.Object obj21 = stackTestDriver14.pop();
        java.lang.Object obj22 = stackTestDriver8.push((java.lang.Object) stackTestDriver14);
        int int23 = stackTestDriver8.size();
        stackTestDriver8.clear();
        experiment.util.StackTestDriver stackTestDriver25 = new experiment.util.StackTestDriver();
        java.lang.Object obj27 = stackTestDriver25.push((java.lang.Object) (byte) 1);
        boolean boolean28 = stackTestDriver25.isEmpty();
        java.lang.Object obj30 = stackTestDriver25.push((java.lang.Object) (short) 100);
        java.lang.Object obj31 = stackTestDriver25.pop();
        java.lang.Class<?> wildcardClass32 = stackTestDriver25.getClass();
        java.lang.Object obj33 = stackTestDriver8.push((java.lang.Object) stackTestDriver25);
        experiment.util.StackTestDriver stackTestDriver34 = new experiment.util.StackTestDriver();
        stackTestDriver34.clear();
        boolean boolean36 = stackTestDriver34.isEmpty();
        int int37 = stackTestDriver34.size();
        int int38 = stackTestDriver34.size();
        boolean boolean39 = stackTestDriver34.isEmpty();
        experiment.util.StackTestDriver stackTestDriver40 = new experiment.util.StackTestDriver();
        java.lang.Object obj42 = stackTestDriver40.push((java.lang.Object) (byte) 1);
        int int43 = stackTestDriver40.size();
        java.lang.Object obj44 = stackTestDriver40.peek();
        java.lang.Object obj45 = stackTestDriver40.pop();
        java.lang.Object obj46 = stackTestDriver34.push((java.lang.Object) stackTestDriver40);
        java.lang.Object obj47 = stackTestDriver8.push((java.lang.Object) stackTestDriver40);
        java.lang.Object obj48 = stackTestDriver8.peek();
        experiment.util.StackTestDriver stackTestDriver49 = new experiment.util.StackTestDriver();
        stackTestDriver49.clear();
        boolean boolean51 = stackTestDriver49.isEmpty();
        int int52 = stackTestDriver49.size();
        int int53 = stackTestDriver49.size();
        stackTestDriver49.clear();
        java.lang.Object obj55 = stackTestDriver8.push((java.lang.Object) stackTestDriver49);
        java.lang.Object obj56 = stackTestDriver0.push((java.lang.Object) stackTestDriver49);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj57 = stackTestDriver49.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 1 + "'", obj7, (byte) 1);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) 1 + "'", obj10, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (byte) 1 + "'", obj16, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (byte) 1 + "'", obj21, (byte) 1);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + (byte) 1 + "'", obj27, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + (short) 100 + "'", obj30, (short) 100);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + (short) 100 + "'", obj31, (short) 100);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + (byte) 1 + "'", obj42, (byte) 1);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + (byte) 1 + "'", obj44, (byte) 1);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + (byte) 1 + "'", obj45, (byte) 1);
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(obj55);
        org.junit.Assert.assertNotNull(obj56);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test087");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (short) 100);
        java.lang.Object obj6 = stackTestDriver0.pop();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver9 = new experiment.util.StackTestDriver();
        java.lang.Object obj11 = stackTestDriver9.push((java.lang.Object) (byte) 1);
        boolean boolean12 = stackTestDriver9.isEmpty();
        java.lang.Object obj14 = stackTestDriver9.push((java.lang.Object) (short) 100);
        java.lang.Object obj15 = stackTestDriver0.push((java.lang.Object) (short) 100);
        boolean boolean16 = stackTestDriver0.isEmpty();
        java.lang.Object obj17 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver18 = new experiment.util.StackTestDriver();
        java.lang.Object obj20 = stackTestDriver18.push((java.lang.Object) (byte) 1);
        boolean boolean21 = stackTestDriver18.isEmpty();
        java.lang.Object obj23 = stackTestDriver18.push((java.lang.Object) (short) 100);
        java.lang.Object obj24 = stackTestDriver18.pop();
        stackTestDriver18.clear();
        stackTestDriver18.clear();
        experiment.util.StackTestDriver stackTestDriver27 = new experiment.util.StackTestDriver();
        java.lang.Object obj29 = stackTestDriver27.push((java.lang.Object) (byte) 1);
        boolean boolean30 = stackTestDriver27.isEmpty();
        java.lang.Object obj32 = stackTestDriver27.push((java.lang.Object) (short) 100);
        java.lang.Object obj33 = stackTestDriver18.push((java.lang.Object) (short) 100);
        java.lang.Object obj34 = stackTestDriver0.push((java.lang.Object) (short) 100);
        experiment.util.StackTestDriver stackTestDriver35 = new experiment.util.StackTestDriver();
        java.lang.Object obj37 = stackTestDriver35.push((java.lang.Object) (byte) 1);
        boolean boolean38 = stackTestDriver35.isEmpty();
        int int39 = stackTestDriver35.size();
        boolean boolean40 = stackTestDriver35.isEmpty();
        int int41 = stackTestDriver35.size();
        java.lang.Object obj42 = stackTestDriver35.peek();
        experiment.util.StackTestDriver stackTestDriver43 = new experiment.util.StackTestDriver();
        java.lang.Object obj45 = stackTestDriver43.push((java.lang.Object) (byte) 1);
        boolean boolean46 = stackTestDriver43.isEmpty();
        int int47 = stackTestDriver43.size();
        stackTestDriver43.clear();
        stackTestDriver43.clear();
        java.lang.Object obj50 = stackTestDriver35.push((java.lang.Object) stackTestDriver43);
        java.lang.Class<?> wildcardClass51 = stackTestDriver43.getClass();
        java.lang.Object obj52 = stackTestDriver0.push((java.lang.Object) stackTestDriver43);
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) 100 + "'", obj5, (short) 100);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 100 + "'", obj6, (short) 100);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 1 + "'", obj11, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (short) 100 + "'", obj14, (short) 100);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (short) 100 + "'", obj15, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (short) 100 + "'", obj17, (short) 100);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (byte) 1 + "'", obj20, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (short) 100 + "'", obj23, (short) 100);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (short) 100 + "'", obj24, (short) 100);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + (byte) 1 + "'", obj29, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + (short) 100 + "'", obj32, (short) 100);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + (short) 100 + "'", obj33, (short) 100);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + (short) 100 + "'", obj34, (short) 100);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + (byte) 1 + "'", obj37, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + (byte) 1 + "'", obj42, (byte) 1);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + (byte) 1 + "'", obj45, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertNotNull(obj50);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNotNull(obj52);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test088");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (short) 100);
        java.lang.Object obj6 = stackTestDriver0.pop();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver9 = new experiment.util.StackTestDriver();
        java.lang.Object obj11 = stackTestDriver9.push((java.lang.Object) (byte) 1);
        boolean boolean12 = stackTestDriver9.isEmpty();
        java.lang.Object obj14 = stackTestDriver9.push((java.lang.Object) (short) 100);
        java.lang.Object obj15 = stackTestDriver0.push((java.lang.Object) (short) 100);
        boolean boolean16 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) 100 + "'", obj5, (short) 100);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 100 + "'", obj6, (short) 100);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 1 + "'", obj11, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (short) 100 + "'", obj14, (short) 100);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (short) 100 + "'", obj15, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test089");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        int int4 = stackTestDriver0.size();
        boolean boolean5 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        java.lang.Object obj8 = stackTestDriver6.push((java.lang.Object) (byte) 1);
        boolean boolean9 = stackTestDriver6.isEmpty();
        int int10 = stackTestDriver6.size();
        boolean boolean11 = stackTestDriver6.isEmpty();
        int int12 = stackTestDriver6.size();
        java.lang.Object obj13 = stackTestDriver6.pop();
        java.lang.Object obj14 = stackTestDriver0.push((java.lang.Object) stackTestDriver6);
        int int15 = stackTestDriver0.size();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver17 = new experiment.util.StackTestDriver();
        java.lang.Object obj19 = stackTestDriver17.push((java.lang.Object) (byte) 1);
        boolean boolean20 = stackTestDriver17.isEmpty();
        java.lang.Object obj22 = stackTestDriver17.push((java.lang.Object) (short) 100);
        java.lang.Object obj23 = stackTestDriver17.pop();
        java.lang.Class<?> wildcardClass24 = stackTestDriver17.getClass();
        java.lang.Object obj25 = stackTestDriver0.push((java.lang.Object) stackTestDriver17);
        boolean boolean26 = stackTestDriver17.isEmpty();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) 1 + "'", obj8, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (byte) 1 + "'", obj13, (byte) 1);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (byte) 1 + "'", obj19, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (short) 100 + "'", obj22, (short) 100);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (short) 100 + "'", obj23, (short) 100);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test090");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        int int3 = stackTestDriver0.size();
        java.lang.Object obj4 = stackTestDriver0.peek();
        int int5 = stackTestDriver0.size();
        stackTestDriver0.clear();
        java.lang.Class<?> wildcardClass7 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 1 + "'", obj4, (byte) 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test091");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        boolean boolean4 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) 1);
        boolean boolean8 = stackTestDriver5.isEmpty();
        int int9 = stackTestDriver5.size();
        boolean boolean10 = stackTestDriver5.isEmpty();
        int int11 = stackTestDriver5.size();
        java.lang.Object obj12 = stackTestDriver5.pop();
        java.lang.Object obj13 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        experiment.util.StackTestDriver stackTestDriver14 = new experiment.util.StackTestDriver();
        java.lang.Object obj16 = stackTestDriver14.push((java.lang.Object) (byte) 1);
        int int17 = stackTestDriver14.size();
        stackTestDriver14.clear();
        experiment.util.StackTestDriver stackTestDriver19 = new experiment.util.StackTestDriver();
        java.lang.Object obj21 = stackTestDriver19.push((java.lang.Object) (byte) 1);
        int int22 = stackTestDriver19.size();
        stackTestDriver19.clear();
        java.lang.Object obj24 = stackTestDriver14.push((java.lang.Object) stackTestDriver19);
        java.lang.Object obj25 = stackTestDriver0.push((java.lang.Object) stackTestDriver14);
        java.lang.Class<?> wildcardClass26 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 1 + "'", obj7, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) 1 + "'", obj12, (byte) 1);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (byte) 1 + "'", obj16, (byte) 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (byte) 1 + "'", obj21, (byte) 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test092");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        boolean boolean4 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) 1);
        boolean boolean8 = stackTestDriver5.isEmpty();
        int int9 = stackTestDriver5.size();
        boolean boolean10 = stackTestDriver5.isEmpty();
        int int11 = stackTestDriver5.size();
        java.lang.Object obj12 = stackTestDriver5.pop();
        java.lang.Object obj13 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = stackTestDriver5.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 1 + "'", obj7, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) 1 + "'", obj12, (byte) 1);
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test093");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        java.lang.Object obj6 = stackTestDriver4.push((java.lang.Object) (byte) 1);
        boolean boolean7 = stackTestDriver4.isEmpty();
        int int8 = stackTestDriver4.size();
        boolean boolean9 = stackTestDriver4.isEmpty();
        int int10 = stackTestDriver4.size();
        java.lang.Object obj11 = stackTestDriver4.peek();
        experiment.util.StackTestDriver stackTestDriver12 = new experiment.util.StackTestDriver();
        java.lang.Object obj14 = stackTestDriver12.push((java.lang.Object) (byte) 1);
        boolean boolean15 = stackTestDriver12.isEmpty();
        int int16 = stackTestDriver12.size();
        stackTestDriver12.clear();
        stackTestDriver12.clear();
        java.lang.Object obj19 = stackTestDriver4.push((java.lang.Object) stackTestDriver12);
        boolean boolean20 = stackTestDriver4.isEmpty();
        java.lang.Object obj21 = stackTestDriver0.push((java.lang.Object) boolean20);
        java.lang.Object obj22 = stackTestDriver0.peek();
        boolean boolean23 = stackTestDriver0.isEmpty();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 1 + "'", obj6, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 1 + "'", obj11, (byte) 1);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (byte) 1 + "'", obj14, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + false + "'", obj21, false);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + false + "'", obj22, false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test094");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        boolean boolean2 = stackTestDriver0.isEmpty();
        int int3 = stackTestDriver0.size();
        int int4 = stackTestDriver0.size();
        boolean boolean5 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        java.lang.Object obj8 = stackTestDriver6.push((java.lang.Object) (byte) 1);
        int int9 = stackTestDriver6.size();
        java.lang.Object obj10 = stackTestDriver6.peek();
        java.lang.Object obj11 = stackTestDriver6.pop();
        java.lang.Object obj12 = stackTestDriver0.push((java.lang.Object) stackTestDriver6);
        stackTestDriver6.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = stackTestDriver6.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) 1 + "'", obj8, (byte) 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) 1 + "'", obj10, (byte) 1);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 1 + "'", obj11, (byte) 1);
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test095");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        boolean boolean2 = stackTestDriver0.isEmpty();
        int int3 = stackTestDriver0.size();
        int int4 = stackTestDriver0.size();
        boolean boolean5 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        java.lang.Object obj8 = stackTestDriver6.push((java.lang.Object) (byte) 1);
        int int9 = stackTestDriver6.size();
        java.lang.Object obj10 = stackTestDriver6.peek();
        java.lang.Object obj11 = stackTestDriver6.pop();
        java.lang.Object obj12 = stackTestDriver0.push((java.lang.Object) stackTestDriver6);
        java.lang.Class<?> wildcardClass13 = obj12.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) 1 + "'", obj8, (byte) 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) 1 + "'", obj10, (byte) 1);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 1 + "'", obj11, (byte) 1);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test096");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        int int5 = stackTestDriver0.size();
        int int6 = stackTestDriver0.size();
        boolean boolean7 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver9 = new experiment.util.StackTestDriver();
        java.lang.Object obj11 = stackTestDriver9.push((java.lang.Object) (byte) 1);
        boolean boolean12 = stackTestDriver9.isEmpty();
        int int13 = stackTestDriver9.size();
        boolean boolean14 = stackTestDriver9.isEmpty();
        int int15 = stackTestDriver9.size();
        java.lang.Object obj16 = stackTestDriver9.peek();
        boolean boolean17 = stackTestDriver9.isEmpty();
        java.lang.Object obj18 = stackTestDriver0.push((java.lang.Object) stackTestDriver9);
        java.lang.Object obj19 = stackTestDriver0.pop();
        stackTestDriver0.clear();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 1 + "'", obj11, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (byte) 1 + "'", obj16, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(obj19);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test097");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        int int4 = stackTestDriver0.size();
        boolean boolean5 = stackTestDriver0.isEmpty();
        int int6 = stackTestDriver0.size();
        java.lang.Object obj7 = stackTestDriver0.peek();
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        java.lang.Object obj10 = stackTestDriver8.push((java.lang.Object) (byte) 1);
        boolean boolean11 = stackTestDriver8.isEmpty();
        int int12 = stackTestDriver8.size();
        stackTestDriver8.clear();
        stackTestDriver8.clear();
        java.lang.Object obj15 = stackTestDriver0.push((java.lang.Object) stackTestDriver8);
        experiment.util.StackTestDriver stackTestDriver16 = new experiment.util.StackTestDriver();
        java.lang.Object obj18 = stackTestDriver16.push((java.lang.Object) (byte) 1);
        boolean boolean19 = stackTestDriver16.isEmpty();
        int int20 = stackTestDriver16.size();
        stackTestDriver16.clear();
        int int22 = stackTestDriver16.size();
        java.lang.Object obj23 = stackTestDriver0.push((java.lang.Object) stackTestDriver16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = stackTestDriver16.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 1 + "'", obj7, (byte) 1);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) 1 + "'", obj10, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (byte) 1 + "'", obj18, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(obj23);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test098");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (short) 100);
        java.lang.Object obj6 = stackTestDriver0.pop();
        stackTestDriver0.clear();
        boolean boolean8 = stackTestDriver0.isEmpty();
        int int9 = stackTestDriver0.size();
        boolean boolean10 = stackTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) 100 + "'", obj5, (short) 100);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 100 + "'", obj6, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test099");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        int int4 = stackTestDriver0.size();
        boolean boolean5 = stackTestDriver0.isEmpty();
        int int6 = stackTestDriver0.size();
        java.lang.Object obj7 = stackTestDriver0.peek();
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        java.lang.Object obj10 = stackTestDriver8.push((java.lang.Object) (byte) 1);
        boolean boolean11 = stackTestDriver8.isEmpty();
        int int12 = stackTestDriver8.size();
        stackTestDriver8.clear();
        stackTestDriver8.clear();
        java.lang.Object obj15 = stackTestDriver0.push((java.lang.Object) stackTestDriver8);
        java.lang.Object obj16 = stackTestDriver0.pop();
        java.lang.Class<?> wildcardClass17 = obj16.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 1 + "'", obj7, (byte) 1);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) 1 + "'", obj10, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test100");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        boolean boolean2 = stackTestDriver0.isEmpty();
        int int3 = stackTestDriver0.size();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (byte) 10);
        int int6 = stackTestDriver0.size();
        java.lang.Object obj7 = stackTestDriver0.pop();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) 10 + "'", obj5, (byte) 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 10 + "'", obj7, (byte) 10);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test101");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (short) 100);
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        int int8 = stackTestDriver0.size();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) 100 + "'", obj5, (short) 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test102");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        java.lang.Object obj3 = stackTestDriver0.push((java.lang.Object) 1.0d);
        java.lang.Class<?> wildcardClass4 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 1.0d + "'", obj3, 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test103");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        java.lang.Object obj6 = stackTestDriver4.push((java.lang.Object) (byte) 1);
        boolean boolean7 = stackTestDriver4.isEmpty();
        int int8 = stackTestDriver4.size();
        boolean boolean9 = stackTestDriver4.isEmpty();
        int int10 = stackTestDriver4.size();
        java.lang.Object obj11 = stackTestDriver4.peek();
        experiment.util.StackTestDriver stackTestDriver12 = new experiment.util.StackTestDriver();
        java.lang.Object obj14 = stackTestDriver12.push((java.lang.Object) (byte) 1);
        boolean boolean15 = stackTestDriver12.isEmpty();
        int int16 = stackTestDriver12.size();
        stackTestDriver12.clear();
        stackTestDriver12.clear();
        java.lang.Object obj19 = stackTestDriver4.push((java.lang.Object) stackTestDriver12);
        boolean boolean20 = stackTestDriver4.isEmpty();
        java.lang.Object obj21 = stackTestDriver0.push((java.lang.Object) boolean20);
        java.lang.Object obj22 = stackTestDriver0.peek();
        java.lang.Class<?> wildcardClass23 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 1 + "'", obj6, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 1 + "'", obj11, (byte) 1);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (byte) 1 + "'", obj14, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + false + "'", obj21, false);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + false + "'", obj22, false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test104");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        int int4 = stackTestDriver0.size();
        boolean boolean5 = stackTestDriver0.isEmpty();
        int int6 = stackTestDriver0.size();
        java.lang.Object obj7 = stackTestDriver0.peek();
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        java.lang.Object obj10 = stackTestDriver8.push((java.lang.Object) (byte) 1);
        boolean boolean11 = stackTestDriver8.isEmpty();
        int int12 = stackTestDriver8.size();
        stackTestDriver8.clear();
        stackTestDriver8.clear();
        java.lang.Object obj15 = stackTestDriver0.push((java.lang.Object) stackTestDriver8);
        experiment.util.StackTestDriver stackTestDriver16 = new experiment.util.StackTestDriver();
        java.lang.Object obj18 = stackTestDriver16.push((java.lang.Object) (byte) 1);
        boolean boolean19 = stackTestDriver16.isEmpty();
        int int20 = stackTestDriver16.size();
        stackTestDriver16.clear();
        int int22 = stackTestDriver16.size();
        java.lang.Object obj23 = stackTestDriver0.push((java.lang.Object) stackTestDriver16);
        java.lang.Class<?> wildcardClass24 = obj23.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 1 + "'", obj7, (byte) 1);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) 1 + "'", obj10, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (byte) 1 + "'", obj18, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test105");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        boolean boolean4 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) 1);
        boolean boolean8 = stackTestDriver5.isEmpty();
        int int9 = stackTestDriver5.size();
        boolean boolean10 = stackTestDriver5.isEmpty();
        int int11 = stackTestDriver5.size();
        java.lang.Object obj12 = stackTestDriver5.pop();
        java.lang.Object obj13 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        experiment.util.StackTestDriver stackTestDriver14 = new experiment.util.StackTestDriver();
        java.lang.Object obj16 = stackTestDriver14.push((java.lang.Object) (byte) 1);
        int int17 = stackTestDriver14.size();
        stackTestDriver14.clear();
        experiment.util.StackTestDriver stackTestDriver19 = new experiment.util.StackTestDriver();
        java.lang.Object obj21 = stackTestDriver19.push((java.lang.Object) (byte) 1);
        int int22 = stackTestDriver19.size();
        stackTestDriver19.clear();
        java.lang.Object obj24 = stackTestDriver14.push((java.lang.Object) stackTestDriver19);
        java.lang.Object obj25 = stackTestDriver0.push((java.lang.Object) stackTestDriver14);
        java.lang.Class<?> wildcardClass26 = obj25.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 1 + "'", obj7, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) 1 + "'", obj12, (byte) 1);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (byte) 1 + "'", obj16, (byte) 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (byte) 1 + "'", obj21, (byte) 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test106");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        java.lang.Object obj3 = stackTestDriver0.peek();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 1 + "'", obj3, (byte) 1);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test107");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        int int4 = stackTestDriver0.size();
        boolean boolean5 = stackTestDriver0.isEmpty();
        boolean boolean6 = stackTestDriver0.isEmpty();
        java.lang.Object obj7 = stackTestDriver0.pop();
        int int8 = stackTestDriver0.size();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 1 + "'", obj7, (byte) 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test108");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        boolean boolean2 = stackTestDriver0.isEmpty();
        int int3 = stackTestDriver0.size();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (byte) 10);
        int int6 = stackTestDriver0.size();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) (-1L));
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        java.lang.Object obj12 = stackTestDriver10.push((java.lang.Object) (byte) 1);
        boolean boolean13 = stackTestDriver10.isEmpty();
        java.lang.Object obj15 = stackTestDriver10.push((java.lang.Object) (short) 100);
        java.lang.Object obj16 = stackTestDriver10.pop();
        stackTestDriver10.clear();
        stackTestDriver10.clear();
        experiment.util.StackTestDriver stackTestDriver19 = new experiment.util.StackTestDriver();
        java.lang.Object obj21 = stackTestDriver19.push((java.lang.Object) (byte) 1);
        int int22 = stackTestDriver19.size();
        java.lang.Object obj23 = stackTestDriver19.peek();
        java.lang.Object obj24 = stackTestDriver19.pop();
        java.lang.Object obj25 = stackTestDriver10.push((java.lang.Object) stackTestDriver19);
        java.lang.Object obj26 = stackTestDriver10.pop();
        java.lang.Object obj27 = stackTestDriver0.push((java.lang.Object) stackTestDriver10);
        java.lang.Class<?> wildcardClass28 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) 10 + "'", obj5, (byte) 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1L) + "'", obj8, (-1L));
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) 1 + "'", obj12, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (short) 100 + "'", obj15, (short) 100);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (short) 100 + "'", obj16, (short) 100);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (byte) 1 + "'", obj21, (byte) 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (byte) 1 + "'", obj23, (byte) 1);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (byte) 1 + "'", obj24, (byte) 1);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test109");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        int int4 = stackTestDriver0.size();
        boolean boolean5 = stackTestDriver0.isEmpty();
        int int6 = stackTestDriver0.size();
        java.lang.Object obj7 = stackTestDriver0.peek();
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        java.lang.Object obj10 = stackTestDriver8.push((java.lang.Object) (byte) 1);
        boolean boolean11 = stackTestDriver8.isEmpty();
        int int12 = stackTestDriver8.size();
        stackTestDriver8.clear();
        stackTestDriver8.clear();
        java.lang.Object obj15 = stackTestDriver0.push((java.lang.Object) stackTestDriver8);
        experiment.util.StackTestDriver stackTestDriver16 = new experiment.util.StackTestDriver();
        java.lang.Object obj18 = stackTestDriver16.push((java.lang.Object) (byte) 1);
        boolean boolean19 = stackTestDriver16.isEmpty();
        int int20 = stackTestDriver16.size();
        stackTestDriver16.clear();
        int int22 = stackTestDriver16.size();
        java.lang.Object obj23 = stackTestDriver0.push((java.lang.Object) stackTestDriver16);
        boolean boolean24 = stackTestDriver16.isEmpty();
        stackTestDriver16.clear();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 1 + "'", obj7, (byte) 1);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) 1 + "'", obj10, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (byte) 1 + "'", obj18, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test110");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.peek();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 1 + "'", obj4, (byte) 1);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test111");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        int int4 = stackTestDriver0.size();
        boolean boolean5 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        java.lang.Object obj8 = stackTestDriver6.push((java.lang.Object) (byte) 1);
        boolean boolean9 = stackTestDriver6.isEmpty();
        int int10 = stackTestDriver6.size();
        boolean boolean11 = stackTestDriver6.isEmpty();
        int int12 = stackTestDriver6.size();
        java.lang.Object obj13 = stackTestDriver6.pop();
        java.lang.Object obj14 = stackTestDriver0.push((java.lang.Object) stackTestDriver6);
        int int15 = stackTestDriver0.size();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver17 = new experiment.util.StackTestDriver();
        java.lang.Object obj19 = stackTestDriver17.push((java.lang.Object) (byte) 1);
        boolean boolean20 = stackTestDriver17.isEmpty();
        java.lang.Object obj22 = stackTestDriver17.push((java.lang.Object) (short) 100);
        java.lang.Object obj23 = stackTestDriver17.pop();
        java.lang.Class<?> wildcardClass24 = stackTestDriver17.getClass();
        java.lang.Object obj25 = stackTestDriver0.push((java.lang.Object) stackTestDriver17);
        experiment.util.StackTestDriver stackTestDriver26 = new experiment.util.StackTestDriver();
        stackTestDriver26.clear();
        boolean boolean28 = stackTestDriver26.isEmpty();
        int int29 = stackTestDriver26.size();
        int int30 = stackTestDriver26.size();
        boolean boolean31 = stackTestDriver26.isEmpty();
        experiment.util.StackTestDriver stackTestDriver32 = new experiment.util.StackTestDriver();
        java.lang.Object obj34 = stackTestDriver32.push((java.lang.Object) (byte) 1);
        int int35 = stackTestDriver32.size();
        java.lang.Object obj36 = stackTestDriver32.peek();
        java.lang.Object obj37 = stackTestDriver32.pop();
        java.lang.Object obj38 = stackTestDriver26.push((java.lang.Object) stackTestDriver32);
        java.lang.Object obj39 = stackTestDriver0.push((java.lang.Object) stackTestDriver32);
        java.lang.Object obj40 = stackTestDriver0.peek();
        experiment.util.StackTestDriver stackTestDriver41 = new experiment.util.StackTestDriver();
        stackTestDriver41.clear();
        boolean boolean43 = stackTestDriver41.isEmpty();
        int int44 = stackTestDriver41.size();
        int int45 = stackTestDriver41.size();
        stackTestDriver41.clear();
        java.lang.Object obj47 = stackTestDriver0.push((java.lang.Object) stackTestDriver41);
        stackTestDriver0.clear();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) 1 + "'", obj8, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (byte) 1 + "'", obj13, (byte) 1);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (byte) 1 + "'", obj19, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (short) 100 + "'", obj22, (short) 100);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (short) 100 + "'", obj23, (short) 100);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + (byte) 1 + "'", obj34, (byte) 1);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + (byte) 1 + "'", obj36, (byte) 1);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + (byte) 1 + "'", obj37, (byte) 1);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(obj47);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test112");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        int int4 = stackTestDriver0.size();
        boolean boolean5 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        java.lang.Object obj8 = stackTestDriver6.push((java.lang.Object) (byte) 1);
        boolean boolean9 = stackTestDriver6.isEmpty();
        int int10 = stackTestDriver6.size();
        boolean boolean11 = stackTestDriver6.isEmpty();
        int int12 = stackTestDriver6.size();
        java.lang.Object obj13 = stackTestDriver6.pop();
        java.lang.Object obj14 = stackTestDriver0.push((java.lang.Object) stackTestDriver6);
        int int15 = stackTestDriver0.size();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver17 = new experiment.util.StackTestDriver();
        java.lang.Object obj19 = stackTestDriver17.push((java.lang.Object) (byte) 1);
        boolean boolean20 = stackTestDriver17.isEmpty();
        java.lang.Object obj22 = stackTestDriver17.push((java.lang.Object) (short) 100);
        java.lang.Object obj23 = stackTestDriver17.pop();
        java.lang.Class<?> wildcardClass24 = stackTestDriver17.getClass();
        java.lang.Object obj25 = stackTestDriver0.push((java.lang.Object) stackTestDriver17);
        experiment.util.StackTestDriver stackTestDriver26 = new experiment.util.StackTestDriver();
        stackTestDriver26.clear();
        boolean boolean28 = stackTestDriver26.isEmpty();
        int int29 = stackTestDriver26.size();
        int int30 = stackTestDriver26.size();
        boolean boolean31 = stackTestDriver26.isEmpty();
        experiment.util.StackTestDriver stackTestDriver32 = new experiment.util.StackTestDriver();
        java.lang.Object obj34 = stackTestDriver32.push((java.lang.Object) (byte) 1);
        int int35 = stackTestDriver32.size();
        java.lang.Object obj36 = stackTestDriver32.peek();
        java.lang.Object obj37 = stackTestDriver32.pop();
        java.lang.Object obj38 = stackTestDriver26.push((java.lang.Object) stackTestDriver32);
        java.lang.Object obj39 = stackTestDriver0.push((java.lang.Object) stackTestDriver32);
        boolean boolean40 = stackTestDriver32.isEmpty();
        int int41 = stackTestDriver32.size();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) 1 + "'", obj8, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (byte) 1 + "'", obj13, (byte) 1);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (byte) 1 + "'", obj19, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (short) 100 + "'", obj22, (short) 100);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (short) 100 + "'", obj23, (short) 100);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + (byte) 1 + "'", obj34, (byte) 1);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + (byte) 1 + "'", obj36, (byte) 1);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + (byte) 1 + "'", obj37, (byte) 1);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test113");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        int int4 = stackTestDriver0.size();
        boolean boolean5 = stackTestDriver0.isEmpty();
        int int6 = stackTestDriver0.size();
        java.lang.Object obj7 = stackTestDriver0.peek();
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        java.lang.Object obj10 = stackTestDriver8.push((java.lang.Object) (byte) 1);
        boolean boolean11 = stackTestDriver8.isEmpty();
        int int12 = stackTestDriver8.size();
        stackTestDriver8.clear();
        stackTestDriver8.clear();
        java.lang.Object obj15 = stackTestDriver0.push((java.lang.Object) stackTestDriver8);
        stackTestDriver8.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = stackTestDriver8.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 1 + "'", obj7, (byte) 1);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) 1 + "'", obj10, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test114");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        int int4 = stackTestDriver0.size();
        java.lang.Object obj5 = stackTestDriver0.peek();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver7 = new experiment.util.StackTestDriver();
        java.lang.Object obj9 = stackTestDriver7.push((java.lang.Object) (byte) 1);
        boolean boolean10 = stackTestDriver7.isEmpty();
        java.lang.Object obj12 = stackTestDriver7.push((java.lang.Object) (short) 100);
        java.lang.Object obj13 = stackTestDriver7.pop();
        stackTestDriver7.clear();
        boolean boolean15 = stackTestDriver7.isEmpty();
        int int16 = stackTestDriver7.size();
        java.lang.Object obj18 = stackTestDriver7.push((java.lang.Object) 1);
        stackTestDriver7.clear();
        stackTestDriver7.clear();
        boolean boolean21 = stackTestDriver7.isEmpty();
        java.lang.Class<?> wildcardClass22 = stackTestDriver7.getClass();
        java.lang.Object obj23 = stackTestDriver0.push((java.lang.Object) wildcardClass22);
        java.lang.Object obj24 = stackTestDriver0.peek();
        java.lang.Class<?> wildcardClass25 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) 1 + "'", obj5, (byte) 1);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) 1 + "'", obj9, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (short) 100 + "'", obj12, (short) 100);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (short) 100 + "'", obj13, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 1 + "'", obj18, 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertEquals(obj23.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj23), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj23), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals(obj24.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj24), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj24), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test115");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (short) 100);
        java.lang.Object obj6 = stackTestDriver0.pop();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver9 = new experiment.util.StackTestDriver();
        java.lang.Object obj11 = stackTestDriver9.push((java.lang.Object) (byte) 1);
        boolean boolean12 = stackTestDriver9.isEmpty();
        java.lang.Object obj14 = stackTestDriver9.push((java.lang.Object) (short) 100);
        java.lang.Object obj15 = stackTestDriver0.push((java.lang.Object) (short) 100);
        java.lang.Object obj16 = stackTestDriver0.peek();
        java.lang.Object obj17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = stackTestDriver0.push(obj17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) 100 + "'", obj5, (short) 100);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 100 + "'", obj6, (short) 100);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 1 + "'", obj11, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (short) 100 + "'", obj14, (short) 100);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (short) 100 + "'", obj15, (short) 100);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (short) 100 + "'", obj16, (short) 100);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test116");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (short) 100);
        int int6 = stackTestDriver0.size();
        java.lang.Class<?> wildcardClass7 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) 100 + "'", obj5, (short) 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test117");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (short) 100);
        java.lang.Object obj6 = stackTestDriver0.pop();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver9 = new experiment.util.StackTestDriver();
        java.lang.Object obj11 = stackTestDriver9.push((java.lang.Object) (byte) 1);
        boolean boolean12 = stackTestDriver9.isEmpty();
        java.lang.Object obj14 = stackTestDriver9.push((java.lang.Object) (short) 100);
        java.lang.Object obj15 = stackTestDriver0.push((java.lang.Object) (short) 100);
        boolean boolean16 = stackTestDriver0.isEmpty();
        java.lang.Object obj17 = stackTestDriver0.peek();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) 100 + "'", obj5, (short) 100);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 100 + "'", obj6, (short) 100);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 1 + "'", obj11, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (short) 100 + "'", obj14, (short) 100);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (short) 100 + "'", obj15, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (short) 100 + "'", obj17, (short) 100);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test118");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        int int4 = stackTestDriver0.size();
        boolean boolean5 = stackTestDriver0.isEmpty();
        int int6 = stackTestDriver0.size();
        java.lang.Object obj7 = stackTestDriver0.peek();
        java.lang.Object obj8 = stackTestDriver0.pop();
        stackTestDriver0.clear();
        java.lang.Class<?> wildcardClass10 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 1 + "'", obj7, (byte) 1);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) 1 + "'", obj8, (byte) 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test119");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (short) 100);
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) 100 + "'", obj5, (short) 100);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test120");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        int int4 = stackTestDriver0.size();
        boolean boolean5 = stackTestDriver0.isEmpty();
        int int6 = stackTestDriver0.size();
        java.lang.Object obj7 = stackTestDriver0.peek();
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        java.lang.Object obj10 = stackTestDriver8.push((java.lang.Object) (byte) 1);
        boolean boolean11 = stackTestDriver8.isEmpty();
        int int12 = stackTestDriver8.size();
        stackTestDriver8.clear();
        stackTestDriver8.clear();
        java.lang.Object obj15 = stackTestDriver0.push((java.lang.Object) stackTestDriver8);
        experiment.util.StackTestDriver stackTestDriver16 = new experiment.util.StackTestDriver();
        java.lang.Object obj18 = stackTestDriver16.push((java.lang.Object) (byte) 1);
        boolean boolean19 = stackTestDriver16.isEmpty();
        int int20 = stackTestDriver16.size();
        stackTestDriver16.clear();
        int int22 = stackTestDriver16.size();
        java.lang.Object obj23 = stackTestDriver0.push((java.lang.Object) stackTestDriver16);
        java.lang.Object obj24 = stackTestDriver0.pop();
        java.lang.Object obj25 = stackTestDriver0.pop();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 1 + "'", obj7, (byte) 1);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) 1 + "'", obj10, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (byte) 1 + "'", obj18, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(obj25);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test121");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (short) 100);
        java.lang.Object obj6 = stackTestDriver0.pop();
        stackTestDriver0.clear();
        boolean boolean8 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver9 = new experiment.util.StackTestDriver();
        java.lang.Object obj11 = stackTestDriver9.push((java.lang.Object) (byte) 1);
        boolean boolean12 = stackTestDriver9.isEmpty();
        int int13 = stackTestDriver9.size();
        boolean boolean14 = stackTestDriver9.isEmpty();
        int int15 = stackTestDriver9.size();
        java.lang.Object obj16 = stackTestDriver9.pop();
        java.lang.Object obj17 = stackTestDriver0.push(obj16);
        java.lang.Object obj18 = stackTestDriver0.pop();
        java.lang.Object obj20 = stackTestDriver0.push((java.lang.Object) 1.0f);
        boolean boolean21 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver22 = new experiment.util.StackTestDriver();
        java.lang.Object obj24 = stackTestDriver22.push((java.lang.Object) (byte) 1);
        boolean boolean25 = stackTestDriver22.isEmpty();
        int int26 = stackTestDriver22.size();
        boolean boolean27 = stackTestDriver22.isEmpty();
        int int28 = stackTestDriver22.size();
        boolean boolean29 = stackTestDriver22.isEmpty();
        int int30 = stackTestDriver22.size();
        stackTestDriver22.clear();
        stackTestDriver22.clear();
        java.lang.Object obj33 = stackTestDriver0.push((java.lang.Object) stackTestDriver22);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj34 = stackTestDriver22.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) 100 + "'", obj5, (short) 100);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 100 + "'", obj6, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 1 + "'", obj11, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (byte) 1 + "'", obj16, (byte) 1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) 1 + "'", obj17, (byte) 1);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (byte) 1 + "'", obj18, (byte) 1);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 1.0f + "'", obj20, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (byte) 1 + "'", obj24, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(obj33);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test122");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        int int4 = stackTestDriver0.size();
        boolean boolean5 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver7 = new experiment.util.StackTestDriver();
        java.lang.Object obj9 = stackTestDriver7.push((java.lang.Object) (byte) 1);
        boolean boolean10 = stackTestDriver7.isEmpty();
        java.lang.Object obj12 = stackTestDriver7.push((java.lang.Object) (short) 100);
        java.lang.Object obj13 = stackTestDriver7.pop();
        stackTestDriver7.clear();
        boolean boolean15 = stackTestDriver7.isEmpty();
        experiment.util.StackTestDriver stackTestDriver16 = new experiment.util.StackTestDriver();
        java.lang.Object obj18 = stackTestDriver16.push((java.lang.Object) (byte) 1);
        boolean boolean19 = stackTestDriver16.isEmpty();
        int int20 = stackTestDriver16.size();
        boolean boolean21 = stackTestDriver16.isEmpty();
        int int22 = stackTestDriver16.size();
        java.lang.Object obj23 = stackTestDriver16.pop();
        java.lang.Object obj24 = stackTestDriver7.push(obj23);
        java.lang.Object obj25 = stackTestDriver0.push(obj23);
        java.lang.Class<?> wildcardClass26 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) 1 + "'", obj9, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (short) 100 + "'", obj12, (short) 100);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (short) 100 + "'", obj13, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (byte) 1 + "'", obj18, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (byte) 1 + "'", obj23, (byte) 1);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (byte) 1 + "'", obj24, (byte) 1);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (byte) 1 + "'", obj25, (byte) 1);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test123");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        boolean boolean4 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) 1);
        boolean boolean8 = stackTestDriver5.isEmpty();
        int int9 = stackTestDriver5.size();
        boolean boolean10 = stackTestDriver5.isEmpty();
        int int11 = stackTestDriver5.size();
        java.lang.Object obj12 = stackTestDriver5.pop();
        java.lang.Object obj13 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        java.lang.Class<?> wildcardClass14 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 1 + "'", obj7, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) 1 + "'", obj12, (byte) 1);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test124");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (short) 100);
        java.lang.Object obj6 = stackTestDriver0.pop();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver9 = new experiment.util.StackTestDriver();
        java.lang.Object obj11 = stackTestDriver9.push((java.lang.Object) (byte) 1);
        boolean boolean12 = stackTestDriver9.isEmpty();
        java.lang.Object obj14 = stackTestDriver9.push((java.lang.Object) (short) 100);
        java.lang.Object obj15 = stackTestDriver0.push((java.lang.Object) (short) 100);
        boolean boolean16 = stackTestDriver0.isEmpty();
        java.lang.Object obj17 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver18 = new experiment.util.StackTestDriver();
        java.lang.Object obj20 = stackTestDriver18.push((java.lang.Object) (byte) 1);
        boolean boolean21 = stackTestDriver18.isEmpty();
        java.lang.Object obj23 = stackTestDriver18.push((java.lang.Object) (short) 100);
        java.lang.Object obj24 = stackTestDriver18.pop();
        stackTestDriver18.clear();
        stackTestDriver18.clear();
        experiment.util.StackTestDriver stackTestDriver27 = new experiment.util.StackTestDriver();
        java.lang.Object obj29 = stackTestDriver27.push((java.lang.Object) (byte) 1);
        boolean boolean30 = stackTestDriver27.isEmpty();
        java.lang.Object obj32 = stackTestDriver27.push((java.lang.Object) (short) 100);
        java.lang.Object obj33 = stackTestDriver18.push((java.lang.Object) (short) 100);
        java.lang.Object obj34 = stackTestDriver0.push((java.lang.Object) (short) 100);
        java.lang.Class<?> wildcardClass35 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) 100 + "'", obj5, (short) 100);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 100 + "'", obj6, (short) 100);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 1 + "'", obj11, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (short) 100 + "'", obj14, (short) 100);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (short) 100 + "'", obj15, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (short) 100 + "'", obj17, (short) 100);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (byte) 1 + "'", obj20, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (short) 100 + "'", obj23, (short) 100);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (short) 100 + "'", obj24, (short) 100);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + (byte) 1 + "'", obj29, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + (short) 100 + "'", obj32, (short) 100);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + (short) 100 + "'", obj33, (short) 100);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + (short) 100 + "'", obj34, (short) 100);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test125");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (short) 100);
        java.lang.Object obj6 = stackTestDriver0.pop();
        stackTestDriver0.clear();
        boolean boolean8 = stackTestDriver0.isEmpty();
        int int9 = stackTestDriver0.size();
        java.lang.Object obj11 = stackTestDriver0.push((java.lang.Object) 1);
        java.lang.Object obj12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = stackTestDriver0.push(obj12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) 100 + "'", obj5, (short) 100);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 100 + "'", obj6, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 1 + "'", obj11, 1);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test126");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        int int5 = stackTestDriver0.size();
        int int6 = stackTestDriver0.size();
        boolean boolean7 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        java.lang.Class<?> wildcardClass9 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test127");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        int int4 = stackTestDriver0.size();
        boolean boolean5 = stackTestDriver0.isEmpty();
        int int6 = stackTestDriver0.size();
        java.lang.Object obj7 = stackTestDriver0.peek();
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        java.lang.Object obj10 = stackTestDriver8.push((java.lang.Object) (byte) 1);
        boolean boolean11 = stackTestDriver8.isEmpty();
        int int12 = stackTestDriver8.size();
        stackTestDriver8.clear();
        stackTestDriver8.clear();
        java.lang.Object obj15 = stackTestDriver0.push((java.lang.Object) stackTestDriver8);
        experiment.util.StackTestDriver stackTestDriver16 = new experiment.util.StackTestDriver();
        java.lang.Object obj18 = stackTestDriver16.push((java.lang.Object) (byte) 1);
        boolean boolean19 = stackTestDriver16.isEmpty();
        int int20 = stackTestDriver16.size();
        stackTestDriver16.clear();
        int int22 = stackTestDriver16.size();
        java.lang.Object obj23 = stackTestDriver0.push((java.lang.Object) stackTestDriver16);
        java.lang.Object obj25 = stackTestDriver0.push((java.lang.Object) (-1.0d));
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 1 + "'", obj7, (byte) 1);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) 1 + "'", obj10, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (byte) 1 + "'", obj18, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (-1.0d) + "'", obj25, (-1.0d));
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test128");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (short) 100);
        java.lang.Object obj6 = stackTestDriver0.pop();
        stackTestDriver0.clear();
        boolean boolean8 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver9 = new experiment.util.StackTestDriver();
        java.lang.Object obj11 = stackTestDriver9.push((java.lang.Object) (byte) 1);
        boolean boolean12 = stackTestDriver9.isEmpty();
        int int13 = stackTestDriver9.size();
        boolean boolean14 = stackTestDriver9.isEmpty();
        int int15 = stackTestDriver9.size();
        java.lang.Object obj16 = stackTestDriver9.pop();
        java.lang.Object obj17 = stackTestDriver0.push(obj16);
        java.lang.Object obj18 = stackTestDriver0.pop();
        java.lang.Class<?> wildcardClass19 = obj18.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) 100 + "'", obj5, (short) 100);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 100 + "'", obj6, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 1 + "'", obj11, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (byte) 1 + "'", obj16, (byte) 1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) 1 + "'", obj17, (byte) 1);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (byte) 1 + "'", obj18, (byte) 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test129");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (short) 100);
        stackTestDriver0.clear();
        boolean boolean7 = stackTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) 100 + "'", obj5, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test130");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        boolean boolean2 = stackTestDriver0.isEmpty();
        boolean boolean3 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        java.lang.Object obj6 = stackTestDriver4.push((java.lang.Object) (byte) 1);
        boolean boolean7 = stackTestDriver4.isEmpty();
        int int8 = stackTestDriver4.size();
        boolean boolean9 = stackTestDriver4.isEmpty();
        int int10 = stackTestDriver4.size();
        boolean boolean11 = stackTestDriver4.isEmpty();
        boolean boolean12 = stackTestDriver4.isEmpty();
        java.lang.Class<?> wildcardClass13 = stackTestDriver4.getClass();
        java.lang.Object obj14 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        java.lang.Object obj15 = stackTestDriver4.pop();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 1 + "'", obj6, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (byte) 1 + "'", obj15, (byte) 1);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test131");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        int int4 = stackTestDriver0.size();
        boolean boolean5 = stackTestDriver0.isEmpty();
        int int6 = stackTestDriver0.size();
        java.lang.Object obj7 = stackTestDriver0.peek();
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        java.lang.Object obj10 = stackTestDriver8.push((java.lang.Object) (byte) 1);
        boolean boolean11 = stackTestDriver8.isEmpty();
        int int12 = stackTestDriver8.size();
        stackTestDriver8.clear();
        stackTestDriver8.clear();
        java.lang.Object obj15 = stackTestDriver0.push((java.lang.Object) stackTestDriver8);
        int int16 = stackTestDriver8.size();
        boolean boolean17 = stackTestDriver8.isEmpty();
        java.lang.Class<?> wildcardClass18 = stackTestDriver8.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 1 + "'", obj7, (byte) 1);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) 1 + "'", obj10, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test132");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        boolean boolean4 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) 1);
        boolean boolean8 = stackTestDriver5.isEmpty();
        int int9 = stackTestDriver5.size();
        boolean boolean10 = stackTestDriver5.isEmpty();
        int int11 = stackTestDriver5.size();
        java.lang.Object obj12 = stackTestDriver5.pop();
        java.lang.Object obj13 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        experiment.util.StackTestDriver stackTestDriver14 = new experiment.util.StackTestDriver();
        java.lang.Object obj16 = stackTestDriver14.push((java.lang.Object) (byte) 1);
        int int17 = stackTestDriver14.size();
        stackTestDriver14.clear();
        experiment.util.StackTestDriver stackTestDriver19 = new experiment.util.StackTestDriver();
        java.lang.Object obj21 = stackTestDriver19.push((java.lang.Object) (byte) 1);
        int int22 = stackTestDriver19.size();
        stackTestDriver19.clear();
        java.lang.Object obj24 = stackTestDriver14.push((java.lang.Object) stackTestDriver19);
        java.lang.Object obj25 = stackTestDriver0.push((java.lang.Object) stackTestDriver14);
        stackTestDriver0.clear();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 1 + "'", obj7, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) 1 + "'", obj12, (byte) 1);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (byte) 1 + "'", obj16, (byte) 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (byte) 1 + "'", obj21, (byte) 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(obj25);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test133");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        boolean boolean4 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) 1);
        boolean boolean8 = stackTestDriver5.isEmpty();
        int int9 = stackTestDriver5.size();
        boolean boolean10 = stackTestDriver5.isEmpty();
        int int11 = stackTestDriver5.size();
        java.lang.Object obj12 = stackTestDriver5.pop();
        java.lang.Object obj13 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        int int14 = stackTestDriver0.size();
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 1 + "'", obj7, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) 1 + "'", obj12, (byte) 1);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test134");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        boolean boolean2 = stackTestDriver0.isEmpty();
        int int3 = stackTestDriver0.size();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (byte) 10);
        int int6 = stackTestDriver0.size();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) (-1L));
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        java.lang.Object obj12 = stackTestDriver10.push((java.lang.Object) (byte) 1);
        boolean boolean13 = stackTestDriver10.isEmpty();
        java.lang.Object obj15 = stackTestDriver10.push((java.lang.Object) (short) 100);
        java.lang.Object obj16 = stackTestDriver10.pop();
        stackTestDriver10.clear();
        stackTestDriver10.clear();
        experiment.util.StackTestDriver stackTestDriver19 = new experiment.util.StackTestDriver();
        java.lang.Object obj21 = stackTestDriver19.push((java.lang.Object) (byte) 1);
        int int22 = stackTestDriver19.size();
        java.lang.Object obj23 = stackTestDriver19.peek();
        java.lang.Object obj24 = stackTestDriver19.pop();
        java.lang.Object obj25 = stackTestDriver10.push((java.lang.Object) stackTestDriver19);
        java.lang.Object obj26 = stackTestDriver10.pop();
        java.lang.Object obj27 = stackTestDriver0.push((java.lang.Object) stackTestDriver10);
        stackTestDriver0.clear();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) 10 + "'", obj5, (byte) 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1L) + "'", obj8, (-1L));
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) 1 + "'", obj12, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (short) 100 + "'", obj15, (short) 100);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (short) 100 + "'", obj16, (short) 100);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (byte) 1 + "'", obj21, (byte) 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (byte) 1 + "'", obj23, (byte) 1);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (byte) 1 + "'", obj24, (byte) 1);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNotNull(obj27);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test135");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        boolean boolean2 = stackTestDriver0.isEmpty();
        int int3 = stackTestDriver0.size();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (byte) 10);
        int int6 = stackTestDriver0.size();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) (-1L));
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) 10 + "'", obj5, (byte) 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1L) + "'", obj8, (-1L));
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test136");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        boolean boolean2 = stackTestDriver0.isEmpty();
        int int3 = stackTestDriver0.size();
        int int4 = stackTestDriver0.size();
        boolean boolean5 = stackTestDriver0.isEmpty();
        int int6 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean8 = stackTestDriver0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test137");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        int int3 = stackTestDriver0.size();
        int int4 = stackTestDriver0.size();
        int int5 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        java.lang.Object obj8 = stackTestDriver6.push((java.lang.Object) (byte) 1);
        boolean boolean9 = stackTestDriver6.isEmpty();
        int int10 = stackTestDriver6.size();
        boolean boolean11 = stackTestDriver6.isEmpty();
        int int12 = stackTestDriver6.size();
        java.lang.Object obj13 = stackTestDriver6.peek();
        experiment.util.StackTestDriver stackTestDriver14 = new experiment.util.StackTestDriver();
        java.lang.Object obj16 = stackTestDriver14.push((java.lang.Object) (byte) 1);
        boolean boolean17 = stackTestDriver14.isEmpty();
        int int18 = stackTestDriver14.size();
        stackTestDriver14.clear();
        stackTestDriver14.clear();
        java.lang.Object obj21 = stackTestDriver6.push((java.lang.Object) stackTestDriver14);
        stackTestDriver14.clear();
        int int23 = stackTestDriver14.size();
        java.lang.Object obj24 = stackTestDriver0.push((java.lang.Object) int23);
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) 1 + "'", obj8, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (byte) 1 + "'", obj13, (byte) 1);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (byte) 1 + "'", obj16, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 0 + "'", obj24, 0);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test138");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        int int4 = stackTestDriver0.size();
        boolean boolean5 = stackTestDriver0.isEmpty();
        int int6 = stackTestDriver0.size();
        boolean boolean7 = stackTestDriver0.isEmpty();
        int int8 = stackTestDriver0.size();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        boolean boolean11 = stackTestDriver0.isEmpty();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test139");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        int int4 = stackTestDriver0.size();
        boolean boolean5 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        java.lang.Object obj8 = stackTestDriver6.push((java.lang.Object) (byte) 1);
        boolean boolean9 = stackTestDriver6.isEmpty();
        int int10 = stackTestDriver6.size();
        boolean boolean11 = stackTestDriver6.isEmpty();
        int int12 = stackTestDriver6.size();
        java.lang.Object obj13 = stackTestDriver6.pop();
        java.lang.Object obj14 = stackTestDriver0.push((java.lang.Object) stackTestDriver6);
        int int15 = stackTestDriver0.size();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver17 = new experiment.util.StackTestDriver();
        java.lang.Object obj19 = stackTestDriver17.push((java.lang.Object) (byte) 1);
        boolean boolean20 = stackTestDriver17.isEmpty();
        java.lang.Object obj22 = stackTestDriver17.push((java.lang.Object) (short) 100);
        java.lang.Object obj23 = stackTestDriver17.pop();
        java.lang.Class<?> wildcardClass24 = stackTestDriver17.getClass();
        java.lang.Object obj25 = stackTestDriver0.push((java.lang.Object) stackTestDriver17);
        experiment.util.StackTestDriver stackTestDriver26 = new experiment.util.StackTestDriver();
        stackTestDriver26.clear();
        boolean boolean28 = stackTestDriver26.isEmpty();
        int int29 = stackTestDriver26.size();
        int int30 = stackTestDriver26.size();
        boolean boolean31 = stackTestDriver26.isEmpty();
        experiment.util.StackTestDriver stackTestDriver32 = new experiment.util.StackTestDriver();
        java.lang.Object obj34 = stackTestDriver32.push((java.lang.Object) (byte) 1);
        int int35 = stackTestDriver32.size();
        java.lang.Object obj36 = stackTestDriver32.peek();
        java.lang.Object obj37 = stackTestDriver32.pop();
        java.lang.Object obj38 = stackTestDriver26.push((java.lang.Object) stackTestDriver32);
        java.lang.Object obj39 = stackTestDriver0.push((java.lang.Object) stackTestDriver32);
        boolean boolean40 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) 1 + "'", obj8, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (byte) 1 + "'", obj13, (byte) 1);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (byte) 1 + "'", obj19, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (short) 100 + "'", obj22, (short) 100);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (short) 100 + "'", obj23, (short) 100);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + (byte) 1 + "'", obj34, (byte) 1);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + (byte) 1 + "'", obj36, (byte) 1);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + (byte) 1 + "'", obj37, (byte) 1);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test140");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        boolean boolean4 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) 1);
        boolean boolean8 = stackTestDriver5.isEmpty();
        int int9 = stackTestDriver5.size();
        boolean boolean10 = stackTestDriver5.isEmpty();
        int int11 = stackTestDriver5.size();
        java.lang.Object obj12 = stackTestDriver5.pop();
        java.lang.Object obj13 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        int int14 = stackTestDriver0.size();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver16 = new experiment.util.StackTestDriver();
        java.lang.Object obj18 = stackTestDriver16.push((java.lang.Object) (byte) 1);
        boolean boolean19 = stackTestDriver16.isEmpty();
        int int20 = stackTestDriver16.size();
        boolean boolean21 = stackTestDriver16.isEmpty();
        experiment.util.StackTestDriver stackTestDriver22 = new experiment.util.StackTestDriver();
        java.lang.Object obj24 = stackTestDriver22.push((java.lang.Object) (byte) 1);
        boolean boolean25 = stackTestDriver22.isEmpty();
        int int26 = stackTestDriver22.size();
        boolean boolean27 = stackTestDriver22.isEmpty();
        int int28 = stackTestDriver22.size();
        java.lang.Object obj29 = stackTestDriver22.pop();
        java.lang.Object obj30 = stackTestDriver16.push((java.lang.Object) stackTestDriver22);
        int int31 = stackTestDriver16.size();
        stackTestDriver16.clear();
        experiment.util.StackTestDriver stackTestDriver33 = new experiment.util.StackTestDriver();
        java.lang.Object obj35 = stackTestDriver33.push((java.lang.Object) (byte) 1);
        boolean boolean36 = stackTestDriver33.isEmpty();
        java.lang.Object obj38 = stackTestDriver33.push((java.lang.Object) (short) 100);
        java.lang.Object obj39 = stackTestDriver33.pop();
        java.lang.Class<?> wildcardClass40 = stackTestDriver33.getClass();
        java.lang.Object obj41 = stackTestDriver16.push((java.lang.Object) stackTestDriver33);
        experiment.util.StackTestDriver stackTestDriver42 = new experiment.util.StackTestDriver();
        stackTestDriver42.clear();
        boolean boolean44 = stackTestDriver42.isEmpty();
        int int45 = stackTestDriver42.size();
        int int46 = stackTestDriver42.size();
        boolean boolean47 = stackTestDriver42.isEmpty();
        experiment.util.StackTestDriver stackTestDriver48 = new experiment.util.StackTestDriver();
        java.lang.Object obj50 = stackTestDriver48.push((java.lang.Object) (byte) 1);
        int int51 = stackTestDriver48.size();
        java.lang.Object obj52 = stackTestDriver48.peek();
        java.lang.Object obj53 = stackTestDriver48.pop();
        java.lang.Object obj54 = stackTestDriver42.push((java.lang.Object) stackTestDriver48);
        java.lang.Object obj55 = stackTestDriver16.push((java.lang.Object) stackTestDriver48);
        int int56 = stackTestDriver16.size();
        java.lang.Object obj57 = stackTestDriver16.peek();
        java.lang.Object obj58 = stackTestDriver0.push((java.lang.Object) stackTestDriver16);
        java.lang.Class<?> wildcardClass59 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 1 + "'", obj7, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) 1 + "'", obj12, (byte) 1);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (byte) 1 + "'", obj18, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (byte) 1 + "'", obj24, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + (byte) 1 + "'", obj29, (byte) 1);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2 + "'", int31 == 2);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + (byte) 1 + "'", obj35, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + (short) 100 + "'", obj38, (short) 100);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + (short) 100 + "'", obj39, (short) 100);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + (byte) 1 + "'", obj50, (byte) 1);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertEquals("'" + obj52 + "' != '" + (byte) 1 + "'", obj52, (byte) 1);
        org.junit.Assert.assertEquals("'" + obj53 + "' != '" + (byte) 1 + "'", obj53, (byte) 1);
        org.junit.Assert.assertNotNull(obj54);
        org.junit.Assert.assertNotNull(obj55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 2 + "'", int56 == 2);
        org.junit.Assert.assertNotNull(obj57);
        org.junit.Assert.assertNotNull(obj58);
        org.junit.Assert.assertNotNull(wildcardClass59);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test141");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (short) 100);
        java.lang.Object obj6 = stackTestDriver0.pop();
        stackTestDriver0.clear();
        boolean boolean8 = stackTestDriver0.isEmpty();
        int int9 = stackTestDriver0.size();
        java.lang.Object obj11 = stackTestDriver0.push((java.lang.Object) 1);
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        boolean boolean14 = stackTestDriver0.isEmpty();
        boolean boolean15 = stackTestDriver0.isEmpty();
        java.lang.Class<?> wildcardClass16 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) 100 + "'", obj5, (short) 100);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 100 + "'", obj6, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 1 + "'", obj11, 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test142");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        int int3 = stackTestDriver0.size();
        java.lang.Object obj4 = stackTestDriver0.peek();
        java.lang.Object obj5 = stackTestDriver0.pop();
        stackTestDriver0.clear();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 1 + "'", obj4, (byte) 1);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) 1 + "'", obj5, (byte) 1);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test143");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        int int4 = stackTestDriver0.size();
        boolean boolean5 = stackTestDriver0.isEmpty();
        java.lang.Object obj6 = stackTestDriver0.pop();
        boolean boolean7 = stackTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 1 + "'", obj6, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test144");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        int int5 = stackTestDriver0.size();
        java.lang.Class<?> wildcardClass6 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test145");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (short) 100);
        java.lang.Object obj6 = stackTestDriver0.pop();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver9 = new experiment.util.StackTestDriver();
        java.lang.Object obj11 = stackTestDriver9.push((java.lang.Object) (byte) 1);
        boolean boolean12 = stackTestDriver9.isEmpty();
        java.lang.Object obj14 = stackTestDriver9.push((java.lang.Object) (short) 100);
        java.lang.Object obj15 = stackTestDriver0.push((java.lang.Object) (short) 100);
        stackTestDriver0.clear();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) 100 + "'", obj5, (short) 100);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 100 + "'", obj6, (short) 100);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 1 + "'", obj11, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (short) 100 + "'", obj14, (short) 100);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (short) 100 + "'", obj15, (short) 100);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test146");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (short) 100);
        java.lang.Object obj6 = stackTestDriver0.pop();
        stackTestDriver0.clear();
        boolean boolean8 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver9 = new experiment.util.StackTestDriver();
        java.lang.Object obj11 = stackTestDriver9.push((java.lang.Object) (byte) 1);
        boolean boolean12 = stackTestDriver9.isEmpty();
        int int13 = stackTestDriver9.size();
        boolean boolean14 = stackTestDriver9.isEmpty();
        int int15 = stackTestDriver9.size();
        java.lang.Object obj16 = stackTestDriver9.pop();
        java.lang.Object obj17 = stackTestDriver0.push(obj16);
        experiment.util.StackTestDriver stackTestDriver18 = new experiment.util.StackTestDriver();
        java.lang.Object obj20 = stackTestDriver18.push((java.lang.Object) (byte) 1);
        boolean boolean21 = stackTestDriver18.isEmpty();
        int int22 = stackTestDriver18.size();
        boolean boolean23 = stackTestDriver18.isEmpty();
        experiment.util.StackTestDriver stackTestDriver24 = new experiment.util.StackTestDriver();
        java.lang.Object obj26 = stackTestDriver24.push((java.lang.Object) (byte) 1);
        boolean boolean27 = stackTestDriver24.isEmpty();
        int int28 = stackTestDriver24.size();
        boolean boolean29 = stackTestDriver24.isEmpty();
        int int30 = stackTestDriver24.size();
        java.lang.Object obj31 = stackTestDriver24.pop();
        java.lang.Object obj32 = stackTestDriver18.push((java.lang.Object) stackTestDriver24);
        experiment.util.StackTestDriver stackTestDriver33 = new experiment.util.StackTestDriver();
        java.lang.Object obj35 = stackTestDriver33.push((java.lang.Object) (byte) 1);
        boolean boolean36 = stackTestDriver33.isEmpty();
        java.lang.Object obj38 = stackTestDriver33.push((java.lang.Object) (short) 100);
        java.lang.Object obj39 = stackTestDriver33.pop();
        stackTestDriver33.clear();
        boolean boolean41 = stackTestDriver33.isEmpty();
        java.lang.Class<?> wildcardClass42 = stackTestDriver33.getClass();
        java.lang.Object obj43 = stackTestDriver24.push((java.lang.Object) wildcardClass42);
        java.lang.Object obj44 = stackTestDriver0.push((java.lang.Object) wildcardClass42);
        experiment.util.StackTestDriver stackTestDriver45 = new experiment.util.StackTestDriver();
        java.lang.Object obj47 = stackTestDriver45.push((java.lang.Object) (byte) 1);
        boolean boolean48 = stackTestDriver45.isEmpty();
        int int49 = stackTestDriver45.size();
        boolean boolean50 = stackTestDriver45.isEmpty();
        experiment.util.StackTestDriver stackTestDriver51 = new experiment.util.StackTestDriver();
        java.lang.Object obj53 = stackTestDriver51.push((java.lang.Object) (byte) 1);
        boolean boolean54 = stackTestDriver51.isEmpty();
        boolean boolean55 = stackTestDriver51.isEmpty();
        java.lang.Object obj56 = stackTestDriver45.push((java.lang.Object) stackTestDriver51);
        java.lang.Object obj57 = stackTestDriver45.peek();
        java.lang.Object obj58 = stackTestDriver0.push(obj57);
        java.lang.Class<?> wildcardClass59 = obj58.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) 100 + "'", obj5, (short) 100);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 100 + "'", obj6, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 1 + "'", obj11, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (byte) 1 + "'", obj16, (byte) 1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) 1 + "'", obj17, (byte) 1);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (byte) 1 + "'", obj20, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + (byte) 1 + "'", obj26, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + (byte) 1 + "'", obj31, (byte) 1);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + (byte) 1 + "'", obj35, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + (short) 100 + "'", obj38, (short) 100);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + (short) 100 + "'", obj39, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertNotNull(obj43);
        org.junit.Assert.assertEquals(obj43.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj43), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj43), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertEquals(obj44.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj44), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj44), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + (byte) 1 + "'", obj47, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + obj53 + "' != '" + (byte) 1 + "'", obj53, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(obj56);
        org.junit.Assert.assertNotNull(obj57);
        org.junit.Assert.assertNotNull(obj58);
        org.junit.Assert.assertNotNull(wildcardClass59);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test147");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (short) 100);
        java.lang.Object obj6 = stackTestDriver0.pop();
        stackTestDriver0.clear();
        boolean boolean8 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver9 = new experiment.util.StackTestDriver();
        java.lang.Object obj11 = stackTestDriver9.push((java.lang.Object) (byte) 1);
        boolean boolean12 = stackTestDriver9.isEmpty();
        int int13 = stackTestDriver9.size();
        boolean boolean14 = stackTestDriver9.isEmpty();
        int int15 = stackTestDriver9.size();
        java.lang.Object obj16 = stackTestDriver9.pop();
        java.lang.Object obj17 = stackTestDriver0.push(obj16);
        java.lang.Object obj18 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver19 = new experiment.util.StackTestDriver();
        java.lang.Object obj21 = stackTestDriver19.push((java.lang.Object) (byte) 1);
        boolean boolean22 = stackTestDriver19.isEmpty();
        java.lang.Object obj24 = stackTestDriver19.push((java.lang.Object) (short) 100);
        java.lang.Object obj25 = stackTestDriver19.pop();
        stackTestDriver19.clear();
        boolean boolean27 = stackTestDriver19.isEmpty();
        experiment.util.StackTestDriver stackTestDriver28 = new experiment.util.StackTestDriver();
        java.lang.Object obj30 = stackTestDriver28.push((java.lang.Object) (byte) 1);
        boolean boolean31 = stackTestDriver28.isEmpty();
        int int32 = stackTestDriver28.size();
        boolean boolean33 = stackTestDriver28.isEmpty();
        int int34 = stackTestDriver28.size();
        java.lang.Object obj35 = stackTestDriver28.pop();
        java.lang.Object obj36 = stackTestDriver19.push(obj35);
        java.lang.Object obj37 = stackTestDriver0.push(obj36);
        java.lang.Class<?> wildcardClass38 = obj37.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) 100 + "'", obj5, (short) 100);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 100 + "'", obj6, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 1 + "'", obj11, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (byte) 1 + "'", obj16, (byte) 1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) 1 + "'", obj17, (byte) 1);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (byte) 1 + "'", obj18, (byte) 1);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (byte) 1 + "'", obj21, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (short) 100 + "'", obj24, (short) 100);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (short) 100 + "'", obj25, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + (byte) 1 + "'", obj30, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + (byte) 1 + "'", obj35, (byte) 1);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + (byte) 1 + "'", obj36, (byte) 1);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + (byte) 1 + "'", obj37, (byte) 1);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test148");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (short) 100);
        java.lang.Object obj6 = stackTestDriver0.pop();
        stackTestDriver0.clear();
        boolean boolean8 = stackTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) 100 + "'", obj5, (short) 100);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 100 + "'", obj6, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test149");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        boolean boolean2 = stackTestDriver0.isEmpty();
        int int3 = stackTestDriver0.size();
        int int4 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean6 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        int int8 = stackTestDriver0.size();
        stackTestDriver0.clear();
        java.lang.Class<?> wildcardClass10 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test150");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        int int4 = stackTestDriver0.size();
        boolean boolean5 = stackTestDriver0.isEmpty();
        int int6 = stackTestDriver0.size();
        java.lang.Object obj7 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        java.lang.Object obj10 = stackTestDriver8.push((java.lang.Object) (byte) 1);
        boolean boolean11 = stackTestDriver8.isEmpty();
        int int12 = stackTestDriver8.size();
        boolean boolean13 = stackTestDriver8.isEmpty();
        experiment.util.StackTestDriver stackTestDriver14 = new experiment.util.StackTestDriver();
        java.lang.Object obj16 = stackTestDriver14.push((java.lang.Object) (byte) 1);
        boolean boolean17 = stackTestDriver14.isEmpty();
        int int18 = stackTestDriver14.size();
        boolean boolean19 = stackTestDriver14.isEmpty();
        int int20 = stackTestDriver14.size();
        java.lang.Object obj21 = stackTestDriver14.pop();
        java.lang.Object obj22 = stackTestDriver8.push((java.lang.Object) stackTestDriver14);
        int int23 = stackTestDriver8.size();
        stackTestDriver8.clear();
        experiment.util.StackTestDriver stackTestDriver25 = new experiment.util.StackTestDriver();
        java.lang.Object obj27 = stackTestDriver25.push((java.lang.Object) (byte) 1);
        boolean boolean28 = stackTestDriver25.isEmpty();
        java.lang.Object obj30 = stackTestDriver25.push((java.lang.Object) (short) 100);
        java.lang.Object obj31 = stackTestDriver25.pop();
        java.lang.Class<?> wildcardClass32 = stackTestDriver25.getClass();
        java.lang.Object obj33 = stackTestDriver8.push((java.lang.Object) stackTestDriver25);
        experiment.util.StackTestDriver stackTestDriver34 = new experiment.util.StackTestDriver();
        stackTestDriver34.clear();
        boolean boolean36 = stackTestDriver34.isEmpty();
        int int37 = stackTestDriver34.size();
        int int38 = stackTestDriver34.size();
        boolean boolean39 = stackTestDriver34.isEmpty();
        experiment.util.StackTestDriver stackTestDriver40 = new experiment.util.StackTestDriver();
        java.lang.Object obj42 = stackTestDriver40.push((java.lang.Object) (byte) 1);
        int int43 = stackTestDriver40.size();
        java.lang.Object obj44 = stackTestDriver40.peek();
        java.lang.Object obj45 = stackTestDriver40.pop();
        java.lang.Object obj46 = stackTestDriver34.push((java.lang.Object) stackTestDriver40);
        java.lang.Object obj47 = stackTestDriver8.push((java.lang.Object) stackTestDriver40);
        java.lang.Object obj48 = stackTestDriver8.peek();
        experiment.util.StackTestDriver stackTestDriver49 = new experiment.util.StackTestDriver();
        stackTestDriver49.clear();
        boolean boolean51 = stackTestDriver49.isEmpty();
        int int52 = stackTestDriver49.size();
        int int53 = stackTestDriver49.size();
        stackTestDriver49.clear();
        java.lang.Object obj55 = stackTestDriver8.push((java.lang.Object) stackTestDriver49);
        java.lang.Object obj56 = stackTestDriver0.push((java.lang.Object) stackTestDriver49);
        java.lang.Object obj57 = stackTestDriver0.peek();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 1 + "'", obj7, (byte) 1);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) 1 + "'", obj10, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (byte) 1 + "'", obj16, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (byte) 1 + "'", obj21, (byte) 1);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + (byte) 1 + "'", obj27, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + (short) 100 + "'", obj30, (short) 100);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + (short) 100 + "'", obj31, (short) 100);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + (byte) 1 + "'", obj42, (byte) 1);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + (byte) 1 + "'", obj44, (byte) 1);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + (byte) 1 + "'", obj45, (byte) 1);
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(obj55);
        org.junit.Assert.assertNotNull(obj56);
        org.junit.Assert.assertNotNull(obj57);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test151");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        int int4 = stackTestDriver0.size();
        boolean boolean5 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        java.lang.Object obj8 = stackTestDriver6.push((java.lang.Object) (byte) 1);
        boolean boolean9 = stackTestDriver6.isEmpty();
        int int10 = stackTestDriver6.size();
        boolean boolean11 = stackTestDriver6.isEmpty();
        int int12 = stackTestDriver6.size();
        java.lang.Object obj13 = stackTestDriver6.pop();
        java.lang.Object obj14 = stackTestDriver0.push((java.lang.Object) stackTestDriver6);
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        stackTestDriver15.clear();
        boolean boolean17 = stackTestDriver15.isEmpty();
        int int18 = stackTestDriver15.size();
        java.lang.Object obj20 = stackTestDriver15.push((java.lang.Object) (byte) 10);
        java.lang.Object obj21 = stackTestDriver0.push((java.lang.Object) stackTestDriver15);
        boolean boolean22 = stackTestDriver15.isEmpty();
        int int23 = stackTestDriver15.size();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) 1 + "'", obj8, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (byte) 1 + "'", obj13, (byte) 1);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (byte) 10 + "'", obj20, (byte) 10);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test152");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        int int4 = stackTestDriver0.size();
        boolean boolean5 = stackTestDriver0.isEmpty();
        int int6 = stackTestDriver0.size();
        java.lang.Object obj7 = stackTestDriver0.peek();
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        java.lang.Object obj10 = stackTestDriver8.push((java.lang.Object) (byte) 1);
        boolean boolean11 = stackTestDriver8.isEmpty();
        int int12 = stackTestDriver8.size();
        stackTestDriver8.clear();
        stackTestDriver8.clear();
        java.lang.Object obj15 = stackTestDriver0.push((java.lang.Object) stackTestDriver8);
        experiment.util.StackTestDriver stackTestDriver16 = new experiment.util.StackTestDriver();
        java.lang.Object obj18 = stackTestDriver16.push((java.lang.Object) (byte) 1);
        boolean boolean19 = stackTestDriver16.isEmpty();
        int int20 = stackTestDriver16.size();
        stackTestDriver16.clear();
        int int22 = stackTestDriver16.size();
        java.lang.Object obj23 = stackTestDriver0.push((java.lang.Object) stackTestDriver16);
        stackTestDriver0.clear();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 1 + "'", obj7, (byte) 1);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) 1 + "'", obj10, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (byte) 1 + "'", obj18, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(obj23);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test153");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        boolean boolean2 = stackTestDriver0.isEmpty();
        int int3 = stackTestDriver0.size();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (byte) 10);
        int int6 = stackTestDriver0.size();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) (-1L));
        stackTestDriver0.clear();
        int int10 = stackTestDriver0.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) 10 + "'", obj5, (byte) 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1L) + "'", obj8, (-1L));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test154");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        java.lang.Object obj6 = stackTestDriver4.push((java.lang.Object) (byte) 1);
        boolean boolean7 = stackTestDriver4.isEmpty();
        int int8 = stackTestDriver4.size();
        boolean boolean9 = stackTestDriver4.isEmpty();
        int int10 = stackTestDriver4.size();
        java.lang.Object obj11 = stackTestDriver4.peek();
        experiment.util.StackTestDriver stackTestDriver12 = new experiment.util.StackTestDriver();
        java.lang.Object obj14 = stackTestDriver12.push((java.lang.Object) (byte) 1);
        boolean boolean15 = stackTestDriver12.isEmpty();
        int int16 = stackTestDriver12.size();
        stackTestDriver12.clear();
        stackTestDriver12.clear();
        java.lang.Object obj19 = stackTestDriver4.push((java.lang.Object) stackTestDriver12);
        boolean boolean20 = stackTestDriver4.isEmpty();
        java.lang.Object obj21 = stackTestDriver0.push((java.lang.Object) boolean20);
        boolean boolean22 = stackTestDriver0.isEmpty();
        boolean boolean23 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver24 = new experiment.util.StackTestDriver();
        java.lang.Object obj26 = stackTestDriver24.push((java.lang.Object) (byte) 1);
        boolean boolean27 = stackTestDriver24.isEmpty();
        int int28 = stackTestDriver24.size();
        java.lang.Object obj29 = stackTestDriver24.peek();
        stackTestDriver24.clear();
        experiment.util.StackTestDriver stackTestDriver31 = new experiment.util.StackTestDriver();
        java.lang.Object obj33 = stackTestDriver31.push((java.lang.Object) (byte) 1);
        boolean boolean34 = stackTestDriver31.isEmpty();
        java.lang.Object obj36 = stackTestDriver31.push((java.lang.Object) (short) 100);
        java.lang.Object obj37 = stackTestDriver31.pop();
        stackTestDriver31.clear();
        boolean boolean39 = stackTestDriver31.isEmpty();
        int int40 = stackTestDriver31.size();
        java.lang.Object obj42 = stackTestDriver31.push((java.lang.Object) 1);
        stackTestDriver31.clear();
        stackTestDriver31.clear();
        boolean boolean45 = stackTestDriver31.isEmpty();
        java.lang.Class<?> wildcardClass46 = stackTestDriver31.getClass();
        java.lang.Object obj47 = stackTestDriver24.push((java.lang.Object) wildcardClass46);
        java.lang.Object obj48 = stackTestDriver0.push(obj47);
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 1 + "'", obj6, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 1 + "'", obj11, (byte) 1);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (byte) 1 + "'", obj14, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + false + "'", obj21, false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + (byte) 1 + "'", obj26, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + (byte) 1 + "'", obj29, (byte) 1);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + (byte) 1 + "'", obj33, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + (short) 100 + "'", obj36, (short) 100);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + (short) 100 + "'", obj37, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + 1 + "'", obj42, 1);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertEquals(obj47.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj47), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj47), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertEquals(obj48.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj48), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj48), "class experiment.util.StackTestDriver");
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test155");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        int int4 = stackTestDriver0.size();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        boolean boolean7 = stackTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test156");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        int int4 = stackTestDriver0.size();
        boolean boolean5 = stackTestDriver0.isEmpty();
        int int6 = stackTestDriver0.size();
        java.lang.Object obj7 = stackTestDriver0.peek();
        boolean boolean8 = stackTestDriver0.isEmpty();
        int int9 = stackTestDriver0.size();
        java.lang.Class<?> wildcardClass10 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 1 + "'", obj7, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test157");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        int int5 = stackTestDriver0.size();
        int int6 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver7 = new experiment.util.StackTestDriver();
        java.lang.Object obj9 = stackTestDriver7.push((java.lang.Object) (byte) 1);
        int int10 = stackTestDriver7.size();
        java.lang.Object obj11 = stackTestDriver7.peek();
        java.lang.Class<?> wildcardClass12 = stackTestDriver7.getClass();
        java.lang.Object obj13 = stackTestDriver0.push((java.lang.Object) stackTestDriver7);
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) 1 + "'", obj9, (byte) 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 1 + "'", obj11, (byte) 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test158");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        int int5 = stackTestDriver0.size();
        int int6 = stackTestDriver0.size();
        boolean boolean7 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver9 = new experiment.util.StackTestDriver();
        java.lang.Object obj11 = stackTestDriver9.push((java.lang.Object) (byte) 1);
        boolean boolean12 = stackTestDriver9.isEmpty();
        int int13 = stackTestDriver9.size();
        boolean boolean14 = stackTestDriver9.isEmpty();
        int int15 = stackTestDriver9.size();
        java.lang.Object obj16 = stackTestDriver9.peek();
        boolean boolean17 = stackTestDriver9.isEmpty();
        java.lang.Object obj18 = stackTestDriver0.push((java.lang.Object) stackTestDriver9);
        int int19 = stackTestDriver9.size();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 1 + "'", obj11, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (byte) 1 + "'", obj16, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test159");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (short) 100);
        java.lang.Object obj6 = stackTestDriver0.pop();
        stackTestDriver0.clear();
        boolean boolean8 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver9 = new experiment.util.StackTestDriver();
        java.lang.Object obj11 = stackTestDriver9.push((java.lang.Object) (byte) 1);
        boolean boolean12 = stackTestDriver9.isEmpty();
        int int13 = stackTestDriver9.size();
        boolean boolean14 = stackTestDriver9.isEmpty();
        int int15 = stackTestDriver9.size();
        java.lang.Object obj16 = stackTestDriver9.pop();
        java.lang.Object obj17 = stackTestDriver0.push(obj16);
        int int18 = stackTestDriver0.size();
        java.lang.Class<?> wildcardClass19 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) 100 + "'", obj5, (short) 100);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 100 + "'", obj6, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 1 + "'", obj11, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (byte) 1 + "'", obj16, (byte) 1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) 1 + "'", obj17, (byte) 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test160");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver1 = new experiment.util.StackTestDriver();
        java.lang.Object obj3 = stackTestDriver1.push((java.lang.Object) (byte) 1);
        boolean boolean4 = stackTestDriver1.isEmpty();
        int int5 = stackTestDriver1.size();
        boolean boolean6 = stackTestDriver1.isEmpty();
        experiment.util.StackTestDriver stackTestDriver7 = new experiment.util.StackTestDriver();
        java.lang.Object obj9 = stackTestDriver7.push((java.lang.Object) (byte) 1);
        boolean boolean10 = stackTestDriver7.isEmpty();
        int int11 = stackTestDriver7.size();
        boolean boolean12 = stackTestDriver7.isEmpty();
        int int13 = stackTestDriver7.size();
        java.lang.Object obj14 = stackTestDriver7.pop();
        java.lang.Object obj15 = stackTestDriver1.push((java.lang.Object) stackTestDriver7);
        experiment.util.StackTestDriver stackTestDriver16 = new experiment.util.StackTestDriver();
        java.lang.Object obj18 = stackTestDriver16.push((java.lang.Object) (byte) 1);
        boolean boolean19 = stackTestDriver16.isEmpty();
        java.lang.Object obj21 = stackTestDriver16.push((java.lang.Object) (short) 100);
        java.lang.Object obj22 = stackTestDriver16.pop();
        stackTestDriver16.clear();
        boolean boolean24 = stackTestDriver16.isEmpty();
        java.lang.Class<?> wildcardClass25 = stackTestDriver16.getClass();
        java.lang.Object obj26 = stackTestDriver7.push((java.lang.Object) wildcardClass25);
        int int27 = stackTestDriver7.size();
        java.lang.Object obj28 = stackTestDriver0.push((java.lang.Object) int27);
        int int29 = stackTestDriver0.size();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 1 + "'", obj3, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) 1 + "'", obj9, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (byte) 1 + "'", obj14, (byte) 1);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (byte) 1 + "'", obj18, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (short) 100 + "'", obj21, (short) 100);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (short) 100 + "'", obj22, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertEquals(obj26.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj26), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj26), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + 1 + "'", obj28, 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test161");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (short) 100);
        boolean boolean6 = stackTestDriver0.isEmpty();
        java.lang.Object obj7 = stackTestDriver0.pop();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) 100 + "'", obj5, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (short) 100 + "'", obj7, (short) 100);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test162");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (short) 100);
        java.lang.Object obj6 = stackTestDriver0.pop();
        stackTestDriver0.clear();
        boolean boolean8 = stackTestDriver0.isEmpty();
        int int9 = stackTestDriver0.size();
        java.lang.Object obj11 = stackTestDriver0.push((java.lang.Object) 1);
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        boolean boolean14 = stackTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) 100 + "'", obj5, (short) 100);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 100 + "'", obj6, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 1 + "'", obj11, 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test163");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        boolean boolean4 = stackTestDriver0.isEmpty();
        boolean boolean5 = stackTestDriver0.isEmpty();
        int int6 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver7 = new experiment.util.StackTestDriver();
        java.lang.Object obj9 = stackTestDriver7.push((java.lang.Object) (byte) 1);
        boolean boolean10 = stackTestDriver7.isEmpty();
        java.lang.Object obj12 = stackTestDriver7.push((java.lang.Object) (short) 100);
        stackTestDriver7.clear();
        java.lang.Object obj14 = stackTestDriver0.push((java.lang.Object) stackTestDriver7);
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) 1 + "'", obj9, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (short) 100 + "'", obj12, (short) 100);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test164");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        int int4 = stackTestDriver0.size();
        boolean boolean5 = stackTestDriver0.isEmpty();
        boolean boolean6 = stackTestDriver0.isEmpty();
        java.lang.Object obj7 = stackTestDriver0.pop();
        stackTestDriver0.clear();
        java.lang.Object obj10 = stackTestDriver0.push((java.lang.Object) 10.0d);
        java.lang.Class<?> wildcardClass11 = obj10.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 1 + "'", obj7, (byte) 1);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 10.0d + "'", obj10, 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test165");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        int int3 = stackTestDriver0.size();
        boolean boolean4 = stackTestDriver0.isEmpty();
        int int5 = stackTestDriver0.size();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test166");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (short) 100);
        java.lang.Object obj6 = stackTestDriver0.pop();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver9 = new experiment.util.StackTestDriver();
        java.lang.Object obj11 = stackTestDriver9.push((java.lang.Object) (byte) 1);
        int int12 = stackTestDriver9.size();
        java.lang.Object obj13 = stackTestDriver9.peek();
        java.lang.Object obj14 = stackTestDriver9.pop();
        java.lang.Object obj15 = stackTestDriver0.push((java.lang.Object) stackTestDriver9);
        java.lang.Object obj16 = stackTestDriver0.pop();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) 100 + "'", obj5, (short) 100);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 100 + "'", obj6, (short) 100);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 1 + "'", obj11, (byte) 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (byte) 1 + "'", obj13, (byte) 1);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (byte) 1 + "'", obj14, (byte) 1);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(obj16);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test167");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        boolean boolean2 = stackTestDriver0.isEmpty();
        int int3 = stackTestDriver0.size();
        int int4 = stackTestDriver0.size();
        boolean boolean5 = stackTestDriver0.isEmpty();
        int int6 = stackTestDriver0.size();
        int int7 = stackTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test168");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        int int5 = stackTestDriver0.size();
        int int6 = stackTestDriver0.size();
        boolean boolean7 = stackTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test169");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        int int4 = stackTestDriver0.size();
        boolean boolean5 = stackTestDriver0.isEmpty();
        int int6 = stackTestDriver0.size();
        java.lang.Object obj7 = stackTestDriver0.peek();
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        java.lang.Object obj10 = stackTestDriver8.push((java.lang.Object) (byte) 1);
        boolean boolean11 = stackTestDriver8.isEmpty();
        int int12 = stackTestDriver8.size();
        stackTestDriver8.clear();
        stackTestDriver8.clear();
        java.lang.Object obj15 = stackTestDriver0.push((java.lang.Object) stackTestDriver8);
        int int16 = stackTestDriver8.size();
        int int17 = stackTestDriver8.size();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 1 + "'", obj7, (byte) 1);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) 1 + "'", obj10, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test170");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        boolean boolean2 = stackTestDriver0.isEmpty();
        int int3 = stackTestDriver0.size();
        int int4 = stackTestDriver0.size();
        boolean boolean5 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        stackTestDriver6.clear();
        boolean boolean8 = stackTestDriver6.isEmpty();
        boolean boolean9 = stackTestDriver6.isEmpty();
        java.lang.Object obj10 = stackTestDriver0.push((java.lang.Object) boolean9);
        boolean boolean11 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + true + "'", obj10, true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test171");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (short) 100);
        java.lang.Object obj6 = stackTestDriver0.pop();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver9 = new experiment.util.StackTestDriver();
        java.lang.Object obj11 = stackTestDriver9.push((java.lang.Object) (byte) 1);
        boolean boolean12 = stackTestDriver9.isEmpty();
        java.lang.Object obj14 = stackTestDriver9.push((java.lang.Object) (short) 100);
        java.lang.Object obj15 = stackTestDriver0.push((java.lang.Object) (short) 100);
        java.lang.Object obj16 = stackTestDriver0.peek();
        java.lang.Object obj17 = stackTestDriver0.peek();
        boolean boolean18 = stackTestDriver0.isEmpty();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) 100 + "'", obj5, (short) 100);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 100 + "'", obj6, (short) 100);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 1 + "'", obj11, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (short) 100 + "'", obj14, (short) 100);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (short) 100 + "'", obj15, (short) 100);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (short) 100 + "'", obj16, (short) 100);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (short) 100 + "'", obj17, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test172");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        boolean boolean2 = stackTestDriver0.isEmpty();
        int int3 = stackTestDriver0.size();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (byte) 10);
        stackTestDriver0.clear();
        int int7 = stackTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) 10 + "'", obj5, (byte) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test173");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        int int4 = stackTestDriver0.size();
        boolean boolean5 = stackTestDriver0.isEmpty();
        int int6 = stackTestDriver0.size();
        boolean boolean7 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test174");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (short) 100);
        java.lang.Object obj6 = stackTestDriver0.pop();
        stackTestDriver0.clear();
        boolean boolean8 = stackTestDriver0.isEmpty();
        int int9 = stackTestDriver0.size();
        java.lang.Object obj11 = stackTestDriver0.push((java.lang.Object) 1);
        java.lang.Object obj12 = stackTestDriver0.peek();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) 100 + "'", obj5, (short) 100);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 100 + "'", obj6, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 1 + "'", obj11, 1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 1 + "'", obj12, 1);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test175");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        int int4 = stackTestDriver0.size();
        boolean boolean5 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        java.lang.Object obj8 = stackTestDriver6.push((java.lang.Object) (byte) 1);
        boolean boolean9 = stackTestDriver6.isEmpty();
        int int10 = stackTestDriver6.size();
        boolean boolean11 = stackTestDriver6.isEmpty();
        int int12 = stackTestDriver6.size();
        java.lang.Object obj13 = stackTestDriver6.pop();
        java.lang.Object obj14 = stackTestDriver0.push((java.lang.Object) stackTestDriver6);
        int int15 = stackTestDriver0.size();
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) 1 + "'", obj8, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (byte) 1 + "'", obj13, (byte) 1);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test176");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        int int4 = stackTestDriver0.size();
        boolean boolean5 = stackTestDriver0.isEmpty();
        int int6 = stackTestDriver0.size();
        java.lang.Object obj7 = stackTestDriver0.peek();
        java.lang.Object obj8 = stackTestDriver0.peek();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 1 + "'", obj7, (byte) 1);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) 1 + "'", obj8, (byte) 1);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test177");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (short) 100);
        java.lang.Object obj6 = stackTestDriver0.pop();
        stackTestDriver0.clear();
        boolean boolean8 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver9 = new experiment.util.StackTestDriver();
        java.lang.Object obj11 = stackTestDriver9.push((java.lang.Object) (byte) 1);
        boolean boolean12 = stackTestDriver9.isEmpty();
        int int13 = stackTestDriver9.size();
        boolean boolean14 = stackTestDriver9.isEmpty();
        int int15 = stackTestDriver9.size();
        java.lang.Object obj16 = stackTestDriver9.pop();
        java.lang.Object obj17 = stackTestDriver0.push(obj16);
        java.lang.Object obj18 = stackTestDriver0.pop();
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) 100 + "'", obj5, (short) 100);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 100 + "'", obj6, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 1 + "'", obj11, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (byte) 1 + "'", obj16, (byte) 1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) 1 + "'", obj17, (byte) 1);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (byte) 1 + "'", obj18, (byte) 1);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test178");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        int int4 = stackTestDriver0.size();
        boolean boolean5 = stackTestDriver0.isEmpty();
        boolean boolean6 = stackTestDriver0.isEmpty();
        java.lang.Object obj7 = stackTestDriver0.pop();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver9 = new experiment.util.StackTestDriver();
        java.lang.Object obj11 = stackTestDriver9.push((java.lang.Object) (byte) 1);
        int int12 = stackTestDriver9.size();
        java.lang.Object obj14 = stackTestDriver9.push((java.lang.Object) 100L);
        int int15 = stackTestDriver9.size();
        java.lang.Object obj16 = stackTestDriver9.peek();
        java.lang.Object obj17 = stackTestDriver0.push((java.lang.Object) stackTestDriver9);
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 1 + "'", obj7, (byte) 1);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 1 + "'", obj11, (byte) 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 100L + "'", obj14, 100L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 100L + "'", obj16, 100L);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test179");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        int int4 = stackTestDriver0.size();
        boolean boolean5 = stackTestDriver0.isEmpty();
        int int6 = stackTestDriver0.size();
        java.lang.Object obj7 = stackTestDriver0.peek();
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        java.lang.Object obj10 = stackTestDriver8.push((java.lang.Object) (byte) 1);
        boolean boolean11 = stackTestDriver8.isEmpty();
        int int12 = stackTestDriver8.size();
        stackTestDriver8.clear();
        stackTestDriver8.clear();
        java.lang.Object obj15 = stackTestDriver0.push((java.lang.Object) stackTestDriver8);
        boolean boolean16 = stackTestDriver8.isEmpty();
        boolean boolean17 = stackTestDriver8.isEmpty();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 1 + "'", obj7, (byte) 1);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) 1 + "'", obj10, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test180");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (short) 100);
        java.lang.Object obj6 = stackTestDriver0.pop();
        stackTestDriver0.clear();
        boolean boolean8 = stackTestDriver0.isEmpty();
        int int9 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        java.lang.Object obj12 = stackTestDriver10.push((java.lang.Object) (byte) 1);
        boolean boolean13 = stackTestDriver10.isEmpty();
        java.lang.Object obj15 = stackTestDriver10.push((java.lang.Object) (short) 100);
        java.lang.Object obj16 = stackTestDriver10.pop();
        stackTestDriver10.clear();
        stackTestDriver10.clear();
        experiment.util.StackTestDriver stackTestDriver19 = new experiment.util.StackTestDriver();
        java.lang.Object obj21 = stackTestDriver19.push((java.lang.Object) (byte) 1);
        boolean boolean22 = stackTestDriver19.isEmpty();
        java.lang.Object obj24 = stackTestDriver19.push((java.lang.Object) (short) 100);
        java.lang.Object obj25 = stackTestDriver10.push((java.lang.Object) (short) 100);
        boolean boolean26 = stackTestDriver10.isEmpty();
        java.lang.Object obj27 = stackTestDriver10.pop();
        experiment.util.StackTestDriver stackTestDriver28 = new experiment.util.StackTestDriver();
        java.lang.Object obj30 = stackTestDriver28.push((java.lang.Object) (byte) 1);
        boolean boolean31 = stackTestDriver28.isEmpty();
        java.lang.Object obj33 = stackTestDriver28.push((java.lang.Object) (short) 100);
        java.lang.Object obj34 = stackTestDriver28.pop();
        stackTestDriver28.clear();
        stackTestDriver28.clear();
        experiment.util.StackTestDriver stackTestDriver37 = new experiment.util.StackTestDriver();
        java.lang.Object obj39 = stackTestDriver37.push((java.lang.Object) (byte) 1);
        boolean boolean40 = stackTestDriver37.isEmpty();
        java.lang.Object obj42 = stackTestDriver37.push((java.lang.Object) (short) 100);
        java.lang.Object obj43 = stackTestDriver28.push((java.lang.Object) (short) 100);
        java.lang.Object obj44 = stackTestDriver10.push((java.lang.Object) (short) 100);
        java.lang.Class<?> wildcardClass45 = obj44.getClass();
        java.lang.Object obj46 = stackTestDriver0.push(obj44);
        experiment.util.StackTestDriver stackTestDriver47 = new experiment.util.StackTestDriver();
        stackTestDriver47.clear();
        boolean boolean49 = stackTestDriver47.isEmpty();
        int int50 = stackTestDriver47.size();
        java.lang.Object obj52 = stackTestDriver47.push((java.lang.Object) (byte) 10);
        java.lang.Object obj53 = stackTestDriver47.pop();
        stackTestDriver47.clear();
        experiment.util.StackTestDriver stackTestDriver55 = new experiment.util.StackTestDriver();
        stackTestDriver55.clear();
        boolean boolean57 = stackTestDriver55.isEmpty();
        int int58 = stackTestDriver55.size();
        int int59 = stackTestDriver55.size();
        boolean boolean60 = stackTestDriver55.isEmpty();
        experiment.util.StackTestDriver stackTestDriver61 = new experiment.util.StackTestDriver();
        java.lang.Object obj63 = stackTestDriver61.push((java.lang.Object) (byte) 1);
        int int64 = stackTestDriver61.size();
        java.lang.Object obj65 = stackTestDriver61.peek();
        java.lang.Object obj66 = stackTestDriver61.pop();
        java.lang.Object obj67 = stackTestDriver55.push((java.lang.Object) stackTestDriver61);
        java.lang.Object obj68 = stackTestDriver47.push((java.lang.Object) stackTestDriver61);
        experiment.util.StackTestDriver stackTestDriver69 = new experiment.util.StackTestDriver();
        java.lang.Object obj71 = stackTestDriver69.push((java.lang.Object) (byte) 1);
        boolean boolean72 = stackTestDriver69.isEmpty();
        int int73 = stackTestDriver69.size();
        boolean boolean74 = stackTestDriver69.isEmpty();
        int int75 = stackTestDriver69.size();
        boolean boolean76 = stackTestDriver69.isEmpty();
        boolean boolean77 = stackTestDriver69.isEmpty();
        stackTestDriver69.clear();
        java.lang.Object obj79 = stackTestDriver61.push((java.lang.Object) stackTestDriver69);
        int int80 = stackTestDriver69.size();
        int int81 = stackTestDriver69.size();
        java.lang.Object obj82 = stackTestDriver0.push((java.lang.Object) stackTestDriver69);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj83 = stackTestDriver69.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) 100 + "'", obj5, (short) 100);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 100 + "'", obj6, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) 1 + "'", obj12, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (short) 100 + "'", obj15, (short) 100);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (short) 100 + "'", obj16, (short) 100);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (byte) 1 + "'", obj21, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (short) 100 + "'", obj24, (short) 100);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (short) 100 + "'", obj25, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + (short) 100 + "'", obj27, (short) 100);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + (byte) 1 + "'", obj30, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + (short) 100 + "'", obj33, (short) 100);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + (short) 100 + "'", obj34, (short) 100);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + (byte) 1 + "'", obj39, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + (short) 100 + "'", obj42, (short) 100);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + (short) 100 + "'", obj43, (short) 100);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + (short) 100 + "'", obj44, (short) 100);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + (short) 100 + "'", obj46, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertEquals("'" + obj52 + "' != '" + (byte) 10 + "'", obj52, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj53 + "' != '" + (byte) 10 + "'", obj53, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertEquals("'" + obj63 + "' != '" + (byte) 1 + "'", obj63, (byte) 1);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 1 + "'", int64 == 1);
        org.junit.Assert.assertEquals("'" + obj65 + "' != '" + (byte) 1 + "'", obj65, (byte) 1);
        org.junit.Assert.assertEquals("'" + obj66 + "' != '" + (byte) 1 + "'", obj66, (byte) 1);
        org.junit.Assert.assertNotNull(obj67);
        org.junit.Assert.assertNotNull(obj68);
        org.junit.Assert.assertEquals("'" + obj71 + "' != '" + (byte) 1 + "'", obj71, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 1 + "'", int73 == 1);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 1 + "'", int75 == 1);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(obj79);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertNotNull(obj82);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test181");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        int int4 = stackTestDriver0.size();
        boolean boolean5 = stackTestDriver0.isEmpty();
        int int6 = stackTestDriver0.size();
        java.lang.Object obj7 = stackTestDriver0.peek();
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        java.lang.Object obj10 = stackTestDriver8.push((java.lang.Object) (byte) 1);
        boolean boolean11 = stackTestDriver8.isEmpty();
        int int12 = stackTestDriver8.size();
        stackTestDriver8.clear();
        stackTestDriver8.clear();
        java.lang.Object obj15 = stackTestDriver0.push((java.lang.Object) stackTestDriver8);
        stackTestDriver8.clear();
        int int17 = stackTestDriver8.size();
        int int18 = stackTestDriver8.size();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 1 + "'", obj7, (byte) 1);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) 1 + "'", obj10, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test182");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        int int4 = stackTestDriver0.size();
        boolean boolean5 = stackTestDriver0.isEmpty();
        int int6 = stackTestDriver0.size();
        java.lang.Object obj7 = stackTestDriver0.peek();
        boolean boolean8 = stackTestDriver0.isEmpty();
        java.lang.Object obj9 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        java.lang.Object obj12 = stackTestDriver10.push((java.lang.Object) (byte) 1);
        boolean boolean13 = stackTestDriver10.isEmpty();
        int int14 = stackTestDriver10.size();
        boolean boolean15 = stackTestDriver10.isEmpty();
        boolean boolean16 = stackTestDriver10.isEmpty();
        java.lang.Object obj17 = stackTestDriver10.pop();
        stackTestDriver10.clear();
        experiment.util.StackTestDriver stackTestDriver19 = new experiment.util.StackTestDriver();
        java.lang.Object obj21 = stackTestDriver19.push((java.lang.Object) (byte) 1);
        int int22 = stackTestDriver19.size();
        java.lang.Object obj24 = stackTestDriver19.push((java.lang.Object) 100L);
        int int25 = stackTestDriver19.size();
        java.lang.Object obj26 = stackTestDriver19.peek();
        java.lang.Object obj27 = stackTestDriver10.push((java.lang.Object) stackTestDriver19);
        java.lang.Object obj28 = stackTestDriver0.push((java.lang.Object) stackTestDriver10);
        java.lang.Class<?> wildcardClass29 = obj28.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 1 + "'", obj7, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) 1 + "'", obj9, (byte) 1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) 1 + "'", obj12, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) 1 + "'", obj17, (byte) 1);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (byte) 1 + "'", obj21, (byte) 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 100L + "'", obj24, 100L);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 100L + "'", obj26, 100L);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test183");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        int int3 = stackTestDriver0.size();
        java.lang.Object obj4 = stackTestDriver0.peek();
        java.lang.Object obj5 = stackTestDriver0.pop();
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) (-1.0f));
        int int8 = stackTestDriver0.size();
        java.lang.Object obj9 = stackTestDriver0.peek();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 1 + "'", obj4, (byte) 1);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) 1 + "'", obj5, (byte) 1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0f) + "'", obj7, (-1.0f));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (-1.0f) + "'", obj9, (-1.0f));
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test184");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        int int4 = stackTestDriver0.size();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        int int7 = stackTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test185");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        boolean boolean4 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) 1);
        boolean boolean8 = stackTestDriver5.isEmpty();
        int int9 = stackTestDriver5.size();
        boolean boolean10 = stackTestDriver5.isEmpty();
        int int11 = stackTestDriver5.size();
        java.lang.Object obj12 = stackTestDriver5.pop();
        java.lang.Object obj13 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        boolean boolean14 = stackTestDriver0.isEmpty();
        java.lang.Class<?> wildcardClass15 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 1 + "'", obj7, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) 1 + "'", obj12, (byte) 1);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test186");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (short) 100);
        java.lang.Object obj6 = stackTestDriver0.pop();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver9 = new experiment.util.StackTestDriver();
        java.lang.Object obj11 = stackTestDriver9.push((java.lang.Object) (byte) 1);
        boolean boolean12 = stackTestDriver9.isEmpty();
        java.lang.Object obj14 = stackTestDriver9.push((java.lang.Object) (short) 100);
        java.lang.Object obj15 = stackTestDriver0.push((java.lang.Object) (short) 100);
        boolean boolean16 = stackTestDriver0.isEmpty();
        java.lang.Object obj17 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver18 = new experiment.util.StackTestDriver();
        java.lang.Object obj20 = stackTestDriver18.push((java.lang.Object) (byte) 1);
        boolean boolean21 = stackTestDriver18.isEmpty();
        java.lang.Object obj23 = stackTestDriver18.push((java.lang.Object) (short) 100);
        java.lang.Object obj24 = stackTestDriver18.pop();
        stackTestDriver18.clear();
        stackTestDriver18.clear();
        experiment.util.StackTestDriver stackTestDriver27 = new experiment.util.StackTestDriver();
        java.lang.Object obj29 = stackTestDriver27.push((java.lang.Object) (byte) 1);
        boolean boolean30 = stackTestDriver27.isEmpty();
        java.lang.Object obj32 = stackTestDriver27.push((java.lang.Object) (short) 100);
        java.lang.Object obj33 = stackTestDriver18.push((java.lang.Object) (short) 100);
        java.lang.Object obj34 = stackTestDriver0.push((java.lang.Object) (short) 100);
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) 100 + "'", obj5, (short) 100);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 100 + "'", obj6, (short) 100);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 1 + "'", obj11, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (short) 100 + "'", obj14, (short) 100);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (short) 100 + "'", obj15, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (short) 100 + "'", obj17, (short) 100);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (byte) 1 + "'", obj20, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (short) 100 + "'", obj23, (short) 100);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (short) 100 + "'", obj24, (short) 100);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + (byte) 1 + "'", obj29, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + (short) 100 + "'", obj32, (short) 100);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + (short) 100 + "'", obj33, (short) 100);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + (short) 100 + "'", obj34, (short) 100);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test187");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        int int4 = stackTestDriver0.size();
        boolean boolean5 = stackTestDriver0.isEmpty();
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) 100.0d);
        java.lang.Class<?> wildcardClass8 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 100.0d + "'", obj7, 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test188");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        boolean boolean4 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) 1);
        boolean boolean8 = stackTestDriver5.isEmpty();
        int int9 = stackTestDriver5.size();
        boolean boolean10 = stackTestDriver5.isEmpty();
        int int11 = stackTestDriver5.size();
        java.lang.Object obj12 = stackTestDriver5.pop();
        java.lang.Object obj13 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        experiment.util.StackTestDriver stackTestDriver14 = new experiment.util.StackTestDriver();
        java.lang.Object obj16 = stackTestDriver14.push((java.lang.Object) (byte) 1);
        int int17 = stackTestDriver14.size();
        stackTestDriver14.clear();
        experiment.util.StackTestDriver stackTestDriver19 = new experiment.util.StackTestDriver();
        java.lang.Object obj21 = stackTestDriver19.push((java.lang.Object) (byte) 1);
        int int22 = stackTestDriver19.size();
        stackTestDriver19.clear();
        java.lang.Object obj24 = stackTestDriver14.push((java.lang.Object) stackTestDriver19);
        java.lang.Object obj25 = stackTestDriver0.push((java.lang.Object) stackTestDriver14);
        java.lang.Class<?> wildcardClass26 = stackTestDriver14.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 1 + "'", obj7, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) 1 + "'", obj12, (byte) 1);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (byte) 1 + "'", obj16, (byte) 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (byte) 1 + "'", obj21, (byte) 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test189");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        boolean boolean2 = stackTestDriver0.isEmpty();
        int int3 = stackTestDriver0.size();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (byte) 10);
        java.lang.Object obj6 = stackTestDriver0.pop();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        stackTestDriver8.clear();
        boolean boolean10 = stackTestDriver8.isEmpty();
        int int11 = stackTestDriver8.size();
        int int12 = stackTestDriver8.size();
        boolean boolean13 = stackTestDriver8.isEmpty();
        experiment.util.StackTestDriver stackTestDriver14 = new experiment.util.StackTestDriver();
        java.lang.Object obj16 = stackTestDriver14.push((java.lang.Object) (byte) 1);
        int int17 = stackTestDriver14.size();
        java.lang.Object obj18 = stackTestDriver14.peek();
        java.lang.Object obj19 = stackTestDriver14.pop();
        java.lang.Object obj20 = stackTestDriver8.push((java.lang.Object) stackTestDriver14);
        java.lang.Object obj21 = stackTestDriver0.push((java.lang.Object) stackTestDriver14);
        experiment.util.StackTestDriver stackTestDriver22 = new experiment.util.StackTestDriver();
        java.lang.Object obj24 = stackTestDriver22.push((java.lang.Object) (byte) 1);
        boolean boolean25 = stackTestDriver22.isEmpty();
        int int26 = stackTestDriver22.size();
        boolean boolean27 = stackTestDriver22.isEmpty();
        int int28 = stackTestDriver22.size();
        boolean boolean29 = stackTestDriver22.isEmpty();
        boolean boolean30 = stackTestDriver22.isEmpty();
        stackTestDriver22.clear();
        java.lang.Object obj32 = stackTestDriver14.push((java.lang.Object) stackTestDriver22);
        java.lang.Object obj33 = stackTestDriver14.peek();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) 10 + "'", obj5, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 10 + "'", obj6, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (byte) 1 + "'", obj16, (byte) 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (byte) 1 + "'", obj18, (byte) 1);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (byte) 1 + "'", obj19, (byte) 1);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (byte) 1 + "'", obj24, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertNotNull(obj33);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test190");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        int int4 = stackTestDriver0.size();
        boolean boolean5 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        java.lang.Object obj8 = stackTestDriver6.push((java.lang.Object) (byte) 1);
        boolean boolean9 = stackTestDriver6.isEmpty();
        int int10 = stackTestDriver6.size();
        boolean boolean11 = stackTestDriver6.isEmpty();
        int int12 = stackTestDriver6.size();
        java.lang.Object obj13 = stackTestDriver6.pop();
        java.lang.Object obj14 = stackTestDriver0.push((java.lang.Object) stackTestDriver6);
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        stackTestDriver15.clear();
        boolean boolean17 = stackTestDriver15.isEmpty();
        int int18 = stackTestDriver15.size();
        java.lang.Object obj20 = stackTestDriver15.push((java.lang.Object) (byte) 10);
        java.lang.Object obj21 = stackTestDriver0.push((java.lang.Object) stackTestDriver15);
        stackTestDriver0.clear();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) 1 + "'", obj8, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (byte) 1 + "'", obj13, (byte) 1);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (byte) 10 + "'", obj20, (byte) 10);
        org.junit.Assert.assertNotNull(obj21);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test191");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        int int4 = stackTestDriver0.size();
        stackTestDriver0.clear();
        java.lang.Class<?> wildcardClass6 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test192");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        boolean boolean2 = stackTestDriver0.isEmpty();
        boolean boolean3 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        java.lang.Object obj6 = stackTestDriver4.push((java.lang.Object) (byte) 1);
        boolean boolean7 = stackTestDriver4.isEmpty();
        int int8 = stackTestDriver4.size();
        boolean boolean9 = stackTestDriver4.isEmpty();
        int int10 = stackTestDriver4.size();
        boolean boolean11 = stackTestDriver4.isEmpty();
        boolean boolean12 = stackTestDriver4.isEmpty();
        java.lang.Class<?> wildcardClass13 = stackTestDriver4.getClass();
        java.lang.Object obj14 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        java.lang.Object obj17 = stackTestDriver15.push((java.lang.Object) (byte) 1);
        boolean boolean18 = stackTestDriver15.isEmpty();
        java.lang.Object obj20 = stackTestDriver15.push((java.lang.Object) (short) 100);
        java.lang.Object obj21 = stackTestDriver15.pop();
        stackTestDriver15.clear();
        boolean boolean23 = stackTestDriver15.isEmpty();
        experiment.util.StackTestDriver stackTestDriver24 = new experiment.util.StackTestDriver();
        java.lang.Object obj26 = stackTestDriver24.push((java.lang.Object) (byte) 1);
        boolean boolean27 = stackTestDriver24.isEmpty();
        int int28 = stackTestDriver24.size();
        boolean boolean29 = stackTestDriver24.isEmpty();
        int int30 = stackTestDriver24.size();
        java.lang.Object obj31 = stackTestDriver24.pop();
        java.lang.Object obj32 = stackTestDriver15.push(obj31);
        java.lang.Object obj33 = stackTestDriver15.pop();
        java.lang.Object obj35 = stackTestDriver15.push((java.lang.Object) 1.0f);
        boolean boolean36 = stackTestDriver15.isEmpty();
        experiment.util.StackTestDriver stackTestDriver37 = new experiment.util.StackTestDriver();
        java.lang.Object obj39 = stackTestDriver37.push((java.lang.Object) (byte) 1);
        boolean boolean40 = stackTestDriver37.isEmpty();
        int int41 = stackTestDriver37.size();
        boolean boolean42 = stackTestDriver37.isEmpty();
        int int43 = stackTestDriver37.size();
        boolean boolean44 = stackTestDriver37.isEmpty();
        int int45 = stackTestDriver37.size();
        stackTestDriver37.clear();
        stackTestDriver37.clear();
        java.lang.Object obj48 = stackTestDriver15.push((java.lang.Object) stackTestDriver37);
        java.lang.Object obj49 = stackTestDriver0.push((java.lang.Object) stackTestDriver37);
        java.lang.Object obj50 = stackTestDriver0.pop();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 1 + "'", obj6, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) 1 + "'", obj17, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (short) 100 + "'", obj20, (short) 100);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (short) 100 + "'", obj21, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + (byte) 1 + "'", obj26, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + (byte) 1 + "'", obj31, (byte) 1);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + (byte) 1 + "'", obj32, (byte) 1);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + (byte) 1 + "'", obj33, (byte) 1);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 1.0f + "'", obj35, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + (byte) 1 + "'", obj39, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertNotNull(obj50);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test193");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        int int4 = stackTestDriver0.size();
        stackTestDriver0.clear();
        int int6 = stackTestDriver0.size();
        boolean boolean7 = stackTestDriver0.isEmpty();
        boolean boolean8 = stackTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test194");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        int int5 = stackTestDriver0.size();
        int int6 = stackTestDriver0.size();
        boolean boolean7 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver9 = new experiment.util.StackTestDriver();
        stackTestDriver9.clear();
        boolean boolean11 = stackTestDriver9.isEmpty();
        int int12 = stackTestDriver9.size();
        java.lang.Object obj14 = stackTestDriver9.push((java.lang.Object) (byte) 10);
        java.lang.Object obj15 = stackTestDriver9.pop();
        stackTestDriver9.clear();
        experiment.util.StackTestDriver stackTestDriver17 = new experiment.util.StackTestDriver();
        stackTestDriver17.clear();
        boolean boolean19 = stackTestDriver17.isEmpty();
        int int20 = stackTestDriver17.size();
        int int21 = stackTestDriver17.size();
        boolean boolean22 = stackTestDriver17.isEmpty();
        experiment.util.StackTestDriver stackTestDriver23 = new experiment.util.StackTestDriver();
        java.lang.Object obj25 = stackTestDriver23.push((java.lang.Object) (byte) 1);
        int int26 = stackTestDriver23.size();
        java.lang.Object obj27 = stackTestDriver23.peek();
        java.lang.Object obj28 = stackTestDriver23.pop();
        java.lang.Object obj29 = stackTestDriver17.push((java.lang.Object) stackTestDriver23);
        java.lang.Object obj30 = stackTestDriver9.push((java.lang.Object) stackTestDriver23);
        java.lang.Object obj31 = stackTestDriver0.push((java.lang.Object) stackTestDriver9);
        experiment.util.StackTestDriver stackTestDriver32 = new experiment.util.StackTestDriver();
        java.lang.Object obj34 = stackTestDriver32.push((java.lang.Object) (byte) 1);
        boolean boolean35 = stackTestDriver32.isEmpty();
        java.lang.Object obj37 = stackTestDriver32.push((java.lang.Object) (short) 100);
        java.lang.Object obj38 = stackTestDriver32.pop();
        stackTestDriver32.clear();
        boolean boolean40 = stackTestDriver32.isEmpty();
        experiment.util.StackTestDriver stackTestDriver41 = new experiment.util.StackTestDriver();
        java.lang.Object obj43 = stackTestDriver41.push((java.lang.Object) (byte) 1);
        boolean boolean44 = stackTestDriver41.isEmpty();
        int int45 = stackTestDriver41.size();
        boolean boolean46 = stackTestDriver41.isEmpty();
        int int47 = stackTestDriver41.size();
        java.lang.Object obj48 = stackTestDriver41.pop();
        java.lang.Object obj49 = stackTestDriver32.push(obj48);
        java.lang.Object obj50 = stackTestDriver32.pop();
        java.lang.Object obj52 = stackTestDriver32.push((java.lang.Object) 1.0f);
        boolean boolean53 = stackTestDriver32.isEmpty();
        experiment.util.StackTestDriver stackTestDriver54 = new experiment.util.StackTestDriver();
        java.lang.Object obj56 = stackTestDriver54.push((java.lang.Object) (byte) 1);
        boolean boolean57 = stackTestDriver54.isEmpty();
        int int58 = stackTestDriver54.size();
        boolean boolean59 = stackTestDriver54.isEmpty();
        int int60 = stackTestDriver54.size();
        boolean boolean61 = stackTestDriver54.isEmpty();
        int int62 = stackTestDriver54.size();
        stackTestDriver54.clear();
        stackTestDriver54.clear();
        java.lang.Object obj65 = stackTestDriver32.push((java.lang.Object) stackTestDriver54);
        java.lang.Object obj66 = stackTestDriver0.push((java.lang.Object) stackTestDriver54);
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (byte) 10 + "'", obj14, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (byte) 10 + "'", obj15, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (byte) 1 + "'", obj25, (byte) 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + (byte) 1 + "'", obj27, (byte) 1);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + (byte) 1 + "'", obj28, (byte) 1);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + (byte) 1 + "'", obj34, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + (short) 100 + "'", obj37, (short) 100);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + (short) 100 + "'", obj38, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + (byte) 1 + "'", obj43, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + (byte) 1 + "'", obj48, (byte) 1);
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + (byte) 1 + "'", obj49, (byte) 1);
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + (byte) 1 + "'", obj50, (byte) 1);
        org.junit.Assert.assertEquals("'" + obj52 + "' != '" + 1.0f + "'", obj52, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertEquals("'" + obj56 + "' != '" + (byte) 1 + "'", obj56, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1 + "'", int58 == 1);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 1 + "'", int62 == 1);
        org.junit.Assert.assertNotNull(obj65);
        org.junit.Assert.assertNotNull(obj66);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test195");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (short) 100);
        java.lang.Object obj6 = stackTestDriver0.pop();
        stackTestDriver0.clear();
        boolean boolean8 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver9 = new experiment.util.StackTestDriver();
        java.lang.Object obj11 = stackTestDriver9.push((java.lang.Object) (byte) 1);
        boolean boolean12 = stackTestDriver9.isEmpty();
        int int13 = stackTestDriver9.size();
        boolean boolean14 = stackTestDriver9.isEmpty();
        int int15 = stackTestDriver9.size();
        java.lang.Object obj16 = stackTestDriver9.pop();
        java.lang.Object obj17 = stackTestDriver0.push(obj16);
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) 100 + "'", obj5, (short) 100);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 100 + "'", obj6, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 1 + "'", obj11, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (byte) 1 + "'", obj16, (byte) 1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) 1 + "'", obj17, (byte) 1);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test196");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        boolean boolean2 = stackTestDriver0.isEmpty();
        int int3 = stackTestDriver0.size();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (byte) 10);
        int int6 = stackTestDriver0.size();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) (-1L));
        boolean boolean9 = stackTestDriver0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) 10 + "'", obj5, (byte) 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1L) + "'", obj8, (-1L));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test197");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (short) 100);
        java.lang.Object obj6 = stackTestDriver0.pop();
        stackTestDriver0.clear();
        boolean boolean8 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver9 = new experiment.util.StackTestDriver();
        java.lang.Object obj11 = stackTestDriver9.push((java.lang.Object) (byte) 1);
        boolean boolean12 = stackTestDriver9.isEmpty();
        int int13 = stackTestDriver9.size();
        boolean boolean14 = stackTestDriver9.isEmpty();
        int int15 = stackTestDriver9.size();
        java.lang.Object obj16 = stackTestDriver9.pop();
        java.lang.Object obj17 = stackTestDriver0.push(obj16);
        experiment.util.StackTestDriver stackTestDriver18 = new experiment.util.StackTestDriver();
        java.lang.Object obj20 = stackTestDriver18.push((java.lang.Object) (byte) 1);
        boolean boolean21 = stackTestDriver18.isEmpty();
        int int22 = stackTestDriver18.size();
        boolean boolean23 = stackTestDriver18.isEmpty();
        experiment.util.StackTestDriver stackTestDriver24 = new experiment.util.StackTestDriver();
        java.lang.Object obj26 = stackTestDriver24.push((java.lang.Object) (byte) 1);
        boolean boolean27 = stackTestDriver24.isEmpty();
        int int28 = stackTestDriver24.size();
        boolean boolean29 = stackTestDriver24.isEmpty();
        int int30 = stackTestDriver24.size();
        java.lang.Object obj31 = stackTestDriver24.pop();
        java.lang.Object obj32 = stackTestDriver18.push((java.lang.Object) stackTestDriver24);
        experiment.util.StackTestDriver stackTestDriver33 = new experiment.util.StackTestDriver();
        java.lang.Object obj35 = stackTestDriver33.push((java.lang.Object) (byte) 1);
        boolean boolean36 = stackTestDriver33.isEmpty();
        java.lang.Object obj38 = stackTestDriver33.push((java.lang.Object) (short) 100);
        java.lang.Object obj39 = stackTestDriver33.pop();
        stackTestDriver33.clear();
        boolean boolean41 = stackTestDriver33.isEmpty();
        java.lang.Class<?> wildcardClass42 = stackTestDriver33.getClass();
        java.lang.Object obj43 = stackTestDriver24.push((java.lang.Object) wildcardClass42);
        java.lang.Object obj44 = stackTestDriver0.push((java.lang.Object) wildcardClass42);
        java.lang.Class<?> wildcardClass45 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) 100 + "'", obj5, (short) 100);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 100 + "'", obj6, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 1 + "'", obj11, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (byte) 1 + "'", obj16, (byte) 1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) 1 + "'", obj17, (byte) 1);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (byte) 1 + "'", obj20, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + (byte) 1 + "'", obj26, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + (byte) 1 + "'", obj31, (byte) 1);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + (byte) 1 + "'", obj35, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + (short) 100 + "'", obj38, (short) 100);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + (short) 100 + "'", obj39, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertNotNull(obj43);
        org.junit.Assert.assertEquals(obj43.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj43), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj43), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertEquals(obj44.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj44), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj44), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test198");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        int int3 = stackTestDriver0.size();
        java.lang.Object obj4 = stackTestDriver0.peek();
        java.lang.Object obj5 = stackTestDriver0.pop();
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) (-1.0f));
        java.lang.Object obj8 = stackTestDriver0.peek();
        java.lang.Object obj9 = stackTestDriver0.peek();
        java.lang.Object obj10 = stackTestDriver0.pop();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 1 + "'", obj4, (byte) 1);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) 1 + "'", obj5, (byte) 1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0f) + "'", obj7, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0f) + "'", obj8, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (-1.0f) + "'", obj9, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (-1.0f) + "'", obj10, (-1.0f));
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test199");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        int int4 = stackTestDriver0.size();
        boolean boolean5 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        java.lang.Object obj8 = stackTestDriver6.push((java.lang.Object) (byte) 1);
        boolean boolean9 = stackTestDriver6.isEmpty();
        int int10 = stackTestDriver6.size();
        boolean boolean11 = stackTestDriver6.isEmpty();
        int int12 = stackTestDriver6.size();
        java.lang.Object obj13 = stackTestDriver6.pop();
        java.lang.Object obj14 = stackTestDriver0.push((java.lang.Object) stackTestDriver6);
        int int15 = stackTestDriver0.size();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver17 = new experiment.util.StackTestDriver();
        java.lang.Object obj19 = stackTestDriver17.push((java.lang.Object) (byte) 1);
        boolean boolean20 = stackTestDriver17.isEmpty();
        java.lang.Object obj22 = stackTestDriver17.push((java.lang.Object) (short) 100);
        java.lang.Object obj23 = stackTestDriver17.pop();
        java.lang.Class<?> wildcardClass24 = stackTestDriver17.getClass();
        java.lang.Object obj25 = stackTestDriver0.push((java.lang.Object) stackTestDriver17);
        experiment.util.StackTestDriver stackTestDriver26 = new experiment.util.StackTestDriver();
        stackTestDriver26.clear();
        boolean boolean28 = stackTestDriver26.isEmpty();
        int int29 = stackTestDriver26.size();
        int int30 = stackTestDriver26.size();
        boolean boolean31 = stackTestDriver26.isEmpty();
        experiment.util.StackTestDriver stackTestDriver32 = new experiment.util.StackTestDriver();
        java.lang.Object obj34 = stackTestDriver32.push((java.lang.Object) (byte) 1);
        int int35 = stackTestDriver32.size();
        java.lang.Object obj36 = stackTestDriver32.peek();
        java.lang.Object obj37 = stackTestDriver32.pop();
        java.lang.Object obj38 = stackTestDriver26.push((java.lang.Object) stackTestDriver32);
        java.lang.Object obj39 = stackTestDriver0.push((java.lang.Object) stackTestDriver32);
        java.lang.Object obj40 = stackTestDriver0.peek();
        experiment.util.StackTestDriver stackTestDriver41 = new experiment.util.StackTestDriver();
        stackTestDriver41.clear();
        boolean boolean43 = stackTestDriver41.isEmpty();
        int int44 = stackTestDriver41.size();
        int int45 = stackTestDriver41.size();
        stackTestDriver41.clear();
        java.lang.Object obj47 = stackTestDriver0.push((java.lang.Object) stackTestDriver41);
        java.lang.Class<?> wildcardClass48 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) 1 + "'", obj8, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (byte) 1 + "'", obj13, (byte) 1);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (byte) 1 + "'", obj19, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (short) 100 + "'", obj22, (short) 100);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (short) 100 + "'", obj23, (short) 100);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + (byte) 1 + "'", obj34, (byte) 1);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + (byte) 1 + "'", obj36, (byte) 1);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + (byte) 1 + "'", obj37, (byte) 1);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test200");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        int int3 = stackTestDriver0.size();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) 100L);
        int int6 = stackTestDriver0.size();
        java.lang.Object obj7 = stackTestDriver0.peek();
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) false);
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100L + "'", obj5, 100L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 100L + "'", obj7, 100L);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + false + "'", obj9, false);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test201");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        int int4 = stackTestDriver0.size();
        boolean boolean5 = stackTestDriver0.isEmpty();
        int int6 = stackTestDriver0.size();
        java.lang.Object obj7 = stackTestDriver0.peek();
        boolean boolean8 = stackTestDriver0.isEmpty();
        int int9 = stackTestDriver0.size();
        java.lang.Object obj10 = stackTestDriver0.pop();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 1 + "'", obj7, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) 1 + "'", obj10, (byte) 1);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test202");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        int int4 = stackTestDriver0.size();
        boolean boolean5 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        java.lang.Object obj8 = stackTestDriver6.push((java.lang.Object) (byte) 1);
        boolean boolean9 = stackTestDriver6.isEmpty();
        boolean boolean10 = stackTestDriver6.isEmpty();
        java.lang.Object obj11 = stackTestDriver0.push((java.lang.Object) stackTestDriver6);
        boolean boolean12 = stackTestDriver6.isEmpty();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) 1 + "'", obj8, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test203");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        int int4 = stackTestDriver0.size();
        boolean boolean5 = stackTestDriver0.isEmpty();
        int int6 = stackTestDriver0.size();
        java.lang.Object obj7 = stackTestDriver0.peek();
        boolean boolean8 = stackTestDriver0.isEmpty();
        boolean boolean9 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        java.lang.Object obj12 = stackTestDriver10.push((java.lang.Object) (byte) 1);
        stackTestDriver10.clear();
        java.lang.Object obj14 = stackTestDriver0.push((java.lang.Object) stackTestDriver10);
        stackTestDriver10.clear();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 1 + "'", obj7, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) 1 + "'", obj12, (byte) 1);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test204");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        boolean boolean2 = stackTestDriver0.isEmpty();
        boolean boolean3 = stackTestDriver0.isEmpty();
        int int4 = stackTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test205");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        int int5 = stackTestDriver0.size();
        int int6 = stackTestDriver0.size();
        boolean boolean7 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver9 = new experiment.util.StackTestDriver();
        java.lang.Object obj11 = stackTestDriver9.push((java.lang.Object) (byte) 1);
        boolean boolean12 = stackTestDriver9.isEmpty();
        int int13 = stackTestDriver9.size();
        boolean boolean14 = stackTestDriver9.isEmpty();
        int int15 = stackTestDriver9.size();
        java.lang.Object obj16 = stackTestDriver9.peek();
        boolean boolean17 = stackTestDriver9.isEmpty();
        java.lang.Object obj18 = stackTestDriver0.push((java.lang.Object) stackTestDriver9);
        boolean boolean19 = stackTestDriver9.isEmpty();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 1 + "'", obj11, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (byte) 1 + "'", obj16, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test206");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        int int4 = stackTestDriver0.size();
        boolean boolean5 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        java.lang.Object obj8 = stackTestDriver6.push((java.lang.Object) (byte) 1);
        boolean boolean9 = stackTestDriver6.isEmpty();
        int int10 = stackTestDriver6.size();
        boolean boolean11 = stackTestDriver6.isEmpty();
        int int12 = stackTestDriver6.size();
        java.lang.Object obj13 = stackTestDriver6.pop();
        java.lang.Object obj14 = stackTestDriver0.push((java.lang.Object) stackTestDriver6);
        int int15 = stackTestDriver0.size();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver17 = new experiment.util.StackTestDriver();
        java.lang.Object obj19 = stackTestDriver17.push((java.lang.Object) (byte) 1);
        boolean boolean20 = stackTestDriver17.isEmpty();
        java.lang.Object obj22 = stackTestDriver17.push((java.lang.Object) (short) 100);
        java.lang.Object obj23 = stackTestDriver17.pop();
        java.lang.Class<?> wildcardClass24 = stackTestDriver17.getClass();
        java.lang.Object obj25 = stackTestDriver0.push((java.lang.Object) stackTestDriver17);
        experiment.util.StackTestDriver stackTestDriver26 = new experiment.util.StackTestDriver();
        stackTestDriver26.clear();
        boolean boolean28 = stackTestDriver26.isEmpty();
        int int29 = stackTestDriver26.size();
        int int30 = stackTestDriver26.size();
        boolean boolean31 = stackTestDriver26.isEmpty();
        experiment.util.StackTestDriver stackTestDriver32 = new experiment.util.StackTestDriver();
        java.lang.Object obj34 = stackTestDriver32.push((java.lang.Object) (byte) 1);
        int int35 = stackTestDriver32.size();
        java.lang.Object obj36 = stackTestDriver32.peek();
        java.lang.Object obj37 = stackTestDriver32.pop();
        java.lang.Object obj38 = stackTestDriver26.push((java.lang.Object) stackTestDriver32);
        java.lang.Object obj39 = stackTestDriver0.push((java.lang.Object) stackTestDriver32);
        int int40 = stackTestDriver0.size();
        java.lang.Object obj41 = stackTestDriver0.peek();
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj43 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) 1 + "'", obj8, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (byte) 1 + "'", obj13, (byte) 1);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (byte) 1 + "'", obj19, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (short) 100 + "'", obj22, (short) 100);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (short) 100 + "'", obj23, (short) 100);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + (byte) 1 + "'", obj34, (byte) 1);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + (byte) 1 + "'", obj36, (byte) 1);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + (byte) 1 + "'", obj37, (byte) 1);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 2 + "'", int40 == 2);
        org.junit.Assert.assertNotNull(obj41);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test207");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        int int4 = stackTestDriver0.size();
        boolean boolean5 = stackTestDriver0.isEmpty();
        int int6 = stackTestDriver0.size();
        java.lang.Object obj7 = stackTestDriver0.peek();
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        java.lang.Object obj10 = stackTestDriver8.push((java.lang.Object) (byte) 1);
        boolean boolean11 = stackTestDriver8.isEmpty();
        int int12 = stackTestDriver8.size();
        stackTestDriver8.clear();
        stackTestDriver8.clear();
        java.lang.Object obj15 = stackTestDriver0.push((java.lang.Object) stackTestDriver8);
        stackTestDriver8.clear();
        stackTestDriver8.clear();
        experiment.util.StackTestDriver stackTestDriver18 = new experiment.util.StackTestDriver();
        java.lang.Object obj20 = stackTestDriver18.push((java.lang.Object) (byte) 1);
        boolean boolean21 = stackTestDriver18.isEmpty();
        int int22 = stackTestDriver18.size();
        boolean boolean23 = stackTestDriver18.isEmpty();
        stackTestDriver18.clear();
        experiment.util.StackTestDriver stackTestDriver25 = new experiment.util.StackTestDriver();
        java.lang.Object obj27 = stackTestDriver25.push((java.lang.Object) (byte) 1);
        boolean boolean28 = stackTestDriver25.isEmpty();
        java.lang.Object obj30 = stackTestDriver25.push((java.lang.Object) (short) 100);
        java.lang.Object obj31 = stackTestDriver25.pop();
        stackTestDriver25.clear();
        boolean boolean33 = stackTestDriver25.isEmpty();
        experiment.util.StackTestDriver stackTestDriver34 = new experiment.util.StackTestDriver();
        java.lang.Object obj36 = stackTestDriver34.push((java.lang.Object) (byte) 1);
        boolean boolean37 = stackTestDriver34.isEmpty();
        int int38 = stackTestDriver34.size();
        boolean boolean39 = stackTestDriver34.isEmpty();
        int int40 = stackTestDriver34.size();
        java.lang.Object obj41 = stackTestDriver34.pop();
        java.lang.Object obj42 = stackTestDriver25.push(obj41);
        java.lang.Object obj43 = stackTestDriver18.push(obj41);
        int int44 = stackTestDriver18.size();
        java.lang.Object obj45 = stackTestDriver8.push((java.lang.Object) stackTestDriver18);
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 1 + "'", obj7, (byte) 1);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) 1 + "'", obj10, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (byte) 1 + "'", obj20, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + (byte) 1 + "'", obj27, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + (short) 100 + "'", obj30, (short) 100);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + (short) 100 + "'", obj31, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + (byte) 1 + "'", obj36, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + (byte) 1 + "'", obj41, (byte) 1);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + (byte) 1 + "'", obj42, (byte) 1);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + (byte) 1 + "'", obj43, (byte) 1);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertNotNull(obj45);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test208");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (short) 100);
        stackTestDriver0.clear();
        boolean boolean7 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        boolean boolean9 = stackTestDriver0.isEmpty();
        int int10 = stackTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) 100 + "'", obj5, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test209");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (short) 100);
        java.lang.Object obj6 = stackTestDriver0.pop();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver9 = new experiment.util.StackTestDriver();
        java.lang.Object obj11 = stackTestDriver9.push((java.lang.Object) (byte) 1);
        boolean boolean12 = stackTestDriver9.isEmpty();
        java.lang.Object obj14 = stackTestDriver9.push((java.lang.Object) (short) 100);
        java.lang.Object obj15 = stackTestDriver0.push((java.lang.Object) (short) 100);
        java.lang.Object obj16 = stackTestDriver0.peek();
        java.lang.Object obj17 = stackTestDriver0.pop();
        stackTestDriver0.clear();
        boolean boolean19 = stackTestDriver0.isEmpty();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) 100 + "'", obj5, (short) 100);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 100 + "'", obj6, (short) 100);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 1 + "'", obj11, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (short) 100 + "'", obj14, (short) 100);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (short) 100 + "'", obj15, (short) 100);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (short) 100 + "'", obj16, (short) 100);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (short) 100 + "'", obj17, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test210");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (short) 100);
        int int6 = stackTestDriver0.size();
        boolean boolean7 = stackTestDriver0.isEmpty();
        int int8 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver9 = new experiment.util.StackTestDriver();
        java.lang.Object obj11 = stackTestDriver9.push((java.lang.Object) (byte) 1);
        boolean boolean12 = stackTestDriver9.isEmpty();
        int int13 = stackTestDriver9.size();
        boolean boolean14 = stackTestDriver9.isEmpty();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        java.lang.Object obj17 = stackTestDriver15.push((java.lang.Object) (byte) 1);
        boolean boolean18 = stackTestDriver15.isEmpty();
        boolean boolean19 = stackTestDriver15.isEmpty();
        java.lang.Object obj20 = stackTestDriver9.push((java.lang.Object) stackTestDriver15);
        java.lang.Object obj21 = stackTestDriver9.peek();
        java.lang.Object obj22 = stackTestDriver0.push(obj21);
        java.lang.Object obj23 = stackTestDriver0.pop();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) 100 + "'", obj5, (short) 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 1 + "'", obj11, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) 1 + "'", obj17, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(obj23);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test211");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        int int4 = stackTestDriver0.size();
        java.lang.Object obj5 = stackTestDriver0.peek();
        java.lang.Object obj6 = stackTestDriver0.peek();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) 1 + "'", obj5, (byte) 1);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 1 + "'", obj6, (byte) 1);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test212");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (short) 100);
        java.lang.Object obj6 = stackTestDriver0.pop();
        stackTestDriver0.clear();
        boolean boolean8 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver9 = new experiment.util.StackTestDriver();
        java.lang.Object obj11 = stackTestDriver9.push((java.lang.Object) (byte) 1);
        boolean boolean12 = stackTestDriver9.isEmpty();
        int int13 = stackTestDriver9.size();
        boolean boolean14 = stackTestDriver9.isEmpty();
        int int15 = stackTestDriver9.size();
        java.lang.Object obj16 = stackTestDriver9.pop();
        java.lang.Object obj17 = stackTestDriver0.push(obj16);
        java.lang.Object obj18 = stackTestDriver0.peek();
        experiment.util.StackTestDriver stackTestDriver19 = new experiment.util.StackTestDriver();
        java.lang.Object obj21 = stackTestDriver19.push((java.lang.Object) (byte) 1);
        java.lang.Class<?> wildcardClass22 = obj21.getClass();
        java.lang.Object obj23 = stackTestDriver0.push((java.lang.Object) wildcardClass22);
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) 100 + "'", obj5, (short) 100);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 100 + "'", obj6, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 1 + "'", obj11, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (byte) 1 + "'", obj16, (byte) 1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) 1 + "'", obj17, (byte) 1);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (byte) 1 + "'", obj18, (byte) 1);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (byte) 1 + "'", obj21, (byte) 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertEquals(obj23.toString(), "class java.lang.Byte");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj23), "class java.lang.Byte");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj23), "class java.lang.Byte");
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test213");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
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
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test214");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        boolean boolean2 = stackTestDriver0.isEmpty();
        int int3 = stackTestDriver0.size();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (byte) 10);
        int int6 = stackTestDriver0.size();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) (-1L));
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) 10 + "'", obj5, (byte) 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1L) + "'", obj8, (-1L));
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test215");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        boolean boolean2 = stackTestDriver0.isEmpty();
        boolean boolean3 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        java.lang.Object obj6 = stackTestDriver4.push((java.lang.Object) (byte) 1);
        boolean boolean7 = stackTestDriver4.isEmpty();
        int int8 = stackTestDriver4.size();
        boolean boolean9 = stackTestDriver4.isEmpty();
        int int10 = stackTestDriver4.size();
        boolean boolean11 = stackTestDriver4.isEmpty();
        boolean boolean12 = stackTestDriver4.isEmpty();
        java.lang.Class<?> wildcardClass13 = stackTestDriver4.getClass();
        java.lang.Object obj14 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        java.lang.Object obj17 = stackTestDriver15.push((java.lang.Object) (byte) 1);
        boolean boolean18 = stackTestDriver15.isEmpty();
        java.lang.Object obj20 = stackTestDriver15.push((java.lang.Object) (short) 100);
        java.lang.Object obj21 = stackTestDriver15.pop();
        stackTestDriver15.clear();
        boolean boolean23 = stackTestDriver15.isEmpty();
        experiment.util.StackTestDriver stackTestDriver24 = new experiment.util.StackTestDriver();
        java.lang.Object obj26 = stackTestDriver24.push((java.lang.Object) (byte) 1);
        boolean boolean27 = stackTestDriver24.isEmpty();
        int int28 = stackTestDriver24.size();
        boolean boolean29 = stackTestDriver24.isEmpty();
        int int30 = stackTestDriver24.size();
        java.lang.Object obj31 = stackTestDriver24.pop();
        java.lang.Object obj32 = stackTestDriver15.push(obj31);
        java.lang.Object obj33 = stackTestDriver15.pop();
        java.lang.Object obj35 = stackTestDriver15.push((java.lang.Object) 1.0f);
        boolean boolean36 = stackTestDriver15.isEmpty();
        experiment.util.StackTestDriver stackTestDriver37 = new experiment.util.StackTestDriver();
        java.lang.Object obj39 = stackTestDriver37.push((java.lang.Object) (byte) 1);
        boolean boolean40 = stackTestDriver37.isEmpty();
        int int41 = stackTestDriver37.size();
        boolean boolean42 = stackTestDriver37.isEmpty();
        int int43 = stackTestDriver37.size();
        boolean boolean44 = stackTestDriver37.isEmpty();
        int int45 = stackTestDriver37.size();
        stackTestDriver37.clear();
        stackTestDriver37.clear();
        java.lang.Object obj48 = stackTestDriver15.push((java.lang.Object) stackTestDriver37);
        java.lang.Object obj49 = stackTestDriver0.push((java.lang.Object) stackTestDriver37);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj50 = stackTestDriver37.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 1 + "'", obj6, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) 1 + "'", obj17, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (short) 100 + "'", obj20, (short) 100);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (short) 100 + "'", obj21, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + (byte) 1 + "'", obj26, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + (byte) 1 + "'", obj31, (byte) 1);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + (byte) 1 + "'", obj32, (byte) 1);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + (byte) 1 + "'", obj33, (byte) 1);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 1.0f + "'", obj35, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + (byte) 1 + "'", obj39, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertNotNull(obj49);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test216");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        int int4 = stackTestDriver0.size();
        boolean boolean5 = stackTestDriver0.isEmpty();
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) 100.0d);
        java.lang.Object obj8 = stackTestDriver0.pop();
        java.lang.Class<?> wildcardClass9 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 100.0d + "'", obj7, 100.0d);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 100.0d + "'", obj8, 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test217");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        java.lang.Object obj3 = stackTestDriver0.push((java.lang.Object) 1.0d);
        boolean boolean4 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        boolean boolean6 = stackTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 1.0d + "'", obj3, 1.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test218");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        int int4 = stackTestDriver0.size();
        boolean boolean5 = stackTestDriver0.isEmpty();
        int int6 = stackTestDriver0.size();
        java.lang.Object obj7 = stackTestDriver0.peek();
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        java.lang.Object obj10 = stackTestDriver8.push((java.lang.Object) (byte) 1);
        boolean boolean11 = stackTestDriver8.isEmpty();
        int int12 = stackTestDriver8.size();
        stackTestDriver8.clear();
        stackTestDriver8.clear();
        java.lang.Object obj15 = stackTestDriver0.push((java.lang.Object) stackTestDriver8);
        experiment.util.StackTestDriver stackTestDriver16 = new experiment.util.StackTestDriver();
        java.lang.Object obj18 = stackTestDriver16.push((java.lang.Object) (byte) 1);
        boolean boolean19 = stackTestDriver16.isEmpty();
        int int20 = stackTestDriver16.size();
        stackTestDriver16.clear();
        int int22 = stackTestDriver16.size();
        java.lang.Object obj23 = stackTestDriver0.push((java.lang.Object) stackTestDriver16);
        stackTestDriver16.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = stackTestDriver16.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 1 + "'", obj7, (byte) 1);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) 1 + "'", obj10, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (byte) 1 + "'", obj18, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(obj23);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test219");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        int int4 = stackTestDriver0.size();
        boolean boolean5 = stackTestDriver0.isEmpty();
        int int6 = stackTestDriver0.size();
        java.lang.Object obj7 = stackTestDriver0.peek();
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        java.lang.Object obj10 = stackTestDriver8.push((java.lang.Object) (byte) 1);
        boolean boolean11 = stackTestDriver8.isEmpty();
        int int12 = stackTestDriver8.size();
        stackTestDriver8.clear();
        stackTestDriver8.clear();
        java.lang.Object obj15 = stackTestDriver0.push((java.lang.Object) stackTestDriver8);
        boolean boolean16 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver17 = new experiment.util.StackTestDriver();
        java.lang.Object obj19 = stackTestDriver17.push((java.lang.Object) (byte) 1);
        boolean boolean20 = stackTestDriver17.isEmpty();
        int int21 = stackTestDriver17.size();
        boolean boolean22 = stackTestDriver17.isEmpty();
        experiment.util.StackTestDriver stackTestDriver23 = new experiment.util.StackTestDriver();
        java.lang.Object obj25 = stackTestDriver23.push((java.lang.Object) (byte) 1);
        boolean boolean26 = stackTestDriver23.isEmpty();
        boolean boolean27 = stackTestDriver23.isEmpty();
        java.lang.Object obj28 = stackTestDriver17.push((java.lang.Object) stackTestDriver23);
        java.lang.Object obj29 = stackTestDriver17.peek();
        java.lang.Object obj30 = stackTestDriver0.push((java.lang.Object) stackTestDriver17);
        java.lang.Object obj31 = stackTestDriver17.peek();
        java.lang.Class<?> wildcardClass32 = obj31.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 1 + "'", obj7, (byte) 1);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) 1 + "'", obj10, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (byte) 1 + "'", obj19, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (byte) 1 + "'", obj25, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test220");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        boolean boolean2 = stackTestDriver0.isEmpty();
        int int3 = stackTestDriver0.size();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (byte) 10);
        java.lang.Object obj6 = stackTestDriver0.pop();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        stackTestDriver8.clear();
        boolean boolean10 = stackTestDriver8.isEmpty();
        int int11 = stackTestDriver8.size();
        int int12 = stackTestDriver8.size();
        boolean boolean13 = stackTestDriver8.isEmpty();
        experiment.util.StackTestDriver stackTestDriver14 = new experiment.util.StackTestDriver();
        java.lang.Object obj16 = stackTestDriver14.push((java.lang.Object) (byte) 1);
        int int17 = stackTestDriver14.size();
        java.lang.Object obj18 = stackTestDriver14.peek();
        java.lang.Object obj19 = stackTestDriver14.pop();
        java.lang.Object obj20 = stackTestDriver8.push((java.lang.Object) stackTestDriver14);
        java.lang.Object obj21 = stackTestDriver0.push((java.lang.Object) stackTestDriver14);
        java.lang.Object obj22 = stackTestDriver0.pop();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) 10 + "'", obj5, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 10 + "'", obj6, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (byte) 1 + "'", obj16, (byte) 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (byte) 1 + "'", obj18, (byte) 1);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (byte) 1 + "'", obj19, (byte) 1);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(obj22);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test221");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (short) 100);
        java.lang.Object obj6 = stackTestDriver0.pop();
        stackTestDriver0.clear();
        boolean boolean8 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver9 = new experiment.util.StackTestDriver();
        java.lang.Object obj11 = stackTestDriver9.push((java.lang.Object) (byte) 1);
        boolean boolean12 = stackTestDriver9.isEmpty();
        int int13 = stackTestDriver9.size();
        boolean boolean14 = stackTestDriver9.isEmpty();
        int int15 = stackTestDriver9.size();
        java.lang.Object obj16 = stackTestDriver9.pop();
        java.lang.Object obj17 = stackTestDriver0.push(obj16);
        stackTestDriver0.clear();
        boolean boolean19 = stackTestDriver0.isEmpty();
        boolean boolean20 = stackTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) 100 + "'", obj5, (short) 100);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 100 + "'", obj6, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 1 + "'", obj11, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (byte) 1 + "'", obj16, (byte) 1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) 1 + "'", obj17, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test222");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        boolean boolean2 = stackTestDriver0.isEmpty();
        int int3 = stackTestDriver0.size();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (byte) 10);
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver7 = new experiment.util.StackTestDriver();
        java.lang.Object obj9 = stackTestDriver7.push((java.lang.Object) (byte) 1);
        boolean boolean10 = stackTestDriver7.isEmpty();
        int int11 = stackTestDriver7.size();
        boolean boolean12 = stackTestDriver7.isEmpty();
        int int13 = stackTestDriver7.size();
        int int14 = stackTestDriver7.size();
        java.lang.Object obj15 = stackTestDriver0.push((java.lang.Object) stackTestDriver7);
        stackTestDriver0.clear();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) 10 + "'", obj5, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) 1 + "'", obj9, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test223");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (short) 100);
        boolean boolean6 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) 100 + "'", obj5, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test224");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        int int3 = stackTestDriver0.size();
        java.lang.Object obj4 = stackTestDriver0.peek();
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) 10L);
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) 1.0f);
        java.lang.Object obj9 = stackTestDriver0.pop();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 1 + "'", obj4, (byte) 1);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 10L + "'", obj6, 10L);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 1.0f + "'", obj8, 1.0f);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 1.0f + "'", obj9, 1.0f);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test225");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        java.lang.Object obj6 = stackTestDriver4.push((java.lang.Object) (byte) 1);
        boolean boolean7 = stackTestDriver4.isEmpty();
        int int8 = stackTestDriver4.size();
        boolean boolean9 = stackTestDriver4.isEmpty();
        int int10 = stackTestDriver4.size();
        java.lang.Object obj11 = stackTestDriver4.peek();
        experiment.util.StackTestDriver stackTestDriver12 = new experiment.util.StackTestDriver();
        java.lang.Object obj14 = stackTestDriver12.push((java.lang.Object) (byte) 1);
        boolean boolean15 = stackTestDriver12.isEmpty();
        int int16 = stackTestDriver12.size();
        stackTestDriver12.clear();
        stackTestDriver12.clear();
        java.lang.Object obj19 = stackTestDriver4.push((java.lang.Object) stackTestDriver12);
        boolean boolean20 = stackTestDriver4.isEmpty();
        java.lang.Object obj21 = stackTestDriver0.push((java.lang.Object) boolean20);
        boolean boolean22 = stackTestDriver0.isEmpty();
        boolean boolean23 = stackTestDriver0.isEmpty();
        java.lang.Class<?> wildcardClass24 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 1 + "'", obj6, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 1 + "'", obj11, (byte) 1);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (byte) 1 + "'", obj14, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + false + "'", obj21, false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test226");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        int int4 = stackTestDriver0.size();
        boolean boolean5 = stackTestDriver0.isEmpty();
        int int6 = stackTestDriver0.size();
        java.lang.Object obj7 = stackTestDriver0.peek();
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        java.lang.Object obj10 = stackTestDriver8.push((java.lang.Object) (byte) 1);
        boolean boolean11 = stackTestDriver8.isEmpty();
        int int12 = stackTestDriver8.size();
        stackTestDriver8.clear();
        stackTestDriver8.clear();
        java.lang.Object obj15 = stackTestDriver0.push((java.lang.Object) stackTestDriver8);
        boolean boolean16 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver17 = new experiment.util.StackTestDriver();
        java.lang.Object obj19 = stackTestDriver17.push((java.lang.Object) (byte) 1);
        boolean boolean20 = stackTestDriver17.isEmpty();
        int int21 = stackTestDriver17.size();
        boolean boolean22 = stackTestDriver17.isEmpty();
        experiment.util.StackTestDriver stackTestDriver23 = new experiment.util.StackTestDriver();
        java.lang.Object obj25 = stackTestDriver23.push((java.lang.Object) (byte) 1);
        boolean boolean26 = stackTestDriver23.isEmpty();
        boolean boolean27 = stackTestDriver23.isEmpty();
        java.lang.Object obj28 = stackTestDriver17.push((java.lang.Object) stackTestDriver23);
        java.lang.Object obj29 = stackTestDriver17.peek();
        java.lang.Object obj30 = stackTestDriver0.push((java.lang.Object) stackTestDriver17);
        stackTestDriver0.clear();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 1 + "'", obj7, (byte) 1);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) 1 + "'", obj10, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (byte) 1 + "'", obj19, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (byte) 1 + "'", obj25, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNotNull(obj30);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test227");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        boolean boolean2 = stackTestDriver0.isEmpty();
        int int3 = stackTestDriver0.size();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (byte) 10);
        stackTestDriver0.clear();
        int int7 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        java.lang.Object obj10 = stackTestDriver8.push((java.lang.Object) (byte) 1);
        boolean boolean11 = stackTestDriver8.isEmpty();
        int int12 = stackTestDriver8.size();
        stackTestDriver8.clear();
        int int14 = stackTestDriver8.size();
        boolean boolean15 = stackTestDriver8.isEmpty();
        boolean boolean16 = stackTestDriver8.isEmpty();
        java.lang.Object obj17 = stackTestDriver0.push((java.lang.Object) stackTestDriver8);
        java.lang.Object obj18 = stackTestDriver0.pop();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) 10 + "'", obj5, (byte) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) 1 + "'", obj10, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNotNull(obj18);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test228");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        int int3 = stackTestDriver0.size();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) 100L);
        java.lang.Object obj6 = stackTestDriver0.pop();
        java.lang.Object obj7 = stackTestDriver0.pop();
        int int8 = stackTestDriver0.size();
        int int9 = stackTestDriver0.size();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100L + "'", obj5, 100L);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 100L + "'", obj6, 100L);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 1 + "'", obj7, (byte) 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test229");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        int int4 = stackTestDriver0.size();
        boolean boolean5 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        java.lang.Object obj8 = stackTestDriver6.push((java.lang.Object) (byte) 1);
        boolean boolean9 = stackTestDriver6.isEmpty();
        int int10 = stackTestDriver6.size();
        boolean boolean11 = stackTestDriver6.isEmpty();
        int int12 = stackTestDriver6.size();
        java.lang.Object obj13 = stackTestDriver6.pop();
        java.lang.Object obj14 = stackTestDriver0.push((java.lang.Object) stackTestDriver6);
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        stackTestDriver15.clear();
        boolean boolean17 = stackTestDriver15.isEmpty();
        int int18 = stackTestDriver15.size();
        java.lang.Object obj20 = stackTestDriver15.push((java.lang.Object) (byte) 10);
        java.lang.Object obj21 = stackTestDriver0.push((java.lang.Object) stackTestDriver15);
        int int22 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver23 = new experiment.util.StackTestDriver();
        java.lang.Object obj25 = stackTestDriver23.push((java.lang.Object) (byte) 1);
        int int26 = stackTestDriver23.size();
        java.lang.Object obj27 = stackTestDriver23.peek();
        java.lang.Object obj28 = stackTestDriver23.pop();
        java.lang.Object obj30 = stackTestDriver23.push((java.lang.Object) (-1.0f));
        java.lang.Class<?> wildcardClass31 = obj30.getClass();
        java.lang.Object obj32 = stackTestDriver0.push((java.lang.Object) wildcardClass31);
        int int33 = stackTestDriver0.size();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) 1 + "'", obj8, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (byte) 1 + "'", obj13, (byte) 1);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (byte) 10 + "'", obj20, (byte) 10);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (byte) 1 + "'", obj25, (byte) 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + (byte) 1 + "'", obj27, (byte) 1);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + (byte) 1 + "'", obj28, (byte) 1);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + (-1.0f) + "'", obj30, (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertEquals(obj32.toString(), "class java.lang.Float");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj32), "class java.lang.Float");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj32), "class java.lang.Float");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 4 + "'", int33 == 4);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test230");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        int int4 = stackTestDriver0.size();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        boolean boolean7 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        java.lang.Object obj10 = stackTestDriver8.push((java.lang.Object) (byte) 1);
        boolean boolean11 = stackTestDriver8.isEmpty();
        int int12 = stackTestDriver8.size();
        boolean boolean13 = stackTestDriver8.isEmpty();
        int int14 = stackTestDriver8.size();
        java.lang.Object obj15 = stackTestDriver8.peek();
        experiment.util.StackTestDriver stackTestDriver16 = new experiment.util.StackTestDriver();
        java.lang.Object obj18 = stackTestDriver16.push((java.lang.Object) (byte) 1);
        boolean boolean19 = stackTestDriver16.isEmpty();
        int int20 = stackTestDriver16.size();
        stackTestDriver16.clear();
        stackTestDriver16.clear();
        java.lang.Object obj23 = stackTestDriver8.push((java.lang.Object) stackTestDriver16);
        experiment.util.StackTestDriver stackTestDriver24 = new experiment.util.StackTestDriver();
        java.lang.Object obj26 = stackTestDriver24.push((java.lang.Object) (byte) 1);
        boolean boolean27 = stackTestDriver24.isEmpty();
        int int28 = stackTestDriver24.size();
        stackTestDriver24.clear();
        int int30 = stackTestDriver24.size();
        java.lang.Object obj31 = stackTestDriver8.push((java.lang.Object) stackTestDriver24);
        java.lang.Class<?> wildcardClass32 = stackTestDriver24.getClass();
        java.lang.Object obj33 = stackTestDriver0.push((java.lang.Object) wildcardClass32);
        experiment.util.StackTestDriver stackTestDriver34 = new experiment.util.StackTestDriver();
        java.lang.Object obj36 = stackTestDriver34.push((java.lang.Object) (byte) 1);
        boolean boolean37 = stackTestDriver34.isEmpty();
        int int38 = stackTestDriver34.size();
        boolean boolean39 = stackTestDriver34.isEmpty();
        int int40 = stackTestDriver34.size();
        java.lang.Object obj41 = stackTestDriver34.peek();
        experiment.util.StackTestDriver stackTestDriver42 = new experiment.util.StackTestDriver();
        java.lang.Object obj44 = stackTestDriver42.push((java.lang.Object) (byte) 1);
        boolean boolean45 = stackTestDriver42.isEmpty();
        int int46 = stackTestDriver42.size();
        stackTestDriver42.clear();
        stackTestDriver42.clear();
        java.lang.Object obj49 = stackTestDriver34.push((java.lang.Object) stackTestDriver42);
        experiment.util.StackTestDriver stackTestDriver50 = new experiment.util.StackTestDriver();
        java.lang.Object obj52 = stackTestDriver50.push((java.lang.Object) (byte) 1);
        boolean boolean53 = stackTestDriver50.isEmpty();
        int int54 = stackTestDriver50.size();
        stackTestDriver50.clear();
        int int56 = stackTestDriver50.size();
        java.lang.Object obj57 = stackTestDriver34.push((java.lang.Object) stackTestDriver50);
        stackTestDriver50.clear();
        stackTestDriver50.clear();
        boolean boolean60 = stackTestDriver50.isEmpty();
        java.lang.Object obj61 = stackTestDriver0.push((java.lang.Object) boolean60);
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) 1 + "'", obj10, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (byte) 1 + "'", obj15, (byte) 1);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (byte) 1 + "'", obj18, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + (byte) 1 + "'", obj26, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertEquals(obj33.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj33), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj33), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + (byte) 1 + "'", obj36, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + (byte) 1 + "'", obj41, (byte) 1);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + (byte) 1 + "'", obj44, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertEquals("'" + obj52 + "' != '" + (byte) 1 + "'", obj52, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(obj57);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertEquals("'" + obj61 + "' != '" + true + "'", obj61, true);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test231");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        int int4 = stackTestDriver0.size();
        boolean boolean5 = stackTestDriver0.isEmpty();
        boolean boolean6 = stackTestDriver0.isEmpty();
        java.lang.Object obj7 = stackTestDriver0.pop();
        stackTestDriver0.clear();
        java.lang.Object obj10 = stackTestDriver0.push((java.lang.Object) 10.0d);
        java.lang.Object obj12 = stackTestDriver0.push((java.lang.Object) 10.0f);
        java.lang.Class<?> wildcardClass13 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 1 + "'", obj7, (byte) 1);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 10.0d + "'", obj10, 10.0d);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 10.0f + "'", obj12, 10.0f);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test232");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        int int4 = stackTestDriver0.size();
        boolean boolean5 = stackTestDriver0.isEmpty();
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) 100.0d);
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 100.0d + "'", obj7, 100.0d);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test233");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (short) 100);
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver7 = new experiment.util.StackTestDriver();
        java.lang.Object obj9 = stackTestDriver7.push((java.lang.Object) (byte) 1);
        boolean boolean10 = stackTestDriver7.isEmpty();
        java.lang.Object obj12 = stackTestDriver7.push((java.lang.Object) (short) 100);
        java.lang.Object obj13 = stackTestDriver7.pop();
        stackTestDriver7.clear();
        boolean boolean15 = stackTestDriver7.isEmpty();
        experiment.util.StackTestDriver stackTestDriver16 = new experiment.util.StackTestDriver();
        java.lang.Object obj18 = stackTestDriver16.push((java.lang.Object) (byte) 1);
        boolean boolean19 = stackTestDriver16.isEmpty();
        int int20 = stackTestDriver16.size();
        boolean boolean21 = stackTestDriver16.isEmpty();
        int int22 = stackTestDriver16.size();
        java.lang.Object obj23 = stackTestDriver16.pop();
        java.lang.Object obj24 = stackTestDriver7.push(obj23);
        java.lang.Object obj25 = stackTestDriver7.peek();
        java.lang.Object obj26 = stackTestDriver0.push((java.lang.Object) stackTestDriver7);
        java.lang.Class<?> wildcardClass27 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) 100 + "'", obj5, (short) 100);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) 1 + "'", obj9, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (short) 100 + "'", obj12, (short) 100);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (short) 100 + "'", obj13, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (byte) 1 + "'", obj18, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (byte) 1 + "'", obj23, (byte) 1);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (byte) 1 + "'", obj24, (byte) 1);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (byte) 1 + "'", obj25, (byte) 1);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test234");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        boolean boolean4 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) 1);
        boolean boolean8 = stackTestDriver5.isEmpty();
        int int9 = stackTestDriver5.size();
        boolean boolean10 = stackTestDriver5.isEmpty();
        int int11 = stackTestDriver5.size();
        java.lang.Object obj12 = stackTestDriver5.pop();
        java.lang.Object obj13 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        boolean boolean14 = stackTestDriver5.isEmpty();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 1 + "'", obj7, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) 1 + "'", obj12, (byte) 1);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test235");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        int int4 = stackTestDriver0.size();
        boolean boolean5 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        java.lang.Object obj8 = stackTestDriver6.push((java.lang.Object) (byte) 1);
        boolean boolean9 = stackTestDriver6.isEmpty();
        int int10 = stackTestDriver6.size();
        boolean boolean11 = stackTestDriver6.isEmpty();
        int int12 = stackTestDriver6.size();
        java.lang.Object obj13 = stackTestDriver6.pop();
        java.lang.Object obj14 = stackTestDriver0.push((java.lang.Object) stackTestDriver6);
        int int15 = stackTestDriver0.size();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver17 = new experiment.util.StackTestDriver();
        java.lang.Object obj19 = stackTestDriver17.push((java.lang.Object) (byte) 1);
        boolean boolean20 = stackTestDriver17.isEmpty();
        java.lang.Object obj22 = stackTestDriver17.push((java.lang.Object) (short) 100);
        java.lang.Object obj23 = stackTestDriver17.pop();
        java.lang.Class<?> wildcardClass24 = stackTestDriver17.getClass();
        java.lang.Object obj25 = stackTestDriver0.push((java.lang.Object) stackTestDriver17);
        experiment.util.StackTestDriver stackTestDriver26 = new experiment.util.StackTestDriver();
        stackTestDriver26.clear();
        boolean boolean28 = stackTestDriver26.isEmpty();
        int int29 = stackTestDriver26.size();
        int int30 = stackTestDriver26.size();
        boolean boolean31 = stackTestDriver26.isEmpty();
        experiment.util.StackTestDriver stackTestDriver32 = new experiment.util.StackTestDriver();
        java.lang.Object obj34 = stackTestDriver32.push((java.lang.Object) (byte) 1);
        int int35 = stackTestDriver32.size();
        java.lang.Object obj36 = stackTestDriver32.peek();
        java.lang.Object obj37 = stackTestDriver32.pop();
        java.lang.Object obj38 = stackTestDriver26.push((java.lang.Object) stackTestDriver32);
        java.lang.Object obj39 = stackTestDriver0.push((java.lang.Object) stackTestDriver32);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj40 = stackTestDriver32.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) 1 + "'", obj8, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (byte) 1 + "'", obj13, (byte) 1);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (byte) 1 + "'", obj19, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (short) 100 + "'", obj22, (short) 100);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (short) 100 + "'", obj23, (short) 100);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + (byte) 1 + "'", obj34, (byte) 1);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + (byte) 1 + "'", obj36, (byte) 1);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + (byte) 1 + "'", obj37, (byte) 1);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertNotNull(obj39);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test236");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (short) 100);
        int int6 = stackTestDriver0.size();
        java.lang.Object obj7 = stackTestDriver0.peek();
        java.lang.Object obj8 = stackTestDriver0.peek();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) 100 + "'", obj5, (short) 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (short) 100 + "'", obj7, (short) 100);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (short) 100 + "'", obj8, (short) 100);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test237");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        int int4 = stackTestDriver0.size();
        boolean boolean5 = stackTestDriver0.isEmpty();
        boolean boolean6 = stackTestDriver0.isEmpty();
        java.lang.Object obj7 = stackTestDriver0.pop();
        stackTestDriver0.clear();
        java.lang.Object obj10 = stackTestDriver0.push((java.lang.Object) 10.0d);
        java.lang.Object obj11 = stackTestDriver0.pop();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 1 + "'", obj7, (byte) 1);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 10.0d + "'", obj10, 10.0d);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 10.0d + "'", obj11, 10.0d);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test238");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        int int4 = stackTestDriver0.size();
        boolean boolean5 = stackTestDriver0.isEmpty();
        int int6 = stackTestDriver0.size();
        java.lang.Object obj7 = stackTestDriver0.peek();
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        java.lang.Object obj10 = stackTestDriver8.push((java.lang.Object) (byte) 1);
        boolean boolean11 = stackTestDriver8.isEmpty();
        int int12 = stackTestDriver8.size();
        stackTestDriver8.clear();
        stackTestDriver8.clear();
        java.lang.Object obj15 = stackTestDriver0.push((java.lang.Object) stackTestDriver8);
        stackTestDriver8.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = stackTestDriver8.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 1 + "'", obj7, (byte) 1);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) 1 + "'", obj10, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test239");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        int int3 = stackTestDriver0.size();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) 100L);
        int int6 = stackTestDriver0.size();
        java.lang.Object obj7 = stackTestDriver0.peek();
        java.lang.Object obj8 = stackTestDriver0.peek();
        boolean boolean9 = stackTestDriver0.isEmpty();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100L + "'", obj5, 100L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 100L + "'", obj7, 100L);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 100L + "'", obj8, 100L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test240");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        boolean boolean4 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) 1);
        boolean boolean8 = stackTestDriver5.isEmpty();
        int int9 = stackTestDriver5.size();
        boolean boolean10 = stackTestDriver5.isEmpty();
        int int11 = stackTestDriver5.size();
        java.lang.Object obj12 = stackTestDriver5.pop();
        java.lang.Object obj13 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        experiment.util.StackTestDriver stackTestDriver14 = new experiment.util.StackTestDriver();
        java.lang.Object obj16 = stackTestDriver14.push((java.lang.Object) (byte) 1);
        int int17 = stackTestDriver14.size();
        stackTestDriver14.clear();
        experiment.util.StackTestDriver stackTestDriver19 = new experiment.util.StackTestDriver();
        java.lang.Object obj21 = stackTestDriver19.push((java.lang.Object) (byte) 1);
        int int22 = stackTestDriver19.size();
        stackTestDriver19.clear();
        java.lang.Object obj24 = stackTestDriver14.push((java.lang.Object) stackTestDriver19);
        java.lang.Object obj25 = stackTestDriver0.push((java.lang.Object) stackTestDriver14);
        int int26 = stackTestDriver14.size();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 1 + "'", obj7, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) 1 + "'", obj12, (byte) 1);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (byte) 1 + "'", obj16, (byte) 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (byte) 1 + "'", obj21, (byte) 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test241");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        int int4 = stackTestDriver0.size();
        boolean boolean5 = stackTestDriver0.isEmpty();
        int int6 = stackTestDriver0.size();
        java.lang.Object obj7 = stackTestDriver0.peek();
        java.lang.Object obj8 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver9 = new experiment.util.StackTestDriver();
        java.lang.Object obj11 = stackTestDriver9.push((java.lang.Object) (byte) 1);
        boolean boolean12 = stackTestDriver9.isEmpty();
        int int13 = stackTestDriver9.size();
        boolean boolean14 = stackTestDriver9.isEmpty();
        boolean boolean15 = stackTestDriver9.isEmpty();
        java.lang.Object obj16 = stackTestDriver0.push((java.lang.Object) stackTestDriver9);
        java.lang.Class<?> wildcardClass17 = stackTestDriver9.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 1 + "'", obj7, (byte) 1);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) 1 + "'", obj8, (byte) 1);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 1 + "'", obj11, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test242");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        int int3 = stackTestDriver0.size();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) 1);
        int int8 = stackTestDriver5.size();
        stackTestDriver5.clear();
        java.lang.Object obj10 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 1 + "'", obj7, (byte) 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test243");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        boolean boolean4 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) 1);
        boolean boolean8 = stackTestDriver5.isEmpty();
        int int9 = stackTestDriver5.size();
        boolean boolean10 = stackTestDriver5.isEmpty();
        int int11 = stackTestDriver5.size();
        java.lang.Object obj12 = stackTestDriver5.pop();
        java.lang.Object obj13 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        experiment.util.StackTestDriver stackTestDriver14 = new experiment.util.StackTestDriver();
        java.lang.Object obj16 = stackTestDriver14.push((java.lang.Object) (byte) 1);
        int int17 = stackTestDriver14.size();
        stackTestDriver14.clear();
        experiment.util.StackTestDriver stackTestDriver19 = new experiment.util.StackTestDriver();
        java.lang.Object obj21 = stackTestDriver19.push((java.lang.Object) (byte) 1);
        int int22 = stackTestDriver19.size();
        stackTestDriver19.clear();
        java.lang.Object obj24 = stackTestDriver14.push((java.lang.Object) stackTestDriver19);
        java.lang.Object obj25 = stackTestDriver0.push((java.lang.Object) stackTestDriver14);
        java.lang.Object obj26 = stackTestDriver0.pop();
        java.lang.Object obj27 = stackTestDriver0.peek();
        boolean boolean28 = stackTestDriver0.isEmpty();
        java.lang.Object obj30 = stackTestDriver0.push((java.lang.Object) false);
        stackTestDriver0.clear();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 1 + "'", obj7, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) 1 + "'", obj12, (byte) 1);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (byte) 1 + "'", obj16, (byte) 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (byte) 1 + "'", obj21, (byte) 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + false + "'", obj30, false);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test244");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        int int4 = stackTestDriver0.size();
        boolean boolean5 = stackTestDriver0.isEmpty();
        int int6 = stackTestDriver0.size();
        java.lang.Object obj7 = stackTestDriver0.peek();
        boolean boolean8 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver9 = new experiment.util.StackTestDriver();
        java.lang.Object obj11 = stackTestDriver9.push((java.lang.Object) (byte) 1);
        boolean boolean12 = stackTestDriver9.isEmpty();
        java.lang.Object obj14 = stackTestDriver9.push((java.lang.Object) (short) 100);
        int int15 = stackTestDriver9.size();
        boolean boolean16 = stackTestDriver9.isEmpty();
        java.lang.Object obj17 = stackTestDriver0.push((java.lang.Object) stackTestDriver9);
        int int18 = stackTestDriver9.size();
        java.lang.Class<?> wildcardClass19 = stackTestDriver9.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 1 + "'", obj7, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 1 + "'", obj11, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (short) 100 + "'", obj14, (short) 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test245");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        java.lang.Object obj3 = stackTestDriver0.pop();
        int int4 = stackTestDriver0.size();
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 1 + "'", obj3, (byte) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test246");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (short) 100);
        java.lang.Object obj6 = stackTestDriver0.pop();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver9 = new experiment.util.StackTestDriver();
        java.lang.Object obj11 = stackTestDriver9.push((java.lang.Object) (byte) 1);
        int int12 = stackTestDriver9.size();
        java.lang.Object obj13 = stackTestDriver9.peek();
        java.lang.Object obj14 = stackTestDriver9.pop();
        java.lang.Object obj15 = stackTestDriver0.push((java.lang.Object) stackTestDriver9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = stackTestDriver9.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) 100 + "'", obj5, (short) 100);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 100 + "'", obj6, (short) 100);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 1 + "'", obj11, (byte) 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (byte) 1 + "'", obj13, (byte) 1);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (byte) 1 + "'", obj14, (byte) 1);
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test247");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        int int4 = stackTestDriver0.size();
        boolean boolean5 = stackTestDriver0.isEmpty();
        int int6 = stackTestDriver0.size();
        java.lang.Object obj7 = stackTestDriver0.peek();
        boolean boolean8 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver9 = new experiment.util.StackTestDriver();
        java.lang.Object obj11 = stackTestDriver9.push((java.lang.Object) (byte) 1);
        boolean boolean12 = stackTestDriver9.isEmpty();
        java.lang.Object obj14 = stackTestDriver9.push((java.lang.Object) (short) 100);
        int int15 = stackTestDriver9.size();
        boolean boolean16 = stackTestDriver9.isEmpty();
        java.lang.Object obj17 = stackTestDriver0.push((java.lang.Object) stackTestDriver9);
        experiment.util.StackTestDriver stackTestDriver18 = new experiment.util.StackTestDriver();
        java.lang.Object obj20 = stackTestDriver18.push((java.lang.Object) (byte) 1);
        boolean boolean21 = stackTestDriver18.isEmpty();
        boolean boolean22 = stackTestDriver18.isEmpty();
        experiment.util.StackTestDriver stackTestDriver23 = new experiment.util.StackTestDriver();
        java.lang.Object obj25 = stackTestDriver23.push((java.lang.Object) (byte) 1);
        boolean boolean26 = stackTestDriver23.isEmpty();
        int int27 = stackTestDriver23.size();
        boolean boolean28 = stackTestDriver23.isEmpty();
        int int29 = stackTestDriver23.size();
        java.lang.Object obj30 = stackTestDriver23.pop();
        java.lang.Object obj31 = stackTestDriver18.push((java.lang.Object) stackTestDriver23);
        experiment.util.StackTestDriver stackTestDriver32 = new experiment.util.StackTestDriver();
        java.lang.Object obj34 = stackTestDriver32.push((java.lang.Object) (byte) 1);
        int int35 = stackTestDriver32.size();
        stackTestDriver32.clear();
        experiment.util.StackTestDriver stackTestDriver37 = new experiment.util.StackTestDriver();
        java.lang.Object obj39 = stackTestDriver37.push((java.lang.Object) (byte) 1);
        int int40 = stackTestDriver37.size();
        stackTestDriver37.clear();
        java.lang.Object obj42 = stackTestDriver32.push((java.lang.Object) stackTestDriver37);
        java.lang.Object obj43 = stackTestDriver18.push((java.lang.Object) stackTestDriver32);
        java.lang.Object obj44 = stackTestDriver9.push(obj43);
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 1 + "'", obj7, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 1 + "'", obj11, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (short) 100 + "'", obj14, (short) 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (byte) 1 + "'", obj20, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (byte) 1 + "'", obj25, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + (byte) 1 + "'", obj30, (byte) 1);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + (byte) 1 + "'", obj34, (byte) 1);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + (byte) 1 + "'", obj39, (byte) 1);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertNotNull(obj43);
        org.junit.Assert.assertNotNull(obj44);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test248");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (short) 100);
        java.lang.Object obj6 = stackTestDriver0.pop();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver9 = new experiment.util.StackTestDriver();
        java.lang.Object obj11 = stackTestDriver9.push((java.lang.Object) (byte) 1);
        int int12 = stackTestDriver9.size();
        java.lang.Object obj13 = stackTestDriver9.peek();
        java.lang.Object obj14 = stackTestDriver9.pop();
        java.lang.Object obj15 = stackTestDriver0.push((java.lang.Object) stackTestDriver9);
        stackTestDriver0.clear();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) 100 + "'", obj5, (short) 100);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 100 + "'", obj6, (short) 100);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 1 + "'", obj11, (byte) 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (byte) 1 + "'", obj13, (byte) 1);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (byte) 1 + "'", obj14, (byte) 1);
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test249");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        boolean boolean2 = stackTestDriver0.isEmpty();
        boolean boolean3 = stackTestDriver0.isEmpty();
        int int4 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) 1);
        boolean boolean8 = stackTestDriver5.isEmpty();
        int int9 = stackTestDriver5.size();
        boolean boolean10 = stackTestDriver5.isEmpty();
        experiment.util.StackTestDriver stackTestDriver11 = new experiment.util.StackTestDriver();
        java.lang.Object obj13 = stackTestDriver11.push((java.lang.Object) (byte) 1);
        boolean boolean14 = stackTestDriver11.isEmpty();
        int int15 = stackTestDriver11.size();
        boolean boolean16 = stackTestDriver11.isEmpty();
        int int17 = stackTestDriver11.size();
        java.lang.Object obj18 = stackTestDriver11.pop();
        java.lang.Object obj19 = stackTestDriver5.push((java.lang.Object) stackTestDriver11);
        int int20 = stackTestDriver5.size();
        stackTestDriver5.clear();
        experiment.util.StackTestDriver stackTestDriver22 = new experiment.util.StackTestDriver();
        java.lang.Object obj24 = stackTestDriver22.push((java.lang.Object) (byte) 1);
        boolean boolean25 = stackTestDriver22.isEmpty();
        java.lang.Object obj27 = stackTestDriver22.push((java.lang.Object) (short) 100);
        java.lang.Object obj28 = stackTestDriver22.pop();
        java.lang.Class<?> wildcardClass29 = stackTestDriver22.getClass();
        java.lang.Object obj30 = stackTestDriver5.push((java.lang.Object) stackTestDriver22);
        experiment.util.StackTestDriver stackTestDriver31 = new experiment.util.StackTestDriver();
        stackTestDriver31.clear();
        boolean boolean33 = stackTestDriver31.isEmpty();
        int int34 = stackTestDriver31.size();
        int int35 = stackTestDriver31.size();
        boolean boolean36 = stackTestDriver31.isEmpty();
        experiment.util.StackTestDriver stackTestDriver37 = new experiment.util.StackTestDriver();
        java.lang.Object obj39 = stackTestDriver37.push((java.lang.Object) (byte) 1);
        int int40 = stackTestDriver37.size();
        java.lang.Object obj41 = stackTestDriver37.peek();
        java.lang.Object obj42 = stackTestDriver37.pop();
        java.lang.Object obj43 = stackTestDriver31.push((java.lang.Object) stackTestDriver37);
        java.lang.Object obj44 = stackTestDriver5.push((java.lang.Object) stackTestDriver37);
        java.lang.Object obj45 = stackTestDriver5.peek();
        experiment.util.StackTestDriver stackTestDriver46 = new experiment.util.StackTestDriver();
        stackTestDriver46.clear();
        boolean boolean48 = stackTestDriver46.isEmpty();
        int int49 = stackTestDriver46.size();
        int int50 = stackTestDriver46.size();
        stackTestDriver46.clear();
        java.lang.Object obj52 = stackTestDriver5.push((java.lang.Object) stackTestDriver46);
        java.lang.Object obj53 = stackTestDriver0.push(obj52);
        java.lang.Class<?> wildcardClass54 = obj53.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 1 + "'", obj7, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (byte) 1 + "'", obj13, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (byte) 1 + "'", obj18, (byte) 1);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (byte) 1 + "'", obj24, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + (short) 100 + "'", obj27, (short) 100);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + (short) 100 + "'", obj28, (short) 100);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + (byte) 1 + "'", obj39, (byte) 1);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + (byte) 1 + "'", obj41, (byte) 1);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + (byte) 1 + "'", obj42, (byte) 1);
        org.junit.Assert.assertNotNull(obj43);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(obj52);
        org.junit.Assert.assertNotNull(obj53);
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test250");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (short) 100);
        java.lang.Object obj6 = stackTestDriver0.pop();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        boolean boolean9 = stackTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) 100 + "'", obj5, (short) 100);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 100 + "'", obj6, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test251");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        int int3 = stackTestDriver0.size();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) 1);
        int int8 = stackTestDriver5.size();
        stackTestDriver5.clear();
        java.lang.Object obj10 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        java.lang.Class<?> wildcardClass11 = obj10.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 1 + "'", obj7, (byte) 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test252");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        boolean boolean2 = stackTestDriver0.isEmpty();
        int int3 = stackTestDriver0.size();
        int int4 = stackTestDriver0.size();
        boolean boolean5 = stackTestDriver0.isEmpty();
        boolean boolean6 = stackTestDriver0.isEmpty();
        java.lang.Class<?> wildcardClass7 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test253");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        int int4 = stackTestDriver0.size();
        boolean boolean5 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        java.lang.Object obj8 = stackTestDriver6.push((java.lang.Object) (byte) 1);
        boolean boolean9 = stackTestDriver6.isEmpty();
        int int10 = stackTestDriver6.size();
        boolean boolean11 = stackTestDriver6.isEmpty();
        int int12 = stackTestDriver6.size();
        java.lang.Object obj13 = stackTestDriver6.pop();
        java.lang.Object obj14 = stackTestDriver0.push((java.lang.Object) stackTestDriver6);
        int int15 = stackTestDriver0.size();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver17 = new experiment.util.StackTestDriver();
        java.lang.Object obj19 = stackTestDriver17.push((java.lang.Object) (byte) 1);
        boolean boolean20 = stackTestDriver17.isEmpty();
        java.lang.Object obj22 = stackTestDriver17.push((java.lang.Object) (short) 100);
        java.lang.Object obj23 = stackTestDriver17.pop();
        java.lang.Class<?> wildcardClass24 = stackTestDriver17.getClass();
        java.lang.Object obj25 = stackTestDriver0.push((java.lang.Object) stackTestDriver17);
        experiment.util.StackTestDriver stackTestDriver26 = new experiment.util.StackTestDriver();
        stackTestDriver26.clear();
        boolean boolean28 = stackTestDriver26.isEmpty();
        int int29 = stackTestDriver26.size();
        int int30 = stackTestDriver26.size();
        boolean boolean31 = stackTestDriver26.isEmpty();
        experiment.util.StackTestDriver stackTestDriver32 = new experiment.util.StackTestDriver();
        java.lang.Object obj34 = stackTestDriver32.push((java.lang.Object) (byte) 1);
        int int35 = stackTestDriver32.size();
        java.lang.Object obj36 = stackTestDriver32.peek();
        java.lang.Object obj37 = stackTestDriver32.pop();
        java.lang.Object obj38 = stackTestDriver26.push((java.lang.Object) stackTestDriver32);
        java.lang.Object obj39 = stackTestDriver0.push((java.lang.Object) stackTestDriver32);
        boolean boolean40 = stackTestDriver0.isEmpty();
        java.lang.Object obj41 = stackTestDriver0.pop();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) 1 + "'", obj8, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (byte) 1 + "'", obj13, (byte) 1);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (byte) 1 + "'", obj19, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (short) 100 + "'", obj22, (short) 100);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (short) 100 + "'", obj23, (short) 100);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + (byte) 1 + "'", obj34, (byte) 1);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + (byte) 1 + "'", obj36, (byte) 1);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + (byte) 1 + "'", obj37, (byte) 1);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(obj41);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test254");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (short) 100);
        java.lang.Object obj6 = stackTestDriver0.pop();
        stackTestDriver0.clear();
        boolean boolean8 = stackTestDriver0.isEmpty();
        boolean boolean9 = stackTestDriver0.isEmpty();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) 100 + "'", obj5, (short) 100);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 100 + "'", obj6, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test255");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        boolean boolean4 = stackTestDriver0.isEmpty();
        boolean boolean5 = stackTestDriver0.isEmpty();
        int int6 = stackTestDriver0.size();
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1082618794_1024_0.test256");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        int int3 = stackTestDriver0.size();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) 100L);
        java.lang.Object obj6 = stackTestDriver0.peek();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) 1 + "'", obj2, (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100L + "'", obj5, 100L);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 100L + "'", obj6, 100L);
    }

}
