package experiment.util.test;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Regression_StackTest_1256357748_128_s {

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
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test001");
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
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test002");
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
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test003");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
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
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test004");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        int int4 = stackTestDriver0.size();
        boolean boolean5 = stackTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test005");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test006");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        java.lang.Object obj3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = stackTestDriver0.push(obj3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test007");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test008");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        int int4 = stackTestDriver0.size();
        boolean boolean5 = stackTestDriver0.isEmpty();
        java.lang.Object obj6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = stackTestDriver0.push(obj6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test009");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        java.lang.Class<?> wildcardClass2 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test010");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        int int2 = stackTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test011");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        int int4 = stackTestDriver0.size();
        boolean boolean5 = stackTestDriver0.isEmpty();
        boolean boolean6 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        java.lang.Object obj8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = stackTestDriver0.push(obj8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test012");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (-1.0d));
        stackTestDriver0.clear();
        java.lang.Class<?> wildcardClass7 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test013");
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
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test014");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (short) 100);
        int int5 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        stackTestDriver6.clear();
        stackTestDriver6.clear();
        stackTestDriver6.clear();
        java.lang.Class<?> wildcardClass10 = stackTestDriver6.getClass();
        java.lang.Object obj11 = stackTestDriver0.push((java.lang.Object) stackTestDriver6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = stackTestDriver6.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) 100 + "'", obj4, (short) 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test015");
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
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test016");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        int int4 = stackTestDriver0.size();
        boolean boolean5 = stackTestDriver0.isEmpty();
        boolean boolean6 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test017");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        int int4 = stackTestDriver0.size();
        boolean boolean5 = stackTestDriver0.isEmpty();
        boolean boolean6 = stackTestDriver0.isEmpty();
        boolean boolean7 = stackTestDriver0.isEmpty();
        java.lang.Class<?> wildcardClass8 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test018");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
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
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test019");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Class<?> wildcardClass4 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test020");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (-1.0d));
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test021");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (short) 100);
        int int5 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        stackTestDriver6.clear();
        stackTestDriver6.clear();
        stackTestDriver6.clear();
        java.lang.Class<?> wildcardClass10 = stackTestDriver6.getClass();
        java.lang.Object obj11 = stackTestDriver0.push((java.lang.Object) stackTestDriver6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = stackTestDriver6.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) 100 + "'", obj4, (short) 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test022");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        int int4 = stackTestDriver0.size();
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) (short) 10);
        java.lang.Class<?> wildcardClass7 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 10 + "'", obj6, (short) 10);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test023");
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
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test024");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        int int4 = stackTestDriver0.size();
        boolean boolean5 = stackTestDriver0.isEmpty();
        boolean boolean6 = stackTestDriver0.isEmpty();
        boolean boolean7 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test025");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (-1.0d));
        java.lang.Object obj6 = stackTestDriver0.peek();
        java.lang.Object obj7 = stackTestDriver0.pop();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1.0d) + "'", obj6, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test026");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        int int4 = stackTestDriver0.size();
        int int5 = stackTestDriver0.size();
        java.lang.Class<?> wildcardClass6 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test027");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        int int4 = stackTestDriver0.size();
        boolean boolean5 = stackTestDriver0.isEmpty();
        boolean boolean6 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test028");
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
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test029");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (short) 100);
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) 100 + "'", obj4, (short) 100);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test030");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test031");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (short) 100);
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        stackTestDriver5.clear();
        stackTestDriver5.clear();
        stackTestDriver5.clear();
        int int9 = stackTestDriver5.size();
        boolean boolean10 = stackTestDriver5.isEmpty();
        java.lang.Class<?> wildcardClass11 = stackTestDriver5.getClass();
        java.lang.Object obj12 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        int int13 = stackTestDriver5.size();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) 100 + "'", obj4, (short) 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test032");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
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
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test033");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (short) 100);
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        stackTestDriver5.clear();
        stackTestDriver5.clear();
        stackTestDriver5.clear();
        int int9 = stackTestDriver5.size();
        boolean boolean10 = stackTestDriver5.isEmpty();
        java.lang.Class<?> wildcardClass11 = stackTestDriver5.getClass();
        java.lang.Object obj12 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        java.lang.Class<?> wildcardClass13 = stackTestDriver5.getClass();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) 100 + "'", obj4, (short) 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test034");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        int int4 = stackTestDriver0.size();
        boolean boolean5 = stackTestDriver0.isEmpty();
        boolean boolean6 = stackTestDriver0.isEmpty();
        boolean boolean7 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        java.lang.Class<?> wildcardClass9 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test035");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) 1.0d);
        java.lang.Object obj6 = stackTestDriver0.pop();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 1.0d + "'", obj5, 1.0d);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0d + "'", obj6, 1.0d);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test036");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        int int2 = stackTestDriver0.size();
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test037");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (short) 100);
        int int5 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        stackTestDriver6.clear();
        stackTestDriver6.clear();
        stackTestDriver6.clear();
        java.lang.Class<?> wildcardClass10 = stackTestDriver6.getClass();
        java.lang.Object obj11 = stackTestDriver0.push((java.lang.Object) stackTestDriver6);
        boolean boolean12 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) 100 + "'", obj4, (short) 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test038");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (-1.0d));
        boolean boolean6 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test039");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (short) 100);
        stackTestDriver0.clear();
        java.lang.Class<?> wildcardClass6 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) 100 + "'", obj4, (short) 100);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test040");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        int int4 = stackTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test041");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (-1.0d));
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test042");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (short) 100);
        int int5 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        stackTestDriver6.clear();
        stackTestDriver6.clear();
        stackTestDriver6.clear();
        java.lang.Class<?> wildcardClass10 = stackTestDriver6.getClass();
        java.lang.Object obj11 = stackTestDriver0.push((java.lang.Object) stackTestDriver6);
        boolean boolean12 = stackTestDriver6.isEmpty();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) 100 + "'", obj4, (short) 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test043");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (-1.0d));
        java.lang.Class<?> wildcardClass6 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test044");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        int int4 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        stackTestDriver5.clear();
        int int7 = stackTestDriver5.size();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) int7);
        int int9 = stackTestDriver0.size();
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0 + "'", obj8, 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test045");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (-1.0d));
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) 0);
        boolean boolean8 = stackTestDriver0.isEmpty();
        java.lang.Object obj9 = stackTestDriver0.pop();
        stackTestDriver0.clear();
        boolean boolean11 = stackTestDriver0.isEmpty();
        java.lang.Class<?> wildcardClass12 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0 + "'", obj7, 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0 + "'", obj9, 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test046");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) false);
        java.lang.Object obj6 = stackTestDriver0.pop();
        java.lang.Class<?> wildcardClass7 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + false + "'", obj5, false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + false + "'", obj6, false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test047");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (short) 100);
        boolean boolean5 = stackTestDriver0.isEmpty();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) 100 + "'", obj4, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test048");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        int int4 = stackTestDriver0.size();
        int int5 = stackTestDriver0.size();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver7 = new experiment.util.StackTestDriver();
        stackTestDriver7.clear();
        stackTestDriver7.clear();
        stackTestDriver7.clear();
        int int11 = stackTestDriver7.size();
        java.lang.Object obj12 = stackTestDriver0.push((java.lang.Object) stackTestDriver7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = stackTestDriver7.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test049");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        java.lang.Class<?> wildcardClass4 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test050");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        java.lang.Class<?> wildcardClass4 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test051");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (-1.0d));
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) 0);
        boolean boolean8 = stackTestDriver0.isEmpty();
        java.lang.Object obj9 = stackTestDriver0.pop();
        boolean boolean10 = stackTestDriver0.isEmpty();
        java.lang.Object obj11 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver12 = new experiment.util.StackTestDriver();
        stackTestDriver12.clear();
        stackTestDriver12.clear();
        boolean boolean15 = stackTestDriver12.isEmpty();
        java.lang.Object obj17 = stackTestDriver12.push((java.lang.Object) false);
        java.lang.Object obj18 = stackTestDriver12.pop();
        java.lang.Object obj19 = stackTestDriver0.push((java.lang.Object) stackTestDriver12);
        int int20 = stackTestDriver12.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = stackTestDriver12.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0 + "'", obj7, 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0 + "'", obj9, 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (-1.0d) + "'", obj11, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + false + "'", obj17, false);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + false + "'", obj18, false);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test052");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (short) 100);
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        stackTestDriver5.clear();
        stackTestDriver5.clear();
        stackTestDriver5.clear();
        int int9 = stackTestDriver5.size();
        boolean boolean10 = stackTestDriver5.isEmpty();
        java.lang.Class<?> wildcardClass11 = stackTestDriver5.getClass();
        java.lang.Object obj12 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        java.lang.Object obj13 = stackTestDriver0.peek();
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) 100 + "'", obj4, (short) 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test053");
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
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test054");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        int int4 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        stackTestDriver5.clear();
        int int7 = stackTestDriver5.size();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) int7);
        int int9 = stackTestDriver0.size();
        stackTestDriver0.clear();
        java.lang.Object obj12 = stackTestDriver0.push((java.lang.Object) 100.0f);
        java.lang.Class<?> wildcardClass13 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0 + "'", obj8, 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0f + "'", obj12, 100.0f);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test055");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (-1.0d));
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) 0);
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) (-1.0d));
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0 + "'", obj7, 0);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (-1.0d) + "'", obj9, (-1.0d));
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test056");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        int int4 = stackTestDriver0.size();
        boolean boolean5 = stackTestDriver0.isEmpty();
        boolean boolean6 = stackTestDriver0.isEmpty();
        int int7 = stackTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test057");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (-1.0d));
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) 0);
        boolean boolean8 = stackTestDriver0.isEmpty();
        java.lang.Object obj9 = stackTestDriver0.pop();
        boolean boolean10 = stackTestDriver0.isEmpty();
        java.lang.Object obj11 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver12 = new experiment.util.StackTestDriver();
        stackTestDriver12.clear();
        stackTestDriver12.clear();
        boolean boolean15 = stackTestDriver12.isEmpty();
        java.lang.Object obj17 = stackTestDriver12.push((java.lang.Object) false);
        java.lang.Object obj18 = stackTestDriver12.pop();
        java.lang.Object obj19 = stackTestDriver0.push((java.lang.Object) stackTestDriver12);
        boolean boolean20 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0 + "'", obj7, 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0 + "'", obj9, 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (-1.0d) + "'", obj11, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + false + "'", obj17, false);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + false + "'", obj18, false);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test058");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        int int2 = stackTestDriver0.size();
        stackTestDriver0.clear();
        int int4 = stackTestDriver0.size();
        boolean boolean5 = stackTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test059");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (-1.0d));
        java.lang.Object obj6 = stackTestDriver0.peek();
        java.lang.Object obj7 = stackTestDriver0.pop();
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1.0d) + "'", obj6, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test060");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (-1.0d));
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) 0);
        boolean boolean8 = stackTestDriver0.isEmpty();
        java.lang.Object obj9 = stackTestDriver0.pop();
        boolean boolean10 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver11 = new experiment.util.StackTestDriver();
        stackTestDriver11.clear();
        int int13 = stackTestDriver11.size();
        stackTestDriver11.clear();
        int int15 = stackTestDriver11.size();
        java.lang.Object obj16 = stackTestDriver0.push((java.lang.Object) stackTestDriver11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = stackTestDriver11.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0 + "'", obj7, 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0 + "'", obj9, 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(obj16);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test061");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (-1.0d));
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) 0);
        boolean boolean8 = stackTestDriver0.isEmpty();
        java.lang.Object obj9 = stackTestDriver0.pop();
        boolean boolean10 = stackTestDriver0.isEmpty();
        java.lang.Object obj11 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver12 = new experiment.util.StackTestDriver();
        stackTestDriver12.clear();
        stackTestDriver12.clear();
        boolean boolean15 = stackTestDriver12.isEmpty();
        java.lang.Object obj17 = stackTestDriver12.push((java.lang.Object) false);
        java.lang.Object obj18 = stackTestDriver12.pop();
        java.lang.Object obj19 = stackTestDriver0.push((java.lang.Object) stackTestDriver12);
        int int20 = stackTestDriver12.size();
        stackTestDriver12.clear();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0 + "'", obj7, 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0 + "'", obj9, 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (-1.0d) + "'", obj11, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + false + "'", obj17, false);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + false + "'", obj18, false);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test062");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (-1.0d));
        stackTestDriver0.clear();
        int int7 = stackTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test063");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        int int4 = stackTestDriver0.size();
        boolean boolean5 = stackTestDriver0.isEmpty();
        boolean boolean6 = stackTestDriver0.isEmpty();
        boolean boolean7 = stackTestDriver0.isEmpty();
        int int8 = stackTestDriver0.size();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        stackTestDriver10.clear();
        stackTestDriver10.clear();
        stackTestDriver10.clear();
        int int14 = stackTestDriver10.size();
        boolean boolean15 = stackTestDriver10.isEmpty();
        boolean boolean16 = stackTestDriver10.isEmpty();
        stackTestDriver10.clear();
        java.lang.Class<?> wildcardClass18 = stackTestDriver10.getClass();
        java.lang.Object obj19 = stackTestDriver0.push((java.lang.Object) stackTestDriver10);
        java.lang.Class<?> wildcardClass20 = stackTestDriver10.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test064");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        int int4 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        stackTestDriver5.clear();
        int int7 = stackTestDriver5.size();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) int7);
        int int9 = stackTestDriver0.size();
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0 + "'", obj8, 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test065");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (-1.0d));
        boolean boolean6 = stackTestDriver0.isEmpty();
        java.lang.Object obj7 = stackTestDriver0.peek();
        java.lang.Object obj8 = stackTestDriver0.pop();
        java.lang.Class<?> wildcardClass9 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test066");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (-1.0d));
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) 0);
        boolean boolean8 = stackTestDriver0.isEmpty();
        java.lang.Object obj9 = stackTestDriver0.pop();
        boolean boolean10 = stackTestDriver0.isEmpty();
        java.lang.Object obj11 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver12 = new experiment.util.StackTestDriver();
        stackTestDriver12.clear();
        stackTestDriver12.clear();
        boolean boolean15 = stackTestDriver12.isEmpty();
        java.lang.Object obj17 = stackTestDriver12.push((java.lang.Object) false);
        java.lang.Object obj18 = stackTestDriver12.pop();
        java.lang.Object obj19 = stackTestDriver0.push((java.lang.Object) stackTestDriver12);
        int int20 = stackTestDriver12.size();
        java.lang.Class<?> wildcardClass21 = stackTestDriver12.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0 + "'", obj7, 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0 + "'", obj9, 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (-1.0d) + "'", obj11, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + false + "'", obj17, false);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + false + "'", obj18, false);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test067");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (-1.0d));
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) 0);
        boolean boolean8 = stackTestDriver0.isEmpty();
        java.lang.Object obj9 = stackTestDriver0.pop();
        boolean boolean10 = stackTestDriver0.isEmpty();
        java.lang.Object obj11 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver12 = new experiment.util.StackTestDriver();
        stackTestDriver12.clear();
        stackTestDriver12.clear();
        boolean boolean15 = stackTestDriver12.isEmpty();
        java.lang.Object obj17 = stackTestDriver12.push((java.lang.Object) false);
        java.lang.Object obj18 = stackTestDriver12.pop();
        java.lang.Object obj19 = stackTestDriver0.push((java.lang.Object) stackTestDriver12);
        java.lang.Class<?> wildcardClass20 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0 + "'", obj7, 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0 + "'", obj9, 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (-1.0d) + "'", obj11, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + false + "'", obj17, false);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + false + "'", obj18, false);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test068");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) false);
        java.lang.Object obj6 = stackTestDriver0.pop();
        int int7 = stackTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + false + "'", obj5, false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + false + "'", obj6, false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test069");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (-1.0d));
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) 0);
        boolean boolean8 = stackTestDriver0.isEmpty();
        java.lang.Object obj9 = stackTestDriver0.pop();
        stackTestDriver0.clear();
        boolean boolean11 = stackTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0 + "'", obj7, 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0 + "'", obj9, 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test070");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        int int4 = stackTestDriver0.size();
        boolean boolean5 = stackTestDriver0.isEmpty();
        boolean boolean6 = stackTestDriver0.isEmpty();
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
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test071");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        java.lang.Class<?> wildcardClass3 = stackTestDriver0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test072");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        int int2 = stackTestDriver0.size();
        stackTestDriver0.clear();
        int int4 = stackTestDriver0.size();
        int int5 = stackTestDriver0.size();
        java.lang.Class<?> wildcardClass6 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test073");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (short) 100);
        int int5 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        stackTestDriver6.clear();
        stackTestDriver6.clear();
        stackTestDriver6.clear();
        java.lang.Class<?> wildcardClass10 = stackTestDriver6.getClass();
        java.lang.Object obj11 = stackTestDriver0.push((java.lang.Object) stackTestDriver6);
        boolean boolean12 = stackTestDriver0.isEmpty();
        java.lang.Object obj14 = stackTestDriver0.push((java.lang.Object) (short) 100);
        boolean boolean15 = stackTestDriver0.isEmpty();
        int int16 = stackTestDriver0.size();
        int int17 = stackTestDriver0.size();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) 100 + "'", obj4, (short) 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (short) 100 + "'", obj14, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test074");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (-1.0d));
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) 0);
        boolean boolean8 = stackTestDriver0.isEmpty();
        java.lang.Object obj9 = stackTestDriver0.pop();
        boolean boolean10 = stackTestDriver0.isEmpty();
        java.lang.Object obj11 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver12 = new experiment.util.StackTestDriver();
        stackTestDriver12.clear();
        stackTestDriver12.clear();
        boolean boolean15 = stackTestDriver12.isEmpty();
        java.lang.Object obj17 = stackTestDriver12.push((java.lang.Object) false);
        java.lang.Object obj18 = stackTestDriver12.pop();
        java.lang.Object obj19 = stackTestDriver0.push((java.lang.Object) stackTestDriver12);
        boolean boolean20 = stackTestDriver0.isEmpty();
        java.lang.Object obj21 = stackTestDriver0.peek();
        java.lang.Class<?> wildcardClass22 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0 + "'", obj7, 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0 + "'", obj9, 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (-1.0d) + "'", obj11, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + false + "'", obj17, false);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + false + "'", obj18, false);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test075");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test076");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
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
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test077");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        int int4 = stackTestDriver0.size();
        boolean boolean5 = stackTestDriver0.isEmpty();
        boolean boolean6 = stackTestDriver0.isEmpty();
        boolean boolean7 = stackTestDriver0.isEmpty();
        int int8 = stackTestDriver0.size();
        int int9 = stackTestDriver0.size();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test078");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        int int4 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        stackTestDriver5.clear();
        int int7 = stackTestDriver5.size();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) int7);
        int int9 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean11 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0 + "'", obj8, 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test079");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (-1.0d));
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) 0);
        boolean boolean8 = stackTestDriver0.isEmpty();
        java.lang.Object obj9 = stackTestDriver0.pop();
        boolean boolean10 = stackTestDriver0.isEmpty();
        java.lang.Object obj11 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver12 = new experiment.util.StackTestDriver();
        stackTestDriver12.clear();
        stackTestDriver12.clear();
        boolean boolean15 = stackTestDriver12.isEmpty();
        java.lang.Object obj17 = stackTestDriver12.push((java.lang.Object) false);
        java.lang.Object obj18 = stackTestDriver12.pop();
        java.lang.Object obj19 = stackTestDriver0.push((java.lang.Object) stackTestDriver12);
        stackTestDriver12.clear();
        boolean boolean21 = stackTestDriver12.isEmpty();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0 + "'", obj7, 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0 + "'", obj9, 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (-1.0d) + "'", obj11, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + false + "'", obj17, false);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + false + "'", obj18, false);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test080");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        int int4 = stackTestDriver0.size();
        int int5 = stackTestDriver0.size();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver7 = new experiment.util.StackTestDriver();
        stackTestDriver7.clear();
        stackTestDriver7.clear();
        stackTestDriver7.clear();
        int int11 = stackTestDriver7.size();
        java.lang.Object obj12 = stackTestDriver0.push((java.lang.Object) stackTestDriver7);
        stackTestDriver7.clear();
        java.lang.Class<?> wildcardClass14 = stackTestDriver7.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test081");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        int int4 = stackTestDriver0.size();
        boolean boolean5 = stackTestDriver0.isEmpty();
        boolean boolean6 = stackTestDriver0.isEmpty();
        boolean boolean7 = stackTestDriver0.isEmpty();
        int int8 = stackTestDriver0.size();
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test082");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (-1.0d));
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) 0);
        boolean boolean8 = stackTestDriver0.isEmpty();
        java.lang.Object obj9 = stackTestDriver0.pop();
        boolean boolean10 = stackTestDriver0.isEmpty();
        java.lang.Object obj11 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver12 = new experiment.util.StackTestDriver();
        stackTestDriver12.clear();
        stackTestDriver12.clear();
        boolean boolean15 = stackTestDriver12.isEmpty();
        java.lang.Object obj17 = stackTestDriver12.push((java.lang.Object) false);
        java.lang.Object obj18 = stackTestDriver12.pop();
        java.lang.Object obj19 = stackTestDriver0.push((java.lang.Object) stackTestDriver12);
        experiment.util.StackTestDriver stackTestDriver20 = new experiment.util.StackTestDriver();
        stackTestDriver20.clear();
        stackTestDriver20.clear();
        stackTestDriver20.clear();
        java.lang.Object obj25 = stackTestDriver20.push((java.lang.Object) (-1.0d));
        boolean boolean26 = stackTestDriver20.isEmpty();
        stackTestDriver20.clear();
        java.lang.Object obj28 = stackTestDriver0.push((java.lang.Object) stackTestDriver20);
        java.lang.Object obj29 = stackTestDriver0.pop();
        java.lang.Class<?> wildcardClass30 = obj29.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0 + "'", obj7, 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0 + "'", obj9, 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (-1.0d) + "'", obj11, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + false + "'", obj17, false);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + false + "'", obj18, false);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (-1.0d) + "'", obj25, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test083");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (-1.0d));
        java.lang.Object obj6 = stackTestDriver0.peek();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) '#');
        stackTestDriver0.clear();
        java.lang.Class<?> wildcardClass10 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1.0d) + "'", obj6, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + '#' + "'", obj8, '#');
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test084");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        int int4 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        stackTestDriver5.clear();
        stackTestDriver5.clear();
        stackTestDriver5.clear();
        int int9 = stackTestDriver5.size();
        boolean boolean10 = stackTestDriver5.isEmpty();
        boolean boolean11 = stackTestDriver5.isEmpty();
        stackTestDriver5.clear();
        java.lang.Class<?> wildcardClass13 = stackTestDriver5.getClass();
        java.lang.Object obj14 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        int int15 = stackTestDriver5.size();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test085");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (-1.0d));
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) 0);
        boolean boolean8 = stackTestDriver0.isEmpty();
        java.lang.Object obj9 = stackTestDriver0.pop();
        boolean boolean10 = stackTestDriver0.isEmpty();
        java.lang.Object obj11 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver12 = new experiment.util.StackTestDriver();
        stackTestDriver12.clear();
        stackTestDriver12.clear();
        boolean boolean15 = stackTestDriver12.isEmpty();
        java.lang.Object obj17 = stackTestDriver12.push((java.lang.Object) false);
        java.lang.Object obj18 = stackTestDriver12.pop();
        java.lang.Object obj19 = stackTestDriver0.push((java.lang.Object) stackTestDriver12);
        experiment.util.StackTestDriver stackTestDriver20 = new experiment.util.StackTestDriver();
        stackTestDriver20.clear();
        stackTestDriver20.clear();
        stackTestDriver20.clear();
        java.lang.Object obj25 = stackTestDriver20.push((java.lang.Object) (-1.0d));
        boolean boolean26 = stackTestDriver20.isEmpty();
        stackTestDriver20.clear();
        java.lang.Object obj28 = stackTestDriver0.push((java.lang.Object) stackTestDriver20);
        java.lang.Object obj29 = stackTestDriver0.pop();
        java.lang.Class<?> wildcardClass30 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0 + "'", obj7, 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0 + "'", obj9, 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (-1.0d) + "'", obj11, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + false + "'", obj17, false);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + false + "'", obj18, false);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (-1.0d) + "'", obj25, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test086");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (-1.0d));
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) 0);
        boolean boolean8 = stackTestDriver0.isEmpty();
        java.lang.Object obj9 = stackTestDriver0.pop();
        boolean boolean10 = stackTestDriver0.isEmpty();
        boolean boolean11 = stackTestDriver0.isEmpty();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0 + "'", obj7, 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0 + "'", obj9, 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test087");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) 1.0d);
        java.lang.Object obj6 = stackTestDriver0.pop();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 1.0d + "'", obj5, 1.0d);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0d + "'", obj6, 1.0d);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test088");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        int int4 = stackTestDriver0.size();
        boolean boolean5 = stackTestDriver0.isEmpty();
        boolean boolean6 = stackTestDriver0.isEmpty();
        boolean boolean7 = stackTestDriver0.isEmpty();
        int int8 = stackTestDriver0.size();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        stackTestDriver10.clear();
        stackTestDriver10.clear();
        stackTestDriver10.clear();
        int int14 = stackTestDriver10.size();
        boolean boolean15 = stackTestDriver10.isEmpty();
        boolean boolean16 = stackTestDriver10.isEmpty();
        stackTestDriver10.clear();
        java.lang.Class<?> wildcardClass18 = stackTestDriver10.getClass();
        java.lang.Object obj19 = stackTestDriver0.push((java.lang.Object) stackTestDriver10);
        java.lang.Object obj20 = stackTestDriver0.pop();
        java.lang.Class<?> wildcardClass21 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test089");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (-1.0d));
        stackTestDriver0.clear();
        int int7 = stackTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test090");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (-1.0d));
        java.lang.Object obj6 = stackTestDriver0.peek();
        java.lang.Class<?> wildcardClass7 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1.0d) + "'", obj6, (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test091");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        int int4 = stackTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test092");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (-1.0d));
        boolean boolean6 = stackTestDriver0.isEmpty();
        java.lang.Object obj7 = stackTestDriver0.peek();
        boolean boolean8 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver9 = new experiment.util.StackTestDriver();
        stackTestDriver9.clear();
        stackTestDriver9.clear();
        boolean boolean12 = stackTestDriver9.isEmpty();
        int int13 = stackTestDriver9.size();
        stackTestDriver9.clear();
        int int15 = stackTestDriver9.size();
        java.lang.Object obj16 = stackTestDriver0.push((java.lang.Object) int15);
        java.lang.Class<?> wildcardClass17 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0 + "'", obj16, 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test093");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Class<?> wildcardClass1 = stackTestDriver0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test094");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (-1.0d));
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) 0);
        boolean boolean8 = stackTestDriver0.isEmpty();
        java.lang.Object obj9 = stackTestDriver0.pop();
        java.lang.Object obj10 = stackTestDriver0.pop();
        int int11 = stackTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0 + "'", obj7, 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0 + "'", obj9, 0);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (-1.0d) + "'", obj10, (-1.0d));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test095");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (short) 100);
        int int5 = stackTestDriver0.size();
        int int6 = stackTestDriver0.size();
        java.lang.Object obj7 = stackTestDriver0.pop();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) 100 + "'", obj4, (short) 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (short) 100 + "'", obj7, (short) 100);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test096");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        int int4 = stackTestDriver0.size();
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) (short) 10);
        int int7 = stackTestDriver0.size();
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 10 + "'", obj6, (short) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test097");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        int int4 = stackTestDriver0.size();
        boolean boolean5 = stackTestDriver0.isEmpty();
        boolean boolean6 = stackTestDriver0.isEmpty();
        boolean boolean7 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        stackTestDriver10.clear();
        stackTestDriver10.clear();
        java.lang.Object obj14 = stackTestDriver10.push((java.lang.Object) (short) 100);
        java.lang.Object obj15 = stackTestDriver10.peek();
        int int16 = stackTestDriver10.size();
        java.lang.Object obj17 = stackTestDriver0.push((java.lang.Object) int16);
        java.lang.Object obj18 = stackTestDriver0.peek();
        experiment.util.StackTestDriver stackTestDriver19 = new experiment.util.StackTestDriver();
        stackTestDriver19.clear();
        stackTestDriver19.clear();
        stackTestDriver19.clear();
        java.lang.Object obj24 = stackTestDriver19.push((java.lang.Object) (-1.0d));
        java.lang.Object obj26 = stackTestDriver19.push((java.lang.Object) 0);
        java.lang.Object obj27 = stackTestDriver19.pop();
        java.lang.Object obj28 = stackTestDriver0.push(obj27);
        java.lang.Class<?> wildcardClass29 = obj28.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (short) 100 + "'", obj14, (short) 100);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (short) 100 + "'", obj15, (short) 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 1 + "'", obj17, 1);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 1 + "'", obj18, 1);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (-1.0d) + "'", obj24, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 0 + "'", obj26, 0);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 0 + "'", obj27, 0);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + 0 + "'", obj28, 0);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test098");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (-1.0d));
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) 0);
        boolean boolean8 = stackTestDriver0.isEmpty();
        java.lang.Object obj9 = stackTestDriver0.pop();
        boolean boolean10 = stackTestDriver0.isEmpty();
        java.lang.Object obj11 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver12 = new experiment.util.StackTestDriver();
        stackTestDriver12.clear();
        stackTestDriver12.clear();
        boolean boolean15 = stackTestDriver12.isEmpty();
        java.lang.Object obj17 = stackTestDriver12.push((java.lang.Object) false);
        java.lang.Object obj18 = stackTestDriver12.pop();
        java.lang.Object obj19 = stackTestDriver0.push((java.lang.Object) stackTestDriver12);
        boolean boolean20 = stackTestDriver0.isEmpty();
        java.lang.Object obj21 = stackTestDriver0.peek();
        experiment.util.StackTestDriver stackTestDriver22 = new experiment.util.StackTestDriver();
        stackTestDriver22.clear();
        stackTestDriver22.clear();
        stackTestDriver22.clear();
        int int26 = stackTestDriver22.size();
        int int27 = stackTestDriver22.size();
        stackTestDriver22.clear();
        experiment.util.StackTestDriver stackTestDriver29 = new experiment.util.StackTestDriver();
        stackTestDriver29.clear();
        stackTestDriver29.clear();
        stackTestDriver29.clear();
        int int33 = stackTestDriver29.size();
        java.lang.Object obj34 = stackTestDriver22.push((java.lang.Object) stackTestDriver29);
        stackTestDriver29.clear();
        java.lang.Object obj36 = stackTestDriver0.push((java.lang.Object) stackTestDriver29);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj37 = stackTestDriver29.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0 + "'", obj7, 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0 + "'", obj9, 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (-1.0d) + "'", obj11, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + false + "'", obj17, false);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + false + "'", obj18, false);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertNotNull(obj36);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test099");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (short) 100);
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        stackTestDriver5.clear();
        stackTestDriver5.clear();
        stackTestDriver5.clear();
        int int9 = stackTestDriver5.size();
        boolean boolean10 = stackTestDriver5.isEmpty();
        java.lang.Class<?> wildcardClass11 = stackTestDriver5.getClass();
        java.lang.Object obj12 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        java.lang.Object obj13 = stackTestDriver0.peek();
        java.lang.Object obj14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = stackTestDriver0.push(obj14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) 100 + "'", obj4, (short) 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test100");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        int int4 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        stackTestDriver5.clear();
        int int7 = stackTestDriver5.size();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) int7);
        int int9 = stackTestDriver0.size();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        java.lang.Class<?> wildcardClass12 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0 + "'", obj8, 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test101");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (-1.0d));
        int int6 = stackTestDriver0.size();
        boolean boolean7 = stackTestDriver0.isEmpty();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test102");
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
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test103");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (short) 100);
        int int5 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        stackTestDriver6.clear();
        stackTestDriver6.clear();
        stackTestDriver6.clear();
        java.lang.Class<?> wildcardClass10 = stackTestDriver6.getClass();
        java.lang.Object obj11 = stackTestDriver0.push((java.lang.Object) stackTestDriver6);
        boolean boolean12 = stackTestDriver0.isEmpty();
        java.lang.Object obj13 = stackTestDriver0.pop();
        java.lang.Object obj14 = stackTestDriver0.peek();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) 100 + "'", obj4, (short) 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (short) 100 + "'", obj14, (short) 100);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test104");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        int int4 = stackTestDriver0.size();
        int int5 = stackTestDriver0.size();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver7 = new experiment.util.StackTestDriver();
        stackTestDriver7.clear();
        stackTestDriver7.clear();
        stackTestDriver7.clear();
        int int11 = stackTestDriver7.size();
        java.lang.Object obj12 = stackTestDriver0.push((java.lang.Object) stackTestDriver7);
        boolean boolean13 = stackTestDriver0.isEmpty();
        int int14 = stackTestDriver0.size();
        java.lang.Class<?> wildcardClass15 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test105");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (-1.0d));
        boolean boolean6 = stackTestDriver0.isEmpty();
        java.lang.Object obj7 = stackTestDriver0.peek();
        boolean boolean8 = stackTestDriver0.isEmpty();
        int int9 = stackTestDriver0.size();
        boolean boolean10 = stackTestDriver0.isEmpty();
        java.lang.Class<?> wildcardClass11 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test106");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (-1.0d));
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test107");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        int int4 = stackTestDriver0.size();
        stackTestDriver0.clear();
        int int6 = stackTestDriver0.size();
        int int7 = stackTestDriver0.size();
        stackTestDriver0.clear();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test108");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (short) 100);
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        stackTestDriver5.clear();
        stackTestDriver5.clear();
        stackTestDriver5.clear();
        int int9 = stackTestDriver5.size();
        boolean boolean10 = stackTestDriver5.isEmpty();
        java.lang.Class<?> wildcardClass11 = stackTestDriver5.getClass();
        java.lang.Object obj12 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        java.lang.Object obj13 = stackTestDriver0.peek();
        stackTestDriver0.clear();
        java.lang.Class<?> wildcardClass15 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) 100 + "'", obj4, (short) 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test109");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (short) 100);
        stackTestDriver0.clear();
        boolean boolean6 = stackTestDriver0.isEmpty();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) 100 + "'", obj4, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test110");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (-1.0d));
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) 0);
        boolean boolean8 = stackTestDriver0.isEmpty();
        java.lang.Object obj9 = stackTestDriver0.pop();
        java.lang.Object obj10 = stackTestDriver0.peek();
        experiment.util.StackTestDriver stackTestDriver11 = new experiment.util.StackTestDriver();
        stackTestDriver11.clear();
        stackTestDriver11.clear();
        stackTestDriver11.clear();
        int int15 = stackTestDriver11.size();
        boolean boolean16 = stackTestDriver11.isEmpty();
        boolean boolean17 = stackTestDriver11.isEmpty();
        java.lang.Object obj18 = stackTestDriver0.push((java.lang.Object) boolean17);
        java.lang.Object obj19 = stackTestDriver0.peek();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0 + "'", obj7, 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0 + "'", obj9, 0);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (-1.0d) + "'", obj10, (-1.0d));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + true + "'", obj18, true);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + true + "'", obj19, true);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test111");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        int int4 = stackTestDriver0.size();
        boolean boolean5 = stackTestDriver0.isEmpty();
        boolean boolean6 = stackTestDriver0.isEmpty();
        boolean boolean7 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        int int9 = stackTestDriver0.size();
        java.lang.Class<?> wildcardClass10 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test112");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        int int4 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        stackTestDriver5.clear();
        int int7 = stackTestDriver5.size();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) int7);
        int int9 = stackTestDriver0.size();
        stackTestDriver0.clear();
        java.lang.Class<?> wildcardClass11 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0 + "'", obj8, 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test113");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        int int2 = stackTestDriver0.size();
        stackTestDriver0.clear();
        int int4 = stackTestDriver0.size();
        int int5 = stackTestDriver0.size();
        int int6 = stackTestDriver0.size();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) 1.0d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 1.0d + "'", obj8, 1.0d);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test114");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (-1.0d));
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) 0);
        boolean boolean8 = stackTestDriver0.isEmpty();
        java.lang.Object obj9 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        stackTestDriver10.clear();
        stackTestDriver10.clear();
        stackTestDriver10.clear();
        int int14 = stackTestDriver10.size();
        java.lang.Class<?> wildcardClass15 = stackTestDriver10.getClass();
        java.lang.Object obj16 = stackTestDriver0.push((java.lang.Object) stackTestDriver10);
        int int17 = stackTestDriver0.size();
        boolean boolean18 = stackTestDriver0.isEmpty();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0 + "'", obj7, 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0 + "'", obj9, 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test115");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (-1.0d));
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) 0);
        boolean boolean8 = stackTestDriver0.isEmpty();
        java.lang.Object obj9 = stackTestDriver0.pop();
        boolean boolean10 = stackTestDriver0.isEmpty();
        java.lang.Object obj11 = stackTestDriver0.peek();
        int int12 = stackTestDriver0.size();
        java.lang.Object obj13 = stackTestDriver0.peek();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0 + "'", obj7, 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0 + "'", obj9, 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (-1.0d) + "'", obj11, (-1.0d));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (-1.0d) + "'", obj13, (-1.0d));
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test116");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) 1.0d);
        java.lang.Object obj6 = stackTestDriver0.pop();
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 1.0d + "'", obj5, 1.0d);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0d + "'", obj6, 1.0d);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test117");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (-1.0d));
        boolean boolean6 = stackTestDriver0.isEmpty();
        java.lang.Object obj7 = stackTestDriver0.peek();
        boolean boolean8 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        boolean boolean10 = stackTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test118");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        int int4 = stackTestDriver0.size();
        boolean boolean5 = stackTestDriver0.isEmpty();
        boolean boolean6 = stackTestDriver0.isEmpty();
        boolean boolean7 = stackTestDriver0.isEmpty();
        int int8 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean10 = stackTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test119");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (-1.0d));
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) 0);
        boolean boolean8 = stackTestDriver0.isEmpty();
        java.lang.Object obj9 = stackTestDriver0.pop();
        boolean boolean10 = stackTestDriver0.isEmpty();
        java.lang.Object obj11 = stackTestDriver0.peek();
        java.lang.Object obj12 = stackTestDriver0.peek();
        stackTestDriver0.clear();
        boolean boolean14 = stackTestDriver0.isEmpty();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0 + "'", obj7, 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0 + "'", obj9, 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (-1.0d) + "'", obj11, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (-1.0d) + "'", obj12, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test120");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (-1.0d));
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) 0);
        boolean boolean8 = stackTestDriver0.isEmpty();
        java.lang.Object obj9 = stackTestDriver0.pop();
        boolean boolean10 = stackTestDriver0.isEmpty();
        java.lang.Object obj11 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver12 = new experiment.util.StackTestDriver();
        stackTestDriver12.clear();
        stackTestDriver12.clear();
        boolean boolean15 = stackTestDriver12.isEmpty();
        java.lang.Object obj17 = stackTestDriver12.push((java.lang.Object) false);
        java.lang.Object obj18 = stackTestDriver12.pop();
        java.lang.Object obj19 = stackTestDriver0.push((java.lang.Object) stackTestDriver12);
        experiment.util.StackTestDriver stackTestDriver20 = new experiment.util.StackTestDriver();
        stackTestDriver20.clear();
        stackTestDriver20.clear();
        stackTestDriver20.clear();
        java.lang.Object obj25 = stackTestDriver20.push((java.lang.Object) (-1.0d));
        boolean boolean26 = stackTestDriver20.isEmpty();
        stackTestDriver20.clear();
        java.lang.Class<?> wildcardClass28 = stackTestDriver20.getClass();
        java.lang.Object obj29 = stackTestDriver0.push((java.lang.Object) wildcardClass28);
        java.lang.Object obj31 = stackTestDriver0.push((java.lang.Object) 0.0d);
        stackTestDriver0.clear();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0 + "'", obj7, 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0 + "'", obj9, 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (-1.0d) + "'", obj11, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + false + "'", obj17, false);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + false + "'", obj18, false);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (-1.0d) + "'", obj25, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertEquals(obj29.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj29), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj29), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 0.0d + "'", obj31, 0.0d);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test121");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        int int4 = stackTestDriver0.size();
        stackTestDriver0.clear();
        int int6 = stackTestDriver0.size();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test122");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        int int4 = stackTestDriver0.size();
        boolean boolean5 = stackTestDriver0.isEmpty();
        boolean boolean6 = stackTestDriver0.isEmpty();
        boolean boolean7 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        stackTestDriver10.clear();
        stackTestDriver10.clear();
        java.lang.Object obj14 = stackTestDriver10.push((java.lang.Object) (short) 100);
        java.lang.Object obj15 = stackTestDriver10.peek();
        int int16 = stackTestDriver10.size();
        java.lang.Object obj17 = stackTestDriver0.push((java.lang.Object) int16);
        java.lang.Object obj18 = stackTestDriver0.peek();
        java.lang.Object obj19 = stackTestDriver0.peek();
        java.lang.Class<?> wildcardClass20 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (short) 100 + "'", obj14, (short) 100);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (short) 100 + "'", obj15, (short) 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 1 + "'", obj17, 1);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 1 + "'", obj18, 1);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 1 + "'", obj19, 1);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test123");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (short) 100);
        java.lang.Object obj5 = stackTestDriver0.peek();
        int int6 = stackTestDriver0.size();
        java.lang.Object obj7 = stackTestDriver0.peek();
        java.lang.Object obj8 = stackTestDriver0.peek();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) 100 + "'", obj4, (short) 100);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) 100 + "'", obj5, (short) 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (short) 100 + "'", obj7, (short) 100);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (short) 100 + "'", obj8, (short) 100);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test124");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (-1.0d));
        boolean boolean6 = stackTestDriver0.isEmpty();
        java.lang.Object obj7 = stackTestDriver0.peek();
        java.lang.Object obj8 = stackTestDriver0.peek();
        java.lang.Object obj10 = stackTestDriver0.push((java.lang.Object) (byte) 0);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) 0 + "'", obj10, (byte) 0);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test125");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (-1.0d));
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) 0);
        boolean boolean8 = stackTestDriver0.isEmpty();
        java.lang.Object obj9 = stackTestDriver0.pop();
        boolean boolean10 = stackTestDriver0.isEmpty();
        java.lang.Object obj11 = stackTestDriver0.pop();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0 + "'", obj7, 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0 + "'", obj9, 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (-1.0d) + "'", obj11, (-1.0d));
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test126");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (short) 100);
        int int5 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        stackTestDriver6.clear();
        stackTestDriver6.clear();
        stackTestDriver6.clear();
        java.lang.Class<?> wildcardClass10 = stackTestDriver6.getClass();
        java.lang.Object obj11 = stackTestDriver0.push((java.lang.Object) stackTestDriver6);
        boolean boolean12 = stackTestDriver0.isEmpty();
        java.lang.Object obj14 = stackTestDriver0.push((java.lang.Object) (short) 100);
        boolean boolean15 = stackTestDriver0.isEmpty();
        int int16 = stackTestDriver0.size();
        stackTestDriver0.clear();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) 100 + "'", obj4, (short) 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (short) 100 + "'", obj14, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test127");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        int int4 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        stackTestDriver5.clear();
        int int7 = stackTestDriver5.size();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) int7);
        int int9 = stackTestDriver0.size();
        stackTestDriver0.clear();
        java.lang.Object obj12 = stackTestDriver0.push((java.lang.Object) (-1.0f));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0 + "'", obj8, 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (-1.0f) + "'", obj12, (-1.0f));
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test128");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (-1.0d));
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) 0);
        boolean boolean8 = stackTestDriver0.isEmpty();
        java.lang.Object obj9 = stackTestDriver0.pop();
        java.lang.Object obj10 = stackTestDriver0.pop();
        int int11 = stackTestDriver0.size();
        int int12 = stackTestDriver0.size();
        java.lang.Class<?> wildcardClass13 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0 + "'", obj7, 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0 + "'", obj9, 0);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (-1.0d) + "'", obj10, (-1.0d));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

}
