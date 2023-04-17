package experiment.util.test;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Regression_LinkedListTest_54676380_32_s {

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
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test001");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = linkedListTestDriver0.remove(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test002");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray1 = linkedListTestDriver0.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = linkedListTestDriver0.getFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test003");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj1 = linkedListTestDriver0.getLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test004");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray1 = linkedListTestDriver0.toArray();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj5 = linkedListTestDriver0.remove((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = linkedListTestDriver0.remove((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) 10 + "'", obj5, (byte) 10);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test005");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray1 = linkedListTestDriver0.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = linkedListTestDriver0.removeLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test006");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray1 = linkedListTestDriver0.toArray();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = linkedListTestDriver0.get((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test007");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) 1.0f);
        boolean boolean4 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = linkedListTestDriver0.getFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test008");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = linkedListTestDriver0.remove((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test009");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) 1.0f);
        boolean boolean4 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1.0d);
        java.lang.Object obj5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = linkedListTestDriver0.remove(obj5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test010");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray1 = linkedListTestDriver0.toArray();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj5 = linkedListTestDriver0.remove((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = linkedListTestDriver0.getLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) 10 + "'", obj5, (byte) 10);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test011");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) 1.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = linkedListTestDriver0.get(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test012");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) 1.0f);
        boolean boolean4 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = linkedListTestDriver0.removeFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test013");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        int int1 = linkedListTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = linkedListTestDriver0.remove((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test014");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) 1.0f);
        boolean boolean3 = linkedListTestDriver0.isEmpty();
        java.lang.Object[] objArray4 = linkedListTestDriver0.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = linkedListTestDriver0.get(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test015");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        int int1 = linkedListTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator3 = linkedListTestDriver0.listIterator((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 1; size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test016");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        int int1 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver3 = new experiment.util.LinkedListTestDriver();
        boolean boolean5 = linkedListTestDriver3.contains((java.lang.Object) 1.0f);
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.add((int) (byte) -1, (java.lang.Object) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: -1; size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test017");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) 1.0f);
        boolean boolean4 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1.0d);
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray6 = linkedListTestDriver5.toArray();
        linkedListTestDriver5.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj10 = linkedListTestDriver5.remove((int) (short) 0);
        java.lang.Class<?> wildcardClass11 = linkedListTestDriver5.getClass();
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver5);
        java.lang.Object obj14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = linkedListTestDriver5.set(100, obj14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) 10 + "'", obj10, (byte) 10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test018");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) 1.0f);
        boolean boolean4 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1.0d);
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        boolean boolean7 = linkedListTestDriver5.contains((java.lang.Object) 1.0f);
        boolean boolean9 = linkedListTestDriver5.equals_CUT((java.lang.Object) 1.0d);
        boolean boolean10 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = linkedListTestDriver5.removeFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test019");
        experiment.util.Collection collection0 = null;
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.LinkedListTestDriver linkedListTestDriver1 = new experiment.util.LinkedListTestDriver(collection0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test020");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        java.lang.Object obj1 = null;
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.addFirst(obj1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test021");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) 1.0f);
        boolean boolean3 = linkedListTestDriver0.isEmpty();
        java.lang.Object[] objArray4 = linkedListTestDriver0.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = linkedListTestDriver0.getLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test022");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) 1.0f);
        boolean boolean4 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1.0d);
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.add(10, (java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 10; size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test023");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) 1.0f);
        boolean boolean4 = linkedListTestDriver0.contains((java.lang.Object) (-1L));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = linkedListTestDriver0.getFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test024");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) 1.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = linkedListTestDriver0.getFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test025");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray1 = linkedListTestDriver0.toArray();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj5 = linkedListTestDriver0.remove((int) (short) 0);
        linkedListTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator8 = linkedListTestDriver0.listIterator((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: -1; size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) 10 + "'", obj5, (byte) 10);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test026");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) 1.0f);
        boolean boolean4 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1.0d);
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        boolean boolean7 = linkedListTestDriver5.contains((java.lang.Object) 1.0f);
        boolean boolean9 = linkedListTestDriver5.equals_CUT((java.lang.Object) 1.0d);
        boolean boolean10 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver5);
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray13 = linkedListTestDriver12.toArray();
        linkedListTestDriver12.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver12.addLast((java.lang.Object) 100.0d);
        java.lang.Class<?> wildcardClass18 = linkedListTestDriver12.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = linkedListTestDriver0.set((int) '4', (java.lang.Object) wildcardClass18);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test027");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray1 = linkedListTestDriver0.toArray();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        boolean boolean6 = linkedListTestDriver4.contains((java.lang.Object) 1.0f);
        boolean boolean7 = linkedListTestDriver4.isEmpty();
        java.lang.Object[] objArray8 = linkedListTestDriver4.toArray();
        boolean boolean9 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = linkedListTestDriver4.removeLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test028");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) 1.0f);
        boolean boolean4 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1.0d);
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        boolean boolean7 = linkedListTestDriver5.contains((java.lang.Object) 1.0f);
        boolean boolean9 = linkedListTestDriver5.equals_CUT((java.lang.Object) 1.0d);
        boolean boolean10 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver5);
        java.lang.Class<?> wildcardClass11 = linkedListTestDriver5.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test029");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) 1.0f);
        boolean boolean3 = linkedListTestDriver0.isEmpty();
        java.lang.Object[] objArray4 = linkedListTestDriver0.toArray();
        boolean boolean6 = linkedListTestDriver0.equals_CUT((java.lang.Object) 0L);
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        int int9 = linkedListTestDriver8.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        int int11 = linkedListTestDriver10.size();
        linkedListTestDriver8.addFirst((java.lang.Object) int11);
        experiment.util.ListIterator listIterator14 = linkedListTestDriver8.listIterator(1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = linkedListTestDriver0.set(1, (java.lang.Object) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(listIterator14);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test030");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj1 = linkedListTestDriver0.removeLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test031");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        int int1 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver2 = new experiment.util.LinkedListTestDriver();
        int int3 = linkedListTestDriver2.size();
        linkedListTestDriver0.addFirst((java.lang.Object) int3);
        boolean boolean5 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        boolean boolean8 = linkedListTestDriver6.contains((java.lang.Object) 1.0f);
        boolean boolean10 = linkedListTestDriver6.equals_CUT((java.lang.Object) 1.0d);
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        boolean boolean13 = linkedListTestDriver11.contains((java.lang.Object) 1.0f);
        boolean boolean15 = linkedListTestDriver11.equals_CUT((java.lang.Object) 1.0d);
        boolean boolean16 = linkedListTestDriver6.remove((java.lang.Object) linkedListTestDriver11);
        linkedListTestDriver0.addFirst((java.lang.Object) boolean16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = linkedListTestDriver0.remove((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test032");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) 1.0f);
        boolean boolean4 = linkedListTestDriver0.remove((java.lang.Object) 1.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = linkedListTestDriver0.remove((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

}
