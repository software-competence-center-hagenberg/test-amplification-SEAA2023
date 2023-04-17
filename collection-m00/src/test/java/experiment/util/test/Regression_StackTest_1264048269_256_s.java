package experiment.util.test;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Regression_StackTest_1264048269_256_s {

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
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test001");
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
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test002");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test003");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test004");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        java.lang.Class<?> wildcardClass3 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test005");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) 10.0f);
        stackTestDriver0.clear();
        java.lang.Class<?> wildcardClass7 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 10.0f + "'", obj5, 10.0f);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test006");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        java.lang.Object obj9 = stackTestDriver0.pop();
        int int10 = stackTestDriver0.size();
        java.lang.Class<?> wildcardClass11 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test007");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        java.lang.Object obj9 = stackTestDriver0.pop();
        int int10 = stackTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test008");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        boolean boolean9 = stackTestDriver5.isEmpty();
        java.lang.Class<?> wildcardClass10 = stackTestDriver5.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test009");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        int int9 = stackTestDriver5.size();
        java.lang.Object obj10 = stackTestDriver5.peek();
        java.lang.Class<?> wildcardClass11 = obj10.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test010");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        int int9 = stackTestDriver5.size();
        boolean boolean10 = stackTestDriver5.isEmpty();
        stackTestDriver5.clear();
        java.lang.Class<?> wildcardClass12 = stackTestDriver5.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test011");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        int int5 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        java.lang.Object obj8 = stackTestDriver6.push((java.lang.Object) (byte) -1);
        boolean boolean9 = stackTestDriver6.isEmpty();
        java.lang.Object obj10 = stackTestDriver6.pop();
        experiment.util.StackTestDriver stackTestDriver11 = new experiment.util.StackTestDriver();
        java.lang.Object obj13 = stackTestDriver11.push((java.lang.Object) (byte) -1);
        java.lang.Object obj14 = stackTestDriver6.push((java.lang.Object) stackTestDriver11);
        int int15 = stackTestDriver11.size();
        java.lang.Object obj16 = stackTestDriver0.push((java.lang.Object) stackTestDriver11);
        java.lang.Class<?> wildcardClass17 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) -1 + "'", obj8, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (byte) -1 + "'", obj13, (byte) -1);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test012");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test013");
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
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test014");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) 10.0f);
        java.lang.Object obj6 = stackTestDriver0.pop();
        java.lang.Object obj7 = stackTestDriver0.peek();
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 10.0f + "'", obj5, 10.0f);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 10.0f + "'", obj6, 10.0f);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test015");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        int int4 = stackTestDriver0.size();
        java.lang.Object obj5 = stackTestDriver0.pop();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) -1 + "'", obj5, (byte) -1);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test016");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        int int9 = stackTestDriver5.size();
        boolean boolean10 = stackTestDriver5.isEmpty();
        int int11 = stackTestDriver5.size();
        stackTestDriver5.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = stackTestDriver5.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test017");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        java.lang.Object obj9 = stackTestDriver0.pop();
        int int10 = stackTestDriver0.size();
        int int11 = stackTestDriver0.size();
        boolean boolean12 = stackTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test018");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        boolean boolean4 = stackTestDriver0.isEmpty();
        int int5 = stackTestDriver0.size();
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) wildcardClass7);
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "class java.lang.Object");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test019");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        java.lang.Class<?> wildcardClass5 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test020");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        int int5 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        java.lang.Object obj8 = stackTestDriver6.push((java.lang.Object) (byte) -1);
        java.lang.Object obj9 = stackTestDriver0.push(obj8);
        java.lang.Class<?> wildcardClass10 = obj8.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) -1 + "'", obj8, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) -1 + "'", obj9, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test021");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        int int9 = stackTestDriver5.size();
        java.lang.Object obj10 = stackTestDriver5.peek();
        boolean boolean11 = stackTestDriver5.isEmpty();
        stackTestDriver5.clear();
        java.lang.Object obj13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = stackTestDriver5.push(obj13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test022");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        int int9 = stackTestDriver5.size();
        boolean boolean10 = stackTestDriver5.isEmpty();
        stackTestDriver5.clear();
        boolean boolean12 = stackTestDriver5.isEmpty();
        boolean boolean13 = stackTestDriver5.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = stackTestDriver5.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test023");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        int int9 = stackTestDriver5.size();
        boolean boolean10 = stackTestDriver5.isEmpty();
        stackTestDriver5.clear();
        boolean boolean12 = stackTestDriver5.isEmpty();
        int int13 = stackTestDriver5.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = stackTestDriver5.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test024");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        java.lang.Object obj9 = stackTestDriver0.pop();
        boolean boolean10 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test025");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        boolean boolean4 = stackTestDriver0.isEmpty();
        int int5 = stackTestDriver0.size();
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) wildcardClass7);
        int int9 = stackTestDriver0.size();
        java.lang.Class<?> wildcardClass10 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "class java.lang.Object");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test026");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        java.lang.Object obj9 = stackTestDriver0.pop();
        boolean boolean10 = stackTestDriver0.isEmpty();
        java.lang.Class<?> wildcardClass11 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test027");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        int int9 = stackTestDriver5.size();
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        java.lang.Object obj12 = stackTestDriver10.push((java.lang.Object) (byte) -1);
        boolean boolean13 = stackTestDriver10.isEmpty();
        java.lang.Object obj14 = stackTestDriver10.pop();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        java.lang.Object obj17 = stackTestDriver15.push((java.lang.Object) (byte) -1);
        java.lang.Object obj18 = stackTestDriver10.push((java.lang.Object) stackTestDriver15);
        boolean boolean19 = stackTestDriver15.isEmpty();
        java.lang.Object obj20 = stackTestDriver5.push((java.lang.Object) stackTestDriver15);
        java.lang.Object obj22 = stackTestDriver15.push((java.lang.Object) 10);
        java.lang.Class<?> wildcardClass23 = stackTestDriver15.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) -1 + "'", obj12, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (byte) -1 + "'", obj14, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) -1 + "'", obj17, (byte) -1);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 10 + "'", obj22, 10);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test028");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        int int9 = stackTestDriver5.size();
        boolean boolean10 = stackTestDriver5.isEmpty();
        stackTestDriver5.clear();
        boolean boolean12 = stackTestDriver5.isEmpty();
        boolean boolean13 = stackTestDriver5.isEmpty();
        java.lang.Object obj15 = stackTestDriver5.push((java.lang.Object) "hi!");
        java.lang.Object obj16 = stackTestDriver5.pop();
        boolean boolean17 = stackTestDriver5.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = stackTestDriver5.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + "hi!" + "'", obj15, "hi!");
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + "hi!" + "'", obj16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test029");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        int int9 = stackTestDriver5.size();
        boolean boolean10 = stackTestDriver5.isEmpty();
        stackTestDriver5.clear();
        boolean boolean12 = stackTestDriver5.isEmpty();
        stackTestDriver5.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = stackTestDriver5.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test030");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        int int4 = stackTestDriver0.size();
        java.lang.Class<?> wildcardClass5 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test031");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        int int9 = stackTestDriver5.size();
        boolean boolean10 = stackTestDriver5.isEmpty();
        stackTestDriver5.clear();
        boolean boolean12 = stackTestDriver5.isEmpty();
        int int13 = stackTestDriver5.size();
        int int14 = stackTestDriver5.size();
        int int15 = stackTestDriver5.size();
        java.lang.Class<?> wildcardClass16 = stackTestDriver5.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test032");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        java.lang.Object obj9 = stackTestDriver0.pop();
        boolean boolean10 = stackTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test033");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        int int5 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        java.lang.Object obj8 = stackTestDriver6.push((java.lang.Object) (byte) -1);
        java.lang.Object obj9 = stackTestDriver0.push(obj8);
        boolean boolean10 = stackTestDriver0.isEmpty();
        java.lang.Class<?> wildcardClass11 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) -1 + "'", obj8, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) -1 + "'", obj9, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test034");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        int int9 = stackTestDriver5.size();
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        java.lang.Object obj12 = stackTestDriver10.push((java.lang.Object) (byte) -1);
        boolean boolean13 = stackTestDriver10.isEmpty();
        java.lang.Object obj14 = stackTestDriver10.pop();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        java.lang.Object obj17 = stackTestDriver15.push((java.lang.Object) (byte) -1);
        java.lang.Object obj18 = stackTestDriver10.push((java.lang.Object) stackTestDriver15);
        boolean boolean19 = stackTestDriver15.isEmpty();
        java.lang.Object obj20 = stackTestDriver5.push((java.lang.Object) stackTestDriver15);
        java.lang.Object obj22 = stackTestDriver15.push((java.lang.Object) 10);
        java.lang.Object obj23 = stackTestDriver15.pop();
        java.lang.Class<?> wildcardClass24 = obj23.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) -1 + "'", obj12, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (byte) -1 + "'", obj14, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) -1 + "'", obj17, (byte) -1);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 10 + "'", obj22, 10);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 10 + "'", obj23, 10);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test035");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) 10.0f);
        stackTestDriver0.clear();
        int int7 = stackTestDriver0.size();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 10.0f + "'", obj5, 10.0f);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test036");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) 10.0f);
        boolean boolean6 = stackTestDriver0.isEmpty();
        java.lang.Class<?> wildcardClass7 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 10.0f + "'", obj5, 10.0f);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test037");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) 10.0f);
        java.lang.Object obj6 = stackTestDriver0.pop();
        boolean boolean7 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        java.lang.Class<?> wildcardClass9 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 10.0f + "'", obj5, 10.0f);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 10.0f + "'", obj6, 10.0f);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test038");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        int int4 = stackTestDriver0.size();
        java.lang.Object obj5 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) stackTestDriver6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = stackTestDriver6.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) -1 + "'", obj5, (byte) -1);
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test039");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
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
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test040");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        int int9 = stackTestDriver5.size();
        java.lang.Object obj10 = stackTestDriver5.peek();
        java.lang.Object obj11 = stackTestDriver5.pop();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = stackTestDriver5.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) -1 + "'", obj11, (byte) -1);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test041");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        int int9 = stackTestDriver5.size();
        java.lang.Object obj11 = stackTestDriver5.push((java.lang.Object) (-1.0d));
        java.lang.Object obj12 = stackTestDriver5.peek();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (-1.0d) + "'", obj11, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (-1.0d) + "'", obj12, (-1.0d));
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test042");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Class<?> wildcardClass4 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test043");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        int int9 = stackTestDriver5.size();
        boolean boolean10 = stackTestDriver5.isEmpty();
        stackTestDriver5.clear();
        boolean boolean12 = stackTestDriver5.isEmpty();
        boolean boolean13 = stackTestDriver5.isEmpty();
        java.lang.Object obj15 = stackTestDriver5.push((java.lang.Object) "hi!");
        java.lang.Object obj16 = stackTestDriver5.pop();
        boolean boolean17 = stackTestDriver5.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = stackTestDriver5.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + "hi!" + "'", obj15, "hi!");
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + "hi!" + "'", obj16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test044");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        int int5 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        java.lang.Object obj8 = stackTestDriver6.push((java.lang.Object) (byte) -1);
        java.lang.Object obj9 = stackTestDriver0.push(obj8);
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        java.lang.Object obj12 = stackTestDriver10.push((java.lang.Object) (byte) -1);
        boolean boolean13 = stackTestDriver10.isEmpty();
        java.lang.Object obj14 = stackTestDriver10.pop();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        java.lang.Object obj17 = stackTestDriver15.push((java.lang.Object) (byte) -1);
        java.lang.Object obj18 = stackTestDriver10.push((java.lang.Object) stackTestDriver15);
        int int19 = stackTestDriver15.size();
        experiment.util.StackTestDriver stackTestDriver20 = new experiment.util.StackTestDriver();
        java.lang.Object obj22 = stackTestDriver20.push((java.lang.Object) (byte) -1);
        boolean boolean23 = stackTestDriver20.isEmpty();
        java.lang.Object obj24 = stackTestDriver20.pop();
        experiment.util.StackTestDriver stackTestDriver25 = new experiment.util.StackTestDriver();
        java.lang.Object obj27 = stackTestDriver25.push((java.lang.Object) (byte) -1);
        java.lang.Object obj28 = stackTestDriver20.push((java.lang.Object) stackTestDriver25);
        boolean boolean29 = stackTestDriver25.isEmpty();
        java.lang.Object obj30 = stackTestDriver15.push((java.lang.Object) stackTestDriver25);
        java.lang.Object obj32 = stackTestDriver25.push((java.lang.Object) 10);
        java.lang.Object obj33 = stackTestDriver25.pop();
        java.lang.Object obj34 = stackTestDriver0.push(obj33);
        int int35 = stackTestDriver0.size();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) -1 + "'", obj8, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) -1 + "'", obj9, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) -1 + "'", obj12, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (byte) -1 + "'", obj14, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) -1 + "'", obj17, (byte) -1);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (byte) -1 + "'", obj22, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (byte) -1 + "'", obj24, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + (byte) -1 + "'", obj27, (byte) -1);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 10 + "'", obj32, 10);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + 10 + "'", obj33, 10);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + 10 + "'", obj34, 10);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2 + "'", int35 == 2);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test045");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        int int9 = stackTestDriver5.size();
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        java.lang.Object obj12 = stackTestDriver10.push((java.lang.Object) (byte) -1);
        boolean boolean13 = stackTestDriver10.isEmpty();
        java.lang.Object obj14 = stackTestDriver10.pop();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        java.lang.Object obj17 = stackTestDriver15.push((java.lang.Object) (byte) -1);
        java.lang.Object obj18 = stackTestDriver10.push((java.lang.Object) stackTestDriver15);
        boolean boolean19 = stackTestDriver15.isEmpty();
        java.lang.Object obj20 = stackTestDriver5.push((java.lang.Object) stackTestDriver15);
        java.lang.Object obj22 = stackTestDriver15.push((java.lang.Object) 10);
        java.lang.Class<?> wildcardClass23 = obj22.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) -1 + "'", obj12, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (byte) -1 + "'", obj14, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) -1 + "'", obj17, (byte) -1);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 10 + "'", obj22, 10);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test046");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        boolean boolean4 = stackTestDriver0.isEmpty();
        int int5 = stackTestDriver0.size();
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) wildcardClass7);
        int int9 = stackTestDriver0.size();
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "class java.lang.Object");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test047");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        int int9 = stackTestDriver5.size();
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        java.lang.Object obj12 = stackTestDriver10.push((java.lang.Object) (byte) -1);
        boolean boolean13 = stackTestDriver10.isEmpty();
        java.lang.Object obj14 = stackTestDriver10.pop();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        java.lang.Object obj17 = stackTestDriver15.push((java.lang.Object) (byte) -1);
        java.lang.Object obj18 = stackTestDriver10.push((java.lang.Object) stackTestDriver15);
        boolean boolean19 = stackTestDriver15.isEmpty();
        java.lang.Object obj20 = stackTestDriver5.push((java.lang.Object) stackTestDriver15);
        experiment.util.StackTestDriver stackTestDriver21 = new experiment.util.StackTestDriver();
        java.lang.Object obj23 = stackTestDriver21.push((java.lang.Object) (byte) -1);
        boolean boolean24 = stackTestDriver21.isEmpty();
        java.lang.Object obj25 = stackTestDriver21.pop();
        java.lang.Object obj26 = stackTestDriver15.push((java.lang.Object) stackTestDriver21);
        java.lang.Class<?> wildcardClass27 = obj26.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) -1 + "'", obj12, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (byte) -1 + "'", obj14, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) -1 + "'", obj17, (byte) -1);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (byte) -1 + "'", obj23, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (byte) -1 + "'", obj25, (byte) -1);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test048");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) 10.0f);
        stackTestDriver0.clear();
        boolean boolean7 = stackTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 10.0f + "'", obj5, 10.0f);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test049");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        boolean boolean4 = stackTestDriver0.isEmpty();
        int int5 = stackTestDriver0.size();
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) "hi!");
        java.lang.Object obj8 = stackTestDriver0.pop();
        java.lang.Class<?> wildcardClass9 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + "hi!" + "'", obj7, "hi!");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "hi!" + "'", obj8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test050");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        int int5 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        java.lang.Object obj8 = stackTestDriver6.push((java.lang.Object) (byte) -1);
        boolean boolean9 = stackTestDriver6.isEmpty();
        java.lang.Object obj10 = stackTestDriver6.pop();
        experiment.util.StackTestDriver stackTestDriver11 = new experiment.util.StackTestDriver();
        java.lang.Object obj13 = stackTestDriver11.push((java.lang.Object) (byte) -1);
        java.lang.Object obj14 = stackTestDriver6.push((java.lang.Object) stackTestDriver11);
        int int15 = stackTestDriver11.size();
        java.lang.Object obj16 = stackTestDriver0.push((java.lang.Object) stackTestDriver11);
        java.lang.Object obj17 = new java.lang.Object();
        java.lang.Object obj18 = stackTestDriver11.push(obj17);
        stackTestDriver11.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = stackTestDriver11.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) -1 + "'", obj8, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (byte) -1 + "'", obj13, (byte) -1);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(obj18);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test051");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        boolean boolean4 = stackTestDriver0.isEmpty();
        int int5 = stackTestDriver0.size();
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) wildcardClass7);
        java.lang.Object obj9 = stackTestDriver0.peek();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "class java.lang.Object");
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "class java.lang.Object");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test052");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        boolean boolean9 = stackTestDriver5.isEmpty();
        java.lang.Object obj11 = stackTestDriver5.push((java.lang.Object) 100);
        experiment.util.StackTestDriver stackTestDriver12 = new experiment.util.StackTestDriver();
        java.lang.Object obj14 = stackTestDriver12.push((java.lang.Object) (byte) -1);
        boolean boolean15 = stackTestDriver12.isEmpty();
        java.lang.Object obj16 = stackTestDriver12.pop();
        int int17 = stackTestDriver12.size();
        experiment.util.StackTestDriver stackTestDriver18 = new experiment.util.StackTestDriver();
        java.lang.Object obj20 = stackTestDriver18.push((java.lang.Object) (byte) -1);
        boolean boolean21 = stackTestDriver18.isEmpty();
        java.lang.Object obj22 = stackTestDriver18.pop();
        experiment.util.StackTestDriver stackTestDriver23 = new experiment.util.StackTestDriver();
        java.lang.Object obj25 = stackTestDriver23.push((java.lang.Object) (byte) -1);
        java.lang.Object obj26 = stackTestDriver18.push((java.lang.Object) stackTestDriver23);
        int int27 = stackTestDriver23.size();
        java.lang.Object obj28 = stackTestDriver12.push((java.lang.Object) stackTestDriver23);
        java.lang.Object obj29 = new java.lang.Object();
        java.lang.Object obj30 = stackTestDriver23.push(obj29);
        boolean boolean31 = stackTestDriver23.isEmpty();
        java.lang.Object obj32 = stackTestDriver5.push((java.lang.Object) stackTestDriver23);
        stackTestDriver23.clear();
        boolean boolean34 = stackTestDriver23.isEmpty();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 100 + "'", obj11, 100);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (byte) -1 + "'", obj14, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (byte) -1 + "'", obj16, (byte) -1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (byte) -1 + "'", obj20, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (byte) -1 + "'", obj22, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (byte) -1 + "'", obj25, (byte) -1);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test053");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        int int4 = stackTestDriver0.size();
        java.lang.Object obj5 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) stackTestDriver6);
        stackTestDriver6.clear();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) -1 + "'", obj5, (byte) -1);
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test054");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        boolean boolean4 = stackTestDriver0.isEmpty();
        int int5 = stackTestDriver0.size();
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) wildcardClass7);
        int int9 = stackTestDriver0.size();
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "class java.lang.Object");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test055");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
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
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test056");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        boolean boolean9 = stackTestDriver5.isEmpty();
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        java.lang.Object obj12 = stackTestDriver10.push((java.lang.Object) (byte) -1);
        boolean boolean13 = stackTestDriver10.isEmpty();
        java.lang.Object obj14 = stackTestDriver10.pop();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        java.lang.Object obj17 = stackTestDriver15.push((java.lang.Object) (byte) -1);
        java.lang.Object obj18 = stackTestDriver10.push((java.lang.Object) stackTestDriver15);
        int int19 = stackTestDriver15.size();
        java.lang.Object obj20 = stackTestDriver15.peek();
        boolean boolean21 = stackTestDriver15.isEmpty();
        stackTestDriver15.clear();
        experiment.util.StackTestDriver stackTestDriver23 = new experiment.util.StackTestDriver();
        java.lang.Object obj25 = stackTestDriver23.push((java.lang.Object) (byte) -1);
        boolean boolean26 = stackTestDriver23.isEmpty();
        boolean boolean27 = stackTestDriver23.isEmpty();
        int int28 = stackTestDriver23.size();
        java.lang.Class<?> wildcardClass29 = stackTestDriver23.getClass();
        java.lang.Object obj30 = stackTestDriver15.push((java.lang.Object) wildcardClass29);
        java.lang.Class<?> wildcardClass31 = stackTestDriver15.getClass();
        java.lang.Object obj32 = stackTestDriver5.push((java.lang.Object) wildcardClass31);
        java.lang.Object obj33 = stackTestDriver5.pop();
        java.lang.Class<?> wildcardClass34 = obj33.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) -1 + "'", obj12, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (byte) -1 + "'", obj14, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) -1 + "'", obj17, (byte) -1);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (byte) -1 + "'", obj20, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (byte) -1 + "'", obj25, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertEquals(obj30.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj30), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj30), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertEquals(obj32.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj32), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj32), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertEquals(obj33.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj33), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj33), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test057");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        int int4 = stackTestDriver0.size();
        java.lang.Object obj5 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) stackTestDriver6);
        int int8 = stackTestDriver6.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = stackTestDriver6.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) -1 + "'", obj5, (byte) -1);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test058");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        int int5 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        java.lang.Object obj8 = stackTestDriver6.push((java.lang.Object) (byte) -1);
        java.lang.Object obj9 = stackTestDriver0.push(obj8);
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        java.lang.Object obj12 = stackTestDriver10.push((java.lang.Object) (byte) -1);
        boolean boolean13 = stackTestDriver10.isEmpty();
        java.lang.Object obj14 = stackTestDriver10.pop();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        java.lang.Object obj17 = stackTestDriver15.push((java.lang.Object) (byte) -1);
        java.lang.Object obj18 = stackTestDriver10.push((java.lang.Object) stackTestDriver15);
        int int19 = stackTestDriver15.size();
        experiment.util.StackTestDriver stackTestDriver20 = new experiment.util.StackTestDriver();
        java.lang.Object obj22 = stackTestDriver20.push((java.lang.Object) (byte) -1);
        boolean boolean23 = stackTestDriver20.isEmpty();
        java.lang.Object obj24 = stackTestDriver20.pop();
        experiment.util.StackTestDriver stackTestDriver25 = new experiment.util.StackTestDriver();
        java.lang.Object obj27 = stackTestDriver25.push((java.lang.Object) (byte) -1);
        java.lang.Object obj28 = stackTestDriver20.push((java.lang.Object) stackTestDriver25);
        boolean boolean29 = stackTestDriver25.isEmpty();
        java.lang.Object obj30 = stackTestDriver15.push((java.lang.Object) stackTestDriver25);
        java.lang.Object obj32 = stackTestDriver25.push((java.lang.Object) 10);
        java.lang.Object obj33 = stackTestDriver25.pop();
        java.lang.Object obj34 = stackTestDriver0.push(obj33);
        java.lang.Object obj35 = stackTestDriver0.pop();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj38 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) -1 + "'", obj8, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) -1 + "'", obj9, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) -1 + "'", obj12, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (byte) -1 + "'", obj14, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) -1 + "'", obj17, (byte) -1);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (byte) -1 + "'", obj22, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (byte) -1 + "'", obj24, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + (byte) -1 + "'", obj27, (byte) -1);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 10 + "'", obj32, 10);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + 10 + "'", obj33, 10);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + 10 + "'", obj34, 10);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 10 + "'", obj35, 10);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test059");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        int int9 = stackTestDriver5.size();
        boolean boolean10 = stackTestDriver5.isEmpty();
        stackTestDriver5.clear();
        boolean boolean12 = stackTestDriver5.isEmpty();
        int int13 = stackTestDriver5.size();
        experiment.util.StackTestDriver stackTestDriver14 = new experiment.util.StackTestDriver();
        java.lang.Object obj16 = stackTestDriver14.push((java.lang.Object) (byte) -1);
        boolean boolean17 = stackTestDriver14.isEmpty();
        java.lang.Object obj18 = stackTestDriver14.pop();
        experiment.util.StackTestDriver stackTestDriver19 = new experiment.util.StackTestDriver();
        java.lang.Object obj21 = stackTestDriver19.push((java.lang.Object) (byte) -1);
        java.lang.Object obj22 = stackTestDriver14.push((java.lang.Object) stackTestDriver19);
        boolean boolean23 = stackTestDriver19.isEmpty();
        stackTestDriver19.clear();
        java.lang.Object obj25 = stackTestDriver5.push((java.lang.Object) stackTestDriver19);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = stackTestDriver19.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (byte) -1 + "'", obj16, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (byte) -1 + "'", obj18, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (byte) -1 + "'", obj21, (byte) -1);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(obj25);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test060");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        int int9 = stackTestDriver5.size();
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        java.lang.Object obj12 = stackTestDriver10.push((java.lang.Object) (byte) -1);
        boolean boolean13 = stackTestDriver10.isEmpty();
        java.lang.Object obj14 = stackTestDriver10.pop();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        java.lang.Object obj17 = stackTestDriver15.push((java.lang.Object) (byte) -1);
        java.lang.Object obj18 = stackTestDriver10.push((java.lang.Object) stackTestDriver15);
        boolean boolean19 = stackTestDriver15.isEmpty();
        java.lang.Object obj20 = stackTestDriver5.push((java.lang.Object) stackTestDriver15);
        java.lang.Class<?> wildcardClass21 = obj20.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) -1 + "'", obj12, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (byte) -1 + "'", obj14, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) -1 + "'", obj17, (byte) -1);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test061");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        int int9 = stackTestDriver5.size();
        boolean boolean10 = stackTestDriver5.isEmpty();
        stackTestDriver5.clear();
        boolean boolean12 = stackTestDriver5.isEmpty();
        boolean boolean13 = stackTestDriver5.isEmpty();
        stackTestDriver5.clear();
        java.lang.Class<?> wildcardClass15 = stackTestDriver5.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test062");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        int int9 = stackTestDriver5.size();
        boolean boolean10 = stackTestDriver5.isEmpty();
        stackTestDriver5.clear();
        boolean boolean12 = stackTestDriver5.isEmpty();
        int int13 = stackTestDriver5.size();
        experiment.util.StackTestDriver stackTestDriver14 = new experiment.util.StackTestDriver();
        java.lang.Object obj16 = stackTestDriver14.push((java.lang.Object) (byte) -1);
        boolean boolean17 = stackTestDriver14.isEmpty();
        java.lang.Object obj18 = stackTestDriver14.pop();
        experiment.util.StackTestDriver stackTestDriver19 = new experiment.util.StackTestDriver();
        java.lang.Object obj21 = stackTestDriver19.push((java.lang.Object) (byte) -1);
        java.lang.Object obj22 = stackTestDriver14.push((java.lang.Object) stackTestDriver19);
        boolean boolean23 = stackTestDriver19.isEmpty();
        stackTestDriver19.clear();
        java.lang.Object obj25 = stackTestDriver5.push((java.lang.Object) stackTestDriver19);
        int int26 = stackTestDriver19.size();
        boolean boolean27 = stackTestDriver19.isEmpty();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (byte) -1 + "'", obj16, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (byte) -1 + "'", obj18, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (byte) -1 + "'", obj21, (byte) -1);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test063");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        int int5 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        java.lang.Object obj8 = stackTestDriver6.push((java.lang.Object) (byte) -1);
        boolean boolean9 = stackTestDriver6.isEmpty();
        java.lang.Object obj10 = stackTestDriver6.pop();
        experiment.util.StackTestDriver stackTestDriver11 = new experiment.util.StackTestDriver();
        java.lang.Object obj13 = stackTestDriver11.push((java.lang.Object) (byte) -1);
        java.lang.Object obj14 = stackTestDriver6.push((java.lang.Object) stackTestDriver11);
        int int15 = stackTestDriver11.size();
        java.lang.Object obj16 = stackTestDriver0.push((java.lang.Object) stackTestDriver11);
        java.lang.Object obj17 = new java.lang.Object();
        java.lang.Object obj18 = stackTestDriver11.push(obj17);
        boolean boolean19 = stackTestDriver11.isEmpty();
        stackTestDriver11.clear();
        boolean boolean21 = stackTestDriver11.isEmpty();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) -1 + "'", obj8, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (byte) -1 + "'", obj13, (byte) -1);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test064");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        boolean boolean4 = stackTestDriver0.isEmpty();
        int int5 = stackTestDriver0.size();
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) wildcardClass7);
        java.lang.Object obj9 = stackTestDriver0.peek();
        int int10 = stackTestDriver0.size();
        java.lang.Object obj12 = stackTestDriver0.push((java.lang.Object) (short) -1);
        java.lang.Object obj13 = stackTestDriver0.pop();
        boolean boolean14 = stackTestDriver0.isEmpty();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "class java.lang.Object");
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "class java.lang.Object");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (short) -1 + "'", obj12, (short) -1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (short) -1 + "'", obj13, (short) -1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test065");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        int int9 = stackTestDriver5.size();
        boolean boolean10 = stackTestDriver5.isEmpty();
        experiment.util.StackTestDriver stackTestDriver11 = new experiment.util.StackTestDriver();
        java.lang.Object obj13 = stackTestDriver11.push((java.lang.Object) (byte) -1);
        boolean boolean14 = stackTestDriver11.isEmpty();
        boolean boolean15 = stackTestDriver11.isEmpty();
        int int16 = stackTestDriver11.size();
        java.lang.Object obj17 = new java.lang.Object();
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        java.lang.Object obj19 = stackTestDriver11.push((java.lang.Object) wildcardClass18);
        java.lang.Object obj20 = stackTestDriver5.push((java.lang.Object) wildcardClass18);
        java.lang.Object obj21 = stackTestDriver5.pop();
        java.lang.Class<?> wildcardClass22 = obj21.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (byte) -1 + "'", obj13, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "class java.lang.Object");
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "class java.lang.Object");
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals(obj21.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj21), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj21), "class java.lang.Object");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test066");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        int int5 = stackTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test067");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        int int9 = stackTestDriver5.size();
        boolean boolean10 = stackTestDriver5.isEmpty();
        stackTestDriver5.clear();
        boolean boolean12 = stackTestDriver5.isEmpty();
        boolean boolean13 = stackTestDriver5.isEmpty();
        java.lang.Object obj15 = stackTestDriver5.push((java.lang.Object) "hi!");
        java.lang.Object obj16 = stackTestDriver5.pop();
        boolean boolean17 = stackTestDriver5.isEmpty();
        boolean boolean18 = stackTestDriver5.isEmpty();
        experiment.util.StackTestDriver stackTestDriver19 = new experiment.util.StackTestDriver();
        java.lang.Object obj21 = stackTestDriver19.push((java.lang.Object) (byte) -1);
        boolean boolean22 = stackTestDriver19.isEmpty();
        java.lang.Object obj23 = stackTestDriver19.pop();
        experiment.util.StackTestDriver stackTestDriver24 = new experiment.util.StackTestDriver();
        java.lang.Object obj26 = stackTestDriver24.push((java.lang.Object) (byte) -1);
        java.lang.Object obj27 = stackTestDriver19.push((java.lang.Object) stackTestDriver24);
        int int28 = stackTestDriver24.size();
        boolean boolean29 = stackTestDriver24.isEmpty();
        stackTestDriver24.clear();
        boolean boolean31 = stackTestDriver24.isEmpty();
        stackTestDriver24.clear();
        java.lang.Object obj33 = stackTestDriver5.push((java.lang.Object) stackTestDriver24);
        boolean boolean34 = stackTestDriver24.isEmpty();
        stackTestDriver24.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj36 = stackTestDriver24.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + "hi!" + "'", obj15, "hi!");
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + "hi!" + "'", obj16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (byte) -1 + "'", obj21, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (byte) -1 + "'", obj23, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + (byte) -1 + "'", obj26, (byte) -1);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test068");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        boolean boolean4 = stackTestDriver0.isEmpty();
        int int5 = stackTestDriver0.size();
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) wildcardClass7);
        java.lang.Class<?> wildcardClass9 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "class java.lang.Object");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test069");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) 10.0f);
        java.lang.Object obj6 = stackTestDriver0.pop();
        java.lang.Object obj7 = stackTestDriver0.peek();
        boolean boolean8 = stackTestDriver0.isEmpty();
        boolean boolean9 = stackTestDriver0.isEmpty();
        int int10 = stackTestDriver0.size();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 10.0f + "'", obj5, 10.0f);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 10.0f + "'", obj6, 10.0f);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test070");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        int int9 = stackTestDriver5.size();
        boolean boolean10 = stackTestDriver5.isEmpty();
        stackTestDriver5.clear();
        boolean boolean12 = stackTestDriver5.isEmpty();
        boolean boolean13 = stackTestDriver5.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = stackTestDriver5.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test071");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        boolean boolean9 = stackTestDriver5.isEmpty();
        java.lang.Object obj11 = stackTestDriver5.push((java.lang.Object) 100);
        experiment.util.StackTestDriver stackTestDriver12 = new experiment.util.StackTestDriver();
        java.lang.Object obj14 = stackTestDriver12.push((java.lang.Object) (byte) -1);
        boolean boolean15 = stackTestDriver12.isEmpty();
        java.lang.Object obj16 = stackTestDriver12.pop();
        int int17 = stackTestDriver12.size();
        experiment.util.StackTestDriver stackTestDriver18 = new experiment.util.StackTestDriver();
        java.lang.Object obj20 = stackTestDriver18.push((java.lang.Object) (byte) -1);
        boolean boolean21 = stackTestDriver18.isEmpty();
        java.lang.Object obj22 = stackTestDriver18.pop();
        experiment.util.StackTestDriver stackTestDriver23 = new experiment.util.StackTestDriver();
        java.lang.Object obj25 = stackTestDriver23.push((java.lang.Object) (byte) -1);
        java.lang.Object obj26 = stackTestDriver18.push((java.lang.Object) stackTestDriver23);
        int int27 = stackTestDriver23.size();
        java.lang.Object obj28 = stackTestDriver12.push((java.lang.Object) stackTestDriver23);
        java.lang.Object obj29 = new java.lang.Object();
        java.lang.Object obj30 = stackTestDriver23.push(obj29);
        boolean boolean31 = stackTestDriver23.isEmpty();
        java.lang.Object obj32 = stackTestDriver5.push((java.lang.Object) stackTestDriver23);
        int int33 = stackTestDriver5.size();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 100 + "'", obj11, 100);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (byte) -1 + "'", obj14, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (byte) -1 + "'", obj16, (byte) -1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (byte) -1 + "'", obj20, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (byte) -1 + "'", obj22, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (byte) -1 + "'", obj25, (byte) -1);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 3 + "'", int33 == 3);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test072");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        int int9 = stackTestDriver5.size();
        boolean boolean10 = stackTestDriver5.isEmpty();
        stackTestDriver5.clear();
        boolean boolean12 = stackTestDriver5.isEmpty();
        boolean boolean13 = stackTestDriver5.isEmpty();
        java.lang.Object obj15 = stackTestDriver5.push((java.lang.Object) "hi!");
        java.lang.Object obj16 = stackTestDriver5.pop();
        boolean boolean17 = stackTestDriver5.isEmpty();
        boolean boolean18 = stackTestDriver5.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = stackTestDriver5.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + "hi!" + "'", obj15, "hi!");
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + "hi!" + "'", obj16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test073");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        int int9 = stackTestDriver5.size();
        boolean boolean10 = stackTestDriver5.isEmpty();
        stackTestDriver5.clear();
        boolean boolean12 = stackTestDriver5.isEmpty();
        boolean boolean13 = stackTestDriver5.isEmpty();
        java.lang.Object obj15 = stackTestDriver5.push((java.lang.Object) "hi!");
        java.lang.Object obj16 = stackTestDriver5.pop();
        boolean boolean17 = stackTestDriver5.isEmpty();
        int int18 = stackTestDriver5.size();
        stackTestDriver5.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = stackTestDriver5.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + "hi!" + "'", obj15, "hi!");
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + "hi!" + "'", obj16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test074");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
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
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test075");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        int int9 = stackTestDriver5.size();
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        java.lang.Object obj12 = stackTestDriver10.push((java.lang.Object) (byte) -1);
        boolean boolean13 = stackTestDriver10.isEmpty();
        java.lang.Object obj14 = stackTestDriver10.pop();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        java.lang.Object obj17 = stackTestDriver15.push((java.lang.Object) (byte) -1);
        java.lang.Object obj18 = stackTestDriver10.push((java.lang.Object) stackTestDriver15);
        boolean boolean19 = stackTestDriver15.isEmpty();
        java.lang.Object obj20 = stackTestDriver5.push((java.lang.Object) stackTestDriver15);
        experiment.util.StackTestDriver stackTestDriver21 = new experiment.util.StackTestDriver();
        java.lang.Object obj23 = stackTestDriver21.push((java.lang.Object) (byte) -1);
        boolean boolean24 = stackTestDriver21.isEmpty();
        java.lang.Object obj25 = stackTestDriver21.pop();
        java.lang.Object obj26 = stackTestDriver15.push((java.lang.Object) stackTestDriver21);
        int int27 = stackTestDriver15.size();
        java.lang.Class<?> wildcardClass28 = stackTestDriver15.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) -1 + "'", obj12, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (byte) -1 + "'", obj14, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) -1 + "'", obj17, (byte) -1);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (byte) -1 + "'", obj23, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (byte) -1 + "'", obj25, (byte) -1);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test076");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        int int9 = stackTestDriver5.size();
        boolean boolean10 = stackTestDriver5.isEmpty();
        stackTestDriver5.clear();
        boolean boolean12 = stackTestDriver5.isEmpty();
        boolean boolean13 = stackTestDriver5.isEmpty();
        java.lang.Object obj15 = stackTestDriver5.push((java.lang.Object) "hi!");
        java.lang.Object obj16 = stackTestDriver5.pop();
        boolean boolean17 = stackTestDriver5.isEmpty();
        int int18 = stackTestDriver5.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = stackTestDriver5.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + "hi!" + "'", obj15, "hi!");
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + "hi!" + "'", obj16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test077");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        int int9 = stackTestDriver5.size();
        boolean boolean10 = stackTestDriver5.isEmpty();
        stackTestDriver5.clear();
        boolean boolean12 = stackTestDriver5.isEmpty();
        int int13 = stackTestDriver5.size();
        int int14 = stackTestDriver5.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = stackTestDriver5.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test078");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        int int9 = stackTestDriver5.size();
        boolean boolean10 = stackTestDriver5.isEmpty();
        int int11 = stackTestDriver5.size();
        stackTestDriver5.clear();
        boolean boolean13 = stackTestDriver5.isEmpty();
        stackTestDriver5.clear();
        java.lang.Class<?> wildcardClass15 = stackTestDriver5.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test079");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        int int9 = stackTestDriver5.size();
        java.lang.Object obj11 = stackTestDriver5.push((java.lang.Object) (-1.0d));
        experiment.util.StackTestDriver stackTestDriver12 = new experiment.util.StackTestDriver();
        java.lang.Object obj14 = stackTestDriver12.push((java.lang.Object) (byte) -1);
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        java.lang.Object obj17 = stackTestDriver15.push((java.lang.Object) (byte) -1);
        boolean boolean18 = stackTestDriver15.isEmpty();
        boolean boolean19 = stackTestDriver15.isEmpty();
        int int20 = stackTestDriver15.size();
        java.lang.Object obj21 = new java.lang.Object();
        java.lang.Class<?> wildcardClass22 = obj21.getClass();
        java.lang.Object obj23 = stackTestDriver15.push((java.lang.Object) wildcardClass22);
        java.lang.Object obj24 = stackTestDriver15.peek();
        java.lang.Object obj25 = stackTestDriver12.push((java.lang.Object) stackTestDriver15);
        java.lang.Object obj26 = stackTestDriver5.push((java.lang.Object) stackTestDriver15);
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (-1.0d) + "'", obj11, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (byte) -1 + "'", obj14, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) -1 + "'", obj17, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertEquals(obj23.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj23), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj23), "class java.lang.Object");
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals(obj24.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj24), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj24), "class java.lang.Object");
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNotNull(obj26);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test080");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        int int9 = stackTestDriver5.size();
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        java.lang.Object obj12 = stackTestDriver10.push((java.lang.Object) (byte) -1);
        boolean boolean13 = stackTestDriver10.isEmpty();
        java.lang.Object obj14 = stackTestDriver10.pop();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        java.lang.Object obj17 = stackTestDriver15.push((java.lang.Object) (byte) -1);
        java.lang.Object obj18 = stackTestDriver10.push((java.lang.Object) stackTestDriver15);
        boolean boolean19 = stackTestDriver15.isEmpty();
        java.lang.Object obj20 = stackTestDriver5.push((java.lang.Object) stackTestDriver15);
        java.lang.Object obj22 = stackTestDriver15.push((java.lang.Object) 10);
        int int23 = stackTestDriver15.size();
        int int24 = stackTestDriver15.size();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) -1 + "'", obj12, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (byte) -1 + "'", obj14, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) -1 + "'", obj17, (byte) -1);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 10 + "'", obj22, 10);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test081");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        boolean boolean9 = stackTestDriver5.isEmpty();
        java.lang.Object obj11 = stackTestDriver5.push((java.lang.Object) 100);
        experiment.util.StackTestDriver stackTestDriver12 = new experiment.util.StackTestDriver();
        java.lang.Object obj14 = stackTestDriver12.push((java.lang.Object) (byte) -1);
        boolean boolean15 = stackTestDriver12.isEmpty();
        java.lang.Object obj16 = stackTestDriver12.pop();
        int int17 = stackTestDriver12.size();
        experiment.util.StackTestDriver stackTestDriver18 = new experiment.util.StackTestDriver();
        java.lang.Object obj20 = stackTestDriver18.push((java.lang.Object) (byte) -1);
        boolean boolean21 = stackTestDriver18.isEmpty();
        java.lang.Object obj22 = stackTestDriver18.pop();
        experiment.util.StackTestDriver stackTestDriver23 = new experiment.util.StackTestDriver();
        java.lang.Object obj25 = stackTestDriver23.push((java.lang.Object) (byte) -1);
        java.lang.Object obj26 = stackTestDriver18.push((java.lang.Object) stackTestDriver23);
        int int27 = stackTestDriver23.size();
        java.lang.Object obj28 = stackTestDriver12.push((java.lang.Object) stackTestDriver23);
        java.lang.Object obj29 = new java.lang.Object();
        java.lang.Object obj30 = stackTestDriver23.push(obj29);
        boolean boolean31 = stackTestDriver23.isEmpty();
        java.lang.Object obj32 = stackTestDriver5.push((java.lang.Object) stackTestDriver23);
        stackTestDriver5.clear();
        experiment.util.StackTestDriver stackTestDriver34 = new experiment.util.StackTestDriver();
        java.lang.Object obj36 = stackTestDriver34.push((java.lang.Object) (byte) -1);
        experiment.util.StackTestDriver stackTestDriver37 = new experiment.util.StackTestDriver();
        java.lang.Object obj39 = stackTestDriver37.push((java.lang.Object) (byte) -1);
        boolean boolean40 = stackTestDriver37.isEmpty();
        boolean boolean41 = stackTestDriver37.isEmpty();
        int int42 = stackTestDriver37.size();
        java.lang.Object obj43 = new java.lang.Object();
        java.lang.Class<?> wildcardClass44 = obj43.getClass();
        java.lang.Object obj45 = stackTestDriver37.push((java.lang.Object) wildcardClass44);
        java.lang.Object obj46 = stackTestDriver37.peek();
        java.lang.Object obj47 = stackTestDriver34.push((java.lang.Object) stackTestDriver37);
        int int48 = stackTestDriver37.size();
        java.lang.Object obj49 = stackTestDriver5.push((java.lang.Object) stackTestDriver37);
        java.lang.Object obj50 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj51 = stackTestDriver37.push(obj50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 100 + "'", obj11, 100);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (byte) -1 + "'", obj14, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (byte) -1 + "'", obj16, (byte) -1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (byte) -1 + "'", obj20, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (byte) -1 + "'", obj22, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (byte) -1 + "'", obj25, (byte) -1);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + (byte) -1 + "'", obj36, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + (byte) -1 + "'", obj39, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertEquals(obj45.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj45), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj45), "class java.lang.Object");
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertEquals(obj46.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj46), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj46), "class java.lang.Object");
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 2 + "'", int48 == 2);
        org.junit.Assert.assertNotNull(obj49);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test082");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        int int4 = stackTestDriver0.size();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        java.lang.Class<?> wildcardClass7 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test083");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        int int9 = stackTestDriver5.size();
        boolean boolean10 = stackTestDriver5.isEmpty();
        stackTestDriver5.clear();
        boolean boolean12 = stackTestDriver5.isEmpty();
        int int13 = stackTestDriver5.size();
        int int14 = stackTestDriver5.size();
        stackTestDriver5.clear();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test084");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        int int9 = stackTestDriver5.size();
        boolean boolean10 = stackTestDriver5.isEmpty();
        stackTestDriver5.clear();
        int int12 = stackTestDriver5.size();
        experiment.util.StackTestDriver stackTestDriver13 = new experiment.util.StackTestDriver();
        java.lang.Object obj15 = stackTestDriver13.push((java.lang.Object) (byte) -1);
        boolean boolean16 = stackTestDriver13.isEmpty();
        java.lang.Object obj18 = stackTestDriver13.push((java.lang.Object) 10.0f);
        java.lang.Object obj19 = stackTestDriver13.pop();
        boolean boolean20 = stackTestDriver13.isEmpty();
        java.lang.Object obj21 = stackTestDriver5.push((java.lang.Object) stackTestDriver13);
        experiment.util.StackTestDriver stackTestDriver22 = new experiment.util.StackTestDriver();
        java.lang.Object obj24 = stackTestDriver22.push((java.lang.Object) (byte) -1);
        boolean boolean25 = stackTestDriver22.isEmpty();
        java.lang.Object obj27 = stackTestDriver22.push((java.lang.Object) 10.0f);
        java.lang.Object obj28 = stackTestDriver22.pop();
        java.lang.Object obj29 = stackTestDriver22.peek();
        boolean boolean30 = stackTestDriver22.isEmpty();
        boolean boolean31 = stackTestDriver22.isEmpty();
        java.lang.Object obj32 = stackTestDriver5.push((java.lang.Object) boolean31);
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (byte) -1 + "'", obj15, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 10.0f + "'", obj18, 10.0f);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 10.0f + "'", obj19, 10.0f);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (byte) -1 + "'", obj24, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 10.0f + "'", obj27, 10.0f);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + 10.0f + "'", obj28, 10.0f);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + (byte) -1 + "'", obj29, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + false + "'", obj32, false);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test085");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        boolean boolean9 = stackTestDriver5.isEmpty();
        java.lang.Object obj11 = stackTestDriver5.push((java.lang.Object) 100);
        experiment.util.StackTestDriver stackTestDriver12 = new experiment.util.StackTestDriver();
        java.lang.Object obj14 = stackTestDriver12.push((java.lang.Object) (byte) -1);
        boolean boolean15 = stackTestDriver12.isEmpty();
        java.lang.Object obj16 = stackTestDriver12.pop();
        int int17 = stackTestDriver12.size();
        experiment.util.StackTestDriver stackTestDriver18 = new experiment.util.StackTestDriver();
        java.lang.Object obj20 = stackTestDriver18.push((java.lang.Object) (byte) -1);
        boolean boolean21 = stackTestDriver18.isEmpty();
        java.lang.Object obj22 = stackTestDriver18.pop();
        experiment.util.StackTestDriver stackTestDriver23 = new experiment.util.StackTestDriver();
        java.lang.Object obj25 = stackTestDriver23.push((java.lang.Object) (byte) -1);
        java.lang.Object obj26 = stackTestDriver18.push((java.lang.Object) stackTestDriver23);
        int int27 = stackTestDriver23.size();
        java.lang.Object obj28 = stackTestDriver12.push((java.lang.Object) stackTestDriver23);
        java.lang.Object obj29 = new java.lang.Object();
        java.lang.Object obj30 = stackTestDriver23.push(obj29);
        boolean boolean31 = stackTestDriver23.isEmpty();
        java.lang.Object obj32 = stackTestDriver5.push((java.lang.Object) stackTestDriver23);
        stackTestDriver5.clear();
        experiment.util.StackTestDriver stackTestDriver34 = new experiment.util.StackTestDriver();
        java.lang.Object obj36 = stackTestDriver34.push((java.lang.Object) (byte) -1);
        experiment.util.StackTestDriver stackTestDriver37 = new experiment.util.StackTestDriver();
        java.lang.Object obj39 = stackTestDriver37.push((java.lang.Object) (byte) -1);
        boolean boolean40 = stackTestDriver37.isEmpty();
        boolean boolean41 = stackTestDriver37.isEmpty();
        int int42 = stackTestDriver37.size();
        java.lang.Object obj43 = new java.lang.Object();
        java.lang.Class<?> wildcardClass44 = obj43.getClass();
        java.lang.Object obj45 = stackTestDriver37.push((java.lang.Object) wildcardClass44);
        java.lang.Object obj46 = stackTestDriver37.peek();
        java.lang.Object obj47 = stackTestDriver34.push((java.lang.Object) stackTestDriver37);
        int int48 = stackTestDriver37.size();
        java.lang.Object obj49 = stackTestDriver5.push((java.lang.Object) stackTestDriver37);
        experiment.util.StackTestDriver stackTestDriver50 = new experiment.util.StackTestDriver();
        java.lang.Object obj52 = stackTestDriver50.push((java.lang.Object) (byte) -1);
        boolean boolean53 = stackTestDriver50.isEmpty();
        java.lang.Object obj54 = stackTestDriver50.pop();
        experiment.util.StackTestDriver stackTestDriver55 = new experiment.util.StackTestDriver();
        java.lang.Object obj57 = stackTestDriver55.push((java.lang.Object) (byte) -1);
        java.lang.Object obj58 = stackTestDriver50.push((java.lang.Object) stackTestDriver55);
        int int59 = stackTestDriver55.size();
        boolean boolean60 = stackTestDriver55.isEmpty();
        stackTestDriver55.clear();
        int int62 = stackTestDriver55.size();
        java.lang.Object obj63 = stackTestDriver5.push((java.lang.Object) int62);
        java.lang.Object obj64 = stackTestDriver5.pop();
        java.lang.Object obj65 = stackTestDriver5.peek();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 100 + "'", obj11, 100);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (byte) -1 + "'", obj14, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (byte) -1 + "'", obj16, (byte) -1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (byte) -1 + "'", obj20, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (byte) -1 + "'", obj22, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (byte) -1 + "'", obj25, (byte) -1);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + (byte) -1 + "'", obj36, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + (byte) -1 + "'", obj39, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertEquals(obj45.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj45), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj45), "class java.lang.Object");
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertEquals(obj46.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj46), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj46), "class java.lang.Object");
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 2 + "'", int48 == 2);
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertEquals("'" + obj52 + "' != '" + (byte) -1 + "'", obj52, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertEquals("'" + obj54 + "' != '" + (byte) -1 + "'", obj54, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj57 + "' != '" + (byte) -1 + "'", obj57, (byte) -1);
        org.junit.Assert.assertNotNull(obj58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1 + "'", int59 == 1);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertEquals("'" + obj63 + "' != '" + 0 + "'", obj63, 0);
        org.junit.Assert.assertEquals("'" + obj64 + "' != '" + 0 + "'", obj64, 0);
        org.junit.Assert.assertNotNull(obj65);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test086");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        int int9 = stackTestDriver5.size();
        java.lang.Object obj10 = stackTestDriver5.peek();
        boolean boolean11 = stackTestDriver5.isEmpty();
        stackTestDriver5.clear();
        int int13 = stackTestDriver5.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = stackTestDriver5.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test087");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        boolean boolean9 = stackTestDriver5.isEmpty();
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        java.lang.Object obj12 = stackTestDriver10.push((java.lang.Object) (byte) -1);
        boolean boolean13 = stackTestDriver10.isEmpty();
        java.lang.Object obj14 = stackTestDriver10.pop();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        java.lang.Object obj17 = stackTestDriver15.push((java.lang.Object) (byte) -1);
        java.lang.Object obj18 = stackTestDriver10.push((java.lang.Object) stackTestDriver15);
        int int19 = stackTestDriver15.size();
        java.lang.Object obj20 = stackTestDriver15.peek();
        boolean boolean21 = stackTestDriver15.isEmpty();
        stackTestDriver15.clear();
        experiment.util.StackTestDriver stackTestDriver23 = new experiment.util.StackTestDriver();
        java.lang.Object obj25 = stackTestDriver23.push((java.lang.Object) (byte) -1);
        boolean boolean26 = stackTestDriver23.isEmpty();
        boolean boolean27 = stackTestDriver23.isEmpty();
        int int28 = stackTestDriver23.size();
        java.lang.Class<?> wildcardClass29 = stackTestDriver23.getClass();
        java.lang.Object obj30 = stackTestDriver15.push((java.lang.Object) wildcardClass29);
        java.lang.Class<?> wildcardClass31 = stackTestDriver15.getClass();
        java.lang.Object obj32 = stackTestDriver5.push((java.lang.Object) wildcardClass31);
        java.lang.Object obj33 = stackTestDriver5.pop();
        java.lang.Class<?> wildcardClass34 = stackTestDriver5.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) -1 + "'", obj12, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (byte) -1 + "'", obj14, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) -1 + "'", obj17, (byte) -1);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (byte) -1 + "'", obj20, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (byte) -1 + "'", obj25, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertEquals(obj30.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj30), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj30), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertEquals(obj32.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj32), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj32), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertEquals(obj33.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj33), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj33), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test088");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        boolean boolean9 = stackTestDriver5.isEmpty();
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        java.lang.Object obj12 = stackTestDriver10.push((java.lang.Object) (byte) -1);
        boolean boolean13 = stackTestDriver10.isEmpty();
        java.lang.Object obj14 = stackTestDriver10.pop();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        java.lang.Object obj17 = stackTestDriver15.push((java.lang.Object) (byte) -1);
        java.lang.Object obj18 = stackTestDriver10.push((java.lang.Object) stackTestDriver15);
        int int19 = stackTestDriver15.size();
        java.lang.Object obj20 = stackTestDriver15.peek();
        boolean boolean21 = stackTestDriver15.isEmpty();
        stackTestDriver15.clear();
        experiment.util.StackTestDriver stackTestDriver23 = new experiment.util.StackTestDriver();
        java.lang.Object obj25 = stackTestDriver23.push((java.lang.Object) (byte) -1);
        boolean boolean26 = stackTestDriver23.isEmpty();
        boolean boolean27 = stackTestDriver23.isEmpty();
        int int28 = stackTestDriver23.size();
        java.lang.Class<?> wildcardClass29 = stackTestDriver23.getClass();
        java.lang.Object obj30 = stackTestDriver15.push((java.lang.Object) wildcardClass29);
        java.lang.Class<?> wildcardClass31 = stackTestDriver15.getClass();
        java.lang.Object obj32 = stackTestDriver5.push((java.lang.Object) wildcardClass31);
        java.lang.Object obj33 = stackTestDriver5.pop();
        experiment.util.StackTestDriver stackTestDriver34 = new experiment.util.StackTestDriver();
        java.lang.Object obj36 = stackTestDriver34.push((java.lang.Object) (byte) -1);
        boolean boolean37 = stackTestDriver34.isEmpty();
        int int38 = stackTestDriver34.size();
        java.lang.Object obj39 = stackTestDriver34.pop();
        experiment.util.StackTestDriver stackTestDriver40 = new experiment.util.StackTestDriver();
        java.lang.Object obj41 = stackTestDriver34.push((java.lang.Object) stackTestDriver40);
        java.lang.Object obj42 = stackTestDriver5.push((java.lang.Object) stackTestDriver34);
        java.lang.Object obj43 = stackTestDriver5.peek();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) -1 + "'", obj12, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (byte) -1 + "'", obj14, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) -1 + "'", obj17, (byte) -1);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (byte) -1 + "'", obj20, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (byte) -1 + "'", obj25, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertEquals(obj30.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj30), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj30), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertEquals(obj32.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj32), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj32), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertEquals(obj33.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj33), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj33), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + (byte) -1 + "'", obj36, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + (byte) -1 + "'", obj39, (byte) -1);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertNotNull(obj43);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test089");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        boolean boolean4 = stackTestDriver0.isEmpty();
        int int5 = stackTestDriver0.size();
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) "hi!");
        java.lang.Object obj8 = stackTestDriver0.peek();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + "hi!" + "'", obj7, "hi!");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "hi!" + "'", obj8, "hi!");
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test090");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        boolean boolean4 = stackTestDriver0.isEmpty();
        int int5 = stackTestDriver0.size();
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) wildcardClass7);
        java.lang.Object obj9 = stackTestDriver0.peek();
        int int10 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver11 = new experiment.util.StackTestDriver();
        java.lang.Object obj13 = stackTestDriver11.push((java.lang.Object) (byte) -1);
        boolean boolean14 = stackTestDriver11.isEmpty();
        java.lang.Object obj15 = stackTestDriver11.pop();
        experiment.util.StackTestDriver stackTestDriver16 = new experiment.util.StackTestDriver();
        java.lang.Object obj18 = stackTestDriver16.push((java.lang.Object) (byte) -1);
        java.lang.Object obj19 = stackTestDriver11.push((java.lang.Object) stackTestDriver16);
        boolean boolean20 = stackTestDriver16.isEmpty();
        java.lang.Object obj22 = stackTestDriver16.push((java.lang.Object) 100);
        experiment.util.StackTestDriver stackTestDriver23 = new experiment.util.StackTestDriver();
        java.lang.Object obj25 = stackTestDriver23.push((java.lang.Object) (byte) -1);
        boolean boolean26 = stackTestDriver23.isEmpty();
        java.lang.Object obj27 = stackTestDriver23.pop();
        int int28 = stackTestDriver23.size();
        experiment.util.StackTestDriver stackTestDriver29 = new experiment.util.StackTestDriver();
        java.lang.Object obj31 = stackTestDriver29.push((java.lang.Object) (byte) -1);
        boolean boolean32 = stackTestDriver29.isEmpty();
        java.lang.Object obj33 = stackTestDriver29.pop();
        experiment.util.StackTestDriver stackTestDriver34 = new experiment.util.StackTestDriver();
        java.lang.Object obj36 = stackTestDriver34.push((java.lang.Object) (byte) -1);
        java.lang.Object obj37 = stackTestDriver29.push((java.lang.Object) stackTestDriver34);
        int int38 = stackTestDriver34.size();
        java.lang.Object obj39 = stackTestDriver23.push((java.lang.Object) stackTestDriver34);
        java.lang.Object obj40 = new java.lang.Object();
        java.lang.Object obj41 = stackTestDriver34.push(obj40);
        boolean boolean42 = stackTestDriver34.isEmpty();
        java.lang.Object obj43 = stackTestDriver16.push((java.lang.Object) stackTestDriver34);
        java.lang.Object obj44 = stackTestDriver34.peek();
        java.lang.Object obj45 = stackTestDriver0.push((java.lang.Object) stackTestDriver34);
        java.lang.Class<?> wildcardClass46 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "class java.lang.Object");
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "class java.lang.Object");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (byte) -1 + "'", obj13, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (byte) -1 + "'", obj15, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (byte) -1 + "'", obj18, (byte) -1);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 100 + "'", obj22, 100);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (byte) -1 + "'", obj25, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + (byte) -1 + "'", obj27, (byte) -1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + (byte) -1 + "'", obj31, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + (byte) -1 + "'", obj33, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + (byte) -1 + "'", obj36, (byte) -1);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(obj43);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test091");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        int int3 = stackTestDriver0.size();
        java.lang.Object obj4 = stackTestDriver0.pop();
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test092");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        int int9 = stackTestDriver5.size();
        boolean boolean10 = stackTestDriver5.isEmpty();
        stackTestDriver5.clear();
        boolean boolean12 = stackTestDriver5.isEmpty();
        int int13 = stackTestDriver5.size();
        int int14 = stackTestDriver5.size();
        int int15 = stackTestDriver5.size();
        stackTestDriver5.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = stackTestDriver5.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test093");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        int int9 = stackTestDriver5.size();
        boolean boolean10 = stackTestDriver5.isEmpty();
        stackTestDriver5.clear();
        boolean boolean12 = stackTestDriver5.isEmpty();
        int int13 = stackTestDriver5.size();
        experiment.util.StackTestDriver stackTestDriver14 = new experiment.util.StackTestDriver();
        java.lang.Object obj16 = stackTestDriver14.push((java.lang.Object) (byte) -1);
        boolean boolean17 = stackTestDriver14.isEmpty();
        java.lang.Object obj18 = stackTestDriver14.pop();
        experiment.util.StackTestDriver stackTestDriver19 = new experiment.util.StackTestDriver();
        java.lang.Object obj21 = stackTestDriver19.push((java.lang.Object) (byte) -1);
        java.lang.Object obj22 = stackTestDriver14.push((java.lang.Object) stackTestDriver19);
        boolean boolean23 = stackTestDriver19.isEmpty();
        stackTestDriver19.clear();
        java.lang.Object obj25 = stackTestDriver5.push((java.lang.Object) stackTestDriver19);
        java.lang.Object obj26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj27 = stackTestDriver19.push(obj26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (byte) -1 + "'", obj16, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (byte) -1 + "'", obj18, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (byte) -1 + "'", obj21, (byte) -1);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(obj25);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test094");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        int int9 = stackTestDriver5.size();
        boolean boolean10 = stackTestDriver5.isEmpty();
        stackTestDriver5.clear();
        boolean boolean12 = stackTestDriver5.isEmpty();
        int int13 = stackTestDriver5.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = stackTestDriver5.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test095");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        boolean boolean4 = stackTestDriver0.isEmpty();
        int int5 = stackTestDriver0.size();
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) wildcardClass7);
        int int9 = stackTestDriver0.size();
        int int10 = stackTestDriver0.size();
        boolean boolean11 = stackTestDriver0.isEmpty();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "class java.lang.Object");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test096");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        boolean boolean9 = stackTestDriver5.isEmpty();
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        java.lang.Object obj12 = stackTestDriver10.push((java.lang.Object) (byte) -1);
        boolean boolean13 = stackTestDriver10.isEmpty();
        java.lang.Object obj14 = stackTestDriver10.pop();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        java.lang.Object obj17 = stackTestDriver15.push((java.lang.Object) (byte) -1);
        java.lang.Object obj18 = stackTestDriver10.push((java.lang.Object) stackTestDriver15);
        int int19 = stackTestDriver15.size();
        boolean boolean20 = stackTestDriver15.isEmpty();
        stackTestDriver15.clear();
        boolean boolean22 = stackTestDriver15.isEmpty();
        int int23 = stackTestDriver15.size();
        java.lang.Object obj24 = stackTestDriver5.push((java.lang.Object) int23);
        experiment.util.StackTestDriver stackTestDriver25 = new experiment.util.StackTestDriver();
        java.lang.Object obj27 = stackTestDriver25.push((java.lang.Object) (byte) -1);
        boolean boolean28 = stackTestDriver25.isEmpty();
        java.lang.Object obj29 = stackTestDriver25.pop();
        experiment.util.StackTestDriver stackTestDriver30 = new experiment.util.StackTestDriver();
        java.lang.Object obj32 = stackTestDriver30.push((java.lang.Object) (byte) -1);
        java.lang.Object obj33 = stackTestDriver25.push((java.lang.Object) stackTestDriver30);
        int int34 = stackTestDriver30.size();
        java.lang.Object obj35 = stackTestDriver30.peek();
        java.lang.Object obj36 = stackTestDriver30.pop();
        java.lang.Object obj37 = stackTestDriver5.push(obj36);
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) -1 + "'", obj12, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (byte) -1 + "'", obj14, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) -1 + "'", obj17, (byte) -1);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 0 + "'", obj24, 0);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + (byte) -1 + "'", obj27, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + (byte) -1 + "'", obj29, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + (byte) -1 + "'", obj32, (byte) -1);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + (byte) -1 + "'", obj35, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + (byte) -1 + "'", obj36, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + (byte) -1 + "'", obj37, (byte) -1);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test097");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        experiment.util.StackTestDriver stackTestDriver3 = new experiment.util.StackTestDriver();
        java.lang.Object obj5 = stackTestDriver3.push((java.lang.Object) (byte) -1);
        boolean boolean6 = stackTestDriver3.isEmpty();
        boolean boolean7 = stackTestDriver3.isEmpty();
        int int8 = stackTestDriver3.size();
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        java.lang.Object obj11 = stackTestDriver3.push((java.lang.Object) wildcardClass10);
        java.lang.Object obj12 = stackTestDriver3.peek();
        java.lang.Object obj13 = stackTestDriver0.push((java.lang.Object) stackTestDriver3);
        int int14 = stackTestDriver3.size();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        java.lang.Object obj17 = stackTestDriver15.push((java.lang.Object) (byte) -1);
        boolean boolean18 = stackTestDriver15.isEmpty();
        int int19 = stackTestDriver15.size();
        stackTestDriver15.clear();
        stackTestDriver15.clear();
        java.lang.Object obj22 = stackTestDriver3.push((java.lang.Object) stackTestDriver15);
        java.lang.Class<?> wildcardClass23 = stackTestDriver15.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) -1 + "'", obj5, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "class java.lang.Object");
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "class java.lang.Object");
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) -1 + "'", obj17, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test098");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        int int9 = stackTestDriver5.size();
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        java.lang.Object obj12 = stackTestDriver10.push((java.lang.Object) (byte) -1);
        boolean boolean13 = stackTestDriver10.isEmpty();
        java.lang.Object obj14 = stackTestDriver10.pop();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        java.lang.Object obj17 = stackTestDriver15.push((java.lang.Object) (byte) -1);
        java.lang.Object obj18 = stackTestDriver10.push((java.lang.Object) stackTestDriver15);
        boolean boolean19 = stackTestDriver15.isEmpty();
        java.lang.Object obj20 = stackTestDriver5.push((java.lang.Object) stackTestDriver15);
        java.lang.Object obj22 = stackTestDriver15.push((java.lang.Object) 10);
        experiment.util.StackTestDriver stackTestDriver23 = new experiment.util.StackTestDriver();
        java.lang.Object obj25 = stackTestDriver23.push((java.lang.Object) (byte) -1);
        boolean boolean26 = stackTestDriver23.isEmpty();
        boolean boolean27 = stackTestDriver23.isEmpty();
        int int28 = stackTestDriver23.size();
        java.lang.Object obj29 = new java.lang.Object();
        java.lang.Class<?> wildcardClass30 = obj29.getClass();
        java.lang.Object obj31 = stackTestDriver23.push((java.lang.Object) wildcardClass30);
        int int32 = stackTestDriver23.size();
        int int33 = stackTestDriver23.size();
        java.lang.Object obj34 = stackTestDriver15.push((java.lang.Object) int33);
        experiment.util.StackTestDriver stackTestDriver35 = new experiment.util.StackTestDriver();
        java.lang.Object obj37 = stackTestDriver35.push((java.lang.Object) (byte) -1);
        int int38 = stackTestDriver35.size();
        experiment.util.StackTestDriver stackTestDriver39 = new experiment.util.StackTestDriver();
        java.lang.Object obj41 = stackTestDriver39.push((java.lang.Object) (byte) -1);
        boolean boolean42 = stackTestDriver39.isEmpty();
        java.lang.Object obj43 = stackTestDriver39.pop();
        experiment.util.StackTestDriver stackTestDriver44 = new experiment.util.StackTestDriver();
        java.lang.Object obj46 = stackTestDriver44.push((java.lang.Object) (byte) -1);
        java.lang.Object obj47 = stackTestDriver39.push((java.lang.Object) stackTestDriver44);
        int int48 = stackTestDriver44.size();
        experiment.util.StackTestDriver stackTestDriver49 = new experiment.util.StackTestDriver();
        java.lang.Object obj51 = stackTestDriver49.push((java.lang.Object) (byte) -1);
        boolean boolean52 = stackTestDriver49.isEmpty();
        java.lang.Object obj53 = stackTestDriver49.pop();
        experiment.util.StackTestDriver stackTestDriver54 = new experiment.util.StackTestDriver();
        java.lang.Object obj56 = stackTestDriver54.push((java.lang.Object) (byte) -1);
        java.lang.Object obj57 = stackTestDriver49.push((java.lang.Object) stackTestDriver54);
        boolean boolean58 = stackTestDriver54.isEmpty();
        java.lang.Object obj59 = stackTestDriver44.push((java.lang.Object) stackTestDriver54);
        java.lang.Object obj60 = stackTestDriver35.push(obj59);
        java.lang.Object obj61 = stackTestDriver15.push((java.lang.Object) stackTestDriver35);
        java.lang.Object obj62 = stackTestDriver15.peek();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) -1 + "'", obj12, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (byte) -1 + "'", obj14, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) -1 + "'", obj17, (byte) -1);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 10 + "'", obj22, 10);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (byte) -1 + "'", obj25, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertEquals(obj31.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj31), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj31), "class java.lang.Object");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2 + "'", int32 == 2);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2 + "'", int33 == 2);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + 2 + "'", obj34, 2);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + (byte) -1 + "'", obj37, (byte) -1);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + (byte) -1 + "'", obj41, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + (byte) -1 + "'", obj43, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + (byte) -1 + "'", obj46, (byte) -1);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertEquals("'" + obj51 + "' != '" + (byte) -1 + "'", obj51, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + obj53 + "' != '" + (byte) -1 + "'", obj53, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj56 + "' != '" + (byte) -1 + "'", obj56, (byte) -1);
        org.junit.Assert.assertNotNull(obj57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(obj59);
        org.junit.Assert.assertNotNull(obj60);
        org.junit.Assert.assertNotNull(obj61);
        org.junit.Assert.assertNotNull(obj62);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test099");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        boolean boolean9 = stackTestDriver5.isEmpty();
        java.lang.Object obj11 = stackTestDriver5.push((java.lang.Object) 100);
        experiment.util.StackTestDriver stackTestDriver12 = new experiment.util.StackTestDriver();
        java.lang.Object obj14 = stackTestDriver12.push((java.lang.Object) (byte) -1);
        boolean boolean15 = stackTestDriver12.isEmpty();
        java.lang.Object obj16 = stackTestDriver12.pop();
        int int17 = stackTestDriver12.size();
        experiment.util.StackTestDriver stackTestDriver18 = new experiment.util.StackTestDriver();
        java.lang.Object obj20 = stackTestDriver18.push((java.lang.Object) (byte) -1);
        boolean boolean21 = stackTestDriver18.isEmpty();
        java.lang.Object obj22 = stackTestDriver18.pop();
        experiment.util.StackTestDriver stackTestDriver23 = new experiment.util.StackTestDriver();
        java.lang.Object obj25 = stackTestDriver23.push((java.lang.Object) (byte) -1);
        java.lang.Object obj26 = stackTestDriver18.push((java.lang.Object) stackTestDriver23);
        int int27 = stackTestDriver23.size();
        java.lang.Object obj28 = stackTestDriver12.push((java.lang.Object) stackTestDriver23);
        java.lang.Object obj29 = new java.lang.Object();
        java.lang.Object obj30 = stackTestDriver23.push(obj29);
        boolean boolean31 = stackTestDriver23.isEmpty();
        java.lang.Object obj32 = stackTestDriver5.push((java.lang.Object) stackTestDriver23);
        stackTestDriver5.clear();
        experiment.util.StackTestDriver stackTestDriver34 = new experiment.util.StackTestDriver();
        java.lang.Object obj36 = stackTestDriver34.push((java.lang.Object) (byte) -1);
        experiment.util.StackTestDriver stackTestDriver37 = new experiment.util.StackTestDriver();
        java.lang.Object obj39 = stackTestDriver37.push((java.lang.Object) (byte) -1);
        boolean boolean40 = stackTestDriver37.isEmpty();
        boolean boolean41 = stackTestDriver37.isEmpty();
        int int42 = stackTestDriver37.size();
        java.lang.Object obj43 = new java.lang.Object();
        java.lang.Class<?> wildcardClass44 = obj43.getClass();
        java.lang.Object obj45 = stackTestDriver37.push((java.lang.Object) wildcardClass44);
        java.lang.Object obj46 = stackTestDriver37.peek();
        java.lang.Object obj47 = stackTestDriver34.push((java.lang.Object) stackTestDriver37);
        int int48 = stackTestDriver37.size();
        java.lang.Object obj49 = stackTestDriver5.push((java.lang.Object) stackTestDriver37);
        java.lang.Class<?> wildcardClass50 = obj49.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 100 + "'", obj11, 100);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (byte) -1 + "'", obj14, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (byte) -1 + "'", obj16, (byte) -1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (byte) -1 + "'", obj20, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (byte) -1 + "'", obj22, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (byte) -1 + "'", obj25, (byte) -1);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + (byte) -1 + "'", obj36, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + (byte) -1 + "'", obj39, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertEquals(obj45.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj45), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj45), "class java.lang.Object");
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertEquals(obj46.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj46), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj46), "class java.lang.Object");
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 2 + "'", int48 == 2);
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test100");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        int int5 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        java.lang.Object obj8 = stackTestDriver6.push((java.lang.Object) (byte) -1);
        boolean boolean9 = stackTestDriver6.isEmpty();
        java.lang.Object obj10 = stackTestDriver6.pop();
        experiment.util.StackTestDriver stackTestDriver11 = new experiment.util.StackTestDriver();
        java.lang.Object obj13 = stackTestDriver11.push((java.lang.Object) (byte) -1);
        java.lang.Object obj14 = stackTestDriver6.push((java.lang.Object) stackTestDriver11);
        int int15 = stackTestDriver11.size();
        java.lang.Object obj16 = stackTestDriver0.push((java.lang.Object) stackTestDriver11);
        java.lang.Object obj17 = new java.lang.Object();
        java.lang.Object obj18 = stackTestDriver11.push(obj17);
        stackTestDriver11.clear();
        java.lang.Class<?> wildcardClass20 = stackTestDriver11.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) -1 + "'", obj8, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (byte) -1 + "'", obj13, (byte) -1);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test101");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        int int5 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        java.lang.Object obj8 = stackTestDriver6.push((java.lang.Object) (byte) -1);
        java.lang.Object obj9 = stackTestDriver0.push(obj8);
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        java.lang.Object obj12 = stackTestDriver10.push((java.lang.Object) (byte) -1);
        boolean boolean13 = stackTestDriver10.isEmpty();
        java.lang.Object obj14 = stackTestDriver10.pop();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        java.lang.Object obj17 = stackTestDriver15.push((java.lang.Object) (byte) -1);
        java.lang.Object obj18 = stackTestDriver10.push((java.lang.Object) stackTestDriver15);
        int int19 = stackTestDriver15.size();
        experiment.util.StackTestDriver stackTestDriver20 = new experiment.util.StackTestDriver();
        java.lang.Object obj22 = stackTestDriver20.push((java.lang.Object) (byte) -1);
        boolean boolean23 = stackTestDriver20.isEmpty();
        java.lang.Object obj24 = stackTestDriver20.pop();
        experiment.util.StackTestDriver stackTestDriver25 = new experiment.util.StackTestDriver();
        java.lang.Object obj27 = stackTestDriver25.push((java.lang.Object) (byte) -1);
        java.lang.Object obj28 = stackTestDriver20.push((java.lang.Object) stackTestDriver25);
        boolean boolean29 = stackTestDriver25.isEmpty();
        java.lang.Object obj30 = stackTestDriver15.push((java.lang.Object) stackTestDriver25);
        java.lang.Object obj32 = stackTestDriver25.push((java.lang.Object) 10);
        java.lang.Object obj33 = stackTestDriver25.pop();
        java.lang.Object obj34 = stackTestDriver0.push(obj33);
        java.lang.Object obj35 = stackTestDriver0.peek();
        java.lang.Object obj36 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver37 = new experiment.util.StackTestDriver();
        java.lang.Object obj39 = stackTestDriver37.push((java.lang.Object) (byte) -1);
        boolean boolean40 = stackTestDriver37.isEmpty();
        java.lang.Object obj41 = stackTestDriver37.pop();
        experiment.util.StackTestDriver stackTestDriver42 = new experiment.util.StackTestDriver();
        java.lang.Object obj44 = stackTestDriver42.push((java.lang.Object) (byte) -1);
        java.lang.Object obj45 = stackTestDriver37.push((java.lang.Object) stackTestDriver42);
        int int46 = stackTestDriver42.size();
        boolean boolean47 = stackTestDriver42.isEmpty();
        stackTestDriver42.clear();
        boolean boolean49 = stackTestDriver42.isEmpty();
        boolean boolean50 = stackTestDriver42.isEmpty();
        java.lang.Object obj52 = stackTestDriver42.push((java.lang.Object) "hi!");
        java.lang.Object obj53 = stackTestDriver0.push(obj52);
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) -1 + "'", obj8, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) -1 + "'", obj9, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) -1 + "'", obj12, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (byte) -1 + "'", obj14, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) -1 + "'", obj17, (byte) -1);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (byte) -1 + "'", obj22, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (byte) -1 + "'", obj24, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + (byte) -1 + "'", obj27, (byte) -1);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 10 + "'", obj32, 10);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + 10 + "'", obj33, 10);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + 10 + "'", obj34, 10);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 10 + "'", obj35, 10);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + 10 + "'", obj36, 10);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + (byte) -1 + "'", obj39, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + (byte) -1 + "'", obj41, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + (byte) -1 + "'", obj44, (byte) -1);
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertEquals("'" + obj52 + "' != '" + "hi!" + "'", obj52, "hi!");
        org.junit.Assert.assertEquals("'" + obj53 + "' != '" + "hi!" + "'", obj53, "hi!");
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test102");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        int int9 = stackTestDriver5.size();
        boolean boolean10 = stackTestDriver5.isEmpty();
        stackTestDriver5.clear();
        int int12 = stackTestDriver5.size();
        stackTestDriver5.clear();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test103");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        int int9 = stackTestDriver5.size();
        boolean boolean10 = stackTestDriver5.isEmpty();
        experiment.util.StackTestDriver stackTestDriver11 = new experiment.util.StackTestDriver();
        java.lang.Object obj13 = stackTestDriver11.push((java.lang.Object) (byte) -1);
        boolean boolean14 = stackTestDriver11.isEmpty();
        boolean boolean15 = stackTestDriver11.isEmpty();
        int int16 = stackTestDriver11.size();
        java.lang.Object obj17 = new java.lang.Object();
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        java.lang.Object obj19 = stackTestDriver11.push((java.lang.Object) wildcardClass18);
        java.lang.Object obj20 = stackTestDriver5.push((java.lang.Object) wildcardClass18);
        java.lang.Object obj21 = stackTestDriver5.pop();
        java.lang.Object obj22 = stackTestDriver5.peek();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (byte) -1 + "'", obj13, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "class java.lang.Object");
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "class java.lang.Object");
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals(obj21.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj21), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj21), "class java.lang.Object");
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (byte) -1 + "'", obj22, (byte) -1);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test104");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        int int9 = stackTestDriver5.size();
        boolean boolean10 = stackTestDriver5.isEmpty();
        stackTestDriver5.clear();
        boolean boolean12 = stackTestDriver5.isEmpty();
        boolean boolean13 = stackTestDriver5.isEmpty();
        stackTestDriver5.clear();
        java.lang.Object obj16 = stackTestDriver5.push((java.lang.Object) 1.0d);
        stackTestDriver5.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = stackTestDriver5.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 1.0d + "'", obj16, 1.0d);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test105");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        int int9 = stackTestDriver5.size();
        java.lang.Object obj10 = stackTestDriver5.peek();
        java.lang.Object obj11 = stackTestDriver5.pop();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = stackTestDriver5.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) -1 + "'", obj11, (byte) -1);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test106");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        boolean boolean9 = stackTestDriver5.isEmpty();
        java.lang.Object obj11 = stackTestDriver5.push((java.lang.Object) 100);
        boolean boolean12 = stackTestDriver5.isEmpty();
        stackTestDriver5.clear();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 100 + "'", obj11, 100);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test107");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        boolean boolean4 = stackTestDriver0.isEmpty();
        int int5 = stackTestDriver0.size();
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) wildcardClass7);
        java.lang.Object obj9 = stackTestDriver0.peek();
        int int10 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver11 = new experiment.util.StackTestDriver();
        java.lang.Object obj13 = stackTestDriver11.push((java.lang.Object) (byte) -1);
        boolean boolean14 = stackTestDriver11.isEmpty();
        java.lang.Object obj15 = stackTestDriver11.pop();
        experiment.util.StackTestDriver stackTestDriver16 = new experiment.util.StackTestDriver();
        java.lang.Object obj18 = stackTestDriver16.push((java.lang.Object) (byte) -1);
        java.lang.Object obj19 = stackTestDriver11.push((java.lang.Object) stackTestDriver16);
        boolean boolean20 = stackTestDriver16.isEmpty();
        java.lang.Object obj22 = stackTestDriver16.push((java.lang.Object) 100);
        experiment.util.StackTestDriver stackTestDriver23 = new experiment.util.StackTestDriver();
        java.lang.Object obj25 = stackTestDriver23.push((java.lang.Object) (byte) -1);
        boolean boolean26 = stackTestDriver23.isEmpty();
        java.lang.Object obj27 = stackTestDriver23.pop();
        int int28 = stackTestDriver23.size();
        experiment.util.StackTestDriver stackTestDriver29 = new experiment.util.StackTestDriver();
        java.lang.Object obj31 = stackTestDriver29.push((java.lang.Object) (byte) -1);
        boolean boolean32 = stackTestDriver29.isEmpty();
        java.lang.Object obj33 = stackTestDriver29.pop();
        experiment.util.StackTestDriver stackTestDriver34 = new experiment.util.StackTestDriver();
        java.lang.Object obj36 = stackTestDriver34.push((java.lang.Object) (byte) -1);
        java.lang.Object obj37 = stackTestDriver29.push((java.lang.Object) stackTestDriver34);
        int int38 = stackTestDriver34.size();
        java.lang.Object obj39 = stackTestDriver23.push((java.lang.Object) stackTestDriver34);
        java.lang.Object obj40 = new java.lang.Object();
        java.lang.Object obj41 = stackTestDriver34.push(obj40);
        boolean boolean42 = stackTestDriver34.isEmpty();
        java.lang.Object obj43 = stackTestDriver16.push((java.lang.Object) stackTestDriver34);
        java.lang.Object obj44 = stackTestDriver34.peek();
        java.lang.Object obj45 = stackTestDriver0.push((java.lang.Object) stackTestDriver34);
        java.lang.Class<?> wildcardClass46 = stackTestDriver34.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "class java.lang.Object");
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "class java.lang.Object");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (byte) -1 + "'", obj13, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (byte) -1 + "'", obj15, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (byte) -1 + "'", obj18, (byte) -1);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 100 + "'", obj22, 100);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (byte) -1 + "'", obj25, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + (byte) -1 + "'", obj27, (byte) -1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + (byte) -1 + "'", obj31, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + (byte) -1 + "'", obj33, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + (byte) -1 + "'", obj36, (byte) -1);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(obj43);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test108");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        int int5 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        java.lang.Object obj8 = stackTestDriver6.push((java.lang.Object) (byte) -1);
        boolean boolean9 = stackTestDriver6.isEmpty();
        java.lang.Object obj10 = stackTestDriver6.pop();
        experiment.util.StackTestDriver stackTestDriver11 = new experiment.util.StackTestDriver();
        java.lang.Object obj13 = stackTestDriver11.push((java.lang.Object) (byte) -1);
        java.lang.Object obj14 = stackTestDriver6.push((java.lang.Object) stackTestDriver11);
        int int15 = stackTestDriver11.size();
        java.lang.Object obj16 = stackTestDriver0.push((java.lang.Object) stackTestDriver11);
        java.lang.Object obj17 = new java.lang.Object();
        java.lang.Object obj18 = stackTestDriver11.push(obj17);
        stackTestDriver11.clear();
        experiment.util.StackTestDriver stackTestDriver20 = new experiment.util.StackTestDriver();
        java.lang.Object obj22 = stackTestDriver20.push((java.lang.Object) (byte) -1);
        boolean boolean23 = stackTestDriver20.isEmpty();
        java.lang.Object obj24 = stackTestDriver20.pop();
        java.lang.Class<?> wildcardClass25 = stackTestDriver20.getClass();
        java.lang.Object obj26 = stackTestDriver11.push((java.lang.Object) stackTestDriver20);
        int int27 = stackTestDriver11.size();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) -1 + "'", obj8, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (byte) -1 + "'", obj13, (byte) -1);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (byte) -1 + "'", obj22, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (byte) -1 + "'", obj24, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test109");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        int int5 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        java.lang.Object obj8 = stackTestDriver6.push((java.lang.Object) (byte) -1);
        boolean boolean9 = stackTestDriver6.isEmpty();
        java.lang.Object obj10 = stackTestDriver6.pop();
        experiment.util.StackTestDriver stackTestDriver11 = new experiment.util.StackTestDriver();
        java.lang.Object obj13 = stackTestDriver11.push((java.lang.Object) (byte) -1);
        java.lang.Object obj14 = stackTestDriver6.push((java.lang.Object) stackTestDriver11);
        int int15 = stackTestDriver11.size();
        java.lang.Object obj16 = stackTestDriver0.push((java.lang.Object) stackTestDriver11);
        java.lang.Object obj17 = new java.lang.Object();
        java.lang.Object obj18 = stackTestDriver11.push(obj17);
        boolean boolean19 = stackTestDriver11.isEmpty();
        java.lang.Object obj20 = stackTestDriver11.pop();
        java.lang.Class<?> wildcardClass21 = stackTestDriver11.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) -1 + "'", obj8, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (byte) -1 + "'", obj13, (byte) -1);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test110");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        boolean boolean4 = stackTestDriver0.isEmpty();
        int int5 = stackTestDriver0.size();
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) "hi!");
        java.lang.Object obj8 = stackTestDriver0.pop();
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + "hi!" + "'", obj7, "hi!");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "hi!" + "'", obj8, "hi!");
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test111");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        boolean boolean4 = stackTestDriver0.isEmpty();
        int int5 = stackTestDriver0.size();
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) wildcardClass7);
        java.lang.Object obj9 = stackTestDriver0.peek();
        stackTestDriver0.clear();
        java.lang.Class<?> wildcardClass11 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "class java.lang.Object");
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "class java.lang.Object");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test112");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        java.lang.Object obj8 = stackTestDriver6.push((java.lang.Object) (byte) -1);
        boolean boolean9 = stackTestDriver6.isEmpty();
        java.lang.Object obj10 = stackTestDriver6.pop();
        experiment.util.StackTestDriver stackTestDriver11 = new experiment.util.StackTestDriver();
        java.lang.Object obj13 = stackTestDriver11.push((java.lang.Object) (byte) -1);
        java.lang.Object obj14 = stackTestDriver6.push((java.lang.Object) stackTestDriver11);
        boolean boolean15 = stackTestDriver11.isEmpty();
        java.lang.Object obj17 = stackTestDriver11.push((java.lang.Object) 100);
        experiment.util.StackTestDriver stackTestDriver18 = new experiment.util.StackTestDriver();
        java.lang.Object obj20 = stackTestDriver18.push((java.lang.Object) (byte) -1);
        boolean boolean21 = stackTestDriver18.isEmpty();
        java.lang.Object obj22 = stackTestDriver18.pop();
        int int23 = stackTestDriver18.size();
        experiment.util.StackTestDriver stackTestDriver24 = new experiment.util.StackTestDriver();
        java.lang.Object obj26 = stackTestDriver24.push((java.lang.Object) (byte) -1);
        boolean boolean27 = stackTestDriver24.isEmpty();
        java.lang.Object obj28 = stackTestDriver24.pop();
        experiment.util.StackTestDriver stackTestDriver29 = new experiment.util.StackTestDriver();
        java.lang.Object obj31 = stackTestDriver29.push((java.lang.Object) (byte) -1);
        java.lang.Object obj32 = stackTestDriver24.push((java.lang.Object) stackTestDriver29);
        int int33 = stackTestDriver29.size();
        java.lang.Object obj34 = stackTestDriver18.push((java.lang.Object) stackTestDriver29);
        java.lang.Object obj35 = new java.lang.Object();
        java.lang.Object obj36 = stackTestDriver29.push(obj35);
        boolean boolean37 = stackTestDriver29.isEmpty();
        java.lang.Object obj38 = stackTestDriver11.push((java.lang.Object) stackTestDriver29);
        stackTestDriver11.clear();
        experiment.util.StackTestDriver stackTestDriver40 = new experiment.util.StackTestDriver();
        java.lang.Object obj42 = stackTestDriver40.push((java.lang.Object) (byte) -1);
        experiment.util.StackTestDriver stackTestDriver43 = new experiment.util.StackTestDriver();
        java.lang.Object obj45 = stackTestDriver43.push((java.lang.Object) (byte) -1);
        boolean boolean46 = stackTestDriver43.isEmpty();
        boolean boolean47 = stackTestDriver43.isEmpty();
        int int48 = stackTestDriver43.size();
        java.lang.Object obj49 = new java.lang.Object();
        java.lang.Class<?> wildcardClass50 = obj49.getClass();
        java.lang.Object obj51 = stackTestDriver43.push((java.lang.Object) wildcardClass50);
        java.lang.Object obj52 = stackTestDriver43.peek();
        java.lang.Object obj53 = stackTestDriver40.push((java.lang.Object) stackTestDriver43);
        int int54 = stackTestDriver43.size();
        java.lang.Object obj55 = stackTestDriver11.push((java.lang.Object) stackTestDriver43);
        java.lang.Object obj57 = stackTestDriver43.push((java.lang.Object) 1L);
        java.lang.Object obj58 = stackTestDriver0.push(obj57);
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) -1 + "'", obj8, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (byte) -1 + "'", obj13, (byte) -1);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 100 + "'", obj17, 100);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (byte) -1 + "'", obj20, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (byte) -1 + "'", obj22, (byte) -1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + (byte) -1 + "'", obj26, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + (byte) -1 + "'", obj28, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + (byte) -1 + "'", obj31, (byte) -1);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + (byte) -1 + "'", obj42, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + (byte) -1 + "'", obj45, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertNotNull(obj51);
        org.junit.Assert.assertEquals(obj51.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj51), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj51), "class java.lang.Object");
        org.junit.Assert.assertNotNull(obj52);
        org.junit.Assert.assertEquals(obj52.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj52), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj52), "class java.lang.Object");
        org.junit.Assert.assertNotNull(obj53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 2 + "'", int54 == 2);
        org.junit.Assert.assertNotNull(obj55);
        org.junit.Assert.assertEquals("'" + obj57 + "' != '" + 1L + "'", obj57, 1L);
        org.junit.Assert.assertEquals("'" + obj58 + "' != '" + 1L + "'", obj58, 1L);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test113");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        int int9 = stackTestDriver5.size();
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        java.lang.Object obj12 = stackTestDriver10.push((java.lang.Object) (byte) -1);
        boolean boolean13 = stackTestDriver10.isEmpty();
        java.lang.Object obj14 = stackTestDriver10.pop();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        java.lang.Object obj17 = stackTestDriver15.push((java.lang.Object) (byte) -1);
        java.lang.Object obj18 = stackTestDriver10.push((java.lang.Object) stackTestDriver15);
        boolean boolean19 = stackTestDriver15.isEmpty();
        java.lang.Object obj20 = stackTestDriver5.push((java.lang.Object) stackTestDriver15);
        int int21 = stackTestDriver5.size();
        stackTestDriver5.clear();
        int int23 = stackTestDriver5.size();
        int int24 = stackTestDriver5.size();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) -1 + "'", obj12, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (byte) -1 + "'", obj14, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) -1 + "'", obj17, (byte) -1);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test114");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        boolean boolean4 = stackTestDriver0.isEmpty();
        int int5 = stackTestDriver0.size();
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) wildcardClass7);
        java.lang.Object obj9 = stackTestDriver0.peek();
        int int10 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver11 = new experiment.util.StackTestDriver();
        java.lang.Object obj13 = stackTestDriver11.push((java.lang.Object) (byte) -1);
        boolean boolean14 = stackTestDriver11.isEmpty();
        java.lang.Object obj15 = stackTestDriver11.pop();
        experiment.util.StackTestDriver stackTestDriver16 = new experiment.util.StackTestDriver();
        java.lang.Object obj18 = stackTestDriver16.push((java.lang.Object) (byte) -1);
        java.lang.Object obj19 = stackTestDriver11.push((java.lang.Object) stackTestDriver16);
        boolean boolean20 = stackTestDriver16.isEmpty();
        java.lang.Object obj22 = stackTestDriver16.push((java.lang.Object) 100);
        experiment.util.StackTestDriver stackTestDriver23 = new experiment.util.StackTestDriver();
        java.lang.Object obj25 = stackTestDriver23.push((java.lang.Object) (byte) -1);
        boolean boolean26 = stackTestDriver23.isEmpty();
        java.lang.Object obj27 = stackTestDriver23.pop();
        int int28 = stackTestDriver23.size();
        experiment.util.StackTestDriver stackTestDriver29 = new experiment.util.StackTestDriver();
        java.lang.Object obj31 = stackTestDriver29.push((java.lang.Object) (byte) -1);
        boolean boolean32 = stackTestDriver29.isEmpty();
        java.lang.Object obj33 = stackTestDriver29.pop();
        experiment.util.StackTestDriver stackTestDriver34 = new experiment.util.StackTestDriver();
        java.lang.Object obj36 = stackTestDriver34.push((java.lang.Object) (byte) -1);
        java.lang.Object obj37 = stackTestDriver29.push((java.lang.Object) stackTestDriver34);
        int int38 = stackTestDriver34.size();
        java.lang.Object obj39 = stackTestDriver23.push((java.lang.Object) stackTestDriver34);
        java.lang.Object obj40 = new java.lang.Object();
        java.lang.Object obj41 = stackTestDriver34.push(obj40);
        boolean boolean42 = stackTestDriver34.isEmpty();
        java.lang.Object obj43 = stackTestDriver16.push((java.lang.Object) stackTestDriver34);
        java.lang.Object obj44 = stackTestDriver34.peek();
        java.lang.Object obj45 = stackTestDriver0.push((java.lang.Object) stackTestDriver34);
        boolean boolean46 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj48 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "class java.lang.Object");
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "class java.lang.Object");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (byte) -1 + "'", obj13, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (byte) -1 + "'", obj15, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (byte) -1 + "'", obj18, (byte) -1);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 100 + "'", obj22, 100);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (byte) -1 + "'", obj25, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + (byte) -1 + "'", obj27, (byte) -1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + (byte) -1 + "'", obj31, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + (byte) -1 + "'", obj33, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + (byte) -1 + "'", obj36, (byte) -1);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(obj43);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test115");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        int int9 = stackTestDriver5.size();
        boolean boolean10 = stackTestDriver5.isEmpty();
        stackTestDriver5.clear();
        boolean boolean12 = stackTestDriver5.isEmpty();
        boolean boolean13 = stackTestDriver5.isEmpty();
        java.lang.Object obj15 = stackTestDriver5.push((java.lang.Object) "hi!");
        java.lang.Object obj16 = stackTestDriver5.pop();
        boolean boolean17 = stackTestDriver5.isEmpty();
        boolean boolean18 = stackTestDriver5.isEmpty();
        experiment.util.StackTestDriver stackTestDriver19 = new experiment.util.StackTestDriver();
        java.lang.Object obj21 = stackTestDriver19.push((java.lang.Object) (byte) -1);
        boolean boolean22 = stackTestDriver19.isEmpty();
        java.lang.Object obj23 = stackTestDriver19.pop();
        experiment.util.StackTestDriver stackTestDriver24 = new experiment.util.StackTestDriver();
        java.lang.Object obj26 = stackTestDriver24.push((java.lang.Object) (byte) -1);
        java.lang.Object obj27 = stackTestDriver19.push((java.lang.Object) stackTestDriver24);
        int int28 = stackTestDriver24.size();
        boolean boolean29 = stackTestDriver24.isEmpty();
        stackTestDriver24.clear();
        boolean boolean31 = stackTestDriver24.isEmpty();
        stackTestDriver24.clear();
        java.lang.Object obj33 = stackTestDriver5.push((java.lang.Object) stackTestDriver24);
        java.lang.Object obj34 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj35 = stackTestDriver5.push(obj34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + "hi!" + "'", obj15, "hi!");
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + "hi!" + "'", obj16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (byte) -1 + "'", obj21, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (byte) -1 + "'", obj23, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + (byte) -1 + "'", obj26, (byte) -1);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(obj33);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test116");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        boolean boolean9 = stackTestDriver5.isEmpty();
        java.lang.Object obj11 = stackTestDriver5.push((java.lang.Object) 100);
        java.lang.Object obj12 = stackTestDriver5.peek();
        stackTestDriver5.clear();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 100 + "'", obj11, 100);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100 + "'", obj12, 100);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test117");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        int int9 = stackTestDriver5.size();
        boolean boolean10 = stackTestDriver5.isEmpty();
        stackTestDriver5.clear();
        boolean boolean12 = stackTestDriver5.isEmpty();
        boolean boolean13 = stackTestDriver5.isEmpty();
        java.lang.Object obj15 = stackTestDriver5.push((java.lang.Object) "hi!");
        java.lang.Object obj16 = stackTestDriver5.pop();
        boolean boolean17 = stackTestDriver5.isEmpty();
        boolean boolean18 = stackTestDriver5.isEmpty();
        experiment.util.StackTestDriver stackTestDriver19 = new experiment.util.StackTestDriver();
        java.lang.Object obj21 = stackTestDriver19.push((java.lang.Object) (byte) -1);
        boolean boolean22 = stackTestDriver19.isEmpty();
        java.lang.Object obj23 = stackTestDriver19.pop();
        experiment.util.StackTestDriver stackTestDriver24 = new experiment.util.StackTestDriver();
        java.lang.Object obj26 = stackTestDriver24.push((java.lang.Object) (byte) -1);
        java.lang.Object obj27 = stackTestDriver19.push((java.lang.Object) stackTestDriver24);
        int int28 = stackTestDriver24.size();
        boolean boolean29 = stackTestDriver24.isEmpty();
        stackTestDriver24.clear();
        boolean boolean31 = stackTestDriver24.isEmpty();
        stackTestDriver24.clear();
        java.lang.Object obj33 = stackTestDriver5.push((java.lang.Object) stackTestDriver24);
        boolean boolean34 = stackTestDriver24.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj35 = stackTestDriver24.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + "hi!" + "'", obj15, "hi!");
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + "hi!" + "'", obj16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (byte) -1 + "'", obj21, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (byte) -1 + "'", obj23, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + (byte) -1 + "'", obj26, (byte) -1);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test118");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        int int5 = stackTestDriver0.size();
        int int6 = stackTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test119");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        int int9 = stackTestDriver5.size();
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        java.lang.Object obj12 = stackTestDriver10.push((java.lang.Object) (byte) -1);
        boolean boolean13 = stackTestDriver10.isEmpty();
        java.lang.Object obj14 = stackTestDriver10.pop();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        java.lang.Object obj17 = stackTestDriver15.push((java.lang.Object) (byte) -1);
        java.lang.Object obj18 = stackTestDriver10.push((java.lang.Object) stackTestDriver15);
        boolean boolean19 = stackTestDriver15.isEmpty();
        java.lang.Object obj20 = stackTestDriver5.push((java.lang.Object) stackTestDriver15);
        java.lang.Object obj21 = stackTestDriver5.peek();
        boolean boolean22 = stackTestDriver5.isEmpty();
        experiment.util.StackTestDriver stackTestDriver23 = new experiment.util.StackTestDriver();
        java.lang.Object obj25 = stackTestDriver23.push((java.lang.Object) (byte) -1);
        boolean boolean26 = stackTestDriver23.isEmpty();
        java.lang.Object obj27 = stackTestDriver23.pop();
        experiment.util.StackTestDriver stackTestDriver28 = new experiment.util.StackTestDriver();
        java.lang.Object obj30 = stackTestDriver28.push((java.lang.Object) (byte) -1);
        java.lang.Object obj31 = stackTestDriver23.push((java.lang.Object) stackTestDriver28);
        boolean boolean32 = stackTestDriver28.isEmpty();
        java.lang.Object obj34 = stackTestDriver28.push((java.lang.Object) 100);
        experiment.util.StackTestDriver stackTestDriver35 = new experiment.util.StackTestDriver();
        java.lang.Object obj37 = stackTestDriver35.push((java.lang.Object) (byte) -1);
        boolean boolean38 = stackTestDriver35.isEmpty();
        java.lang.Object obj39 = stackTestDriver35.pop();
        int int40 = stackTestDriver35.size();
        experiment.util.StackTestDriver stackTestDriver41 = new experiment.util.StackTestDriver();
        java.lang.Object obj43 = stackTestDriver41.push((java.lang.Object) (byte) -1);
        boolean boolean44 = stackTestDriver41.isEmpty();
        java.lang.Object obj45 = stackTestDriver41.pop();
        experiment.util.StackTestDriver stackTestDriver46 = new experiment.util.StackTestDriver();
        java.lang.Object obj48 = stackTestDriver46.push((java.lang.Object) (byte) -1);
        java.lang.Object obj49 = stackTestDriver41.push((java.lang.Object) stackTestDriver46);
        int int50 = stackTestDriver46.size();
        java.lang.Object obj51 = stackTestDriver35.push((java.lang.Object) stackTestDriver46);
        java.lang.Object obj52 = new java.lang.Object();
        java.lang.Object obj53 = stackTestDriver46.push(obj52);
        boolean boolean54 = stackTestDriver46.isEmpty();
        java.lang.Object obj55 = stackTestDriver28.push((java.lang.Object) stackTestDriver46);
        stackTestDriver28.clear();
        java.lang.Object obj57 = stackTestDriver5.push((java.lang.Object) stackTestDriver28);
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) -1 + "'", obj12, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (byte) -1 + "'", obj14, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) -1 + "'", obj17, (byte) -1);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (byte) -1 + "'", obj25, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + (byte) -1 + "'", obj27, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + (byte) -1 + "'", obj30, (byte) -1);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + 100 + "'", obj34, 100);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + (byte) -1 + "'", obj37, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + (byte) -1 + "'", obj39, (byte) -1);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + (byte) -1 + "'", obj43, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + (byte) -1 + "'", obj45, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + (byte) -1 + "'", obj48, (byte) -1);
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertNotNull(obj51);
        org.junit.Assert.assertNotNull(obj53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(obj55);
        org.junit.Assert.assertNotNull(obj57);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test120");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        int int4 = stackTestDriver0.size();
        java.lang.Object obj5 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) stackTestDriver6);
        boolean boolean8 = stackTestDriver6.isEmpty();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) -1 + "'", obj5, (byte) -1);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test121");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        boolean boolean4 = stackTestDriver0.isEmpty();
        int int5 = stackTestDriver0.size();
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) wildcardClass7);
        java.lang.Object obj9 = stackTestDriver0.peek();
        java.lang.Object obj10 = stackTestDriver0.pop();
        java.lang.Class<?> wildcardClass11 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "class java.lang.Object");
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "class java.lang.Object");
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "class java.lang.Object");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test122");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = stackTestDriver0.pop();
        int int4 = stackTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) -1 + "'", obj3, (byte) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test123");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        int int9 = stackTestDriver5.size();
        boolean boolean10 = stackTestDriver5.isEmpty();
        experiment.util.StackTestDriver stackTestDriver11 = new experiment.util.StackTestDriver();
        java.lang.Object obj13 = stackTestDriver11.push((java.lang.Object) (byte) -1);
        boolean boolean14 = stackTestDriver11.isEmpty();
        boolean boolean15 = stackTestDriver11.isEmpty();
        int int16 = stackTestDriver11.size();
        java.lang.Object obj17 = new java.lang.Object();
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        java.lang.Object obj19 = stackTestDriver11.push((java.lang.Object) wildcardClass18);
        java.lang.Object obj20 = stackTestDriver5.push((java.lang.Object) wildcardClass18);
        java.lang.Class<?> wildcardClass21 = obj20.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (byte) -1 + "'", obj13, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "class java.lang.Object");
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "class java.lang.Object");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test124");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) 10.0f);
        boolean boolean6 = stackTestDriver0.isEmpty();
        java.lang.Object obj7 = stackTestDriver0.peek();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 10.0f + "'", obj5, 10.0f);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 10.0f + "'", obj7, 10.0f);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test125");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        int int3 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        java.lang.Object obj6 = stackTestDriver4.push((java.lang.Object) (byte) -1);
        boolean boolean7 = stackTestDriver4.isEmpty();
        java.lang.Object obj8 = stackTestDriver4.pop();
        experiment.util.StackTestDriver stackTestDriver9 = new experiment.util.StackTestDriver();
        java.lang.Object obj11 = stackTestDriver9.push((java.lang.Object) (byte) -1);
        java.lang.Object obj12 = stackTestDriver4.push((java.lang.Object) stackTestDriver9);
        int int13 = stackTestDriver9.size();
        boolean boolean14 = stackTestDriver9.isEmpty();
        stackTestDriver9.clear();
        boolean boolean16 = stackTestDriver9.isEmpty();
        boolean boolean17 = stackTestDriver9.isEmpty();
        java.lang.Object obj19 = stackTestDriver9.push((java.lang.Object) "hi!");
        experiment.util.StackTestDriver stackTestDriver20 = new experiment.util.StackTestDriver();
        java.lang.Object obj22 = stackTestDriver20.push((java.lang.Object) (byte) -1);
        boolean boolean23 = stackTestDriver20.isEmpty();
        java.lang.Object obj24 = stackTestDriver20.pop();
        experiment.util.StackTestDriver stackTestDriver25 = new experiment.util.StackTestDriver();
        java.lang.Object obj27 = stackTestDriver25.push((java.lang.Object) (byte) -1);
        java.lang.Object obj28 = stackTestDriver20.push((java.lang.Object) stackTestDriver25);
        boolean boolean29 = stackTestDriver25.isEmpty();
        java.lang.Object obj31 = stackTestDriver25.push((java.lang.Object) 100);
        java.lang.Object obj32 = stackTestDriver25.peek();
        boolean boolean33 = stackTestDriver25.isEmpty();
        java.lang.Object obj34 = stackTestDriver9.push((java.lang.Object) boolean33);
        java.lang.Object obj35 = stackTestDriver0.push((java.lang.Object) boolean33);
        java.lang.Class<?> wildcardClass36 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) -1 + "'", obj6, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) -1 + "'", obj8, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) -1 + "'", obj11, (byte) -1);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + "hi!" + "'", obj19, "hi!");
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (byte) -1 + "'", obj22, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (byte) -1 + "'", obj24, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + (byte) -1 + "'", obj27, (byte) -1);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 100 + "'", obj31, 100);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 100 + "'", obj32, 100);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + false + "'", obj34, false);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + false + "'", obj35, false);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test126");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        boolean boolean4 = stackTestDriver0.isEmpty();
        int int5 = stackTestDriver0.size();
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) "hi!");
        java.lang.Object obj8 = stackTestDriver0.pop();
        int int9 = stackTestDriver0.size();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + "hi!" + "'", obj7, "hi!");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "hi!" + "'", obj8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test127");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test128");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) ' ');
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + ' ' + "'", obj7, ' ');
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test129");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        int int5 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        java.lang.Object obj8 = stackTestDriver6.push((java.lang.Object) (byte) -1);
        boolean boolean9 = stackTestDriver6.isEmpty();
        java.lang.Object obj10 = stackTestDriver6.pop();
        experiment.util.StackTestDriver stackTestDriver11 = new experiment.util.StackTestDriver();
        java.lang.Object obj13 = stackTestDriver11.push((java.lang.Object) (byte) -1);
        java.lang.Object obj14 = stackTestDriver6.push((java.lang.Object) stackTestDriver11);
        int int15 = stackTestDriver11.size();
        java.lang.Object obj16 = stackTestDriver0.push((java.lang.Object) stackTestDriver11);
        java.lang.Object obj17 = new java.lang.Object();
        java.lang.Object obj18 = stackTestDriver11.push(obj17);
        boolean boolean19 = stackTestDriver11.isEmpty();
        java.lang.Object obj20 = stackTestDriver11.pop();
        java.lang.Object obj21 = stackTestDriver11.pop();
        int int22 = stackTestDriver11.size();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) -1 + "'", obj8, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (byte) -1 + "'", obj13, (byte) -1);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (byte) -1 + "'", obj21, (byte) -1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test130");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        boolean boolean4 = stackTestDriver0.isEmpty();
        boolean boolean5 = stackTestDriver0.isEmpty();
        int int6 = stackTestDriver0.size();
        java.lang.Object obj7 = stackTestDriver0.peek();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test131");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        int int5 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        java.lang.Object obj8 = stackTestDriver6.push((java.lang.Object) (byte) -1);
        java.lang.Object obj9 = stackTestDriver0.push(obj8);
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        java.lang.Object obj12 = stackTestDriver10.push((java.lang.Object) (byte) -1);
        boolean boolean13 = stackTestDriver10.isEmpty();
        java.lang.Object obj14 = stackTestDriver10.pop();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        java.lang.Object obj17 = stackTestDriver15.push((java.lang.Object) (byte) -1);
        java.lang.Object obj18 = stackTestDriver10.push((java.lang.Object) stackTestDriver15);
        int int19 = stackTestDriver15.size();
        experiment.util.StackTestDriver stackTestDriver20 = new experiment.util.StackTestDriver();
        java.lang.Object obj22 = stackTestDriver20.push((java.lang.Object) (byte) -1);
        boolean boolean23 = stackTestDriver20.isEmpty();
        java.lang.Object obj24 = stackTestDriver20.pop();
        experiment.util.StackTestDriver stackTestDriver25 = new experiment.util.StackTestDriver();
        java.lang.Object obj27 = stackTestDriver25.push((java.lang.Object) (byte) -1);
        java.lang.Object obj28 = stackTestDriver20.push((java.lang.Object) stackTestDriver25);
        boolean boolean29 = stackTestDriver25.isEmpty();
        java.lang.Object obj30 = stackTestDriver15.push((java.lang.Object) stackTestDriver25);
        java.lang.Object obj32 = stackTestDriver25.push((java.lang.Object) 10);
        java.lang.Object obj33 = stackTestDriver25.pop();
        java.lang.Object obj34 = stackTestDriver0.push(obj33);
        java.lang.Object obj35 = stackTestDriver0.peek();
        java.lang.Object obj36 = stackTestDriver0.pop();
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj38 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) -1 + "'", obj8, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) -1 + "'", obj9, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) -1 + "'", obj12, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (byte) -1 + "'", obj14, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) -1 + "'", obj17, (byte) -1);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (byte) -1 + "'", obj22, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (byte) -1 + "'", obj24, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + (byte) -1 + "'", obj27, (byte) -1);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 10 + "'", obj32, 10);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + 10 + "'", obj33, 10);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + 10 + "'", obj34, 10);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 10 + "'", obj35, 10);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + 10 + "'", obj36, 10);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test132");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        int int9 = stackTestDriver5.size();
        boolean boolean10 = stackTestDriver5.isEmpty();
        stackTestDriver5.clear();
        stackTestDriver5.clear();
        int int13 = stackTestDriver5.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = stackTestDriver5.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test133");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        boolean boolean9 = stackTestDriver5.isEmpty();
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        java.lang.Object obj12 = stackTestDriver10.push((java.lang.Object) (byte) -1);
        boolean boolean13 = stackTestDriver10.isEmpty();
        java.lang.Object obj14 = stackTestDriver10.pop();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        java.lang.Object obj17 = stackTestDriver15.push((java.lang.Object) (byte) -1);
        java.lang.Object obj18 = stackTestDriver10.push((java.lang.Object) stackTestDriver15);
        int int19 = stackTestDriver15.size();
        boolean boolean20 = stackTestDriver15.isEmpty();
        stackTestDriver15.clear();
        boolean boolean22 = stackTestDriver15.isEmpty();
        int int23 = stackTestDriver15.size();
        java.lang.Object obj24 = stackTestDriver5.push((java.lang.Object) int23);
        java.lang.Object obj25 = stackTestDriver5.pop();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) -1 + "'", obj12, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (byte) -1 + "'", obj14, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) -1 + "'", obj17, (byte) -1);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 0 + "'", obj24, 0);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 0 + "'", obj25, 0);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test134");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) 10.0f);
        java.lang.Object obj6 = stackTestDriver0.pop();
        java.lang.Object obj7 = stackTestDriver0.pop();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 10.0f + "'", obj5, 10.0f);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 10.0f + "'", obj6, 10.0f);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test135");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        int int9 = stackTestDriver5.size();
        boolean boolean10 = stackTestDriver5.isEmpty();
        int int11 = stackTestDriver5.size();
        java.lang.Object obj12 = stackTestDriver5.peek();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) -1 + "'", obj12, (byte) -1);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test136");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        boolean boolean9 = stackTestDriver5.isEmpty();
        boolean boolean10 = stackTestDriver5.isEmpty();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test137");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        int int9 = stackTestDriver5.size();
        java.lang.Object obj11 = stackTestDriver5.push((java.lang.Object) (-1.0d));
        java.lang.Class<?> wildcardClass12 = obj11.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (-1.0d) + "'", obj11, (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test138");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        int int5 = stackTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test139");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        int int9 = stackTestDriver5.size();
        boolean boolean10 = stackTestDriver5.isEmpty();
        stackTestDriver5.clear();
        int int12 = stackTestDriver5.size();
        experiment.util.StackTestDriver stackTestDriver13 = new experiment.util.StackTestDriver();
        java.lang.Object obj15 = stackTestDriver13.push((java.lang.Object) (byte) -1);
        boolean boolean16 = stackTestDriver13.isEmpty();
        java.lang.Object obj18 = stackTestDriver13.push((java.lang.Object) 10.0f);
        java.lang.Object obj19 = stackTestDriver13.pop();
        boolean boolean20 = stackTestDriver13.isEmpty();
        java.lang.Object obj21 = stackTestDriver5.push((java.lang.Object) stackTestDriver13);
        java.lang.Object obj22 = stackTestDriver13.pop();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (byte) -1 + "'", obj15, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 10.0f + "'", obj18, 10.0f);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 10.0f + "'", obj19, 10.0f);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (byte) -1 + "'", obj22, (byte) -1);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test140");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        int int5 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        java.lang.Object obj8 = stackTestDriver6.push((java.lang.Object) (byte) -1);
        boolean boolean9 = stackTestDriver6.isEmpty();
        java.lang.Object obj10 = stackTestDriver6.pop();
        experiment.util.StackTestDriver stackTestDriver11 = new experiment.util.StackTestDriver();
        java.lang.Object obj13 = stackTestDriver11.push((java.lang.Object) (byte) -1);
        java.lang.Object obj14 = stackTestDriver6.push((java.lang.Object) stackTestDriver11);
        int int15 = stackTestDriver11.size();
        java.lang.Object obj16 = stackTestDriver0.push((java.lang.Object) stackTestDriver11);
        java.lang.Object obj17 = new java.lang.Object();
        java.lang.Object obj18 = stackTestDriver11.push(obj17);
        stackTestDriver11.clear();
        experiment.util.StackTestDriver stackTestDriver20 = new experiment.util.StackTestDriver();
        java.lang.Object obj22 = stackTestDriver20.push((java.lang.Object) (byte) -1);
        boolean boolean23 = stackTestDriver20.isEmpty();
        java.lang.Object obj24 = stackTestDriver20.pop();
        java.lang.Class<?> wildcardClass25 = stackTestDriver20.getClass();
        java.lang.Object obj26 = stackTestDriver11.push((java.lang.Object) stackTestDriver20);
        experiment.util.StackTestDriver stackTestDriver27 = new experiment.util.StackTestDriver();
        java.lang.Object obj29 = stackTestDriver27.push((java.lang.Object) (byte) -1);
        boolean boolean30 = stackTestDriver27.isEmpty();
        int int31 = stackTestDriver27.size();
        stackTestDriver27.clear();
        java.lang.Object obj33 = stackTestDriver20.push((java.lang.Object) stackTestDriver27);
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) -1 + "'", obj8, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (byte) -1 + "'", obj13, (byte) -1);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (byte) -1 + "'", obj22, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (byte) -1 + "'", obj24, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + (byte) -1 + "'", obj29, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(obj33);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test141");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        boolean boolean9 = stackTestDriver5.isEmpty();
        java.lang.Object obj11 = stackTestDriver5.push((java.lang.Object) 100);
        java.lang.Object obj12 = stackTestDriver5.peek();
        boolean boolean13 = stackTestDriver5.isEmpty();
        boolean boolean14 = stackTestDriver5.isEmpty();
        int int15 = stackTestDriver5.size();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 100 + "'", obj11, 100);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100 + "'", obj12, 100);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test142");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        int int9 = stackTestDriver5.size();
        java.lang.Object obj10 = stackTestDriver5.peek();
        boolean boolean11 = stackTestDriver5.isEmpty();
        stackTestDriver5.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = stackTestDriver5.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test143");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        int int9 = stackTestDriver5.size();
        boolean boolean10 = stackTestDriver5.isEmpty();
        stackTestDriver5.clear();
        boolean boolean12 = stackTestDriver5.isEmpty();
        stackTestDriver5.clear();
        int int14 = stackTestDriver5.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = stackTestDriver5.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test144");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        int int9 = stackTestDriver5.size();
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        java.lang.Object obj12 = stackTestDriver10.push((java.lang.Object) (byte) -1);
        boolean boolean13 = stackTestDriver10.isEmpty();
        java.lang.Object obj14 = stackTestDriver10.pop();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        java.lang.Object obj17 = stackTestDriver15.push((java.lang.Object) (byte) -1);
        java.lang.Object obj18 = stackTestDriver10.push((java.lang.Object) stackTestDriver15);
        boolean boolean19 = stackTestDriver15.isEmpty();
        java.lang.Object obj20 = stackTestDriver5.push((java.lang.Object) stackTestDriver15);
        int int21 = stackTestDriver5.size();
        experiment.util.StackTestDriver stackTestDriver22 = new experiment.util.StackTestDriver();
        java.lang.Object obj24 = stackTestDriver22.push((java.lang.Object) (byte) -1);
        boolean boolean25 = stackTestDriver22.isEmpty();
        java.lang.Object obj26 = stackTestDriver22.pop();
        experiment.util.StackTestDriver stackTestDriver27 = new experiment.util.StackTestDriver();
        java.lang.Object obj29 = stackTestDriver27.push((java.lang.Object) (byte) -1);
        java.lang.Object obj30 = stackTestDriver22.push((java.lang.Object) stackTestDriver27);
        int int31 = stackTestDriver27.size();
        boolean boolean32 = stackTestDriver27.isEmpty();
        stackTestDriver27.clear();
        boolean boolean34 = stackTestDriver27.isEmpty();
        boolean boolean35 = stackTestDriver27.isEmpty();
        java.lang.Object obj37 = stackTestDriver27.push((java.lang.Object) "hi!");
        java.lang.Object obj38 = stackTestDriver5.push(obj37);
        java.lang.Object obj39 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj40 = stackTestDriver5.push(obj39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) -1 + "'", obj12, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (byte) -1 + "'", obj14, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) -1 + "'", obj17, (byte) -1);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (byte) -1 + "'", obj24, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + (byte) -1 + "'", obj26, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + (byte) -1 + "'", obj29, (byte) -1);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + "hi!" + "'", obj37, "hi!");
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + "hi!" + "'", obj38, "hi!");
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test145");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        int int9 = stackTestDriver5.size();
        boolean boolean10 = stackTestDriver5.isEmpty();
        stackTestDriver5.clear();
        boolean boolean12 = stackTestDriver5.isEmpty();
        boolean boolean13 = stackTestDriver5.isEmpty();
        stackTestDriver5.clear();
        java.lang.Object obj16 = stackTestDriver5.push((java.lang.Object) 1.0d);
        boolean boolean17 = stackTestDriver5.isEmpty();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 1.0d + "'", obj16, 1.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test146");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        int int9 = stackTestDriver5.size();
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        java.lang.Object obj12 = stackTestDriver10.push((java.lang.Object) (byte) -1);
        boolean boolean13 = stackTestDriver10.isEmpty();
        java.lang.Object obj14 = stackTestDriver10.pop();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        java.lang.Object obj17 = stackTestDriver15.push((java.lang.Object) (byte) -1);
        java.lang.Object obj18 = stackTestDriver10.push((java.lang.Object) stackTestDriver15);
        boolean boolean19 = stackTestDriver15.isEmpty();
        java.lang.Object obj20 = stackTestDriver5.push((java.lang.Object) stackTestDriver15);
        int int21 = stackTestDriver5.size();
        java.lang.Object obj22 = stackTestDriver5.peek();
        int int23 = stackTestDriver5.size();
        boolean boolean24 = stackTestDriver5.isEmpty();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) -1 + "'", obj12, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (byte) -1 + "'", obj14, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) -1 + "'", obj17, (byte) -1);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test147");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        int int9 = stackTestDriver5.size();
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        java.lang.Object obj12 = stackTestDriver10.push((java.lang.Object) (byte) -1);
        boolean boolean13 = stackTestDriver10.isEmpty();
        java.lang.Object obj14 = stackTestDriver10.pop();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        java.lang.Object obj17 = stackTestDriver15.push((java.lang.Object) (byte) -1);
        java.lang.Object obj18 = stackTestDriver10.push((java.lang.Object) stackTestDriver15);
        boolean boolean19 = stackTestDriver15.isEmpty();
        java.lang.Object obj20 = stackTestDriver5.push((java.lang.Object) stackTestDriver15);
        java.lang.Object obj22 = stackTestDriver15.push((java.lang.Object) 10);
        experiment.util.StackTestDriver stackTestDriver23 = new experiment.util.StackTestDriver();
        java.lang.Object obj25 = stackTestDriver23.push((java.lang.Object) (byte) -1);
        boolean boolean26 = stackTestDriver23.isEmpty();
        boolean boolean27 = stackTestDriver23.isEmpty();
        int int28 = stackTestDriver23.size();
        java.lang.Object obj29 = new java.lang.Object();
        java.lang.Class<?> wildcardClass30 = obj29.getClass();
        java.lang.Object obj31 = stackTestDriver23.push((java.lang.Object) wildcardClass30);
        int int32 = stackTestDriver23.size();
        int int33 = stackTestDriver23.size();
        java.lang.Object obj34 = stackTestDriver15.push((java.lang.Object) int33);
        experiment.util.StackTestDriver stackTestDriver35 = new experiment.util.StackTestDriver();
        java.lang.Object obj37 = stackTestDriver35.push((java.lang.Object) (byte) -1);
        boolean boolean38 = stackTestDriver35.isEmpty();
        java.lang.Object obj40 = stackTestDriver35.push((java.lang.Object) 10.0f);
        java.lang.Object obj41 = stackTestDriver35.pop();
        java.lang.Object obj42 = stackTestDriver35.peek();
        java.lang.Object obj43 = stackTestDriver15.push((java.lang.Object) stackTestDriver35);
        java.lang.Class<?> wildcardClass44 = stackTestDriver15.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) -1 + "'", obj12, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (byte) -1 + "'", obj14, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) -1 + "'", obj17, (byte) -1);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 10 + "'", obj22, 10);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (byte) -1 + "'", obj25, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertEquals(obj31.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj31), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj31), "class java.lang.Object");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2 + "'", int32 == 2);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2 + "'", int33 == 2);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + 2 + "'", obj34, 2);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + (byte) -1 + "'", obj37, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + 10.0f + "'", obj40, 10.0f);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + 10.0f + "'", obj41, 10.0f);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + (byte) -1 + "'", obj42, (byte) -1);
        org.junit.Assert.assertNotNull(obj43);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test148");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        boolean boolean9 = stackTestDriver5.isEmpty();
        java.lang.Object obj11 = stackTestDriver5.push((java.lang.Object) 100);
        experiment.util.StackTestDriver stackTestDriver12 = new experiment.util.StackTestDriver();
        java.lang.Object obj14 = stackTestDriver12.push((java.lang.Object) (byte) -1);
        boolean boolean15 = stackTestDriver12.isEmpty();
        java.lang.Object obj16 = stackTestDriver12.pop();
        int int17 = stackTestDriver12.size();
        experiment.util.StackTestDriver stackTestDriver18 = new experiment.util.StackTestDriver();
        java.lang.Object obj20 = stackTestDriver18.push((java.lang.Object) (byte) -1);
        boolean boolean21 = stackTestDriver18.isEmpty();
        java.lang.Object obj22 = stackTestDriver18.pop();
        experiment.util.StackTestDriver stackTestDriver23 = new experiment.util.StackTestDriver();
        java.lang.Object obj25 = stackTestDriver23.push((java.lang.Object) (byte) -1);
        java.lang.Object obj26 = stackTestDriver18.push((java.lang.Object) stackTestDriver23);
        int int27 = stackTestDriver23.size();
        java.lang.Object obj28 = stackTestDriver12.push((java.lang.Object) stackTestDriver23);
        java.lang.Object obj29 = new java.lang.Object();
        java.lang.Object obj30 = stackTestDriver23.push(obj29);
        boolean boolean31 = stackTestDriver23.isEmpty();
        java.lang.Object obj32 = stackTestDriver5.push((java.lang.Object) stackTestDriver23);
        stackTestDriver23.clear();
        int int34 = stackTestDriver23.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj35 = stackTestDriver23.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 100 + "'", obj11, 100);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (byte) -1 + "'", obj14, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (byte) -1 + "'", obj16, (byte) -1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (byte) -1 + "'", obj20, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (byte) -1 + "'", obj22, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (byte) -1 + "'", obj25, (byte) -1);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test149");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        int int9 = stackTestDriver5.size();
        boolean boolean10 = stackTestDriver5.isEmpty();
        stackTestDriver5.clear();
        stackTestDriver5.clear();
        stackTestDriver5.clear();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test150");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        java.lang.Object obj6 = stackTestDriver4.push((java.lang.Object) (byte) -1);
        boolean boolean7 = stackTestDriver4.isEmpty();
        stackTestDriver4.clear();
        stackTestDriver4.clear();
        java.lang.Object obj11 = stackTestDriver4.push((java.lang.Object) ' ');
        int int12 = stackTestDriver4.size();
        experiment.util.StackTestDriver stackTestDriver13 = new experiment.util.StackTestDriver();
        java.lang.Object obj15 = stackTestDriver13.push((java.lang.Object) (byte) -1);
        experiment.util.StackTestDriver stackTestDriver16 = new experiment.util.StackTestDriver();
        java.lang.Object obj18 = stackTestDriver16.push((java.lang.Object) (byte) -1);
        boolean boolean19 = stackTestDriver16.isEmpty();
        boolean boolean20 = stackTestDriver16.isEmpty();
        int int21 = stackTestDriver16.size();
        java.lang.Object obj22 = new java.lang.Object();
        java.lang.Class<?> wildcardClass23 = obj22.getClass();
        java.lang.Object obj24 = stackTestDriver16.push((java.lang.Object) wildcardClass23);
        java.lang.Object obj25 = stackTestDriver16.peek();
        java.lang.Object obj26 = stackTestDriver13.push((java.lang.Object) stackTestDriver16);
        boolean boolean27 = stackTestDriver13.isEmpty();
        java.lang.Object obj28 = stackTestDriver4.push((java.lang.Object) boolean27);
        java.lang.Object obj29 = stackTestDriver0.push(obj28);
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) -1 + "'", obj3, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) -1 + "'", obj6, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + ' ' + "'", obj11, ' ');
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (byte) -1 + "'", obj15, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (byte) -1 + "'", obj18, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals(obj24.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj24), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj24), "class java.lang.Object");
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertEquals(obj25.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj25), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj25), "class java.lang.Object");
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + false + "'", obj28, false);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + false + "'", obj29, false);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test151");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.peek();
        java.lang.Object obj5 = stackTestDriver0.pop();
        boolean boolean6 = stackTestDriver0.isEmpty();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) -1 + "'", obj5, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test152");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        int int9 = stackTestDriver5.size();
        boolean boolean10 = stackTestDriver5.isEmpty();
        stackTestDriver5.clear();
        boolean boolean12 = stackTestDriver5.isEmpty();
        boolean boolean13 = stackTestDriver5.isEmpty();
        stackTestDriver5.clear();
        java.lang.Object obj16 = stackTestDriver5.push((java.lang.Object) 1.0d);
        java.lang.Object obj17 = stackTestDriver5.pop();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = stackTestDriver5.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 1.0d + "'", obj16, 1.0d);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 1.0d + "'", obj17, 1.0d);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test153");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        int int4 = stackTestDriver0.size();
        stackTestDriver0.clear();
        java.lang.Class<?> wildcardClass6 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test154");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        int int9 = stackTestDriver5.size();
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        java.lang.Object obj12 = stackTestDriver10.push((java.lang.Object) (byte) -1);
        boolean boolean13 = stackTestDriver10.isEmpty();
        java.lang.Object obj14 = stackTestDriver10.pop();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        java.lang.Object obj17 = stackTestDriver15.push((java.lang.Object) (byte) -1);
        java.lang.Object obj18 = stackTestDriver10.push((java.lang.Object) stackTestDriver15);
        boolean boolean19 = stackTestDriver15.isEmpty();
        java.lang.Object obj20 = stackTestDriver5.push((java.lang.Object) stackTestDriver15);
        int int21 = stackTestDriver5.size();
        java.lang.Object obj22 = stackTestDriver5.peek();
        int int23 = stackTestDriver5.size();
        java.lang.Class<?> wildcardClass24 = stackTestDriver5.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) -1 + "'", obj12, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (byte) -1 + "'", obj14, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) -1 + "'", obj17, (byte) -1);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test155");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
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
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) -1 + "'", obj5, (byte) -1);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test156");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        int int9 = stackTestDriver5.size();
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        java.lang.Object obj12 = stackTestDriver10.push((java.lang.Object) (byte) -1);
        boolean boolean13 = stackTestDriver10.isEmpty();
        java.lang.Object obj14 = stackTestDriver10.pop();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        java.lang.Object obj17 = stackTestDriver15.push((java.lang.Object) (byte) -1);
        java.lang.Object obj18 = stackTestDriver10.push((java.lang.Object) stackTestDriver15);
        boolean boolean19 = stackTestDriver15.isEmpty();
        java.lang.Object obj20 = stackTestDriver5.push((java.lang.Object) stackTestDriver15);
        java.lang.Object obj22 = stackTestDriver15.push((java.lang.Object) 10);
        experiment.util.StackTestDriver stackTestDriver23 = new experiment.util.StackTestDriver();
        java.lang.Object obj25 = stackTestDriver23.push((java.lang.Object) (byte) -1);
        boolean boolean26 = stackTestDriver23.isEmpty();
        boolean boolean27 = stackTestDriver23.isEmpty();
        int int28 = stackTestDriver23.size();
        java.lang.Object obj29 = new java.lang.Object();
        java.lang.Class<?> wildcardClass30 = obj29.getClass();
        java.lang.Object obj31 = stackTestDriver23.push((java.lang.Object) wildcardClass30);
        int int32 = stackTestDriver23.size();
        int int33 = stackTestDriver23.size();
        java.lang.Object obj34 = stackTestDriver15.push((java.lang.Object) int33);
        experiment.util.StackTestDriver stackTestDriver35 = new experiment.util.StackTestDriver();
        java.lang.Object obj37 = stackTestDriver35.push((java.lang.Object) (byte) -1);
        int int38 = stackTestDriver35.size();
        experiment.util.StackTestDriver stackTestDriver39 = new experiment.util.StackTestDriver();
        java.lang.Object obj41 = stackTestDriver39.push((java.lang.Object) (byte) -1);
        boolean boolean42 = stackTestDriver39.isEmpty();
        java.lang.Object obj43 = stackTestDriver39.pop();
        experiment.util.StackTestDriver stackTestDriver44 = new experiment.util.StackTestDriver();
        java.lang.Object obj46 = stackTestDriver44.push((java.lang.Object) (byte) -1);
        java.lang.Object obj47 = stackTestDriver39.push((java.lang.Object) stackTestDriver44);
        int int48 = stackTestDriver44.size();
        experiment.util.StackTestDriver stackTestDriver49 = new experiment.util.StackTestDriver();
        java.lang.Object obj51 = stackTestDriver49.push((java.lang.Object) (byte) -1);
        boolean boolean52 = stackTestDriver49.isEmpty();
        java.lang.Object obj53 = stackTestDriver49.pop();
        experiment.util.StackTestDriver stackTestDriver54 = new experiment.util.StackTestDriver();
        java.lang.Object obj56 = stackTestDriver54.push((java.lang.Object) (byte) -1);
        java.lang.Object obj57 = stackTestDriver49.push((java.lang.Object) stackTestDriver54);
        boolean boolean58 = stackTestDriver54.isEmpty();
        java.lang.Object obj59 = stackTestDriver44.push((java.lang.Object) stackTestDriver54);
        java.lang.Object obj60 = stackTestDriver35.push(obj59);
        java.lang.Object obj61 = stackTestDriver15.push((java.lang.Object) stackTestDriver35);
        experiment.util.StackTestDriver stackTestDriver62 = new experiment.util.StackTestDriver();
        java.lang.Object obj64 = stackTestDriver62.push((java.lang.Object) (byte) -1);
        experiment.util.StackTestDriver stackTestDriver65 = new experiment.util.StackTestDriver();
        java.lang.Object obj67 = stackTestDriver65.push((java.lang.Object) (byte) -1);
        boolean boolean68 = stackTestDriver65.isEmpty();
        int int69 = stackTestDriver65.size();
        java.lang.Object obj70 = stackTestDriver65.pop();
        experiment.util.StackTestDriver stackTestDriver71 = new experiment.util.StackTestDriver();
        java.lang.Object obj72 = stackTestDriver65.push((java.lang.Object) stackTestDriver71);
        java.lang.Object obj73 = stackTestDriver62.push(obj72);
        java.lang.Object obj74 = stackTestDriver15.push(obj73);
        java.lang.Class<?> wildcardClass75 = obj74.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) -1 + "'", obj12, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (byte) -1 + "'", obj14, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) -1 + "'", obj17, (byte) -1);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 10 + "'", obj22, 10);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (byte) -1 + "'", obj25, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertEquals(obj31.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj31), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj31), "class java.lang.Object");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2 + "'", int32 == 2);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2 + "'", int33 == 2);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + 2 + "'", obj34, 2);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + (byte) -1 + "'", obj37, (byte) -1);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + (byte) -1 + "'", obj41, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + (byte) -1 + "'", obj43, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + (byte) -1 + "'", obj46, (byte) -1);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertEquals("'" + obj51 + "' != '" + (byte) -1 + "'", obj51, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + obj53 + "' != '" + (byte) -1 + "'", obj53, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj56 + "' != '" + (byte) -1 + "'", obj56, (byte) -1);
        org.junit.Assert.assertNotNull(obj57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(obj59);
        org.junit.Assert.assertNotNull(obj60);
        org.junit.Assert.assertNotNull(obj61);
        org.junit.Assert.assertEquals("'" + obj64 + "' != '" + (byte) -1 + "'", obj64, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj67 + "' != '" + (byte) -1 + "'", obj67, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 1 + "'", int69 == 1);
        org.junit.Assert.assertEquals("'" + obj70 + "' != '" + (byte) -1 + "'", obj70, (byte) -1);
        org.junit.Assert.assertNotNull(obj72);
        org.junit.Assert.assertNotNull(obj73);
        org.junit.Assert.assertNotNull(obj74);
        org.junit.Assert.assertNotNull(wildcardClass75);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test157");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        int int9 = stackTestDriver5.size();
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        java.lang.Object obj12 = stackTestDriver10.push((java.lang.Object) (byte) -1);
        boolean boolean13 = stackTestDriver10.isEmpty();
        java.lang.Object obj14 = stackTestDriver10.pop();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        java.lang.Object obj17 = stackTestDriver15.push((java.lang.Object) (byte) -1);
        java.lang.Object obj18 = stackTestDriver10.push((java.lang.Object) stackTestDriver15);
        boolean boolean19 = stackTestDriver15.isEmpty();
        java.lang.Object obj20 = stackTestDriver5.push((java.lang.Object) stackTestDriver15);
        java.lang.Object obj22 = stackTestDriver15.push((java.lang.Object) 10);
        int int23 = stackTestDriver15.size();
        stackTestDriver15.clear();
        java.lang.Class<?> wildcardClass25 = stackTestDriver15.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) -1 + "'", obj12, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (byte) -1 + "'", obj14, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) -1 + "'", obj17, (byte) -1);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 10 + "'", obj22, 10);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test158");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        boolean boolean4 = stackTestDriver0.isEmpty();
        int int5 = stackTestDriver0.size();
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) wildcardClass7);
        java.lang.Object obj9 = stackTestDriver0.peek();
        int int10 = stackTestDriver0.size();
        int int11 = stackTestDriver0.size();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "class java.lang.Object");
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "class java.lang.Object");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test159");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        int int9 = stackTestDriver5.size();
        boolean boolean10 = stackTestDriver5.isEmpty();
        experiment.util.StackTestDriver stackTestDriver11 = new experiment.util.StackTestDriver();
        java.lang.Object obj13 = stackTestDriver11.push((java.lang.Object) (byte) -1);
        boolean boolean14 = stackTestDriver11.isEmpty();
        boolean boolean15 = stackTestDriver11.isEmpty();
        int int16 = stackTestDriver11.size();
        java.lang.Object obj17 = new java.lang.Object();
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        java.lang.Object obj19 = stackTestDriver11.push((java.lang.Object) wildcardClass18);
        java.lang.Object obj20 = stackTestDriver5.push((java.lang.Object) wildcardClass18);
        java.lang.Object obj21 = stackTestDriver5.pop();
        int int22 = stackTestDriver5.size();
        stackTestDriver5.clear();
        stackTestDriver5.clear();
        java.lang.Class<?> wildcardClass25 = stackTestDriver5.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (byte) -1 + "'", obj13, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "class java.lang.Object");
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "class java.lang.Object");
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals(obj21.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj21), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj21), "class java.lang.Object");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test160");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        java.lang.Object obj9 = stackTestDriver0.pop();
        int int10 = stackTestDriver0.size();
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test161");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        boolean boolean9 = stackTestDriver5.isEmpty();
        stackTestDriver5.clear();
        stackTestDriver5.clear();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test162");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        int int9 = stackTestDriver5.size();
        boolean boolean10 = stackTestDriver5.isEmpty();
        stackTestDriver5.clear();
        stackTestDriver5.clear();
        int int13 = stackTestDriver5.size();
        stackTestDriver5.clear();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test163");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        int int9 = stackTestDriver5.size();
        boolean boolean10 = stackTestDriver5.isEmpty();
        stackTestDriver5.clear();
        boolean boolean12 = stackTestDriver5.isEmpty();
        boolean boolean13 = stackTestDriver5.isEmpty();
        java.lang.Object obj15 = stackTestDriver5.push((java.lang.Object) "hi!");
        java.lang.Object obj16 = stackTestDriver5.pop();
        boolean boolean17 = stackTestDriver5.isEmpty();
        boolean boolean18 = stackTestDriver5.isEmpty();
        experiment.util.StackTestDriver stackTestDriver19 = new experiment.util.StackTestDriver();
        java.lang.Object obj21 = stackTestDriver19.push((java.lang.Object) (byte) -1);
        boolean boolean22 = stackTestDriver19.isEmpty();
        java.lang.Object obj23 = stackTestDriver19.pop();
        experiment.util.StackTestDriver stackTestDriver24 = new experiment.util.StackTestDriver();
        java.lang.Object obj26 = stackTestDriver24.push((java.lang.Object) (byte) -1);
        java.lang.Object obj27 = stackTestDriver19.push((java.lang.Object) stackTestDriver24);
        int int28 = stackTestDriver24.size();
        boolean boolean29 = stackTestDriver24.isEmpty();
        stackTestDriver24.clear();
        boolean boolean31 = stackTestDriver24.isEmpty();
        stackTestDriver24.clear();
        java.lang.Object obj33 = stackTestDriver5.push((java.lang.Object) stackTestDriver24);
        boolean boolean34 = stackTestDriver24.isEmpty();
        experiment.util.StackTestDriver stackTestDriver35 = new experiment.util.StackTestDriver();
        java.lang.Object obj37 = stackTestDriver35.push((java.lang.Object) (byte) -1);
        boolean boolean38 = stackTestDriver35.isEmpty();
        java.lang.Object obj39 = stackTestDriver35.pop();
        int int40 = stackTestDriver35.size();
        experiment.util.StackTestDriver stackTestDriver41 = new experiment.util.StackTestDriver();
        java.lang.Object obj43 = stackTestDriver41.push((java.lang.Object) (byte) -1);
        java.lang.Object obj44 = stackTestDriver35.push(obj43);
        java.lang.Class<?> wildcardClass45 = stackTestDriver35.getClass();
        java.lang.Object obj46 = stackTestDriver24.push((java.lang.Object) wildcardClass45);
        java.lang.Class<?> wildcardClass47 = obj46.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + "hi!" + "'", obj15, "hi!");
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + "hi!" + "'", obj16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (byte) -1 + "'", obj21, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (byte) -1 + "'", obj23, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + (byte) -1 + "'", obj26, (byte) -1);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + (byte) -1 + "'", obj37, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + (byte) -1 + "'", obj39, (byte) -1);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + (byte) -1 + "'", obj43, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + (byte) -1 + "'", obj44, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertEquals(obj46.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj46), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj46), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test164");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        int int5 = stackTestDriver0.size();
        int int6 = stackTestDriver0.size();
        java.lang.Class<?> wildcardClass7 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test165");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        int int3 = stackTestDriver0.size();
        java.lang.Object obj4 = stackTestDriver0.peek();
        boolean boolean5 = stackTestDriver0.isEmpty();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test166");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        experiment.util.StackTestDriver stackTestDriver3 = new experiment.util.StackTestDriver();
        java.lang.Object obj5 = stackTestDriver3.push((java.lang.Object) (byte) -1);
        boolean boolean6 = stackTestDriver3.isEmpty();
        boolean boolean7 = stackTestDriver3.isEmpty();
        int int8 = stackTestDriver3.size();
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        java.lang.Object obj11 = stackTestDriver3.push((java.lang.Object) wildcardClass10);
        java.lang.Object obj12 = stackTestDriver3.peek();
        java.lang.Object obj13 = stackTestDriver0.push((java.lang.Object) stackTestDriver3);
        java.lang.Object obj14 = stackTestDriver3.pop();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) -1 + "'", obj5, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "class java.lang.Object");
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "class java.lang.Object");
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "class java.lang.Object");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test167");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        experiment.util.StackTestDriver stackTestDriver3 = new experiment.util.StackTestDriver();
        java.lang.Object obj5 = stackTestDriver3.push((java.lang.Object) (byte) -1);
        boolean boolean6 = stackTestDriver3.isEmpty();
        boolean boolean7 = stackTestDriver3.isEmpty();
        int int8 = stackTestDriver3.size();
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        java.lang.Object obj11 = stackTestDriver3.push((java.lang.Object) wildcardClass10);
        java.lang.Object obj12 = stackTestDriver3.peek();
        java.lang.Object obj13 = stackTestDriver0.push((java.lang.Object) stackTestDriver3);
        java.lang.Class<?> wildcardClass14 = stackTestDriver3.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) -1 + "'", obj5, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "class java.lang.Object");
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "class java.lang.Object");
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test168");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        java.lang.Class<?> wildcardClass2 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test169");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        int int9 = stackTestDriver5.size();
        boolean boolean10 = stackTestDriver5.isEmpty();
        stackTestDriver5.clear();
        boolean boolean12 = stackTestDriver5.isEmpty();
        stackTestDriver5.clear();
        int int14 = stackTestDriver5.size();
        boolean boolean15 = stackTestDriver5.isEmpty();
        int int16 = stackTestDriver5.size();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test170");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        int int9 = stackTestDriver5.size();
        boolean boolean10 = stackTestDriver5.isEmpty();
        stackTestDriver5.clear();
        boolean boolean12 = stackTestDriver5.isEmpty();
        boolean boolean13 = stackTestDriver5.isEmpty();
        java.lang.Object obj15 = stackTestDriver5.push((java.lang.Object) "hi!");
        java.lang.Object obj16 = stackTestDriver5.pop();
        boolean boolean17 = stackTestDriver5.isEmpty();
        boolean boolean18 = stackTestDriver5.isEmpty();
        experiment.util.StackTestDriver stackTestDriver19 = new experiment.util.StackTestDriver();
        java.lang.Object obj21 = stackTestDriver19.push((java.lang.Object) (byte) -1);
        boolean boolean22 = stackTestDriver19.isEmpty();
        java.lang.Object obj23 = stackTestDriver19.pop();
        experiment.util.StackTestDriver stackTestDriver24 = new experiment.util.StackTestDriver();
        java.lang.Object obj26 = stackTestDriver24.push((java.lang.Object) (byte) -1);
        java.lang.Object obj27 = stackTestDriver19.push((java.lang.Object) stackTestDriver24);
        int int28 = stackTestDriver24.size();
        boolean boolean29 = stackTestDriver24.isEmpty();
        stackTestDriver24.clear();
        boolean boolean31 = stackTestDriver24.isEmpty();
        stackTestDriver24.clear();
        java.lang.Object obj33 = stackTestDriver5.push((java.lang.Object) stackTestDriver24);
        java.lang.Object obj34 = stackTestDriver5.pop();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + "hi!" + "'", obj15, "hi!");
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + "hi!" + "'", obj16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (byte) -1 + "'", obj21, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (byte) -1 + "'", obj23, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + (byte) -1 + "'", obj26, (byte) -1);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertNotNull(obj34);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test171");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        boolean boolean9 = stackTestDriver5.isEmpty();
        java.lang.Object obj11 = stackTestDriver5.push((java.lang.Object) 100);
        experiment.util.StackTestDriver stackTestDriver12 = new experiment.util.StackTestDriver();
        java.lang.Object obj14 = stackTestDriver12.push((java.lang.Object) (byte) -1);
        boolean boolean15 = stackTestDriver12.isEmpty();
        java.lang.Object obj16 = stackTestDriver12.pop();
        int int17 = stackTestDriver12.size();
        experiment.util.StackTestDriver stackTestDriver18 = new experiment.util.StackTestDriver();
        java.lang.Object obj20 = stackTestDriver18.push((java.lang.Object) (byte) -1);
        boolean boolean21 = stackTestDriver18.isEmpty();
        java.lang.Object obj22 = stackTestDriver18.pop();
        experiment.util.StackTestDriver stackTestDriver23 = new experiment.util.StackTestDriver();
        java.lang.Object obj25 = stackTestDriver23.push((java.lang.Object) (byte) -1);
        java.lang.Object obj26 = stackTestDriver18.push((java.lang.Object) stackTestDriver23);
        int int27 = stackTestDriver23.size();
        java.lang.Object obj28 = stackTestDriver12.push((java.lang.Object) stackTestDriver23);
        java.lang.Object obj29 = new java.lang.Object();
        java.lang.Object obj30 = stackTestDriver23.push(obj29);
        boolean boolean31 = stackTestDriver23.isEmpty();
        java.lang.Object obj32 = stackTestDriver5.push((java.lang.Object) stackTestDriver23);
        stackTestDriver5.clear();
        int int34 = stackTestDriver5.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj35 = stackTestDriver5.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 100 + "'", obj11, 100);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (byte) -1 + "'", obj14, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (byte) -1 + "'", obj16, (byte) -1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (byte) -1 + "'", obj20, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (byte) -1 + "'", obj22, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (byte) -1 + "'", obj25, (byte) -1);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test172");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        boolean boolean9 = stackTestDriver5.isEmpty();
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        java.lang.Object obj12 = stackTestDriver10.push((java.lang.Object) (byte) -1);
        boolean boolean13 = stackTestDriver10.isEmpty();
        java.lang.Object obj14 = stackTestDriver10.pop();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        java.lang.Object obj17 = stackTestDriver15.push((java.lang.Object) (byte) -1);
        java.lang.Object obj18 = stackTestDriver10.push((java.lang.Object) stackTestDriver15);
        int int19 = stackTestDriver15.size();
        java.lang.Object obj20 = stackTestDriver15.peek();
        boolean boolean21 = stackTestDriver15.isEmpty();
        stackTestDriver15.clear();
        experiment.util.StackTestDriver stackTestDriver23 = new experiment.util.StackTestDriver();
        java.lang.Object obj25 = stackTestDriver23.push((java.lang.Object) (byte) -1);
        boolean boolean26 = stackTestDriver23.isEmpty();
        boolean boolean27 = stackTestDriver23.isEmpty();
        int int28 = stackTestDriver23.size();
        java.lang.Class<?> wildcardClass29 = stackTestDriver23.getClass();
        java.lang.Object obj30 = stackTestDriver15.push((java.lang.Object) wildcardClass29);
        java.lang.Class<?> wildcardClass31 = stackTestDriver15.getClass();
        java.lang.Object obj32 = stackTestDriver5.push((java.lang.Object) wildcardClass31);
        java.lang.Object obj33 = stackTestDriver5.pop();
        experiment.util.StackTestDriver stackTestDriver34 = new experiment.util.StackTestDriver();
        java.lang.Object obj36 = stackTestDriver34.push((java.lang.Object) (byte) -1);
        boolean boolean37 = stackTestDriver34.isEmpty();
        int int38 = stackTestDriver34.size();
        java.lang.Object obj39 = stackTestDriver34.pop();
        experiment.util.StackTestDriver stackTestDriver40 = new experiment.util.StackTestDriver();
        java.lang.Object obj41 = stackTestDriver34.push((java.lang.Object) stackTestDriver40);
        java.lang.Object obj42 = stackTestDriver5.push((java.lang.Object) stackTestDriver34);
        int int43 = stackTestDriver5.size();
        experiment.util.StackTestDriver stackTestDriver44 = new experiment.util.StackTestDriver();
        java.lang.Object obj46 = stackTestDriver44.push((java.lang.Object) (byte) -1);
        boolean boolean47 = stackTestDriver44.isEmpty();
        java.lang.Object obj48 = stackTestDriver44.pop();
        experiment.util.StackTestDriver stackTestDriver49 = new experiment.util.StackTestDriver();
        java.lang.Object obj51 = stackTestDriver49.push((java.lang.Object) (byte) -1);
        java.lang.Object obj52 = stackTestDriver44.push((java.lang.Object) stackTestDriver49);
        java.lang.Object obj53 = stackTestDriver5.push((java.lang.Object) stackTestDriver44);
        boolean boolean54 = stackTestDriver44.isEmpty();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) -1 + "'", obj12, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (byte) -1 + "'", obj14, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) -1 + "'", obj17, (byte) -1);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (byte) -1 + "'", obj20, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (byte) -1 + "'", obj25, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertEquals(obj30.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj30), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj30), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertEquals(obj32.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj32), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj32), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertEquals(obj33.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj33), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj33), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + (byte) -1 + "'", obj36, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + (byte) -1 + "'", obj39, (byte) -1);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2 + "'", int43 == 2);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + (byte) -1 + "'", obj46, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + (byte) -1 + "'", obj48, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj51 + "' != '" + (byte) -1 + "'", obj51, (byte) -1);
        org.junit.Assert.assertNotNull(obj52);
        org.junit.Assert.assertNotNull(obj53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test173");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        int int9 = stackTestDriver5.size();
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        java.lang.Object obj12 = stackTestDriver10.push((java.lang.Object) (byte) -1);
        boolean boolean13 = stackTestDriver10.isEmpty();
        java.lang.Object obj14 = stackTestDriver10.pop();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        java.lang.Object obj17 = stackTestDriver15.push((java.lang.Object) (byte) -1);
        java.lang.Object obj18 = stackTestDriver10.push((java.lang.Object) stackTestDriver15);
        boolean boolean19 = stackTestDriver15.isEmpty();
        java.lang.Object obj20 = stackTestDriver5.push((java.lang.Object) stackTestDriver15);
        java.lang.Object obj21 = stackTestDriver15.peek();
        java.lang.Object obj22 = stackTestDriver15.peek();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) -1 + "'", obj12, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (byte) -1 + "'", obj14, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) -1 + "'", obj17, (byte) -1);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (byte) -1 + "'", obj21, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (byte) -1 + "'", obj22, (byte) -1);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test174");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        int int4 = stackTestDriver0.size();
        java.lang.Object obj5 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) stackTestDriver6);
        int int8 = stackTestDriver6.size();
        boolean boolean9 = stackTestDriver6.isEmpty();
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        java.lang.Object obj12 = stackTestDriver10.push((java.lang.Object) (byte) -1);
        boolean boolean13 = stackTestDriver10.isEmpty();
        java.lang.Object obj15 = stackTestDriver10.push((java.lang.Object) 10.0f);
        java.lang.Object obj16 = stackTestDriver10.pop();
        java.lang.Object obj17 = stackTestDriver10.peek();
        boolean boolean18 = stackTestDriver10.isEmpty();
        boolean boolean19 = stackTestDriver10.isEmpty();
        java.lang.Object obj20 = stackTestDriver6.push((java.lang.Object) stackTestDriver10);
        java.lang.Class<?> wildcardClass21 = stackTestDriver10.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) -1 + "'", obj5, (byte) -1);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) -1 + "'", obj12, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 10.0f + "'", obj15, 10.0f);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 10.0f + "'", obj16, 10.0f);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) -1 + "'", obj17, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test175");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        int int5 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        java.lang.Object obj8 = stackTestDriver6.push((java.lang.Object) (byte) -1);
        boolean boolean9 = stackTestDriver6.isEmpty();
        java.lang.Object obj10 = stackTestDriver6.pop();
        experiment.util.StackTestDriver stackTestDriver11 = new experiment.util.StackTestDriver();
        java.lang.Object obj13 = stackTestDriver11.push((java.lang.Object) (byte) -1);
        java.lang.Object obj14 = stackTestDriver6.push((java.lang.Object) stackTestDriver11);
        int int15 = stackTestDriver11.size();
        java.lang.Object obj16 = stackTestDriver0.push((java.lang.Object) stackTestDriver11);
        stackTestDriver11.clear();
        boolean boolean18 = stackTestDriver11.isEmpty();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) -1 + "'", obj8, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (byte) -1 + "'", obj13, (byte) -1);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test176");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        int int9 = stackTestDriver5.size();
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        java.lang.Object obj12 = stackTestDriver10.push((java.lang.Object) (byte) -1);
        boolean boolean13 = stackTestDriver10.isEmpty();
        java.lang.Object obj14 = stackTestDriver10.pop();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        java.lang.Object obj17 = stackTestDriver15.push((java.lang.Object) (byte) -1);
        java.lang.Object obj18 = stackTestDriver10.push((java.lang.Object) stackTestDriver15);
        boolean boolean19 = stackTestDriver15.isEmpty();
        java.lang.Object obj20 = stackTestDriver5.push((java.lang.Object) stackTestDriver15);
        experiment.util.StackTestDriver stackTestDriver21 = new experiment.util.StackTestDriver();
        java.lang.Object obj23 = stackTestDriver21.push((java.lang.Object) (byte) -1);
        boolean boolean24 = stackTestDriver21.isEmpty();
        java.lang.Object obj25 = stackTestDriver21.pop();
        java.lang.Object obj26 = stackTestDriver15.push((java.lang.Object) stackTestDriver21);
        boolean boolean27 = stackTestDriver21.isEmpty();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) -1 + "'", obj12, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (byte) -1 + "'", obj14, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) -1 + "'", obj17, (byte) -1);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (byte) -1 + "'", obj23, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (byte) -1 + "'", obj25, (byte) -1);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test177");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) 10.0f);
        java.lang.Object obj6 = stackTestDriver0.pop();
        int int7 = stackTestDriver0.size();
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean10 = stackTestDriver0.isEmpty();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 10.0f + "'", obj5, 10.0f);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 10.0f + "'", obj6, 10.0f);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) -1 + "'", obj9, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test178");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        int int9 = stackTestDriver5.size();
        boolean boolean10 = stackTestDriver5.isEmpty();
        stackTestDriver5.clear();
        boolean boolean12 = stackTestDriver5.isEmpty();
        boolean boolean13 = stackTestDriver5.isEmpty();
        java.lang.Object obj15 = stackTestDriver5.push((java.lang.Object) "hi!");
        boolean boolean16 = stackTestDriver5.isEmpty();
        int int17 = stackTestDriver5.size();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + "hi!" + "'", obj15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test179");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        boolean boolean9 = stackTestDriver5.isEmpty();
        java.lang.Object obj11 = stackTestDriver5.push((java.lang.Object) 100);
        experiment.util.StackTestDriver stackTestDriver12 = new experiment.util.StackTestDriver();
        java.lang.Object obj14 = stackTestDriver12.push((java.lang.Object) (byte) -1);
        boolean boolean15 = stackTestDriver12.isEmpty();
        java.lang.Object obj16 = stackTestDriver12.pop();
        int int17 = stackTestDriver12.size();
        experiment.util.StackTestDriver stackTestDriver18 = new experiment.util.StackTestDriver();
        java.lang.Object obj20 = stackTestDriver18.push((java.lang.Object) (byte) -1);
        boolean boolean21 = stackTestDriver18.isEmpty();
        java.lang.Object obj22 = stackTestDriver18.pop();
        experiment.util.StackTestDriver stackTestDriver23 = new experiment.util.StackTestDriver();
        java.lang.Object obj25 = stackTestDriver23.push((java.lang.Object) (byte) -1);
        java.lang.Object obj26 = stackTestDriver18.push((java.lang.Object) stackTestDriver23);
        int int27 = stackTestDriver23.size();
        java.lang.Object obj28 = stackTestDriver12.push((java.lang.Object) stackTestDriver23);
        java.lang.Object obj29 = new java.lang.Object();
        java.lang.Object obj30 = stackTestDriver23.push(obj29);
        boolean boolean31 = stackTestDriver23.isEmpty();
        java.lang.Object obj32 = stackTestDriver5.push((java.lang.Object) stackTestDriver23);
        java.lang.Object obj33 = stackTestDriver23.peek();
        java.lang.Class<?> wildcardClass34 = obj33.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 100 + "'", obj11, 100);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (byte) -1 + "'", obj14, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (byte) -1 + "'", obj16, (byte) -1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (byte) -1 + "'", obj20, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (byte) -1 + "'", obj22, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (byte) -1 + "'", obj25, (byte) -1);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test180");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        int int9 = stackTestDriver5.size();
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        java.lang.Object obj12 = stackTestDriver10.push((java.lang.Object) (byte) -1);
        boolean boolean13 = stackTestDriver10.isEmpty();
        java.lang.Object obj14 = stackTestDriver10.pop();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        java.lang.Object obj17 = stackTestDriver15.push((java.lang.Object) (byte) -1);
        java.lang.Object obj18 = stackTestDriver10.push((java.lang.Object) stackTestDriver15);
        boolean boolean19 = stackTestDriver15.isEmpty();
        java.lang.Object obj20 = stackTestDriver5.push((java.lang.Object) stackTestDriver15);
        java.lang.Object obj22 = stackTestDriver15.push((java.lang.Object) 10);
        experiment.util.StackTestDriver stackTestDriver23 = new experiment.util.StackTestDriver();
        java.lang.Object obj25 = stackTestDriver23.push((java.lang.Object) (byte) -1);
        boolean boolean26 = stackTestDriver23.isEmpty();
        boolean boolean27 = stackTestDriver23.isEmpty();
        int int28 = stackTestDriver23.size();
        java.lang.Object obj29 = new java.lang.Object();
        java.lang.Class<?> wildcardClass30 = obj29.getClass();
        java.lang.Object obj31 = stackTestDriver23.push((java.lang.Object) wildcardClass30);
        int int32 = stackTestDriver23.size();
        int int33 = stackTestDriver23.size();
        java.lang.Object obj34 = stackTestDriver15.push((java.lang.Object) int33);
        experiment.util.StackTestDriver stackTestDriver35 = new experiment.util.StackTestDriver();
        java.lang.Object obj37 = stackTestDriver35.push((java.lang.Object) (byte) -1);
        int int38 = stackTestDriver35.size();
        experiment.util.StackTestDriver stackTestDriver39 = new experiment.util.StackTestDriver();
        java.lang.Object obj41 = stackTestDriver39.push((java.lang.Object) (byte) -1);
        boolean boolean42 = stackTestDriver39.isEmpty();
        java.lang.Object obj43 = stackTestDriver39.pop();
        experiment.util.StackTestDriver stackTestDriver44 = new experiment.util.StackTestDriver();
        java.lang.Object obj46 = stackTestDriver44.push((java.lang.Object) (byte) -1);
        java.lang.Object obj47 = stackTestDriver39.push((java.lang.Object) stackTestDriver44);
        int int48 = stackTestDriver44.size();
        experiment.util.StackTestDriver stackTestDriver49 = new experiment.util.StackTestDriver();
        java.lang.Object obj51 = stackTestDriver49.push((java.lang.Object) (byte) -1);
        boolean boolean52 = stackTestDriver49.isEmpty();
        java.lang.Object obj53 = stackTestDriver49.pop();
        experiment.util.StackTestDriver stackTestDriver54 = new experiment.util.StackTestDriver();
        java.lang.Object obj56 = stackTestDriver54.push((java.lang.Object) (byte) -1);
        java.lang.Object obj57 = stackTestDriver49.push((java.lang.Object) stackTestDriver54);
        boolean boolean58 = stackTestDriver54.isEmpty();
        java.lang.Object obj59 = stackTestDriver44.push((java.lang.Object) stackTestDriver54);
        java.lang.Object obj60 = stackTestDriver35.push(obj59);
        java.lang.Object obj61 = stackTestDriver15.push((java.lang.Object) stackTestDriver35);
        java.lang.Object obj62 = stackTestDriver35.pop();
        stackTestDriver35.clear();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) -1 + "'", obj12, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (byte) -1 + "'", obj14, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) -1 + "'", obj17, (byte) -1);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 10 + "'", obj22, 10);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (byte) -1 + "'", obj25, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertEquals(obj31.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj31), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj31), "class java.lang.Object");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2 + "'", int32 == 2);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2 + "'", int33 == 2);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + 2 + "'", obj34, 2);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + (byte) -1 + "'", obj37, (byte) -1);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + (byte) -1 + "'", obj41, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + (byte) -1 + "'", obj43, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + (byte) -1 + "'", obj46, (byte) -1);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertEquals("'" + obj51 + "' != '" + (byte) -1 + "'", obj51, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + obj53 + "' != '" + (byte) -1 + "'", obj53, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj56 + "' != '" + (byte) -1 + "'", obj56, (byte) -1);
        org.junit.Assert.assertNotNull(obj57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(obj59);
        org.junit.Assert.assertNotNull(obj60);
        org.junit.Assert.assertNotNull(obj61);
        org.junit.Assert.assertNotNull(obj62);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test181");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.peek();
        java.lang.Object obj5 = stackTestDriver0.pop();
        stackTestDriver0.clear();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) -1 + "'", obj5, (byte) -1);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test182");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test183");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        boolean boolean4 = stackTestDriver0.isEmpty();
        java.lang.Object obj5 = stackTestDriver0.pop();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) -1 + "'", obj5, (byte) -1);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test184");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        int int9 = stackTestDriver5.size();
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        java.lang.Object obj12 = stackTestDriver10.push((java.lang.Object) (byte) -1);
        boolean boolean13 = stackTestDriver10.isEmpty();
        java.lang.Object obj14 = stackTestDriver10.pop();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        java.lang.Object obj17 = stackTestDriver15.push((java.lang.Object) (byte) -1);
        java.lang.Object obj18 = stackTestDriver10.push((java.lang.Object) stackTestDriver15);
        boolean boolean19 = stackTestDriver15.isEmpty();
        java.lang.Object obj20 = stackTestDriver5.push((java.lang.Object) stackTestDriver15);
        java.lang.Object obj22 = stackTestDriver15.push((java.lang.Object) 10);
        experiment.util.StackTestDriver stackTestDriver23 = new experiment.util.StackTestDriver();
        java.lang.Object obj25 = stackTestDriver23.push((java.lang.Object) (byte) -1);
        boolean boolean26 = stackTestDriver23.isEmpty();
        boolean boolean27 = stackTestDriver23.isEmpty();
        int int28 = stackTestDriver23.size();
        java.lang.Object obj29 = new java.lang.Object();
        java.lang.Class<?> wildcardClass30 = obj29.getClass();
        java.lang.Object obj31 = stackTestDriver23.push((java.lang.Object) wildcardClass30);
        int int32 = stackTestDriver23.size();
        int int33 = stackTestDriver23.size();
        java.lang.Object obj34 = stackTestDriver15.push((java.lang.Object) int33);
        experiment.util.StackTestDriver stackTestDriver35 = new experiment.util.StackTestDriver();
        java.lang.Object obj37 = stackTestDriver35.push((java.lang.Object) (byte) -1);
        int int38 = stackTestDriver35.size();
        experiment.util.StackTestDriver stackTestDriver39 = new experiment.util.StackTestDriver();
        java.lang.Object obj41 = stackTestDriver39.push((java.lang.Object) (byte) -1);
        boolean boolean42 = stackTestDriver39.isEmpty();
        java.lang.Object obj43 = stackTestDriver39.pop();
        experiment.util.StackTestDriver stackTestDriver44 = new experiment.util.StackTestDriver();
        java.lang.Object obj46 = stackTestDriver44.push((java.lang.Object) (byte) -1);
        java.lang.Object obj47 = stackTestDriver39.push((java.lang.Object) stackTestDriver44);
        int int48 = stackTestDriver44.size();
        experiment.util.StackTestDriver stackTestDriver49 = new experiment.util.StackTestDriver();
        java.lang.Object obj51 = stackTestDriver49.push((java.lang.Object) (byte) -1);
        boolean boolean52 = stackTestDriver49.isEmpty();
        java.lang.Object obj53 = stackTestDriver49.pop();
        experiment.util.StackTestDriver stackTestDriver54 = new experiment.util.StackTestDriver();
        java.lang.Object obj56 = stackTestDriver54.push((java.lang.Object) (byte) -1);
        java.lang.Object obj57 = stackTestDriver49.push((java.lang.Object) stackTestDriver54);
        boolean boolean58 = stackTestDriver54.isEmpty();
        java.lang.Object obj59 = stackTestDriver44.push((java.lang.Object) stackTestDriver54);
        java.lang.Object obj60 = stackTestDriver35.push(obj59);
        java.lang.Object obj61 = stackTestDriver15.push((java.lang.Object) stackTestDriver35);
        java.lang.Object obj62 = stackTestDriver35.pop();
        java.lang.Object obj63 = stackTestDriver35.peek();
        stackTestDriver35.clear();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) -1 + "'", obj12, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (byte) -1 + "'", obj14, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) -1 + "'", obj17, (byte) -1);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 10 + "'", obj22, 10);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (byte) -1 + "'", obj25, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertEquals(obj31.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj31), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj31), "class java.lang.Object");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2 + "'", int32 == 2);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2 + "'", int33 == 2);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + 2 + "'", obj34, 2);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + (byte) -1 + "'", obj37, (byte) -1);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + (byte) -1 + "'", obj41, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + (byte) -1 + "'", obj43, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + (byte) -1 + "'", obj46, (byte) -1);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertEquals("'" + obj51 + "' != '" + (byte) -1 + "'", obj51, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + obj53 + "' != '" + (byte) -1 + "'", obj53, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj56 + "' != '" + (byte) -1 + "'", obj56, (byte) -1);
        org.junit.Assert.assertNotNull(obj57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(obj59);
        org.junit.Assert.assertNotNull(obj60);
        org.junit.Assert.assertNotNull(obj61);
        org.junit.Assert.assertNotNull(obj62);
        org.junit.Assert.assertEquals("'" + obj63 + "' != '" + (byte) -1 + "'", obj63, (byte) -1);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test185");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        int int9 = stackTestDriver5.size();
        boolean boolean10 = stackTestDriver5.isEmpty();
        stackTestDriver5.clear();
        boolean boolean12 = stackTestDriver5.isEmpty();
        boolean boolean13 = stackTestDriver5.isEmpty();
        java.lang.Object obj15 = stackTestDriver5.push((java.lang.Object) '#');
        stackTestDriver5.clear();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + '#' + "'", obj15, '#');
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test186");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        int int9 = stackTestDriver5.size();
        boolean boolean10 = stackTestDriver5.isEmpty();
        experiment.util.StackTestDriver stackTestDriver11 = new experiment.util.StackTestDriver();
        java.lang.Object obj13 = stackTestDriver11.push((java.lang.Object) (byte) -1);
        boolean boolean14 = stackTestDriver11.isEmpty();
        boolean boolean15 = stackTestDriver11.isEmpty();
        int int16 = stackTestDriver11.size();
        java.lang.Object obj17 = new java.lang.Object();
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        java.lang.Object obj19 = stackTestDriver11.push((java.lang.Object) wildcardClass18);
        java.lang.Object obj20 = stackTestDriver5.push((java.lang.Object) wildcardClass18);
        java.lang.Object obj21 = stackTestDriver5.pop();
        int int22 = stackTestDriver5.size();
        stackTestDriver5.clear();
        stackTestDriver5.clear();
        int int25 = stackTestDriver5.size();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (byte) -1 + "'", obj13, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "class java.lang.Object");
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "class java.lang.Object");
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals(obj21.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj21), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj21), "class java.lang.Object");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test187");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) 10.0f);
        int int6 = stackTestDriver0.size();
        int int7 = stackTestDriver0.size();
        int int8 = stackTestDriver0.size();
        stackTestDriver0.clear();
        int int10 = stackTestDriver0.size();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 10.0f + "'", obj5, 10.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test188");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) ' ');
        int int8 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver9 = new experiment.util.StackTestDriver();
        java.lang.Object obj11 = stackTestDriver9.push((java.lang.Object) (byte) -1);
        experiment.util.StackTestDriver stackTestDriver12 = new experiment.util.StackTestDriver();
        java.lang.Object obj14 = stackTestDriver12.push((java.lang.Object) (byte) -1);
        boolean boolean15 = stackTestDriver12.isEmpty();
        boolean boolean16 = stackTestDriver12.isEmpty();
        int int17 = stackTestDriver12.size();
        java.lang.Object obj18 = new java.lang.Object();
        java.lang.Class<?> wildcardClass19 = obj18.getClass();
        java.lang.Object obj20 = stackTestDriver12.push((java.lang.Object) wildcardClass19);
        java.lang.Object obj21 = stackTestDriver12.peek();
        java.lang.Object obj22 = stackTestDriver9.push((java.lang.Object) stackTestDriver12);
        boolean boolean23 = stackTestDriver9.isEmpty();
        java.lang.Object obj24 = stackTestDriver0.push((java.lang.Object) boolean23);
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + ' ' + "'", obj7, ' ');
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) -1 + "'", obj11, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (byte) -1 + "'", obj14, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "class java.lang.Object");
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals(obj21.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj21), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj21), "class java.lang.Object");
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + false + "'", obj24, false);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test189");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        boolean boolean9 = stackTestDriver5.isEmpty();
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        java.lang.Object obj12 = stackTestDriver10.push((java.lang.Object) (byte) -1);
        boolean boolean13 = stackTestDriver10.isEmpty();
        java.lang.Object obj14 = stackTestDriver10.pop();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        java.lang.Object obj17 = stackTestDriver15.push((java.lang.Object) (byte) -1);
        java.lang.Object obj18 = stackTestDriver10.push((java.lang.Object) stackTestDriver15);
        int int19 = stackTestDriver15.size();
        java.lang.Object obj20 = stackTestDriver15.peek();
        boolean boolean21 = stackTestDriver15.isEmpty();
        stackTestDriver15.clear();
        experiment.util.StackTestDriver stackTestDriver23 = new experiment.util.StackTestDriver();
        java.lang.Object obj25 = stackTestDriver23.push((java.lang.Object) (byte) -1);
        boolean boolean26 = stackTestDriver23.isEmpty();
        boolean boolean27 = stackTestDriver23.isEmpty();
        int int28 = stackTestDriver23.size();
        java.lang.Class<?> wildcardClass29 = stackTestDriver23.getClass();
        java.lang.Object obj30 = stackTestDriver15.push((java.lang.Object) wildcardClass29);
        java.lang.Class<?> wildcardClass31 = stackTestDriver15.getClass();
        java.lang.Object obj32 = stackTestDriver5.push((java.lang.Object) wildcardClass31);
        java.lang.Object obj33 = stackTestDriver5.pop();
        stackTestDriver5.clear();
        boolean boolean35 = stackTestDriver5.isEmpty();
        stackTestDriver5.clear();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) -1 + "'", obj12, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (byte) -1 + "'", obj14, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) -1 + "'", obj17, (byte) -1);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (byte) -1 + "'", obj20, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (byte) -1 + "'", obj25, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertEquals(obj30.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj30), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj30), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertEquals(obj32.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj32), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj32), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertEquals(obj33.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj33), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj33), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test190");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        int int5 = stackTestDriver0.size();
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
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test191");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        java.lang.Object obj9 = stackTestDriver0.pop();
        boolean boolean10 = stackTestDriver0.isEmpty();
        boolean boolean11 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test192");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        int int4 = stackTestDriver0.size();
        java.lang.Object obj5 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) stackTestDriver6);
        int int8 = stackTestDriver6.size();
        boolean boolean9 = stackTestDriver6.isEmpty();
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        java.lang.Object obj12 = stackTestDriver10.push((java.lang.Object) (byte) -1);
        boolean boolean13 = stackTestDriver10.isEmpty();
        java.lang.Object obj15 = stackTestDriver10.push((java.lang.Object) 10.0f);
        java.lang.Object obj16 = stackTestDriver10.pop();
        java.lang.Object obj17 = stackTestDriver10.peek();
        boolean boolean18 = stackTestDriver10.isEmpty();
        boolean boolean19 = stackTestDriver10.isEmpty();
        java.lang.Object obj20 = stackTestDriver6.push((java.lang.Object) stackTestDriver10);
        java.lang.Object obj21 = stackTestDriver10.pop();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = stackTestDriver10.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) -1 + "'", obj5, (byte) -1);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) -1 + "'", obj12, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 10.0f + "'", obj15, 10.0f);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 10.0f + "'", obj16, 10.0f);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) -1 + "'", obj17, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (byte) -1 + "'", obj21, (byte) -1);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test193");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        experiment.util.StackTestDriver stackTestDriver3 = new experiment.util.StackTestDriver();
        java.lang.Object obj5 = stackTestDriver3.push((java.lang.Object) (byte) -1);
        boolean boolean6 = stackTestDriver3.isEmpty();
        boolean boolean7 = stackTestDriver3.isEmpty();
        int int8 = stackTestDriver3.size();
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        java.lang.Object obj11 = stackTestDriver3.push((java.lang.Object) wildcardClass10);
        java.lang.Object obj12 = stackTestDriver3.peek();
        java.lang.Object obj13 = stackTestDriver0.push((java.lang.Object) stackTestDriver3);
        int int14 = stackTestDriver3.size();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        java.lang.Object obj17 = stackTestDriver15.push((java.lang.Object) (byte) -1);
        boolean boolean18 = stackTestDriver15.isEmpty();
        int int19 = stackTestDriver15.size();
        stackTestDriver15.clear();
        stackTestDriver15.clear();
        java.lang.Object obj22 = stackTestDriver3.push((java.lang.Object) stackTestDriver15);
        java.lang.Object obj23 = stackTestDriver3.peek();
        boolean boolean24 = stackTestDriver3.isEmpty();
        java.lang.Object obj25 = stackTestDriver3.peek();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) -1 + "'", obj5, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "class java.lang.Object");
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "class java.lang.Object");
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) -1 + "'", obj17, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(obj25);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test194");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        boolean boolean9 = stackTestDriver5.isEmpty();
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        java.lang.Object obj12 = stackTestDriver10.push((java.lang.Object) (byte) -1);
        boolean boolean13 = stackTestDriver10.isEmpty();
        java.lang.Object obj14 = stackTestDriver10.pop();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        java.lang.Object obj17 = stackTestDriver15.push((java.lang.Object) (byte) -1);
        java.lang.Object obj18 = stackTestDriver10.push((java.lang.Object) stackTestDriver15);
        int int19 = stackTestDriver15.size();
        java.lang.Object obj20 = stackTestDriver15.peek();
        boolean boolean21 = stackTestDriver15.isEmpty();
        stackTestDriver15.clear();
        experiment.util.StackTestDriver stackTestDriver23 = new experiment.util.StackTestDriver();
        java.lang.Object obj25 = stackTestDriver23.push((java.lang.Object) (byte) -1);
        boolean boolean26 = stackTestDriver23.isEmpty();
        boolean boolean27 = stackTestDriver23.isEmpty();
        int int28 = stackTestDriver23.size();
        java.lang.Class<?> wildcardClass29 = stackTestDriver23.getClass();
        java.lang.Object obj30 = stackTestDriver15.push((java.lang.Object) wildcardClass29);
        java.lang.Class<?> wildcardClass31 = stackTestDriver15.getClass();
        java.lang.Object obj32 = stackTestDriver5.push((java.lang.Object) wildcardClass31);
        java.lang.Object obj33 = stackTestDriver5.pop();
        experiment.util.StackTestDriver stackTestDriver34 = new experiment.util.StackTestDriver();
        java.lang.Object obj36 = stackTestDriver34.push((java.lang.Object) (byte) -1);
        boolean boolean37 = stackTestDriver34.isEmpty();
        int int38 = stackTestDriver34.size();
        java.lang.Object obj39 = stackTestDriver34.pop();
        experiment.util.StackTestDriver stackTestDriver40 = new experiment.util.StackTestDriver();
        java.lang.Object obj41 = stackTestDriver34.push((java.lang.Object) stackTestDriver40);
        java.lang.Object obj42 = stackTestDriver5.push((java.lang.Object) stackTestDriver34);
        int int43 = stackTestDriver34.size();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) -1 + "'", obj12, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (byte) -1 + "'", obj14, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) -1 + "'", obj17, (byte) -1);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (byte) -1 + "'", obj20, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (byte) -1 + "'", obj25, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertEquals(obj30.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj30), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj30), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertEquals(obj32.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj32), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj32), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertEquals(obj33.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj33), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj33), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + (byte) -1 + "'", obj36, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + (byte) -1 + "'", obj39, (byte) -1);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test195");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        int int9 = stackTestDriver5.size();
        boolean boolean10 = stackTestDriver5.isEmpty();
        stackTestDriver5.clear();
        boolean boolean12 = stackTestDriver5.isEmpty();
        int int13 = stackTestDriver5.size();
        experiment.util.StackTestDriver stackTestDriver14 = new experiment.util.StackTestDriver();
        java.lang.Object obj16 = stackTestDriver14.push((java.lang.Object) (byte) -1);
        boolean boolean17 = stackTestDriver14.isEmpty();
        java.lang.Object obj18 = stackTestDriver14.pop();
        experiment.util.StackTestDriver stackTestDriver19 = new experiment.util.StackTestDriver();
        java.lang.Object obj21 = stackTestDriver19.push((java.lang.Object) (byte) -1);
        java.lang.Object obj22 = stackTestDriver14.push((java.lang.Object) stackTestDriver19);
        boolean boolean23 = stackTestDriver19.isEmpty();
        stackTestDriver19.clear();
        java.lang.Object obj25 = stackTestDriver5.push((java.lang.Object) stackTestDriver19);
        int int26 = stackTestDriver5.size();
        java.lang.Class<?> wildcardClass27 = stackTestDriver5.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (byte) -1 + "'", obj16, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (byte) -1 + "'", obj18, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (byte) -1 + "'", obj21, (byte) -1);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test196");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        int int4 = stackTestDriver0.size();
        java.lang.Object obj5 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) stackTestDriver6);
        java.lang.Class<?> wildcardClass8 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) -1 + "'", obj5, (byte) -1);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test197");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        int int9 = stackTestDriver5.size();
        boolean boolean10 = stackTestDriver5.isEmpty();
        stackTestDriver5.clear();
        int int12 = stackTestDriver5.size();
        experiment.util.StackTestDriver stackTestDriver13 = new experiment.util.StackTestDriver();
        java.lang.Object obj15 = stackTestDriver13.push((java.lang.Object) (byte) -1);
        boolean boolean16 = stackTestDriver13.isEmpty();
        java.lang.Object obj18 = stackTestDriver13.push((java.lang.Object) 10.0f);
        java.lang.Object obj19 = stackTestDriver13.pop();
        boolean boolean20 = stackTestDriver13.isEmpty();
        java.lang.Object obj21 = stackTestDriver5.push((java.lang.Object) stackTestDriver13);
        java.lang.Class<?> wildcardClass22 = stackTestDriver13.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (byte) -1 + "'", obj15, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 10.0f + "'", obj18, 10.0f);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 10.0f + "'", obj19, 10.0f);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test198");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        int int5 = stackTestDriver0.size();
        java.lang.Class<?> wildcardClass6 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test199");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        boolean boolean9 = stackTestDriver5.isEmpty();
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        java.lang.Object obj12 = stackTestDriver10.push((java.lang.Object) (byte) -1);
        boolean boolean13 = stackTestDriver10.isEmpty();
        java.lang.Object obj14 = stackTestDriver10.pop();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        java.lang.Object obj17 = stackTestDriver15.push((java.lang.Object) (byte) -1);
        java.lang.Object obj18 = stackTestDriver10.push((java.lang.Object) stackTestDriver15);
        int int19 = stackTestDriver15.size();
        java.lang.Object obj20 = stackTestDriver15.peek();
        boolean boolean21 = stackTestDriver15.isEmpty();
        stackTestDriver15.clear();
        experiment.util.StackTestDriver stackTestDriver23 = new experiment.util.StackTestDriver();
        java.lang.Object obj25 = stackTestDriver23.push((java.lang.Object) (byte) -1);
        boolean boolean26 = stackTestDriver23.isEmpty();
        boolean boolean27 = stackTestDriver23.isEmpty();
        int int28 = stackTestDriver23.size();
        java.lang.Class<?> wildcardClass29 = stackTestDriver23.getClass();
        java.lang.Object obj30 = stackTestDriver15.push((java.lang.Object) wildcardClass29);
        java.lang.Class<?> wildcardClass31 = stackTestDriver15.getClass();
        java.lang.Object obj32 = stackTestDriver5.push((java.lang.Object) wildcardClass31);
        stackTestDriver5.clear();
        boolean boolean34 = stackTestDriver5.isEmpty();
        boolean boolean35 = stackTestDriver5.isEmpty();
        int int36 = stackTestDriver5.size();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) -1 + "'", obj12, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (byte) -1 + "'", obj14, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) -1 + "'", obj17, (byte) -1);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (byte) -1 + "'", obj20, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (byte) -1 + "'", obj25, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertEquals(obj30.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj30), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj30), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertEquals(obj32.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj32), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj32), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test200");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        boolean boolean4 = stackTestDriver0.isEmpty();
        int int5 = stackTestDriver0.size();
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) wildcardClass7);
        java.lang.Object obj9 = stackTestDriver0.peek();
        int int10 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver11 = new experiment.util.StackTestDriver();
        java.lang.Object obj13 = stackTestDriver11.push((java.lang.Object) (byte) -1);
        boolean boolean14 = stackTestDriver11.isEmpty();
        java.lang.Object obj15 = stackTestDriver11.pop();
        experiment.util.StackTestDriver stackTestDriver16 = new experiment.util.StackTestDriver();
        java.lang.Object obj18 = stackTestDriver16.push((java.lang.Object) (byte) -1);
        java.lang.Object obj19 = stackTestDriver11.push((java.lang.Object) stackTestDriver16);
        boolean boolean20 = stackTestDriver16.isEmpty();
        java.lang.Object obj22 = stackTestDriver16.push((java.lang.Object) 100);
        experiment.util.StackTestDriver stackTestDriver23 = new experiment.util.StackTestDriver();
        java.lang.Object obj25 = stackTestDriver23.push((java.lang.Object) (byte) -1);
        boolean boolean26 = stackTestDriver23.isEmpty();
        java.lang.Object obj27 = stackTestDriver23.pop();
        int int28 = stackTestDriver23.size();
        experiment.util.StackTestDriver stackTestDriver29 = new experiment.util.StackTestDriver();
        java.lang.Object obj31 = stackTestDriver29.push((java.lang.Object) (byte) -1);
        boolean boolean32 = stackTestDriver29.isEmpty();
        java.lang.Object obj33 = stackTestDriver29.pop();
        experiment.util.StackTestDriver stackTestDriver34 = new experiment.util.StackTestDriver();
        java.lang.Object obj36 = stackTestDriver34.push((java.lang.Object) (byte) -1);
        java.lang.Object obj37 = stackTestDriver29.push((java.lang.Object) stackTestDriver34);
        int int38 = stackTestDriver34.size();
        java.lang.Object obj39 = stackTestDriver23.push((java.lang.Object) stackTestDriver34);
        java.lang.Object obj40 = new java.lang.Object();
        java.lang.Object obj41 = stackTestDriver34.push(obj40);
        boolean boolean42 = stackTestDriver34.isEmpty();
        java.lang.Object obj43 = stackTestDriver16.push((java.lang.Object) stackTestDriver34);
        java.lang.Object obj44 = stackTestDriver34.peek();
        java.lang.Object obj45 = stackTestDriver0.push((java.lang.Object) stackTestDriver34);
        boolean boolean46 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver47 = new experiment.util.StackTestDriver();
        java.lang.Object obj49 = stackTestDriver47.push((java.lang.Object) (byte) -1);
        boolean boolean50 = stackTestDriver47.isEmpty();
        java.lang.Object obj51 = stackTestDriver47.pop();
        int int52 = stackTestDriver47.size();
        experiment.util.StackTestDriver stackTestDriver53 = new experiment.util.StackTestDriver();
        java.lang.Object obj55 = stackTestDriver53.push((java.lang.Object) (byte) -1);
        boolean boolean56 = stackTestDriver53.isEmpty();
        java.lang.Object obj57 = stackTestDriver53.pop();
        experiment.util.StackTestDriver stackTestDriver58 = new experiment.util.StackTestDriver();
        java.lang.Object obj60 = stackTestDriver58.push((java.lang.Object) (byte) -1);
        java.lang.Object obj61 = stackTestDriver53.push((java.lang.Object) stackTestDriver58);
        int int62 = stackTestDriver58.size();
        java.lang.Object obj63 = stackTestDriver47.push((java.lang.Object) stackTestDriver58);
        java.lang.Object obj64 = stackTestDriver0.push((java.lang.Object) stackTestDriver58);
        java.lang.Object obj65 = stackTestDriver58.peek();
        stackTestDriver58.clear();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "class java.lang.Object");
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "class java.lang.Object");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (byte) -1 + "'", obj13, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (byte) -1 + "'", obj15, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (byte) -1 + "'", obj18, (byte) -1);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 100 + "'", obj22, 100);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (byte) -1 + "'", obj25, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + (byte) -1 + "'", obj27, (byte) -1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + (byte) -1 + "'", obj31, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + (byte) -1 + "'", obj33, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + (byte) -1 + "'", obj36, (byte) -1);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(obj43);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + (byte) -1 + "'", obj49, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + obj51 + "' != '" + (byte) -1 + "'", obj51, (byte) -1);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertEquals("'" + obj55 + "' != '" + (byte) -1 + "'", obj55, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertEquals("'" + obj57 + "' != '" + (byte) -1 + "'", obj57, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj60 + "' != '" + (byte) -1 + "'", obj60, (byte) -1);
        org.junit.Assert.assertNotNull(obj61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 1 + "'", int62 == 1);
        org.junit.Assert.assertNotNull(obj63);
        org.junit.Assert.assertNotNull(obj64);
        org.junit.Assert.assertEquals("'" + obj65 + "' != '" + (byte) -1 + "'", obj65, (byte) -1);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test201");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        boolean boolean4 = stackTestDriver0.isEmpty();
        boolean boolean5 = stackTestDriver0.isEmpty();
        int int6 = stackTestDriver0.size();
        stackTestDriver0.clear();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test202");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) ' ');
        java.lang.Object obj8 = stackTestDriver0.peek();
        boolean boolean9 = stackTestDriver0.isEmpty();
        boolean boolean10 = stackTestDriver0.isEmpty();
        java.lang.Class<?> wildcardClass11 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + ' ' + "'", obj7, ' ');
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + ' ' + "'", obj8, ' ');
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test203");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        java.lang.Object obj9 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        java.lang.Object obj12 = stackTestDriver10.push((java.lang.Object) (byte) -1);
        experiment.util.StackTestDriver stackTestDriver13 = new experiment.util.StackTestDriver();
        java.lang.Object obj15 = stackTestDriver13.push((java.lang.Object) (byte) -1);
        boolean boolean16 = stackTestDriver13.isEmpty();
        int int17 = stackTestDriver13.size();
        java.lang.Object obj18 = stackTestDriver13.pop();
        experiment.util.StackTestDriver stackTestDriver19 = new experiment.util.StackTestDriver();
        java.lang.Object obj20 = stackTestDriver13.push((java.lang.Object) stackTestDriver19);
        java.lang.Object obj21 = stackTestDriver10.push(obj20);
        java.lang.Object obj22 = stackTestDriver10.peek();
        java.lang.Object obj23 = stackTestDriver0.push(obj22);
        stackTestDriver0.clear();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) -1 + "'", obj12, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (byte) -1 + "'", obj15, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (byte) -1 + "'", obj18, (byte) -1);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(obj23);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test204");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        int int9 = stackTestDriver5.size();
        java.lang.Object obj10 = stackTestDriver5.peek();
        boolean boolean11 = stackTestDriver5.isEmpty();
        stackTestDriver5.clear();
        experiment.util.StackTestDriver stackTestDriver13 = new experiment.util.StackTestDriver();
        java.lang.Object obj15 = stackTestDriver13.push((java.lang.Object) (byte) -1);
        boolean boolean16 = stackTestDriver13.isEmpty();
        boolean boolean17 = stackTestDriver13.isEmpty();
        int int18 = stackTestDriver13.size();
        java.lang.Class<?> wildcardClass19 = stackTestDriver13.getClass();
        java.lang.Object obj20 = stackTestDriver5.push((java.lang.Object) wildcardClass19);
        int int21 = stackTestDriver5.size();
        java.lang.Object obj22 = stackTestDriver5.peek();
        java.lang.Class<?> wildcardClass23 = obj22.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (byte) -1 + "'", obj15, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals(obj22.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj22), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj22), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test205");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        int int9 = stackTestDriver5.size();
        boolean boolean10 = stackTestDriver5.isEmpty();
        stackTestDriver5.clear();
        boolean boolean12 = stackTestDriver5.isEmpty();
        boolean boolean13 = stackTestDriver5.isEmpty();
        java.lang.Object obj15 = stackTestDriver5.push((java.lang.Object) "hi!");
        java.lang.Object obj16 = stackTestDriver5.pop();
        boolean boolean17 = stackTestDriver5.isEmpty();
        int int18 = stackTestDriver5.size();
        stackTestDriver5.clear();
        experiment.util.StackTestDriver stackTestDriver20 = new experiment.util.StackTestDriver();
        java.lang.Object obj22 = stackTestDriver20.push((java.lang.Object) (byte) -1);
        boolean boolean23 = stackTestDriver20.isEmpty();
        java.lang.Object obj24 = stackTestDriver20.pop();
        experiment.util.StackTestDriver stackTestDriver25 = new experiment.util.StackTestDriver();
        java.lang.Object obj27 = stackTestDriver25.push((java.lang.Object) (byte) -1);
        java.lang.Object obj28 = stackTestDriver20.push((java.lang.Object) stackTestDriver25);
        int int29 = stackTestDriver25.size();
        experiment.util.StackTestDriver stackTestDriver30 = new experiment.util.StackTestDriver();
        java.lang.Object obj32 = stackTestDriver30.push((java.lang.Object) (byte) -1);
        boolean boolean33 = stackTestDriver30.isEmpty();
        java.lang.Object obj34 = stackTestDriver30.pop();
        experiment.util.StackTestDriver stackTestDriver35 = new experiment.util.StackTestDriver();
        java.lang.Object obj37 = stackTestDriver35.push((java.lang.Object) (byte) -1);
        java.lang.Object obj38 = stackTestDriver30.push((java.lang.Object) stackTestDriver35);
        boolean boolean39 = stackTestDriver35.isEmpty();
        java.lang.Object obj40 = stackTestDriver25.push((java.lang.Object) stackTestDriver35);
        java.lang.Object obj42 = stackTestDriver35.push((java.lang.Object) 10);
        experiment.util.StackTestDriver stackTestDriver43 = new experiment.util.StackTestDriver();
        java.lang.Object obj45 = stackTestDriver43.push((java.lang.Object) (byte) -1);
        boolean boolean46 = stackTestDriver43.isEmpty();
        boolean boolean47 = stackTestDriver43.isEmpty();
        int int48 = stackTestDriver43.size();
        java.lang.Object obj49 = new java.lang.Object();
        java.lang.Class<?> wildcardClass50 = obj49.getClass();
        java.lang.Object obj51 = stackTestDriver43.push((java.lang.Object) wildcardClass50);
        int int52 = stackTestDriver43.size();
        int int53 = stackTestDriver43.size();
        java.lang.Object obj54 = stackTestDriver35.push((java.lang.Object) int53);
        experiment.util.StackTestDriver stackTestDriver55 = new experiment.util.StackTestDriver();
        java.lang.Object obj57 = stackTestDriver55.push((java.lang.Object) (byte) -1);
        int int58 = stackTestDriver55.size();
        experiment.util.StackTestDriver stackTestDriver59 = new experiment.util.StackTestDriver();
        java.lang.Object obj61 = stackTestDriver59.push((java.lang.Object) (byte) -1);
        boolean boolean62 = stackTestDriver59.isEmpty();
        java.lang.Object obj63 = stackTestDriver59.pop();
        experiment.util.StackTestDriver stackTestDriver64 = new experiment.util.StackTestDriver();
        java.lang.Object obj66 = stackTestDriver64.push((java.lang.Object) (byte) -1);
        java.lang.Object obj67 = stackTestDriver59.push((java.lang.Object) stackTestDriver64);
        int int68 = stackTestDriver64.size();
        experiment.util.StackTestDriver stackTestDriver69 = new experiment.util.StackTestDriver();
        java.lang.Object obj71 = stackTestDriver69.push((java.lang.Object) (byte) -1);
        boolean boolean72 = stackTestDriver69.isEmpty();
        java.lang.Object obj73 = stackTestDriver69.pop();
        experiment.util.StackTestDriver stackTestDriver74 = new experiment.util.StackTestDriver();
        java.lang.Object obj76 = stackTestDriver74.push((java.lang.Object) (byte) -1);
        java.lang.Object obj77 = stackTestDriver69.push((java.lang.Object) stackTestDriver74);
        boolean boolean78 = stackTestDriver74.isEmpty();
        java.lang.Object obj79 = stackTestDriver64.push((java.lang.Object) stackTestDriver74);
        java.lang.Object obj80 = stackTestDriver55.push(obj79);
        java.lang.Object obj81 = stackTestDriver35.push((java.lang.Object) stackTestDriver55);
        stackTestDriver55.clear();
        java.lang.Object obj83 = stackTestDriver5.push((java.lang.Object) stackTestDriver55);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj84 = stackTestDriver55.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + "hi!" + "'", obj15, "hi!");
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + "hi!" + "'", obj16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (byte) -1 + "'", obj22, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (byte) -1 + "'", obj24, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + (byte) -1 + "'", obj27, (byte) -1);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + (byte) -1 + "'", obj32, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + (byte) -1 + "'", obj34, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + (byte) -1 + "'", obj37, (byte) -1);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + 10 + "'", obj42, 10);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + (byte) -1 + "'", obj45, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertNotNull(obj51);
        org.junit.Assert.assertEquals(obj51.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj51), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj51), "class java.lang.Object");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 2 + "'", int52 == 2);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 2 + "'", int53 == 2);
        org.junit.Assert.assertEquals("'" + obj54 + "' != '" + 2 + "'", obj54, 2);
        org.junit.Assert.assertEquals("'" + obj57 + "' != '" + (byte) -1 + "'", obj57, (byte) -1);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1 + "'", int58 == 1);
        org.junit.Assert.assertEquals("'" + obj61 + "' != '" + (byte) -1 + "'", obj61, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertEquals("'" + obj63 + "' != '" + (byte) -1 + "'", obj63, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj66 + "' != '" + (byte) -1 + "'", obj66, (byte) -1);
        org.junit.Assert.assertNotNull(obj67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 1 + "'", int68 == 1);
        org.junit.Assert.assertEquals("'" + obj71 + "' != '" + (byte) -1 + "'", obj71, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertEquals("'" + obj73 + "' != '" + (byte) -1 + "'", obj73, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj76 + "' != '" + (byte) -1 + "'", obj76, (byte) -1);
        org.junit.Assert.assertNotNull(obj77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(obj79);
        org.junit.Assert.assertNotNull(obj80);
        org.junit.Assert.assertNotNull(obj81);
        org.junit.Assert.assertNotNull(obj83);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test206");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        boolean boolean4 = stackTestDriver0.isEmpty();
        int int5 = stackTestDriver0.size();
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) wildcardClass7);
        int int9 = stackTestDriver0.size();
        int int10 = stackTestDriver0.size();
        java.lang.Object obj11 = stackTestDriver0.pop();
        java.lang.Class<?> wildcardClass12 = obj11.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "class java.lang.Object");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "class java.lang.Object");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test207");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        java.lang.Object obj9 = stackTestDriver0.pop();
        int int10 = stackTestDriver0.size();
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test208");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        boolean boolean4 = stackTestDriver0.isEmpty();
        int int5 = stackTestDriver0.size();
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) wildcardClass7);
        java.lang.Object obj9 = stackTestDriver0.peek();
        int int10 = stackTestDriver0.size();
        java.lang.Object obj12 = stackTestDriver0.push((java.lang.Object) (short) -1);
        boolean boolean13 = stackTestDriver0.isEmpty();
        java.lang.Class<?> wildcardClass14 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "class java.lang.Object");
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "class java.lang.Object");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (short) -1 + "'", obj12, (short) -1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test209");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        experiment.util.StackTestDriver stackTestDriver3 = new experiment.util.StackTestDriver();
        java.lang.Object obj5 = stackTestDriver3.push((java.lang.Object) (byte) -1);
        boolean boolean6 = stackTestDriver3.isEmpty();
        boolean boolean7 = stackTestDriver3.isEmpty();
        int int8 = stackTestDriver3.size();
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        java.lang.Object obj11 = stackTestDriver3.push((java.lang.Object) wildcardClass10);
        java.lang.Object obj12 = stackTestDriver3.peek();
        java.lang.Object obj13 = stackTestDriver0.push((java.lang.Object) stackTestDriver3);
        java.lang.Object obj14 = stackTestDriver0.peek();
        java.lang.Object obj15 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver16 = new experiment.util.StackTestDriver();
        java.lang.Object obj18 = stackTestDriver16.push((java.lang.Object) (byte) -1);
        boolean boolean19 = stackTestDriver16.isEmpty();
        boolean boolean20 = stackTestDriver16.isEmpty();
        int int21 = stackTestDriver16.size();
        java.lang.Object obj22 = new java.lang.Object();
        java.lang.Class<?> wildcardClass23 = obj22.getClass();
        java.lang.Object obj24 = stackTestDriver16.push((java.lang.Object) wildcardClass23);
        java.lang.Object obj25 = stackTestDriver16.peek();
        int int26 = stackTestDriver16.size();
        java.lang.Object obj28 = stackTestDriver16.push((java.lang.Object) (short) -1);
        java.lang.Class<?> wildcardClass29 = obj28.getClass();
        java.lang.Object obj30 = stackTestDriver0.push(obj28);
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) -1 + "'", obj5, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "class java.lang.Object");
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "class java.lang.Object");
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (byte) -1 + "'", obj18, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals(obj24.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj24), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj24), "class java.lang.Object");
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertEquals(obj25.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj25), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj25), "class java.lang.Object");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + (short) -1 + "'", obj28, (short) -1);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + (short) -1 + "'", obj30, (short) -1);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test210");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        int int5 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        java.lang.Object obj8 = stackTestDriver6.push((java.lang.Object) (byte) -1);
        boolean boolean9 = stackTestDriver6.isEmpty();
        java.lang.Object obj10 = stackTestDriver6.pop();
        experiment.util.StackTestDriver stackTestDriver11 = new experiment.util.StackTestDriver();
        java.lang.Object obj13 = stackTestDriver11.push((java.lang.Object) (byte) -1);
        java.lang.Object obj14 = stackTestDriver6.push((java.lang.Object) stackTestDriver11);
        int int15 = stackTestDriver11.size();
        java.lang.Object obj16 = stackTestDriver0.push((java.lang.Object) stackTestDriver11);
        java.lang.Object obj17 = new java.lang.Object();
        java.lang.Object obj18 = stackTestDriver11.push(obj17);
        stackTestDriver11.clear();
        stackTestDriver11.clear();
        experiment.util.StackTestDriver stackTestDriver21 = new experiment.util.StackTestDriver();
        java.lang.Object obj23 = stackTestDriver21.push((java.lang.Object) (byte) -1);
        boolean boolean24 = stackTestDriver21.isEmpty();
        boolean boolean25 = stackTestDriver21.isEmpty();
        int int26 = stackTestDriver21.size();
        java.lang.Object obj27 = new java.lang.Object();
        java.lang.Class<?> wildcardClass28 = obj27.getClass();
        java.lang.Object obj29 = stackTestDriver21.push((java.lang.Object) wildcardClass28);
        java.lang.Object obj30 = stackTestDriver21.peek();
        java.lang.Object obj31 = stackTestDriver21.peek();
        java.lang.Object obj32 = stackTestDriver11.push(obj31);
        java.lang.Class<?> wildcardClass33 = obj32.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) -1 + "'", obj8, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (byte) -1 + "'", obj13, (byte) -1);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (byte) -1 + "'", obj23, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertEquals(obj29.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj29), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj29), "class java.lang.Object");
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertEquals(obj30.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj30), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj30), "class java.lang.Object");
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertEquals(obj31.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj31), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj31), "class java.lang.Object");
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertEquals(obj32.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj32), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj32), "class java.lang.Object");
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test211");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        int int9 = stackTestDriver5.size();
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        java.lang.Object obj12 = stackTestDriver10.push((java.lang.Object) (byte) -1);
        boolean boolean13 = stackTestDriver10.isEmpty();
        java.lang.Object obj14 = stackTestDriver10.pop();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        java.lang.Object obj17 = stackTestDriver15.push((java.lang.Object) (byte) -1);
        java.lang.Object obj18 = stackTestDriver10.push((java.lang.Object) stackTestDriver15);
        boolean boolean19 = stackTestDriver15.isEmpty();
        java.lang.Object obj20 = stackTestDriver5.push((java.lang.Object) stackTestDriver15);
        experiment.util.StackTestDriver stackTestDriver21 = new experiment.util.StackTestDriver();
        java.lang.Object obj23 = stackTestDriver21.push((java.lang.Object) (byte) -1);
        boolean boolean24 = stackTestDriver21.isEmpty();
        java.lang.Object obj25 = stackTestDriver21.pop();
        java.lang.Object obj26 = stackTestDriver15.push((java.lang.Object) stackTestDriver21);
        int int27 = stackTestDriver21.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj28 = stackTestDriver21.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) -1 + "'", obj12, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (byte) -1 + "'", obj14, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) -1 + "'", obj17, (byte) -1);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (byte) -1 + "'", obj23, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (byte) -1 + "'", obj25, (byte) -1);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test212");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        int int9 = stackTestDriver5.size();
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        java.lang.Object obj12 = stackTestDriver10.push((java.lang.Object) (byte) -1);
        boolean boolean13 = stackTestDriver10.isEmpty();
        java.lang.Object obj14 = stackTestDriver10.pop();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        java.lang.Object obj17 = stackTestDriver15.push((java.lang.Object) (byte) -1);
        java.lang.Object obj18 = stackTestDriver10.push((java.lang.Object) stackTestDriver15);
        boolean boolean19 = stackTestDriver15.isEmpty();
        java.lang.Object obj20 = stackTestDriver5.push((java.lang.Object) stackTestDriver15);
        java.lang.Object obj22 = stackTestDriver15.push((java.lang.Object) 10);
        int int23 = stackTestDriver15.size();
        boolean boolean24 = stackTestDriver15.isEmpty();
        java.lang.Object obj25 = stackTestDriver15.peek();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) -1 + "'", obj12, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (byte) -1 + "'", obj14, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) -1 + "'", obj17, (byte) -1);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 10 + "'", obj22, 10);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 10 + "'", obj25, 10);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test213");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        boolean boolean4 = stackTestDriver0.isEmpty();
        int int5 = stackTestDriver0.size();
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) wildcardClass7);
        java.lang.Object obj9 = stackTestDriver0.peek();
        int int10 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver11 = new experiment.util.StackTestDriver();
        java.lang.Object obj13 = stackTestDriver11.push((java.lang.Object) (byte) -1);
        boolean boolean14 = stackTestDriver11.isEmpty();
        java.lang.Object obj15 = stackTestDriver11.pop();
        experiment.util.StackTestDriver stackTestDriver16 = new experiment.util.StackTestDriver();
        java.lang.Object obj18 = stackTestDriver16.push((java.lang.Object) (byte) -1);
        java.lang.Object obj19 = stackTestDriver11.push((java.lang.Object) stackTestDriver16);
        boolean boolean20 = stackTestDriver16.isEmpty();
        java.lang.Object obj22 = stackTestDriver16.push((java.lang.Object) 100);
        experiment.util.StackTestDriver stackTestDriver23 = new experiment.util.StackTestDriver();
        java.lang.Object obj25 = stackTestDriver23.push((java.lang.Object) (byte) -1);
        boolean boolean26 = stackTestDriver23.isEmpty();
        java.lang.Object obj27 = stackTestDriver23.pop();
        int int28 = stackTestDriver23.size();
        experiment.util.StackTestDriver stackTestDriver29 = new experiment.util.StackTestDriver();
        java.lang.Object obj31 = stackTestDriver29.push((java.lang.Object) (byte) -1);
        boolean boolean32 = stackTestDriver29.isEmpty();
        java.lang.Object obj33 = stackTestDriver29.pop();
        experiment.util.StackTestDriver stackTestDriver34 = new experiment.util.StackTestDriver();
        java.lang.Object obj36 = stackTestDriver34.push((java.lang.Object) (byte) -1);
        java.lang.Object obj37 = stackTestDriver29.push((java.lang.Object) stackTestDriver34);
        int int38 = stackTestDriver34.size();
        java.lang.Object obj39 = stackTestDriver23.push((java.lang.Object) stackTestDriver34);
        java.lang.Object obj40 = new java.lang.Object();
        java.lang.Object obj41 = stackTestDriver34.push(obj40);
        boolean boolean42 = stackTestDriver34.isEmpty();
        java.lang.Object obj43 = stackTestDriver16.push((java.lang.Object) stackTestDriver34);
        java.lang.Object obj44 = stackTestDriver34.peek();
        java.lang.Object obj45 = stackTestDriver0.push((java.lang.Object) stackTestDriver34);
        boolean boolean46 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver47 = new experiment.util.StackTestDriver();
        java.lang.Object obj49 = stackTestDriver47.push((java.lang.Object) (byte) -1);
        boolean boolean50 = stackTestDriver47.isEmpty();
        java.lang.Object obj51 = stackTestDriver47.pop();
        int int52 = stackTestDriver47.size();
        experiment.util.StackTestDriver stackTestDriver53 = new experiment.util.StackTestDriver();
        java.lang.Object obj55 = stackTestDriver53.push((java.lang.Object) (byte) -1);
        boolean boolean56 = stackTestDriver53.isEmpty();
        java.lang.Object obj57 = stackTestDriver53.pop();
        experiment.util.StackTestDriver stackTestDriver58 = new experiment.util.StackTestDriver();
        java.lang.Object obj60 = stackTestDriver58.push((java.lang.Object) (byte) -1);
        java.lang.Object obj61 = stackTestDriver53.push((java.lang.Object) stackTestDriver58);
        int int62 = stackTestDriver58.size();
        java.lang.Object obj63 = stackTestDriver47.push((java.lang.Object) stackTestDriver58);
        java.lang.Object obj64 = stackTestDriver0.push((java.lang.Object) stackTestDriver58);
        java.lang.Object obj65 = stackTestDriver0.peek();
        boolean boolean66 = stackTestDriver0.isEmpty();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "class java.lang.Object");
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "class java.lang.Object");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (byte) -1 + "'", obj13, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (byte) -1 + "'", obj15, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (byte) -1 + "'", obj18, (byte) -1);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 100 + "'", obj22, 100);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (byte) -1 + "'", obj25, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + (byte) -1 + "'", obj27, (byte) -1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + (byte) -1 + "'", obj31, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + (byte) -1 + "'", obj33, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + (byte) -1 + "'", obj36, (byte) -1);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(obj43);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + (byte) -1 + "'", obj49, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + obj51 + "' != '" + (byte) -1 + "'", obj51, (byte) -1);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertEquals("'" + obj55 + "' != '" + (byte) -1 + "'", obj55, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertEquals("'" + obj57 + "' != '" + (byte) -1 + "'", obj57, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj60 + "' != '" + (byte) -1 + "'", obj60, (byte) -1);
        org.junit.Assert.assertNotNull(obj61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 1 + "'", int62 == 1);
        org.junit.Assert.assertNotNull(obj63);
        org.junit.Assert.assertNotNull(obj64);
        org.junit.Assert.assertNotNull(obj65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test214");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        int int9 = stackTestDriver5.size();
        boolean boolean10 = stackTestDriver5.isEmpty();
        stackTestDriver5.clear();
        boolean boolean12 = stackTestDriver5.isEmpty();
        boolean boolean13 = stackTestDriver5.isEmpty();
        stackTestDriver5.clear();
        int int15 = stackTestDriver5.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = stackTestDriver5.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test215");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        java.lang.Object obj9 = stackTestDriver0.pop();
        boolean boolean10 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        boolean boolean12 = stackTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test216");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        int int3 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        java.lang.Object obj6 = stackTestDriver4.push((java.lang.Object) (byte) -1);
        boolean boolean7 = stackTestDriver4.isEmpty();
        java.lang.Object obj8 = stackTestDriver4.pop();
        experiment.util.StackTestDriver stackTestDriver9 = new experiment.util.StackTestDriver();
        java.lang.Object obj11 = stackTestDriver9.push((java.lang.Object) (byte) -1);
        java.lang.Object obj12 = stackTestDriver4.push((java.lang.Object) stackTestDriver9);
        int int13 = stackTestDriver9.size();
        boolean boolean14 = stackTestDriver9.isEmpty();
        stackTestDriver9.clear();
        boolean boolean16 = stackTestDriver9.isEmpty();
        boolean boolean17 = stackTestDriver9.isEmpty();
        java.lang.Object obj19 = stackTestDriver9.push((java.lang.Object) "hi!");
        experiment.util.StackTestDriver stackTestDriver20 = new experiment.util.StackTestDriver();
        java.lang.Object obj22 = stackTestDriver20.push((java.lang.Object) (byte) -1);
        boolean boolean23 = stackTestDriver20.isEmpty();
        java.lang.Object obj24 = stackTestDriver20.pop();
        experiment.util.StackTestDriver stackTestDriver25 = new experiment.util.StackTestDriver();
        java.lang.Object obj27 = stackTestDriver25.push((java.lang.Object) (byte) -1);
        java.lang.Object obj28 = stackTestDriver20.push((java.lang.Object) stackTestDriver25);
        boolean boolean29 = stackTestDriver25.isEmpty();
        java.lang.Object obj31 = stackTestDriver25.push((java.lang.Object) 100);
        java.lang.Object obj32 = stackTestDriver25.peek();
        boolean boolean33 = stackTestDriver25.isEmpty();
        java.lang.Object obj34 = stackTestDriver9.push((java.lang.Object) boolean33);
        java.lang.Object obj35 = stackTestDriver0.push((java.lang.Object) boolean33);
        boolean boolean36 = stackTestDriver0.isEmpty();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) -1 + "'", obj6, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) -1 + "'", obj8, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) -1 + "'", obj11, (byte) -1);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + "hi!" + "'", obj19, "hi!");
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (byte) -1 + "'", obj22, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (byte) -1 + "'", obj24, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + (byte) -1 + "'", obj27, (byte) -1);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 100 + "'", obj31, 100);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 100 + "'", obj32, 100);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + false + "'", obj34, false);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + false + "'", obj35, false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test217");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        int int5 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        java.lang.Object obj8 = stackTestDriver6.push((java.lang.Object) (byte) -1);
        boolean boolean9 = stackTestDriver6.isEmpty();
        java.lang.Object obj10 = stackTestDriver6.pop();
        experiment.util.StackTestDriver stackTestDriver11 = new experiment.util.StackTestDriver();
        java.lang.Object obj13 = stackTestDriver11.push((java.lang.Object) (byte) -1);
        java.lang.Object obj14 = stackTestDriver6.push((java.lang.Object) stackTestDriver11);
        int int15 = stackTestDriver11.size();
        java.lang.Object obj16 = stackTestDriver0.push((java.lang.Object) stackTestDriver11);
        stackTestDriver11.clear();
        java.lang.Class<?> wildcardClass18 = stackTestDriver11.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) -1 + "'", obj8, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (byte) -1 + "'", obj13, (byte) -1);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test218");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        int int4 = stackTestDriver0.size();
        java.lang.Object obj5 = stackTestDriver0.pop();
        int int6 = stackTestDriver0.size();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) -1 + "'", obj5, (byte) -1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test219");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        int int9 = stackTestDriver5.size();
        boolean boolean10 = stackTestDriver5.isEmpty();
        stackTestDriver5.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = stackTestDriver5.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test220");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        int int9 = stackTestDriver5.size();
        boolean boolean10 = stackTestDriver5.isEmpty();
        stackTestDriver5.clear();
        boolean boolean12 = stackTestDriver5.isEmpty();
        boolean boolean13 = stackTestDriver5.isEmpty();
        java.lang.Object obj15 = stackTestDriver5.push((java.lang.Object) '#');
        java.lang.Object obj16 = stackTestDriver5.pop();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + '#' + "'", obj15, '#');
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + '#' + "'", obj16, '#');
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test221");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        boolean boolean4 = stackTestDriver0.isEmpty();
        int int5 = stackTestDriver0.size();
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) "hi!");
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        java.lang.Object obj10 = stackTestDriver8.push((java.lang.Object) (byte) -1);
        boolean boolean11 = stackTestDriver8.isEmpty();
        boolean boolean12 = stackTestDriver8.isEmpty();
        int int13 = stackTestDriver8.size();
        java.lang.Object obj15 = stackTestDriver8.push((java.lang.Object) "hi!");
        java.lang.Object obj16 = stackTestDriver8.pop();
        java.lang.Object obj17 = stackTestDriver8.peek();
        int int18 = stackTestDriver8.size();
        experiment.util.StackTestDriver stackTestDriver19 = new experiment.util.StackTestDriver();
        java.lang.Object obj21 = stackTestDriver19.push((java.lang.Object) (byte) -1);
        boolean boolean22 = stackTestDriver19.isEmpty();
        java.lang.Object obj23 = stackTestDriver19.pop();
        experiment.util.StackTestDriver stackTestDriver24 = new experiment.util.StackTestDriver();
        java.lang.Object obj26 = stackTestDriver24.push((java.lang.Object) (byte) -1);
        java.lang.Object obj27 = stackTestDriver19.push((java.lang.Object) stackTestDriver24);
        int int28 = stackTestDriver24.size();
        boolean boolean29 = stackTestDriver24.isEmpty();
        stackTestDriver24.clear();
        boolean boolean31 = stackTestDriver24.isEmpty();
        boolean boolean32 = stackTestDriver24.isEmpty();
        java.lang.Object obj34 = stackTestDriver24.push((java.lang.Object) "hi!");
        experiment.util.StackTestDriver stackTestDriver35 = new experiment.util.StackTestDriver();
        java.lang.Object obj37 = stackTestDriver35.push((java.lang.Object) (byte) -1);
        boolean boolean38 = stackTestDriver35.isEmpty();
        java.lang.Object obj39 = stackTestDriver35.pop();
        experiment.util.StackTestDriver stackTestDriver40 = new experiment.util.StackTestDriver();
        java.lang.Object obj42 = stackTestDriver40.push((java.lang.Object) (byte) -1);
        java.lang.Object obj43 = stackTestDriver35.push((java.lang.Object) stackTestDriver40);
        boolean boolean44 = stackTestDriver40.isEmpty();
        java.lang.Object obj46 = stackTestDriver40.push((java.lang.Object) 100);
        java.lang.Object obj47 = stackTestDriver40.peek();
        boolean boolean48 = stackTestDriver40.isEmpty();
        java.lang.Object obj49 = stackTestDriver24.push((java.lang.Object) boolean48);
        java.lang.Object obj50 = stackTestDriver8.push((java.lang.Object) stackTestDriver24);
        java.lang.Object obj51 = stackTestDriver24.peek();
        java.lang.Object obj52 = stackTestDriver0.push(obj51);
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + "hi!" + "'", obj7, "hi!");
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + "hi!" + "'", obj15, "hi!");
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + "hi!" + "'", obj16, "hi!");
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) -1 + "'", obj17, (byte) -1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (byte) -1 + "'", obj21, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (byte) -1 + "'", obj23, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + (byte) -1 + "'", obj26, (byte) -1);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + "hi!" + "'", obj34, "hi!");
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + (byte) -1 + "'", obj37, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + (byte) -1 + "'", obj39, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + (byte) -1 + "'", obj42, (byte) -1);
        org.junit.Assert.assertNotNull(obj43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + 100 + "'", obj46, 100);
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + 100 + "'", obj47, 100);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + false + "'", obj49, false);
        org.junit.Assert.assertNotNull(obj50);
        org.junit.Assert.assertEquals("'" + obj51 + "' != '" + false + "'", obj51, false);
        org.junit.Assert.assertEquals("'" + obj52 + "' != '" + false + "'", obj52, false);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test222");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        java.lang.Class<?> wildcardClass6 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test223");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        boolean boolean9 = stackTestDriver5.isEmpty();
        java.lang.Object obj11 = stackTestDriver5.push((java.lang.Object) 100);
        java.lang.Class<?> wildcardClass12 = obj11.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 100 + "'", obj11, 100);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test224");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        boolean boolean9 = stackTestDriver5.isEmpty();
        java.lang.Object obj11 = stackTestDriver5.push((java.lang.Object) 100);
        boolean boolean12 = stackTestDriver5.isEmpty();
        java.lang.Object obj13 = stackTestDriver5.pop();
        int int14 = stackTestDriver5.size();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 100 + "'", obj11, 100);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100 + "'", obj13, 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test225");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        int int9 = stackTestDriver5.size();
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        java.lang.Object obj12 = stackTestDriver10.push((java.lang.Object) (byte) -1);
        boolean boolean13 = stackTestDriver10.isEmpty();
        java.lang.Object obj14 = stackTestDriver10.pop();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        java.lang.Object obj17 = stackTestDriver15.push((java.lang.Object) (byte) -1);
        java.lang.Object obj18 = stackTestDriver10.push((java.lang.Object) stackTestDriver15);
        boolean boolean19 = stackTestDriver15.isEmpty();
        java.lang.Object obj20 = stackTestDriver5.push((java.lang.Object) stackTestDriver15);
        experiment.util.StackTestDriver stackTestDriver21 = new experiment.util.StackTestDriver();
        java.lang.Object obj23 = stackTestDriver21.push((java.lang.Object) (byte) -1);
        boolean boolean24 = stackTestDriver21.isEmpty();
        java.lang.Object obj25 = stackTestDriver21.pop();
        java.lang.Object obj26 = stackTestDriver15.push((java.lang.Object) stackTestDriver21);
        int int27 = stackTestDriver15.size();
        stackTestDriver15.clear();
        java.lang.Class<?> wildcardClass29 = stackTestDriver15.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) -1 + "'", obj12, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (byte) -1 + "'", obj14, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) -1 + "'", obj17, (byte) -1);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (byte) -1 + "'", obj23, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (byte) -1 + "'", obj25, (byte) -1);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test226");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        int int5 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        java.lang.Object obj8 = stackTestDriver6.push((java.lang.Object) (byte) -1);
        boolean boolean9 = stackTestDriver6.isEmpty();
        java.lang.Object obj10 = stackTestDriver6.pop();
        experiment.util.StackTestDriver stackTestDriver11 = new experiment.util.StackTestDriver();
        java.lang.Object obj13 = stackTestDriver11.push((java.lang.Object) (byte) -1);
        java.lang.Object obj14 = stackTestDriver6.push((java.lang.Object) stackTestDriver11);
        int int15 = stackTestDriver11.size();
        java.lang.Object obj16 = stackTestDriver0.push((java.lang.Object) stackTestDriver11);
        java.lang.Object obj17 = new java.lang.Object();
        java.lang.Object obj18 = stackTestDriver11.push(obj17);
        stackTestDriver11.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = stackTestDriver11.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) -1 + "'", obj8, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (byte) -1 + "'", obj13, (byte) -1);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(obj18);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test227");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        int int5 = stackTestDriver0.size();
        stackTestDriver0.clear();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test228");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        int int9 = stackTestDriver5.size();
        boolean boolean10 = stackTestDriver5.isEmpty();
        int int11 = stackTestDriver5.size();
        stackTestDriver5.clear();
        java.lang.Class<?> wildcardClass13 = stackTestDriver5.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test229");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        boolean boolean9 = stackTestDriver5.isEmpty();
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        java.lang.Object obj12 = stackTestDriver10.push((java.lang.Object) (byte) -1);
        boolean boolean13 = stackTestDriver10.isEmpty();
        java.lang.Object obj14 = stackTestDriver10.pop();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        java.lang.Object obj17 = stackTestDriver15.push((java.lang.Object) (byte) -1);
        java.lang.Object obj18 = stackTestDriver10.push((java.lang.Object) stackTestDriver15);
        int int19 = stackTestDriver15.size();
        java.lang.Object obj20 = stackTestDriver15.peek();
        boolean boolean21 = stackTestDriver15.isEmpty();
        stackTestDriver15.clear();
        experiment.util.StackTestDriver stackTestDriver23 = new experiment.util.StackTestDriver();
        java.lang.Object obj25 = stackTestDriver23.push((java.lang.Object) (byte) -1);
        boolean boolean26 = stackTestDriver23.isEmpty();
        boolean boolean27 = stackTestDriver23.isEmpty();
        int int28 = stackTestDriver23.size();
        java.lang.Class<?> wildcardClass29 = stackTestDriver23.getClass();
        java.lang.Object obj30 = stackTestDriver15.push((java.lang.Object) wildcardClass29);
        java.lang.Class<?> wildcardClass31 = stackTestDriver15.getClass();
        java.lang.Object obj32 = stackTestDriver5.push((java.lang.Object) wildcardClass31);
        boolean boolean33 = stackTestDriver5.isEmpty();
        experiment.util.StackTestDriver stackTestDriver34 = new experiment.util.StackTestDriver();
        java.lang.Object obj36 = stackTestDriver34.push((java.lang.Object) (byte) -1);
        experiment.util.StackTestDriver stackTestDriver37 = new experiment.util.StackTestDriver();
        java.lang.Object obj39 = stackTestDriver37.push((java.lang.Object) (byte) -1);
        boolean boolean40 = stackTestDriver37.isEmpty();
        boolean boolean41 = stackTestDriver37.isEmpty();
        int int42 = stackTestDriver37.size();
        java.lang.Object obj43 = new java.lang.Object();
        java.lang.Class<?> wildcardClass44 = obj43.getClass();
        java.lang.Object obj45 = stackTestDriver37.push((java.lang.Object) wildcardClass44);
        java.lang.Object obj46 = stackTestDriver37.peek();
        java.lang.Object obj47 = stackTestDriver34.push((java.lang.Object) stackTestDriver37);
        int int48 = stackTestDriver37.size();
        experiment.util.StackTestDriver stackTestDriver49 = new experiment.util.StackTestDriver();
        java.lang.Object obj51 = stackTestDriver49.push((java.lang.Object) (byte) -1);
        boolean boolean52 = stackTestDriver49.isEmpty();
        int int53 = stackTestDriver49.size();
        stackTestDriver49.clear();
        stackTestDriver49.clear();
        java.lang.Object obj56 = stackTestDriver37.push((java.lang.Object) stackTestDriver49);
        java.lang.Object obj57 = stackTestDriver5.push((java.lang.Object) stackTestDriver37);
        java.lang.Object obj58 = stackTestDriver37.peek();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) -1 + "'", obj12, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (byte) -1 + "'", obj14, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) -1 + "'", obj17, (byte) -1);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (byte) -1 + "'", obj20, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (byte) -1 + "'", obj25, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertEquals(obj30.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj30), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj30), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertEquals(obj32.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj32), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj32), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + (byte) -1 + "'", obj36, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + (byte) -1 + "'", obj39, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertEquals(obj45.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj45), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj45), "class java.lang.Object");
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertEquals(obj46.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj46), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj46), "class java.lang.Object");
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 2 + "'", int48 == 2);
        org.junit.Assert.assertEquals("'" + obj51 + "' != '" + (byte) -1 + "'", obj51, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertNotNull(obj56);
        org.junit.Assert.assertNotNull(obj57);
        org.junit.Assert.assertNotNull(obj58);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test230");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        int int3 = stackTestDriver0.size();
        java.lang.Object obj4 = stackTestDriver0.peek();
        java.lang.Object obj5 = stackTestDriver0.pop();
        boolean boolean6 = stackTestDriver0.isEmpty();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) -1 + "'", obj5, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test231");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        boolean boolean9 = stackTestDriver5.isEmpty();
        java.lang.Object obj11 = stackTestDriver5.push((java.lang.Object) 100);
        experiment.util.StackTestDriver stackTestDriver12 = new experiment.util.StackTestDriver();
        java.lang.Object obj14 = stackTestDriver12.push((java.lang.Object) (byte) -1);
        boolean boolean15 = stackTestDriver12.isEmpty();
        java.lang.Object obj16 = stackTestDriver12.pop();
        int int17 = stackTestDriver12.size();
        experiment.util.StackTestDriver stackTestDriver18 = new experiment.util.StackTestDriver();
        java.lang.Object obj20 = stackTestDriver18.push((java.lang.Object) (byte) -1);
        boolean boolean21 = stackTestDriver18.isEmpty();
        java.lang.Object obj22 = stackTestDriver18.pop();
        experiment.util.StackTestDriver stackTestDriver23 = new experiment.util.StackTestDriver();
        java.lang.Object obj25 = stackTestDriver23.push((java.lang.Object) (byte) -1);
        java.lang.Object obj26 = stackTestDriver18.push((java.lang.Object) stackTestDriver23);
        int int27 = stackTestDriver23.size();
        java.lang.Object obj28 = stackTestDriver12.push((java.lang.Object) stackTestDriver23);
        java.lang.Object obj29 = new java.lang.Object();
        java.lang.Object obj30 = stackTestDriver23.push(obj29);
        boolean boolean31 = stackTestDriver23.isEmpty();
        java.lang.Object obj32 = stackTestDriver5.push((java.lang.Object) stackTestDriver23);
        java.lang.Object obj33 = stackTestDriver5.peek();
        java.lang.Class<?> wildcardClass34 = stackTestDriver5.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 100 + "'", obj11, 100);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (byte) -1 + "'", obj14, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (byte) -1 + "'", obj16, (byte) -1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (byte) -1 + "'", obj20, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (byte) -1 + "'", obj22, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (byte) -1 + "'", obj25, (byte) -1);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test232");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        int int9 = stackTestDriver5.size();
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        java.lang.Object obj12 = stackTestDriver10.push((java.lang.Object) (byte) -1);
        boolean boolean13 = stackTestDriver10.isEmpty();
        java.lang.Object obj14 = stackTestDriver10.pop();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        java.lang.Object obj17 = stackTestDriver15.push((java.lang.Object) (byte) -1);
        java.lang.Object obj18 = stackTestDriver10.push((java.lang.Object) stackTestDriver15);
        boolean boolean19 = stackTestDriver15.isEmpty();
        java.lang.Object obj20 = stackTestDriver5.push((java.lang.Object) stackTestDriver15);
        java.lang.Object obj22 = stackTestDriver15.push((java.lang.Object) 10);
        experiment.util.StackTestDriver stackTestDriver23 = new experiment.util.StackTestDriver();
        java.lang.Object obj25 = stackTestDriver23.push((java.lang.Object) (byte) -1);
        boolean boolean26 = stackTestDriver23.isEmpty();
        boolean boolean27 = stackTestDriver23.isEmpty();
        int int28 = stackTestDriver23.size();
        java.lang.Object obj29 = new java.lang.Object();
        java.lang.Class<?> wildcardClass30 = obj29.getClass();
        java.lang.Object obj31 = stackTestDriver23.push((java.lang.Object) wildcardClass30);
        int int32 = stackTestDriver23.size();
        int int33 = stackTestDriver23.size();
        java.lang.Object obj34 = stackTestDriver15.push((java.lang.Object) int33);
        experiment.util.StackTestDriver stackTestDriver35 = new experiment.util.StackTestDriver();
        java.lang.Object obj37 = stackTestDriver35.push((java.lang.Object) (byte) -1);
        boolean boolean38 = stackTestDriver35.isEmpty();
        java.lang.Object obj40 = stackTestDriver35.push((java.lang.Object) 10.0f);
        java.lang.Object obj41 = stackTestDriver35.pop();
        java.lang.Object obj42 = stackTestDriver35.peek();
        java.lang.Object obj43 = stackTestDriver15.push((java.lang.Object) stackTestDriver35);
        java.lang.Object obj44 = stackTestDriver15.peek();
        int int45 = stackTestDriver15.size();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) -1 + "'", obj12, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (byte) -1 + "'", obj14, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) -1 + "'", obj17, (byte) -1);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 10 + "'", obj22, 10);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (byte) -1 + "'", obj25, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertEquals(obj31.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj31), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj31), "class java.lang.Object");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2 + "'", int32 == 2);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2 + "'", int33 == 2);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + 2 + "'", obj34, 2);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + (byte) -1 + "'", obj37, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + 10.0f + "'", obj40, 10.0f);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + 10.0f + "'", obj41, 10.0f);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + (byte) -1 + "'", obj42, (byte) -1);
        org.junit.Assert.assertNotNull(obj43);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 4 + "'", int45 == 4);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test233");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        int int9 = stackTestDriver5.size();
        boolean boolean10 = stackTestDriver5.isEmpty();
        stackTestDriver5.clear();
        boolean boolean12 = stackTestDriver5.isEmpty();
        int int13 = stackTestDriver5.size();
        experiment.util.StackTestDriver stackTestDriver14 = new experiment.util.StackTestDriver();
        java.lang.Object obj16 = stackTestDriver14.push((java.lang.Object) (byte) -1);
        boolean boolean17 = stackTestDriver14.isEmpty();
        java.lang.Object obj18 = stackTestDriver14.pop();
        experiment.util.StackTestDriver stackTestDriver19 = new experiment.util.StackTestDriver();
        java.lang.Object obj21 = stackTestDriver19.push((java.lang.Object) (byte) -1);
        java.lang.Object obj22 = stackTestDriver14.push((java.lang.Object) stackTestDriver19);
        boolean boolean23 = stackTestDriver19.isEmpty();
        stackTestDriver19.clear();
        java.lang.Object obj25 = stackTestDriver5.push((java.lang.Object) stackTestDriver19);
        int int26 = stackTestDriver19.size();
        int int27 = stackTestDriver19.size();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (byte) -1 + "'", obj16, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (byte) -1 + "'", obj18, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (byte) -1 + "'", obj21, (byte) -1);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test234");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) 10.0f);
        java.lang.Object obj6 = stackTestDriver0.pop();
        int int7 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        java.lang.Object obj10 = stackTestDriver8.push((java.lang.Object) (byte) -1);
        experiment.util.StackTestDriver stackTestDriver11 = new experiment.util.StackTestDriver();
        java.lang.Object obj13 = stackTestDriver11.push((java.lang.Object) (byte) -1);
        boolean boolean14 = stackTestDriver11.isEmpty();
        boolean boolean15 = stackTestDriver11.isEmpty();
        int int16 = stackTestDriver11.size();
        java.lang.Object obj17 = new java.lang.Object();
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        java.lang.Object obj19 = stackTestDriver11.push((java.lang.Object) wildcardClass18);
        java.lang.Object obj20 = stackTestDriver11.peek();
        java.lang.Object obj21 = stackTestDriver8.push((java.lang.Object) stackTestDriver11);
        int int22 = stackTestDriver11.size();
        experiment.util.StackTestDriver stackTestDriver23 = new experiment.util.StackTestDriver();
        java.lang.Object obj25 = stackTestDriver23.push((java.lang.Object) (byte) -1);
        boolean boolean26 = stackTestDriver23.isEmpty();
        int int27 = stackTestDriver23.size();
        stackTestDriver23.clear();
        stackTestDriver23.clear();
        java.lang.Object obj30 = stackTestDriver11.push((java.lang.Object) stackTestDriver23);
        java.lang.Object obj31 = stackTestDriver11.peek();
        int int32 = stackTestDriver11.size();
        java.lang.Class<?> wildcardClass33 = stackTestDriver11.getClass();
        java.lang.Object obj34 = stackTestDriver0.push((java.lang.Object) wildcardClass33);
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 10.0f + "'", obj5, 10.0f);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 10.0f + "'", obj6, 10.0f);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (byte) -1 + "'", obj13, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "class java.lang.Object");
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "class java.lang.Object");
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (byte) -1 + "'", obj25, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 3 + "'", int32 == 3);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertEquals(obj34.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj34), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj34), "class experiment.util.StackTestDriver");
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test235");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        int int4 = stackTestDriver0.size();
        java.lang.Object obj5 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) stackTestDriver6);
        int int8 = stackTestDriver0.size();
        boolean boolean9 = stackTestDriver0.isEmpty();
        java.lang.Object obj10 = stackTestDriver0.pop();
        java.lang.Class<?> wildcardClass11 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) -1 + "'", obj5, (byte) -1);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test236");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        boolean boolean9 = stackTestDriver5.isEmpty();
        java.lang.Object obj10 = stackTestDriver5.pop();
        stackTestDriver5.clear();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test237");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        int int9 = stackTestDriver5.size();
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        java.lang.Object obj12 = stackTestDriver10.push((java.lang.Object) (byte) -1);
        boolean boolean13 = stackTestDriver10.isEmpty();
        java.lang.Object obj14 = stackTestDriver10.pop();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        java.lang.Object obj17 = stackTestDriver15.push((java.lang.Object) (byte) -1);
        java.lang.Object obj18 = stackTestDriver10.push((java.lang.Object) stackTestDriver15);
        boolean boolean19 = stackTestDriver15.isEmpty();
        java.lang.Object obj20 = stackTestDriver5.push((java.lang.Object) stackTestDriver15);
        java.lang.Object obj22 = stackTestDriver15.push((java.lang.Object) 10);
        java.lang.Object obj23 = stackTestDriver15.peek();
        java.lang.Object obj25 = stackTestDriver15.push((java.lang.Object) 0L);
        java.lang.Object obj26 = stackTestDriver15.peek();
        java.lang.Object obj27 = stackTestDriver15.pop();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) -1 + "'", obj12, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (byte) -1 + "'", obj14, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) -1 + "'", obj17, (byte) -1);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 10 + "'", obj22, 10);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 10 + "'", obj23, 10);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 0L + "'", obj25, 0L);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 0L + "'", obj26, 0L);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 0L + "'", obj27, 0L);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test238");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        int int5 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        java.lang.Object obj8 = stackTestDriver6.push((java.lang.Object) (byte) -1);
        boolean boolean9 = stackTestDriver6.isEmpty();
        java.lang.Object obj10 = stackTestDriver6.pop();
        experiment.util.StackTestDriver stackTestDriver11 = new experiment.util.StackTestDriver();
        java.lang.Object obj13 = stackTestDriver11.push((java.lang.Object) (byte) -1);
        java.lang.Object obj14 = stackTestDriver6.push((java.lang.Object) stackTestDriver11);
        int int15 = stackTestDriver11.size();
        java.lang.Object obj16 = stackTestDriver0.push((java.lang.Object) stackTestDriver11);
        java.lang.Object obj17 = new java.lang.Object();
        java.lang.Object obj18 = stackTestDriver11.push(obj17);
        boolean boolean19 = stackTestDriver11.isEmpty();
        java.lang.Object obj20 = stackTestDriver11.pop();
        java.lang.Object obj21 = stackTestDriver11.pop();
        boolean boolean22 = stackTestDriver11.isEmpty();
        java.lang.Class<?> wildcardClass23 = stackTestDriver11.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) -1 + "'", obj8, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (byte) -1 + "'", obj13, (byte) -1);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (byte) -1 + "'", obj21, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test239");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        boolean boolean9 = stackTestDriver5.isEmpty();
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        java.lang.Object obj12 = stackTestDriver10.push((java.lang.Object) (byte) -1);
        boolean boolean13 = stackTestDriver10.isEmpty();
        java.lang.Object obj14 = stackTestDriver10.pop();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        java.lang.Object obj17 = stackTestDriver15.push((java.lang.Object) (byte) -1);
        java.lang.Object obj18 = stackTestDriver10.push((java.lang.Object) stackTestDriver15);
        int int19 = stackTestDriver15.size();
        java.lang.Object obj20 = stackTestDriver15.peek();
        boolean boolean21 = stackTestDriver15.isEmpty();
        stackTestDriver15.clear();
        experiment.util.StackTestDriver stackTestDriver23 = new experiment.util.StackTestDriver();
        java.lang.Object obj25 = stackTestDriver23.push((java.lang.Object) (byte) -1);
        boolean boolean26 = stackTestDriver23.isEmpty();
        boolean boolean27 = stackTestDriver23.isEmpty();
        int int28 = stackTestDriver23.size();
        java.lang.Class<?> wildcardClass29 = stackTestDriver23.getClass();
        java.lang.Object obj30 = stackTestDriver15.push((java.lang.Object) wildcardClass29);
        java.lang.Class<?> wildcardClass31 = stackTestDriver15.getClass();
        java.lang.Object obj32 = stackTestDriver5.push((java.lang.Object) wildcardClass31);
        java.lang.Object obj33 = stackTestDriver5.pop();
        experiment.util.StackTestDriver stackTestDriver34 = new experiment.util.StackTestDriver();
        java.lang.Object obj36 = stackTestDriver34.push((java.lang.Object) (byte) -1);
        boolean boolean37 = stackTestDriver34.isEmpty();
        int int38 = stackTestDriver34.size();
        java.lang.Object obj39 = stackTestDriver34.pop();
        experiment.util.StackTestDriver stackTestDriver40 = new experiment.util.StackTestDriver();
        java.lang.Object obj41 = stackTestDriver34.push((java.lang.Object) stackTestDriver40);
        java.lang.Object obj42 = stackTestDriver5.push((java.lang.Object) stackTestDriver34);
        int int43 = stackTestDriver5.size();
        experiment.util.StackTestDriver stackTestDriver44 = new experiment.util.StackTestDriver();
        java.lang.Object obj46 = stackTestDriver44.push((java.lang.Object) (byte) -1);
        boolean boolean47 = stackTestDriver44.isEmpty();
        java.lang.Object obj48 = stackTestDriver44.pop();
        experiment.util.StackTestDriver stackTestDriver49 = new experiment.util.StackTestDriver();
        java.lang.Object obj51 = stackTestDriver49.push((java.lang.Object) (byte) -1);
        java.lang.Object obj52 = stackTestDriver44.push((java.lang.Object) stackTestDriver49);
        java.lang.Object obj53 = stackTestDriver5.push((java.lang.Object) stackTestDriver44);
        java.lang.Object obj54 = stackTestDriver44.peek();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) -1 + "'", obj12, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (byte) -1 + "'", obj14, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) -1 + "'", obj17, (byte) -1);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (byte) -1 + "'", obj20, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (byte) -1 + "'", obj25, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertEquals(obj30.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj30), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj30), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertEquals(obj32.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj32), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj32), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertEquals(obj33.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj33), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj33), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + (byte) -1 + "'", obj36, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + (byte) -1 + "'", obj39, (byte) -1);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2 + "'", int43 == 2);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + (byte) -1 + "'", obj46, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + (byte) -1 + "'", obj48, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj51 + "' != '" + (byte) -1 + "'", obj51, (byte) -1);
        org.junit.Assert.assertNotNull(obj52);
        org.junit.Assert.assertNotNull(obj53);
        org.junit.Assert.assertNotNull(obj54);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test240");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        int int9 = stackTestDriver5.size();
        boolean boolean10 = stackTestDriver5.isEmpty();
        stackTestDriver5.clear();
        boolean boolean12 = stackTestDriver5.isEmpty();
        int int13 = stackTestDriver5.size();
        experiment.util.StackTestDriver stackTestDriver14 = new experiment.util.StackTestDriver();
        java.lang.Object obj16 = stackTestDriver14.push((java.lang.Object) (byte) -1);
        boolean boolean17 = stackTestDriver14.isEmpty();
        java.lang.Object obj18 = stackTestDriver14.pop();
        experiment.util.StackTestDriver stackTestDriver19 = new experiment.util.StackTestDriver();
        java.lang.Object obj21 = stackTestDriver19.push((java.lang.Object) (byte) -1);
        java.lang.Object obj22 = stackTestDriver14.push((java.lang.Object) stackTestDriver19);
        boolean boolean23 = stackTestDriver19.isEmpty();
        stackTestDriver19.clear();
        java.lang.Object obj25 = stackTestDriver5.push((java.lang.Object) stackTestDriver19);
        java.lang.Class<?> wildcardClass26 = stackTestDriver5.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (byte) -1 + "'", obj16, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (byte) -1 + "'", obj18, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (byte) -1 + "'", obj21, (byte) -1);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test241");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = stackTestDriver0.pop();
        int int4 = stackTestDriver0.size();
        java.lang.Class<?> wildcardClass5 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) -1 + "'", obj3, (byte) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test242");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        int int9 = stackTestDriver5.size();
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        java.lang.Object obj12 = stackTestDriver10.push((java.lang.Object) (byte) -1);
        boolean boolean13 = stackTestDriver10.isEmpty();
        java.lang.Object obj14 = stackTestDriver10.pop();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        java.lang.Object obj17 = stackTestDriver15.push((java.lang.Object) (byte) -1);
        java.lang.Object obj18 = stackTestDriver10.push((java.lang.Object) stackTestDriver15);
        boolean boolean19 = stackTestDriver15.isEmpty();
        java.lang.Object obj20 = stackTestDriver5.push((java.lang.Object) stackTestDriver15);
        java.lang.Object obj22 = stackTestDriver15.push((java.lang.Object) 10);
        experiment.util.StackTestDriver stackTestDriver23 = new experiment.util.StackTestDriver();
        java.lang.Object obj25 = stackTestDriver23.push((java.lang.Object) (byte) -1);
        boolean boolean26 = stackTestDriver23.isEmpty();
        boolean boolean27 = stackTestDriver23.isEmpty();
        int int28 = stackTestDriver23.size();
        java.lang.Object obj29 = new java.lang.Object();
        java.lang.Class<?> wildcardClass30 = obj29.getClass();
        java.lang.Object obj31 = stackTestDriver23.push((java.lang.Object) wildcardClass30);
        int int32 = stackTestDriver23.size();
        int int33 = stackTestDriver23.size();
        java.lang.Object obj34 = stackTestDriver15.push((java.lang.Object) int33);
        experiment.util.StackTestDriver stackTestDriver35 = new experiment.util.StackTestDriver();
        java.lang.Object obj37 = stackTestDriver35.push((java.lang.Object) (byte) -1);
        int int38 = stackTestDriver35.size();
        experiment.util.StackTestDriver stackTestDriver39 = new experiment.util.StackTestDriver();
        java.lang.Object obj41 = stackTestDriver39.push((java.lang.Object) (byte) -1);
        boolean boolean42 = stackTestDriver39.isEmpty();
        java.lang.Object obj43 = stackTestDriver39.pop();
        experiment.util.StackTestDriver stackTestDriver44 = new experiment.util.StackTestDriver();
        java.lang.Object obj46 = stackTestDriver44.push((java.lang.Object) (byte) -1);
        java.lang.Object obj47 = stackTestDriver39.push((java.lang.Object) stackTestDriver44);
        int int48 = stackTestDriver44.size();
        experiment.util.StackTestDriver stackTestDriver49 = new experiment.util.StackTestDriver();
        java.lang.Object obj51 = stackTestDriver49.push((java.lang.Object) (byte) -1);
        boolean boolean52 = stackTestDriver49.isEmpty();
        java.lang.Object obj53 = stackTestDriver49.pop();
        experiment.util.StackTestDriver stackTestDriver54 = new experiment.util.StackTestDriver();
        java.lang.Object obj56 = stackTestDriver54.push((java.lang.Object) (byte) -1);
        java.lang.Object obj57 = stackTestDriver49.push((java.lang.Object) stackTestDriver54);
        boolean boolean58 = stackTestDriver54.isEmpty();
        java.lang.Object obj59 = stackTestDriver44.push((java.lang.Object) stackTestDriver54);
        java.lang.Object obj60 = stackTestDriver35.push(obj59);
        java.lang.Object obj61 = stackTestDriver15.push((java.lang.Object) stackTestDriver35);
        java.lang.Class<?> wildcardClass62 = stackTestDriver35.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) -1 + "'", obj12, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (byte) -1 + "'", obj14, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) -1 + "'", obj17, (byte) -1);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 10 + "'", obj22, 10);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (byte) -1 + "'", obj25, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertEquals(obj31.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj31), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj31), "class java.lang.Object");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2 + "'", int32 == 2);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2 + "'", int33 == 2);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + 2 + "'", obj34, 2);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + (byte) -1 + "'", obj37, (byte) -1);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + (byte) -1 + "'", obj41, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + (byte) -1 + "'", obj43, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + (byte) -1 + "'", obj46, (byte) -1);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertEquals("'" + obj51 + "' != '" + (byte) -1 + "'", obj51, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + obj53 + "' != '" + (byte) -1 + "'", obj53, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj56 + "' != '" + (byte) -1 + "'", obj56, (byte) -1);
        org.junit.Assert.assertNotNull(obj57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(obj59);
        org.junit.Assert.assertNotNull(obj60);
        org.junit.Assert.assertNotNull(obj61);
        org.junit.Assert.assertNotNull(wildcardClass62);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test243");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
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
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) -1 + "'", obj5, (byte) -1);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test244");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        int int9 = stackTestDriver5.size();
        boolean boolean10 = stackTestDriver5.isEmpty();
        stackTestDriver5.clear();
        boolean boolean12 = stackTestDriver5.isEmpty();
        boolean boolean13 = stackTestDriver5.isEmpty();
        stackTestDriver5.clear();
        int int15 = stackTestDriver5.size();
        stackTestDriver5.clear();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test245");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        boolean boolean4 = stackTestDriver0.isEmpty();
        int int5 = stackTestDriver0.size();
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) wildcardClass7);
        java.lang.Object obj9 = stackTestDriver0.peek();
        stackTestDriver0.clear();
        boolean boolean11 = stackTestDriver0.isEmpty();
        boolean boolean12 = stackTestDriver0.isEmpty();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "class java.lang.Object");
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "class java.lang.Object");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test246");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        boolean boolean9 = stackTestDriver5.isEmpty();
        java.lang.Object obj11 = stackTestDriver5.push((java.lang.Object) 100);
        experiment.util.StackTestDriver stackTestDriver12 = new experiment.util.StackTestDriver();
        java.lang.Object obj14 = stackTestDriver12.push((java.lang.Object) (byte) -1);
        boolean boolean15 = stackTestDriver12.isEmpty();
        java.lang.Object obj16 = stackTestDriver12.pop();
        int int17 = stackTestDriver12.size();
        experiment.util.StackTestDriver stackTestDriver18 = new experiment.util.StackTestDriver();
        java.lang.Object obj20 = stackTestDriver18.push((java.lang.Object) (byte) -1);
        boolean boolean21 = stackTestDriver18.isEmpty();
        java.lang.Object obj22 = stackTestDriver18.pop();
        experiment.util.StackTestDriver stackTestDriver23 = new experiment.util.StackTestDriver();
        java.lang.Object obj25 = stackTestDriver23.push((java.lang.Object) (byte) -1);
        java.lang.Object obj26 = stackTestDriver18.push((java.lang.Object) stackTestDriver23);
        int int27 = stackTestDriver23.size();
        java.lang.Object obj28 = stackTestDriver12.push((java.lang.Object) stackTestDriver23);
        java.lang.Object obj29 = new java.lang.Object();
        java.lang.Object obj30 = stackTestDriver23.push(obj29);
        boolean boolean31 = stackTestDriver23.isEmpty();
        java.lang.Object obj32 = stackTestDriver5.push((java.lang.Object) stackTestDriver23);
        stackTestDriver5.clear();
        experiment.util.StackTestDriver stackTestDriver34 = new experiment.util.StackTestDriver();
        java.lang.Object obj36 = stackTestDriver34.push((java.lang.Object) (byte) -1);
        experiment.util.StackTestDriver stackTestDriver37 = new experiment.util.StackTestDriver();
        java.lang.Object obj39 = stackTestDriver37.push((java.lang.Object) (byte) -1);
        boolean boolean40 = stackTestDriver37.isEmpty();
        boolean boolean41 = stackTestDriver37.isEmpty();
        int int42 = stackTestDriver37.size();
        java.lang.Object obj43 = new java.lang.Object();
        java.lang.Class<?> wildcardClass44 = obj43.getClass();
        java.lang.Object obj45 = stackTestDriver37.push((java.lang.Object) wildcardClass44);
        java.lang.Object obj46 = stackTestDriver37.peek();
        java.lang.Object obj47 = stackTestDriver34.push((java.lang.Object) stackTestDriver37);
        int int48 = stackTestDriver37.size();
        java.lang.Object obj49 = stackTestDriver5.push((java.lang.Object) stackTestDriver37);
        experiment.util.StackTestDriver stackTestDriver50 = new experiment.util.StackTestDriver();
        java.lang.Object obj52 = stackTestDriver50.push((java.lang.Object) (byte) -1);
        boolean boolean53 = stackTestDriver50.isEmpty();
        java.lang.Object obj54 = stackTestDriver50.pop();
        experiment.util.StackTestDriver stackTestDriver55 = new experiment.util.StackTestDriver();
        java.lang.Object obj57 = stackTestDriver55.push((java.lang.Object) (byte) -1);
        java.lang.Object obj58 = stackTestDriver50.push((java.lang.Object) stackTestDriver55);
        int int59 = stackTestDriver55.size();
        boolean boolean60 = stackTestDriver55.isEmpty();
        stackTestDriver55.clear();
        int int62 = stackTestDriver55.size();
        java.lang.Object obj63 = stackTestDriver5.push((java.lang.Object) int62);
        boolean boolean64 = stackTestDriver5.isEmpty();
        experiment.util.StackTestDriver stackTestDriver65 = new experiment.util.StackTestDriver();
        java.lang.Object obj67 = stackTestDriver65.push((java.lang.Object) (byte) -1);
        boolean boolean68 = stackTestDriver65.isEmpty();
        java.lang.Object obj70 = stackTestDriver65.push((java.lang.Object) 10.0f);
        java.lang.Object obj71 = stackTestDriver65.pop();
        java.lang.Object obj72 = stackTestDriver65.pop();
        java.lang.Object obj73 = stackTestDriver5.push(obj72);
        java.lang.Class<?> wildcardClass74 = obj72.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 100 + "'", obj11, 100);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (byte) -1 + "'", obj14, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (byte) -1 + "'", obj16, (byte) -1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (byte) -1 + "'", obj20, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (byte) -1 + "'", obj22, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (byte) -1 + "'", obj25, (byte) -1);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + (byte) -1 + "'", obj36, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + (byte) -1 + "'", obj39, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertEquals(obj45.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj45), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj45), "class java.lang.Object");
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertEquals(obj46.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj46), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj46), "class java.lang.Object");
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 2 + "'", int48 == 2);
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertEquals("'" + obj52 + "' != '" + (byte) -1 + "'", obj52, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertEquals("'" + obj54 + "' != '" + (byte) -1 + "'", obj54, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj57 + "' != '" + (byte) -1 + "'", obj57, (byte) -1);
        org.junit.Assert.assertNotNull(obj58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1 + "'", int59 == 1);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertEquals("'" + obj63 + "' != '" + 0 + "'", obj63, 0);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertEquals("'" + obj67 + "' != '" + (byte) -1 + "'", obj67, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertEquals("'" + obj70 + "' != '" + 10.0f + "'", obj70, 10.0f);
        org.junit.Assert.assertEquals("'" + obj71 + "' != '" + 10.0f + "'", obj71, 10.0f);
        org.junit.Assert.assertEquals("'" + obj72 + "' != '" + (byte) -1 + "'", obj72, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj73 + "' != '" + (byte) -1 + "'", obj73, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass74);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test247");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        boolean boolean4 = stackTestDriver0.isEmpty();
        int int5 = stackTestDriver0.size();
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) wildcardClass7);
        int int9 = stackTestDriver0.size();
        boolean boolean10 = stackTestDriver0.isEmpty();
        java.lang.Object obj11 = stackTestDriver0.peek();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "class java.lang.Object");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "class java.lang.Object");
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test248");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        boolean boolean9 = stackTestDriver5.isEmpty();
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        java.lang.Object obj12 = stackTestDriver10.push((java.lang.Object) (byte) -1);
        boolean boolean13 = stackTestDriver10.isEmpty();
        java.lang.Object obj14 = stackTestDriver10.pop();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        java.lang.Object obj17 = stackTestDriver15.push((java.lang.Object) (byte) -1);
        java.lang.Object obj18 = stackTestDriver10.push((java.lang.Object) stackTestDriver15);
        int int19 = stackTestDriver15.size();
        java.lang.Object obj20 = stackTestDriver15.peek();
        boolean boolean21 = stackTestDriver15.isEmpty();
        stackTestDriver15.clear();
        experiment.util.StackTestDriver stackTestDriver23 = new experiment.util.StackTestDriver();
        java.lang.Object obj25 = stackTestDriver23.push((java.lang.Object) (byte) -1);
        boolean boolean26 = stackTestDriver23.isEmpty();
        boolean boolean27 = stackTestDriver23.isEmpty();
        int int28 = stackTestDriver23.size();
        java.lang.Class<?> wildcardClass29 = stackTestDriver23.getClass();
        java.lang.Object obj30 = stackTestDriver15.push((java.lang.Object) wildcardClass29);
        java.lang.Class<?> wildcardClass31 = stackTestDriver15.getClass();
        java.lang.Object obj32 = stackTestDriver5.push((java.lang.Object) wildcardClass31);
        java.lang.Object obj33 = stackTestDriver5.pop();
        experiment.util.StackTestDriver stackTestDriver34 = new experiment.util.StackTestDriver();
        java.lang.Object obj36 = stackTestDriver34.push((java.lang.Object) (byte) -1);
        boolean boolean37 = stackTestDriver34.isEmpty();
        int int38 = stackTestDriver34.size();
        java.lang.Object obj39 = stackTestDriver34.pop();
        experiment.util.StackTestDriver stackTestDriver40 = new experiment.util.StackTestDriver();
        java.lang.Object obj41 = stackTestDriver34.push((java.lang.Object) stackTestDriver40);
        java.lang.Object obj42 = stackTestDriver5.push((java.lang.Object) stackTestDriver34);
        java.lang.Object obj43 = stackTestDriver5.pop();
        java.lang.Object obj44 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj45 = stackTestDriver5.push(obj44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) -1 + "'", obj12, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (byte) -1 + "'", obj14, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) -1 + "'", obj17, (byte) -1);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (byte) -1 + "'", obj20, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (byte) -1 + "'", obj25, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertEquals(obj30.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj30), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj30), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertEquals(obj32.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj32), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj32), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertEquals(obj33.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj33), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj33), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + (byte) -1 + "'", obj36, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + (byte) -1 + "'", obj39, (byte) -1);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertNotNull(obj43);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test249");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        boolean boolean4 = stackTestDriver0.isEmpty();
        int int5 = stackTestDriver0.size();
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) wildcardClass7);
        java.lang.Object obj9 = stackTestDriver0.peek();
        java.lang.Object obj10 = stackTestDriver0.peek();
        boolean boolean11 = stackTestDriver0.isEmpty();
        java.lang.Object obj12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = stackTestDriver0.push(obj12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "class java.lang.Object");
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "class java.lang.Object");
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "class java.lang.Object");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test250");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        java.lang.Object obj9 = stackTestDriver0.pop();
        int int10 = stackTestDriver0.size();
        int int11 = stackTestDriver0.size();
        java.lang.Object obj13 = stackTestDriver0.push((java.lang.Object) 10.0f);
        boolean boolean14 = stackTestDriver0.isEmpty();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 10.0f + "'", obj13, 10.0f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test251");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.peek();
        java.lang.Object obj5 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        java.lang.Object obj8 = stackTestDriver6.push((java.lang.Object) (byte) -1);
        boolean boolean9 = stackTestDriver6.isEmpty();
        java.lang.Object obj10 = stackTestDriver6.pop();
        experiment.util.StackTestDriver stackTestDriver11 = new experiment.util.StackTestDriver();
        java.lang.Object obj13 = stackTestDriver11.push((java.lang.Object) (byte) -1);
        java.lang.Object obj14 = stackTestDriver6.push((java.lang.Object) stackTestDriver11);
        int int15 = stackTestDriver11.size();
        boolean boolean16 = stackTestDriver11.isEmpty();
        stackTestDriver11.clear();
        boolean boolean18 = stackTestDriver11.isEmpty();
        stackTestDriver11.clear();
        int int20 = stackTestDriver11.size();
        stackTestDriver11.clear();
        java.lang.Object obj22 = stackTestDriver0.push((java.lang.Object) stackTestDriver11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = stackTestDriver11.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) -1 + "'", obj5, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) -1 + "'", obj8, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (byte) -1 + "'", obj13, (byte) -1);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(obj22);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test252");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        int int5 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        java.lang.Object obj8 = stackTestDriver6.push((java.lang.Object) (byte) -1);
        java.lang.Object obj9 = stackTestDriver0.push(obj8);
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        java.lang.Object obj12 = stackTestDriver10.push((java.lang.Object) (byte) -1);
        boolean boolean13 = stackTestDriver10.isEmpty();
        java.lang.Object obj14 = stackTestDriver10.pop();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        java.lang.Object obj17 = stackTestDriver15.push((java.lang.Object) (byte) -1);
        java.lang.Object obj18 = stackTestDriver10.push((java.lang.Object) stackTestDriver15);
        int int19 = stackTestDriver15.size();
        experiment.util.StackTestDriver stackTestDriver20 = new experiment.util.StackTestDriver();
        java.lang.Object obj22 = stackTestDriver20.push((java.lang.Object) (byte) -1);
        boolean boolean23 = stackTestDriver20.isEmpty();
        java.lang.Object obj24 = stackTestDriver20.pop();
        experiment.util.StackTestDriver stackTestDriver25 = new experiment.util.StackTestDriver();
        java.lang.Object obj27 = stackTestDriver25.push((java.lang.Object) (byte) -1);
        java.lang.Object obj28 = stackTestDriver20.push((java.lang.Object) stackTestDriver25);
        boolean boolean29 = stackTestDriver25.isEmpty();
        java.lang.Object obj30 = stackTestDriver15.push((java.lang.Object) stackTestDriver25);
        java.lang.Object obj32 = stackTestDriver25.push((java.lang.Object) 10);
        java.lang.Object obj33 = stackTestDriver25.pop();
        java.lang.Object obj34 = stackTestDriver0.push(obj33);
        boolean boolean35 = stackTestDriver0.isEmpty();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) -1 + "'", obj8, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) -1 + "'", obj9, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) -1 + "'", obj12, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (byte) -1 + "'", obj14, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) -1 + "'", obj17, (byte) -1);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (byte) -1 + "'", obj22, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (byte) -1 + "'", obj24, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + (byte) -1 + "'", obj27, (byte) -1);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 10 + "'", obj32, 10);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + 10 + "'", obj33, 10);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + 10 + "'", obj34, 10);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test253");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        boolean boolean9 = stackTestDriver5.isEmpty();
        java.lang.Object obj11 = stackTestDriver5.push((java.lang.Object) 100);
        experiment.util.StackTestDriver stackTestDriver12 = new experiment.util.StackTestDriver();
        java.lang.Object obj14 = stackTestDriver12.push((java.lang.Object) (byte) -1);
        boolean boolean15 = stackTestDriver12.isEmpty();
        java.lang.Object obj16 = stackTestDriver12.pop();
        int int17 = stackTestDriver12.size();
        experiment.util.StackTestDriver stackTestDriver18 = new experiment.util.StackTestDriver();
        java.lang.Object obj20 = stackTestDriver18.push((java.lang.Object) (byte) -1);
        boolean boolean21 = stackTestDriver18.isEmpty();
        java.lang.Object obj22 = stackTestDriver18.pop();
        experiment.util.StackTestDriver stackTestDriver23 = new experiment.util.StackTestDriver();
        java.lang.Object obj25 = stackTestDriver23.push((java.lang.Object) (byte) -1);
        java.lang.Object obj26 = stackTestDriver18.push((java.lang.Object) stackTestDriver23);
        int int27 = stackTestDriver23.size();
        java.lang.Object obj28 = stackTestDriver12.push((java.lang.Object) stackTestDriver23);
        java.lang.Object obj29 = new java.lang.Object();
        java.lang.Object obj30 = stackTestDriver23.push(obj29);
        boolean boolean31 = stackTestDriver23.isEmpty();
        java.lang.Object obj32 = stackTestDriver5.push((java.lang.Object) stackTestDriver23);
        stackTestDriver5.clear();
        experiment.util.StackTestDriver stackTestDriver34 = new experiment.util.StackTestDriver();
        java.lang.Object obj36 = stackTestDriver34.push((java.lang.Object) (byte) -1);
        experiment.util.StackTestDriver stackTestDriver37 = new experiment.util.StackTestDriver();
        java.lang.Object obj39 = stackTestDriver37.push((java.lang.Object) (byte) -1);
        boolean boolean40 = stackTestDriver37.isEmpty();
        boolean boolean41 = stackTestDriver37.isEmpty();
        int int42 = stackTestDriver37.size();
        java.lang.Object obj43 = new java.lang.Object();
        java.lang.Class<?> wildcardClass44 = obj43.getClass();
        java.lang.Object obj45 = stackTestDriver37.push((java.lang.Object) wildcardClass44);
        java.lang.Object obj46 = stackTestDriver37.peek();
        java.lang.Object obj47 = stackTestDriver34.push((java.lang.Object) stackTestDriver37);
        int int48 = stackTestDriver37.size();
        java.lang.Object obj49 = stackTestDriver5.push((java.lang.Object) stackTestDriver37);
        java.lang.Object obj51 = stackTestDriver37.push((java.lang.Object) 1L);
        boolean boolean52 = stackTestDriver37.isEmpty();
        boolean boolean53 = stackTestDriver37.isEmpty();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 100 + "'", obj11, 100);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (byte) -1 + "'", obj14, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (byte) -1 + "'", obj16, (byte) -1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (byte) -1 + "'", obj20, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (byte) -1 + "'", obj22, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (byte) -1 + "'", obj25, (byte) -1);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + (byte) -1 + "'", obj36, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + (byte) -1 + "'", obj39, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertEquals(obj45.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj45), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj45), "class java.lang.Object");
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertEquals(obj46.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj46), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj46), "class java.lang.Object");
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 2 + "'", int48 == 2);
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertEquals("'" + obj51 + "' != '" + 1L + "'", obj51, 1L);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test254");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        int int9 = stackTestDriver5.size();
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        java.lang.Object obj12 = stackTestDriver10.push((java.lang.Object) (byte) -1);
        boolean boolean13 = stackTestDriver10.isEmpty();
        java.lang.Object obj14 = stackTestDriver10.pop();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        java.lang.Object obj17 = stackTestDriver15.push((java.lang.Object) (byte) -1);
        java.lang.Object obj18 = stackTestDriver10.push((java.lang.Object) stackTestDriver15);
        boolean boolean19 = stackTestDriver15.isEmpty();
        java.lang.Object obj20 = stackTestDriver5.push((java.lang.Object) stackTestDriver15);
        java.lang.Object obj22 = stackTestDriver15.push((java.lang.Object) 10);
        experiment.util.StackTestDriver stackTestDriver23 = new experiment.util.StackTestDriver();
        java.lang.Object obj25 = stackTestDriver23.push((java.lang.Object) (byte) -1);
        boolean boolean26 = stackTestDriver23.isEmpty();
        boolean boolean27 = stackTestDriver23.isEmpty();
        int int28 = stackTestDriver23.size();
        java.lang.Object obj29 = new java.lang.Object();
        java.lang.Class<?> wildcardClass30 = obj29.getClass();
        java.lang.Object obj31 = stackTestDriver23.push((java.lang.Object) wildcardClass30);
        int int32 = stackTestDriver23.size();
        int int33 = stackTestDriver23.size();
        java.lang.Object obj34 = stackTestDriver15.push((java.lang.Object) int33);
        experiment.util.StackTestDriver stackTestDriver35 = new experiment.util.StackTestDriver();
        java.lang.Object obj37 = stackTestDriver35.push((java.lang.Object) (byte) -1);
        boolean boolean38 = stackTestDriver35.isEmpty();
        java.lang.Object obj40 = stackTestDriver35.push((java.lang.Object) 10.0f);
        java.lang.Object obj41 = stackTestDriver35.pop();
        java.lang.Object obj42 = stackTestDriver35.peek();
        java.lang.Object obj43 = stackTestDriver15.push((java.lang.Object) stackTestDriver35);
        experiment.util.StackTestDriver stackTestDriver44 = new experiment.util.StackTestDriver();
        java.lang.Object obj46 = stackTestDriver44.push((java.lang.Object) (byte) -1);
        boolean boolean47 = stackTestDriver44.isEmpty();
        java.lang.Object obj48 = stackTestDriver44.pop();
        experiment.util.StackTestDriver stackTestDriver49 = new experiment.util.StackTestDriver();
        java.lang.Object obj51 = stackTestDriver49.push((java.lang.Object) (byte) -1);
        java.lang.Object obj52 = stackTestDriver44.push((java.lang.Object) stackTestDriver49);
        boolean boolean53 = stackTestDriver49.isEmpty();
        experiment.util.StackTestDriver stackTestDriver54 = new experiment.util.StackTestDriver();
        java.lang.Object obj56 = stackTestDriver54.push((java.lang.Object) (byte) -1);
        boolean boolean57 = stackTestDriver54.isEmpty();
        java.lang.Object obj58 = stackTestDriver54.pop();
        experiment.util.StackTestDriver stackTestDriver59 = new experiment.util.StackTestDriver();
        java.lang.Object obj61 = stackTestDriver59.push((java.lang.Object) (byte) -1);
        java.lang.Object obj62 = stackTestDriver54.push((java.lang.Object) stackTestDriver59);
        int int63 = stackTestDriver59.size();
        java.lang.Object obj64 = stackTestDriver59.peek();
        boolean boolean65 = stackTestDriver59.isEmpty();
        stackTestDriver59.clear();
        experiment.util.StackTestDriver stackTestDriver67 = new experiment.util.StackTestDriver();
        java.lang.Object obj69 = stackTestDriver67.push((java.lang.Object) (byte) -1);
        boolean boolean70 = stackTestDriver67.isEmpty();
        boolean boolean71 = stackTestDriver67.isEmpty();
        int int72 = stackTestDriver67.size();
        java.lang.Class<?> wildcardClass73 = stackTestDriver67.getClass();
        java.lang.Object obj74 = stackTestDriver59.push((java.lang.Object) wildcardClass73);
        java.lang.Class<?> wildcardClass75 = stackTestDriver59.getClass();
        java.lang.Object obj76 = stackTestDriver49.push((java.lang.Object) wildcardClass75);
        java.lang.Class<?> wildcardClass77 = stackTestDriver49.getClass();
        java.lang.Object obj78 = stackTestDriver35.push((java.lang.Object) stackTestDriver49);
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) -1 + "'", obj12, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (byte) -1 + "'", obj14, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) -1 + "'", obj17, (byte) -1);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 10 + "'", obj22, 10);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (byte) -1 + "'", obj25, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertEquals(obj31.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj31), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj31), "class java.lang.Object");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2 + "'", int32 == 2);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2 + "'", int33 == 2);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + 2 + "'", obj34, 2);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + (byte) -1 + "'", obj37, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + 10.0f + "'", obj40, 10.0f);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + 10.0f + "'", obj41, 10.0f);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + (byte) -1 + "'", obj42, (byte) -1);
        org.junit.Assert.assertNotNull(obj43);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + (byte) -1 + "'", obj46, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + (byte) -1 + "'", obj48, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj51 + "' != '" + (byte) -1 + "'", obj51, (byte) -1);
        org.junit.Assert.assertNotNull(obj52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertEquals("'" + obj56 + "' != '" + (byte) -1 + "'", obj56, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertEquals("'" + obj58 + "' != '" + (byte) -1 + "'", obj58, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj61 + "' != '" + (byte) -1 + "'", obj61, (byte) -1);
        org.junit.Assert.assertNotNull(obj62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 1 + "'", int63 == 1);
        org.junit.Assert.assertEquals("'" + obj64 + "' != '" + (byte) -1 + "'", obj64, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertEquals("'" + obj69 + "' != '" + (byte) -1 + "'", obj69, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 1 + "'", int72 == 1);
        org.junit.Assert.assertNotNull(wildcardClass73);
        org.junit.Assert.assertNotNull(obj74);
        org.junit.Assert.assertEquals(obj74.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj74), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj74), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertNotNull(wildcardClass75);
        org.junit.Assert.assertNotNull(obj76);
        org.junit.Assert.assertEquals(obj76.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj76), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj76), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertNotNull(wildcardClass77);
        org.junit.Assert.assertNotNull(obj78);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test255");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        int int9 = stackTestDriver5.size();
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        java.lang.Object obj12 = stackTestDriver10.push((java.lang.Object) (byte) -1);
        boolean boolean13 = stackTestDriver10.isEmpty();
        java.lang.Object obj14 = stackTestDriver10.pop();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        java.lang.Object obj17 = stackTestDriver15.push((java.lang.Object) (byte) -1);
        java.lang.Object obj18 = stackTestDriver10.push((java.lang.Object) stackTestDriver15);
        boolean boolean19 = stackTestDriver15.isEmpty();
        java.lang.Object obj20 = stackTestDriver5.push((java.lang.Object) stackTestDriver15);
        java.lang.Object obj22 = stackTestDriver15.push((java.lang.Object) 10);
        experiment.util.StackTestDriver stackTestDriver23 = new experiment.util.StackTestDriver();
        java.lang.Object obj25 = stackTestDriver23.push((java.lang.Object) (byte) -1);
        boolean boolean26 = stackTestDriver23.isEmpty();
        boolean boolean27 = stackTestDriver23.isEmpty();
        int int28 = stackTestDriver23.size();
        java.lang.Object obj29 = new java.lang.Object();
        java.lang.Class<?> wildcardClass30 = obj29.getClass();
        java.lang.Object obj31 = stackTestDriver23.push((java.lang.Object) wildcardClass30);
        int int32 = stackTestDriver23.size();
        int int33 = stackTestDriver23.size();
        java.lang.Object obj34 = stackTestDriver15.push((java.lang.Object) int33);
        experiment.util.StackTestDriver stackTestDriver35 = new experiment.util.StackTestDriver();
        java.lang.Object obj37 = stackTestDriver35.push((java.lang.Object) (byte) -1);
        int int38 = stackTestDriver35.size();
        experiment.util.StackTestDriver stackTestDriver39 = new experiment.util.StackTestDriver();
        java.lang.Object obj41 = stackTestDriver39.push((java.lang.Object) (byte) -1);
        boolean boolean42 = stackTestDriver39.isEmpty();
        java.lang.Object obj43 = stackTestDriver39.pop();
        experiment.util.StackTestDriver stackTestDriver44 = new experiment.util.StackTestDriver();
        java.lang.Object obj46 = stackTestDriver44.push((java.lang.Object) (byte) -1);
        java.lang.Object obj47 = stackTestDriver39.push((java.lang.Object) stackTestDriver44);
        int int48 = stackTestDriver44.size();
        experiment.util.StackTestDriver stackTestDriver49 = new experiment.util.StackTestDriver();
        java.lang.Object obj51 = stackTestDriver49.push((java.lang.Object) (byte) -1);
        boolean boolean52 = stackTestDriver49.isEmpty();
        java.lang.Object obj53 = stackTestDriver49.pop();
        experiment.util.StackTestDriver stackTestDriver54 = new experiment.util.StackTestDriver();
        java.lang.Object obj56 = stackTestDriver54.push((java.lang.Object) (byte) -1);
        java.lang.Object obj57 = stackTestDriver49.push((java.lang.Object) stackTestDriver54);
        boolean boolean58 = stackTestDriver54.isEmpty();
        java.lang.Object obj59 = stackTestDriver44.push((java.lang.Object) stackTestDriver54);
        java.lang.Object obj60 = stackTestDriver35.push(obj59);
        java.lang.Object obj61 = stackTestDriver15.push((java.lang.Object) stackTestDriver35);
        java.lang.Object obj62 = stackTestDriver35.pop();
        java.lang.Object obj63 = stackTestDriver35.peek();
        int int64 = stackTestDriver35.size();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) -1 + "'", obj12, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (byte) -1 + "'", obj14, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) -1 + "'", obj17, (byte) -1);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 10 + "'", obj22, 10);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (byte) -1 + "'", obj25, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertEquals(obj31.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj31), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj31), "class java.lang.Object");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2 + "'", int32 == 2);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2 + "'", int33 == 2);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + 2 + "'", obj34, 2);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + (byte) -1 + "'", obj37, (byte) -1);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + (byte) -1 + "'", obj41, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + (byte) -1 + "'", obj43, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + (byte) -1 + "'", obj46, (byte) -1);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertEquals("'" + obj51 + "' != '" + (byte) -1 + "'", obj51, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + obj53 + "' != '" + (byte) -1 + "'", obj53, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj56 + "' != '" + (byte) -1 + "'", obj56, (byte) -1);
        org.junit.Assert.assertNotNull(obj57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(obj59);
        org.junit.Assert.assertNotNull(obj60);
        org.junit.Assert.assertNotNull(obj61);
        org.junit.Assert.assertNotNull(obj62);
        org.junit.Assert.assertEquals("'" + obj63 + "' != '" + (byte) -1 + "'", obj63, (byte) -1);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 1 + "'", int64 == 1);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1264048269_1024_0.test256");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        int int9 = stackTestDriver5.size();
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        java.lang.Object obj12 = stackTestDriver10.push((java.lang.Object) (byte) -1);
        boolean boolean13 = stackTestDriver10.isEmpty();
        java.lang.Object obj14 = stackTestDriver10.pop();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        java.lang.Object obj17 = stackTestDriver15.push((java.lang.Object) (byte) -1);
        java.lang.Object obj18 = stackTestDriver10.push((java.lang.Object) stackTestDriver15);
        boolean boolean19 = stackTestDriver15.isEmpty();
        java.lang.Object obj20 = stackTestDriver5.push((java.lang.Object) stackTestDriver15);
        java.lang.Object obj21 = stackTestDriver5.peek();
        int int22 = stackTestDriver5.size();
        experiment.util.StackTestDriver stackTestDriver23 = new experiment.util.StackTestDriver();
        java.lang.Object obj25 = stackTestDriver23.push((java.lang.Object) (byte) -1);
        boolean boolean26 = stackTestDriver23.isEmpty();
        java.lang.Object obj27 = stackTestDriver23.pop();
        experiment.util.StackTestDriver stackTestDriver28 = new experiment.util.StackTestDriver();
        java.lang.Object obj30 = stackTestDriver28.push((java.lang.Object) (byte) -1);
        java.lang.Object obj31 = stackTestDriver23.push((java.lang.Object) stackTestDriver28);
        int int32 = stackTestDriver28.size();
        boolean boolean33 = stackTestDriver28.isEmpty();
        stackTestDriver28.clear();
        boolean boolean35 = stackTestDriver28.isEmpty();
        int int36 = stackTestDriver28.size();
        int int37 = stackTestDriver28.size();
        java.lang.Object obj38 = stackTestDriver5.push((java.lang.Object) stackTestDriver28);
        java.lang.Class<?> wildcardClass39 = stackTestDriver28.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) -1 + "'", obj12, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (byte) -1 + "'", obj14, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) -1 + "'", obj17, (byte) -1);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (byte) -1 + "'", obj25, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + (byte) -1 + "'", obj27, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + (byte) -1 + "'", obj30, (byte) -1);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

}
