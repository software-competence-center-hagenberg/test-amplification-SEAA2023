package experiment.util.test;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Regression_StackTest_379375655_1024_0 {

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
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test001");
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
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test002");
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
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test003");
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
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test004");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        int int2 = stackTestDriver0.size();
        boolean boolean3 = stackTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test005");
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
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test006");
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
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test007");
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
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test008");
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
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test009");
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
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test010");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        int int2 = stackTestDriver0.size();
        boolean boolean3 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test011");
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
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test012");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test013");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        int int2 = stackTestDriver0.size();
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Class<?> wildcardClass4 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test014");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        boolean boolean4 = stackTestDriver0.isEmpty();
        int int5 = stackTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test015");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
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
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test016");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        boolean boolean6 = stackTestDriver4.isEmpty();
        java.lang.Object obj8 = stackTestDriver4.push((java.lang.Object) (-1.0f));
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        java.lang.Object obj10 = stackTestDriver4.pop();
        java.lang.Class<?> wildcardClass11 = stackTestDriver4.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0f) + "'", obj8, (-1.0f));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (-1.0f) + "'", obj10, (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test017");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        java.lang.Class<?> wildcardClass2 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test018");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        boolean boolean6 = stackTestDriver4.isEmpty();
        java.lang.Object obj8 = stackTestDriver4.push((java.lang.Object) (-1.0f));
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        java.lang.Object obj10 = stackTestDriver4.pop();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = stackTestDriver4.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0f) + "'", obj8, (-1.0f));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (-1.0f) + "'", obj10, (-1.0f));
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test019");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) (short) 1);
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1.0f) + "'", obj4, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 1 + "'", obj6, (short) 1);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test020");
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
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test021");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        int int4 = stackTestDriver0.size();
        java.lang.Class<?> wildcardClass5 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test022");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        int int3 = stackTestDriver0.size();
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
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test023");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (-1.0f));
        stackTestDriver0.clear();
        java.lang.Class<?> wildcardClass6 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1.0f) + "'", obj4, (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test024");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (-1.0f));
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
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1.0f) + "'", obj4, (-1.0f));
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test025");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (-1.0f));
        boolean boolean5 = stackTestDriver0.isEmpty();
        int int6 = stackTestDriver0.size();
        java.lang.Class<?> wildcardClass7 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1.0f) + "'", obj4, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test026");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        boolean boolean3 = stackTestDriver0.isEmpty();
        boolean boolean4 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        int int6 = stackTestDriver0.size();
        java.lang.Class<?> wildcardClass7 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test027");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (-1.0f));
        java.lang.Object obj5 = stackTestDriver0.pop();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1.0f) + "'", obj4, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0f) + "'", obj5, (-1.0f));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test028");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) (short) 1);
        java.lang.Class<?> wildcardClass7 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1.0f) + "'", obj4, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 1 + "'", obj6, (short) 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test029");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        boolean boolean3 = stackTestDriver0.isEmpty();
        boolean boolean4 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test030");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver2 = new experiment.util.StackTestDriver();
        stackTestDriver2.clear();
        boolean boolean4 = stackTestDriver2.isEmpty();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) stackTestDriver2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = stackTestDriver2.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test031");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Class<?> wildcardClass4 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test032");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver2 = new experiment.util.StackTestDriver();
        stackTestDriver2.clear();
        boolean boolean4 = stackTestDriver2.isEmpty();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) stackTestDriver2);
        java.lang.Class<?> wildcardClass6 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test033");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        int int3 = stackTestDriver0.size();
        int int4 = stackTestDriver0.size();
        java.lang.Class<?> wildcardClass5 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test034");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        boolean boolean3 = stackTestDriver0.isEmpty();
        boolean boolean4 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        boolean boolean6 = stackTestDriver0.isEmpty();
        boolean boolean7 = stackTestDriver0.isEmpty();
        java.lang.Class<?> wildcardClass8 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test035");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) (short) 1);
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1.0f) + "'", obj4, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 1 + "'", obj6, (short) 1);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test036");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (-1.0f));
        boolean boolean5 = stackTestDriver0.isEmpty();
        int int6 = stackTestDriver0.size();
        boolean boolean7 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        int int9 = stackTestDriver8.size();
        int int10 = stackTestDriver8.size();
        int int11 = stackTestDriver8.size();
        boolean boolean12 = stackTestDriver8.isEmpty();
        java.lang.Object obj13 = stackTestDriver0.push((java.lang.Object) boolean12);
        stackTestDriver0.clear();
        java.lang.Class<?> wildcardClass15 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1.0f) + "'", obj4, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + true + "'", obj13, true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test037");
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
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test038");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        java.lang.Class<?> wildcardClass2 = stackTestDriver0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test039");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
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
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test040");
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
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test041");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (-1.0f));
        boolean boolean5 = stackTestDriver0.isEmpty();
        java.lang.Object obj6 = stackTestDriver0.peek();
        java.lang.Object obj7 = stackTestDriver0.pop();
        boolean boolean8 = stackTestDriver0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1.0f) + "'", obj4, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1.0f) + "'", obj6, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0f) + "'", obj7, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test042");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
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
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test043");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test044");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        int int4 = stackTestDriver0.size();
        java.lang.Class<?> wildcardClass5 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test045");
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
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test046");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        boolean boolean6 = stackTestDriver4.isEmpty();
        java.lang.Object obj8 = stackTestDriver4.push((java.lang.Object) (-1.0f));
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        java.lang.Class<?> wildcardClass10 = stackTestDriver4.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0f) + "'", obj8, (-1.0f));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test047");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) (short) 1);
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) (short) 10);
        stackTestDriver0.clear();
        java.lang.Class<?> wildcardClass10 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1.0f) + "'", obj4, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 1 + "'", obj6, (short) 1);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (short) 10 + "'", obj8, (short) 10);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test048");
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
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test049");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        boolean boolean3 = stackTestDriver0.isEmpty();
        boolean boolean4 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        boolean boolean6 = stackTestDriver0.isEmpty();
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test050");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        boolean boolean2 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver3 = new experiment.util.StackTestDriver();
        int int4 = stackTestDriver3.size();
        boolean boolean5 = stackTestDriver3.isEmpty();
        java.lang.Object obj7 = stackTestDriver3.push((java.lang.Object) (-1.0f));
        java.lang.Object obj9 = stackTestDriver3.push((java.lang.Object) (short) 1);
        int int10 = stackTestDriver3.size();
        int int11 = stackTestDriver3.size();
        java.lang.Object obj12 = stackTestDriver3.pop();
        java.lang.Object obj13 = stackTestDriver0.push((java.lang.Object) stackTestDriver3);
        stackTestDriver3.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = stackTestDriver3.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0f) + "'", obj7, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (short) 1 + "'", obj9, (short) 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (short) 1 + "'", obj12, (short) 1);
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test051");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        boolean boolean6 = stackTestDriver4.isEmpty();
        java.lang.Object obj8 = stackTestDriver4.push((java.lang.Object) (-1.0f));
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        java.lang.Object obj10 = stackTestDriver0.peek();
        java.lang.Object obj11 = stackTestDriver0.peek();
        java.lang.Class<?> wildcardClass12 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0f) + "'", obj8, (-1.0f));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test052");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        boolean boolean3 = stackTestDriver0.isEmpty();
        boolean boolean4 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test053");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
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
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test054");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        boolean boolean6 = stackTestDriver4.isEmpty();
        java.lang.Object obj8 = stackTestDriver4.push((java.lang.Object) (-1.0f));
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        java.lang.Object obj10 = stackTestDriver4.pop();
        stackTestDriver4.clear();
        boolean boolean12 = stackTestDriver4.isEmpty();
        experiment.util.StackTestDriver stackTestDriver13 = new experiment.util.StackTestDriver();
        boolean boolean14 = stackTestDriver13.isEmpty();
        int int15 = stackTestDriver13.size();
        stackTestDriver13.clear();
        java.lang.Class<?> wildcardClass17 = stackTestDriver13.getClass();
        java.lang.Object obj18 = stackTestDriver4.push((java.lang.Object) stackTestDriver13);
        java.lang.Class<?> wildcardClass19 = stackTestDriver4.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0f) + "'", obj8, (-1.0f));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (-1.0f) + "'", obj10, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test055");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        boolean boolean6 = stackTestDriver4.isEmpty();
        java.lang.Object obj8 = stackTestDriver4.push((java.lang.Object) (-1.0f));
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0f) + "'", obj8, (-1.0f));
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test056");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        boolean boolean3 = stackTestDriver0.isEmpty();
        boolean boolean4 = stackTestDriver0.isEmpty();
        java.lang.Class<?> wildcardClass5 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test057");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test058");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) (short) 1);
        stackTestDriver0.clear();
        java.lang.Class<?> wildcardClass8 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1.0f) + "'", obj4, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 1 + "'", obj6, (short) 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test059");
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
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test060");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        int int2 = stackTestDriver0.size();
        boolean boolean3 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        boolean boolean5 = stackTestDriver4.isEmpty();
        stackTestDriver4.clear();
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = stackTestDriver4.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test061");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) (short) 1);
        int int7 = stackTestDriver0.size();
        int int8 = stackTestDriver0.size();
        java.lang.Object obj9 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        int int11 = stackTestDriver10.size();
        int int12 = stackTestDriver10.size();
        int int13 = stackTestDriver10.size();
        boolean boolean14 = stackTestDriver10.isEmpty();
        java.lang.Object obj15 = stackTestDriver0.push((java.lang.Object) stackTestDriver10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = stackTestDriver10.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1.0f) + "'", obj4, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 1 + "'", obj6, (short) 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (short) 1 + "'", obj9, (short) 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test062");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
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
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test063");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver2 = new experiment.util.StackTestDriver();
        int int3 = stackTestDriver2.size();
        boolean boolean4 = stackTestDriver2.isEmpty();
        java.lang.Object obj6 = stackTestDriver2.push((java.lang.Object) (-1.0f));
        java.lang.Object obj8 = stackTestDriver2.push((java.lang.Object) (short) 1);
        int int9 = stackTestDriver2.size();
        int int10 = stackTestDriver2.size();
        java.lang.Object obj11 = stackTestDriver2.pop();
        java.lang.Object obj12 = stackTestDriver0.push((java.lang.Object) stackTestDriver2);
        experiment.util.StackTestDriver stackTestDriver13 = new experiment.util.StackTestDriver();
        int int14 = stackTestDriver13.size();
        boolean boolean15 = stackTestDriver13.isEmpty();
        java.lang.Class<?> wildcardClass16 = stackTestDriver13.getClass();
        java.lang.Object obj17 = stackTestDriver0.push((java.lang.Object) stackTestDriver13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = stackTestDriver13.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1.0f) + "'", obj6, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (short) 1 + "'", obj8, (short) 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (short) 1 + "'", obj11, (short) 1);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(obj17);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test064");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (-1.0f));
        boolean boolean5 = stackTestDriver0.isEmpty();
        java.lang.Object obj6 = stackTestDriver0.peek();
        experiment.util.StackTestDriver stackTestDriver7 = new experiment.util.StackTestDriver();
        int int8 = stackTestDriver7.size();
        boolean boolean9 = stackTestDriver7.isEmpty();
        int int10 = stackTestDriver7.size();
        boolean boolean11 = stackTestDriver7.isEmpty();
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
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1.0f) + "'", obj4, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1.0f) + "'", obj6, (-1.0f));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test065");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        int int2 = stackTestDriver0.size();
        java.lang.Class<?> wildcardClass3 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test066");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        int int4 = stackTestDriver0.size();
        stackTestDriver0.clear();
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
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test067");
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
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test068");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
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
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test069");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        boolean boolean6 = stackTestDriver4.isEmpty();
        java.lang.Object obj8 = stackTestDriver4.push((java.lang.Object) (-1.0f));
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        java.lang.Object obj10 = stackTestDriver4.pop();
        stackTestDriver4.clear();
        boolean boolean12 = stackTestDriver4.isEmpty();
        experiment.util.StackTestDriver stackTestDriver13 = new experiment.util.StackTestDriver();
        boolean boolean14 = stackTestDriver13.isEmpty();
        int int15 = stackTestDriver13.size();
        stackTestDriver13.clear();
        java.lang.Class<?> wildcardClass17 = stackTestDriver13.getClass();
        java.lang.Object obj18 = stackTestDriver4.push((java.lang.Object) stackTestDriver13);
        int int19 = stackTestDriver4.size();
        java.lang.Class<?> wildcardClass20 = stackTestDriver4.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0f) + "'", obj8, (-1.0f));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (-1.0f) + "'", obj10, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test070");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test071");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        int int2 = stackTestDriver0.size();
        boolean boolean3 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        boolean boolean5 = stackTestDriver4.isEmpty();
        stackTestDriver4.clear();
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        int int8 = stackTestDriver0.size();
        java.lang.Object obj9 = stackTestDriver0.pop();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test072");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver2 = new experiment.util.StackTestDriver();
        stackTestDriver2.clear();
        boolean boolean4 = stackTestDriver2.isEmpty();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) stackTestDriver2);
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) 2);
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        int int9 = stackTestDriver8.size();
        boolean boolean10 = stackTestDriver8.isEmpty();
        stackTestDriver8.clear();
        int int12 = stackTestDriver8.size();
        boolean boolean13 = stackTestDriver8.isEmpty();
        java.lang.Object obj14 = stackTestDriver0.push((java.lang.Object) boolean13);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 2 + "'", obj7, 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + true + "'", obj14, true);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test073");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        boolean boolean4 = stackTestDriver0.isEmpty();
        boolean boolean5 = stackTestDriver0.isEmpty();
        int int6 = stackTestDriver0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test074");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (-1.0f));
        boolean boolean5 = stackTestDriver0.isEmpty();
        int int6 = stackTestDriver0.size();
        boolean boolean7 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        int int9 = stackTestDriver8.size();
        int int10 = stackTestDriver8.size();
        int int11 = stackTestDriver8.size();
        boolean boolean12 = stackTestDriver8.isEmpty();
        java.lang.Object obj13 = stackTestDriver0.push((java.lang.Object) boolean12);
        java.lang.Class<?> wildcardClass14 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1.0f) + "'", obj4, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + true + "'", obj13, true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test075");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (-1.0f));
        stackTestDriver0.clear();
        boolean boolean6 = stackTestDriver0.isEmpty();
        boolean boolean7 = stackTestDriver0.isEmpty();
        java.lang.Class<?> wildcardClass8 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1.0f) + "'", obj4, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test076");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        int int3 = stackTestDriver0.size();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (byte) 100);
        java.lang.Class<?> wildcardClass6 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) 100 + "'", obj5, (byte) 100);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test077");
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
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test078");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver2 = new experiment.util.StackTestDriver();
        stackTestDriver2.clear();
        boolean boolean4 = stackTestDriver2.isEmpty();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) stackTestDriver2);
        int int6 = stackTestDriver2.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = stackTestDriver2.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test079");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        int int4 = stackTestDriver0.size();
        stackTestDriver0.clear();
        java.lang.Class<?> wildcardClass6 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test080");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) 10.0d);
        java.lang.Class<?> wildcardClass5 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 10.0d + "'", obj4, 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test081");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver2 = new experiment.util.StackTestDriver();
        stackTestDriver2.clear();
        boolean boolean4 = stackTestDriver2.isEmpty();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) stackTestDriver2);
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) 2);
        boolean boolean8 = stackTestDriver0.isEmpty();
        java.lang.Object obj10 = stackTestDriver0.push((java.lang.Object) (short) -1);
        experiment.util.StackTestDriver stackTestDriver11 = new experiment.util.StackTestDriver();
        int int12 = stackTestDriver11.size();
        int int13 = stackTestDriver11.size();
        boolean boolean14 = stackTestDriver11.isEmpty();
        stackTestDriver11.clear();
        boolean boolean16 = stackTestDriver11.isEmpty();
        java.lang.Class<?> wildcardClass17 = stackTestDriver11.getClass();
        java.lang.Object obj18 = stackTestDriver0.push((java.lang.Object) stackTestDriver11);
        java.lang.Class<?> wildcardClass19 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 2 + "'", obj7, 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (short) -1 + "'", obj10, (short) -1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test082");
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
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test083");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (-1.0f));
        boolean boolean5 = stackTestDriver0.isEmpty();
        java.lang.Object obj6 = stackTestDriver0.peek();
        java.lang.Object obj7 = stackTestDriver0.pop();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1.0f) + "'", obj4, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1.0f) + "'", obj6, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0f) + "'", obj7, (-1.0f));
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test084");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        stackTestDriver0.clear();
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
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test085");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        boolean boolean6 = stackTestDriver4.isEmpty();
        java.lang.Object obj8 = stackTestDriver4.push((java.lang.Object) (-1.0f));
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        java.lang.Object obj10 = stackTestDriver4.pop();
        stackTestDriver4.clear();
        boolean boolean12 = stackTestDriver4.isEmpty();
        experiment.util.StackTestDriver stackTestDriver13 = new experiment.util.StackTestDriver();
        boolean boolean14 = stackTestDriver13.isEmpty();
        int int15 = stackTestDriver13.size();
        stackTestDriver13.clear();
        java.lang.Class<?> wildcardClass17 = stackTestDriver13.getClass();
        java.lang.Object obj18 = stackTestDriver4.push((java.lang.Object) stackTestDriver13);
        int int19 = stackTestDriver4.size();
        java.lang.Object obj20 = stackTestDriver4.pop();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = stackTestDriver4.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0f) + "'", obj8, (-1.0f));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (-1.0f) + "'", obj10, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(obj20);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test086");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        boolean boolean6 = stackTestDriver4.isEmpty();
        stackTestDriver4.clear();
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        int int9 = stackTestDriver8.size();
        boolean boolean10 = stackTestDriver8.isEmpty();
        java.lang.Object obj12 = stackTestDriver8.push((java.lang.Object) (-1.0f));
        java.lang.Object obj13 = stackTestDriver4.push((java.lang.Object) stackTestDriver8);
        experiment.util.StackTestDriver stackTestDriver14 = new experiment.util.StackTestDriver();
        int int15 = stackTestDriver14.size();
        boolean boolean16 = stackTestDriver14.isEmpty();
        boolean boolean17 = stackTestDriver14.isEmpty();
        java.lang.Class<?> wildcardClass18 = stackTestDriver14.getClass();
        java.lang.Object obj19 = stackTestDriver4.push((java.lang.Object) stackTestDriver14);
        java.lang.Object obj20 = stackTestDriver4.pop();
        java.lang.Object obj21 = stackTestDriver0.push(obj20);
        java.lang.Class<?> wildcardClass22 = obj21.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (-1.0f) + "'", obj12, (-1.0f));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test087");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        int int3 = stackTestDriver0.size();
        boolean boolean4 = stackTestDriver0.isEmpty();
        int int5 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        stackTestDriver6.clear();
        boolean boolean8 = stackTestDriver6.isEmpty();
        java.lang.Class<?> wildcardClass9 = stackTestDriver6.getClass();
        java.lang.Object obj10 = stackTestDriver0.push((java.lang.Object) wildcardClass9);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "class experiment.util.StackTestDriver");
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test088");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (-1.0f));
        boolean boolean5 = stackTestDriver0.isEmpty();
        java.lang.Object obj6 = stackTestDriver0.peek();
        java.lang.Object obj7 = stackTestDriver0.pop();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1.0f) + "'", obj4, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1.0f) + "'", obj6, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0f) + "'", obj7, (-1.0f));
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test089");
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
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test090");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        boolean boolean6 = stackTestDriver4.isEmpty();
        java.lang.Object obj8 = stackTestDriver4.push((java.lang.Object) (-1.0f));
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        java.lang.Object obj10 = stackTestDriver4.pop();
        stackTestDriver4.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = stackTestDriver4.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0f) + "'", obj8, (-1.0f));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (-1.0f) + "'", obj10, (-1.0f));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test091");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        int int6 = stackTestDriver4.size();
        int int7 = stackTestDriver4.size();
        boolean boolean8 = stackTestDriver4.isEmpty();
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) boolean8);
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        int int11 = stackTestDriver10.size();
        boolean boolean12 = stackTestDriver10.isEmpty();
        stackTestDriver10.clear();
        experiment.util.StackTestDriver stackTestDriver14 = new experiment.util.StackTestDriver();
        int int15 = stackTestDriver14.size();
        boolean boolean16 = stackTestDriver14.isEmpty();
        java.lang.Object obj18 = stackTestDriver14.push((java.lang.Object) (-1.0f));
        java.lang.Object obj19 = stackTestDriver10.push((java.lang.Object) stackTestDriver14);
        java.lang.Object obj20 = stackTestDriver0.push(obj19);
        java.lang.Class<?> wildcardClass21 = obj20.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + true + "'", obj9, true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (-1.0f) + "'", obj18, (-1.0f));
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test092");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (-1.0f));
        boolean boolean5 = stackTestDriver0.isEmpty();
        java.lang.Object obj6 = stackTestDriver0.peek();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1.0f) + "'", obj4, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1.0f) + "'", obj6, (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test093");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) (short) 1);
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) (short) 10);
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
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1.0f) + "'", obj4, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 1 + "'", obj6, (short) 1);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (short) 10 + "'", obj8, (short) 10);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test094");
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
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test095");
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
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test096");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test097");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        boolean boolean3 = stackTestDriver0.isEmpty();
        boolean boolean4 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        boolean boolean6 = stackTestDriver0.isEmpty();
        int int7 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        boolean boolean9 = stackTestDriver8.isEmpty();
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        stackTestDriver10.clear();
        boolean boolean12 = stackTestDriver10.isEmpty();
        java.lang.Object obj13 = stackTestDriver8.push((java.lang.Object) stackTestDriver10);
        java.lang.Object obj14 = stackTestDriver0.push((java.lang.Object) stackTestDriver8);
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test098");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        boolean boolean6 = stackTestDriver4.isEmpty();
        java.lang.Object obj8 = stackTestDriver4.push((java.lang.Object) (-1.0f));
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        stackTestDriver0.clear();
        boolean boolean11 = stackTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0f) + "'", obj8, (-1.0f));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test099");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        boolean boolean3 = stackTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test100");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        boolean boolean6 = stackTestDriver4.isEmpty();
        java.lang.Object obj8 = stackTestDriver4.push((java.lang.Object) (-1.0f));
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        int int11 = stackTestDriver10.size();
        boolean boolean12 = stackTestDriver10.isEmpty();
        boolean boolean13 = stackTestDriver10.isEmpty();
        java.lang.Class<?> wildcardClass14 = stackTestDriver10.getClass();
        java.lang.Object obj15 = stackTestDriver0.push((java.lang.Object) stackTestDriver10);
        int int16 = stackTestDriver10.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0f) + "'", obj8, (-1.0f));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test101");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        boolean boolean5 = stackTestDriver4.isEmpty();
        stackTestDriver4.clear();
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = stackTestDriver4.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test102");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        int int2 = stackTestDriver0.size();
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
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test103");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
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
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test104");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver2 = new experiment.util.StackTestDriver();
        stackTestDriver2.clear();
        boolean boolean4 = stackTestDriver2.isEmpty();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) stackTestDriver2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = stackTestDriver2.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test105");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        int int3 = stackTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test106");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
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
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test107");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        int int3 = stackTestDriver0.size();
        java.lang.Class<?> wildcardClass4 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test108");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (-1.0f));
        java.lang.Object obj5 = stackTestDriver0.pop();
        stackTestDriver0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1.0f) + "'", obj4, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0f) + "'", obj5, (-1.0f));
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test109");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (-1.0f));
        boolean boolean5 = stackTestDriver0.isEmpty();
        java.lang.Class<?> wildcardClass6 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1.0f) + "'", obj4, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test110");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        boolean boolean6 = stackTestDriver4.isEmpty();
        java.lang.Object obj8 = stackTestDriver4.push((java.lang.Object) (-1.0f));
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        int int11 = stackTestDriver10.size();
        boolean boolean12 = stackTestDriver10.isEmpty();
        boolean boolean13 = stackTestDriver10.isEmpty();
        java.lang.Class<?> wildcardClass14 = stackTestDriver10.getClass();
        java.lang.Object obj15 = stackTestDriver0.push((java.lang.Object) stackTestDriver10);
        java.lang.Object obj16 = stackTestDriver0.pop();
        java.lang.Object obj17 = stackTestDriver0.peek();
        java.lang.Object obj18 = stackTestDriver0.peek();
        stackTestDriver0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0f) + "'", obj8, (-1.0f));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNotNull(obj18);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test111");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) (short) 1);
        stackTestDriver0.clear();
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
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1.0f) + "'", obj4, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 1 + "'", obj6, (short) 1);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test112");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        int int6 = stackTestDriver4.size();
        int int7 = stackTestDriver4.size();
        boolean boolean8 = stackTestDriver4.isEmpty();
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) boolean8);
        boolean boolean10 = stackTestDriver0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + true + "'", obj9, true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test113");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) (short) 1);
        int int7 = stackTestDriver0.size();
        int int8 = stackTestDriver0.size();
        int int9 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        int int11 = stackTestDriver10.size();
        boolean boolean12 = stackTestDriver10.isEmpty();
        java.lang.Object obj14 = stackTestDriver10.push((java.lang.Object) (-1.0f));
        java.lang.Class<?> wildcardClass15 = stackTestDriver10.getClass();
        java.lang.Object obj16 = stackTestDriver0.push((java.lang.Object) stackTestDriver10);
        java.lang.Class<?> wildcardClass17 = obj16.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1.0f) + "'", obj4, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 1 + "'", obj6, (short) 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1.0f) + "'", obj14, (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test114");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) (short) 1);
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        int int10 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver11 = new experiment.util.StackTestDriver();
        int int12 = stackTestDriver11.size();
        boolean boolean13 = stackTestDriver11.isEmpty();
        stackTestDriver11.clear();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        int int16 = stackTestDriver15.size();
        boolean boolean17 = stackTestDriver15.isEmpty();
        java.lang.Object obj19 = stackTestDriver15.push((java.lang.Object) (-1.0f));
        java.lang.Object obj20 = stackTestDriver11.push((java.lang.Object) stackTestDriver15);
        stackTestDriver11.clear();
        stackTestDriver11.clear();
        java.lang.Object obj23 = stackTestDriver0.push((java.lang.Object) stackTestDriver11);
        boolean boolean24 = stackTestDriver11.isEmpty();
        experiment.util.StackTestDriver stackTestDriver25 = new experiment.util.StackTestDriver();
        stackTestDriver25.clear();
        java.lang.Object obj27 = stackTestDriver11.push((java.lang.Object) stackTestDriver25);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1.0f) + "'", obj4, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 1 + "'", obj6, (short) 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (-1.0f) + "'", obj19, (-1.0f));
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(obj27);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test115");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) (short) 1);
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        int int10 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver11 = new experiment.util.StackTestDriver();
        int int12 = stackTestDriver11.size();
        boolean boolean13 = stackTestDriver11.isEmpty();
        stackTestDriver11.clear();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        int int16 = stackTestDriver15.size();
        boolean boolean17 = stackTestDriver15.isEmpty();
        java.lang.Object obj19 = stackTestDriver15.push((java.lang.Object) (-1.0f));
        java.lang.Object obj20 = stackTestDriver11.push((java.lang.Object) stackTestDriver15);
        stackTestDriver11.clear();
        stackTestDriver11.clear();
        java.lang.Object obj23 = stackTestDriver0.push((java.lang.Object) stackTestDriver11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = stackTestDriver11.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1.0f) + "'", obj4, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 1 + "'", obj6, (short) 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (-1.0f) + "'", obj19, (-1.0f));
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(obj23);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test116");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        boolean boolean6 = stackTestDriver4.isEmpty();
        java.lang.Object obj8 = stackTestDriver4.push((java.lang.Object) (-1.0f));
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        int int11 = stackTestDriver10.size();
        boolean boolean12 = stackTestDriver10.isEmpty();
        boolean boolean13 = stackTestDriver10.isEmpty();
        java.lang.Class<?> wildcardClass14 = stackTestDriver10.getClass();
        java.lang.Object obj15 = stackTestDriver0.push((java.lang.Object) stackTestDriver10);
        boolean boolean16 = stackTestDriver0.isEmpty();
        java.lang.Object obj17 = stackTestDriver0.peek();
        stackTestDriver0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0f) + "'", obj8, (-1.0f));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(obj17);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test117");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
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
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test118");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (-1.0f));
        boolean boolean5 = stackTestDriver0.isEmpty();
        java.lang.Object obj6 = stackTestDriver0.peek();
        experiment.util.StackTestDriver stackTestDriver7 = new experiment.util.StackTestDriver();
        int int8 = stackTestDriver7.size();
        boolean boolean9 = stackTestDriver7.isEmpty();
        int int10 = stackTestDriver7.size();
        boolean boolean11 = stackTestDriver7.isEmpty();
        java.lang.Object obj12 = stackTestDriver0.push((java.lang.Object) stackTestDriver7);
        java.lang.Object obj13 = stackTestDriver0.pop();
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1.0f) + "'", obj4, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1.0f) + "'", obj6, (-1.0f));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test119");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver2 = new experiment.util.StackTestDriver();
        int int3 = stackTestDriver2.size();
        boolean boolean4 = stackTestDriver2.isEmpty();
        java.lang.Object obj6 = stackTestDriver2.push((java.lang.Object) (-1.0f));
        java.lang.Object obj8 = stackTestDriver2.push((java.lang.Object) (short) 1);
        int int9 = stackTestDriver2.size();
        int int10 = stackTestDriver2.size();
        java.lang.Object obj11 = stackTestDriver2.pop();
        java.lang.Object obj12 = stackTestDriver0.push((java.lang.Object) stackTestDriver2);
        stackTestDriver2.clear();
        experiment.util.StackTestDriver stackTestDriver14 = new experiment.util.StackTestDriver();
        int int15 = stackTestDriver14.size();
        boolean boolean16 = stackTestDriver14.isEmpty();
        java.lang.Object obj18 = stackTestDriver14.push((java.lang.Object) (-1.0f));
        boolean boolean19 = stackTestDriver14.isEmpty();
        int int20 = stackTestDriver14.size();
        boolean boolean21 = stackTestDriver14.isEmpty();
        java.lang.Class<?> wildcardClass22 = stackTestDriver14.getClass();
        java.lang.Object obj23 = stackTestDriver2.push((java.lang.Object) stackTestDriver14);
        java.lang.Class<?> wildcardClass24 = obj23.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1.0f) + "'", obj6, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (short) 1 + "'", obj8, (short) 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (short) 1 + "'", obj11, (short) 1);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (-1.0f) + "'", obj18, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test120");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver2 = new experiment.util.StackTestDriver();
        int int3 = stackTestDriver2.size();
        boolean boolean4 = stackTestDriver2.isEmpty();
        java.lang.Object obj6 = stackTestDriver2.push((java.lang.Object) (-1.0f));
        java.lang.Object obj8 = stackTestDriver2.push((java.lang.Object) (short) 1);
        stackTestDriver2.clear();
        stackTestDriver2.clear();
        experiment.util.StackTestDriver stackTestDriver11 = new experiment.util.StackTestDriver();
        int int12 = stackTestDriver11.size();
        boolean boolean13 = stackTestDriver11.isEmpty();
        stackTestDriver11.clear();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        int int16 = stackTestDriver15.size();
        boolean boolean17 = stackTestDriver15.isEmpty();
        java.lang.Object obj19 = stackTestDriver15.push((java.lang.Object) (-1.0f));
        java.lang.Object obj20 = stackTestDriver11.push((java.lang.Object) stackTestDriver15);
        java.lang.Object obj21 = stackTestDriver11.peek();
        java.lang.Object obj22 = stackTestDriver11.peek();
        java.lang.Object obj23 = stackTestDriver2.push(obj22);
        java.lang.Object obj24 = stackTestDriver0.push(obj22);
        java.lang.Class<?> wildcardClass25 = obj22.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1.0f) + "'", obj6, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (short) 1 + "'", obj8, (short) 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (-1.0f) + "'", obj19, (-1.0f));
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test121");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        int int2 = stackTestDriver0.size();
        boolean boolean3 = stackTestDriver0.isEmpty();
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
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test122");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) (short) 1);
        int int7 = stackTestDriver0.size();
        int int8 = stackTestDriver0.size();
        java.lang.Object obj9 = stackTestDriver0.pop();
        java.lang.Object obj10 = stackTestDriver0.peek();
        java.lang.Object obj12 = stackTestDriver0.push((java.lang.Object) "");
        java.lang.Object obj13 = stackTestDriver0.pop();
        java.lang.Class<?> wildcardClass14 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1.0f) + "'", obj4, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 1 + "'", obj6, (short) 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (short) 1 + "'", obj9, (short) 1);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (-1.0f) + "'", obj10, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + "" + "'", obj12, "");
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + "" + "'", obj13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test123");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver2 = new experiment.util.StackTestDriver();
        stackTestDriver2.clear();
        boolean boolean4 = stackTestDriver2.isEmpty();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) stackTestDriver2);
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) 2);
        boolean boolean8 = stackTestDriver0.isEmpty();
        java.lang.Object obj10 = stackTestDriver0.push((java.lang.Object) (short) -1);
        experiment.util.StackTestDriver stackTestDriver11 = new experiment.util.StackTestDriver();
        int int12 = stackTestDriver11.size();
        int int13 = stackTestDriver11.size();
        boolean boolean14 = stackTestDriver11.isEmpty();
        stackTestDriver11.clear();
        boolean boolean16 = stackTestDriver11.isEmpty();
        java.lang.Class<?> wildcardClass17 = stackTestDriver11.getClass();
        java.lang.Object obj18 = stackTestDriver0.push((java.lang.Object) stackTestDriver11);
        java.lang.Object obj19 = stackTestDriver0.peek();
        stackTestDriver0.clear();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 2 + "'", obj7, 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (short) -1 + "'", obj10, (short) -1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(obj19);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test124");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver2 = new experiment.util.StackTestDriver();
        stackTestDriver2.clear();
        boolean boolean4 = stackTestDriver2.isEmpty();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) stackTestDriver2);
        java.lang.Class<?> wildcardClass6 = stackTestDriver2.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test125");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        int int4 = stackTestDriver0.size();
        stackTestDriver0.clear();
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
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test126");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        boolean boolean6 = stackTestDriver4.isEmpty();
        java.lang.Object obj8 = stackTestDriver4.push((java.lang.Object) (-1.0f));
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        int int11 = stackTestDriver10.size();
        boolean boolean12 = stackTestDriver10.isEmpty();
        boolean boolean13 = stackTestDriver10.isEmpty();
        java.lang.Class<?> wildcardClass14 = stackTestDriver10.getClass();
        java.lang.Object obj15 = stackTestDriver0.push((java.lang.Object) stackTestDriver10);
        java.lang.Object obj16 = stackTestDriver0.pop();
        java.lang.Object obj17 = stackTestDriver0.pop();
        stackTestDriver0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0f) + "'", obj8, (-1.0f));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(obj17);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test127");
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
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test128");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        boolean boolean6 = stackTestDriver4.isEmpty();
        java.lang.Object obj8 = stackTestDriver4.push((java.lang.Object) (-1.0f));
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        int int11 = stackTestDriver10.size();
        boolean boolean12 = stackTestDriver10.isEmpty();
        boolean boolean13 = stackTestDriver10.isEmpty();
        java.lang.Class<?> wildcardClass14 = stackTestDriver10.getClass();
        java.lang.Object obj15 = stackTestDriver0.push((java.lang.Object) stackTestDriver10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = stackTestDriver10.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0f) + "'", obj8, (-1.0f));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test129");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver2 = new experiment.util.StackTestDriver();
        int int3 = stackTestDriver2.size();
        boolean boolean4 = stackTestDriver2.isEmpty();
        java.lang.Object obj6 = stackTestDriver2.push((java.lang.Object) (-1.0f));
        java.lang.Object obj8 = stackTestDriver2.push((java.lang.Object) (short) 1);
        int int9 = stackTestDriver2.size();
        int int10 = stackTestDriver2.size();
        java.lang.Object obj11 = stackTestDriver2.pop();
        java.lang.Object obj12 = stackTestDriver0.push((java.lang.Object) stackTestDriver2);
        java.lang.Object obj13 = stackTestDriver2.peek();
        java.lang.Object obj14 = stackTestDriver2.pop();
        boolean boolean15 = stackTestDriver2.isEmpty();
        int int16 = stackTestDriver2.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1.0f) + "'", obj6, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (short) 1 + "'", obj8, (short) 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (short) 1 + "'", obj11, (short) 1);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (-1.0f) + "'", obj13, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1.0f) + "'", obj14, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test130");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        boolean boolean6 = stackTestDriver4.isEmpty();
        java.lang.Object obj8 = stackTestDriver4.push((java.lang.Object) (-1.0f));
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        int int11 = stackTestDriver10.size();
        boolean boolean12 = stackTestDriver10.isEmpty();
        boolean boolean13 = stackTestDriver10.isEmpty();
        java.lang.Class<?> wildcardClass14 = stackTestDriver10.getClass();
        java.lang.Object obj15 = stackTestDriver0.push((java.lang.Object) stackTestDriver10);
        experiment.util.StackTestDriver stackTestDriver16 = new experiment.util.StackTestDriver();
        int int17 = stackTestDriver16.size();
        int int18 = stackTestDriver16.size();
        boolean boolean19 = stackTestDriver16.isEmpty();
        experiment.util.StackTestDriver stackTestDriver20 = new experiment.util.StackTestDriver();
        boolean boolean21 = stackTestDriver20.isEmpty();
        stackTestDriver20.clear();
        java.lang.Object obj23 = stackTestDriver16.push((java.lang.Object) stackTestDriver20);
        java.lang.Object obj24 = stackTestDriver10.push((java.lang.Object) stackTestDriver16);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0f) + "'", obj8, (-1.0f));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNotNull(obj24);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test131");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        int int4 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        int int6 = stackTestDriver5.size();
        int int7 = stackTestDriver5.size();
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
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0 + "'", obj9, 0);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test132");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        int int2 = stackTestDriver0.size();
        boolean boolean3 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        boolean boolean5 = stackTestDriver4.isEmpty();
        stackTestDriver4.clear();
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        boolean boolean8 = stackTestDriver0.isEmpty();
        java.lang.Class<?> wildcardClass9 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test133");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        int int3 = stackTestDriver0.size();
        stackTestDriver0.clear();
        java.lang.Class<?> wildcardClass5 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test134");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        boolean boolean2 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver3 = new experiment.util.StackTestDriver();
        int int4 = stackTestDriver3.size();
        boolean boolean5 = stackTestDriver3.isEmpty();
        java.lang.Object obj7 = stackTestDriver3.push((java.lang.Object) (-1.0f));
        java.lang.Object obj9 = stackTestDriver3.push((java.lang.Object) (short) 1);
        int int10 = stackTestDriver3.size();
        int int11 = stackTestDriver3.size();
        java.lang.Object obj12 = stackTestDriver3.pop();
        java.lang.Object obj13 = stackTestDriver0.push((java.lang.Object) stackTestDriver3);
        java.lang.Class<?> wildcardClass14 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0f) + "'", obj7, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (short) 1 + "'", obj9, (short) 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (short) 1 + "'", obj12, (short) 1);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test135");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        int int2 = stackTestDriver0.size();
        boolean boolean3 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        boolean boolean5 = stackTestDriver4.isEmpty();
        stackTestDriver4.clear();
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        int int8 = stackTestDriver0.size();
        int int9 = stackTestDriver0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test136");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        int int6 = stackTestDriver4.size();
        int int7 = stackTestDriver4.size();
        boolean boolean8 = stackTestDriver4.isEmpty();
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) boolean8);
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        int int11 = stackTestDriver10.size();
        boolean boolean12 = stackTestDriver10.isEmpty();
        stackTestDriver10.clear();
        int int14 = stackTestDriver10.size();
        java.lang.Object obj15 = stackTestDriver0.push((java.lang.Object) stackTestDriver10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = stackTestDriver10.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + true + "'", obj9, true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test137");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        boolean boolean6 = stackTestDriver4.isEmpty();
        java.lang.Object obj8 = stackTestDriver4.push((java.lang.Object) (-1.0f));
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        java.lang.Object obj10 = stackTestDriver0.pop();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0f) + "'", obj8, (-1.0f));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test138");
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
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test139");
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
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test140");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        int int4 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean6 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        int int9 = stackTestDriver8.size();
        boolean boolean10 = stackTestDriver8.isEmpty();
        java.lang.Object obj12 = stackTestDriver8.push((java.lang.Object) (-1.0f));
        java.lang.Object obj14 = stackTestDriver8.push((java.lang.Object) (short) 1);
        int int15 = stackTestDriver8.size();
        int int16 = stackTestDriver8.size();
        java.lang.Object obj17 = stackTestDriver8.pop();
        experiment.util.StackTestDriver stackTestDriver18 = new experiment.util.StackTestDriver();
        int int19 = stackTestDriver18.size();
        int int20 = stackTestDriver18.size();
        int int21 = stackTestDriver18.size();
        boolean boolean22 = stackTestDriver18.isEmpty();
        java.lang.Object obj23 = stackTestDriver8.push((java.lang.Object) stackTestDriver18);
        boolean boolean24 = stackTestDriver18.isEmpty();
        java.lang.Object obj25 = stackTestDriver0.push((java.lang.Object) boolean24);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (-1.0f) + "'", obj12, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (short) 1 + "'", obj14, (short) 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (short) 1 + "'", obj17, (short) 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + true + "'", obj25, true);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test141");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (-1.0f));
        boolean boolean5 = stackTestDriver0.isEmpty();
        int int6 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver7 = new experiment.util.StackTestDriver();
        int int8 = stackTestDriver7.size();
        boolean boolean9 = stackTestDriver7.isEmpty();
        boolean boolean10 = stackTestDriver7.isEmpty();
        boolean boolean11 = stackTestDriver7.isEmpty();
        stackTestDriver7.clear();
        java.lang.Class<?> wildcardClass13 = stackTestDriver7.getClass();
        java.lang.Object obj14 = stackTestDriver0.push((java.lang.Object) stackTestDriver7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = stackTestDriver7.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1.0f) + "'", obj4, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test142");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        boolean boolean6 = stackTestDriver4.isEmpty();
        java.lang.Object obj8 = stackTestDriver4.push((java.lang.Object) (-1.0f));
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        int int11 = stackTestDriver10.size();
        boolean boolean12 = stackTestDriver10.isEmpty();
        boolean boolean13 = stackTestDriver10.isEmpty();
        java.lang.Class<?> wildcardClass14 = stackTestDriver10.getClass();
        java.lang.Object obj15 = stackTestDriver0.push((java.lang.Object) stackTestDriver10);
        boolean boolean16 = stackTestDriver0.isEmpty();
        boolean boolean17 = stackTestDriver0.isEmpty();
        boolean boolean18 = stackTestDriver0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0f) + "'", obj8, (-1.0f));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test143");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) (short) 1);
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1.0f) + "'", obj4, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 1 + "'", obj6, (short) 1);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test144");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) (short) 1);
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        int int10 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver11 = new experiment.util.StackTestDriver();
        int int12 = stackTestDriver11.size();
        boolean boolean13 = stackTestDriver11.isEmpty();
        stackTestDriver11.clear();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        int int16 = stackTestDriver15.size();
        boolean boolean17 = stackTestDriver15.isEmpty();
        java.lang.Object obj19 = stackTestDriver15.push((java.lang.Object) (-1.0f));
        java.lang.Object obj20 = stackTestDriver11.push((java.lang.Object) stackTestDriver15);
        stackTestDriver11.clear();
        stackTestDriver11.clear();
        java.lang.Object obj23 = stackTestDriver0.push((java.lang.Object) stackTestDriver11);
        boolean boolean24 = stackTestDriver11.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = stackTestDriver11.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1.0f) + "'", obj4, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 1 + "'", obj6, (short) 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (-1.0f) + "'", obj19, (-1.0f));
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test145");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver2 = new experiment.util.StackTestDriver();
        int int3 = stackTestDriver2.size();
        boolean boolean4 = stackTestDriver2.isEmpty();
        java.lang.Object obj6 = stackTestDriver2.push((java.lang.Object) (-1.0f));
        java.lang.Object obj8 = stackTestDriver2.push((java.lang.Object) (short) 1);
        int int9 = stackTestDriver2.size();
        int int10 = stackTestDriver2.size();
        java.lang.Object obj11 = stackTestDriver2.pop();
        java.lang.Object obj12 = stackTestDriver0.push((java.lang.Object) stackTestDriver2);
        stackTestDriver2.clear();
        experiment.util.StackTestDriver stackTestDriver14 = new experiment.util.StackTestDriver();
        int int15 = stackTestDriver14.size();
        boolean boolean16 = stackTestDriver14.isEmpty();
        java.lang.Object obj18 = stackTestDriver14.push((java.lang.Object) (-1.0f));
        boolean boolean19 = stackTestDriver14.isEmpty();
        int int20 = stackTestDriver14.size();
        boolean boolean21 = stackTestDriver14.isEmpty();
        java.lang.Class<?> wildcardClass22 = stackTestDriver14.getClass();
        java.lang.Object obj23 = stackTestDriver2.push((java.lang.Object) stackTestDriver14);
        stackTestDriver14.clear();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1.0f) + "'", obj6, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (short) 1 + "'", obj8, (short) 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (short) 1 + "'", obj11, (short) 1);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (-1.0f) + "'", obj18, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(obj23);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test146");
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
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test147");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (-1.0f));
        boolean boolean5 = stackTestDriver0.isEmpty();
        int int6 = stackTestDriver0.size();
        boolean boolean7 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        int int9 = stackTestDriver8.size();
        int int10 = stackTestDriver8.size();
        int int11 = stackTestDriver8.size();
        boolean boolean12 = stackTestDriver8.isEmpty();
        java.lang.Object obj13 = stackTestDriver0.push((java.lang.Object) boolean12);
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        java.lang.Class<?> wildcardClass16 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1.0f) + "'", obj4, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + true + "'", obj13, true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test148");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) (short) 1);
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        java.lang.Class<?> wildcardClass9 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1.0f) + "'", obj4, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 1 + "'", obj6, (short) 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test149");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver3 = new experiment.util.StackTestDriver();
        int int4 = stackTestDriver3.size();
        boolean boolean5 = stackTestDriver3.isEmpty();
        stackTestDriver3.clear();
        experiment.util.StackTestDriver stackTestDriver7 = new experiment.util.StackTestDriver();
        int int8 = stackTestDriver7.size();
        boolean boolean9 = stackTestDriver7.isEmpty();
        java.lang.Object obj11 = stackTestDriver7.push((java.lang.Object) (-1.0f));
        java.lang.Object obj12 = stackTestDriver3.push((java.lang.Object) stackTestDriver7);
        java.lang.Object obj13 = stackTestDriver3.peek();
        java.lang.Object obj14 = stackTestDriver3.peek();
        java.lang.Object obj15 = stackTestDriver0.push(obj14);
        int int16 = stackTestDriver0.size();
        java.lang.Class<?> wildcardClass17 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (-1.0f) + "'", obj11, (-1.0f));
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test150");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        boolean boolean3 = stackTestDriver0.isEmpty();
        int int4 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        boolean boolean6 = stackTestDriver5.isEmpty();
        experiment.util.StackTestDriver stackTestDriver7 = new experiment.util.StackTestDriver();
        stackTestDriver7.clear();
        boolean boolean9 = stackTestDriver7.isEmpty();
        java.lang.Object obj10 = stackTestDriver5.push((java.lang.Object) stackTestDriver7);
        java.lang.Object obj12 = stackTestDriver5.push((java.lang.Object) 2);
        boolean boolean13 = stackTestDriver5.isEmpty();
        java.lang.Object obj14 = stackTestDriver5.pop();
        java.lang.Object obj15 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        java.lang.Class<?> wildcardClass16 = stackTestDriver5.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 2 + "'", obj12, 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 2 + "'", obj14, 2);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test151");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        int int2 = stackTestDriver0.size();
        boolean boolean3 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        boolean boolean5 = stackTestDriver4.isEmpty();
        stackTestDriver4.clear();
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = stackTestDriver4.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test152");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (-1.0f));
        java.lang.Object obj5 = stackTestDriver0.pop();
        boolean boolean6 = stackTestDriver0.isEmpty();
        int int7 = stackTestDriver0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1.0f) + "'", obj4, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0f) + "'", obj5, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test153");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver2 = new experiment.util.StackTestDriver();
        stackTestDriver2.clear();
        boolean boolean4 = stackTestDriver2.isEmpty();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) stackTestDriver2);
        int int6 = stackTestDriver2.size();
        experiment.util.StackTestDriver stackTestDriver7 = new experiment.util.StackTestDriver();
        int int8 = stackTestDriver7.size();
        int int9 = stackTestDriver7.size();
        int int10 = stackTestDriver7.size();
        experiment.util.StackTestDriver stackTestDriver11 = new experiment.util.StackTestDriver();
        int int12 = stackTestDriver11.size();
        boolean boolean13 = stackTestDriver11.isEmpty();
        stackTestDriver11.clear();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        int int16 = stackTestDriver15.size();
        boolean boolean17 = stackTestDriver15.isEmpty();
        java.lang.Object obj19 = stackTestDriver15.push((java.lang.Object) (-1.0f));
        java.lang.Object obj20 = stackTestDriver11.push((java.lang.Object) stackTestDriver15);
        experiment.util.StackTestDriver stackTestDriver21 = new experiment.util.StackTestDriver();
        int int22 = stackTestDriver21.size();
        boolean boolean23 = stackTestDriver21.isEmpty();
        boolean boolean24 = stackTestDriver21.isEmpty();
        java.lang.Class<?> wildcardClass25 = stackTestDriver21.getClass();
        java.lang.Object obj26 = stackTestDriver11.push((java.lang.Object) stackTestDriver21);
        java.lang.Object obj27 = stackTestDriver11.pop();
        java.lang.Object obj28 = stackTestDriver7.push(obj27);
        boolean boolean29 = stackTestDriver7.isEmpty();
        java.lang.Object obj30 = stackTestDriver2.push((java.lang.Object) stackTestDriver7);
        java.lang.Class<?> wildcardClass31 = stackTestDriver2.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (-1.0f) + "'", obj19, (-1.0f));
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test154");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        int int3 = stackTestDriver0.size();
        stackTestDriver0.clear();
        int int5 = stackTestDriver0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test155");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        int int3 = stackTestDriver0.size();
        int int4 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean6 = stackTestDriver0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test156");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        int int3 = stackTestDriver0.size();
        boolean boolean4 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        int int6 = stackTestDriver5.size();
        boolean boolean7 = stackTestDriver5.isEmpty();
        java.lang.Object obj9 = stackTestDriver5.push((java.lang.Object) (-1.0f));
        java.lang.Object obj11 = stackTestDriver5.push((java.lang.Object) (short) 1);
        stackTestDriver5.clear();
        int int13 = stackTestDriver5.size();
        int int14 = stackTestDriver5.size();
        java.lang.Object obj15 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        stackTestDriver0.clear();
        boolean boolean17 = stackTestDriver0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (-1.0f) + "'", obj9, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (short) 1 + "'", obj11, (short) 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test157");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        boolean boolean6 = stackTestDriver4.isEmpty();
        java.lang.Object obj8 = stackTestDriver4.push((java.lang.Object) (-1.0f));
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        int int11 = stackTestDriver10.size();
        boolean boolean12 = stackTestDriver10.isEmpty();
        boolean boolean13 = stackTestDriver10.isEmpty();
        java.lang.Class<?> wildcardClass14 = stackTestDriver10.getClass();
        java.lang.Object obj15 = stackTestDriver0.push((java.lang.Object) stackTestDriver10);
        java.lang.Object obj16 = stackTestDriver0.pop();
        java.lang.Object obj17 = stackTestDriver0.peek();
        java.lang.Object obj18 = stackTestDriver0.peek();
        java.lang.Class<?> wildcardClass19 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0f) + "'", obj8, (-1.0f));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test158");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver2 = new experiment.util.StackTestDriver();
        stackTestDriver2.clear();
        boolean boolean4 = stackTestDriver2.isEmpty();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) stackTestDriver2);
        int int6 = stackTestDriver2.size();
        experiment.util.StackTestDriver stackTestDriver7 = new experiment.util.StackTestDriver();
        int int8 = stackTestDriver7.size();
        int int9 = stackTestDriver7.size();
        int int10 = stackTestDriver7.size();
        experiment.util.StackTestDriver stackTestDriver11 = new experiment.util.StackTestDriver();
        int int12 = stackTestDriver11.size();
        boolean boolean13 = stackTestDriver11.isEmpty();
        stackTestDriver11.clear();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        int int16 = stackTestDriver15.size();
        boolean boolean17 = stackTestDriver15.isEmpty();
        java.lang.Object obj19 = stackTestDriver15.push((java.lang.Object) (-1.0f));
        java.lang.Object obj20 = stackTestDriver11.push((java.lang.Object) stackTestDriver15);
        experiment.util.StackTestDriver stackTestDriver21 = new experiment.util.StackTestDriver();
        int int22 = stackTestDriver21.size();
        boolean boolean23 = stackTestDriver21.isEmpty();
        boolean boolean24 = stackTestDriver21.isEmpty();
        java.lang.Class<?> wildcardClass25 = stackTestDriver21.getClass();
        java.lang.Object obj26 = stackTestDriver11.push((java.lang.Object) stackTestDriver21);
        java.lang.Object obj27 = stackTestDriver11.pop();
        java.lang.Object obj28 = stackTestDriver7.push(obj27);
        boolean boolean29 = stackTestDriver7.isEmpty();
        java.lang.Object obj30 = stackTestDriver2.push((java.lang.Object) stackTestDriver7);
        java.lang.Class<?> wildcardClass31 = stackTestDriver7.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (-1.0f) + "'", obj19, (-1.0f));
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test159");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        int int4 = stackTestDriver0.size();
        boolean boolean5 = stackTestDriver0.isEmpty();
        int int6 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver7 = new experiment.util.StackTestDriver();
        int int8 = stackTestDriver7.size();
        boolean boolean9 = stackTestDriver7.isEmpty();
        int int10 = stackTestDriver7.size();
        java.lang.Object obj11 = stackTestDriver0.push((java.lang.Object) stackTestDriver7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = stackTestDriver7.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test160");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        boolean boolean3 = stackTestDriver0.isEmpty();
        boolean boolean4 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        boolean boolean6 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        boolean boolean8 = stackTestDriver0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test161");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (-1.0f));
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1.0f) + "'", obj4, (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test162");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) (short) 1);
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver9 = new experiment.util.StackTestDriver();
        int int10 = stackTestDriver9.size();
        boolean boolean11 = stackTestDriver9.isEmpty();
        stackTestDriver9.clear();
        experiment.util.StackTestDriver stackTestDriver13 = new experiment.util.StackTestDriver();
        int int14 = stackTestDriver13.size();
        boolean boolean15 = stackTestDriver13.isEmpty();
        java.lang.Object obj17 = stackTestDriver13.push((java.lang.Object) (-1.0f));
        java.lang.Object obj18 = stackTestDriver9.push((java.lang.Object) stackTestDriver13);
        java.lang.Object obj19 = stackTestDriver9.peek();
        java.lang.Object obj20 = stackTestDriver9.peek();
        java.lang.Object obj21 = stackTestDriver0.push(obj20);
        boolean boolean22 = stackTestDriver0.isEmpty();
        boolean boolean23 = stackTestDriver0.isEmpty();
        java.lang.Class<?> wildcardClass24 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1.0f) + "'", obj4, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 1 + "'", obj6, (short) 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (-1.0f) + "'", obj17, (-1.0f));
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test163");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        int int6 = stackTestDriver4.size();
        int int7 = stackTestDriver4.size();
        boolean boolean8 = stackTestDriver4.isEmpty();
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) boolean8);
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        int int11 = stackTestDriver10.size();
        boolean boolean12 = stackTestDriver10.isEmpty();
        stackTestDriver10.clear();
        int int14 = stackTestDriver10.size();
        java.lang.Object obj15 = stackTestDriver0.push((java.lang.Object) stackTestDriver10);
        java.lang.Object obj16 = stackTestDriver0.peek();
        java.lang.Class<?> wildcardClass17 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + true + "'", obj9, true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test164");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        int int6 = stackTestDriver4.size();
        int int7 = stackTestDriver4.size();
        java.lang.Class<?> wildcardClass8 = stackTestDriver4.getClass();
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test165");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) (short) 1);
        int int7 = stackTestDriver0.size();
        int int8 = stackTestDriver0.size();
        java.lang.Object obj9 = stackTestDriver0.pop();
        java.lang.Object obj10 = stackTestDriver0.peek();
        java.lang.Object obj12 = stackTestDriver0.push((java.lang.Object) "");
        boolean boolean13 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1.0f) + "'", obj4, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 1 + "'", obj6, (short) 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (short) 1 + "'", obj9, (short) 1);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (-1.0f) + "'", obj10, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + "" + "'", obj12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test166");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (-1.0f));
        stackTestDriver0.clear();
        boolean boolean6 = stackTestDriver0.isEmpty();
        boolean boolean7 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1.0f) + "'", obj4, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test167");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
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
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test168");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        int int3 = stackTestDriver0.size();
        boolean boolean4 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        int int6 = stackTestDriver5.size();
        boolean boolean7 = stackTestDriver5.isEmpty();
        java.lang.Object obj9 = stackTestDriver5.push((java.lang.Object) (-1.0f));
        java.lang.Object obj11 = stackTestDriver5.push((java.lang.Object) (short) 1);
        stackTestDriver5.clear();
        int int13 = stackTestDriver5.size();
        int int14 = stackTestDriver5.size();
        java.lang.Object obj15 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        boolean boolean16 = stackTestDriver0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (-1.0f) + "'", obj9, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (short) 1 + "'", obj11, (short) 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test169");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver2 = new experiment.util.StackTestDriver();
        stackTestDriver2.clear();
        boolean boolean4 = stackTestDriver2.isEmpty();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) stackTestDriver2);
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) 2);
        boolean boolean8 = stackTestDriver0.isEmpty();
        java.lang.Class<?> wildcardClass9 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 2 + "'", obj7, 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test170");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        boolean boolean3 = stackTestDriver0.isEmpty();
        boolean boolean4 = stackTestDriver0.isEmpty();
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
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test171");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver2 = new experiment.util.StackTestDriver();
        stackTestDriver2.clear();
        boolean boolean4 = stackTestDriver2.isEmpty();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) stackTestDriver2);
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        stackTestDriver6.clear();
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        int int9 = stackTestDriver8.size();
        boolean boolean10 = stackTestDriver8.isEmpty();
        java.lang.Object obj12 = stackTestDriver8.push((java.lang.Object) (-1.0f));
        java.lang.Object obj14 = stackTestDriver8.push((java.lang.Object) (short) 1);
        int int15 = stackTestDriver8.size();
        int int16 = stackTestDriver8.size();
        java.lang.Object obj17 = stackTestDriver8.pop();
        java.lang.Object obj18 = stackTestDriver6.push((java.lang.Object) stackTestDriver8);
        experiment.util.StackTestDriver stackTestDriver19 = new experiment.util.StackTestDriver();
        int int20 = stackTestDriver19.size();
        boolean boolean21 = stackTestDriver19.isEmpty();
        java.lang.Class<?> wildcardClass22 = stackTestDriver19.getClass();
        java.lang.Object obj23 = stackTestDriver6.push((java.lang.Object) stackTestDriver19);
        java.lang.Object obj24 = stackTestDriver2.push(obj23);
        java.lang.Class<?> wildcardClass25 = obj24.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (-1.0f) + "'", obj12, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (short) 1 + "'", obj14, (short) 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (short) 1 + "'", obj17, (short) 1);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test172");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver2 = new experiment.util.StackTestDriver();
        stackTestDriver2.clear();
        boolean boolean4 = stackTestDriver2.isEmpty();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) stackTestDriver2);
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) 2);
        boolean boolean8 = stackTestDriver0.isEmpty();
        java.lang.Object obj10 = stackTestDriver0.push((java.lang.Object) (short) -1);
        experiment.util.StackTestDriver stackTestDriver11 = new experiment.util.StackTestDriver();
        int int12 = stackTestDriver11.size();
        int int13 = stackTestDriver11.size();
        boolean boolean14 = stackTestDriver11.isEmpty();
        stackTestDriver11.clear();
        boolean boolean16 = stackTestDriver11.isEmpty();
        java.lang.Class<?> wildcardClass17 = stackTestDriver11.getClass();
        java.lang.Object obj18 = stackTestDriver0.push((java.lang.Object) stackTestDriver11);
        boolean boolean19 = stackTestDriver11.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 2 + "'", obj7, 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (short) -1 + "'", obj10, (short) -1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test173");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) (short) 1);
        int int7 = stackTestDriver0.size();
        int int8 = stackTestDriver0.size();
        java.lang.Object obj9 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        int int11 = stackTestDriver10.size();
        int int12 = stackTestDriver10.size();
        int int13 = stackTestDriver10.size();
        boolean boolean14 = stackTestDriver10.isEmpty();
        java.lang.Object obj15 = stackTestDriver0.push((java.lang.Object) stackTestDriver10);
        boolean boolean16 = stackTestDriver0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1.0f) + "'", obj4, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 1 + "'", obj6, (short) 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (short) 1 + "'", obj9, (short) 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test174");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        boolean boolean6 = stackTestDriver4.isEmpty();
        java.lang.Object obj8 = stackTestDriver4.push((java.lang.Object) (-1.0f));
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        java.lang.Object obj10 = stackTestDriver4.pop();
        stackTestDriver4.clear();
        boolean boolean12 = stackTestDriver4.isEmpty();
        experiment.util.StackTestDriver stackTestDriver13 = new experiment.util.StackTestDriver();
        boolean boolean14 = stackTestDriver13.isEmpty();
        int int15 = stackTestDriver13.size();
        stackTestDriver13.clear();
        java.lang.Class<?> wildcardClass17 = stackTestDriver13.getClass();
        java.lang.Object obj18 = stackTestDriver4.push((java.lang.Object) stackTestDriver13);
        java.lang.Object obj19 = stackTestDriver4.pop();
        stackTestDriver4.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0f) + "'", obj8, (-1.0f));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (-1.0f) + "'", obj10, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(obj19);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test175");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        boolean boolean6 = stackTestDriver4.isEmpty();
        java.lang.Object obj8 = stackTestDriver4.push((java.lang.Object) (-1.0f));
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        java.lang.Object obj10 = stackTestDriver0.peek();
        java.lang.Object obj11 = stackTestDriver0.peek();
        experiment.util.StackTestDriver stackTestDriver12 = new experiment.util.StackTestDriver();
        int int13 = stackTestDriver12.size();
        int int14 = stackTestDriver12.size();
        int int15 = stackTestDriver12.size();
        int int16 = stackTestDriver12.size();
        stackTestDriver12.clear();
        boolean boolean18 = stackTestDriver12.isEmpty();
        boolean boolean19 = stackTestDriver12.isEmpty();
        experiment.util.StackTestDriver stackTestDriver20 = new experiment.util.StackTestDriver();
        int int21 = stackTestDriver20.size();
        boolean boolean22 = stackTestDriver20.isEmpty();
        stackTestDriver20.clear();
        experiment.util.StackTestDriver stackTestDriver24 = new experiment.util.StackTestDriver();
        int int25 = stackTestDriver24.size();
        boolean boolean26 = stackTestDriver24.isEmpty();
        java.lang.Object obj28 = stackTestDriver24.push((java.lang.Object) (-1.0f));
        java.lang.Object obj29 = stackTestDriver20.push((java.lang.Object) stackTestDriver24);
        experiment.util.StackTestDriver stackTestDriver30 = new experiment.util.StackTestDriver();
        int int31 = stackTestDriver30.size();
        boolean boolean32 = stackTestDriver30.isEmpty();
        boolean boolean33 = stackTestDriver30.isEmpty();
        java.lang.Class<?> wildcardClass34 = stackTestDriver30.getClass();
        java.lang.Object obj35 = stackTestDriver20.push((java.lang.Object) stackTestDriver30);
        java.lang.Object obj36 = stackTestDriver20.pop();
        java.lang.Object obj37 = stackTestDriver20.peek();
        java.lang.Class<?> wildcardClass38 = obj37.getClass();
        java.lang.Object obj39 = stackTestDriver12.push((java.lang.Object) wildcardClass38);
        java.lang.Object obj40 = stackTestDriver0.push(obj39);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0f) + "'", obj8, (-1.0f));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + (-1.0f) + "'", obj28, (-1.0f));
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertEquals(obj39.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj39), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj39), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertEquals(obj40.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj40), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj40), "class experiment.util.StackTestDriver");
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test176");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        boolean boolean4 = stackTestDriver0.isEmpty();
        int int5 = stackTestDriver0.size();
        java.lang.Class<?> wildcardClass6 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test177");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        boolean boolean3 = stackTestDriver0.isEmpty();
        int int4 = stackTestDriver0.size();
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) 10.0d);
        java.lang.Object obj7 = stackTestDriver0.pop();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 10.0d + "'", obj6, 10.0d);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 10.0d + "'", obj7, 10.0d);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test178");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        boolean boolean6 = stackTestDriver4.isEmpty();
        java.lang.Object obj8 = stackTestDriver4.push((java.lang.Object) (-1.0f));
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        int int10 = stackTestDriver0.size();
        java.lang.Class<?> wildcardClass11 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0f) + "'", obj8, (-1.0f));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test179");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver2 = new experiment.util.StackTestDriver();
        stackTestDriver2.clear();
        boolean boolean4 = stackTestDriver2.isEmpty();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) stackTestDriver2);
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) 2);
        stackTestDriver0.clear();
        int int9 = stackTestDriver0.size();
        java.lang.Class<?> wildcardClass10 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 2 + "'", obj7, 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test180");
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
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test181");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        int int3 = stackTestDriver0.size();
        boolean boolean4 = stackTestDriver0.isEmpty();
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
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test182");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver2 = new experiment.util.StackTestDriver();
        int int3 = stackTestDriver2.size();
        boolean boolean4 = stackTestDriver2.isEmpty();
        java.lang.Object obj6 = stackTestDriver2.push((java.lang.Object) (-1.0f));
        java.lang.Object obj8 = stackTestDriver2.push((java.lang.Object) (short) 1);
        int int9 = stackTestDriver2.size();
        int int10 = stackTestDriver2.size();
        java.lang.Object obj11 = stackTestDriver2.pop();
        java.lang.Object obj12 = stackTestDriver0.push((java.lang.Object) stackTestDriver2);
        stackTestDriver2.clear();
        experiment.util.StackTestDriver stackTestDriver14 = new experiment.util.StackTestDriver();
        int int15 = stackTestDriver14.size();
        boolean boolean16 = stackTestDriver14.isEmpty();
        stackTestDriver14.clear();
        experiment.util.StackTestDriver stackTestDriver18 = new experiment.util.StackTestDriver();
        int int19 = stackTestDriver18.size();
        boolean boolean20 = stackTestDriver18.isEmpty();
        java.lang.Object obj22 = stackTestDriver18.push((java.lang.Object) (-1.0f));
        java.lang.Object obj23 = stackTestDriver14.push((java.lang.Object) stackTestDriver18);
        experiment.util.StackTestDriver stackTestDriver24 = new experiment.util.StackTestDriver();
        int int25 = stackTestDriver24.size();
        boolean boolean26 = stackTestDriver24.isEmpty();
        boolean boolean27 = stackTestDriver24.isEmpty();
        java.lang.Class<?> wildcardClass28 = stackTestDriver24.getClass();
        java.lang.Object obj29 = stackTestDriver14.push((java.lang.Object) stackTestDriver24);
        java.lang.Object obj30 = stackTestDriver14.pop();
        java.lang.Object obj31 = stackTestDriver14.peek();
        stackTestDriver14.clear();
        java.lang.Object obj33 = stackTestDriver2.push((java.lang.Object) stackTestDriver14);
        boolean boolean34 = stackTestDriver14.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1.0f) + "'", obj6, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (short) 1 + "'", obj8, (short) 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (short) 1 + "'", obj11, (short) 1);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (-1.0f) + "'", obj22, (-1.0f));
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test183");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver3 = new experiment.util.StackTestDriver();
        int int4 = stackTestDriver3.size();
        boolean boolean5 = stackTestDriver3.isEmpty();
        stackTestDriver3.clear();
        experiment.util.StackTestDriver stackTestDriver7 = new experiment.util.StackTestDriver();
        int int8 = stackTestDriver7.size();
        boolean boolean9 = stackTestDriver7.isEmpty();
        java.lang.Object obj11 = stackTestDriver7.push((java.lang.Object) (-1.0f));
        java.lang.Object obj12 = stackTestDriver3.push((java.lang.Object) stackTestDriver7);
        java.lang.Object obj13 = stackTestDriver3.peek();
        java.lang.Object obj14 = stackTestDriver3.peek();
        java.lang.Object obj15 = stackTestDriver0.push(obj14);
        java.lang.Object obj16 = stackTestDriver0.pop();
        int int17 = stackTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (-1.0f) + "'", obj11, (-1.0f));
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test184");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        boolean boolean6 = stackTestDriver4.isEmpty();
        java.lang.Object obj8 = stackTestDriver4.push((java.lang.Object) (-1.0f));
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        int int10 = stackTestDriver0.size();
        java.lang.Object obj11 = stackTestDriver0.peek();
        java.lang.Object obj12 = stackTestDriver0.peek();
        experiment.util.StackTestDriver stackTestDriver13 = new experiment.util.StackTestDriver();
        int int14 = stackTestDriver13.size();
        boolean boolean15 = stackTestDriver13.isEmpty();
        int int16 = stackTestDriver13.size();
        int int17 = stackTestDriver13.size();
        java.lang.Object obj19 = stackTestDriver13.push((java.lang.Object) (-1.0f));
        java.lang.Object obj20 = stackTestDriver0.push((java.lang.Object) stackTestDriver13);
        java.lang.Object obj21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = stackTestDriver0.push(obj21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0f) + "'", obj8, (-1.0f));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (-1.0f) + "'", obj19, (-1.0f));
        org.junit.Assert.assertNotNull(obj20);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test185");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver2 = new experiment.util.StackTestDriver();
        stackTestDriver2.clear();
        boolean boolean4 = stackTestDriver2.isEmpty();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) stackTestDriver2);
        int int6 = stackTestDriver2.size();
        experiment.util.StackTestDriver stackTestDriver7 = new experiment.util.StackTestDriver();
        int int8 = stackTestDriver7.size();
        int int9 = stackTestDriver7.size();
        int int10 = stackTestDriver7.size();
        experiment.util.StackTestDriver stackTestDriver11 = new experiment.util.StackTestDriver();
        int int12 = stackTestDriver11.size();
        boolean boolean13 = stackTestDriver11.isEmpty();
        stackTestDriver11.clear();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        int int16 = stackTestDriver15.size();
        boolean boolean17 = stackTestDriver15.isEmpty();
        java.lang.Object obj19 = stackTestDriver15.push((java.lang.Object) (-1.0f));
        java.lang.Object obj20 = stackTestDriver11.push((java.lang.Object) stackTestDriver15);
        experiment.util.StackTestDriver stackTestDriver21 = new experiment.util.StackTestDriver();
        int int22 = stackTestDriver21.size();
        boolean boolean23 = stackTestDriver21.isEmpty();
        boolean boolean24 = stackTestDriver21.isEmpty();
        java.lang.Class<?> wildcardClass25 = stackTestDriver21.getClass();
        java.lang.Object obj26 = stackTestDriver11.push((java.lang.Object) stackTestDriver21);
        java.lang.Object obj27 = stackTestDriver11.pop();
        java.lang.Object obj28 = stackTestDriver7.push(obj27);
        boolean boolean29 = stackTestDriver7.isEmpty();
        java.lang.Object obj30 = stackTestDriver2.push((java.lang.Object) stackTestDriver7);
        boolean boolean31 = stackTestDriver2.isEmpty();
        experiment.util.StackTestDriver stackTestDriver32 = new experiment.util.StackTestDriver();
        int int33 = stackTestDriver32.size();
        int int34 = stackTestDriver32.size();
        int int35 = stackTestDriver32.size();
        boolean boolean36 = stackTestDriver32.isEmpty();
        boolean boolean37 = stackTestDriver32.isEmpty();
        java.lang.Object obj38 = stackTestDriver2.push((java.lang.Object) stackTestDriver32);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (-1.0f) + "'", obj19, (-1.0f));
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(obj38);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test186");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        int int2 = stackTestDriver0.size();
        boolean boolean3 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        java.lang.Class<?> wildcardClass5 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test187");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
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
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test188");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver2 = new experiment.util.StackTestDriver();
        int int3 = stackTestDriver2.size();
        boolean boolean4 = stackTestDriver2.isEmpty();
        java.lang.Object obj6 = stackTestDriver2.push((java.lang.Object) (-1.0f));
        java.lang.Object obj8 = stackTestDriver2.push((java.lang.Object) (short) 1);
        int int9 = stackTestDriver2.size();
        int int10 = stackTestDriver2.size();
        java.lang.Object obj11 = stackTestDriver2.pop();
        java.lang.Object obj12 = stackTestDriver0.push((java.lang.Object) stackTestDriver2);
        java.lang.Object obj13 = stackTestDriver2.peek();
        java.lang.Object obj14 = stackTestDriver2.pop();
        boolean boolean15 = stackTestDriver2.isEmpty();
        java.lang.Class<?> wildcardClass16 = stackTestDriver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1.0f) + "'", obj6, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (short) 1 + "'", obj8, (short) 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (short) 1 + "'", obj11, (short) 1);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (-1.0f) + "'", obj13, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1.0f) + "'", obj14, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test189");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        int int4 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean6 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        boolean boolean8 = stackTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test190");
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
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test191");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) (short) 1);
        int int7 = stackTestDriver0.size();
        int int8 = stackTestDriver0.size();
        int int9 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        boolean boolean11 = stackTestDriver10.isEmpty();
        experiment.util.StackTestDriver stackTestDriver12 = new experiment.util.StackTestDriver();
        stackTestDriver12.clear();
        boolean boolean14 = stackTestDriver12.isEmpty();
        java.lang.Object obj15 = stackTestDriver10.push((java.lang.Object) stackTestDriver12);
        java.lang.Object obj17 = stackTestDriver10.push((java.lang.Object) 2);
        java.lang.Object obj18 = stackTestDriver0.push(obj17);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1.0f) + "'", obj4, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 1 + "'", obj6, (short) 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 2 + "'", obj17, 2);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 2 + "'", obj18, 2);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test192");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        java.lang.Class<?> wildcardClass3 = stackTestDriver0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test193");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        int int4 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        java.lang.Class<?> wildcardClass7 = stackTestDriver5.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test194");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        boolean boolean6 = stackTestDriver4.isEmpty();
        java.lang.Object obj8 = stackTestDriver4.push((java.lang.Object) (-1.0f));
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        stackTestDriver0.clear();
        boolean boolean11 = stackTestDriver0.isEmpty();
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0f) + "'", obj8, (-1.0f));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test195");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (-1.0f));
        java.lang.Object obj5 = stackTestDriver0.pop();
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
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1.0f) + "'", obj4, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0f) + "'", obj5, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test196");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) (short) 1);
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) (short) 10);
        int int9 = stackTestDriver0.size();
        stackTestDriver0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1.0f) + "'", obj4, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 1 + "'", obj6, (short) 1);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (short) 10 + "'", obj8, (short) 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test197");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        boolean boolean6 = stackTestDriver4.isEmpty();
        java.lang.Object obj8 = stackTestDriver4.push((java.lang.Object) (-1.0f));
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        int int11 = stackTestDriver10.size();
        boolean boolean12 = stackTestDriver10.isEmpty();
        boolean boolean13 = stackTestDriver10.isEmpty();
        java.lang.Class<?> wildcardClass14 = stackTestDriver10.getClass();
        java.lang.Object obj15 = stackTestDriver0.push((java.lang.Object) stackTestDriver10);
        java.lang.Object obj16 = stackTestDriver0.pop();
        java.lang.Class<?> wildcardClass17 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0f) + "'", obj8, (-1.0f));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test198");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) (short) 1);
        int int7 = stackTestDriver0.size();
        int int8 = stackTestDriver0.size();
        java.lang.Object obj9 = stackTestDriver0.pop();
        java.lang.Object obj10 = stackTestDriver0.peek();
        java.lang.Object obj12 = stackTestDriver0.push((java.lang.Object) "");
        java.lang.Object obj13 = stackTestDriver0.pop();
        java.lang.Object obj14 = stackTestDriver0.peek();
        int int15 = stackTestDriver0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1.0f) + "'", obj4, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 1 + "'", obj6, (short) 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (short) 1 + "'", obj9, (short) 1);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (-1.0f) + "'", obj10, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + "" + "'", obj12, "");
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + "" + "'", obj13, "");
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1.0f) + "'", obj14, (-1.0f));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test199");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        int int4 = stackTestDriver0.size();
        boolean boolean5 = stackTestDriver0.isEmpty();
        int int6 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver7 = new experiment.util.StackTestDriver();
        int int8 = stackTestDriver7.size();
        boolean boolean9 = stackTestDriver7.isEmpty();
        int int10 = stackTestDriver7.size();
        java.lang.Object obj11 = stackTestDriver0.push((java.lang.Object) stackTestDriver7);
        java.lang.Class<?> wildcardClass12 = stackTestDriver7.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test200");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (-1.0f));
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1.0f) + "'", obj4, (-1.0f));
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test201");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver2 = new experiment.util.StackTestDriver();
        int int3 = stackTestDriver2.size();
        boolean boolean4 = stackTestDriver2.isEmpty();
        java.lang.Object obj6 = stackTestDriver2.push((java.lang.Object) (-1.0f));
        java.lang.Object obj8 = stackTestDriver2.push((java.lang.Object) (short) 1);
        int int9 = stackTestDriver2.size();
        int int10 = stackTestDriver2.size();
        java.lang.Object obj11 = stackTestDriver2.pop();
        java.lang.Object obj12 = stackTestDriver0.push((java.lang.Object) stackTestDriver2);
        java.lang.Object obj13 = stackTestDriver2.peek();
        experiment.util.StackTestDriver stackTestDriver14 = new experiment.util.StackTestDriver();
        int int15 = stackTestDriver14.size();
        int int16 = stackTestDriver14.size();
        boolean boolean17 = stackTestDriver14.isEmpty();
        experiment.util.StackTestDriver stackTestDriver18 = new experiment.util.StackTestDriver();
        boolean boolean19 = stackTestDriver18.isEmpty();
        stackTestDriver18.clear();
        java.lang.Object obj21 = stackTestDriver14.push((java.lang.Object) stackTestDriver18);
        java.lang.Object obj22 = stackTestDriver2.push(obj21);
        java.lang.Class<?> wildcardClass23 = stackTestDriver2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1.0f) + "'", obj6, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (short) 1 + "'", obj8, (short) 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (short) 1 + "'", obj11, (short) 1);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (-1.0f) + "'", obj13, (-1.0f));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test202");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver2 = new experiment.util.StackTestDriver();
        stackTestDriver2.clear();
        boolean boolean4 = stackTestDriver2.isEmpty();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) stackTestDriver2);
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        boolean boolean7 = stackTestDriver6.isEmpty();
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        stackTestDriver8.clear();
        boolean boolean10 = stackTestDriver8.isEmpty();
        java.lang.Object obj11 = stackTestDriver6.push((java.lang.Object) stackTestDriver8);
        java.lang.Object obj13 = stackTestDriver6.push((java.lang.Object) 2);
        stackTestDriver6.clear();
        int int15 = stackTestDriver6.size();
        java.lang.Object obj16 = stackTestDriver0.push((java.lang.Object) int15);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 2 + "'", obj13, 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0 + "'", obj16, 0);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test203");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        boolean boolean2 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver3 = new experiment.util.StackTestDriver();
        int int4 = stackTestDriver3.size();
        boolean boolean5 = stackTestDriver3.isEmpty();
        java.lang.Object obj7 = stackTestDriver3.push((java.lang.Object) (-1.0f));
        java.lang.Object obj9 = stackTestDriver3.push((java.lang.Object) (short) 1);
        int int10 = stackTestDriver3.size();
        int int11 = stackTestDriver3.size();
        java.lang.Object obj12 = stackTestDriver3.pop();
        java.lang.Object obj13 = stackTestDriver0.push((java.lang.Object) stackTestDriver3);
        int int14 = stackTestDriver3.size();
        boolean boolean15 = stackTestDriver3.isEmpty();
        stackTestDriver3.clear();
        experiment.util.StackTestDriver stackTestDriver17 = new experiment.util.StackTestDriver();
        int int18 = stackTestDriver17.size();
        int int19 = stackTestDriver17.size();
        int int20 = stackTestDriver17.size();
        int int21 = stackTestDriver17.size();
        boolean boolean22 = stackTestDriver17.isEmpty();
        int int23 = stackTestDriver17.size();
        experiment.util.StackTestDriver stackTestDriver24 = new experiment.util.StackTestDriver();
        int int25 = stackTestDriver24.size();
        boolean boolean26 = stackTestDriver24.isEmpty();
        int int27 = stackTestDriver24.size();
        java.lang.Object obj28 = stackTestDriver17.push((java.lang.Object) stackTestDriver24);
        java.lang.Object obj29 = stackTestDriver17.pop();
        java.lang.Object obj30 = stackTestDriver3.push(obj29);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0f) + "'", obj7, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (short) 1 + "'", obj9, (short) 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (short) 1 + "'", obj12, (short) 1);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNotNull(obj30);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test204");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        boolean boolean2 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver3 = new experiment.util.StackTestDriver();
        int int4 = stackTestDriver3.size();
        boolean boolean5 = stackTestDriver3.isEmpty();
        java.lang.Object obj7 = stackTestDriver3.push((java.lang.Object) (-1.0f));
        java.lang.Object obj9 = stackTestDriver3.push((java.lang.Object) (short) 1);
        int int10 = stackTestDriver3.size();
        int int11 = stackTestDriver3.size();
        java.lang.Object obj12 = stackTestDriver3.pop();
        java.lang.Object obj13 = stackTestDriver0.push((java.lang.Object) stackTestDriver3);
        stackTestDriver3.clear();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        stackTestDriver15.clear();
        stackTestDriver15.clear();
        boolean boolean18 = stackTestDriver15.isEmpty();
        experiment.util.StackTestDriver stackTestDriver19 = new experiment.util.StackTestDriver();
        int int20 = stackTestDriver19.size();
        int int21 = stackTestDriver19.size();
        int int22 = stackTestDriver19.size();
        java.lang.Class<?> wildcardClass23 = stackTestDriver19.getClass();
        java.lang.Object obj24 = stackTestDriver15.push((java.lang.Object) stackTestDriver19);
        java.lang.Object obj25 = stackTestDriver3.push((java.lang.Object) stackTestDriver15);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0f) + "'", obj7, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (short) 1 + "'", obj9, (short) 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (short) 1 + "'", obj12, (short) 1);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(obj25);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test205");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        int int4 = stackTestDriver0.size();
        int int5 = stackTestDriver0.size();
        java.lang.Class<?> wildcardClass6 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test206");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (-1.0f));
        java.lang.Object obj5 = stackTestDriver0.pop();
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
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1.0f) + "'", obj4, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0f) + "'", obj5, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test207");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        int int6 = stackTestDriver4.size();
        int int7 = stackTestDriver4.size();
        boolean boolean8 = stackTestDriver4.isEmpty();
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) boolean8);
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        int int11 = stackTestDriver10.size();
        boolean boolean12 = stackTestDriver10.isEmpty();
        stackTestDriver10.clear();
        int int14 = stackTestDriver10.size();
        java.lang.Object obj15 = stackTestDriver0.push((java.lang.Object) stackTestDriver10);
        java.lang.Class<?> wildcardClass16 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + true + "'", obj9, true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test208");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) (short) 1);
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        int int10 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver11 = new experiment.util.StackTestDriver();
        int int12 = stackTestDriver11.size();
        boolean boolean13 = stackTestDriver11.isEmpty();
        stackTestDriver11.clear();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        int int16 = stackTestDriver15.size();
        boolean boolean17 = stackTestDriver15.isEmpty();
        java.lang.Object obj19 = stackTestDriver15.push((java.lang.Object) (-1.0f));
        java.lang.Object obj20 = stackTestDriver11.push((java.lang.Object) stackTestDriver15);
        stackTestDriver11.clear();
        stackTestDriver11.clear();
        java.lang.Object obj23 = stackTestDriver0.push((java.lang.Object) stackTestDriver11);
        int int24 = stackTestDriver0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1.0f) + "'", obj4, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 1 + "'", obj6, (short) 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (-1.0f) + "'", obj19, (-1.0f));
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test209");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        boolean boolean6 = stackTestDriver4.isEmpty();
        java.lang.Object obj8 = stackTestDriver4.push((java.lang.Object) (-1.0f));
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        boolean boolean12 = stackTestDriver0.isEmpty();
        boolean boolean13 = stackTestDriver0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0f) + "'", obj8, (-1.0f));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test210");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (-1.0f));
        java.lang.Object obj5 = stackTestDriver0.pop();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1.0f) + "'", obj4, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0f) + "'", obj5, (-1.0f));
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test211");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver2 = new experiment.util.StackTestDriver();
        int int3 = stackTestDriver2.size();
        boolean boolean4 = stackTestDriver2.isEmpty();
        java.lang.Object obj6 = stackTestDriver2.push((java.lang.Object) (-1.0f));
        java.lang.Object obj8 = stackTestDriver2.push((java.lang.Object) (short) 1);
        int int9 = stackTestDriver2.size();
        int int10 = stackTestDriver2.size();
        java.lang.Object obj11 = stackTestDriver2.pop();
        java.lang.Object obj12 = stackTestDriver0.push((java.lang.Object) stackTestDriver2);
        int int13 = stackTestDriver0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1.0f) + "'", obj6, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (short) 1 + "'", obj8, (short) 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (short) 1 + "'", obj11, (short) 1);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test212");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        boolean boolean2 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver3 = new experiment.util.StackTestDriver();
        int int4 = stackTestDriver3.size();
        boolean boolean5 = stackTestDriver3.isEmpty();
        java.lang.Object obj7 = stackTestDriver3.push((java.lang.Object) (-1.0f));
        java.lang.Object obj9 = stackTestDriver3.push((java.lang.Object) (short) 1);
        int int10 = stackTestDriver3.size();
        int int11 = stackTestDriver3.size();
        java.lang.Object obj12 = stackTestDriver3.pop();
        java.lang.Object obj13 = stackTestDriver0.push((java.lang.Object) stackTestDriver3);
        experiment.util.StackTestDriver stackTestDriver14 = new experiment.util.StackTestDriver();
        int int15 = stackTestDriver14.size();
        boolean boolean16 = stackTestDriver14.isEmpty();
        java.lang.Object obj18 = stackTestDriver14.push((java.lang.Object) (-1.0f));
        java.lang.Object obj20 = stackTestDriver14.push((java.lang.Object) (short) 1);
        int int21 = stackTestDriver14.size();
        int int22 = stackTestDriver14.size();
        java.lang.Object obj23 = stackTestDriver14.pop();
        java.lang.Object obj24 = stackTestDriver14.peek();
        java.lang.Object obj26 = stackTestDriver14.push((java.lang.Object) "");
        java.lang.Object obj27 = stackTestDriver3.push(obj26);
        stackTestDriver3.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj29 = stackTestDriver3.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0f) + "'", obj7, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (short) 1 + "'", obj9, (short) 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (short) 1 + "'", obj12, (short) 1);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (-1.0f) + "'", obj18, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (short) 1 + "'", obj20, (short) 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (short) 1 + "'", obj23, (short) 1);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (-1.0f) + "'", obj24, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + "" + "'", obj26, "");
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + "" + "'", obj27, "");
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test213");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver2 = new experiment.util.StackTestDriver();
        stackTestDriver2.clear();
        boolean boolean4 = stackTestDriver2.isEmpty();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) stackTestDriver2);
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        stackTestDriver6.clear();
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        int int9 = stackTestDriver8.size();
        boolean boolean10 = stackTestDriver8.isEmpty();
        java.lang.Object obj12 = stackTestDriver8.push((java.lang.Object) (-1.0f));
        java.lang.Object obj14 = stackTestDriver8.push((java.lang.Object) (short) 1);
        int int15 = stackTestDriver8.size();
        int int16 = stackTestDriver8.size();
        java.lang.Object obj17 = stackTestDriver8.pop();
        java.lang.Object obj18 = stackTestDriver6.push((java.lang.Object) stackTestDriver8);
        experiment.util.StackTestDriver stackTestDriver19 = new experiment.util.StackTestDriver();
        int int20 = stackTestDriver19.size();
        boolean boolean21 = stackTestDriver19.isEmpty();
        java.lang.Class<?> wildcardClass22 = stackTestDriver19.getClass();
        java.lang.Object obj23 = stackTestDriver6.push((java.lang.Object) stackTestDriver19);
        java.lang.Object obj24 = stackTestDriver2.push(obj23);
        java.lang.Class<?> wildcardClass25 = stackTestDriver2.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (-1.0f) + "'", obj12, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (short) 1 + "'", obj14, (short) 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (short) 1 + "'", obj17, (short) 1);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test214");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver2 = new experiment.util.StackTestDriver();
        int int3 = stackTestDriver2.size();
        boolean boolean4 = stackTestDriver2.isEmpty();
        java.lang.Object obj6 = stackTestDriver2.push((java.lang.Object) (-1.0f));
        java.lang.Object obj8 = stackTestDriver2.push((java.lang.Object) (short) 1);
        int int9 = stackTestDriver2.size();
        int int10 = stackTestDriver2.size();
        java.lang.Object obj11 = stackTestDriver2.pop();
        java.lang.Object obj12 = stackTestDriver0.push((java.lang.Object) stackTestDriver2);
        stackTestDriver2.clear();
        int int14 = stackTestDriver2.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1.0f) + "'", obj6, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (short) 1 + "'", obj8, (short) 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (short) 1 + "'", obj11, (short) 1);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test215");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver2 = new experiment.util.StackTestDriver();
        int int3 = stackTestDriver2.size();
        boolean boolean4 = stackTestDriver2.isEmpty();
        java.lang.Object obj6 = stackTestDriver2.push((java.lang.Object) (-1.0f));
        java.lang.Object obj8 = stackTestDriver2.push((java.lang.Object) (short) 1);
        int int9 = stackTestDriver2.size();
        int int10 = stackTestDriver2.size();
        java.lang.Object obj11 = stackTestDriver2.pop();
        java.lang.Object obj12 = stackTestDriver0.push((java.lang.Object) stackTestDriver2);
        java.lang.Object obj13 = stackTestDriver2.peek();
        java.lang.Object obj14 = stackTestDriver2.pop();
        stackTestDriver2.clear();
        int int16 = stackTestDriver2.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1.0f) + "'", obj6, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (short) 1 + "'", obj8, (short) 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (short) 1 + "'", obj11, (short) 1);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (-1.0f) + "'", obj13, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1.0f) + "'", obj14, (-1.0f));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test216");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) (short) 1);
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver9 = new experiment.util.StackTestDriver();
        int int10 = stackTestDriver9.size();
        boolean boolean11 = stackTestDriver9.isEmpty();
        stackTestDriver9.clear();
        experiment.util.StackTestDriver stackTestDriver13 = new experiment.util.StackTestDriver();
        int int14 = stackTestDriver13.size();
        boolean boolean15 = stackTestDriver13.isEmpty();
        java.lang.Object obj17 = stackTestDriver13.push((java.lang.Object) (-1.0f));
        java.lang.Object obj18 = stackTestDriver9.push((java.lang.Object) stackTestDriver13);
        java.lang.Object obj19 = stackTestDriver9.peek();
        java.lang.Object obj20 = stackTestDriver9.peek();
        java.lang.Object obj21 = stackTestDriver0.push(obj20);
        java.lang.Class<?> wildcardClass22 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1.0f) + "'", obj4, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 1 + "'", obj6, (short) 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (-1.0f) + "'", obj17, (-1.0f));
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test217");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver2 = new experiment.util.StackTestDriver();
        int int3 = stackTestDriver2.size();
        boolean boolean4 = stackTestDriver2.isEmpty();
        java.lang.Object obj6 = stackTestDriver2.push((java.lang.Object) (-1.0f));
        java.lang.Object obj8 = stackTestDriver2.push((java.lang.Object) (short) 1);
        int int9 = stackTestDriver2.size();
        int int10 = stackTestDriver2.size();
        java.lang.Object obj11 = stackTestDriver2.pop();
        java.lang.Object obj12 = stackTestDriver0.push((java.lang.Object) stackTestDriver2);
        java.lang.Object obj13 = stackTestDriver2.peek();
        java.lang.Object obj14 = stackTestDriver2.pop();
        boolean boolean15 = stackTestDriver2.isEmpty();
        stackTestDriver2.clear();
        boolean boolean17 = stackTestDriver2.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1.0f) + "'", obj6, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (short) 1 + "'", obj8, (short) 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (short) 1 + "'", obj11, (short) 1);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (-1.0f) + "'", obj13, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1.0f) + "'", obj14, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test218");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        int int3 = stackTestDriver0.size();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        int int6 = stackTestDriver5.size();
        boolean boolean7 = stackTestDriver5.isEmpty();
        java.lang.Object obj9 = stackTestDriver5.push((java.lang.Object) (-1.0f));
        boolean boolean10 = stackTestDriver5.isEmpty();
        java.lang.Object obj11 = stackTestDriver5.peek();
        java.lang.Object obj12 = stackTestDriver5.pop();
        stackTestDriver5.clear();
        java.lang.Object obj14 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        boolean boolean15 = stackTestDriver0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (-1.0f) + "'", obj9, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (-1.0f) + "'", obj11, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (-1.0f) + "'", obj12, (-1.0f));
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test219");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) (short) 1);
        stackTestDriver0.clear();
        int int8 = stackTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1.0f) + "'", obj4, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 1 + "'", obj6, (short) 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test220");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        boolean boolean3 = stackTestDriver0.isEmpty();
        boolean boolean4 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        int int6 = stackTestDriver0.size();
        int int7 = stackTestDriver0.size();
        stackTestDriver0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test221");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        boolean boolean3 = stackTestDriver0.isEmpty();
        boolean boolean4 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        boolean boolean6 = stackTestDriver0.isEmpty();
        int int7 = stackTestDriver0.size();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver9 = new experiment.util.StackTestDriver();
        stackTestDriver9.clear();
        boolean boolean11 = stackTestDriver9.isEmpty();
        experiment.util.StackTestDriver stackTestDriver12 = new experiment.util.StackTestDriver();
        int int13 = stackTestDriver12.size();
        boolean boolean14 = stackTestDriver12.isEmpty();
        java.lang.Object obj16 = stackTestDriver12.push((java.lang.Object) (-1.0f));
        java.lang.Object obj18 = stackTestDriver12.push((java.lang.Object) (short) 1);
        int int19 = stackTestDriver12.size();
        int int20 = stackTestDriver12.size();
        java.lang.Object obj21 = stackTestDriver12.pop();
        java.lang.Object obj22 = stackTestDriver9.push((java.lang.Object) stackTestDriver12);
        java.lang.Object obj23 = stackTestDriver0.push(obj22);
        experiment.util.StackTestDriver stackTestDriver24 = new experiment.util.StackTestDriver();
        int int25 = stackTestDriver24.size();
        boolean boolean26 = stackTestDriver24.isEmpty();
        java.lang.Object obj28 = stackTestDriver24.push((java.lang.Object) (-1.0f));
        java.lang.Object obj30 = stackTestDriver24.push((java.lang.Object) (short) 1);
        int int31 = stackTestDriver24.size();
        int int32 = stackTestDriver24.size();
        java.lang.Object obj33 = stackTestDriver24.pop();
        java.lang.Object obj34 = stackTestDriver24.peek();
        java.lang.Object obj36 = stackTestDriver24.push((java.lang.Object) "");
        boolean boolean37 = stackTestDriver24.isEmpty();
        java.lang.Object obj38 = stackTestDriver0.push((java.lang.Object) boolean37);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (-1.0f) + "'", obj16, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (short) 1 + "'", obj18, (short) 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (short) 1 + "'", obj21, (short) 1);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + (-1.0f) + "'", obj28, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + (short) 1 + "'", obj30, (short) 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2 + "'", int31 == 2);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2 + "'", int32 == 2);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + (short) 1 + "'", obj33, (short) 1);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + (-1.0f) + "'", obj34, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + "" + "'", obj36, "");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + false + "'", obj38, false);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test222");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver2 = new experiment.util.StackTestDriver();
        int int3 = stackTestDriver2.size();
        boolean boolean4 = stackTestDriver2.isEmpty();
        java.lang.Object obj6 = stackTestDriver2.push((java.lang.Object) (-1.0f));
        java.lang.Object obj8 = stackTestDriver2.push((java.lang.Object) (short) 1);
        int int9 = stackTestDriver2.size();
        int int10 = stackTestDriver2.size();
        java.lang.Object obj11 = stackTestDriver2.pop();
        java.lang.Object obj12 = stackTestDriver0.push((java.lang.Object) stackTestDriver2);
        stackTestDriver2.clear();
        experiment.util.StackTestDriver stackTestDriver14 = new experiment.util.StackTestDriver();
        int int15 = stackTestDriver14.size();
        boolean boolean16 = stackTestDriver14.isEmpty();
        stackTestDriver14.clear();
        experiment.util.StackTestDriver stackTestDriver18 = new experiment.util.StackTestDriver();
        int int19 = stackTestDriver18.size();
        boolean boolean20 = stackTestDriver18.isEmpty();
        java.lang.Object obj22 = stackTestDriver18.push((java.lang.Object) (-1.0f));
        java.lang.Object obj23 = stackTestDriver14.push((java.lang.Object) stackTestDriver18);
        experiment.util.StackTestDriver stackTestDriver24 = new experiment.util.StackTestDriver();
        int int25 = stackTestDriver24.size();
        boolean boolean26 = stackTestDriver24.isEmpty();
        boolean boolean27 = stackTestDriver24.isEmpty();
        java.lang.Class<?> wildcardClass28 = stackTestDriver24.getClass();
        java.lang.Object obj29 = stackTestDriver14.push((java.lang.Object) stackTestDriver24);
        java.lang.Object obj30 = stackTestDriver14.pop();
        java.lang.Object obj31 = stackTestDriver14.peek();
        stackTestDriver14.clear();
        java.lang.Object obj33 = stackTestDriver2.push((java.lang.Object) stackTestDriver14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj34 = stackTestDriver14.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1.0f) + "'", obj6, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (short) 1 + "'", obj8, (short) 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (short) 1 + "'", obj11, (short) 1);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (-1.0f) + "'", obj22, (-1.0f));
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertNotNull(obj33);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test223");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) 10.0d);
        stackTestDriver0.clear();
        boolean boolean6 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver7 = new experiment.util.StackTestDriver();
        int int8 = stackTestDriver7.size();
        boolean boolean9 = stackTestDriver7.isEmpty();
        stackTestDriver7.clear();
        experiment.util.StackTestDriver stackTestDriver11 = new experiment.util.StackTestDriver();
        int int12 = stackTestDriver11.size();
        boolean boolean13 = stackTestDriver11.isEmpty();
        java.lang.Object obj15 = stackTestDriver11.push((java.lang.Object) (-1.0f));
        java.lang.Object obj16 = stackTestDriver7.push((java.lang.Object) stackTestDriver11);
        experiment.util.StackTestDriver stackTestDriver17 = new experiment.util.StackTestDriver();
        int int18 = stackTestDriver17.size();
        boolean boolean19 = stackTestDriver17.isEmpty();
        boolean boolean20 = stackTestDriver17.isEmpty();
        java.lang.Class<?> wildcardClass21 = stackTestDriver17.getClass();
        java.lang.Object obj22 = stackTestDriver7.push((java.lang.Object) stackTestDriver17);
        java.lang.Object obj23 = stackTestDriver7.pop();
        java.lang.Object obj24 = stackTestDriver7.peek();
        int int25 = stackTestDriver7.size();
        java.lang.Object obj26 = stackTestDriver0.push((java.lang.Object) stackTestDriver7);
        java.lang.Class<?> wildcardClass27 = stackTestDriver7.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 10.0d + "'", obj4, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (-1.0f) + "'", obj15, (-1.0f));
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test224");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver2 = new experiment.util.StackTestDriver();
        stackTestDriver2.clear();
        boolean boolean4 = stackTestDriver2.isEmpty();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) stackTestDriver2);
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) 2);
        boolean boolean8 = stackTestDriver0.isEmpty();
        java.lang.Object obj10 = stackTestDriver0.push((java.lang.Object) (short) -1);
        java.lang.Class<?> wildcardClass11 = obj10.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 2 + "'", obj7, 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (short) -1 + "'", obj10, (short) -1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test225");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        boolean boolean6 = stackTestDriver4.isEmpty();
        stackTestDriver4.clear();
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        int int9 = stackTestDriver8.size();
        boolean boolean10 = stackTestDriver8.isEmpty();
        java.lang.Object obj12 = stackTestDriver8.push((java.lang.Object) (-1.0f));
        java.lang.Object obj13 = stackTestDriver4.push((java.lang.Object) stackTestDriver8);
        experiment.util.StackTestDriver stackTestDriver14 = new experiment.util.StackTestDriver();
        int int15 = stackTestDriver14.size();
        boolean boolean16 = stackTestDriver14.isEmpty();
        boolean boolean17 = stackTestDriver14.isEmpty();
        java.lang.Class<?> wildcardClass18 = stackTestDriver14.getClass();
        java.lang.Object obj19 = stackTestDriver4.push((java.lang.Object) stackTestDriver14);
        java.lang.Object obj20 = stackTestDriver4.pop();
        java.lang.Object obj21 = stackTestDriver0.push(obj20);
        boolean boolean22 = stackTestDriver0.isEmpty();
        int int23 = stackTestDriver0.size();
        int int24 = stackTestDriver0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (-1.0f) + "'", obj12, (-1.0f));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test226");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) (short) 1);
        int int7 = stackTestDriver0.size();
        int int8 = stackTestDriver0.size();
        java.lang.Object obj9 = stackTestDriver0.pop();
        boolean boolean10 = stackTestDriver0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1.0f) + "'", obj4, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 1 + "'", obj6, (short) 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (short) 1 + "'", obj9, (short) 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test227");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        boolean boolean3 = stackTestDriver0.isEmpty();
        boolean boolean4 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        int int6 = stackTestDriver0.size();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        int int9 = stackTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test228");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test229");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        int int6 = stackTestDriver4.size();
        int int7 = stackTestDriver4.size();
        boolean boolean8 = stackTestDriver4.isEmpty();
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) boolean8);
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        int int11 = stackTestDriver10.size();
        boolean boolean12 = stackTestDriver10.isEmpty();
        stackTestDriver10.clear();
        experiment.util.StackTestDriver stackTestDriver14 = new experiment.util.StackTestDriver();
        int int15 = stackTestDriver14.size();
        boolean boolean16 = stackTestDriver14.isEmpty();
        java.lang.Object obj18 = stackTestDriver14.push((java.lang.Object) (-1.0f));
        java.lang.Object obj19 = stackTestDriver10.push((java.lang.Object) stackTestDriver14);
        java.lang.Object obj20 = stackTestDriver0.push(obj19);
        boolean boolean21 = stackTestDriver0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + true + "'", obj9, true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (-1.0f) + "'", obj18, (-1.0f));
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test230");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver2 = new experiment.util.StackTestDriver();
        int int3 = stackTestDriver2.size();
        boolean boolean4 = stackTestDriver2.isEmpty();
        java.lang.Object obj6 = stackTestDriver2.push((java.lang.Object) (-1.0f));
        java.lang.Object obj8 = stackTestDriver2.push((java.lang.Object) (short) 1);
        int int9 = stackTestDriver2.size();
        int int10 = stackTestDriver2.size();
        java.lang.Object obj11 = stackTestDriver2.pop();
        java.lang.Object obj12 = stackTestDriver0.push((java.lang.Object) stackTestDriver2);
        java.lang.Object obj13 = stackTestDriver2.peek();
        java.lang.Object obj14 = stackTestDriver2.pop();
        boolean boolean15 = stackTestDriver2.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = stackTestDriver2.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1.0f) + "'", obj6, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (short) 1 + "'", obj8, (short) 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (short) 1 + "'", obj11, (short) 1);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (-1.0f) + "'", obj13, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1.0f) + "'", obj14, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test231");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        int int4 = stackTestDriver0.size();
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
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test232");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        int int4 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        stackTestDriver0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test233");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) (short) 1);
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver9 = new experiment.util.StackTestDriver();
        int int10 = stackTestDriver9.size();
        boolean boolean11 = stackTestDriver9.isEmpty();
        stackTestDriver9.clear();
        experiment.util.StackTestDriver stackTestDriver13 = new experiment.util.StackTestDriver();
        int int14 = stackTestDriver13.size();
        boolean boolean15 = stackTestDriver13.isEmpty();
        java.lang.Object obj17 = stackTestDriver13.push((java.lang.Object) (-1.0f));
        java.lang.Object obj18 = stackTestDriver9.push((java.lang.Object) stackTestDriver13);
        java.lang.Object obj19 = stackTestDriver9.peek();
        java.lang.Object obj20 = stackTestDriver9.peek();
        java.lang.Object obj21 = stackTestDriver0.push(obj20);
        experiment.util.StackTestDriver stackTestDriver22 = new experiment.util.StackTestDriver();
        int int23 = stackTestDriver22.size();
        int int24 = stackTestDriver22.size();
        int int25 = stackTestDriver22.size();
        boolean boolean26 = stackTestDriver22.isEmpty();
        int int27 = stackTestDriver22.size();
        java.lang.Object obj29 = stackTestDriver22.push((java.lang.Object) 10.0d);
        java.lang.Class<?> wildcardClass30 = stackTestDriver22.getClass();
        java.lang.Object obj31 = stackTestDriver0.push((java.lang.Object) stackTestDriver22);
        java.lang.Object obj32 = stackTestDriver22.pop();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1.0f) + "'", obj4, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 1 + "'", obj6, (short) 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (-1.0f) + "'", obj17, (-1.0f));
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 10.0d + "'", obj29, 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 10.0d + "'", obj32, 10.0d);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test234");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        boolean boolean6 = stackTestDriver4.isEmpty();
        stackTestDriver4.clear();
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        int int9 = stackTestDriver8.size();
        boolean boolean10 = stackTestDriver8.isEmpty();
        java.lang.Object obj12 = stackTestDriver8.push((java.lang.Object) (-1.0f));
        java.lang.Object obj13 = stackTestDriver4.push((java.lang.Object) stackTestDriver8);
        experiment.util.StackTestDriver stackTestDriver14 = new experiment.util.StackTestDriver();
        int int15 = stackTestDriver14.size();
        boolean boolean16 = stackTestDriver14.isEmpty();
        boolean boolean17 = stackTestDriver14.isEmpty();
        java.lang.Class<?> wildcardClass18 = stackTestDriver14.getClass();
        java.lang.Object obj19 = stackTestDriver4.push((java.lang.Object) stackTestDriver14);
        java.lang.Object obj20 = stackTestDriver4.pop();
        java.lang.Object obj21 = stackTestDriver0.push(obj20);
        stackTestDriver0.clear();
        java.lang.Class<?> wildcardClass23 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (-1.0f) + "'", obj12, (-1.0f));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test235");
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
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test236");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        int int3 = stackTestDriver0.size();
        boolean boolean4 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        int int6 = stackTestDriver5.size();
        boolean boolean7 = stackTestDriver5.isEmpty();
        java.lang.Object obj9 = stackTestDriver5.push((java.lang.Object) (-1.0f));
        java.lang.Object obj11 = stackTestDriver5.push((java.lang.Object) (short) 1);
        stackTestDriver5.clear();
        int int13 = stackTestDriver5.size();
        int int14 = stackTestDriver5.size();
        java.lang.Object obj15 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        int int16 = stackTestDriver0.size();
        java.lang.Class<?> wildcardClass17 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (-1.0f) + "'", obj9, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (short) 1 + "'", obj11, (short) 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test237");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
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
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test238");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        boolean boolean3 = stackTestDriver0.isEmpty();
        boolean boolean4 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        boolean boolean6 = stackTestDriver0.isEmpty();
        boolean boolean7 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test239");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        int int6 = stackTestDriver4.size();
        int int7 = stackTestDriver4.size();
        boolean boolean8 = stackTestDriver4.isEmpty();
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) boolean8);
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        int int11 = stackTestDriver10.size();
        boolean boolean12 = stackTestDriver10.isEmpty();
        stackTestDriver10.clear();
        int int14 = stackTestDriver10.size();
        java.lang.Object obj15 = stackTestDriver0.push((java.lang.Object) stackTestDriver10);
        java.lang.Object obj16 = stackTestDriver0.peek();
        java.lang.Object obj17 = stackTestDriver0.pop();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + true + "'", obj9, true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(obj17);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test240");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        int int4 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean6 = stackTestDriver0.isEmpty();
        boolean boolean7 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        int int9 = stackTestDriver8.size();
        boolean boolean10 = stackTestDriver8.isEmpty();
        stackTestDriver8.clear();
        experiment.util.StackTestDriver stackTestDriver12 = new experiment.util.StackTestDriver();
        int int13 = stackTestDriver12.size();
        boolean boolean14 = stackTestDriver12.isEmpty();
        java.lang.Object obj16 = stackTestDriver12.push((java.lang.Object) (-1.0f));
        java.lang.Object obj17 = stackTestDriver8.push((java.lang.Object) stackTestDriver12);
        experiment.util.StackTestDriver stackTestDriver18 = new experiment.util.StackTestDriver();
        int int19 = stackTestDriver18.size();
        boolean boolean20 = stackTestDriver18.isEmpty();
        boolean boolean21 = stackTestDriver18.isEmpty();
        java.lang.Class<?> wildcardClass22 = stackTestDriver18.getClass();
        java.lang.Object obj23 = stackTestDriver8.push((java.lang.Object) stackTestDriver18);
        java.lang.Object obj24 = stackTestDriver8.pop();
        java.lang.Object obj25 = stackTestDriver8.peek();
        java.lang.Class<?> wildcardClass26 = obj25.getClass();
        java.lang.Object obj27 = stackTestDriver0.push((java.lang.Object) wildcardClass26);
        boolean boolean28 = stackTestDriver0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (-1.0f) + "'", obj16, (-1.0f));
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertEquals(obj27.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj27), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj27), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test241");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        int int2 = stackTestDriver0.size();
        boolean boolean3 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        boolean boolean5 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        stackTestDriver6.clear();
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        int int9 = stackTestDriver8.size();
        boolean boolean10 = stackTestDriver8.isEmpty();
        java.lang.Object obj12 = stackTestDriver8.push((java.lang.Object) (-1.0f));
        java.lang.Object obj14 = stackTestDriver8.push((java.lang.Object) (short) 1);
        int int15 = stackTestDriver8.size();
        int int16 = stackTestDriver8.size();
        java.lang.Object obj17 = stackTestDriver8.pop();
        java.lang.Object obj18 = stackTestDriver6.push((java.lang.Object) stackTestDriver8);
        java.lang.Class<?> wildcardClass19 = obj18.getClass();
        java.lang.Object obj20 = stackTestDriver0.push(obj18);
        java.lang.Object obj21 = stackTestDriver0.pop();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (-1.0f) + "'", obj12, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (short) 1 + "'", obj14, (short) 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (short) 1 + "'", obj17, (short) 1);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(obj21);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test242");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (-1.0f));
        boolean boolean5 = stackTestDriver0.isEmpty();
        java.lang.Object obj6 = stackTestDriver0.peek();
        experiment.util.StackTestDriver stackTestDriver7 = new experiment.util.StackTestDriver();
        int int8 = stackTestDriver7.size();
        boolean boolean9 = stackTestDriver7.isEmpty();
        int int10 = stackTestDriver7.size();
        boolean boolean11 = stackTestDriver7.isEmpty();
        java.lang.Object obj12 = stackTestDriver0.push((java.lang.Object) stackTestDriver7);
        int int13 = stackTestDriver7.size();
        experiment.util.StackTestDriver stackTestDriver14 = new experiment.util.StackTestDriver();
        boolean boolean15 = stackTestDriver14.isEmpty();
        experiment.util.StackTestDriver stackTestDriver16 = new experiment.util.StackTestDriver();
        stackTestDriver16.clear();
        boolean boolean18 = stackTestDriver16.isEmpty();
        java.lang.Object obj19 = stackTestDriver14.push((java.lang.Object) stackTestDriver16);
        java.lang.Object obj21 = stackTestDriver14.push((java.lang.Object) 2);
        boolean boolean22 = stackTestDriver14.isEmpty();
        java.lang.Object obj24 = stackTestDriver14.push((java.lang.Object) (short) -1);
        java.lang.Object obj25 = stackTestDriver14.peek();
        java.lang.Object obj26 = stackTestDriver14.pop();
        java.lang.Object obj27 = stackTestDriver7.push(obj26);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1.0f) + "'", obj4, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1.0f) + "'", obj6, (-1.0f));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 2 + "'", obj21, 2);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (short) -1 + "'", obj24, (short) -1);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (short) -1 + "'", obj25, (short) -1);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + (short) -1 + "'", obj26, (short) -1);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + (short) -1 + "'", obj27, (short) -1);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test243");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        boolean boolean6 = stackTestDriver4.isEmpty();
        java.lang.Object obj8 = stackTestDriver4.push((java.lang.Object) (-1.0f));
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        int int10 = stackTestDriver0.size();
        java.lang.Object obj11 = stackTestDriver0.peek();
        java.lang.Object obj12 = stackTestDriver0.peek();
        int int13 = stackTestDriver0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0f) + "'", obj8, (-1.0f));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test244");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) (short) 1);
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        java.lang.Class<?> wildcardClass11 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1.0f) + "'", obj4, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 1 + "'", obj6, (short) 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test245");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver2 = new experiment.util.StackTestDriver();
        stackTestDriver2.clear();
        boolean boolean4 = stackTestDriver2.isEmpty();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) stackTestDriver2);
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) 2);
        stackTestDriver0.clear();
        int int9 = stackTestDriver0.size();
        boolean boolean10 = stackTestDriver0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 2 + "'", obj7, 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test246");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        boolean boolean3 = stackTestDriver0.isEmpty();
        int int4 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        boolean boolean6 = stackTestDriver5.isEmpty();
        experiment.util.StackTestDriver stackTestDriver7 = new experiment.util.StackTestDriver();
        stackTestDriver7.clear();
        boolean boolean9 = stackTestDriver7.isEmpty();
        java.lang.Object obj10 = stackTestDriver5.push((java.lang.Object) stackTestDriver7);
        java.lang.Object obj12 = stackTestDriver5.push((java.lang.Object) 2);
        boolean boolean13 = stackTestDriver5.isEmpty();
        java.lang.Object obj14 = stackTestDriver5.pop();
        java.lang.Object obj15 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        java.lang.Class<?> wildcardClass16 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 2 + "'", obj12, 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 2 + "'", obj14, 2);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test247");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        boolean boolean6 = stackTestDriver4.isEmpty();
        java.lang.Object obj8 = stackTestDriver4.push((java.lang.Object) (-1.0f));
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        stackTestDriver0.clear();
        int int11 = stackTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0f) + "'", obj8, (-1.0f));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test248");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (-1.0f));
        boolean boolean5 = stackTestDriver0.isEmpty();
        int int6 = stackTestDriver0.size();
        boolean boolean7 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        int int9 = stackTestDriver8.size();
        int int10 = stackTestDriver8.size();
        int int11 = stackTestDriver8.size();
        boolean boolean12 = stackTestDriver8.isEmpty();
        java.lang.Object obj13 = stackTestDriver0.push((java.lang.Object) boolean12);
        java.lang.Object obj15 = stackTestDriver0.push((java.lang.Object) 100L);
        java.lang.Object obj16 = stackTestDriver0.peek();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1.0f) + "'", obj4, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + true + "'", obj13, true);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 100L + "'", obj15, 100L);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 100L + "'", obj16, 100L);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test249");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (-1.0f));
        boolean boolean5 = stackTestDriver0.isEmpty();
        java.lang.Object obj6 = stackTestDriver0.peek();
        experiment.util.StackTestDriver stackTestDriver7 = new experiment.util.StackTestDriver();
        int int8 = stackTestDriver7.size();
        boolean boolean9 = stackTestDriver7.isEmpty();
        int int10 = stackTestDriver7.size();
        boolean boolean11 = stackTestDriver7.isEmpty();
        java.lang.Object obj12 = stackTestDriver0.push((java.lang.Object) stackTestDriver7);
        boolean boolean13 = stackTestDriver0.isEmpty();
        java.lang.Object obj14 = stackTestDriver0.pop();
        java.lang.Class<?> wildcardClass15 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1.0f) + "'", obj4, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1.0f) + "'", obj6, (-1.0f));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test250");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver2 = new experiment.util.StackTestDriver();
        int int3 = stackTestDriver2.size();
        boolean boolean4 = stackTestDriver2.isEmpty();
        java.lang.Object obj6 = stackTestDriver2.push((java.lang.Object) (-1.0f));
        java.lang.Object obj8 = stackTestDriver2.push((java.lang.Object) (short) 1);
        int int9 = stackTestDriver2.size();
        int int10 = stackTestDriver2.size();
        java.lang.Object obj11 = stackTestDriver2.pop();
        java.lang.Object obj12 = stackTestDriver0.push((java.lang.Object) stackTestDriver2);
        stackTestDriver2.clear();
        experiment.util.StackTestDriver stackTestDriver14 = new experiment.util.StackTestDriver();
        int int15 = stackTestDriver14.size();
        boolean boolean16 = stackTestDriver14.isEmpty();
        stackTestDriver14.clear();
        experiment.util.StackTestDriver stackTestDriver18 = new experiment.util.StackTestDriver();
        int int19 = stackTestDriver18.size();
        boolean boolean20 = stackTestDriver18.isEmpty();
        java.lang.Object obj22 = stackTestDriver18.push((java.lang.Object) (-1.0f));
        java.lang.Object obj23 = stackTestDriver14.push((java.lang.Object) stackTestDriver18);
        experiment.util.StackTestDriver stackTestDriver24 = new experiment.util.StackTestDriver();
        int int25 = stackTestDriver24.size();
        boolean boolean26 = stackTestDriver24.isEmpty();
        boolean boolean27 = stackTestDriver24.isEmpty();
        java.lang.Class<?> wildcardClass28 = stackTestDriver24.getClass();
        java.lang.Object obj29 = stackTestDriver14.push((java.lang.Object) stackTestDriver24);
        java.lang.Object obj30 = stackTestDriver14.pop();
        java.lang.Object obj31 = stackTestDriver14.peek();
        stackTestDriver14.clear();
        java.lang.Object obj33 = stackTestDriver2.push((java.lang.Object) stackTestDriver14);
        int int34 = stackTestDriver14.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1.0f) + "'", obj6, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (short) 1 + "'", obj8, (short) 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (short) 1 + "'", obj11, (short) 1);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (-1.0f) + "'", obj22, (-1.0f));
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test251");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        boolean boolean3 = stackTestDriver0.isEmpty();
        int int4 = stackTestDriver0.size();
        stackTestDriver0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test252");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
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
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test253");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        int int4 = stackTestDriver0.size();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        int int7 = stackTestDriver6.size();
        boolean boolean8 = stackTestDriver6.isEmpty();
        java.lang.Object obj10 = stackTestDriver6.push((java.lang.Object) (-1.0f));
        java.lang.Object obj12 = stackTestDriver6.push((java.lang.Object) (short) 1);
        int int13 = stackTestDriver6.size();
        int int14 = stackTestDriver6.size();
        int int15 = stackTestDriver6.size();
        java.lang.Object obj16 = stackTestDriver0.push((java.lang.Object) stackTestDriver6);
        java.lang.Object obj17 = stackTestDriver0.peek();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (-1.0f) + "'", obj10, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (short) 1 + "'", obj12, (short) 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(obj17);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test254");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        int int4 = stackTestDriver0.size();
        boolean boolean5 = stackTestDriver0.isEmpty();
        int int6 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver7 = new experiment.util.StackTestDriver();
        int int8 = stackTestDriver7.size();
        boolean boolean9 = stackTestDriver7.isEmpty();
        int int10 = stackTestDriver7.size();
        java.lang.Object obj11 = stackTestDriver0.push((java.lang.Object) stackTestDriver7);
        java.lang.Object obj12 = stackTestDriver0.pop();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test255");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        boolean boolean6 = stackTestDriver4.isEmpty();
        java.lang.Object obj8 = stackTestDriver4.push((java.lang.Object) (-1.0f));
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        int int11 = stackTestDriver10.size();
        boolean boolean12 = stackTestDriver10.isEmpty();
        boolean boolean13 = stackTestDriver10.isEmpty();
        java.lang.Class<?> wildcardClass14 = stackTestDriver10.getClass();
        java.lang.Object obj15 = stackTestDriver0.push((java.lang.Object) stackTestDriver10);
        java.lang.Object obj16 = stackTestDriver0.pop();
        java.lang.Object obj17 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver18 = new experiment.util.StackTestDriver();
        boolean boolean19 = stackTestDriver18.isEmpty();
        stackTestDriver18.clear();
        int int21 = stackTestDriver18.size();
        int int22 = stackTestDriver18.size();
        java.lang.Object obj23 = stackTestDriver0.push((java.lang.Object) int22);
        java.lang.Object obj24 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver25 = new experiment.util.StackTestDriver();
        int int26 = stackTestDriver25.size();
        boolean boolean27 = stackTestDriver25.isEmpty();
        java.lang.Object obj29 = stackTestDriver25.push((java.lang.Object) (-1.0f));
        java.lang.Object obj31 = stackTestDriver25.push((java.lang.Object) (short) 1);
        int int32 = stackTestDriver25.size();
        int int33 = stackTestDriver25.size();
        java.lang.Object obj34 = stackTestDriver25.pop();
        experiment.util.StackTestDriver stackTestDriver35 = new experiment.util.StackTestDriver();
        int int36 = stackTestDriver35.size();
        int int37 = stackTestDriver35.size();
        int int38 = stackTestDriver35.size();
        boolean boolean39 = stackTestDriver35.isEmpty();
        java.lang.Object obj40 = stackTestDriver25.push((java.lang.Object) stackTestDriver35);
        boolean boolean41 = stackTestDriver35.isEmpty();
        java.lang.Object obj43 = stackTestDriver35.push((java.lang.Object) (byte) 1);
        java.lang.Class<?> wildcardClass44 = stackTestDriver35.getClass();
        java.lang.Object obj45 = stackTestDriver0.push((java.lang.Object) wildcardClass44);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0f) + "'", obj8, (-1.0f));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 0 + "'", obj23, 0);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 0 + "'", obj24, 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + (-1.0f) + "'", obj29, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + (short) 1 + "'", obj31, (short) 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2 + "'", int32 == 2);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2 + "'", int33 == 2);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + (short) 1 + "'", obj34, (short) 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + (byte) 1 + "'", obj43, (byte) 1);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertEquals(obj45.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj45), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj45), "class experiment.util.StackTestDriver");
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test256");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        int int4 = stackTestDriver0.size();
        boolean boolean5 = stackTestDriver0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test257");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) (short) 1);
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver9 = new experiment.util.StackTestDriver();
        int int10 = stackTestDriver9.size();
        boolean boolean11 = stackTestDriver9.isEmpty();
        stackTestDriver9.clear();
        experiment.util.StackTestDriver stackTestDriver13 = new experiment.util.StackTestDriver();
        int int14 = stackTestDriver13.size();
        boolean boolean15 = stackTestDriver13.isEmpty();
        java.lang.Object obj17 = stackTestDriver13.push((java.lang.Object) (-1.0f));
        java.lang.Object obj18 = stackTestDriver9.push((java.lang.Object) stackTestDriver13);
        java.lang.Object obj19 = stackTestDriver9.peek();
        java.lang.Object obj20 = stackTestDriver9.peek();
        java.lang.Object obj21 = stackTestDriver0.push(obj20);
        boolean boolean22 = stackTestDriver0.isEmpty();
        java.lang.Object obj23 = stackTestDriver0.peek();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1.0f) + "'", obj4, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 1 + "'", obj6, (short) 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (-1.0f) + "'", obj17, (-1.0f));
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(obj23);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test258");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        int int3 = stackTestDriver0.size();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        int int6 = stackTestDriver5.size();
        boolean boolean7 = stackTestDriver5.isEmpty();
        java.lang.Object obj9 = stackTestDriver5.push((java.lang.Object) (-1.0f));
        boolean boolean10 = stackTestDriver5.isEmpty();
        java.lang.Object obj11 = stackTestDriver5.peek();
        java.lang.Object obj12 = stackTestDriver5.pop();
        stackTestDriver5.clear();
        java.lang.Object obj14 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        java.lang.Class<?> wildcardClass15 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (-1.0f) + "'", obj9, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (-1.0f) + "'", obj11, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (-1.0f) + "'", obj12, (-1.0f));
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test259");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        int int4 = stackTestDriver0.size();
        int int5 = stackTestDriver0.size();
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test260");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        int int4 = stackTestDriver0.size();
        stackTestDriver0.clear();
        java.lang.Class<?> wildcardClass6 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test261");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) 100);
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100 + "'", obj5, 100);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test262");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        boolean boolean6 = stackTestDriver4.isEmpty();
        java.lang.Object obj8 = stackTestDriver4.push((java.lang.Object) (-1.0f));
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        java.lang.Object obj10 = stackTestDriver4.pop();
        boolean boolean11 = stackTestDriver4.isEmpty();
        boolean boolean12 = stackTestDriver4.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0f) + "'", obj8, (-1.0f));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (-1.0f) + "'", obj10, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test263");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver2 = new experiment.util.StackTestDriver();
        stackTestDriver2.clear();
        boolean boolean4 = stackTestDriver2.isEmpty();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) stackTestDriver2);
        int int6 = stackTestDriver2.size();
        experiment.util.StackTestDriver stackTestDriver7 = new experiment.util.StackTestDriver();
        int int8 = stackTestDriver7.size();
        boolean boolean9 = stackTestDriver7.isEmpty();
        stackTestDriver7.clear();
        experiment.util.StackTestDriver stackTestDriver11 = new experiment.util.StackTestDriver();
        int int12 = stackTestDriver11.size();
        boolean boolean13 = stackTestDriver11.isEmpty();
        java.lang.Object obj15 = stackTestDriver11.push((java.lang.Object) (-1.0f));
        java.lang.Object obj16 = stackTestDriver7.push((java.lang.Object) stackTestDriver11);
        experiment.util.StackTestDriver stackTestDriver17 = new experiment.util.StackTestDriver();
        int int18 = stackTestDriver17.size();
        boolean boolean19 = stackTestDriver17.isEmpty();
        boolean boolean20 = stackTestDriver17.isEmpty();
        java.lang.Class<?> wildcardClass21 = stackTestDriver17.getClass();
        java.lang.Object obj22 = stackTestDriver7.push((java.lang.Object) stackTestDriver17);
        java.lang.Object obj23 = stackTestDriver7.pop();
        java.lang.Object obj24 = stackTestDriver7.pop();
        experiment.util.StackTestDriver stackTestDriver25 = new experiment.util.StackTestDriver();
        boolean boolean26 = stackTestDriver25.isEmpty();
        stackTestDriver25.clear();
        int int28 = stackTestDriver25.size();
        int int29 = stackTestDriver25.size();
        java.lang.Object obj30 = stackTestDriver7.push((java.lang.Object) int29);
        java.lang.Object obj31 = stackTestDriver2.push((java.lang.Object) stackTestDriver7);
        stackTestDriver7.clear();
        stackTestDriver7.clear();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (-1.0f) + "'", obj15, (-1.0f));
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + 0 + "'", obj30, 0);
        org.junit.Assert.assertNotNull(obj31);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test264");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver2 = new experiment.util.StackTestDriver();
        int int3 = stackTestDriver2.size();
        boolean boolean4 = stackTestDriver2.isEmpty();
        java.lang.Object obj6 = stackTestDriver2.push((java.lang.Object) (-1.0f));
        java.lang.Object obj8 = stackTestDriver2.push((java.lang.Object) (short) 1);
        int int9 = stackTestDriver2.size();
        int int10 = stackTestDriver2.size();
        java.lang.Object obj11 = stackTestDriver2.pop();
        java.lang.Object obj12 = stackTestDriver0.push((java.lang.Object) stackTestDriver2);
        stackTestDriver2.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = stackTestDriver2.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1.0f) + "'", obj6, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (short) 1 + "'", obj8, (short) 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (short) 1 + "'", obj11, (short) 1);
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test265");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        int int2 = stackTestDriver0.size();
        boolean boolean3 = stackTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test266");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        boolean boolean6 = stackTestDriver4.isEmpty();
        stackTestDriver4.clear();
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        int int9 = stackTestDriver8.size();
        boolean boolean10 = stackTestDriver8.isEmpty();
        java.lang.Object obj12 = stackTestDriver8.push((java.lang.Object) (-1.0f));
        java.lang.Object obj13 = stackTestDriver4.push((java.lang.Object) stackTestDriver8);
        experiment.util.StackTestDriver stackTestDriver14 = new experiment.util.StackTestDriver();
        int int15 = stackTestDriver14.size();
        boolean boolean16 = stackTestDriver14.isEmpty();
        boolean boolean17 = stackTestDriver14.isEmpty();
        java.lang.Class<?> wildcardClass18 = stackTestDriver14.getClass();
        java.lang.Object obj19 = stackTestDriver4.push((java.lang.Object) stackTestDriver14);
        java.lang.Object obj20 = stackTestDriver4.pop();
        java.lang.Object obj21 = stackTestDriver0.push(obj20);
        boolean boolean22 = stackTestDriver0.isEmpty();
        java.lang.Object obj23 = stackTestDriver0.peek();
        int int24 = stackTestDriver0.size();
        java.lang.Object obj25 = stackTestDriver0.peek();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (-1.0f) + "'", obj12, (-1.0f));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(obj25);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test267");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        int int3 = stackTestDriver0.size();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        int int6 = stackTestDriver5.size();
        boolean boolean7 = stackTestDriver5.isEmpty();
        java.lang.Object obj9 = stackTestDriver5.push((java.lang.Object) (-1.0f));
        boolean boolean10 = stackTestDriver5.isEmpty();
        java.lang.Object obj11 = stackTestDriver5.peek();
        java.lang.Object obj12 = stackTestDriver5.pop();
        stackTestDriver5.clear();
        java.lang.Object obj14 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (-1.0f) + "'", obj9, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (-1.0f) + "'", obj11, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (-1.0f) + "'", obj12, (-1.0f));
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test268");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        int int4 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        boolean boolean6 = stackTestDriver5.isEmpty();
        experiment.util.StackTestDriver stackTestDriver7 = new experiment.util.StackTestDriver();
        int int8 = stackTestDriver7.size();
        boolean boolean9 = stackTestDriver7.isEmpty();
        java.lang.Object obj11 = stackTestDriver7.push((java.lang.Object) (-1.0f));
        java.lang.Object obj13 = stackTestDriver7.push((java.lang.Object) (short) 1);
        stackTestDriver7.clear();
        stackTestDriver7.clear();
        experiment.util.StackTestDriver stackTestDriver16 = new experiment.util.StackTestDriver();
        int int17 = stackTestDriver16.size();
        boolean boolean18 = stackTestDriver16.isEmpty();
        stackTestDriver16.clear();
        experiment.util.StackTestDriver stackTestDriver20 = new experiment.util.StackTestDriver();
        int int21 = stackTestDriver20.size();
        boolean boolean22 = stackTestDriver20.isEmpty();
        java.lang.Object obj24 = stackTestDriver20.push((java.lang.Object) (-1.0f));
        java.lang.Object obj25 = stackTestDriver16.push((java.lang.Object) stackTestDriver20);
        java.lang.Object obj26 = stackTestDriver16.peek();
        java.lang.Object obj27 = stackTestDriver16.peek();
        java.lang.Object obj28 = stackTestDriver7.push(obj27);
        java.lang.Object obj29 = stackTestDriver5.push(obj27);
        java.lang.Object obj30 = stackTestDriver0.push(obj27);
        java.lang.Object obj31 = stackTestDriver0.peek();
        java.lang.Class<?> wildcardClass32 = obj31.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (-1.0f) + "'", obj11, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (short) 1 + "'", obj13, (short) 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (-1.0f) + "'", obj24, (-1.0f));
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test269");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        boolean boolean3 = stackTestDriver0.isEmpty();
        boolean boolean4 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        int int6 = stackTestDriver0.size();
        stackTestDriver0.clear();
        int int8 = stackTestDriver0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test270");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (-1.0f));
        boolean boolean5 = stackTestDriver0.isEmpty();
        int int6 = stackTestDriver0.size();
        boolean boolean7 = stackTestDriver0.isEmpty();
        java.lang.Object obj8 = stackTestDriver0.peek();
        java.lang.Object obj9 = stackTestDriver0.peek();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1.0f) + "'", obj4, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0f) + "'", obj8, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (-1.0f) + "'", obj9, (-1.0f));
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test271");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver2 = new experiment.util.StackTestDriver();
        int int3 = stackTestDriver2.size();
        boolean boolean4 = stackTestDriver2.isEmpty();
        java.lang.Object obj6 = stackTestDriver2.push((java.lang.Object) (-1.0f));
        java.lang.Object obj8 = stackTestDriver2.push((java.lang.Object) (short) 1);
        int int9 = stackTestDriver2.size();
        int int10 = stackTestDriver2.size();
        java.lang.Object obj11 = stackTestDriver2.pop();
        java.lang.Object obj12 = stackTestDriver0.push((java.lang.Object) stackTestDriver2);
        java.lang.Object obj13 = stackTestDriver2.peek();
        java.lang.Object obj14 = stackTestDriver2.pop();
        stackTestDriver2.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = stackTestDriver2.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1.0f) + "'", obj6, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (short) 1 + "'", obj8, (short) 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (short) 1 + "'", obj11, (short) 1);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (-1.0f) + "'", obj13, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1.0f) + "'", obj14, (-1.0f));
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test272");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        boolean boolean6 = stackTestDriver4.isEmpty();
        stackTestDriver4.clear();
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        int int9 = stackTestDriver8.size();
        boolean boolean10 = stackTestDriver8.isEmpty();
        java.lang.Object obj12 = stackTestDriver8.push((java.lang.Object) (-1.0f));
        java.lang.Object obj13 = stackTestDriver4.push((java.lang.Object) stackTestDriver8);
        experiment.util.StackTestDriver stackTestDriver14 = new experiment.util.StackTestDriver();
        int int15 = stackTestDriver14.size();
        boolean boolean16 = stackTestDriver14.isEmpty();
        boolean boolean17 = stackTestDriver14.isEmpty();
        java.lang.Class<?> wildcardClass18 = stackTestDriver14.getClass();
        java.lang.Object obj19 = stackTestDriver4.push((java.lang.Object) stackTestDriver14);
        java.lang.Object obj20 = stackTestDriver4.pop();
        java.lang.Object obj21 = stackTestDriver0.push(obj20);
        boolean boolean22 = stackTestDriver0.isEmpty();
        java.lang.Object obj23 = stackTestDriver0.peek();
        int int24 = stackTestDriver0.size();
        java.lang.Class<?> wildcardClass25 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (-1.0f) + "'", obj12, (-1.0f));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test273");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver2 = new experiment.util.StackTestDriver();
        stackTestDriver2.clear();
        boolean boolean4 = stackTestDriver2.isEmpty();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) stackTestDriver2);
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) 2);
        boolean boolean8 = stackTestDriver0.isEmpty();
        java.lang.Object obj10 = stackTestDriver0.push((java.lang.Object) (short) -1);
        experiment.util.StackTestDriver stackTestDriver11 = new experiment.util.StackTestDriver();
        int int12 = stackTestDriver11.size();
        int int13 = stackTestDriver11.size();
        boolean boolean14 = stackTestDriver11.isEmpty();
        stackTestDriver11.clear();
        boolean boolean16 = stackTestDriver11.isEmpty();
        java.lang.Class<?> wildcardClass17 = stackTestDriver11.getClass();
        java.lang.Object obj18 = stackTestDriver0.push((java.lang.Object) stackTestDriver11);
        java.lang.Object obj19 = stackTestDriver0.pop();
        boolean boolean20 = stackTestDriver0.isEmpty();
        boolean boolean21 = stackTestDriver0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 2 + "'", obj7, 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (short) -1 + "'", obj10, (short) -1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test274");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        boolean boolean6 = stackTestDriver4.isEmpty();
        stackTestDriver4.clear();
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        int int9 = stackTestDriver8.size();
        boolean boolean10 = stackTestDriver8.isEmpty();
        java.lang.Object obj12 = stackTestDriver8.push((java.lang.Object) (-1.0f));
        java.lang.Object obj13 = stackTestDriver4.push((java.lang.Object) stackTestDriver8);
        experiment.util.StackTestDriver stackTestDriver14 = new experiment.util.StackTestDriver();
        int int15 = stackTestDriver14.size();
        boolean boolean16 = stackTestDriver14.isEmpty();
        boolean boolean17 = stackTestDriver14.isEmpty();
        java.lang.Class<?> wildcardClass18 = stackTestDriver14.getClass();
        java.lang.Object obj19 = stackTestDriver4.push((java.lang.Object) stackTestDriver14);
        java.lang.Object obj20 = stackTestDriver4.pop();
        java.lang.Object obj21 = stackTestDriver0.push(obj20);
        boolean boolean22 = stackTestDriver0.isEmpty();
        java.lang.Object obj23 = stackTestDriver0.peek();
        int int24 = stackTestDriver0.size();
        java.lang.Object obj25 = stackTestDriver0.pop();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (-1.0f) + "'", obj12, (-1.0f));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(obj25);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test275");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        boolean boolean6 = stackTestDriver4.isEmpty();
        java.lang.Object obj8 = stackTestDriver4.push((java.lang.Object) (-1.0f));
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        java.lang.Object obj10 = stackTestDriver4.pop();
        stackTestDriver4.clear();
        boolean boolean12 = stackTestDriver4.isEmpty();
        int int13 = stackTestDriver4.size();
        stackTestDriver4.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0f) + "'", obj8, (-1.0f));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (-1.0f) + "'", obj10, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test276");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) 10.0d);
        java.lang.Object obj5 = stackTestDriver0.pop();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 10.0d + "'", obj4, 10.0d);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 10.0d + "'", obj5, 10.0d);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test277");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver2 = new experiment.util.StackTestDriver();
        stackTestDriver2.clear();
        boolean boolean4 = stackTestDriver2.isEmpty();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) stackTestDriver2);
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) 2);
        boolean boolean8 = stackTestDriver0.isEmpty();
        java.lang.Object obj9 = stackTestDriver0.peek();
        java.lang.Class<?> wildcardClass10 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 2 + "'", obj7, 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 2 + "'", obj9, 2);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test278");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        int int4 = stackTestDriver0.size();
        stackTestDriver0.clear();
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
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test279");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        boolean boolean4 = stackTestDriver0.isEmpty();
        int int5 = stackTestDriver0.size();
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) 10.0d);
        java.lang.Object obj8 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver9 = new experiment.util.StackTestDriver();
        int int10 = stackTestDriver9.size();
        boolean boolean11 = stackTestDriver9.isEmpty();
        java.lang.Object obj13 = stackTestDriver9.push((java.lang.Object) (-1.0f));
        boolean boolean14 = stackTestDriver9.isEmpty();
        java.lang.Object obj15 = stackTestDriver9.peek();
        experiment.util.StackTestDriver stackTestDriver16 = new experiment.util.StackTestDriver();
        int int17 = stackTestDriver16.size();
        boolean boolean18 = stackTestDriver16.isEmpty();
        int int19 = stackTestDriver16.size();
        boolean boolean20 = stackTestDriver16.isEmpty();
        java.lang.Object obj21 = stackTestDriver9.push((java.lang.Object) stackTestDriver16);
        java.lang.Object obj22 = stackTestDriver9.pop();
        java.lang.Object obj23 = stackTestDriver0.push((java.lang.Object) stackTestDriver9);
        boolean boolean24 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver25 = new experiment.util.StackTestDriver();
        int int26 = stackTestDriver25.size();
        boolean boolean27 = stackTestDriver25.isEmpty();
        java.lang.Object obj29 = stackTestDriver25.push((java.lang.Object) 10.0d);
        stackTestDriver25.clear();
        boolean boolean31 = stackTestDriver25.isEmpty();
        experiment.util.StackTestDriver stackTestDriver32 = new experiment.util.StackTestDriver();
        int int33 = stackTestDriver32.size();
        boolean boolean34 = stackTestDriver32.isEmpty();
        stackTestDriver32.clear();
        experiment.util.StackTestDriver stackTestDriver36 = new experiment.util.StackTestDriver();
        int int37 = stackTestDriver36.size();
        boolean boolean38 = stackTestDriver36.isEmpty();
        java.lang.Object obj40 = stackTestDriver36.push((java.lang.Object) (-1.0f));
        java.lang.Object obj41 = stackTestDriver32.push((java.lang.Object) stackTestDriver36);
        experiment.util.StackTestDriver stackTestDriver42 = new experiment.util.StackTestDriver();
        int int43 = stackTestDriver42.size();
        boolean boolean44 = stackTestDriver42.isEmpty();
        boolean boolean45 = stackTestDriver42.isEmpty();
        java.lang.Class<?> wildcardClass46 = stackTestDriver42.getClass();
        java.lang.Object obj47 = stackTestDriver32.push((java.lang.Object) stackTestDriver42);
        java.lang.Object obj48 = stackTestDriver32.pop();
        java.lang.Object obj49 = stackTestDriver32.peek();
        int int50 = stackTestDriver32.size();
        java.lang.Object obj51 = stackTestDriver25.push((java.lang.Object) stackTestDriver32);
        java.lang.Object obj52 = stackTestDriver0.push(obj51);
        java.lang.Class<?> wildcardClass53 = obj51.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 10.0d + "'", obj7, 10.0d);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 10.0d + "'", obj8, 10.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (-1.0f) + "'", obj13, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (-1.0f) + "'", obj15, (-1.0f));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 10.0d + "'", obj29, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + (-1.0f) + "'", obj40, (-1.0f));
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertNotNull(obj51);
        org.junit.Assert.assertNotNull(obj52);
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test280");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (-1.0f));
        boolean boolean5 = stackTestDriver0.isEmpty();
        int int6 = stackTestDriver0.size();
        boolean boolean7 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        int int9 = stackTestDriver8.size();
        int int10 = stackTestDriver8.size();
        int int11 = stackTestDriver8.size();
        boolean boolean12 = stackTestDriver8.isEmpty();
        java.lang.Object obj13 = stackTestDriver0.push((java.lang.Object) boolean12);
        java.lang.Object obj15 = stackTestDriver0.push((java.lang.Object) 100L);
        experiment.util.StackTestDriver stackTestDriver16 = new experiment.util.StackTestDriver();
        int int17 = stackTestDriver16.size();
        boolean boolean18 = stackTestDriver16.isEmpty();
        java.lang.Object obj20 = stackTestDriver16.push((java.lang.Object) (-1.0f));
        java.lang.Object obj22 = stackTestDriver16.push((java.lang.Object) (short) 1);
        stackTestDriver16.clear();
        stackTestDriver16.clear();
        experiment.util.StackTestDriver stackTestDriver25 = new experiment.util.StackTestDriver();
        int int26 = stackTestDriver25.size();
        boolean boolean27 = stackTestDriver25.isEmpty();
        stackTestDriver25.clear();
        experiment.util.StackTestDriver stackTestDriver29 = new experiment.util.StackTestDriver();
        int int30 = stackTestDriver29.size();
        boolean boolean31 = stackTestDriver29.isEmpty();
        java.lang.Object obj33 = stackTestDriver29.push((java.lang.Object) (-1.0f));
        java.lang.Object obj34 = stackTestDriver25.push((java.lang.Object) stackTestDriver29);
        java.lang.Object obj35 = stackTestDriver25.peek();
        java.lang.Object obj36 = stackTestDriver25.peek();
        java.lang.Object obj37 = stackTestDriver16.push(obj36);
        stackTestDriver16.clear();
        java.lang.Object obj39 = stackTestDriver0.push((java.lang.Object) stackTestDriver16);
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj41 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1.0f) + "'", obj4, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + true + "'", obj13, true);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 100L + "'", obj15, 100L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (-1.0f) + "'", obj20, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (short) 1 + "'", obj22, (short) 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + (-1.0f) + "'", obj33, (-1.0f));
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertNotNull(obj39);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test281");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        boolean boolean6 = stackTestDriver4.isEmpty();
        java.lang.Object obj8 = stackTestDriver4.push((java.lang.Object) (-1.0f));
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        java.lang.Object obj10 = stackTestDriver4.pop();
        stackTestDriver4.clear();
        boolean boolean12 = stackTestDriver4.isEmpty();
        experiment.util.StackTestDriver stackTestDriver13 = new experiment.util.StackTestDriver();
        boolean boolean14 = stackTestDriver13.isEmpty();
        int int15 = stackTestDriver13.size();
        stackTestDriver13.clear();
        java.lang.Class<?> wildcardClass17 = stackTestDriver13.getClass();
        java.lang.Object obj18 = stackTestDriver4.push((java.lang.Object) stackTestDriver13);
        int int19 = stackTestDriver4.size();
        boolean boolean20 = stackTestDriver4.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0f) + "'", obj8, (-1.0f));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (-1.0f) + "'", obj10, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test282");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (-1.0f));
        java.lang.Object obj5 = stackTestDriver0.pop();
        boolean boolean6 = stackTestDriver0.isEmpty();
        java.lang.Class<?> wildcardClass7 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1.0f) + "'", obj4, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0f) + "'", obj5, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test283");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (-1.0f));
        boolean boolean5 = stackTestDriver0.isEmpty();
        java.lang.Object obj6 = stackTestDriver0.peek();
        experiment.util.StackTestDriver stackTestDriver7 = new experiment.util.StackTestDriver();
        int int8 = stackTestDriver7.size();
        boolean boolean9 = stackTestDriver7.isEmpty();
        int int10 = stackTestDriver7.size();
        boolean boolean11 = stackTestDriver7.isEmpty();
        java.lang.Object obj12 = stackTestDriver0.push((java.lang.Object) stackTestDriver7);
        java.lang.Object obj13 = stackTestDriver0.pop();
        java.lang.Object obj14 = stackTestDriver0.peek();
        java.lang.Object obj15 = stackTestDriver0.peek();
        boolean boolean16 = stackTestDriver0.isEmpty();
        java.lang.Object obj17 = stackTestDriver0.peek();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1.0f) + "'", obj4, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1.0f) + "'", obj6, (-1.0f));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1.0f) + "'", obj14, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (-1.0f) + "'", obj15, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (-1.0f) + "'", obj17, (-1.0f));
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test284");
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
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test285");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        int int4 = stackTestDriver0.size();
        java.lang.Class<?> wildcardClass5 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test286");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) (short) 1);
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver9 = new experiment.util.StackTestDriver();
        int int10 = stackTestDriver9.size();
        boolean boolean11 = stackTestDriver9.isEmpty();
        stackTestDriver9.clear();
        experiment.util.StackTestDriver stackTestDriver13 = new experiment.util.StackTestDriver();
        int int14 = stackTestDriver13.size();
        boolean boolean15 = stackTestDriver13.isEmpty();
        java.lang.Object obj17 = stackTestDriver13.push((java.lang.Object) (-1.0f));
        java.lang.Object obj18 = stackTestDriver9.push((java.lang.Object) stackTestDriver13);
        java.lang.Object obj19 = stackTestDriver9.peek();
        java.lang.Object obj20 = stackTestDriver9.peek();
        java.lang.Object obj21 = stackTestDriver0.push(obj20);
        stackTestDriver0.clear();
        int int23 = stackTestDriver0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1.0f) + "'", obj4, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 1 + "'", obj6, (short) 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (-1.0f) + "'", obj17, (-1.0f));
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test287");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        int int3 = stackTestDriver0.size();
        boolean boolean4 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        int int6 = stackTestDriver5.size();
        boolean boolean7 = stackTestDriver5.isEmpty();
        java.lang.Object obj9 = stackTestDriver5.push((java.lang.Object) (-1.0f));
        java.lang.Object obj11 = stackTestDriver5.push((java.lang.Object) (short) 1);
        stackTestDriver5.clear();
        int int13 = stackTestDriver5.size();
        int int14 = stackTestDriver5.size();
        java.lang.Object obj15 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        stackTestDriver0.clear();
        java.lang.Class<?> wildcardClass17 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (-1.0f) + "'", obj9, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (short) 1 + "'", obj11, (short) 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test288");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver2 = new experiment.util.StackTestDriver();
        stackTestDriver2.clear();
        boolean boolean4 = stackTestDriver2.isEmpty();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) stackTestDriver2);
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) 2);
        stackTestDriver0.clear();
        int int9 = stackTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 2 + "'", obj7, 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test289");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        boolean boolean6 = stackTestDriver4.isEmpty();
        java.lang.Object obj8 = stackTestDriver4.push((java.lang.Object) (-1.0f));
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        int int11 = stackTestDriver10.size();
        boolean boolean12 = stackTestDriver10.isEmpty();
        boolean boolean13 = stackTestDriver10.isEmpty();
        java.lang.Class<?> wildcardClass14 = stackTestDriver10.getClass();
        java.lang.Object obj15 = stackTestDriver0.push((java.lang.Object) stackTestDriver10);
        boolean boolean16 = stackTestDriver0.isEmpty();
        java.lang.Object obj17 = stackTestDriver0.peek();
        java.lang.Class<?> wildcardClass18 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0f) + "'", obj8, (-1.0f));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test290");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver2 = new experiment.util.StackTestDriver();
        int int3 = stackTestDriver2.size();
        int int4 = stackTestDriver2.size();
        int int5 = stackTestDriver2.size();
        boolean boolean6 = stackTestDriver2.isEmpty();
        int int7 = stackTestDriver2.size();
        java.lang.Object obj9 = stackTestDriver2.push((java.lang.Object) 10.0d);
        java.lang.Object obj10 = stackTestDriver2.pop();
        experiment.util.StackTestDriver stackTestDriver11 = new experiment.util.StackTestDriver();
        int int12 = stackTestDriver11.size();
        boolean boolean13 = stackTestDriver11.isEmpty();
        java.lang.Object obj15 = stackTestDriver11.push((java.lang.Object) (-1.0f));
        boolean boolean16 = stackTestDriver11.isEmpty();
        java.lang.Object obj17 = stackTestDriver11.peek();
        experiment.util.StackTestDriver stackTestDriver18 = new experiment.util.StackTestDriver();
        int int19 = stackTestDriver18.size();
        boolean boolean20 = stackTestDriver18.isEmpty();
        int int21 = stackTestDriver18.size();
        boolean boolean22 = stackTestDriver18.isEmpty();
        java.lang.Object obj23 = stackTestDriver11.push((java.lang.Object) stackTestDriver18);
        java.lang.Object obj24 = stackTestDriver11.pop();
        java.lang.Object obj25 = stackTestDriver2.push((java.lang.Object) stackTestDriver11);
        java.lang.Object obj26 = stackTestDriver0.push((java.lang.Object) stackTestDriver2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 10.0d + "'", obj9, 10.0d);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 10.0d + "'", obj10, 10.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (-1.0f) + "'", obj15, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (-1.0f) + "'", obj17, (-1.0f));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNotNull(obj26);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test291");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        boolean boolean4 = stackTestDriver0.isEmpty();
        int int5 = stackTestDriver0.size();
        boolean boolean6 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        boolean boolean8 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver9 = new experiment.util.StackTestDriver();
        boolean boolean10 = stackTestDriver9.isEmpty();
        int int11 = stackTestDriver9.size();
        stackTestDriver9.clear();
        int int13 = stackTestDriver9.size();
        int int14 = stackTestDriver9.size();
        java.lang.Object obj15 = stackTestDriver0.push((java.lang.Object) int14);
        boolean boolean16 = stackTestDriver0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 0 + "'", obj15, 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test292");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) (short) 1);
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        int int10 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver11 = new experiment.util.StackTestDriver();
        int int12 = stackTestDriver11.size();
        boolean boolean13 = stackTestDriver11.isEmpty();
        stackTestDriver11.clear();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        int int16 = stackTestDriver15.size();
        boolean boolean17 = stackTestDriver15.isEmpty();
        java.lang.Object obj19 = stackTestDriver15.push((java.lang.Object) (-1.0f));
        java.lang.Object obj20 = stackTestDriver11.push((java.lang.Object) stackTestDriver15);
        stackTestDriver11.clear();
        stackTestDriver11.clear();
        java.lang.Object obj23 = stackTestDriver0.push((java.lang.Object) stackTestDriver11);
        boolean boolean24 = stackTestDriver11.isEmpty();
        java.lang.Class<?> wildcardClass25 = stackTestDriver11.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1.0f) + "'", obj4, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 1 + "'", obj6, (short) 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (-1.0f) + "'", obj19, (-1.0f));
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test293");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) (short) 1);
        int int7 = stackTestDriver0.size();
        int int8 = stackTestDriver0.size();
        java.lang.Object obj9 = stackTestDriver0.pop();
        java.lang.Object obj10 = stackTestDriver0.peek();
        java.lang.Object obj12 = stackTestDriver0.push((java.lang.Object) "");
        java.lang.Object obj13 = stackTestDriver0.pop();
        java.lang.Object obj14 = stackTestDriver0.pop();
        boolean boolean15 = stackTestDriver0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1.0f) + "'", obj4, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 1 + "'", obj6, (short) 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (short) 1 + "'", obj9, (short) 1);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (-1.0f) + "'", obj10, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + "" + "'", obj12, "");
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + "" + "'", obj13, "");
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1.0f) + "'", obj14, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test294");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        int int2 = stackTestDriver0.size();
        stackTestDriver0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test295");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver2 = new experiment.util.StackTestDriver();
        int int3 = stackTestDriver2.size();
        boolean boolean4 = stackTestDriver2.isEmpty();
        java.lang.Object obj6 = stackTestDriver2.push((java.lang.Object) (-1.0f));
        java.lang.Object obj8 = stackTestDriver2.push((java.lang.Object) (short) 1);
        int int9 = stackTestDriver2.size();
        int int10 = stackTestDriver2.size();
        java.lang.Object obj11 = stackTestDriver2.pop();
        java.lang.Object obj12 = stackTestDriver0.push((java.lang.Object) stackTestDriver2);
        stackTestDriver2.clear();
        boolean boolean14 = stackTestDriver2.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1.0f) + "'", obj6, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (short) 1 + "'", obj8, (short) 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (short) 1 + "'", obj11, (short) 1);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test296");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        boolean boolean3 = stackTestDriver0.isEmpty();
        boolean boolean4 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        int int6 = stackTestDriver0.size();
        stackTestDriver0.clear();
        java.lang.Class<?> wildcardClass8 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test297");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver2 = new experiment.util.StackTestDriver();
        stackTestDriver2.clear();
        boolean boolean4 = stackTestDriver2.isEmpty();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) stackTestDriver2);
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) 2);
        boolean boolean8 = stackTestDriver0.isEmpty();
        java.lang.Object obj10 = stackTestDriver0.push((java.lang.Object) (short) -1);
        experiment.util.StackTestDriver stackTestDriver11 = new experiment.util.StackTestDriver();
        int int12 = stackTestDriver11.size();
        int int13 = stackTestDriver11.size();
        boolean boolean14 = stackTestDriver11.isEmpty();
        stackTestDriver11.clear();
        boolean boolean16 = stackTestDriver11.isEmpty();
        java.lang.Class<?> wildcardClass17 = stackTestDriver11.getClass();
        java.lang.Object obj18 = stackTestDriver0.push((java.lang.Object) stackTestDriver11);
        java.lang.Object obj19 = stackTestDriver0.peek();
        java.lang.Object obj20 = stackTestDriver0.peek();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 2 + "'", obj7, 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (short) -1 + "'", obj10, (short) -1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(obj20);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test298");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (-1.0f));
        boolean boolean5 = stackTestDriver0.isEmpty();
        int int6 = stackTestDriver0.size();
        boolean boolean7 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        int int9 = stackTestDriver8.size();
        int int10 = stackTestDriver8.size();
        int int11 = stackTestDriver8.size();
        boolean boolean12 = stackTestDriver8.isEmpty();
        java.lang.Object obj13 = stackTestDriver0.push((java.lang.Object) boolean12);
        java.lang.Object obj15 = stackTestDriver0.push((java.lang.Object) 100L);
        experiment.util.StackTestDriver stackTestDriver16 = new experiment.util.StackTestDriver();
        int int17 = stackTestDriver16.size();
        boolean boolean18 = stackTestDriver16.isEmpty();
        java.lang.Object obj20 = stackTestDriver16.push((java.lang.Object) (-1.0f));
        java.lang.Object obj22 = stackTestDriver16.push((java.lang.Object) (short) 1);
        stackTestDriver16.clear();
        stackTestDriver16.clear();
        experiment.util.StackTestDriver stackTestDriver25 = new experiment.util.StackTestDriver();
        int int26 = stackTestDriver25.size();
        boolean boolean27 = stackTestDriver25.isEmpty();
        stackTestDriver25.clear();
        experiment.util.StackTestDriver stackTestDriver29 = new experiment.util.StackTestDriver();
        int int30 = stackTestDriver29.size();
        boolean boolean31 = stackTestDriver29.isEmpty();
        java.lang.Object obj33 = stackTestDriver29.push((java.lang.Object) (-1.0f));
        java.lang.Object obj34 = stackTestDriver25.push((java.lang.Object) stackTestDriver29);
        java.lang.Object obj35 = stackTestDriver25.peek();
        java.lang.Object obj36 = stackTestDriver25.peek();
        java.lang.Object obj37 = stackTestDriver16.push(obj36);
        stackTestDriver16.clear();
        java.lang.Object obj39 = stackTestDriver0.push((java.lang.Object) stackTestDriver16);
        stackTestDriver0.clear();
        boolean boolean41 = stackTestDriver0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1.0f) + "'", obj4, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + true + "'", obj13, true);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 100L + "'", obj15, 100L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (-1.0f) + "'", obj20, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (short) 1 + "'", obj22, (short) 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + (-1.0f) + "'", obj33, (-1.0f));
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test299");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        boolean boolean3 = stackTestDriver0.isEmpty();
        boolean boolean4 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        int int6 = stackTestDriver0.size();
        int int7 = stackTestDriver0.size();
        java.lang.Class<?> wildcardClass8 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test300");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        int int3 = stackTestDriver0.size();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        int int6 = stackTestDriver5.size();
        boolean boolean7 = stackTestDriver5.isEmpty();
        java.lang.Object obj9 = stackTestDriver5.push((java.lang.Object) (-1.0f));
        boolean boolean10 = stackTestDriver5.isEmpty();
        java.lang.Object obj11 = stackTestDriver5.peek();
        java.lang.Object obj12 = stackTestDriver5.pop();
        stackTestDriver5.clear();
        java.lang.Object obj14 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        int int15 = stackTestDriver5.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = stackTestDriver5.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (-1.0f) + "'", obj9, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (-1.0f) + "'", obj11, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (-1.0f) + "'", obj12, (-1.0f));
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test301");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (-1.0f));
        boolean boolean5 = stackTestDriver0.isEmpty();
        java.lang.Object obj6 = stackTestDriver0.peek();
        experiment.util.StackTestDriver stackTestDriver7 = new experiment.util.StackTestDriver();
        int int8 = stackTestDriver7.size();
        boolean boolean9 = stackTestDriver7.isEmpty();
        java.lang.Object obj11 = stackTestDriver7.push((java.lang.Object) (-1.0f));
        boolean boolean12 = stackTestDriver7.isEmpty();
        boolean boolean13 = stackTestDriver7.isEmpty();
        java.lang.Object obj14 = stackTestDriver0.push((java.lang.Object) stackTestDriver7);
        int int15 = stackTestDriver0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1.0f) + "'", obj4, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1.0f) + "'", obj6, (-1.0f));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (-1.0f) + "'", obj11, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test302");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver2 = new experiment.util.StackTestDriver();
        int int3 = stackTestDriver2.size();
        boolean boolean4 = stackTestDriver2.isEmpty();
        java.lang.Object obj6 = stackTestDriver2.push((java.lang.Object) (-1.0f));
        java.lang.Object obj8 = stackTestDriver2.push((java.lang.Object) (short) 1);
        int int9 = stackTestDriver2.size();
        int int10 = stackTestDriver2.size();
        java.lang.Object obj11 = stackTestDriver2.pop();
        java.lang.Object obj12 = stackTestDriver0.push((java.lang.Object) stackTestDriver2);
        experiment.util.StackTestDriver stackTestDriver13 = new experiment.util.StackTestDriver();
        int int14 = stackTestDriver13.size();
        boolean boolean15 = stackTestDriver13.isEmpty();
        java.lang.Class<?> wildcardClass16 = stackTestDriver13.getClass();
        java.lang.Object obj17 = stackTestDriver0.push((java.lang.Object) stackTestDriver13);
        boolean boolean18 = stackTestDriver13.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1.0f) + "'", obj6, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (short) 1 + "'", obj8, (short) 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (short) 1 + "'", obj11, (short) 1);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test303");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        boolean boolean6 = stackTestDriver4.isEmpty();
        java.lang.Object obj8 = stackTestDriver4.push((java.lang.Object) (-1.0f));
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        int int10 = stackTestDriver0.size();
        java.lang.Object obj11 = stackTestDriver0.peek();
        int int12 = stackTestDriver0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0f) + "'", obj8, (-1.0f));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test304");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) (short) 1);
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        int int10 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver11 = new experiment.util.StackTestDriver();
        int int12 = stackTestDriver11.size();
        boolean boolean13 = stackTestDriver11.isEmpty();
        stackTestDriver11.clear();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        int int16 = stackTestDriver15.size();
        boolean boolean17 = stackTestDriver15.isEmpty();
        java.lang.Object obj19 = stackTestDriver15.push((java.lang.Object) (-1.0f));
        java.lang.Object obj20 = stackTestDriver11.push((java.lang.Object) stackTestDriver15);
        stackTestDriver11.clear();
        stackTestDriver11.clear();
        java.lang.Object obj23 = stackTestDriver0.push((java.lang.Object) stackTestDriver11);
        boolean boolean24 = stackTestDriver11.isEmpty();
        int int25 = stackTestDriver11.size();
        java.lang.Class<?> wildcardClass26 = stackTestDriver11.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1.0f) + "'", obj4, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 1 + "'", obj6, (short) 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (-1.0f) + "'", obj19, (-1.0f));
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test305");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) (short) 1);
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver9 = new experiment.util.StackTestDriver();
        int int10 = stackTestDriver9.size();
        boolean boolean11 = stackTestDriver9.isEmpty();
        stackTestDriver9.clear();
        experiment.util.StackTestDriver stackTestDriver13 = new experiment.util.StackTestDriver();
        int int14 = stackTestDriver13.size();
        boolean boolean15 = stackTestDriver13.isEmpty();
        java.lang.Object obj17 = stackTestDriver13.push((java.lang.Object) (-1.0f));
        java.lang.Object obj18 = stackTestDriver9.push((java.lang.Object) stackTestDriver13);
        java.lang.Object obj19 = stackTestDriver9.peek();
        java.lang.Object obj20 = stackTestDriver9.peek();
        java.lang.Object obj21 = stackTestDriver0.push(obj20);
        boolean boolean22 = stackTestDriver0.isEmpty();
        boolean boolean23 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver24 = new experiment.util.StackTestDriver();
        int int25 = stackTestDriver24.size();
        boolean boolean26 = stackTestDriver24.isEmpty();
        java.lang.Object obj28 = stackTestDriver24.push((java.lang.Object) (-1.0f));
        java.lang.Object obj30 = stackTestDriver24.push((java.lang.Object) (short) 1);
        int int31 = stackTestDriver24.size();
        java.lang.Object obj32 = stackTestDriver24.peek();
        java.lang.Object obj33 = stackTestDriver24.peek();
        java.lang.Object obj34 = stackTestDriver0.push((java.lang.Object) stackTestDriver24);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1.0f) + "'", obj4, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 1 + "'", obj6, (short) 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (-1.0f) + "'", obj17, (-1.0f));
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + (-1.0f) + "'", obj28, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + (short) 1 + "'", obj30, (short) 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2 + "'", int31 == 2);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + (short) 1 + "'", obj32, (short) 1);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + (short) 1 + "'", obj33, (short) 1);
        org.junit.Assert.assertNotNull(obj34);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test306");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        int int4 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        int int6 = stackTestDriver5.size();
        int int7 = stackTestDriver5.size();
        int int8 = stackTestDriver5.size();
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) int8);
        java.lang.Object obj10 = stackTestDriver0.pop();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0 + "'", obj9, 0);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 0 + "'", obj10, 0);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test307");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) (short) 1);
        int int7 = stackTestDriver0.size();
        int int8 = stackTestDriver0.size();
        java.lang.Object obj9 = stackTestDriver0.pop();
        java.lang.Object obj10 = stackTestDriver0.peek();
        java.lang.Object obj12 = stackTestDriver0.push((java.lang.Object) "");
        java.lang.Object obj13 = stackTestDriver0.pop();
        java.lang.Object obj14 = stackTestDriver0.peek();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        int int16 = stackTestDriver15.size();
        stackTestDriver15.clear();
        experiment.util.StackTestDriver stackTestDriver18 = new experiment.util.StackTestDriver();
        int int19 = stackTestDriver18.size();
        boolean boolean20 = stackTestDriver18.isEmpty();
        stackTestDriver18.clear();
        experiment.util.StackTestDriver stackTestDriver22 = new experiment.util.StackTestDriver();
        int int23 = stackTestDriver22.size();
        boolean boolean24 = stackTestDriver22.isEmpty();
        java.lang.Object obj26 = stackTestDriver22.push((java.lang.Object) (-1.0f));
        java.lang.Object obj27 = stackTestDriver18.push((java.lang.Object) stackTestDriver22);
        java.lang.Object obj28 = stackTestDriver18.peek();
        java.lang.Object obj29 = stackTestDriver18.peek();
        java.lang.Object obj30 = stackTestDriver15.push(obj29);
        int int31 = stackTestDriver15.size();
        java.lang.Object obj32 = stackTestDriver15.peek();
        java.lang.Object obj33 = stackTestDriver15.pop();
        java.lang.Object obj34 = stackTestDriver0.push(obj33);
        int int35 = stackTestDriver0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1.0f) + "'", obj4, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 1 + "'", obj6, (short) 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (short) 1 + "'", obj9, (short) 1);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (-1.0f) + "'", obj10, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + "" + "'", obj12, "");
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + "" + "'", obj13, "");
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1.0f) + "'", obj14, (-1.0f));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + (-1.0f) + "'", obj26, (-1.0f));
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2 + "'", int35 == 2);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test308");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) 10.0d);
        stackTestDriver0.clear();
        boolean boolean6 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver7 = new experiment.util.StackTestDriver();
        int int8 = stackTestDriver7.size();
        boolean boolean9 = stackTestDriver7.isEmpty();
        stackTestDriver7.clear();
        experiment.util.StackTestDriver stackTestDriver11 = new experiment.util.StackTestDriver();
        int int12 = stackTestDriver11.size();
        boolean boolean13 = stackTestDriver11.isEmpty();
        java.lang.Object obj15 = stackTestDriver11.push((java.lang.Object) (-1.0f));
        java.lang.Object obj16 = stackTestDriver7.push((java.lang.Object) stackTestDriver11);
        experiment.util.StackTestDriver stackTestDriver17 = new experiment.util.StackTestDriver();
        int int18 = stackTestDriver17.size();
        boolean boolean19 = stackTestDriver17.isEmpty();
        boolean boolean20 = stackTestDriver17.isEmpty();
        java.lang.Class<?> wildcardClass21 = stackTestDriver17.getClass();
        java.lang.Object obj22 = stackTestDriver7.push((java.lang.Object) stackTestDriver17);
        java.lang.Object obj23 = stackTestDriver7.pop();
        java.lang.Object obj24 = stackTestDriver7.peek();
        int int25 = stackTestDriver7.size();
        java.lang.Object obj26 = stackTestDriver0.push((java.lang.Object) stackTestDriver7);
        java.lang.Class<?> wildcardClass27 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 10.0d + "'", obj4, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (-1.0f) + "'", obj15, (-1.0f));
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test309");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        int int4 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        int int6 = stackTestDriver5.size();
        int int7 = stackTestDriver5.size();
        int int8 = stackTestDriver5.size();
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) int8);
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        stackTestDriver10.clear();
        experiment.util.StackTestDriver stackTestDriver12 = new experiment.util.StackTestDriver();
        int int13 = stackTestDriver12.size();
        boolean boolean14 = stackTestDriver12.isEmpty();
        java.lang.Object obj16 = stackTestDriver12.push((java.lang.Object) (-1.0f));
        java.lang.Object obj18 = stackTestDriver12.push((java.lang.Object) (short) 1);
        int int19 = stackTestDriver12.size();
        int int20 = stackTestDriver12.size();
        java.lang.Object obj21 = stackTestDriver12.pop();
        java.lang.Object obj22 = stackTestDriver10.push((java.lang.Object) stackTestDriver12);
        java.lang.Object obj23 = stackTestDriver12.peek();
        java.lang.Object obj24 = stackTestDriver0.push(obj23);
        java.lang.Class<?> wildcardClass25 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0 + "'", obj9, 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (-1.0f) + "'", obj16, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (short) 1 + "'", obj18, (short) 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (short) 1 + "'", obj21, (short) 1);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (-1.0f) + "'", obj23, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (-1.0f) + "'", obj24, (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test310");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        boolean boolean6 = stackTestDriver4.isEmpty();
        java.lang.Object obj8 = stackTestDriver4.push((java.lang.Object) (-1.0f));
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        boolean boolean10 = stackTestDriver0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0f) + "'", obj8, (-1.0f));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test311");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) (short) 1);
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        int int10 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver11 = new experiment.util.StackTestDriver();
        int int12 = stackTestDriver11.size();
        boolean boolean13 = stackTestDriver11.isEmpty();
        stackTestDriver11.clear();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        int int16 = stackTestDriver15.size();
        boolean boolean17 = stackTestDriver15.isEmpty();
        java.lang.Object obj19 = stackTestDriver15.push((java.lang.Object) (-1.0f));
        java.lang.Object obj20 = stackTestDriver11.push((java.lang.Object) stackTestDriver15);
        stackTestDriver11.clear();
        stackTestDriver11.clear();
        java.lang.Object obj23 = stackTestDriver0.push((java.lang.Object) stackTestDriver11);
        stackTestDriver11.clear();
        boolean boolean25 = stackTestDriver11.isEmpty();
        stackTestDriver11.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1.0f) + "'", obj4, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 1 + "'", obj6, (short) 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (-1.0f) + "'", obj19, (-1.0f));
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test312");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        int int3 = stackTestDriver0.size();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        int int6 = stackTestDriver5.size();
        boolean boolean7 = stackTestDriver5.isEmpty();
        java.lang.Object obj9 = stackTestDriver5.push((java.lang.Object) (-1.0f));
        boolean boolean10 = stackTestDriver5.isEmpty();
        java.lang.Object obj11 = stackTestDriver5.peek();
        java.lang.Object obj12 = stackTestDriver5.pop();
        stackTestDriver5.clear();
        java.lang.Object obj14 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        int int15 = stackTestDriver5.size();
        java.lang.Class<?> wildcardClass16 = stackTestDriver5.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (-1.0f) + "'", obj9, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (-1.0f) + "'", obj11, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (-1.0f) + "'", obj12, (-1.0f));
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test313");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        int int3 = stackTestDriver0.size();
        int int4 = stackTestDriver0.size();
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) (-1.0f));
        experiment.util.StackTestDriver stackTestDriver7 = new experiment.util.StackTestDriver();
        int int8 = stackTestDriver7.size();
        boolean boolean9 = stackTestDriver7.isEmpty();
        java.lang.Object obj11 = stackTestDriver7.push((java.lang.Object) (-1.0f));
        java.lang.Object obj13 = stackTestDriver7.push((java.lang.Object) (short) 1);
        int int14 = stackTestDriver7.size();
        int int15 = stackTestDriver7.size();
        java.lang.Object obj16 = stackTestDriver7.pop();
        int int17 = stackTestDriver7.size();
        experiment.util.StackTestDriver stackTestDriver18 = new experiment.util.StackTestDriver();
        int int19 = stackTestDriver18.size();
        boolean boolean20 = stackTestDriver18.isEmpty();
        java.lang.Object obj22 = stackTestDriver18.push((java.lang.Object) (-1.0f));
        java.lang.Object obj24 = stackTestDriver18.push((java.lang.Object) (short) 1);
        stackTestDriver18.clear();
        stackTestDriver18.clear();
        stackTestDriver18.clear();
        java.lang.Object obj28 = stackTestDriver7.push((java.lang.Object) stackTestDriver18);
        java.lang.Object obj29 = stackTestDriver0.push(obj28);
        stackTestDriver0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1.0f) + "'", obj6, (-1.0f));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (-1.0f) + "'", obj11, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (short) 1 + "'", obj13, (short) 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (short) 1 + "'", obj16, (short) 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (-1.0f) + "'", obj22, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (short) 1 + "'", obj24, (short) 1);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertNotNull(obj29);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test314");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        int int4 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean6 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        boolean boolean8 = stackTestDriver0.isEmpty();
        java.lang.Object obj10 = stackTestDriver0.push((java.lang.Object) ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + ' ' + "'", obj10, ' ');
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test315");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) (short) 1);
        int int7 = stackTestDriver0.size();
        java.lang.Object obj8 = stackTestDriver0.peek();
        java.lang.Object obj9 = stackTestDriver0.peek();
        int int10 = stackTestDriver0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1.0f) + "'", obj4, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 1 + "'", obj6, (short) 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (short) 1 + "'", obj8, (short) 1);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (short) 1 + "'", obj9, (short) 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test316");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (-1.0f));
        boolean boolean5 = stackTestDriver0.isEmpty();
        int int6 = stackTestDriver0.size();
        boolean boolean7 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        int int9 = stackTestDriver8.size();
        int int10 = stackTestDriver8.size();
        int int11 = stackTestDriver8.size();
        boolean boolean12 = stackTestDriver8.isEmpty();
        java.lang.Object obj13 = stackTestDriver0.push((java.lang.Object) boolean12);
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        java.lang.Object obj17 = stackTestDriver0.push((java.lang.Object) (short) -1);
        experiment.util.StackTestDriver stackTestDriver18 = new experiment.util.StackTestDriver();
        boolean boolean19 = stackTestDriver18.isEmpty();
        experiment.util.StackTestDriver stackTestDriver20 = new experiment.util.StackTestDriver();
        stackTestDriver20.clear();
        boolean boolean22 = stackTestDriver20.isEmpty();
        java.lang.Object obj23 = stackTestDriver18.push((java.lang.Object) stackTestDriver20);
        int int24 = stackTestDriver20.size();
        experiment.util.StackTestDriver stackTestDriver25 = new experiment.util.StackTestDriver();
        int int26 = stackTestDriver25.size();
        int int27 = stackTestDriver25.size();
        int int28 = stackTestDriver25.size();
        experiment.util.StackTestDriver stackTestDriver29 = new experiment.util.StackTestDriver();
        int int30 = stackTestDriver29.size();
        boolean boolean31 = stackTestDriver29.isEmpty();
        stackTestDriver29.clear();
        experiment.util.StackTestDriver stackTestDriver33 = new experiment.util.StackTestDriver();
        int int34 = stackTestDriver33.size();
        boolean boolean35 = stackTestDriver33.isEmpty();
        java.lang.Object obj37 = stackTestDriver33.push((java.lang.Object) (-1.0f));
        java.lang.Object obj38 = stackTestDriver29.push((java.lang.Object) stackTestDriver33);
        experiment.util.StackTestDriver stackTestDriver39 = new experiment.util.StackTestDriver();
        int int40 = stackTestDriver39.size();
        boolean boolean41 = stackTestDriver39.isEmpty();
        boolean boolean42 = stackTestDriver39.isEmpty();
        java.lang.Class<?> wildcardClass43 = stackTestDriver39.getClass();
        java.lang.Object obj44 = stackTestDriver29.push((java.lang.Object) stackTestDriver39);
        java.lang.Object obj45 = stackTestDriver29.pop();
        java.lang.Object obj46 = stackTestDriver25.push(obj45);
        boolean boolean47 = stackTestDriver25.isEmpty();
        java.lang.Object obj48 = stackTestDriver20.push((java.lang.Object) stackTestDriver25);
        boolean boolean49 = stackTestDriver20.isEmpty();
        java.lang.Object obj50 = stackTestDriver20.peek();
        java.lang.Object obj51 = stackTestDriver0.push((java.lang.Object) stackTestDriver20);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1.0f) + "'", obj4, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + true + "'", obj13, true);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (short) -1 + "'", obj17, (short) -1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + (-1.0f) + "'", obj37, (-1.0f));
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(obj50);
        org.junit.Assert.assertNotNull(obj51);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test317");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        boolean boolean6 = stackTestDriver4.isEmpty();
        java.lang.Object obj8 = stackTestDriver4.push((java.lang.Object) (-1.0f));
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        java.lang.Object obj10 = stackTestDriver4.pop();
        boolean boolean11 = stackTestDriver4.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = stackTestDriver4.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0f) + "'", obj8, (-1.0f));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (-1.0f) + "'", obj10, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test318");
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
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test319");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        boolean boolean6 = stackTestDriver4.isEmpty();
        java.lang.Object obj8 = stackTestDriver4.push((java.lang.Object) (-1.0f));
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        int int11 = stackTestDriver10.size();
        boolean boolean12 = stackTestDriver10.isEmpty();
        boolean boolean13 = stackTestDriver10.isEmpty();
        java.lang.Class<?> wildcardClass14 = stackTestDriver10.getClass();
        java.lang.Object obj15 = stackTestDriver0.push((java.lang.Object) stackTestDriver10);
        java.lang.Object obj16 = stackTestDriver0.pop();
        java.lang.Object obj17 = stackTestDriver0.pop();
        int int18 = stackTestDriver0.size();
        boolean boolean19 = stackTestDriver0.isEmpty();
        int int20 = stackTestDriver0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0f) + "'", obj8, (-1.0f));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test320");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        boolean boolean6 = stackTestDriver4.isEmpty();
        java.lang.Object obj8 = stackTestDriver4.push((java.lang.Object) (-1.0f));
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver12 = new experiment.util.StackTestDriver();
        int int13 = stackTestDriver12.size();
        int int14 = stackTestDriver12.size();
        boolean boolean15 = stackTestDriver12.isEmpty();
        boolean boolean16 = stackTestDriver12.isEmpty();
        java.lang.Object obj17 = stackTestDriver0.push((java.lang.Object) stackTestDriver12);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0f) + "'", obj8, (-1.0f));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(obj17);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test321");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        boolean boolean4 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        int int6 = stackTestDriver0.size();
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test322");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        int int6 = stackTestDriver4.size();
        int int7 = stackTestDriver4.size();
        boolean boolean8 = stackTestDriver4.isEmpty();
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) boolean8);
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        int int11 = stackTestDriver10.size();
        boolean boolean12 = stackTestDriver10.isEmpty();
        stackTestDriver10.clear();
        experiment.util.StackTestDriver stackTestDriver14 = new experiment.util.StackTestDriver();
        int int15 = stackTestDriver14.size();
        boolean boolean16 = stackTestDriver14.isEmpty();
        java.lang.Object obj18 = stackTestDriver14.push((java.lang.Object) (-1.0f));
        java.lang.Object obj19 = stackTestDriver10.push((java.lang.Object) stackTestDriver14);
        java.lang.Object obj20 = stackTestDriver0.push(obj19);
        experiment.util.StackTestDriver stackTestDriver21 = new experiment.util.StackTestDriver();
        int int22 = stackTestDriver21.size();
        int int23 = stackTestDriver21.size();
        boolean boolean24 = stackTestDriver21.isEmpty();
        experiment.util.StackTestDriver stackTestDriver25 = new experiment.util.StackTestDriver();
        boolean boolean26 = stackTestDriver25.isEmpty();
        stackTestDriver25.clear();
        java.lang.Object obj28 = stackTestDriver21.push((java.lang.Object) stackTestDriver25);
        java.lang.Object obj29 = stackTestDriver0.push(obj28);
        boolean boolean30 = stackTestDriver0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + true + "'", obj9, true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (-1.0f) + "'", obj18, (-1.0f));
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test323");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        boolean boolean4 = stackTestDriver0.isEmpty();
        int int5 = stackTestDriver0.size();
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) 10.0d);
        java.lang.Object obj8 = stackTestDriver0.pop();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 10.0d + "'", obj7, 10.0d);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 10.0d + "'", obj8, 10.0d);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test324");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        int int3 = stackTestDriver0.size();
        int int4 = stackTestDriver0.size();
        stackTestDriver0.clear();
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + true + "'", obj7, true);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test325");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (-1.0f));
        boolean boolean5 = stackTestDriver0.isEmpty();
        java.lang.Object obj6 = stackTestDriver0.peek();
        experiment.util.StackTestDriver stackTestDriver7 = new experiment.util.StackTestDriver();
        int int8 = stackTestDriver7.size();
        boolean boolean9 = stackTestDriver7.isEmpty();
        int int10 = stackTestDriver7.size();
        boolean boolean11 = stackTestDriver7.isEmpty();
        java.lang.Object obj12 = stackTestDriver0.push((java.lang.Object) stackTestDriver7);
        boolean boolean13 = stackTestDriver0.isEmpty();
        java.lang.Object obj14 = stackTestDriver0.pop();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1.0f) + "'", obj4, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1.0f) + "'", obj6, (-1.0f));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test326");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        boolean boolean6 = stackTestDriver4.isEmpty();
        java.lang.Object obj8 = stackTestDriver4.push((java.lang.Object) (-1.0f));
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        java.lang.Object obj10 = stackTestDriver4.pop();
        stackTestDriver4.clear();
        boolean boolean12 = stackTestDriver4.isEmpty();
        int int13 = stackTestDriver4.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = stackTestDriver4.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0f) + "'", obj8, (-1.0f));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (-1.0f) + "'", obj10, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test327");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (-1.0f));
        boolean boolean5 = stackTestDriver0.isEmpty();
        boolean boolean6 = stackTestDriver0.isEmpty();
        int int7 = stackTestDriver0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1.0f) + "'", obj4, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test328");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (-1.0f));
        boolean boolean5 = stackTestDriver0.isEmpty();
        java.lang.Object obj6 = stackTestDriver0.peek();
        experiment.util.StackTestDriver stackTestDriver7 = new experiment.util.StackTestDriver();
        int int8 = stackTestDriver7.size();
        boolean boolean9 = stackTestDriver7.isEmpty();
        int int10 = stackTestDriver7.size();
        boolean boolean11 = stackTestDriver7.isEmpty();
        java.lang.Object obj12 = stackTestDriver0.push((java.lang.Object) stackTestDriver7);
        java.lang.Object obj13 = stackTestDriver0.pop();
        java.lang.Object obj14 = stackTestDriver0.peek();
        java.lang.Object obj15 = stackTestDriver0.peek();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver17 = new experiment.util.StackTestDriver();
        int int18 = stackTestDriver17.size();
        int int19 = stackTestDriver17.size();
        int int20 = stackTestDriver17.size();
        int int21 = stackTestDriver17.size();
        stackTestDriver17.clear();
        java.lang.Object obj23 = stackTestDriver0.push((java.lang.Object) stackTestDriver17);
        int int24 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver25 = new experiment.util.StackTestDriver();
        boolean boolean26 = stackTestDriver25.isEmpty();
        experiment.util.StackTestDriver stackTestDriver27 = new experiment.util.StackTestDriver();
        stackTestDriver27.clear();
        boolean boolean29 = stackTestDriver27.isEmpty();
        java.lang.Object obj30 = stackTestDriver25.push((java.lang.Object) stackTestDriver27);
        java.lang.Object obj32 = stackTestDriver25.push((java.lang.Object) 2);
        boolean boolean33 = stackTestDriver25.isEmpty();
        java.lang.Object obj34 = stackTestDriver25.peek();
        int int35 = stackTestDriver25.size();
        java.lang.Object obj36 = stackTestDriver0.push((java.lang.Object) stackTestDriver25);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1.0f) + "'", obj4, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1.0f) + "'", obj6, (-1.0f));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1.0f) + "'", obj14, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (-1.0f) + "'", obj15, (-1.0f));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 2 + "'", obj32, 2);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + 2 + "'", obj34, 2);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2 + "'", int35 == 2);
        org.junit.Assert.assertNotNull(obj36);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test329");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        boolean boolean4 = stackTestDriver0.isEmpty();
        int int5 = stackTestDriver0.size();
        boolean boolean6 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        boolean boolean8 = stackTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test330");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        int int4 = stackTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test331");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        boolean boolean3 = stackTestDriver0.isEmpty();
        boolean boolean4 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        int int6 = stackTestDriver0.size();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        boolean boolean9 = stackTestDriver0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test332");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        boolean boolean6 = stackTestDriver4.isEmpty();
        java.lang.Object obj8 = stackTestDriver4.push((java.lang.Object) (-1.0f));
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        stackTestDriver0.clear();
        int int11 = stackTestDriver0.size();
        int int12 = stackTestDriver0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0f) + "'", obj8, (-1.0f));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test333");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        int int6 = stackTestDriver4.size();
        int int7 = stackTestDriver4.size();
        boolean boolean8 = stackTestDriver4.isEmpty();
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) boolean8);
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        int int11 = stackTestDriver10.size();
        boolean boolean12 = stackTestDriver10.isEmpty();
        stackTestDriver10.clear();
        int int14 = stackTestDriver10.size();
        java.lang.Object obj15 = stackTestDriver0.push((java.lang.Object) stackTestDriver10);
        java.lang.Object obj16 = stackTestDriver0.peek();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver18 = new experiment.util.StackTestDriver();
        boolean boolean19 = stackTestDriver18.isEmpty();
        stackTestDriver18.clear();
        int int21 = stackTestDriver18.size();
        int int22 = stackTestDriver18.size();
        java.lang.Object obj23 = stackTestDriver0.push((java.lang.Object) int22);
        stackTestDriver0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + true + "'", obj9, true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 0 + "'", obj23, 0);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test334");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        boolean boolean6 = stackTestDriver4.isEmpty();
        java.lang.Object obj8 = stackTestDriver4.push((java.lang.Object) (-1.0f));
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        int int11 = stackTestDriver10.size();
        boolean boolean12 = stackTestDriver10.isEmpty();
        boolean boolean13 = stackTestDriver10.isEmpty();
        java.lang.Class<?> wildcardClass14 = stackTestDriver10.getClass();
        java.lang.Object obj15 = stackTestDriver0.push((java.lang.Object) stackTestDriver10);
        java.lang.Object obj16 = stackTestDriver0.pop();
        java.lang.Object obj17 = stackTestDriver0.pop();
        boolean boolean18 = stackTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0f) + "'", obj8, (-1.0f));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test335");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (-1.0f));
        boolean boolean5 = stackTestDriver0.isEmpty();
        java.lang.Object obj6 = stackTestDriver0.peek();
        experiment.util.StackTestDriver stackTestDriver7 = new experiment.util.StackTestDriver();
        int int8 = stackTestDriver7.size();
        boolean boolean9 = stackTestDriver7.isEmpty();
        int int10 = stackTestDriver7.size();
        boolean boolean11 = stackTestDriver7.isEmpty();
        java.lang.Object obj12 = stackTestDriver0.push((java.lang.Object) stackTestDriver7);
        java.lang.Object obj13 = stackTestDriver0.pop();
        java.lang.Object obj14 = stackTestDriver0.peek();
        java.lang.Object obj15 = stackTestDriver0.peek();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver17 = new experiment.util.StackTestDriver();
        int int18 = stackTestDriver17.size();
        int int19 = stackTestDriver17.size();
        int int20 = stackTestDriver17.size();
        int int21 = stackTestDriver17.size();
        stackTestDriver17.clear();
        java.lang.Object obj23 = stackTestDriver0.push((java.lang.Object) stackTestDriver17);
        java.lang.Class<?> wildcardClass24 = stackTestDriver17.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1.0f) + "'", obj4, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1.0f) + "'", obj6, (-1.0f));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1.0f) + "'", obj14, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (-1.0f) + "'", obj15, (-1.0f));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test336");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) (short) 1);
        int int7 = stackTestDriver0.size();
        int int8 = stackTestDriver0.size();
        java.lang.Object obj9 = stackTestDriver0.pop();
        java.lang.Object obj10 = stackTestDriver0.peek();
        java.lang.Object obj12 = stackTestDriver0.push((java.lang.Object) "");
        java.lang.Object obj13 = stackTestDriver0.pop();
        java.lang.Object obj14 = stackTestDriver0.pop();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1.0f) + "'", obj4, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 1 + "'", obj6, (short) 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (short) 1 + "'", obj9, (short) 1);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (-1.0f) + "'", obj10, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + "" + "'", obj12, "");
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + "" + "'", obj13, "");
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1.0f) + "'", obj14, (-1.0f));
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test337");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        int int3 = stackTestDriver0.size();
        stackTestDriver0.clear();
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
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test338");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (-1.0f));
        boolean boolean5 = stackTestDriver0.isEmpty();
        int int6 = stackTestDriver0.size();
        java.lang.Object obj7 = stackTestDriver0.peek();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1.0f) + "'", obj4, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0f) + "'", obj7, (-1.0f));
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test339");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        boolean boolean6 = stackTestDriver4.isEmpty();
        java.lang.Object obj8 = stackTestDriver4.push((java.lang.Object) (-1.0f));
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        int int11 = stackTestDriver10.size();
        boolean boolean12 = stackTestDriver10.isEmpty();
        boolean boolean13 = stackTestDriver10.isEmpty();
        java.lang.Class<?> wildcardClass14 = stackTestDriver10.getClass();
        java.lang.Object obj15 = stackTestDriver0.push((java.lang.Object) stackTestDriver10);
        java.lang.Object obj16 = stackTestDriver0.pop();
        java.lang.Object obj17 = stackTestDriver0.peek();
        java.lang.Object obj18 = stackTestDriver0.peek();
        java.lang.Object obj19 = stackTestDriver0.peek();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0f) + "'", obj8, (-1.0f));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(obj19);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test340");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) (short) 1);
        int int7 = stackTestDriver0.size();
        int int8 = stackTestDriver0.size();
        java.lang.Object obj9 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        int int11 = stackTestDriver10.size();
        int int12 = stackTestDriver10.size();
        int int13 = stackTestDriver10.size();
        boolean boolean14 = stackTestDriver10.isEmpty();
        java.lang.Object obj15 = stackTestDriver0.push((java.lang.Object) stackTestDriver10);
        java.lang.Object obj16 = stackTestDriver0.peek();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1.0f) + "'", obj4, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 1 + "'", obj6, (short) 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (short) 1 + "'", obj9, (short) 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(obj16);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test341");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) (short) 1);
        int int7 = stackTestDriver0.size();
        int int8 = stackTestDriver0.size();
        java.lang.Object obj9 = stackTestDriver0.pop();
        java.lang.Object obj10 = stackTestDriver0.peek();
        java.lang.Object obj11 = stackTestDriver0.pop();
        java.lang.Class<?> wildcardClass12 = obj11.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1.0f) + "'", obj4, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 1 + "'", obj6, (short) 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (short) 1 + "'", obj9, (short) 1);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (-1.0f) + "'", obj10, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (-1.0f) + "'", obj11, (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test342");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (-1.0f));
        boolean boolean5 = stackTestDriver0.isEmpty();
        java.lang.Object obj6 = stackTestDriver0.peek();
        experiment.util.StackTestDriver stackTestDriver7 = new experiment.util.StackTestDriver();
        int int8 = stackTestDriver7.size();
        boolean boolean9 = stackTestDriver7.isEmpty();
        int int10 = stackTestDriver7.size();
        boolean boolean11 = stackTestDriver7.isEmpty();
        java.lang.Object obj12 = stackTestDriver0.push((java.lang.Object) stackTestDriver7);
        java.lang.Object obj13 = stackTestDriver0.pop();
        java.lang.Object obj14 = stackTestDriver0.peek();
        boolean boolean15 = stackTestDriver0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1.0f) + "'", obj4, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1.0f) + "'", obj6, (-1.0f));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1.0f) + "'", obj14, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test343");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        int int4 = stackTestDriver0.size();
        boolean boolean5 = stackTestDriver0.isEmpty();
        int int6 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver7 = new experiment.util.StackTestDriver();
        int int8 = stackTestDriver7.size();
        boolean boolean9 = stackTestDriver7.isEmpty();
        int int10 = stackTestDriver7.size();
        java.lang.Object obj11 = stackTestDriver0.push((java.lang.Object) stackTestDriver7);
        int int12 = stackTestDriver7.size();
        stackTestDriver7.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test344");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (-1.0f));
        boolean boolean5 = stackTestDriver0.isEmpty();
        int int6 = stackTestDriver0.size();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        int int9 = stackTestDriver8.size();
        boolean boolean10 = stackTestDriver8.isEmpty();
        java.lang.Object obj12 = stackTestDriver8.push((java.lang.Object) (-1.0f));
        java.lang.Object obj13 = stackTestDriver0.push(obj12);
        int int14 = stackTestDriver0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1.0f) + "'", obj4, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (-1.0f) + "'", obj12, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (-1.0f) + "'", obj13, (-1.0f));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test345");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver2 = new experiment.util.StackTestDriver();
        stackTestDriver2.clear();
        boolean boolean4 = stackTestDriver2.isEmpty();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) stackTestDriver2);
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) 2);
        boolean boolean8 = stackTestDriver0.isEmpty();
        java.lang.Object obj10 = stackTestDriver0.push((java.lang.Object) (short) -1);
        java.lang.Object obj11 = stackTestDriver0.peek();
        experiment.util.StackTestDriver stackTestDriver12 = new experiment.util.StackTestDriver();
        int int13 = stackTestDriver12.size();
        boolean boolean14 = stackTestDriver12.isEmpty();
        java.lang.Object obj16 = stackTestDriver12.push((java.lang.Object) (-1.0f));
        boolean boolean17 = stackTestDriver12.isEmpty();
        java.lang.Object obj18 = stackTestDriver0.push((java.lang.Object) boolean17);
        java.lang.Object obj19 = stackTestDriver0.pop();
        int int20 = stackTestDriver0.size();
        java.lang.Object obj21 = stackTestDriver0.peek();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 2 + "'", obj7, 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (short) -1 + "'", obj10, (short) -1);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (short) -1 + "'", obj11, (short) -1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (-1.0f) + "'", obj16, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + false + "'", obj18, false);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + false + "'", obj19, false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (short) -1 + "'", obj21, (short) -1);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test346");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        boolean boolean6 = stackTestDriver4.isEmpty();
        java.lang.Object obj8 = stackTestDriver4.push((java.lang.Object) (-1.0f));
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        int int11 = stackTestDriver10.size();
        boolean boolean12 = stackTestDriver10.isEmpty();
        boolean boolean13 = stackTestDriver10.isEmpty();
        java.lang.Class<?> wildcardClass14 = stackTestDriver10.getClass();
        java.lang.Object obj15 = stackTestDriver0.push((java.lang.Object) stackTestDriver10);
        boolean boolean16 = stackTestDriver0.isEmpty();
        boolean boolean17 = stackTestDriver0.isEmpty();
        int int18 = stackTestDriver0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0f) + "'", obj8, (-1.0f));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test347");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        int int2 = stackTestDriver0.size();
        boolean boolean3 = stackTestDriver0.isEmpty();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) 100);
        boolean boolean6 = stackTestDriver0.isEmpty();
        java.lang.Object obj7 = stackTestDriver0.pop();
        stackTestDriver0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100 + "'", obj5, 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 100 + "'", obj7, 100);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test348");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) (short) 1);
        int int7 = stackTestDriver0.size();
        int int8 = stackTestDriver0.size();
        java.lang.Object obj9 = stackTestDriver0.pop();
        java.lang.Object obj10 = stackTestDriver0.peek();
        java.lang.Object obj12 = stackTestDriver0.push((java.lang.Object) "");
        int int13 = stackTestDriver0.size();
        java.lang.Object obj14 = stackTestDriver0.pop();
        java.lang.Object obj15 = stackTestDriver0.pop();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1.0f) + "'", obj4, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 1 + "'", obj6, (short) 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (short) 1 + "'", obj9, (short) 1);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (-1.0f) + "'", obj10, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + "" + "'", obj12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + "" + "'", obj14, "");
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (-1.0f) + "'", obj15, (-1.0f));
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test349");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver3 = new experiment.util.StackTestDriver();
        int int4 = stackTestDriver3.size();
        boolean boolean5 = stackTestDriver3.isEmpty();
        stackTestDriver3.clear();
        experiment.util.StackTestDriver stackTestDriver7 = new experiment.util.StackTestDriver();
        int int8 = stackTestDriver7.size();
        boolean boolean9 = stackTestDriver7.isEmpty();
        java.lang.Object obj11 = stackTestDriver7.push((java.lang.Object) (-1.0f));
        java.lang.Object obj12 = stackTestDriver3.push((java.lang.Object) stackTestDriver7);
        java.lang.Object obj13 = stackTestDriver3.peek();
        java.lang.Object obj14 = stackTestDriver3.peek();
        java.lang.Object obj15 = stackTestDriver0.push(obj14);
        java.lang.Object obj16 = stackTestDriver0.pop();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (-1.0f) + "'", obj11, (-1.0f));
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(obj16);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test350");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (-1.0f));
        boolean boolean5 = stackTestDriver0.isEmpty();
        int int6 = stackTestDriver0.size();
        boolean boolean7 = stackTestDriver0.isEmpty();
        java.lang.Object obj8 = stackTestDriver0.peek();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        stackTestDriver10.clear();
        stackTestDriver10.clear();
        boolean boolean13 = stackTestDriver10.isEmpty();
        experiment.util.StackTestDriver stackTestDriver14 = new experiment.util.StackTestDriver();
        int int15 = stackTestDriver14.size();
        int int16 = stackTestDriver14.size();
        int int17 = stackTestDriver14.size();
        java.lang.Class<?> wildcardClass18 = stackTestDriver14.getClass();
        java.lang.Object obj19 = stackTestDriver10.push((java.lang.Object) stackTestDriver14);
        java.lang.Object obj20 = stackTestDriver0.push((java.lang.Object) stackTestDriver14);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1.0f) + "'", obj4, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0f) + "'", obj8, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(obj20);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test351");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        boolean boolean6 = stackTestDriver4.isEmpty();
        java.lang.Object obj8 = stackTestDriver4.push((java.lang.Object) (-1.0f));
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        stackTestDriver0.clear();
        int int11 = stackTestDriver0.size();
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0f) + "'", obj8, (-1.0f));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test352");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
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
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test353");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
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
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test354");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) (short) 1);
        int int7 = stackTestDriver0.size();
        int int8 = stackTestDriver0.size();
        java.lang.Object obj9 = stackTestDriver0.pop();
        int int10 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver11 = new experiment.util.StackTestDriver();
        int int12 = stackTestDriver11.size();
        boolean boolean13 = stackTestDriver11.isEmpty();
        java.lang.Object obj15 = stackTestDriver11.push((java.lang.Object) (-1.0f));
        java.lang.Object obj17 = stackTestDriver11.push((java.lang.Object) (short) 1);
        stackTestDriver11.clear();
        stackTestDriver11.clear();
        stackTestDriver11.clear();
        java.lang.Object obj21 = stackTestDriver0.push((java.lang.Object) stackTestDriver11);
        java.lang.Object obj23 = stackTestDriver11.push((java.lang.Object) 100);
        int int24 = stackTestDriver11.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1.0f) + "'", obj4, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 1 + "'", obj6, (short) 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (short) 1 + "'", obj9, (short) 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (-1.0f) + "'", obj15, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (short) 1 + "'", obj17, (short) 1);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 100 + "'", obj23, 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test355");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver2 = new experiment.util.StackTestDriver();
        stackTestDriver2.clear();
        boolean boolean4 = stackTestDriver2.isEmpty();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) stackTestDriver2);
        java.lang.Object obj6 = stackTestDriver0.peek();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test356");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver2 = new experiment.util.StackTestDriver();
        stackTestDriver2.clear();
        boolean boolean4 = stackTestDriver2.isEmpty();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) stackTestDriver2);
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) 2);
        boolean boolean8 = stackTestDriver0.isEmpty();
        java.lang.Object obj10 = stackTestDriver0.push((java.lang.Object) (short) -1);
        experiment.util.StackTestDriver stackTestDriver11 = new experiment.util.StackTestDriver();
        int int12 = stackTestDriver11.size();
        int int13 = stackTestDriver11.size();
        boolean boolean14 = stackTestDriver11.isEmpty();
        stackTestDriver11.clear();
        boolean boolean16 = stackTestDriver11.isEmpty();
        java.lang.Class<?> wildcardClass17 = stackTestDriver11.getClass();
        java.lang.Object obj18 = stackTestDriver0.push((java.lang.Object) stackTestDriver11);
        java.lang.Object obj19 = stackTestDriver0.pop();
        java.lang.Class<?> wildcardClass20 = obj19.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 2 + "'", obj7, 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (short) -1 + "'", obj10, (short) -1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test357");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) (short) 1);
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) (short) 10);
        boolean boolean9 = stackTestDriver0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1.0f) + "'", obj4, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 1 + "'", obj6, (short) 1);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (short) 10 + "'", obj8, (short) 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test358");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) (short) 1);
        int int7 = stackTestDriver0.size();
        int int8 = stackTestDriver0.size();
        java.lang.Object obj9 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        int int11 = stackTestDriver10.size();
        int int12 = stackTestDriver10.size();
        int int13 = stackTestDriver10.size();
        boolean boolean14 = stackTestDriver10.isEmpty();
        java.lang.Object obj15 = stackTestDriver0.push((java.lang.Object) stackTestDriver10);
        int int16 = stackTestDriver10.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1.0f) + "'", obj4, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 1 + "'", obj6, (short) 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (short) 1 + "'", obj9, (short) 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test359");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test360");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) (short) 1);
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver9 = new experiment.util.StackTestDriver();
        int int10 = stackTestDriver9.size();
        boolean boolean11 = stackTestDriver9.isEmpty();
        stackTestDriver9.clear();
        experiment.util.StackTestDriver stackTestDriver13 = new experiment.util.StackTestDriver();
        int int14 = stackTestDriver13.size();
        boolean boolean15 = stackTestDriver13.isEmpty();
        java.lang.Object obj17 = stackTestDriver13.push((java.lang.Object) (-1.0f));
        java.lang.Object obj18 = stackTestDriver9.push((java.lang.Object) stackTestDriver13);
        java.lang.Object obj19 = stackTestDriver9.peek();
        java.lang.Object obj20 = stackTestDriver9.peek();
        java.lang.Object obj21 = stackTestDriver0.push(obj20);
        boolean boolean22 = stackTestDriver0.isEmpty();
        boolean boolean23 = stackTestDriver0.isEmpty();
        boolean boolean24 = stackTestDriver0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1.0f) + "'", obj4, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 1 + "'", obj6, (short) 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (-1.0f) + "'", obj17, (-1.0f));
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test361");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) (short) 1);
        int int7 = stackTestDriver0.size();
        int int8 = stackTestDriver0.size();
        java.lang.Object obj9 = stackTestDriver0.pop();
        int int10 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver11 = new experiment.util.StackTestDriver();
        int int12 = stackTestDriver11.size();
        boolean boolean13 = stackTestDriver11.isEmpty();
        java.lang.Object obj15 = stackTestDriver11.push((java.lang.Object) (-1.0f));
        java.lang.Object obj17 = stackTestDriver11.push((java.lang.Object) (short) 1);
        stackTestDriver11.clear();
        stackTestDriver11.clear();
        stackTestDriver11.clear();
        java.lang.Object obj21 = stackTestDriver0.push((java.lang.Object) stackTestDriver11);
        java.lang.Object obj23 = stackTestDriver11.push((java.lang.Object) 100);
        java.lang.Object obj25 = stackTestDriver11.push((java.lang.Object) (byte) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1.0f) + "'", obj4, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 1 + "'", obj6, (short) 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (short) 1 + "'", obj9, (short) 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (-1.0f) + "'", obj15, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (short) 1 + "'", obj17, (short) 1);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 100 + "'", obj23, 100);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (byte) 10 + "'", obj25, (byte) 10);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test362");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        int int2 = stackTestDriver0.size();
        boolean boolean3 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        boolean boolean5 = stackTestDriver4.isEmpty();
        stackTestDriver4.clear();
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        int int8 = stackTestDriver0.size();
        java.lang.Object obj9 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        boolean boolean11 = stackTestDriver10.isEmpty();
        int int12 = stackTestDriver10.size();
        int int13 = stackTestDriver10.size();
        int int14 = stackTestDriver10.size();
        int int15 = stackTestDriver10.size();
        java.lang.Object obj16 = stackTestDriver0.push((java.lang.Object) int15);
        java.lang.Object obj17 = stackTestDriver0.peek();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0 + "'", obj16, 0);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 0 + "'", obj17, 0);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test363");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) 10.0d);
        stackTestDriver0.clear();
        boolean boolean6 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver7 = new experiment.util.StackTestDriver();
        int int8 = stackTestDriver7.size();
        boolean boolean9 = stackTestDriver7.isEmpty();
        stackTestDriver7.clear();
        experiment.util.StackTestDriver stackTestDriver11 = new experiment.util.StackTestDriver();
        int int12 = stackTestDriver11.size();
        boolean boolean13 = stackTestDriver11.isEmpty();
        java.lang.Object obj15 = stackTestDriver11.push((java.lang.Object) (-1.0f));
        java.lang.Object obj16 = stackTestDriver7.push((java.lang.Object) stackTestDriver11);
        experiment.util.StackTestDriver stackTestDriver17 = new experiment.util.StackTestDriver();
        int int18 = stackTestDriver17.size();
        boolean boolean19 = stackTestDriver17.isEmpty();
        boolean boolean20 = stackTestDriver17.isEmpty();
        java.lang.Class<?> wildcardClass21 = stackTestDriver17.getClass();
        java.lang.Object obj22 = stackTestDriver7.push((java.lang.Object) stackTestDriver17);
        java.lang.Object obj23 = stackTestDriver7.pop();
        java.lang.Object obj24 = stackTestDriver7.peek();
        int int25 = stackTestDriver7.size();
        java.lang.Object obj26 = stackTestDriver0.push((java.lang.Object) stackTestDriver7);
        boolean boolean27 = stackTestDriver7.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 10.0d + "'", obj4, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (-1.0f) + "'", obj15, (-1.0f));
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test364");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        boolean boolean6 = stackTestDriver4.isEmpty();
        java.lang.Object obj8 = stackTestDriver4.push((java.lang.Object) (-1.0f));
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        stackTestDriver0.clear();
        boolean boolean11 = stackTestDriver0.isEmpty();
        boolean boolean12 = stackTestDriver0.isEmpty();
        int int13 = stackTestDriver0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0f) + "'", obj8, (-1.0f));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test365");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        int int3 = stackTestDriver0.size();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        int int6 = stackTestDriver5.size();
        boolean boolean7 = stackTestDriver5.isEmpty();
        java.lang.Object obj9 = stackTestDriver5.push((java.lang.Object) (-1.0f));
        boolean boolean10 = stackTestDriver5.isEmpty();
        java.lang.Object obj11 = stackTestDriver5.peek();
        java.lang.Object obj12 = stackTestDriver5.pop();
        stackTestDriver5.clear();
        java.lang.Object obj14 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        boolean boolean15 = stackTestDriver5.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (-1.0f) + "'", obj9, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (-1.0f) + "'", obj11, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (-1.0f) + "'", obj12, (-1.0f));
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test366");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        boolean boolean6 = stackTestDriver4.isEmpty();
        java.lang.Object obj8 = stackTestDriver4.push((java.lang.Object) (-1.0f));
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        java.lang.Object obj10 = stackTestDriver4.pop();
        boolean boolean11 = stackTestDriver4.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = stackTestDriver4.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0f) + "'", obj8, (-1.0f));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (-1.0f) + "'", obj10, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test367");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) (short) 1);
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        int int10 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver11 = new experiment.util.StackTestDriver();
        int int12 = stackTestDriver11.size();
        boolean boolean13 = stackTestDriver11.isEmpty();
        stackTestDriver11.clear();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        int int16 = stackTestDriver15.size();
        boolean boolean17 = stackTestDriver15.isEmpty();
        java.lang.Object obj19 = stackTestDriver15.push((java.lang.Object) (-1.0f));
        java.lang.Object obj20 = stackTestDriver11.push((java.lang.Object) stackTestDriver15);
        stackTestDriver11.clear();
        stackTestDriver11.clear();
        java.lang.Object obj23 = stackTestDriver0.push((java.lang.Object) stackTestDriver11);
        boolean boolean24 = stackTestDriver0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1.0f) + "'", obj4, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 1 + "'", obj6, (short) 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (-1.0f) + "'", obj19, (-1.0f));
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test368");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) (short) 1);
        int int7 = stackTestDriver0.size();
        int int8 = stackTestDriver0.size();
        java.lang.Object obj9 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        int int11 = stackTestDriver10.size();
        int int12 = stackTestDriver10.size();
        int int13 = stackTestDriver10.size();
        boolean boolean14 = stackTestDriver10.isEmpty();
        java.lang.Object obj15 = stackTestDriver0.push((java.lang.Object) stackTestDriver10);
        boolean boolean16 = stackTestDriver10.isEmpty();
        java.lang.Object obj18 = stackTestDriver10.push((java.lang.Object) (byte) 1);
        java.lang.Object obj19 = stackTestDriver10.peek();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1.0f) + "'", obj4, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 1 + "'", obj6, (short) 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (short) 1 + "'", obj9, (short) 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (byte) 1 + "'", obj18, (byte) 1);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (byte) 1 + "'", obj19, (byte) 1);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test369");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        int int6 = stackTestDriver4.size();
        int int7 = stackTestDriver4.size();
        boolean boolean8 = stackTestDriver4.isEmpty();
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) boolean8);
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        int int11 = stackTestDriver10.size();
        boolean boolean12 = stackTestDriver10.isEmpty();
        stackTestDriver10.clear();
        int int14 = stackTestDriver10.size();
        java.lang.Object obj15 = stackTestDriver0.push((java.lang.Object) stackTestDriver10);
        int int16 = stackTestDriver10.size();
        experiment.util.StackTestDriver stackTestDriver17 = new experiment.util.StackTestDriver();
        boolean boolean18 = stackTestDriver17.isEmpty();
        experiment.util.StackTestDriver stackTestDriver19 = new experiment.util.StackTestDriver();
        stackTestDriver19.clear();
        boolean boolean21 = stackTestDriver19.isEmpty();
        java.lang.Object obj22 = stackTestDriver17.push((java.lang.Object) stackTestDriver19);
        java.lang.Object obj24 = stackTestDriver17.push((java.lang.Object) 2);
        boolean boolean25 = stackTestDriver17.isEmpty();
        java.lang.Object obj26 = stackTestDriver17.peek();
        java.lang.Object obj27 = stackTestDriver10.push((java.lang.Object) stackTestDriver17);
        int int28 = stackTestDriver10.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + true + "'", obj9, true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 2 + "'", obj24, 2);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 2 + "'", obj26, 2);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test370");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        int int6 = stackTestDriver4.size();
        int int7 = stackTestDriver4.size();
        boolean boolean8 = stackTestDriver4.isEmpty();
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) boolean8);
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        int int11 = stackTestDriver10.size();
        boolean boolean12 = stackTestDriver10.isEmpty();
        stackTestDriver10.clear();
        int int14 = stackTestDriver10.size();
        java.lang.Object obj15 = stackTestDriver0.push((java.lang.Object) stackTestDriver10);
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + true + "'", obj9, true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test371");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        boolean boolean6 = stackTestDriver4.isEmpty();
        java.lang.Object obj8 = stackTestDriver4.push((java.lang.Object) (-1.0f));
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        int int11 = stackTestDriver10.size();
        boolean boolean12 = stackTestDriver10.isEmpty();
        boolean boolean13 = stackTestDriver10.isEmpty();
        java.lang.Class<?> wildcardClass14 = stackTestDriver10.getClass();
        java.lang.Object obj15 = stackTestDriver0.push((java.lang.Object) stackTestDriver10);
        java.lang.Object obj16 = stackTestDriver0.pop();
        boolean boolean17 = stackTestDriver0.isEmpty();
        java.lang.Class<?> wildcardClass18 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0f) + "'", obj8, (-1.0f));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test372");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        boolean boolean6 = stackTestDriver4.isEmpty();
        java.lang.Object obj8 = stackTestDriver4.push((java.lang.Object) (-1.0f));
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        java.lang.Object obj10 = stackTestDriver4.pop();
        stackTestDriver4.clear();
        boolean boolean12 = stackTestDriver4.isEmpty();
        experiment.util.StackTestDriver stackTestDriver13 = new experiment.util.StackTestDriver();
        boolean boolean14 = stackTestDriver13.isEmpty();
        int int15 = stackTestDriver13.size();
        stackTestDriver13.clear();
        java.lang.Class<?> wildcardClass17 = stackTestDriver13.getClass();
        java.lang.Object obj18 = stackTestDriver4.push((java.lang.Object) stackTestDriver13);
        int int19 = stackTestDriver4.size();
        java.lang.Object obj20 = stackTestDriver4.pop();
        boolean boolean21 = stackTestDriver4.isEmpty();
        java.lang.Class<?> wildcardClass22 = stackTestDriver4.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0f) + "'", obj8, (-1.0f));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (-1.0f) + "'", obj10, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test373");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        boolean boolean4 = stackTestDriver0.isEmpty();
        boolean boolean5 = stackTestDriver0.isEmpty();
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) 10L);
        java.lang.Object obj8 = stackTestDriver0.peek();
        java.lang.Object obj9 = stackTestDriver0.peek();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 10L + "'", obj7, 10L);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 10L + "'", obj8, 10L);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 10L + "'", obj9, 10L);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test374");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        int int3 = stackTestDriver0.size();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        int int6 = stackTestDriver5.size();
        boolean boolean7 = stackTestDriver5.isEmpty();
        java.lang.Object obj9 = stackTestDriver5.push((java.lang.Object) (-1.0f));
        boolean boolean10 = stackTestDriver5.isEmpty();
        java.lang.Object obj11 = stackTestDriver5.peek();
        java.lang.Object obj12 = stackTestDriver5.pop();
        stackTestDriver5.clear();
        java.lang.Object obj14 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        int int16 = stackTestDriver15.size();
        boolean boolean17 = stackTestDriver15.isEmpty();
        java.lang.Class<?> wildcardClass18 = stackTestDriver15.getClass();
        java.lang.Object obj19 = stackTestDriver0.push((java.lang.Object) wildcardClass18);
        experiment.util.StackTestDriver stackTestDriver20 = new experiment.util.StackTestDriver();
        int int21 = stackTestDriver20.size();
        boolean boolean22 = stackTestDriver20.isEmpty();
        stackTestDriver20.clear();
        experiment.util.StackTestDriver stackTestDriver24 = new experiment.util.StackTestDriver();
        int int25 = stackTestDriver24.size();
        boolean boolean26 = stackTestDriver24.isEmpty();
        java.lang.Object obj28 = stackTestDriver24.push((java.lang.Object) (-1.0f));
        java.lang.Object obj29 = stackTestDriver20.push((java.lang.Object) stackTestDriver24);
        stackTestDriver20.clear();
        java.lang.Object obj31 = stackTestDriver0.push((java.lang.Object) stackTestDriver20);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj32 = stackTestDriver20.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (-1.0f) + "'", obj9, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (-1.0f) + "'", obj11, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (-1.0f) + "'", obj12, (-1.0f));
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + (-1.0f) + "'", obj28, (-1.0f));
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNotNull(obj31);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test375");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver2 = new experiment.util.StackTestDriver();
        stackTestDriver2.clear();
        boolean boolean4 = stackTestDriver2.isEmpty();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) stackTestDriver2);
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test376");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        boolean boolean4 = stackTestDriver0.isEmpty();
        int int5 = stackTestDriver0.size();
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) 10.0d);
        java.lang.Object obj8 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver9 = new experiment.util.StackTestDriver();
        int int10 = stackTestDriver9.size();
        boolean boolean11 = stackTestDriver9.isEmpty();
        java.lang.Object obj13 = stackTestDriver9.push((java.lang.Object) (-1.0f));
        boolean boolean14 = stackTestDriver9.isEmpty();
        java.lang.Object obj15 = stackTestDriver9.peek();
        experiment.util.StackTestDriver stackTestDriver16 = new experiment.util.StackTestDriver();
        int int17 = stackTestDriver16.size();
        boolean boolean18 = stackTestDriver16.isEmpty();
        int int19 = stackTestDriver16.size();
        boolean boolean20 = stackTestDriver16.isEmpty();
        java.lang.Object obj21 = stackTestDriver9.push((java.lang.Object) stackTestDriver16);
        java.lang.Object obj22 = stackTestDriver9.pop();
        java.lang.Object obj23 = stackTestDriver0.push((java.lang.Object) stackTestDriver9);
        boolean boolean24 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver25 = new experiment.util.StackTestDriver();
        int int26 = stackTestDriver25.size();
        boolean boolean27 = stackTestDriver25.isEmpty();
        java.lang.Object obj29 = stackTestDriver25.push((java.lang.Object) 10.0d);
        stackTestDriver25.clear();
        boolean boolean31 = stackTestDriver25.isEmpty();
        experiment.util.StackTestDriver stackTestDriver32 = new experiment.util.StackTestDriver();
        int int33 = stackTestDriver32.size();
        boolean boolean34 = stackTestDriver32.isEmpty();
        stackTestDriver32.clear();
        experiment.util.StackTestDriver stackTestDriver36 = new experiment.util.StackTestDriver();
        int int37 = stackTestDriver36.size();
        boolean boolean38 = stackTestDriver36.isEmpty();
        java.lang.Object obj40 = stackTestDriver36.push((java.lang.Object) (-1.0f));
        java.lang.Object obj41 = stackTestDriver32.push((java.lang.Object) stackTestDriver36);
        experiment.util.StackTestDriver stackTestDriver42 = new experiment.util.StackTestDriver();
        int int43 = stackTestDriver42.size();
        boolean boolean44 = stackTestDriver42.isEmpty();
        boolean boolean45 = stackTestDriver42.isEmpty();
        java.lang.Class<?> wildcardClass46 = stackTestDriver42.getClass();
        java.lang.Object obj47 = stackTestDriver32.push((java.lang.Object) stackTestDriver42);
        java.lang.Object obj48 = stackTestDriver32.pop();
        java.lang.Object obj49 = stackTestDriver32.peek();
        int int50 = stackTestDriver32.size();
        java.lang.Object obj51 = stackTestDriver25.push((java.lang.Object) stackTestDriver32);
        java.lang.Object obj52 = stackTestDriver0.push(obj51);
        int int53 = stackTestDriver0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 10.0d + "'", obj7, 10.0d);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 10.0d + "'", obj8, 10.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (-1.0f) + "'", obj13, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (-1.0f) + "'", obj15, (-1.0f));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 10.0d + "'", obj29, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + (-1.0f) + "'", obj40, (-1.0f));
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertNotNull(obj51);
        org.junit.Assert.assertNotNull(obj52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 2 + "'", int53 == 2);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test377");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        boolean boolean6 = stackTestDriver4.isEmpty();
        java.lang.Object obj8 = stackTestDriver4.push((java.lang.Object) (-1.0f));
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        java.lang.Object obj10 = stackTestDriver4.pop();
        stackTestDriver4.clear();
        boolean boolean12 = stackTestDriver4.isEmpty();
        experiment.util.StackTestDriver stackTestDriver13 = new experiment.util.StackTestDriver();
        boolean boolean14 = stackTestDriver13.isEmpty();
        int int15 = stackTestDriver13.size();
        stackTestDriver13.clear();
        java.lang.Class<?> wildcardClass17 = stackTestDriver13.getClass();
        java.lang.Object obj18 = stackTestDriver4.push((java.lang.Object) stackTestDriver13);
        int int19 = stackTestDriver4.size();
        java.lang.Object obj20 = stackTestDriver4.pop();
        stackTestDriver4.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0f) + "'", obj8, (-1.0f));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (-1.0f) + "'", obj10, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(obj20);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test378");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) 10.0d);
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
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 10.0d + "'", obj4, 10.0d);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test379");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) 10.0d);
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        int int6 = stackTestDriver5.size();
        boolean boolean7 = stackTestDriver5.isEmpty();
        boolean boolean8 = stackTestDriver5.isEmpty();
        boolean boolean9 = stackTestDriver5.isEmpty();
        stackTestDriver5.clear();
        int int11 = stackTestDriver5.size();
        stackTestDriver5.clear();
        java.lang.Object obj13 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        experiment.util.StackTestDriver stackTestDriver14 = new experiment.util.StackTestDriver();
        int int15 = stackTestDriver14.size();
        java.lang.Class<?> wildcardClass16 = stackTestDriver14.getClass();
        java.lang.Object obj17 = stackTestDriver0.push((java.lang.Object) stackTestDriver14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = stackTestDriver14.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 10.0d + "'", obj4, 10.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(obj17);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test380");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) 10.0d);
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        int int6 = stackTestDriver5.size();
        boolean boolean7 = stackTestDriver5.isEmpty();
        boolean boolean8 = stackTestDriver5.isEmpty();
        boolean boolean9 = stackTestDriver5.isEmpty();
        stackTestDriver5.clear();
        int int11 = stackTestDriver5.size();
        stackTestDriver5.clear();
        java.lang.Object obj13 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        experiment.util.StackTestDriver stackTestDriver14 = new experiment.util.StackTestDriver();
        int int15 = stackTestDriver14.size();
        java.lang.Class<?> wildcardClass16 = stackTestDriver14.getClass();
        java.lang.Object obj17 = stackTestDriver0.push((java.lang.Object) stackTestDriver14);
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 10.0d + "'", obj4, 10.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test381");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        int int3 = stackTestDriver0.size();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (byte) 100);
        int int6 = stackTestDriver0.size();
        java.lang.Object obj7 = stackTestDriver0.peek();
        boolean boolean8 = stackTestDriver0.isEmpty();
        boolean boolean9 = stackTestDriver0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) 100 + "'", obj5, (byte) 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 100 + "'", obj7, (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test382");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver2 = new experiment.util.StackTestDriver();
        stackTestDriver2.clear();
        boolean boolean4 = stackTestDriver2.isEmpty();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) stackTestDriver2);
        int int6 = stackTestDriver2.size();
        experiment.util.StackTestDriver stackTestDriver7 = new experiment.util.StackTestDriver();
        int int8 = stackTestDriver7.size();
        boolean boolean9 = stackTestDriver7.isEmpty();
        stackTestDriver7.clear();
        experiment.util.StackTestDriver stackTestDriver11 = new experiment.util.StackTestDriver();
        int int12 = stackTestDriver11.size();
        boolean boolean13 = stackTestDriver11.isEmpty();
        java.lang.Object obj15 = stackTestDriver11.push((java.lang.Object) (-1.0f));
        java.lang.Object obj16 = stackTestDriver7.push((java.lang.Object) stackTestDriver11);
        experiment.util.StackTestDriver stackTestDriver17 = new experiment.util.StackTestDriver();
        int int18 = stackTestDriver17.size();
        boolean boolean19 = stackTestDriver17.isEmpty();
        boolean boolean20 = stackTestDriver17.isEmpty();
        java.lang.Class<?> wildcardClass21 = stackTestDriver17.getClass();
        java.lang.Object obj22 = stackTestDriver7.push((java.lang.Object) stackTestDriver17);
        java.lang.Object obj23 = stackTestDriver7.pop();
        java.lang.Object obj24 = stackTestDriver7.pop();
        experiment.util.StackTestDriver stackTestDriver25 = new experiment.util.StackTestDriver();
        boolean boolean26 = stackTestDriver25.isEmpty();
        stackTestDriver25.clear();
        int int28 = stackTestDriver25.size();
        int int29 = stackTestDriver25.size();
        java.lang.Object obj30 = stackTestDriver7.push((java.lang.Object) int29);
        java.lang.Object obj31 = stackTestDriver2.push((java.lang.Object) stackTestDriver7);
        java.lang.Object obj32 = stackTestDriver2.peek();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (-1.0f) + "'", obj15, (-1.0f));
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + 0 + "'", obj30, 0);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertNotNull(obj32);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test383");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        int int4 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        int int6 = stackTestDriver5.size();
        int int7 = stackTestDriver5.size();
        int int8 = stackTestDriver5.size();
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) int8);
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        stackTestDriver10.clear();
        experiment.util.StackTestDriver stackTestDriver12 = new experiment.util.StackTestDriver();
        int int13 = stackTestDriver12.size();
        boolean boolean14 = stackTestDriver12.isEmpty();
        java.lang.Object obj16 = stackTestDriver12.push((java.lang.Object) (-1.0f));
        java.lang.Object obj18 = stackTestDriver12.push((java.lang.Object) (short) 1);
        int int19 = stackTestDriver12.size();
        int int20 = stackTestDriver12.size();
        java.lang.Object obj21 = stackTestDriver12.pop();
        java.lang.Object obj22 = stackTestDriver10.push((java.lang.Object) stackTestDriver12);
        java.lang.Object obj23 = stackTestDriver12.peek();
        java.lang.Object obj24 = stackTestDriver0.push(obj23);
        experiment.util.StackTestDriver stackTestDriver25 = new experiment.util.StackTestDriver();
        int int26 = stackTestDriver25.size();
        boolean boolean27 = stackTestDriver25.isEmpty();
        java.lang.Object obj29 = stackTestDriver25.push((java.lang.Object) (-1.0f));
        java.lang.Object obj31 = stackTestDriver25.push((java.lang.Object) (short) 1);
        int int32 = stackTestDriver25.size();
        java.lang.Object obj33 = stackTestDriver25.peek();
        boolean boolean34 = stackTestDriver25.isEmpty();
        java.lang.Object obj35 = stackTestDriver0.push((java.lang.Object) boolean34);
        stackTestDriver0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0 + "'", obj9, 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (-1.0f) + "'", obj16, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (short) 1 + "'", obj18, (short) 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (short) 1 + "'", obj21, (short) 1);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (-1.0f) + "'", obj23, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (-1.0f) + "'", obj24, (-1.0f));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + (-1.0f) + "'", obj29, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + (short) 1 + "'", obj31, (short) 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2 + "'", int32 == 2);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + (short) 1 + "'", obj33, (short) 1);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + false + "'", obj35, false);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test384");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        boolean boolean6 = stackTestDriver4.isEmpty();
        java.lang.Object obj8 = stackTestDriver4.push((java.lang.Object) (-1.0f));
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        int int10 = stackTestDriver0.size();
        java.lang.Object obj11 = stackTestDriver0.peek();
        java.lang.Class<?> wildcardClass12 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0f) + "'", obj8, (-1.0f));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test385");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        boolean boolean6 = stackTestDriver4.isEmpty();
        java.lang.Object obj8 = stackTestDriver4.push((java.lang.Object) (-1.0f));
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        int int11 = stackTestDriver10.size();
        boolean boolean12 = stackTestDriver10.isEmpty();
        boolean boolean13 = stackTestDriver10.isEmpty();
        java.lang.Class<?> wildcardClass14 = stackTestDriver10.getClass();
        java.lang.Object obj15 = stackTestDriver0.push((java.lang.Object) stackTestDriver10);
        java.lang.Object obj16 = stackTestDriver0.pop();
        boolean boolean17 = stackTestDriver0.isEmpty();
        java.lang.Object obj18 = stackTestDriver0.pop();
        stackTestDriver0.clear();
        int int20 = stackTestDriver0.size();
        java.lang.Class<?> wildcardClass21 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0f) + "'", obj8, (-1.0f));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test386");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        int int2 = stackTestDriver0.size();
        boolean boolean3 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        boolean boolean5 = stackTestDriver4.isEmpty();
        stackTestDriver4.clear();
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        boolean boolean8 = stackTestDriver0.isEmpty();
        java.lang.Object obj9 = stackTestDriver0.pop();
        int int10 = stackTestDriver0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test387");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (-1.0f));
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
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1.0f) + "'", obj4, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test388");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) (short) 1);
        int int7 = stackTestDriver0.size();
        int int8 = stackTestDriver0.size();
        java.lang.Object obj9 = stackTestDriver0.pop();
        int int10 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver11 = new experiment.util.StackTestDriver();
        int int12 = stackTestDriver11.size();
        boolean boolean13 = stackTestDriver11.isEmpty();
        java.lang.Object obj15 = stackTestDriver11.push((java.lang.Object) (-1.0f));
        java.lang.Object obj17 = stackTestDriver11.push((java.lang.Object) (short) 1);
        stackTestDriver11.clear();
        stackTestDriver11.clear();
        stackTestDriver11.clear();
        java.lang.Object obj21 = stackTestDriver0.push((java.lang.Object) stackTestDriver11);
        java.lang.Object obj23 = stackTestDriver11.push((java.lang.Object) 100);
        boolean boolean24 = stackTestDriver11.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1.0f) + "'", obj4, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 1 + "'", obj6, (short) 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (short) 1 + "'", obj9, (short) 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (-1.0f) + "'", obj15, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (short) 1 + "'", obj17, (short) 1);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 100 + "'", obj23, 100);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test389");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        boolean boolean4 = stackTestDriver0.isEmpty();
        boolean boolean5 = stackTestDriver0.isEmpty();
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) (byte) 10);
        java.lang.Object obj8 = stackTestDriver0.peek();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 10 + "'", obj7, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) 10 + "'", obj8, (byte) 10);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test390");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) (short) 1);
        int int7 = stackTestDriver0.size();
        int int8 = stackTestDriver0.size();
        java.lang.Object obj9 = stackTestDriver0.pop();
        java.lang.Object obj10 = stackTestDriver0.pop();
        boolean boolean11 = stackTestDriver0.isEmpty();
        int int12 = stackTestDriver0.size();
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1.0f) + "'", obj4, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 1 + "'", obj6, (short) 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (short) 1 + "'", obj9, (short) 1);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (-1.0f) + "'", obj10, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test391");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (-1.0f));
        boolean boolean5 = stackTestDriver0.isEmpty();
        int int6 = stackTestDriver0.size();
        boolean boolean7 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        int int9 = stackTestDriver8.size();
        boolean boolean10 = stackTestDriver8.isEmpty();
        java.lang.Object obj12 = stackTestDriver8.push((java.lang.Object) (-1.0f));
        boolean boolean13 = stackTestDriver8.isEmpty();
        java.lang.Object obj14 = stackTestDriver8.peek();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        int int16 = stackTestDriver15.size();
        boolean boolean17 = stackTestDriver15.isEmpty();
        int int18 = stackTestDriver15.size();
        boolean boolean19 = stackTestDriver15.isEmpty();
        java.lang.Object obj20 = stackTestDriver8.push((java.lang.Object) stackTestDriver15);
        boolean boolean21 = stackTestDriver8.isEmpty();
        java.lang.Object obj22 = stackTestDriver8.pop();
        java.lang.Object obj23 = stackTestDriver0.push(obj22);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1.0f) + "'", obj4, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (-1.0f) + "'", obj12, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1.0f) + "'", obj14, (-1.0f));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(obj23);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test392");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver2 = new experiment.util.StackTestDriver();
        stackTestDriver2.clear();
        boolean boolean4 = stackTestDriver2.isEmpty();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) stackTestDriver2);
        int int6 = stackTestDriver2.size();
        experiment.util.StackTestDriver stackTestDriver7 = new experiment.util.StackTestDriver();
        int int8 = stackTestDriver7.size();
        boolean boolean9 = stackTestDriver7.isEmpty();
        stackTestDriver7.clear();
        experiment.util.StackTestDriver stackTestDriver11 = new experiment.util.StackTestDriver();
        int int12 = stackTestDriver11.size();
        boolean boolean13 = stackTestDriver11.isEmpty();
        java.lang.Object obj15 = stackTestDriver11.push((java.lang.Object) (-1.0f));
        java.lang.Object obj16 = stackTestDriver7.push((java.lang.Object) stackTestDriver11);
        experiment.util.StackTestDriver stackTestDriver17 = new experiment.util.StackTestDriver();
        int int18 = stackTestDriver17.size();
        boolean boolean19 = stackTestDriver17.isEmpty();
        boolean boolean20 = stackTestDriver17.isEmpty();
        java.lang.Class<?> wildcardClass21 = stackTestDriver17.getClass();
        java.lang.Object obj22 = stackTestDriver7.push((java.lang.Object) stackTestDriver17);
        java.lang.Object obj23 = stackTestDriver7.pop();
        java.lang.Object obj24 = stackTestDriver7.pop();
        experiment.util.StackTestDriver stackTestDriver25 = new experiment.util.StackTestDriver();
        boolean boolean26 = stackTestDriver25.isEmpty();
        stackTestDriver25.clear();
        int int28 = stackTestDriver25.size();
        int int29 = stackTestDriver25.size();
        java.lang.Object obj30 = stackTestDriver7.push((java.lang.Object) int29);
        java.lang.Object obj31 = stackTestDriver2.push((java.lang.Object) stackTestDriver7);
        java.lang.Object obj32 = stackTestDriver2.pop();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (-1.0f) + "'", obj15, (-1.0f));
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + 0 + "'", obj30, 0);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertNotNull(obj32);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test393");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        boolean boolean6 = stackTestDriver4.isEmpty();
        java.lang.Object obj8 = stackTestDriver4.push((java.lang.Object) (-1.0f));
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        java.lang.Object obj10 = stackTestDriver4.pop();
        stackTestDriver4.clear();
        boolean boolean12 = stackTestDriver4.isEmpty();
        experiment.util.StackTestDriver stackTestDriver13 = new experiment.util.StackTestDriver();
        boolean boolean14 = stackTestDriver13.isEmpty();
        int int15 = stackTestDriver13.size();
        stackTestDriver13.clear();
        java.lang.Class<?> wildcardClass17 = stackTestDriver13.getClass();
        java.lang.Object obj18 = stackTestDriver4.push((java.lang.Object) stackTestDriver13);
        int int19 = stackTestDriver4.size();
        java.lang.Object obj20 = stackTestDriver4.pop();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = stackTestDriver4.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0f) + "'", obj8, (-1.0f));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (-1.0f) + "'", obj10, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(obj20);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test394");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) (short) 1);
        int int7 = stackTestDriver0.size();
        int int8 = stackTestDriver0.size();
        java.lang.Object obj9 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        int int11 = stackTestDriver10.size();
        int int12 = stackTestDriver10.size();
        int int13 = stackTestDriver10.size();
        boolean boolean14 = stackTestDriver10.isEmpty();
        java.lang.Object obj15 = stackTestDriver0.push((java.lang.Object) stackTestDriver10);
        java.lang.Class<?> wildcardClass16 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1.0f) + "'", obj4, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 1 + "'", obj6, (short) 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (short) 1 + "'", obj9, (short) 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test395");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        boolean boolean4 = stackTestDriver0.isEmpty();
        int int5 = stackTestDriver0.size();
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) 10.0d);
        java.lang.Object obj8 = stackTestDriver0.pop();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 10.0d + "'", obj7, 10.0d);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 10.0d + "'", obj8, 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test396");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        boolean boolean4 = stackTestDriver0.isEmpty();
        int int5 = stackTestDriver0.size();
        boolean boolean6 = stackTestDriver0.isEmpty();
        int int7 = stackTestDriver0.size();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver9 = new experiment.util.StackTestDriver();
        int int10 = stackTestDriver9.size();
        boolean boolean11 = stackTestDriver9.isEmpty();
        java.lang.Object obj13 = stackTestDriver9.push((java.lang.Object) (-1.0f));
        java.lang.Object obj15 = stackTestDriver9.push((java.lang.Object) (short) 1);
        int int16 = stackTestDriver9.size();
        int int17 = stackTestDriver9.size();
        java.lang.Object obj18 = stackTestDriver9.pop();
        int int19 = stackTestDriver9.size();
        experiment.util.StackTestDriver stackTestDriver20 = new experiment.util.StackTestDriver();
        stackTestDriver20.clear();
        boolean boolean22 = stackTestDriver20.isEmpty();
        java.lang.Class<?> wildcardClass23 = stackTestDriver20.getClass();
        java.lang.Object obj24 = stackTestDriver9.push((java.lang.Object) stackTestDriver20);
        java.lang.Object obj25 = stackTestDriver0.push((java.lang.Object) stackTestDriver9);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (-1.0f) + "'", obj13, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (short) 1 + "'", obj15, (short) 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (short) 1 + "'", obj18, (short) 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(obj25);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test397");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (-1.0f));
        boolean boolean5 = stackTestDriver0.isEmpty();
        int int6 = stackTestDriver0.size();
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
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1.0f) + "'", obj4, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test398");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        boolean boolean6 = stackTestDriver4.isEmpty();
        java.lang.Object obj8 = stackTestDriver4.push((java.lang.Object) (-1.0f));
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        int int10 = stackTestDriver0.size();
        java.lang.Object obj11 = stackTestDriver0.peek();
        java.lang.Object obj12 = stackTestDriver0.peek();
        java.lang.Object obj13 = stackTestDriver0.pop();
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0f) + "'", obj8, (-1.0f));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test399");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean5 = stackTestDriver0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test400");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        boolean boolean2 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver3 = new experiment.util.StackTestDriver();
        int int4 = stackTestDriver3.size();
        boolean boolean5 = stackTestDriver3.isEmpty();
        java.lang.Object obj7 = stackTestDriver3.push((java.lang.Object) (-1.0f));
        java.lang.Object obj9 = stackTestDriver3.push((java.lang.Object) (short) 1);
        int int10 = stackTestDriver3.size();
        int int11 = stackTestDriver3.size();
        java.lang.Object obj12 = stackTestDriver3.pop();
        java.lang.Object obj13 = stackTestDriver0.push((java.lang.Object) stackTestDriver3);
        experiment.util.StackTestDriver stackTestDriver14 = new experiment.util.StackTestDriver();
        int int15 = stackTestDriver14.size();
        boolean boolean16 = stackTestDriver14.isEmpty();
        java.lang.Object obj18 = stackTestDriver14.push((java.lang.Object) (-1.0f));
        java.lang.Object obj20 = stackTestDriver14.push((java.lang.Object) (short) 1);
        int int21 = stackTestDriver14.size();
        int int22 = stackTestDriver14.size();
        java.lang.Object obj23 = stackTestDriver14.pop();
        java.lang.Object obj24 = stackTestDriver14.peek();
        java.lang.Object obj26 = stackTestDriver14.push((java.lang.Object) "");
        java.lang.Object obj27 = stackTestDriver3.push(obj26);
        stackTestDriver3.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj29 = stackTestDriver3.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1.0f) + "'", obj7, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (short) 1 + "'", obj9, (short) 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (short) 1 + "'", obj12, (short) 1);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (-1.0f) + "'", obj18, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (short) 1 + "'", obj20, (short) 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (short) 1 + "'", obj23, (short) 1);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (-1.0f) + "'", obj24, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + "" + "'", obj26, "");
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + "" + "'", obj27, "");
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test401");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) 10.0d);
        stackTestDriver0.clear();
        boolean boolean6 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        boolean boolean8 = stackTestDriver0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 10.0d + "'", obj4, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test402");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver2 = new experiment.util.StackTestDriver();
        stackTestDriver2.clear();
        boolean boolean4 = stackTestDriver2.isEmpty();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) stackTestDriver2);
        int int6 = stackTestDriver2.size();
        experiment.util.StackTestDriver stackTestDriver7 = new experiment.util.StackTestDriver();
        int int8 = stackTestDriver7.size();
        boolean boolean9 = stackTestDriver7.isEmpty();
        stackTestDriver7.clear();
        experiment.util.StackTestDriver stackTestDriver11 = new experiment.util.StackTestDriver();
        int int12 = stackTestDriver11.size();
        boolean boolean13 = stackTestDriver11.isEmpty();
        java.lang.Object obj15 = stackTestDriver11.push((java.lang.Object) (-1.0f));
        java.lang.Object obj16 = stackTestDriver7.push((java.lang.Object) stackTestDriver11);
        experiment.util.StackTestDriver stackTestDriver17 = new experiment.util.StackTestDriver();
        int int18 = stackTestDriver17.size();
        boolean boolean19 = stackTestDriver17.isEmpty();
        boolean boolean20 = stackTestDriver17.isEmpty();
        java.lang.Class<?> wildcardClass21 = stackTestDriver17.getClass();
        java.lang.Object obj22 = stackTestDriver7.push((java.lang.Object) stackTestDriver17);
        java.lang.Object obj23 = stackTestDriver7.pop();
        java.lang.Object obj24 = stackTestDriver7.pop();
        experiment.util.StackTestDriver stackTestDriver25 = new experiment.util.StackTestDriver();
        boolean boolean26 = stackTestDriver25.isEmpty();
        stackTestDriver25.clear();
        int int28 = stackTestDriver25.size();
        int int29 = stackTestDriver25.size();
        java.lang.Object obj30 = stackTestDriver7.push((java.lang.Object) int29);
        java.lang.Object obj31 = stackTestDriver2.push((java.lang.Object) stackTestDriver7);
        boolean boolean32 = stackTestDriver2.isEmpty();
        java.lang.Class<?> wildcardClass33 = stackTestDriver2.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (-1.0f) + "'", obj15, (-1.0f));
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + 0 + "'", obj30, 0);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test403");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        boolean boolean6 = stackTestDriver4.isEmpty();
        java.lang.Object obj8 = stackTestDriver4.push((java.lang.Object) (-1.0f));
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        int int11 = stackTestDriver10.size();
        boolean boolean12 = stackTestDriver10.isEmpty();
        boolean boolean13 = stackTestDriver10.isEmpty();
        java.lang.Class<?> wildcardClass14 = stackTestDriver10.getClass();
        java.lang.Object obj15 = stackTestDriver0.push((java.lang.Object) stackTestDriver10);
        boolean boolean16 = stackTestDriver0.isEmpty();
        int int17 = stackTestDriver0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0f) + "'", obj8, (-1.0f));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test404");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        int int6 = stackTestDriver4.size();
        int int7 = stackTestDriver4.size();
        boolean boolean8 = stackTestDriver4.isEmpty();
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) boolean8);
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        int int11 = stackTestDriver10.size();
        boolean boolean12 = stackTestDriver10.isEmpty();
        stackTestDriver10.clear();
        experiment.util.StackTestDriver stackTestDriver14 = new experiment.util.StackTestDriver();
        int int15 = stackTestDriver14.size();
        boolean boolean16 = stackTestDriver14.isEmpty();
        java.lang.Object obj18 = stackTestDriver14.push((java.lang.Object) (-1.0f));
        java.lang.Object obj19 = stackTestDriver10.push((java.lang.Object) stackTestDriver14);
        java.lang.Object obj20 = stackTestDriver0.push(obj19);
        int int21 = stackTestDriver0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + true + "'", obj9, true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (-1.0f) + "'", obj18, (-1.0f));
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test405");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver2 = new experiment.util.StackTestDriver();
        stackTestDriver2.clear();
        boolean boolean4 = stackTestDriver2.isEmpty();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) stackTestDriver2);
        int int6 = stackTestDriver2.size();
        experiment.util.StackTestDriver stackTestDriver7 = new experiment.util.StackTestDriver();
        int int8 = stackTestDriver7.size();
        int int9 = stackTestDriver7.size();
        int int10 = stackTestDriver7.size();
        experiment.util.StackTestDriver stackTestDriver11 = new experiment.util.StackTestDriver();
        int int12 = stackTestDriver11.size();
        boolean boolean13 = stackTestDriver11.isEmpty();
        stackTestDriver11.clear();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        int int16 = stackTestDriver15.size();
        boolean boolean17 = stackTestDriver15.isEmpty();
        java.lang.Object obj19 = stackTestDriver15.push((java.lang.Object) (-1.0f));
        java.lang.Object obj20 = stackTestDriver11.push((java.lang.Object) stackTestDriver15);
        experiment.util.StackTestDriver stackTestDriver21 = new experiment.util.StackTestDriver();
        int int22 = stackTestDriver21.size();
        boolean boolean23 = stackTestDriver21.isEmpty();
        boolean boolean24 = stackTestDriver21.isEmpty();
        java.lang.Class<?> wildcardClass25 = stackTestDriver21.getClass();
        java.lang.Object obj26 = stackTestDriver11.push((java.lang.Object) stackTestDriver21);
        java.lang.Object obj27 = stackTestDriver11.pop();
        java.lang.Object obj28 = stackTestDriver7.push(obj27);
        boolean boolean29 = stackTestDriver7.isEmpty();
        java.lang.Object obj30 = stackTestDriver2.push((java.lang.Object) stackTestDriver7);
        boolean boolean31 = stackTestDriver2.isEmpty();
        java.lang.Object obj32 = stackTestDriver2.peek();
        java.lang.Object obj33 = stackTestDriver2.peek();
        stackTestDriver2.clear();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (-1.0f) + "'", obj19, (-1.0f));
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertNotNull(obj33);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test406");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) (short) 1);
        int int7 = stackTestDriver0.size();
        int int8 = stackTestDriver0.size();
        java.lang.Object obj9 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        int int11 = stackTestDriver10.size();
        int int12 = stackTestDriver10.size();
        int int13 = stackTestDriver10.size();
        boolean boolean14 = stackTestDriver10.isEmpty();
        java.lang.Object obj15 = stackTestDriver0.push((java.lang.Object) stackTestDriver10);
        boolean boolean16 = stackTestDriver10.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = stackTestDriver10.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1.0f) + "'", obj4, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 1 + "'", obj6, (short) 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (short) 1 + "'", obj9, (short) 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test407");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver2 = new experiment.util.StackTestDriver();
        int int3 = stackTestDriver2.size();
        boolean boolean4 = stackTestDriver2.isEmpty();
        java.lang.Object obj6 = stackTestDriver2.push((java.lang.Object) (-1.0f));
        java.lang.Object obj8 = stackTestDriver2.push((java.lang.Object) (short) 1);
        int int9 = stackTestDriver2.size();
        int int10 = stackTestDriver2.size();
        java.lang.Object obj11 = stackTestDriver2.pop();
        java.lang.Object obj12 = stackTestDriver0.push((java.lang.Object) stackTestDriver2);
        java.lang.Object obj13 = stackTestDriver2.peek();
        experiment.util.StackTestDriver stackTestDriver14 = new experiment.util.StackTestDriver();
        stackTestDriver14.clear();
        stackTestDriver14.clear();
        boolean boolean17 = stackTestDriver14.isEmpty();
        experiment.util.StackTestDriver stackTestDriver18 = new experiment.util.StackTestDriver();
        int int19 = stackTestDriver18.size();
        int int20 = stackTestDriver18.size();
        int int21 = stackTestDriver18.size();
        java.lang.Class<?> wildcardClass22 = stackTestDriver18.getClass();
        java.lang.Object obj23 = stackTestDriver14.push((java.lang.Object) stackTestDriver18);
        java.lang.Object obj24 = stackTestDriver2.push((java.lang.Object) stackTestDriver14);
        java.lang.Object obj25 = stackTestDriver14.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1.0f) + "'", obj6, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (short) 1 + "'", obj8, (short) 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (short) 1 + "'", obj11, (short) 1);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (-1.0f) + "'", obj13, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(obj25);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test408");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) (short) 1);
        int int7 = stackTestDriver0.size();
        int int8 = stackTestDriver0.size();
        java.lang.Object obj9 = stackTestDriver0.pop();
        stackTestDriver0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1.0f) + "'", obj4, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 1 + "'", obj6, (short) 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (short) 1 + "'", obj9, (short) 1);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test409");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver2 = new experiment.util.StackTestDriver();
        int int3 = stackTestDriver2.size();
        boolean boolean4 = stackTestDriver2.isEmpty();
        java.lang.Object obj6 = stackTestDriver2.push((java.lang.Object) (-1.0f));
        java.lang.Object obj8 = stackTestDriver2.push((java.lang.Object) (short) 1);
        int int9 = stackTestDriver2.size();
        int int10 = stackTestDriver2.size();
        java.lang.Object obj11 = stackTestDriver2.pop();
        java.lang.Object obj12 = stackTestDriver0.push((java.lang.Object) stackTestDriver2);
        java.lang.Object obj13 = stackTestDriver2.peek();
        java.lang.Object obj14 = stackTestDriver2.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1.0f) + "'", obj6, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (short) 1 + "'", obj8, (short) 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (short) 1 + "'", obj11, (short) 1);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (-1.0f) + "'", obj13, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1.0f) + "'", obj14, (-1.0f));
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test410");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        int int4 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean6 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        boolean boolean8 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test411");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        boolean boolean4 = stackTestDriver0.isEmpty();
        int int5 = stackTestDriver0.size();
        boolean boolean6 = stackTestDriver0.isEmpty();
        int int7 = stackTestDriver0.size();
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test412");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        boolean boolean6 = stackTestDriver4.isEmpty();
        java.lang.Object obj8 = stackTestDriver4.push((java.lang.Object) (-1.0f));
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        int int11 = stackTestDriver10.size();
        boolean boolean12 = stackTestDriver10.isEmpty();
        boolean boolean13 = stackTestDriver10.isEmpty();
        java.lang.Class<?> wildcardClass14 = stackTestDriver10.getClass();
        java.lang.Object obj15 = stackTestDriver0.push((java.lang.Object) stackTestDriver10);
        java.lang.Object obj16 = stackTestDriver0.pop();
        java.lang.Object obj17 = stackTestDriver0.peek();
        java.lang.Object obj18 = stackTestDriver0.peek();
        int int19 = stackTestDriver0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0f) + "'", obj8, (-1.0f));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test413");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        boolean boolean2 = stackTestDriver0.isEmpty();
        boolean boolean3 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        boolean boolean6 = stackTestDriver4.isEmpty();
        stackTestDriver4.clear();
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        int int9 = stackTestDriver8.size();
        boolean boolean10 = stackTestDriver8.isEmpty();
        java.lang.Object obj12 = stackTestDriver8.push((java.lang.Object) (-1.0f));
        java.lang.Object obj13 = stackTestDriver4.push((java.lang.Object) stackTestDriver8);
        java.lang.Object obj14 = stackTestDriver8.pop();
        stackTestDriver8.clear();
        stackTestDriver8.clear();
        int int17 = stackTestDriver8.size();
        java.lang.Object obj18 = stackTestDriver0.push((java.lang.Object) stackTestDriver8);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (-1.0f) + "'", obj12, (-1.0f));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1.0f) + "'", obj14, (-1.0f));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(obj18);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test414");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (-1.0f));
        boolean boolean5 = stackTestDriver0.isEmpty();
        java.lang.Object obj6 = stackTestDriver0.peek();
        experiment.util.StackTestDriver stackTestDriver7 = new experiment.util.StackTestDriver();
        int int8 = stackTestDriver7.size();
        boolean boolean9 = stackTestDriver7.isEmpty();
        java.lang.Object obj11 = stackTestDriver7.push((java.lang.Object) (-1.0f));
        boolean boolean12 = stackTestDriver7.isEmpty();
        boolean boolean13 = stackTestDriver7.isEmpty();
        java.lang.Object obj14 = stackTestDriver0.push((java.lang.Object) stackTestDriver7);
        java.lang.Object obj15 = stackTestDriver0.peek();
        java.lang.Object obj16 = stackTestDriver0.pop();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1.0f) + "'", obj4, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1.0f) + "'", obj6, (-1.0f));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (-1.0f) + "'", obj11, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(obj16);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test415");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) (short) 1);
        int int7 = stackTestDriver0.size();
        boolean boolean8 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver9 = new experiment.util.StackTestDriver();
        int int10 = stackTestDriver9.size();
        boolean boolean11 = stackTestDriver9.isEmpty();
        java.lang.Object obj13 = stackTestDriver9.push((java.lang.Object) (-1.0f));
        java.lang.Object obj15 = stackTestDriver9.push((java.lang.Object) (short) 1);
        int int16 = stackTestDriver9.size();
        int int17 = stackTestDriver9.size();
        java.lang.Object obj18 = stackTestDriver9.pop();
        java.lang.Object obj19 = stackTestDriver9.peek();
        java.lang.Object obj21 = stackTestDriver9.push((java.lang.Object) "");
        boolean boolean22 = stackTestDriver9.isEmpty();
        java.lang.Object obj23 = stackTestDriver0.push((java.lang.Object) boolean22);
        int int24 = stackTestDriver0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1.0f) + "'", obj4, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 1 + "'", obj6, (short) 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (-1.0f) + "'", obj13, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (short) 1 + "'", obj15, (short) 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (short) 1 + "'", obj18, (short) 1);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (-1.0f) + "'", obj19, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + "" + "'", obj21, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + false + "'", obj23, false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test416");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver2 = new experiment.util.StackTestDriver();
        int int3 = stackTestDriver2.size();
        boolean boolean4 = stackTestDriver2.isEmpty();
        java.lang.Object obj6 = stackTestDriver2.push((java.lang.Object) (-1.0f));
        java.lang.Object obj8 = stackTestDriver2.push((java.lang.Object) (short) 1);
        int int9 = stackTestDriver2.size();
        int int10 = stackTestDriver2.size();
        java.lang.Object obj11 = stackTestDriver2.pop();
        java.lang.Object obj12 = stackTestDriver0.push((java.lang.Object) stackTestDriver2);
        java.lang.Object obj13 = stackTestDriver2.peek();
        java.lang.Object obj14 = stackTestDriver2.pop();
        stackTestDriver2.clear();
        stackTestDriver2.clear();
        experiment.util.StackTestDriver stackTestDriver17 = new experiment.util.StackTestDriver();
        int int18 = stackTestDriver17.size();
        int int19 = stackTestDriver17.size();
        int int20 = stackTestDriver17.size();
        int int21 = stackTestDriver17.size();
        stackTestDriver17.clear();
        boolean boolean23 = stackTestDriver17.isEmpty();
        java.lang.Class<?> wildcardClass24 = stackTestDriver17.getClass();
        java.lang.Object obj25 = stackTestDriver2.push((java.lang.Object) stackTestDriver17);
        java.lang.Class<?> wildcardClass26 = stackTestDriver17.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1.0f) + "'", obj6, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (short) 1 + "'", obj8, (short) 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (short) 1 + "'", obj11, (short) 1);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (-1.0f) + "'", obj13, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1.0f) + "'", obj14, (-1.0f));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test417");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        boolean boolean3 = stackTestDriver0.isEmpty();
        boolean boolean4 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        boolean boolean6 = stackTestDriver0.isEmpty();
        int int7 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        int int9 = stackTestDriver8.size();
        boolean boolean10 = stackTestDriver8.isEmpty();
        int int11 = stackTestDriver8.size();
        stackTestDriver8.clear();
        experiment.util.StackTestDriver stackTestDriver13 = new experiment.util.StackTestDriver();
        int int14 = stackTestDriver13.size();
        boolean boolean15 = stackTestDriver13.isEmpty();
        java.lang.Object obj17 = stackTestDriver13.push((java.lang.Object) (-1.0f));
        boolean boolean18 = stackTestDriver13.isEmpty();
        java.lang.Object obj19 = stackTestDriver13.peek();
        java.lang.Object obj20 = stackTestDriver13.pop();
        stackTestDriver13.clear();
        java.lang.Object obj22 = stackTestDriver8.push((java.lang.Object) stackTestDriver13);
        experiment.util.StackTestDriver stackTestDriver23 = new experiment.util.StackTestDriver();
        int int24 = stackTestDriver23.size();
        boolean boolean25 = stackTestDriver23.isEmpty();
        java.lang.Class<?> wildcardClass26 = stackTestDriver23.getClass();
        java.lang.Object obj27 = stackTestDriver8.push((java.lang.Object) wildcardClass26);
        java.lang.Object obj28 = stackTestDriver0.push(obj27);
        java.lang.Object obj30 = stackTestDriver0.push((java.lang.Object) 2);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (-1.0f) + "'", obj17, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (-1.0f) + "'", obj19, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (-1.0f) + "'", obj20, (-1.0f));
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertEquals(obj27.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj27), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj27), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertEquals(obj28.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj28), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj28), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + 2 + "'", obj30, 2);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test418");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver2 = new experiment.util.StackTestDriver();
        int int3 = stackTestDriver2.size();
        boolean boolean4 = stackTestDriver2.isEmpty();
        java.lang.Object obj6 = stackTestDriver2.push((java.lang.Object) (-1.0f));
        java.lang.Object obj8 = stackTestDriver2.push((java.lang.Object) (short) 1);
        int int9 = stackTestDriver2.size();
        int int10 = stackTestDriver2.size();
        java.lang.Object obj11 = stackTestDriver2.pop();
        java.lang.Object obj12 = stackTestDriver0.push((java.lang.Object) stackTestDriver2);
        experiment.util.StackTestDriver stackTestDriver13 = new experiment.util.StackTestDriver();
        int int14 = stackTestDriver13.size();
        boolean boolean15 = stackTestDriver13.isEmpty();
        java.lang.Class<?> wildcardClass16 = stackTestDriver13.getClass();
        java.lang.Object obj17 = stackTestDriver0.push((java.lang.Object) stackTestDriver13);
        experiment.util.StackTestDriver stackTestDriver18 = new experiment.util.StackTestDriver();
        int int19 = stackTestDriver18.size();
        boolean boolean20 = stackTestDriver18.isEmpty();
        java.lang.Object obj22 = stackTestDriver18.push((java.lang.Object) (-1.0f));
        java.lang.Object obj24 = stackTestDriver18.push((java.lang.Object) (short) 1);
        int int25 = stackTestDriver18.size();
        int int26 = stackTestDriver18.size();
        java.lang.Object obj27 = stackTestDriver18.pop();
        java.lang.Object obj28 = stackTestDriver18.pop();
        boolean boolean29 = stackTestDriver18.isEmpty();
        boolean boolean30 = stackTestDriver18.isEmpty();
        java.lang.Object obj31 = stackTestDriver0.push((java.lang.Object) stackTestDriver18);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1.0f) + "'", obj6, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (short) 1 + "'", obj8, (short) 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (short) 1 + "'", obj11, (short) 1);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (-1.0f) + "'", obj22, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (short) 1 + "'", obj24, (short) 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + (short) 1 + "'", obj27, (short) 1);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + (-1.0f) + "'", obj28, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(obj31);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test419");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        int int2 = stackTestDriver0.size();
        stackTestDriver0.clear();
        int int4 = stackTestDriver0.size();
        int int5 = stackTestDriver0.size();
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
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test420");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        int int3 = stackTestDriver0.size();
        boolean boolean4 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test421");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) (short) 1);
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver9 = new experiment.util.StackTestDriver();
        int int10 = stackTestDriver9.size();
        boolean boolean11 = stackTestDriver9.isEmpty();
        stackTestDriver9.clear();
        experiment.util.StackTestDriver stackTestDriver13 = new experiment.util.StackTestDriver();
        int int14 = stackTestDriver13.size();
        boolean boolean15 = stackTestDriver13.isEmpty();
        java.lang.Object obj17 = stackTestDriver13.push((java.lang.Object) (-1.0f));
        java.lang.Object obj18 = stackTestDriver9.push((java.lang.Object) stackTestDriver13);
        java.lang.Object obj19 = stackTestDriver9.peek();
        java.lang.Object obj20 = stackTestDriver9.peek();
        java.lang.Object obj21 = stackTestDriver0.push(obj20);
        java.lang.Object obj22 = stackTestDriver0.peek();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1.0f) + "'", obj4, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 1 + "'", obj6, (short) 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (-1.0f) + "'", obj17, (-1.0f));
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(obj22);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test422");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        int int6 = stackTestDriver4.size();
        int int7 = stackTestDriver4.size();
        boolean boolean8 = stackTestDriver4.isEmpty();
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) boolean8);
        java.lang.Object obj10 = stackTestDriver0.pop();
        int int11 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver12 = new experiment.util.StackTestDriver();
        int int13 = stackTestDriver12.size();
        stackTestDriver12.clear();
        boolean boolean15 = stackTestDriver12.isEmpty();
        experiment.util.StackTestDriver stackTestDriver16 = new experiment.util.StackTestDriver();
        int int17 = stackTestDriver16.size();
        int int18 = stackTestDriver16.size();
        int int19 = stackTestDriver16.size();
        boolean boolean20 = stackTestDriver16.isEmpty();
        java.lang.Object obj21 = stackTestDriver12.push((java.lang.Object) boolean20);
        experiment.util.StackTestDriver stackTestDriver22 = new experiment.util.StackTestDriver();
        int int23 = stackTestDriver22.size();
        boolean boolean24 = stackTestDriver22.isEmpty();
        stackTestDriver22.clear();
        experiment.util.StackTestDriver stackTestDriver26 = new experiment.util.StackTestDriver();
        int int27 = stackTestDriver26.size();
        boolean boolean28 = stackTestDriver26.isEmpty();
        java.lang.Object obj30 = stackTestDriver26.push((java.lang.Object) (-1.0f));
        java.lang.Object obj31 = stackTestDriver22.push((java.lang.Object) stackTestDriver26);
        java.lang.Object obj32 = stackTestDriver12.push(obj31);
        java.lang.Object obj33 = stackTestDriver0.push(obj31);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + true + "'", obj9, true);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + true + "'", obj10, true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + true + "'", obj21, true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + (-1.0f) + "'", obj30, (-1.0f));
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertNotNull(obj33);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test423");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        boolean boolean6 = stackTestDriver4.isEmpty();
        java.lang.Object obj8 = stackTestDriver4.push((java.lang.Object) (-1.0f));
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        stackTestDriver0.clear();
        boolean boolean11 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        boolean boolean13 = stackTestDriver0.isEmpty();
        boolean boolean14 = stackTestDriver0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0f) + "'", obj8, (-1.0f));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test424");
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
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test425");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        boolean boolean6 = stackTestDriver4.isEmpty();
        java.lang.Object obj8 = stackTestDriver4.push((java.lang.Object) (-1.0f));
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        int int11 = stackTestDriver10.size();
        boolean boolean12 = stackTestDriver10.isEmpty();
        boolean boolean13 = stackTestDriver10.isEmpty();
        java.lang.Class<?> wildcardClass14 = stackTestDriver10.getClass();
        java.lang.Object obj15 = stackTestDriver0.push((java.lang.Object) stackTestDriver10);
        java.lang.Object obj16 = stackTestDriver0.pop();
        boolean boolean17 = stackTestDriver0.isEmpty();
        int int18 = stackTestDriver0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0f) + "'", obj8, (-1.0f));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test426");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        boolean boolean6 = stackTestDriver4.isEmpty();
        java.lang.Object obj8 = stackTestDriver4.push((java.lang.Object) (-1.0f));
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        java.lang.Object obj10 = stackTestDriver4.pop();
        experiment.util.StackTestDriver stackTestDriver11 = new experiment.util.StackTestDriver();
        int int12 = stackTestDriver11.size();
        boolean boolean13 = stackTestDriver11.isEmpty();
        java.lang.Object obj15 = stackTestDriver11.push((java.lang.Object) (-1.0f));
        stackTestDriver11.clear();
        boolean boolean17 = stackTestDriver11.isEmpty();
        experiment.util.StackTestDriver stackTestDriver18 = new experiment.util.StackTestDriver();
        int int19 = stackTestDriver18.size();
        int int20 = stackTestDriver18.size();
        int int21 = stackTestDriver18.size();
        int int22 = stackTestDriver18.size();
        stackTestDriver18.clear();
        java.lang.Object obj24 = stackTestDriver11.push((java.lang.Object) stackTestDriver18);
        java.lang.Object obj25 = stackTestDriver4.push(obj24);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0f) + "'", obj8, (-1.0f));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (-1.0f) + "'", obj10, (-1.0f));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (-1.0f) + "'", obj15, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(obj25);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test427");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (-1.0f));
        boolean boolean5 = stackTestDriver0.isEmpty();
        int int6 = stackTestDriver0.size();
        boolean boolean7 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        int int9 = stackTestDriver8.size();
        int int10 = stackTestDriver8.size();
        int int11 = stackTestDriver8.size();
        boolean boolean12 = stackTestDriver8.isEmpty();
        java.lang.Object obj13 = stackTestDriver0.push((java.lang.Object) boolean12);
        java.lang.Object obj15 = stackTestDriver0.push((java.lang.Object) 100L);
        experiment.util.StackTestDriver stackTestDriver16 = new experiment.util.StackTestDriver();
        int int17 = stackTestDriver16.size();
        boolean boolean18 = stackTestDriver16.isEmpty();
        java.lang.Object obj20 = stackTestDriver16.push((java.lang.Object) (-1.0f));
        java.lang.Object obj22 = stackTestDriver16.push((java.lang.Object) (short) 1);
        stackTestDriver16.clear();
        stackTestDriver16.clear();
        experiment.util.StackTestDriver stackTestDriver25 = new experiment.util.StackTestDriver();
        int int26 = stackTestDriver25.size();
        boolean boolean27 = stackTestDriver25.isEmpty();
        stackTestDriver25.clear();
        experiment.util.StackTestDriver stackTestDriver29 = new experiment.util.StackTestDriver();
        int int30 = stackTestDriver29.size();
        boolean boolean31 = stackTestDriver29.isEmpty();
        java.lang.Object obj33 = stackTestDriver29.push((java.lang.Object) (-1.0f));
        java.lang.Object obj34 = stackTestDriver25.push((java.lang.Object) stackTestDriver29);
        java.lang.Object obj35 = stackTestDriver25.peek();
        java.lang.Object obj36 = stackTestDriver25.peek();
        java.lang.Object obj37 = stackTestDriver16.push(obj36);
        stackTestDriver16.clear();
        java.lang.Object obj39 = stackTestDriver0.push((java.lang.Object) stackTestDriver16);
        java.lang.Class<?> wildcardClass40 = obj39.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1.0f) + "'", obj4, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + true + "'", obj13, true);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 100L + "'", obj15, 100L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (-1.0f) + "'", obj20, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (short) 1 + "'", obj22, (short) 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + (-1.0f) + "'", obj33, (-1.0f));
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test428");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver2 = new experiment.util.StackTestDriver();
        stackTestDriver2.clear();
        boolean boolean4 = stackTestDriver2.isEmpty();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) stackTestDriver2);
        int int6 = stackTestDriver2.size();
        experiment.util.StackTestDriver stackTestDriver7 = new experiment.util.StackTestDriver();
        int int8 = stackTestDriver7.size();
        int int9 = stackTestDriver7.size();
        int int10 = stackTestDriver7.size();
        experiment.util.StackTestDriver stackTestDriver11 = new experiment.util.StackTestDriver();
        int int12 = stackTestDriver11.size();
        boolean boolean13 = stackTestDriver11.isEmpty();
        stackTestDriver11.clear();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        int int16 = stackTestDriver15.size();
        boolean boolean17 = stackTestDriver15.isEmpty();
        java.lang.Object obj19 = stackTestDriver15.push((java.lang.Object) (-1.0f));
        java.lang.Object obj20 = stackTestDriver11.push((java.lang.Object) stackTestDriver15);
        experiment.util.StackTestDriver stackTestDriver21 = new experiment.util.StackTestDriver();
        int int22 = stackTestDriver21.size();
        boolean boolean23 = stackTestDriver21.isEmpty();
        boolean boolean24 = stackTestDriver21.isEmpty();
        java.lang.Class<?> wildcardClass25 = stackTestDriver21.getClass();
        java.lang.Object obj26 = stackTestDriver11.push((java.lang.Object) stackTestDriver21);
        java.lang.Object obj27 = stackTestDriver11.pop();
        java.lang.Object obj28 = stackTestDriver7.push(obj27);
        boolean boolean29 = stackTestDriver7.isEmpty();
        java.lang.Object obj30 = stackTestDriver2.push((java.lang.Object) stackTestDriver7);
        java.lang.Object obj31 = stackTestDriver7.peek();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (-1.0f) + "'", obj19, (-1.0f));
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertNotNull(obj31);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test429");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (-1.0f));
        boolean boolean5 = stackTestDriver0.isEmpty();
        java.lang.Object obj6 = stackTestDriver0.peek();
        experiment.util.StackTestDriver stackTestDriver7 = new experiment.util.StackTestDriver();
        int int8 = stackTestDriver7.size();
        boolean boolean9 = stackTestDriver7.isEmpty();
        int int10 = stackTestDriver7.size();
        boolean boolean11 = stackTestDriver7.isEmpty();
        java.lang.Object obj12 = stackTestDriver0.push((java.lang.Object) stackTestDriver7);
        java.lang.Object obj13 = stackTestDriver0.pop();
        java.lang.Object obj14 = stackTestDriver0.peek();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver16 = new experiment.util.StackTestDriver();
        int int17 = stackTestDriver16.size();
        boolean boolean18 = stackTestDriver16.isEmpty();
        java.lang.Object obj20 = stackTestDriver16.push((java.lang.Object) (-1.0f));
        java.lang.Object obj22 = stackTestDriver16.push((java.lang.Object) (short) 1);
        int int23 = stackTestDriver16.size();
        java.lang.Object obj24 = stackTestDriver16.peek();
        java.lang.Object obj25 = stackTestDriver16.peek();
        java.lang.Object obj26 = stackTestDriver0.push((java.lang.Object) stackTestDriver16);
        experiment.util.StackTestDriver stackTestDriver27 = new experiment.util.StackTestDriver();
        int int28 = stackTestDriver27.size();
        boolean boolean29 = stackTestDriver27.isEmpty();
        java.lang.Object obj31 = stackTestDriver27.push((java.lang.Object) 10.0d);
        stackTestDriver27.clear();
        boolean boolean33 = stackTestDriver27.isEmpty();
        stackTestDriver27.clear();
        java.lang.Object obj35 = stackTestDriver16.push((java.lang.Object) stackTestDriver27);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1.0f) + "'", obj4, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1.0f) + "'", obj6, (-1.0f));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1.0f) + "'", obj14, (-1.0f));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (-1.0f) + "'", obj20, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (short) 1 + "'", obj22, (short) 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (short) 1 + "'", obj24, (short) 1);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (short) 1 + "'", obj25, (short) 1);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 10.0d + "'", obj31, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(obj35);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test430");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        boolean boolean6 = stackTestDriver4.isEmpty();
        java.lang.Object obj8 = stackTestDriver4.push((java.lang.Object) (-1.0f));
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        int int11 = stackTestDriver10.size();
        boolean boolean12 = stackTestDriver10.isEmpty();
        boolean boolean13 = stackTestDriver10.isEmpty();
        java.lang.Class<?> wildcardClass14 = stackTestDriver10.getClass();
        java.lang.Object obj15 = stackTestDriver0.push((java.lang.Object) stackTestDriver10);
        java.lang.Object obj16 = stackTestDriver0.pop();
        java.lang.Object obj17 = stackTestDriver0.pop();
        int int18 = stackTestDriver0.size();
        java.lang.Class<?> wildcardClass19 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0f) + "'", obj8, (-1.0f));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test431");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        int int6 = stackTestDriver4.size();
        int int7 = stackTestDriver4.size();
        boolean boolean8 = stackTestDriver4.isEmpty();
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) boolean8);
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        int int11 = stackTestDriver10.size();
        boolean boolean12 = stackTestDriver10.isEmpty();
        stackTestDriver10.clear();
        int int14 = stackTestDriver10.size();
        java.lang.Object obj15 = stackTestDriver0.push((java.lang.Object) stackTestDriver10);
        java.lang.Object obj16 = stackTestDriver0.peek();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver18 = new experiment.util.StackTestDriver();
        boolean boolean19 = stackTestDriver18.isEmpty();
        stackTestDriver18.clear();
        int int21 = stackTestDriver18.size();
        int int22 = stackTestDriver18.size();
        java.lang.Object obj23 = stackTestDriver0.push((java.lang.Object) int22);
        java.lang.Class<?> wildcardClass24 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + true + "'", obj9, true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 0 + "'", obj23, 0);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test432");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) (short) 1);
        int int7 = stackTestDriver0.size();
        int int8 = stackTestDriver0.size();
        java.lang.Object obj9 = stackTestDriver0.pop();
        int int10 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver11 = new experiment.util.StackTestDriver();
        int int12 = stackTestDriver11.size();
        boolean boolean13 = stackTestDriver11.isEmpty();
        java.lang.Object obj15 = stackTestDriver11.push((java.lang.Object) (-1.0f));
        java.lang.Object obj17 = stackTestDriver11.push((java.lang.Object) (short) 1);
        stackTestDriver11.clear();
        stackTestDriver11.clear();
        stackTestDriver11.clear();
        java.lang.Object obj21 = stackTestDriver0.push((java.lang.Object) stackTestDriver11);
        int int22 = stackTestDriver11.size();
        int int23 = stackTestDriver11.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1.0f) + "'", obj4, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 1 + "'", obj6, (short) 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (short) 1 + "'", obj9, (short) 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (-1.0f) + "'", obj15, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (short) 1 + "'", obj17, (short) 1);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test433");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        boolean boolean4 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        int int6 = stackTestDriver0.size();
        boolean boolean7 = stackTestDriver0.isEmpty();
        int int8 = stackTestDriver0.size();
        boolean boolean9 = stackTestDriver0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test434");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        boolean boolean6 = stackTestDriver4.isEmpty();
        stackTestDriver4.clear();
        int int8 = stackTestDriver4.size();
        experiment.util.StackTestDriver stackTestDriver9 = new experiment.util.StackTestDriver();
        java.lang.Object obj10 = stackTestDriver4.push((java.lang.Object) stackTestDriver9);
        java.lang.Class<?> wildcardClass11 = obj10.getClass();
        java.lang.Object obj12 = stackTestDriver0.push(obj10);
        int int13 = stackTestDriver0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test435");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        int int6 = stackTestDriver4.size();
        int int7 = stackTestDriver4.size();
        boolean boolean8 = stackTestDriver4.isEmpty();
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) boolean8);
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        int int11 = stackTestDriver10.size();
        boolean boolean12 = stackTestDriver10.isEmpty();
        stackTestDriver10.clear();
        int int14 = stackTestDriver10.size();
        java.lang.Object obj15 = stackTestDriver0.push((java.lang.Object) stackTestDriver10);
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver17 = new experiment.util.StackTestDriver();
        int int18 = stackTestDriver17.size();
        int int19 = stackTestDriver17.size();
        int int20 = stackTestDriver17.size();
        int int21 = stackTestDriver17.size();
        stackTestDriver17.clear();
        experiment.util.StackTestDriver stackTestDriver23 = new experiment.util.StackTestDriver();
        int int24 = stackTestDriver23.size();
        boolean boolean25 = stackTestDriver23.isEmpty();
        java.lang.Object obj27 = stackTestDriver23.push((java.lang.Object) (-1.0f));
        java.lang.Object obj29 = stackTestDriver23.push((java.lang.Object) (short) 1);
        int int30 = stackTestDriver23.size();
        int int31 = stackTestDriver23.size();
        int int32 = stackTestDriver23.size();
        java.lang.Object obj33 = stackTestDriver17.push((java.lang.Object) stackTestDriver23);
        java.lang.Object obj34 = stackTestDriver23.pop();
        stackTestDriver23.clear();
        java.lang.Object obj36 = stackTestDriver0.push((java.lang.Object) stackTestDriver23);
        stackTestDriver0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + true + "'", obj9, true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + (-1.0f) + "'", obj27, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + (short) 1 + "'", obj29, (short) 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2 + "'", int31 == 2);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2 + "'", int32 == 2);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + (short) 1 + "'", obj34, (short) 1);
        org.junit.Assert.assertNotNull(obj36);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test436");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (-1.0f));
        boolean boolean5 = stackTestDriver0.isEmpty();
        java.lang.Object obj6 = stackTestDriver0.peek();
        experiment.util.StackTestDriver stackTestDriver7 = new experiment.util.StackTestDriver();
        int int8 = stackTestDriver7.size();
        boolean boolean9 = stackTestDriver7.isEmpty();
        int int10 = stackTestDriver7.size();
        boolean boolean11 = stackTestDriver7.isEmpty();
        java.lang.Object obj12 = stackTestDriver0.push((java.lang.Object) stackTestDriver7);
        java.lang.Object obj13 = stackTestDriver0.pop();
        java.lang.Object obj14 = stackTestDriver0.peek();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver16 = new experiment.util.StackTestDriver();
        int int17 = stackTestDriver16.size();
        boolean boolean18 = stackTestDriver16.isEmpty();
        java.lang.Object obj20 = stackTestDriver16.push((java.lang.Object) (-1.0f));
        java.lang.Object obj22 = stackTestDriver16.push((java.lang.Object) (short) 1);
        int int23 = stackTestDriver16.size();
        java.lang.Object obj24 = stackTestDriver16.peek();
        java.lang.Object obj25 = stackTestDriver16.peek();
        java.lang.Object obj26 = stackTestDriver0.push((java.lang.Object) stackTestDriver16);
        java.lang.Class<?> wildcardClass27 = stackTestDriver16.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1.0f) + "'", obj4, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1.0f) + "'", obj6, (-1.0f));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1.0f) + "'", obj14, (-1.0f));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (-1.0f) + "'", obj20, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (short) 1 + "'", obj22, (short) 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (short) 1 + "'", obj24, (short) 1);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (short) 1 + "'", obj25, (short) 1);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test437");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (-1.0f));
        boolean boolean5 = stackTestDriver0.isEmpty();
        int int6 = stackTestDriver0.size();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        int int9 = stackTestDriver8.size();
        boolean boolean10 = stackTestDriver8.isEmpty();
        java.lang.Object obj12 = stackTestDriver8.push((java.lang.Object) (-1.0f));
        java.lang.Object obj13 = stackTestDriver0.push(obj12);
        java.lang.Object obj14 = stackTestDriver0.peek();
        java.lang.Object obj15 = stackTestDriver0.peek();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1.0f) + "'", obj4, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (-1.0f) + "'", obj12, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (-1.0f) + "'", obj13, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1.0f) + "'", obj14, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (-1.0f) + "'", obj15, (-1.0f));
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test438");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        boolean boolean6 = stackTestDriver4.isEmpty();
        java.lang.Object obj8 = stackTestDriver4.push((java.lang.Object) (-1.0f));
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        int int11 = stackTestDriver10.size();
        boolean boolean12 = stackTestDriver10.isEmpty();
        boolean boolean13 = stackTestDriver10.isEmpty();
        java.lang.Class<?> wildcardClass14 = stackTestDriver10.getClass();
        java.lang.Object obj15 = stackTestDriver0.push((java.lang.Object) stackTestDriver10);
        java.lang.Object obj16 = stackTestDriver0.pop();
        java.lang.Object obj17 = stackTestDriver0.peek();
        java.lang.Object obj18 = stackTestDriver0.pop();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0f) + "'", obj8, (-1.0f));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNotNull(obj18);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test439");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        int int3 = stackTestDriver0.size();
        boolean boolean4 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        int int6 = stackTestDriver5.size();
        boolean boolean7 = stackTestDriver5.isEmpty();
        java.lang.Object obj9 = stackTestDriver5.push((java.lang.Object) (-1.0f));
        java.lang.Object obj11 = stackTestDriver5.push((java.lang.Object) (short) 1);
        stackTestDriver5.clear();
        int int13 = stackTestDriver5.size();
        int int14 = stackTestDriver5.size();
        java.lang.Object obj15 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        java.lang.Class<?> wildcardClass16 = stackTestDriver5.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (-1.0f) + "'", obj9, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (short) 1 + "'", obj11, (short) 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test440");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver2 = new experiment.util.StackTestDriver();
        int int3 = stackTestDriver2.size();
        boolean boolean4 = stackTestDriver2.isEmpty();
        java.lang.Object obj6 = stackTestDriver2.push((java.lang.Object) (-1.0f));
        java.lang.Object obj8 = stackTestDriver2.push((java.lang.Object) (short) 1);
        int int9 = stackTestDriver2.size();
        int int10 = stackTestDriver2.size();
        java.lang.Object obj11 = stackTestDriver2.pop();
        java.lang.Object obj12 = stackTestDriver0.push((java.lang.Object) stackTestDriver2);
        java.lang.Object obj13 = stackTestDriver2.peek();
        java.lang.Object obj14 = stackTestDriver2.pop();
        boolean boolean15 = stackTestDriver2.isEmpty();
        experiment.util.StackTestDriver stackTestDriver16 = new experiment.util.StackTestDriver();
        int int17 = stackTestDriver16.size();
        stackTestDriver16.clear();
        experiment.util.StackTestDriver stackTestDriver19 = new experiment.util.StackTestDriver();
        int int20 = stackTestDriver19.size();
        boolean boolean21 = stackTestDriver19.isEmpty();
        stackTestDriver19.clear();
        experiment.util.StackTestDriver stackTestDriver23 = new experiment.util.StackTestDriver();
        int int24 = stackTestDriver23.size();
        boolean boolean25 = stackTestDriver23.isEmpty();
        java.lang.Object obj27 = stackTestDriver23.push((java.lang.Object) (-1.0f));
        java.lang.Object obj28 = stackTestDriver19.push((java.lang.Object) stackTestDriver23);
        java.lang.Object obj29 = stackTestDriver19.peek();
        java.lang.Object obj30 = stackTestDriver19.peek();
        java.lang.Object obj31 = stackTestDriver16.push(obj30);
        int int32 = stackTestDriver16.size();
        java.lang.Object obj33 = stackTestDriver16.peek();
        java.lang.Class<?> wildcardClass34 = stackTestDriver16.getClass();
        java.lang.Object obj35 = stackTestDriver2.push((java.lang.Object) wildcardClass34);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1.0f) + "'", obj6, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (short) 1 + "'", obj8, (short) 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (short) 1 + "'", obj11, (short) 1);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (-1.0f) + "'", obj13, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1.0f) + "'", obj14, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + (-1.0f) + "'", obj27, (-1.0f));
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertEquals(obj35.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj35), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj35), "class experiment.util.StackTestDriver");
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test441");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) (short) 1);
        int int7 = stackTestDriver0.size();
        int int8 = stackTestDriver0.size();
        java.lang.Object obj9 = stackTestDriver0.pop();
        int int10 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver11 = new experiment.util.StackTestDriver();
        int int12 = stackTestDriver11.size();
        boolean boolean13 = stackTestDriver11.isEmpty();
        java.lang.Object obj15 = stackTestDriver11.push((java.lang.Object) (-1.0f));
        java.lang.Object obj17 = stackTestDriver11.push((java.lang.Object) (short) 1);
        stackTestDriver11.clear();
        stackTestDriver11.clear();
        stackTestDriver11.clear();
        java.lang.Object obj21 = stackTestDriver0.push((java.lang.Object) stackTestDriver11);
        experiment.util.StackTestDriver stackTestDriver22 = new experiment.util.StackTestDriver();
        int int23 = stackTestDriver22.size();
        boolean boolean24 = stackTestDriver22.isEmpty();
        stackTestDriver22.clear();
        experiment.util.StackTestDriver stackTestDriver26 = new experiment.util.StackTestDriver();
        int int27 = stackTestDriver26.size();
        boolean boolean28 = stackTestDriver26.isEmpty();
        java.lang.Object obj30 = stackTestDriver26.push((java.lang.Object) (-1.0f));
        java.lang.Object obj31 = stackTestDriver22.push((java.lang.Object) stackTestDriver26);
        experiment.util.StackTestDriver stackTestDriver32 = new experiment.util.StackTestDriver();
        int int33 = stackTestDriver32.size();
        boolean boolean34 = stackTestDriver32.isEmpty();
        boolean boolean35 = stackTestDriver32.isEmpty();
        java.lang.Class<?> wildcardClass36 = stackTestDriver32.getClass();
        java.lang.Object obj37 = stackTestDriver22.push((java.lang.Object) stackTestDriver32);
        java.lang.Object obj38 = stackTestDriver22.pop();
        java.lang.Object obj39 = stackTestDriver22.peek();
        int int40 = stackTestDriver22.size();
        java.lang.Object obj41 = stackTestDriver0.push((java.lang.Object) stackTestDriver22);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1.0f) + "'", obj4, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 1 + "'", obj6, (short) 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (short) 1 + "'", obj9, (short) 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (-1.0f) + "'", obj15, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (short) 1 + "'", obj17, (short) 1);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + (-1.0f) + "'", obj30, (-1.0f));
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNotNull(obj41);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test442");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        int int4 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        java.lang.Object obj7 = stackTestDriver0.pop();
        int int8 = stackTestDriver0.size();
        int int9 = stackTestDriver0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test443");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        int int3 = stackTestDriver0.size();
        boolean boolean4 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        int int6 = stackTestDriver5.size();
        boolean boolean7 = stackTestDriver5.isEmpty();
        java.lang.Object obj9 = stackTestDriver5.push((java.lang.Object) (-1.0f));
        java.lang.Object obj11 = stackTestDriver5.push((java.lang.Object) (short) 1);
        stackTestDriver5.clear();
        int int13 = stackTestDriver5.size();
        int int14 = stackTestDriver5.size();
        java.lang.Object obj15 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        boolean boolean16 = stackTestDriver5.isEmpty();
        int int17 = stackTestDriver5.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (-1.0f) + "'", obj9, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (short) 1 + "'", obj11, (short) 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test444");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        int int4 = stackTestDriver0.size();
        boolean boolean5 = stackTestDriver0.isEmpty();
        int int6 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver7 = new experiment.util.StackTestDriver();
        int int8 = stackTestDriver7.size();
        boolean boolean9 = stackTestDriver7.isEmpty();
        int int10 = stackTestDriver7.size();
        java.lang.Object obj11 = stackTestDriver0.push((java.lang.Object) stackTestDriver7);
        stackTestDriver0.clear();
        boolean boolean13 = stackTestDriver0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test445");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver2 = new experiment.util.StackTestDriver();
        int int3 = stackTestDriver2.size();
        boolean boolean4 = stackTestDriver2.isEmpty();
        java.lang.Object obj6 = stackTestDriver2.push((java.lang.Object) (-1.0f));
        java.lang.Object obj8 = stackTestDriver2.push((java.lang.Object) (short) 1);
        int int9 = stackTestDriver2.size();
        int int10 = stackTestDriver2.size();
        java.lang.Object obj11 = stackTestDriver2.pop();
        java.lang.Object obj12 = stackTestDriver0.push((java.lang.Object) stackTestDriver2);
        java.lang.Object obj13 = stackTestDriver2.peek();
        java.lang.Object obj14 = stackTestDriver2.pop();
        boolean boolean15 = stackTestDriver2.isEmpty();
        stackTestDriver2.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = stackTestDriver2.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1.0f) + "'", obj6, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (short) 1 + "'", obj8, (short) 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (short) 1 + "'", obj11, (short) 1);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (-1.0f) + "'", obj13, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1.0f) + "'", obj14, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test446");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        int int6 = stackTestDriver4.size();
        int int7 = stackTestDriver4.size();
        boolean boolean8 = stackTestDriver4.isEmpty();
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) boolean8);
        int int10 = stackTestDriver0.size();
        int int11 = stackTestDriver0.size();
        java.lang.Object obj12 = stackTestDriver0.peek();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + true + "'", obj9, true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + true + "'", obj12, true);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test447");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver2 = new experiment.util.StackTestDriver();
        stackTestDriver2.clear();
        boolean boolean4 = stackTestDriver2.isEmpty();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) stackTestDriver2);
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) 2);
        boolean boolean8 = stackTestDriver0.isEmpty();
        java.lang.Object obj9 = stackTestDriver0.pop();
        stackTestDriver0.clear();
        int int11 = stackTestDriver0.size();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 2 + "'", obj7, 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 2 + "'", obj9, 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test448");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        boolean boolean1 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver2 = new experiment.util.StackTestDriver();
        stackTestDriver2.clear();
        boolean boolean4 = stackTestDriver2.isEmpty();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) stackTestDriver2);
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) 2);
        boolean boolean8 = stackTestDriver0.isEmpty();
        java.lang.Object obj9 = stackTestDriver0.peek();
        boolean boolean10 = stackTestDriver0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 2 + "'", obj7, 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 2 + "'", obj9, 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test449");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        boolean boolean6 = stackTestDriver4.isEmpty();
        java.lang.Object obj8 = stackTestDriver4.push((java.lang.Object) (-1.0f));
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        int int11 = stackTestDriver10.size();
        boolean boolean12 = stackTestDriver10.isEmpty();
        boolean boolean13 = stackTestDriver10.isEmpty();
        java.lang.Class<?> wildcardClass14 = stackTestDriver10.getClass();
        java.lang.Object obj15 = stackTestDriver0.push((java.lang.Object) stackTestDriver10);
        java.lang.Object obj16 = stackTestDriver0.pop();
        boolean boolean17 = stackTestDriver0.isEmpty();
        java.lang.Object obj18 = stackTestDriver0.peek();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0f) + "'", obj8, (-1.0f));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(obj18);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test450");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        int int3 = stackTestDriver0.size();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        int int6 = stackTestDriver5.size();
        boolean boolean7 = stackTestDriver5.isEmpty();
        java.lang.Object obj9 = stackTestDriver5.push((java.lang.Object) (-1.0f));
        boolean boolean10 = stackTestDriver5.isEmpty();
        java.lang.Object obj11 = stackTestDriver5.peek();
        java.lang.Object obj12 = stackTestDriver5.pop();
        stackTestDriver5.clear();
        java.lang.Object obj14 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        int int16 = stackTestDriver15.size();
        boolean boolean17 = stackTestDriver15.isEmpty();
        java.lang.Class<?> wildcardClass18 = stackTestDriver15.getClass();
        java.lang.Object obj19 = stackTestDriver0.push((java.lang.Object) wildcardClass18);
        experiment.util.StackTestDriver stackTestDriver20 = new experiment.util.StackTestDriver();
        int int21 = stackTestDriver20.size();
        boolean boolean22 = stackTestDriver20.isEmpty();
        stackTestDriver20.clear();
        experiment.util.StackTestDriver stackTestDriver24 = new experiment.util.StackTestDriver();
        int int25 = stackTestDriver24.size();
        boolean boolean26 = stackTestDriver24.isEmpty();
        java.lang.Object obj28 = stackTestDriver24.push((java.lang.Object) (-1.0f));
        java.lang.Object obj29 = stackTestDriver20.push((java.lang.Object) stackTestDriver24);
        stackTestDriver20.clear();
        java.lang.Object obj31 = stackTestDriver0.push((java.lang.Object) stackTestDriver20);
        java.lang.Class<?> wildcardClass32 = obj31.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (-1.0f) + "'", obj9, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (-1.0f) + "'", obj11, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (-1.0f) + "'", obj12, (-1.0f));
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + (-1.0f) + "'", obj28, (-1.0f));
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test451");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
        boolean boolean4 = stackTestDriver0.isEmpty();
        int int5 = stackTestDriver0.size();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test452");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (-1.0f));
        boolean boolean5 = stackTestDriver0.isEmpty();
        java.lang.Object obj6 = stackTestDriver0.peek();
        experiment.util.StackTestDriver stackTestDriver7 = new experiment.util.StackTestDriver();
        int int8 = stackTestDriver7.size();
        boolean boolean9 = stackTestDriver7.isEmpty();
        java.lang.Object obj11 = stackTestDriver7.push((java.lang.Object) (-1.0f));
        boolean boolean12 = stackTestDriver7.isEmpty();
        boolean boolean13 = stackTestDriver7.isEmpty();
        java.lang.Object obj14 = stackTestDriver0.push((java.lang.Object) stackTestDriver7);
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver16 = new experiment.util.StackTestDriver();
        int int17 = stackTestDriver16.size();
        int int18 = stackTestDriver16.size();
        int int19 = stackTestDriver16.size();
        int int20 = stackTestDriver16.size();
        boolean boolean21 = stackTestDriver16.isEmpty();
        int int22 = stackTestDriver16.size();
        experiment.util.StackTestDriver stackTestDriver23 = new experiment.util.StackTestDriver();
        int int24 = stackTestDriver23.size();
        boolean boolean25 = stackTestDriver23.isEmpty();
        stackTestDriver23.clear();
        java.lang.Class<?> wildcardClass27 = stackTestDriver23.getClass();
        java.lang.Object obj28 = stackTestDriver16.push((java.lang.Object) stackTestDriver23);
        java.lang.Object obj29 = stackTestDriver0.push(obj28);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1.0f) + "'", obj4, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1.0f) + "'", obj6, (-1.0f));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (-1.0f) + "'", obj11, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertNotNull(obj29);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test453");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        boolean boolean6 = stackTestDriver4.isEmpty();
        java.lang.Object obj8 = stackTestDriver4.push((java.lang.Object) (-1.0f));
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        java.lang.Object obj10 = stackTestDriver0.peek();
        stackTestDriver0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0f) + "'", obj8, (-1.0f));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test454");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        boolean boolean3 = stackTestDriver0.isEmpty();
        boolean boolean4 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        int int6 = stackTestDriver0.size();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        int int9 = stackTestDriver0.size();
        boolean boolean10 = stackTestDriver0.isEmpty();
        boolean boolean11 = stackTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = stackTestDriver0.peek();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test455");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) (-1.0f));
        boolean boolean5 = stackTestDriver0.isEmpty();
        java.lang.Object obj6 = stackTestDriver0.peek();
        experiment.util.StackTestDriver stackTestDriver7 = new experiment.util.StackTestDriver();
        int int8 = stackTestDriver7.size();
        boolean boolean9 = stackTestDriver7.isEmpty();
        int int10 = stackTestDriver7.size();
        boolean boolean11 = stackTestDriver7.isEmpty();
        java.lang.Object obj12 = stackTestDriver0.push((java.lang.Object) stackTestDriver7);
        java.lang.Object obj13 = stackTestDriver0.pop();
        java.lang.Object obj14 = stackTestDriver0.peek();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver16 = new experiment.util.StackTestDriver();
        int int17 = stackTestDriver16.size();
        boolean boolean18 = stackTestDriver16.isEmpty();
        java.lang.Object obj20 = stackTestDriver16.push((java.lang.Object) (-1.0f));
        java.lang.Object obj22 = stackTestDriver16.push((java.lang.Object) (short) 1);
        int int23 = stackTestDriver16.size();
        java.lang.Object obj24 = stackTestDriver16.peek();
        java.lang.Object obj25 = stackTestDriver16.peek();
        java.lang.Object obj26 = stackTestDriver0.push((java.lang.Object) stackTestDriver16);
        java.lang.Object obj27 = stackTestDriver16.peek();
        boolean boolean28 = stackTestDriver16.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1.0f) + "'", obj4, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1.0f) + "'", obj6, (-1.0f));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1.0f) + "'", obj14, (-1.0f));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (-1.0f) + "'", obj20, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (short) 1 + "'", obj22, (short) 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (short) 1 + "'", obj24, (short) 1);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (short) 1 + "'", obj25, (short) 1);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + (short) 1 + "'", obj27, (short) 1);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test456");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean3 = stackTestDriver0.isEmpty();
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
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test457");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        boolean boolean6 = stackTestDriver4.isEmpty();
        java.lang.Object obj8 = stackTestDriver4.push((java.lang.Object) (-1.0f));
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        java.lang.Object obj10 = stackTestDriver4.pop();
        stackTestDriver4.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = stackTestDriver4.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0f) + "'", obj8, (-1.0f));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (-1.0f) + "'", obj10, (-1.0f));
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test458");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        int int4 = stackTestDriver0.size();
        stackTestDriver0.clear();
        boolean boolean6 = stackTestDriver0.isEmpty();
        boolean boolean7 = stackTestDriver0.isEmpty();
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        boolean boolean9 = stackTestDriver8.isEmpty();
        int int10 = stackTestDriver8.size();
        int int11 = stackTestDriver8.size();
        int int12 = stackTestDriver8.size();
        experiment.util.StackTestDriver stackTestDriver13 = new experiment.util.StackTestDriver();
        boolean boolean14 = stackTestDriver13.isEmpty();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        int int16 = stackTestDriver15.size();
        boolean boolean17 = stackTestDriver15.isEmpty();
        java.lang.Object obj19 = stackTestDriver15.push((java.lang.Object) (-1.0f));
        java.lang.Object obj21 = stackTestDriver15.push((java.lang.Object) (short) 1);
        stackTestDriver15.clear();
        stackTestDriver15.clear();
        experiment.util.StackTestDriver stackTestDriver24 = new experiment.util.StackTestDriver();
        int int25 = stackTestDriver24.size();
        boolean boolean26 = stackTestDriver24.isEmpty();
        stackTestDriver24.clear();
        experiment.util.StackTestDriver stackTestDriver28 = new experiment.util.StackTestDriver();
        int int29 = stackTestDriver28.size();
        boolean boolean30 = stackTestDriver28.isEmpty();
        java.lang.Object obj32 = stackTestDriver28.push((java.lang.Object) (-1.0f));
        java.lang.Object obj33 = stackTestDriver24.push((java.lang.Object) stackTestDriver28);
        java.lang.Object obj34 = stackTestDriver24.peek();
        java.lang.Object obj35 = stackTestDriver24.peek();
        java.lang.Object obj36 = stackTestDriver15.push(obj35);
        java.lang.Object obj37 = stackTestDriver13.push(obj35);
        java.lang.Object obj38 = stackTestDriver8.push(obj35);
        java.lang.Object obj39 = stackTestDriver8.peek();
        java.lang.Class<?> wildcardClass40 = stackTestDriver8.getClass();
        java.lang.Object obj41 = stackTestDriver0.push((java.lang.Object) wildcardClass40);
        int int42 = stackTestDriver0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (-1.0f) + "'", obj19, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (short) 1 + "'", obj21, (short) 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + (-1.0f) + "'", obj32, (-1.0f));
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertEquals(obj41.toString(), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj41), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj41), "class experiment.util.StackTestDriver");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test459");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        int int2 = stackTestDriver0.size();
        int int3 = stackTestDriver0.size();
        int int4 = stackTestDriver0.size();
        boolean boolean5 = stackTestDriver0.isEmpty();
        int int6 = stackTestDriver0.size();
        boolean boolean7 = stackTestDriver0.isEmpty();
        int int8 = stackTestDriver0.size();
        java.lang.Class<?> wildcardClass9 = stackTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test460");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        boolean boolean3 = stackTestDriver0.isEmpty();
        boolean boolean4 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        boolean boolean6 = stackTestDriver0.isEmpty();
        int int7 = stackTestDriver0.size();
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        boolean boolean9 = stackTestDriver8.isEmpty();
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        stackTestDriver10.clear();
        boolean boolean12 = stackTestDriver10.isEmpty();
        java.lang.Object obj13 = stackTestDriver8.push((java.lang.Object) stackTestDriver10);
        java.lang.Object obj14 = stackTestDriver0.push((java.lang.Object) stackTestDriver8);
        stackTestDriver0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test461");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        stackTestDriver0.clear();
        int int3 = stackTestDriver0.size();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (byte) 100);
        java.lang.Object obj6 = stackTestDriver0.peek();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) 100 + "'", obj5, (byte) 100);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 100 + "'", obj6, (byte) 100);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test462");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        int int1 = stackTestDriver0.size();
        boolean boolean2 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        int int5 = stackTestDriver4.size();
        boolean boolean6 = stackTestDriver4.isEmpty();
        java.lang.Object obj8 = stackTestDriver4.push((java.lang.Object) (-1.0f));
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) stackTestDriver4);
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        int int11 = stackTestDriver10.size();
        boolean boolean12 = stackTestDriver10.isEmpty();
        boolean boolean13 = stackTestDriver10.isEmpty();
        java.lang.Class<?> wildcardClass14 = stackTestDriver10.getClass();
        java.lang.Object obj15 = stackTestDriver0.push((java.lang.Object) stackTestDriver10);
        boolean boolean16 = stackTestDriver0.isEmpty();
        stackTestDriver0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0f) + "'", obj8, (-1.0f));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_379375655_1024_0.test463");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver2 = new experiment.util.StackTestDriver();
        int int3 = stackTestDriver2.size();
        boolean boolean4 = stackTestDriver2.isEmpty();
        java.lang.Object obj6 = stackTestDriver2.push((java.lang.Object) (-1.0f));
        java.lang.Object obj8 = stackTestDriver2.push((java.lang.Object) (short) 1);
        int int9 = stackTestDriver2.size();
        int int10 = stackTestDriver2.size();
        java.lang.Object obj11 = stackTestDriver2.pop();
        java.lang.Object obj12 = stackTestDriver0.push((java.lang.Object) stackTestDriver2);
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (-1.0f) + "'", obj6, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (short) 1 + "'", obj8, (short) 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (short) 1 + "'", obj11, (short) 1);
        org.junit.Assert.assertNotNull(obj12);
    }
}

