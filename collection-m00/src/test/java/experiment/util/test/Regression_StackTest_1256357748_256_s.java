package experiment.util.test;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Regression_StackTest_1256357748_256_s {

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

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test129");
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
        experiment.util.StackTestDriver stackTestDriver20 = new experiment.util.StackTestDriver();
        stackTestDriver20.clear();
        stackTestDriver20.clear();
        stackTestDriver20.clear();
        java.lang.Object obj25 = stackTestDriver20.push((java.lang.Object) (-1.0d));
        java.lang.Object obj27 = stackTestDriver20.push((java.lang.Object) 0);
        boolean boolean28 = stackTestDriver20.isEmpty();
        java.lang.Object obj29 = stackTestDriver20.pop();
        boolean boolean30 = stackTestDriver20.isEmpty();
        java.lang.Object obj31 = stackTestDriver20.pop();
        experiment.util.StackTestDriver stackTestDriver32 = new experiment.util.StackTestDriver();
        stackTestDriver32.clear();
        stackTestDriver32.clear();
        boolean boolean35 = stackTestDriver32.isEmpty();
        java.lang.Object obj37 = stackTestDriver32.push((java.lang.Object) false);
        java.lang.Object obj38 = stackTestDriver32.pop();
        java.lang.Object obj39 = stackTestDriver20.push((java.lang.Object) stackTestDriver32);
        experiment.util.StackTestDriver stackTestDriver40 = new experiment.util.StackTestDriver();
        stackTestDriver40.clear();
        stackTestDriver40.clear();
        stackTestDriver40.clear();
        java.lang.Object obj45 = stackTestDriver40.push((java.lang.Object) (-1.0d));
        boolean boolean46 = stackTestDriver40.isEmpty();
        stackTestDriver40.clear();
        java.lang.Class<?> wildcardClass48 = stackTestDriver40.getClass();
        java.lang.Object obj49 = stackTestDriver20.push((java.lang.Object) wildcardClass48);
        boolean boolean50 = stackTestDriver20.isEmpty();
        stackTestDriver20.clear();
        experiment.util.StackTestDriver stackTestDriver52 = new experiment.util.StackTestDriver();
        stackTestDriver52.clear();
        stackTestDriver52.clear();
        stackTestDriver52.clear();
        int int56 = stackTestDriver52.size();
        experiment.util.StackTestDriver stackTestDriver57 = new experiment.util.StackTestDriver();
        stackTestDriver57.clear();
        int int59 = stackTestDriver57.size();
        java.lang.Object obj60 = stackTestDriver52.push((java.lang.Object) int59);
        int int61 = stackTestDriver52.size();
        java.lang.Object obj62 = stackTestDriver20.push((java.lang.Object) int61);
        int int63 = stackTestDriver20.size();
        java.lang.Object obj64 = stackTestDriver10.push((java.lang.Object) int63);
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
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (-1.0d) + "'", obj25, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 0 + "'", obj27, 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 0 + "'", obj29, 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + (-1.0d) + "'", obj31, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + false + "'", obj37, false);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + false + "'", obj38, false);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + (-1.0d) + "'", obj45, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertEquals(obj49.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj49), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj49), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertEquals("'" + obj60 + "' != '" + 0 + "'", obj60, 0);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 1 + "'", int61 == 1);
        org.junit.Assert.assertEquals("'" + obj62 + "' != '" + 1 + "'", obj62, 1);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 1 + "'", int63 == 1);
        org.junit.Assert.assertEquals("'" + obj64 + "' != '" + 1 + "'", obj64, 1);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test130");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj29 = stackTestDriver20.peek();
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
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (-1.0d) + "'", obj25, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(obj28);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test131");
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
        stackTestDriver6.clear();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) 100 + "'", obj4, (short) 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test132");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        int int4 = stackTestDriver0.size();
        stackTestDriver0.clear();
        int int6 = stackTestDriver0.size();
        stackTestDriver0.clear();
        int int8 = stackTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test133");
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
        java.lang.Class<?> wildcardClass17 = obj16.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0 + "'", obj7, 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0 + "'", obj9, 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test134");
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
        experiment.util.StackTestDriver stackTestDriver11 = new experiment.util.StackTestDriver();
        int int12 = stackTestDriver11.size();
        stackTestDriver11.clear();
        java.lang.Object obj15 = stackTestDriver11.push((java.lang.Object) 1);
        java.lang.Object obj16 = stackTestDriver0.push((java.lang.Object) 1);
        java.lang.Class<?> wildcardClass17 = obj16.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0 + "'", obj8, 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 1 + "'", obj15, 1);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 1 + "'", obj16, 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test135");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (-1.0d));
        boolean boolean6 = stackTestDriver0.isEmpty();
        java.lang.Object obj7 = stackTestDriver0.peek();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        stackTestDriver10.clear();
        stackTestDriver10.clear();
        stackTestDriver10.clear();
        int int14 = stackTestDriver10.size();
        int int15 = stackTestDriver10.size();
        stackTestDriver10.clear();
        experiment.util.StackTestDriver stackTestDriver17 = new experiment.util.StackTestDriver();
        stackTestDriver17.clear();
        stackTestDriver17.clear();
        stackTestDriver17.clear();
        int int21 = stackTestDriver17.size();
        java.lang.Object obj22 = stackTestDriver10.push((java.lang.Object) stackTestDriver17);
        experiment.util.StackTestDriver stackTestDriver23 = new experiment.util.StackTestDriver();
        stackTestDriver23.clear();
        stackTestDriver23.clear();
        stackTestDriver23.clear();
        int int27 = stackTestDriver23.size();
        experiment.util.StackTestDriver stackTestDriver28 = new experiment.util.StackTestDriver();
        stackTestDriver28.clear();
        stackTestDriver28.clear();
        stackTestDriver28.clear();
        int int32 = stackTestDriver28.size();
        boolean boolean33 = stackTestDriver28.isEmpty();
        boolean boolean34 = stackTestDriver28.isEmpty();
        stackTestDriver28.clear();
        java.lang.Class<?> wildcardClass36 = stackTestDriver28.getClass();
        java.lang.Object obj37 = stackTestDriver23.push((java.lang.Object) stackTestDriver28);
        java.lang.Class<?> wildcardClass38 = obj37.getClass();
        java.lang.Object obj39 = stackTestDriver17.push(obj37);
        java.lang.Object obj40 = stackTestDriver0.push(obj37);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertNotNull(obj40);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test136");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (-1.0d));
        boolean boolean6 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        boolean boolean8 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test137");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = stackTestDriver0.pop();
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test138");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        int int4 = stackTestDriver0.size();
        stackTestDriver0.clear();
        int int6 = stackTestDriver0.size();
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test139");
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
        java.lang.Class<?> wildcardClass37 = stackTestDriver29.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test140");
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
        java.lang.Object obj23 = stackTestDriver0.push((java.lang.Object) (short) 10);
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
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (short) 10 + "'", obj23, (short) 10);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test141");
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
        int int10 = stackTestDriver0.size();
        java.lang.Class<?> wildcardClass11 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test142");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (short) 100);
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        stackTestDriver6.clear();
        stackTestDriver6.clear();
        java.lang.Object obj10 = stackTestDriver6.push((java.lang.Object) (short) 100);
        stackTestDriver6.clear();
        stackTestDriver6.clear();
        java.lang.Object obj13 = stackTestDriver0.push((java.lang.Object) stackTestDriver6);
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) 100 + "'", obj4, (short) 100);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (short) 100 + "'", obj10, (short) 100);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test143");
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
            java.lang.Object obj13 = stackTestDriver7.pop();
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
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test144");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (short) 100);
        java.lang.Object obj5 = stackTestDriver0.peek();
        java.lang.Object obj6 = stackTestDriver0.pop();
        int int7 = stackTestDriver0.size();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) 100 + "'", obj4, (short) 100);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) 100 + "'", obj5, (short) 100);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 100 + "'", obj6, (short) 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test145");
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
        stackTestDriver11.clear();
        stackTestDriver11.clear();
        int int15 = stackTestDriver11.size();
        experiment.util.StackTestDriver stackTestDriver16 = new experiment.util.StackTestDriver();
        stackTestDriver16.clear();
        int int18 = stackTestDriver16.size();
        java.lang.Object obj19 = stackTestDriver11.push((java.lang.Object) int18);
        java.lang.Object obj20 = stackTestDriver0.push((java.lang.Object) stackTestDriver11);
        java.lang.Object obj21 = stackTestDriver0.pop();
        stackTestDriver0.clear();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0 + "'", obj7, 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0 + "'", obj9, 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 0 + "'", obj19, 0);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(obj21);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test146");
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
        boolean boolean30 = stackTestDriver0.isEmpty();
        java.lang.Object obj31 = stackTestDriver0.peek();
        java.lang.Object obj32 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver33 = new experiment.util.StackTestDriver();
        stackTestDriver33.clear();
        stackTestDriver33.clear();
        stackTestDriver33.clear();
        int int37 = stackTestDriver33.size();
        experiment.util.StackTestDriver stackTestDriver38 = new experiment.util.StackTestDriver();
        stackTestDriver38.clear();
        int int40 = stackTestDriver38.size();
        java.lang.Object obj41 = stackTestDriver33.push((java.lang.Object) int40);
        java.lang.Object obj42 = stackTestDriver0.push((java.lang.Object) int40);
        experiment.util.StackTestDriver stackTestDriver43 = new experiment.util.StackTestDriver();
        stackTestDriver43.clear();
        stackTestDriver43.clear();
        stackTestDriver43.clear();
        java.lang.Object obj48 = stackTestDriver43.push((java.lang.Object) 1.0d);
        java.lang.Object obj49 = stackTestDriver43.pop();
        stackTestDriver43.clear();
        stackTestDriver43.clear();
        java.lang.Class<?> wildcardClass52 = stackTestDriver43.getClass();
        java.lang.Object obj53 = stackTestDriver0.push((java.lang.Object) wildcardClass52);
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
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertEquals(obj31.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj31), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj31), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertEquals(obj32.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj32), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj32), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + 0 + "'", obj41, 0);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + 0 + "'", obj42, 0);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + 1.0d + "'", obj48, 1.0d);
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + 1.0d + "'", obj49, 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass52);
        org.junit.Assert.assertNotNull(obj53);
        org.junit.Assert.assertEquals(obj53.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj53), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj53), "class experiment.util.StackTestDriver");
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test147");
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
        java.lang.Class<?> wildcardClass15 = stackTestDriver5.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test148");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (-1.0d));
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) 0);
        java.lang.Object obj8 = stackTestDriver0.pop();
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0 + "'", obj7, 0);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0 + "'", obj8, 0);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test149");
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
        boolean boolean21 = stackTestDriver12.isEmpty();
        java.lang.Object obj22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = stackTestDriver12.push(obj22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test150");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        int int4 = stackTestDriver0.size();
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) (short) 10);
        int int7 = stackTestDriver0.size();
        int int8 = stackTestDriver0.size();
        int int9 = stackTestDriver0.size();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 10 + "'", obj6, (short) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test151");
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
        experiment.util.StackTestDriver stackTestDriver12 = new experiment.util.StackTestDriver();
        stackTestDriver12.clear();
        stackTestDriver12.clear();
        stackTestDriver12.clear();
        int int16 = stackTestDriver12.size();
        boolean boolean17 = stackTestDriver12.isEmpty();
        boolean boolean18 = stackTestDriver12.isEmpty();
        boolean boolean19 = stackTestDriver12.isEmpty();
        int int20 = stackTestDriver12.size();
        stackTestDriver12.clear();
        experiment.util.StackTestDriver stackTestDriver22 = new experiment.util.StackTestDriver();
        stackTestDriver22.clear();
        stackTestDriver22.clear();
        stackTestDriver22.clear();
        int int26 = stackTestDriver22.size();
        boolean boolean27 = stackTestDriver22.isEmpty();
        boolean boolean28 = stackTestDriver22.isEmpty();
        stackTestDriver22.clear();
        java.lang.Class<?> wildcardClass30 = stackTestDriver22.getClass();
        java.lang.Object obj31 = stackTestDriver12.push((java.lang.Object) stackTestDriver22);
        java.lang.Object obj32 = stackTestDriver12.pop();
        java.lang.Object obj33 = stackTestDriver0.push((java.lang.Object) stackTestDriver12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj34 = stackTestDriver12.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0 + "'", obj8, 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertNotNull(obj33);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test152");
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
        int int20 = stackTestDriver0.size();
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test153");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) false);
        java.lang.Object obj6 = stackTestDriver0.pop();
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + false + "'", obj5, false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + false + "'", obj6, false);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test154");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        int int4 = stackTestDriver0.size();
        boolean boolean5 = stackTestDriver0.isEmpty();
        boolean boolean6 = stackTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test155");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (-1.0d));
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) 0);
        boolean boolean8 = stackTestDriver0.isEmpty();
        java.lang.Object obj9 = stackTestDriver0.pop();
        java.lang.Object obj10 = stackTestDriver0.peek();
        java.lang.Object obj11 = stackTestDriver0.peek();
        java.lang.Class<?> wildcardClass12 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0 + "'", obj7, 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0 + "'", obj9, 0);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (-1.0d) + "'", obj10, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (-1.0d) + "'", obj11, (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test156");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (short) 100);
        java.lang.Object obj5 = stackTestDriver0.peek();
        int int6 = stackTestDriver0.size();
        java.lang.Object obj7 = stackTestDriver0.peek();
        java.lang.Object obj8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = stackTestDriver0.push(obj8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) 100 + "'", obj4, (short) 100);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) 100 + "'", obj5, (short) 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (short) 100 + "'", obj7, (short) 100);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test157");
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
        int int29 = stackTestDriver0.size();
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
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2 + "'", int29 == 2);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test158");
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
        stackTestDriver0.clear();
        int int21 = stackTestDriver0.size();
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test159");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (-1.0d));
        java.lang.Object obj6 = stackTestDriver0.peek();
        int int7 = stackTestDriver0.size();
        boolean boolean8 = stackTestDriver0.isEmpty();
        boolean boolean9 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        stackTestDriver10.clear();
        stackTestDriver10.clear();
        stackTestDriver10.clear();
        stackTestDriver10.clear();
        java.lang.Class<?> wildcardClass15 = stackTestDriver10.getClass();
        java.lang.Object obj16 = stackTestDriver0.push((java.lang.Object) wildcardClass15);
        stackTestDriver0.clear();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1.0d) + "'", obj6, (-1.0d));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "class experiment.util.StackTestDriver");
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test160");
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
        boolean boolean13 = stackTestDriver7.isEmpty();
        boolean boolean14 = stackTestDriver7.isEmpty();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test161");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        int int4 = stackTestDriver0.size();
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) (short) 10);
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
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 10 + "'", obj6, (short) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test162");
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
        java.lang.Object obj14 = stackTestDriver0.peek();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test163");
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
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        stackTestDriver10.clear();
        stackTestDriver10.clear();
        stackTestDriver10.clear();
        int int14 = stackTestDriver10.size();
        int int15 = stackTestDriver10.size();
        stackTestDriver10.clear();
        experiment.util.StackTestDriver stackTestDriver17 = new experiment.util.StackTestDriver();
        stackTestDriver17.clear();
        stackTestDriver17.clear();
        stackTestDriver17.clear();
        int int21 = stackTestDriver17.size();
        java.lang.Object obj22 = stackTestDriver10.push((java.lang.Object) stackTestDriver17);
        java.lang.Object obj23 = stackTestDriver0.push((java.lang.Object) stackTestDriver17);
        experiment.util.StackTestDriver stackTestDriver24 = new experiment.util.StackTestDriver();
        stackTestDriver24.clear();
        stackTestDriver24.clear();
        stackTestDriver24.clear();
        int int28 = stackTestDriver24.size();
        boolean boolean29 = stackTestDriver24.isEmpty();
        boolean boolean30 = stackTestDriver24.isEmpty();
        int int31 = stackTestDriver24.size();
        java.lang.Object obj32 = stackTestDriver17.push((java.lang.Object) int31);
        java.lang.Object obj33 = stackTestDriver17.pop();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0 + "'", obj8, 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 0 + "'", obj32, 0);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + 0 + "'", obj33, 0);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test164");
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
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
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
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test165");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (-1.0d));
        boolean boolean6 = stackTestDriver0.isEmpty();
        java.lang.Object obj7 = stackTestDriver0.peek();
        java.lang.Object obj8 = stackTestDriver0.pop();
        java.lang.Object obj10 = stackTestDriver0.push((java.lang.Object) 1L);
        experiment.util.StackTestDriver stackTestDriver11 = new experiment.util.StackTestDriver();
        stackTestDriver11.clear();
        stackTestDriver11.clear();
        stackTestDriver11.clear();
        java.lang.Object obj16 = stackTestDriver11.push((java.lang.Object) (-1.0d));
        java.lang.Object obj18 = stackTestDriver11.push((java.lang.Object) 0);
        boolean boolean19 = stackTestDriver11.isEmpty();
        java.lang.Object obj20 = stackTestDriver11.pop();
        boolean boolean21 = stackTestDriver11.isEmpty();
        java.lang.Object obj22 = stackTestDriver11.pop();
        java.lang.Object obj24 = stackTestDriver11.push((java.lang.Object) 1.0f);
        java.lang.Object obj25 = stackTestDriver0.push(obj24);
        experiment.util.StackTestDriver stackTestDriver26 = new experiment.util.StackTestDriver();
        int int27 = stackTestDriver26.size();
        stackTestDriver26.clear();
        java.lang.Object obj30 = stackTestDriver26.push((java.lang.Object) 1);
        stackTestDriver26.clear();
        java.lang.Object obj32 = stackTestDriver0.push((java.lang.Object) stackTestDriver26);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 1L + "'", obj10, 1L);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (-1.0d) + "'", obj16, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 0 + "'", obj18, 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 0 + "'", obj20, 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (-1.0d) + "'", obj22, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 1.0f + "'", obj24, 1.0f);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 1.0f + "'", obj25, 1.0f);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + 1 + "'", obj30, 1);
        org.junit.Assert.assertNotNull(obj32);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test166");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) 1.0d);
        java.lang.Object obj6 = stackTestDriver0.pop();
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 1.0d + "'", obj5, 1.0d);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0d + "'", obj6, 1.0d);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test167");
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
        boolean boolean11 = stackTestDriver0.isEmpty();
        int int12 = stackTestDriver0.size();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test168");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (short) 100);
        int int5 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        stackTestDriver6.clear();
        stackTestDriver6.clear();
        java.lang.Object obj10 = stackTestDriver6.push((java.lang.Object) (short) 100);
        int int11 = stackTestDriver6.size();
        experiment.util.StackTestDriver stackTestDriver12 = new experiment.util.StackTestDriver();
        stackTestDriver12.clear();
        stackTestDriver12.clear();
        stackTestDriver12.clear();
        java.lang.Class<?> wildcardClass16 = stackTestDriver12.getClass();
        java.lang.Object obj17 = stackTestDriver6.push((java.lang.Object) stackTestDriver12);
        boolean boolean18 = stackTestDriver6.isEmpty();
        java.lang.Object obj20 = stackTestDriver6.push((java.lang.Object) (short) 100);
        boolean boolean21 = stackTestDriver6.isEmpty();
        int int22 = stackTestDriver6.size();
        java.lang.Object obj23 = stackTestDriver0.push((java.lang.Object) stackTestDriver6);
        experiment.util.StackTestDriver stackTestDriver24 = new experiment.util.StackTestDriver();
        stackTestDriver24.clear();
        stackTestDriver24.clear();
        stackTestDriver24.clear();
        java.lang.Object obj29 = stackTestDriver24.push((java.lang.Object) (-1.0d));
        boolean boolean30 = stackTestDriver24.isEmpty();
        java.lang.Object obj31 = stackTestDriver24.peek();
        boolean boolean32 = stackTestDriver24.isEmpty();
        int int33 = stackTestDriver24.size();
        boolean boolean34 = stackTestDriver24.isEmpty();
        java.lang.Object obj35 = stackTestDriver6.push((java.lang.Object) boolean34);
        java.lang.Class<?> wildcardClass36 = stackTestDriver6.getClass();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) 100 + "'", obj4, (short) 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (short) 100 + "'", obj10, (short) 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (short) 100 + "'", obj20, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + (-1.0d) + "'", obj29, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + (-1.0d) + "'", obj31, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + false + "'", obj35, false);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test169");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        int int4 = stackTestDriver0.size();
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) (short) 10);
        int int7 = stackTestDriver0.size();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        int int10 = stackTestDriver0.size();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 10 + "'", obj6, (short) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test170");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        int int4 = stackTestDriver0.size();
        stackTestDriver0.clear();
        int int6 = stackTestDriver0.size();
        boolean boolean7 = stackTestDriver0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test171");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (-1.0d));
        boolean boolean6 = stackTestDriver0.isEmpty();
        java.lang.Object obj7 = stackTestDriver0.peek();
        java.lang.Object obj8 = stackTestDriver0.peek();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test172");
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
        java.lang.Class<?> wildcardClass20 = obj19.getClass();
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
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test173");
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
        boolean boolean30 = stackTestDriver0.isEmpty();
        java.lang.Object obj31 = stackTestDriver0.peek();
        boolean boolean32 = stackTestDriver0.isEmpty();
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
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertEquals(obj31.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj31), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj31), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test174");
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
        boolean boolean13 = stackTestDriver0.isEmpty();
        boolean boolean14 = stackTestDriver0.isEmpty();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) 100 + "'", obj4, (short) 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test175");
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
        experiment.util.StackTestDriver stackTestDriver14 = new experiment.util.StackTestDriver();
        stackTestDriver14.clear();
        stackTestDriver14.clear();
        stackTestDriver14.clear();
        int int18 = stackTestDriver14.size();
        int int19 = stackTestDriver14.size();
        stackTestDriver14.clear();
        experiment.util.StackTestDriver stackTestDriver21 = new experiment.util.StackTestDriver();
        stackTestDriver21.clear();
        stackTestDriver21.clear();
        stackTestDriver21.clear();
        int int25 = stackTestDriver21.size();
        java.lang.Object obj26 = stackTestDriver14.push((java.lang.Object) stackTestDriver21);
        stackTestDriver14.clear();
        java.lang.Object obj28 = stackTestDriver7.push((java.lang.Object) stackTestDriver14);
        boolean boolean29 = stackTestDriver14.isEmpty();
        stackTestDriver14.clear();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test176");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (-1.0d));
        boolean boolean6 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        boolean boolean8 = stackTestDriver0.isEmpty();
        boolean boolean9 = stackTestDriver0.isEmpty();
        int int10 = stackTestDriver0.size();
        boolean boolean11 = stackTestDriver0.isEmpty();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test177");
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
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test178");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = stackTestDriver0.pop();
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
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test179");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        stackTestDriver0.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test180");
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
        boolean boolean30 = stackTestDriver0.isEmpty();
        java.lang.Object obj31 = stackTestDriver0.pop();
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj33 = stackTestDriver0.pop();
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
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (-1.0d) + "'", obj25, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertEquals(obj29.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj29), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj29), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertEquals(obj31.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj31), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj31), "class experiment.util.StackTestDriver");
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test181");
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
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        stackTestDriver10.clear();
        stackTestDriver10.clear();
        stackTestDriver10.clear();
        int int14 = stackTestDriver10.size();
        int int15 = stackTestDriver10.size();
        stackTestDriver10.clear();
        experiment.util.StackTestDriver stackTestDriver17 = new experiment.util.StackTestDriver();
        stackTestDriver17.clear();
        stackTestDriver17.clear();
        stackTestDriver17.clear();
        int int21 = stackTestDriver17.size();
        java.lang.Object obj22 = stackTestDriver10.push((java.lang.Object) stackTestDriver17);
        java.lang.Object obj23 = stackTestDriver0.push((java.lang.Object) stackTestDriver17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = stackTestDriver17.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0 + "'", obj8, 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(obj23);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test182");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (short) 100);
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        stackTestDriver6.clear();
        stackTestDriver6.clear();
        java.lang.Object obj10 = stackTestDriver6.push((java.lang.Object) (short) 100);
        stackTestDriver6.clear();
        stackTestDriver6.clear();
        java.lang.Object obj13 = stackTestDriver0.push((java.lang.Object) stackTestDriver6);
        int int14 = stackTestDriver6.size();
        java.lang.Class<?> wildcardClass15 = stackTestDriver6.getClass();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) 100 + "'", obj4, (short) 100);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (short) 100 + "'", obj10, (short) 100);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test183");
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
        experiment.util.StackTestDriver stackTestDriver13 = new experiment.util.StackTestDriver();
        stackTestDriver13.clear();
        stackTestDriver13.clear();
        stackTestDriver13.clear();
        java.lang.Object obj18 = stackTestDriver13.push((java.lang.Object) (-1.0d));
        java.lang.Object obj20 = stackTestDriver13.push((java.lang.Object) 0);
        boolean boolean21 = stackTestDriver13.isEmpty();
        java.lang.Object obj22 = stackTestDriver13.pop();
        java.lang.Object obj23 = stackTestDriver13.pop();
        stackTestDriver13.clear();
        java.lang.Object obj25 = stackTestDriver7.push((java.lang.Object) stackTestDriver13);
        int int26 = stackTestDriver7.size();
        int int27 = stackTestDriver7.size();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (-1.0d) + "'", obj18, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 0 + "'", obj20, 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 0 + "'", obj22, 0);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (-1.0d) + "'", obj23, (-1.0d));
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test184");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (short) 100);
        java.lang.Object obj5 = stackTestDriver0.peek();
        int int6 = stackTestDriver0.size();
        int int7 = stackTestDriver0.size();
        java.lang.Object obj8 = stackTestDriver0.peek();
        java.lang.Object obj9 = stackTestDriver0.pop();
        int int10 = stackTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) 100 + "'", obj4, (short) 100);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) 100 + "'", obj5, (short) 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (short) 100 + "'", obj8, (short) 100);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (short) 100 + "'", obj9, (short) 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test185");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (-1.0d));
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) 0);
        boolean boolean8 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0 + "'", obj7, 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test186");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (short) 100);
        java.lang.Object obj5 = stackTestDriver0.peek();
        int int6 = stackTestDriver0.size();
        java.lang.Class<?> wildcardClass7 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) 100 + "'", obj4, (short) 100);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) 100 + "'", obj5, (short) 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test187");
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
        boolean boolean16 = stackTestDriver0.isEmpty();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) 100 + "'", obj4, (short) 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (short) 100 + "'", obj14, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test188");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        int int4 = stackTestDriver0.size();
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) (short) 10);
        experiment.util.StackTestDriver stackTestDriver7 = new experiment.util.StackTestDriver();
        stackTestDriver7.clear();
        stackTestDriver7.clear();
        boolean boolean10 = stackTestDriver7.isEmpty();
        int int11 = stackTestDriver7.size();
        java.lang.Object obj13 = stackTestDriver7.push((java.lang.Object) (short) -1);
        java.lang.Class<?> wildcardClass14 = stackTestDriver7.getClass();
        java.lang.Object obj15 = stackTestDriver0.push((java.lang.Object) stackTestDriver7);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 10 + "'", obj6, (short) 10);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (short) -1 + "'", obj13, (short) -1);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test189");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (-1L));
        stackTestDriver0.clear();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (-1L) + "'", obj2, (-1L));
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test190");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (-1.0d));
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) 0);
        boolean boolean8 = stackTestDriver0.isEmpty();
        java.lang.Object obj9 = stackTestDriver0.pop();
        java.lang.Object obj10 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver11 = new experiment.util.StackTestDriver();
        stackTestDriver11.clear();
        stackTestDriver11.clear();
        stackTestDriver11.clear();
        java.lang.Object obj16 = stackTestDriver11.push((java.lang.Object) (-1.0d));
        java.lang.Object obj18 = stackTestDriver11.push((java.lang.Object) 0);
        boolean boolean19 = stackTestDriver11.isEmpty();
        java.lang.Object obj20 = stackTestDriver11.pop();
        boolean boolean21 = stackTestDriver11.isEmpty();
        java.lang.Object obj22 = stackTestDriver11.pop();
        experiment.util.StackTestDriver stackTestDriver23 = new experiment.util.StackTestDriver();
        stackTestDriver23.clear();
        stackTestDriver23.clear();
        boolean boolean26 = stackTestDriver23.isEmpty();
        java.lang.Object obj28 = stackTestDriver23.push((java.lang.Object) false);
        java.lang.Object obj29 = stackTestDriver23.pop();
        java.lang.Object obj30 = stackTestDriver11.push((java.lang.Object) stackTestDriver23);
        boolean boolean31 = stackTestDriver11.isEmpty();
        stackTestDriver11.clear();
        stackTestDriver11.clear();
        java.lang.Object obj34 = stackTestDriver0.push((java.lang.Object) stackTestDriver11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj35 = stackTestDriver11.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0 + "'", obj7, 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0 + "'", obj9, 0);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (-1.0d) + "'", obj10, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (-1.0d) + "'", obj16, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 0 + "'", obj18, 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 0 + "'", obj20, 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (-1.0d) + "'", obj22, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + false + "'", obj28, false);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + false + "'", obj29, false);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(obj34);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test191");
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
        java.lang.Class<?> wildcardClass19 = obj18.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (short) 100 + "'", obj14, (short) 100);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (short) 100 + "'", obj15, (short) 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 1 + "'", obj17, 1);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 1 + "'", obj18, 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test192");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        int int4 = stackTestDriver0.size();
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) (short) 10);
        int int7 = stackTestDriver0.size();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        stackTestDriver10.clear();
        stackTestDriver10.clear();
        stackTestDriver10.clear();
        java.lang.Object obj15 = stackTestDriver10.push((java.lang.Object) (-1.0d));
        java.lang.Object obj17 = stackTestDriver10.push((java.lang.Object) 0);
        boolean boolean18 = stackTestDriver10.isEmpty();
        java.lang.Object obj19 = stackTestDriver10.pop();
        java.lang.Object obj20 = stackTestDriver10.pop();
        stackTestDriver10.clear();
        java.lang.Object obj22 = stackTestDriver0.push((java.lang.Object) stackTestDriver10);
        java.lang.Class<?> wildcardClass23 = stackTestDriver10.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 10 + "'", obj6, (short) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (-1.0d) + "'", obj15, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 0 + "'", obj17, 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 0 + "'", obj19, 0);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (-1.0d) + "'", obj20, (-1.0d));
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test193");
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
        stackTestDriver11.clear();
        stackTestDriver11.clear();
        int int15 = stackTestDriver11.size();
        experiment.util.StackTestDriver stackTestDriver16 = new experiment.util.StackTestDriver();
        stackTestDriver16.clear();
        int int18 = stackTestDriver16.size();
        java.lang.Object obj19 = stackTestDriver11.push((java.lang.Object) int18);
        java.lang.Object obj20 = stackTestDriver0.push((java.lang.Object) stackTestDriver11);
        java.lang.Object obj21 = stackTestDriver0.pop();
        java.lang.Class<?> wildcardClass22 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0 + "'", obj7, 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0 + "'", obj9, 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 0 + "'", obj19, 0);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test194");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (-1.0d));
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) 0);
        boolean boolean8 = stackTestDriver0.isEmpty();
        java.lang.Object obj9 = stackTestDriver0.pop();
        java.lang.Object obj10 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver11 = new experiment.util.StackTestDriver();
        stackTestDriver11.clear();
        stackTestDriver11.clear();
        stackTestDriver11.clear();
        java.lang.Object obj16 = stackTestDriver11.push((java.lang.Object) (-1.0d));
        java.lang.Object obj18 = stackTestDriver11.push((java.lang.Object) 0);
        boolean boolean19 = stackTestDriver11.isEmpty();
        java.lang.Object obj20 = stackTestDriver11.pop();
        boolean boolean21 = stackTestDriver11.isEmpty();
        java.lang.Object obj22 = stackTestDriver11.pop();
        experiment.util.StackTestDriver stackTestDriver23 = new experiment.util.StackTestDriver();
        stackTestDriver23.clear();
        stackTestDriver23.clear();
        boolean boolean26 = stackTestDriver23.isEmpty();
        java.lang.Object obj28 = stackTestDriver23.push((java.lang.Object) false);
        java.lang.Object obj29 = stackTestDriver23.pop();
        java.lang.Object obj30 = stackTestDriver11.push((java.lang.Object) stackTestDriver23);
        boolean boolean31 = stackTestDriver11.isEmpty();
        stackTestDriver11.clear();
        stackTestDriver11.clear();
        java.lang.Object obj34 = stackTestDriver0.push((java.lang.Object) stackTestDriver11);
        java.lang.Class<?> wildcardClass35 = stackTestDriver11.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0 + "'", obj7, 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0 + "'", obj9, 0);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (-1.0d) + "'", obj10, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (-1.0d) + "'", obj16, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 0 + "'", obj18, 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 0 + "'", obj20, 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (-1.0d) + "'", obj22, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + false + "'", obj28, false);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + false + "'", obj29, false);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test195");
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
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        stackTestDriver15.clear();
        stackTestDriver15.clear();
        java.lang.Object obj19 = stackTestDriver15.push((java.lang.Object) (short) 100);
        stackTestDriver15.clear();
        java.lang.Object obj21 = stackTestDriver0.push((java.lang.Object) stackTestDriver15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = stackTestDriver15.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) 100 + "'", obj4, (short) 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (short) 100 + "'", obj14, (short) 100);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (short) 100 + "'", obj19, (short) 100);
        org.junit.Assert.assertNotNull(obj21);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test196");
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
        int int10 = stackTestDriver0.size();
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test197");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (-1.0d));
        boolean boolean6 = stackTestDriver0.isEmpty();
        java.lang.Object obj7 = stackTestDriver0.peek();
        java.lang.Object obj8 = stackTestDriver0.pop();
        boolean boolean9 = stackTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test198");
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
        java.lang.Object obj18 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        java.lang.Object obj19 = stackTestDriver0.peek();
        java.lang.Object obj20 = stackTestDriver0.peek();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0 + "'", obj7, 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0 + "'", obj9, 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (byte) 1 + "'", obj18, (byte) 1);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (byte) 1 + "'", obj19, (byte) 1);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (byte) 1 + "'", obj20, (byte) 1);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test199");
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
        boolean boolean10 = stackTestDriver0.isEmpty();
        int int11 = stackTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test200");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (-1.0d));
        boolean boolean6 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test201");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        int int4 = stackTestDriver0.size();
        boolean boolean5 = stackTestDriver0.isEmpty();
        boolean boolean6 = stackTestDriver0.isEmpty();
        boolean boolean7 = stackTestDriver0.isEmpty();
        int int8 = stackTestDriver0.size();
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test202");
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
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver19 = new experiment.util.StackTestDriver();
        java.lang.Object obj20 = stackTestDriver0.push((java.lang.Object) stackTestDriver19);
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (short) 100 + "'", obj14, (short) 100);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (short) 100 + "'", obj15, (short) 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 1 + "'", obj17, 1);
        org.junit.Assert.assertNotNull(obj20);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test203");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (short) 100);
        int int5 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        stackTestDriver6.clear();
        stackTestDriver6.clear();
        java.lang.Object obj10 = stackTestDriver6.push((java.lang.Object) (short) 100);
        int int11 = stackTestDriver6.size();
        experiment.util.StackTestDriver stackTestDriver12 = new experiment.util.StackTestDriver();
        stackTestDriver12.clear();
        stackTestDriver12.clear();
        stackTestDriver12.clear();
        java.lang.Class<?> wildcardClass16 = stackTestDriver12.getClass();
        java.lang.Object obj17 = stackTestDriver6.push((java.lang.Object) stackTestDriver12);
        boolean boolean18 = stackTestDriver6.isEmpty();
        java.lang.Object obj20 = stackTestDriver6.push((java.lang.Object) (short) 100);
        boolean boolean21 = stackTestDriver6.isEmpty();
        int int22 = stackTestDriver6.size();
        java.lang.Object obj23 = stackTestDriver0.push((java.lang.Object) stackTestDriver6);
        experiment.util.StackTestDriver stackTestDriver24 = new experiment.util.StackTestDriver();
        stackTestDriver24.clear();
        stackTestDriver24.clear();
        stackTestDriver24.clear();
        java.lang.Object obj29 = stackTestDriver24.push((java.lang.Object) (-1.0d));
        boolean boolean30 = stackTestDriver24.isEmpty();
        java.lang.Object obj31 = stackTestDriver24.peek();
        boolean boolean32 = stackTestDriver24.isEmpty();
        int int33 = stackTestDriver24.size();
        boolean boolean34 = stackTestDriver24.isEmpty();
        java.lang.Object obj35 = stackTestDriver6.push((java.lang.Object) boolean34);
        java.lang.Class<?> wildcardClass36 = obj35.getClass();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) 100 + "'", obj4, (short) 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (short) 100 + "'", obj10, (short) 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (short) 100 + "'", obj20, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + (-1.0d) + "'", obj29, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + (-1.0d) + "'", obj31, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + false + "'", obj35, false);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test204");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (-1.0d));
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) 0);
        java.lang.Object obj8 = stackTestDriver0.pop();
        int int9 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        stackTestDriver10.clear();
        stackTestDriver10.clear();
        stackTestDriver10.clear();
        java.lang.Object obj15 = stackTestDriver10.push((java.lang.Object) (-1.0d));
        java.lang.Object obj16 = stackTestDriver10.peek();
        int int17 = stackTestDriver10.size();
        stackTestDriver10.clear();
        java.lang.Object obj19 = stackTestDriver0.push((java.lang.Object) stackTestDriver10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = stackTestDriver10.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0 + "'", obj7, 0);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0 + "'", obj8, 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (-1.0d) + "'", obj15, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (-1.0d) + "'", obj16, (-1.0d));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(obj19);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test205");
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
        boolean boolean10 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        java.lang.Class<?> wildcardClass12 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test206");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        int int4 = stackTestDriver0.size();
        stackTestDriver0.clear();
        int int6 = stackTestDriver0.size();
        int int7 = stackTestDriver0.size();
        boolean boolean8 = stackTestDriver0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test207");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (short) 100);
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) 100 + "'", obj4, (short) 100);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test208");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (-1.0d));
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) 0);
        boolean boolean8 = stackTestDriver0.isEmpty();
        java.lang.Object obj9 = stackTestDriver0.pop();
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0 + "'", obj7, 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0 + "'", obj9, 0);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test209");
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
        stackTestDriver11.clear();
        stackTestDriver11.clear();
        int int15 = stackTestDriver11.size();
        experiment.util.StackTestDriver stackTestDriver16 = new experiment.util.StackTestDriver();
        stackTestDriver16.clear();
        int int18 = stackTestDriver16.size();
        java.lang.Object obj19 = stackTestDriver11.push((java.lang.Object) int18);
        java.lang.Object obj20 = stackTestDriver0.push((java.lang.Object) stackTestDriver11);
        experiment.util.StackTestDriver stackTestDriver21 = new experiment.util.StackTestDriver();
        stackTestDriver21.clear();
        stackTestDriver21.clear();
        stackTestDriver21.clear();
        int int25 = stackTestDriver21.size();
        boolean boolean26 = stackTestDriver21.isEmpty();
        boolean boolean27 = stackTestDriver21.isEmpty();
        boolean boolean28 = stackTestDriver21.isEmpty();
        stackTestDriver21.clear();
        stackTestDriver21.clear();
        experiment.util.StackTestDriver stackTestDriver31 = new experiment.util.StackTestDriver();
        stackTestDriver31.clear();
        stackTestDriver31.clear();
        java.lang.Object obj35 = stackTestDriver31.push((java.lang.Object) (short) 100);
        java.lang.Object obj36 = stackTestDriver31.peek();
        int int37 = stackTestDriver31.size();
        java.lang.Object obj38 = stackTestDriver21.push((java.lang.Object) int37);
        stackTestDriver21.clear();
        experiment.util.StackTestDriver stackTestDriver40 = new experiment.util.StackTestDriver();
        java.lang.Object obj41 = stackTestDriver21.push((java.lang.Object) stackTestDriver40);
        java.lang.Object obj42 = stackTestDriver11.push(obj41);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0 + "'", obj7, 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0 + "'", obj9, 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 0 + "'", obj19, 0);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + (short) 100 + "'", obj35, (short) 100);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + (short) 100 + "'", obj36, (short) 100);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + 1 + "'", obj38, 1);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertNotNull(obj42);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test210");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) false);
        java.lang.Object obj6 = stackTestDriver0.pop();
        stackTestDriver0.clear();
        boolean boolean8 = stackTestDriver0.isEmpty();
        int int9 = stackTestDriver0.size();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + false + "'", obj5, false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + false + "'", obj6, false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test211");
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
        experiment.util.StackTestDriver stackTestDriver32 = new experiment.util.StackTestDriver();
        stackTestDriver32.clear();
        stackTestDriver32.clear();
        stackTestDriver32.clear();
        java.lang.Object obj37 = stackTestDriver32.push((java.lang.Object) (-1.0d));
        java.lang.Object obj39 = stackTestDriver32.push((java.lang.Object) 0);
        boolean boolean40 = stackTestDriver32.isEmpty();
        java.lang.Object obj41 = stackTestDriver32.pop();
        boolean boolean42 = stackTestDriver32.isEmpty();
        java.lang.Object obj43 = stackTestDriver32.pop();
        java.lang.Object obj45 = stackTestDriver32.push((java.lang.Object) 1.0f);
        boolean boolean46 = stackTestDriver32.isEmpty();
        java.lang.Object obj47 = stackTestDriver0.push((java.lang.Object) stackTestDriver32);
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
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + (-1.0d) + "'", obj37, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + 0 + "'", obj39, 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + 0 + "'", obj41, 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + (-1.0d) + "'", obj43, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + 1.0f + "'", obj45, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(obj47);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test212");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (-1.0d));
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) 0);
        boolean boolean8 = stackTestDriver0.isEmpty();
        java.lang.Class<?> wildcardClass9 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0 + "'", obj7, 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test213");
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
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver19 = new experiment.util.StackTestDriver();
        java.lang.Object obj20 = stackTestDriver0.push((java.lang.Object) stackTestDriver19);
        int int21 = stackTestDriver0.size();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (short) 100 + "'", obj14, (short) 100);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (short) 100 + "'", obj15, (short) 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 1 + "'", obj17, 1);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test214");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        int int4 = stackTestDriver0.size();
        stackTestDriver0.clear();
        int int6 = stackTestDriver0.size();
        int int7 = stackTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test215");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (-1.0d));
        java.lang.Object obj6 = stackTestDriver0.peek();
        int int7 = stackTestDriver0.size();
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1.0d) + "'", obj6, (-1.0d));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test216");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (-1.0d));
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) 0);
        boolean boolean8 = stackTestDriver0.isEmpty();
        java.lang.Object obj9 = stackTestDriver0.pop();
        java.lang.Object obj10 = stackTestDriver0.peek();
        stackTestDriver0.clear();
        boolean boolean12 = stackTestDriver0.isEmpty();
        java.lang.Class<?> wildcardClass13 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0 + "'", obj7, 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0 + "'", obj9, 0);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (-1.0d) + "'", obj10, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test217");
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
        int int10 = stackTestDriver0.size();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test218");
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
        experiment.util.StackTestDriver stackTestDriver17 = new experiment.util.StackTestDriver();
        stackTestDriver17.clear();
        stackTestDriver17.clear();
        stackTestDriver17.clear();
        int int21 = stackTestDriver17.size();
        boolean boolean22 = stackTestDriver17.isEmpty();
        boolean boolean23 = stackTestDriver17.isEmpty();
        boolean boolean24 = stackTestDriver17.isEmpty();
        int int25 = stackTestDriver17.size();
        stackTestDriver17.clear();
        experiment.util.StackTestDriver stackTestDriver27 = new experiment.util.StackTestDriver();
        stackTestDriver27.clear();
        stackTestDriver27.clear();
        stackTestDriver27.clear();
        int int31 = stackTestDriver27.size();
        boolean boolean32 = stackTestDriver27.isEmpty();
        boolean boolean33 = stackTestDriver27.isEmpty();
        stackTestDriver27.clear();
        java.lang.Class<?> wildcardClass35 = stackTestDriver27.getClass();
        java.lang.Object obj36 = stackTestDriver17.push((java.lang.Object) stackTestDriver27);
        java.lang.Object obj37 = stackTestDriver17.pop();
        experiment.util.StackTestDriver stackTestDriver38 = new experiment.util.StackTestDriver();
        stackTestDriver38.clear();
        stackTestDriver38.clear();
        stackTestDriver38.clear();
        java.lang.Object obj43 = stackTestDriver38.push((java.lang.Object) (-1.0d));
        java.lang.Object obj45 = stackTestDriver38.push((java.lang.Object) 0);
        boolean boolean46 = stackTestDriver38.isEmpty();
        java.lang.Object obj47 = stackTestDriver38.pop();
        boolean boolean48 = stackTestDriver38.isEmpty();
        experiment.util.StackTestDriver stackTestDriver49 = new experiment.util.StackTestDriver();
        stackTestDriver49.clear();
        stackTestDriver49.clear();
        stackTestDriver49.clear();
        int int53 = stackTestDriver49.size();
        experiment.util.StackTestDriver stackTestDriver54 = new experiment.util.StackTestDriver();
        stackTestDriver54.clear();
        int int56 = stackTestDriver54.size();
        java.lang.Object obj57 = stackTestDriver49.push((java.lang.Object) int56);
        java.lang.Object obj58 = stackTestDriver38.push((java.lang.Object) stackTestDriver49);
        java.lang.Object obj59 = stackTestDriver17.push((java.lang.Object) stackTestDriver38);
        java.lang.Object obj60 = stackTestDriver0.push(obj59);
        int int61 = stackTestDriver0.size();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0 + "'", obj7, 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0 + "'", obj9, 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + (-1.0d) + "'", obj43, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + 0 + "'", obj45, 0);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + 0 + "'", obj47, 0);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertEquals("'" + obj57 + "' != '" + 0 + "'", obj57, 0);
        org.junit.Assert.assertNotNull(obj58);
        org.junit.Assert.assertNotNull(obj59);
        org.junit.Assert.assertNotNull(obj60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 3 + "'", int61 == 3);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test219");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (-1.0d));
        boolean boolean6 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        boolean boolean8 = stackTestDriver0.isEmpty();
        boolean boolean9 = stackTestDriver0.isEmpty();
        int int10 = stackTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test220");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        int int4 = stackTestDriver0.size();
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
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test221");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (short) 100);
        int int5 = stackTestDriver0.size();
        int int6 = stackTestDriver0.size();
        java.lang.Object obj7 = stackTestDriver0.peek();
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) 100 + "'", obj4, (short) 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (short) 100 + "'", obj7, (short) 100);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test222");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (short) 100);
        java.lang.Object obj5 = stackTestDriver0.peek();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver7 = new experiment.util.StackTestDriver();
        stackTestDriver7.clear();
        stackTestDriver7.clear();
        stackTestDriver7.clear();
        java.lang.Object obj12 = stackTestDriver7.push((java.lang.Object) (-1.0d));
        java.lang.Object obj14 = stackTestDriver7.push((java.lang.Object) 0);
        boolean boolean15 = stackTestDriver7.isEmpty();
        java.lang.Object obj16 = stackTestDriver7.pop();
        boolean boolean17 = stackTestDriver7.isEmpty();
        java.lang.Object obj18 = stackTestDriver7.pop();
        java.lang.Object obj20 = stackTestDriver7.push((java.lang.Object) 1.0f);
        java.lang.Object obj21 = stackTestDriver0.push(obj20);
        java.lang.Class<?> wildcardClass22 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) 100 + "'", obj4, (short) 100);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) 100 + "'", obj5, (short) 100);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (-1.0d) + "'", obj12, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 0 + "'", obj14, 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0 + "'", obj16, 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (-1.0d) + "'", obj18, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 1.0f + "'", obj20, 1.0f);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 1.0f + "'", obj21, 1.0f);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test223");
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
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
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
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test224");
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
        java.lang.Object obj10 = stackTestDriver0.peek();
        java.lang.Object obj11 = stackTestDriver0.peek();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0 + "'", obj8, 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 0 + "'", obj10, 0);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 0 + "'", obj11, 0);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test225");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (-1.0d));
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) 0);
        java.lang.Object obj8 = stackTestDriver0.pop();
        int int9 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        stackTestDriver10.clear();
        stackTestDriver10.clear();
        stackTestDriver10.clear();
        java.lang.Object obj15 = stackTestDriver10.push((java.lang.Object) (-1.0d));
        java.lang.Object obj16 = stackTestDriver10.peek();
        int int17 = stackTestDriver10.size();
        stackTestDriver10.clear();
        java.lang.Object obj19 = stackTestDriver0.push((java.lang.Object) stackTestDriver10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = stackTestDriver10.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0 + "'", obj7, 0);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0 + "'", obj8, 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (-1.0d) + "'", obj15, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (-1.0d) + "'", obj16, (-1.0d));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(obj19);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test226");
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
        int int12 = stackTestDriver0.size();
        stackTestDriver0.clear();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0 + "'", obj8, 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test227");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (-1.0d));
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) 0);
        java.lang.Object obj8 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver9 = new experiment.util.StackTestDriver();
        stackTestDriver9.clear();
        stackTestDriver9.clear();
        stackTestDriver9.clear();
        int int13 = stackTestDriver9.size();
        boolean boolean14 = stackTestDriver9.isEmpty();
        boolean boolean15 = stackTestDriver9.isEmpty();
        boolean boolean16 = stackTestDriver9.isEmpty();
        int int17 = stackTestDriver9.size();
        stackTestDriver9.clear();
        experiment.util.StackTestDriver stackTestDriver19 = new experiment.util.StackTestDriver();
        stackTestDriver19.clear();
        stackTestDriver19.clear();
        stackTestDriver19.clear();
        int int23 = stackTestDriver19.size();
        boolean boolean24 = stackTestDriver19.isEmpty();
        boolean boolean25 = stackTestDriver19.isEmpty();
        stackTestDriver19.clear();
        java.lang.Class<?> wildcardClass27 = stackTestDriver19.getClass();
        java.lang.Object obj28 = stackTestDriver9.push((java.lang.Object) stackTestDriver19);
        java.lang.Object obj29 = stackTestDriver0.push(obj28);
        boolean boolean30 = stackTestDriver0.isEmpty();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0 + "'", obj7, 0);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0 + "'", obj8, 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test228");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (-1.0d));
        int int6 = stackTestDriver0.size();
        java.lang.Object obj7 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        stackTestDriver8.clear();
        stackTestDriver8.clear();
        stackTestDriver8.clear();
        java.lang.Object obj13 = stackTestDriver8.push((java.lang.Object) (-1.0d));
        java.lang.Object obj15 = stackTestDriver8.push((java.lang.Object) 0);
        java.lang.Object obj16 = stackTestDriver8.pop();
        experiment.util.StackTestDriver stackTestDriver17 = new experiment.util.StackTestDriver();
        stackTestDriver17.clear();
        stackTestDriver17.clear();
        stackTestDriver17.clear();
        int int21 = stackTestDriver17.size();
        boolean boolean22 = stackTestDriver17.isEmpty();
        boolean boolean23 = stackTestDriver17.isEmpty();
        boolean boolean24 = stackTestDriver17.isEmpty();
        int int25 = stackTestDriver17.size();
        stackTestDriver17.clear();
        experiment.util.StackTestDriver stackTestDriver27 = new experiment.util.StackTestDriver();
        stackTestDriver27.clear();
        stackTestDriver27.clear();
        stackTestDriver27.clear();
        int int31 = stackTestDriver27.size();
        boolean boolean32 = stackTestDriver27.isEmpty();
        boolean boolean33 = stackTestDriver27.isEmpty();
        stackTestDriver27.clear();
        java.lang.Class<?> wildcardClass35 = stackTestDriver27.getClass();
        java.lang.Object obj36 = stackTestDriver17.push((java.lang.Object) stackTestDriver27);
        java.lang.Object obj37 = stackTestDriver8.push(obj36);
        java.lang.Object obj38 = stackTestDriver0.push((java.lang.Object) stackTestDriver8);
        int int39 = stackTestDriver0.size();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (-1.0d) + "'", obj13, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 0 + "'", obj15, 0);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0 + "'", obj16, 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test229");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) 1.0d);
        java.lang.Object obj6 = stackTestDriver0.pop();
        stackTestDriver0.clear();
        java.lang.Class<?> wildcardClass8 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 1.0d + "'", obj5, 1.0d);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0d + "'", obj6, 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test230");
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
        java.lang.Object obj26 = stackTestDriver22.push((java.lang.Object) (short) 100);
        int int27 = stackTestDriver22.size();
        java.lang.Object obj28 = stackTestDriver0.push((java.lang.Object) stackTestDriver22);
        experiment.util.StackTestDriver stackTestDriver29 = new experiment.util.StackTestDriver();
        stackTestDriver29.clear();
        stackTestDriver29.clear();
        stackTestDriver29.clear();
        java.lang.Object obj34 = stackTestDriver29.push((java.lang.Object) (-1.0d));
        java.lang.Object obj36 = stackTestDriver29.push((java.lang.Object) 0);
        boolean boolean37 = stackTestDriver29.isEmpty();
        java.lang.Object obj38 = stackTestDriver29.pop();
        boolean boolean39 = stackTestDriver29.isEmpty();
        java.lang.Object obj40 = stackTestDriver29.pop();
        experiment.util.StackTestDriver stackTestDriver41 = new experiment.util.StackTestDriver();
        stackTestDriver41.clear();
        stackTestDriver41.clear();
        boolean boolean44 = stackTestDriver41.isEmpty();
        java.lang.Object obj46 = stackTestDriver41.push((java.lang.Object) false);
        java.lang.Object obj47 = stackTestDriver41.pop();
        java.lang.Object obj48 = stackTestDriver29.push((java.lang.Object) stackTestDriver41);
        boolean boolean49 = stackTestDriver29.isEmpty();
        java.lang.Object obj50 = stackTestDriver29.peek();
        experiment.util.StackTestDriver stackTestDriver51 = new experiment.util.StackTestDriver();
        stackTestDriver51.clear();
        stackTestDriver51.clear();
        java.lang.Object obj55 = stackTestDriver51.push((java.lang.Object) (short) 100);
        int int56 = stackTestDriver51.size();
        java.lang.Object obj57 = stackTestDriver29.push((java.lang.Object) stackTestDriver51);
        java.lang.Object obj58 = stackTestDriver51.peek();
        java.lang.Object obj59 = stackTestDriver22.push((java.lang.Object) stackTestDriver51);
        java.lang.Class<?> wildcardClass60 = stackTestDriver22.getClass();
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
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + (short) 100 + "'", obj26, (short) 100);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + (-1.0d) + "'", obj34, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + 0 + "'", obj36, 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + 0 + "'", obj38, 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + (-1.0d) + "'", obj40, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + false + "'", obj46, false);
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + false + "'", obj47, false);
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(obj50);
        org.junit.Assert.assertEquals("'" + obj55 + "' != '" + (short) 100 + "'", obj55, (short) 100);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertNotNull(obj57);
        org.junit.Assert.assertEquals("'" + obj58 + "' != '" + (short) 100 + "'", obj58, (short) 100);
        org.junit.Assert.assertNotNull(obj59);
        org.junit.Assert.assertNotNull(wildcardClass60);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test231");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (-1.0d));
        java.lang.Object obj6 = stackTestDriver0.peek();
        int int7 = stackTestDriver0.size();
        boolean boolean8 = stackTestDriver0.isEmpty();
        java.lang.Object obj9 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        stackTestDriver10.clear();
        stackTestDriver10.clear();
        java.lang.Object obj14 = stackTestDriver10.push((java.lang.Object) (short) 100);
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        stackTestDriver15.clear();
        stackTestDriver15.clear();
        stackTestDriver15.clear();
        int int19 = stackTestDriver15.size();
        boolean boolean20 = stackTestDriver15.isEmpty();
        java.lang.Class<?> wildcardClass21 = stackTestDriver15.getClass();
        java.lang.Object obj22 = stackTestDriver10.push((java.lang.Object) stackTestDriver15);
        java.lang.Object obj23 = stackTestDriver0.push((java.lang.Object) stackTestDriver15);
        stackTestDriver15.clear();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1.0d) + "'", obj6, (-1.0d));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (-1.0d) + "'", obj9, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (short) 100 + "'", obj14, (short) 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(obj23);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test232");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (-1.0d));
        java.lang.Object obj6 = stackTestDriver0.peek();
        int int7 = stackTestDriver0.size();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1.0d) + "'", obj6, (-1.0d));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test233");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (short) 100);
        java.lang.Object obj5 = stackTestDriver0.peek();
        int int6 = stackTestDriver0.size();
        int int7 = stackTestDriver0.size();
        java.lang.Object obj8 = stackTestDriver0.peek();
        java.lang.Object obj9 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        stackTestDriver10.clear();
        stackTestDriver10.clear();
        boolean boolean13 = stackTestDriver10.isEmpty();
        int int14 = stackTestDriver10.size();
        java.lang.Class<?> wildcardClass15 = stackTestDriver10.getClass();
        java.lang.Object obj16 = stackTestDriver0.push((java.lang.Object) stackTestDriver10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = stackTestDriver10.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) 100 + "'", obj4, (short) 100);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) 100 + "'", obj5, (short) 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (short) 100 + "'", obj8, (short) 100);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (short) 100 + "'", obj9, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(obj16);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test234");
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
        boolean boolean20 = stackTestDriver0.isEmpty();
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test235");
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
        java.lang.Object obj20 = stackTestDriver0.pop();
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
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 1 + "'", obj20, 1);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test236");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (-1.0d));
        java.lang.Object obj6 = stackTestDriver0.peek();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) '#');
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1.0d) + "'", obj6, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + '#' + "'", obj8, '#');
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test237");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) (-1L));
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (-1L) + "'", obj2, (-1L));
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test238");
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
        int int15 = stackTestDriver0.size();
        boolean boolean16 = stackTestDriver0.isEmpty();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) 100 + "'", obj4, (short) 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test239");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (-1.0d));
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) 0);
        boolean boolean8 = stackTestDriver0.isEmpty();
        java.lang.Object obj9 = stackTestDriver0.pop();
        java.lang.Object obj10 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver11 = new experiment.util.StackTestDriver();
        stackTestDriver11.clear();
        stackTestDriver11.clear();
        stackTestDriver11.clear();
        int int15 = stackTestDriver11.size();
        java.lang.Object obj17 = stackTestDriver11.push((java.lang.Object) (short) 10);
        experiment.util.StackTestDriver stackTestDriver18 = new experiment.util.StackTestDriver();
        stackTestDriver18.clear();
        stackTestDriver18.clear();
        stackTestDriver18.clear();
        java.lang.Object obj23 = stackTestDriver18.push((java.lang.Object) (-1.0d));
        java.lang.Object obj25 = stackTestDriver18.push((java.lang.Object) 0);
        boolean boolean26 = stackTestDriver18.isEmpty();
        java.lang.Object obj27 = stackTestDriver18.pop();
        boolean boolean28 = stackTestDriver18.isEmpty();
        java.lang.Object obj29 = stackTestDriver18.pop();
        experiment.util.StackTestDriver stackTestDriver30 = new experiment.util.StackTestDriver();
        stackTestDriver30.clear();
        stackTestDriver30.clear();
        boolean boolean33 = stackTestDriver30.isEmpty();
        java.lang.Object obj35 = stackTestDriver30.push((java.lang.Object) false);
        java.lang.Object obj36 = stackTestDriver30.pop();
        java.lang.Object obj37 = stackTestDriver18.push((java.lang.Object) stackTestDriver30);
        boolean boolean38 = stackTestDriver18.isEmpty();
        java.lang.Object obj39 = stackTestDriver11.push((java.lang.Object) boolean38);
        java.lang.Object obj40 = stackTestDriver0.push((java.lang.Object) boolean38);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0 + "'", obj7, 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0 + "'", obj9, 0);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (-1.0d) + "'", obj10, (-1.0d));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (short) 10 + "'", obj17, (short) 10);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (-1.0d) + "'", obj23, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 0 + "'", obj25, 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 0 + "'", obj27, 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + (-1.0d) + "'", obj29, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + false + "'", obj35, false);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + false + "'", obj36, false);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + false + "'", obj39, false);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + false + "'", obj40, false);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test240");
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
        experiment.util.StackTestDriver stackTestDriver13 = new experiment.util.StackTestDriver();
        stackTestDriver13.clear();
        stackTestDriver13.clear();
        stackTestDriver13.clear();
        java.lang.Object obj18 = stackTestDriver13.push((java.lang.Object) (-1.0d));
        java.lang.Object obj20 = stackTestDriver13.push((java.lang.Object) 0);
        boolean boolean21 = stackTestDriver13.isEmpty();
        java.lang.Object obj22 = stackTestDriver13.pop();
        java.lang.Object obj23 = stackTestDriver13.pop();
        stackTestDriver13.clear();
        java.lang.Object obj25 = stackTestDriver7.push((java.lang.Object) stackTestDriver13);
        experiment.util.StackTestDriver stackTestDriver26 = new experiment.util.StackTestDriver();
        stackTestDriver26.clear();
        int int28 = stackTestDriver26.size();
        stackTestDriver26.clear();
        int int30 = stackTestDriver26.size();
        int int31 = stackTestDriver26.size();
        java.lang.Object obj32 = stackTestDriver7.push((java.lang.Object) stackTestDriver26);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (-1.0d) + "'", obj18, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 0 + "'", obj20, 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 0 + "'", obj22, 0);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (-1.0d) + "'", obj23, (-1.0d));
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(obj32);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test241");
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
        boolean boolean11 = stackTestDriver0.isEmpty();
        int int12 = stackTestDriver0.size();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test242");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (-1.0d));
        int int6 = stackTestDriver0.size();
        java.lang.Object obj7 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        stackTestDriver8.clear();
        stackTestDriver8.clear();
        stackTestDriver8.clear();
        java.lang.Object obj13 = stackTestDriver8.push((java.lang.Object) (-1.0d));
        java.lang.Object obj15 = stackTestDriver8.push((java.lang.Object) 0);
        java.lang.Object obj16 = stackTestDriver8.pop();
        experiment.util.StackTestDriver stackTestDriver17 = new experiment.util.StackTestDriver();
        stackTestDriver17.clear();
        stackTestDriver17.clear();
        stackTestDriver17.clear();
        int int21 = stackTestDriver17.size();
        boolean boolean22 = stackTestDriver17.isEmpty();
        boolean boolean23 = stackTestDriver17.isEmpty();
        boolean boolean24 = stackTestDriver17.isEmpty();
        int int25 = stackTestDriver17.size();
        stackTestDriver17.clear();
        experiment.util.StackTestDriver stackTestDriver27 = new experiment.util.StackTestDriver();
        stackTestDriver27.clear();
        stackTestDriver27.clear();
        stackTestDriver27.clear();
        int int31 = stackTestDriver27.size();
        boolean boolean32 = stackTestDriver27.isEmpty();
        boolean boolean33 = stackTestDriver27.isEmpty();
        stackTestDriver27.clear();
        java.lang.Class<?> wildcardClass35 = stackTestDriver27.getClass();
        java.lang.Object obj36 = stackTestDriver17.push((java.lang.Object) stackTestDriver27);
        java.lang.Object obj37 = stackTestDriver8.push(obj36);
        java.lang.Object obj38 = stackTestDriver0.push((java.lang.Object) stackTestDriver8);
        java.lang.Class<?> wildcardClass39 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0d) + "'", obj7, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (-1.0d) + "'", obj13, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 0 + "'", obj15, 0);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0 + "'", obj16, 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test243");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (-1.0d));
        java.lang.Object obj6 = stackTestDriver0.peek();
        int int7 = stackTestDriver0.size();
        int int8 = stackTestDriver0.size();
        java.lang.Class<?> wildcardClass9 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1.0d) + "'", obj6, (-1.0d));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test244");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        int int4 = stackTestDriver0.size();
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) (short) 10);
        int int7 = stackTestDriver0.size();
        java.lang.Class<?> wildcardClass8 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 10 + "'", obj6, (short) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test245");
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
        experiment.util.StackTestDriver stackTestDriver13 = new experiment.util.StackTestDriver();
        stackTestDriver13.clear();
        stackTestDriver13.clear();
        stackTestDriver13.clear();
        java.lang.Object obj18 = stackTestDriver13.push((java.lang.Object) (-1.0d));
        java.lang.Object obj20 = stackTestDriver13.push((java.lang.Object) 0);
        boolean boolean21 = stackTestDriver13.isEmpty();
        java.lang.Object obj22 = stackTestDriver13.pop();
        java.lang.Object obj23 = stackTestDriver13.pop();
        stackTestDriver13.clear();
        java.lang.Object obj25 = stackTestDriver7.push((java.lang.Object) stackTestDriver13);
        boolean boolean26 = stackTestDriver13.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj27 = stackTestDriver13.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (-1.0d) + "'", obj18, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 0 + "'", obj20, 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 0 + "'", obj22, 0);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (-1.0d) + "'", obj23, (-1.0d));
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test246");
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
        java.lang.Object obj18 = stackTestDriver0.push((java.lang.Object) (byte) 1);
        java.lang.Object obj19 = stackTestDriver0.peek();
        java.lang.Class<?> wildcardClass20 = stackTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0 + "'", obj7, 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0 + "'", obj9, 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (byte) 1 + "'", obj18, (byte) 1);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (byte) 1 + "'", obj19, (byte) 1);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test247");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (short) 100);
        java.lang.Object obj5 = stackTestDriver0.peek();
        java.lang.Object obj6 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver7 = new experiment.util.StackTestDriver();
        stackTestDriver7.clear();
        stackTestDriver7.clear();
        stackTestDriver7.clear();
        java.lang.Object obj12 = stackTestDriver7.push((java.lang.Object) (-1.0d));
        java.lang.Object obj14 = stackTestDriver7.push((java.lang.Object) 0);
        boolean boolean15 = stackTestDriver7.isEmpty();
        java.lang.Object obj16 = stackTestDriver7.pop();
        boolean boolean17 = stackTestDriver7.isEmpty();
        java.lang.Object obj18 = stackTestDriver7.pop();
        experiment.util.StackTestDriver stackTestDriver19 = new experiment.util.StackTestDriver();
        stackTestDriver19.clear();
        stackTestDriver19.clear();
        boolean boolean22 = stackTestDriver19.isEmpty();
        java.lang.Object obj24 = stackTestDriver19.push((java.lang.Object) false);
        java.lang.Object obj25 = stackTestDriver19.pop();
        java.lang.Object obj26 = stackTestDriver7.push((java.lang.Object) stackTestDriver19);
        boolean boolean27 = stackTestDriver7.isEmpty();
        java.lang.Object obj28 = stackTestDriver7.peek();
        experiment.util.StackTestDriver stackTestDriver29 = new experiment.util.StackTestDriver();
        stackTestDriver29.clear();
        stackTestDriver29.clear();
        java.lang.Object obj33 = stackTestDriver29.push((java.lang.Object) (short) 100);
        int int34 = stackTestDriver29.size();
        java.lang.Object obj35 = stackTestDriver7.push((java.lang.Object) stackTestDriver29);
        java.lang.Object obj36 = stackTestDriver29.peek();
        java.lang.Class<?> wildcardClass37 = obj36.getClass();
        java.lang.Object obj38 = stackTestDriver0.push((java.lang.Object) wildcardClass37);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) 100 + "'", obj4, (short) 100);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) 100 + "'", obj5, (short) 100);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 100 + "'", obj6, (short) 100);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (-1.0d) + "'", obj12, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 0 + "'", obj14, 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0 + "'", obj16, 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (-1.0d) + "'", obj18, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + false + "'", obj24, false);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + false + "'", obj25, false);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + (short) 100 + "'", obj33, (short) 100);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + (short) 100 + "'", obj36, (short) 100);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertEquals(obj38.toString(), "class java.lang.Short");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj38), "class java.lang.Short");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj38), "class java.lang.Short");
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test248");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (-1.0d));
        java.lang.Object obj6 = stackTestDriver0.peek();
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) '#');
        int int9 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        stackTestDriver10.clear();
        stackTestDriver10.clear();
        stackTestDriver10.clear();
        int int14 = stackTestDriver10.size();
        boolean boolean15 = stackTestDriver10.isEmpty();
        boolean boolean16 = stackTestDriver10.isEmpty();
        boolean boolean17 = stackTestDriver10.isEmpty();
        int int18 = stackTestDriver10.size();
        boolean boolean19 = stackTestDriver10.isEmpty();
        boolean boolean20 = stackTestDriver10.isEmpty();
        java.lang.Class<?> wildcardClass21 = stackTestDriver10.getClass();
        java.lang.Object obj22 = stackTestDriver0.push((java.lang.Object) stackTestDriver10);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1.0d) + "'", obj6, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + '#' + "'", obj8, '#');
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(obj22);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test249");
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
        java.lang.Object obj13 = stackTestDriver0.push((java.lang.Object) 1.0f);
        boolean boolean14 = stackTestDriver0.isEmpty();
        boolean boolean15 = stackTestDriver0.isEmpty();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0 + "'", obj7, 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0 + "'", obj9, 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (-1.0d) + "'", obj11, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 1.0f + "'", obj13, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test250");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        int int4 = stackTestDriver0.size();
        stackTestDriver0.clear();
        int int6 = stackTestDriver0.size();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test251");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        int int4 = stackTestDriver0.size();
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) (short) -1);
        stackTestDriver0.clear();
        int int8 = stackTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) -1 + "'", obj6, (short) -1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test252");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        int int4 = stackTestDriver0.size();
        boolean boolean5 = stackTestDriver0.isEmpty();
        boolean boolean6 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        boolean boolean8 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test253");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) false);
        java.lang.Object obj6 = stackTestDriver0.pop();
        stackTestDriver0.clear();
        int int8 = stackTestDriver0.size();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + false + "'", obj5, false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + false + "'", obj6, false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test254");
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
        stackTestDriver0.clear();
        int int19 = stackTestDriver0.size();
        java.lang.Class<?> wildcardClass20 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (short) 100 + "'", obj14, (short) 100);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (short) 100 + "'", obj15, (short) 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 1 + "'", obj17, 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test255");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (-1.0d));
        java.lang.Object obj6 = stackTestDriver0.peek();
        int int7 = stackTestDriver0.size();
        int int8 = stackTestDriver0.size();
        boolean boolean9 = stackTestDriver0.isEmpty();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1.0d) + "'", obj6, (-1.0d));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_1256357748_1024_0.test256");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (-1.0d));
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) 0);
        boolean boolean8 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        int int10 = stackTestDriver0.size();
        stackTestDriver0.clear();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0 + "'", obj7, 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

}
