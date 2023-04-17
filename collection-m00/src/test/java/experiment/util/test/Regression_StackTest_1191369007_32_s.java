package experiment.util.test;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Regression_StackTest_1191369007_32_s {

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
            System.out.format("%n%s%n", "Regression_StackTest_1191369007_1024_0.test001");
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
            System.out.format("%n%s%n", "Regression_StackTest_1191369007_1024_0.test002");
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
            System.out.format("%n%s%n", "Regression_StackTest_1191369007_1024_0.test003");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1191369007_1024_0.test004");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) 100.0f);
        java.lang.Object obj3 = stackTestDriver0.peek();
        java.lang.Object obj4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = stackTestDriver0.push(obj4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + 100.0f + "'", obj2, 100.0f);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1191369007_1024_0.test005");
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
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1191369007_1024_0.test006");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) 100.0f);
        java.lang.Object obj3 = stackTestDriver0.peek();
        java.lang.Object obj4 = stackTestDriver0.pop();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + 100.0f + "'", obj2, 100.0f);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1191369007_1024_0.test007");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) 100.0f);
        java.lang.Object obj3 = stackTestDriver0.peek();
        java.lang.Object obj4 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        int int6 = stackTestDriver5.size();
        boolean boolean7 = stackTestDriver5.isEmpty();
        stackTestDriver5.clear();
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        java.lang.Class<?> wildcardClass10 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + 100.0f + "'", obj2, 100.0f);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1191369007_1024_0.test008");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) 100.0f);
        java.lang.Object obj3 = stackTestDriver0.peek();
        java.lang.Object obj4 = stackTestDriver0.pop();
        java.lang.Class<?> wildcardClass5 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + 100.0f + "'", obj2, 100.0f);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1191369007_1024_0.test009");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) 100.0f);
        java.lang.Object obj3 = stackTestDriver0.peek();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + 100.0f + "'", obj2, 100.0f);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) -1 + "'", obj5, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1191369007_1024_0.test010");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) 100.0f);
        java.lang.Object obj3 = stackTestDriver0.peek();
        java.lang.Object obj4 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        int int6 = stackTestDriver5.size();
        boolean boolean7 = stackTestDriver5.isEmpty();
        stackTestDriver5.clear();
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + 100.0f + "'", obj2, 100.0f);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1191369007_1024_0.test011");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) 100.0f);
        boolean boolean3 = stackTestDriver0.isEmpty();
        int int4 = stackTestDriver0.size();
        java.lang.Class<?> wildcardClass5 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + 100.0f + "'", obj2, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1191369007_1024_0.test012");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) 100.0f);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Class<?> wildcardClass6 = stackTestDriver5.getClass();
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) wildcardClass6);
        java.lang.Object obj8 = stackTestDriver0.pop();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + 100.0f + "'", obj2, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "class experiment.util.StackTestDriver");
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1191369007_1024_0.test013");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) 100.0f);
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) 100);
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) 1.0d);
        stackTestDriver0.clear();
        java.lang.Class<?> wildcardClass8 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + 100.0f + "'", obj2, 100.0f);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100 + "'", obj4, 100);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0d + "'", obj6, 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1191369007_1024_0.test014");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) 100.0f);
        java.lang.Object obj3 = stackTestDriver0.peek();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        java.lang.Object obj6 = stackTestDriver0.pop();
        boolean boolean7 = stackTestDriver0.isEmpty();
        int int8 = stackTestDriver0.size();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + 100.0f + "'", obj2, 100.0f);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) -1 + "'", obj5, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) -1 + "'", obj6, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1191369007_1024_0.test015");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) 100.0f);
        java.lang.Object obj3 = stackTestDriver0.peek();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean6 = stackTestDriver0.isEmpty();
        int int7 = stackTestDriver0.size();
        java.lang.Class<?> wildcardClass8 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + 100.0f + "'", obj2, 100.0f);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) -1 + "'", obj5, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1191369007_1024_0.test016");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) 100.0f);
        java.lang.Object obj3 = stackTestDriver0.peek();
        int int4 = stackTestDriver0.size();
        java.lang.Object obj5 = stackTestDriver0.peek();
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) 100L);
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        java.lang.Object obj10 = stackTestDriver8.push((java.lang.Object) 100.0f);
        java.lang.Object obj11 = stackTestDriver8.peek();
        java.lang.Object obj12 = stackTestDriver8.pop();
        experiment.util.StackTestDriver stackTestDriver13 = new experiment.util.StackTestDriver();
        int int14 = stackTestDriver13.size();
        boolean boolean15 = stackTestDriver13.isEmpty();
        stackTestDriver13.clear();
        java.lang.Object obj17 = stackTestDriver8.push((java.lang.Object) stackTestDriver13);
        stackTestDriver8.clear();
        java.lang.Object obj19 = stackTestDriver0.push((java.lang.Object) stackTestDriver8);
        stackTestDriver8.clear();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + 100.0f + "'", obj2, 100.0f);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0f + "'", obj5, 100.0f);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 100L + "'", obj7, 100L);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 100.0f + "'", obj10, 100.0f);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 100.0f + "'", obj11, 100.0f);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0f + "'", obj12, 100.0f);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNotNull(obj19);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1191369007_1024_0.test017");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) 100.0f);
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) 100);
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) 1.0d);
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + 100.0f + "'", obj2, 100.0f);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100 + "'", obj4, 100);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0d + "'", obj6, 1.0d);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1191369007_1024_0.test018");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) 100.0f);
        java.lang.Object obj3 = stackTestDriver0.peek();
        int int4 = stackTestDriver0.size();
        java.lang.Object obj5 = stackTestDriver0.peek();
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) 100L);
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        java.lang.Object obj10 = stackTestDriver8.push((java.lang.Object) 100.0f);
        java.lang.Object obj11 = stackTestDriver8.peek();
        java.lang.Object obj12 = stackTestDriver8.pop();
        experiment.util.StackTestDriver stackTestDriver13 = new experiment.util.StackTestDriver();
        int int14 = stackTestDriver13.size();
        boolean boolean15 = stackTestDriver13.isEmpty();
        stackTestDriver13.clear();
        java.lang.Object obj17 = stackTestDriver8.push((java.lang.Object) stackTestDriver13);
        stackTestDriver8.clear();
        java.lang.Object obj19 = stackTestDriver0.push((java.lang.Object) stackTestDriver8);
        experiment.util.StackTestDriver stackTestDriver20 = new experiment.util.StackTestDriver();
        java.lang.Object obj22 = stackTestDriver20.push((java.lang.Object) 100.0f);
        java.lang.Object obj23 = stackTestDriver20.peek();
        java.lang.Object obj24 = stackTestDriver20.pop();
        experiment.util.StackTestDriver stackTestDriver25 = new experiment.util.StackTestDriver();
        int int26 = stackTestDriver25.size();
        boolean boolean27 = stackTestDriver25.isEmpty();
        stackTestDriver25.clear();
        java.lang.Object obj29 = stackTestDriver20.push((java.lang.Object) stackTestDriver25);
        java.lang.Object obj30 = stackTestDriver0.push((java.lang.Object) stackTestDriver20);
        java.lang.Class<?> wildcardClass31 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + 100.0f + "'", obj2, 100.0f);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0f + "'", obj5, 100.0f);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 100L + "'", obj7, 100L);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 100.0f + "'", obj10, 100.0f);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 100.0f + "'", obj11, 100.0f);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0f + "'", obj12, 100.0f);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 100.0f + "'", obj22, 100.0f);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 100.0f + "'", obj23, 100.0f);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 100.0f + "'", obj24, 100.0f);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1191369007_1024_0.test019");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) 100.0f);
        java.lang.Object obj3 = stackTestDriver0.peek();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean6 = stackTestDriver0.isEmpty();
        java.lang.Object obj7 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        java.lang.Object obj10 = stackTestDriver8.push((java.lang.Object) 100.0f);
        java.lang.Object obj11 = stackTestDriver8.peek();
        java.lang.Object obj13 = stackTestDriver8.push((java.lang.Object) (byte) -1);
        java.lang.Object obj14 = stackTestDriver8.pop();
        boolean boolean15 = stackTestDriver8.isEmpty();
        java.lang.Object obj16 = stackTestDriver0.push((java.lang.Object) stackTestDriver8);
        java.lang.Object obj18 = stackTestDriver0.push((java.lang.Object) true);
        int int19 = stackTestDriver0.size();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + 100.0f + "'", obj2, 100.0f);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) -1 + "'", obj5, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 100.0f + "'", obj10, 100.0f);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 100.0f + "'", obj11, 100.0f);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (byte) -1 + "'", obj13, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (byte) -1 + "'", obj14, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + true + "'", obj18, true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1191369007_1024_0.test020");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) 100.0f);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Class<?> wildcardClass6 = stackTestDriver5.getClass();
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) wildcardClass6);
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + 100.0f + "'", obj2, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1191369007_1024_0.test021");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) 100.0f);
        boolean boolean3 = stackTestDriver0.isEmpty();
        int int4 = stackTestDriver0.size();
        int int5 = stackTestDriver0.size();
        java.lang.Class<?> wildcardClass6 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + 100.0f + "'", obj2, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1191369007_1024_0.test022");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) 100.0f);
        boolean boolean3 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        boolean boolean5 = stackTestDriver0.isEmpty();
        int int6 = stackTestDriver0.size();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) 1L);
        boolean boolean9 = stackTestDriver0.isEmpty();
        int int10 = stackTestDriver0.size();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + 100.0f + "'", obj2, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 1L + "'", obj8, 1L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1191369007_1024_0.test023");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) 100.0f);
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) 100);
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + 100.0f + "'", obj2, 100.0f);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100 + "'", obj4, 100);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1191369007_1024_0.test024");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) 100.0f);
        java.lang.Object obj3 = stackTestDriver0.peek();
        java.lang.Object obj4 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        int int6 = stackTestDriver5.size();
        boolean boolean7 = stackTestDriver5.isEmpty();
        stackTestDriver5.clear();
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        java.lang.Object obj12 = stackTestDriver10.push((java.lang.Object) 100.0f);
        java.lang.Object obj13 = stackTestDriver5.push(obj12);
        java.lang.Class<?> wildcardClass14 = stackTestDriver5.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + 100.0f + "'", obj2, 100.0f);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0f + "'", obj12, 100.0f);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100.0f + "'", obj13, 100.0f);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1191369007_1024_0.test025");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) 100.0f);
        java.lang.Object obj3 = stackTestDriver0.peek();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + 100.0f + "'", obj2, 100.0f);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) -1 + "'", obj5, (byte) -1);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1191369007_1024_0.test026");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) 100.0f);
        java.lang.Object obj3 = stackTestDriver0.peek();
        java.lang.Object obj4 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        int int6 = stackTestDriver5.size();
        boolean boolean7 = stackTestDriver5.isEmpty();
        stackTestDriver5.clear();
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        java.lang.Object obj10 = stackTestDriver0.peek();
        java.lang.Class<?> wildcardClass11 = obj10.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + 100.0f + "'", obj2, 100.0f);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1191369007_1024_0.test027");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) 100.0f);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Class<?> wildcardClass6 = stackTestDriver5.getClass();
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) wildcardClass6);
        java.lang.Object obj8 = stackTestDriver0.pop();
        boolean boolean9 = stackTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + 100.0f + "'", obj2, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1191369007_1024_0.test028");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) 100.0f);
        java.lang.Object obj3 = stackTestDriver0.peek();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean6 = stackTestDriver0.isEmpty();
        java.lang.Object obj7 = stackTestDriver0.pop();
        java.lang.Class<?> wildcardClass8 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + 100.0f + "'", obj2, 100.0f);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) -1 + "'", obj5, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1191369007_1024_0.test029");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) 100.0f);
        boolean boolean3 = stackTestDriver0.isEmpty();
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
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + 100.0f + "'", obj2, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1191369007_1024_0.test030");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) 100.0f);
        java.lang.Object obj3 = stackTestDriver0.peek();
        java.lang.Object obj4 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        int int6 = stackTestDriver5.size();
        boolean boolean7 = stackTestDriver5.isEmpty();
        stackTestDriver5.clear();
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        stackTestDriver0.clear();
        int int11 = stackTestDriver0.size();
        java.lang.Object obj13 = stackTestDriver0.push((java.lang.Object) 100L);
        boolean boolean14 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        java.lang.Class<?> wildcardClass16 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + 100.0f + "'", obj2, 100.0f);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100L + "'", obj13, 100L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1191369007_1024_0.test031");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) 100.0f);
        java.lang.Object obj3 = stackTestDriver0.peek();
        int int4 = stackTestDriver0.size();
        java.lang.Object obj5 = stackTestDriver0.peek();
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) 100L);
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        java.lang.Object obj10 = stackTestDriver8.push((java.lang.Object) 100.0f);
        java.lang.Object obj11 = stackTestDriver8.peek();
        java.lang.Object obj12 = stackTestDriver8.pop();
        experiment.util.StackTestDriver stackTestDriver13 = new experiment.util.StackTestDriver();
        int int14 = stackTestDriver13.size();
        boolean boolean15 = stackTestDriver13.isEmpty();
        stackTestDriver13.clear();
        java.lang.Object obj17 = stackTestDriver8.push((java.lang.Object) stackTestDriver13);
        stackTestDriver8.clear();
        java.lang.Object obj19 = stackTestDriver0.push((java.lang.Object) stackTestDriver8);
        experiment.util.StackTestDriver stackTestDriver20 = new experiment.util.StackTestDriver();
        java.lang.Object obj22 = stackTestDriver20.push((java.lang.Object) 100.0f);
        java.lang.Object obj23 = stackTestDriver20.peek();
        java.lang.Object obj25 = stackTestDriver20.push((java.lang.Object) (byte) -1);
        boolean boolean26 = stackTestDriver20.isEmpty();
        java.lang.Object obj27 = stackTestDriver20.pop();
        experiment.util.StackTestDriver stackTestDriver28 = new experiment.util.StackTestDriver();
        java.lang.Object obj30 = stackTestDriver28.push((java.lang.Object) 100.0f);
        java.lang.Object obj31 = stackTestDriver28.peek();
        java.lang.Object obj33 = stackTestDriver28.push((java.lang.Object) (byte) -1);
        java.lang.Object obj34 = stackTestDriver28.pop();
        boolean boolean35 = stackTestDriver28.isEmpty();
        java.lang.Object obj36 = stackTestDriver20.push((java.lang.Object) stackTestDriver28);
        java.lang.Object obj38 = stackTestDriver20.push((java.lang.Object) true);
        java.lang.Object obj39 = stackTestDriver8.push((java.lang.Object) stackTestDriver20);
        java.lang.Class<?> wildcardClass40 = stackTestDriver8.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + 100.0f + "'", obj2, 100.0f);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0f + "'", obj5, 100.0f);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 100L + "'", obj7, 100L);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 100.0f + "'", obj10, 100.0f);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 100.0f + "'", obj11, 100.0f);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0f + "'", obj12, 100.0f);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 100.0f + "'", obj22, 100.0f);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 100.0f + "'", obj23, 100.0f);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (byte) -1 + "'", obj25, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + (byte) -1 + "'", obj27, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + 100.0f + "'", obj30, 100.0f);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 100.0f + "'", obj31, 100.0f);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + (byte) -1 + "'", obj33, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + (byte) -1 + "'", obj34, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + true + "'", obj38, true);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1191369007_1024_0.test032");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) 100.0f);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + 100.0f + "'", obj2, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
    }

}
