package experiment.util.test;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Regression_StackTest_101322511_256_s {

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
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test001");
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
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test002");
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
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test003");
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
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test004");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        boolean boolean4 = stackTestDriver0.isEmpty();
        java.lang.Class<?> wildcardClass5 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test005");
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
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test006");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        java.lang.Class<?> wildcardClass3 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test007");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        java.lang.Class<?> wildcardClass2 = stackTestDriver0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test008");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
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
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test009");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver3 = new experiment.util.StackTestDriver();
        boolean boolean4 = stackTestDriver3.isEmpty();
        int int5 = stackTestDriver3.size();
        java.lang.Object obj7 = stackTestDriver3.push((java.lang.Object) 1);
        stackTestDriver3.clear();
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) stackTestDriver3);
        java.lang.Class<?> wildcardClass10 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1 + "'", obj7, 1);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test010");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        boolean boolean4 = stackTestDriver0.isEmpty();
        int int5 = stackTestDriver0.size();
        int int6 = stackTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test011");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) 1);
        boolean boolean5 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 1 + "'", obj4, 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test012");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        java.lang.Class<?> wildcardClass4 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test013");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test014");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test015");
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
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test016");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) 1);
        boolean boolean5 = stackTestDriver0.isEmpty();
        java.lang.Object obj6 = stackTestDriver0.peek();
        java.lang.Class<?> wildcardClass7 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 1 + "'", obj4, 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1 + "'", obj6, 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test017");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) 1);
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        boolean boolean7 = stackTestDriver6.isEmpty();
        int int8 = stackTestDriver6.size();
        int int9 = stackTestDriver6.size();
        boolean boolean10 = stackTestDriver6.isEmpty();
        java.lang.Object obj11 = stackTestDriver0.push((java.lang.Object) boolean10);
        boolean boolean12 = stackTestDriver0.isEmpty();
        boolean boolean13 = stackTestDriver0.isEmpty();
        java.lang.Class<?> wildcardClass14 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 1 + "'", obj4, 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + true + "'", obj11, true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test018");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) 10.0f);
        java.lang.Class<?> wildcardClass5 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 10.0f + "'", obj4, 10.0f);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test019");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) 1);
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        boolean boolean7 = stackTestDriver6.isEmpty();
        int int8 = stackTestDriver6.size();
        int int9 = stackTestDriver6.size();
        boolean boolean10 = stackTestDriver6.isEmpty();
        java.lang.Object obj11 = stackTestDriver0.push((java.lang.Object) boolean10);
        boolean boolean12 = stackTestDriver0.isEmpty();
        java.lang.Class<?> wildcardClass13 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 1 + "'", obj4, 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + true + "'", obj11, true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test020");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        boolean boolean4 = stackTestDriver0.isEmpty();
        int int5 = stackTestDriver0.size();
        int int6 = stackTestDriver0.size();
        boolean boolean7 = stackTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test021");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test022");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver3 = new experiment.util.StackTestDriver();
        boolean boolean4 = stackTestDriver3.isEmpty();
        int int5 = stackTestDriver3.size();
        java.lang.Object obj7 = stackTestDriver3.push((java.lang.Object) 1);
        stackTestDriver3.clear();
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) stackTestDriver3);
        int int10 = stackTestDriver3.size();
        int int11 = stackTestDriver3.size();
        int int12 = stackTestDriver3.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = stackTestDriver3.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1 + "'", obj7, 1);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test023");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) 1);
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
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 1 + "'", obj4, 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test024");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) 10.0f);
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        boolean boolean6 = stackTestDriver5.isEmpty();
        int int7 = stackTestDriver5.size();
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        boolean boolean9 = stackTestDriver8.isEmpty();
        int int10 = stackTestDriver8.size();
        java.lang.Object obj12 = stackTestDriver8.push((java.lang.Object) 1);
        stackTestDriver8.clear();
        java.lang.Object obj14 = stackTestDriver5.push((java.lang.Object) stackTestDriver8);
        int int15 = stackTestDriver8.size();
        stackTestDriver8.clear();
        java.lang.Object obj17 = stackTestDriver0.push((java.lang.Object) stackTestDriver8);
        java.lang.Class<?> wildcardClass18 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 10.0f + "'", obj4, 10.0f);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 1 + "'", obj12, 1);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test025");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        java.lang.Class<?> wildcardClass2 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test026");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        boolean boolean4 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        boolean boolean6 = stackTestDriver5.isEmpty();
        int int7 = stackTestDriver5.size();
        java.lang.Object obj9 = stackTestDriver5.push((java.lang.Object) 1);
        boolean boolean10 = stackTestDriver5.isEmpty();
        java.lang.Object obj11 = stackTestDriver5.peek();
        java.lang.Object obj12 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        java.lang.Object obj13 = stackTestDriver0.pop();
        java.lang.Class<?> wildcardClass14 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 1 + "'", obj9, 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 1 + "'", obj11, 1);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test027");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test028");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
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
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test029");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) 1);
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        boolean boolean7 = stackTestDriver6.isEmpty();
        int int8 = stackTestDriver6.size();
        int int9 = stackTestDriver6.size();
        boolean boolean10 = stackTestDriver6.isEmpty();
        java.lang.Object obj11 = stackTestDriver0.push((java.lang.Object) boolean10);
        java.lang.Class<?> wildcardClass12 = obj11.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 1 + "'", obj4, 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + true + "'", obj11, true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test030");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver3 = new experiment.util.StackTestDriver();
        boolean boolean4 = stackTestDriver3.isEmpty();
        int int5 = stackTestDriver3.size();
        java.lang.Object obj7 = stackTestDriver3.push((java.lang.Object) 1);
        stackTestDriver3.clear();
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) stackTestDriver3);
        int int10 = stackTestDriver3.size();
        stackTestDriver3.clear();
        java.lang.Class<?> wildcardClass12 = stackTestDriver3.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1 + "'", obj7, 1);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test031");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) 1);
        boolean boolean5 = stackTestDriver0.isEmpty();
        java.lang.Object obj6 = stackTestDriver0.peek();
        java.lang.Object obj7 = stackTestDriver0.peek();
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 1 + "'", obj4, 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1 + "'", obj6, 1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1 + "'", obj7, 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test032");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) 1);
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        boolean boolean7 = stackTestDriver6.isEmpty();
        int int8 = stackTestDriver6.size();
        int int9 = stackTestDriver6.size();
        boolean boolean10 = stackTestDriver6.isEmpty();
        java.lang.Object obj11 = stackTestDriver0.push((java.lang.Object) boolean10);
        boolean boolean12 = stackTestDriver0.isEmpty();
        boolean boolean13 = stackTestDriver0.isEmpty();
        int int14 = stackTestDriver0.size();
        boolean boolean15 = stackTestDriver0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 1 + "'", obj4, 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + true + "'", obj11, true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test033");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        int int4 = stackTestDriver0.size();
        boolean boolean5 = stackTestDriver0.isEmpty();
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test034");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) 1);
        boolean boolean5 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 1 + "'", obj4, 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test035");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) 10.0f);
        boolean boolean5 = stackTestDriver0.isEmpty();
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) (-1.0d));
        boolean boolean8 = stackTestDriver0.isEmpty();
        java.lang.Class<?> wildcardClass9 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 10.0f + "'", obj4, 10.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test036");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) 10.0f);
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        boolean boolean6 = stackTestDriver5.isEmpty();
        int int7 = stackTestDriver5.size();
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        boolean boolean9 = stackTestDriver8.isEmpty();
        int int10 = stackTestDriver8.size();
        java.lang.Object obj12 = stackTestDriver8.push((java.lang.Object) 1);
        stackTestDriver8.clear();
        java.lang.Object obj14 = stackTestDriver5.push((java.lang.Object) stackTestDriver8);
        int int15 = stackTestDriver8.size();
        stackTestDriver8.clear();
        java.lang.Object obj17 = stackTestDriver0.push((java.lang.Object) stackTestDriver8);
        java.lang.Object obj19 = stackTestDriver0.push((java.lang.Object) (short) 100);
        java.lang.Class<?> wildcardClass20 = obj19.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 10.0f + "'", obj4, 10.0f);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 1 + "'", obj12, 1);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (short) 100 + "'", obj19, (short) 100);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test037");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) 1);
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        boolean boolean7 = stackTestDriver6.isEmpty();
        int int8 = stackTestDriver6.size();
        int int9 = stackTestDriver6.size();
        boolean boolean10 = stackTestDriver6.isEmpty();
        java.lang.Object obj11 = stackTestDriver0.push((java.lang.Object) boolean10);
        boolean boolean12 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver13 = new experiment.util.StackTestDriver();
        boolean boolean14 = stackTestDriver13.isEmpty();
        int int15 = stackTestDriver13.size();
        java.lang.Object obj17 = stackTestDriver13.push((java.lang.Object) 1);
        stackTestDriver13.clear();
        experiment.util.StackTestDriver stackTestDriver19 = new experiment.util.StackTestDriver();
        boolean boolean20 = stackTestDriver19.isEmpty();
        int int21 = stackTestDriver19.size();
        int int22 = stackTestDriver19.size();
        boolean boolean23 = stackTestDriver19.isEmpty();
        java.lang.Object obj24 = stackTestDriver13.push((java.lang.Object) boolean23);
        stackTestDriver13.clear();
        java.lang.Object obj26 = stackTestDriver0.push((java.lang.Object) stackTestDriver13);
        java.lang.Class<?> wildcardClass27 = obj26.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 1 + "'", obj4, 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + true + "'", obj11, true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 1 + "'", obj17, 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + true + "'", obj24, true);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test038");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver3 = new experiment.util.StackTestDriver();
        boolean boolean4 = stackTestDriver3.isEmpty();
        int int5 = stackTestDriver3.size();
        java.lang.Object obj7 = stackTestDriver3.push((java.lang.Object) 1);
        stackTestDriver3.clear();
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) stackTestDriver3);
        int int10 = stackTestDriver3.size();
        stackTestDriver3.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = stackTestDriver3.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1 + "'", obj7, 1);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test039");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        boolean boolean2 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver3 = new experiment.util.StackTestDriver();
        boolean boolean4 = stackTestDriver3.isEmpty();
        int int5 = stackTestDriver3.size();
        java.lang.Object obj7 = stackTestDriver3.push((java.lang.Object) 1);
        stackTestDriver3.clear();
        experiment.util.StackTestDriver stackTestDriver9 = new experiment.util.StackTestDriver();
        boolean boolean10 = stackTestDriver9.isEmpty();
        int int11 = stackTestDriver9.size();
        int int12 = stackTestDriver9.size();
        boolean boolean13 = stackTestDriver9.isEmpty();
        java.lang.Object obj14 = stackTestDriver3.push((java.lang.Object) boolean13);
        boolean boolean15 = stackTestDriver3.isEmpty();
        java.lang.Object obj16 = stackTestDriver0.push((java.lang.Object) stackTestDriver3);
        java.lang.Class<?> wildcardClass17 = stackTestDriver3.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1 + "'", obj7, 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + true + "'", obj14, true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test040");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver3 = new experiment.util.StackTestDriver();
        boolean boolean4 = stackTestDriver3.isEmpty();
        int int5 = stackTestDriver3.size();
        java.lang.Object obj7 = stackTestDriver3.push((java.lang.Object) 1);
        stackTestDriver3.clear();
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) stackTestDriver3);
        int int10 = stackTestDriver3.size();
        stackTestDriver3.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = stackTestDriver3.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1 + "'", obj7, 1);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test041");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        boolean boolean2 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver3 = new experiment.util.StackTestDriver();
        boolean boolean4 = stackTestDriver3.isEmpty();
        int int5 = stackTestDriver3.size();
        java.lang.Object obj7 = stackTestDriver3.push((java.lang.Object) 1);
        stackTestDriver3.clear();
        experiment.util.StackTestDriver stackTestDriver9 = new experiment.util.StackTestDriver();
        boolean boolean10 = stackTestDriver9.isEmpty();
        int int11 = stackTestDriver9.size();
        int int12 = stackTestDriver9.size();
        boolean boolean13 = stackTestDriver9.isEmpty();
        java.lang.Object obj14 = stackTestDriver3.push((java.lang.Object) boolean13);
        boolean boolean15 = stackTestDriver3.isEmpty();
        java.lang.Object obj16 = stackTestDriver0.push((java.lang.Object) stackTestDriver3);
        stackTestDriver3.clear();
        java.lang.Class<?> wildcardClass18 = stackTestDriver3.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1 + "'", obj7, 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + true + "'", obj14, true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test042");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean4 = stackTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test043");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        boolean boolean4 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        boolean boolean6 = stackTestDriver5.isEmpty();
        int int7 = stackTestDriver5.size();
        java.lang.Object obj9 = stackTestDriver5.push((java.lang.Object) 1);
        boolean boolean10 = stackTestDriver5.isEmpty();
        java.lang.Object obj11 = stackTestDriver5.peek();
        java.lang.Object obj12 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        java.lang.Object obj13 = stackTestDriver0.pop();
        java.lang.Object obj15 = stackTestDriver0.push((java.lang.Object) 10.0d);
        java.lang.Class<?> wildcardClass16 = obj15.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 1 + "'", obj9, 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 1 + "'", obj11, 1);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 10.0d + "'", obj15, 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test044");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver3 = new experiment.util.StackTestDriver();
        boolean boolean4 = stackTestDriver3.isEmpty();
        int int5 = stackTestDriver3.size();
        java.lang.Object obj7 = stackTestDriver3.push((java.lang.Object) 1);
        stackTestDriver3.clear();
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) stackTestDriver3);
        int int10 = stackTestDriver3.size();
        int int11 = stackTestDriver3.size();
        int int12 = stackTestDriver3.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = stackTestDriver3.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1 + "'", obj7, 1);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test045");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        boolean boolean4 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        boolean boolean6 = stackTestDriver5.isEmpty();
        int int7 = stackTestDriver5.size();
        java.lang.Object obj9 = stackTestDriver5.push((java.lang.Object) 1);
        boolean boolean10 = stackTestDriver5.isEmpty();
        java.lang.Object obj11 = stackTestDriver5.peek();
        java.lang.Object obj12 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        int int13 = stackTestDriver5.size();
        int int14 = stackTestDriver5.size();
        boolean boolean15 = stackTestDriver5.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 1 + "'", obj9, 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 1 + "'", obj11, 1);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test046");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        java.lang.Object obj3 = stackTestDriver0.push((java.lang.Object) 'a');
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        boolean boolean5 = stackTestDriver4.isEmpty();
        int int6 = stackTestDriver4.size();
        java.lang.Object obj8 = stackTestDriver4.push((java.lang.Object) 1);
        stackTestDriver4.clear();
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        boolean boolean11 = stackTestDriver10.isEmpty();
        int int12 = stackTestDriver10.size();
        int int13 = stackTestDriver10.size();
        boolean boolean14 = stackTestDriver10.isEmpty();
        java.lang.Object obj15 = stackTestDriver4.push((java.lang.Object) boolean14);
        java.lang.Class<?> wildcardClass16 = stackTestDriver4.getClass();
        java.lang.Object obj17 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        java.lang.Object obj18 = stackTestDriver4.pop();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 'a' + "'", obj3, 'a');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 1 + "'", obj8, 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + true + "'", obj15, true);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + true + "'", obj18, true);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test047");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        boolean boolean4 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        boolean boolean6 = stackTestDriver5.isEmpty();
        int int7 = stackTestDriver5.size();
        java.lang.Object obj9 = stackTestDriver5.push((java.lang.Object) 1);
        boolean boolean10 = stackTestDriver5.isEmpty();
        java.lang.Object obj11 = stackTestDriver5.peek();
        java.lang.Object obj12 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        java.lang.Object obj13 = stackTestDriver0.pop();
        java.lang.Object obj15 = stackTestDriver0.push((java.lang.Object) 10.0d);
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 1 + "'", obj9, 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 1 + "'", obj11, 1);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 10.0d + "'", obj15, 10.0d);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test048");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) 10.0f);
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        boolean boolean6 = stackTestDriver5.isEmpty();
        int int7 = stackTestDriver5.size();
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        boolean boolean9 = stackTestDriver8.isEmpty();
        int int10 = stackTestDriver8.size();
        java.lang.Object obj12 = stackTestDriver8.push((java.lang.Object) 1);
        stackTestDriver8.clear();
        java.lang.Object obj14 = stackTestDriver5.push((java.lang.Object) stackTestDriver8);
        int int15 = stackTestDriver8.size();
        stackTestDriver8.clear();
        java.lang.Object obj17 = stackTestDriver0.push((java.lang.Object) stackTestDriver8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = stackTestDriver8.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 10.0f + "'", obj4, 10.0f);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 1 + "'", obj12, 1);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(obj17);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test049");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) 1);
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 1 + "'", obj4, 1);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test050");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        int int4 = stackTestDriver0.size();
        boolean boolean5 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test051");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) 1);
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        boolean boolean7 = stackTestDriver6.isEmpty();
        int int8 = stackTestDriver6.size();
        int int9 = stackTestDriver6.size();
        boolean boolean10 = stackTestDriver6.isEmpty();
        java.lang.Object obj11 = stackTestDriver0.push((java.lang.Object) boolean10);
        boolean boolean12 = stackTestDriver0.isEmpty();
        int int13 = stackTestDriver0.size();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 1 + "'", obj4, 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + true + "'", obj11, true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test052");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        java.lang.Object obj3 = stackTestDriver0.push((java.lang.Object) 'a');
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        boolean boolean5 = stackTestDriver4.isEmpty();
        int int6 = stackTestDriver4.size();
        java.lang.Object obj8 = stackTestDriver4.push((java.lang.Object) 1);
        stackTestDriver4.clear();
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        boolean boolean11 = stackTestDriver10.isEmpty();
        int int12 = stackTestDriver10.size();
        int int13 = stackTestDriver10.size();
        boolean boolean14 = stackTestDriver10.isEmpty();
        java.lang.Object obj15 = stackTestDriver4.push((java.lang.Object) boolean14);
        java.lang.Class<?> wildcardClass16 = stackTestDriver4.getClass();
        java.lang.Object obj17 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        java.lang.Class<?> wildcardClass18 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 'a' + "'", obj3, 'a');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 1 + "'", obj8, 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + true + "'", obj15, true);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test053");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) 1);
        boolean boolean5 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        java.lang.Class<?> wildcardClass7 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 1 + "'", obj4, 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test054");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) 1);
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        boolean boolean7 = stackTestDriver6.isEmpty();
        int int8 = stackTestDriver6.size();
        int int9 = stackTestDriver6.size();
        boolean boolean10 = stackTestDriver6.isEmpty();
        java.lang.Object obj11 = stackTestDriver0.push((java.lang.Object) boolean10);
        boolean boolean12 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver13 = new experiment.util.StackTestDriver();
        boolean boolean14 = stackTestDriver13.isEmpty();
        int int15 = stackTestDriver13.size();
        java.lang.Object obj17 = stackTestDriver13.push((java.lang.Object) 1);
        stackTestDriver13.clear();
        experiment.util.StackTestDriver stackTestDriver19 = new experiment.util.StackTestDriver();
        boolean boolean20 = stackTestDriver19.isEmpty();
        int int21 = stackTestDriver19.size();
        int int22 = stackTestDriver19.size();
        boolean boolean23 = stackTestDriver19.isEmpty();
        java.lang.Object obj24 = stackTestDriver13.push((java.lang.Object) boolean23);
        stackTestDriver13.clear();
        java.lang.Object obj26 = stackTestDriver0.push((java.lang.Object) stackTestDriver13);
        int int27 = stackTestDriver13.size();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 1 + "'", obj4, 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + true + "'", obj11, true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 1 + "'", obj17, 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + true + "'", obj24, true);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test055");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) 1);
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        boolean boolean7 = stackTestDriver6.isEmpty();
        int int8 = stackTestDriver6.size();
        int int9 = stackTestDriver6.size();
        boolean boolean10 = stackTestDriver6.isEmpty();
        java.lang.Object obj11 = stackTestDriver0.push((java.lang.Object) boolean10);
        boolean boolean12 = stackTestDriver0.isEmpty();
        boolean boolean13 = stackTestDriver0.isEmpty();
        java.lang.Object obj15 = stackTestDriver0.push((java.lang.Object) 10);
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 1 + "'", obj4, 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + true + "'", obj11, true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 10 + "'", obj15, 10);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test056");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver3 = new experiment.util.StackTestDriver();
        boolean boolean4 = stackTestDriver3.isEmpty();
        int int5 = stackTestDriver3.size();
        java.lang.Object obj7 = stackTestDriver3.push((java.lang.Object) 1);
        stackTestDriver3.clear();
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) stackTestDriver3);
        int int10 = stackTestDriver3.size();
        int int11 = stackTestDriver3.size();
        int int12 = stackTestDriver3.size();
        java.lang.Class<?> wildcardClass13 = stackTestDriver3.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1 + "'", obj7, 1);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test057");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        int int4 = stackTestDriver0.size();
        boolean boolean5 = stackTestDriver0.isEmpty();
        java.lang.Class<?> wildcardClass6 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test058");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) 1);
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 1 + "'", obj4, 1);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test059");
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
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test060");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) 1);
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        boolean boolean7 = stackTestDriver6.isEmpty();
        int int8 = stackTestDriver6.size();
        int int9 = stackTestDriver6.size();
        boolean boolean10 = stackTestDriver6.isEmpty();
        java.lang.Object obj11 = stackTestDriver0.push((java.lang.Object) boolean10);
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        java.lang.Object obj15 = stackTestDriver0.push((java.lang.Object) (-1L));
        java.lang.Object obj16 = stackTestDriver0.peek();
        java.lang.Object obj17 = stackTestDriver0.pop();
        int int18 = stackTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 1 + "'", obj4, 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + true + "'", obj11, true);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (-1L) + "'", obj15, (-1L));
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (-1L) + "'", obj16, (-1L));
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (-1L) + "'", obj17, (-1L));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test061");
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
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test062");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        boolean boolean4 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        boolean boolean6 = stackTestDriver5.isEmpty();
        int int7 = stackTestDriver5.size();
        java.lang.Object obj9 = stackTestDriver5.push((java.lang.Object) 1);
        boolean boolean10 = stackTestDriver5.isEmpty();
        java.lang.Object obj11 = stackTestDriver5.peek();
        java.lang.Object obj12 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        java.lang.Object obj13 = stackTestDriver0.pop();
        java.lang.Object obj15 = stackTestDriver0.push((java.lang.Object) 10.0d);
        int int16 = stackTestDriver0.size();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 1 + "'", obj9, 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 1 + "'", obj11, 1);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 10.0d + "'", obj15, 10.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test063");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) 1);
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        boolean boolean7 = stackTestDriver6.isEmpty();
        int int8 = stackTestDriver6.size();
        int int9 = stackTestDriver6.size();
        boolean boolean10 = stackTestDriver6.isEmpty();
        java.lang.Object obj11 = stackTestDriver0.push((java.lang.Object) boolean10);
        boolean boolean12 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver13 = new experiment.util.StackTestDriver();
        boolean boolean14 = stackTestDriver13.isEmpty();
        int int15 = stackTestDriver13.size();
        java.lang.Object obj17 = stackTestDriver13.push((java.lang.Object) 1);
        stackTestDriver13.clear();
        experiment.util.StackTestDriver stackTestDriver19 = new experiment.util.StackTestDriver();
        boolean boolean20 = stackTestDriver19.isEmpty();
        int int21 = stackTestDriver19.size();
        int int22 = stackTestDriver19.size();
        boolean boolean23 = stackTestDriver19.isEmpty();
        java.lang.Object obj24 = stackTestDriver13.push((java.lang.Object) boolean23);
        stackTestDriver13.clear();
        java.lang.Object obj26 = stackTestDriver0.push((java.lang.Object) stackTestDriver13);
        boolean boolean27 = stackTestDriver13.isEmpty();
        int int28 = stackTestDriver13.size();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 1 + "'", obj4, 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + true + "'", obj11, true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 1 + "'", obj17, 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + true + "'", obj24, true);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test064");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        boolean boolean4 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        boolean boolean6 = stackTestDriver5.isEmpty();
        int int7 = stackTestDriver5.size();
        java.lang.Object obj9 = stackTestDriver5.push((java.lang.Object) 1);
        boolean boolean10 = stackTestDriver5.isEmpty();
        java.lang.Object obj11 = stackTestDriver5.peek();
        java.lang.Object obj12 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        java.lang.Object obj13 = stackTestDriver0.pop();
        java.lang.Object obj15 = stackTestDriver0.push((java.lang.Object) 10.0d);
        stackTestDriver0.clear();
        int int17 = stackTestDriver0.size();
        boolean boolean18 = stackTestDriver0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 1 + "'", obj9, 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 1 + "'", obj11, 1);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 10.0d + "'", obj15, 10.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test065");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        boolean boolean4 = stackTestDriver0.isEmpty();
        int int5 = stackTestDriver0.size();
        int int6 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver7 = new experiment.util.StackTestDriver();
        boolean boolean8 = stackTestDriver7.isEmpty();
        boolean boolean9 = stackTestDriver7.isEmpty();
        java.lang.Object obj11 = stackTestDriver7.push((java.lang.Object) 10.0f);
        boolean boolean12 = stackTestDriver7.isEmpty();
        java.lang.Object obj14 = stackTestDriver7.push((java.lang.Object) (-1.0d));
        boolean boolean15 = stackTestDriver7.isEmpty();
        java.lang.Object obj16 = stackTestDriver0.push((java.lang.Object) stackTestDriver7);
        java.lang.Class<?> wildcardClass17 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 10.0f + "'", obj11, 10.0f);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1.0d) + "'", obj14, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test066");
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
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test067");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) 10.0f);
        boolean boolean5 = stackTestDriver0.isEmpty();
        java.lang.Class<?> wildcardClass6 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 10.0f + "'", obj4, 10.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test068");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        boolean boolean4 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        boolean boolean6 = stackTestDriver5.isEmpty();
        int int7 = stackTestDriver5.size();
        java.lang.Object obj9 = stackTestDriver5.push((java.lang.Object) 1);
        boolean boolean10 = stackTestDriver5.isEmpty();
        java.lang.Object obj11 = stackTestDriver5.peek();
        java.lang.Object obj12 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        java.lang.Object obj13 = stackTestDriver0.pop();
        java.lang.Object obj15 = stackTestDriver0.push((java.lang.Object) 10.0d);
        java.lang.Object obj16 = stackTestDriver0.peek();
        java.lang.Class<?> wildcardClass17 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 1 + "'", obj9, 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 1 + "'", obj11, 1);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 10.0d + "'", obj15, 10.0d);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 10.0d + "'", obj16, 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test069");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) 10.0f);
        boolean boolean5 = stackTestDriver0.isEmpty();
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) (-1.0d));
        int int8 = stackTestDriver0.size();
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 10.0f + "'", obj4, 10.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test070");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver3 = new experiment.util.StackTestDriver();
        boolean boolean4 = stackTestDriver3.isEmpty();
        int int5 = stackTestDriver3.size();
        java.lang.Object obj7 = stackTestDriver3.push((java.lang.Object) 1);
        stackTestDriver3.clear();
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) stackTestDriver3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = stackTestDriver3.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1 + "'", obj7, 1);
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test071");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        boolean boolean4 = stackTestDriver0.isEmpty();
        int int5 = stackTestDriver0.size();
        int int6 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver7 = new experiment.util.StackTestDriver();
        boolean boolean8 = stackTestDriver7.isEmpty();
        int int9 = stackTestDriver7.size();
        java.lang.Object obj11 = stackTestDriver7.push((java.lang.Object) 1);
        stackTestDriver7.clear();
        experiment.util.StackTestDriver stackTestDriver13 = new experiment.util.StackTestDriver();
        boolean boolean14 = stackTestDriver13.isEmpty();
        int int15 = stackTestDriver13.size();
        int int16 = stackTestDriver13.size();
        boolean boolean17 = stackTestDriver13.isEmpty();
        java.lang.Object obj18 = stackTestDriver7.push((java.lang.Object) boolean17);
        boolean boolean19 = stackTestDriver7.isEmpty();
        java.lang.Object obj20 = stackTestDriver7.peek();
        java.lang.Object obj21 = stackTestDriver0.push(obj20);
        boolean boolean22 = stackTestDriver0.isEmpty();
        int int23 = stackTestDriver0.size();
        int int24 = stackTestDriver0.size();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 1 + "'", obj11, 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + true + "'", obj18, true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + true + "'", obj20, true);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + true + "'", obj21, true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test072");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) 1);
        boolean boolean5 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        boolean boolean7 = stackTestDriver6.isEmpty();
        int int8 = stackTestDriver6.size();
        java.lang.Object obj10 = stackTestDriver6.push((java.lang.Object) 1);
        boolean boolean11 = stackTestDriver6.isEmpty();
        java.lang.Object obj12 = stackTestDriver0.push((java.lang.Object) boolean11);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 1 + "'", obj4, 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 1 + "'", obj10, 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + false + "'", obj12, false);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test073");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        boolean boolean4 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        boolean boolean6 = stackTestDriver5.isEmpty();
        int int7 = stackTestDriver5.size();
        java.lang.Object obj9 = stackTestDriver5.push((java.lang.Object) 1);
        boolean boolean10 = stackTestDriver5.isEmpty();
        java.lang.Object obj11 = stackTestDriver5.peek();
        java.lang.Object obj12 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        java.lang.Object obj13 = stackTestDriver5.peek();
        stackTestDriver5.clear();
        java.lang.Object obj16 = stackTestDriver5.push((java.lang.Object) ' ');
        java.lang.Object obj17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = stackTestDriver5.push(obj17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 1 + "'", obj9, 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 1 + "'", obj11, 1);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 1 + "'", obj13, 1);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + ' ' + "'", obj16, ' ');
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test074");
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
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test075");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver3 = new experiment.util.StackTestDriver();
        boolean boolean4 = stackTestDriver3.isEmpty();
        int int5 = stackTestDriver3.size();
        java.lang.Object obj7 = stackTestDriver3.push((java.lang.Object) 1);
        stackTestDriver3.clear();
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) stackTestDriver3);
        int int10 = stackTestDriver3.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = stackTestDriver3.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1 + "'", obj7, 1);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test076");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        boolean boolean4 = stackTestDriver0.isEmpty();
        int int5 = stackTestDriver0.size();
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test077");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        boolean boolean4 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        boolean boolean6 = stackTestDriver5.isEmpty();
        int int7 = stackTestDriver5.size();
        java.lang.Object obj9 = stackTestDriver5.push((java.lang.Object) 1);
        boolean boolean10 = stackTestDriver5.isEmpty();
        java.lang.Object obj11 = stackTestDriver5.peek();
        java.lang.Object obj12 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        java.lang.Object obj13 = stackTestDriver0.pop();
        java.lang.Object obj15 = stackTestDriver0.push((java.lang.Object) 10.0d);
        stackTestDriver0.clear();
        java.lang.Class<?> wildcardClass17 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 1 + "'", obj9, 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 1 + "'", obj11, 1);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 10.0d + "'", obj15, 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test078");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean4 = stackTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test079");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
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
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test080");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        boolean boolean4 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        boolean boolean6 = stackTestDriver5.isEmpty();
        int int7 = stackTestDriver5.size();
        java.lang.Object obj9 = stackTestDriver5.push((java.lang.Object) 1);
        boolean boolean10 = stackTestDriver5.isEmpty();
        java.lang.Object obj11 = stackTestDriver5.peek();
        java.lang.Object obj12 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        stackTestDriver5.clear();
        java.lang.Class<?> wildcardClass14 = stackTestDriver5.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 1 + "'", obj9, 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 1 + "'", obj11, 1);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test081");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) 1);
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        boolean boolean7 = stackTestDriver6.isEmpty();
        int int8 = stackTestDriver6.size();
        int int9 = stackTestDriver6.size();
        boolean boolean10 = stackTestDriver6.isEmpty();
        java.lang.Object obj11 = stackTestDriver0.push((java.lang.Object) boolean10);
        boolean boolean12 = stackTestDriver0.isEmpty();
        boolean boolean13 = stackTestDriver0.isEmpty();
        int int14 = stackTestDriver0.size();
        int int15 = stackTestDriver0.size();
        java.lang.Class<?> wildcardClass16 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 1 + "'", obj4, 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + true + "'", obj11, true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test082");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        boolean boolean2 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver3 = new experiment.util.StackTestDriver();
        boolean boolean4 = stackTestDriver3.isEmpty();
        int int5 = stackTestDriver3.size();
        java.lang.Object obj7 = stackTestDriver3.push((java.lang.Object) 1);
        stackTestDriver3.clear();
        experiment.util.StackTestDriver stackTestDriver9 = new experiment.util.StackTestDriver();
        boolean boolean10 = stackTestDriver9.isEmpty();
        int int11 = stackTestDriver9.size();
        int int12 = stackTestDriver9.size();
        boolean boolean13 = stackTestDriver9.isEmpty();
        java.lang.Object obj14 = stackTestDriver3.push((java.lang.Object) boolean13);
        boolean boolean15 = stackTestDriver3.isEmpty();
        java.lang.Object obj16 = stackTestDriver0.push((java.lang.Object) stackTestDriver3);
        java.lang.Object obj17 = stackTestDriver0.pop();
        boolean boolean18 = stackTestDriver0.isEmpty();
        boolean boolean19 = stackTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1 + "'", obj7, 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + true + "'", obj14, true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test083");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) 1);
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        boolean boolean7 = stackTestDriver6.isEmpty();
        int int8 = stackTestDriver6.size();
        int int9 = stackTestDriver6.size();
        boolean boolean10 = stackTestDriver6.isEmpty();
        java.lang.Object obj11 = stackTestDriver0.push((java.lang.Object) boolean10);
        java.lang.Object obj12 = stackTestDriver0.pop();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 1 + "'", obj4, 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + true + "'", obj11, true);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + true + "'", obj12, true);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test084");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) 10.0f);
        boolean boolean5 = stackTestDriver0.isEmpty();
        java.lang.Object obj6 = stackTestDriver0.peek();
        int int7 = stackTestDriver0.size();
        java.lang.Object obj8 = stackTestDriver0.pop();
        int int9 = stackTestDriver0.size();
        java.lang.Class<?> wildcardClass10 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 10.0f + "'", obj4, 10.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 10.0f + "'", obj6, 10.0f);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 10.0f + "'", obj8, 10.0f);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test085");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        boolean boolean2 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver3 = new experiment.util.StackTestDriver();
        boolean boolean4 = stackTestDriver3.isEmpty();
        int int5 = stackTestDriver3.size();
        java.lang.Object obj7 = stackTestDriver3.push((java.lang.Object) 1);
        stackTestDriver3.clear();
        experiment.util.StackTestDriver stackTestDriver9 = new experiment.util.StackTestDriver();
        boolean boolean10 = stackTestDriver9.isEmpty();
        int int11 = stackTestDriver9.size();
        int int12 = stackTestDriver9.size();
        boolean boolean13 = stackTestDriver9.isEmpty();
        java.lang.Object obj14 = stackTestDriver3.push((java.lang.Object) boolean13);
        boolean boolean15 = stackTestDriver3.isEmpty();
        java.lang.Object obj16 = stackTestDriver0.push((java.lang.Object) stackTestDriver3);
        java.lang.Object obj17 = stackTestDriver0.pop();
        boolean boolean18 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        java.lang.Class<?> wildcardClass20 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1 + "'", obj7, 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + true + "'", obj14, true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test086");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) 1);
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        boolean boolean7 = stackTestDriver6.isEmpty();
        int int8 = stackTestDriver6.size();
        int int9 = stackTestDriver6.size();
        boolean boolean10 = stackTestDriver6.isEmpty();
        java.lang.Object obj11 = stackTestDriver0.push((java.lang.Object) boolean10);
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        java.lang.Object obj15 = stackTestDriver0.push((java.lang.Object) (-1L));
        java.lang.Class<?> wildcardClass16 = obj15.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 1 + "'", obj4, 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + true + "'", obj11, true);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (-1L) + "'", obj15, (-1L));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test087");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        boolean boolean4 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        boolean boolean6 = stackTestDriver5.isEmpty();
        int int7 = stackTestDriver5.size();
        java.lang.Object obj9 = stackTestDriver5.push((java.lang.Object) 1);
        boolean boolean10 = stackTestDriver5.isEmpty();
        java.lang.Object obj11 = stackTestDriver5.peek();
        java.lang.Object obj12 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        java.lang.Object obj13 = stackTestDriver0.pop();
        boolean boolean14 = stackTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 1 + "'", obj9, 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 1 + "'", obj11, 1);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test088");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver3 = new experiment.util.StackTestDriver();
        boolean boolean4 = stackTestDriver3.isEmpty();
        int int5 = stackTestDriver3.size();
        java.lang.Object obj7 = stackTestDriver3.push((java.lang.Object) 1);
        stackTestDriver3.clear();
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) stackTestDriver3);
        int int10 = stackTestDriver3.size();
        int int11 = stackTestDriver3.size();
        int int12 = stackTestDriver3.size();
        boolean boolean13 = stackTestDriver3.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = stackTestDriver3.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1 + "'", obj7, 1);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test089");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver3 = new experiment.util.StackTestDriver();
        boolean boolean4 = stackTestDriver3.isEmpty();
        int int5 = stackTestDriver3.size();
        java.lang.Object obj7 = stackTestDriver3.push((java.lang.Object) 1);
        stackTestDriver3.clear();
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) stackTestDriver3);
        stackTestDriver3.clear();
        java.lang.Class<?> wildcardClass11 = stackTestDriver3.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1 + "'", obj7, 1);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test090");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        boolean boolean2 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver3 = new experiment.util.StackTestDriver();
        boolean boolean4 = stackTestDriver3.isEmpty();
        int int5 = stackTestDriver3.size();
        java.lang.Object obj7 = stackTestDriver3.push((java.lang.Object) 1);
        stackTestDriver3.clear();
        experiment.util.StackTestDriver stackTestDriver9 = new experiment.util.StackTestDriver();
        boolean boolean10 = stackTestDriver9.isEmpty();
        int int11 = stackTestDriver9.size();
        int int12 = stackTestDriver9.size();
        boolean boolean13 = stackTestDriver9.isEmpty();
        java.lang.Object obj14 = stackTestDriver3.push((java.lang.Object) boolean13);
        boolean boolean15 = stackTestDriver3.isEmpty();
        java.lang.Object obj16 = stackTestDriver0.push((java.lang.Object) stackTestDriver3);
        int int17 = stackTestDriver3.size();
        boolean boolean18 = stackTestDriver3.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1 + "'", obj7, 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + true + "'", obj14, true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test091");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) 1);
        boolean boolean5 = stackTestDriver0.isEmpty();
        java.lang.Object obj6 = stackTestDriver0.peek();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) (short) 0);
        boolean boolean9 = stackTestDriver0.isEmpty();
        java.lang.Class<?> wildcardClass10 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 1 + "'", obj4, 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1 + "'", obj6, 1);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (short) 0 + "'", obj8, (short) 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test092");
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
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test093");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        int int4 = stackTestDriver0.size();
        boolean boolean5 = stackTestDriver0.isEmpty();
        boolean boolean6 = stackTestDriver0.isEmpty();
        boolean boolean7 = stackTestDriver0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test094");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) 1);
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        boolean boolean7 = stackTestDriver6.isEmpty();
        int int8 = stackTestDriver6.size();
        int int9 = stackTestDriver6.size();
        boolean boolean10 = stackTestDriver6.isEmpty();
        java.lang.Object obj11 = stackTestDriver0.push((java.lang.Object) boolean10);
        boolean boolean12 = stackTestDriver0.isEmpty();
        boolean boolean13 = stackTestDriver0.isEmpty();
        java.lang.Object obj15 = stackTestDriver0.push((java.lang.Object) 10);
        experiment.util.StackTestDriver stackTestDriver16 = new experiment.util.StackTestDriver();
        boolean boolean17 = stackTestDriver16.isEmpty();
        int int18 = stackTestDriver16.size();
        experiment.util.StackTestDriver stackTestDriver19 = new experiment.util.StackTestDriver();
        boolean boolean20 = stackTestDriver19.isEmpty();
        int int21 = stackTestDriver19.size();
        java.lang.Object obj23 = stackTestDriver19.push((java.lang.Object) 1);
        stackTestDriver19.clear();
        java.lang.Object obj25 = stackTestDriver16.push((java.lang.Object) stackTestDriver19);
        int int26 = stackTestDriver19.size();
        int int27 = stackTestDriver19.size();
        int int28 = stackTestDriver19.size();
        java.lang.Object obj29 = stackTestDriver0.push((java.lang.Object) int28);
        java.lang.Class<?> wildcardClass30 = obj29.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 1 + "'", obj4, 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + true + "'", obj11, true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 10 + "'", obj15, 10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 1 + "'", obj23, 1);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 0 + "'", obj29, 0);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test095");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        boolean boolean2 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver3 = new experiment.util.StackTestDriver();
        boolean boolean4 = stackTestDriver3.isEmpty();
        int int5 = stackTestDriver3.size();
        java.lang.Object obj7 = stackTestDriver3.push((java.lang.Object) 1);
        stackTestDriver3.clear();
        experiment.util.StackTestDriver stackTestDriver9 = new experiment.util.StackTestDriver();
        boolean boolean10 = stackTestDriver9.isEmpty();
        int int11 = stackTestDriver9.size();
        int int12 = stackTestDriver9.size();
        boolean boolean13 = stackTestDriver9.isEmpty();
        java.lang.Object obj14 = stackTestDriver3.push((java.lang.Object) boolean13);
        boolean boolean15 = stackTestDriver3.isEmpty();
        java.lang.Object obj16 = stackTestDriver0.push((java.lang.Object) stackTestDriver3);
        java.lang.Object obj17 = stackTestDriver0.pop();
        int int18 = stackTestDriver0.size();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1 + "'", obj7, 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + true + "'", obj14, true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test096");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) 1);
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        boolean boolean7 = stackTestDriver6.isEmpty();
        int int8 = stackTestDriver6.size();
        int int9 = stackTestDriver6.size();
        boolean boolean10 = stackTestDriver6.isEmpty();
        java.lang.Object obj11 = stackTestDriver0.push((java.lang.Object) boolean10);
        boolean boolean12 = stackTestDriver0.isEmpty();
        boolean boolean13 = stackTestDriver0.isEmpty();
        java.lang.Object obj15 = stackTestDriver0.push((java.lang.Object) 10);
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 1 + "'", obj4, 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + true + "'", obj11, true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 10 + "'", obj15, 10);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test097");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver3 = new experiment.util.StackTestDriver();
        boolean boolean4 = stackTestDriver3.isEmpty();
        int int5 = stackTestDriver3.size();
        java.lang.Object obj7 = stackTestDriver3.push((java.lang.Object) 1);
        stackTestDriver3.clear();
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) stackTestDriver3);
        int int10 = stackTestDriver3.size();
        int int11 = stackTestDriver3.size();
        java.lang.Class<?> wildcardClass12 = stackTestDriver3.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1 + "'", obj7, 1);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test098");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        boolean boolean2 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver3 = new experiment.util.StackTestDriver();
        boolean boolean4 = stackTestDriver3.isEmpty();
        int int5 = stackTestDriver3.size();
        java.lang.Object obj7 = stackTestDriver3.push((java.lang.Object) 1);
        stackTestDriver3.clear();
        experiment.util.StackTestDriver stackTestDriver9 = new experiment.util.StackTestDriver();
        boolean boolean10 = stackTestDriver9.isEmpty();
        int int11 = stackTestDriver9.size();
        int int12 = stackTestDriver9.size();
        boolean boolean13 = stackTestDriver9.isEmpty();
        java.lang.Object obj14 = stackTestDriver3.push((java.lang.Object) boolean13);
        boolean boolean15 = stackTestDriver3.isEmpty();
        java.lang.Object obj16 = stackTestDriver0.push((java.lang.Object) stackTestDriver3);
        stackTestDriver3.clear();
        boolean boolean18 = stackTestDriver3.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = stackTestDriver3.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1 + "'", obj7, 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + true + "'", obj14, true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test099");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) 1);
        stackTestDriver0.clear();
        boolean boolean6 = stackTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 1 + "'", obj4, 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test100");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        boolean boolean2 = stackTestDriver0.isEmpty();
        int int3 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        boolean boolean5 = stackTestDriver4.isEmpty();
        int int6 = stackTestDriver4.size();
        java.lang.Object obj8 = stackTestDriver4.push((java.lang.Object) 1);
        stackTestDriver4.clear();
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        boolean boolean11 = stackTestDriver10.isEmpty();
        int int12 = stackTestDriver10.size();
        int int13 = stackTestDriver10.size();
        boolean boolean14 = stackTestDriver10.isEmpty();
        java.lang.Object obj15 = stackTestDriver4.push((java.lang.Object) boolean14);
        boolean boolean16 = stackTestDriver4.isEmpty();
        experiment.util.StackTestDriver stackTestDriver17 = new experiment.util.StackTestDriver();
        boolean boolean18 = stackTestDriver17.isEmpty();
        int int19 = stackTestDriver17.size();
        java.lang.Object obj21 = stackTestDriver17.push((java.lang.Object) 1);
        stackTestDriver17.clear();
        experiment.util.StackTestDriver stackTestDriver23 = new experiment.util.StackTestDriver();
        boolean boolean24 = stackTestDriver23.isEmpty();
        int int25 = stackTestDriver23.size();
        int int26 = stackTestDriver23.size();
        boolean boolean27 = stackTestDriver23.isEmpty();
        java.lang.Object obj28 = stackTestDriver17.push((java.lang.Object) boolean27);
        stackTestDriver17.clear();
        java.lang.Object obj30 = stackTestDriver4.push((java.lang.Object) stackTestDriver17);
        experiment.util.StackTestDriver stackTestDriver31 = new experiment.util.StackTestDriver();
        boolean boolean32 = stackTestDriver31.isEmpty();
        int int33 = stackTestDriver31.size();
        java.lang.Object obj35 = stackTestDriver31.push((java.lang.Object) 1);
        stackTestDriver31.clear();
        experiment.util.StackTestDriver stackTestDriver37 = new experiment.util.StackTestDriver();
        boolean boolean38 = stackTestDriver37.isEmpty();
        int int39 = stackTestDriver37.size();
        int int40 = stackTestDriver37.size();
        boolean boolean41 = stackTestDriver37.isEmpty();
        java.lang.Object obj42 = stackTestDriver31.push((java.lang.Object) boolean41);
        stackTestDriver31.clear();
        stackTestDriver31.clear();
        java.lang.Object obj46 = stackTestDriver31.push((java.lang.Object) (-1L));
        java.lang.Object obj47 = stackTestDriver31.peek();
        java.lang.Object obj49 = stackTestDriver31.push((java.lang.Object) '4');
        java.lang.Object obj50 = stackTestDriver31.pop();
        java.lang.Object obj51 = stackTestDriver31.peek();
        java.lang.Object obj52 = stackTestDriver4.push((java.lang.Object) stackTestDriver31);
        java.lang.Object obj53 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        java.lang.Class<?> wildcardClass54 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 1 + "'", obj8, 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + true + "'", obj15, true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 1 + "'", obj21, 1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + true + "'", obj28, true);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 1 + "'", obj35, 1);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + true + "'", obj42, true);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + (-1L) + "'", obj46, (-1L));
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + (-1L) + "'", obj47, (-1L));
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + '4' + "'", obj49, '4');
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + '4' + "'", obj50, '4');
        org.junit.Assert.assertEquals("'" + obj51 + "' != '" + (-1L) + "'", obj51, (-1L));
        org.junit.Assert.assertNotNull(obj52);
        org.junit.Assert.assertNotNull(obj53);
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test101");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean4 = stackTestDriver0.isEmpty();
        java.lang.Object obj5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = stackTestDriver0.push(obj5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test102");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        boolean boolean4 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        boolean boolean6 = stackTestDriver5.isEmpty();
        int int7 = stackTestDriver5.size();
        java.lang.Object obj9 = stackTestDriver5.push((java.lang.Object) 1);
        boolean boolean10 = stackTestDriver5.isEmpty();
        java.lang.Object obj11 = stackTestDriver5.peek();
        java.lang.Object obj12 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        int int13 = stackTestDriver5.size();
        int int14 = stackTestDriver5.size();
        stackTestDriver5.clear();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 1 + "'", obj9, 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 1 + "'", obj11, 1);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test103");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        boolean boolean2 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver3 = new experiment.util.StackTestDriver();
        boolean boolean4 = stackTestDriver3.isEmpty();
        int int5 = stackTestDriver3.size();
        java.lang.Object obj7 = stackTestDriver3.push((java.lang.Object) 1);
        stackTestDriver3.clear();
        experiment.util.StackTestDriver stackTestDriver9 = new experiment.util.StackTestDriver();
        boolean boolean10 = stackTestDriver9.isEmpty();
        int int11 = stackTestDriver9.size();
        int int12 = stackTestDriver9.size();
        boolean boolean13 = stackTestDriver9.isEmpty();
        java.lang.Object obj14 = stackTestDriver3.push((java.lang.Object) boolean13);
        boolean boolean15 = stackTestDriver3.isEmpty();
        java.lang.Object obj16 = stackTestDriver0.push((java.lang.Object) stackTestDriver3);
        boolean boolean17 = stackTestDriver3.isEmpty();
        boolean boolean18 = stackTestDriver3.isEmpty();
        java.lang.Object obj19 = stackTestDriver3.pop();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1 + "'", obj7, 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + true + "'", obj14, true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + true + "'", obj19, true);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test104");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        boolean boolean4 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        boolean boolean6 = stackTestDriver5.isEmpty();
        int int7 = stackTestDriver5.size();
        java.lang.Object obj9 = stackTestDriver5.push((java.lang.Object) 1);
        boolean boolean10 = stackTestDriver5.isEmpty();
        java.lang.Object obj11 = stackTestDriver5.peek();
        java.lang.Object obj12 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        java.lang.Object obj13 = stackTestDriver0.pop();
        boolean boolean14 = stackTestDriver0.isEmpty();
        boolean boolean15 = stackTestDriver0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 1 + "'", obj9, 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 1 + "'", obj11, 1);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test105");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) 1);
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        boolean boolean7 = stackTestDriver6.isEmpty();
        int int8 = stackTestDriver6.size();
        int int9 = stackTestDriver6.size();
        boolean boolean10 = stackTestDriver6.isEmpty();
        java.lang.Object obj11 = stackTestDriver0.push((java.lang.Object) boolean10);
        boolean boolean12 = stackTestDriver0.isEmpty();
        boolean boolean13 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        boolean boolean16 = stackTestDriver15.isEmpty();
        int int17 = stackTestDriver15.size();
        java.lang.Object obj19 = stackTestDriver15.push((java.lang.Object) 1);
        boolean boolean20 = stackTestDriver15.isEmpty();
        java.lang.Object obj21 = stackTestDriver15.peek();
        java.lang.Object obj23 = stackTestDriver15.push((java.lang.Object) (short) 0);
        java.lang.Object obj24 = stackTestDriver0.push((java.lang.Object) stackTestDriver15);
        int int25 = stackTestDriver15.size();
        java.lang.Object obj26 = stackTestDriver15.peek();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 1 + "'", obj4, 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + true + "'", obj11, true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 1 + "'", obj19, 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 1 + "'", obj21, 1);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (short) 0 + "'", obj23, (short) 0);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + (short) 0 + "'", obj26, (short) 0);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test106");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) 1);
        boolean boolean5 = stackTestDriver0.isEmpty();
        java.lang.Object obj6 = stackTestDriver0.peek();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) (short) 0);
        boolean boolean9 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        java.lang.Class<?> wildcardClass12 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 1 + "'", obj4, 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1 + "'", obj6, 1);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (short) 0 + "'", obj8, (short) 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test107");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver3 = new experiment.util.StackTestDriver();
        boolean boolean4 = stackTestDriver3.isEmpty();
        int int5 = stackTestDriver3.size();
        java.lang.Object obj7 = stackTestDriver3.push((java.lang.Object) 1);
        stackTestDriver3.clear();
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) stackTestDriver3);
        int int10 = stackTestDriver3.size();
        int int11 = stackTestDriver3.size();
        int int12 = stackTestDriver3.size();
        boolean boolean13 = stackTestDriver3.isEmpty();
        java.lang.Class<?> wildcardClass14 = stackTestDriver3.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1 + "'", obj7, 1);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test108");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) 1);
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        boolean boolean7 = stackTestDriver6.isEmpty();
        int int8 = stackTestDriver6.size();
        int int9 = stackTestDriver6.size();
        boolean boolean10 = stackTestDriver6.isEmpty();
        java.lang.Object obj11 = stackTestDriver0.push((java.lang.Object) boolean10);
        boolean boolean12 = stackTestDriver0.isEmpty();
        boolean boolean13 = stackTestDriver0.isEmpty();
        java.lang.Object obj14 = stackTestDriver0.peek();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 1 + "'", obj4, 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + true + "'", obj11, true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + true + "'", obj14, true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test109");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) 1);
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        boolean boolean7 = stackTestDriver6.isEmpty();
        int int8 = stackTestDriver6.size();
        int int9 = stackTestDriver6.size();
        boolean boolean10 = stackTestDriver6.isEmpty();
        java.lang.Object obj11 = stackTestDriver0.push((java.lang.Object) boolean10);
        boolean boolean12 = stackTestDriver0.isEmpty();
        boolean boolean13 = stackTestDriver0.isEmpty();
        int int14 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        boolean boolean16 = stackTestDriver15.isEmpty();
        boolean boolean17 = stackTestDriver15.isEmpty();
        experiment.util.StackTestDriver stackTestDriver18 = new experiment.util.StackTestDriver();
        boolean boolean19 = stackTestDriver18.isEmpty();
        int int20 = stackTestDriver18.size();
        java.lang.Object obj22 = stackTestDriver18.push((java.lang.Object) 1);
        stackTestDriver18.clear();
        experiment.util.StackTestDriver stackTestDriver24 = new experiment.util.StackTestDriver();
        boolean boolean25 = stackTestDriver24.isEmpty();
        int int26 = stackTestDriver24.size();
        int int27 = stackTestDriver24.size();
        boolean boolean28 = stackTestDriver24.isEmpty();
        java.lang.Object obj29 = stackTestDriver18.push((java.lang.Object) boolean28);
        boolean boolean30 = stackTestDriver18.isEmpty();
        java.lang.Object obj31 = stackTestDriver15.push((java.lang.Object) stackTestDriver18);
        int int32 = stackTestDriver18.size();
        java.lang.Object obj33 = stackTestDriver18.pop();
        java.lang.Class<?> wildcardClass34 = stackTestDriver18.getClass();
        java.lang.Object obj35 = stackTestDriver0.push((java.lang.Object) stackTestDriver18);
        stackTestDriver0.clear();
        java.lang.Class<?> wildcardClass37 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 1 + "'", obj4, 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + true + "'", obj11, true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 1 + "'", obj22, 1);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + true + "'", obj29, true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + true + "'", obj33, true);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test110");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        boolean boolean4 = stackTestDriver0.isEmpty();
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
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test111");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) 1);
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        boolean boolean7 = stackTestDriver6.isEmpty();
        int int8 = stackTestDriver6.size();
        int int9 = stackTestDriver6.size();
        boolean boolean10 = stackTestDriver6.isEmpty();
        java.lang.Object obj11 = stackTestDriver0.push((java.lang.Object) boolean10);
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        java.lang.Object obj15 = stackTestDriver0.push((java.lang.Object) (-1L));
        java.lang.Object obj16 = stackTestDriver0.peek();
        java.lang.Object obj17 = stackTestDriver0.pop();
        int int18 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver19 = new experiment.util.StackTestDriver();
        boolean boolean20 = stackTestDriver19.isEmpty();
        int int21 = stackTestDriver19.size();
        java.lang.Object obj23 = stackTestDriver19.push((java.lang.Object) 1);
        stackTestDriver19.clear();
        experiment.util.StackTestDriver stackTestDriver25 = new experiment.util.StackTestDriver();
        boolean boolean26 = stackTestDriver25.isEmpty();
        int int27 = stackTestDriver25.size();
        int int28 = stackTestDriver25.size();
        boolean boolean29 = stackTestDriver25.isEmpty();
        java.lang.Object obj30 = stackTestDriver19.push((java.lang.Object) boolean29);
        boolean boolean31 = stackTestDriver19.isEmpty();
        boolean boolean32 = stackTestDriver19.isEmpty();
        java.lang.Object obj34 = stackTestDriver19.push((java.lang.Object) 10);
        java.lang.Object obj35 = stackTestDriver0.push((java.lang.Object) 10);
        boolean boolean36 = stackTestDriver0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 1 + "'", obj4, 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + true + "'", obj11, true);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (-1L) + "'", obj15, (-1L));
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (-1L) + "'", obj16, (-1L));
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (-1L) + "'", obj17, (-1L));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 1 + "'", obj23, 1);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + true + "'", obj30, true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + 10 + "'", obj34, 10);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 10 + "'", obj35, 10);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test112");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) 1);
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        boolean boolean7 = stackTestDriver6.isEmpty();
        int int8 = stackTestDriver6.size();
        int int9 = stackTestDriver6.size();
        boolean boolean10 = stackTestDriver6.isEmpty();
        java.lang.Object obj11 = stackTestDriver0.push((java.lang.Object) boolean10);
        boolean boolean12 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver13 = new experiment.util.StackTestDriver();
        boolean boolean14 = stackTestDriver13.isEmpty();
        int int15 = stackTestDriver13.size();
        java.lang.Object obj17 = stackTestDriver13.push((java.lang.Object) 1);
        stackTestDriver13.clear();
        experiment.util.StackTestDriver stackTestDriver19 = new experiment.util.StackTestDriver();
        boolean boolean20 = stackTestDriver19.isEmpty();
        int int21 = stackTestDriver19.size();
        int int22 = stackTestDriver19.size();
        boolean boolean23 = stackTestDriver19.isEmpty();
        java.lang.Object obj24 = stackTestDriver13.push((java.lang.Object) boolean23);
        stackTestDriver13.clear();
        java.lang.Object obj26 = stackTestDriver0.push((java.lang.Object) stackTestDriver13);
        boolean boolean27 = stackTestDriver13.isEmpty();
        stackTestDriver13.clear();
        java.lang.Class<?> wildcardClass29 = stackTestDriver13.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 1 + "'", obj4, 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + true + "'", obj11, true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 1 + "'", obj17, 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + true + "'", obj24, true);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test113");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        boolean boolean4 = stackTestDriver0.isEmpty();
        int int5 = stackTestDriver0.size();
        int int6 = stackTestDriver0.size();
        stackTestDriver0.clear();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test114");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) 1);
        boolean boolean5 = stackTestDriver0.isEmpty();
        boolean boolean6 = stackTestDriver0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 1 + "'", obj4, 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test115");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        boolean boolean4 = stackTestDriver0.isEmpty();
        int int5 = stackTestDriver0.size();
        int int6 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver7 = new experiment.util.StackTestDriver();
        boolean boolean8 = stackTestDriver7.isEmpty();
        boolean boolean9 = stackTestDriver7.isEmpty();
        java.lang.Object obj11 = stackTestDriver7.push((java.lang.Object) 10.0f);
        boolean boolean12 = stackTestDriver7.isEmpty();
        java.lang.Object obj14 = stackTestDriver7.push((java.lang.Object) (-1.0d));
        boolean boolean15 = stackTestDriver7.isEmpty();
        java.lang.Object obj16 = stackTestDriver0.push((java.lang.Object) stackTestDriver7);
        java.lang.Object obj17 = stackTestDriver0.peek();
        java.lang.Object obj18 = stackTestDriver0.peek();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 10.0f + "'", obj11, 10.0f);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1.0d) + "'", obj14, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNotNull(obj18);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test116");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        boolean boolean4 = stackTestDriver0.isEmpty();
        int int5 = stackTestDriver0.size();
        int int6 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver7 = new experiment.util.StackTestDriver();
        boolean boolean8 = stackTestDriver7.isEmpty();
        boolean boolean9 = stackTestDriver7.isEmpty();
        java.lang.Object obj11 = stackTestDriver7.push((java.lang.Object) 10.0f);
        boolean boolean12 = stackTestDriver7.isEmpty();
        java.lang.Object obj14 = stackTestDriver7.push((java.lang.Object) (-1.0d));
        boolean boolean15 = stackTestDriver7.isEmpty();
        java.lang.Object obj16 = stackTestDriver0.push((java.lang.Object) stackTestDriver7);
        boolean boolean17 = stackTestDriver7.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 10.0f + "'", obj11, 10.0f);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1.0d) + "'", obj14, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test117");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) 1);
        boolean boolean5 = stackTestDriver0.isEmpty();
        java.lang.Object obj6 = stackTestDriver0.peek();
        boolean boolean7 = stackTestDriver0.isEmpty();
        java.lang.Object obj8 = stackTestDriver0.peek();
        java.lang.Object obj9 = stackTestDriver0.pop();
        java.lang.Class<?> wildcardClass10 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 1 + "'", obj4, 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1 + "'", obj6, 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 1 + "'", obj8, 1);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 1 + "'", obj9, 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test118");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        boolean boolean4 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        boolean boolean6 = stackTestDriver5.isEmpty();
        int int7 = stackTestDriver5.size();
        java.lang.Object obj9 = stackTestDriver5.push((java.lang.Object) 1);
        boolean boolean10 = stackTestDriver5.isEmpty();
        java.lang.Object obj11 = stackTestDriver5.peek();
        java.lang.Object obj12 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        int int13 = stackTestDriver5.size();
        java.lang.Object obj14 = stackTestDriver5.pop();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        boolean boolean16 = stackTestDriver15.isEmpty();
        int int17 = stackTestDriver15.size();
        int int18 = stackTestDriver15.size();
        boolean boolean19 = stackTestDriver15.isEmpty();
        experiment.util.StackTestDriver stackTestDriver20 = new experiment.util.StackTestDriver();
        boolean boolean21 = stackTestDriver20.isEmpty();
        int int22 = stackTestDriver20.size();
        java.lang.Object obj24 = stackTestDriver20.push((java.lang.Object) 1);
        boolean boolean25 = stackTestDriver20.isEmpty();
        java.lang.Object obj26 = stackTestDriver20.peek();
        java.lang.Object obj27 = stackTestDriver15.push((java.lang.Object) stackTestDriver20);
        java.lang.Object obj28 = stackTestDriver20.peek();
        boolean boolean29 = stackTestDriver20.isEmpty();
        java.lang.Object obj30 = stackTestDriver5.push((java.lang.Object) boolean29);
        stackTestDriver5.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj32 = stackTestDriver5.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 1 + "'", obj9, 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 1 + "'", obj11, 1);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 1 + "'", obj14, 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 1 + "'", obj24, 1);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 1 + "'", obj26, 1);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + 1 + "'", obj28, 1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + false + "'", obj30, false);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test119");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) 1);
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        boolean boolean7 = stackTestDriver6.isEmpty();
        int int8 = stackTestDriver6.size();
        int int9 = stackTestDriver6.size();
        boolean boolean10 = stackTestDriver6.isEmpty();
        java.lang.Object obj11 = stackTestDriver0.push((java.lang.Object) boolean10);
        boolean boolean12 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver13 = new experiment.util.StackTestDriver();
        boolean boolean14 = stackTestDriver13.isEmpty();
        int int15 = stackTestDriver13.size();
        java.lang.Object obj17 = stackTestDriver13.push((java.lang.Object) 1);
        stackTestDriver13.clear();
        experiment.util.StackTestDriver stackTestDriver19 = new experiment.util.StackTestDriver();
        boolean boolean20 = stackTestDriver19.isEmpty();
        int int21 = stackTestDriver19.size();
        int int22 = stackTestDriver19.size();
        boolean boolean23 = stackTestDriver19.isEmpty();
        java.lang.Object obj24 = stackTestDriver13.push((java.lang.Object) boolean23);
        stackTestDriver13.clear();
        java.lang.Object obj26 = stackTestDriver0.push((java.lang.Object) stackTestDriver13);
        experiment.util.StackTestDriver stackTestDriver27 = new experiment.util.StackTestDriver();
        boolean boolean28 = stackTestDriver27.isEmpty();
        int int29 = stackTestDriver27.size();
        java.lang.Object obj31 = stackTestDriver27.push((java.lang.Object) 1);
        stackTestDriver27.clear();
        experiment.util.StackTestDriver stackTestDriver33 = new experiment.util.StackTestDriver();
        boolean boolean34 = stackTestDriver33.isEmpty();
        int int35 = stackTestDriver33.size();
        int int36 = stackTestDriver33.size();
        boolean boolean37 = stackTestDriver33.isEmpty();
        java.lang.Object obj38 = stackTestDriver27.push((java.lang.Object) boolean37);
        stackTestDriver27.clear();
        stackTestDriver27.clear();
        java.lang.Object obj42 = stackTestDriver27.push((java.lang.Object) (-1L));
        java.lang.Object obj43 = stackTestDriver27.peek();
        java.lang.Object obj45 = stackTestDriver27.push((java.lang.Object) '4');
        java.lang.Object obj46 = stackTestDriver27.pop();
        java.lang.Object obj47 = stackTestDriver27.peek();
        java.lang.Object obj48 = stackTestDriver0.push((java.lang.Object) stackTestDriver27);
        experiment.util.StackTestDriver stackTestDriver49 = new experiment.util.StackTestDriver();
        boolean boolean50 = stackTestDriver49.isEmpty();
        boolean boolean51 = stackTestDriver49.isEmpty();
        java.lang.Object obj53 = stackTestDriver49.push((java.lang.Object) 10.0f);
        experiment.util.StackTestDriver stackTestDriver54 = new experiment.util.StackTestDriver();
        boolean boolean55 = stackTestDriver54.isEmpty();
        int int56 = stackTestDriver54.size();
        experiment.util.StackTestDriver stackTestDriver57 = new experiment.util.StackTestDriver();
        boolean boolean58 = stackTestDriver57.isEmpty();
        int int59 = stackTestDriver57.size();
        java.lang.Object obj61 = stackTestDriver57.push((java.lang.Object) 1);
        stackTestDriver57.clear();
        java.lang.Object obj63 = stackTestDriver54.push((java.lang.Object) stackTestDriver57);
        int int64 = stackTestDriver57.size();
        stackTestDriver57.clear();
        java.lang.Object obj66 = stackTestDriver49.push((java.lang.Object) stackTestDriver57);
        java.lang.Object obj67 = stackTestDriver0.push((java.lang.Object) stackTestDriver49);
        experiment.util.StackTestDriver stackTestDriver68 = new experiment.util.StackTestDriver();
        boolean boolean69 = stackTestDriver68.isEmpty();
        int int70 = stackTestDriver68.size();
        java.lang.Object obj72 = stackTestDriver68.push((java.lang.Object) 1);
        stackTestDriver68.clear();
        stackTestDriver68.clear();
        java.lang.Object obj75 = stackTestDriver0.push((java.lang.Object) stackTestDriver68);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj76 = stackTestDriver68.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 1 + "'", obj4, 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + true + "'", obj11, true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 1 + "'", obj17, 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + true + "'", obj24, true);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 1 + "'", obj31, 1);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + true + "'", obj38, true);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + (-1L) + "'", obj42, (-1L));
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + (-1L) + "'", obj43, (-1L));
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + '4' + "'", obj45, '4');
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + '4' + "'", obj46, '4');
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + (-1L) + "'", obj47, (-1L));
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertEquals("'" + obj53 + "' != '" + 10.0f + "'", obj53, 10.0f);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertEquals("'" + obj61 + "' != '" + 1 + "'", obj61, 1);
        org.junit.Assert.assertNotNull(obj63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertNotNull(obj66);
        org.junit.Assert.assertNotNull(obj67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertEquals("'" + obj72 + "' != '" + 1 + "'", obj72, 1);
        org.junit.Assert.assertNotNull(obj75);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test120");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) 1);
        boolean boolean5 = stackTestDriver0.isEmpty();
        java.lang.Object obj6 = stackTestDriver0.peek();
        boolean boolean7 = stackTestDriver0.isEmpty();
        java.lang.Object obj8 = stackTestDriver0.peek();
        java.lang.Object obj9 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        boolean boolean11 = stackTestDriver10.isEmpty();
        int int12 = stackTestDriver10.size();
        int int13 = stackTestDriver10.size();
        boolean boolean14 = stackTestDriver10.isEmpty();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        boolean boolean16 = stackTestDriver15.isEmpty();
        int int17 = stackTestDriver15.size();
        java.lang.Object obj19 = stackTestDriver15.push((java.lang.Object) 1);
        boolean boolean20 = stackTestDriver15.isEmpty();
        java.lang.Object obj21 = stackTestDriver15.peek();
        java.lang.Object obj22 = stackTestDriver10.push((java.lang.Object) stackTestDriver15);
        java.lang.Object obj23 = stackTestDriver15.peek();
        java.lang.Object obj24 = stackTestDriver0.push((java.lang.Object) stackTestDriver15);
        java.lang.Class<?> wildcardClass25 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 1 + "'", obj4, 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1 + "'", obj6, 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 1 + "'", obj8, 1);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 1 + "'", obj9, 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 1 + "'", obj19, 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 1 + "'", obj21, 1);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 1 + "'", obj23, 1);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test121");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        boolean boolean6 = stackTestDriver5.isEmpty();
        int int7 = stackTestDriver5.size();
        java.lang.Object obj9 = stackTestDriver5.push((java.lang.Object) 1);
        boolean boolean10 = stackTestDriver5.isEmpty();
        java.lang.Object obj11 = stackTestDriver5.peek();
        boolean boolean12 = stackTestDriver5.isEmpty();
        java.lang.Object obj13 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        java.lang.Class<?> wildcardClass14 = stackTestDriver5.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 1 + "'", obj9, 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 1 + "'", obj11, 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test122");
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
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test123");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        boolean boolean2 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver3 = new experiment.util.StackTestDriver();
        boolean boolean4 = stackTestDriver3.isEmpty();
        int int5 = stackTestDriver3.size();
        java.lang.Object obj7 = stackTestDriver3.push((java.lang.Object) 1);
        stackTestDriver3.clear();
        experiment.util.StackTestDriver stackTestDriver9 = new experiment.util.StackTestDriver();
        boolean boolean10 = stackTestDriver9.isEmpty();
        int int11 = stackTestDriver9.size();
        int int12 = stackTestDriver9.size();
        boolean boolean13 = stackTestDriver9.isEmpty();
        java.lang.Object obj14 = stackTestDriver3.push((java.lang.Object) boolean13);
        boolean boolean15 = stackTestDriver3.isEmpty();
        java.lang.Object obj16 = stackTestDriver0.push((java.lang.Object) stackTestDriver3);
        boolean boolean17 = stackTestDriver3.isEmpty();
        stackTestDriver3.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = stackTestDriver3.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1 + "'", obj7, 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + true + "'", obj14, true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test124");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) 1);
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        boolean boolean7 = stackTestDriver6.isEmpty();
        int int8 = stackTestDriver6.size();
        int int9 = stackTestDriver6.size();
        boolean boolean10 = stackTestDriver6.isEmpty();
        java.lang.Object obj11 = stackTestDriver0.push((java.lang.Object) boolean10);
        boolean boolean12 = stackTestDriver0.isEmpty();
        boolean boolean13 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        boolean boolean16 = stackTestDriver15.isEmpty();
        int int17 = stackTestDriver15.size();
        java.lang.Object obj19 = stackTestDriver15.push((java.lang.Object) 1);
        boolean boolean20 = stackTestDriver15.isEmpty();
        java.lang.Object obj21 = stackTestDriver15.peek();
        java.lang.Object obj23 = stackTestDriver15.push((java.lang.Object) (short) 0);
        java.lang.Object obj24 = stackTestDriver0.push((java.lang.Object) stackTestDriver15);
        java.lang.Object obj25 = stackTestDriver15.peek();
        boolean boolean26 = stackTestDriver15.isEmpty();
        java.lang.Object obj27 = stackTestDriver15.pop();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 1 + "'", obj4, 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + true + "'", obj11, true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 1 + "'", obj19, 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 1 + "'", obj21, 1);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (short) 0 + "'", obj23, (short) 0);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (short) 0 + "'", obj25, (short) 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + (short) 0 + "'", obj27, (short) 0);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test125");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        boolean boolean2 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver3 = new experiment.util.StackTestDriver();
        boolean boolean4 = stackTestDriver3.isEmpty();
        int int5 = stackTestDriver3.size();
        java.lang.Object obj7 = stackTestDriver3.push((java.lang.Object) 1);
        stackTestDriver3.clear();
        experiment.util.StackTestDriver stackTestDriver9 = new experiment.util.StackTestDriver();
        boolean boolean10 = stackTestDriver9.isEmpty();
        int int11 = stackTestDriver9.size();
        int int12 = stackTestDriver9.size();
        boolean boolean13 = stackTestDriver9.isEmpty();
        java.lang.Object obj14 = stackTestDriver3.push((java.lang.Object) boolean13);
        boolean boolean15 = stackTestDriver3.isEmpty();
        java.lang.Object obj16 = stackTestDriver0.push((java.lang.Object) stackTestDriver3);
        stackTestDriver3.clear();
        boolean boolean18 = stackTestDriver3.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = stackTestDriver3.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1 + "'", obj7, 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + true + "'", obj14, true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test126");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        int int4 = stackTestDriver0.size();
        boolean boolean5 = stackTestDriver0.isEmpty();
        boolean boolean6 = stackTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test127");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) 1);
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 1 + "'", obj4, 1);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test128");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) 1);
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        boolean boolean7 = stackTestDriver6.isEmpty();
        int int8 = stackTestDriver6.size();
        int int9 = stackTestDriver6.size();
        boolean boolean10 = stackTestDriver6.isEmpty();
        java.lang.Object obj11 = stackTestDriver0.push((java.lang.Object) boolean10);
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        java.lang.Object obj15 = stackTestDriver0.push((java.lang.Object) (-1L));
        java.lang.Object obj16 = stackTestDriver0.peek();
        java.lang.Object obj17 = stackTestDriver0.pop();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 1 + "'", obj4, 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + true + "'", obj11, true);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (-1L) + "'", obj15, (-1L));
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (-1L) + "'", obj16, (-1L));
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (-1L) + "'", obj17, (-1L));
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test129");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) 1);
        stackTestDriver0.clear();
        boolean boolean6 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver7 = new experiment.util.StackTestDriver();
        boolean boolean8 = stackTestDriver7.isEmpty();
        int int9 = stackTestDriver7.size();
        java.lang.Object obj11 = stackTestDriver7.push((java.lang.Object) 1);
        stackTestDriver7.clear();
        experiment.util.StackTestDriver stackTestDriver13 = new experiment.util.StackTestDriver();
        boolean boolean14 = stackTestDriver13.isEmpty();
        int int15 = stackTestDriver13.size();
        int int16 = stackTestDriver13.size();
        boolean boolean17 = stackTestDriver13.isEmpty();
        java.lang.Object obj18 = stackTestDriver7.push((java.lang.Object) boolean17);
        boolean boolean19 = stackTestDriver7.isEmpty();
        java.lang.Object obj20 = stackTestDriver0.push((java.lang.Object) boolean19);
        java.lang.Object obj21 = stackTestDriver0.peek();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 1 + "'", obj4, 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 1 + "'", obj11, 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + true + "'", obj18, true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + false + "'", obj20, false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + false + "'", obj21, false);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test130");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) 1);
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        boolean boolean7 = stackTestDriver6.isEmpty();
        int int8 = stackTestDriver6.size();
        int int9 = stackTestDriver6.size();
        boolean boolean10 = stackTestDriver6.isEmpty();
        java.lang.Object obj11 = stackTestDriver0.push((java.lang.Object) boolean10);
        boolean boolean12 = stackTestDriver0.isEmpty();
        boolean boolean13 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        int int15 = stackTestDriver0.size();
        java.lang.Class<?> wildcardClass16 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 1 + "'", obj4, 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + true + "'", obj11, true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test131");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) 10.0f);
        java.lang.Object obj5 = stackTestDriver0.pop();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 10.0f + "'", obj4, 10.0f);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 10.0f + "'", obj5, 10.0f);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test132");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        java.lang.Object obj3 = stackTestDriver0.push((java.lang.Object) 'a');
        java.lang.Class<?> wildcardClass4 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 'a' + "'", obj3, 'a');
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test133");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        boolean boolean2 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver3 = new experiment.util.StackTestDriver();
        boolean boolean4 = stackTestDriver3.isEmpty();
        int int5 = stackTestDriver3.size();
        java.lang.Object obj7 = stackTestDriver3.push((java.lang.Object) 1);
        stackTestDriver3.clear();
        experiment.util.StackTestDriver stackTestDriver9 = new experiment.util.StackTestDriver();
        boolean boolean10 = stackTestDriver9.isEmpty();
        int int11 = stackTestDriver9.size();
        int int12 = stackTestDriver9.size();
        boolean boolean13 = stackTestDriver9.isEmpty();
        java.lang.Object obj14 = stackTestDriver3.push((java.lang.Object) boolean13);
        boolean boolean15 = stackTestDriver3.isEmpty();
        java.lang.Object obj16 = stackTestDriver0.push((java.lang.Object) stackTestDriver3);
        java.lang.Object obj17 = stackTestDriver0.pop();
        boolean boolean18 = stackTestDriver0.isEmpty();
        boolean boolean19 = stackTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1 + "'", obj7, 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + true + "'", obj14, true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test134");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        boolean boolean2 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver3 = new experiment.util.StackTestDriver();
        boolean boolean4 = stackTestDriver3.isEmpty();
        int int5 = stackTestDriver3.size();
        java.lang.Object obj7 = stackTestDriver3.push((java.lang.Object) 1);
        stackTestDriver3.clear();
        experiment.util.StackTestDriver stackTestDriver9 = new experiment.util.StackTestDriver();
        boolean boolean10 = stackTestDriver9.isEmpty();
        int int11 = stackTestDriver9.size();
        int int12 = stackTestDriver9.size();
        boolean boolean13 = stackTestDriver9.isEmpty();
        java.lang.Object obj14 = stackTestDriver3.push((java.lang.Object) boolean13);
        boolean boolean15 = stackTestDriver3.isEmpty();
        java.lang.Object obj16 = stackTestDriver0.push((java.lang.Object) stackTestDriver3);
        boolean boolean17 = stackTestDriver3.isEmpty();
        java.lang.Class<?> wildcardClass18 = stackTestDriver3.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1 + "'", obj7, 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + true + "'", obj14, true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test135");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        boolean boolean2 = stackTestDriver0.isEmpty();
        int int3 = stackTestDriver0.size();
        stackTestDriver0.clear();
        int int5 = stackTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test136");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        boolean boolean4 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        boolean boolean6 = stackTestDriver5.isEmpty();
        int int7 = stackTestDriver5.size();
        java.lang.Object obj9 = stackTestDriver5.push((java.lang.Object) 1);
        boolean boolean10 = stackTestDriver5.isEmpty();
        java.lang.Object obj11 = stackTestDriver5.peek();
        java.lang.Object obj12 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        int int13 = stackTestDriver5.size();
        boolean boolean14 = stackTestDriver5.isEmpty();
        stackTestDriver5.clear();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 1 + "'", obj9, 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 1 + "'", obj11, 1);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test137");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        boolean boolean2 = stackTestDriver0.isEmpty();
        int int3 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        boolean boolean5 = stackTestDriver4.isEmpty();
        int int6 = stackTestDriver4.size();
        java.lang.Object obj8 = stackTestDriver4.push((java.lang.Object) 1);
        stackTestDriver4.clear();
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        boolean boolean11 = stackTestDriver10.isEmpty();
        int int12 = stackTestDriver10.size();
        int int13 = stackTestDriver10.size();
        boolean boolean14 = stackTestDriver10.isEmpty();
        java.lang.Object obj15 = stackTestDriver4.push((java.lang.Object) boolean14);
        boolean boolean16 = stackTestDriver4.isEmpty();
        experiment.util.StackTestDriver stackTestDriver17 = new experiment.util.StackTestDriver();
        boolean boolean18 = stackTestDriver17.isEmpty();
        int int19 = stackTestDriver17.size();
        java.lang.Object obj21 = stackTestDriver17.push((java.lang.Object) 1);
        stackTestDriver17.clear();
        experiment.util.StackTestDriver stackTestDriver23 = new experiment.util.StackTestDriver();
        boolean boolean24 = stackTestDriver23.isEmpty();
        int int25 = stackTestDriver23.size();
        int int26 = stackTestDriver23.size();
        boolean boolean27 = stackTestDriver23.isEmpty();
        java.lang.Object obj28 = stackTestDriver17.push((java.lang.Object) boolean27);
        stackTestDriver17.clear();
        java.lang.Object obj30 = stackTestDriver4.push((java.lang.Object) stackTestDriver17);
        experiment.util.StackTestDriver stackTestDriver31 = new experiment.util.StackTestDriver();
        boolean boolean32 = stackTestDriver31.isEmpty();
        int int33 = stackTestDriver31.size();
        java.lang.Object obj35 = stackTestDriver31.push((java.lang.Object) 1);
        stackTestDriver31.clear();
        experiment.util.StackTestDriver stackTestDriver37 = new experiment.util.StackTestDriver();
        boolean boolean38 = stackTestDriver37.isEmpty();
        int int39 = stackTestDriver37.size();
        int int40 = stackTestDriver37.size();
        boolean boolean41 = stackTestDriver37.isEmpty();
        java.lang.Object obj42 = stackTestDriver31.push((java.lang.Object) boolean41);
        stackTestDriver31.clear();
        stackTestDriver31.clear();
        java.lang.Object obj46 = stackTestDriver31.push((java.lang.Object) (-1L));
        java.lang.Object obj47 = stackTestDriver31.peek();
        java.lang.Object obj49 = stackTestDriver31.push((java.lang.Object) '4');
        java.lang.Object obj50 = stackTestDriver31.pop();
        java.lang.Object obj51 = stackTestDriver31.peek();
        java.lang.Object obj52 = stackTestDriver4.push((java.lang.Object) stackTestDriver31);
        java.lang.Object obj53 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        stackTestDriver4.clear();
        stackTestDriver4.clear();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 1 + "'", obj8, 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + true + "'", obj15, true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 1 + "'", obj21, 1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + true + "'", obj28, true);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 1 + "'", obj35, 1);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + true + "'", obj42, true);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + (-1L) + "'", obj46, (-1L));
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + (-1L) + "'", obj47, (-1L));
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + '4' + "'", obj49, '4');
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + '4' + "'", obj50, '4');
        org.junit.Assert.assertEquals("'" + obj51 + "' != '" + (-1L) + "'", obj51, (-1L));
        org.junit.Assert.assertNotNull(obj52);
        org.junit.Assert.assertNotNull(obj53);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test138");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) 10.0f);
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        boolean boolean6 = stackTestDriver5.isEmpty();
        int int7 = stackTestDriver5.size();
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        boolean boolean9 = stackTestDriver8.isEmpty();
        int int10 = stackTestDriver8.size();
        java.lang.Object obj12 = stackTestDriver8.push((java.lang.Object) 1);
        stackTestDriver8.clear();
        java.lang.Object obj14 = stackTestDriver5.push((java.lang.Object) stackTestDriver8);
        int int15 = stackTestDriver8.size();
        stackTestDriver8.clear();
        java.lang.Object obj17 = stackTestDriver0.push((java.lang.Object) stackTestDriver8);
        java.lang.Object obj19 = stackTestDriver0.push((java.lang.Object) (short) 100);
        java.lang.Object obj20 = stackTestDriver0.pop();
        boolean boolean21 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver22 = new experiment.util.StackTestDriver();
        boolean boolean23 = stackTestDriver22.isEmpty();
        int int24 = stackTestDriver22.size();
        java.lang.Object obj26 = stackTestDriver22.push((java.lang.Object) 1);
        stackTestDriver22.clear();
        experiment.util.StackTestDriver stackTestDriver28 = new experiment.util.StackTestDriver();
        boolean boolean29 = stackTestDriver28.isEmpty();
        int int30 = stackTestDriver28.size();
        int int31 = stackTestDriver28.size();
        boolean boolean32 = stackTestDriver28.isEmpty();
        java.lang.Object obj33 = stackTestDriver22.push((java.lang.Object) boolean32);
        boolean boolean34 = stackTestDriver22.isEmpty();
        java.lang.Object obj35 = stackTestDriver0.push((java.lang.Object) boolean34);
        java.lang.Class<?> wildcardClass36 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 10.0f + "'", obj4, 10.0f);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 1 + "'", obj12, 1);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (short) 100 + "'", obj19, (short) 100);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (short) 100 + "'", obj20, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 1 + "'", obj26, 1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + true + "'", obj33, true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + false + "'", obj35, false);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test139");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        boolean boolean4 = stackTestDriver0.isEmpty();
        int int5 = stackTestDriver0.size();
        int int6 = stackTestDriver0.size();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) 100L);
        int int9 = stackTestDriver0.size();
        java.lang.Class<?> wildcardClass10 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 100L + "'", obj8, 100L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test140");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        boolean boolean2 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver3 = new experiment.util.StackTestDriver();
        boolean boolean4 = stackTestDriver3.isEmpty();
        int int5 = stackTestDriver3.size();
        java.lang.Object obj7 = stackTestDriver3.push((java.lang.Object) 1);
        stackTestDriver3.clear();
        experiment.util.StackTestDriver stackTestDriver9 = new experiment.util.StackTestDriver();
        boolean boolean10 = stackTestDriver9.isEmpty();
        int int11 = stackTestDriver9.size();
        int int12 = stackTestDriver9.size();
        boolean boolean13 = stackTestDriver9.isEmpty();
        java.lang.Object obj14 = stackTestDriver3.push((java.lang.Object) boolean13);
        boolean boolean15 = stackTestDriver3.isEmpty();
        java.lang.Object obj16 = stackTestDriver0.push((java.lang.Object) stackTestDriver3);
        java.lang.Object obj17 = stackTestDriver0.peek();
        stackTestDriver0.clear();
        int int19 = stackTestDriver0.size();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1 + "'", obj7, 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + true + "'", obj14, true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test141");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver3 = new experiment.util.StackTestDriver();
        boolean boolean4 = stackTestDriver3.isEmpty();
        int int5 = stackTestDriver3.size();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        boolean boolean7 = stackTestDriver6.isEmpty();
        int int8 = stackTestDriver6.size();
        java.lang.Object obj10 = stackTestDriver6.push((java.lang.Object) 1);
        stackTestDriver6.clear();
        java.lang.Object obj12 = stackTestDriver3.push((java.lang.Object) stackTestDriver6);
        java.lang.Class<?> wildcardClass13 = obj12.getClass();
        java.lang.Object obj14 = stackTestDriver0.push((java.lang.Object) wildcardClass13);
        java.lang.Object obj15 = stackTestDriver0.pop();
        java.lang.Class<?> wildcardClass16 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 1 + "'", obj10, 1);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test142");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) 10.0f);
        java.lang.Object obj5 = stackTestDriver0.pop();
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) "hi!");
        java.lang.Object obj8 = stackTestDriver0.pop();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 10.0f + "'", obj4, 10.0f);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 10.0f + "'", obj5, 10.0f);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + "hi!" + "'", obj7, "hi!");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "hi!" + "'", obj8, "hi!");
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test143");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) 1);
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        boolean boolean7 = stackTestDriver6.isEmpty();
        int int8 = stackTestDriver6.size();
        int int9 = stackTestDriver6.size();
        boolean boolean10 = stackTestDriver6.isEmpty();
        java.lang.Object obj11 = stackTestDriver0.push((java.lang.Object) boolean10);
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver14 = new experiment.util.StackTestDriver();
        boolean boolean15 = stackTestDriver14.isEmpty();
        int int16 = stackTestDriver14.size();
        java.lang.Object obj18 = stackTestDriver14.push((java.lang.Object) 1);
        stackTestDriver14.clear();
        experiment.util.StackTestDriver stackTestDriver20 = new experiment.util.StackTestDriver();
        boolean boolean21 = stackTestDriver20.isEmpty();
        int int22 = stackTestDriver20.size();
        int int23 = stackTestDriver20.size();
        boolean boolean24 = stackTestDriver20.isEmpty();
        java.lang.Object obj25 = stackTestDriver14.push((java.lang.Object) boolean24);
        stackTestDriver14.clear();
        stackTestDriver14.clear();
        java.lang.Object obj29 = stackTestDriver14.push((java.lang.Object) (-1L));
        java.lang.Object obj30 = stackTestDriver14.peek();
        java.lang.Object obj31 = stackTestDriver14.pop();
        int int32 = stackTestDriver14.size();
        experiment.util.StackTestDriver stackTestDriver33 = new experiment.util.StackTestDriver();
        boolean boolean34 = stackTestDriver33.isEmpty();
        int int35 = stackTestDriver33.size();
        java.lang.Object obj37 = stackTestDriver33.push((java.lang.Object) 1);
        stackTestDriver33.clear();
        experiment.util.StackTestDriver stackTestDriver39 = new experiment.util.StackTestDriver();
        boolean boolean40 = stackTestDriver39.isEmpty();
        int int41 = stackTestDriver39.size();
        int int42 = stackTestDriver39.size();
        boolean boolean43 = stackTestDriver39.isEmpty();
        java.lang.Object obj44 = stackTestDriver33.push((java.lang.Object) boolean43);
        boolean boolean45 = stackTestDriver33.isEmpty();
        boolean boolean46 = stackTestDriver33.isEmpty();
        java.lang.Object obj48 = stackTestDriver33.push((java.lang.Object) 10);
        java.lang.Object obj49 = stackTestDriver14.push((java.lang.Object) 10);
        java.lang.Object obj50 = stackTestDriver0.push((java.lang.Object) 10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 1 + "'", obj4, 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + true + "'", obj11, true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 1 + "'", obj18, 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + true + "'", obj25, true);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + (-1L) + "'", obj29, (-1L));
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + (-1L) + "'", obj30, (-1L));
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + (-1L) + "'", obj31, (-1L));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + 1 + "'", obj37, 1);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + true + "'", obj44, true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + 10 + "'", obj48, 10);
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + 10 + "'", obj49, 10);
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + 10 + "'", obj50, 10);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test144");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        boolean boolean2 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver3 = new experiment.util.StackTestDriver();
        boolean boolean4 = stackTestDriver3.isEmpty();
        int int5 = stackTestDriver3.size();
        java.lang.Object obj7 = stackTestDriver3.push((java.lang.Object) 1);
        stackTestDriver3.clear();
        experiment.util.StackTestDriver stackTestDriver9 = new experiment.util.StackTestDriver();
        boolean boolean10 = stackTestDriver9.isEmpty();
        int int11 = stackTestDriver9.size();
        int int12 = stackTestDriver9.size();
        boolean boolean13 = stackTestDriver9.isEmpty();
        java.lang.Object obj14 = stackTestDriver3.push((java.lang.Object) boolean13);
        boolean boolean15 = stackTestDriver3.isEmpty();
        java.lang.Object obj16 = stackTestDriver0.push((java.lang.Object) stackTestDriver3);
        java.lang.Object obj17 = stackTestDriver0.peek();
        java.lang.Object obj18 = stackTestDriver0.peek();
        int int19 = stackTestDriver0.size();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1 + "'", obj7, 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + true + "'", obj14, true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test145");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) 1);
        boolean boolean5 = stackTestDriver0.isEmpty();
        java.lang.Object obj6 = stackTestDriver0.peek();
        boolean boolean7 = stackTestDriver0.isEmpty();
        java.lang.Object obj8 = stackTestDriver0.peek();
        java.lang.Object obj9 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        boolean boolean11 = stackTestDriver10.isEmpty();
        int int12 = stackTestDriver10.size();
        int int13 = stackTestDriver10.size();
        boolean boolean14 = stackTestDriver10.isEmpty();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        boolean boolean16 = stackTestDriver15.isEmpty();
        int int17 = stackTestDriver15.size();
        java.lang.Object obj19 = stackTestDriver15.push((java.lang.Object) 1);
        boolean boolean20 = stackTestDriver15.isEmpty();
        java.lang.Object obj21 = stackTestDriver15.peek();
        java.lang.Object obj22 = stackTestDriver10.push((java.lang.Object) stackTestDriver15);
        java.lang.Object obj23 = stackTestDriver15.peek();
        java.lang.Object obj24 = stackTestDriver0.push((java.lang.Object) stackTestDriver15);
        experiment.util.StackTestDriver stackTestDriver25 = new experiment.util.StackTestDriver();
        boolean boolean26 = stackTestDriver25.isEmpty();
        int int27 = stackTestDriver25.size();
        experiment.util.StackTestDriver stackTestDriver28 = new experiment.util.StackTestDriver();
        boolean boolean29 = stackTestDriver28.isEmpty();
        int int30 = stackTestDriver28.size();
        java.lang.Object obj32 = stackTestDriver28.push((java.lang.Object) 1);
        stackTestDriver28.clear();
        java.lang.Object obj34 = stackTestDriver25.push((java.lang.Object) stackTestDriver28);
        java.lang.Object obj35 = stackTestDriver25.peek();
        java.lang.Object obj36 = stackTestDriver15.push((java.lang.Object) stackTestDriver25);
        experiment.util.StackTestDriver stackTestDriver37 = new experiment.util.StackTestDriver();
        boolean boolean38 = stackTestDriver37.isEmpty();
        stackTestDriver37.clear();
        java.lang.Class<?> wildcardClass40 = stackTestDriver37.getClass();
        java.lang.Object obj41 = stackTestDriver15.push((java.lang.Object) wildcardClass40);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 1 + "'", obj4, 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1 + "'", obj6, 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 1 + "'", obj8, 1);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 1 + "'", obj9, 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 1 + "'", obj19, 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 1 + "'", obj21, 1);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 1 + "'", obj23, 1);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 1 + "'", obj32, 1);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertEquals(obj41.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj41), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj41), "class experiment.util.StackTestDriver");
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test146");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        boolean boolean4 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        boolean boolean6 = stackTestDriver5.isEmpty();
        int int7 = stackTestDriver5.size();
        java.lang.Object obj9 = stackTestDriver5.push((java.lang.Object) 1);
        boolean boolean10 = stackTestDriver5.isEmpty();
        java.lang.Object obj11 = stackTestDriver5.peek();
        java.lang.Object obj12 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        java.lang.Object obj13 = stackTestDriver0.pop();
        java.lang.Object obj15 = stackTestDriver0.push((java.lang.Object) 10.0d);
        stackTestDriver0.clear();
        int int17 = stackTestDriver0.size();
        java.lang.Class<?> wildcardClass18 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 1 + "'", obj9, 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 1 + "'", obj11, 1);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 10.0d + "'", obj15, 10.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test147");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) 1);
        boolean boolean5 = stackTestDriver0.isEmpty();
        java.lang.Object obj6 = stackTestDriver0.pop();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 1 + "'", obj4, 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1 + "'", obj6, 1);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test148");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) 10.0f);
        boolean boolean5 = stackTestDriver0.isEmpty();
        java.lang.Object obj6 = stackTestDriver0.peek();
        int int7 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        boolean boolean9 = stackTestDriver8.isEmpty();
        int int10 = stackTestDriver8.size();
        java.lang.Object obj12 = stackTestDriver8.push((java.lang.Object) 1);
        java.lang.Class<?> wildcardClass13 = obj12.getClass();
        java.lang.Object obj14 = stackTestDriver0.push(obj12);
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 10.0f + "'", obj4, 10.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 10.0f + "'", obj6, 10.0f);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 1 + "'", obj12, 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 1 + "'", obj14, 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test149");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) 1);
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        boolean boolean7 = stackTestDriver6.isEmpty();
        int int8 = stackTestDriver6.size();
        int int9 = stackTestDriver6.size();
        boolean boolean10 = stackTestDriver6.isEmpty();
        java.lang.Object obj11 = stackTestDriver0.push((java.lang.Object) boolean10);
        boolean boolean12 = stackTestDriver0.isEmpty();
        boolean boolean13 = stackTestDriver0.isEmpty();
        java.lang.Object obj15 = stackTestDriver0.push((java.lang.Object) '4');
        stackTestDriver0.clear();
        java.lang.Class<?> wildcardClass17 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 1 + "'", obj4, 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + true + "'", obj11, true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + '4' + "'", obj15, '4');
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test150");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) 10.0f);
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver7 = new experiment.util.StackTestDriver();
        boolean boolean8 = stackTestDriver7.isEmpty();
        int int9 = stackTestDriver7.size();
        java.lang.Object obj11 = stackTestDriver7.push((java.lang.Object) 1);
        stackTestDriver7.clear();
        experiment.util.StackTestDriver stackTestDriver13 = new experiment.util.StackTestDriver();
        boolean boolean14 = stackTestDriver13.isEmpty();
        int int15 = stackTestDriver13.size();
        int int16 = stackTestDriver13.size();
        boolean boolean17 = stackTestDriver13.isEmpty();
        java.lang.Object obj18 = stackTestDriver7.push((java.lang.Object) boolean17);
        boolean boolean19 = stackTestDriver7.isEmpty();
        experiment.util.StackTestDriver stackTestDriver20 = new experiment.util.StackTestDriver();
        boolean boolean21 = stackTestDriver20.isEmpty();
        int int22 = stackTestDriver20.size();
        java.lang.Object obj24 = stackTestDriver20.push((java.lang.Object) 1);
        stackTestDriver20.clear();
        experiment.util.StackTestDriver stackTestDriver26 = new experiment.util.StackTestDriver();
        boolean boolean27 = stackTestDriver26.isEmpty();
        int int28 = stackTestDriver26.size();
        int int29 = stackTestDriver26.size();
        boolean boolean30 = stackTestDriver26.isEmpty();
        java.lang.Object obj31 = stackTestDriver20.push((java.lang.Object) boolean30);
        stackTestDriver20.clear();
        java.lang.Object obj33 = stackTestDriver7.push((java.lang.Object) stackTestDriver20);
        experiment.util.StackTestDriver stackTestDriver34 = new experiment.util.StackTestDriver();
        boolean boolean35 = stackTestDriver34.isEmpty();
        int int36 = stackTestDriver34.size();
        java.lang.Object obj38 = stackTestDriver34.push((java.lang.Object) 1);
        stackTestDriver34.clear();
        experiment.util.StackTestDriver stackTestDriver40 = new experiment.util.StackTestDriver();
        boolean boolean41 = stackTestDriver40.isEmpty();
        int int42 = stackTestDriver40.size();
        int int43 = stackTestDriver40.size();
        boolean boolean44 = stackTestDriver40.isEmpty();
        java.lang.Object obj45 = stackTestDriver34.push((java.lang.Object) boolean44);
        stackTestDriver34.clear();
        stackTestDriver34.clear();
        java.lang.Object obj49 = stackTestDriver34.push((java.lang.Object) (-1L));
        java.lang.Object obj50 = stackTestDriver34.peek();
        java.lang.Object obj52 = stackTestDriver34.push((java.lang.Object) '4');
        java.lang.Object obj53 = stackTestDriver34.pop();
        java.lang.Object obj54 = stackTestDriver34.peek();
        java.lang.Object obj55 = stackTestDriver7.push((java.lang.Object) stackTestDriver34);
        experiment.util.StackTestDriver stackTestDriver56 = new experiment.util.StackTestDriver();
        boolean boolean57 = stackTestDriver56.isEmpty();
        boolean boolean58 = stackTestDriver56.isEmpty();
        java.lang.Object obj60 = stackTestDriver56.push((java.lang.Object) 10.0f);
        experiment.util.StackTestDriver stackTestDriver61 = new experiment.util.StackTestDriver();
        boolean boolean62 = stackTestDriver61.isEmpty();
        int int63 = stackTestDriver61.size();
        experiment.util.StackTestDriver stackTestDriver64 = new experiment.util.StackTestDriver();
        boolean boolean65 = stackTestDriver64.isEmpty();
        int int66 = stackTestDriver64.size();
        java.lang.Object obj68 = stackTestDriver64.push((java.lang.Object) 1);
        stackTestDriver64.clear();
        java.lang.Object obj70 = stackTestDriver61.push((java.lang.Object) stackTestDriver64);
        int int71 = stackTestDriver64.size();
        stackTestDriver64.clear();
        java.lang.Object obj73 = stackTestDriver56.push((java.lang.Object) stackTestDriver64);
        java.lang.Object obj74 = stackTestDriver7.push((java.lang.Object) stackTestDriver56);
        java.lang.Object obj75 = stackTestDriver0.push(obj74);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 10.0f + "'", obj4, 10.0f);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 1 + "'", obj11, 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + true + "'", obj18, true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 1 + "'", obj24, 1);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + true + "'", obj31, true);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + 1 + "'", obj38, 1);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + true + "'", obj45, true);
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + (-1L) + "'", obj49, (-1L));
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + (-1L) + "'", obj50, (-1L));
        org.junit.Assert.assertEquals("'" + obj52 + "' != '" + '4' + "'", obj52, '4');
        org.junit.Assert.assertEquals("'" + obj53 + "' != '" + '4' + "'", obj53, '4');
        org.junit.Assert.assertEquals("'" + obj54 + "' != '" + (-1L) + "'", obj54, (-1L));
        org.junit.Assert.assertNotNull(obj55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertEquals("'" + obj60 + "' != '" + 10.0f + "'", obj60, 10.0f);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertEquals("'" + obj68 + "' != '" + 1 + "'", obj68, 1);
        org.junit.Assert.assertNotNull(obj70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertNotNull(obj73);
        org.junit.Assert.assertNotNull(obj74);
        org.junit.Assert.assertNotNull(obj75);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test151");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) 1);
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        boolean boolean7 = stackTestDriver6.isEmpty();
        int int8 = stackTestDriver6.size();
        int int9 = stackTestDriver6.size();
        boolean boolean10 = stackTestDriver6.isEmpty();
        java.lang.Object obj11 = stackTestDriver0.push((java.lang.Object) boolean10);
        boolean boolean12 = stackTestDriver0.isEmpty();
        boolean boolean13 = stackTestDriver0.isEmpty();
        int int14 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        boolean boolean16 = stackTestDriver15.isEmpty();
        boolean boolean17 = stackTestDriver15.isEmpty();
        experiment.util.StackTestDriver stackTestDriver18 = new experiment.util.StackTestDriver();
        boolean boolean19 = stackTestDriver18.isEmpty();
        int int20 = stackTestDriver18.size();
        java.lang.Object obj22 = stackTestDriver18.push((java.lang.Object) 1);
        stackTestDriver18.clear();
        experiment.util.StackTestDriver stackTestDriver24 = new experiment.util.StackTestDriver();
        boolean boolean25 = stackTestDriver24.isEmpty();
        int int26 = stackTestDriver24.size();
        int int27 = stackTestDriver24.size();
        boolean boolean28 = stackTestDriver24.isEmpty();
        java.lang.Object obj29 = stackTestDriver18.push((java.lang.Object) boolean28);
        boolean boolean30 = stackTestDriver18.isEmpty();
        java.lang.Object obj31 = stackTestDriver15.push((java.lang.Object) stackTestDriver18);
        int int32 = stackTestDriver18.size();
        java.lang.Object obj33 = stackTestDriver18.pop();
        java.lang.Class<?> wildcardClass34 = stackTestDriver18.getClass();
        java.lang.Object obj35 = stackTestDriver0.push((java.lang.Object) stackTestDriver18);
        boolean boolean36 = stackTestDriver18.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 1 + "'", obj4, 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + true + "'", obj11, true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 1 + "'", obj22, 1);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + true + "'", obj29, true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + true + "'", obj33, true);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test152");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) 1);
        boolean boolean5 = stackTestDriver0.isEmpty();
        java.lang.Object obj6 = stackTestDriver0.peek();
        boolean boolean7 = stackTestDriver0.isEmpty();
        java.lang.Object obj8 = stackTestDriver0.peek();
        java.lang.Object obj9 = stackTestDriver0.pop();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 1 + "'", obj4, 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1 + "'", obj6, 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 1 + "'", obj8, 1);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 1 + "'", obj9, 1);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test153");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) 1);
        boolean boolean5 = stackTestDriver0.isEmpty();
        java.lang.Object obj6 = stackTestDriver0.peek();
        boolean boolean7 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        boolean boolean9 = stackTestDriver8.isEmpty();
        int int10 = stackTestDriver8.size();
        experiment.util.StackTestDriver stackTestDriver11 = new experiment.util.StackTestDriver();
        boolean boolean12 = stackTestDriver11.isEmpty();
        int int13 = stackTestDriver11.size();
        java.lang.Object obj15 = stackTestDriver11.push((java.lang.Object) 1);
        stackTestDriver11.clear();
        java.lang.Object obj17 = stackTestDriver8.push((java.lang.Object) stackTestDriver11);
        int int18 = stackTestDriver11.size();
        int int19 = stackTestDriver11.size();
        java.lang.Object obj20 = stackTestDriver0.push((java.lang.Object) stackTestDriver11);
        experiment.util.StackTestDriver stackTestDriver21 = new experiment.util.StackTestDriver();
        boolean boolean22 = stackTestDriver21.isEmpty();
        int int23 = stackTestDriver21.size();
        int int24 = stackTestDriver21.size();
        boolean boolean25 = stackTestDriver21.isEmpty();
        int int26 = stackTestDriver21.size();
        stackTestDriver21.clear();
        java.lang.Object obj28 = stackTestDriver11.push((java.lang.Object) stackTestDriver21);
        experiment.util.StackTestDriver stackTestDriver29 = new experiment.util.StackTestDriver();
        boolean boolean30 = stackTestDriver29.isEmpty();
        int int31 = stackTestDriver29.size();
        java.lang.Object obj33 = stackTestDriver29.push((java.lang.Object) 1);
        stackTestDriver29.clear();
        experiment.util.StackTestDriver stackTestDriver35 = new experiment.util.StackTestDriver();
        boolean boolean36 = stackTestDriver35.isEmpty();
        int int37 = stackTestDriver35.size();
        int int38 = stackTestDriver35.size();
        boolean boolean39 = stackTestDriver35.isEmpty();
        java.lang.Object obj40 = stackTestDriver29.push((java.lang.Object) boolean39);
        stackTestDriver29.clear();
        stackTestDriver29.clear();
        boolean boolean43 = stackTestDriver29.isEmpty();
        java.lang.Object obj44 = stackTestDriver11.push((java.lang.Object) boolean43);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 1 + "'", obj4, 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1 + "'", obj6, 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 1 + "'", obj15, 1);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + 1 + "'", obj33, 1);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + true + "'", obj40, true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + true + "'", obj44, true);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test154");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        boolean boolean4 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        boolean boolean6 = stackTestDriver5.isEmpty();
        int int7 = stackTestDriver5.size();
        java.lang.Object obj9 = stackTestDriver5.push((java.lang.Object) 1);
        boolean boolean10 = stackTestDriver5.isEmpty();
        java.lang.Object obj11 = stackTestDriver5.peek();
        java.lang.Object obj12 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        java.lang.Object obj13 = stackTestDriver0.pop();
        java.lang.Object obj15 = stackTestDriver0.push((java.lang.Object) 10.0d);
        java.lang.Object obj16 = stackTestDriver0.peek();
        experiment.util.StackTestDriver stackTestDriver17 = new experiment.util.StackTestDriver();
        boolean boolean18 = stackTestDriver17.isEmpty();
        int int19 = stackTestDriver17.size();
        int int20 = stackTestDriver17.size();
        boolean boolean21 = stackTestDriver17.isEmpty();
        int int22 = stackTestDriver17.size();
        int int23 = stackTestDriver17.size();
        boolean boolean24 = stackTestDriver17.isEmpty();
        java.lang.Class<?> wildcardClass25 = stackTestDriver17.getClass();
        java.lang.Object obj26 = stackTestDriver0.push((java.lang.Object) wildcardClass25);
        java.lang.Class<?> wildcardClass27 = obj26.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 1 + "'", obj9, 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 1 + "'", obj11, 1);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 10.0d + "'", obj15, 10.0d);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 10.0d + "'", obj16, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertEquals(obj26.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj26), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj26), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test155");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) 1);
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        boolean boolean7 = stackTestDriver6.isEmpty();
        int int8 = stackTestDriver6.size();
        int int9 = stackTestDriver6.size();
        boolean boolean10 = stackTestDriver6.isEmpty();
        java.lang.Object obj11 = stackTestDriver0.push((java.lang.Object) boolean10);
        int int12 = stackTestDriver0.size();
        java.lang.Class<?> wildcardClass13 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 1 + "'", obj4, 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + true + "'", obj11, true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test156");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        boolean boolean4 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        boolean boolean6 = stackTestDriver5.isEmpty();
        int int7 = stackTestDriver5.size();
        java.lang.Object obj9 = stackTestDriver5.push((java.lang.Object) 1);
        boolean boolean10 = stackTestDriver5.isEmpty();
        java.lang.Object obj11 = stackTestDriver5.peek();
        java.lang.Object obj12 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        java.lang.Object obj13 = stackTestDriver0.pop();
        java.lang.Object obj15 = stackTestDriver0.push((java.lang.Object) 10.0d);
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 1 + "'", obj9, 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 1 + "'", obj11, 1);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 10.0d + "'", obj15, 10.0d);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test157");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        boolean boolean4 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        int int6 = stackTestDriver0.size();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test158");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        boolean boolean2 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver3 = new experiment.util.StackTestDriver();
        boolean boolean4 = stackTestDriver3.isEmpty();
        int int5 = stackTestDriver3.size();
        java.lang.Object obj7 = stackTestDriver3.push((java.lang.Object) 1);
        stackTestDriver3.clear();
        experiment.util.StackTestDriver stackTestDriver9 = new experiment.util.StackTestDriver();
        boolean boolean10 = stackTestDriver9.isEmpty();
        int int11 = stackTestDriver9.size();
        int int12 = stackTestDriver9.size();
        boolean boolean13 = stackTestDriver9.isEmpty();
        java.lang.Object obj14 = stackTestDriver3.push((java.lang.Object) boolean13);
        boolean boolean15 = stackTestDriver3.isEmpty();
        java.lang.Object obj16 = stackTestDriver0.push((java.lang.Object) stackTestDriver3);
        boolean boolean17 = stackTestDriver3.isEmpty();
        boolean boolean18 = stackTestDriver3.isEmpty();
        int int19 = stackTestDriver3.size();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1 + "'", obj7, 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + true + "'", obj14, true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test159");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        boolean boolean4 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        boolean boolean6 = stackTestDriver5.isEmpty();
        int int7 = stackTestDriver5.size();
        java.lang.Object obj9 = stackTestDriver5.push((java.lang.Object) 1);
        boolean boolean10 = stackTestDriver5.isEmpty();
        java.lang.Object obj11 = stackTestDriver5.peek();
        java.lang.Object obj12 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        experiment.util.StackTestDriver stackTestDriver13 = new experiment.util.StackTestDriver();
        boolean boolean14 = stackTestDriver13.isEmpty();
        boolean boolean15 = stackTestDriver13.isEmpty();
        experiment.util.StackTestDriver stackTestDriver16 = new experiment.util.StackTestDriver();
        boolean boolean17 = stackTestDriver16.isEmpty();
        int int18 = stackTestDriver16.size();
        java.lang.Object obj20 = stackTestDriver16.push((java.lang.Object) 1);
        stackTestDriver16.clear();
        experiment.util.StackTestDriver stackTestDriver22 = new experiment.util.StackTestDriver();
        boolean boolean23 = stackTestDriver22.isEmpty();
        int int24 = stackTestDriver22.size();
        int int25 = stackTestDriver22.size();
        boolean boolean26 = stackTestDriver22.isEmpty();
        java.lang.Object obj27 = stackTestDriver16.push((java.lang.Object) boolean26);
        boolean boolean28 = stackTestDriver16.isEmpty();
        java.lang.Object obj29 = stackTestDriver13.push((java.lang.Object) stackTestDriver16);
        stackTestDriver16.clear();
        stackTestDriver16.clear();
        java.lang.Object obj32 = stackTestDriver0.push((java.lang.Object) stackTestDriver16);
        experiment.util.StackTestDriver stackTestDriver33 = new experiment.util.StackTestDriver();
        boolean boolean34 = stackTestDriver33.isEmpty();
        int int35 = stackTestDriver33.size();
        int int36 = stackTestDriver33.size();
        boolean boolean37 = stackTestDriver33.isEmpty();
        experiment.util.StackTestDriver stackTestDriver38 = new experiment.util.StackTestDriver();
        boolean boolean39 = stackTestDriver38.isEmpty();
        int int40 = stackTestDriver38.size();
        java.lang.Object obj42 = stackTestDriver38.push((java.lang.Object) 1);
        boolean boolean43 = stackTestDriver38.isEmpty();
        java.lang.Object obj44 = stackTestDriver38.peek();
        java.lang.Object obj45 = stackTestDriver33.push((java.lang.Object) stackTestDriver38);
        int int46 = stackTestDriver38.size();
        int int47 = stackTestDriver38.size();
        java.lang.Object obj48 = stackTestDriver16.push((java.lang.Object) stackTestDriver38);
        stackTestDriver38.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj50 = stackTestDriver38.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 1 + "'", obj9, 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 1 + "'", obj11, 1);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 1 + "'", obj20, 1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + true + "'", obj27, true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + 1 + "'", obj42, 1);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + 1 + "'", obj44, 1);
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertNotNull(obj48);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test160");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) 1);
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        boolean boolean7 = stackTestDriver6.isEmpty();
        int int8 = stackTestDriver6.size();
        int int9 = stackTestDriver6.size();
        boolean boolean10 = stackTestDriver6.isEmpty();
        java.lang.Object obj11 = stackTestDriver0.push((java.lang.Object) boolean10);
        boolean boolean12 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver13 = new experiment.util.StackTestDriver();
        boolean boolean14 = stackTestDriver13.isEmpty();
        int int15 = stackTestDriver13.size();
        java.lang.Object obj17 = stackTestDriver13.push((java.lang.Object) 1);
        stackTestDriver13.clear();
        experiment.util.StackTestDriver stackTestDriver19 = new experiment.util.StackTestDriver();
        boolean boolean20 = stackTestDriver19.isEmpty();
        int int21 = stackTestDriver19.size();
        int int22 = stackTestDriver19.size();
        boolean boolean23 = stackTestDriver19.isEmpty();
        java.lang.Object obj24 = stackTestDriver13.push((java.lang.Object) boolean23);
        stackTestDriver13.clear();
        java.lang.Object obj26 = stackTestDriver0.push((java.lang.Object) stackTestDriver13);
        boolean boolean27 = stackTestDriver13.isEmpty();
        stackTestDriver13.clear();
        experiment.util.StackTestDriver stackTestDriver29 = new experiment.util.StackTestDriver();
        boolean boolean30 = stackTestDriver29.isEmpty();
        int int31 = stackTestDriver29.size();
        experiment.util.StackTestDriver stackTestDriver32 = new experiment.util.StackTestDriver();
        boolean boolean33 = stackTestDriver32.isEmpty();
        int int34 = stackTestDriver32.size();
        java.lang.Object obj36 = stackTestDriver32.push((java.lang.Object) 1);
        boolean boolean37 = stackTestDriver32.isEmpty();
        java.lang.Object obj38 = stackTestDriver32.peek();
        boolean boolean39 = stackTestDriver32.isEmpty();
        experiment.util.StackTestDriver stackTestDriver40 = new experiment.util.StackTestDriver();
        boolean boolean41 = stackTestDriver40.isEmpty();
        int int42 = stackTestDriver40.size();
        experiment.util.StackTestDriver stackTestDriver43 = new experiment.util.StackTestDriver();
        boolean boolean44 = stackTestDriver43.isEmpty();
        int int45 = stackTestDriver43.size();
        java.lang.Object obj47 = stackTestDriver43.push((java.lang.Object) 1);
        stackTestDriver43.clear();
        java.lang.Object obj49 = stackTestDriver40.push((java.lang.Object) stackTestDriver43);
        int int50 = stackTestDriver43.size();
        int int51 = stackTestDriver43.size();
        java.lang.Object obj52 = stackTestDriver32.push((java.lang.Object) stackTestDriver43);
        java.lang.Object obj53 = stackTestDriver29.push(obj52);
        java.lang.Object obj54 = stackTestDriver13.push(obj52);
        java.lang.Class<?> wildcardClass55 = obj54.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 1 + "'", obj4, 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + true + "'", obj11, true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 1 + "'", obj17, 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + true + "'", obj24, true);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + 1 + "'", obj36, 1);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + 1 + "'", obj38, 1);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + 1 + "'", obj47, 1);
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(obj52);
        org.junit.Assert.assertNotNull(obj53);
        org.junit.Assert.assertNotNull(obj54);
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test161");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        int int4 = stackTestDriver0.size();
        boolean boolean5 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        int int7 = stackTestDriver0.size();
        java.lang.Class<?> wildcardClass8 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test162");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) 1);
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        boolean boolean7 = stackTestDriver6.isEmpty();
        int int8 = stackTestDriver6.size();
        int int9 = stackTestDriver6.size();
        boolean boolean10 = stackTestDriver6.isEmpty();
        java.lang.Object obj11 = stackTestDriver0.push((java.lang.Object) boolean10);
        boolean boolean12 = stackTestDriver0.isEmpty();
        boolean boolean13 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        boolean boolean16 = stackTestDriver15.isEmpty();
        int int17 = stackTestDriver15.size();
        java.lang.Object obj19 = stackTestDriver15.push((java.lang.Object) 1);
        boolean boolean20 = stackTestDriver15.isEmpty();
        java.lang.Object obj21 = stackTestDriver15.peek();
        java.lang.Object obj23 = stackTestDriver15.push((java.lang.Object) (short) 0);
        java.lang.Object obj24 = stackTestDriver0.push((java.lang.Object) stackTestDriver15);
        java.lang.Object obj25 = stackTestDriver15.peek();
        java.lang.Class<?> wildcardClass26 = stackTestDriver15.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 1 + "'", obj4, 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + true + "'", obj11, true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 1 + "'", obj19, 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 1 + "'", obj21, 1);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (short) 0 + "'", obj23, (short) 0);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (short) 0 + "'", obj25, (short) 0);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test163");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) 1);
        boolean boolean5 = stackTestDriver0.isEmpty();
        java.lang.Object obj6 = stackTestDriver0.peek();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) (short) 0);
        boolean boolean9 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 1 + "'", obj4, 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1 + "'", obj6, 1);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (short) 0 + "'", obj8, (short) 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test164");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
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
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test165");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        int int4 = stackTestDriver0.size();
        boolean boolean5 = stackTestDriver0.isEmpty();
        int int6 = stackTestDriver0.size();
        int int7 = stackTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test166");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) 1);
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        boolean boolean7 = stackTestDriver6.isEmpty();
        int int8 = stackTestDriver6.size();
        int int9 = stackTestDriver6.size();
        boolean boolean10 = stackTestDriver6.isEmpty();
        java.lang.Object obj11 = stackTestDriver0.push((java.lang.Object) boolean10);
        boolean boolean12 = stackTestDriver0.isEmpty();
        boolean boolean13 = stackTestDriver0.isEmpty();
        java.lang.Object obj15 = stackTestDriver0.push((java.lang.Object) 10);
        java.lang.Object obj16 = stackTestDriver0.peek();
        java.lang.Class<?> wildcardClass17 = obj16.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 1 + "'", obj4, 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + true + "'", obj11, true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 10 + "'", obj15, 10);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 10 + "'", obj16, 10);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test167");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) 1);
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        boolean boolean7 = stackTestDriver6.isEmpty();
        int int8 = stackTestDriver6.size();
        int int9 = stackTestDriver6.size();
        boolean boolean10 = stackTestDriver6.isEmpty();
        java.lang.Object obj11 = stackTestDriver0.push((java.lang.Object) boolean10);
        boolean boolean12 = stackTestDriver0.isEmpty();
        boolean boolean13 = stackTestDriver0.isEmpty();
        java.lang.Object obj15 = stackTestDriver0.push((java.lang.Object) '4');
        java.lang.Object obj16 = stackTestDriver0.peek();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 1 + "'", obj4, 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + true + "'", obj11, true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + '4' + "'", obj15, '4');
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + '4' + "'", obj16, '4');
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test168");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        boolean boolean2 = stackTestDriver0.isEmpty();
        int int3 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        boolean boolean5 = stackTestDriver4.isEmpty();
        int int6 = stackTestDriver4.size();
        java.lang.Object obj8 = stackTestDriver4.push((java.lang.Object) 1);
        stackTestDriver4.clear();
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        boolean boolean11 = stackTestDriver10.isEmpty();
        int int12 = stackTestDriver10.size();
        int int13 = stackTestDriver10.size();
        boolean boolean14 = stackTestDriver10.isEmpty();
        java.lang.Object obj15 = stackTestDriver4.push((java.lang.Object) boolean14);
        boolean boolean16 = stackTestDriver4.isEmpty();
        experiment.util.StackTestDriver stackTestDriver17 = new experiment.util.StackTestDriver();
        boolean boolean18 = stackTestDriver17.isEmpty();
        int int19 = stackTestDriver17.size();
        java.lang.Object obj21 = stackTestDriver17.push((java.lang.Object) 1);
        stackTestDriver17.clear();
        experiment.util.StackTestDriver stackTestDriver23 = new experiment.util.StackTestDriver();
        boolean boolean24 = stackTestDriver23.isEmpty();
        int int25 = stackTestDriver23.size();
        int int26 = stackTestDriver23.size();
        boolean boolean27 = stackTestDriver23.isEmpty();
        java.lang.Object obj28 = stackTestDriver17.push((java.lang.Object) boolean27);
        stackTestDriver17.clear();
        java.lang.Object obj30 = stackTestDriver4.push((java.lang.Object) stackTestDriver17);
        experiment.util.StackTestDriver stackTestDriver31 = new experiment.util.StackTestDriver();
        boolean boolean32 = stackTestDriver31.isEmpty();
        int int33 = stackTestDriver31.size();
        java.lang.Object obj35 = stackTestDriver31.push((java.lang.Object) 1);
        stackTestDriver31.clear();
        experiment.util.StackTestDriver stackTestDriver37 = new experiment.util.StackTestDriver();
        boolean boolean38 = stackTestDriver37.isEmpty();
        int int39 = stackTestDriver37.size();
        int int40 = stackTestDriver37.size();
        boolean boolean41 = stackTestDriver37.isEmpty();
        java.lang.Object obj42 = stackTestDriver31.push((java.lang.Object) boolean41);
        stackTestDriver31.clear();
        stackTestDriver31.clear();
        java.lang.Object obj46 = stackTestDriver31.push((java.lang.Object) (-1L));
        java.lang.Object obj47 = stackTestDriver31.peek();
        java.lang.Object obj49 = stackTestDriver31.push((java.lang.Object) '4');
        java.lang.Object obj50 = stackTestDriver31.pop();
        java.lang.Object obj51 = stackTestDriver31.peek();
        java.lang.Object obj52 = stackTestDriver4.push((java.lang.Object) stackTestDriver31);
        java.lang.Object obj53 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        boolean boolean54 = stackTestDriver4.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 1 + "'", obj8, 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + true + "'", obj15, true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 1 + "'", obj21, 1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + true + "'", obj28, true);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 1 + "'", obj35, 1);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + true + "'", obj42, true);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + (-1L) + "'", obj46, (-1L));
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + (-1L) + "'", obj47, (-1L));
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + '4' + "'", obj49, '4');
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + '4' + "'", obj50, '4');
        org.junit.Assert.assertEquals("'" + obj51 + "' != '" + (-1L) + "'", obj51, (-1L));
        org.junit.Assert.assertNotNull(obj52);
        org.junit.Assert.assertNotNull(obj53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test169");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        boolean boolean2 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver3 = new experiment.util.StackTestDriver();
        boolean boolean4 = stackTestDriver3.isEmpty();
        int int5 = stackTestDriver3.size();
        java.lang.Object obj7 = stackTestDriver3.push((java.lang.Object) 1);
        stackTestDriver3.clear();
        experiment.util.StackTestDriver stackTestDriver9 = new experiment.util.StackTestDriver();
        boolean boolean10 = stackTestDriver9.isEmpty();
        int int11 = stackTestDriver9.size();
        int int12 = stackTestDriver9.size();
        boolean boolean13 = stackTestDriver9.isEmpty();
        java.lang.Object obj14 = stackTestDriver3.push((java.lang.Object) boolean13);
        boolean boolean15 = stackTestDriver3.isEmpty();
        java.lang.Object obj16 = stackTestDriver0.push((java.lang.Object) stackTestDriver3);
        boolean boolean17 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver18 = new experiment.util.StackTestDriver();
        boolean boolean19 = stackTestDriver18.isEmpty();
        int int20 = stackTestDriver18.size();
        java.lang.Object obj22 = stackTestDriver18.push((java.lang.Object) 1);
        stackTestDriver18.clear();
        experiment.util.StackTestDriver stackTestDriver24 = new experiment.util.StackTestDriver();
        boolean boolean25 = stackTestDriver24.isEmpty();
        int int26 = stackTestDriver24.size();
        int int27 = stackTestDriver24.size();
        boolean boolean28 = stackTestDriver24.isEmpty();
        java.lang.Object obj29 = stackTestDriver18.push((java.lang.Object) boolean28);
        boolean boolean30 = stackTestDriver18.isEmpty();
        boolean boolean31 = stackTestDriver18.isEmpty();
        java.lang.Object obj33 = stackTestDriver18.push((java.lang.Object) 10);
        stackTestDriver18.clear();
        experiment.util.StackTestDriver stackTestDriver35 = new experiment.util.StackTestDriver();
        boolean boolean36 = stackTestDriver35.isEmpty();
        boolean boolean37 = stackTestDriver35.isEmpty();
        experiment.util.StackTestDriver stackTestDriver38 = new experiment.util.StackTestDriver();
        boolean boolean39 = stackTestDriver38.isEmpty();
        int int40 = stackTestDriver38.size();
        java.lang.Object obj42 = stackTestDriver38.push((java.lang.Object) 1);
        stackTestDriver38.clear();
        experiment.util.StackTestDriver stackTestDriver44 = new experiment.util.StackTestDriver();
        boolean boolean45 = stackTestDriver44.isEmpty();
        int int46 = stackTestDriver44.size();
        int int47 = stackTestDriver44.size();
        boolean boolean48 = stackTestDriver44.isEmpty();
        java.lang.Object obj49 = stackTestDriver38.push((java.lang.Object) boolean48);
        boolean boolean50 = stackTestDriver38.isEmpty();
        java.lang.Object obj51 = stackTestDriver35.push((java.lang.Object) stackTestDriver38);
        stackTestDriver38.clear();
        boolean boolean53 = stackTestDriver38.isEmpty();
        java.lang.Object obj54 = stackTestDriver18.push((java.lang.Object) stackTestDriver38);
        java.lang.Object obj55 = stackTestDriver0.push(obj54);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1 + "'", obj7, 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + true + "'", obj14, true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 1 + "'", obj22, 1);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + true + "'", obj29, true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + 10 + "'", obj33, 10);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + 1 + "'", obj42, 1);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + true + "'", obj49, true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(obj51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(obj54);
        org.junit.Assert.assertNotNull(obj55);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test170");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        boolean boolean2 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver3 = new experiment.util.StackTestDriver();
        boolean boolean4 = stackTestDriver3.isEmpty();
        int int5 = stackTestDriver3.size();
        java.lang.Object obj7 = stackTestDriver3.push((java.lang.Object) 1);
        stackTestDriver3.clear();
        experiment.util.StackTestDriver stackTestDriver9 = new experiment.util.StackTestDriver();
        boolean boolean10 = stackTestDriver9.isEmpty();
        int int11 = stackTestDriver9.size();
        int int12 = stackTestDriver9.size();
        boolean boolean13 = stackTestDriver9.isEmpty();
        java.lang.Object obj14 = stackTestDriver3.push((java.lang.Object) boolean13);
        boolean boolean15 = stackTestDriver3.isEmpty();
        java.lang.Object obj16 = stackTestDriver0.push((java.lang.Object) stackTestDriver3);
        java.lang.Object obj17 = stackTestDriver0.peek();
        int int18 = stackTestDriver0.size();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1 + "'", obj7, 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + true + "'", obj14, true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test171");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) 1);
        boolean boolean5 = stackTestDriver0.isEmpty();
        java.lang.Object obj6 = stackTestDriver0.peek();
        boolean boolean7 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        boolean boolean9 = stackTestDriver8.isEmpty();
        int int10 = stackTestDriver8.size();
        experiment.util.StackTestDriver stackTestDriver11 = new experiment.util.StackTestDriver();
        boolean boolean12 = stackTestDriver11.isEmpty();
        int int13 = stackTestDriver11.size();
        java.lang.Object obj15 = stackTestDriver11.push((java.lang.Object) 1);
        stackTestDriver11.clear();
        java.lang.Object obj17 = stackTestDriver8.push((java.lang.Object) stackTestDriver11);
        int int18 = stackTestDriver11.size();
        int int19 = stackTestDriver11.size();
        java.lang.Object obj20 = stackTestDriver0.push((java.lang.Object) stackTestDriver11);
        int int21 = stackTestDriver0.size();
        java.lang.Class<?> wildcardClass22 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 1 + "'", obj4, 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1 + "'", obj6, 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 1 + "'", obj15, 1);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test172");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        boolean boolean4 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        boolean boolean6 = stackTestDriver5.isEmpty();
        int int7 = stackTestDriver5.size();
        java.lang.Object obj9 = stackTestDriver5.push((java.lang.Object) 1);
        boolean boolean10 = stackTestDriver5.isEmpty();
        java.lang.Object obj11 = stackTestDriver5.peek();
        java.lang.Object obj12 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        java.lang.Object obj13 = stackTestDriver5.peek();
        experiment.util.StackTestDriver stackTestDriver14 = new experiment.util.StackTestDriver();
        boolean boolean15 = stackTestDriver14.isEmpty();
        boolean boolean16 = stackTestDriver14.isEmpty();
        java.lang.Object obj18 = stackTestDriver14.push((java.lang.Object) 10.0f);
        experiment.util.StackTestDriver stackTestDriver19 = new experiment.util.StackTestDriver();
        boolean boolean20 = stackTestDriver19.isEmpty();
        int int21 = stackTestDriver19.size();
        experiment.util.StackTestDriver stackTestDriver22 = new experiment.util.StackTestDriver();
        boolean boolean23 = stackTestDriver22.isEmpty();
        int int24 = stackTestDriver22.size();
        java.lang.Object obj26 = stackTestDriver22.push((java.lang.Object) 1);
        stackTestDriver22.clear();
        java.lang.Object obj28 = stackTestDriver19.push((java.lang.Object) stackTestDriver22);
        int int29 = stackTestDriver22.size();
        stackTestDriver22.clear();
        java.lang.Object obj31 = stackTestDriver14.push((java.lang.Object) stackTestDriver22);
        java.lang.Class<?> wildcardClass32 = stackTestDriver22.getClass();
        java.lang.Object obj33 = stackTestDriver5.push((java.lang.Object) stackTestDriver22);
        java.lang.Class<?> wildcardClass34 = stackTestDriver5.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 1 + "'", obj9, 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 1 + "'", obj11, 1);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 1 + "'", obj13, 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 10.0f + "'", obj18, 10.0f);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 1 + "'", obj26, 1);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test173");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) 1);
        java.lang.Object obj5 = stackTestDriver0.peek();
        int int6 = stackTestDriver0.size();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 1 + "'", obj4, 1);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 1 + "'", obj5, 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test174");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        boolean boolean4 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        boolean boolean6 = stackTestDriver5.isEmpty();
        int int7 = stackTestDriver5.size();
        java.lang.Object obj9 = stackTestDriver5.push((java.lang.Object) 1);
        boolean boolean10 = stackTestDriver5.isEmpty();
        java.lang.Object obj11 = stackTestDriver5.peek();
        java.lang.Object obj12 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        experiment.util.StackTestDriver stackTestDriver13 = new experiment.util.StackTestDriver();
        boolean boolean14 = stackTestDriver13.isEmpty();
        boolean boolean15 = stackTestDriver13.isEmpty();
        experiment.util.StackTestDriver stackTestDriver16 = new experiment.util.StackTestDriver();
        boolean boolean17 = stackTestDriver16.isEmpty();
        int int18 = stackTestDriver16.size();
        java.lang.Object obj20 = stackTestDriver16.push((java.lang.Object) 1);
        stackTestDriver16.clear();
        experiment.util.StackTestDriver stackTestDriver22 = new experiment.util.StackTestDriver();
        boolean boolean23 = stackTestDriver22.isEmpty();
        int int24 = stackTestDriver22.size();
        int int25 = stackTestDriver22.size();
        boolean boolean26 = stackTestDriver22.isEmpty();
        java.lang.Object obj27 = stackTestDriver16.push((java.lang.Object) boolean26);
        boolean boolean28 = stackTestDriver16.isEmpty();
        java.lang.Object obj29 = stackTestDriver13.push((java.lang.Object) stackTestDriver16);
        stackTestDriver16.clear();
        stackTestDriver16.clear();
        java.lang.Object obj32 = stackTestDriver0.push((java.lang.Object) stackTestDriver16);
        java.lang.Object obj33 = stackTestDriver0.peek();
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj35 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 1 + "'", obj9, 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 1 + "'", obj11, 1);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 1 + "'", obj20, 1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + true + "'", obj27, true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertNotNull(obj33);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test175");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        boolean boolean4 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        boolean boolean6 = stackTestDriver5.isEmpty();
        int int7 = stackTestDriver5.size();
        java.lang.Object obj9 = stackTestDriver5.push((java.lang.Object) 1);
        boolean boolean10 = stackTestDriver5.isEmpty();
        java.lang.Object obj11 = stackTestDriver5.peek();
        java.lang.Object obj12 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        java.lang.Object obj13 = stackTestDriver0.pop();
        java.lang.Object obj15 = stackTestDriver0.push((java.lang.Object) 10.0d);
        java.lang.Object obj16 = stackTestDriver0.peek();
        experiment.util.StackTestDriver stackTestDriver17 = new experiment.util.StackTestDriver();
        boolean boolean18 = stackTestDriver17.isEmpty();
        int int19 = stackTestDriver17.size();
        int int20 = stackTestDriver17.size();
        boolean boolean21 = stackTestDriver17.isEmpty();
        int int22 = stackTestDriver17.size();
        int int23 = stackTestDriver17.size();
        boolean boolean24 = stackTestDriver17.isEmpty();
        java.lang.Class<?> wildcardClass25 = stackTestDriver17.getClass();
        java.lang.Object obj26 = stackTestDriver0.push((java.lang.Object) wildcardClass25);
        stackTestDriver0.clear();
        java.lang.Class<?> wildcardClass28 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 1 + "'", obj9, 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 1 + "'", obj11, 1);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 10.0d + "'", obj15, 10.0d);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 10.0d + "'", obj16, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertEquals(obj26.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj26), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj26), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test176");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) 1);
        boolean boolean5 = stackTestDriver0.isEmpty();
        java.lang.Object obj6 = stackTestDriver0.peek();
        boolean boolean7 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        boolean boolean9 = stackTestDriver8.isEmpty();
        int int10 = stackTestDriver8.size();
        experiment.util.StackTestDriver stackTestDriver11 = new experiment.util.StackTestDriver();
        boolean boolean12 = stackTestDriver11.isEmpty();
        int int13 = stackTestDriver11.size();
        java.lang.Object obj15 = stackTestDriver11.push((java.lang.Object) 1);
        stackTestDriver11.clear();
        java.lang.Object obj17 = stackTestDriver8.push((java.lang.Object) stackTestDriver11);
        int int18 = stackTestDriver11.size();
        int int19 = stackTestDriver11.size();
        java.lang.Object obj20 = stackTestDriver0.push((java.lang.Object) stackTestDriver11);
        int int21 = stackTestDriver11.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = stackTestDriver11.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 1 + "'", obj4, 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1 + "'", obj6, 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 1 + "'", obj15, 1);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test177");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver3 = new experiment.util.StackTestDriver();
        boolean boolean4 = stackTestDriver3.isEmpty();
        int int5 = stackTestDriver3.size();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        boolean boolean7 = stackTestDriver6.isEmpty();
        int int8 = stackTestDriver6.size();
        java.lang.Object obj10 = stackTestDriver6.push((java.lang.Object) 1);
        stackTestDriver6.clear();
        java.lang.Object obj12 = stackTestDriver3.push((java.lang.Object) stackTestDriver6);
        java.lang.Class<?> wildcardClass13 = obj12.getClass();
        java.lang.Object obj14 = stackTestDriver0.push((java.lang.Object) wildcardClass13);
        java.lang.Class<?> wildcardClass15 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 1 + "'", obj10, 1);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test178");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) 1);
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        boolean boolean7 = stackTestDriver6.isEmpty();
        int int8 = stackTestDriver6.size();
        int int9 = stackTestDriver6.size();
        boolean boolean10 = stackTestDriver6.isEmpty();
        java.lang.Object obj11 = stackTestDriver0.push((java.lang.Object) boolean10);
        boolean boolean12 = stackTestDriver0.isEmpty();
        boolean boolean13 = stackTestDriver0.isEmpty();
        java.lang.Object obj15 = stackTestDriver0.push((java.lang.Object) '4');
        stackTestDriver0.clear();
        int int17 = stackTestDriver0.size();
        java.lang.Object obj19 = stackTestDriver0.push((java.lang.Object) (byte) 10);
        java.lang.Class<?> wildcardClass20 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 1 + "'", obj4, 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + true + "'", obj11, true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + '4' + "'", obj15, '4');
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (byte) 10 + "'", obj19, (byte) 10);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test179");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver3 = new experiment.util.StackTestDriver();
        boolean boolean4 = stackTestDriver3.isEmpty();
        int int5 = stackTestDriver3.size();
        java.lang.Object obj7 = stackTestDriver3.push((java.lang.Object) 1);
        stackTestDriver3.clear();
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) stackTestDriver3);
        boolean boolean10 = stackTestDriver3.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1 + "'", obj7, 1);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test180");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) 10.0f);
        java.lang.Object obj5 = stackTestDriver0.pop();
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) "hi!");
        java.lang.Object obj8 = stackTestDriver0.pop();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 10.0f + "'", obj4, 10.0f);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 10.0f + "'", obj5, 10.0f);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + "hi!" + "'", obj7, "hi!");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "hi!" + "'", obj8, "hi!");
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test181");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) 1);
        boolean boolean5 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) (-1.0d));
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        boolean boolean11 = stackTestDriver10.isEmpty();
        boolean boolean12 = stackTestDriver10.isEmpty();
        experiment.util.StackTestDriver stackTestDriver13 = new experiment.util.StackTestDriver();
        boolean boolean14 = stackTestDriver13.isEmpty();
        int int15 = stackTestDriver13.size();
        java.lang.Object obj17 = stackTestDriver13.push((java.lang.Object) 1);
        stackTestDriver13.clear();
        experiment.util.StackTestDriver stackTestDriver19 = new experiment.util.StackTestDriver();
        boolean boolean20 = stackTestDriver19.isEmpty();
        int int21 = stackTestDriver19.size();
        int int22 = stackTestDriver19.size();
        boolean boolean23 = stackTestDriver19.isEmpty();
        java.lang.Object obj24 = stackTestDriver13.push((java.lang.Object) boolean23);
        boolean boolean25 = stackTestDriver13.isEmpty();
        java.lang.Object obj26 = stackTestDriver10.push((java.lang.Object) stackTestDriver13);
        java.lang.Object obj27 = stackTestDriver10.pop();
        boolean boolean28 = stackTestDriver10.isEmpty();
        stackTestDriver10.clear();
        java.lang.Object obj30 = stackTestDriver0.push((java.lang.Object) stackTestDriver10);
        java.lang.Object obj31 = stackTestDriver0.peek();
        experiment.util.StackTestDriver stackTestDriver32 = new experiment.util.StackTestDriver();
        boolean boolean33 = stackTestDriver32.isEmpty();
        boolean boolean34 = stackTestDriver32.isEmpty();
        experiment.util.StackTestDriver stackTestDriver35 = new experiment.util.StackTestDriver();
        boolean boolean36 = stackTestDriver35.isEmpty();
        int int37 = stackTestDriver35.size();
        java.lang.Object obj39 = stackTestDriver35.push((java.lang.Object) 1);
        stackTestDriver35.clear();
        experiment.util.StackTestDriver stackTestDriver41 = new experiment.util.StackTestDriver();
        boolean boolean42 = stackTestDriver41.isEmpty();
        int int43 = stackTestDriver41.size();
        int int44 = stackTestDriver41.size();
        boolean boolean45 = stackTestDriver41.isEmpty();
        java.lang.Object obj46 = stackTestDriver35.push((java.lang.Object) boolean45);
        boolean boolean47 = stackTestDriver35.isEmpty();
        java.lang.Object obj48 = stackTestDriver32.push((java.lang.Object) stackTestDriver35);
        stackTestDriver35.clear();
        boolean boolean50 = stackTestDriver35.isEmpty();
        java.lang.Object obj51 = stackTestDriver0.push((java.lang.Object) boolean50);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 1 + "'", obj4, 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 1 + "'", obj17, 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + true + "'", obj24, true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + 1 + "'", obj39, 1);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + true + "'", obj46, true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertEquals("'" + obj51 + "' != '" + true + "'", obj51, true);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test182");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) 10.0f);
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        boolean boolean6 = stackTestDriver5.isEmpty();
        int int7 = stackTestDriver5.size();
        int int8 = stackTestDriver5.size();
        boolean boolean9 = stackTestDriver5.isEmpty();
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        boolean boolean11 = stackTestDriver10.isEmpty();
        int int12 = stackTestDriver10.size();
        java.lang.Object obj14 = stackTestDriver10.push((java.lang.Object) 1);
        boolean boolean15 = stackTestDriver10.isEmpty();
        java.lang.Object obj16 = stackTestDriver10.peek();
        java.lang.Object obj17 = stackTestDriver5.push((java.lang.Object) stackTestDriver10);
        java.lang.Object obj18 = stackTestDriver5.pop();
        java.lang.Class<?> wildcardClass19 = obj18.getClass();
        java.lang.Object obj20 = stackTestDriver0.push(obj18);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 10.0f + "'", obj4, 10.0f);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 1 + "'", obj14, 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 1 + "'", obj16, 1);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(obj20);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test183");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        java.lang.Object obj3 = stackTestDriver0.push((java.lang.Object) 'a');
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        boolean boolean5 = stackTestDriver4.isEmpty();
        int int6 = stackTestDriver4.size();
        java.lang.Object obj8 = stackTestDriver4.push((java.lang.Object) 1);
        stackTestDriver4.clear();
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        boolean boolean11 = stackTestDriver10.isEmpty();
        int int12 = stackTestDriver10.size();
        int int13 = stackTestDriver10.size();
        boolean boolean14 = stackTestDriver10.isEmpty();
        java.lang.Object obj15 = stackTestDriver4.push((java.lang.Object) boolean14);
        java.lang.Class<?> wildcardClass16 = stackTestDriver4.getClass();
        java.lang.Object obj17 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        boolean boolean18 = stackTestDriver0.isEmpty();
        java.lang.Object obj19 = stackTestDriver0.peek();
        java.lang.Object obj20 = stackTestDriver0.pop();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 'a' + "'", obj3, 'a');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 1 + "'", obj8, 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + true + "'", obj15, true);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(obj20);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test184");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) 1);
        boolean boolean5 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) (-1.0d));
        stackTestDriver0.clear();
        java.lang.Class<?> wildcardClass10 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 1 + "'", obj4, 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test185");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        boolean boolean4 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        boolean boolean6 = stackTestDriver5.isEmpty();
        int int7 = stackTestDriver5.size();
        java.lang.Object obj9 = stackTestDriver5.push((java.lang.Object) 1);
        boolean boolean10 = stackTestDriver5.isEmpty();
        java.lang.Object obj11 = stackTestDriver5.peek();
        java.lang.Object obj12 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        java.lang.Object obj13 = stackTestDriver5.peek();
        boolean boolean14 = stackTestDriver5.isEmpty();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        boolean boolean16 = stackTestDriver15.isEmpty();
        int int17 = stackTestDriver15.size();
        java.lang.Object obj19 = stackTestDriver15.push((java.lang.Object) 1);
        boolean boolean20 = stackTestDriver15.isEmpty();
        java.lang.Object obj21 = stackTestDriver15.peek();
        boolean boolean22 = stackTestDriver15.isEmpty();
        java.lang.Class<?> wildcardClass23 = stackTestDriver15.getClass();
        java.lang.Object obj24 = stackTestDriver5.push((java.lang.Object) stackTestDriver15);
        experiment.util.StackTestDriver stackTestDriver25 = new experiment.util.StackTestDriver();
        boolean boolean26 = stackTestDriver25.isEmpty();
        int int27 = stackTestDriver25.size();
        java.lang.Object obj29 = stackTestDriver25.push((java.lang.Object) 1);
        stackTestDriver25.clear();
        experiment.util.StackTestDriver stackTestDriver31 = new experiment.util.StackTestDriver();
        boolean boolean32 = stackTestDriver31.isEmpty();
        int int33 = stackTestDriver31.size();
        int int34 = stackTestDriver31.size();
        boolean boolean35 = stackTestDriver31.isEmpty();
        java.lang.Object obj36 = stackTestDriver25.push((java.lang.Object) boolean35);
        boolean boolean37 = stackTestDriver25.isEmpty();
        boolean boolean38 = stackTestDriver25.isEmpty();
        java.lang.Object obj40 = stackTestDriver25.push((java.lang.Object) 10);
        int int41 = stackTestDriver25.size();
        java.lang.Object obj42 = stackTestDriver15.push((java.lang.Object) int41);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 1 + "'", obj9, 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 1 + "'", obj11, 1);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 1 + "'", obj13, 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 1 + "'", obj19, 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 1 + "'", obj21, 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 1 + "'", obj29, 1);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + true + "'", obj36, true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + 10 + "'", obj40, 10);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 2 + "'", int41 == 2);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + 2 + "'", obj42, 2);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test186");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) 1);
        boolean boolean5 = stackTestDriver0.isEmpty();
        java.lang.Object obj6 = stackTestDriver0.peek();
        boolean boolean7 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        boolean boolean9 = stackTestDriver8.isEmpty();
        int int10 = stackTestDriver8.size();
        experiment.util.StackTestDriver stackTestDriver11 = new experiment.util.StackTestDriver();
        boolean boolean12 = stackTestDriver11.isEmpty();
        int int13 = stackTestDriver11.size();
        java.lang.Object obj15 = stackTestDriver11.push((java.lang.Object) 1);
        stackTestDriver11.clear();
        java.lang.Object obj17 = stackTestDriver8.push((java.lang.Object) stackTestDriver11);
        int int18 = stackTestDriver11.size();
        int int19 = stackTestDriver11.size();
        java.lang.Object obj20 = stackTestDriver0.push((java.lang.Object) stackTestDriver11);
        boolean boolean21 = stackTestDriver11.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 1 + "'", obj4, 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1 + "'", obj6, 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 1 + "'", obj15, 1);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test187");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) 1);
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        boolean boolean7 = stackTestDriver6.isEmpty();
        int int8 = stackTestDriver6.size();
        int int9 = stackTestDriver6.size();
        boolean boolean10 = stackTestDriver6.isEmpty();
        java.lang.Object obj11 = stackTestDriver0.push((java.lang.Object) boolean10);
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        java.lang.Object obj15 = stackTestDriver0.push((java.lang.Object) (-1L));
        int int16 = stackTestDriver0.size();
        java.lang.Class<?> wildcardClass17 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 1 + "'", obj4, 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + true + "'", obj11, true);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (-1L) + "'", obj15, (-1L));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test188");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        boolean boolean4 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        boolean boolean6 = stackTestDriver5.isEmpty();
        int int7 = stackTestDriver5.size();
        java.lang.Object obj9 = stackTestDriver5.push((java.lang.Object) 1);
        boolean boolean10 = stackTestDriver5.isEmpty();
        java.lang.Object obj11 = stackTestDriver5.peek();
        java.lang.Object obj12 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        java.lang.Object obj13 = stackTestDriver0.pop();
        stackTestDriver0.clear();
        int int15 = stackTestDriver0.size();
        int int16 = stackTestDriver0.size();
        int int17 = stackTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 1 + "'", obj9, 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 1 + "'", obj11, 1);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test189");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        java.lang.Class<?> wildcardClass4 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test190");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) 10.0f);
        boolean boolean5 = stackTestDriver0.isEmpty();
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) (-1.0d));
        int int8 = stackTestDriver0.size();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        int int11 = stackTestDriver0.size();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 10.0f + "'", obj4, 10.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test191");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) 10.0f);
        boolean boolean5 = stackTestDriver0.isEmpty();
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) (-1.0d));
        java.lang.Object obj8 = stackTestDriver0.pop();
        java.lang.Object obj9 = stackTestDriver0.peek();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 10.0f + "'", obj4, 10.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 10.0f + "'", obj9, 10.0f);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test192");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        boolean boolean4 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        boolean boolean6 = stackTestDriver5.isEmpty();
        int int7 = stackTestDriver5.size();
        java.lang.Object obj9 = stackTestDriver5.push((java.lang.Object) 1);
        boolean boolean10 = stackTestDriver5.isEmpty();
        java.lang.Object obj11 = stackTestDriver5.peek();
        java.lang.Object obj12 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        experiment.util.StackTestDriver stackTestDriver13 = new experiment.util.StackTestDriver();
        boolean boolean14 = stackTestDriver13.isEmpty();
        boolean boolean15 = stackTestDriver13.isEmpty();
        experiment.util.StackTestDriver stackTestDriver16 = new experiment.util.StackTestDriver();
        boolean boolean17 = stackTestDriver16.isEmpty();
        int int18 = stackTestDriver16.size();
        java.lang.Object obj20 = stackTestDriver16.push((java.lang.Object) 1);
        stackTestDriver16.clear();
        experiment.util.StackTestDriver stackTestDriver22 = new experiment.util.StackTestDriver();
        boolean boolean23 = stackTestDriver22.isEmpty();
        int int24 = stackTestDriver22.size();
        int int25 = stackTestDriver22.size();
        boolean boolean26 = stackTestDriver22.isEmpty();
        java.lang.Object obj27 = stackTestDriver16.push((java.lang.Object) boolean26);
        boolean boolean28 = stackTestDriver16.isEmpty();
        java.lang.Object obj29 = stackTestDriver13.push((java.lang.Object) stackTestDriver16);
        stackTestDriver16.clear();
        stackTestDriver16.clear();
        java.lang.Object obj32 = stackTestDriver0.push((java.lang.Object) stackTestDriver16);
        experiment.util.StackTestDriver stackTestDriver33 = new experiment.util.StackTestDriver();
        boolean boolean34 = stackTestDriver33.isEmpty();
        int int35 = stackTestDriver33.size();
        int int36 = stackTestDriver33.size();
        boolean boolean37 = stackTestDriver33.isEmpty();
        experiment.util.StackTestDriver stackTestDriver38 = new experiment.util.StackTestDriver();
        boolean boolean39 = stackTestDriver38.isEmpty();
        int int40 = stackTestDriver38.size();
        java.lang.Object obj42 = stackTestDriver38.push((java.lang.Object) 1);
        boolean boolean43 = stackTestDriver38.isEmpty();
        java.lang.Object obj44 = stackTestDriver38.peek();
        java.lang.Object obj45 = stackTestDriver33.push((java.lang.Object) stackTestDriver38);
        int int46 = stackTestDriver38.size();
        int int47 = stackTestDriver38.size();
        java.lang.Object obj48 = stackTestDriver16.push((java.lang.Object) stackTestDriver38);
        java.lang.Class<?> wildcardClass49 = stackTestDriver16.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 1 + "'", obj9, 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 1 + "'", obj11, 1);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 1 + "'", obj20, 1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + true + "'", obj27, true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + 1 + "'", obj42, 1);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + 1 + "'", obj44, 1);
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test193");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) 1);
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        boolean boolean7 = stackTestDriver6.isEmpty();
        int int8 = stackTestDriver6.size();
        int int9 = stackTestDriver6.size();
        boolean boolean10 = stackTestDriver6.isEmpty();
        java.lang.Object obj11 = stackTestDriver0.push((java.lang.Object) boolean10);
        stackTestDriver0.clear();
        java.lang.Object obj14 = stackTestDriver0.push((java.lang.Object) 1);
        stackTestDriver0.clear();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 1 + "'", obj4, 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + true + "'", obj11, true);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 1 + "'", obj14, 1);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test194");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) 10.0f);
        boolean boolean5 = stackTestDriver0.isEmpty();
        java.lang.Object obj6 = stackTestDriver0.peek();
        int int7 = stackTestDriver0.size();
        java.lang.Object obj8 = stackTestDriver0.pop();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 10.0f + "'", obj4, 10.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 10.0f + "'", obj6, 10.0f);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 10.0f + "'", obj8, 10.0f);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test195");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) 10.0f);
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        boolean boolean6 = stackTestDriver5.isEmpty();
        int int7 = stackTestDriver5.size();
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        boolean boolean9 = stackTestDriver8.isEmpty();
        int int10 = stackTestDriver8.size();
        java.lang.Object obj12 = stackTestDriver8.push((java.lang.Object) 1);
        stackTestDriver8.clear();
        java.lang.Object obj14 = stackTestDriver5.push((java.lang.Object) stackTestDriver8);
        int int15 = stackTestDriver8.size();
        stackTestDriver8.clear();
        java.lang.Object obj17 = stackTestDriver0.push((java.lang.Object) stackTestDriver8);
        java.lang.Object obj19 = stackTestDriver0.push((java.lang.Object) (short) 100);
        java.lang.Object obj20 = stackTestDriver0.peek();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 10.0f + "'", obj4, 10.0f);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 1 + "'", obj12, 1);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (short) 100 + "'", obj19, (short) 100);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (short) 100 + "'", obj20, (short) 100);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test196");
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
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test197");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) 1);
        boolean boolean5 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) (-1.0d));
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 1 + "'", obj4, 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test198");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        boolean boolean4 = stackTestDriver0.isEmpty();
        int int5 = stackTestDriver0.size();
        int int6 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver7 = new experiment.util.StackTestDriver();
        boolean boolean8 = stackTestDriver7.isEmpty();
        boolean boolean9 = stackTestDriver7.isEmpty();
        java.lang.Object obj11 = stackTestDriver7.push((java.lang.Object) 10.0f);
        boolean boolean12 = stackTestDriver7.isEmpty();
        java.lang.Object obj14 = stackTestDriver7.push((java.lang.Object) (-1.0d));
        boolean boolean15 = stackTestDriver7.isEmpty();
        java.lang.Object obj16 = stackTestDriver0.push((java.lang.Object) stackTestDriver7);
        boolean boolean17 = stackTestDriver0.isEmpty();
        java.lang.Class<?> wildcardClass18 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 10.0f + "'", obj11, 10.0f);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1.0d) + "'", obj14, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test199");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        java.lang.Object obj3 = stackTestDriver0.push((java.lang.Object) 'a');
        java.lang.Object obj4 = stackTestDriver0.peek();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 'a' + "'", obj3, 'a');
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 'a' + "'", obj4, 'a');
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test200");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) 1);
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        boolean boolean7 = stackTestDriver6.isEmpty();
        int int8 = stackTestDriver6.size();
        int int9 = stackTestDriver6.size();
        boolean boolean10 = stackTestDriver6.isEmpty();
        java.lang.Object obj11 = stackTestDriver0.push((java.lang.Object) boolean10);
        boolean boolean12 = stackTestDriver0.isEmpty();
        boolean boolean13 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        boolean boolean16 = stackTestDriver15.isEmpty();
        int int17 = stackTestDriver15.size();
        java.lang.Object obj19 = stackTestDriver15.push((java.lang.Object) 1);
        boolean boolean20 = stackTestDriver15.isEmpty();
        java.lang.Object obj21 = stackTestDriver15.peek();
        java.lang.Object obj23 = stackTestDriver15.push((java.lang.Object) (short) 0);
        java.lang.Object obj24 = stackTestDriver0.push((java.lang.Object) stackTestDriver15);
        int int25 = stackTestDriver15.size();
        java.lang.Object obj26 = stackTestDriver15.pop();
        java.lang.Object obj27 = stackTestDriver15.pop();
        java.lang.Class<?> wildcardClass28 = stackTestDriver15.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 1 + "'", obj4, 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + true + "'", obj11, true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 1 + "'", obj19, 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 1 + "'", obj21, 1);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (short) 0 + "'", obj23, (short) 0);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + (short) 0 + "'", obj26, (short) 0);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 1 + "'", obj27, 1);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test201");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        boolean boolean2 = stackTestDriver0.isEmpty();
        int int3 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        boolean boolean5 = stackTestDriver4.isEmpty();
        int int6 = stackTestDriver4.size();
        java.lang.Object obj8 = stackTestDriver4.push((java.lang.Object) 1);
        stackTestDriver4.clear();
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        boolean boolean11 = stackTestDriver10.isEmpty();
        int int12 = stackTestDriver10.size();
        int int13 = stackTestDriver10.size();
        boolean boolean14 = stackTestDriver10.isEmpty();
        java.lang.Object obj15 = stackTestDriver4.push((java.lang.Object) boolean14);
        boolean boolean16 = stackTestDriver4.isEmpty();
        experiment.util.StackTestDriver stackTestDriver17 = new experiment.util.StackTestDriver();
        boolean boolean18 = stackTestDriver17.isEmpty();
        int int19 = stackTestDriver17.size();
        java.lang.Object obj21 = stackTestDriver17.push((java.lang.Object) 1);
        stackTestDriver17.clear();
        experiment.util.StackTestDriver stackTestDriver23 = new experiment.util.StackTestDriver();
        boolean boolean24 = stackTestDriver23.isEmpty();
        int int25 = stackTestDriver23.size();
        int int26 = stackTestDriver23.size();
        boolean boolean27 = stackTestDriver23.isEmpty();
        java.lang.Object obj28 = stackTestDriver17.push((java.lang.Object) boolean27);
        stackTestDriver17.clear();
        java.lang.Object obj30 = stackTestDriver4.push((java.lang.Object) stackTestDriver17);
        experiment.util.StackTestDriver stackTestDriver31 = new experiment.util.StackTestDriver();
        boolean boolean32 = stackTestDriver31.isEmpty();
        int int33 = stackTestDriver31.size();
        java.lang.Object obj35 = stackTestDriver31.push((java.lang.Object) 1);
        stackTestDriver31.clear();
        experiment.util.StackTestDriver stackTestDriver37 = new experiment.util.StackTestDriver();
        boolean boolean38 = stackTestDriver37.isEmpty();
        int int39 = stackTestDriver37.size();
        int int40 = stackTestDriver37.size();
        boolean boolean41 = stackTestDriver37.isEmpty();
        java.lang.Object obj42 = stackTestDriver31.push((java.lang.Object) boolean41);
        stackTestDriver31.clear();
        stackTestDriver31.clear();
        java.lang.Object obj46 = stackTestDriver31.push((java.lang.Object) (-1L));
        java.lang.Object obj47 = stackTestDriver31.peek();
        java.lang.Object obj49 = stackTestDriver31.push((java.lang.Object) '4');
        java.lang.Object obj50 = stackTestDriver31.pop();
        java.lang.Object obj51 = stackTestDriver31.peek();
        java.lang.Object obj52 = stackTestDriver4.push((java.lang.Object) stackTestDriver31);
        java.lang.Object obj53 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        stackTestDriver4.clear();
        int int55 = stackTestDriver4.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj56 = stackTestDriver4.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 1 + "'", obj8, 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + true + "'", obj15, true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 1 + "'", obj21, 1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + true + "'", obj28, true);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 1 + "'", obj35, 1);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + true + "'", obj42, true);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + (-1L) + "'", obj46, (-1L));
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + (-1L) + "'", obj47, (-1L));
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + '4' + "'", obj49, '4');
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + '4' + "'", obj50, '4');
        org.junit.Assert.assertEquals("'" + obj51 + "' != '" + (-1L) + "'", obj51, (-1L));
        org.junit.Assert.assertNotNull(obj52);
        org.junit.Assert.assertNotNull(obj53);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test202");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test203");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        boolean boolean4 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        boolean boolean6 = stackTestDriver5.isEmpty();
        int int7 = stackTestDriver5.size();
        java.lang.Object obj9 = stackTestDriver5.push((java.lang.Object) 1);
        boolean boolean10 = stackTestDriver5.isEmpty();
        java.lang.Object obj11 = stackTestDriver5.peek();
        java.lang.Object obj12 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        java.lang.Object obj13 = stackTestDriver0.pop();
        boolean boolean14 = stackTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 1 + "'", obj9, 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 1 + "'", obj11, 1);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test204");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) 1);
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        boolean boolean7 = stackTestDriver6.isEmpty();
        int int8 = stackTestDriver6.size();
        int int9 = stackTestDriver6.size();
        boolean boolean10 = stackTestDriver6.isEmpty();
        java.lang.Object obj11 = stackTestDriver0.push((java.lang.Object) boolean10);
        boolean boolean12 = stackTestDriver0.isEmpty();
        boolean boolean13 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        int int15 = stackTestDriver0.size();
        java.lang.Object obj16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = stackTestDriver0.push(obj16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 1 + "'", obj4, 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + true + "'", obj11, true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test205");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        boolean boolean2 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver3 = new experiment.util.StackTestDriver();
        boolean boolean4 = stackTestDriver3.isEmpty();
        int int5 = stackTestDriver3.size();
        java.lang.Object obj7 = stackTestDriver3.push((java.lang.Object) 1);
        stackTestDriver3.clear();
        experiment.util.StackTestDriver stackTestDriver9 = new experiment.util.StackTestDriver();
        boolean boolean10 = stackTestDriver9.isEmpty();
        int int11 = stackTestDriver9.size();
        int int12 = stackTestDriver9.size();
        boolean boolean13 = stackTestDriver9.isEmpty();
        java.lang.Object obj14 = stackTestDriver3.push((java.lang.Object) boolean13);
        boolean boolean15 = stackTestDriver3.isEmpty();
        java.lang.Object obj16 = stackTestDriver0.push((java.lang.Object) stackTestDriver3);
        int int17 = stackTestDriver3.size();
        java.lang.Object obj18 = stackTestDriver3.peek();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1 + "'", obj7, 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + true + "'", obj14, true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + true + "'", obj18, true);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test206");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) 1);
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        boolean boolean7 = stackTestDriver6.isEmpty();
        int int8 = stackTestDriver6.size();
        int int9 = stackTestDriver6.size();
        boolean boolean10 = stackTestDriver6.isEmpty();
        java.lang.Object obj11 = stackTestDriver0.push((java.lang.Object) boolean10);
        boolean boolean12 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver13 = new experiment.util.StackTestDriver();
        boolean boolean14 = stackTestDriver13.isEmpty();
        int int15 = stackTestDriver13.size();
        java.lang.Object obj17 = stackTestDriver13.push((java.lang.Object) 1);
        stackTestDriver13.clear();
        experiment.util.StackTestDriver stackTestDriver19 = new experiment.util.StackTestDriver();
        boolean boolean20 = stackTestDriver19.isEmpty();
        int int21 = stackTestDriver19.size();
        int int22 = stackTestDriver19.size();
        boolean boolean23 = stackTestDriver19.isEmpty();
        java.lang.Object obj24 = stackTestDriver13.push((java.lang.Object) boolean23);
        stackTestDriver13.clear();
        java.lang.Object obj26 = stackTestDriver0.push((java.lang.Object) stackTestDriver13);
        experiment.util.StackTestDriver stackTestDriver27 = new experiment.util.StackTestDriver();
        boolean boolean28 = stackTestDriver27.isEmpty();
        int int29 = stackTestDriver27.size();
        java.lang.Object obj31 = stackTestDriver27.push((java.lang.Object) 1);
        stackTestDriver27.clear();
        experiment.util.StackTestDriver stackTestDriver33 = new experiment.util.StackTestDriver();
        boolean boolean34 = stackTestDriver33.isEmpty();
        int int35 = stackTestDriver33.size();
        int int36 = stackTestDriver33.size();
        boolean boolean37 = stackTestDriver33.isEmpty();
        java.lang.Object obj38 = stackTestDriver27.push((java.lang.Object) boolean37);
        stackTestDriver27.clear();
        stackTestDriver27.clear();
        java.lang.Object obj42 = stackTestDriver27.push((java.lang.Object) (-1L));
        java.lang.Object obj43 = stackTestDriver27.peek();
        java.lang.Object obj45 = stackTestDriver27.push((java.lang.Object) '4');
        java.lang.Object obj46 = stackTestDriver27.pop();
        java.lang.Object obj47 = stackTestDriver27.peek();
        java.lang.Object obj48 = stackTestDriver0.push((java.lang.Object) stackTestDriver27);
        java.lang.Object obj49 = stackTestDriver27.peek();
        stackTestDriver27.clear();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 1 + "'", obj4, 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + true + "'", obj11, true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 1 + "'", obj17, 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + true + "'", obj24, true);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 1 + "'", obj31, 1);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + true + "'", obj38, true);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + (-1L) + "'", obj42, (-1L));
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + (-1L) + "'", obj43, (-1L));
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + '4' + "'", obj45, '4');
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + '4' + "'", obj46, '4');
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + (-1L) + "'", obj47, (-1L));
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + (-1L) + "'", obj49, (-1L));
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test207");
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
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test208");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        int int4 = stackTestDriver0.size();
        boolean boolean5 = stackTestDriver0.isEmpty();
        int int6 = stackTestDriver0.size();
        int int7 = stackTestDriver0.size();
        int int8 = stackTestDriver0.size();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test209");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) 1);
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        boolean boolean7 = stackTestDriver6.isEmpty();
        int int8 = stackTestDriver6.size();
        int int9 = stackTestDriver6.size();
        boolean boolean10 = stackTestDriver6.isEmpty();
        java.lang.Object obj11 = stackTestDriver0.push((java.lang.Object) boolean10);
        java.lang.Object obj12 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver13 = new experiment.util.StackTestDriver();
        boolean boolean14 = stackTestDriver13.isEmpty();
        int int15 = stackTestDriver13.size();
        java.lang.Object obj17 = stackTestDriver13.push((java.lang.Object) 1);
        stackTestDriver13.clear();
        experiment.util.StackTestDriver stackTestDriver19 = new experiment.util.StackTestDriver();
        boolean boolean20 = stackTestDriver19.isEmpty();
        int int21 = stackTestDriver19.size();
        int int22 = stackTestDriver19.size();
        boolean boolean23 = stackTestDriver19.isEmpty();
        java.lang.Object obj24 = stackTestDriver13.push((java.lang.Object) boolean23);
        boolean boolean25 = stackTestDriver13.isEmpty();
        java.lang.Object obj26 = stackTestDriver13.peek();
        java.lang.Object obj27 = stackTestDriver0.push((java.lang.Object) stackTestDriver13);
        java.lang.Object obj28 = stackTestDriver13.peek();
        boolean boolean29 = stackTestDriver13.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 1 + "'", obj4, 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + true + "'", obj11, true);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + true + "'", obj12, true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 1 + "'", obj17, 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + true + "'", obj24, true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + true + "'", obj26, true);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + true + "'", obj28, true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test210");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) 1);
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        boolean boolean7 = stackTestDriver6.isEmpty();
        int int8 = stackTestDriver6.size();
        int int9 = stackTestDriver6.size();
        boolean boolean10 = stackTestDriver6.isEmpty();
        java.lang.Object obj11 = stackTestDriver0.push((java.lang.Object) boolean10);
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 1 + "'", obj4, 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + true + "'", obj11, true);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test211");
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
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test212");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver3 = new experiment.util.StackTestDriver();
        boolean boolean4 = stackTestDriver3.isEmpty();
        int int5 = stackTestDriver3.size();
        java.lang.Object obj7 = stackTestDriver3.push((java.lang.Object) 1);
        stackTestDriver3.clear();
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) stackTestDriver3);
        int int10 = stackTestDriver3.size();
        java.lang.Class<?> wildcardClass11 = stackTestDriver3.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1 + "'", obj7, 1);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test213");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) 1);
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        boolean boolean7 = stackTestDriver6.isEmpty();
        int int8 = stackTestDriver6.size();
        int int9 = stackTestDriver6.size();
        boolean boolean10 = stackTestDriver6.isEmpty();
        java.lang.Object obj11 = stackTestDriver0.push((java.lang.Object) boolean10);
        boolean boolean12 = stackTestDriver0.isEmpty();
        boolean boolean13 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        boolean boolean16 = stackTestDriver15.isEmpty();
        int int17 = stackTestDriver15.size();
        java.lang.Object obj19 = stackTestDriver15.push((java.lang.Object) 1);
        boolean boolean20 = stackTestDriver15.isEmpty();
        java.lang.Object obj21 = stackTestDriver15.peek();
        java.lang.Object obj23 = stackTestDriver15.push((java.lang.Object) (short) 0);
        java.lang.Object obj24 = stackTestDriver0.push((java.lang.Object) stackTestDriver15);
        java.lang.Object obj25 = stackTestDriver15.peek();
        int int26 = stackTestDriver15.size();
        java.lang.Object obj27 = stackTestDriver15.peek();
        experiment.util.StackTestDriver stackTestDriver28 = new experiment.util.StackTestDriver();
        boolean boolean29 = stackTestDriver28.isEmpty();
        int int30 = stackTestDriver28.size();
        int int31 = stackTestDriver28.size();
        boolean boolean32 = stackTestDriver28.isEmpty();
        experiment.util.StackTestDriver stackTestDriver33 = new experiment.util.StackTestDriver();
        boolean boolean34 = stackTestDriver33.isEmpty();
        int int35 = stackTestDriver33.size();
        java.lang.Object obj37 = stackTestDriver33.push((java.lang.Object) 1);
        boolean boolean38 = stackTestDriver33.isEmpty();
        java.lang.Object obj39 = stackTestDriver33.peek();
        java.lang.Object obj40 = stackTestDriver28.push((java.lang.Object) stackTestDriver33);
        java.lang.Object obj41 = stackTestDriver33.peek();
        experiment.util.StackTestDriver stackTestDriver42 = new experiment.util.StackTestDriver();
        boolean boolean43 = stackTestDriver42.isEmpty();
        boolean boolean44 = stackTestDriver42.isEmpty();
        java.lang.Object obj46 = stackTestDriver42.push((java.lang.Object) 10.0f);
        experiment.util.StackTestDriver stackTestDriver47 = new experiment.util.StackTestDriver();
        boolean boolean48 = stackTestDriver47.isEmpty();
        int int49 = stackTestDriver47.size();
        experiment.util.StackTestDriver stackTestDriver50 = new experiment.util.StackTestDriver();
        boolean boolean51 = stackTestDriver50.isEmpty();
        int int52 = stackTestDriver50.size();
        java.lang.Object obj54 = stackTestDriver50.push((java.lang.Object) 1);
        stackTestDriver50.clear();
        java.lang.Object obj56 = stackTestDriver47.push((java.lang.Object) stackTestDriver50);
        int int57 = stackTestDriver50.size();
        stackTestDriver50.clear();
        java.lang.Object obj59 = stackTestDriver42.push((java.lang.Object) stackTestDriver50);
        java.lang.Class<?> wildcardClass60 = stackTestDriver50.getClass();
        java.lang.Object obj61 = stackTestDriver33.push((java.lang.Object) stackTestDriver50);
        java.lang.Object obj62 = stackTestDriver15.push((java.lang.Object) stackTestDriver33);
        java.lang.Class<?> wildcardClass63 = obj62.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 1 + "'", obj4, 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + true + "'", obj11, true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 1 + "'", obj19, 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 1 + "'", obj21, 1);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (short) 0 + "'", obj23, (short) 0);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (short) 0 + "'", obj25, (short) 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + (short) 0 + "'", obj27, (short) 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + 1 + "'", obj37, 1);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + 1 + "'", obj39, 1);
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + 1 + "'", obj41, 1);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + 10.0f + "'", obj46, 10.0f);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertEquals("'" + obj54 + "' != '" + 1 + "'", obj54, 1);
        org.junit.Assert.assertNotNull(obj56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(obj59);
        org.junit.Assert.assertNotNull(wildcardClass60);
        org.junit.Assert.assertNotNull(obj61);
        org.junit.Assert.assertNotNull(obj62);
        org.junit.Assert.assertNotNull(wildcardClass63);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test214");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        boolean boolean4 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        boolean boolean6 = stackTestDriver5.isEmpty();
        int int7 = stackTestDriver5.size();
        java.lang.Object obj9 = stackTestDriver5.push((java.lang.Object) 1);
        boolean boolean10 = stackTestDriver5.isEmpty();
        java.lang.Object obj11 = stackTestDriver5.peek();
        java.lang.Object obj12 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        experiment.util.StackTestDriver stackTestDriver13 = new experiment.util.StackTestDriver();
        boolean boolean14 = stackTestDriver13.isEmpty();
        boolean boolean15 = stackTestDriver13.isEmpty();
        experiment.util.StackTestDriver stackTestDriver16 = new experiment.util.StackTestDriver();
        boolean boolean17 = stackTestDriver16.isEmpty();
        int int18 = stackTestDriver16.size();
        java.lang.Object obj20 = stackTestDriver16.push((java.lang.Object) 1);
        stackTestDriver16.clear();
        experiment.util.StackTestDriver stackTestDriver22 = new experiment.util.StackTestDriver();
        boolean boolean23 = stackTestDriver22.isEmpty();
        int int24 = stackTestDriver22.size();
        int int25 = stackTestDriver22.size();
        boolean boolean26 = stackTestDriver22.isEmpty();
        java.lang.Object obj27 = stackTestDriver16.push((java.lang.Object) boolean26);
        boolean boolean28 = stackTestDriver16.isEmpty();
        java.lang.Object obj29 = stackTestDriver13.push((java.lang.Object) stackTestDriver16);
        stackTestDriver16.clear();
        stackTestDriver16.clear();
        java.lang.Object obj32 = stackTestDriver0.push((java.lang.Object) stackTestDriver16);
        experiment.util.StackTestDriver stackTestDriver33 = new experiment.util.StackTestDriver();
        boolean boolean34 = stackTestDriver33.isEmpty();
        int int35 = stackTestDriver33.size();
        int int36 = stackTestDriver33.size();
        boolean boolean37 = stackTestDriver33.isEmpty();
        experiment.util.StackTestDriver stackTestDriver38 = new experiment.util.StackTestDriver();
        boolean boolean39 = stackTestDriver38.isEmpty();
        int int40 = stackTestDriver38.size();
        java.lang.Object obj42 = stackTestDriver38.push((java.lang.Object) 1);
        boolean boolean43 = stackTestDriver38.isEmpty();
        java.lang.Object obj44 = stackTestDriver38.peek();
        java.lang.Object obj45 = stackTestDriver33.push((java.lang.Object) stackTestDriver38);
        int int46 = stackTestDriver38.size();
        int int47 = stackTestDriver38.size();
        java.lang.Object obj48 = stackTestDriver16.push((java.lang.Object) stackTestDriver38);
        stackTestDriver16.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj50 = stackTestDriver16.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 1 + "'", obj9, 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 1 + "'", obj11, 1);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 1 + "'", obj20, 1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + true + "'", obj27, true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + 1 + "'", obj42, 1);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + 1 + "'", obj44, 1);
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertNotNull(obj48);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test215");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        boolean boolean6 = stackTestDriver5.isEmpty();
        int int7 = stackTestDriver5.size();
        java.lang.Object obj9 = stackTestDriver5.push((java.lang.Object) 1);
        boolean boolean10 = stackTestDriver5.isEmpty();
        java.lang.Object obj11 = stackTestDriver5.peek();
        boolean boolean12 = stackTestDriver5.isEmpty();
        java.lang.Object obj13 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        int int14 = stackTestDriver5.size();
        java.lang.Class<?> wildcardClass15 = stackTestDriver5.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 1 + "'", obj9, 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 1 + "'", obj11, 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test216");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) 1);
        boolean boolean5 = stackTestDriver0.isEmpty();
        java.lang.Object obj6 = stackTestDriver0.peek();
        boolean boolean7 = stackTestDriver0.isEmpty();
        java.lang.Object obj8 = stackTestDriver0.peek();
        boolean boolean9 = stackTestDriver0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 1 + "'", obj4, 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1 + "'", obj6, 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 1 + "'", obj8, 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test217");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) 1);
        boolean boolean5 = stackTestDriver0.isEmpty();
        java.lang.Object obj6 = stackTestDriver0.peek();
        boolean boolean7 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 1 + "'", obj4, 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1 + "'", obj6, 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test218");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) 1);
        boolean boolean5 = stackTestDriver0.isEmpty();
        java.lang.Object obj6 = stackTestDriver0.peek();
        boolean boolean7 = stackTestDriver0.isEmpty();
        java.lang.Object obj8 = stackTestDriver0.peek();
        java.lang.Object obj9 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        boolean boolean11 = stackTestDriver10.isEmpty();
        int int12 = stackTestDriver10.size();
        int int13 = stackTestDriver10.size();
        boolean boolean14 = stackTestDriver10.isEmpty();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        boolean boolean16 = stackTestDriver15.isEmpty();
        int int17 = stackTestDriver15.size();
        java.lang.Object obj19 = stackTestDriver15.push((java.lang.Object) 1);
        boolean boolean20 = stackTestDriver15.isEmpty();
        java.lang.Object obj21 = stackTestDriver15.peek();
        java.lang.Object obj22 = stackTestDriver10.push((java.lang.Object) stackTestDriver15);
        java.lang.Object obj23 = stackTestDriver15.peek();
        java.lang.Object obj24 = stackTestDriver0.push((java.lang.Object) stackTestDriver15);
        experiment.util.StackTestDriver stackTestDriver25 = new experiment.util.StackTestDriver();
        boolean boolean26 = stackTestDriver25.isEmpty();
        int int27 = stackTestDriver25.size();
        experiment.util.StackTestDriver stackTestDriver28 = new experiment.util.StackTestDriver();
        boolean boolean29 = stackTestDriver28.isEmpty();
        int int30 = stackTestDriver28.size();
        java.lang.Object obj32 = stackTestDriver28.push((java.lang.Object) 1);
        stackTestDriver28.clear();
        java.lang.Object obj34 = stackTestDriver25.push((java.lang.Object) stackTestDriver28);
        java.lang.Object obj35 = stackTestDriver25.peek();
        java.lang.Object obj36 = stackTestDriver15.push((java.lang.Object) stackTestDriver25);
        java.lang.Class<?> wildcardClass37 = obj36.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 1 + "'", obj4, 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1 + "'", obj6, 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 1 + "'", obj8, 1);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 1 + "'", obj9, 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 1 + "'", obj19, 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 1 + "'", obj21, 1);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 1 + "'", obj23, 1);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 1 + "'", obj32, 1);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test219");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver3 = new experiment.util.StackTestDriver();
        boolean boolean4 = stackTestDriver3.isEmpty();
        int int5 = stackTestDriver3.size();
        stackTestDriver3.clear();
        boolean boolean7 = stackTestDriver3.isEmpty();
        boolean boolean8 = stackTestDriver3.isEmpty();
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) stackTestDriver3);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test220");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) 1);
        boolean boolean5 = stackTestDriver0.isEmpty();
        java.lang.Object obj6 = stackTestDriver0.peek();
        java.lang.Object obj7 = stackTestDriver0.peek();
        java.lang.Object obj8 = stackTestDriver0.peek();
        java.lang.Object obj9 = stackTestDriver0.peek();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 1 + "'", obj4, 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1 + "'", obj6, 1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1 + "'", obj7, 1);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 1 + "'", obj8, 1);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 1 + "'", obj9, 1);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test221");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) 1);
        boolean boolean5 = stackTestDriver0.isEmpty();
        java.lang.Object obj6 = stackTestDriver0.peek();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) (short) 0);
        boolean boolean9 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        int int11 = stackTestDriver0.size();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 1 + "'", obj4, 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1 + "'", obj6, 1);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (short) 0 + "'", obj8, (short) 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test222");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
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
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test223");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        boolean boolean4 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        boolean boolean6 = stackTestDriver5.isEmpty();
        int int7 = stackTestDriver5.size();
        java.lang.Object obj9 = stackTestDriver5.push((java.lang.Object) 1);
        boolean boolean10 = stackTestDriver5.isEmpty();
        java.lang.Object obj11 = stackTestDriver5.peek();
        java.lang.Object obj12 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        int int13 = stackTestDriver5.size();
        java.lang.Object obj14 = stackTestDriver5.pop();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        boolean boolean16 = stackTestDriver15.isEmpty();
        int int17 = stackTestDriver15.size();
        int int18 = stackTestDriver15.size();
        boolean boolean19 = stackTestDriver15.isEmpty();
        experiment.util.StackTestDriver stackTestDriver20 = new experiment.util.StackTestDriver();
        boolean boolean21 = stackTestDriver20.isEmpty();
        int int22 = stackTestDriver20.size();
        java.lang.Object obj24 = stackTestDriver20.push((java.lang.Object) 1);
        boolean boolean25 = stackTestDriver20.isEmpty();
        java.lang.Object obj26 = stackTestDriver20.peek();
        java.lang.Object obj27 = stackTestDriver15.push((java.lang.Object) stackTestDriver20);
        java.lang.Object obj28 = stackTestDriver20.peek();
        boolean boolean29 = stackTestDriver20.isEmpty();
        java.lang.Object obj30 = stackTestDriver5.push((java.lang.Object) boolean29);
        stackTestDriver5.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj32 = stackTestDriver5.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 1 + "'", obj9, 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 1 + "'", obj11, 1);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 1 + "'", obj14, 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 1 + "'", obj24, 1);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 1 + "'", obj26, 1);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + 1 + "'", obj28, 1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + false + "'", obj30, false);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test224");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) 1);
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        boolean boolean7 = stackTestDriver6.isEmpty();
        int int8 = stackTestDriver6.size();
        int int9 = stackTestDriver6.size();
        boolean boolean10 = stackTestDriver6.isEmpty();
        java.lang.Object obj11 = stackTestDriver0.push((java.lang.Object) boolean10);
        boolean boolean12 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver13 = new experiment.util.StackTestDriver();
        boolean boolean14 = stackTestDriver13.isEmpty();
        int int15 = stackTestDriver13.size();
        java.lang.Object obj17 = stackTestDriver13.push((java.lang.Object) 1);
        stackTestDriver13.clear();
        experiment.util.StackTestDriver stackTestDriver19 = new experiment.util.StackTestDriver();
        boolean boolean20 = stackTestDriver19.isEmpty();
        int int21 = stackTestDriver19.size();
        int int22 = stackTestDriver19.size();
        boolean boolean23 = stackTestDriver19.isEmpty();
        java.lang.Object obj24 = stackTestDriver13.push((java.lang.Object) boolean23);
        stackTestDriver13.clear();
        java.lang.Object obj26 = stackTestDriver0.push((java.lang.Object) stackTestDriver13);
        experiment.util.StackTestDriver stackTestDriver27 = new experiment.util.StackTestDriver();
        boolean boolean28 = stackTestDriver27.isEmpty();
        int int29 = stackTestDriver27.size();
        java.lang.Object obj31 = stackTestDriver27.push((java.lang.Object) 1);
        stackTestDriver27.clear();
        experiment.util.StackTestDriver stackTestDriver33 = new experiment.util.StackTestDriver();
        boolean boolean34 = stackTestDriver33.isEmpty();
        int int35 = stackTestDriver33.size();
        int int36 = stackTestDriver33.size();
        boolean boolean37 = stackTestDriver33.isEmpty();
        java.lang.Object obj38 = stackTestDriver27.push((java.lang.Object) boolean37);
        stackTestDriver27.clear();
        stackTestDriver27.clear();
        java.lang.Object obj42 = stackTestDriver27.push((java.lang.Object) (-1L));
        java.lang.Object obj43 = stackTestDriver27.peek();
        java.lang.Object obj45 = stackTestDriver27.push((java.lang.Object) '4');
        java.lang.Object obj46 = stackTestDriver27.pop();
        java.lang.Object obj47 = stackTestDriver27.peek();
        java.lang.Object obj48 = stackTestDriver0.push((java.lang.Object) stackTestDriver27);
        boolean boolean49 = stackTestDriver27.isEmpty();
        boolean boolean50 = stackTestDriver27.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 1 + "'", obj4, 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + true + "'", obj11, true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 1 + "'", obj17, 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + true + "'", obj24, true);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 1 + "'", obj31, 1);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + true + "'", obj38, true);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + (-1L) + "'", obj42, (-1L));
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + (-1L) + "'", obj43, (-1L));
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + '4' + "'", obj45, '4');
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + '4' + "'", obj46, '4');
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + (-1L) + "'", obj47, (-1L));
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test225");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        boolean boolean2 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver3 = new experiment.util.StackTestDriver();
        boolean boolean4 = stackTestDriver3.isEmpty();
        int int5 = stackTestDriver3.size();
        java.lang.Object obj7 = stackTestDriver3.push((java.lang.Object) 1);
        stackTestDriver3.clear();
        experiment.util.StackTestDriver stackTestDriver9 = new experiment.util.StackTestDriver();
        boolean boolean10 = stackTestDriver9.isEmpty();
        int int11 = stackTestDriver9.size();
        int int12 = stackTestDriver9.size();
        boolean boolean13 = stackTestDriver9.isEmpty();
        java.lang.Object obj14 = stackTestDriver3.push((java.lang.Object) boolean13);
        boolean boolean15 = stackTestDriver3.isEmpty();
        java.lang.Object obj16 = stackTestDriver0.push((java.lang.Object) stackTestDriver3);
        java.lang.Object obj17 = stackTestDriver0.peek();
        java.lang.Object obj18 = stackTestDriver0.peek();
        boolean boolean19 = stackTestDriver0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1 + "'", obj7, 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + true + "'", obj14, true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test226");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver3 = new experiment.util.StackTestDriver();
        boolean boolean4 = stackTestDriver3.isEmpty();
        int int5 = stackTestDriver3.size();
        java.lang.Object obj7 = stackTestDriver3.push((java.lang.Object) 1);
        stackTestDriver3.clear();
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) stackTestDriver3);
        stackTestDriver3.clear();
        int int11 = stackTestDriver3.size();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1 + "'", obj7, 1);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test227");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) 10.0f);
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        boolean boolean6 = stackTestDriver5.isEmpty();
        int int7 = stackTestDriver5.size();
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        boolean boolean9 = stackTestDriver8.isEmpty();
        int int10 = stackTestDriver8.size();
        java.lang.Object obj12 = stackTestDriver8.push((java.lang.Object) 1);
        stackTestDriver8.clear();
        java.lang.Object obj14 = stackTestDriver5.push((java.lang.Object) stackTestDriver8);
        int int15 = stackTestDriver8.size();
        stackTestDriver8.clear();
        java.lang.Object obj17 = stackTestDriver0.push((java.lang.Object) stackTestDriver8);
        java.lang.Object obj19 = stackTestDriver0.push((java.lang.Object) (short) 100);
        java.lang.Object obj20 = stackTestDriver0.pop();
        stackTestDriver0.clear();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 10.0f + "'", obj4, 10.0f);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 1 + "'", obj12, 1);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (short) 100 + "'", obj19, (short) 100);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (short) 100 + "'", obj20, (short) 100);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test228");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        boolean boolean4 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        boolean boolean6 = stackTestDriver0.isEmpty();
        int int7 = stackTestDriver0.size();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test229");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        boolean boolean4 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        boolean boolean6 = stackTestDriver5.isEmpty();
        int int7 = stackTestDriver5.size();
        java.lang.Object obj9 = stackTestDriver5.push((java.lang.Object) 1);
        boolean boolean10 = stackTestDriver5.isEmpty();
        java.lang.Object obj11 = stackTestDriver5.peek();
        java.lang.Object obj12 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        stackTestDriver5.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = stackTestDriver5.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 1 + "'", obj9, 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 1 + "'", obj11, 1);
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test230");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) 1);
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        boolean boolean7 = stackTestDriver6.isEmpty();
        int int8 = stackTestDriver6.size();
        int int9 = stackTestDriver6.size();
        boolean boolean10 = stackTestDriver6.isEmpty();
        java.lang.Object obj11 = stackTestDriver0.push((java.lang.Object) boolean10);
        java.lang.Object obj12 = stackTestDriver0.pop();
        java.lang.Class<?> wildcardClass13 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 1 + "'", obj4, 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + true + "'", obj11, true);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + true + "'", obj12, true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test231");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) 1);
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        boolean boolean7 = stackTestDriver6.isEmpty();
        int int8 = stackTestDriver6.size();
        int int9 = stackTestDriver6.size();
        boolean boolean10 = stackTestDriver6.isEmpty();
        java.lang.Object obj11 = stackTestDriver0.push((java.lang.Object) boolean10);
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver13 = new experiment.util.StackTestDriver();
        int int14 = stackTestDriver13.size();
        boolean boolean15 = stackTestDriver13.isEmpty();
        experiment.util.StackTestDriver stackTestDriver16 = new experiment.util.StackTestDriver();
        boolean boolean17 = stackTestDriver16.isEmpty();
        boolean boolean18 = stackTestDriver16.isEmpty();
        int int19 = stackTestDriver16.size();
        experiment.util.StackTestDriver stackTestDriver20 = new experiment.util.StackTestDriver();
        boolean boolean21 = stackTestDriver20.isEmpty();
        int int22 = stackTestDriver20.size();
        java.lang.Object obj24 = stackTestDriver20.push((java.lang.Object) 1);
        stackTestDriver20.clear();
        experiment.util.StackTestDriver stackTestDriver26 = new experiment.util.StackTestDriver();
        boolean boolean27 = stackTestDriver26.isEmpty();
        int int28 = stackTestDriver26.size();
        int int29 = stackTestDriver26.size();
        boolean boolean30 = stackTestDriver26.isEmpty();
        java.lang.Object obj31 = stackTestDriver20.push((java.lang.Object) boolean30);
        boolean boolean32 = stackTestDriver20.isEmpty();
        experiment.util.StackTestDriver stackTestDriver33 = new experiment.util.StackTestDriver();
        boolean boolean34 = stackTestDriver33.isEmpty();
        int int35 = stackTestDriver33.size();
        java.lang.Object obj37 = stackTestDriver33.push((java.lang.Object) 1);
        stackTestDriver33.clear();
        experiment.util.StackTestDriver stackTestDriver39 = new experiment.util.StackTestDriver();
        boolean boolean40 = stackTestDriver39.isEmpty();
        int int41 = stackTestDriver39.size();
        int int42 = stackTestDriver39.size();
        boolean boolean43 = stackTestDriver39.isEmpty();
        java.lang.Object obj44 = stackTestDriver33.push((java.lang.Object) boolean43);
        stackTestDriver33.clear();
        java.lang.Object obj46 = stackTestDriver20.push((java.lang.Object) stackTestDriver33);
        experiment.util.StackTestDriver stackTestDriver47 = new experiment.util.StackTestDriver();
        boolean boolean48 = stackTestDriver47.isEmpty();
        int int49 = stackTestDriver47.size();
        java.lang.Object obj51 = stackTestDriver47.push((java.lang.Object) 1);
        stackTestDriver47.clear();
        experiment.util.StackTestDriver stackTestDriver53 = new experiment.util.StackTestDriver();
        boolean boolean54 = stackTestDriver53.isEmpty();
        int int55 = stackTestDriver53.size();
        int int56 = stackTestDriver53.size();
        boolean boolean57 = stackTestDriver53.isEmpty();
        java.lang.Object obj58 = stackTestDriver47.push((java.lang.Object) boolean57);
        stackTestDriver47.clear();
        stackTestDriver47.clear();
        java.lang.Object obj62 = stackTestDriver47.push((java.lang.Object) (-1L));
        java.lang.Object obj63 = stackTestDriver47.peek();
        java.lang.Object obj65 = stackTestDriver47.push((java.lang.Object) '4');
        java.lang.Object obj66 = stackTestDriver47.pop();
        java.lang.Object obj67 = stackTestDriver47.peek();
        java.lang.Object obj68 = stackTestDriver20.push((java.lang.Object) stackTestDriver47);
        java.lang.Object obj69 = stackTestDriver16.push((java.lang.Object) stackTestDriver20);
        java.lang.Object obj70 = stackTestDriver13.push(obj69);
        boolean boolean71 = stackTestDriver13.isEmpty();
        java.lang.Object obj72 = stackTestDriver13.pop();
        java.lang.Object obj73 = stackTestDriver0.push(obj72);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 1 + "'", obj4, 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + true + "'", obj11, true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 1 + "'", obj24, 1);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + true + "'", obj31, true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + 1 + "'", obj37, 1);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + true + "'", obj44, true);
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertEquals("'" + obj51 + "' != '" + 1 + "'", obj51, 1);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertEquals("'" + obj58 + "' != '" + true + "'", obj58, true);
        org.junit.Assert.assertEquals("'" + obj62 + "' != '" + (-1L) + "'", obj62, (-1L));
        org.junit.Assert.assertEquals("'" + obj63 + "' != '" + (-1L) + "'", obj63, (-1L));
        org.junit.Assert.assertEquals("'" + obj65 + "' != '" + '4' + "'", obj65, '4');
        org.junit.Assert.assertEquals("'" + obj66 + "' != '" + '4' + "'", obj66, '4');
        org.junit.Assert.assertEquals("'" + obj67 + "' != '" + (-1L) + "'", obj67, (-1L));
        org.junit.Assert.assertNotNull(obj68);
        org.junit.Assert.assertNotNull(obj69);
        org.junit.Assert.assertNotNull(obj70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(obj72);
        org.junit.Assert.assertNotNull(obj73);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test232");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) 1);
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        boolean boolean7 = stackTestDriver6.isEmpty();
        int int8 = stackTestDriver6.size();
        int int9 = stackTestDriver6.size();
        boolean boolean10 = stackTestDriver6.isEmpty();
        java.lang.Object obj11 = stackTestDriver0.push((java.lang.Object) boolean10);
        boolean boolean12 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver13 = new experiment.util.StackTestDriver();
        boolean boolean14 = stackTestDriver13.isEmpty();
        int int15 = stackTestDriver13.size();
        java.lang.Object obj17 = stackTestDriver13.push((java.lang.Object) 1);
        stackTestDriver13.clear();
        experiment.util.StackTestDriver stackTestDriver19 = new experiment.util.StackTestDriver();
        boolean boolean20 = stackTestDriver19.isEmpty();
        int int21 = stackTestDriver19.size();
        int int22 = stackTestDriver19.size();
        boolean boolean23 = stackTestDriver19.isEmpty();
        java.lang.Object obj24 = stackTestDriver13.push((java.lang.Object) boolean23);
        stackTestDriver13.clear();
        java.lang.Object obj26 = stackTestDriver0.push((java.lang.Object) stackTestDriver13);
        experiment.util.StackTestDriver stackTestDriver27 = new experiment.util.StackTestDriver();
        boolean boolean28 = stackTestDriver27.isEmpty();
        int int29 = stackTestDriver27.size();
        java.lang.Object obj31 = stackTestDriver27.push((java.lang.Object) 1);
        stackTestDriver27.clear();
        experiment.util.StackTestDriver stackTestDriver33 = new experiment.util.StackTestDriver();
        boolean boolean34 = stackTestDriver33.isEmpty();
        int int35 = stackTestDriver33.size();
        int int36 = stackTestDriver33.size();
        boolean boolean37 = stackTestDriver33.isEmpty();
        java.lang.Object obj38 = stackTestDriver27.push((java.lang.Object) boolean37);
        stackTestDriver27.clear();
        stackTestDriver27.clear();
        java.lang.Object obj42 = stackTestDriver27.push((java.lang.Object) (-1L));
        java.lang.Object obj43 = stackTestDriver27.peek();
        java.lang.Object obj45 = stackTestDriver27.push((java.lang.Object) '4');
        java.lang.Object obj46 = stackTestDriver27.pop();
        java.lang.Object obj47 = stackTestDriver27.peek();
        java.lang.Object obj48 = stackTestDriver0.push((java.lang.Object) stackTestDriver27);
        java.lang.Object obj49 = stackTestDriver27.peek();
        java.lang.Class<?> wildcardClass50 = stackTestDriver27.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 1 + "'", obj4, 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + true + "'", obj11, true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 1 + "'", obj17, 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + true + "'", obj24, true);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 1 + "'", obj31, 1);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + true + "'", obj38, true);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + (-1L) + "'", obj42, (-1L));
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + (-1L) + "'", obj43, (-1L));
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + '4' + "'", obj45, '4');
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + '4' + "'", obj46, '4');
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + (-1L) + "'", obj47, (-1L));
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + (-1L) + "'", obj49, (-1L));
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test233");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) 1);
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        boolean boolean7 = stackTestDriver6.isEmpty();
        int int8 = stackTestDriver6.size();
        int int9 = stackTestDriver6.size();
        boolean boolean10 = stackTestDriver6.isEmpty();
        java.lang.Object obj11 = stackTestDriver0.push((java.lang.Object) boolean10);
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        java.lang.Object obj15 = stackTestDriver0.push((java.lang.Object) (byte) 10);
        java.lang.Object obj17 = stackTestDriver0.push((java.lang.Object) 0);
        java.lang.Object obj18 = stackTestDriver0.pop();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 1 + "'", obj4, 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + true + "'", obj11, true);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (byte) 10 + "'", obj15, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 0 + "'", obj17, 0);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 0 + "'", obj18, 0);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test234");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test235");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) 1);
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        boolean boolean7 = stackTestDriver6.isEmpty();
        int int8 = stackTestDriver6.size();
        int int9 = stackTestDriver6.size();
        boolean boolean10 = stackTestDriver6.isEmpty();
        java.lang.Object obj11 = stackTestDriver0.push((java.lang.Object) boolean10);
        boolean boolean12 = stackTestDriver0.isEmpty();
        boolean boolean13 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        boolean boolean16 = stackTestDriver15.isEmpty();
        int int17 = stackTestDriver15.size();
        java.lang.Object obj19 = stackTestDriver15.push((java.lang.Object) 1);
        boolean boolean20 = stackTestDriver15.isEmpty();
        java.lang.Object obj21 = stackTestDriver15.peek();
        java.lang.Object obj23 = stackTestDriver15.push((java.lang.Object) (short) 0);
        java.lang.Object obj24 = stackTestDriver0.push((java.lang.Object) stackTestDriver15);
        java.lang.Object obj25 = stackTestDriver0.pop();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 1 + "'", obj4, 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + true + "'", obj11, true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 1 + "'", obj19, 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 1 + "'", obj21, 1);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (short) 0 + "'", obj23, (short) 0);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(obj25);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test236");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) 1);
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        boolean boolean7 = stackTestDriver6.isEmpty();
        int int8 = stackTestDriver6.size();
        int int9 = stackTestDriver6.size();
        boolean boolean10 = stackTestDriver6.isEmpty();
        java.lang.Object obj11 = stackTestDriver0.push((java.lang.Object) boolean10);
        java.lang.Object obj12 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver13 = new experiment.util.StackTestDriver();
        boolean boolean14 = stackTestDriver13.isEmpty();
        int int15 = stackTestDriver13.size();
        java.lang.Object obj17 = stackTestDriver13.push((java.lang.Object) 1);
        stackTestDriver13.clear();
        experiment.util.StackTestDriver stackTestDriver19 = new experiment.util.StackTestDriver();
        boolean boolean20 = stackTestDriver19.isEmpty();
        int int21 = stackTestDriver19.size();
        int int22 = stackTestDriver19.size();
        boolean boolean23 = stackTestDriver19.isEmpty();
        java.lang.Object obj24 = stackTestDriver13.push((java.lang.Object) boolean23);
        boolean boolean25 = stackTestDriver13.isEmpty();
        java.lang.Object obj26 = stackTestDriver13.peek();
        java.lang.Object obj27 = stackTestDriver0.push((java.lang.Object) stackTestDriver13);
        boolean boolean28 = stackTestDriver0.isEmpty();
        java.lang.Object obj29 = stackTestDriver0.pop();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 1 + "'", obj4, 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + true + "'", obj11, true);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + true + "'", obj12, true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 1 + "'", obj17, 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + true + "'", obj24, true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + true + "'", obj26, true);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(obj29);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test237");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) 10.0f);
        boolean boolean5 = stackTestDriver0.isEmpty();
        java.lang.Object obj6 = stackTestDriver0.peek();
        int int7 = stackTestDriver0.size();
        int int8 = stackTestDriver0.size();
        java.lang.Object obj9 = stackTestDriver0.peek();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 10.0f + "'", obj4, 10.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 10.0f + "'", obj6, 10.0f);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 10.0f + "'", obj9, 10.0f);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test238");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) 1);
        boolean boolean5 = stackTestDriver0.isEmpty();
        java.lang.Object obj6 = stackTestDriver0.peek();
        boolean boolean7 = stackTestDriver0.isEmpty();
        java.lang.Object obj8 = stackTestDriver0.pop();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 1 + "'", obj4, 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1 + "'", obj6, 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 1 + "'", obj8, 1);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test239");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) 1);
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        boolean boolean7 = stackTestDriver6.isEmpty();
        int int8 = stackTestDriver6.size();
        int int9 = stackTestDriver6.size();
        boolean boolean10 = stackTestDriver6.isEmpty();
        java.lang.Object obj11 = stackTestDriver0.push((java.lang.Object) boolean10);
        boolean boolean12 = stackTestDriver0.isEmpty();
        java.lang.Object obj13 = stackTestDriver0.peek();
        boolean boolean14 = stackTestDriver0.isEmpty();
        int int15 = stackTestDriver0.size();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 1 + "'", obj4, 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + true + "'", obj11, true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + true + "'", obj13, true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test240");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) 1);
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        boolean boolean7 = stackTestDriver6.isEmpty();
        int int8 = stackTestDriver6.size();
        int int9 = stackTestDriver6.size();
        boolean boolean10 = stackTestDriver6.isEmpty();
        java.lang.Object obj11 = stackTestDriver0.push((java.lang.Object) boolean10);
        boolean boolean12 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver13 = new experiment.util.StackTestDriver();
        boolean boolean14 = stackTestDriver13.isEmpty();
        int int15 = stackTestDriver13.size();
        java.lang.Object obj17 = stackTestDriver13.push((java.lang.Object) 1);
        stackTestDriver13.clear();
        experiment.util.StackTestDriver stackTestDriver19 = new experiment.util.StackTestDriver();
        boolean boolean20 = stackTestDriver19.isEmpty();
        int int21 = stackTestDriver19.size();
        int int22 = stackTestDriver19.size();
        boolean boolean23 = stackTestDriver19.isEmpty();
        java.lang.Object obj24 = stackTestDriver13.push((java.lang.Object) boolean23);
        stackTestDriver13.clear();
        java.lang.Object obj26 = stackTestDriver0.push((java.lang.Object) stackTestDriver13);
        experiment.util.StackTestDriver stackTestDriver27 = new experiment.util.StackTestDriver();
        boolean boolean28 = stackTestDriver27.isEmpty();
        int int29 = stackTestDriver27.size();
        java.lang.Object obj31 = stackTestDriver27.push((java.lang.Object) 1);
        stackTestDriver27.clear();
        experiment.util.StackTestDriver stackTestDriver33 = new experiment.util.StackTestDriver();
        boolean boolean34 = stackTestDriver33.isEmpty();
        int int35 = stackTestDriver33.size();
        int int36 = stackTestDriver33.size();
        boolean boolean37 = stackTestDriver33.isEmpty();
        java.lang.Object obj38 = stackTestDriver27.push((java.lang.Object) boolean37);
        stackTestDriver27.clear();
        stackTestDriver27.clear();
        java.lang.Object obj42 = stackTestDriver27.push((java.lang.Object) (-1L));
        java.lang.Object obj43 = stackTestDriver27.peek();
        java.lang.Object obj45 = stackTestDriver27.push((java.lang.Object) '4');
        java.lang.Object obj46 = stackTestDriver27.pop();
        java.lang.Object obj47 = stackTestDriver27.peek();
        java.lang.Object obj48 = stackTestDriver0.push((java.lang.Object) stackTestDriver27);
        experiment.util.StackTestDriver stackTestDriver49 = new experiment.util.StackTestDriver();
        boolean boolean50 = stackTestDriver49.isEmpty();
        boolean boolean51 = stackTestDriver49.isEmpty();
        java.lang.Object obj53 = stackTestDriver49.push((java.lang.Object) 10.0f);
        experiment.util.StackTestDriver stackTestDriver54 = new experiment.util.StackTestDriver();
        boolean boolean55 = stackTestDriver54.isEmpty();
        int int56 = stackTestDriver54.size();
        experiment.util.StackTestDriver stackTestDriver57 = new experiment.util.StackTestDriver();
        boolean boolean58 = stackTestDriver57.isEmpty();
        int int59 = stackTestDriver57.size();
        java.lang.Object obj61 = stackTestDriver57.push((java.lang.Object) 1);
        stackTestDriver57.clear();
        java.lang.Object obj63 = stackTestDriver54.push((java.lang.Object) stackTestDriver57);
        int int64 = stackTestDriver57.size();
        stackTestDriver57.clear();
        java.lang.Object obj66 = stackTestDriver49.push((java.lang.Object) stackTestDriver57);
        java.lang.Object obj67 = stackTestDriver0.push((java.lang.Object) stackTestDriver49);
        experiment.util.StackTestDriver stackTestDriver68 = new experiment.util.StackTestDriver();
        boolean boolean69 = stackTestDriver68.isEmpty();
        java.lang.Object obj70 = stackTestDriver0.push((java.lang.Object) boolean69);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 1 + "'", obj4, 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + true + "'", obj11, true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 1 + "'", obj17, 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + true + "'", obj24, true);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 1 + "'", obj31, 1);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + true + "'", obj38, true);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + (-1L) + "'", obj42, (-1L));
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + (-1L) + "'", obj43, (-1L));
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + '4' + "'", obj45, '4');
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + '4' + "'", obj46, '4');
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + (-1L) + "'", obj47, (-1L));
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertEquals("'" + obj53 + "' != '" + 10.0f + "'", obj53, 10.0f);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertEquals("'" + obj61 + "' != '" + 1 + "'", obj61, 1);
        org.junit.Assert.assertNotNull(obj63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertNotNull(obj66);
        org.junit.Assert.assertNotNull(obj67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertEquals("'" + obj70 + "' != '" + true + "'", obj70, true);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test241");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) 1);
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        boolean boolean7 = stackTestDriver6.isEmpty();
        int int8 = stackTestDriver6.size();
        int int9 = stackTestDriver6.size();
        boolean boolean10 = stackTestDriver6.isEmpty();
        java.lang.Object obj11 = stackTestDriver0.push((java.lang.Object) boolean10);
        int int12 = stackTestDriver0.size();
        boolean boolean13 = stackTestDriver0.isEmpty();
        int int14 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        boolean boolean16 = stackTestDriver15.isEmpty();
        boolean boolean17 = stackTestDriver15.isEmpty();
        java.lang.Object obj19 = stackTestDriver15.push((java.lang.Object) 10.0f);
        boolean boolean20 = stackTestDriver15.isEmpty();
        java.lang.Object obj22 = stackTestDriver15.push((java.lang.Object) (-1.0d));
        java.lang.Object obj23 = stackTestDriver15.pop();
        java.lang.Object obj24 = stackTestDriver0.push((java.lang.Object) stackTestDriver15);
        java.lang.Object obj25 = stackTestDriver0.peek();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 1 + "'", obj4, 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + true + "'", obj11, true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 10.0f + "'", obj19, 10.0f);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (-1.0d) + "'", obj22, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (-1.0d) + "'", obj23, (-1.0d));
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(obj25);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test242");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver3 = new experiment.util.StackTestDriver();
        boolean boolean4 = stackTestDriver3.isEmpty();
        int int5 = stackTestDriver3.size();
        java.lang.Object obj7 = stackTestDriver3.push((java.lang.Object) 1);
        stackTestDriver3.clear();
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) stackTestDriver3);
        int int10 = stackTestDriver3.size();
        boolean boolean11 = stackTestDriver3.isEmpty();
        boolean boolean12 = stackTestDriver3.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1 + "'", obj7, 1);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test243");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) 10.0f);
        boolean boolean5 = stackTestDriver0.isEmpty();
        java.lang.Object obj6 = stackTestDriver0.peek();
        int int7 = stackTestDriver0.size();
        stackTestDriver0.clear();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 10.0f + "'", obj4, 10.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 10.0f + "'", obj6, 10.0f);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test244");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) 1);
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        boolean boolean7 = stackTestDriver6.isEmpty();
        int int8 = stackTestDriver6.size();
        int int9 = stackTestDriver6.size();
        boolean boolean10 = stackTestDriver6.isEmpty();
        java.lang.Object obj11 = stackTestDriver0.push((java.lang.Object) boolean10);
        java.lang.Object obj12 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver13 = new experiment.util.StackTestDriver();
        boolean boolean14 = stackTestDriver13.isEmpty();
        int int15 = stackTestDriver13.size();
        java.lang.Object obj17 = stackTestDriver13.push((java.lang.Object) 1);
        stackTestDriver13.clear();
        experiment.util.StackTestDriver stackTestDriver19 = new experiment.util.StackTestDriver();
        boolean boolean20 = stackTestDriver19.isEmpty();
        int int21 = stackTestDriver19.size();
        int int22 = stackTestDriver19.size();
        boolean boolean23 = stackTestDriver19.isEmpty();
        java.lang.Object obj24 = stackTestDriver13.push((java.lang.Object) boolean23);
        boolean boolean25 = stackTestDriver13.isEmpty();
        java.lang.Object obj26 = stackTestDriver13.peek();
        java.lang.Object obj27 = stackTestDriver0.push((java.lang.Object) stackTestDriver13);
        experiment.util.StackTestDriver stackTestDriver28 = new experiment.util.StackTestDriver();
        boolean boolean29 = stackTestDriver28.isEmpty();
        int int30 = stackTestDriver28.size();
        int int31 = stackTestDriver28.size();
        boolean boolean32 = stackTestDriver28.isEmpty();
        experiment.util.StackTestDriver stackTestDriver33 = new experiment.util.StackTestDriver();
        boolean boolean34 = stackTestDriver33.isEmpty();
        int int35 = stackTestDriver33.size();
        java.lang.Object obj37 = stackTestDriver33.push((java.lang.Object) 1);
        boolean boolean38 = stackTestDriver33.isEmpty();
        java.lang.Object obj39 = stackTestDriver33.peek();
        java.lang.Object obj40 = stackTestDriver28.push((java.lang.Object) stackTestDriver33);
        java.lang.Object obj41 = stackTestDriver28.pop();
        java.lang.Object obj43 = stackTestDriver28.push((java.lang.Object) 10.0d);
        stackTestDriver28.clear();
        int int45 = stackTestDriver28.size();
        java.lang.Object obj46 = stackTestDriver0.push((java.lang.Object) int45);
        java.lang.Object obj47 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver48 = new experiment.util.StackTestDriver();
        boolean boolean49 = stackTestDriver48.isEmpty();
        boolean boolean50 = stackTestDriver48.isEmpty();
        java.lang.Object obj52 = stackTestDriver48.push((java.lang.Object) 10.0f);
        experiment.util.StackTestDriver stackTestDriver53 = new experiment.util.StackTestDriver();
        boolean boolean54 = stackTestDriver53.isEmpty();
        int int55 = stackTestDriver53.size();
        experiment.util.StackTestDriver stackTestDriver56 = new experiment.util.StackTestDriver();
        boolean boolean57 = stackTestDriver56.isEmpty();
        int int58 = stackTestDriver56.size();
        java.lang.Object obj60 = stackTestDriver56.push((java.lang.Object) 1);
        stackTestDriver56.clear();
        java.lang.Object obj62 = stackTestDriver53.push((java.lang.Object) stackTestDriver56);
        int int63 = stackTestDriver56.size();
        stackTestDriver56.clear();
        java.lang.Object obj65 = stackTestDriver48.push((java.lang.Object) stackTestDriver56);
        java.lang.Object obj67 = stackTestDriver48.push((java.lang.Object) (short) 100);
        int int68 = stackTestDriver48.size();
        java.lang.Object obj69 = stackTestDriver48.peek();
        java.lang.Object obj70 = stackTestDriver0.push(obj69);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 1 + "'", obj4, 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + true + "'", obj11, true);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + true + "'", obj12, true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 1 + "'", obj17, 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + true + "'", obj24, true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + true + "'", obj26, true);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + 1 + "'", obj37, 1);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + 1 + "'", obj39, 1);
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + 10.0d + "'", obj43, 10.0d);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + 0 + "'", obj46, 0);
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + 0 + "'", obj47, 0);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertEquals("'" + obj52 + "' != '" + 10.0f + "'", obj52, 10.0f);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertEquals("'" + obj60 + "' != '" + 1 + "'", obj60, 1);
        org.junit.Assert.assertNotNull(obj62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNotNull(obj65);
        org.junit.Assert.assertEquals("'" + obj67 + "' != '" + (short) 100 + "'", obj67, (short) 100);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 3 + "'", int68 == 3);
        org.junit.Assert.assertEquals("'" + obj69 + "' != '" + (short) 100 + "'", obj69, (short) 100);
        org.junit.Assert.assertEquals("'" + obj70 + "' != '" + (short) 100 + "'", obj70, (short) 100);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test245");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) 1);
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        boolean boolean7 = stackTestDriver6.isEmpty();
        int int8 = stackTestDriver6.size();
        int int9 = stackTestDriver6.size();
        boolean boolean10 = stackTestDriver6.isEmpty();
        java.lang.Object obj11 = stackTestDriver0.push((java.lang.Object) boolean10);
        boolean boolean12 = stackTestDriver0.isEmpty();
        boolean boolean13 = stackTestDriver0.isEmpty();
        int int14 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        boolean boolean16 = stackTestDriver15.isEmpty();
        boolean boolean17 = stackTestDriver15.isEmpty();
        experiment.util.StackTestDriver stackTestDriver18 = new experiment.util.StackTestDriver();
        boolean boolean19 = stackTestDriver18.isEmpty();
        int int20 = stackTestDriver18.size();
        java.lang.Object obj22 = stackTestDriver18.push((java.lang.Object) 1);
        stackTestDriver18.clear();
        experiment.util.StackTestDriver stackTestDriver24 = new experiment.util.StackTestDriver();
        boolean boolean25 = stackTestDriver24.isEmpty();
        int int26 = stackTestDriver24.size();
        int int27 = stackTestDriver24.size();
        boolean boolean28 = stackTestDriver24.isEmpty();
        java.lang.Object obj29 = stackTestDriver18.push((java.lang.Object) boolean28);
        boolean boolean30 = stackTestDriver18.isEmpty();
        java.lang.Object obj31 = stackTestDriver15.push((java.lang.Object) stackTestDriver18);
        int int32 = stackTestDriver18.size();
        java.lang.Object obj33 = stackTestDriver18.pop();
        java.lang.Class<?> wildcardClass34 = stackTestDriver18.getClass();
        java.lang.Object obj35 = stackTestDriver0.push((java.lang.Object) stackTestDriver18);
        int int36 = stackTestDriver18.size();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 1 + "'", obj4, 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + true + "'", obj11, true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 1 + "'", obj22, 1);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + true + "'", obj29, true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + true + "'", obj33, true);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test246");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver3 = new experiment.util.StackTestDriver();
        boolean boolean4 = stackTestDriver3.isEmpty();
        int int5 = stackTestDriver3.size();
        java.lang.Object obj7 = stackTestDriver3.push((java.lang.Object) 1);
        stackTestDriver3.clear();
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) stackTestDriver3);
        int int10 = stackTestDriver3.size();
        stackTestDriver3.clear();
        boolean boolean12 = stackTestDriver3.isEmpty();
        boolean boolean13 = stackTestDriver3.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1 + "'", obj7, 1);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test247");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        boolean boolean2 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver3 = new experiment.util.StackTestDriver();
        boolean boolean4 = stackTestDriver3.isEmpty();
        int int5 = stackTestDriver3.size();
        java.lang.Object obj7 = stackTestDriver3.push((java.lang.Object) 1);
        stackTestDriver3.clear();
        experiment.util.StackTestDriver stackTestDriver9 = new experiment.util.StackTestDriver();
        boolean boolean10 = stackTestDriver9.isEmpty();
        int int11 = stackTestDriver9.size();
        int int12 = stackTestDriver9.size();
        boolean boolean13 = stackTestDriver9.isEmpty();
        java.lang.Object obj14 = stackTestDriver3.push((java.lang.Object) boolean13);
        boolean boolean15 = stackTestDriver3.isEmpty();
        java.lang.Object obj16 = stackTestDriver0.push((java.lang.Object) stackTestDriver3);
        boolean boolean17 = stackTestDriver0.isEmpty();
        int int18 = stackTestDriver0.size();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1 + "'", obj7, 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + true + "'", obj14, true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test248");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) 10.0f);
        boolean boolean5 = stackTestDriver0.isEmpty();
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) (-1.0d));
        int int8 = stackTestDriver0.size();
        java.lang.Class<?> wildcardClass9 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 10.0f + "'", obj4, 10.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test249");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        boolean boolean4 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        boolean boolean6 = stackTestDriver5.isEmpty();
        int int7 = stackTestDriver5.size();
        java.lang.Object obj9 = stackTestDriver5.push((java.lang.Object) 1);
        boolean boolean10 = stackTestDriver5.isEmpty();
        java.lang.Object obj11 = stackTestDriver5.peek();
        java.lang.Object obj12 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        int int13 = stackTestDriver5.size();
        java.lang.Object obj14 = stackTestDriver5.pop();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        boolean boolean16 = stackTestDriver15.isEmpty();
        int int17 = stackTestDriver15.size();
        int int18 = stackTestDriver15.size();
        boolean boolean19 = stackTestDriver15.isEmpty();
        experiment.util.StackTestDriver stackTestDriver20 = new experiment.util.StackTestDriver();
        boolean boolean21 = stackTestDriver20.isEmpty();
        int int22 = stackTestDriver20.size();
        java.lang.Object obj24 = stackTestDriver20.push((java.lang.Object) 1);
        boolean boolean25 = stackTestDriver20.isEmpty();
        java.lang.Object obj26 = stackTestDriver20.peek();
        java.lang.Object obj27 = stackTestDriver15.push((java.lang.Object) stackTestDriver20);
        java.lang.Object obj28 = stackTestDriver20.peek();
        boolean boolean29 = stackTestDriver20.isEmpty();
        java.lang.Object obj30 = stackTestDriver5.push((java.lang.Object) boolean29);
        experiment.util.StackTestDriver stackTestDriver31 = new experiment.util.StackTestDriver();
        boolean boolean32 = stackTestDriver31.isEmpty();
        int int33 = stackTestDriver31.size();
        java.lang.Object obj35 = stackTestDriver31.push((java.lang.Object) 1);
        boolean boolean36 = stackTestDriver31.isEmpty();
        java.lang.Object obj37 = stackTestDriver31.peek();
        java.lang.Object obj39 = stackTestDriver31.push((java.lang.Object) (short) 0);
        java.lang.Object obj40 = stackTestDriver31.pop();
        java.lang.Object obj41 = stackTestDriver31.peek();
        java.lang.Object obj42 = stackTestDriver5.push((java.lang.Object) stackTestDriver31);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 1 + "'", obj9, 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 1 + "'", obj11, 1);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 1 + "'", obj14, 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 1 + "'", obj24, 1);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 1 + "'", obj26, 1);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + 1 + "'", obj28, 1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + false + "'", obj30, false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 1 + "'", obj35, 1);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + 1 + "'", obj37, 1);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + (short) 0 + "'", obj39, (short) 0);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + (short) 0 + "'", obj40, (short) 0);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + 1 + "'", obj41, 1);
        org.junit.Assert.assertNotNull(obj42);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test250");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) 10.0f);
        stackTestDriver0.clear();
        boolean boolean6 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 10.0f + "'", obj4, 10.0f);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test251");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        boolean boolean4 = stackTestDriver0.isEmpty();
        java.lang.Class<?> wildcardClass5 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test252");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        boolean boolean4 = stackTestDriver0.isEmpty();
        int int5 = stackTestDriver0.size();
        int int6 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver7 = new experiment.util.StackTestDriver();
        boolean boolean8 = stackTestDriver7.isEmpty();
        int int9 = stackTestDriver7.size();
        java.lang.Object obj11 = stackTestDriver7.push((java.lang.Object) 1);
        stackTestDriver7.clear();
        experiment.util.StackTestDriver stackTestDriver13 = new experiment.util.StackTestDriver();
        boolean boolean14 = stackTestDriver13.isEmpty();
        int int15 = stackTestDriver13.size();
        int int16 = stackTestDriver13.size();
        boolean boolean17 = stackTestDriver13.isEmpty();
        java.lang.Object obj18 = stackTestDriver7.push((java.lang.Object) boolean17);
        boolean boolean19 = stackTestDriver7.isEmpty();
        java.lang.Object obj20 = stackTestDriver7.peek();
        java.lang.Object obj21 = stackTestDriver0.push(obj20);
        boolean boolean22 = stackTestDriver0.isEmpty();
        java.lang.Object obj24 = stackTestDriver0.push((java.lang.Object) 1);
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 1 + "'", obj11, 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + true + "'", obj18, true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + true + "'", obj20, true);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + true + "'", obj21, true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 1 + "'", obj24, 1);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test253");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) 1);
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        boolean boolean7 = stackTestDriver6.isEmpty();
        int int8 = stackTestDriver6.size();
        int int9 = stackTestDriver6.size();
        boolean boolean10 = stackTestDriver6.isEmpty();
        java.lang.Object obj11 = stackTestDriver0.push((java.lang.Object) boolean10);
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        java.lang.Object obj15 = stackTestDriver0.push((java.lang.Object) (-1L));
        boolean boolean16 = stackTestDriver0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 1 + "'", obj4, 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + true + "'", obj11, true);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (-1L) + "'", obj15, (-1L));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test254");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) 1);
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        boolean boolean7 = stackTestDriver6.isEmpty();
        int int8 = stackTestDriver6.size();
        int int9 = stackTestDriver6.size();
        boolean boolean10 = stackTestDriver6.isEmpty();
        java.lang.Object obj11 = stackTestDriver0.push((java.lang.Object) boolean10);
        boolean boolean12 = stackTestDriver0.isEmpty();
        boolean boolean13 = stackTestDriver0.isEmpty();
        int int14 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        boolean boolean16 = stackTestDriver15.isEmpty();
        boolean boolean17 = stackTestDriver15.isEmpty();
        experiment.util.StackTestDriver stackTestDriver18 = new experiment.util.StackTestDriver();
        boolean boolean19 = stackTestDriver18.isEmpty();
        int int20 = stackTestDriver18.size();
        java.lang.Object obj22 = stackTestDriver18.push((java.lang.Object) 1);
        stackTestDriver18.clear();
        experiment.util.StackTestDriver stackTestDriver24 = new experiment.util.StackTestDriver();
        boolean boolean25 = stackTestDriver24.isEmpty();
        int int26 = stackTestDriver24.size();
        int int27 = stackTestDriver24.size();
        boolean boolean28 = stackTestDriver24.isEmpty();
        java.lang.Object obj29 = stackTestDriver18.push((java.lang.Object) boolean28);
        boolean boolean30 = stackTestDriver18.isEmpty();
        java.lang.Object obj31 = stackTestDriver15.push((java.lang.Object) stackTestDriver18);
        int int32 = stackTestDriver18.size();
        java.lang.Object obj33 = stackTestDriver18.pop();
        java.lang.Class<?> wildcardClass34 = stackTestDriver18.getClass();
        java.lang.Object obj35 = stackTestDriver0.push((java.lang.Object) stackTestDriver18);
        java.lang.Object obj36 = stackTestDriver0.peek();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 1 + "'", obj4, 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + true + "'", obj11, true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 1 + "'", obj22, 1);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + true + "'", obj29, true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + true + "'", obj33, true);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertNotNull(obj36);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test255");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) 1);
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        boolean boolean7 = stackTestDriver6.isEmpty();
        int int8 = stackTestDriver6.size();
        int int9 = stackTestDriver6.size();
        boolean boolean10 = stackTestDriver6.isEmpty();
        java.lang.Object obj11 = stackTestDriver0.push((java.lang.Object) boolean10);
        boolean boolean12 = stackTestDriver0.isEmpty();
        boolean boolean13 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        boolean boolean16 = stackTestDriver15.isEmpty();
        int int17 = stackTestDriver15.size();
        java.lang.Object obj19 = stackTestDriver15.push((java.lang.Object) 1);
        boolean boolean20 = stackTestDriver15.isEmpty();
        java.lang.Object obj21 = stackTestDriver15.peek();
        java.lang.Object obj23 = stackTestDriver15.push((java.lang.Object) (short) 0);
        java.lang.Object obj24 = stackTestDriver0.push((java.lang.Object) stackTestDriver15);
        java.lang.Object obj25 = stackTestDriver0.peek();
        java.lang.Class<?> wildcardClass26 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 1 + "'", obj4, 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + true + "'", obj11, true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 1 + "'", obj19, 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 1 + "'", obj21, 1);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (short) 0 + "'", obj23, (short) 0);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_101322511_1024_0.test256");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        boolean boolean4 = stackTestDriver0.isEmpty();
        int int5 = stackTestDriver0.size();
        int int6 = stackTestDriver0.size();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) 100L);
        experiment.util.StackTestDriver stackTestDriver9 = new experiment.util.StackTestDriver();
        boolean boolean10 = stackTestDriver9.isEmpty();
        int int11 = stackTestDriver9.size();
        java.lang.Object obj13 = stackTestDriver9.push((java.lang.Object) 1);
        boolean boolean14 = stackTestDriver9.isEmpty();
        java.lang.Object obj15 = stackTestDriver9.peek();
        java.lang.Object obj17 = stackTestDriver9.push((java.lang.Object) (short) 0);
        java.lang.Class<?> wildcardClass18 = stackTestDriver9.getClass();
        java.lang.Object obj19 = stackTestDriver0.push((java.lang.Object) wildcardClass18);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 100L + "'", obj8, 100L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 1 + "'", obj13, 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 1 + "'", obj15, 1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (short) 0 + "'", obj17, (short) 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "class experiment.util.StackTestDriver");
    }

}
