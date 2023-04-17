package experiment.util.test;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Regression_StackTest_2070236138_256_s {

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
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test001");
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
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test002");
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
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test003");
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
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test004");
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
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test005");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        int int3 = stackTestDriver0.size();
        java.lang.Class<?> wildcardClass4 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test006");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        int int3 = stackTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test007");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Class<?> wildcardClass4 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test008");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        int int2 = stackTestDriver0.size();
        java.lang.Class<?> wildcardClass3 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test009");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        boolean boolean4 = stackTestDriver0.isEmpty();
        java.lang.Class<?> wildcardClass5 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test010");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        java.lang.Class<?> wildcardClass2 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test011");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test012");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Class<?> wildcardClass3 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test013");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = stackTestDriver0.peek();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) -1 + "'", obj3, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test014");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = stackTestDriver0.push(obj1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test015");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
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
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test016");
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
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test017");
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
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test018");
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
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test019");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver3 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        stackTestDriver4.clear();
        boolean boolean7 = stackTestDriver4.isEmpty();
        boolean boolean8 = stackTestDriver4.isEmpty();
        java.lang.Object obj9 = stackTestDriver3.push((java.lang.Object) stackTestDriver4);
        java.lang.Object obj10 = stackTestDriver0.push((java.lang.Object) stackTestDriver3);
        java.lang.Object obj12 = stackTestDriver3.push((java.lang.Object) 0.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 0.0f + "'", obj12, 0.0f);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test020");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = stackTestDriver0.peek();
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) -1 + "'", obj3, (byte) -1);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test021");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = stackTestDriver0.peek();
        java.lang.Object obj4 = stackTestDriver0.peek();
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) -1 + "'", obj3, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test022");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        int int3 = stackTestDriver0.size();
        int int4 = stackTestDriver0.size();
        java.lang.Class<?> wildcardClass5 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test023");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        int int3 = stackTestDriver0.size();
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test024");
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
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test025");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver1 = new experiment.util.StackTestDriver();
        int int2 = stackTestDriver1.size();
        stackTestDriver1.clear();
        boolean boolean4 = stackTestDriver1.isEmpty();
        boolean boolean5 = stackTestDriver1.isEmpty();
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) stackTestDriver1);
        stackTestDriver1.clear();
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        java.lang.Object obj10 = stackTestDriver8.push((java.lang.Object) (byte) -1);
        java.lang.Object obj11 = stackTestDriver8.peek();
        java.lang.Object obj12 = stackTestDriver8.peek();
        stackTestDriver8.clear();
        boolean boolean14 = stackTestDriver8.isEmpty();
        java.lang.Object obj15 = stackTestDriver1.push((java.lang.Object) stackTestDriver8);
        experiment.util.StackTestDriver stackTestDriver16 = new experiment.util.StackTestDriver();
        java.lang.Class<?> wildcardClass17 = stackTestDriver16.getClass();
        java.lang.Object obj18 = stackTestDriver8.push((java.lang.Object) stackTestDriver16);
        java.lang.Class<?> wildcardClass19 = obj18.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) -1 + "'", obj11, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) -1 + "'", obj12, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test026");
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
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test027");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        int int3 = stackTestDriver0.size();
        stackTestDriver0.clear();
        java.lang.Class<?> wildcardClass5 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test028");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver3 = new experiment.util.StackTestDriver();
        int int4 = stackTestDriver3.size();
        boolean boolean5 = stackTestDriver3.isEmpty();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver7 = new experiment.util.StackTestDriver();
        int int8 = stackTestDriver7.size();
        stackTestDriver7.clear();
        boolean boolean10 = stackTestDriver7.isEmpty();
        boolean boolean11 = stackTestDriver7.isEmpty();
        java.lang.Object obj12 = stackTestDriver6.push((java.lang.Object) stackTestDriver7);
        java.lang.Object obj13 = stackTestDriver3.push((java.lang.Object) stackTestDriver6);
        java.lang.Object obj14 = stackTestDriver6.pop();
        java.lang.Object obj15 = stackTestDriver0.push(obj14);
        java.lang.Object obj16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = stackTestDriver0.push(obj16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test029");
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
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test030");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) false);
        stackTestDriver0.clear();
        boolean boolean7 = stackTestDriver0.isEmpty();
        int int8 = stackTestDriver0.size();
        boolean boolean9 = stackTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + false + "'", obj5, false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test031");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test032");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = stackTestDriver0.peek();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        int int7 = stackTestDriver6.size();
        stackTestDriver6.clear();
        boolean boolean9 = stackTestDriver6.isEmpty();
        boolean boolean10 = stackTestDriver6.isEmpty();
        java.lang.Object obj11 = stackTestDriver5.push((java.lang.Object) stackTestDriver6);
        java.lang.Object obj12 = stackTestDriver0.push(obj11);
        java.lang.Class<?> wildcardClass13 = obj12.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) -1 + "'", obj3, (byte) -1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test033");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
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
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test034");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = stackTestDriver0.peek();
        int int4 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        int int6 = stackTestDriver5.size();
        stackTestDriver5.clear();
        boolean boolean8 = stackTestDriver5.isEmpty();
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) boolean8);
        boolean boolean10 = stackTestDriver0.isEmpty();
        boolean boolean11 = stackTestDriver0.isEmpty();
        java.lang.Class<?> wildcardClass12 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) -1 + "'", obj3, (byte) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + true + "'", obj9, true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test035");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) false);
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + false + "'", obj5, false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test036");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = stackTestDriver0.peek();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        int int7 = stackTestDriver6.size();
        stackTestDriver6.clear();
        boolean boolean9 = stackTestDriver6.isEmpty();
        boolean boolean10 = stackTestDriver6.isEmpty();
        java.lang.Object obj11 = stackTestDriver5.push((java.lang.Object) stackTestDriver6);
        java.lang.Object obj12 = stackTestDriver0.push(obj11);
        experiment.util.StackTestDriver stackTestDriver13 = new experiment.util.StackTestDriver();
        java.lang.Object obj15 = stackTestDriver13.push((java.lang.Object) (byte) -1);
        java.lang.Object obj16 = stackTestDriver13.peek();
        java.lang.Object obj17 = stackTestDriver13.peek();
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        java.lang.Object obj19 = stackTestDriver0.push(obj17);
        experiment.util.StackTestDriver stackTestDriver20 = new experiment.util.StackTestDriver();
        int int21 = stackTestDriver20.size();
        boolean boolean22 = stackTestDriver20.isEmpty();
        experiment.util.StackTestDriver stackTestDriver23 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver24 = new experiment.util.StackTestDriver();
        int int25 = stackTestDriver24.size();
        stackTestDriver24.clear();
        boolean boolean27 = stackTestDriver24.isEmpty();
        boolean boolean28 = stackTestDriver24.isEmpty();
        java.lang.Object obj29 = stackTestDriver23.push((java.lang.Object) stackTestDriver24);
        java.lang.Object obj30 = stackTestDriver20.push((java.lang.Object) stackTestDriver23);
        java.lang.Object obj31 = stackTestDriver0.push(obj30);
        java.lang.Class<?> wildcardClass32 = obj30.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) -1 + "'", obj3, (byte) -1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (byte) -1 + "'", obj15, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (byte) -1 + "'", obj16, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) -1 + "'", obj17, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (byte) -1 + "'", obj19, (byte) -1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test037");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver1 = new experiment.util.StackTestDriver();
        int int2 = stackTestDriver1.size();
        stackTestDriver1.clear();
        boolean boolean4 = stackTestDriver1.isEmpty();
        boolean boolean5 = stackTestDriver1.isEmpty();
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) stackTestDriver1);
        stackTestDriver1.clear();
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        java.lang.Object obj10 = stackTestDriver8.push((java.lang.Object) (byte) -1);
        java.lang.Object obj11 = stackTestDriver8.peek();
        java.lang.Object obj12 = stackTestDriver8.peek();
        stackTestDriver8.clear();
        boolean boolean14 = stackTestDriver8.isEmpty();
        java.lang.Object obj15 = stackTestDriver1.push((java.lang.Object) stackTestDriver8);
        boolean boolean16 = stackTestDriver8.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = stackTestDriver8.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) -1 + "'", obj11, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) -1 + "'", obj12, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test038");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test039");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) false);
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + false + "'", obj5, false);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test040");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = stackTestDriver0.peek();
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) -1 + "'", obj3, (byte) -1);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test041");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver1 = new experiment.util.StackTestDriver();
        int int2 = stackTestDriver1.size();
        stackTestDriver1.clear();
        boolean boolean4 = stackTestDriver1.isEmpty();
        boolean boolean5 = stackTestDriver1.isEmpty();
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) stackTestDriver1);
        java.lang.Object obj7 = stackTestDriver0.peek();
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test042");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver3 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        stackTestDriver4.clear();
        boolean boolean7 = stackTestDriver4.isEmpty();
        boolean boolean8 = stackTestDriver4.isEmpty();
        java.lang.Object obj9 = stackTestDriver3.push((java.lang.Object) stackTestDriver4);
        java.lang.Object obj10 = stackTestDriver0.push((java.lang.Object) stackTestDriver3);
        java.lang.Object obj11 = stackTestDriver3.pop();
        java.lang.Class<?> wildcardClass12 = obj11.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test043");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test044");
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
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test045");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = stackTestDriver0.peek();
        java.lang.Object obj4 = stackTestDriver0.peek();
        stackTestDriver0.clear();
        boolean boolean6 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) -1 + "'", obj3, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test046");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = stackTestDriver0.peek();
        int int4 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        int int6 = stackTestDriver5.size();
        stackTestDriver5.clear();
        boolean boolean8 = stackTestDriver5.isEmpty();
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) boolean8);
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) -1 + "'", obj3, (byte) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + true + "'", obj9, true);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test047");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = stackTestDriver0.peek();
        java.lang.Object obj4 = stackTestDriver0.peek();
        stackTestDriver0.clear();
        int int6 = stackTestDriver0.size();
        boolean boolean7 = stackTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) -1 + "'", obj3, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test048");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        int int3 = stackTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test049");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = stackTestDriver0.peek();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        int int7 = stackTestDriver6.size();
        stackTestDriver6.clear();
        boolean boolean9 = stackTestDriver6.isEmpty();
        boolean boolean10 = stackTestDriver6.isEmpty();
        java.lang.Object obj11 = stackTestDriver5.push((java.lang.Object) stackTestDriver6);
        java.lang.Object obj12 = stackTestDriver0.push(obj11);
        experiment.util.StackTestDriver stackTestDriver13 = new experiment.util.StackTestDriver();
        java.lang.Object obj15 = stackTestDriver13.push((java.lang.Object) (byte) -1);
        java.lang.Object obj16 = stackTestDriver13.peek();
        java.lang.Object obj17 = stackTestDriver13.peek();
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        java.lang.Object obj19 = stackTestDriver0.push(obj17);
        experiment.util.StackTestDriver stackTestDriver20 = new experiment.util.StackTestDriver();
        int int21 = stackTestDriver20.size();
        boolean boolean22 = stackTestDriver20.isEmpty();
        experiment.util.StackTestDriver stackTestDriver23 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver24 = new experiment.util.StackTestDriver();
        int int25 = stackTestDriver24.size();
        stackTestDriver24.clear();
        boolean boolean27 = stackTestDriver24.isEmpty();
        boolean boolean28 = stackTestDriver24.isEmpty();
        java.lang.Object obj29 = stackTestDriver23.push((java.lang.Object) stackTestDriver24);
        java.lang.Object obj30 = stackTestDriver20.push((java.lang.Object) stackTestDriver23);
        java.lang.Object obj31 = stackTestDriver0.push(obj30);
        experiment.util.StackTestDriver stackTestDriver32 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver33 = new experiment.util.StackTestDriver();
        int int34 = stackTestDriver33.size();
        stackTestDriver33.clear();
        boolean boolean36 = stackTestDriver33.isEmpty();
        boolean boolean37 = stackTestDriver33.isEmpty();
        java.lang.Object obj38 = stackTestDriver32.push((java.lang.Object) stackTestDriver33);
        java.lang.Object obj39 = stackTestDriver0.push((java.lang.Object) stackTestDriver32);
        java.lang.Class<?> wildcardClass40 = stackTestDriver32.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) -1 + "'", obj3, (byte) -1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (byte) -1 + "'", obj15, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (byte) -1 + "'", obj16, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) -1 + "'", obj17, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (byte) -1 + "'", obj19, (byte) -1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test050");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver1 = new experiment.util.StackTestDriver();
        int int2 = stackTestDriver1.size();
        stackTestDriver1.clear();
        boolean boolean4 = stackTestDriver1.isEmpty();
        boolean boolean5 = stackTestDriver1.isEmpty();
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) stackTestDriver1);
        stackTestDriver1.clear();
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        java.lang.Object obj10 = stackTestDriver8.push((java.lang.Object) (byte) -1);
        java.lang.Object obj11 = stackTestDriver8.peek();
        java.lang.Object obj12 = stackTestDriver8.peek();
        stackTestDriver8.clear();
        boolean boolean14 = stackTestDriver8.isEmpty();
        java.lang.Object obj15 = stackTestDriver1.push((java.lang.Object) stackTestDriver8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = stackTestDriver8.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) -1 + "'", obj11, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) -1 + "'", obj12, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test051");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver1 = new experiment.util.StackTestDriver();
        int int2 = stackTestDriver1.size();
        stackTestDriver1.clear();
        boolean boolean4 = stackTestDriver1.isEmpty();
        boolean boolean5 = stackTestDriver1.isEmpty();
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) stackTestDriver1);
        boolean boolean7 = stackTestDriver1.isEmpty();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test052");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = stackTestDriver0.peek();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        int int7 = stackTestDriver6.size();
        stackTestDriver6.clear();
        boolean boolean9 = stackTestDriver6.isEmpty();
        boolean boolean10 = stackTestDriver6.isEmpty();
        java.lang.Object obj11 = stackTestDriver5.push((java.lang.Object) stackTestDriver6);
        java.lang.Object obj12 = stackTestDriver0.push(obj11);
        experiment.util.StackTestDriver stackTestDriver13 = new experiment.util.StackTestDriver();
        java.lang.Object obj15 = stackTestDriver13.push((java.lang.Object) (byte) -1);
        java.lang.Object obj16 = stackTestDriver13.peek();
        java.lang.Object obj17 = stackTestDriver13.peek();
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        java.lang.Object obj19 = stackTestDriver0.push(obj17);
        experiment.util.StackTestDriver stackTestDriver20 = new experiment.util.StackTestDriver();
        int int21 = stackTestDriver20.size();
        boolean boolean22 = stackTestDriver20.isEmpty();
        experiment.util.StackTestDriver stackTestDriver23 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver24 = new experiment.util.StackTestDriver();
        int int25 = stackTestDriver24.size();
        stackTestDriver24.clear();
        boolean boolean27 = stackTestDriver24.isEmpty();
        boolean boolean28 = stackTestDriver24.isEmpty();
        java.lang.Object obj29 = stackTestDriver23.push((java.lang.Object) stackTestDriver24);
        java.lang.Object obj30 = stackTestDriver20.push((java.lang.Object) stackTestDriver23);
        java.lang.Object obj31 = stackTestDriver0.push(obj30);
        experiment.util.StackTestDriver stackTestDriver32 = new experiment.util.StackTestDriver();
        int int33 = stackTestDriver32.size();
        boolean boolean34 = stackTestDriver32.isEmpty();
        experiment.util.StackTestDriver stackTestDriver35 = new experiment.util.StackTestDriver();
        int int36 = stackTestDriver35.size();
        boolean boolean37 = stackTestDriver35.isEmpty();
        experiment.util.StackTestDriver stackTestDriver38 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver39 = new experiment.util.StackTestDriver();
        int int40 = stackTestDriver39.size();
        stackTestDriver39.clear();
        boolean boolean42 = stackTestDriver39.isEmpty();
        boolean boolean43 = stackTestDriver39.isEmpty();
        java.lang.Object obj44 = stackTestDriver38.push((java.lang.Object) stackTestDriver39);
        java.lang.Object obj45 = stackTestDriver35.push((java.lang.Object) stackTestDriver38);
        java.lang.Object obj46 = stackTestDriver38.pop();
        java.lang.Object obj47 = stackTestDriver32.push(obj46);
        java.lang.Object obj48 = stackTestDriver0.push((java.lang.Object) stackTestDriver32);
        java.lang.Class<?> wildcardClass49 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) -1 + "'", obj3, (byte) -1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (byte) -1 + "'", obj15, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (byte) -1 + "'", obj16, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) -1 + "'", obj17, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (byte) -1 + "'", obj19, (byte) -1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test053");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = stackTestDriver0.peek();
        boolean boolean4 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        int int6 = stackTestDriver5.size();
        stackTestDriver5.clear();
        int int8 = stackTestDriver5.size();
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) int8);
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        int int12 = stackTestDriver0.size();
        java.lang.Object obj13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = stackTestDriver0.push(obj13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) -1 + "'", obj3, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0 + "'", obj9, 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test054");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver1 = new experiment.util.StackTestDriver();
        int int2 = stackTestDriver1.size();
        stackTestDriver1.clear();
        boolean boolean4 = stackTestDriver1.isEmpty();
        boolean boolean5 = stackTestDriver1.isEmpty();
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) stackTestDriver1);
        boolean boolean7 = stackTestDriver0.isEmpty();
        boolean boolean8 = stackTestDriver0.isEmpty();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test055");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) false);
        java.lang.Object obj6 = stackTestDriver0.pop();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + false + "'", obj5, false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + false + "'", obj6, false);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test056");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = stackTestDriver0.peek();
        boolean boolean4 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        int int6 = stackTestDriver5.size();
        stackTestDriver5.clear();
        int int8 = stackTestDriver5.size();
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) int8);
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) -1 + "'", obj3, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0 + "'", obj9, 0);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test057");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = stackTestDriver0.peek();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        int int7 = stackTestDriver6.size();
        stackTestDriver6.clear();
        boolean boolean9 = stackTestDriver6.isEmpty();
        boolean boolean10 = stackTestDriver6.isEmpty();
        java.lang.Object obj11 = stackTestDriver5.push((java.lang.Object) stackTestDriver6);
        java.lang.Object obj12 = stackTestDriver0.push(obj11);
        experiment.util.StackTestDriver stackTestDriver13 = new experiment.util.StackTestDriver();
        java.lang.Object obj15 = stackTestDriver13.push((java.lang.Object) (byte) -1);
        java.lang.Object obj16 = stackTestDriver13.peek();
        java.lang.Object obj17 = stackTestDriver13.peek();
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        java.lang.Object obj19 = stackTestDriver0.push(obj17);
        experiment.util.StackTestDriver stackTestDriver20 = new experiment.util.StackTestDriver();
        int int21 = stackTestDriver20.size();
        boolean boolean22 = stackTestDriver20.isEmpty();
        experiment.util.StackTestDriver stackTestDriver23 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver24 = new experiment.util.StackTestDriver();
        int int25 = stackTestDriver24.size();
        stackTestDriver24.clear();
        boolean boolean27 = stackTestDriver24.isEmpty();
        boolean boolean28 = stackTestDriver24.isEmpty();
        java.lang.Object obj29 = stackTestDriver23.push((java.lang.Object) stackTestDriver24);
        java.lang.Object obj30 = stackTestDriver20.push((java.lang.Object) stackTestDriver23);
        java.lang.Object obj31 = stackTestDriver0.push(obj30);
        experiment.util.StackTestDriver stackTestDriver32 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver33 = new experiment.util.StackTestDriver();
        int int34 = stackTestDriver33.size();
        stackTestDriver33.clear();
        boolean boolean36 = stackTestDriver33.isEmpty();
        boolean boolean37 = stackTestDriver33.isEmpty();
        java.lang.Object obj38 = stackTestDriver32.push((java.lang.Object) stackTestDriver33);
        java.lang.Object obj39 = stackTestDriver0.push((java.lang.Object) stackTestDriver32);
        java.lang.Class<?> wildcardClass40 = obj39.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) -1 + "'", obj3, (byte) -1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (byte) -1 + "'", obj15, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (byte) -1 + "'", obj16, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) -1 + "'", obj17, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (byte) -1 + "'", obj19, (byte) -1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test058");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) 1.0f);
        java.lang.Object obj5 = stackTestDriver0.peek();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 1.0f + "'", obj4, 1.0f);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 1.0f + "'", obj5, 1.0f);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test059");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        int int3 = stackTestDriver0.size();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Class<?> wildcardClass6 = stackTestDriver5.getClass();
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) wildcardClass6);
        java.lang.Class<?> wildcardClass8 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test060");
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
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test061");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = stackTestDriver0.peek();
        int int4 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        int int6 = stackTestDriver5.size();
        stackTestDriver5.clear();
        boolean boolean8 = stackTestDriver5.isEmpty();
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) boolean8);
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        int int11 = stackTestDriver10.size();
        boolean boolean12 = stackTestDriver10.isEmpty();
        stackTestDriver10.clear();
        java.lang.Object obj14 = stackTestDriver0.push((java.lang.Object) stackTestDriver10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = stackTestDriver10.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) -1 + "'", obj3, (byte) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + true + "'", obj9, true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test062");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver1 = new experiment.util.StackTestDriver();
        int int2 = stackTestDriver1.size();
        stackTestDriver1.clear();
        boolean boolean4 = stackTestDriver1.isEmpty();
        boolean boolean5 = stackTestDriver1.isEmpty();
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) stackTestDriver1);
        stackTestDriver1.clear();
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        java.lang.Object obj10 = stackTestDriver8.push((java.lang.Object) (byte) -1);
        java.lang.Object obj11 = stackTestDriver8.peek();
        java.lang.Object obj12 = stackTestDriver8.peek();
        stackTestDriver8.clear();
        boolean boolean14 = stackTestDriver8.isEmpty();
        java.lang.Object obj15 = stackTestDriver1.push((java.lang.Object) stackTestDriver8);
        experiment.util.StackTestDriver stackTestDriver16 = new experiment.util.StackTestDriver();
        java.lang.Class<?> wildcardClass17 = stackTestDriver16.getClass();
        java.lang.Object obj18 = stackTestDriver8.push((java.lang.Object) stackTestDriver16);
        int int19 = stackTestDriver16.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) -1 + "'", obj11, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) -1 + "'", obj12, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test063");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver3 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        stackTestDriver4.clear();
        boolean boolean7 = stackTestDriver4.isEmpty();
        boolean boolean8 = stackTestDriver4.isEmpty();
        java.lang.Object obj9 = stackTestDriver3.push((java.lang.Object) stackTestDriver4);
        java.lang.Object obj10 = stackTestDriver0.push((java.lang.Object) stackTestDriver3);
        java.lang.Object obj12 = stackTestDriver0.push((java.lang.Object) ' ');
        java.lang.Object obj13 = stackTestDriver0.pop();
        java.lang.Class<?> wildcardClass14 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + ' ' + "'", obj12, ' ');
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + ' ' + "'", obj13, ' ');
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test064");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        int int2 = stackTestDriver0.size();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) 0);
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0 + "'", obj4, 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test065");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = stackTestDriver0.peek();
        int int4 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        int int6 = stackTestDriver5.size();
        stackTestDriver5.clear();
        boolean boolean8 = stackTestDriver5.isEmpty();
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) boolean8);
        stackTestDriver0.clear();
        java.lang.Class<?> wildcardClass11 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) -1 + "'", obj3, (byte) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + true + "'", obj9, true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test066");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
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
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test067");
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
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test068");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = stackTestDriver0.peek();
        java.lang.Object obj4 = stackTestDriver0.peek();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) -1 + "'", obj3, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test069");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = stackTestDriver0.peek();
        java.lang.Object obj4 = stackTestDriver0.peek();
        stackTestDriver0.clear();
        int int6 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver7 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        int int9 = stackTestDriver8.size();
        stackTestDriver8.clear();
        boolean boolean11 = stackTestDriver8.isEmpty();
        boolean boolean12 = stackTestDriver8.isEmpty();
        java.lang.Object obj13 = stackTestDriver7.push((java.lang.Object) stackTestDriver8);
        java.lang.Object obj14 = stackTestDriver7.peek();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        int int16 = stackTestDriver15.size();
        stackTestDriver15.clear();
        boolean boolean18 = stackTestDriver15.isEmpty();
        java.lang.Object obj20 = stackTestDriver15.push((java.lang.Object) (-1L));
        java.lang.Object obj21 = stackTestDriver7.push(obj20);
        experiment.util.StackTestDriver stackTestDriver22 = new experiment.util.StackTestDriver();
        java.lang.Object obj24 = stackTestDriver22.push((java.lang.Object) (byte) -1);
        java.lang.Object obj25 = stackTestDriver22.peek();
        boolean boolean26 = stackTestDriver22.isEmpty();
        java.lang.Object obj27 = stackTestDriver7.push((java.lang.Object) stackTestDriver22);
        java.lang.Object obj28 = stackTestDriver7.peek();
        java.lang.Object obj30 = stackTestDriver7.push((java.lang.Object) false);
        java.lang.Class<?> wildcardClass31 = obj30.getClass();
        java.lang.Object obj32 = stackTestDriver0.push(obj30);
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) -1 + "'", obj3, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (-1L) + "'", obj20, (-1L));
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (-1L) + "'", obj21, (-1L));
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (byte) -1 + "'", obj24, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (byte) -1 + "'", obj25, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + false + "'", obj30, false);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + false + "'", obj32, false);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test070");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = stackTestDriver0.peek();
        java.lang.Object obj4 = stackTestDriver0.peek();
        stackTestDriver0.clear();
        boolean boolean6 = stackTestDriver0.isEmpty();
        boolean boolean7 = stackTestDriver0.isEmpty();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) -1 + "'", obj3, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test071");
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
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test072");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver3 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        stackTestDriver4.clear();
        boolean boolean7 = stackTestDriver4.isEmpty();
        boolean boolean8 = stackTestDriver4.isEmpty();
        java.lang.Object obj9 = stackTestDriver3.push((java.lang.Object) stackTestDriver4);
        java.lang.Object obj10 = stackTestDriver0.push((java.lang.Object) stackTestDriver3);
        experiment.util.StackTestDriver stackTestDriver11 = new experiment.util.StackTestDriver();
        int int12 = stackTestDriver11.size();
        boolean boolean13 = stackTestDriver11.isEmpty();
        experiment.util.StackTestDriver stackTestDriver14 = new experiment.util.StackTestDriver();
        int int15 = stackTestDriver14.size();
        boolean boolean16 = stackTestDriver14.isEmpty();
        experiment.util.StackTestDriver stackTestDriver17 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver18 = new experiment.util.StackTestDriver();
        int int19 = stackTestDriver18.size();
        stackTestDriver18.clear();
        boolean boolean21 = stackTestDriver18.isEmpty();
        boolean boolean22 = stackTestDriver18.isEmpty();
        java.lang.Object obj23 = stackTestDriver17.push((java.lang.Object) stackTestDriver18);
        java.lang.Object obj24 = stackTestDriver14.push((java.lang.Object) stackTestDriver17);
        java.lang.Object obj25 = stackTestDriver17.pop();
        java.lang.Object obj26 = stackTestDriver11.push(obj25);
        java.lang.Object obj27 = stackTestDriver0.push((java.lang.Object) stackTestDriver11);
        experiment.util.StackTestDriver stackTestDriver28 = new experiment.util.StackTestDriver();
        java.lang.Object obj30 = stackTestDriver28.push((java.lang.Object) (byte) -1);
        java.lang.Object obj31 = stackTestDriver28.peek();
        boolean boolean32 = stackTestDriver28.isEmpty();
        experiment.util.StackTestDriver stackTestDriver33 = new experiment.util.StackTestDriver();
        int int34 = stackTestDriver33.size();
        stackTestDriver33.clear();
        int int36 = stackTestDriver33.size();
        java.lang.Object obj37 = stackTestDriver28.push((java.lang.Object) int36);
        java.lang.Object obj38 = stackTestDriver28.peek();
        experiment.util.StackTestDriver stackTestDriver39 = new experiment.util.StackTestDriver();
        java.lang.Object obj41 = stackTestDriver39.push((java.lang.Object) (byte) -1);
        java.lang.Object obj42 = stackTestDriver39.peek();
        stackTestDriver39.clear();
        experiment.util.StackTestDriver stackTestDriver44 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver45 = new experiment.util.StackTestDriver();
        int int46 = stackTestDriver45.size();
        stackTestDriver45.clear();
        boolean boolean48 = stackTestDriver45.isEmpty();
        boolean boolean49 = stackTestDriver45.isEmpty();
        java.lang.Object obj50 = stackTestDriver44.push((java.lang.Object) stackTestDriver45);
        java.lang.Object obj51 = stackTestDriver39.push(obj50);
        java.lang.Object obj52 = stackTestDriver28.push((java.lang.Object) stackTestDriver39);
        java.lang.Object obj53 = stackTestDriver0.push((java.lang.Object) stackTestDriver28);
        java.lang.Class<?> wildcardClass54 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + (byte) -1 + "'", obj30, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + (byte) -1 + "'", obj31, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + 0 + "'", obj37, 0);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + 0 + "'", obj38, 0);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + (byte) -1 + "'", obj41, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + (byte) -1 + "'", obj42, (byte) -1);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(obj50);
        org.junit.Assert.assertNotNull(obj51);
        org.junit.Assert.assertNotNull(obj52);
        org.junit.Assert.assertNotNull(obj53);
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test073");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) 1.0f);
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        stackTestDriver5.clear();
        int int7 = stackTestDriver5.size();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = stackTestDriver5.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 1.0f + "'", obj4, 1.0f);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test074");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        int int3 = stackTestDriver0.size();
        java.lang.Class<?> wildcardClass4 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test075");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) false);
        stackTestDriver0.clear();
        boolean boolean7 = stackTestDriver0.isEmpty();
        int int8 = stackTestDriver0.size();
        boolean boolean9 = stackTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + false + "'", obj5, false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test076");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver3 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        stackTestDriver4.clear();
        boolean boolean7 = stackTestDriver4.isEmpty();
        boolean boolean8 = stackTestDriver4.isEmpty();
        java.lang.Object obj9 = stackTestDriver3.push((java.lang.Object) stackTestDriver4);
        java.lang.Object obj10 = stackTestDriver0.push((java.lang.Object) stackTestDriver3);
        experiment.util.StackTestDriver stackTestDriver11 = new experiment.util.StackTestDriver();
        int int12 = stackTestDriver11.size();
        boolean boolean13 = stackTestDriver11.isEmpty();
        experiment.util.StackTestDriver stackTestDriver14 = new experiment.util.StackTestDriver();
        int int15 = stackTestDriver14.size();
        boolean boolean16 = stackTestDriver14.isEmpty();
        experiment.util.StackTestDriver stackTestDriver17 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver18 = new experiment.util.StackTestDriver();
        int int19 = stackTestDriver18.size();
        stackTestDriver18.clear();
        boolean boolean21 = stackTestDriver18.isEmpty();
        boolean boolean22 = stackTestDriver18.isEmpty();
        java.lang.Object obj23 = stackTestDriver17.push((java.lang.Object) stackTestDriver18);
        java.lang.Object obj24 = stackTestDriver14.push((java.lang.Object) stackTestDriver17);
        java.lang.Object obj25 = stackTestDriver17.pop();
        java.lang.Object obj26 = stackTestDriver11.push(obj25);
        java.lang.Object obj27 = stackTestDriver0.push((java.lang.Object) stackTestDriver11);
        java.lang.Class<?> wildcardClass28 = obj27.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test077");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        int int4 = stackTestDriver0.size();
        boolean boolean5 = stackTestDriver0.isEmpty();
        boolean boolean6 = stackTestDriver0.isEmpty();
        int int7 = stackTestDriver0.size();
        java.lang.Class<?> wildcardClass8 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test078");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        int int2 = stackTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test079");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver1 = new experiment.util.StackTestDriver();
        int int2 = stackTestDriver1.size();
        stackTestDriver1.clear();
        boolean boolean4 = stackTestDriver1.isEmpty();
        boolean boolean5 = stackTestDriver1.isEmpty();
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) stackTestDriver1);
        java.lang.Object obj7 = stackTestDriver0.peek();
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        int int9 = stackTestDriver8.size();
        stackTestDriver8.clear();
        boolean boolean11 = stackTestDriver8.isEmpty();
        java.lang.Object obj13 = stackTestDriver8.push((java.lang.Object) (-1L));
        java.lang.Object obj14 = stackTestDriver0.push(obj13);
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (-1L) + "'", obj13, (-1L));
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1L) + "'", obj14, (-1L));
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test080");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver3 = new experiment.util.StackTestDriver();
        int int4 = stackTestDriver3.size();
        boolean boolean5 = stackTestDriver3.isEmpty();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver7 = new experiment.util.StackTestDriver();
        int int8 = stackTestDriver7.size();
        stackTestDriver7.clear();
        boolean boolean10 = stackTestDriver7.isEmpty();
        boolean boolean11 = stackTestDriver7.isEmpty();
        java.lang.Object obj12 = stackTestDriver6.push((java.lang.Object) stackTestDriver7);
        java.lang.Object obj13 = stackTestDriver3.push((java.lang.Object) stackTestDriver6);
        java.lang.Object obj14 = stackTestDriver6.pop();
        java.lang.Object obj15 = stackTestDriver0.push(obj14);
        java.lang.Object obj16 = stackTestDriver0.pop();
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(obj16);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test081");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) false);
        stackTestDriver0.clear();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) (short) -1);
        java.lang.Object obj9 = stackTestDriver0.pop();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + false + "'", obj5, false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (short) -1 + "'", obj8, (short) -1);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (short) -1 + "'", obj9, (short) -1);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test082");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver3 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        stackTestDriver4.clear();
        boolean boolean7 = stackTestDriver4.isEmpty();
        boolean boolean8 = stackTestDriver4.isEmpty();
        java.lang.Object obj9 = stackTestDriver3.push((java.lang.Object) stackTestDriver4);
        java.lang.Object obj10 = stackTestDriver0.push((java.lang.Object) stackTestDriver3);
        experiment.util.StackTestDriver stackTestDriver11 = new experiment.util.StackTestDriver();
        int int12 = stackTestDriver11.size();
        boolean boolean13 = stackTestDriver11.isEmpty();
        experiment.util.StackTestDriver stackTestDriver14 = new experiment.util.StackTestDriver();
        int int15 = stackTestDriver14.size();
        boolean boolean16 = stackTestDriver14.isEmpty();
        experiment.util.StackTestDriver stackTestDriver17 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver18 = new experiment.util.StackTestDriver();
        int int19 = stackTestDriver18.size();
        stackTestDriver18.clear();
        boolean boolean21 = stackTestDriver18.isEmpty();
        boolean boolean22 = stackTestDriver18.isEmpty();
        java.lang.Object obj23 = stackTestDriver17.push((java.lang.Object) stackTestDriver18);
        java.lang.Object obj24 = stackTestDriver14.push((java.lang.Object) stackTestDriver17);
        java.lang.Object obj25 = stackTestDriver17.pop();
        java.lang.Object obj26 = stackTestDriver11.push(obj25);
        java.lang.Object obj27 = stackTestDriver0.push((java.lang.Object) stackTestDriver11);
        experiment.util.StackTestDriver stackTestDriver28 = new experiment.util.StackTestDriver();
        java.lang.Object obj30 = stackTestDriver28.push((java.lang.Object) (byte) -1);
        java.lang.Object obj31 = stackTestDriver28.peek();
        boolean boolean32 = stackTestDriver28.isEmpty();
        experiment.util.StackTestDriver stackTestDriver33 = new experiment.util.StackTestDriver();
        int int34 = stackTestDriver33.size();
        stackTestDriver33.clear();
        int int36 = stackTestDriver33.size();
        java.lang.Object obj37 = stackTestDriver28.push((java.lang.Object) int36);
        java.lang.Object obj38 = stackTestDriver28.peek();
        experiment.util.StackTestDriver stackTestDriver39 = new experiment.util.StackTestDriver();
        java.lang.Object obj41 = stackTestDriver39.push((java.lang.Object) (byte) -1);
        java.lang.Object obj42 = stackTestDriver39.peek();
        stackTestDriver39.clear();
        experiment.util.StackTestDriver stackTestDriver44 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver45 = new experiment.util.StackTestDriver();
        int int46 = stackTestDriver45.size();
        stackTestDriver45.clear();
        boolean boolean48 = stackTestDriver45.isEmpty();
        boolean boolean49 = stackTestDriver45.isEmpty();
        java.lang.Object obj50 = stackTestDriver44.push((java.lang.Object) stackTestDriver45);
        java.lang.Object obj51 = stackTestDriver39.push(obj50);
        java.lang.Object obj52 = stackTestDriver28.push((java.lang.Object) stackTestDriver39);
        java.lang.Object obj53 = stackTestDriver0.push((java.lang.Object) stackTestDriver28);
        java.lang.Class<?> wildcardClass54 = stackTestDriver28.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + (byte) -1 + "'", obj30, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + (byte) -1 + "'", obj31, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + 0 + "'", obj37, 0);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + 0 + "'", obj38, 0);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + (byte) -1 + "'", obj41, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + (byte) -1 + "'", obj42, (byte) -1);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(obj50);
        org.junit.Assert.assertNotNull(obj51);
        org.junit.Assert.assertNotNull(obj52);
        org.junit.Assert.assertNotNull(obj53);
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test083");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = stackTestDriver0.peek();
        int int4 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        int int7 = stackTestDriver6.size();
        stackTestDriver6.clear();
        boolean boolean9 = stackTestDriver6.isEmpty();
        int int10 = stackTestDriver6.size();
        java.lang.Object obj11 = stackTestDriver5.push((java.lang.Object) int10);
        java.lang.Object obj12 = stackTestDriver0.push(obj11);
        java.lang.Object obj13 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver14 = new experiment.util.StackTestDriver();
        int int15 = stackTestDriver14.size();
        boolean boolean16 = stackTestDriver14.isEmpty();
        experiment.util.StackTestDriver stackTestDriver17 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver18 = new experiment.util.StackTestDriver();
        int int19 = stackTestDriver18.size();
        stackTestDriver18.clear();
        boolean boolean21 = stackTestDriver18.isEmpty();
        boolean boolean22 = stackTestDriver18.isEmpty();
        java.lang.Object obj23 = stackTestDriver17.push((java.lang.Object) stackTestDriver18);
        java.lang.Object obj24 = stackTestDriver14.push((java.lang.Object) stackTestDriver17);
        stackTestDriver14.clear();
        java.lang.Object obj26 = stackTestDriver0.push((java.lang.Object) stackTestDriver14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj27 = stackTestDriver14.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) -1 + "'", obj3, (byte) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 0 + "'", obj11, 0);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 0 + "'", obj12, 0);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 0 + "'", obj13, 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(obj26);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test084");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test085");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
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
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test086");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        int int4 = stackTestDriver0.size();
        boolean boolean5 = stackTestDriver0.isEmpty();
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) (short) -1);
        stackTestDriver0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (short) -1 + "'", obj7, (short) -1);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test087");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = stackTestDriver0.peek();
        boolean boolean4 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        int int6 = stackTestDriver5.size();
        stackTestDriver5.clear();
        int int8 = stackTestDriver5.size();
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) int8);
        java.lang.Object obj10 = stackTestDriver0.peek();
        experiment.util.StackTestDriver stackTestDriver11 = new experiment.util.StackTestDriver();
        java.lang.Object obj13 = stackTestDriver11.push((java.lang.Object) (byte) -1);
        java.lang.Object obj14 = stackTestDriver11.peek();
        stackTestDriver11.clear();
        experiment.util.StackTestDriver stackTestDriver16 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver17 = new experiment.util.StackTestDriver();
        int int18 = stackTestDriver17.size();
        stackTestDriver17.clear();
        boolean boolean20 = stackTestDriver17.isEmpty();
        boolean boolean21 = stackTestDriver17.isEmpty();
        java.lang.Object obj22 = stackTestDriver16.push((java.lang.Object) stackTestDriver17);
        java.lang.Object obj23 = stackTestDriver11.push(obj22);
        java.lang.Object obj24 = stackTestDriver0.push((java.lang.Object) stackTestDriver11);
        java.lang.Class<?> wildcardClass25 = obj24.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) -1 + "'", obj3, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0 + "'", obj9, 0);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 0 + "'", obj10, 0);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (byte) -1 + "'", obj13, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (byte) -1 + "'", obj14, (byte) -1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test088");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver3 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        stackTestDriver4.clear();
        boolean boolean7 = stackTestDriver4.isEmpty();
        boolean boolean8 = stackTestDriver4.isEmpty();
        java.lang.Object obj9 = stackTestDriver3.push((java.lang.Object) stackTestDriver4);
        java.lang.Object obj10 = stackTestDriver0.push((java.lang.Object) stackTestDriver3);
        java.lang.Object obj12 = stackTestDriver0.push((java.lang.Object) ' ');
        int int13 = stackTestDriver0.size();
        java.lang.Object obj14 = stackTestDriver0.peek();
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + ' ' + "'", obj12, ' ');
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + ' ' + "'", obj14, ' ');
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test089");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = stackTestDriver0.peek();
        boolean boolean4 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        int int6 = stackTestDriver5.size();
        stackTestDriver5.clear();
        int int8 = stackTestDriver5.size();
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) int8);
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        int int12 = stackTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) -1 + "'", obj3, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0 + "'", obj9, 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test090");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver3 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        stackTestDriver4.clear();
        boolean boolean7 = stackTestDriver4.isEmpty();
        boolean boolean8 = stackTestDriver4.isEmpty();
        java.lang.Object obj9 = stackTestDriver3.push((java.lang.Object) stackTestDriver4);
        java.lang.Object obj10 = stackTestDriver0.push((java.lang.Object) stackTestDriver3);
        java.lang.Object obj12 = stackTestDriver0.push((java.lang.Object) ' ');
        int int13 = stackTestDriver0.size();
        java.lang.Object obj14 = stackTestDriver0.peek();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + ' ' + "'", obj12, ' ');
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + ' ' + "'", obj14, ' ');
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test091");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver3 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        stackTestDriver4.clear();
        boolean boolean7 = stackTestDriver4.isEmpty();
        boolean boolean8 = stackTestDriver4.isEmpty();
        java.lang.Object obj9 = stackTestDriver3.push((java.lang.Object) stackTestDriver4);
        java.lang.Object obj10 = stackTestDriver0.push((java.lang.Object) stackTestDriver3);
        java.lang.Object obj12 = stackTestDriver0.push((java.lang.Object) ' ');
        int int13 = stackTestDriver0.size();
        java.lang.Object obj14 = stackTestDriver0.peek();
        java.lang.Object obj15 = stackTestDriver0.peek();
        java.lang.Object obj16 = stackTestDriver0.pop();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + ' ' + "'", obj12, ' ');
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + ' ' + "'", obj14, ' ');
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + ' ' + "'", obj15, ' ');
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + ' ' + "'", obj16, ' ');
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test092");
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
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test093");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver3 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        stackTestDriver4.clear();
        boolean boolean7 = stackTestDriver4.isEmpty();
        boolean boolean8 = stackTestDriver4.isEmpty();
        java.lang.Object obj9 = stackTestDriver3.push((java.lang.Object) stackTestDriver4);
        java.lang.Object obj10 = stackTestDriver0.push((java.lang.Object) stackTestDriver3);
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test094");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver1 = new experiment.util.StackTestDriver();
        int int2 = stackTestDriver1.size();
        stackTestDriver1.clear();
        boolean boolean4 = stackTestDriver1.isEmpty();
        int int5 = stackTestDriver1.size();
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) int5);
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        boolean boolean9 = stackTestDriver0.isEmpty();
        java.lang.Class<?> wildcardClass10 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0 + "'", obj6, 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test095");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        java.lang.Object obj3 = stackTestDriver0.push((java.lang.Object) (short) 0);
        java.lang.Object obj4 = stackTestDriver0.peek();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (short) 0 + "'", obj3, (short) 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) 0 + "'", obj4, (short) 0);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test096");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        java.lang.Object obj3 = stackTestDriver0.push((java.lang.Object) (short) 0);
        boolean boolean4 = stackTestDriver0.isEmpty();
        java.lang.Object obj5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = stackTestDriver0.push(obj5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (short) 0 + "'", obj3, (short) 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test097");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver1 = new experiment.util.StackTestDriver();
        int int2 = stackTestDriver1.size();
        stackTestDriver1.clear();
        boolean boolean4 = stackTestDriver1.isEmpty();
        boolean boolean5 = stackTestDriver1.isEmpty();
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) stackTestDriver1);
        java.lang.Object obj7 = stackTestDriver0.peek();
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        int int9 = stackTestDriver8.size();
        stackTestDriver8.clear();
        boolean boolean11 = stackTestDriver8.isEmpty();
        java.lang.Object obj13 = stackTestDriver8.push((java.lang.Object) (-1L));
        java.lang.Object obj14 = stackTestDriver0.push(obj13);
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        java.lang.Object obj17 = stackTestDriver15.push((java.lang.Object) (byte) -1);
        java.lang.Object obj18 = stackTestDriver15.peek();
        boolean boolean19 = stackTestDriver15.isEmpty();
        java.lang.Object obj20 = stackTestDriver0.push((java.lang.Object) stackTestDriver15);
        java.lang.Class<?> wildcardClass21 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (-1L) + "'", obj13, (-1L));
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1L) + "'", obj14, (-1L));
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) -1 + "'", obj17, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (byte) -1 + "'", obj18, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test098");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver1 = new experiment.util.StackTestDriver();
        int int2 = stackTestDriver1.size();
        stackTestDriver1.clear();
        boolean boolean4 = stackTestDriver1.isEmpty();
        boolean boolean5 = stackTestDriver1.isEmpty();
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) stackTestDriver1);
        stackTestDriver1.clear();
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        java.lang.Object obj10 = stackTestDriver8.push((java.lang.Object) (byte) -1);
        java.lang.Object obj11 = stackTestDriver8.peek();
        java.lang.Object obj12 = stackTestDriver8.peek();
        stackTestDriver8.clear();
        boolean boolean14 = stackTestDriver8.isEmpty();
        java.lang.Object obj15 = stackTestDriver1.push((java.lang.Object) stackTestDriver8);
        boolean boolean16 = stackTestDriver8.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = stackTestDriver8.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) -1 + "'", obj11, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) -1 + "'", obj12, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test099");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver3 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        stackTestDriver4.clear();
        boolean boolean7 = stackTestDriver4.isEmpty();
        boolean boolean8 = stackTestDriver4.isEmpty();
        java.lang.Object obj9 = stackTestDriver3.push((java.lang.Object) stackTestDriver4);
        java.lang.Object obj10 = stackTestDriver0.push((java.lang.Object) stackTestDriver3);
        java.lang.Object obj12 = stackTestDriver0.push((java.lang.Object) ' ');
        int int13 = stackTestDriver0.size();
        java.lang.Object obj14 = stackTestDriver0.peek();
        stackTestDriver0.clear();
        java.lang.Class<?> wildcardClass16 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + ' ' + "'", obj12, ' ');
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + ' ' + "'", obj14, ' ');
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test100");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        int int3 = stackTestDriver0.size();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Class<?> wildcardClass6 = stackTestDriver5.getClass();
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) wildcardClass6);
        java.lang.Object obj8 = stackTestDriver0.peek();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test101");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver1 = new experiment.util.StackTestDriver();
        int int2 = stackTestDriver1.size();
        stackTestDriver1.clear();
        boolean boolean4 = stackTestDriver1.isEmpty();
        boolean boolean5 = stackTestDriver1.isEmpty();
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) stackTestDriver1);
        stackTestDriver1.clear();
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        java.lang.Object obj10 = stackTestDriver8.push((java.lang.Object) (byte) -1);
        java.lang.Object obj11 = stackTestDriver8.peek();
        java.lang.Object obj12 = stackTestDriver8.peek();
        stackTestDriver8.clear();
        boolean boolean14 = stackTestDriver8.isEmpty();
        java.lang.Object obj15 = stackTestDriver1.push((java.lang.Object) stackTestDriver8);
        stackTestDriver8.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = stackTestDriver8.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) -1 + "'", obj11, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) -1 + "'", obj12, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test102");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        int int3 = stackTestDriver0.size();
        java.lang.Object obj4 = stackTestDriver0.peek();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test103");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        int int4 = stackTestDriver0.size();
        boolean boolean5 = stackTestDriver0.isEmpty();
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) (short) -1);
        java.lang.Class<?> wildcardClass8 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (short) -1 + "'", obj7, (short) -1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test104");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
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
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) -1 + "'", obj3, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test105");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        int int3 = stackTestDriver0.size();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        int int6 = stackTestDriver5.size();
        boolean boolean7 = stackTestDriver5.isEmpty();
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver9 = new experiment.util.StackTestDriver();
        int int10 = stackTestDriver9.size();
        stackTestDriver9.clear();
        boolean boolean12 = stackTestDriver9.isEmpty();
        boolean boolean13 = stackTestDriver9.isEmpty();
        java.lang.Object obj14 = stackTestDriver8.push((java.lang.Object) stackTestDriver9);
        java.lang.Object obj15 = stackTestDriver5.push((java.lang.Object) stackTestDriver8);
        experiment.util.StackTestDriver stackTestDriver16 = new experiment.util.StackTestDriver();
        int int17 = stackTestDriver16.size();
        boolean boolean18 = stackTestDriver16.isEmpty();
        experiment.util.StackTestDriver stackTestDriver19 = new experiment.util.StackTestDriver();
        int int20 = stackTestDriver19.size();
        boolean boolean21 = stackTestDriver19.isEmpty();
        experiment.util.StackTestDriver stackTestDriver22 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver23 = new experiment.util.StackTestDriver();
        int int24 = stackTestDriver23.size();
        stackTestDriver23.clear();
        boolean boolean26 = stackTestDriver23.isEmpty();
        boolean boolean27 = stackTestDriver23.isEmpty();
        java.lang.Object obj28 = stackTestDriver22.push((java.lang.Object) stackTestDriver23);
        java.lang.Object obj29 = stackTestDriver19.push((java.lang.Object) stackTestDriver22);
        java.lang.Object obj30 = stackTestDriver22.pop();
        java.lang.Object obj31 = stackTestDriver16.push(obj30);
        java.lang.Object obj32 = stackTestDriver5.push((java.lang.Object) stackTestDriver16);
        java.lang.Object obj33 = stackTestDriver0.push(obj32);
        int int34 = stackTestDriver0.size();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test106");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver3 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        stackTestDriver4.clear();
        boolean boolean7 = stackTestDriver4.isEmpty();
        boolean boolean8 = stackTestDriver4.isEmpty();
        java.lang.Object obj9 = stackTestDriver3.push((java.lang.Object) stackTestDriver4);
        java.lang.Object obj10 = stackTestDriver0.push((java.lang.Object) stackTestDriver3);
        java.lang.Object obj12 = stackTestDriver0.push((java.lang.Object) ' ');
        int int13 = stackTestDriver0.size();
        java.lang.Object obj14 = stackTestDriver0.peek();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver16 = new experiment.util.StackTestDriver();
        java.lang.Object obj18 = stackTestDriver16.push((java.lang.Object) (byte) -1);
        java.lang.Object obj19 = stackTestDriver16.peek();
        java.lang.Object obj20 = stackTestDriver16.peek();
        stackTestDriver16.clear();
        stackTestDriver16.clear();
        java.lang.Object obj23 = stackTestDriver0.push((java.lang.Object) stackTestDriver16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = stackTestDriver16.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + ' ' + "'", obj12, ' ');
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + ' ' + "'", obj14, ' ');
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (byte) -1 + "'", obj18, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (byte) -1 + "'", obj19, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (byte) -1 + "'", obj20, (byte) -1);
        org.junit.Assert.assertNotNull(obj23);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test107");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver1 = new experiment.util.StackTestDriver();
        int int2 = stackTestDriver1.size();
        stackTestDriver1.clear();
        boolean boolean4 = stackTestDriver1.isEmpty();
        boolean boolean5 = stackTestDriver1.isEmpty();
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) stackTestDriver1);
        boolean boolean7 = stackTestDriver0.isEmpty();
        java.lang.Object obj8 = stackTestDriver0.peek();
        java.lang.Class<?> wildcardClass9 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test108");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver1 = new experiment.util.StackTestDriver();
        int int2 = stackTestDriver1.size();
        stackTestDriver1.clear();
        boolean boolean4 = stackTestDriver1.isEmpty();
        boolean boolean5 = stackTestDriver1.isEmpty();
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) stackTestDriver1);
        java.lang.Object obj7 = stackTestDriver0.peek();
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        int int9 = stackTestDriver8.size();
        stackTestDriver8.clear();
        boolean boolean11 = stackTestDriver8.isEmpty();
        java.lang.Object obj13 = stackTestDriver8.push((java.lang.Object) (-1L));
        java.lang.Object obj14 = stackTestDriver0.push(obj13);
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        java.lang.Object obj17 = stackTestDriver15.push((java.lang.Object) (byte) -1);
        java.lang.Object obj18 = stackTestDriver15.peek();
        boolean boolean19 = stackTestDriver15.isEmpty();
        java.lang.Object obj20 = stackTestDriver0.push((java.lang.Object) stackTestDriver15);
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver22 = new experiment.util.StackTestDriver();
        int int23 = stackTestDriver22.size();
        stackTestDriver22.clear();
        boolean boolean25 = stackTestDriver22.isEmpty();
        java.lang.Object obj27 = stackTestDriver22.push((java.lang.Object) false);
        boolean boolean28 = stackTestDriver22.isEmpty();
        java.lang.Class<?> wildcardClass29 = stackTestDriver22.getClass();
        java.lang.Object obj30 = stackTestDriver0.push((java.lang.Object) stackTestDriver22);
        int int31 = stackTestDriver22.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (-1L) + "'", obj13, (-1L));
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1L) + "'", obj14, (-1L));
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) -1 + "'", obj17, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (byte) -1 + "'", obj18, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + false + "'", obj27, false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test109");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver3 = new experiment.util.StackTestDriver();
        int int4 = stackTestDriver3.size();
        boolean boolean5 = stackTestDriver3.isEmpty();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver7 = new experiment.util.StackTestDriver();
        int int8 = stackTestDriver7.size();
        stackTestDriver7.clear();
        boolean boolean10 = stackTestDriver7.isEmpty();
        boolean boolean11 = stackTestDriver7.isEmpty();
        java.lang.Object obj12 = stackTestDriver6.push((java.lang.Object) stackTestDriver7);
        java.lang.Object obj13 = stackTestDriver3.push((java.lang.Object) stackTestDriver6);
        java.lang.Object obj14 = stackTestDriver6.pop();
        java.lang.Object obj15 = stackTestDriver0.push(obj14);
        java.lang.Object obj16 = stackTestDriver0.pop();
        java.lang.Class<?> wildcardClass17 = obj16.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test110");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = stackTestDriver0.peek();
        boolean boolean4 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        int int6 = stackTestDriver5.size();
        stackTestDriver5.clear();
        int int8 = stackTestDriver5.size();
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) int8);
        stackTestDriver0.clear();
        java.lang.Class<?> wildcardClass11 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) -1 + "'", obj3, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0 + "'", obj9, 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test111");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) false);
        stackTestDriver0.clear();
        boolean boolean7 = stackTestDriver0.isEmpty();
        int int8 = stackTestDriver0.size();
        boolean boolean9 = stackTestDriver0.isEmpty();
        java.lang.Object obj10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = stackTestDriver0.push(obj10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + false + "'", obj5, false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test112");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        int int3 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        stackTestDriver4.clear();
        boolean boolean7 = stackTestDriver4.isEmpty();
        java.lang.Object obj9 = stackTestDriver4.push((java.lang.Object) false);
        stackTestDriver4.clear();
        boolean boolean11 = stackTestDriver4.isEmpty();
        int int12 = stackTestDriver4.size();
        boolean boolean13 = stackTestDriver4.isEmpty();
        int int14 = stackTestDriver4.size();
        java.lang.Object obj15 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        experiment.util.StackTestDriver stackTestDriver16 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver17 = new experiment.util.StackTestDriver();
        int int18 = stackTestDriver17.size();
        stackTestDriver17.clear();
        boolean boolean20 = stackTestDriver17.isEmpty();
        boolean boolean21 = stackTestDriver17.isEmpty();
        java.lang.Object obj22 = stackTestDriver16.push((java.lang.Object) stackTestDriver17);
        java.lang.Object obj23 = stackTestDriver16.peek();
        experiment.util.StackTestDriver stackTestDriver24 = new experiment.util.StackTestDriver();
        int int25 = stackTestDriver24.size();
        stackTestDriver24.clear();
        boolean boolean27 = stackTestDriver24.isEmpty();
        java.lang.Object obj29 = stackTestDriver24.push((java.lang.Object) (-1L));
        java.lang.Object obj30 = stackTestDriver16.push(obj29);
        experiment.util.StackTestDriver stackTestDriver31 = new experiment.util.StackTestDriver();
        java.lang.Object obj33 = stackTestDriver31.push((java.lang.Object) (byte) -1);
        java.lang.Object obj34 = stackTestDriver31.peek();
        boolean boolean35 = stackTestDriver31.isEmpty();
        java.lang.Object obj36 = stackTestDriver16.push((java.lang.Object) stackTestDriver31);
        java.lang.Object obj37 = stackTestDriver0.push((java.lang.Object) stackTestDriver31);
        int int38 = stackTestDriver31.size();
        stackTestDriver31.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj40 = stackTestDriver31.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + false + "'", obj9, false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + (-1L) + "'", obj29, (-1L));
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + (-1L) + "'", obj30, (-1L));
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + (byte) -1 + "'", obj33, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + (byte) -1 + "'", obj34, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test113");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver3 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        stackTestDriver4.clear();
        boolean boolean7 = stackTestDriver4.isEmpty();
        boolean boolean8 = stackTestDriver4.isEmpty();
        java.lang.Object obj9 = stackTestDriver3.push((java.lang.Object) stackTestDriver4);
        java.lang.Object obj10 = stackTestDriver0.push((java.lang.Object) stackTestDriver3);
        experiment.util.StackTestDriver stackTestDriver11 = new experiment.util.StackTestDriver();
        int int12 = stackTestDriver11.size();
        boolean boolean13 = stackTestDriver11.isEmpty();
        experiment.util.StackTestDriver stackTestDriver14 = new experiment.util.StackTestDriver();
        int int15 = stackTestDriver14.size();
        boolean boolean16 = stackTestDriver14.isEmpty();
        experiment.util.StackTestDriver stackTestDriver17 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver18 = new experiment.util.StackTestDriver();
        int int19 = stackTestDriver18.size();
        stackTestDriver18.clear();
        boolean boolean21 = stackTestDriver18.isEmpty();
        boolean boolean22 = stackTestDriver18.isEmpty();
        java.lang.Object obj23 = stackTestDriver17.push((java.lang.Object) stackTestDriver18);
        java.lang.Object obj24 = stackTestDriver14.push((java.lang.Object) stackTestDriver17);
        java.lang.Object obj25 = stackTestDriver17.pop();
        java.lang.Object obj26 = stackTestDriver11.push(obj25);
        java.lang.Object obj27 = stackTestDriver0.push((java.lang.Object) stackTestDriver11);
        experiment.util.StackTestDriver stackTestDriver28 = new experiment.util.StackTestDriver();
        java.lang.Object obj30 = stackTestDriver28.push((java.lang.Object) (byte) -1);
        java.lang.Object obj31 = stackTestDriver28.peek();
        boolean boolean32 = stackTestDriver28.isEmpty();
        experiment.util.StackTestDriver stackTestDriver33 = new experiment.util.StackTestDriver();
        int int34 = stackTestDriver33.size();
        stackTestDriver33.clear();
        int int36 = stackTestDriver33.size();
        java.lang.Object obj37 = stackTestDriver28.push((java.lang.Object) int36);
        java.lang.Object obj38 = stackTestDriver28.peek();
        experiment.util.StackTestDriver stackTestDriver39 = new experiment.util.StackTestDriver();
        java.lang.Object obj41 = stackTestDriver39.push((java.lang.Object) (byte) -1);
        java.lang.Object obj42 = stackTestDriver39.peek();
        stackTestDriver39.clear();
        experiment.util.StackTestDriver stackTestDriver44 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver45 = new experiment.util.StackTestDriver();
        int int46 = stackTestDriver45.size();
        stackTestDriver45.clear();
        boolean boolean48 = stackTestDriver45.isEmpty();
        boolean boolean49 = stackTestDriver45.isEmpty();
        java.lang.Object obj50 = stackTestDriver44.push((java.lang.Object) stackTestDriver45);
        java.lang.Object obj51 = stackTestDriver39.push(obj50);
        java.lang.Object obj52 = stackTestDriver28.push((java.lang.Object) stackTestDriver39);
        java.lang.Object obj53 = stackTestDriver0.push((java.lang.Object) stackTestDriver28);
        java.lang.Object obj54 = stackTestDriver28.pop();
        java.lang.Object obj55 = stackTestDriver28.peek();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + (byte) -1 + "'", obj30, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + (byte) -1 + "'", obj31, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + 0 + "'", obj37, 0);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + 0 + "'", obj38, 0);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + (byte) -1 + "'", obj41, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + (byte) -1 + "'", obj42, (byte) -1);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(obj50);
        org.junit.Assert.assertNotNull(obj51);
        org.junit.Assert.assertNotNull(obj52);
        org.junit.Assert.assertNotNull(obj53);
        org.junit.Assert.assertNotNull(obj54);
        org.junit.Assert.assertEquals("'" + obj55 + "' != '" + 0 + "'", obj55, 0);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test114");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = stackTestDriver0.peek();
        int int4 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        int int6 = stackTestDriver5.size();
        stackTestDriver5.clear();
        boolean boolean8 = stackTestDriver5.isEmpty();
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) boolean8);
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        int int11 = stackTestDriver10.size();
        boolean boolean12 = stackTestDriver10.isEmpty();
        stackTestDriver10.clear();
        java.lang.Object obj14 = stackTestDriver0.push((java.lang.Object) stackTestDriver10);
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) -1 + "'", obj3, (byte) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + true + "'", obj9, true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test115");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver1 = new experiment.util.StackTestDriver();
        int int2 = stackTestDriver1.size();
        stackTestDriver1.clear();
        boolean boolean4 = stackTestDriver1.isEmpty();
        boolean boolean5 = stackTestDriver1.isEmpty();
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) stackTestDriver1);
        boolean boolean7 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test116");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = stackTestDriver0.peek();
        java.lang.Object obj4 = stackTestDriver0.peek();
        stackTestDriver0.clear();
        boolean boolean6 = stackTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) -1 + "'", obj3, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test117");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) (byte) -1);
        boolean boolean8 = stackTestDriver5.isEmpty();
        java.lang.Object obj9 = stackTestDriver5.pop();
        java.lang.Object obj10 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        boolean boolean11 = stackTestDriver5.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) -1 + "'", obj9, (byte) -1);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test118");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver1 = new experiment.util.StackTestDriver();
        int int2 = stackTestDriver1.size();
        stackTestDriver1.clear();
        boolean boolean4 = stackTestDriver1.isEmpty();
        boolean boolean5 = stackTestDriver1.isEmpty();
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) stackTestDriver1);
        java.lang.Object obj7 = stackTestDriver0.peek();
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        int int9 = stackTestDriver8.size();
        stackTestDriver8.clear();
        boolean boolean11 = stackTestDriver8.isEmpty();
        java.lang.Object obj13 = stackTestDriver8.push((java.lang.Object) (-1L));
        java.lang.Object obj14 = stackTestDriver0.push(obj13);
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        java.lang.Object obj17 = stackTestDriver15.push((java.lang.Object) (byte) -1);
        java.lang.Object obj18 = stackTestDriver15.peek();
        boolean boolean19 = stackTestDriver15.isEmpty();
        java.lang.Object obj20 = stackTestDriver0.push((java.lang.Object) stackTestDriver15);
        java.lang.Object obj21 = stackTestDriver0.peek();
        java.lang.Object obj23 = stackTestDriver0.push((java.lang.Object) 10.0d);
        java.lang.Class<?> wildcardClass24 = obj23.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (-1L) + "'", obj13, (-1L));
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1L) + "'", obj14, (-1L));
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) -1 + "'", obj17, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (byte) -1 + "'", obj18, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 10.0d + "'", obj23, 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test119");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) false);
        stackTestDriver0.clear();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) (short) -1);
        java.lang.Class<?> wildcardClass9 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + false + "'", obj5, false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (short) -1 + "'", obj8, (short) -1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test120");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) false);
        stackTestDriver0.clear();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) (short) -1);
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        java.lang.Object obj12 = stackTestDriver10.push((java.lang.Object) (byte) -1);
        java.lang.Object obj13 = stackTestDriver10.peek();
        java.lang.Object obj14 = stackTestDriver10.peek();
        stackTestDriver10.clear();
        java.lang.Class<?> wildcardClass16 = stackTestDriver10.getClass();
        java.lang.Object obj17 = stackTestDriver0.push((java.lang.Object) wildcardClass16);
        boolean boolean18 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + false + "'", obj5, false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (short) -1 + "'", obj8, (short) -1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) -1 + "'", obj12, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (byte) -1 + "'", obj13, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (byte) -1 + "'", obj14, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test121");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
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
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test122");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        int int3 = stackTestDriver0.size();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        int int6 = stackTestDriver5.size();
        boolean boolean7 = stackTestDriver5.isEmpty();
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver9 = new experiment.util.StackTestDriver();
        int int10 = stackTestDriver9.size();
        stackTestDriver9.clear();
        boolean boolean12 = stackTestDriver9.isEmpty();
        boolean boolean13 = stackTestDriver9.isEmpty();
        java.lang.Object obj14 = stackTestDriver8.push((java.lang.Object) stackTestDriver9);
        java.lang.Object obj15 = stackTestDriver5.push((java.lang.Object) stackTestDriver8);
        experiment.util.StackTestDriver stackTestDriver16 = new experiment.util.StackTestDriver();
        int int17 = stackTestDriver16.size();
        boolean boolean18 = stackTestDriver16.isEmpty();
        experiment.util.StackTestDriver stackTestDriver19 = new experiment.util.StackTestDriver();
        int int20 = stackTestDriver19.size();
        boolean boolean21 = stackTestDriver19.isEmpty();
        experiment.util.StackTestDriver stackTestDriver22 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver23 = new experiment.util.StackTestDriver();
        int int24 = stackTestDriver23.size();
        stackTestDriver23.clear();
        boolean boolean26 = stackTestDriver23.isEmpty();
        boolean boolean27 = stackTestDriver23.isEmpty();
        java.lang.Object obj28 = stackTestDriver22.push((java.lang.Object) stackTestDriver23);
        java.lang.Object obj29 = stackTestDriver19.push((java.lang.Object) stackTestDriver22);
        java.lang.Object obj30 = stackTestDriver22.pop();
        java.lang.Object obj31 = stackTestDriver16.push(obj30);
        java.lang.Object obj32 = stackTestDriver5.push((java.lang.Object) stackTestDriver16);
        java.lang.Object obj33 = stackTestDriver0.push(obj32);
        java.lang.Class<?> wildcardClass34 = obj33.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test123");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
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
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test124");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = stackTestDriver0.peek();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        int int7 = stackTestDriver6.size();
        stackTestDriver6.clear();
        boolean boolean9 = stackTestDriver6.isEmpty();
        boolean boolean10 = stackTestDriver6.isEmpty();
        java.lang.Object obj11 = stackTestDriver5.push((java.lang.Object) stackTestDriver6);
        java.lang.Object obj12 = stackTestDriver0.push(obj11);
        experiment.util.StackTestDriver stackTestDriver13 = new experiment.util.StackTestDriver();
        java.lang.Object obj15 = stackTestDriver13.push((java.lang.Object) (byte) -1);
        java.lang.Object obj16 = stackTestDriver13.peek();
        java.lang.Object obj17 = stackTestDriver13.peek();
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        java.lang.Object obj19 = stackTestDriver0.push(obj17);
        experiment.util.StackTestDriver stackTestDriver20 = new experiment.util.StackTestDriver();
        int int21 = stackTestDriver20.size();
        boolean boolean22 = stackTestDriver20.isEmpty();
        experiment.util.StackTestDriver stackTestDriver23 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver24 = new experiment.util.StackTestDriver();
        int int25 = stackTestDriver24.size();
        stackTestDriver24.clear();
        boolean boolean27 = stackTestDriver24.isEmpty();
        boolean boolean28 = stackTestDriver24.isEmpty();
        java.lang.Object obj29 = stackTestDriver23.push((java.lang.Object) stackTestDriver24);
        java.lang.Object obj30 = stackTestDriver20.push((java.lang.Object) stackTestDriver23);
        java.lang.Object obj31 = stackTestDriver0.push(obj30);
        experiment.util.StackTestDriver stackTestDriver32 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver33 = new experiment.util.StackTestDriver();
        int int34 = stackTestDriver33.size();
        stackTestDriver33.clear();
        boolean boolean36 = stackTestDriver33.isEmpty();
        boolean boolean37 = stackTestDriver33.isEmpty();
        java.lang.Object obj38 = stackTestDriver32.push((java.lang.Object) stackTestDriver33);
        java.lang.Object obj39 = stackTestDriver0.push((java.lang.Object) stackTestDriver32);
        int int40 = stackTestDriver32.size();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) -1 + "'", obj3, (byte) -1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (byte) -1 + "'", obj15, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (byte) -1 + "'", obj16, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) -1 + "'", obj17, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (byte) -1 + "'", obj19, (byte) -1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test125");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = stackTestDriver0.peek();
        java.lang.Object obj4 = stackTestDriver0.peek();
        stackTestDriver0.clear();
        int int6 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver7 = new experiment.util.StackTestDriver();
        java.lang.Object obj9 = stackTestDriver7.push((java.lang.Object) (byte) -1);
        java.lang.Object obj10 = stackTestDriver7.peek();
        stackTestDriver7.clear();
        experiment.util.StackTestDriver stackTestDriver12 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver13 = new experiment.util.StackTestDriver();
        int int14 = stackTestDriver13.size();
        stackTestDriver13.clear();
        boolean boolean16 = stackTestDriver13.isEmpty();
        boolean boolean17 = stackTestDriver13.isEmpty();
        java.lang.Object obj18 = stackTestDriver12.push((java.lang.Object) stackTestDriver13);
        java.lang.Object obj19 = stackTestDriver7.push(obj18);
        experiment.util.StackTestDriver stackTestDriver20 = new experiment.util.StackTestDriver();
        java.lang.Object obj22 = stackTestDriver20.push((java.lang.Object) (byte) -1);
        java.lang.Object obj23 = stackTestDriver20.peek();
        java.lang.Object obj24 = stackTestDriver20.peek();
        java.lang.Class<?> wildcardClass25 = obj24.getClass();
        java.lang.Object obj26 = stackTestDriver7.push(obj24);
        experiment.util.StackTestDriver stackTestDriver27 = new experiment.util.StackTestDriver();
        int int28 = stackTestDriver27.size();
        boolean boolean29 = stackTestDriver27.isEmpty();
        experiment.util.StackTestDriver stackTestDriver30 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver31 = new experiment.util.StackTestDriver();
        int int32 = stackTestDriver31.size();
        stackTestDriver31.clear();
        boolean boolean34 = stackTestDriver31.isEmpty();
        boolean boolean35 = stackTestDriver31.isEmpty();
        java.lang.Object obj36 = stackTestDriver30.push((java.lang.Object) stackTestDriver31);
        java.lang.Object obj37 = stackTestDriver27.push((java.lang.Object) stackTestDriver30);
        java.lang.Object obj38 = stackTestDriver7.push(obj37);
        experiment.util.StackTestDriver stackTestDriver39 = new experiment.util.StackTestDriver();
        int int40 = stackTestDriver39.size();
        boolean boolean41 = stackTestDriver39.isEmpty();
        experiment.util.StackTestDriver stackTestDriver42 = new experiment.util.StackTestDriver();
        int int43 = stackTestDriver42.size();
        boolean boolean44 = stackTestDriver42.isEmpty();
        experiment.util.StackTestDriver stackTestDriver45 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver46 = new experiment.util.StackTestDriver();
        int int47 = stackTestDriver46.size();
        stackTestDriver46.clear();
        boolean boolean49 = stackTestDriver46.isEmpty();
        boolean boolean50 = stackTestDriver46.isEmpty();
        java.lang.Object obj51 = stackTestDriver45.push((java.lang.Object) stackTestDriver46);
        java.lang.Object obj52 = stackTestDriver42.push((java.lang.Object) stackTestDriver45);
        java.lang.Object obj53 = stackTestDriver45.pop();
        java.lang.Object obj54 = stackTestDriver39.push(obj53);
        java.lang.Object obj55 = stackTestDriver7.push((java.lang.Object) stackTestDriver39);
        java.lang.Class<?> wildcardClass56 = obj55.getClass();
        java.lang.Object obj57 = stackTestDriver0.push((java.lang.Object) wildcardClass56);
        boolean boolean58 = stackTestDriver0.isEmpty();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) -1 + "'", obj3, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) -1 + "'", obj9, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (byte) -1 + "'", obj22, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (byte) -1 + "'", obj23, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (byte) -1 + "'", obj24, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + (byte) -1 + "'", obj26, (byte) -1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(obj51);
        org.junit.Assert.assertNotNull(obj52);
        org.junit.Assert.assertNotNull(obj53);
        org.junit.Assert.assertNotNull(obj54);
        org.junit.Assert.assertNotNull(obj55);
        org.junit.Assert.assertNotNull(wildcardClass56);
        org.junit.Assert.assertNotNull(obj57);
        org.junit.Assert.assertEquals(obj57.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj57), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj57), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test126");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        int int4 = stackTestDriver0.size();
        boolean boolean5 = stackTestDriver0.isEmpty();
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) (short) -1);
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (short) -1 + "'", obj7, (short) -1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test127");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) false);
        int int6 = stackTestDriver0.size();
        java.lang.Object obj7 = stackTestDriver0.peek();
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) 3);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + false + "'", obj5, false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + false + "'", obj7, false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 3 + "'", obj9, 3);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test128");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test129");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (-1L));
        java.lang.Object obj6 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver7 = new experiment.util.StackTestDriver();
        int int8 = stackTestDriver7.size();
        stackTestDriver7.clear();
        boolean boolean10 = stackTestDriver7.isEmpty();
        java.lang.Object obj12 = stackTestDriver7.push((java.lang.Object) false);
        stackTestDriver7.clear();
        java.lang.Object obj15 = stackTestDriver7.push((java.lang.Object) (short) -1);
        java.lang.Object obj16 = stackTestDriver0.push(obj15);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1L) + "'", obj5, (-1L));
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1L) + "'", obj6, (-1L));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + false + "'", obj12, false);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (short) -1 + "'", obj15, (short) -1);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (short) -1 + "'", obj16, (short) -1);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test130");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
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
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test131");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        int int3 = stackTestDriver0.size();
        boolean boolean4 = stackTestDriver0.isEmpty();
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
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test132");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = stackTestDriver0.peek();
        java.lang.Object obj4 = stackTestDriver0.peek();
        stackTestDriver0.clear();
        int int6 = stackTestDriver0.size();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        stackTestDriver8.clear();
        java.lang.Class<?> wildcardClass10 = stackTestDriver8.getClass();
        java.lang.Object obj11 = stackTestDriver0.push((java.lang.Object) stackTestDriver8);
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) -1 + "'", obj3, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test133");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        int int4 = stackTestDriver0.size();
        boolean boolean5 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test134");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        int int4 = stackTestDriver0.size();
        java.lang.Class<?> wildcardClass5 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test135");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver1 = new experiment.util.StackTestDriver();
        int int2 = stackTestDriver1.size();
        stackTestDriver1.clear();
        boolean boolean4 = stackTestDriver1.isEmpty();
        boolean boolean5 = stackTestDriver1.isEmpty();
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) stackTestDriver1);
        stackTestDriver1.clear();
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        java.lang.Object obj10 = stackTestDriver8.push((java.lang.Object) (byte) -1);
        java.lang.Object obj11 = stackTestDriver8.peek();
        java.lang.Object obj12 = stackTestDriver8.peek();
        stackTestDriver8.clear();
        boolean boolean14 = stackTestDriver8.isEmpty();
        java.lang.Object obj15 = stackTestDriver1.push((java.lang.Object) stackTestDriver8);
        stackTestDriver8.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = stackTestDriver8.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) -1 + "'", obj11, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) -1 + "'", obj12, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test136");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver3 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        stackTestDriver4.clear();
        boolean boolean7 = stackTestDriver4.isEmpty();
        boolean boolean8 = stackTestDriver4.isEmpty();
        java.lang.Object obj9 = stackTestDriver3.push((java.lang.Object) stackTestDriver4);
        java.lang.Object obj10 = stackTestDriver0.push((java.lang.Object) stackTestDriver3);
        experiment.util.StackTestDriver stackTestDriver11 = new experiment.util.StackTestDriver();
        int int12 = stackTestDriver11.size();
        boolean boolean13 = stackTestDriver11.isEmpty();
        experiment.util.StackTestDriver stackTestDriver14 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        int int16 = stackTestDriver15.size();
        stackTestDriver15.clear();
        boolean boolean18 = stackTestDriver15.isEmpty();
        boolean boolean19 = stackTestDriver15.isEmpty();
        java.lang.Object obj20 = stackTestDriver14.push((java.lang.Object) stackTestDriver15);
        java.lang.Object obj21 = stackTestDriver11.push((java.lang.Object) stackTestDriver14);
        java.lang.Object obj23 = stackTestDriver11.push((java.lang.Object) ' ');
        int int24 = stackTestDriver11.size();
        java.lang.Class<?> wildcardClass25 = stackTestDriver11.getClass();
        java.lang.Object obj26 = stackTestDriver3.push((java.lang.Object) stackTestDriver11);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + ' ' + "'", obj23, ' ');
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(obj26);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test137");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver1 = new experiment.util.StackTestDriver();
        int int2 = stackTestDriver1.size();
        stackTestDriver1.clear();
        boolean boolean4 = stackTestDriver1.isEmpty();
        boolean boolean5 = stackTestDriver1.isEmpty();
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) stackTestDriver1);
        stackTestDriver1.clear();
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        java.lang.Object obj10 = stackTestDriver8.push((java.lang.Object) (byte) -1);
        java.lang.Object obj11 = stackTestDriver8.peek();
        java.lang.Object obj12 = stackTestDriver8.peek();
        stackTestDriver8.clear();
        boolean boolean14 = stackTestDriver8.isEmpty();
        java.lang.Object obj15 = stackTestDriver1.push((java.lang.Object) stackTestDriver8);
        java.lang.Class<?> wildcardClass16 = stackTestDriver8.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) -1 + "'", obj11, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) -1 + "'", obj12, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test138");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver1 = new experiment.util.StackTestDriver();
        int int2 = stackTestDriver1.size();
        stackTestDriver1.clear();
        boolean boolean4 = stackTestDriver1.isEmpty();
        boolean boolean5 = stackTestDriver1.isEmpty();
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) stackTestDriver1);
        java.lang.Object obj7 = stackTestDriver0.peek();
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        int int9 = stackTestDriver8.size();
        stackTestDriver8.clear();
        boolean boolean11 = stackTestDriver8.isEmpty();
        java.lang.Object obj13 = stackTestDriver8.push((java.lang.Object) (-1L));
        java.lang.Object obj14 = stackTestDriver0.push(obj13);
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        java.lang.Object obj17 = stackTestDriver15.push((java.lang.Object) (byte) -1);
        java.lang.Object obj18 = stackTestDriver15.peek();
        boolean boolean19 = stackTestDriver15.isEmpty();
        java.lang.Object obj20 = stackTestDriver0.push((java.lang.Object) stackTestDriver15);
        java.lang.Object obj21 = stackTestDriver0.peek();
        java.lang.Object obj23 = stackTestDriver0.push((java.lang.Object) false);
        java.lang.Object obj24 = stackTestDriver0.peek();
        boolean boolean25 = stackTestDriver0.isEmpty();
        boolean boolean26 = stackTestDriver0.isEmpty();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (-1L) + "'", obj13, (-1L));
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1L) + "'", obj14, (-1L));
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) -1 + "'", obj17, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (byte) -1 + "'", obj18, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + false + "'", obj23, false);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + false + "'", obj24, false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test139");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = stackTestDriver0.peek();
        int int4 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        int int6 = stackTestDriver5.size();
        stackTestDriver5.clear();
        boolean boolean8 = stackTestDriver5.isEmpty();
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) boolean8);
        boolean boolean10 = stackTestDriver0.isEmpty();
        boolean boolean11 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver12 = new experiment.util.StackTestDriver();
        int int13 = stackTestDriver12.size();
        boolean boolean14 = stackTestDriver12.isEmpty();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver16 = new experiment.util.StackTestDriver();
        int int17 = stackTestDriver16.size();
        stackTestDriver16.clear();
        boolean boolean19 = stackTestDriver16.isEmpty();
        boolean boolean20 = stackTestDriver16.isEmpty();
        java.lang.Object obj21 = stackTestDriver15.push((java.lang.Object) stackTestDriver16);
        java.lang.Object obj22 = stackTestDriver12.push((java.lang.Object) stackTestDriver15);
        java.lang.Object obj23 = stackTestDriver15.pop();
        experiment.util.StackTestDriver stackTestDriver24 = new experiment.util.StackTestDriver();
        int int25 = stackTestDriver24.size();
        stackTestDriver24.clear();
        boolean boolean27 = stackTestDriver24.isEmpty();
        java.lang.Object obj29 = stackTestDriver24.push((java.lang.Object) false);
        java.lang.Object obj30 = stackTestDriver15.push((java.lang.Object) false);
        java.lang.Object obj31 = stackTestDriver0.push((java.lang.Object) stackTestDriver15);
        java.lang.Class<?> wildcardClass32 = stackTestDriver15.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) -1 + "'", obj3, (byte) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + true + "'", obj9, true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + false + "'", obj29, false);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + false + "'", obj30, false);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test140");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        stackTestDriver0.clear();
        int int6 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver7 = new experiment.util.StackTestDriver();
        java.lang.Object obj9 = stackTestDriver7.push((java.lang.Object) (byte) -1);
        java.lang.Object obj10 = stackTestDriver7.peek();
        int int11 = stackTestDriver7.size();
        experiment.util.StackTestDriver stackTestDriver12 = new experiment.util.StackTestDriver();
        int int13 = stackTestDriver12.size();
        stackTestDriver12.clear();
        boolean boolean15 = stackTestDriver12.isEmpty();
        java.lang.Object obj16 = stackTestDriver7.push((java.lang.Object) boolean15);
        boolean boolean17 = stackTestDriver7.isEmpty();
        boolean boolean18 = stackTestDriver7.isEmpty();
        experiment.util.StackTestDriver stackTestDriver19 = new experiment.util.StackTestDriver();
        java.lang.Object obj21 = stackTestDriver19.push((java.lang.Object) (byte) -1);
        java.lang.Object obj22 = stackTestDriver19.peek();
        stackTestDriver19.clear();
        java.lang.Class<?> wildcardClass24 = stackTestDriver19.getClass();
        java.lang.Object obj25 = stackTestDriver7.push((java.lang.Object) wildcardClass24);
        java.lang.Object obj26 = stackTestDriver0.push((java.lang.Object) stackTestDriver7);
        java.lang.Class<?> wildcardClass27 = stackTestDriver7.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) -1 + "'", obj9, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + true + "'", obj16, true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (byte) -1 + "'", obj21, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (byte) -1 + "'", obj22, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertEquals(obj25.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj25), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj25), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test141");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver1 = new experiment.util.StackTestDriver();
        int int2 = stackTestDriver1.size();
        stackTestDriver1.clear();
        boolean boolean4 = stackTestDriver1.isEmpty();
        boolean boolean5 = stackTestDriver1.isEmpty();
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) stackTestDriver1);
        stackTestDriver1.clear();
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        java.lang.Object obj10 = stackTestDriver8.push((java.lang.Object) (byte) -1);
        java.lang.Object obj11 = stackTestDriver8.peek();
        java.lang.Object obj12 = stackTestDriver8.peek();
        stackTestDriver8.clear();
        boolean boolean14 = stackTestDriver8.isEmpty();
        java.lang.Object obj15 = stackTestDriver1.push((java.lang.Object) stackTestDriver8);
        stackTestDriver1.clear();
        int int17 = stackTestDriver1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) -1 + "'", obj11, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) -1 + "'", obj12, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test142");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver1 = new experiment.util.StackTestDriver();
        int int2 = stackTestDriver1.size();
        stackTestDriver1.clear();
        boolean boolean4 = stackTestDriver1.isEmpty();
        boolean boolean5 = stackTestDriver1.isEmpty();
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) stackTestDriver1);
        java.lang.Object obj7 = stackTestDriver0.peek();
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        int int9 = stackTestDriver8.size();
        stackTestDriver8.clear();
        boolean boolean11 = stackTestDriver8.isEmpty();
        java.lang.Object obj13 = stackTestDriver8.push((java.lang.Object) (-1L));
        java.lang.Object obj14 = stackTestDriver0.push(obj13);
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        java.lang.Object obj17 = stackTestDriver15.push((java.lang.Object) (byte) -1);
        java.lang.Object obj18 = stackTestDriver15.peek();
        boolean boolean19 = stackTestDriver15.isEmpty();
        java.lang.Object obj20 = stackTestDriver0.push((java.lang.Object) stackTestDriver15);
        stackTestDriver15.clear();
        stackTestDriver15.clear();
        java.lang.Object obj24 = stackTestDriver15.push((java.lang.Object) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (-1L) + "'", obj13, (-1L));
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1L) + "'", obj14, (-1L));
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) -1 + "'", obj17, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (byte) -1 + "'", obj18, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (byte) 0 + "'", obj24, (byte) 0);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test143");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = stackTestDriver0.peek();
        java.lang.Object obj4 = stackTestDriver0.peek();
        java.lang.Object obj5 = stackTestDriver0.pop();
        int int6 = stackTestDriver0.size();
        int int7 = stackTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) -1 + "'", obj3, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) -1 + "'", obj5, (byte) -1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test144");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver1 = new experiment.util.StackTestDriver();
        int int2 = stackTestDriver1.size();
        stackTestDriver1.clear();
        boolean boolean4 = stackTestDriver1.isEmpty();
        int int5 = stackTestDriver1.size();
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) int5);
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        int int9 = stackTestDriver8.size();
        stackTestDriver8.clear();
        boolean boolean11 = stackTestDriver8.isEmpty();
        java.lang.Object obj13 = stackTestDriver8.push((java.lang.Object) false);
        stackTestDriver8.clear();
        boolean boolean15 = stackTestDriver8.isEmpty();
        int int16 = stackTestDriver8.size();
        java.lang.Class<?> wildcardClass17 = stackTestDriver8.getClass();
        java.lang.Object obj18 = stackTestDriver0.push((java.lang.Object) stackTestDriver8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = stackTestDriver8.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0 + "'", obj6, 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + false + "'", obj13, false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(obj18);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test145");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = stackTestDriver0.peek();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        int int7 = stackTestDriver6.size();
        stackTestDriver6.clear();
        boolean boolean9 = stackTestDriver6.isEmpty();
        boolean boolean10 = stackTestDriver6.isEmpty();
        java.lang.Object obj11 = stackTestDriver5.push((java.lang.Object) stackTestDriver6);
        java.lang.Object obj12 = stackTestDriver0.push(obj11);
        experiment.util.StackTestDriver stackTestDriver13 = new experiment.util.StackTestDriver();
        java.lang.Object obj15 = stackTestDriver13.push((java.lang.Object) (byte) -1);
        java.lang.Object obj16 = stackTestDriver13.peek();
        java.lang.Object obj17 = stackTestDriver13.peek();
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        java.lang.Object obj19 = stackTestDriver0.push(obj17);
        experiment.util.StackTestDriver stackTestDriver20 = new experiment.util.StackTestDriver();
        int int21 = stackTestDriver20.size();
        boolean boolean22 = stackTestDriver20.isEmpty();
        experiment.util.StackTestDriver stackTestDriver23 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver24 = new experiment.util.StackTestDriver();
        int int25 = stackTestDriver24.size();
        stackTestDriver24.clear();
        boolean boolean27 = stackTestDriver24.isEmpty();
        boolean boolean28 = stackTestDriver24.isEmpty();
        java.lang.Object obj29 = stackTestDriver23.push((java.lang.Object) stackTestDriver24);
        java.lang.Object obj30 = stackTestDriver20.push((java.lang.Object) stackTestDriver23);
        java.lang.Object obj31 = stackTestDriver0.push(obj30);
        experiment.util.StackTestDriver stackTestDriver32 = new experiment.util.StackTestDriver();
        int int33 = stackTestDriver32.size();
        boolean boolean34 = stackTestDriver32.isEmpty();
        experiment.util.StackTestDriver stackTestDriver35 = new experiment.util.StackTestDriver();
        int int36 = stackTestDriver35.size();
        boolean boolean37 = stackTestDriver35.isEmpty();
        experiment.util.StackTestDriver stackTestDriver38 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver39 = new experiment.util.StackTestDriver();
        int int40 = stackTestDriver39.size();
        stackTestDriver39.clear();
        boolean boolean42 = stackTestDriver39.isEmpty();
        boolean boolean43 = stackTestDriver39.isEmpty();
        java.lang.Object obj44 = stackTestDriver38.push((java.lang.Object) stackTestDriver39);
        java.lang.Object obj45 = stackTestDriver35.push((java.lang.Object) stackTestDriver38);
        java.lang.Object obj46 = stackTestDriver38.pop();
        java.lang.Object obj47 = stackTestDriver32.push(obj46);
        java.lang.Object obj48 = stackTestDriver0.push((java.lang.Object) stackTestDriver32);
        experiment.util.StackTestDriver stackTestDriver49 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver50 = new experiment.util.StackTestDriver();
        int int51 = stackTestDriver50.size();
        stackTestDriver50.clear();
        boolean boolean53 = stackTestDriver50.isEmpty();
        boolean boolean54 = stackTestDriver50.isEmpty();
        java.lang.Object obj55 = stackTestDriver49.push((java.lang.Object) stackTestDriver50);
        boolean boolean56 = stackTestDriver49.isEmpty();
        java.lang.Object obj57 = stackTestDriver49.peek();
        java.lang.Object obj58 = stackTestDriver32.push(obj57);
        java.lang.Class<?> wildcardClass59 = stackTestDriver32.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) -1 + "'", obj3, (byte) -1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (byte) -1 + "'", obj15, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (byte) -1 + "'", obj16, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) -1 + "'", obj17, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (byte) -1 + "'", obj19, (byte) -1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(obj55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(obj57);
        org.junit.Assert.assertNotNull(obj58);
        org.junit.Assert.assertNotNull(wildcardClass59);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test146");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = stackTestDriver0.peek();
        int int4 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        int int6 = stackTestDriver5.size();
        stackTestDriver5.clear();
        boolean boolean8 = stackTestDriver5.isEmpty();
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) boolean8);
        boolean boolean10 = stackTestDriver0.isEmpty();
        boolean boolean11 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver12 = new experiment.util.StackTestDriver();
        int int13 = stackTestDriver12.size();
        boolean boolean14 = stackTestDriver12.isEmpty();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver16 = new experiment.util.StackTestDriver();
        int int17 = stackTestDriver16.size();
        stackTestDriver16.clear();
        boolean boolean19 = stackTestDriver16.isEmpty();
        boolean boolean20 = stackTestDriver16.isEmpty();
        java.lang.Object obj21 = stackTestDriver15.push((java.lang.Object) stackTestDriver16);
        java.lang.Object obj22 = stackTestDriver12.push((java.lang.Object) stackTestDriver15);
        java.lang.Object obj23 = stackTestDriver15.pop();
        experiment.util.StackTestDriver stackTestDriver24 = new experiment.util.StackTestDriver();
        int int25 = stackTestDriver24.size();
        stackTestDriver24.clear();
        boolean boolean27 = stackTestDriver24.isEmpty();
        java.lang.Object obj29 = stackTestDriver24.push((java.lang.Object) false);
        java.lang.Object obj30 = stackTestDriver15.push((java.lang.Object) false);
        java.lang.Object obj31 = stackTestDriver0.push((java.lang.Object) stackTestDriver15);
        stackTestDriver0.clear();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) -1 + "'", obj3, (byte) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + true + "'", obj9, true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + false + "'", obj29, false);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + false + "'", obj30, false);
        org.junit.Assert.assertNotNull(obj31);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test147");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test148");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = stackTestDriver0.peek();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        java.lang.Object obj6 = stackTestDriver4.push((java.lang.Object) (byte) -1);
        java.lang.Object obj7 = stackTestDriver4.peek();
        java.lang.Object obj8 = stackTestDriver4.peek();
        java.lang.Object obj9 = stackTestDriver4.peek();
        java.lang.Object obj10 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        boolean boolean11 = stackTestDriver4.isEmpty();
        boolean boolean12 = stackTestDriver4.isEmpty();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) -1 + "'", obj3, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) -1 + "'", obj6, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) -1 + "'", obj8, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) -1 + "'", obj9, (byte) -1);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test149");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver3 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        stackTestDriver4.clear();
        boolean boolean7 = stackTestDriver4.isEmpty();
        boolean boolean8 = stackTestDriver4.isEmpty();
        java.lang.Object obj9 = stackTestDriver3.push((java.lang.Object) stackTestDriver4);
        java.lang.Object obj10 = stackTestDriver0.push((java.lang.Object) stackTestDriver3);
        java.lang.Object obj12 = stackTestDriver0.push((java.lang.Object) ' ');
        int int13 = stackTestDriver0.size();
        java.lang.Object obj14 = stackTestDriver0.peek();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver16 = new experiment.util.StackTestDriver();
        java.lang.Object obj18 = stackTestDriver16.push((java.lang.Object) (byte) -1);
        java.lang.Object obj19 = stackTestDriver16.peek();
        java.lang.Object obj20 = stackTestDriver16.peek();
        stackTestDriver16.clear();
        stackTestDriver16.clear();
        java.lang.Object obj23 = stackTestDriver0.push((java.lang.Object) stackTestDriver16);
        int int24 = stackTestDriver16.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = stackTestDriver16.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + ' ' + "'", obj12, ' ');
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + ' ' + "'", obj14, ' ');
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (byte) -1 + "'", obj18, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (byte) -1 + "'", obj19, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (byte) -1 + "'", obj20, (byte) -1);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test150");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = stackTestDriver0.peek();
        boolean boolean4 = stackTestDriver0.isEmpty();
        int int5 = stackTestDriver0.size();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) -1 + "'", obj3, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test151");
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
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test152");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) false);
        stackTestDriver0.clear();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) (short) -1);
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        java.lang.Object obj12 = stackTestDriver10.push((java.lang.Object) (byte) -1);
        java.lang.Object obj13 = stackTestDriver10.peek();
        java.lang.Object obj14 = stackTestDriver10.peek();
        stackTestDriver10.clear();
        java.lang.Class<?> wildcardClass16 = stackTestDriver10.getClass();
        java.lang.Object obj17 = stackTestDriver0.push((java.lang.Object) wildcardClass16);
        java.lang.Class<?> wildcardClass18 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + false + "'", obj5, false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (short) -1 + "'", obj8, (short) -1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) -1 + "'", obj12, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (byte) -1 + "'", obj13, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (byte) -1 + "'", obj14, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test153");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        int int4 = stackTestDriver0.size();
        boolean boolean5 = stackTestDriver0.isEmpty();
        boolean boolean6 = stackTestDriver0.isEmpty();
        int int7 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        int int9 = stackTestDriver8.size();
        boolean boolean10 = stackTestDriver8.isEmpty();
        experiment.util.StackTestDriver stackTestDriver11 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver12 = new experiment.util.StackTestDriver();
        int int13 = stackTestDriver12.size();
        stackTestDriver12.clear();
        boolean boolean15 = stackTestDriver12.isEmpty();
        boolean boolean16 = stackTestDriver12.isEmpty();
        java.lang.Object obj17 = stackTestDriver11.push((java.lang.Object) stackTestDriver12);
        java.lang.Object obj18 = stackTestDriver8.push((java.lang.Object) stackTestDriver11);
        java.lang.Class<?> wildcardClass19 = stackTestDriver11.getClass();
        java.lang.Object obj20 = stackTestDriver0.push((java.lang.Object) stackTestDriver11);
        java.lang.Class<?> wildcardClass21 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test154");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = stackTestDriver0.peek();
        java.lang.Object obj4 = stackTestDriver0.peek();
        stackTestDriver0.clear();
        boolean boolean6 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        boolean boolean8 = stackTestDriver0.isEmpty();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) -1 + "'", obj3, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test155");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        int int3 = stackTestDriver0.size();
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test156");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        int int4 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        int int6 = stackTestDriver5.size();
        boolean boolean7 = stackTestDriver5.isEmpty();
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver9 = new experiment.util.StackTestDriver();
        int int10 = stackTestDriver9.size();
        stackTestDriver9.clear();
        boolean boolean12 = stackTestDriver9.isEmpty();
        boolean boolean13 = stackTestDriver9.isEmpty();
        java.lang.Object obj14 = stackTestDriver8.push((java.lang.Object) stackTestDriver9);
        java.lang.Object obj15 = stackTestDriver5.push((java.lang.Object) stackTestDriver8);
        java.lang.Object obj16 = stackTestDriver0.push((java.lang.Object) stackTestDriver8);
        java.lang.Object obj17 = stackTestDriver0.pop();
        int int18 = stackTestDriver0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test157");
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
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test158");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = stackTestDriver0.peek();
        int int4 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        int int7 = stackTestDriver6.size();
        stackTestDriver6.clear();
        boolean boolean9 = stackTestDriver6.isEmpty();
        int int10 = stackTestDriver6.size();
        java.lang.Object obj11 = stackTestDriver5.push((java.lang.Object) int10);
        java.lang.Object obj12 = stackTestDriver0.push(obj11);
        java.lang.Object obj13 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver14 = new experiment.util.StackTestDriver();
        int int15 = stackTestDriver14.size();
        boolean boolean16 = stackTestDriver14.isEmpty();
        experiment.util.StackTestDriver stackTestDriver17 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver18 = new experiment.util.StackTestDriver();
        int int19 = stackTestDriver18.size();
        stackTestDriver18.clear();
        boolean boolean21 = stackTestDriver18.isEmpty();
        boolean boolean22 = stackTestDriver18.isEmpty();
        java.lang.Object obj23 = stackTestDriver17.push((java.lang.Object) stackTestDriver18);
        java.lang.Object obj24 = stackTestDriver14.push((java.lang.Object) stackTestDriver17);
        stackTestDriver14.clear();
        java.lang.Object obj26 = stackTestDriver0.push((java.lang.Object) stackTestDriver14);
        java.lang.Object obj27 = stackTestDriver0.peek();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) -1 + "'", obj3, (byte) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 0 + "'", obj11, 0);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 0 + "'", obj12, 0);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 0 + "'", obj13, 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNotNull(obj27);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test159");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver1 = new experiment.util.StackTestDriver();
        int int2 = stackTestDriver1.size();
        stackTestDriver1.clear();
        boolean boolean4 = stackTestDriver1.isEmpty();
        int int5 = stackTestDriver1.size();
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) int5);
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        boolean boolean9 = stackTestDriver0.isEmpty();
        boolean boolean10 = stackTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0 + "'", obj6, 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test160");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        int int4 = stackTestDriver0.size();
        boolean boolean5 = stackTestDriver0.isEmpty();
        boolean boolean6 = stackTestDriver0.isEmpty();
        int int7 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        int int9 = stackTestDriver8.size();
        boolean boolean10 = stackTestDriver8.isEmpty();
        experiment.util.StackTestDriver stackTestDriver11 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver12 = new experiment.util.StackTestDriver();
        int int13 = stackTestDriver12.size();
        stackTestDriver12.clear();
        boolean boolean15 = stackTestDriver12.isEmpty();
        boolean boolean16 = stackTestDriver12.isEmpty();
        java.lang.Object obj17 = stackTestDriver11.push((java.lang.Object) stackTestDriver12);
        java.lang.Object obj18 = stackTestDriver8.push((java.lang.Object) stackTestDriver11);
        java.lang.Class<?> wildcardClass19 = stackTestDriver11.getClass();
        java.lang.Object obj20 = stackTestDriver0.push((java.lang.Object) stackTestDriver11);
        int int21 = stackTestDriver11.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test161");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) 1.0f);
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        stackTestDriver5.clear();
        int int7 = stackTestDriver5.size();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        boolean boolean9 = stackTestDriver5.isEmpty();
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        java.lang.Object obj12 = stackTestDriver10.push((java.lang.Object) (byte) -1);
        java.lang.Object obj13 = stackTestDriver10.peek();
        stackTestDriver10.clear();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver16 = new experiment.util.StackTestDriver();
        int int17 = stackTestDriver16.size();
        stackTestDriver16.clear();
        boolean boolean19 = stackTestDriver16.isEmpty();
        boolean boolean20 = stackTestDriver16.isEmpty();
        java.lang.Object obj21 = stackTestDriver15.push((java.lang.Object) stackTestDriver16);
        java.lang.Object obj22 = stackTestDriver10.push(obj21);
        experiment.util.StackTestDriver stackTestDriver23 = new experiment.util.StackTestDriver();
        java.lang.Object obj25 = stackTestDriver23.push((java.lang.Object) (byte) -1);
        java.lang.Object obj26 = stackTestDriver23.peek();
        java.lang.Object obj27 = stackTestDriver23.peek();
        java.lang.Class<?> wildcardClass28 = obj27.getClass();
        java.lang.Object obj29 = stackTestDriver10.push(obj27);
        experiment.util.StackTestDriver stackTestDriver30 = new experiment.util.StackTestDriver();
        int int31 = stackTestDriver30.size();
        boolean boolean32 = stackTestDriver30.isEmpty();
        experiment.util.StackTestDriver stackTestDriver33 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver34 = new experiment.util.StackTestDriver();
        int int35 = stackTestDriver34.size();
        stackTestDriver34.clear();
        boolean boolean37 = stackTestDriver34.isEmpty();
        boolean boolean38 = stackTestDriver34.isEmpty();
        java.lang.Object obj39 = stackTestDriver33.push((java.lang.Object) stackTestDriver34);
        java.lang.Object obj40 = stackTestDriver30.push((java.lang.Object) stackTestDriver33);
        java.lang.Object obj41 = stackTestDriver10.push(obj40);
        experiment.util.StackTestDriver stackTestDriver42 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver43 = new experiment.util.StackTestDriver();
        int int44 = stackTestDriver43.size();
        stackTestDriver43.clear();
        boolean boolean46 = stackTestDriver43.isEmpty();
        boolean boolean47 = stackTestDriver43.isEmpty();
        java.lang.Object obj48 = stackTestDriver42.push((java.lang.Object) stackTestDriver43);
        java.lang.Object obj49 = stackTestDriver10.push((java.lang.Object) stackTestDriver42);
        java.lang.Object obj50 = stackTestDriver42.peek();
        stackTestDriver42.clear();
        experiment.util.StackTestDriver stackTestDriver52 = new experiment.util.StackTestDriver();
        java.lang.Object obj54 = stackTestDriver52.push((java.lang.Object) (byte) -1);
        java.lang.Object obj55 = stackTestDriver52.peek();
        int int56 = stackTestDriver52.size();
        experiment.util.StackTestDriver stackTestDriver57 = new experiment.util.StackTestDriver();
        int int58 = stackTestDriver57.size();
        stackTestDriver57.clear();
        boolean boolean60 = stackTestDriver57.isEmpty();
        java.lang.Object obj61 = stackTestDriver52.push((java.lang.Object) boolean60);
        boolean boolean62 = stackTestDriver52.isEmpty();
        boolean boolean63 = stackTestDriver52.isEmpty();
        experiment.util.StackTestDriver stackTestDriver64 = new experiment.util.StackTestDriver();
        java.lang.Object obj66 = stackTestDriver64.push((java.lang.Object) (byte) -1);
        java.lang.Object obj67 = stackTestDriver64.peek();
        stackTestDriver64.clear();
        java.lang.Class<?> wildcardClass69 = stackTestDriver64.getClass();
        java.lang.Object obj70 = stackTestDriver52.push((java.lang.Object) wildcardClass69);
        java.lang.Object obj71 = stackTestDriver42.push(obj70);
        java.lang.Object obj72 = stackTestDriver5.push((java.lang.Object) stackTestDriver42);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 1.0f + "'", obj4, 1.0f);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) -1 + "'", obj12, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (byte) -1 + "'", obj13, (byte) -1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (byte) -1 + "'", obj25, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + (byte) -1 + "'", obj26, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + (byte) -1 + "'", obj27, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + (byte) -1 + "'", obj29, (byte) -1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertNotNull(obj50);
        org.junit.Assert.assertEquals("'" + obj54 + "' != '" + (byte) -1 + "'", obj54, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj55 + "' != '" + (byte) -1 + "'", obj55, (byte) -1);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertEquals("'" + obj61 + "' != '" + true + "'", obj61, true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertEquals("'" + obj66 + "' != '" + (byte) -1 + "'", obj66, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj67 + "' != '" + (byte) -1 + "'", obj67, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass69);
        org.junit.Assert.assertNotNull(obj70);
        org.junit.Assert.assertEquals(obj70.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj70), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj70), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertNotNull(obj71);
        org.junit.Assert.assertEquals(obj71.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj71), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj71), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertNotNull(obj72);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test162");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver3 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        stackTestDriver4.clear();
        boolean boolean7 = stackTestDriver4.isEmpty();
        boolean boolean8 = stackTestDriver4.isEmpty();
        java.lang.Object obj9 = stackTestDriver3.push((java.lang.Object) stackTestDriver4);
        java.lang.Object obj10 = stackTestDriver0.push((java.lang.Object) stackTestDriver3);
        java.lang.Object obj12 = stackTestDriver0.push((java.lang.Object) ' ');
        int int13 = stackTestDriver0.size();
        java.lang.Object obj14 = stackTestDriver0.peek();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver16 = new experiment.util.StackTestDriver();
        java.lang.Object obj18 = stackTestDriver16.push((java.lang.Object) (byte) -1);
        java.lang.Object obj19 = stackTestDriver16.peek();
        java.lang.Object obj20 = stackTestDriver16.peek();
        stackTestDriver16.clear();
        stackTestDriver16.clear();
        java.lang.Object obj23 = stackTestDriver0.push((java.lang.Object) stackTestDriver16);
        java.lang.Class<?> wildcardClass24 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + ' ' + "'", obj12, ' ');
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + ' ' + "'", obj14, ' ');
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (byte) -1 + "'", obj18, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (byte) -1 + "'", obj19, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (byte) -1 + "'", obj20, (byte) -1);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test163");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        int int3 = stackTestDriver0.size();
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
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test164");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        int int3 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        stackTestDriver4.clear();
        boolean boolean7 = stackTestDriver4.isEmpty();
        java.lang.Object obj9 = stackTestDriver4.push((java.lang.Object) false);
        stackTestDriver4.clear();
        boolean boolean11 = stackTestDriver4.isEmpty();
        int int12 = stackTestDriver4.size();
        boolean boolean13 = stackTestDriver4.isEmpty();
        int int14 = stackTestDriver4.size();
        java.lang.Object obj15 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        experiment.util.StackTestDriver stackTestDriver16 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver17 = new experiment.util.StackTestDriver();
        int int18 = stackTestDriver17.size();
        stackTestDriver17.clear();
        boolean boolean20 = stackTestDriver17.isEmpty();
        boolean boolean21 = stackTestDriver17.isEmpty();
        java.lang.Object obj22 = stackTestDriver16.push((java.lang.Object) stackTestDriver17);
        java.lang.Object obj23 = stackTestDriver16.peek();
        experiment.util.StackTestDriver stackTestDriver24 = new experiment.util.StackTestDriver();
        int int25 = stackTestDriver24.size();
        stackTestDriver24.clear();
        boolean boolean27 = stackTestDriver24.isEmpty();
        java.lang.Object obj29 = stackTestDriver24.push((java.lang.Object) (-1L));
        java.lang.Object obj30 = stackTestDriver16.push(obj29);
        experiment.util.StackTestDriver stackTestDriver31 = new experiment.util.StackTestDriver();
        java.lang.Object obj33 = stackTestDriver31.push((java.lang.Object) (byte) -1);
        java.lang.Object obj34 = stackTestDriver31.peek();
        boolean boolean35 = stackTestDriver31.isEmpty();
        java.lang.Object obj36 = stackTestDriver16.push((java.lang.Object) stackTestDriver31);
        java.lang.Object obj37 = stackTestDriver0.push((java.lang.Object) stackTestDriver31);
        java.lang.Class<?> wildcardClass38 = stackTestDriver31.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + false + "'", obj9, false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + (-1L) + "'", obj29, (-1L));
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + (-1L) + "'", obj30, (-1L));
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + (byte) -1 + "'", obj33, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + (byte) -1 + "'", obj34, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test165");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        int int2 = stackTestDriver0.size();
        java.lang.Class<?> wildcardClass3 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test166");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = stackTestDriver0.peek();
        java.lang.Object obj4 = stackTestDriver0.peek();
        stackTestDriver0.clear();
        int int6 = stackTestDriver0.size();
        java.lang.Class<?> wildcardClass7 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) -1 + "'", obj3, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test167");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) 1.0f);
        java.lang.Object obj5 = stackTestDriver0.peek();
        int int6 = stackTestDriver0.size();
        java.lang.Object obj7 = stackTestDriver0.pop();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 1.0f + "'", obj4, 1.0f);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 1.0f + "'", obj5, 1.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1.0f + "'", obj7, 1.0f);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test168");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        int int3 = stackTestDriver0.size();
        boolean boolean4 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        int int6 = stackTestDriver5.size();
        stackTestDriver5.clear();
        int int8 = stackTestDriver5.size();
        stackTestDriver5.clear();
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        java.lang.Class<?> wildcardClass11 = stackTestDriver10.getClass();
        java.lang.Object obj12 = stackTestDriver5.push((java.lang.Object) wildcardClass11);
        int int13 = stackTestDriver5.size();
        java.lang.Object obj14 = stackTestDriver0.push((java.lang.Object) int13);
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver16 = new experiment.util.StackTestDriver();
        int int17 = stackTestDriver16.size();
        stackTestDriver16.clear();
        boolean boolean19 = stackTestDriver16.isEmpty();
        boolean boolean20 = stackTestDriver16.isEmpty();
        java.lang.Object obj21 = stackTestDriver15.push((java.lang.Object) stackTestDriver16);
        java.lang.Object obj22 = stackTestDriver15.peek();
        experiment.util.StackTestDriver stackTestDriver23 = new experiment.util.StackTestDriver();
        int int24 = stackTestDriver23.size();
        stackTestDriver23.clear();
        boolean boolean26 = stackTestDriver23.isEmpty();
        java.lang.Object obj28 = stackTestDriver23.push((java.lang.Object) (-1L));
        java.lang.Object obj29 = stackTestDriver15.push(obj28);
        experiment.util.StackTestDriver stackTestDriver30 = new experiment.util.StackTestDriver();
        java.lang.Object obj32 = stackTestDriver30.push((java.lang.Object) (byte) -1);
        java.lang.Object obj33 = stackTestDriver30.peek();
        boolean boolean34 = stackTestDriver30.isEmpty();
        java.lang.Object obj35 = stackTestDriver15.push((java.lang.Object) stackTestDriver30);
        java.lang.Object obj36 = stackTestDriver15.peek();
        java.lang.Object obj38 = stackTestDriver15.push((java.lang.Object) false);
        boolean boolean39 = stackTestDriver15.isEmpty();
        java.lang.Object obj40 = stackTestDriver0.push((java.lang.Object) boolean39);
        java.lang.Object obj41 = stackTestDriver0.peek();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 1 + "'", obj14, 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + (-1L) + "'", obj28, (-1L));
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + (-1L) + "'", obj29, (-1L));
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + (byte) -1 + "'", obj32, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + (byte) -1 + "'", obj33, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + false + "'", obj38, false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + false + "'", obj40, false);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + false + "'", obj41, false);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test169");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        int int3 = stackTestDriver0.size();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Class<?> wildcardClass6 = stackTestDriver5.getClass();
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) wildcardClass6);
        int int8 = stackTestDriver0.size();
        java.lang.Object obj9 = stackTestDriver0.peek();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "class experiment.util.StackTestDriver");
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test170");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = stackTestDriver0.peek();
        int int4 = stackTestDriver0.size();
        java.lang.Object obj5 = stackTestDriver0.pop();
        stackTestDriver0.clear();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) -1 + "'", obj3, (byte) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) -1 + "'", obj5, (byte) -1);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test171");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        experiment.util.StackTestDriver stackTestDriver3 = new experiment.util.StackTestDriver();
        java.lang.Object obj5 = stackTestDriver3.push((java.lang.Object) (byte) -1);
        java.lang.Object obj6 = stackTestDriver3.peek();
        java.lang.Object obj7 = stackTestDriver3.peek();
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        java.lang.Object obj9 = stackTestDriver0.push(obj7);
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        int int11 = stackTestDriver10.size();
        boolean boolean12 = stackTestDriver10.isEmpty();
        experiment.util.StackTestDriver stackTestDriver13 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver14 = new experiment.util.StackTestDriver();
        int int15 = stackTestDriver14.size();
        stackTestDriver14.clear();
        boolean boolean17 = stackTestDriver14.isEmpty();
        boolean boolean18 = stackTestDriver14.isEmpty();
        java.lang.Object obj19 = stackTestDriver13.push((java.lang.Object) stackTestDriver14);
        java.lang.Object obj20 = stackTestDriver10.push((java.lang.Object) stackTestDriver13);
        experiment.util.StackTestDriver stackTestDriver21 = new experiment.util.StackTestDriver();
        int int22 = stackTestDriver21.size();
        boolean boolean23 = stackTestDriver21.isEmpty();
        experiment.util.StackTestDriver stackTestDriver24 = new experiment.util.StackTestDriver();
        int int25 = stackTestDriver24.size();
        boolean boolean26 = stackTestDriver24.isEmpty();
        experiment.util.StackTestDriver stackTestDriver27 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver28 = new experiment.util.StackTestDriver();
        int int29 = stackTestDriver28.size();
        stackTestDriver28.clear();
        boolean boolean31 = stackTestDriver28.isEmpty();
        boolean boolean32 = stackTestDriver28.isEmpty();
        java.lang.Object obj33 = stackTestDriver27.push((java.lang.Object) stackTestDriver28);
        java.lang.Object obj34 = stackTestDriver24.push((java.lang.Object) stackTestDriver27);
        java.lang.Object obj35 = stackTestDriver27.pop();
        java.lang.Object obj36 = stackTestDriver21.push(obj35);
        java.lang.Object obj37 = stackTestDriver10.push((java.lang.Object) stackTestDriver21);
        java.lang.Object obj38 = stackTestDriver0.push((java.lang.Object) stackTestDriver21);
        experiment.util.StackTestDriver stackTestDriver39 = new experiment.util.StackTestDriver();
        int int40 = stackTestDriver39.size();
        java.lang.Object obj42 = stackTestDriver39.push((java.lang.Object) (short) 0);
        java.lang.Class<?> wildcardClass43 = obj42.getClass();
        java.lang.Object obj44 = stackTestDriver21.push((java.lang.Object) wildcardClass43);
        stackTestDriver21.clear();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) -1 + "'", obj5, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) -1 + "'", obj6, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) -1 + "'", obj9, (byte) -1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + (short) 0 + "'", obj42, (short) 0);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertEquals(obj44.toString(), "class java.lang.Short");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj44), "class java.lang.Short");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj44), "class java.lang.Short");
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test172");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test173");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        java.lang.Class<?> wildcardClass4 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test174");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        int int6 = stackTestDriver5.size();
        stackTestDriver5.clear();
        boolean boolean8 = stackTestDriver5.isEmpty();
        boolean boolean9 = stackTestDriver5.isEmpty();
        java.lang.Object obj10 = stackTestDriver4.push((java.lang.Object) stackTestDriver5);
        java.lang.Object obj11 = stackTestDriver4.peek();
        experiment.util.StackTestDriver stackTestDriver12 = new experiment.util.StackTestDriver();
        int int13 = stackTestDriver12.size();
        stackTestDriver12.clear();
        boolean boolean15 = stackTestDriver12.isEmpty();
        java.lang.Object obj17 = stackTestDriver12.push((java.lang.Object) (-1L));
        java.lang.Object obj18 = stackTestDriver4.push(obj17);
        java.lang.Object obj19 = stackTestDriver0.push(obj17);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (-1L) + "'", obj17, (-1L));
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (-1L) + "'", obj18, (-1L));
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (-1L) + "'", obj19, (-1L));
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test175");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = stackTestDriver0.peek();
        boolean boolean4 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        int int6 = stackTestDriver5.size();
        stackTestDriver5.clear();
        int int8 = stackTestDriver5.size();
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) int8);
        boolean boolean10 = stackTestDriver0.isEmpty();
        java.lang.Object obj11 = stackTestDriver0.pop();
        boolean boolean12 = stackTestDriver0.isEmpty();
        boolean boolean13 = stackTestDriver0.isEmpty();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) -1 + "'", obj3, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0 + "'", obj9, 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 0 + "'", obj11, 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test176");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver3 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        stackTestDriver4.clear();
        boolean boolean7 = stackTestDriver4.isEmpty();
        boolean boolean8 = stackTestDriver4.isEmpty();
        java.lang.Object obj9 = stackTestDriver3.push((java.lang.Object) stackTestDriver4);
        java.lang.Object obj10 = stackTestDriver0.push((java.lang.Object) stackTestDriver3);
        java.lang.Object obj12 = stackTestDriver0.push((java.lang.Object) ' ');
        int int13 = stackTestDriver0.size();
        java.lang.Object obj14 = stackTestDriver0.peek();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver16 = new experiment.util.StackTestDriver();
        java.lang.Object obj18 = stackTestDriver16.push((java.lang.Object) (byte) -1);
        java.lang.Object obj19 = stackTestDriver16.peek();
        java.lang.Object obj20 = stackTestDriver16.peek();
        stackTestDriver16.clear();
        stackTestDriver16.clear();
        java.lang.Object obj23 = stackTestDriver0.push((java.lang.Object) stackTestDriver16);
        stackTestDriver16.clear();
        java.lang.Class<?> wildcardClass25 = stackTestDriver16.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + ' ' + "'", obj12, ' ');
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + ' ' + "'", obj14, ' ');
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (byte) -1 + "'", obj18, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (byte) -1 + "'", obj19, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (byte) -1 + "'", obj20, (byte) -1);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test177");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver1 = new experiment.util.StackTestDriver();
        int int2 = stackTestDriver1.size();
        stackTestDriver1.clear();
        boolean boolean4 = stackTestDriver1.isEmpty();
        boolean boolean5 = stackTestDriver1.isEmpty();
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) stackTestDriver1);
        java.lang.Object obj7 = stackTestDriver0.peek();
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        int int9 = stackTestDriver8.size();
        stackTestDriver8.clear();
        boolean boolean11 = stackTestDriver8.isEmpty();
        java.lang.Object obj13 = stackTestDriver8.push((java.lang.Object) (-1L));
        java.lang.Object obj14 = stackTestDriver0.push(obj13);
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        java.lang.Object obj17 = stackTestDriver15.push((java.lang.Object) (byte) -1);
        java.lang.Object obj18 = stackTestDriver15.peek();
        boolean boolean19 = stackTestDriver15.isEmpty();
        java.lang.Object obj20 = stackTestDriver0.push((java.lang.Object) stackTestDriver15);
        java.lang.Object obj21 = stackTestDriver0.peek();
        java.lang.Object obj23 = stackTestDriver0.push((java.lang.Object) false);
        boolean boolean24 = stackTestDriver0.isEmpty();
        boolean boolean25 = stackTestDriver0.isEmpty();
        boolean boolean26 = stackTestDriver0.isEmpty();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (-1L) + "'", obj13, (-1L));
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1L) + "'", obj14, (-1L));
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) -1 + "'", obj17, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (byte) -1 + "'", obj18, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + false + "'", obj23, false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test178");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) false);
        stackTestDriver0.clear();
        int int7 = stackTestDriver0.size();
        java.lang.Class<?> wildcardClass8 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + false + "'", obj5, false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test179");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = stackTestDriver0.peek();
        int int4 = stackTestDriver0.size();
        java.lang.Object obj5 = stackTestDriver0.peek();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) -1 + "'", obj3, (byte) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) -1 + "'", obj5, (byte) -1);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test180");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) false);
        int int6 = stackTestDriver0.size();
        java.lang.Object obj7 = stackTestDriver0.peek();
        java.lang.Object obj8 = stackTestDriver0.peek();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + false + "'", obj5, false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + false + "'", obj7, false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + false + "'", obj8, false);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test181");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        java.lang.Object obj7 = stackTestDriver4.push((java.lang.Object) (short) 0);
        boolean boolean8 = stackTestDriver4.isEmpty();
        boolean boolean9 = stackTestDriver4.isEmpty();
        java.lang.Object obj10 = stackTestDriver0.push((java.lang.Object) boolean9);
        int int11 = stackTestDriver0.size();
        java.lang.Class<?> wildcardClass12 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (short) 0 + "'", obj7, (short) 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test182");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = stackTestDriver0.peek();
        boolean boolean4 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        int int6 = stackTestDriver5.size();
        stackTestDriver5.clear();
        int int8 = stackTestDriver5.size();
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) int8);
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) -1 + "'", obj3, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0 + "'", obj9, 0);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test183");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver1 = new experiment.util.StackTestDriver();
        int int2 = stackTestDriver1.size();
        stackTestDriver1.clear();
        boolean boolean4 = stackTestDriver1.isEmpty();
        boolean boolean5 = stackTestDriver1.isEmpty();
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) stackTestDriver1);
        boolean boolean7 = stackTestDriver0.isEmpty();
        int int8 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver9 = new experiment.util.StackTestDriver();
        int int10 = stackTestDriver9.size();
        stackTestDriver9.clear();
        boolean boolean12 = stackTestDriver9.isEmpty();
        java.lang.Object obj14 = stackTestDriver9.push((java.lang.Object) false);
        stackTestDriver9.clear();
        boolean boolean16 = stackTestDriver9.isEmpty();
        int int17 = stackTestDriver9.size();
        boolean boolean18 = stackTestDriver9.isEmpty();
        java.lang.Object obj19 = stackTestDriver0.push((java.lang.Object) stackTestDriver9);
        java.lang.Class<?> wildcardClass20 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + false + "'", obj14, false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test184");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        int int3 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        stackTestDriver4.clear();
        boolean boolean7 = stackTestDriver4.isEmpty();
        java.lang.Object obj9 = stackTestDriver4.push((java.lang.Object) false);
        stackTestDriver4.clear();
        boolean boolean11 = stackTestDriver4.isEmpty();
        int int12 = stackTestDriver4.size();
        boolean boolean13 = stackTestDriver4.isEmpty();
        int int14 = stackTestDriver4.size();
        java.lang.Object obj15 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        experiment.util.StackTestDriver stackTestDriver16 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver17 = new experiment.util.StackTestDriver();
        int int18 = stackTestDriver17.size();
        stackTestDriver17.clear();
        boolean boolean20 = stackTestDriver17.isEmpty();
        boolean boolean21 = stackTestDriver17.isEmpty();
        java.lang.Object obj22 = stackTestDriver16.push((java.lang.Object) stackTestDriver17);
        java.lang.Object obj23 = stackTestDriver16.peek();
        experiment.util.StackTestDriver stackTestDriver24 = new experiment.util.StackTestDriver();
        int int25 = stackTestDriver24.size();
        stackTestDriver24.clear();
        boolean boolean27 = stackTestDriver24.isEmpty();
        java.lang.Object obj29 = stackTestDriver24.push((java.lang.Object) (-1L));
        java.lang.Object obj30 = stackTestDriver16.push(obj29);
        experiment.util.StackTestDriver stackTestDriver31 = new experiment.util.StackTestDriver();
        java.lang.Object obj33 = stackTestDriver31.push((java.lang.Object) (byte) -1);
        java.lang.Object obj34 = stackTestDriver31.peek();
        boolean boolean35 = stackTestDriver31.isEmpty();
        java.lang.Object obj36 = stackTestDriver16.push((java.lang.Object) stackTestDriver31);
        java.lang.Object obj37 = stackTestDriver0.push((java.lang.Object) stackTestDriver31);
        int int38 = stackTestDriver0.size();
        java.lang.Object obj39 = stackTestDriver0.peek();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + false + "'", obj9, false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + (-1L) + "'", obj29, (-1L));
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + (-1L) + "'", obj30, (-1L));
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + (byte) -1 + "'", obj33, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + (byte) -1 + "'", obj34, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2 + "'", int38 == 2);
        org.junit.Assert.assertNotNull(obj39);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test185");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = stackTestDriver0.peek();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        int int7 = stackTestDriver6.size();
        stackTestDriver6.clear();
        boolean boolean9 = stackTestDriver6.isEmpty();
        boolean boolean10 = stackTestDriver6.isEmpty();
        java.lang.Object obj11 = stackTestDriver5.push((java.lang.Object) stackTestDriver6);
        java.lang.Object obj12 = stackTestDriver0.push(obj11);
        experiment.util.StackTestDriver stackTestDriver13 = new experiment.util.StackTestDriver();
        int int14 = stackTestDriver13.size();
        boolean boolean15 = stackTestDriver13.isEmpty();
        experiment.util.StackTestDriver stackTestDriver16 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver17 = new experiment.util.StackTestDriver();
        int int18 = stackTestDriver17.size();
        stackTestDriver17.clear();
        boolean boolean20 = stackTestDriver17.isEmpty();
        boolean boolean21 = stackTestDriver17.isEmpty();
        java.lang.Object obj22 = stackTestDriver16.push((java.lang.Object) stackTestDriver17);
        java.lang.Object obj23 = stackTestDriver13.push((java.lang.Object) stackTestDriver16);
        java.lang.Object obj25 = stackTestDriver13.push((java.lang.Object) ' ');
        java.lang.Object obj26 = stackTestDriver13.peek();
        java.lang.Object obj27 = stackTestDriver0.push((java.lang.Object) stackTestDriver13);
        experiment.util.StackTestDriver stackTestDriver28 = new experiment.util.StackTestDriver();
        java.lang.Object obj30 = stackTestDriver28.push((java.lang.Object) (byte) -1);
        java.lang.Object obj31 = stackTestDriver28.peek();
        int int32 = stackTestDriver28.size();
        experiment.util.StackTestDriver stackTestDriver33 = new experiment.util.StackTestDriver();
        int int34 = stackTestDriver33.size();
        stackTestDriver33.clear();
        boolean boolean36 = stackTestDriver33.isEmpty();
        java.lang.Object obj37 = stackTestDriver28.push((java.lang.Object) boolean36);
        boolean boolean38 = stackTestDriver28.isEmpty();
        boolean boolean39 = stackTestDriver28.isEmpty();
        experiment.util.StackTestDriver stackTestDriver40 = new experiment.util.StackTestDriver();
        java.lang.Object obj42 = stackTestDriver40.push((java.lang.Object) (byte) -1);
        java.lang.Object obj43 = stackTestDriver40.peek();
        stackTestDriver40.clear();
        java.lang.Class<?> wildcardClass45 = stackTestDriver40.getClass();
        java.lang.Object obj46 = stackTestDriver28.push((java.lang.Object) wildcardClass45);
        java.lang.Object obj47 = stackTestDriver0.push((java.lang.Object) wildcardClass45);
        int int48 = stackTestDriver0.size();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) -1 + "'", obj3, (byte) -1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + ' ' + "'", obj25, ' ');
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + ' ' + "'", obj26, ' ');
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + (byte) -1 + "'", obj30, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + (byte) -1 + "'", obj31, (byte) -1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + true + "'", obj37, true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + (byte) -1 + "'", obj42, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + (byte) -1 + "'", obj43, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertEquals(obj46.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj46), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj46), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertEquals(obj47.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj47), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj47), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 3 + "'", int48 == 3);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test186");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = stackTestDriver0.peek();
        boolean boolean4 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        int int6 = stackTestDriver5.size();
        stackTestDriver5.clear();
        int int8 = stackTestDriver5.size();
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) int8);
        java.lang.Object obj10 = stackTestDriver0.peek();
        experiment.util.StackTestDriver stackTestDriver11 = new experiment.util.StackTestDriver();
        java.lang.Object obj13 = stackTestDriver11.push((java.lang.Object) (byte) -1);
        java.lang.Object obj14 = stackTestDriver11.peek();
        stackTestDriver11.clear();
        experiment.util.StackTestDriver stackTestDriver16 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver17 = new experiment.util.StackTestDriver();
        int int18 = stackTestDriver17.size();
        stackTestDriver17.clear();
        boolean boolean20 = stackTestDriver17.isEmpty();
        boolean boolean21 = stackTestDriver17.isEmpty();
        java.lang.Object obj22 = stackTestDriver16.push((java.lang.Object) stackTestDriver17);
        java.lang.Object obj23 = stackTestDriver11.push(obj22);
        java.lang.Object obj24 = stackTestDriver0.push((java.lang.Object) stackTestDriver11);
        java.lang.Object obj25 = stackTestDriver11.pop();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = stackTestDriver11.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) -1 + "'", obj3, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0 + "'", obj9, 0);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 0 + "'", obj10, 0);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (byte) -1 + "'", obj13, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (byte) -1 + "'", obj14, (byte) -1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(obj25);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test187");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) false);
        stackTestDriver0.clear();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) (short) -1);
        java.lang.Object obj9 = stackTestDriver0.pop();
        java.lang.Class<?> wildcardClass10 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + false + "'", obj5, false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (short) -1 + "'", obj8, (short) -1);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (short) -1 + "'", obj9, (short) -1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test188");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        int int3 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        stackTestDriver4.clear();
        boolean boolean7 = stackTestDriver4.isEmpty();
        java.lang.Object obj9 = stackTestDriver4.push((java.lang.Object) false);
        stackTestDriver4.clear();
        boolean boolean11 = stackTestDriver4.isEmpty();
        int int12 = stackTestDriver4.size();
        boolean boolean13 = stackTestDriver4.isEmpty();
        int int14 = stackTestDriver4.size();
        java.lang.Object obj15 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        experiment.util.StackTestDriver stackTestDriver16 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver17 = new experiment.util.StackTestDriver();
        int int18 = stackTestDriver17.size();
        stackTestDriver17.clear();
        boolean boolean20 = stackTestDriver17.isEmpty();
        boolean boolean21 = stackTestDriver17.isEmpty();
        java.lang.Object obj22 = stackTestDriver16.push((java.lang.Object) stackTestDriver17);
        java.lang.Object obj23 = stackTestDriver16.peek();
        experiment.util.StackTestDriver stackTestDriver24 = new experiment.util.StackTestDriver();
        int int25 = stackTestDriver24.size();
        stackTestDriver24.clear();
        boolean boolean27 = stackTestDriver24.isEmpty();
        java.lang.Object obj29 = stackTestDriver24.push((java.lang.Object) (-1L));
        java.lang.Object obj30 = stackTestDriver16.push(obj29);
        experiment.util.StackTestDriver stackTestDriver31 = new experiment.util.StackTestDriver();
        java.lang.Object obj33 = stackTestDriver31.push((java.lang.Object) (byte) -1);
        java.lang.Object obj34 = stackTestDriver31.peek();
        boolean boolean35 = stackTestDriver31.isEmpty();
        java.lang.Object obj36 = stackTestDriver16.push((java.lang.Object) stackTestDriver31);
        java.lang.Object obj37 = stackTestDriver0.push((java.lang.Object) stackTestDriver31);
        int int38 = stackTestDriver31.size();
        stackTestDriver31.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj40 = stackTestDriver31.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + false + "'", obj9, false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + (-1L) + "'", obj29, (-1L));
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + (-1L) + "'", obj30, (-1L));
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + (byte) -1 + "'", obj33, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + (byte) -1 + "'", obj34, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test189");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver1 = new experiment.util.StackTestDriver();
        int int2 = stackTestDriver1.size();
        stackTestDriver1.clear();
        boolean boolean4 = stackTestDriver1.isEmpty();
        boolean boolean5 = stackTestDriver1.isEmpty();
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) stackTestDriver1);
        java.lang.Object obj7 = stackTestDriver0.peek();
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        int int9 = stackTestDriver8.size();
        stackTestDriver8.clear();
        boolean boolean11 = stackTestDriver8.isEmpty();
        java.lang.Object obj13 = stackTestDriver8.push((java.lang.Object) (-1L));
        java.lang.Object obj14 = stackTestDriver0.push(obj13);
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        java.lang.Object obj17 = stackTestDriver15.push((java.lang.Object) (byte) -1);
        java.lang.Object obj18 = stackTestDriver15.peek();
        boolean boolean19 = stackTestDriver15.isEmpty();
        java.lang.Object obj20 = stackTestDriver0.push((java.lang.Object) stackTestDriver15);
        java.lang.Object obj21 = stackTestDriver0.peek();
        java.lang.Object obj23 = stackTestDriver0.push((java.lang.Object) false);
        java.lang.Object obj24 = stackTestDriver0.peek();
        boolean boolean25 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (-1L) + "'", obj13, (-1L));
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1L) + "'", obj14, (-1L));
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) -1 + "'", obj17, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (byte) -1 + "'", obj18, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + false + "'", obj23, false);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + false + "'", obj24, false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test190");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        int int3 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        stackTestDriver4.clear();
        boolean boolean7 = stackTestDriver4.isEmpty();
        java.lang.Object obj9 = stackTestDriver4.push((java.lang.Object) false);
        stackTestDriver4.clear();
        boolean boolean11 = stackTestDriver4.isEmpty();
        int int12 = stackTestDriver4.size();
        boolean boolean13 = stackTestDriver4.isEmpty();
        int int14 = stackTestDriver4.size();
        java.lang.Object obj15 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        int int16 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver17 = new experiment.util.StackTestDriver();
        int int18 = stackTestDriver17.size();
        boolean boolean19 = stackTestDriver17.isEmpty();
        experiment.util.StackTestDriver stackTestDriver20 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver21 = new experiment.util.StackTestDriver();
        int int22 = stackTestDriver21.size();
        stackTestDriver21.clear();
        boolean boolean24 = stackTestDriver21.isEmpty();
        boolean boolean25 = stackTestDriver21.isEmpty();
        java.lang.Object obj26 = stackTestDriver20.push((java.lang.Object) stackTestDriver21);
        java.lang.Object obj27 = stackTestDriver17.push((java.lang.Object) stackTestDriver20);
        java.lang.Object obj28 = stackTestDriver20.pop();
        java.lang.Object obj29 = stackTestDriver0.push(obj28);
        java.lang.Class<?> wildcardClass30 = obj28.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + false + "'", obj9, false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test191");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = stackTestDriver0.peek();
        boolean boolean4 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        int int6 = stackTestDriver5.size();
        stackTestDriver5.clear();
        int int8 = stackTestDriver5.size();
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) int8);
        java.lang.Object obj10 = stackTestDriver0.peek();
        int int11 = stackTestDriver0.size();
        java.lang.Class<?> wildcardClass12 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) -1 + "'", obj3, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0 + "'", obj9, 0);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 0 + "'", obj10, 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test192");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        experiment.util.StackTestDriver stackTestDriver3 = new experiment.util.StackTestDriver();
        java.lang.Object obj5 = stackTestDriver3.push((java.lang.Object) (byte) -1);
        java.lang.Object obj6 = stackTestDriver3.peek();
        java.lang.Object obj7 = stackTestDriver3.peek();
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        java.lang.Object obj9 = stackTestDriver0.push(obj7);
        int int10 = stackTestDriver0.size();
        boolean boolean11 = stackTestDriver0.isEmpty();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) -1 + "'", obj5, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) -1 + "'", obj6, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) -1 + "'", obj9, (byte) -1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test193");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver3 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        stackTestDriver4.clear();
        boolean boolean7 = stackTestDriver4.isEmpty();
        boolean boolean8 = stackTestDriver4.isEmpty();
        java.lang.Object obj9 = stackTestDriver3.push((java.lang.Object) stackTestDriver4);
        java.lang.Object obj10 = stackTestDriver0.push((java.lang.Object) stackTestDriver3);
        int int11 = stackTestDriver0.size();
        java.lang.Object obj13 = stackTestDriver0.push((java.lang.Object) 10.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 10.0f + "'", obj13, 10.0f);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test194");
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
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test195");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = stackTestDriver0.peek();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        java.lang.Object obj6 = stackTestDriver4.push((java.lang.Object) (byte) -1);
        java.lang.Object obj7 = stackTestDriver4.peek();
        java.lang.Object obj8 = stackTestDriver4.peek();
        java.lang.Object obj9 = stackTestDriver4.peek();
        java.lang.Object obj10 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        int int11 = stackTestDriver4.size();
        java.lang.Object obj12 = stackTestDriver4.pop();
        stackTestDriver4.clear();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) -1 + "'", obj3, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) -1 + "'", obj6, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) -1 + "'", obj8, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) -1 + "'", obj9, (byte) -1);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) -1 + "'", obj12, (byte) -1);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test196");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        int int3 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        stackTestDriver4.clear();
        boolean boolean7 = stackTestDriver4.isEmpty();
        java.lang.Object obj9 = stackTestDriver4.push((java.lang.Object) false);
        stackTestDriver4.clear();
        boolean boolean11 = stackTestDriver4.isEmpty();
        int int12 = stackTestDriver4.size();
        boolean boolean13 = stackTestDriver4.isEmpty();
        int int14 = stackTestDriver4.size();
        java.lang.Object obj15 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + false + "'", obj9, false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test197");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver1 = new experiment.util.StackTestDriver();
        int int2 = stackTestDriver1.size();
        stackTestDriver1.clear();
        boolean boolean4 = stackTestDriver1.isEmpty();
        boolean boolean5 = stackTestDriver1.isEmpty();
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) stackTestDriver1);
        java.lang.Object obj7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = stackTestDriver1.push(obj7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test198");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) false);
        stackTestDriver0.clear();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) (short) -1);
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + false + "'", obj5, false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (short) -1 + "'", obj8, (short) -1);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test199");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = stackTestDriver0.peek();
        int int4 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        int int6 = stackTestDriver5.size();
        stackTestDriver5.clear();
        boolean boolean8 = stackTestDriver5.isEmpty();
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) boolean8);
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        int int11 = stackTestDriver10.size();
        boolean boolean12 = stackTestDriver10.isEmpty();
        stackTestDriver10.clear();
        java.lang.Object obj14 = stackTestDriver0.push((java.lang.Object) stackTestDriver10);
        int int15 = stackTestDriver10.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = stackTestDriver10.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) -1 + "'", obj3, (byte) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + true + "'", obj9, true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test200");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        int int3 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        stackTestDriver4.clear();
        boolean boolean7 = stackTestDriver4.isEmpty();
        java.lang.Object obj9 = stackTestDriver4.push((java.lang.Object) false);
        stackTestDriver4.clear();
        boolean boolean11 = stackTestDriver4.isEmpty();
        int int12 = stackTestDriver4.size();
        boolean boolean13 = stackTestDriver4.isEmpty();
        int int14 = stackTestDriver4.size();
        java.lang.Object obj15 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        boolean boolean16 = stackTestDriver0.isEmpty();
        java.lang.Class<?> wildcardClass17 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + false + "'", obj9, false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test201");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = stackTestDriver0.peek();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        java.lang.Object obj6 = stackTestDriver4.push((java.lang.Object) (byte) -1);
        java.lang.Object obj7 = stackTestDriver4.peek();
        java.lang.Object obj8 = stackTestDriver4.peek();
        java.lang.Object obj9 = stackTestDriver4.peek();
        java.lang.Object obj10 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        int int11 = stackTestDriver4.size();
        java.lang.Object obj12 = stackTestDriver4.pop();
        experiment.util.StackTestDriver stackTestDriver13 = new experiment.util.StackTestDriver();
        int int14 = stackTestDriver13.size();
        boolean boolean15 = stackTestDriver13.isEmpty();
        experiment.util.StackTestDriver stackTestDriver16 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver17 = new experiment.util.StackTestDriver();
        int int18 = stackTestDriver17.size();
        stackTestDriver17.clear();
        boolean boolean20 = stackTestDriver17.isEmpty();
        boolean boolean21 = stackTestDriver17.isEmpty();
        java.lang.Object obj22 = stackTestDriver16.push((java.lang.Object) stackTestDriver17);
        java.lang.Object obj23 = stackTestDriver13.push((java.lang.Object) stackTestDriver16);
        experiment.util.StackTestDriver stackTestDriver24 = new experiment.util.StackTestDriver();
        int int25 = stackTestDriver24.size();
        boolean boolean26 = stackTestDriver24.isEmpty();
        experiment.util.StackTestDriver stackTestDriver27 = new experiment.util.StackTestDriver();
        int int28 = stackTestDriver27.size();
        boolean boolean29 = stackTestDriver27.isEmpty();
        experiment.util.StackTestDriver stackTestDriver30 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver31 = new experiment.util.StackTestDriver();
        int int32 = stackTestDriver31.size();
        stackTestDriver31.clear();
        boolean boolean34 = stackTestDriver31.isEmpty();
        boolean boolean35 = stackTestDriver31.isEmpty();
        java.lang.Object obj36 = stackTestDriver30.push((java.lang.Object) stackTestDriver31);
        java.lang.Object obj37 = stackTestDriver27.push((java.lang.Object) stackTestDriver30);
        java.lang.Object obj38 = stackTestDriver30.pop();
        java.lang.Object obj39 = stackTestDriver24.push(obj38);
        java.lang.Object obj40 = stackTestDriver13.push((java.lang.Object) stackTestDriver24);
        experiment.util.StackTestDriver stackTestDriver41 = new experiment.util.StackTestDriver();
        java.lang.Object obj43 = stackTestDriver41.push((java.lang.Object) (byte) -1);
        java.lang.Object obj44 = stackTestDriver41.peek();
        boolean boolean45 = stackTestDriver41.isEmpty();
        experiment.util.StackTestDriver stackTestDriver46 = new experiment.util.StackTestDriver();
        int int47 = stackTestDriver46.size();
        stackTestDriver46.clear();
        int int49 = stackTestDriver46.size();
        java.lang.Object obj50 = stackTestDriver41.push((java.lang.Object) int49);
        java.lang.Object obj51 = stackTestDriver41.peek();
        experiment.util.StackTestDriver stackTestDriver52 = new experiment.util.StackTestDriver();
        java.lang.Object obj54 = stackTestDriver52.push((java.lang.Object) (byte) -1);
        java.lang.Object obj55 = stackTestDriver52.peek();
        stackTestDriver52.clear();
        experiment.util.StackTestDriver stackTestDriver57 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver58 = new experiment.util.StackTestDriver();
        int int59 = stackTestDriver58.size();
        stackTestDriver58.clear();
        boolean boolean61 = stackTestDriver58.isEmpty();
        boolean boolean62 = stackTestDriver58.isEmpty();
        java.lang.Object obj63 = stackTestDriver57.push((java.lang.Object) stackTestDriver58);
        java.lang.Object obj64 = stackTestDriver52.push(obj63);
        java.lang.Object obj65 = stackTestDriver41.push((java.lang.Object) stackTestDriver52);
        java.lang.Object obj66 = stackTestDriver13.push((java.lang.Object) stackTestDriver41);
        java.lang.Object obj67 = stackTestDriver4.push(obj66);
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) -1 + "'", obj3, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) -1 + "'", obj6, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) -1 + "'", obj8, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) -1 + "'", obj9, (byte) -1);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) -1 + "'", obj12, (byte) -1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + (byte) -1 + "'", obj43, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + (byte) -1 + "'", obj44, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + 0 + "'", obj50, 0);
        org.junit.Assert.assertEquals("'" + obj51 + "' != '" + 0 + "'", obj51, 0);
        org.junit.Assert.assertEquals("'" + obj54 + "' != '" + (byte) -1 + "'", obj54, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj55 + "' != '" + (byte) -1 + "'", obj55, (byte) -1);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(obj63);
        org.junit.Assert.assertNotNull(obj64);
        org.junit.Assert.assertNotNull(obj65);
        org.junit.Assert.assertNotNull(obj66);
        org.junit.Assert.assertNotNull(obj67);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test202");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = stackTestDriver0.peek();
        boolean boolean4 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        int int6 = stackTestDriver5.size();
        stackTestDriver5.clear();
        int int8 = stackTestDriver5.size();
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) int8);
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) -1 + "'", obj3, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0 + "'", obj9, 0);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test203");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver3 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        stackTestDriver4.clear();
        boolean boolean7 = stackTestDriver4.isEmpty();
        boolean boolean8 = stackTestDriver4.isEmpty();
        java.lang.Object obj9 = stackTestDriver3.push((java.lang.Object) stackTestDriver4);
        java.lang.Object obj10 = stackTestDriver0.push((java.lang.Object) stackTestDriver3);
        java.lang.Object obj12 = stackTestDriver0.push((java.lang.Object) ' ');
        int int13 = stackTestDriver0.size();
        java.lang.Object obj14 = stackTestDriver0.peek();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver16 = new experiment.util.StackTestDriver();
        java.lang.Object obj18 = stackTestDriver16.push((java.lang.Object) (byte) -1);
        java.lang.Object obj19 = stackTestDriver16.peek();
        java.lang.Object obj20 = stackTestDriver16.peek();
        stackTestDriver16.clear();
        stackTestDriver16.clear();
        java.lang.Object obj23 = stackTestDriver0.push((java.lang.Object) stackTestDriver16);
        java.lang.Object obj24 = stackTestDriver0.peek();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + ' ' + "'", obj12, ' ');
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + ' ' + "'", obj14, ' ');
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (byte) -1 + "'", obj18, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (byte) -1 + "'", obj19, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (byte) -1 + "'", obj20, (byte) -1);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNotNull(obj24);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test204");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = stackTestDriver0.peek();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        int int7 = stackTestDriver6.size();
        stackTestDriver6.clear();
        boolean boolean9 = stackTestDriver6.isEmpty();
        boolean boolean10 = stackTestDriver6.isEmpty();
        java.lang.Object obj11 = stackTestDriver5.push((java.lang.Object) stackTestDriver6);
        java.lang.Object obj12 = stackTestDriver0.push(obj11);
        experiment.util.StackTestDriver stackTestDriver13 = new experiment.util.StackTestDriver();
        int int14 = stackTestDriver13.size();
        boolean boolean15 = stackTestDriver13.isEmpty();
        experiment.util.StackTestDriver stackTestDriver16 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver17 = new experiment.util.StackTestDriver();
        int int18 = stackTestDriver17.size();
        stackTestDriver17.clear();
        boolean boolean20 = stackTestDriver17.isEmpty();
        boolean boolean21 = stackTestDriver17.isEmpty();
        java.lang.Object obj22 = stackTestDriver16.push((java.lang.Object) stackTestDriver17);
        java.lang.Object obj23 = stackTestDriver13.push((java.lang.Object) stackTestDriver16);
        java.lang.Object obj25 = stackTestDriver13.push((java.lang.Object) ' ');
        java.lang.Object obj26 = stackTestDriver13.peek();
        java.lang.Object obj27 = stackTestDriver0.push((java.lang.Object) stackTestDriver13);
        experiment.util.StackTestDriver stackTestDriver28 = new experiment.util.StackTestDriver();
        java.lang.Object obj30 = stackTestDriver28.push((java.lang.Object) (byte) -1);
        java.lang.Object obj31 = stackTestDriver28.peek();
        int int32 = stackTestDriver28.size();
        experiment.util.StackTestDriver stackTestDriver33 = new experiment.util.StackTestDriver();
        int int34 = stackTestDriver33.size();
        stackTestDriver33.clear();
        boolean boolean36 = stackTestDriver33.isEmpty();
        java.lang.Object obj37 = stackTestDriver28.push((java.lang.Object) boolean36);
        boolean boolean38 = stackTestDriver28.isEmpty();
        boolean boolean39 = stackTestDriver28.isEmpty();
        experiment.util.StackTestDriver stackTestDriver40 = new experiment.util.StackTestDriver();
        java.lang.Object obj42 = stackTestDriver40.push((java.lang.Object) (byte) -1);
        java.lang.Object obj43 = stackTestDriver40.peek();
        stackTestDriver40.clear();
        java.lang.Class<?> wildcardClass45 = stackTestDriver40.getClass();
        java.lang.Object obj46 = stackTestDriver28.push((java.lang.Object) wildcardClass45);
        java.lang.Object obj47 = stackTestDriver0.push((java.lang.Object) wildcardClass45);
        java.lang.Object obj48 = stackTestDriver0.pop();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) -1 + "'", obj3, (byte) -1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + ' ' + "'", obj25, ' ');
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + ' ' + "'", obj26, ' ');
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + (byte) -1 + "'", obj30, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + (byte) -1 + "'", obj31, (byte) -1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + true + "'", obj37, true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + (byte) -1 + "'", obj42, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + (byte) -1 + "'", obj43, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertEquals(obj46.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj46), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj46), "class experiment.util.StackTestDriver");
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
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test205");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) false);
        stackTestDriver0.clear();
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + false + "'", obj5, false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test206");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        int int3 = stackTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test207");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = stackTestDriver0.peek();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        int int7 = stackTestDriver6.size();
        stackTestDriver6.clear();
        boolean boolean9 = stackTestDriver6.isEmpty();
        boolean boolean10 = stackTestDriver6.isEmpty();
        java.lang.Object obj11 = stackTestDriver5.push((java.lang.Object) stackTestDriver6);
        java.lang.Object obj12 = stackTestDriver0.push(obj11);
        experiment.util.StackTestDriver stackTestDriver13 = new experiment.util.StackTestDriver();
        java.lang.Object obj15 = stackTestDriver13.push((java.lang.Object) (byte) -1);
        java.lang.Object obj16 = stackTestDriver13.peek();
        java.lang.Object obj17 = stackTestDriver13.peek();
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        java.lang.Object obj19 = stackTestDriver0.push(obj17);
        experiment.util.StackTestDriver stackTestDriver20 = new experiment.util.StackTestDriver();
        int int21 = stackTestDriver20.size();
        boolean boolean22 = stackTestDriver20.isEmpty();
        experiment.util.StackTestDriver stackTestDriver23 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver24 = new experiment.util.StackTestDriver();
        int int25 = stackTestDriver24.size();
        stackTestDriver24.clear();
        boolean boolean27 = stackTestDriver24.isEmpty();
        boolean boolean28 = stackTestDriver24.isEmpty();
        java.lang.Object obj29 = stackTestDriver23.push((java.lang.Object) stackTestDriver24);
        java.lang.Object obj30 = stackTestDriver20.push((java.lang.Object) stackTestDriver23);
        java.lang.Object obj31 = stackTestDriver0.push(obj30);
        experiment.util.StackTestDriver stackTestDriver32 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver33 = new experiment.util.StackTestDriver();
        int int34 = stackTestDriver33.size();
        stackTestDriver33.clear();
        boolean boolean36 = stackTestDriver33.isEmpty();
        boolean boolean37 = stackTestDriver33.isEmpty();
        java.lang.Object obj38 = stackTestDriver32.push((java.lang.Object) stackTestDriver33);
        java.lang.Object obj39 = stackTestDriver0.push((java.lang.Object) stackTestDriver32);
        java.lang.Object obj40 = stackTestDriver32.peek();
        stackTestDriver32.clear();
        int int42 = stackTestDriver32.size();
        java.lang.Class<?> wildcardClass43 = stackTestDriver32.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) -1 + "'", obj3, (byte) -1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (byte) -1 + "'", obj15, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (byte) -1 + "'", obj16, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) -1 + "'", obj17, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (byte) -1 + "'", obj19, (byte) -1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test208");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver1 = new experiment.util.StackTestDriver();
        int int2 = stackTestDriver1.size();
        stackTestDriver1.clear();
        boolean boolean4 = stackTestDriver1.isEmpty();
        boolean boolean5 = stackTestDriver1.isEmpty();
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) stackTestDriver1);
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver9 = new experiment.util.StackTestDriver();
        int int10 = stackTestDriver9.size();
        stackTestDriver9.clear();
        boolean boolean12 = stackTestDriver9.isEmpty();
        boolean boolean13 = stackTestDriver9.isEmpty();
        java.lang.Object obj14 = stackTestDriver8.push((java.lang.Object) stackTestDriver9);
        boolean boolean15 = stackTestDriver8.isEmpty();
        int int16 = stackTestDriver8.size();
        experiment.util.StackTestDriver stackTestDriver17 = new experiment.util.StackTestDriver();
        int int18 = stackTestDriver17.size();
        stackTestDriver17.clear();
        boolean boolean20 = stackTestDriver17.isEmpty();
        java.lang.Object obj22 = stackTestDriver17.push((java.lang.Object) false);
        stackTestDriver17.clear();
        boolean boolean24 = stackTestDriver17.isEmpty();
        int int25 = stackTestDriver17.size();
        boolean boolean26 = stackTestDriver17.isEmpty();
        java.lang.Object obj27 = stackTestDriver8.push((java.lang.Object) stackTestDriver17);
        java.lang.Object obj28 = stackTestDriver0.push((java.lang.Object) stackTestDriver17);
        stackTestDriver17.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + false + "'", obj22, false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertNotNull(obj28);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test209");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver3 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        stackTestDriver4.clear();
        boolean boolean7 = stackTestDriver4.isEmpty();
        boolean boolean8 = stackTestDriver4.isEmpty();
        java.lang.Object obj9 = stackTestDriver3.push((java.lang.Object) stackTestDriver4);
        java.lang.Object obj10 = stackTestDriver0.push((java.lang.Object) stackTestDriver3);
        java.lang.Object obj12 = stackTestDriver0.push((java.lang.Object) ' ');
        java.lang.Object obj13 = stackTestDriver0.pop();
        java.lang.Object obj14 = stackTestDriver0.pop();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + ' ' + "'", obj12, ' ');
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + ' ' + "'", obj13, ' ');
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test210");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        int int3 = stackTestDriver0.size();
        stackTestDriver0.clear();
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) (short) 0);
        java.lang.Object obj7 = stackTestDriver0.peek();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 0 + "'", obj6, (short) 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (short) 0 + "'", obj7, (short) 0);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test211");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        int int4 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        int int6 = stackTestDriver5.size();
        stackTestDriver5.clear();
        stackTestDriver5.clear();
        int int9 = stackTestDriver5.size();
        java.lang.Object obj10 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        boolean boolean11 = stackTestDriver0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test212");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = stackTestDriver0.peek();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        int int7 = stackTestDriver6.size();
        stackTestDriver6.clear();
        boolean boolean9 = stackTestDriver6.isEmpty();
        boolean boolean10 = stackTestDriver6.isEmpty();
        java.lang.Object obj11 = stackTestDriver5.push((java.lang.Object) stackTestDriver6);
        java.lang.Object obj12 = stackTestDriver0.push(obj11);
        experiment.util.StackTestDriver stackTestDriver13 = new experiment.util.StackTestDriver();
        java.lang.Object obj15 = stackTestDriver13.push((java.lang.Object) (byte) -1);
        java.lang.Object obj16 = stackTestDriver13.peek();
        java.lang.Object obj17 = stackTestDriver13.peek();
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        java.lang.Object obj19 = stackTestDriver0.push(obj17);
        experiment.util.StackTestDriver stackTestDriver20 = new experiment.util.StackTestDriver();
        int int21 = stackTestDriver20.size();
        boolean boolean22 = stackTestDriver20.isEmpty();
        experiment.util.StackTestDriver stackTestDriver23 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver24 = new experiment.util.StackTestDriver();
        int int25 = stackTestDriver24.size();
        stackTestDriver24.clear();
        boolean boolean27 = stackTestDriver24.isEmpty();
        boolean boolean28 = stackTestDriver24.isEmpty();
        java.lang.Object obj29 = stackTestDriver23.push((java.lang.Object) stackTestDriver24);
        java.lang.Object obj30 = stackTestDriver20.push((java.lang.Object) stackTestDriver23);
        java.lang.Object obj31 = stackTestDriver0.push(obj30);
        experiment.util.StackTestDriver stackTestDriver32 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver33 = new experiment.util.StackTestDriver();
        int int34 = stackTestDriver33.size();
        stackTestDriver33.clear();
        boolean boolean36 = stackTestDriver33.isEmpty();
        boolean boolean37 = stackTestDriver33.isEmpty();
        java.lang.Object obj38 = stackTestDriver32.push((java.lang.Object) stackTestDriver33);
        java.lang.Object obj39 = stackTestDriver0.push((java.lang.Object) stackTestDriver32);
        java.lang.Object obj40 = stackTestDriver0.peek();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) -1 + "'", obj3, (byte) -1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (byte) -1 + "'", obj15, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (byte) -1 + "'", obj16, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) -1 + "'", obj17, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (byte) -1 + "'", obj19, (byte) -1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertNotNull(obj40);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test213");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = stackTestDriver0.peek();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        int int7 = stackTestDriver6.size();
        stackTestDriver6.clear();
        boolean boolean9 = stackTestDriver6.isEmpty();
        boolean boolean10 = stackTestDriver6.isEmpty();
        java.lang.Object obj11 = stackTestDriver5.push((java.lang.Object) stackTestDriver6);
        java.lang.Object obj12 = stackTestDriver0.push(obj11);
        java.lang.Object obj13 = stackTestDriver0.peek();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) -1 + "'", obj3, (byte) -1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test214");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        int int4 = stackTestDriver0.size();
        stackTestDriver0.clear();
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) 100L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 100L + "'", obj7, 100L);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test215");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        int int4 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        int int6 = stackTestDriver5.size();
        boolean boolean7 = stackTestDriver5.isEmpty();
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver9 = new experiment.util.StackTestDriver();
        int int10 = stackTestDriver9.size();
        stackTestDriver9.clear();
        boolean boolean12 = stackTestDriver9.isEmpty();
        boolean boolean13 = stackTestDriver9.isEmpty();
        java.lang.Object obj14 = stackTestDriver8.push((java.lang.Object) stackTestDriver9);
        java.lang.Object obj15 = stackTestDriver5.push((java.lang.Object) stackTestDriver8);
        java.lang.Object obj16 = stackTestDriver0.push((java.lang.Object) stackTestDriver8);
        stackTestDriver8.clear();
        java.lang.Class<?> wildcardClass18 = stackTestDriver8.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test216");
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
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test217");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = stackTestDriver0.peek();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        int int7 = stackTestDriver6.size();
        stackTestDriver6.clear();
        boolean boolean9 = stackTestDriver6.isEmpty();
        boolean boolean10 = stackTestDriver6.isEmpty();
        java.lang.Object obj11 = stackTestDriver5.push((java.lang.Object) stackTestDriver6);
        java.lang.Object obj12 = stackTestDriver0.push(obj11);
        experiment.util.StackTestDriver stackTestDriver13 = new experiment.util.StackTestDriver();
        java.lang.Object obj15 = stackTestDriver13.push((java.lang.Object) (byte) -1);
        java.lang.Object obj16 = stackTestDriver13.peek();
        java.lang.Object obj17 = stackTestDriver13.peek();
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        java.lang.Object obj19 = stackTestDriver0.push(obj17);
        experiment.util.StackTestDriver stackTestDriver20 = new experiment.util.StackTestDriver();
        int int21 = stackTestDriver20.size();
        boolean boolean22 = stackTestDriver20.isEmpty();
        experiment.util.StackTestDriver stackTestDriver23 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver24 = new experiment.util.StackTestDriver();
        int int25 = stackTestDriver24.size();
        stackTestDriver24.clear();
        boolean boolean27 = stackTestDriver24.isEmpty();
        boolean boolean28 = stackTestDriver24.isEmpty();
        java.lang.Object obj29 = stackTestDriver23.push((java.lang.Object) stackTestDriver24);
        java.lang.Object obj30 = stackTestDriver20.push((java.lang.Object) stackTestDriver23);
        java.lang.Object obj31 = stackTestDriver0.push(obj30);
        experiment.util.StackTestDriver stackTestDriver32 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver33 = new experiment.util.StackTestDriver();
        int int34 = stackTestDriver33.size();
        stackTestDriver33.clear();
        boolean boolean36 = stackTestDriver33.isEmpty();
        boolean boolean37 = stackTestDriver33.isEmpty();
        java.lang.Object obj38 = stackTestDriver32.push((java.lang.Object) stackTestDriver33);
        java.lang.Object obj39 = stackTestDriver0.push((java.lang.Object) stackTestDriver32);
        java.lang.Object obj40 = stackTestDriver32.peek();
        stackTestDriver32.clear();
        boolean boolean42 = stackTestDriver32.isEmpty();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) -1 + "'", obj3, (byte) -1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (byte) -1 + "'", obj15, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (byte) -1 + "'", obj16, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) -1 + "'", obj17, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (byte) -1 + "'", obj19, (byte) -1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test218");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver3 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        stackTestDriver4.clear();
        boolean boolean7 = stackTestDriver4.isEmpty();
        boolean boolean8 = stackTestDriver4.isEmpty();
        java.lang.Object obj9 = stackTestDriver3.push((java.lang.Object) stackTestDriver4);
        java.lang.Object obj10 = stackTestDriver0.push((java.lang.Object) stackTestDriver3);
        java.lang.Object obj12 = stackTestDriver0.push((java.lang.Object) ' ');
        int int13 = stackTestDriver0.size();
        java.lang.Object obj14 = stackTestDriver0.peek();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver16 = new experiment.util.StackTestDriver();
        java.lang.Object obj18 = stackTestDriver16.push((java.lang.Object) (byte) -1);
        java.lang.Object obj19 = stackTestDriver16.peek();
        java.lang.Object obj20 = stackTestDriver16.peek();
        stackTestDriver16.clear();
        stackTestDriver16.clear();
        java.lang.Object obj23 = stackTestDriver0.push((java.lang.Object) stackTestDriver16);
        stackTestDriver16.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = stackTestDriver16.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + ' ' + "'", obj12, ' ');
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + ' ' + "'", obj14, ' ');
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (byte) -1 + "'", obj18, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (byte) -1 + "'", obj19, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (byte) -1 + "'", obj20, (byte) -1);
        org.junit.Assert.assertNotNull(obj23);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test219");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        int int2 = stackTestDriver0.size();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) 0);
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        int int6 = stackTestDriver5.size();
        stackTestDriver5.clear();
        boolean boolean8 = stackTestDriver5.isEmpty();
        java.lang.Object obj10 = stackTestDriver5.push((java.lang.Object) false);
        boolean boolean11 = stackTestDriver5.isEmpty();
        java.lang.Object obj12 = stackTestDriver0.push((java.lang.Object) boolean11);
        stackTestDriver0.clear();
        java.lang.Class<?> wildcardClass14 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0 + "'", obj4, 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + false + "'", obj10, false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + false + "'", obj12, false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test220");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) false);
        stackTestDriver0.clear();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) (short) -1);
        stackTestDriver0.clear();
        boolean boolean10 = stackTestDriver0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + false + "'", obj5, false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (short) -1 + "'", obj8, (short) -1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test221");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.pop();
        stackTestDriver0.clear();
        int int6 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver7 = new experiment.util.StackTestDriver();
        java.lang.Object obj9 = stackTestDriver7.push((java.lang.Object) (byte) -1);
        java.lang.Object obj10 = stackTestDriver7.peek();
        int int11 = stackTestDriver7.size();
        experiment.util.StackTestDriver stackTestDriver12 = new experiment.util.StackTestDriver();
        int int13 = stackTestDriver12.size();
        stackTestDriver12.clear();
        boolean boolean15 = stackTestDriver12.isEmpty();
        java.lang.Object obj16 = stackTestDriver7.push((java.lang.Object) boolean15);
        boolean boolean17 = stackTestDriver7.isEmpty();
        boolean boolean18 = stackTestDriver7.isEmpty();
        experiment.util.StackTestDriver stackTestDriver19 = new experiment.util.StackTestDriver();
        java.lang.Object obj21 = stackTestDriver19.push((java.lang.Object) (byte) -1);
        java.lang.Object obj22 = stackTestDriver19.peek();
        stackTestDriver19.clear();
        java.lang.Class<?> wildcardClass24 = stackTestDriver19.getClass();
        java.lang.Object obj25 = stackTestDriver7.push((java.lang.Object) wildcardClass24);
        java.lang.Object obj26 = stackTestDriver0.push((java.lang.Object) stackTestDriver7);
        int int27 = stackTestDriver0.size();
        int int28 = stackTestDriver0.size();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) -1 + "'", obj9, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + true + "'", obj16, true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (byte) -1 + "'", obj21, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (byte) -1 + "'", obj22, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertEquals(obj25.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj25), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj25), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test222");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) false);
        stackTestDriver0.clear();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) (short) -1);
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        java.lang.Object obj12 = stackTestDriver10.push((java.lang.Object) (byte) -1);
        java.lang.Object obj13 = stackTestDriver10.peek();
        java.lang.Object obj14 = stackTestDriver10.peek();
        stackTestDriver10.clear();
        java.lang.Class<?> wildcardClass16 = stackTestDriver10.getClass();
        java.lang.Object obj17 = stackTestDriver0.push((java.lang.Object) wildcardClass16);
        boolean boolean18 = stackTestDriver0.isEmpty();
        int int19 = stackTestDriver0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + false + "'", obj5, false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (short) -1 + "'", obj8, (short) -1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) -1 + "'", obj12, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (byte) -1 + "'", obj13, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (byte) -1 + "'", obj14, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test223");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = stackTestDriver0.peek();
        java.lang.Object obj4 = stackTestDriver0.peek();
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
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) -1 + "'", obj3, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test224");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = stackTestDriver0.peek();
        java.lang.Object obj4 = stackTestDriver0.peek();
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
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) -1 + "'", obj3, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test225");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) false);
        stackTestDriver0.clear();
        boolean boolean7 = stackTestDriver0.isEmpty();
        boolean boolean8 = stackTestDriver0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + false + "'", obj5, false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test226");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver1 = new experiment.util.StackTestDriver();
        int int2 = stackTestDriver1.size();
        stackTestDriver1.clear();
        boolean boolean4 = stackTestDriver1.isEmpty();
        boolean boolean5 = stackTestDriver1.isEmpty();
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) stackTestDriver1);
        stackTestDriver1.clear();
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        java.lang.Object obj10 = stackTestDriver8.push((java.lang.Object) (byte) -1);
        java.lang.Object obj11 = stackTestDriver8.peek();
        java.lang.Object obj12 = stackTestDriver8.peek();
        stackTestDriver8.clear();
        boolean boolean14 = stackTestDriver8.isEmpty();
        java.lang.Object obj15 = stackTestDriver1.push((java.lang.Object) stackTestDriver8);
        stackTestDriver1.clear();
        stackTestDriver1.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) -1 + "'", obj11, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) -1 + "'", obj12, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test227");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = stackTestDriver0.peek();
        boolean boolean4 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        int int6 = stackTestDriver5.size();
        stackTestDriver5.clear();
        int int8 = stackTestDriver5.size();
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) int8);
        java.lang.Object obj10 = stackTestDriver0.peek();
        experiment.util.StackTestDriver stackTestDriver11 = new experiment.util.StackTestDriver();
        java.lang.Object obj13 = stackTestDriver11.push((java.lang.Object) (byte) -1);
        java.lang.Object obj14 = stackTestDriver11.peek();
        stackTestDriver11.clear();
        experiment.util.StackTestDriver stackTestDriver16 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver17 = new experiment.util.StackTestDriver();
        int int18 = stackTestDriver17.size();
        stackTestDriver17.clear();
        boolean boolean20 = stackTestDriver17.isEmpty();
        boolean boolean21 = stackTestDriver17.isEmpty();
        java.lang.Object obj22 = stackTestDriver16.push((java.lang.Object) stackTestDriver17);
        java.lang.Object obj23 = stackTestDriver11.push(obj22);
        java.lang.Object obj24 = stackTestDriver0.push((java.lang.Object) stackTestDriver11);
        java.lang.Class<?> wildcardClass25 = stackTestDriver11.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) -1 + "'", obj3, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0 + "'", obj9, 0);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 0 + "'", obj10, 0);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (byte) -1 + "'", obj13, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (byte) -1 + "'", obj14, (byte) -1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test228");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = stackTestDriver0.peek();
        boolean boolean4 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        int int6 = stackTestDriver5.size();
        stackTestDriver5.clear();
        int int8 = stackTestDriver5.size();
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) int8);
        boolean boolean10 = stackTestDriver0.isEmpty();
        boolean boolean11 = stackTestDriver0.isEmpty();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) -1 + "'", obj3, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0 + "'", obj9, 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test229");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) false);
        stackTestDriver0.clear();
        boolean boolean7 = stackTestDriver0.isEmpty();
        int int8 = stackTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + false + "'", obj5, false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test230");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = stackTestDriver0.peek();
        java.lang.Object obj4 = stackTestDriver0.peek();
        stackTestDriver0.clear();
        int int6 = stackTestDriver0.size();
        boolean boolean7 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        java.lang.Object obj10 = stackTestDriver8.push((java.lang.Object) (byte) -1);
        java.lang.Object obj11 = stackTestDriver8.peek();
        stackTestDriver8.clear();
        experiment.util.StackTestDriver stackTestDriver13 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver14 = new experiment.util.StackTestDriver();
        int int15 = stackTestDriver14.size();
        stackTestDriver14.clear();
        boolean boolean17 = stackTestDriver14.isEmpty();
        boolean boolean18 = stackTestDriver14.isEmpty();
        java.lang.Object obj19 = stackTestDriver13.push((java.lang.Object) stackTestDriver14);
        java.lang.Object obj20 = stackTestDriver8.push(obj19);
        experiment.util.StackTestDriver stackTestDriver21 = new experiment.util.StackTestDriver();
        java.lang.Object obj23 = stackTestDriver21.push((java.lang.Object) (byte) -1);
        java.lang.Object obj24 = stackTestDriver21.peek();
        java.lang.Object obj25 = stackTestDriver21.peek();
        java.lang.Class<?> wildcardClass26 = obj25.getClass();
        java.lang.Object obj27 = stackTestDriver8.push(obj25);
        experiment.util.StackTestDriver stackTestDriver28 = new experiment.util.StackTestDriver();
        int int29 = stackTestDriver28.size();
        boolean boolean30 = stackTestDriver28.isEmpty();
        experiment.util.StackTestDriver stackTestDriver31 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver32 = new experiment.util.StackTestDriver();
        int int33 = stackTestDriver32.size();
        stackTestDriver32.clear();
        boolean boolean35 = stackTestDriver32.isEmpty();
        boolean boolean36 = stackTestDriver32.isEmpty();
        java.lang.Object obj37 = stackTestDriver31.push((java.lang.Object) stackTestDriver32);
        java.lang.Object obj38 = stackTestDriver28.push((java.lang.Object) stackTestDriver31);
        java.lang.Object obj39 = stackTestDriver8.push(obj38);
        experiment.util.StackTestDriver stackTestDriver40 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver41 = new experiment.util.StackTestDriver();
        int int42 = stackTestDriver41.size();
        stackTestDriver41.clear();
        boolean boolean44 = stackTestDriver41.isEmpty();
        boolean boolean45 = stackTestDriver41.isEmpty();
        java.lang.Object obj46 = stackTestDriver40.push((java.lang.Object) stackTestDriver41);
        java.lang.Object obj47 = stackTestDriver8.push((java.lang.Object) stackTestDriver40);
        java.lang.Object obj48 = stackTestDriver0.push((java.lang.Object) stackTestDriver40);
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) -1 + "'", obj3, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) -1 + "'", obj11, (byte) -1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (byte) -1 + "'", obj23, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (byte) -1 + "'", obj24, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (byte) -1 + "'", obj25, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + (byte) -1 + "'", obj27, (byte) -1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertNotNull(obj48);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test231");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = stackTestDriver0.peek();
        int int4 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        int int6 = stackTestDriver5.size();
        stackTestDriver5.clear();
        boolean boolean8 = stackTestDriver5.isEmpty();
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) boolean8);
        java.lang.Object obj11 = stackTestDriver0.push((java.lang.Object) 0.0d);
        experiment.util.StackTestDriver stackTestDriver12 = new experiment.util.StackTestDriver();
        int int13 = stackTestDriver12.size();
        boolean boolean14 = stackTestDriver12.isEmpty();
        int int15 = stackTestDriver12.size();
        experiment.util.StackTestDriver stackTestDriver16 = new experiment.util.StackTestDriver();
        int int17 = stackTestDriver16.size();
        stackTestDriver16.clear();
        boolean boolean19 = stackTestDriver16.isEmpty();
        java.lang.Object obj21 = stackTestDriver16.push((java.lang.Object) false);
        stackTestDriver16.clear();
        boolean boolean23 = stackTestDriver16.isEmpty();
        int int24 = stackTestDriver16.size();
        boolean boolean25 = stackTestDriver16.isEmpty();
        int int26 = stackTestDriver16.size();
        java.lang.Object obj27 = stackTestDriver12.push((java.lang.Object) stackTestDriver16);
        experiment.util.StackTestDriver stackTestDriver28 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver29 = new experiment.util.StackTestDriver();
        int int30 = stackTestDriver29.size();
        stackTestDriver29.clear();
        boolean boolean32 = stackTestDriver29.isEmpty();
        boolean boolean33 = stackTestDriver29.isEmpty();
        java.lang.Object obj34 = stackTestDriver28.push((java.lang.Object) stackTestDriver29);
        java.lang.Object obj35 = stackTestDriver28.peek();
        experiment.util.StackTestDriver stackTestDriver36 = new experiment.util.StackTestDriver();
        int int37 = stackTestDriver36.size();
        stackTestDriver36.clear();
        boolean boolean39 = stackTestDriver36.isEmpty();
        java.lang.Object obj41 = stackTestDriver36.push((java.lang.Object) (-1L));
        java.lang.Object obj42 = stackTestDriver28.push(obj41);
        experiment.util.StackTestDriver stackTestDriver43 = new experiment.util.StackTestDriver();
        java.lang.Object obj45 = stackTestDriver43.push((java.lang.Object) (byte) -1);
        java.lang.Object obj46 = stackTestDriver43.peek();
        boolean boolean47 = stackTestDriver43.isEmpty();
        java.lang.Object obj48 = stackTestDriver28.push((java.lang.Object) stackTestDriver43);
        java.lang.Object obj49 = stackTestDriver12.push((java.lang.Object) stackTestDriver43);
        int int50 = stackTestDriver43.size();
        java.lang.Object obj51 = stackTestDriver0.push((java.lang.Object) int50);
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) -1 + "'", obj3, (byte) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + true + "'", obj9, true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 0.0d + "'", obj11, 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + false + "'", obj21, false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + (-1L) + "'", obj41, (-1L));
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + (-1L) + "'", obj42, (-1L));
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + (byte) -1 + "'", obj45, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + (byte) -1 + "'", obj46, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertEquals("'" + obj51 + "' != '" + 1 + "'", obj51, 1);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test232");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        java.lang.Class<?> wildcardClass4 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test233");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
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
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) -1 + "'", obj3, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) -1 + "'", obj5, (byte) -1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test234");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver1 = new experiment.util.StackTestDriver();
        int int2 = stackTestDriver1.size();
        stackTestDriver1.clear();
        boolean boolean4 = stackTestDriver1.isEmpty();
        boolean boolean5 = stackTestDriver1.isEmpty();
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) stackTestDriver1);
        java.lang.Object obj7 = stackTestDriver0.peek();
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        int int9 = stackTestDriver8.size();
        stackTestDriver8.clear();
        boolean boolean11 = stackTestDriver8.isEmpty();
        java.lang.Object obj13 = stackTestDriver8.push((java.lang.Object) (-1L));
        java.lang.Object obj14 = stackTestDriver0.push(obj13);
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        java.lang.Object obj17 = stackTestDriver15.push((java.lang.Object) (byte) -1);
        java.lang.Object obj18 = stackTestDriver15.peek();
        boolean boolean19 = stackTestDriver15.isEmpty();
        java.lang.Object obj20 = stackTestDriver0.push((java.lang.Object) stackTestDriver15);
        stackTestDriver15.clear();
        stackTestDriver15.clear();
        stackTestDriver15.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (-1L) + "'", obj13, (-1L));
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1L) + "'", obj14, (-1L));
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) -1 + "'", obj17, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (byte) -1 + "'", obj18, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(obj20);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test235");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver1 = new experiment.util.StackTestDriver();
        int int2 = stackTestDriver1.size();
        stackTestDriver1.clear();
        boolean boolean4 = stackTestDriver1.isEmpty();
        boolean boolean5 = stackTestDriver1.isEmpty();
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) stackTestDriver1);
        java.lang.Object obj7 = stackTestDriver0.peek();
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        int int9 = stackTestDriver8.size();
        stackTestDriver8.clear();
        boolean boolean11 = stackTestDriver8.isEmpty();
        java.lang.Object obj13 = stackTestDriver8.push((java.lang.Object) (-1L));
        java.lang.Object obj14 = stackTestDriver0.push(obj13);
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        java.lang.Object obj17 = stackTestDriver15.push((java.lang.Object) (byte) -1);
        java.lang.Object obj18 = stackTestDriver15.peek();
        boolean boolean19 = stackTestDriver15.isEmpty();
        java.lang.Object obj20 = stackTestDriver0.push((java.lang.Object) stackTestDriver15);
        stackTestDriver0.clear();
        boolean boolean22 = stackTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (-1L) + "'", obj13, (-1L));
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1L) + "'", obj14, (-1L));
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) -1 + "'", obj17, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (byte) -1 + "'", obj18, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test236");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver3 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        stackTestDriver4.clear();
        boolean boolean7 = stackTestDriver4.isEmpty();
        boolean boolean8 = stackTestDriver4.isEmpty();
        java.lang.Object obj9 = stackTestDriver3.push((java.lang.Object) stackTestDriver4);
        java.lang.Object obj10 = stackTestDriver0.push((java.lang.Object) stackTestDriver3);
        java.lang.Object obj12 = stackTestDriver0.push((java.lang.Object) ' ');
        int int13 = stackTestDriver0.size();
        java.lang.Object obj14 = stackTestDriver0.peek();
        boolean boolean15 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + ' ' + "'", obj12, ' ');
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + ' ' + "'", obj14, ' ');
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test237");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver1 = new experiment.util.StackTestDriver();
        int int2 = stackTestDriver1.size();
        stackTestDriver1.clear();
        boolean boolean4 = stackTestDriver1.isEmpty();
        boolean boolean5 = stackTestDriver1.isEmpty();
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) stackTestDriver1);
        java.lang.Object obj7 = stackTestDriver0.peek();
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        int int9 = stackTestDriver8.size();
        stackTestDriver8.clear();
        boolean boolean11 = stackTestDriver8.isEmpty();
        java.lang.Object obj13 = stackTestDriver8.push((java.lang.Object) (-1L));
        java.lang.Object obj14 = stackTestDriver0.push(obj13);
        java.lang.Object obj15 = stackTestDriver0.pop();
        java.lang.Class<?> wildcardClass16 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (-1L) + "'", obj13, (-1L));
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1L) + "'", obj14, (-1L));
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (-1L) + "'", obj15, (-1L));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test238");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        int int3 = stackTestDriver0.size();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Class<?> wildcardClass6 = stackTestDriver5.getClass();
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) wildcardClass6);
        java.lang.Object obj8 = stackTestDriver0.peek();
        stackTestDriver0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
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
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test239");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        int int3 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        stackTestDriver4.clear();
        boolean boolean7 = stackTestDriver4.isEmpty();
        java.lang.Object obj9 = stackTestDriver4.push((java.lang.Object) false);
        stackTestDriver4.clear();
        boolean boolean11 = stackTestDriver4.isEmpty();
        int int12 = stackTestDriver4.size();
        boolean boolean13 = stackTestDriver4.isEmpty();
        int int14 = stackTestDriver4.size();
        java.lang.Object obj15 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        int int16 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver17 = new experiment.util.StackTestDriver();
        int int18 = stackTestDriver17.size();
        boolean boolean19 = stackTestDriver17.isEmpty();
        experiment.util.StackTestDriver stackTestDriver20 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver21 = new experiment.util.StackTestDriver();
        int int22 = stackTestDriver21.size();
        stackTestDriver21.clear();
        boolean boolean24 = stackTestDriver21.isEmpty();
        boolean boolean25 = stackTestDriver21.isEmpty();
        java.lang.Object obj26 = stackTestDriver20.push((java.lang.Object) stackTestDriver21);
        java.lang.Object obj27 = stackTestDriver17.push((java.lang.Object) stackTestDriver20);
        java.lang.Object obj28 = stackTestDriver20.pop();
        java.lang.Object obj29 = stackTestDriver0.push(obj28);
        java.lang.Object obj30 = stackTestDriver0.pop();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + false + "'", obj9, false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNotNull(obj30);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test240");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver1 = new experiment.util.StackTestDriver();
        int int2 = stackTestDriver1.size();
        stackTestDriver1.clear();
        boolean boolean4 = stackTestDriver1.isEmpty();
        boolean boolean5 = stackTestDriver1.isEmpty();
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) stackTestDriver1);
        java.lang.Object obj7 = stackTestDriver0.peek();
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        int int9 = stackTestDriver8.size();
        stackTestDriver8.clear();
        boolean boolean11 = stackTestDriver8.isEmpty();
        java.lang.Object obj13 = stackTestDriver8.push((java.lang.Object) (-1L));
        java.lang.Object obj14 = stackTestDriver0.push(obj13);
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        java.lang.Object obj17 = stackTestDriver15.push((java.lang.Object) (byte) -1);
        java.lang.Object obj18 = stackTestDriver15.peek();
        boolean boolean19 = stackTestDriver15.isEmpty();
        java.lang.Object obj20 = stackTestDriver0.push((java.lang.Object) stackTestDriver15);
        java.lang.Object obj21 = stackTestDriver0.peek();
        java.lang.Object obj23 = stackTestDriver0.push((java.lang.Object) false);
        java.lang.Object obj24 = stackTestDriver0.peek();
        int int25 = stackTestDriver0.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (-1L) + "'", obj13, (-1L));
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1L) + "'", obj14, (-1L));
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) -1 + "'", obj17, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (byte) -1 + "'", obj18, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + false + "'", obj23, false);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + false + "'", obj24, false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 4 + "'", int25 == 4);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test241");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) false);
        int int6 = stackTestDriver0.size();
        int int7 = stackTestDriver0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + false + "'", obj5, false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test242");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver3 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        stackTestDriver4.clear();
        boolean boolean7 = stackTestDriver4.isEmpty();
        boolean boolean8 = stackTestDriver4.isEmpty();
        java.lang.Object obj9 = stackTestDriver3.push((java.lang.Object) stackTestDriver4);
        java.lang.Object obj10 = stackTestDriver0.push((java.lang.Object) stackTestDriver3);
        experiment.util.StackTestDriver stackTestDriver11 = new experiment.util.StackTestDriver();
        int int12 = stackTestDriver11.size();
        boolean boolean13 = stackTestDriver11.isEmpty();
        experiment.util.StackTestDriver stackTestDriver14 = new experiment.util.StackTestDriver();
        int int15 = stackTestDriver14.size();
        boolean boolean16 = stackTestDriver14.isEmpty();
        experiment.util.StackTestDriver stackTestDriver17 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver18 = new experiment.util.StackTestDriver();
        int int19 = stackTestDriver18.size();
        stackTestDriver18.clear();
        boolean boolean21 = stackTestDriver18.isEmpty();
        boolean boolean22 = stackTestDriver18.isEmpty();
        java.lang.Object obj23 = stackTestDriver17.push((java.lang.Object) stackTestDriver18);
        java.lang.Object obj24 = stackTestDriver14.push((java.lang.Object) stackTestDriver17);
        java.lang.Object obj25 = stackTestDriver17.pop();
        java.lang.Object obj26 = stackTestDriver11.push(obj25);
        java.lang.Object obj27 = stackTestDriver0.push((java.lang.Object) stackTestDriver11);
        experiment.util.StackTestDriver stackTestDriver28 = new experiment.util.StackTestDriver();
        java.lang.Object obj30 = stackTestDriver28.push((java.lang.Object) (byte) -1);
        java.lang.Object obj31 = stackTestDriver28.peek();
        boolean boolean32 = stackTestDriver28.isEmpty();
        experiment.util.StackTestDriver stackTestDriver33 = new experiment.util.StackTestDriver();
        int int34 = stackTestDriver33.size();
        stackTestDriver33.clear();
        int int36 = stackTestDriver33.size();
        java.lang.Object obj37 = stackTestDriver28.push((java.lang.Object) int36);
        java.lang.Object obj38 = stackTestDriver28.peek();
        experiment.util.StackTestDriver stackTestDriver39 = new experiment.util.StackTestDriver();
        java.lang.Object obj41 = stackTestDriver39.push((java.lang.Object) (byte) -1);
        java.lang.Object obj42 = stackTestDriver39.peek();
        stackTestDriver39.clear();
        experiment.util.StackTestDriver stackTestDriver44 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver45 = new experiment.util.StackTestDriver();
        int int46 = stackTestDriver45.size();
        stackTestDriver45.clear();
        boolean boolean48 = stackTestDriver45.isEmpty();
        boolean boolean49 = stackTestDriver45.isEmpty();
        java.lang.Object obj50 = stackTestDriver44.push((java.lang.Object) stackTestDriver45);
        java.lang.Object obj51 = stackTestDriver39.push(obj50);
        java.lang.Object obj52 = stackTestDriver28.push((java.lang.Object) stackTestDriver39);
        java.lang.Object obj53 = stackTestDriver0.push((java.lang.Object) stackTestDriver28);
        int int54 = stackTestDriver28.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + (byte) -1 + "'", obj30, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + (byte) -1 + "'", obj31, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + 0 + "'", obj37, 0);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + 0 + "'", obj38, 0);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + (byte) -1 + "'", obj41, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + (byte) -1 + "'", obj42, (byte) -1);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(obj50);
        org.junit.Assert.assertNotNull(obj51);
        org.junit.Assert.assertNotNull(obj52);
        org.junit.Assert.assertNotNull(obj53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 3 + "'", int54 == 3);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test243");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        int int3 = stackTestDriver0.size();
        java.lang.Object obj4 = stackTestDriver0.pop();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) -1 + "'", obj4, (byte) -1);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test244");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        int int3 = stackTestDriver0.size();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        java.lang.Class<?> wildcardClass6 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test245");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver1 = new experiment.util.StackTestDriver();
        int int2 = stackTestDriver1.size();
        stackTestDriver1.clear();
        boolean boolean4 = stackTestDriver1.isEmpty();
        boolean boolean5 = stackTestDriver1.isEmpty();
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) stackTestDriver1);
        stackTestDriver1.clear();
        java.lang.Class<?> wildcardClass8 = stackTestDriver1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test246");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver3 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        stackTestDriver4.clear();
        boolean boolean7 = stackTestDriver4.isEmpty();
        boolean boolean8 = stackTestDriver4.isEmpty();
        java.lang.Object obj9 = stackTestDriver3.push((java.lang.Object) stackTestDriver4);
        java.lang.Object obj10 = stackTestDriver0.push((java.lang.Object) stackTestDriver3);
        java.lang.Object obj12 = stackTestDriver0.push((java.lang.Object) ' ');
        int int13 = stackTestDriver0.size();
        java.lang.Object obj14 = stackTestDriver0.peek();
        int int15 = stackTestDriver0.size();
        int int16 = stackTestDriver0.size();
        boolean boolean17 = stackTestDriver0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + ' ' + "'", obj12, ' ');
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + ' ' + "'", obj14, ' ');
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test247");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        int int4 = stackTestDriver0.size();
        int int5 = stackTestDriver0.size();
        stackTestDriver0.clear();
        int int7 = stackTestDriver0.size();
        boolean boolean8 = stackTestDriver0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test248");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = stackTestDriver0.peek();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        int int7 = stackTestDriver6.size();
        stackTestDriver6.clear();
        boolean boolean9 = stackTestDriver6.isEmpty();
        boolean boolean10 = stackTestDriver6.isEmpty();
        java.lang.Object obj11 = stackTestDriver5.push((java.lang.Object) stackTestDriver6);
        java.lang.Object obj12 = stackTestDriver0.push(obj11);
        experiment.util.StackTestDriver stackTestDriver13 = new experiment.util.StackTestDriver();
        java.lang.Object obj15 = stackTestDriver13.push((java.lang.Object) (byte) -1);
        java.lang.Object obj16 = stackTestDriver13.peek();
        java.lang.Object obj17 = stackTestDriver13.peek();
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        java.lang.Object obj19 = stackTestDriver0.push(obj17);
        experiment.util.StackTestDriver stackTestDriver20 = new experiment.util.StackTestDriver();
        int int21 = stackTestDriver20.size();
        boolean boolean22 = stackTestDriver20.isEmpty();
        experiment.util.StackTestDriver stackTestDriver23 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver24 = new experiment.util.StackTestDriver();
        int int25 = stackTestDriver24.size();
        stackTestDriver24.clear();
        boolean boolean27 = stackTestDriver24.isEmpty();
        boolean boolean28 = stackTestDriver24.isEmpty();
        java.lang.Object obj29 = stackTestDriver23.push((java.lang.Object) stackTestDriver24);
        java.lang.Object obj30 = stackTestDriver20.push((java.lang.Object) stackTestDriver23);
        java.lang.Object obj31 = stackTestDriver0.push(obj30);
        int int32 = stackTestDriver0.size();
        java.lang.Object obj33 = stackTestDriver0.peek();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) -1 + "'", obj3, (byte) -1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (byte) -1 + "'", obj15, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (byte) -1 + "'", obj16, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) -1 + "'", obj17, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (byte) -1 + "'", obj19, (byte) -1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 3 + "'", int32 == 3);
        org.junit.Assert.assertNotNull(obj33);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test249");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver3 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        stackTestDriver4.clear();
        boolean boolean7 = stackTestDriver4.isEmpty();
        boolean boolean8 = stackTestDriver4.isEmpty();
        java.lang.Object obj9 = stackTestDriver3.push((java.lang.Object) stackTestDriver4);
        java.lang.Object obj10 = stackTestDriver0.push((java.lang.Object) stackTestDriver3);
        experiment.util.StackTestDriver stackTestDriver11 = new experiment.util.StackTestDriver();
        int int12 = stackTestDriver11.size();
        boolean boolean13 = stackTestDriver11.isEmpty();
        experiment.util.StackTestDriver stackTestDriver14 = new experiment.util.StackTestDriver();
        int int15 = stackTestDriver14.size();
        boolean boolean16 = stackTestDriver14.isEmpty();
        experiment.util.StackTestDriver stackTestDriver17 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver18 = new experiment.util.StackTestDriver();
        int int19 = stackTestDriver18.size();
        stackTestDriver18.clear();
        boolean boolean21 = stackTestDriver18.isEmpty();
        boolean boolean22 = stackTestDriver18.isEmpty();
        java.lang.Object obj23 = stackTestDriver17.push((java.lang.Object) stackTestDriver18);
        java.lang.Object obj24 = stackTestDriver14.push((java.lang.Object) stackTestDriver17);
        java.lang.Object obj25 = stackTestDriver17.pop();
        java.lang.Object obj26 = stackTestDriver11.push(obj25);
        java.lang.Object obj27 = stackTestDriver0.push((java.lang.Object) stackTestDriver11);
        experiment.util.StackTestDriver stackTestDriver28 = new experiment.util.StackTestDriver();
        java.lang.Object obj30 = stackTestDriver28.push((java.lang.Object) (byte) -1);
        java.lang.Object obj31 = stackTestDriver28.peek();
        boolean boolean32 = stackTestDriver28.isEmpty();
        experiment.util.StackTestDriver stackTestDriver33 = new experiment.util.StackTestDriver();
        int int34 = stackTestDriver33.size();
        stackTestDriver33.clear();
        int int36 = stackTestDriver33.size();
        java.lang.Object obj37 = stackTestDriver28.push((java.lang.Object) int36);
        java.lang.Object obj38 = stackTestDriver28.peek();
        experiment.util.StackTestDriver stackTestDriver39 = new experiment.util.StackTestDriver();
        java.lang.Object obj41 = stackTestDriver39.push((java.lang.Object) (byte) -1);
        java.lang.Object obj42 = stackTestDriver39.peek();
        stackTestDriver39.clear();
        experiment.util.StackTestDriver stackTestDriver44 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver45 = new experiment.util.StackTestDriver();
        int int46 = stackTestDriver45.size();
        stackTestDriver45.clear();
        boolean boolean48 = stackTestDriver45.isEmpty();
        boolean boolean49 = stackTestDriver45.isEmpty();
        java.lang.Object obj50 = stackTestDriver44.push((java.lang.Object) stackTestDriver45);
        java.lang.Object obj51 = stackTestDriver39.push(obj50);
        java.lang.Object obj52 = stackTestDriver28.push((java.lang.Object) stackTestDriver39);
        java.lang.Object obj53 = stackTestDriver0.push((java.lang.Object) stackTestDriver28);
        java.lang.Class<?> wildcardClass54 = obj53.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + (byte) -1 + "'", obj30, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + (byte) -1 + "'", obj31, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + 0 + "'", obj37, 0);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + 0 + "'", obj38, 0);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + (byte) -1 + "'", obj41, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + (byte) -1 + "'", obj42, (byte) -1);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(obj50);
        org.junit.Assert.assertNotNull(obj51);
        org.junit.Assert.assertNotNull(obj52);
        org.junit.Assert.assertNotNull(obj53);
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test250");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
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
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test251");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver3 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        stackTestDriver4.clear();
        boolean boolean7 = stackTestDriver4.isEmpty();
        boolean boolean8 = stackTestDriver4.isEmpty();
        java.lang.Object obj9 = stackTestDriver3.push((java.lang.Object) stackTestDriver4);
        java.lang.Object obj10 = stackTestDriver0.push((java.lang.Object) stackTestDriver3);
        java.lang.Object obj12 = stackTestDriver0.push((java.lang.Object) ' ');
        int int13 = stackTestDriver0.size();
        java.lang.Object obj14 = stackTestDriver0.peek();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver16 = new experiment.util.StackTestDriver();
        java.lang.Object obj18 = stackTestDriver16.push((java.lang.Object) (byte) -1);
        java.lang.Object obj19 = stackTestDriver16.peek();
        java.lang.Object obj20 = stackTestDriver16.peek();
        stackTestDriver16.clear();
        stackTestDriver16.clear();
        java.lang.Object obj23 = stackTestDriver0.push((java.lang.Object) stackTestDriver16);
        stackTestDriver16.clear();
        boolean boolean25 = stackTestDriver16.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + ' ' + "'", obj12, ' ');
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + ' ' + "'", obj14, ' ');
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (byte) -1 + "'", obj18, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (byte) -1 + "'", obj19, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (byte) -1 + "'", obj20, (byte) -1);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test252");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = stackTestDriver0.peek();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        int int7 = stackTestDriver6.size();
        stackTestDriver6.clear();
        boolean boolean9 = stackTestDriver6.isEmpty();
        boolean boolean10 = stackTestDriver6.isEmpty();
        java.lang.Object obj11 = stackTestDriver5.push((java.lang.Object) stackTestDriver6);
        java.lang.Object obj12 = stackTestDriver0.push(obj11);
        experiment.util.StackTestDriver stackTestDriver13 = new experiment.util.StackTestDriver();
        java.lang.Object obj15 = stackTestDriver13.push((java.lang.Object) (byte) -1);
        java.lang.Object obj16 = stackTestDriver13.peek();
        java.lang.Object obj17 = stackTestDriver13.peek();
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        java.lang.Object obj19 = stackTestDriver0.push(obj17);
        experiment.util.StackTestDriver stackTestDriver20 = new experiment.util.StackTestDriver();
        int int21 = stackTestDriver20.size();
        boolean boolean22 = stackTestDriver20.isEmpty();
        experiment.util.StackTestDriver stackTestDriver23 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver24 = new experiment.util.StackTestDriver();
        int int25 = stackTestDriver24.size();
        stackTestDriver24.clear();
        boolean boolean27 = stackTestDriver24.isEmpty();
        boolean boolean28 = stackTestDriver24.isEmpty();
        java.lang.Object obj29 = stackTestDriver23.push((java.lang.Object) stackTestDriver24);
        java.lang.Object obj30 = stackTestDriver20.push((java.lang.Object) stackTestDriver23);
        java.lang.Object obj31 = stackTestDriver0.push(obj30);
        experiment.util.StackTestDriver stackTestDriver32 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver33 = new experiment.util.StackTestDriver();
        int int34 = stackTestDriver33.size();
        stackTestDriver33.clear();
        boolean boolean36 = stackTestDriver33.isEmpty();
        boolean boolean37 = stackTestDriver33.isEmpty();
        java.lang.Object obj38 = stackTestDriver32.push((java.lang.Object) stackTestDriver33);
        java.lang.Object obj39 = stackTestDriver0.push((java.lang.Object) stackTestDriver32);
        experiment.util.StackTestDriver stackTestDriver40 = new experiment.util.StackTestDriver();
        java.lang.Object obj42 = stackTestDriver40.push((java.lang.Object) (byte) -1);
        java.lang.Object obj43 = stackTestDriver40.peek();
        java.lang.Object obj44 = stackTestDriver0.push((java.lang.Object) stackTestDriver40);
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) -1 + "'", obj3, (byte) -1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (byte) -1 + "'", obj15, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (byte) -1 + "'", obj16, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) -1 + "'", obj17, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (byte) -1 + "'", obj19, (byte) -1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + (byte) -1 + "'", obj42, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + (byte) -1 + "'", obj43, (byte) -1);
        org.junit.Assert.assertNotNull(obj44);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test253");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = stackTestDriver0.peek();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        int int7 = stackTestDriver6.size();
        stackTestDriver6.clear();
        boolean boolean9 = stackTestDriver6.isEmpty();
        boolean boolean10 = stackTestDriver6.isEmpty();
        java.lang.Object obj11 = stackTestDriver5.push((java.lang.Object) stackTestDriver6);
        java.lang.Object obj12 = stackTestDriver0.push(obj11);
        experiment.util.StackTestDriver stackTestDriver13 = new experiment.util.StackTestDriver();
        java.lang.Object obj15 = stackTestDriver13.push((java.lang.Object) (byte) -1);
        java.lang.Object obj16 = stackTestDriver13.peek();
        java.lang.Object obj17 = stackTestDriver13.peek();
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        java.lang.Object obj19 = stackTestDriver0.push(obj17);
        experiment.util.StackTestDriver stackTestDriver20 = new experiment.util.StackTestDriver();
        int int21 = stackTestDriver20.size();
        boolean boolean22 = stackTestDriver20.isEmpty();
        experiment.util.StackTestDriver stackTestDriver23 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver24 = new experiment.util.StackTestDriver();
        int int25 = stackTestDriver24.size();
        stackTestDriver24.clear();
        boolean boolean27 = stackTestDriver24.isEmpty();
        boolean boolean28 = stackTestDriver24.isEmpty();
        java.lang.Object obj29 = stackTestDriver23.push((java.lang.Object) stackTestDriver24);
        java.lang.Object obj30 = stackTestDriver20.push((java.lang.Object) stackTestDriver23);
        java.lang.Object obj31 = stackTestDriver0.push(obj30);
        experiment.util.StackTestDriver stackTestDriver32 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver33 = new experiment.util.StackTestDriver();
        int int34 = stackTestDriver33.size();
        stackTestDriver33.clear();
        boolean boolean36 = stackTestDriver33.isEmpty();
        boolean boolean37 = stackTestDriver33.isEmpty();
        java.lang.Object obj38 = stackTestDriver32.push((java.lang.Object) stackTestDriver33);
        java.lang.Object obj39 = stackTestDriver0.push((java.lang.Object) stackTestDriver32);
        boolean boolean40 = stackTestDriver32.isEmpty();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) -1 + "'", obj3, (byte) -1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (byte) -1 + "'", obj15, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (byte) -1 + "'", obj16, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) -1 + "'", obj17, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (byte) -1 + "'", obj19, (byte) -1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test254");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Class<?> wildcardClass3 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test255");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver1 = new experiment.util.StackTestDriver();
        int int2 = stackTestDriver1.size();
        stackTestDriver1.clear();
        boolean boolean4 = stackTestDriver1.isEmpty();
        boolean boolean5 = stackTestDriver1.isEmpty();
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) stackTestDriver1);
        boolean boolean7 = stackTestDriver0.isEmpty();
        java.lang.Object obj8 = stackTestDriver0.peek();
        int int9 = stackTestDriver0.size();
        int int10 = stackTestDriver0.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_2070236138_1024_0.test256");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        int int3 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        stackTestDriver4.clear();
        boolean boolean7 = stackTestDriver4.isEmpty();
        java.lang.Object obj9 = stackTestDriver4.push((java.lang.Object) false);
        stackTestDriver4.clear();
        boolean boolean11 = stackTestDriver4.isEmpty();
        int int12 = stackTestDriver4.size();
        boolean boolean13 = stackTestDriver4.isEmpty();
        int int14 = stackTestDriver4.size();
        java.lang.Object obj15 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        experiment.util.StackTestDriver stackTestDriver16 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver17 = new experiment.util.StackTestDriver();
        int int18 = stackTestDriver17.size();
        stackTestDriver17.clear();
        boolean boolean20 = stackTestDriver17.isEmpty();
        boolean boolean21 = stackTestDriver17.isEmpty();
        java.lang.Object obj22 = stackTestDriver16.push((java.lang.Object) stackTestDriver17);
        java.lang.Object obj23 = stackTestDriver16.peek();
        experiment.util.StackTestDriver stackTestDriver24 = new experiment.util.StackTestDriver();
        int int25 = stackTestDriver24.size();
        stackTestDriver24.clear();
        boolean boolean27 = stackTestDriver24.isEmpty();
        java.lang.Object obj29 = stackTestDriver24.push((java.lang.Object) (-1L));
        java.lang.Object obj30 = stackTestDriver16.push(obj29);
        experiment.util.StackTestDriver stackTestDriver31 = new experiment.util.StackTestDriver();
        java.lang.Object obj33 = stackTestDriver31.push((java.lang.Object) (byte) -1);
        java.lang.Object obj34 = stackTestDriver31.peek();
        boolean boolean35 = stackTestDriver31.isEmpty();
        java.lang.Object obj36 = stackTestDriver16.push((java.lang.Object) stackTestDriver31);
        java.lang.Object obj37 = stackTestDriver0.push((java.lang.Object) stackTestDriver31);
        int int38 = stackTestDriver31.size();
        stackTestDriver31.clear();
        stackTestDriver31.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + false + "'", obj9, false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + (-1L) + "'", obj29, (-1L));
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + (-1L) + "'", obj30, (-1L));
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + (byte) -1 + "'", obj33, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + (byte) -1 + "'", obj34, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
    }

}
