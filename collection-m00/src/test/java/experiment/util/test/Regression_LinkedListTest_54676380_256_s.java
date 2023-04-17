package experiment.util.test;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Regression_LinkedListTest_54676380_256_s {

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

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test033");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) 1.0f);
        boolean boolean4 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1.0d);
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray6 = linkedListTestDriver5.toArray();
        linkedListTestDriver5.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj10 = linkedListTestDriver5.remove((int) (short) 0);
        java.lang.Class<?> wildcardClass11 = linkedListTestDriver5.getClass();
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver5);
        linkedListTestDriver0.addFirst((java.lang.Object) 1.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = linkedListTestDriver0.set((int) (short) 100, (java.lang.Object) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test034");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) 1.0f);
        boolean boolean4 = linkedListTestDriver0.remove((java.lang.Object) 1.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = linkedListTestDriver0.getLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test035");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        int int1 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver2 = new experiment.util.LinkedListTestDriver();
        int int3 = linkedListTestDriver2.size();
        linkedListTestDriver0.addFirst((java.lang.Object) int3);
        boolean boolean5 = linkedListTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = linkedListTestDriver0.remove((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test036");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        int int1 = linkedListTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = linkedListTestDriver0.getFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test037");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        int int1 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver2 = new experiment.util.LinkedListTestDriver();
        int int3 = linkedListTestDriver2.size();
        linkedListTestDriver0.addFirst((java.lang.Object) int3);
        boolean boolean5 = linkedListTestDriver0.isEmpty();
        boolean boolean7 = linkedListTestDriver0.equals_CUT((java.lang.Object) 10.0d);
        java.lang.Object obj8 = linkedListTestDriver0.removeFirst();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = linkedListTestDriver0.removeFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0 + "'", obj8, 0);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test038");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) 1.0f);
        boolean boolean4 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1.0d);
        boolean boolean6 = linkedListTestDriver0.remove((java.lang.Object) '4');
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator8 = linkedListTestDriver0.listIterator((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 1; size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test039");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) 1.0f);
        boolean boolean4 = linkedListTestDriver0.contains((java.lang.Object) (-1L));
        boolean boolean5 = linkedListTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = linkedListTestDriver0.remove((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test040");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray1 = linkedListTestDriver0.toArray();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.addLast((java.lang.Object) 100.0d);
        linkedListTestDriver0.clear();
        java.lang.Object obj7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = linkedListTestDriver0.contains(obj7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test041");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray1 = linkedListTestDriver0.toArray();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj5 = linkedListTestDriver0.remove((int) (short) 0);
        int int6 = linkedListTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = linkedListTestDriver0.remove(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) 10 + "'", obj5, (byte) 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test042");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) 1.0f);
        boolean boolean4 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1.0d);
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        boolean boolean7 = linkedListTestDriver5.contains((java.lang.Object) 1.0f);
        boolean boolean9 = linkedListTestDriver5.equals_CUT((java.lang.Object) 1.0d);
        boolean boolean10 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver5);
        experiment.util.Iterator iterator11 = linkedListTestDriver0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = linkedListTestDriver0.removeLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(iterator11);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test043");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) 1.0f);
        boolean boolean3 = linkedListTestDriver0.isEmpty();
        java.lang.Object[] objArray4 = linkedListTestDriver0.toArray();
        experiment.util.Iterator iterator5 = linkedListTestDriver0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = linkedListTestDriver0.get((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(iterator5);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test044");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray1 = linkedListTestDriver0.toArray();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj5 = linkedListTestDriver0.remove((int) (short) 0);
        linkedListTestDriver0.clear();
        int int7 = linkedListTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = linkedListTestDriver0.get((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) 10 + "'", obj5, (byte) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test045");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray1 = linkedListTestDriver0.toArray();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj5 = linkedListTestDriver0.remove((int) (short) 0);
        linkedListTestDriver0.clear();
        int int7 = linkedListTestDriver0.size();
        experiment.util.Iterator iterator8 = linkedListTestDriver0.iterator();
        java.lang.Object[] objArray9 = linkedListTestDriver0.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = linkedListTestDriver0.remove((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) 10 + "'", obj5, (byte) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test046");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        int int1 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver2 = new experiment.util.LinkedListTestDriver();
        int int3 = linkedListTestDriver2.size();
        linkedListTestDriver0.addFirst((java.lang.Object) int3);
        boolean boolean5 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        boolean boolean8 = linkedListTestDriver6.contains((java.lang.Object) 1.0f);
        boolean boolean10 = linkedListTestDriver6.equals_CUT((java.lang.Object) 1.0d);
        boolean boolean11 = linkedListTestDriver0.contains((java.lang.Object) boolean10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = linkedListTestDriver0.get((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test047");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) 1.0f);
        boolean boolean4 = linkedListTestDriver0.contains((java.lang.Object) (-1L));
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        boolean boolean7 = linkedListTestDriver5.contains((java.lang.Object) 1.0f);
        boolean boolean9 = linkedListTestDriver5.equals_CUT((java.lang.Object) 1.0d);
        boolean boolean11 = linkedListTestDriver5.remove((java.lang.Object) '4');
        boolean boolean12 = linkedListTestDriver0.equals_CUT((java.lang.Object) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = linkedListTestDriver0.removeFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test048");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        int int1 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver2 = new experiment.util.LinkedListTestDriver();
        int int3 = linkedListTestDriver2.size();
        linkedListTestDriver0.addFirst((java.lang.Object) int3);
        boolean boolean5 = linkedListTestDriver0.isEmpty();
        boolean boolean7 = linkedListTestDriver0.equals_CUT((java.lang.Object) 10.0d);
        experiment.util.Iterator iterator8 = linkedListTestDriver0.iterator();
        java.lang.Class<?> wildcardClass9 = linkedListTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test049");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) 1.0f);
        boolean boolean4 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1.0d);
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray6 = linkedListTestDriver5.toArray();
        linkedListTestDriver5.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj10 = linkedListTestDriver5.remove((int) (short) 0);
        java.lang.Class<?> wildcardClass11 = linkedListTestDriver5.getClass();
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver5);
        java.lang.Object obj13 = null;
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver5.addLast(obj13);
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
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test050");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) 1.0f);
        boolean boolean4 = linkedListTestDriver0.remove((java.lang.Object) 1.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = linkedListTestDriver0.remove((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test051");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray1 = linkedListTestDriver0.toArray();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj5 = linkedListTestDriver0.remove((int) (short) 0);
        linkedListTestDriver0.clear();
        int int7 = linkedListTestDriver0.size();
        experiment.util.Iterator iterator8 = linkedListTestDriver0.iterator();
        java.lang.Object[] objArray9 = linkedListTestDriver0.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = linkedListTestDriver0.removeLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) 10 + "'", obj5, (byte) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test052");
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
            java.lang.Object obj11 = linkedListTestDriver0.get(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test053");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) 1.0f);
        boolean boolean4 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1.0d);
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray6 = linkedListTestDriver5.toArray();
        linkedListTestDriver5.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj10 = linkedListTestDriver5.remove((int) (short) 0);
        java.lang.Class<?> wildcardClass11 = linkedListTestDriver5.getClass();
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver5);
        linkedListTestDriver0.addFirst((java.lang.Object) 1.0d);
        boolean boolean16 = linkedListTestDriver0.remove((java.lang.Object) (short) 10);
        linkedListTestDriver0.addLast((java.lang.Object) (short) 1);
        int int19 = linkedListTestDriver0.size();
        java.lang.Class<?> wildcardClass20 = linkedListTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) 10 + "'", obj10, (byte) 10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test054");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        int int1 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver2 = new experiment.util.LinkedListTestDriver();
        int int3 = linkedListTestDriver2.size();
        linkedListTestDriver0.addFirst((java.lang.Object) int3);
        experiment.util.ListIterator listIterator6 = linkedListTestDriver0.listIterator(1);
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator8 = linkedListTestDriver0.listIterator(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 10; size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(listIterator6);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test055");
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
            java.lang.Object obj11 = linkedListTestDriver0.remove((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test056");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray1 = linkedListTestDriver0.toArray();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj5 = linkedListTestDriver0.remove((int) (short) 0);
        linkedListTestDriver0.clear();
        int int7 = linkedListTestDriver0.size();
        experiment.util.Iterator iterator8 = linkedListTestDriver0.iterator();
        java.lang.Object[] objArray9 = linkedListTestDriver0.toArray();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator11 = linkedListTestDriver0.listIterator(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 1; size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) 10 + "'", obj5, (byte) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test057");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) 1.0f);
        boolean boolean3 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        boolean boolean6 = linkedListTestDriver4.contains((java.lang.Object) 1.0f);
        boolean boolean7 = linkedListTestDriver4.isEmpty();
        boolean boolean8 = linkedListTestDriver4.isEmpty();
        boolean boolean10 = linkedListTestDriver4.contains((java.lang.Object) 10);
        boolean boolean11 = linkedListTestDriver0.add((java.lang.Object) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = linkedListTestDriver0.get((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test058");
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
            experiment.util.ListIterator listIterator19 = linkedListTestDriver0.listIterator((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 10; size: 2");
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
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test059");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        int int1 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver2 = new experiment.util.LinkedListTestDriver();
        int int3 = linkedListTestDriver2.size();
        linkedListTestDriver0.addFirst((java.lang.Object) int3);
        boolean boolean5 = linkedListTestDriver0.isEmpty();
        boolean boolean7 = linkedListTestDriver0.equals_CUT((java.lang.Object) 10.0d);
        java.lang.Object obj8 = linkedListTestDriver0.removeFirst();
        java.lang.Object[] objArray9 = linkedListTestDriver0.toArray();
        boolean boolean10 = linkedListTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = linkedListTestDriver0.removeLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0 + "'", obj8, 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test060");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        int int1 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver2 = new experiment.util.LinkedListTestDriver();
        int int3 = linkedListTestDriver2.size();
        linkedListTestDriver0.addFirst((java.lang.Object) int3);
        experiment.util.ListIterator listIterator6 = linkedListTestDriver0.listIterator(1);
        int int7 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        int int10 = linkedListTestDriver9.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        int int12 = linkedListTestDriver11.size();
        linkedListTestDriver9.addFirst((java.lang.Object) int12);
        boolean boolean14 = linkedListTestDriver9.isEmpty();
        boolean boolean16 = linkedListTestDriver9.equals_CUT((java.lang.Object) 10.0d);
        java.lang.Object obj17 = linkedListTestDriver9.removeFirst();
        linkedListTestDriver0.add((int) (short) 1, obj17);
        java.lang.Class<?> wildcardClass19 = obj17.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(listIterator6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 0 + "'", obj17, 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test061");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) 1.0f);
        boolean boolean4 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1.0d);
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray6 = linkedListTestDriver5.toArray();
        linkedListTestDriver5.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj10 = linkedListTestDriver5.remove((int) (short) 0);
        java.lang.Class<?> wildcardClass11 = linkedListTestDriver5.getClass();
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver5);
        linkedListTestDriver0.addFirst((java.lang.Object) 1.0d);
        boolean boolean16 = linkedListTestDriver0.remove((java.lang.Object) (short) 10);
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray18 = linkedListTestDriver17.toArray();
        linkedListTestDriver17.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj22 = linkedListTestDriver17.remove((int) (short) 0);
        linkedListTestDriver17.clear();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver17);
        java.lang.Class<?> wildcardClass25 = linkedListTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) 10 + "'", obj10, (byte) 10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (byte) 10 + "'", obj22, (byte) 10);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test062");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) 1.0f);
        boolean boolean4 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1.0d);
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray6 = linkedListTestDriver5.toArray();
        linkedListTestDriver5.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj10 = linkedListTestDriver5.remove((int) (short) 0);
        java.lang.Class<?> wildcardClass11 = linkedListTestDriver5.getClass();
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver5);
        linkedListTestDriver0.addFirst((java.lang.Object) 1.0d);
        boolean boolean16 = linkedListTestDriver0.remove((java.lang.Object) (short) 10);
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray18 = linkedListTestDriver17.toArray();
        linkedListTestDriver17.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj22 = linkedListTestDriver17.remove((int) (short) 0);
        linkedListTestDriver17.clear();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver17);
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator26 = linkedListTestDriver17.listIterator((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 97; size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) 10 + "'", obj10, (byte) 10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (byte) 10 + "'", obj22, (byte) 10);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test063");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        int int1 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver2 = new experiment.util.LinkedListTestDriver();
        int int3 = linkedListTestDriver2.size();
        linkedListTestDriver0.addFirst((java.lang.Object) int3);
        boolean boolean5 = linkedListTestDriver0.isEmpty();
        boolean boolean7 = linkedListTestDriver0.equals_CUT((java.lang.Object) 10.0d);
        experiment.util.Iterator iterator8 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        int int10 = linkedListTestDriver9.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        int int12 = linkedListTestDriver11.size();
        linkedListTestDriver9.addFirst((java.lang.Object) int12);
        experiment.util.ListIterator listIterator15 = linkedListTestDriver9.listIterator(1);
        boolean boolean16 = linkedListTestDriver0.add((java.lang.Object) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        boolean boolean19 = linkedListTestDriver17.contains((java.lang.Object) 1.0f);
        boolean boolean21 = linkedListTestDriver17.equals_CUT((java.lang.Object) 1.0d);
        linkedListTestDriver17.addFirst((java.lang.Object) 0.0f);
        linkedListTestDriver0.addFirst((java.lang.Object) 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = linkedListTestDriver0.get((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(listIterator15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test064");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) 1.0f);
        boolean boolean4 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1.0d);
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray6 = linkedListTestDriver5.toArray();
        linkedListTestDriver5.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj10 = linkedListTestDriver5.remove((int) (short) 0);
        java.lang.Class<?> wildcardClass11 = linkedListTestDriver5.getClass();
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver5);
        linkedListTestDriver0.addFirst((java.lang.Object) 1.0d);
        boolean boolean16 = linkedListTestDriver0.remove((java.lang.Object) (short) 10);
        linkedListTestDriver0.addLast((java.lang.Object) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = linkedListTestDriver0.get((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) 10 + "'", obj10, (byte) 10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test065");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) 1.0f);
        boolean boolean3 = linkedListTestDriver0.isEmpty();
        java.lang.Object[] objArray4 = linkedListTestDriver0.toArray();
        experiment.util.Iterator iterator5 = linkedListTestDriver0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = linkedListTestDriver0.getFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(iterator5);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test066");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) 1.0f);
        boolean boolean4 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1.0d);
        linkedListTestDriver0.addFirst((java.lang.Object) 0.0f);
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        int int9 = linkedListTestDriver8.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        int int11 = linkedListTestDriver10.size();
        linkedListTestDriver8.addFirst((java.lang.Object) int11);
        boolean boolean13 = linkedListTestDriver8.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver14 = new experiment.util.LinkedListTestDriver();
        boolean boolean16 = linkedListTestDriver14.contains((java.lang.Object) 1.0f);
        boolean boolean18 = linkedListTestDriver14.equals_CUT((java.lang.Object) 1.0d);
        experiment.util.LinkedListTestDriver linkedListTestDriver19 = new experiment.util.LinkedListTestDriver();
        boolean boolean21 = linkedListTestDriver19.contains((java.lang.Object) 1.0f);
        boolean boolean23 = linkedListTestDriver19.equals_CUT((java.lang.Object) 1.0d);
        boolean boolean24 = linkedListTestDriver14.remove((java.lang.Object) linkedListTestDriver19);
        linkedListTestDriver8.addFirst((java.lang.Object) boolean24);
        experiment.util.LinkedListTestDriver linkedListTestDriver26 = new experiment.util.LinkedListTestDriver();
        boolean boolean28 = linkedListTestDriver26.contains((java.lang.Object) 1.0f);
        boolean boolean29 = linkedListTestDriver26.isEmpty();
        java.lang.Object[] objArray30 = linkedListTestDriver26.toArray();
        java.lang.Class<?> wildcardClass31 = objArray30.getClass();
        linkedListTestDriver8.addLast((java.lang.Object) wildcardClass31);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj33 = linkedListTestDriver0.set((int) (byte) 1, (java.lang.Object) wildcardClass31);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[]");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test067");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        int int1 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver2 = new experiment.util.LinkedListTestDriver();
        int int3 = linkedListTestDriver2.size();
        linkedListTestDriver0.addFirst((java.lang.Object) int3);
        boolean boolean5 = linkedListTestDriver0.isEmpty();
        boolean boolean7 = linkedListTestDriver0.equals_CUT((java.lang.Object) 10.0d);
        java.lang.Object obj8 = linkedListTestDriver0.getFirst();
        java.lang.Object obj9 = linkedListTestDriver0.removeLast();
        java.lang.Class<?> wildcardClass10 = linkedListTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0 + "'", obj8, 0);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0 + "'", obj9, 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test068");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) 1.0f);
        boolean boolean4 = linkedListTestDriver0.contains((java.lang.Object) (-1L));
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        boolean boolean7 = linkedListTestDriver5.contains((java.lang.Object) 1.0f);
        boolean boolean9 = linkedListTestDriver5.equals_CUT((java.lang.Object) 1.0d);
        boolean boolean11 = linkedListTestDriver5.remove((java.lang.Object) '4');
        boolean boolean12 = linkedListTestDriver0.equals_CUT((java.lang.Object) '4');
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.add((int) 'a', (java.lang.Object) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 97; size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test069");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        int int1 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver2 = new experiment.util.LinkedListTestDriver();
        int int3 = linkedListTestDriver2.size();
        linkedListTestDriver0.addFirst((java.lang.Object) int3);
        experiment.util.ListIterator listIterator6 = linkedListTestDriver0.listIterator(1);
        int int7 = linkedListTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = linkedListTestDriver0.remove((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(listIterator6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test070");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) 1.0f);
        boolean boolean4 = linkedListTestDriver0.contains((java.lang.Object) (-1L));
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
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test071");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) 1.0f);
        boolean boolean3 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        int int6 = linkedListTestDriver5.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        int int8 = linkedListTestDriver7.size();
        linkedListTestDriver5.addFirst((java.lang.Object) int8);
        boolean boolean10 = linkedListTestDriver5.isEmpty();
        boolean boolean12 = linkedListTestDriver5.remove((java.lang.Object) 10);
        int int13 = linkedListTestDriver5.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = linkedListTestDriver0.set((int) (byte) -1, (java.lang.Object) int13);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test072");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) 1.0f);
        boolean boolean4 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1.0d);
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        boolean boolean8 = linkedListTestDriver6.contains((java.lang.Object) 1.0f);
        boolean boolean10 = linkedListTestDriver6.equals_CUT((java.lang.Object) 1.0d);
        linkedListTestDriver6.addFirst((java.lang.Object) 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = linkedListTestDriver0.set((int) (short) -1, (java.lang.Object) linkedListTestDriver6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test073");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) 1.0f);
        boolean boolean3 = linkedListTestDriver0.isEmpty();
        java.lang.Object[] objArray4 = linkedListTestDriver0.toArray();
        boolean boolean6 = linkedListTestDriver0.equals_CUT((java.lang.Object) 0L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = linkedListTestDriver0.removeFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test074");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        int int1 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver2 = new experiment.util.LinkedListTestDriver();
        int int3 = linkedListTestDriver2.size();
        linkedListTestDriver0.addFirst((java.lang.Object) int3);
        boolean boolean5 = linkedListTestDriver0.isEmpty();
        boolean boolean7 = linkedListTestDriver0.equals_CUT((java.lang.Object) 10.0d);
        experiment.util.Iterator iterator8 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        boolean boolean12 = linkedListTestDriver10.contains((java.lang.Object) 1.0f);
        boolean boolean14 = linkedListTestDriver10.contains((java.lang.Object) (-1L));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = linkedListTestDriver0.set((int) (short) 10, (java.lang.Object) boolean14);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test075");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        int int1 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver2 = new experiment.util.LinkedListTestDriver();
        int int3 = linkedListTestDriver2.size();
        linkedListTestDriver0.addFirst((java.lang.Object) int3);
        boolean boolean5 = linkedListTestDriver0.isEmpty();
        java.lang.Object obj6 = linkedListTestDriver0.removeFirst();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = linkedListTestDriver0.getLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0 + "'", obj6, 0);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test076");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray1 = linkedListTestDriver0.toArray();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        boolean boolean6 = linkedListTestDriver4.contains((java.lang.Object) 1.0f);
        boolean boolean7 = linkedListTestDriver4.isEmpty();
        java.lang.Object[] objArray8 = linkedListTestDriver4.toArray();
        boolean boolean9 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver4);
        boolean boolean11 = linkedListTestDriver0.equals_CUT((java.lang.Object) '4');
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray13 = linkedListTestDriver12.toArray();
        linkedListTestDriver12.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj17 = linkedListTestDriver12.remove((int) (short) 0);
        linkedListTestDriver12.clear();
        linkedListTestDriver12.clear();
        boolean boolean20 = linkedListTestDriver0.equals_CUT((java.lang.Object) linkedListTestDriver12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = linkedListTestDriver0.remove((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) 10 + "'", obj17, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test077");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray1 = linkedListTestDriver0.toArray();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        boolean boolean6 = linkedListTestDriver4.contains((java.lang.Object) 1.0f);
        boolean boolean7 = linkedListTestDriver4.isEmpty();
        java.lang.Object[] objArray8 = linkedListTestDriver4.toArray();
        boolean boolean9 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver4);
        boolean boolean11 = linkedListTestDriver0.equals_CUT((java.lang.Object) '4');
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray13 = linkedListTestDriver12.toArray();
        linkedListTestDriver12.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj17 = linkedListTestDriver12.remove((int) (short) 0);
        linkedListTestDriver12.clear();
        linkedListTestDriver12.clear();
        boolean boolean20 = linkedListTestDriver0.equals_CUT((java.lang.Object) linkedListTestDriver12);
        experiment.util.LinkedListTestDriver linkedListTestDriver22 = new experiment.util.LinkedListTestDriver();
        int int23 = linkedListTestDriver22.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver24 = new experiment.util.LinkedListTestDriver();
        int int25 = linkedListTestDriver24.size();
        linkedListTestDriver22.addFirst((java.lang.Object) int25);
        boolean boolean27 = linkedListTestDriver22.isEmpty();
        boolean boolean29 = linkedListTestDriver22.equals_CUT((java.lang.Object) 10.0d);
        java.lang.Object obj30 = linkedListTestDriver22.getFirst();
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.add(3, (java.lang.Object) linkedListTestDriver22);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 3; size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) 10 + "'", obj17, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + 0 + "'", obj30, 0);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test078");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        int int1 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver2 = new experiment.util.LinkedListTestDriver();
        int int3 = linkedListTestDriver2.size();
        linkedListTestDriver0.addFirst((java.lang.Object) int3);
        experiment.util.ListIterator listIterator6 = linkedListTestDriver0.listIterator(1);
        int int7 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        int int10 = linkedListTestDriver9.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        int int12 = linkedListTestDriver11.size();
        linkedListTestDriver9.addFirst((java.lang.Object) int12);
        boolean boolean14 = linkedListTestDriver9.isEmpty();
        boolean boolean16 = linkedListTestDriver9.equals_CUT((java.lang.Object) 10.0d);
        java.lang.Object obj17 = linkedListTestDriver9.removeFirst();
        linkedListTestDriver0.add((int) (short) 1, obj17);
        experiment.util.LinkedListTestDriver linkedListTestDriver19 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray20 = linkedListTestDriver19.toArray();
        linkedListTestDriver19.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj24 = linkedListTestDriver19.remove((int) (short) 0);
        int int25 = linkedListTestDriver19.size();
        java.lang.Object[] objArray26 = linkedListTestDriver19.toArray();
        boolean boolean27 = linkedListTestDriver0.add((java.lang.Object) objArray26);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj29 = linkedListTestDriver0.get((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(listIterator6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 0 + "'", obj17, 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (byte) 10 + "'", obj24, (byte) 10);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test079");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        int int1 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver2 = new experiment.util.LinkedListTestDriver();
        int int3 = linkedListTestDriver2.size();
        linkedListTestDriver0.addFirst((java.lang.Object) int3);
        experiment.util.ListIterator listIterator6 = linkedListTestDriver0.listIterator(1);
        int int7 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        int int10 = linkedListTestDriver9.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        int int12 = linkedListTestDriver11.size();
        linkedListTestDriver9.addFirst((java.lang.Object) int12);
        boolean boolean14 = linkedListTestDriver9.isEmpty();
        boolean boolean16 = linkedListTestDriver9.equals_CUT((java.lang.Object) 10.0d);
        java.lang.Object obj17 = linkedListTestDriver9.removeFirst();
        linkedListTestDriver0.add((int) (short) 1, obj17);
        experiment.util.LinkedListTestDriver linkedListTestDriver19 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray20 = linkedListTestDriver19.toArray();
        linkedListTestDriver19.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj24 = linkedListTestDriver19.remove((int) (short) 0);
        int int25 = linkedListTestDriver19.size();
        java.lang.Object[] objArray26 = linkedListTestDriver19.toArray();
        boolean boolean27 = linkedListTestDriver0.add((java.lang.Object) objArray26);
        experiment.util.Iterator iterator28 = linkedListTestDriver0.iterator();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(listIterator6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 0 + "'", obj17, 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (byte) 10 + "'", obj24, (byte) 10);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(iterator28);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test080");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) 0L);
        int int3 = linkedListTestDriver0.size();
        java.lang.Class<?> wildcardClass4 = linkedListTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test081");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) 1.0f);
        boolean boolean4 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1.0d);
        int int5 = linkedListTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = linkedListTestDriver0.removeLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test082");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) 1.0f);
        boolean boolean3 = linkedListTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = linkedListTestDriver0.get((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test083");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray1 = linkedListTestDriver0.toArray();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj5 = linkedListTestDriver0.remove((int) (short) 0);
        int int6 = linkedListTestDriver0.size();
        java.lang.Object[] objArray7 = linkedListTestDriver0.toArray();
        java.lang.Class<?> wildcardClass8 = linkedListTestDriver0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) 10 + "'", obj5, (byte) 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test084");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray1 = linkedListTestDriver0.toArray();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj5 = linkedListTestDriver0.remove((int) (short) 0);
        boolean boolean7 = linkedListTestDriver0.equals_CUT((java.lang.Object) 100.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = linkedListTestDriver0.get(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) 10 + "'", obj5, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test085");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        int int1 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver2 = new experiment.util.LinkedListTestDriver();
        int int3 = linkedListTestDriver2.size();
        linkedListTestDriver0.addFirst((java.lang.Object) int3);
        experiment.util.ListIterator listIterator6 = linkedListTestDriver0.listIterator(1);
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray8 = linkedListTestDriver7.toArray();
        linkedListTestDriver7.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj12 = linkedListTestDriver7.remove((int) (short) 0);
        linkedListTestDriver7.clear();
        linkedListTestDriver7.clear();
        boolean boolean15 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver7);
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator17 = linkedListTestDriver7.listIterator((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 100; size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(listIterator6);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) 10 + "'", obj12, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test086");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) 1.0f);
        boolean boolean3 = linkedListTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = linkedListTestDriver0.removeLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test087");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) 1.0f);
        boolean boolean4 = linkedListTestDriver0.remove((java.lang.Object) 1.0f);
        java.lang.Object[] objArray5 = linkedListTestDriver0.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = linkedListTestDriver0.remove(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test088");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray1 = linkedListTestDriver0.toArray();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj5 = linkedListTestDriver0.remove((int) (short) 0);
        int int6 = linkedListTestDriver0.size();
        java.lang.Object[] objArray7 = linkedListTestDriver0.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        int int9 = linkedListTestDriver8.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        int int11 = linkedListTestDriver10.size();
        linkedListTestDriver8.addFirst((java.lang.Object) int11);
        boolean boolean13 = linkedListTestDriver8.isEmpty();
        boolean boolean15 = linkedListTestDriver8.remove((java.lang.Object) 10);
        linkedListTestDriver0.addFirst((java.lang.Object) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = linkedListTestDriver0.remove((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) 10 + "'", obj5, (byte) 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test089");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray1 = linkedListTestDriver0.toArray();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj5 = linkedListTestDriver0.remove((int) (short) 0);
        linkedListTestDriver0.clear();
        java.lang.Object obj7 = null;
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.addLast(obj7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) 10 + "'", obj5, (byte) 10);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test090");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) 1.0f);
        boolean boolean4 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1.0d);
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray6 = linkedListTestDriver5.toArray();
        linkedListTestDriver5.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj10 = linkedListTestDriver5.remove((int) (short) 0);
        java.lang.Class<?> wildcardClass11 = linkedListTestDriver5.getClass();
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver5);
        linkedListTestDriver0.addFirst((java.lang.Object) 1.0d);
        boolean boolean16 = linkedListTestDriver0.remove((java.lang.Object) (short) 10);
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray18 = linkedListTestDriver17.toArray();
        linkedListTestDriver17.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj22 = linkedListTestDriver17.remove((int) (short) 0);
        linkedListTestDriver17.clear();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = linkedListTestDriver0.remove((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) 10 + "'", obj10, (byte) 10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (byte) 10 + "'", obj22, (byte) 10);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test091");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        int int1 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver2 = new experiment.util.LinkedListTestDriver();
        int int3 = linkedListTestDriver2.size();
        linkedListTestDriver0.addFirst((java.lang.Object) int3);
        boolean boolean5 = linkedListTestDriver0.isEmpty();
        boolean boolean7 = linkedListTestDriver0.equals_CUT((java.lang.Object) 10.0d);
        java.lang.Object obj8 = linkedListTestDriver0.removeFirst();
        java.lang.Object[] objArray9 = linkedListTestDriver0.toArray();
        java.lang.Class<?> wildcardClass10 = linkedListTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0 + "'", obj8, 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test092");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) 1.0f);
        boolean boolean4 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1.0d);
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        boolean boolean7 = linkedListTestDriver5.contains((java.lang.Object) 1.0f);
        boolean boolean9 = linkedListTestDriver5.equals_CUT((java.lang.Object) 1.0d);
        boolean boolean10 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver5);
        linkedListTestDriver0.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray14 = linkedListTestDriver13.toArray();
        linkedListTestDriver13.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj18 = linkedListTestDriver13.remove((int) (short) 0);
        int int19 = linkedListTestDriver13.size();
        java.lang.Object[] objArray20 = linkedListTestDriver13.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver21 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray22 = linkedListTestDriver21.toArray();
        linkedListTestDriver21.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver21.addLast((java.lang.Object) 100.0d);
        linkedListTestDriver21.clear();
        boolean boolean28 = linkedListTestDriver13.contains((java.lang.Object) linkedListTestDriver21);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj29 = linkedListTestDriver0.set((int) (short) 0, (java.lang.Object) linkedListTestDriver13);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (byte) 10 + "'", obj18, (byte) 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test093");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) 1.0f);
        boolean boolean4 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1.0d);
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray6 = linkedListTestDriver5.toArray();
        linkedListTestDriver5.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj10 = linkedListTestDriver5.remove((int) (short) 0);
        java.lang.Class<?> wildcardClass11 = linkedListTestDriver5.getClass();
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver5);
        linkedListTestDriver0.addFirst((java.lang.Object) 1.0d);
        boolean boolean16 = linkedListTestDriver0.remove((java.lang.Object) (short) 10);
        boolean boolean18 = linkedListTestDriver0.remove((java.lang.Object) (short) 100);
        linkedListTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = linkedListTestDriver0.remove(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) 10 + "'", obj10, (byte) 10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test094");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray1 = linkedListTestDriver0.toArray();
        int int2 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        boolean boolean6 = linkedListTestDriver4.contains((java.lang.Object) 1.0f);
        boolean boolean8 = linkedListTestDriver4.equals_CUT((java.lang.Object) 1.0d);
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        boolean boolean11 = linkedListTestDriver9.contains((java.lang.Object) 1.0f);
        boolean boolean13 = linkedListTestDriver9.equals_CUT((java.lang.Object) 1.0d);
        boolean boolean14 = linkedListTestDriver4.remove((java.lang.Object) linkedListTestDriver9);
        experiment.util.Iterator iterator15 = linkedListTestDriver4.iterator();
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.add(10, (java.lang.Object) iterator15);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 10; size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(iterator15);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test095");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray1 = linkedListTestDriver0.toArray();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.addLast((java.lang.Object) 100.0d);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = linkedListTestDriver0.getLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test096");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray1 = linkedListTestDriver0.toArray();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj5 = linkedListTestDriver0.remove((int) (short) 0);
        linkedListTestDriver0.clear();
        int int7 = linkedListTestDriver0.size();
        experiment.util.Iterator iterator8 = linkedListTestDriver0.iterator();
        java.lang.Object[] objArray9 = linkedListTestDriver0.toArray();
        linkedListTestDriver0.addFirst((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        int int14 = linkedListTestDriver13.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver15 = new experiment.util.LinkedListTestDriver();
        int int16 = linkedListTestDriver15.size();
        linkedListTestDriver13.addFirst((java.lang.Object) int16);
        boolean boolean18 = linkedListTestDriver13.isEmpty();
        boolean boolean20 = linkedListTestDriver13.equals_CUT((java.lang.Object) 10.0d);
        java.lang.Object obj21 = linkedListTestDriver13.removeFirst();
        linkedListTestDriver0.add(1, (java.lang.Object) linkedListTestDriver13);
        java.lang.Object[] objArray23 = linkedListTestDriver13.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver24 = new experiment.util.LinkedListTestDriver();
        boolean boolean26 = linkedListTestDriver24.contains((java.lang.Object) 1.0f);
        boolean boolean28 = linkedListTestDriver24.equals_CUT((java.lang.Object) 1.0d);
        experiment.util.LinkedListTestDriver linkedListTestDriver29 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray30 = linkedListTestDriver29.toArray();
        linkedListTestDriver29.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj34 = linkedListTestDriver29.remove((int) (short) 0);
        java.lang.Class<?> wildcardClass35 = linkedListTestDriver29.getClass();
        linkedListTestDriver24.addLast((java.lang.Object) linkedListTestDriver29);
        linkedListTestDriver24.addFirst((java.lang.Object) 1.0d);
        boolean boolean40 = linkedListTestDriver24.remove((java.lang.Object) (short) 10);
        java.lang.Object[] objArray41 = linkedListTestDriver24.toArray();
        experiment.util.Iterator iterator42 = linkedListTestDriver24.iterator();
        boolean boolean43 = linkedListTestDriver13.equals_CUT((java.lang.Object) linkedListTestDriver24);
        experiment.util.Iterator iterator44 = linkedListTestDriver13.iterator();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator46 = linkedListTestDriver13.listIterator((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 97; size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) 10 + "'", obj5, (byte) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 0 + "'", obj21, 0);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[]");
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + (byte) 10 + "'", obj34, (byte) 10);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(iterator42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(iterator44);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test097");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) 1.0f);
        boolean boolean4 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1.0d);
        boolean boolean6 = linkedListTestDriver0.remove((java.lang.Object) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = linkedListTestDriver0.get(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test098");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) 1.0f);
        boolean boolean4 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1.0d);
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray6 = linkedListTestDriver5.toArray();
        linkedListTestDriver5.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj10 = linkedListTestDriver5.remove((int) (short) 0);
        java.lang.Class<?> wildcardClass11 = linkedListTestDriver5.getClass();
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver5);
        linkedListTestDriver0.addFirst((java.lang.Object) 1.0d);
        boolean boolean16 = linkedListTestDriver0.remove((java.lang.Object) (short) 10);
        boolean boolean18 = linkedListTestDriver0.remove((java.lang.Object) (short) 100);
        linkedListTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = linkedListTestDriver0.removeLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) 10 + "'", obj10, (byte) 10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test099");
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
        experiment.util.LinkedListTestDriver linkedListTestDriver18 = new experiment.util.LinkedListTestDriver();
        boolean boolean20 = linkedListTestDriver18.contains((java.lang.Object) 1.0f);
        boolean boolean21 = linkedListTestDriver18.isEmpty();
        java.lang.Object[] objArray22 = linkedListTestDriver18.toArray();
        java.lang.Class<?> wildcardClass23 = objArray22.getClass();
        linkedListTestDriver0.addLast((java.lang.Object) wildcardClass23);
        java.lang.Object obj25 = linkedListTestDriver0.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver27 = new experiment.util.LinkedListTestDriver();
        boolean boolean29 = linkedListTestDriver27.contains((java.lang.Object) 0L);
        int int30 = linkedListTestDriver27.size();
        java.lang.Object[] objArray31 = linkedListTestDriver27.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj32 = linkedListTestDriver0.set((int) (short) -1, (java.lang.Object) linkedListTestDriver27);
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + false + "'", obj25, false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[]");
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test100");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) 1.0f);
        boolean boolean3 = linkedListTestDriver0.isEmpty();
        java.lang.Object[] objArray4 = linkedListTestDriver0.toArray();
        experiment.util.Iterator iterator5 = linkedListTestDriver0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = linkedListTestDriver0.removeLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(iterator5);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test101");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) 0L);
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        boolean boolean6 = linkedListTestDriver4.contains((java.lang.Object) 1.0f);
        boolean boolean8 = linkedListTestDriver4.remove((java.lang.Object) 1.0f);
        boolean boolean9 = linkedListTestDriver4.isEmpty();
        java.lang.Object[] objArray10 = linkedListTestDriver4.toArray();
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.add((int) (byte) 1, (java.lang.Object) objArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 1; size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test102");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) 1.0f);
        boolean boolean3 = linkedListTestDriver0.isEmpty();
        java.lang.Object[] objArray4 = linkedListTestDriver0.toArray();
        experiment.util.Iterator iterator5 = linkedListTestDriver0.iterator();
        boolean boolean7 = linkedListTestDriver0.equals_CUT((java.lang.Object) 0.0d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test103");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        int int1 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver2 = new experiment.util.LinkedListTestDriver();
        int int3 = linkedListTestDriver2.size();
        linkedListTestDriver0.addFirst((java.lang.Object) int3);
        boolean boolean5 = linkedListTestDriver0.isEmpty();
        boolean boolean7 = linkedListTestDriver0.equals_CUT((java.lang.Object) 10.0d);
        experiment.util.Iterator iterator8 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        int int10 = linkedListTestDriver9.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        int int12 = linkedListTestDriver11.size();
        linkedListTestDriver9.addFirst((java.lang.Object) int12);
        experiment.util.ListIterator listIterator15 = linkedListTestDriver9.listIterator(1);
        boolean boolean16 = linkedListTestDriver0.add((java.lang.Object) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        int int18 = linkedListTestDriver17.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver19 = new experiment.util.LinkedListTestDriver();
        int int20 = linkedListTestDriver19.size();
        linkedListTestDriver17.addFirst((java.lang.Object) int20);
        boolean boolean22 = linkedListTestDriver17.isEmpty();
        boolean boolean24 = linkedListTestDriver17.equals_CUT((java.lang.Object) 10.0d);
        experiment.util.Iterator iterator25 = linkedListTestDriver17.iterator();
        linkedListTestDriver0.addFirst((java.lang.Object) iterator25);
        experiment.util.LinkedListTestDriver linkedListTestDriver28 = new experiment.util.LinkedListTestDriver();
        boolean boolean30 = linkedListTestDriver28.contains((java.lang.Object) 1.0f);
        boolean boolean32 = linkedListTestDriver28.equals_CUT((java.lang.Object) 1.0d);
        experiment.util.LinkedListTestDriver linkedListTestDriver33 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray34 = linkedListTestDriver33.toArray();
        linkedListTestDriver33.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj38 = linkedListTestDriver33.remove((int) (short) 0);
        java.lang.Class<?> wildcardClass39 = linkedListTestDriver33.getClass();
        linkedListTestDriver28.addLast((java.lang.Object) linkedListTestDriver33);
        linkedListTestDriver28.addFirst((java.lang.Object) 1.0d);
        boolean boolean44 = linkedListTestDriver28.remove((java.lang.Object) (short) 10);
        java.lang.Object[] objArray45 = linkedListTestDriver28.toArray();
        experiment.util.Iterator iterator46 = linkedListTestDriver28.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj47 = linkedListTestDriver0.set((int) (byte) -1, (java.lang.Object) iterator46);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(listIterator15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(iterator25);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[]");
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + (byte) 10 + "'", obj38, (byte) 10);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertNotNull(iterator46);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test104");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        int int1 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver2 = new experiment.util.LinkedListTestDriver();
        int int3 = linkedListTestDriver2.size();
        linkedListTestDriver0.addFirst((java.lang.Object) int3);
        boolean boolean5 = linkedListTestDriver0.isEmpty();
        boolean boolean7 = linkedListTestDriver0.equals_CUT((java.lang.Object) 10.0d);
        experiment.util.Iterator iterator8 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        int int10 = linkedListTestDriver9.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        int int12 = linkedListTestDriver11.size();
        linkedListTestDriver9.addFirst((java.lang.Object) int12);
        experiment.util.ListIterator listIterator15 = linkedListTestDriver9.listIterator(1);
        boolean boolean16 = linkedListTestDriver0.add((java.lang.Object) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        int int18 = linkedListTestDriver17.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver19 = new experiment.util.LinkedListTestDriver();
        int int20 = linkedListTestDriver19.size();
        linkedListTestDriver17.addFirst((java.lang.Object) int20);
        boolean boolean22 = linkedListTestDriver17.isEmpty();
        boolean boolean24 = linkedListTestDriver17.equals_CUT((java.lang.Object) 10.0d);
        experiment.util.Iterator iterator25 = linkedListTestDriver17.iterator();
        linkedListTestDriver0.addFirst((java.lang.Object) iterator25);
        java.lang.Class<?> wildcardClass27 = iterator25.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(listIterator15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(iterator25);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test105");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        int int1 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver2 = new experiment.util.LinkedListTestDriver();
        int int3 = linkedListTestDriver2.size();
        linkedListTestDriver0.addFirst((java.lang.Object) int3);
        experiment.util.ListIterator listIterator6 = linkedListTestDriver0.listIterator(1);
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        boolean boolean10 = linkedListTestDriver8.contains((java.lang.Object) 1.0f);
        boolean boolean12 = linkedListTestDriver8.equals_CUT((java.lang.Object) 1.0d);
        boolean boolean14 = linkedListTestDriver8.remove((java.lang.Object) '4');
        linkedListTestDriver0.add(1, (java.lang.Object) '4');
        experiment.util.LinkedListTestDriver linkedListTestDriver16 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator17 = linkedListTestDriver16.iterator();
        boolean boolean18 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver16);
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator20 = linkedListTestDriver0.listIterator((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: -1; size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(listIterator6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test106");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) 1.0f);
        boolean boolean4 = linkedListTestDriver0.remove((java.lang.Object) 1.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = linkedListTestDriver0.removeLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test107");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) 1.0f);
        boolean boolean4 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1.0d);
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        boolean boolean7 = linkedListTestDriver5.contains((java.lang.Object) 1.0f);
        boolean boolean9 = linkedListTestDriver5.equals_CUT((java.lang.Object) 1.0d);
        boolean boolean10 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver5);
        experiment.util.Iterator iterator11 = linkedListTestDriver0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = linkedListTestDriver0.remove((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(iterator11);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test108");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) 1.0f);
        boolean boolean3 = linkedListTestDriver0.isEmpty();
        boolean boolean4 = linkedListTestDriver0.isEmpty();
        boolean boolean6 = linkedListTestDriver0.contains((java.lang.Object) 10);
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray9 = linkedListTestDriver8.toArray();
        linkedListTestDriver8.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj13 = linkedListTestDriver8.remove((int) (short) 0);
        linkedListTestDriver8.clear();
        int int15 = linkedListTestDriver8.size();
        experiment.util.Iterator iterator16 = linkedListTestDriver8.iterator();
        java.lang.Object[] objArray17 = linkedListTestDriver8.toArray();
        linkedListTestDriver8.addFirst((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver21 = new experiment.util.LinkedListTestDriver();
        int int22 = linkedListTestDriver21.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver23 = new experiment.util.LinkedListTestDriver();
        int int24 = linkedListTestDriver23.size();
        linkedListTestDriver21.addFirst((java.lang.Object) int24);
        boolean boolean26 = linkedListTestDriver21.isEmpty();
        boolean boolean28 = linkedListTestDriver21.equals_CUT((java.lang.Object) 10.0d);
        java.lang.Object obj29 = linkedListTestDriver21.removeFirst();
        linkedListTestDriver8.add(1, (java.lang.Object) linkedListTestDriver21);
        java.lang.Object[] objArray31 = linkedListTestDriver21.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver32 = new experiment.util.LinkedListTestDriver();
        boolean boolean34 = linkedListTestDriver32.contains((java.lang.Object) 1.0f);
        boolean boolean36 = linkedListTestDriver32.equals_CUT((java.lang.Object) 1.0d);
        experiment.util.LinkedListTestDriver linkedListTestDriver37 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray38 = linkedListTestDriver37.toArray();
        linkedListTestDriver37.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj42 = linkedListTestDriver37.remove((int) (short) 0);
        java.lang.Class<?> wildcardClass43 = linkedListTestDriver37.getClass();
        linkedListTestDriver32.addLast((java.lang.Object) linkedListTestDriver37);
        linkedListTestDriver32.addFirst((java.lang.Object) 1.0d);
        boolean boolean48 = linkedListTestDriver32.remove((java.lang.Object) (short) 10);
        java.lang.Object[] objArray49 = linkedListTestDriver32.toArray();
        experiment.util.Iterator iterator50 = linkedListTestDriver32.iterator();
        boolean boolean51 = linkedListTestDriver21.equals_CUT((java.lang.Object) linkedListTestDriver32);
        experiment.util.Iterator iterator52 = linkedListTestDriver21.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj53 = linkedListTestDriver0.set((int) (short) 100, (java.lang.Object) linkedListTestDriver21);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (byte) 10 + "'", obj13, (byte) 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 0 + "'", obj29, 0);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[]");
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + (byte) 10 + "'", obj42, (byte) 10);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertNotNull(iterator50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(iterator52);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test109");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) 1.0f);
        boolean boolean3 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        boolean boolean6 = linkedListTestDriver4.contains((java.lang.Object) 1.0f);
        boolean boolean7 = linkedListTestDriver4.isEmpty();
        boolean boolean8 = linkedListTestDriver4.isEmpty();
        boolean boolean10 = linkedListTestDriver4.contains((java.lang.Object) 10);
        boolean boolean11 = linkedListTestDriver0.add((java.lang.Object) 10);
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray13 = linkedListTestDriver12.toArray();
        linkedListTestDriver12.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver12.addLast((java.lang.Object) 100.0d);
        java.lang.Object obj18 = linkedListTestDriver12.removeLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver19 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray20 = linkedListTestDriver19.toArray();
        linkedListTestDriver19.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj24 = linkedListTestDriver19.remove((int) (short) 0);
        int int25 = linkedListTestDriver19.size();
        java.lang.Object[] objArray26 = linkedListTestDriver19.toArray();
        boolean boolean27 = linkedListTestDriver12.add((java.lang.Object) objArray26);
        boolean boolean28 = linkedListTestDriver0.add((java.lang.Object) objArray26);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 100.0d + "'", obj18, 100.0d);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (byte) 10 + "'", obj24, (byte) 10);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test110");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray1 = linkedListTestDriver0.toArray();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        boolean boolean6 = linkedListTestDriver4.contains((java.lang.Object) 1.0f);
        boolean boolean7 = linkedListTestDriver4.isEmpty();
        java.lang.Object[] objArray8 = linkedListTestDriver4.toArray();
        boolean boolean9 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver4);
        java.lang.Object obj11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = linkedListTestDriver4.set((int) 'a', obj11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test111");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        int int1 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver2 = new experiment.util.LinkedListTestDriver();
        int int3 = linkedListTestDriver2.size();
        linkedListTestDriver0.addFirst((java.lang.Object) int3);
        experiment.util.ListIterator listIterator6 = linkedListTestDriver0.listIterator(1);
        int int7 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        int int10 = linkedListTestDriver9.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        int int12 = linkedListTestDriver11.size();
        linkedListTestDriver9.addFirst((java.lang.Object) int12);
        boolean boolean14 = linkedListTestDriver9.isEmpty();
        boolean boolean16 = linkedListTestDriver9.equals_CUT((java.lang.Object) 10.0d);
        java.lang.Object obj17 = linkedListTestDriver9.removeFirst();
        linkedListTestDriver0.add((int) (short) 1, obj17);
        experiment.util.LinkedListTestDriver linkedListTestDriver19 = new experiment.util.LinkedListTestDriver();
        boolean boolean21 = linkedListTestDriver19.contains((java.lang.Object) 1.0f);
        boolean boolean23 = linkedListTestDriver19.remove((java.lang.Object) 1.0f);
        int int24 = linkedListTestDriver19.size();
        boolean boolean25 = linkedListTestDriver0.equals_CUT((java.lang.Object) int24);
        experiment.util.LinkedListTestDriver linkedListTestDriver26 = new experiment.util.LinkedListTestDriver();
        boolean boolean28 = linkedListTestDriver26.contains((java.lang.Object) 1.0f);
        boolean boolean30 = linkedListTestDriver26.equals_CUT((java.lang.Object) 1.0d);
        int int31 = linkedListTestDriver26.size();
        boolean boolean32 = linkedListTestDriver0.equals_CUT((java.lang.Object) linkedListTestDriver26);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(listIterator6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 0 + "'", obj17, 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test112");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray1 = linkedListTestDriver0.toArray();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        boolean boolean6 = linkedListTestDriver4.contains((java.lang.Object) 1.0f);
        boolean boolean7 = linkedListTestDriver4.isEmpty();
        java.lang.Object[] objArray8 = linkedListTestDriver4.toArray();
        boolean boolean9 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver4);
        boolean boolean11 = linkedListTestDriver0.equals_CUT((java.lang.Object) '4');
        java.lang.Object obj12 = linkedListTestDriver0.removeLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver14 = new experiment.util.LinkedListTestDriver();
        int int15 = linkedListTestDriver14.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver16 = new experiment.util.LinkedListTestDriver();
        int int17 = linkedListTestDriver16.size();
        linkedListTestDriver14.addFirst((java.lang.Object) int17);
        boolean boolean19 = linkedListTestDriver14.isEmpty();
        boolean boolean21 = linkedListTestDriver14.equals_CUT((java.lang.Object) 10.0d);
        experiment.util.Iterator iterator22 = linkedListTestDriver14.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver23 = new experiment.util.LinkedListTestDriver();
        int int24 = linkedListTestDriver23.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver25 = new experiment.util.LinkedListTestDriver();
        int int26 = linkedListTestDriver25.size();
        linkedListTestDriver23.addFirst((java.lang.Object) int26);
        experiment.util.ListIterator listIterator29 = linkedListTestDriver23.listIterator(1);
        boolean boolean30 = linkedListTestDriver14.add((java.lang.Object) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver31 = new experiment.util.LinkedListTestDriver();
        int int32 = linkedListTestDriver31.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver33 = new experiment.util.LinkedListTestDriver();
        int int34 = linkedListTestDriver33.size();
        linkedListTestDriver31.addFirst((java.lang.Object) int34);
        boolean boolean36 = linkedListTestDriver31.isEmpty();
        boolean boolean38 = linkedListTestDriver31.equals_CUT((java.lang.Object) 10.0d);
        experiment.util.Iterator iterator39 = linkedListTestDriver31.iterator();
        linkedListTestDriver14.addFirst((java.lang.Object) iterator39);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj41 = linkedListTestDriver0.set(2, (java.lang.Object) linkedListTestDriver14);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) 10 + "'", obj12, (byte) 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(listIterator29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(iterator39);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test113");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) 1.0f);
        boolean boolean3 = linkedListTestDriver0.isEmpty();
        java.lang.Object[] objArray4 = linkedListTestDriver0.toArray();
        experiment.util.Iterator iterator5 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        int int8 = linkedListTestDriver7.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        int int10 = linkedListTestDriver9.size();
        linkedListTestDriver7.addFirst((java.lang.Object) int10);
        boolean boolean12 = linkedListTestDriver7.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        boolean boolean15 = linkedListTestDriver13.contains((java.lang.Object) 1.0f);
        boolean boolean17 = linkedListTestDriver13.equals_CUT((java.lang.Object) 1.0d);
        experiment.util.LinkedListTestDriver linkedListTestDriver18 = new experiment.util.LinkedListTestDriver();
        boolean boolean20 = linkedListTestDriver18.contains((java.lang.Object) 1.0f);
        boolean boolean22 = linkedListTestDriver18.equals_CUT((java.lang.Object) 1.0d);
        boolean boolean23 = linkedListTestDriver13.remove((java.lang.Object) linkedListTestDriver18);
        linkedListTestDriver7.addFirst((java.lang.Object) boolean23);
        experiment.util.LinkedListTestDriver linkedListTestDriver25 = new experiment.util.LinkedListTestDriver();
        boolean boolean27 = linkedListTestDriver25.contains((java.lang.Object) 1.0f);
        boolean boolean28 = linkedListTestDriver25.isEmpty();
        java.lang.Object[] objArray29 = linkedListTestDriver25.toArray();
        java.lang.Class<?> wildcardClass30 = objArray29.getClass();
        linkedListTestDriver7.addLast((java.lang.Object) wildcardClass30);
        java.lang.Object obj32 = linkedListTestDriver7.removeFirst();
        java.lang.Object obj34 = linkedListTestDriver7.remove(0);
        java.lang.Object obj35 = linkedListTestDriver7.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver36 = new experiment.util.LinkedListTestDriver();
        int int37 = linkedListTestDriver36.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver38 = new experiment.util.LinkedListTestDriver();
        int int39 = linkedListTestDriver38.size();
        linkedListTestDriver36.addFirst((java.lang.Object) int39);
        boolean boolean41 = linkedListTestDriver36.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver42 = new experiment.util.LinkedListTestDriver();
        boolean boolean44 = linkedListTestDriver42.contains((java.lang.Object) 1.0f);
        boolean boolean46 = linkedListTestDriver42.equals_CUT((java.lang.Object) 1.0d);
        experiment.util.LinkedListTestDriver linkedListTestDriver47 = new experiment.util.LinkedListTestDriver();
        boolean boolean49 = linkedListTestDriver47.contains((java.lang.Object) 1.0f);
        boolean boolean51 = linkedListTestDriver47.equals_CUT((java.lang.Object) 1.0d);
        boolean boolean52 = linkedListTestDriver42.remove((java.lang.Object) linkedListTestDriver47);
        linkedListTestDriver36.addFirst((java.lang.Object) boolean52);
        boolean boolean54 = linkedListTestDriver7.add((java.lang.Object) linkedListTestDriver36);
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.add((-1), (java.lang.Object) linkedListTestDriver7);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: -1; size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[]");
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + false + "'", obj32, false);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + 0 + "'", obj34, 0);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertEquals(obj35.toString(), "class [Ljava.lang.Object;");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj35), "class [Ljava.lang.Object;");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj35), "class [Ljava.lang.Object;");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test114");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) 1.0f);
        boolean boolean4 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1.0d);
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray6 = linkedListTestDriver5.toArray();
        linkedListTestDriver5.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj10 = linkedListTestDriver5.remove((int) (short) 0);
        java.lang.Class<?> wildcardClass11 = linkedListTestDriver5.getClass();
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = linkedListTestDriver5.remove((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test115");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        int int1 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver2 = new experiment.util.LinkedListTestDriver();
        int int3 = linkedListTestDriver2.size();
        linkedListTestDriver0.addFirst((java.lang.Object) int3);
        boolean boolean5 = linkedListTestDriver0.isEmpty();
        boolean boolean7 = linkedListTestDriver0.equals_CUT((java.lang.Object) 10.0d);
        experiment.util.Iterator iterator8 = linkedListTestDriver0.iterator();
        boolean boolean9 = linkedListTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = linkedListTestDriver0.get(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test116");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) 1.0f);
        linkedListTestDriver0.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray5 = linkedListTestDriver4.toArray();
        linkedListTestDriver4.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver4.addLast((java.lang.Object) 100.0d);
        java.lang.Object obj10 = linkedListTestDriver4.removeLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray12 = linkedListTestDriver11.toArray();
        linkedListTestDriver11.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj16 = linkedListTestDriver11.remove((int) (short) 0);
        int int17 = linkedListTestDriver11.size();
        java.lang.Object[] objArray18 = linkedListTestDriver11.toArray();
        boolean boolean19 = linkedListTestDriver4.add((java.lang.Object) objArray18);
        experiment.util.LinkedListTestDriver linkedListTestDriver20 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray21 = linkedListTestDriver20.toArray();
        linkedListTestDriver20.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj25 = linkedListTestDriver20.remove((int) (short) 0);
        linkedListTestDriver4.addFirst((java.lang.Object) (short) 0);
        boolean boolean27 = linkedListTestDriver4.isEmpty();
        boolean boolean28 = linkedListTestDriver0.contains((java.lang.Object) boolean27);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 100.0d + "'", obj10, 100.0d);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (byte) 10 + "'", obj16, (byte) 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (byte) 10 + "'", obj25, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test117");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) 1.0f);
        boolean boolean4 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1.0d);
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray6 = linkedListTestDriver5.toArray();
        linkedListTestDriver5.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj10 = linkedListTestDriver5.remove((int) (short) 0);
        java.lang.Class<?> wildcardClass11 = linkedListTestDriver5.getClass();
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver5);
        linkedListTestDriver0.addFirst((java.lang.Object) 1.0d);
        boolean boolean16 = linkedListTestDriver0.remove((java.lang.Object) (short) 10);
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray18 = linkedListTestDriver17.toArray();
        linkedListTestDriver17.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj22 = linkedListTestDriver17.remove((int) (short) 0);
        linkedListTestDriver17.clear();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = linkedListTestDriver17.removeFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) 10 + "'", obj10, (byte) 10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (byte) 10 + "'", obj22, (byte) 10);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test118");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) 1.0f);
        boolean boolean3 = linkedListTestDriver0.isEmpty();
        boolean boolean4 = linkedListTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator6 = linkedListTestDriver0.listIterator((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 1; size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test119");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray1 = linkedListTestDriver0.toArray();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj5 = linkedListTestDriver0.remove((int) (short) 0);
        linkedListTestDriver0.clear();
        int int7 = linkedListTestDriver0.size();
        experiment.util.Iterator iterator8 = linkedListTestDriver0.iterator();
        java.lang.Object[] objArray9 = linkedListTestDriver0.toArray();
        linkedListTestDriver0.addFirst((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        int int14 = linkedListTestDriver13.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver15 = new experiment.util.LinkedListTestDriver();
        int int16 = linkedListTestDriver15.size();
        linkedListTestDriver13.addFirst((java.lang.Object) int16);
        boolean boolean18 = linkedListTestDriver13.isEmpty();
        boolean boolean20 = linkedListTestDriver13.equals_CUT((java.lang.Object) 10.0d);
        java.lang.Object obj21 = linkedListTestDriver13.removeFirst();
        linkedListTestDriver0.add(1, (java.lang.Object) linkedListTestDriver13);
        java.lang.Object[] objArray23 = linkedListTestDriver13.toArray();
        experiment.util.Iterator iterator24 = linkedListTestDriver13.iterator();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator26 = linkedListTestDriver13.listIterator(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 100; size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) 10 + "'", obj5, (byte) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 0 + "'", obj21, 0);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
        org.junit.Assert.assertNotNull(iterator24);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test120");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray1 = linkedListTestDriver0.toArray();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj5 = linkedListTestDriver0.remove((int) (short) 0);
        linkedListTestDriver0.clear();
        int int7 = linkedListTestDriver0.size();
        experiment.util.Iterator iterator8 = linkedListTestDriver0.iterator();
        java.lang.Object[] objArray9 = linkedListTestDriver0.toArray();
        linkedListTestDriver0.addFirst((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        int int14 = linkedListTestDriver13.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver15 = new experiment.util.LinkedListTestDriver();
        int int16 = linkedListTestDriver15.size();
        linkedListTestDriver13.addFirst((java.lang.Object) int16);
        boolean boolean18 = linkedListTestDriver13.isEmpty();
        boolean boolean20 = linkedListTestDriver13.equals_CUT((java.lang.Object) 10.0d);
        java.lang.Object obj21 = linkedListTestDriver13.removeFirst();
        linkedListTestDriver0.add(1, (java.lang.Object) linkedListTestDriver13);
        experiment.util.Iterator iterator23 = linkedListTestDriver13.iterator();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) 10 + "'", obj5, (byte) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 0 + "'", obj21, 0);
        org.junit.Assert.assertNotNull(iterator23);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test121");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray1 = linkedListTestDriver0.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = linkedListTestDriver0.get((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test122");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        int int1 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver2 = new experiment.util.LinkedListTestDriver();
        int int3 = linkedListTestDriver2.size();
        linkedListTestDriver0.addFirst((java.lang.Object) int3);
        experiment.util.ListIterator listIterator6 = linkedListTestDriver0.listIterator(1);
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        boolean boolean10 = linkedListTestDriver8.contains((java.lang.Object) 1.0f);
        boolean boolean12 = linkedListTestDriver8.equals_CUT((java.lang.Object) 1.0d);
        boolean boolean14 = linkedListTestDriver8.remove((java.lang.Object) '4');
        linkedListTestDriver0.add(1, (java.lang.Object) '4');
        experiment.util.LinkedListTestDriver linkedListTestDriver16 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator17 = linkedListTestDriver16.iterator();
        boolean boolean18 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = linkedListTestDriver16.getFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(listIterator6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test123");
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
            java.lang.Object obj10 = linkedListTestDriver4.removeFirst();
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
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test124");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray1 = linkedListTestDriver0.toArray();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj5 = linkedListTestDriver0.remove((int) (short) 0);
        linkedListTestDriver0.clear();
        int int7 = linkedListTestDriver0.size();
        experiment.util.Iterator iterator8 = linkedListTestDriver0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator10 = linkedListTestDriver0.listIterator((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 32; size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) 10 + "'", obj5, (byte) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(iterator8);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test125");
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
        experiment.util.LinkedListTestDriver linkedListTestDriver18 = new experiment.util.LinkedListTestDriver();
        boolean boolean20 = linkedListTestDriver18.contains((java.lang.Object) 1.0f);
        boolean boolean21 = linkedListTestDriver18.isEmpty();
        java.lang.Object[] objArray22 = linkedListTestDriver18.toArray();
        java.lang.Class<?> wildcardClass23 = objArray22.getClass();
        linkedListTestDriver0.addLast((java.lang.Object) wildcardClass23);
        java.lang.Object obj25 = linkedListTestDriver0.removeFirst();
        java.lang.Object obj27 = linkedListTestDriver0.remove(0);
        java.lang.Object obj28 = linkedListTestDriver0.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver29 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray30 = linkedListTestDriver29.toArray();
        linkedListTestDriver29.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj34 = linkedListTestDriver29.remove((int) (short) 0);
        linkedListTestDriver29.clear();
        int int36 = linkedListTestDriver29.size();
        experiment.util.Iterator iterator37 = linkedListTestDriver29.iterator();
        java.lang.Object[] objArray38 = linkedListTestDriver29.toArray();
        linkedListTestDriver29.addFirst((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver42 = new experiment.util.LinkedListTestDriver();
        int int43 = linkedListTestDriver42.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver44 = new experiment.util.LinkedListTestDriver();
        int int45 = linkedListTestDriver44.size();
        linkedListTestDriver42.addFirst((java.lang.Object) int45);
        boolean boolean47 = linkedListTestDriver42.isEmpty();
        boolean boolean49 = linkedListTestDriver42.equals_CUT((java.lang.Object) 10.0d);
        java.lang.Object obj50 = linkedListTestDriver42.removeFirst();
        linkedListTestDriver29.add(1, (java.lang.Object) linkedListTestDriver42);
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver29);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj54 = linkedListTestDriver0.remove(3);
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + false + "'", obj25, false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 0 + "'", obj27, 0);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertEquals(obj28.toString(), "class [Ljava.lang.Object;");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj28), "class [Ljava.lang.Object;");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj28), "class [Ljava.lang.Object;");
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[]");
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + (byte) 10 + "'", obj34, (byte) 10);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(iterator37);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[]");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + 0 + "'", obj50, 0);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test126");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) 1.0f);
        boolean boolean4 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1.0d);
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray6 = linkedListTestDriver5.toArray();
        linkedListTestDriver5.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj10 = linkedListTestDriver5.remove((int) (short) 0);
        java.lang.Class<?> wildcardClass11 = linkedListTestDriver5.getClass();
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver5);
        linkedListTestDriver0.addFirst((java.lang.Object) 1.0d);
        boolean boolean16 = linkedListTestDriver0.remove((java.lang.Object) (short) 10);
        java.lang.Object[] objArray17 = linkedListTestDriver0.toArray();
        experiment.util.Iterator iterator18 = linkedListTestDriver0.iterator();
        linkedListTestDriver0.clear();
        experiment.util.Iterator iterator20 = linkedListTestDriver0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = linkedListTestDriver0.removeLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) 10 + "'", obj10, (byte) 10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertNotNull(iterator20);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test127");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator1 = linkedListTestDriver0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = linkedListTestDriver0.getLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test128");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        int int1 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver2 = new experiment.util.LinkedListTestDriver();
        int int3 = linkedListTestDriver2.size();
        linkedListTestDriver0.addFirst((java.lang.Object) int3);
        experiment.util.ListIterator listIterator6 = linkedListTestDriver0.listIterator(1);
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        boolean boolean10 = linkedListTestDriver8.contains((java.lang.Object) 1.0f);
        boolean boolean12 = linkedListTestDriver8.equals_CUT((java.lang.Object) 1.0d);
        boolean boolean14 = linkedListTestDriver8.remove((java.lang.Object) '4');
        linkedListTestDriver0.add(1, (java.lang.Object) '4');
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        int int18 = linkedListTestDriver17.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver19 = new experiment.util.LinkedListTestDriver();
        int int20 = linkedListTestDriver19.size();
        linkedListTestDriver17.addFirst((java.lang.Object) int20);
        experiment.util.ListIterator listIterator23 = linkedListTestDriver17.listIterator(1);
        experiment.util.LinkedListTestDriver linkedListTestDriver24 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray25 = linkedListTestDriver24.toArray();
        linkedListTestDriver24.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj29 = linkedListTestDriver24.remove((int) (short) 0);
        linkedListTestDriver24.clear();
        linkedListTestDriver24.clear();
        boolean boolean32 = linkedListTestDriver17.add((java.lang.Object) linkedListTestDriver24);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj33 = linkedListTestDriver0.set(2, (java.lang.Object) linkedListTestDriver24);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(listIterator6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(listIterator23);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[]");
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + (byte) 10 + "'", obj29, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test129");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) 1.0f);
        boolean boolean4 = linkedListTestDriver0.remove((java.lang.Object) 1.0f);
        int int5 = linkedListTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = linkedListTestDriver0.getFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test130");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        int int1 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver2 = new experiment.util.LinkedListTestDriver();
        int int3 = linkedListTestDriver2.size();
        linkedListTestDriver0.addFirst((java.lang.Object) int3);
        boolean boolean5 = linkedListTestDriver0.isEmpty();
        java.lang.Object obj6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = linkedListTestDriver0.remove(obj6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test131");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        int int1 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver2 = new experiment.util.LinkedListTestDriver();
        int int3 = linkedListTestDriver2.size();
        linkedListTestDriver0.addFirst((java.lang.Object) int3);
        boolean boolean5 = linkedListTestDriver0.isEmpty();
        boolean boolean7 = linkedListTestDriver0.equals_CUT((java.lang.Object) 10.0d);
        experiment.util.Iterator iterator8 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        int int10 = linkedListTestDriver9.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        int int12 = linkedListTestDriver11.size();
        linkedListTestDriver9.addFirst((java.lang.Object) int12);
        experiment.util.ListIterator listIterator15 = linkedListTestDriver9.listIterator(1);
        boolean boolean16 = linkedListTestDriver0.add((java.lang.Object) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        boolean boolean19 = linkedListTestDriver17.contains((java.lang.Object) 1.0f);
        boolean boolean21 = linkedListTestDriver17.equals_CUT((java.lang.Object) 1.0d);
        linkedListTestDriver17.addFirst((java.lang.Object) 0.0f);
        linkedListTestDriver0.addFirst((java.lang.Object) 0.0f);
        java.lang.Object obj25 = linkedListTestDriver0.removeLast();
        java.lang.Object obj26 = linkedListTestDriver0.getFirst();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(listIterator15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 1 + "'", obj25, 1);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 0.0f + "'", obj26, 0.0f);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test132");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray1 = linkedListTestDriver0.toArray();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj5 = linkedListTestDriver0.remove((int) (short) 0);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        int int10 = linkedListTestDriver9.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        int int12 = linkedListTestDriver11.size();
        linkedListTestDriver9.addFirst((java.lang.Object) int12);
        boolean boolean14 = linkedListTestDriver9.isEmpty();
        boolean boolean16 = linkedListTestDriver9.equals_CUT((java.lang.Object) 10.0d);
        java.lang.Object obj17 = linkedListTestDriver9.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver18 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray19 = linkedListTestDriver18.toArray();
        linkedListTestDriver18.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj23 = linkedListTestDriver18.remove((int) (short) 0);
        linkedListTestDriver18.clear();
        int int25 = linkedListTestDriver18.size();
        experiment.util.Iterator iterator26 = linkedListTestDriver18.iterator();
        java.lang.Object[] objArray27 = linkedListTestDriver18.toArray();
        boolean boolean28 = linkedListTestDriver9.contains((java.lang.Object) linkedListTestDriver18);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj29 = linkedListTestDriver0.set(0, (java.lang.Object) linkedListTestDriver9);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) 10 + "'", obj5, (byte) 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 0 + "'", obj17, 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (byte) 10 + "'", obj23, (byte) 10);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test133");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        int int1 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver2 = new experiment.util.LinkedListTestDriver();
        int int3 = linkedListTestDriver2.size();
        linkedListTestDriver0.addFirst((java.lang.Object) int3);
        boolean boolean5 = linkedListTestDriver0.isEmpty();
        boolean boolean7 = linkedListTestDriver0.equals_CUT((java.lang.Object) 10.0d);
        java.lang.Object obj8 = linkedListTestDriver0.getFirst();
        java.lang.Object obj9 = linkedListTestDriver0.getFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        int int11 = linkedListTestDriver10.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        int int13 = linkedListTestDriver12.size();
        linkedListTestDriver10.addFirst((java.lang.Object) int13);
        boolean boolean15 = linkedListTestDriver10.isEmpty();
        boolean boolean17 = linkedListTestDriver10.equals_CUT((java.lang.Object) 10.0d);
        experiment.util.Iterator iterator18 = linkedListTestDriver10.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver19 = new experiment.util.LinkedListTestDriver();
        int int20 = linkedListTestDriver19.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver21 = new experiment.util.LinkedListTestDriver();
        int int22 = linkedListTestDriver21.size();
        linkedListTestDriver19.addFirst((java.lang.Object) int22);
        experiment.util.ListIterator listIterator25 = linkedListTestDriver19.listIterator(1);
        boolean boolean26 = linkedListTestDriver10.add((java.lang.Object) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver27 = new experiment.util.LinkedListTestDriver();
        int int28 = linkedListTestDriver27.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver29 = new experiment.util.LinkedListTestDriver();
        int int30 = linkedListTestDriver29.size();
        linkedListTestDriver27.addFirst((java.lang.Object) int30);
        boolean boolean32 = linkedListTestDriver27.isEmpty();
        boolean boolean34 = linkedListTestDriver27.equals_CUT((java.lang.Object) 10.0d);
        experiment.util.Iterator iterator35 = linkedListTestDriver27.iterator();
        linkedListTestDriver10.addFirst((java.lang.Object) iterator35);
        boolean boolean37 = linkedListTestDriver10.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver38 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray39 = linkedListTestDriver38.toArray();
        linkedListTestDriver38.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj43 = linkedListTestDriver38.remove((int) (short) 0);
        linkedListTestDriver38.clear();
        int int45 = linkedListTestDriver38.size();
        experiment.util.Iterator iterator46 = linkedListTestDriver38.iterator();
        java.lang.Object[] objArray47 = linkedListTestDriver38.toArray();
        linkedListTestDriver38.addFirst((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver51 = new experiment.util.LinkedListTestDriver();
        int int52 = linkedListTestDriver51.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver53 = new experiment.util.LinkedListTestDriver();
        int int54 = linkedListTestDriver53.size();
        linkedListTestDriver51.addFirst((java.lang.Object) int54);
        boolean boolean56 = linkedListTestDriver51.isEmpty();
        boolean boolean58 = linkedListTestDriver51.equals_CUT((java.lang.Object) 10.0d);
        java.lang.Object obj59 = linkedListTestDriver51.removeFirst();
        linkedListTestDriver38.add(1, (java.lang.Object) linkedListTestDriver51);
        java.lang.Object[] objArray61 = linkedListTestDriver51.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver62 = new experiment.util.LinkedListTestDriver();
        boolean boolean64 = linkedListTestDriver62.contains((java.lang.Object) 1.0f);
        boolean boolean66 = linkedListTestDriver62.equals_CUT((java.lang.Object) 1.0d);
        experiment.util.LinkedListTestDriver linkedListTestDriver67 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray68 = linkedListTestDriver67.toArray();
        linkedListTestDriver67.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj72 = linkedListTestDriver67.remove((int) (short) 0);
        java.lang.Class<?> wildcardClass73 = linkedListTestDriver67.getClass();
        linkedListTestDriver62.addLast((java.lang.Object) linkedListTestDriver67);
        linkedListTestDriver62.addFirst((java.lang.Object) 1.0d);
        boolean boolean78 = linkedListTestDriver62.remove((java.lang.Object) (short) 10);
        java.lang.Object[] objArray79 = linkedListTestDriver62.toArray();
        experiment.util.Iterator iterator80 = linkedListTestDriver62.iterator();
        boolean boolean81 = linkedListTestDriver51.equals_CUT((java.lang.Object) linkedListTestDriver62);
        boolean boolean82 = linkedListTestDriver10.remove((java.lang.Object) linkedListTestDriver62);
        java.lang.Object obj83 = linkedListTestDriver10.removeFirst();
        experiment.util.ListIterator listIterator85 = linkedListTestDriver10.listIterator((int) (short) 1);
        boolean boolean86 = linkedListTestDriver0.contains((java.lang.Object) (short) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0 + "'", obj8, 0);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0 + "'", obj9, 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(listIterator25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(iterator35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[]");
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + (byte) 10 + "'", obj43, (byte) 10);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(iterator46);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertEquals("'" + obj59 + "' != '" + 0 + "'", obj59, 0);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray61), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray61), "[]");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(objArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray68), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray68), "[]");
        org.junit.Assert.assertEquals("'" + obj72 + "' != '" + (byte) 10 + "'", obj72, (byte) 10);
        org.junit.Assert.assertNotNull(wildcardClass73);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(objArray79);
        org.junit.Assert.assertNotNull(iterator80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(obj83);
        org.junit.Assert.assertNotNull(listIterator85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test134");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        int int1 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver2 = new experiment.util.LinkedListTestDriver();
        int int3 = linkedListTestDriver2.size();
        linkedListTestDriver0.addFirst((java.lang.Object) int3);
        boolean boolean5 = linkedListTestDriver0.isEmpty();
        boolean boolean7 = linkedListTestDriver0.equals_CUT((java.lang.Object) 10.0d);
        experiment.util.Iterator iterator8 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        int int10 = linkedListTestDriver9.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        int int12 = linkedListTestDriver11.size();
        linkedListTestDriver9.addFirst((java.lang.Object) int12);
        experiment.util.ListIterator listIterator15 = linkedListTestDriver9.listIterator(1);
        boolean boolean16 = linkedListTestDriver0.add((java.lang.Object) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        int int18 = linkedListTestDriver17.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver19 = new experiment.util.LinkedListTestDriver();
        int int20 = linkedListTestDriver19.size();
        linkedListTestDriver17.addFirst((java.lang.Object) int20);
        boolean boolean22 = linkedListTestDriver17.isEmpty();
        boolean boolean24 = linkedListTestDriver17.equals_CUT((java.lang.Object) 10.0d);
        experiment.util.Iterator iterator25 = linkedListTestDriver17.iterator();
        linkedListTestDriver0.addFirst((java.lang.Object) iterator25);
        boolean boolean27 = linkedListTestDriver0.isEmpty();
        int int28 = linkedListTestDriver0.size();
        int int29 = linkedListTestDriver0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(listIterator15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(iterator25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test135");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        int int1 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver2 = new experiment.util.LinkedListTestDriver();
        int int3 = linkedListTestDriver2.size();
        linkedListTestDriver0.addFirst((java.lang.Object) int3);
        boolean boolean5 = linkedListTestDriver0.isEmpty();
        boolean boolean7 = linkedListTestDriver0.equals_CUT((java.lang.Object) 10.0d);
        experiment.util.Iterator iterator8 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        int int10 = linkedListTestDriver9.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        int int12 = linkedListTestDriver11.size();
        linkedListTestDriver9.addFirst((java.lang.Object) int12);
        experiment.util.ListIterator listIterator15 = linkedListTestDriver9.listIterator(1);
        boolean boolean16 = linkedListTestDriver0.add((java.lang.Object) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        int int18 = linkedListTestDriver17.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver19 = new experiment.util.LinkedListTestDriver();
        int int20 = linkedListTestDriver19.size();
        linkedListTestDriver17.addFirst((java.lang.Object) int20);
        boolean boolean22 = linkedListTestDriver17.isEmpty();
        boolean boolean24 = linkedListTestDriver17.equals_CUT((java.lang.Object) 10.0d);
        experiment.util.Iterator iterator25 = linkedListTestDriver17.iterator();
        linkedListTestDriver0.addFirst((java.lang.Object) iterator25);
        boolean boolean27 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver28 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray29 = linkedListTestDriver28.toArray();
        linkedListTestDriver28.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj33 = linkedListTestDriver28.remove((int) (short) 0);
        linkedListTestDriver28.clear();
        int int35 = linkedListTestDriver28.size();
        experiment.util.Iterator iterator36 = linkedListTestDriver28.iterator();
        java.lang.Object[] objArray37 = linkedListTestDriver28.toArray();
        linkedListTestDriver28.addFirst((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver41 = new experiment.util.LinkedListTestDriver();
        int int42 = linkedListTestDriver41.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver43 = new experiment.util.LinkedListTestDriver();
        int int44 = linkedListTestDriver43.size();
        linkedListTestDriver41.addFirst((java.lang.Object) int44);
        boolean boolean46 = linkedListTestDriver41.isEmpty();
        boolean boolean48 = linkedListTestDriver41.equals_CUT((java.lang.Object) 10.0d);
        java.lang.Object obj49 = linkedListTestDriver41.removeFirst();
        linkedListTestDriver28.add(1, (java.lang.Object) linkedListTestDriver41);
        java.lang.Object[] objArray51 = linkedListTestDriver41.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver52 = new experiment.util.LinkedListTestDriver();
        boolean boolean54 = linkedListTestDriver52.contains((java.lang.Object) 1.0f);
        boolean boolean56 = linkedListTestDriver52.equals_CUT((java.lang.Object) 1.0d);
        experiment.util.LinkedListTestDriver linkedListTestDriver57 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray58 = linkedListTestDriver57.toArray();
        linkedListTestDriver57.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj62 = linkedListTestDriver57.remove((int) (short) 0);
        java.lang.Class<?> wildcardClass63 = linkedListTestDriver57.getClass();
        linkedListTestDriver52.addLast((java.lang.Object) linkedListTestDriver57);
        linkedListTestDriver52.addFirst((java.lang.Object) 1.0d);
        boolean boolean68 = linkedListTestDriver52.remove((java.lang.Object) (short) 10);
        java.lang.Object[] objArray69 = linkedListTestDriver52.toArray();
        experiment.util.Iterator iterator70 = linkedListTestDriver52.iterator();
        boolean boolean71 = linkedListTestDriver41.equals_CUT((java.lang.Object) linkedListTestDriver52);
        boolean boolean72 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver52);
        linkedListTestDriver52.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(listIterator15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(iterator25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[]");
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + (byte) 10 + "'", obj33, (byte) 10);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(iterator36);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[]");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + 0 + "'", obj49, 0);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray51), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray51), "[]");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray58), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray58), "[]");
        org.junit.Assert.assertEquals("'" + obj62 + "' != '" + (byte) 10 + "'", obj62, (byte) 10);
        org.junit.Assert.assertNotNull(wildcardClass63);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertNotNull(iterator70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test136");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) 1.0f);
        boolean boolean4 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1.0d);
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray6 = linkedListTestDriver5.toArray();
        linkedListTestDriver5.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj10 = linkedListTestDriver5.remove((int) (short) 0);
        java.lang.Class<?> wildcardClass11 = linkedListTestDriver5.getClass();
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver5);
        linkedListTestDriver0.addFirst((java.lang.Object) 1.0d);
        boolean boolean16 = linkedListTestDriver0.remove((java.lang.Object) (short) 10);
        java.lang.Object[] objArray17 = linkedListTestDriver0.toArray();
        experiment.util.Iterator iterator18 = linkedListTestDriver0.iterator();
        linkedListTestDriver0.clear();
        experiment.util.Iterator iterator20 = linkedListTestDriver0.iterator();
        java.lang.Class<?> wildcardClass21 = iterator20.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) 10 + "'", obj10, (byte) 10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test137");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        int int1 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver2 = new experiment.util.LinkedListTestDriver();
        int int3 = linkedListTestDriver2.size();
        linkedListTestDriver0.addFirst((java.lang.Object) int3);
        boolean boolean5 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        boolean boolean8 = linkedListTestDriver6.contains((java.lang.Object) 1.0f);
        boolean boolean10 = linkedListTestDriver6.equals_CUT((java.lang.Object) 1.0d);
        boolean boolean12 = linkedListTestDriver6.remove((java.lang.Object) '4');
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray14 = linkedListTestDriver13.toArray();
        linkedListTestDriver13.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver13.addLast((java.lang.Object) 100.0d);
        java.lang.Object obj19 = linkedListTestDriver13.removeLast();
        boolean boolean20 = linkedListTestDriver6.contains(obj19);
        linkedListTestDriver6.addFirst((java.lang.Object) (byte) 100);
        boolean boolean23 = linkedListTestDriver0.equals_CUT((java.lang.Object) linkedListTestDriver6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = linkedListTestDriver0.remove(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 100.0d + "'", obj19, 100.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test138");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) 1.0f);
        boolean boolean4 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1.0d);
        boolean boolean6 = linkedListTestDriver0.remove((java.lang.Object) '4');
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray8 = linkedListTestDriver7.toArray();
        linkedListTestDriver7.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver7.addLast((java.lang.Object) 100.0d);
        java.lang.Object obj13 = linkedListTestDriver7.removeLast();
        boolean boolean14 = linkedListTestDriver0.contains(obj13);
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 100);
        experiment.util.Iterator iterator17 = linkedListTestDriver0.iterator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100.0d + "'", obj13, 100.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(iterator17);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test139");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) 1.0f);
        boolean boolean4 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1.0d);
        boolean boolean6 = linkedListTestDriver0.remove((java.lang.Object) '4');
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray8 = linkedListTestDriver7.toArray();
        linkedListTestDriver7.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver7.addLast((java.lang.Object) 100.0d);
        java.lang.Object obj13 = linkedListTestDriver7.removeLast();
        boolean boolean14 = linkedListTestDriver0.contains(obj13);
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator16 = linkedListTestDriver0.listIterator(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 1; size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100.0d + "'", obj13, 100.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test140");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray1 = linkedListTestDriver0.toArray();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        boolean boolean6 = linkedListTestDriver4.contains((java.lang.Object) 1.0f);
        boolean boolean7 = linkedListTestDriver4.isEmpty();
        java.lang.Object[] objArray8 = linkedListTestDriver4.toArray();
        boolean boolean9 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver4);
        boolean boolean11 = linkedListTestDriver0.equals_CUT((java.lang.Object) '4');
        java.lang.Object obj12 = linkedListTestDriver0.removeLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver14 = new experiment.util.LinkedListTestDriver();
        boolean boolean16 = linkedListTestDriver14.contains((java.lang.Object) 1.0f);
        boolean boolean18 = linkedListTestDriver14.equals_CUT((java.lang.Object) 1.0d);
        experiment.util.LinkedListTestDriver linkedListTestDriver19 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray20 = linkedListTestDriver19.toArray();
        linkedListTestDriver19.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj24 = linkedListTestDriver19.remove((int) (short) 0);
        java.lang.Class<?> wildcardClass25 = linkedListTestDriver19.getClass();
        linkedListTestDriver14.addLast((java.lang.Object) linkedListTestDriver19);
        linkedListTestDriver14.addFirst((java.lang.Object) 1.0d);
        boolean boolean30 = linkedListTestDriver14.remove((java.lang.Object) (short) 10);
        experiment.util.LinkedListTestDriver linkedListTestDriver31 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray32 = linkedListTestDriver31.toArray();
        linkedListTestDriver31.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj36 = linkedListTestDriver31.remove((int) (short) 0);
        linkedListTestDriver31.clear();
        linkedListTestDriver14.addFirst((java.lang.Object) linkedListTestDriver31);
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.add((int) ' ', (java.lang.Object) linkedListTestDriver14);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 32; size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) 10 + "'", obj12, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (byte) 10 + "'", obj24, (byte) 10);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[]");
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + (byte) 10 + "'", obj36, (byte) 10);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test141");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        int int1 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver2 = new experiment.util.LinkedListTestDriver();
        int int3 = linkedListTestDriver2.size();
        linkedListTestDriver0.addFirst((java.lang.Object) int3);
        experiment.util.ListIterator listIterator6 = linkedListTestDriver0.listIterator(1);
        int int7 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        int int10 = linkedListTestDriver9.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        int int12 = linkedListTestDriver11.size();
        linkedListTestDriver9.addFirst((java.lang.Object) int12);
        boolean boolean14 = linkedListTestDriver9.isEmpty();
        boolean boolean16 = linkedListTestDriver9.equals_CUT((java.lang.Object) 10.0d);
        java.lang.Object obj17 = linkedListTestDriver9.removeFirst();
        linkedListTestDriver0.add((int) (short) 1, obj17);
        experiment.util.LinkedListTestDriver linkedListTestDriver19 = new experiment.util.LinkedListTestDriver();
        boolean boolean21 = linkedListTestDriver19.contains((java.lang.Object) 1.0f);
        boolean boolean23 = linkedListTestDriver19.remove((java.lang.Object) 1.0f);
        int int24 = linkedListTestDriver19.size();
        boolean boolean25 = linkedListTestDriver0.equals_CUT((java.lang.Object) int24);
        experiment.util.LinkedListTestDriver linkedListTestDriver26 = new experiment.util.LinkedListTestDriver();
        int int27 = linkedListTestDriver26.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver28 = new experiment.util.LinkedListTestDriver();
        int int29 = linkedListTestDriver28.size();
        linkedListTestDriver26.addFirst((java.lang.Object) int29);
        boolean boolean31 = linkedListTestDriver26.isEmpty();
        boolean boolean33 = linkedListTestDriver26.equals_CUT((java.lang.Object) 10.0d);
        java.lang.Object obj34 = linkedListTestDriver26.getFirst();
        java.lang.Object obj35 = linkedListTestDriver26.getFirst();
        java.lang.Object obj36 = linkedListTestDriver26.getLast();
        boolean boolean37 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver26);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj39 = linkedListTestDriver26.remove(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(listIterator6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 0 + "'", obj17, 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + 0 + "'", obj34, 0);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 0 + "'", obj35, 0);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + 0 + "'", obj36, 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test142");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray1 = linkedListTestDriver0.toArray();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        boolean boolean6 = linkedListTestDriver4.contains((java.lang.Object) 1.0f);
        boolean boolean7 = linkedListTestDriver4.isEmpty();
        java.lang.Object[] objArray8 = linkedListTestDriver4.toArray();
        boolean boolean9 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver4);
        int int10 = linkedListTestDriver4.size();
        linkedListTestDriver4.clear();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test143");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        int int1 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver2 = new experiment.util.LinkedListTestDriver();
        int int3 = linkedListTestDriver2.size();
        linkedListTestDriver0.addFirst((java.lang.Object) int3);
        boolean boolean5 = linkedListTestDriver0.isEmpty();
        boolean boolean7 = linkedListTestDriver0.equals_CUT((java.lang.Object) 10.0d);
        experiment.util.Iterator iterator8 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        int int10 = linkedListTestDriver9.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        int int12 = linkedListTestDriver11.size();
        linkedListTestDriver9.addFirst((java.lang.Object) int12);
        boolean boolean14 = linkedListTestDriver9.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver15 = new experiment.util.LinkedListTestDriver();
        boolean boolean17 = linkedListTestDriver15.contains((java.lang.Object) 1.0f);
        boolean boolean19 = linkedListTestDriver15.equals_CUT((java.lang.Object) 1.0d);
        experiment.util.LinkedListTestDriver linkedListTestDriver20 = new experiment.util.LinkedListTestDriver();
        boolean boolean22 = linkedListTestDriver20.contains((java.lang.Object) 1.0f);
        boolean boolean24 = linkedListTestDriver20.equals_CUT((java.lang.Object) 1.0d);
        boolean boolean25 = linkedListTestDriver15.remove((java.lang.Object) linkedListTestDriver20);
        linkedListTestDriver9.addFirst((java.lang.Object) boolean25);
        experiment.util.LinkedListTestDriver linkedListTestDriver27 = new experiment.util.LinkedListTestDriver();
        boolean boolean29 = linkedListTestDriver27.contains((java.lang.Object) 1.0f);
        boolean boolean30 = linkedListTestDriver27.isEmpty();
        java.lang.Object[] objArray31 = linkedListTestDriver27.toArray();
        java.lang.Class<?> wildcardClass32 = objArray31.getClass();
        linkedListTestDriver9.addLast((java.lang.Object) wildcardClass32);
        java.lang.Object obj34 = linkedListTestDriver9.removeFirst();
        java.lang.Object obj36 = linkedListTestDriver9.remove(0);
        java.lang.Object obj37 = linkedListTestDriver9.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver38 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray39 = linkedListTestDriver38.toArray();
        linkedListTestDriver38.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj43 = linkedListTestDriver38.remove((int) (short) 0);
        linkedListTestDriver38.clear();
        int int45 = linkedListTestDriver38.size();
        experiment.util.Iterator iterator46 = linkedListTestDriver38.iterator();
        java.lang.Object[] objArray47 = linkedListTestDriver38.toArray();
        linkedListTestDriver38.addFirst((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver51 = new experiment.util.LinkedListTestDriver();
        int int52 = linkedListTestDriver51.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver53 = new experiment.util.LinkedListTestDriver();
        int int54 = linkedListTestDriver53.size();
        linkedListTestDriver51.addFirst((java.lang.Object) int54);
        boolean boolean56 = linkedListTestDriver51.isEmpty();
        boolean boolean58 = linkedListTestDriver51.equals_CUT((java.lang.Object) 10.0d);
        java.lang.Object obj59 = linkedListTestDriver51.removeFirst();
        linkedListTestDriver38.add(1, (java.lang.Object) linkedListTestDriver51);
        linkedListTestDriver9.addLast((java.lang.Object) linkedListTestDriver38);
        java.lang.Object obj63 = linkedListTestDriver9.get((int) (byte) 1);
        java.lang.Object obj65 = linkedListTestDriver9.remove(0);
        boolean boolean66 = linkedListTestDriver0.equals_CUT((java.lang.Object) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[]");
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + false + "'", obj34, false);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + 0 + "'", obj36, 0);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertEquals(obj37.toString(), "class [Ljava.lang.Object;");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj37), "class [Ljava.lang.Object;");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj37), "class [Ljava.lang.Object;");
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[]");
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + (byte) 10 + "'", obj43, (byte) 10);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(iterator46);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertEquals("'" + obj59 + "' != '" + 0 + "'", obj59, 0);
        org.junit.Assert.assertNotNull(obj63);
        org.junit.Assert.assertNotNull(obj65);
        org.junit.Assert.assertEquals(obj65.toString(), "class [Ljava.lang.Object;");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj65), "class [Ljava.lang.Object;");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj65), "class [Ljava.lang.Object;");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test144");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        int int1 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver2 = new experiment.util.LinkedListTestDriver();
        int int3 = linkedListTestDriver2.size();
        linkedListTestDriver0.addFirst((java.lang.Object) int3);
        boolean boolean5 = linkedListTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = linkedListTestDriver0.remove((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test145");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        int int1 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver2 = new experiment.util.LinkedListTestDriver();
        int int3 = linkedListTestDriver2.size();
        linkedListTestDriver0.addFirst((java.lang.Object) int3);
        experiment.util.ListIterator listIterator6 = linkedListTestDriver0.listIterator(1);
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        boolean boolean10 = linkedListTestDriver8.contains((java.lang.Object) 1.0f);
        boolean boolean12 = linkedListTestDriver8.equals_CUT((java.lang.Object) 1.0d);
        boolean boolean14 = linkedListTestDriver8.remove((java.lang.Object) '4');
        linkedListTestDriver0.add(1, (java.lang.Object) '4');
        java.lang.Object obj16 = linkedListTestDriver0.removeLast();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(listIterator6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + '4' + "'", obj16, '4');
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test146");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) 1.0f);
        boolean boolean3 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        boolean boolean6 = linkedListTestDriver4.contains((java.lang.Object) 1.0f);
        boolean boolean7 = linkedListTestDriver4.isEmpty();
        boolean boolean8 = linkedListTestDriver4.isEmpty();
        boolean boolean10 = linkedListTestDriver4.contains((java.lang.Object) 10);
        boolean boolean11 = linkedListTestDriver0.add((java.lang.Object) 10);
        java.lang.Class<?> wildcardClass12 = linkedListTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test147");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray1 = linkedListTestDriver0.toArray();
        int int2 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver3 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray4 = linkedListTestDriver3.toArray();
        linkedListTestDriver3.addFirst((java.lang.Object) (byte) 10);
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        boolean boolean9 = linkedListTestDriver7.contains((java.lang.Object) 1.0f);
        boolean boolean10 = linkedListTestDriver7.isEmpty();
        java.lang.Object[] objArray11 = linkedListTestDriver7.toArray();
        boolean boolean12 = linkedListTestDriver3.contains((java.lang.Object) linkedListTestDriver7);
        linkedListTestDriver0.addFirst((java.lang.Object) boolean12);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test148");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        int int1 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver2 = new experiment.util.LinkedListTestDriver();
        int int3 = linkedListTestDriver2.size();
        linkedListTestDriver0.addFirst((java.lang.Object) int3);
        experiment.util.ListIterator listIterator6 = linkedListTestDriver0.listIterator(1);
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray8 = linkedListTestDriver7.toArray();
        linkedListTestDriver7.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj12 = linkedListTestDriver7.remove((int) (short) 0);
        linkedListTestDriver7.clear();
        linkedListTestDriver7.clear();
        boolean boolean15 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = linkedListTestDriver7.getLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(listIterator6);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) 10 + "'", obj12, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test149");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) 1.0f);
        boolean boolean4 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1.0d);
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        boolean boolean7 = linkedListTestDriver5.contains((java.lang.Object) 1.0f);
        boolean boolean9 = linkedListTestDriver5.equals_CUT((java.lang.Object) 1.0d);
        boolean boolean10 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver5);
        linkedListTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = linkedListTestDriver0.get((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test150");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray1 = linkedListTestDriver0.toArray();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        boolean boolean6 = linkedListTestDriver4.contains((java.lang.Object) 1.0f);
        boolean boolean7 = linkedListTestDriver4.isEmpty();
        java.lang.Object[] objArray8 = linkedListTestDriver4.toArray();
        boolean boolean9 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver4);
        boolean boolean11 = linkedListTestDriver0.equals_CUT((java.lang.Object) '4');
        java.lang.Object obj12 = linkedListTestDriver0.removeLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        boolean boolean15 = linkedListTestDriver13.contains((java.lang.Object) 1.0f);
        boolean boolean17 = linkedListTestDriver13.equals_CUT((java.lang.Object) 1.0d);
        experiment.util.LinkedListTestDriver linkedListTestDriver18 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray19 = linkedListTestDriver18.toArray();
        linkedListTestDriver18.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj23 = linkedListTestDriver18.remove((int) (short) 0);
        java.lang.Class<?> wildcardClass24 = linkedListTestDriver18.getClass();
        linkedListTestDriver13.addLast((java.lang.Object) linkedListTestDriver18);
        linkedListTestDriver13.addFirst((java.lang.Object) 1.0d);
        boolean boolean29 = linkedListTestDriver13.remove((java.lang.Object) (short) 10);
        boolean boolean31 = linkedListTestDriver13.remove((java.lang.Object) (short) 100);
        boolean boolean32 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj34 = linkedListTestDriver0.get((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) 10 + "'", obj12, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (byte) 10 + "'", obj23, (byte) 10);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test151");
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
        experiment.util.LinkedListTestDriver linkedListTestDriver18 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray19 = linkedListTestDriver18.toArray();
        linkedListTestDriver18.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj23 = linkedListTestDriver18.remove((int) (short) 0);
        linkedListTestDriver18.clear();
        int int25 = linkedListTestDriver18.size();
        experiment.util.Iterator iterator26 = linkedListTestDriver18.iterator();
        java.lang.Object[] objArray27 = linkedListTestDriver18.toArray();
        linkedListTestDriver18.addFirst((java.lang.Object) '#');
        linkedListTestDriver0.addLast((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver32 = new experiment.util.LinkedListTestDriver();
        int int33 = linkedListTestDriver32.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver34 = new experiment.util.LinkedListTestDriver();
        int int35 = linkedListTestDriver34.size();
        linkedListTestDriver32.addFirst((java.lang.Object) int35);
        boolean boolean37 = linkedListTestDriver32.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver38 = new experiment.util.LinkedListTestDriver();
        boolean boolean40 = linkedListTestDriver38.contains((java.lang.Object) 1.0f);
        boolean boolean42 = linkedListTestDriver38.equals_CUT((java.lang.Object) 1.0d);
        experiment.util.LinkedListTestDriver linkedListTestDriver43 = new experiment.util.LinkedListTestDriver();
        boolean boolean45 = linkedListTestDriver43.contains((java.lang.Object) 1.0f);
        boolean boolean47 = linkedListTestDriver43.equals_CUT((java.lang.Object) 1.0d);
        boolean boolean48 = linkedListTestDriver38.remove((java.lang.Object) linkedListTestDriver43);
        linkedListTestDriver32.addFirst((java.lang.Object) boolean48);
        experiment.util.LinkedListTestDriver linkedListTestDriver50 = new experiment.util.LinkedListTestDriver();
        boolean boolean52 = linkedListTestDriver50.contains((java.lang.Object) 1.0f);
        boolean boolean53 = linkedListTestDriver50.isEmpty();
        java.lang.Object[] objArray54 = linkedListTestDriver50.toArray();
        java.lang.Class<?> wildcardClass55 = objArray54.getClass();
        linkedListTestDriver32.addLast((java.lang.Object) wildcardClass55);
        java.lang.Object obj57 = linkedListTestDriver32.removeFirst();
        java.lang.Object obj59 = linkedListTestDriver32.remove(0);
        experiment.util.LinkedListTestDriver linkedListTestDriver60 = new experiment.util.LinkedListTestDriver();
        int int61 = linkedListTestDriver60.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver62 = new experiment.util.LinkedListTestDriver();
        int int63 = linkedListTestDriver62.size();
        linkedListTestDriver60.addFirst((java.lang.Object) int63);
        boolean boolean65 = linkedListTestDriver60.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver66 = new experiment.util.LinkedListTestDriver();
        boolean boolean68 = linkedListTestDriver66.contains((java.lang.Object) 1.0f);
        boolean boolean70 = linkedListTestDriver66.equals_CUT((java.lang.Object) 1.0d);
        boolean boolean71 = linkedListTestDriver60.contains((java.lang.Object) boolean70);
        experiment.util.Iterator iterator72 = linkedListTestDriver60.iterator();
        boolean boolean73 = linkedListTestDriver32.equals_CUT((java.lang.Object) iterator72);
        java.lang.Object obj74 = linkedListTestDriver0.set(1, (java.lang.Object) iterator72);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (byte) 10 + "'", obj23, (byte) 10);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray54), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray54), "[]");
        org.junit.Assert.assertNotNull(wildcardClass55);
        org.junit.Assert.assertEquals("'" + obj57 + "' != '" + false + "'", obj57, false);
        org.junit.Assert.assertEquals("'" + obj59 + "' != '" + 0 + "'", obj59, 0);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(iterator72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertEquals("'" + obj74 + "' != '" + 0 + "'", obj74, 0);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test152");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) 1.0f);
        boolean boolean4 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1.0d);
        boolean boolean6 = linkedListTestDriver0.remove((java.lang.Object) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = linkedListTestDriver0.getFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test153");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        int int1 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver2 = new experiment.util.LinkedListTestDriver();
        int int3 = linkedListTestDriver2.size();
        linkedListTestDriver0.addFirst((java.lang.Object) int3);
        experiment.util.Iterator iterator5 = linkedListTestDriver0.iterator();
        boolean boolean6 = linkedListTestDriver0.isEmpty();
        java.lang.Object obj7 = linkedListTestDriver0.removeFirst();
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.add((int) (byte) 1, (java.lang.Object) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 1; size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0 + "'", obj7, 0);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test154");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        int int1 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver2 = new experiment.util.LinkedListTestDriver();
        int int3 = linkedListTestDriver2.size();
        linkedListTestDriver0.addFirst((java.lang.Object) int3);
        boolean boolean5 = linkedListTestDriver0.isEmpty();
        boolean boolean7 = linkedListTestDriver0.equals_CUT((java.lang.Object) 10.0d);
        experiment.util.Iterator iterator8 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        int int10 = linkedListTestDriver9.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        int int12 = linkedListTestDriver11.size();
        linkedListTestDriver9.addFirst((java.lang.Object) int12);
        experiment.util.ListIterator listIterator15 = linkedListTestDriver9.listIterator(1);
        boolean boolean16 = linkedListTestDriver0.add((java.lang.Object) 1);
        java.lang.Class<?> wildcardClass17 = linkedListTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(listIterator15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test155");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) 1.0f);
        boolean boolean4 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1.0d);
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray6 = linkedListTestDriver5.toArray();
        linkedListTestDriver5.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj10 = linkedListTestDriver5.remove((int) (short) 0);
        java.lang.Class<?> wildcardClass11 = linkedListTestDriver5.getClass();
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver5);
        linkedListTestDriver0.addFirst((java.lang.Object) 1.0d);
        boolean boolean16 = linkedListTestDriver0.remove((java.lang.Object) (short) 10);
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray18 = linkedListTestDriver17.toArray();
        linkedListTestDriver17.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj22 = linkedListTestDriver17.remove((int) (short) 0);
        linkedListTestDriver17.clear();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver17);
        experiment.util.LinkedListTestDriver linkedListTestDriver25 = new experiment.util.LinkedListTestDriver();
        int int26 = linkedListTestDriver25.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver27 = new experiment.util.LinkedListTestDriver();
        int int28 = linkedListTestDriver27.size();
        linkedListTestDriver25.addFirst((java.lang.Object) int28);
        boolean boolean30 = linkedListTestDriver25.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver31 = new experiment.util.LinkedListTestDriver();
        boolean boolean33 = linkedListTestDriver31.contains((java.lang.Object) 1.0f);
        boolean boolean35 = linkedListTestDriver31.equals_CUT((java.lang.Object) 1.0d);
        experiment.util.LinkedListTestDriver linkedListTestDriver36 = new experiment.util.LinkedListTestDriver();
        boolean boolean38 = linkedListTestDriver36.contains((java.lang.Object) 1.0f);
        boolean boolean40 = linkedListTestDriver36.equals_CUT((java.lang.Object) 1.0d);
        boolean boolean41 = linkedListTestDriver31.remove((java.lang.Object) linkedListTestDriver36);
        linkedListTestDriver25.addFirst((java.lang.Object) boolean41);
        experiment.util.LinkedListTestDriver linkedListTestDriver43 = new experiment.util.LinkedListTestDriver();
        boolean boolean45 = linkedListTestDriver43.contains((java.lang.Object) 1.0f);
        boolean boolean46 = linkedListTestDriver43.isEmpty();
        java.lang.Object[] objArray47 = linkedListTestDriver43.toArray();
        java.lang.Class<?> wildcardClass48 = objArray47.getClass();
        linkedListTestDriver25.addLast((java.lang.Object) wildcardClass48);
        linkedListTestDriver17.addFirst((java.lang.Object) linkedListTestDriver25);
        linkedListTestDriver17.clear();
        experiment.util.Iterator iterator52 = linkedListTestDriver17.iterator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) 10 + "'", obj10, (byte) 10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (byte) 10 + "'", obj22, (byte) 10);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[]");
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertNotNull(iterator52);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test156");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray1 = linkedListTestDriver0.toArray();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj5 = linkedListTestDriver0.remove((int) (short) 0);
        int int6 = linkedListTestDriver0.size();
        java.lang.Object[] objArray7 = linkedListTestDriver0.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        boolean boolean9 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = linkedListTestDriver0.removeFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) 10 + "'", obj5, (byte) 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test157");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray1 = linkedListTestDriver0.toArray();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj5 = linkedListTestDriver0.remove((int) (short) 0);
        int int6 = linkedListTestDriver0.size();
        java.lang.Object[] objArray7 = linkedListTestDriver0.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        boolean boolean9 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = linkedListTestDriver0.get((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) 10 + "'", obj5, (byte) 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test158");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        int int1 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver2 = new experiment.util.LinkedListTestDriver();
        int int3 = linkedListTestDriver2.size();
        linkedListTestDriver0.addFirst((java.lang.Object) int3);
        boolean boolean5 = linkedListTestDriver0.isEmpty();
        boolean boolean7 = linkedListTestDriver0.equals_CUT((java.lang.Object) 10.0d);
        java.lang.Object obj8 = linkedListTestDriver0.removeFirst();
        java.lang.Object[] objArray9 = linkedListTestDriver0.toArray();
        linkedListTestDriver0.addFirst((java.lang.Object) ' ');
        java.lang.Object obj13 = linkedListTestDriver0.get((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0 + "'", obj8, 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + ' ' + "'", obj13, ' ');
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test159");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray1 = linkedListTestDriver0.toArray();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj5 = linkedListTestDriver0.remove((int) (short) 0);
        linkedListTestDriver0.clear();
        int int7 = linkedListTestDriver0.size();
        experiment.util.Iterator iterator8 = linkedListTestDriver0.iterator();
        java.lang.Object[] objArray9 = linkedListTestDriver0.toArray();
        linkedListTestDriver0.addFirst((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        int int14 = linkedListTestDriver13.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver15 = new experiment.util.LinkedListTestDriver();
        int int16 = linkedListTestDriver15.size();
        linkedListTestDriver13.addFirst((java.lang.Object) int16);
        boolean boolean18 = linkedListTestDriver13.isEmpty();
        boolean boolean20 = linkedListTestDriver13.equals_CUT((java.lang.Object) 10.0d);
        java.lang.Object obj21 = linkedListTestDriver13.removeFirst();
        linkedListTestDriver0.add(1, (java.lang.Object) linkedListTestDriver13);
        experiment.util.Iterator iterator23 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver25 = new experiment.util.LinkedListTestDriver();
        boolean boolean27 = linkedListTestDriver25.contains((java.lang.Object) 1.0f);
        boolean boolean29 = linkedListTestDriver25.equals_CUT((java.lang.Object) 1.0d);
        experiment.util.LinkedListTestDriver linkedListTestDriver30 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray31 = linkedListTestDriver30.toArray();
        linkedListTestDriver30.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj35 = linkedListTestDriver30.remove((int) (short) 0);
        java.lang.Class<?> wildcardClass36 = linkedListTestDriver30.getClass();
        linkedListTestDriver25.addLast((java.lang.Object) linkedListTestDriver30);
        linkedListTestDriver25.addFirst((java.lang.Object) 1.0d);
        boolean boolean41 = linkedListTestDriver25.remove((java.lang.Object) (short) 10);
        boolean boolean43 = linkedListTestDriver25.remove((java.lang.Object) (short) 100);
        linkedListTestDriver25.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj45 = linkedListTestDriver0.set((int) (short) 10, (java.lang.Object) linkedListTestDriver25);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) 10 + "'", obj5, (byte) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 0 + "'", obj21, 0);
        org.junit.Assert.assertNotNull(iterator23);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[]");
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + (byte) 10 + "'", obj35, (byte) 10);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test160");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        int int1 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver2 = new experiment.util.LinkedListTestDriver();
        int int3 = linkedListTestDriver2.size();
        linkedListTestDriver0.addFirst((java.lang.Object) int3);
        boolean boolean5 = linkedListTestDriver0.isEmpty();
        boolean boolean7 = linkedListTestDriver0.equals_CUT((java.lang.Object) 10.0d);
        experiment.util.Iterator iterator8 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        int int10 = linkedListTestDriver9.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        int int12 = linkedListTestDriver11.size();
        linkedListTestDriver9.addFirst((java.lang.Object) int12);
        experiment.util.ListIterator listIterator15 = linkedListTestDriver9.listIterator(1);
        boolean boolean16 = linkedListTestDriver0.add((java.lang.Object) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        boolean boolean19 = linkedListTestDriver17.contains((java.lang.Object) 1.0f);
        boolean boolean21 = linkedListTestDriver17.equals_CUT((java.lang.Object) 1.0d);
        linkedListTestDriver17.addFirst((java.lang.Object) 0.0f);
        linkedListTestDriver0.addFirst((java.lang.Object) 0.0f);
        java.lang.Object obj25 = linkedListTestDriver0.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver27 = new experiment.util.LinkedListTestDriver();
        int int28 = linkedListTestDriver27.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver29 = new experiment.util.LinkedListTestDriver();
        int int30 = linkedListTestDriver29.size();
        linkedListTestDriver27.addFirst((java.lang.Object) int30);
        boolean boolean32 = linkedListTestDriver27.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver33 = new experiment.util.LinkedListTestDriver();
        boolean boolean35 = linkedListTestDriver33.contains((java.lang.Object) 1.0f);
        boolean boolean37 = linkedListTestDriver33.equals_CUT((java.lang.Object) 1.0d);
        boolean boolean38 = linkedListTestDriver27.contains((java.lang.Object) boolean37);
        experiment.util.Iterator iterator39 = linkedListTestDriver27.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj40 = linkedListTestDriver0.set((int) 'a', (java.lang.Object) iterator39);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(listIterator15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 1 + "'", obj25, 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(iterator39);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test161");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) 1.0f);
        boolean boolean4 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1.0d);
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray6 = linkedListTestDriver5.toArray();
        linkedListTestDriver5.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj10 = linkedListTestDriver5.remove((int) (short) 0);
        java.lang.Class<?> wildcardClass11 = linkedListTestDriver5.getClass();
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver5);
        linkedListTestDriver0.addFirst((java.lang.Object) 1.0d);
        boolean boolean16 = linkedListTestDriver0.remove((java.lang.Object) (short) 10);
        java.lang.Object obj18 = linkedListTestDriver0.remove(0);
        experiment.util.LinkedListTestDriver linkedListTestDriver19 = new experiment.util.LinkedListTestDriver();
        int int20 = linkedListTestDriver19.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver21 = new experiment.util.LinkedListTestDriver();
        int int22 = linkedListTestDriver21.size();
        linkedListTestDriver19.addFirst((java.lang.Object) int22);
        boolean boolean24 = linkedListTestDriver19.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver25 = new experiment.util.LinkedListTestDriver();
        boolean boolean27 = linkedListTestDriver25.contains((java.lang.Object) 1.0f);
        boolean boolean29 = linkedListTestDriver25.equals_CUT((java.lang.Object) 1.0d);
        experiment.util.LinkedListTestDriver linkedListTestDriver30 = new experiment.util.LinkedListTestDriver();
        boolean boolean32 = linkedListTestDriver30.contains((java.lang.Object) 1.0f);
        boolean boolean34 = linkedListTestDriver30.equals_CUT((java.lang.Object) 1.0d);
        boolean boolean35 = linkedListTestDriver25.remove((java.lang.Object) linkedListTestDriver30);
        linkedListTestDriver19.addFirst((java.lang.Object) boolean35);
        experiment.util.LinkedListTestDriver linkedListTestDriver37 = new experiment.util.LinkedListTestDriver();
        boolean boolean39 = linkedListTestDriver37.contains((java.lang.Object) 1.0f);
        boolean boolean40 = linkedListTestDriver37.isEmpty();
        java.lang.Object[] objArray41 = linkedListTestDriver37.toArray();
        java.lang.Class<?> wildcardClass42 = objArray41.getClass();
        linkedListTestDriver19.addLast((java.lang.Object) wildcardClass42);
        java.lang.Object obj44 = linkedListTestDriver19.removeFirst();
        java.lang.Object obj46 = linkedListTestDriver19.remove(0);
        java.lang.Object obj47 = linkedListTestDriver19.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver48 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray49 = linkedListTestDriver48.toArray();
        linkedListTestDriver48.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj53 = linkedListTestDriver48.remove((int) (short) 0);
        linkedListTestDriver48.clear();
        int int55 = linkedListTestDriver48.size();
        experiment.util.Iterator iterator56 = linkedListTestDriver48.iterator();
        java.lang.Object[] objArray57 = linkedListTestDriver48.toArray();
        linkedListTestDriver48.addFirst((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver61 = new experiment.util.LinkedListTestDriver();
        int int62 = linkedListTestDriver61.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver63 = new experiment.util.LinkedListTestDriver();
        int int64 = linkedListTestDriver63.size();
        linkedListTestDriver61.addFirst((java.lang.Object) int64);
        boolean boolean66 = linkedListTestDriver61.isEmpty();
        boolean boolean68 = linkedListTestDriver61.equals_CUT((java.lang.Object) 10.0d);
        java.lang.Object obj69 = linkedListTestDriver61.removeFirst();
        linkedListTestDriver48.add(1, (java.lang.Object) linkedListTestDriver61);
        linkedListTestDriver19.addLast((java.lang.Object) linkedListTestDriver48);
        boolean boolean72 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver19);
        experiment.util.LinkedListTestDriver linkedListTestDriver74 = new experiment.util.LinkedListTestDriver();
        boolean boolean76 = linkedListTestDriver74.contains((java.lang.Object) 1.0f);
        boolean boolean77 = linkedListTestDriver74.isEmpty();
        java.lang.Object[] objArray78 = linkedListTestDriver74.toArray();
        experiment.util.Iterator iterator79 = linkedListTestDriver74.iterator();
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.add((int) 'a', (java.lang.Object) linkedListTestDriver74);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 97; size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) 10 + "'", obj10, (byte) 10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 1.0d + "'", obj18, 1.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[]");
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + false + "'", obj44, false);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + 0 + "'", obj46, 0);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertEquals(obj47.toString(), "class [Ljava.lang.Object;");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj47), "class [Ljava.lang.Object;");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj47), "class [Ljava.lang.Object;");
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray49), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray49), "[]");
        org.junit.Assert.assertEquals("'" + obj53 + "' != '" + (byte) 10 + "'", obj53, (byte) 10);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(iterator56);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray57), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray57), "[]");
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertEquals("'" + obj69 + "' != '" + 0 + "'", obj69, 0);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(objArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray78), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray78), "[]");
        org.junit.Assert.assertNotNull(iterator79);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test162");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray1 = linkedListTestDriver0.toArray();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        boolean boolean6 = linkedListTestDriver4.contains((java.lang.Object) 1.0f);
        boolean boolean7 = linkedListTestDriver4.isEmpty();
        java.lang.Object[] objArray8 = linkedListTestDriver4.toArray();
        boolean boolean9 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver4);
        boolean boolean11 = linkedListTestDriver0.equals_CUT((java.lang.Object) '4');
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray13 = linkedListTestDriver12.toArray();
        linkedListTestDriver12.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj17 = linkedListTestDriver12.remove((int) (short) 0);
        linkedListTestDriver12.clear();
        linkedListTestDriver12.clear();
        boolean boolean20 = linkedListTestDriver0.equals_CUT((java.lang.Object) linkedListTestDriver12);
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator22 = linkedListTestDriver0.listIterator((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: -1; size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) 10 + "'", obj17, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test163");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        int int1 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver2 = new experiment.util.LinkedListTestDriver();
        int int3 = linkedListTestDriver2.size();
        linkedListTestDriver0.addFirst((java.lang.Object) int3);
        boolean boolean5 = linkedListTestDriver0.isEmpty();
        boolean boolean7 = linkedListTestDriver0.equals_CUT((java.lang.Object) 10.0d);
        java.lang.Object obj8 = linkedListTestDriver0.removeFirst();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = linkedListTestDriver0.removeLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0 + "'", obj8, 0);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test164");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray1 = linkedListTestDriver0.toArray();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.addLast((java.lang.Object) 100.0d);
        boolean boolean7 = linkedListTestDriver0.add((java.lang.Object) ' ');
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        int int10 = linkedListTestDriver9.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        int int12 = linkedListTestDriver11.size();
        linkedListTestDriver9.addFirst((java.lang.Object) int12);
        experiment.util.ListIterator listIterator15 = linkedListTestDriver9.listIterator(1);
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        int int18 = linkedListTestDriver17.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver19 = new experiment.util.LinkedListTestDriver();
        int int20 = linkedListTestDriver19.size();
        linkedListTestDriver17.addFirst((java.lang.Object) int20);
        boolean boolean22 = linkedListTestDriver17.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver23 = new experiment.util.LinkedListTestDriver();
        boolean boolean25 = linkedListTestDriver23.contains((java.lang.Object) 1.0f);
        boolean boolean27 = linkedListTestDriver23.equals_CUT((java.lang.Object) 1.0d);
        experiment.util.LinkedListTestDriver linkedListTestDriver28 = new experiment.util.LinkedListTestDriver();
        boolean boolean30 = linkedListTestDriver28.contains((java.lang.Object) 1.0f);
        boolean boolean32 = linkedListTestDriver28.equals_CUT((java.lang.Object) 1.0d);
        boolean boolean33 = linkedListTestDriver23.remove((java.lang.Object) linkedListTestDriver28);
        linkedListTestDriver17.addFirst((java.lang.Object) boolean33);
        experiment.util.LinkedListTestDriver linkedListTestDriver35 = new experiment.util.LinkedListTestDriver();
        boolean boolean37 = linkedListTestDriver35.contains((java.lang.Object) 1.0f);
        boolean boolean38 = linkedListTestDriver35.isEmpty();
        java.lang.Object[] objArray39 = linkedListTestDriver35.toArray();
        java.lang.Class<?> wildcardClass40 = objArray39.getClass();
        linkedListTestDriver17.addLast((java.lang.Object) wildcardClass40);
        java.lang.Object obj42 = linkedListTestDriver17.removeFirst();
        java.lang.Object obj44 = linkedListTestDriver17.remove(0);
        experiment.util.LinkedListTestDriver linkedListTestDriver45 = new experiment.util.LinkedListTestDriver();
        int int46 = linkedListTestDriver45.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver47 = new experiment.util.LinkedListTestDriver();
        int int48 = linkedListTestDriver47.size();
        linkedListTestDriver45.addFirst((java.lang.Object) int48);
        boolean boolean50 = linkedListTestDriver45.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver51 = new experiment.util.LinkedListTestDriver();
        boolean boolean53 = linkedListTestDriver51.contains((java.lang.Object) 1.0f);
        boolean boolean55 = linkedListTestDriver51.equals_CUT((java.lang.Object) 1.0d);
        boolean boolean56 = linkedListTestDriver45.contains((java.lang.Object) boolean55);
        experiment.util.Iterator iterator57 = linkedListTestDriver45.iterator();
        boolean boolean58 = linkedListTestDriver17.equals_CUT((java.lang.Object) iterator57);
        linkedListTestDriver9.add(0, (java.lang.Object) linkedListTestDriver17);
        experiment.util.LinkedListTestDriver linkedListTestDriver60 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray61 = linkedListTestDriver60.toArray();
        linkedListTestDriver60.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj65 = linkedListTestDriver60.remove((int) (short) 0);
        linkedListTestDriver60.clear();
        int int67 = linkedListTestDriver60.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver68 = new experiment.util.LinkedListTestDriver();
        int int69 = linkedListTestDriver68.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver70 = new experiment.util.LinkedListTestDriver();
        int int71 = linkedListTestDriver70.size();
        linkedListTestDriver68.addFirst((java.lang.Object) int71);
        boolean boolean73 = linkedListTestDriver68.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver74 = new experiment.util.LinkedListTestDriver();
        boolean boolean76 = linkedListTestDriver74.contains((java.lang.Object) 1.0f);
        boolean boolean78 = linkedListTestDriver74.equals_CUT((java.lang.Object) 1.0d);
        experiment.util.LinkedListTestDriver linkedListTestDriver79 = new experiment.util.LinkedListTestDriver();
        boolean boolean81 = linkedListTestDriver79.contains((java.lang.Object) 1.0f);
        boolean boolean83 = linkedListTestDriver79.equals_CUT((java.lang.Object) 1.0d);
        boolean boolean84 = linkedListTestDriver74.remove((java.lang.Object) linkedListTestDriver79);
        linkedListTestDriver68.addFirst((java.lang.Object) boolean84);
        linkedListTestDriver60.addFirst((java.lang.Object) boolean84);
        boolean boolean87 = linkedListTestDriver9.remove((java.lang.Object) linkedListTestDriver60);
        linkedListTestDriver0.add(0, (java.lang.Object) boolean87);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(listIterator15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[]");
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + false + "'", obj42, false);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + 0 + "'", obj44, 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(iterator57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray61), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray61), "[]");
        org.junit.Assert.assertEquals("'" + obj65 + "' != '" + (byte) 10 + "'", obj65, (byte) 10);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test165");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) 1.0f);
        boolean boolean4 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1.0d);
        boolean boolean6 = linkedListTestDriver0.remove((java.lang.Object) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = linkedListTestDriver0.removeLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test166");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray1 = linkedListTestDriver0.toArray();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj5 = linkedListTestDriver0.remove((int) (short) 0);
        int int6 = linkedListTestDriver0.size();
        java.lang.Object[] objArray7 = linkedListTestDriver0.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        boolean boolean9 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = linkedListTestDriver0.removeLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) 10 + "'", obj5, (byte) 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test167");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray1 = linkedListTestDriver0.toArray();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        boolean boolean6 = linkedListTestDriver4.contains((java.lang.Object) 1.0f);
        boolean boolean7 = linkedListTestDriver4.isEmpty();
        java.lang.Object[] objArray8 = linkedListTestDriver4.toArray();
        boolean boolean9 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver4);
        boolean boolean11 = linkedListTestDriver0.equals_CUT((java.lang.Object) '4');
        java.lang.Object obj12 = linkedListTestDriver0.removeLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        boolean boolean15 = linkedListTestDriver13.contains((java.lang.Object) 1.0f);
        boolean boolean17 = linkedListTestDriver13.equals_CUT((java.lang.Object) 1.0d);
        experiment.util.LinkedListTestDriver linkedListTestDriver18 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray19 = linkedListTestDriver18.toArray();
        linkedListTestDriver18.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj23 = linkedListTestDriver18.remove((int) (short) 0);
        java.lang.Class<?> wildcardClass24 = linkedListTestDriver18.getClass();
        linkedListTestDriver13.addLast((java.lang.Object) linkedListTestDriver18);
        linkedListTestDriver13.addFirst((java.lang.Object) 1.0d);
        boolean boolean29 = linkedListTestDriver13.remove((java.lang.Object) (short) 10);
        boolean boolean31 = linkedListTestDriver13.remove((java.lang.Object) (short) 100);
        boolean boolean32 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver13);
        experiment.util.LinkedListTestDriver linkedListTestDriver33 = new experiment.util.LinkedListTestDriver();
        int int34 = linkedListTestDriver33.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver35 = new experiment.util.LinkedListTestDriver();
        int int36 = linkedListTestDriver35.size();
        linkedListTestDriver33.addFirst((java.lang.Object) int36);
        boolean boolean38 = linkedListTestDriver33.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver39 = new experiment.util.LinkedListTestDriver();
        boolean boolean41 = linkedListTestDriver39.contains((java.lang.Object) 1.0f);
        boolean boolean43 = linkedListTestDriver39.equals_CUT((java.lang.Object) 1.0d);
        experiment.util.LinkedListTestDriver linkedListTestDriver44 = new experiment.util.LinkedListTestDriver();
        boolean boolean46 = linkedListTestDriver44.contains((java.lang.Object) 1.0f);
        boolean boolean48 = linkedListTestDriver44.equals_CUT((java.lang.Object) 1.0d);
        boolean boolean49 = linkedListTestDriver39.remove((java.lang.Object) linkedListTestDriver44);
        linkedListTestDriver33.addFirst((java.lang.Object) boolean49);
        experiment.util.LinkedListTestDriver linkedListTestDriver51 = new experiment.util.LinkedListTestDriver();
        boolean boolean53 = linkedListTestDriver51.contains((java.lang.Object) 1.0f);
        boolean boolean54 = linkedListTestDriver51.isEmpty();
        java.lang.Object[] objArray55 = linkedListTestDriver51.toArray();
        java.lang.Class<?> wildcardClass56 = objArray55.getClass();
        linkedListTestDriver33.addLast((java.lang.Object) wildcardClass56);
        java.lang.Object obj58 = linkedListTestDriver33.removeFirst();
        linkedListTestDriver13.addFirst((java.lang.Object) linkedListTestDriver33);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj61 = linkedListTestDriver33.remove((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) 10 + "'", obj12, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (byte) 10 + "'", obj23, (byte) 10);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray55), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray55), "[]");
        org.junit.Assert.assertNotNull(wildcardClass56);
        org.junit.Assert.assertEquals("'" + obj58 + "' != '" + false + "'", obj58, false);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test168");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray1 = linkedListTestDriver0.toArray();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj5 = linkedListTestDriver0.remove((int) (short) 0);
        int int6 = linkedListTestDriver0.size();
        java.lang.Object[] objArray7 = linkedListTestDriver0.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        boolean boolean9 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = linkedListTestDriver0.remove((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) 10 + "'", obj5, (byte) 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test169");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray1 = linkedListTestDriver0.toArray();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.addLast((java.lang.Object) 100.0d);
        boolean boolean7 = linkedListTestDriver0.add((java.lang.Object) ' ');
        boolean boolean8 = linkedListTestDriver0.isEmpty();
        java.lang.Object[] objArray9 = linkedListTestDriver0.toArray();
        int int10 = linkedListTestDriver0.size();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[10, 100.0,  ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[10, 100.0,  ]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test170");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        int int1 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver2 = new experiment.util.LinkedListTestDriver();
        int int3 = linkedListTestDriver2.size();
        linkedListTestDriver0.addFirst((java.lang.Object) int3);
        boolean boolean5 = linkedListTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.add((int) (byte) 10, (java.lang.Object) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 10; size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test171");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray1 = linkedListTestDriver0.toArray();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj5 = linkedListTestDriver0.remove((int) (short) 0);
        linkedListTestDriver0.clear();
        int int7 = linkedListTestDriver0.size();
        experiment.util.Iterator iterator8 = linkedListTestDriver0.iterator();
        java.lang.Object[] objArray9 = linkedListTestDriver0.toArray();
        linkedListTestDriver0.addFirst((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        int int14 = linkedListTestDriver13.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver15 = new experiment.util.LinkedListTestDriver();
        int int16 = linkedListTestDriver15.size();
        linkedListTestDriver13.addFirst((java.lang.Object) int16);
        boolean boolean18 = linkedListTestDriver13.isEmpty();
        boolean boolean20 = linkedListTestDriver13.equals_CUT((java.lang.Object) 10.0d);
        java.lang.Object obj21 = linkedListTestDriver13.removeFirst();
        linkedListTestDriver0.add(1, (java.lang.Object) linkedListTestDriver13);
        java.lang.Object[] objArray23 = linkedListTestDriver13.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver24 = new experiment.util.LinkedListTestDriver();
        boolean boolean26 = linkedListTestDriver24.contains((java.lang.Object) 1.0f);
        boolean boolean28 = linkedListTestDriver24.equals_CUT((java.lang.Object) 1.0d);
        experiment.util.LinkedListTestDriver linkedListTestDriver29 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray30 = linkedListTestDriver29.toArray();
        linkedListTestDriver29.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj34 = linkedListTestDriver29.remove((int) (short) 0);
        java.lang.Class<?> wildcardClass35 = linkedListTestDriver29.getClass();
        linkedListTestDriver24.addLast((java.lang.Object) linkedListTestDriver29);
        linkedListTestDriver24.addFirst((java.lang.Object) 1.0d);
        boolean boolean40 = linkedListTestDriver24.remove((java.lang.Object) (short) 10);
        java.lang.Object[] objArray41 = linkedListTestDriver24.toArray();
        experiment.util.Iterator iterator42 = linkedListTestDriver24.iterator();
        boolean boolean43 = linkedListTestDriver13.equals_CUT((java.lang.Object) linkedListTestDriver24);
        linkedListTestDriver24.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver45 = new experiment.util.LinkedListTestDriver();
        int int46 = linkedListTestDriver45.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver47 = new experiment.util.LinkedListTestDriver();
        int int48 = linkedListTestDriver47.size();
        linkedListTestDriver45.addFirst((java.lang.Object) int48);
        experiment.util.ListIterator listIterator51 = linkedListTestDriver45.listIterator(1);
        int int52 = linkedListTestDriver45.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver54 = new experiment.util.LinkedListTestDriver();
        int int55 = linkedListTestDriver54.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver56 = new experiment.util.LinkedListTestDriver();
        int int57 = linkedListTestDriver56.size();
        linkedListTestDriver54.addFirst((java.lang.Object) int57);
        boolean boolean59 = linkedListTestDriver54.isEmpty();
        boolean boolean61 = linkedListTestDriver54.equals_CUT((java.lang.Object) 10.0d);
        java.lang.Object obj62 = linkedListTestDriver54.removeFirst();
        linkedListTestDriver45.add((int) (short) 1, obj62);
        experiment.util.LinkedListTestDriver linkedListTestDriver64 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray65 = linkedListTestDriver64.toArray();
        linkedListTestDriver64.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj69 = linkedListTestDriver64.remove((int) (short) 0);
        int int70 = linkedListTestDriver64.size();
        java.lang.Object[] objArray71 = linkedListTestDriver64.toArray();
        boolean boolean72 = linkedListTestDriver45.add((java.lang.Object) objArray71);
        experiment.util.ListIterator listIterator74 = linkedListTestDriver45.listIterator(0);
        linkedListTestDriver24.addFirst((java.lang.Object) 0);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) 10 + "'", obj5, (byte) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 0 + "'", obj21, 0);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[]");
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + (byte) 10 + "'", obj34, (byte) 10);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(iterator42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(listIterator51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertEquals("'" + obj62 + "' != '" + 0 + "'", obj62, 0);
        org.junit.Assert.assertNotNull(objArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray65), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray65), "[]");
        org.junit.Assert.assertEquals("'" + obj69 + "' != '" + (byte) 10 + "'", obj69, (byte) 10);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray71), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray71), "[]");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(listIterator74);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test172");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) 1.0f);
        boolean boolean4 = linkedListTestDriver0.contains((java.lang.Object) (-1L));
        boolean boolean5 = linkedListTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = linkedListTestDriver0.getFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test173");
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
        experiment.util.LinkedListTestDriver linkedListTestDriver18 = new experiment.util.LinkedListTestDriver();
        boolean boolean20 = linkedListTestDriver18.contains((java.lang.Object) 1.0f);
        boolean boolean21 = linkedListTestDriver18.isEmpty();
        java.lang.Object[] objArray22 = linkedListTestDriver18.toArray();
        java.lang.Class<?> wildcardClass23 = objArray22.getClass();
        linkedListTestDriver0.addLast((java.lang.Object) wildcardClass23);
        java.lang.Object obj25 = linkedListTestDriver0.removeFirst();
        java.lang.Object obj27 = linkedListTestDriver0.remove(0);
        experiment.util.LinkedListTestDriver linkedListTestDriver28 = new experiment.util.LinkedListTestDriver();
        int int29 = linkedListTestDriver28.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver30 = new experiment.util.LinkedListTestDriver();
        int int31 = linkedListTestDriver30.size();
        linkedListTestDriver28.addFirst((java.lang.Object) int31);
        boolean boolean33 = linkedListTestDriver28.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver34 = new experiment.util.LinkedListTestDriver();
        boolean boolean36 = linkedListTestDriver34.contains((java.lang.Object) 1.0f);
        boolean boolean38 = linkedListTestDriver34.equals_CUT((java.lang.Object) 1.0d);
        boolean boolean39 = linkedListTestDriver28.contains((java.lang.Object) boolean38);
        experiment.util.Iterator iterator40 = linkedListTestDriver28.iterator();
        boolean boolean41 = linkedListTestDriver0.equals_CUT((java.lang.Object) iterator40);
        experiment.util.LinkedListTestDriver linkedListTestDriver42 = new experiment.util.LinkedListTestDriver();
        boolean boolean44 = linkedListTestDriver42.contains((java.lang.Object) 1.0f);
        boolean boolean46 = linkedListTestDriver42.equals_CUT((java.lang.Object) 1.0d);
        boolean boolean48 = linkedListTestDriver42.remove((java.lang.Object) '4');
        experiment.util.LinkedListTestDriver linkedListTestDriver49 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray50 = linkedListTestDriver49.toArray();
        linkedListTestDriver49.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver49.addLast((java.lang.Object) 100.0d);
        java.lang.Object obj55 = linkedListTestDriver49.removeLast();
        boolean boolean56 = linkedListTestDriver42.contains(obj55);
        linkedListTestDriver42.addFirst((java.lang.Object) (byte) 100);
        java.lang.Object[] objArray59 = linkedListTestDriver42.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver60 = new experiment.util.LinkedListTestDriver();
        boolean boolean62 = linkedListTestDriver60.contains((java.lang.Object) 1.0f);
        boolean boolean64 = linkedListTestDriver60.equals_CUT((java.lang.Object) 1.0d);
        experiment.util.LinkedListTestDriver linkedListTestDriver65 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray66 = linkedListTestDriver65.toArray();
        linkedListTestDriver65.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj70 = linkedListTestDriver65.remove((int) (short) 0);
        java.lang.Class<?> wildcardClass71 = linkedListTestDriver65.getClass();
        linkedListTestDriver60.addLast((java.lang.Object) linkedListTestDriver65);
        linkedListTestDriver60.addFirst((java.lang.Object) 1.0d);
        boolean boolean76 = linkedListTestDriver60.remove((java.lang.Object) (short) 10);
        boolean boolean78 = linkedListTestDriver60.remove((java.lang.Object) (short) 100);
        java.lang.Object obj79 = linkedListTestDriver60.getLast();
        experiment.util.Iterator iterator80 = linkedListTestDriver60.iterator();
        boolean boolean81 = linkedListTestDriver42.add((java.lang.Object) linkedListTestDriver60);
        boolean boolean82 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver60);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + false + "'", obj25, false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 0 + "'", obj27, 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(iterator40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray50), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray50), "[]");
        org.junit.Assert.assertEquals("'" + obj55 + "' != '" + 100.0d + "'", obj55, 100.0d);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray59), "[100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray59), "[100]");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray66), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray66), "[]");
        org.junit.Assert.assertEquals("'" + obj70 + "' != '" + (byte) 10 + "'", obj70, (byte) 10);
        org.junit.Assert.assertNotNull(wildcardClass71);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(obj79);
        org.junit.Assert.assertNotNull(iterator80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test174");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray1 = linkedListTestDriver0.toArray();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj5 = linkedListTestDriver0.remove((int) (short) 0);
        linkedListTestDriver0.clear();
        int int7 = linkedListTestDriver0.size();
        experiment.util.Iterator iterator8 = linkedListTestDriver0.iterator();
        java.lang.Object[] objArray9 = linkedListTestDriver0.toArray();
        linkedListTestDriver0.addFirst((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        int int14 = linkedListTestDriver13.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver15 = new experiment.util.LinkedListTestDriver();
        int int16 = linkedListTestDriver15.size();
        linkedListTestDriver13.addFirst((java.lang.Object) int16);
        boolean boolean18 = linkedListTestDriver13.isEmpty();
        boolean boolean20 = linkedListTestDriver13.equals_CUT((java.lang.Object) 10.0d);
        java.lang.Object obj21 = linkedListTestDriver13.removeFirst();
        linkedListTestDriver0.add(1, (java.lang.Object) linkedListTestDriver13);
        java.lang.Object[] objArray23 = linkedListTestDriver13.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver24 = new experiment.util.LinkedListTestDriver();
        boolean boolean26 = linkedListTestDriver24.contains((java.lang.Object) 1.0f);
        boolean boolean28 = linkedListTestDriver24.equals_CUT((java.lang.Object) 1.0d);
        experiment.util.LinkedListTestDriver linkedListTestDriver29 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray30 = linkedListTestDriver29.toArray();
        linkedListTestDriver29.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj34 = linkedListTestDriver29.remove((int) (short) 0);
        java.lang.Class<?> wildcardClass35 = linkedListTestDriver29.getClass();
        linkedListTestDriver24.addLast((java.lang.Object) linkedListTestDriver29);
        linkedListTestDriver24.addFirst((java.lang.Object) 1.0d);
        boolean boolean40 = linkedListTestDriver24.remove((java.lang.Object) (short) 10);
        java.lang.Object[] objArray41 = linkedListTestDriver24.toArray();
        experiment.util.Iterator iterator42 = linkedListTestDriver24.iterator();
        boolean boolean43 = linkedListTestDriver13.equals_CUT((java.lang.Object) linkedListTestDriver24);
        experiment.util.LinkedListTestDriver linkedListTestDriver45 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray46 = linkedListTestDriver45.toArray();
        linkedListTestDriver45.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver45.addLast((java.lang.Object) 100.0d);
        linkedListTestDriver45.clear();
        java.lang.Object obj52 = linkedListTestDriver24.set(0, (java.lang.Object) linkedListTestDriver45);
        experiment.util.LinkedListTestDriver linkedListTestDriver54 = new experiment.util.LinkedListTestDriver();
        boolean boolean56 = linkedListTestDriver54.contains((java.lang.Object) 1.0f);
        boolean boolean58 = linkedListTestDriver54.equals_CUT((java.lang.Object) 1.0d);
        boolean boolean60 = linkedListTestDriver54.remove((java.lang.Object) '4');
        experiment.util.LinkedListTestDriver linkedListTestDriver61 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray62 = linkedListTestDriver61.toArray();
        linkedListTestDriver61.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver61.addLast((java.lang.Object) 100.0d);
        java.lang.Object obj67 = linkedListTestDriver61.removeLast();
        boolean boolean68 = linkedListTestDriver54.contains(obj67);
        linkedListTestDriver54.addFirst((java.lang.Object) (byte) 100);
        java.lang.Object[] objArray71 = linkedListTestDriver54.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver72 = new experiment.util.LinkedListTestDriver();
        boolean boolean74 = linkedListTestDriver72.contains((java.lang.Object) 1.0f);
        boolean boolean76 = linkedListTestDriver72.equals_CUT((java.lang.Object) 1.0d);
        experiment.util.LinkedListTestDriver linkedListTestDriver77 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray78 = linkedListTestDriver77.toArray();
        linkedListTestDriver77.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj82 = linkedListTestDriver77.remove((int) (short) 0);
        java.lang.Class<?> wildcardClass83 = linkedListTestDriver77.getClass();
        linkedListTestDriver72.addLast((java.lang.Object) linkedListTestDriver77);
        linkedListTestDriver72.addFirst((java.lang.Object) 1.0d);
        boolean boolean88 = linkedListTestDriver72.remove((java.lang.Object) (short) 10);
        boolean boolean90 = linkedListTestDriver72.remove((java.lang.Object) (short) 100);
        java.lang.Object obj91 = linkedListTestDriver72.getLast();
        experiment.util.Iterator iterator92 = linkedListTestDriver72.iterator();
        boolean boolean93 = linkedListTestDriver54.add((java.lang.Object) linkedListTestDriver72);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj94 = linkedListTestDriver45.set(2, (java.lang.Object) linkedListTestDriver54);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) 10 + "'", obj5, (byte) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 0 + "'", obj21, 0);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[]");
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + (byte) 10 + "'", obj34, (byte) 10);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(iterator42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray46), "[]");
        org.junit.Assert.assertEquals("'" + obj52 + "' != '" + 1.0d + "'", obj52, 1.0d);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray62), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray62), "[]");
        org.junit.Assert.assertEquals("'" + obj67 + "' != '" + 100.0d + "'", obj67, 100.0d);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray71), "[100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray71), "[100]");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(objArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray78), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray78), "[]");
        org.junit.Assert.assertEquals("'" + obj82 + "' != '" + (byte) 10 + "'", obj82, (byte) 10);
        org.junit.Assert.assertNotNull(wildcardClass83);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertNotNull(obj91);
        org.junit.Assert.assertNotNull(iterator92);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test175");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        int int1 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver2 = new experiment.util.LinkedListTestDriver();
        int int3 = linkedListTestDriver2.size();
        linkedListTestDriver0.addFirst((java.lang.Object) int3);
        boolean boolean5 = linkedListTestDriver0.isEmpty();
        boolean boolean7 = linkedListTestDriver0.equals_CUT((java.lang.Object) 10.0d);
        experiment.util.Iterator iterator8 = linkedListTestDriver0.iterator();
        boolean boolean9 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        boolean boolean12 = linkedListTestDriver10.contains((java.lang.Object) 1.0f);
        boolean boolean14 = linkedListTestDriver10.equals_CUT((java.lang.Object) 1.0d);
        experiment.util.LinkedListTestDriver linkedListTestDriver15 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray16 = linkedListTestDriver15.toArray();
        linkedListTestDriver15.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj20 = linkedListTestDriver15.remove((int) (short) 0);
        java.lang.Class<?> wildcardClass21 = linkedListTestDriver15.getClass();
        linkedListTestDriver10.addLast((java.lang.Object) linkedListTestDriver15);
        linkedListTestDriver10.addFirst((java.lang.Object) 1.0d);
        boolean boolean26 = linkedListTestDriver10.remove((java.lang.Object) (short) 10);
        linkedListTestDriver10.addLast((java.lang.Object) (short) 1);
        boolean boolean29 = linkedListTestDriver0.add((java.lang.Object) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj31 = linkedListTestDriver0.get((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (byte) 10 + "'", obj20, (byte) 10);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test176");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray1 = linkedListTestDriver0.toArray();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.addLast((java.lang.Object) 100.0d);
        boolean boolean7 = linkedListTestDriver0.add((java.lang.Object) ' ');
        boolean boolean8 = linkedListTestDriver0.isEmpty();
        java.lang.Class<?> wildcardClass9 = linkedListTestDriver0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test177");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) 1.0f);
        boolean boolean4 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1.0d);
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray6 = linkedListTestDriver5.toArray();
        linkedListTestDriver5.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj10 = linkedListTestDriver5.remove((int) (short) 0);
        java.lang.Class<?> wildcardClass11 = linkedListTestDriver5.getClass();
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver5);
        linkedListTestDriver0.addFirst((java.lang.Object) 1.0d);
        boolean boolean16 = linkedListTestDriver0.remove((java.lang.Object) (short) 10);
        boolean boolean18 = linkedListTestDriver0.remove((java.lang.Object) (short) 100);
        java.lang.Object obj19 = linkedListTestDriver0.getLast();
        java.lang.Object obj20 = linkedListTestDriver0.removeLast();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) 10 + "'", obj10, (byte) 10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(obj20);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test178");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray1 = linkedListTestDriver0.toArray();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj5 = linkedListTestDriver0.remove((int) (short) 0);
        linkedListTestDriver0.clear();
        java.lang.Object[] objArray7 = linkedListTestDriver0.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        boolean boolean11 = linkedListTestDriver9.contains((java.lang.Object) 0L);
        java.lang.Object[] objArray12 = linkedListTestDriver9.toArray();
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.add(10, (java.lang.Object) linkedListTestDriver9);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 10; size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) 10 + "'", obj5, (byte) 10);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test179");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) 1.0f);
        boolean boolean4 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1.0d);
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray6 = linkedListTestDriver5.toArray();
        linkedListTestDriver5.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj10 = linkedListTestDriver5.remove((int) (short) 0);
        java.lang.Class<?> wildcardClass11 = linkedListTestDriver5.getClass();
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver5);
        linkedListTestDriver0.addFirst((java.lang.Object) 1.0d);
        boolean boolean16 = linkedListTestDriver0.remove((java.lang.Object) (short) 10);
        java.lang.Object[] objArray17 = linkedListTestDriver0.toArray();
        experiment.util.Iterator iterator18 = linkedListTestDriver0.iterator();
        linkedListTestDriver0.clear();
        experiment.util.Iterator iterator20 = linkedListTestDriver0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = linkedListTestDriver0.getFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) 10 + "'", obj10, (byte) 10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertNotNull(iterator20);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test180");
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
        experiment.util.LinkedListTestDriver linkedListTestDriver18 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray19 = linkedListTestDriver18.toArray();
        linkedListTestDriver18.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj23 = linkedListTestDriver18.remove((int) (short) 0);
        linkedListTestDriver18.clear();
        int int25 = linkedListTestDriver18.size();
        experiment.util.Iterator iterator26 = linkedListTestDriver18.iterator();
        java.lang.Object[] objArray27 = linkedListTestDriver18.toArray();
        linkedListTestDriver18.addFirst((java.lang.Object) '#');
        linkedListTestDriver0.addLast((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver31 = new experiment.util.LinkedListTestDriver();
        boolean boolean33 = linkedListTestDriver31.contains((java.lang.Object) 1.0f);
        boolean boolean35 = linkedListTestDriver31.equals_CUT((java.lang.Object) 1.0d);
        linkedListTestDriver31.addFirst((java.lang.Object) 0.0f);
        linkedListTestDriver0.addFirst((java.lang.Object) 0.0f);
        java.lang.Object obj40 = linkedListTestDriver0.remove(1);
        java.lang.Object obj41 = linkedListTestDriver0.getFirst();
        java.lang.Object[] objArray42 = linkedListTestDriver0.toArray();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (byte) 10 + "'", obj23, (byte) 10);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + false + "'", obj40, false);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + 0.0f + "'", obj41, 0.0f);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[0.0, 0, #]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[0.0, 0, #]");
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test181");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        int int1 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver2 = new experiment.util.LinkedListTestDriver();
        int int3 = linkedListTestDriver2.size();
        linkedListTestDriver0.addFirst((java.lang.Object) int3);
        experiment.util.ListIterator listIterator6 = linkedListTestDriver0.listIterator(1);
        int int7 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        int int10 = linkedListTestDriver9.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        int int12 = linkedListTestDriver11.size();
        linkedListTestDriver9.addFirst((java.lang.Object) int12);
        boolean boolean14 = linkedListTestDriver9.isEmpty();
        boolean boolean16 = linkedListTestDriver9.equals_CUT((java.lang.Object) 10.0d);
        java.lang.Object obj17 = linkedListTestDriver9.removeFirst();
        linkedListTestDriver0.add((int) (short) 1, obj17);
        experiment.util.LinkedListTestDriver linkedListTestDriver19 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray20 = linkedListTestDriver19.toArray();
        linkedListTestDriver19.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj24 = linkedListTestDriver19.remove((int) (short) 0);
        int int25 = linkedListTestDriver19.size();
        java.lang.Object[] objArray26 = linkedListTestDriver19.toArray();
        boolean boolean27 = linkedListTestDriver0.add((java.lang.Object) objArray26);
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator29 = linkedListTestDriver0.listIterator(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 100; size: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(listIterator6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 0 + "'", obj17, 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (byte) 10 + "'", obj24, (byte) 10);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test182");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray1 = linkedListTestDriver0.toArray();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj5 = linkedListTestDriver0.remove((int) (short) 0);
        int int6 = linkedListTestDriver0.size();
        java.lang.Object[] objArray7 = linkedListTestDriver0.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        boolean boolean9 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver8);
        experiment.util.Iterator iterator10 = linkedListTestDriver0.iterator();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) 10 + "'", obj5, (byte) 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator10);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test183");
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
        experiment.util.LinkedListTestDriver linkedListTestDriver18 = new experiment.util.LinkedListTestDriver();
        boolean boolean20 = linkedListTestDriver18.contains((java.lang.Object) 1.0f);
        boolean boolean21 = linkedListTestDriver18.isEmpty();
        java.lang.Object[] objArray22 = linkedListTestDriver18.toArray();
        java.lang.Class<?> wildcardClass23 = objArray22.getClass();
        linkedListTestDriver0.addLast((java.lang.Object) wildcardClass23);
        java.lang.Object obj25 = linkedListTestDriver0.removeFirst();
        java.lang.Object obj26 = linkedListTestDriver0.removeFirst();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + false + "'", obj25, false);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 0 + "'", obj26, 0);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test184");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        int int1 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver2 = new experiment.util.LinkedListTestDriver();
        int int3 = linkedListTestDriver2.size();
        linkedListTestDriver0.addFirst((java.lang.Object) int3);
        boolean boolean5 = linkedListTestDriver0.isEmpty();
        boolean boolean7 = linkedListTestDriver0.equals_CUT((java.lang.Object) 10.0d);
        java.lang.Object obj8 = linkedListTestDriver0.removeFirst();
        boolean boolean9 = linkedListTestDriver0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0 + "'", obj8, 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test185");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray1 = linkedListTestDriver0.toArray();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        boolean boolean6 = linkedListTestDriver4.contains((java.lang.Object) 1.0f);
        boolean boolean7 = linkedListTestDriver4.isEmpty();
        java.lang.Object[] objArray8 = linkedListTestDriver4.toArray();
        boolean boolean9 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver4);
        boolean boolean11 = linkedListTestDriver0.equals_CUT((java.lang.Object) '4');
        java.lang.Object obj12 = linkedListTestDriver0.removeLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        boolean boolean15 = linkedListTestDriver13.contains((java.lang.Object) 1.0f);
        boolean boolean17 = linkedListTestDriver13.equals_CUT((java.lang.Object) 1.0d);
        experiment.util.LinkedListTestDriver linkedListTestDriver18 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray19 = linkedListTestDriver18.toArray();
        linkedListTestDriver18.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj23 = linkedListTestDriver18.remove((int) (short) 0);
        java.lang.Class<?> wildcardClass24 = linkedListTestDriver18.getClass();
        linkedListTestDriver13.addLast((java.lang.Object) linkedListTestDriver18);
        linkedListTestDriver13.addFirst((java.lang.Object) 1.0d);
        boolean boolean29 = linkedListTestDriver13.remove((java.lang.Object) (short) 10);
        boolean boolean31 = linkedListTestDriver13.remove((java.lang.Object) (short) 100);
        boolean boolean32 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver13);
        java.lang.Object[] objArray33 = linkedListTestDriver0.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj35 = linkedListTestDriver0.remove((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) 10 + "'", obj12, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (byte) 10 + "'", obj23, (byte) 10);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[]");
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test186");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray1 = linkedListTestDriver0.toArray();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj5 = linkedListTestDriver0.remove((int) (short) 0);
        linkedListTestDriver0.clear();
        int int7 = linkedListTestDriver0.size();
        experiment.util.Iterator iterator8 = linkedListTestDriver0.iterator();
        java.lang.Object[] objArray9 = linkedListTestDriver0.toArray();
        linkedListTestDriver0.addFirst((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        int int14 = linkedListTestDriver13.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver15 = new experiment.util.LinkedListTestDriver();
        int int16 = linkedListTestDriver15.size();
        linkedListTestDriver13.addFirst((java.lang.Object) int16);
        boolean boolean18 = linkedListTestDriver13.isEmpty();
        boolean boolean20 = linkedListTestDriver13.equals_CUT((java.lang.Object) 10.0d);
        java.lang.Object obj21 = linkedListTestDriver13.removeFirst();
        linkedListTestDriver0.add(1, (java.lang.Object) linkedListTestDriver13);
        java.lang.Object[] objArray23 = linkedListTestDriver13.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver24 = new experiment.util.LinkedListTestDriver();
        boolean boolean26 = linkedListTestDriver24.contains((java.lang.Object) 1.0f);
        boolean boolean28 = linkedListTestDriver24.equals_CUT((java.lang.Object) 1.0d);
        experiment.util.LinkedListTestDriver linkedListTestDriver29 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray30 = linkedListTestDriver29.toArray();
        linkedListTestDriver29.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj34 = linkedListTestDriver29.remove((int) (short) 0);
        java.lang.Class<?> wildcardClass35 = linkedListTestDriver29.getClass();
        linkedListTestDriver24.addLast((java.lang.Object) linkedListTestDriver29);
        linkedListTestDriver24.addFirst((java.lang.Object) 1.0d);
        boolean boolean40 = linkedListTestDriver24.remove((java.lang.Object) (short) 10);
        java.lang.Object[] objArray41 = linkedListTestDriver24.toArray();
        experiment.util.Iterator iterator42 = linkedListTestDriver24.iterator();
        boolean boolean43 = linkedListTestDriver13.equals_CUT((java.lang.Object) linkedListTestDriver24);
        linkedListTestDriver24.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj45 = linkedListTestDriver24.removeLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) 10 + "'", obj5, (byte) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 0 + "'", obj21, 0);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[]");
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + (byte) 10 + "'", obj34, (byte) 10);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(iterator42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test187");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray1 = linkedListTestDriver0.toArray();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.addLast((java.lang.Object) 100.0d);
        boolean boolean7 = linkedListTestDriver0.add((java.lang.Object) ' ');
        java.lang.Object obj8 = linkedListTestDriver0.getLast();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator10 = linkedListTestDriver0.listIterator((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: -1; size: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + ' ' + "'", obj8, ' ');
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test188");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray1 = linkedListTestDriver0.toArray();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj5 = linkedListTestDriver0.remove((int) (short) 0);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray9 = linkedListTestDriver8.toArray();
        linkedListTestDriver8.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver8.addLast((java.lang.Object) 100.0d);
        experiment.util.LinkedListTestDriver linkedListTestDriver14 = new experiment.util.LinkedListTestDriver();
        int int15 = linkedListTestDriver14.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver16 = new experiment.util.LinkedListTestDriver();
        int int17 = linkedListTestDriver16.size();
        linkedListTestDriver14.addFirst((java.lang.Object) int17);
        boolean boolean19 = linkedListTestDriver14.isEmpty();
        linkedListTestDriver14.addFirst((java.lang.Object) ' ');
        boolean boolean22 = linkedListTestDriver8.remove((java.lang.Object) ' ');
        boolean boolean23 = linkedListTestDriver0.add((java.lang.Object) ' ');
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) 10 + "'", obj5, (byte) 10);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test189");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray1 = linkedListTestDriver0.toArray();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.addLast((java.lang.Object) 100.0d);
        java.lang.Object obj6 = linkedListTestDriver0.removeLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray8 = linkedListTestDriver7.toArray();
        linkedListTestDriver7.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj12 = linkedListTestDriver7.remove((int) (short) 0);
        int int13 = linkedListTestDriver7.size();
        java.lang.Object[] objArray14 = linkedListTestDriver7.toArray();
        boolean boolean15 = linkedListTestDriver0.add((java.lang.Object) objArray14);
        experiment.util.LinkedListTestDriver linkedListTestDriver16 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray17 = linkedListTestDriver16.toArray();
        linkedListTestDriver16.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj21 = linkedListTestDriver16.remove((int) (short) 0);
        linkedListTestDriver0.addFirst((java.lang.Object) (short) 0);
        boolean boolean23 = linkedListTestDriver0.isEmpty();
        java.lang.Object obj25 = linkedListTestDriver0.get((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj27 = linkedListTestDriver0.remove((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 100.0d + "'", obj6, 100.0d);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) 10 + "'", obj12, (byte) 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (byte) 10 + "'", obj21, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (short) 0 + "'", obj25, (short) 0);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test190");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray1 = linkedListTestDriver0.toArray();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj5 = linkedListTestDriver0.remove((int) (short) 0);
        linkedListTestDriver0.clear();
        int int7 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        int int9 = linkedListTestDriver8.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        int int11 = linkedListTestDriver10.size();
        linkedListTestDriver8.addFirst((java.lang.Object) int11);
        boolean boolean13 = linkedListTestDriver8.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver14 = new experiment.util.LinkedListTestDriver();
        boolean boolean16 = linkedListTestDriver14.contains((java.lang.Object) 1.0f);
        boolean boolean18 = linkedListTestDriver14.equals_CUT((java.lang.Object) 1.0d);
        experiment.util.LinkedListTestDriver linkedListTestDriver19 = new experiment.util.LinkedListTestDriver();
        boolean boolean21 = linkedListTestDriver19.contains((java.lang.Object) 1.0f);
        boolean boolean23 = linkedListTestDriver19.equals_CUT((java.lang.Object) 1.0d);
        boolean boolean24 = linkedListTestDriver14.remove((java.lang.Object) linkedListTestDriver19);
        linkedListTestDriver8.addFirst((java.lang.Object) boolean24);
        linkedListTestDriver0.addFirst((java.lang.Object) boolean24);
        experiment.util.LinkedListTestDriver linkedListTestDriver27 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray28 = linkedListTestDriver27.toArray();
        linkedListTestDriver27.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver27.addLast((java.lang.Object) 100.0d);
        java.lang.Object obj33 = linkedListTestDriver27.removeLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver34 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray35 = linkedListTestDriver34.toArray();
        linkedListTestDriver34.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj39 = linkedListTestDriver34.remove((int) (short) 0);
        int int40 = linkedListTestDriver34.size();
        java.lang.Object[] objArray41 = linkedListTestDriver34.toArray();
        boolean boolean42 = linkedListTestDriver27.add((java.lang.Object) objArray41);
        experiment.util.LinkedListTestDriver linkedListTestDriver43 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray44 = linkedListTestDriver43.toArray();
        linkedListTestDriver43.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj48 = linkedListTestDriver43.remove((int) (short) 0);
        linkedListTestDriver27.addFirst((java.lang.Object) (short) 0);
        boolean boolean50 = linkedListTestDriver27.isEmpty();
        java.lang.Object obj51 = linkedListTestDriver27.removeFirst();
        java.lang.Object obj53 = linkedListTestDriver27.remove(1);
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver27);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj56 = linkedListTestDriver0.remove((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) 10 + "'", obj5, (byte) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[]");
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + 100.0d + "'", obj33, 100.0d);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[]");
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + (byte) 10 + "'", obj39, (byte) 10);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[]");
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + (byte) 10 + "'", obj48, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + obj51 + "' != '" + (short) 0 + "'", obj51, (short) 0);
        org.junit.Assert.assertNotNull(obj53);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test191");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        int int1 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver2 = new experiment.util.LinkedListTestDriver();
        int int3 = linkedListTestDriver2.size();
        linkedListTestDriver0.addFirst((java.lang.Object) int3);
        experiment.util.Iterator iterator5 = linkedListTestDriver0.iterator();
        boolean boolean6 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray8 = linkedListTestDriver7.toArray();
        linkedListTestDriver7.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj12 = linkedListTestDriver7.remove((int) (short) 0);
        linkedListTestDriver7.clear();
        int int14 = linkedListTestDriver7.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver15 = new experiment.util.LinkedListTestDriver();
        int int16 = linkedListTestDriver15.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        int int18 = linkedListTestDriver17.size();
        linkedListTestDriver15.addFirst((java.lang.Object) int18);
        boolean boolean20 = linkedListTestDriver15.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver21 = new experiment.util.LinkedListTestDriver();
        boolean boolean23 = linkedListTestDriver21.contains((java.lang.Object) 1.0f);
        boolean boolean25 = linkedListTestDriver21.equals_CUT((java.lang.Object) 1.0d);
        experiment.util.LinkedListTestDriver linkedListTestDriver26 = new experiment.util.LinkedListTestDriver();
        boolean boolean28 = linkedListTestDriver26.contains((java.lang.Object) 1.0f);
        boolean boolean30 = linkedListTestDriver26.equals_CUT((java.lang.Object) 1.0d);
        boolean boolean31 = linkedListTestDriver21.remove((java.lang.Object) linkedListTestDriver26);
        linkedListTestDriver15.addFirst((java.lang.Object) boolean31);
        linkedListTestDriver7.addFirst((java.lang.Object) boolean31);
        boolean boolean34 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver7);
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator36 = linkedListTestDriver7.listIterator((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 100; size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) 10 + "'", obj12, (byte) 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test192");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) 1.0f);
        boolean boolean4 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1.0d);
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray6 = linkedListTestDriver5.toArray();
        linkedListTestDriver5.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj10 = linkedListTestDriver5.remove((int) (short) 0);
        java.lang.Class<?> wildcardClass11 = linkedListTestDriver5.getClass();
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver5);
        linkedListTestDriver0.addFirst((java.lang.Object) 1.0d);
        boolean boolean16 = linkedListTestDriver0.remove((java.lang.Object) (short) 10);
        java.lang.Object obj18 = linkedListTestDriver0.remove(0);
        experiment.util.LinkedListTestDriver linkedListTestDriver19 = new experiment.util.LinkedListTestDriver();
        int int20 = linkedListTestDriver19.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver21 = new experiment.util.LinkedListTestDriver();
        int int22 = linkedListTestDriver21.size();
        linkedListTestDriver19.addFirst((java.lang.Object) int22);
        boolean boolean24 = linkedListTestDriver19.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver25 = new experiment.util.LinkedListTestDriver();
        boolean boolean27 = linkedListTestDriver25.contains((java.lang.Object) 1.0f);
        boolean boolean29 = linkedListTestDriver25.equals_CUT((java.lang.Object) 1.0d);
        experiment.util.LinkedListTestDriver linkedListTestDriver30 = new experiment.util.LinkedListTestDriver();
        boolean boolean32 = linkedListTestDriver30.contains((java.lang.Object) 1.0f);
        boolean boolean34 = linkedListTestDriver30.equals_CUT((java.lang.Object) 1.0d);
        boolean boolean35 = linkedListTestDriver25.remove((java.lang.Object) linkedListTestDriver30);
        linkedListTestDriver19.addFirst((java.lang.Object) boolean35);
        experiment.util.LinkedListTestDriver linkedListTestDriver37 = new experiment.util.LinkedListTestDriver();
        boolean boolean39 = linkedListTestDriver37.contains((java.lang.Object) 1.0f);
        boolean boolean40 = linkedListTestDriver37.isEmpty();
        java.lang.Object[] objArray41 = linkedListTestDriver37.toArray();
        java.lang.Class<?> wildcardClass42 = objArray41.getClass();
        linkedListTestDriver19.addLast((java.lang.Object) wildcardClass42);
        java.lang.Object obj44 = linkedListTestDriver19.removeFirst();
        java.lang.Object obj46 = linkedListTestDriver19.remove(0);
        java.lang.Object obj47 = linkedListTestDriver19.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver48 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray49 = linkedListTestDriver48.toArray();
        linkedListTestDriver48.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj53 = linkedListTestDriver48.remove((int) (short) 0);
        linkedListTestDriver48.clear();
        int int55 = linkedListTestDriver48.size();
        experiment.util.Iterator iterator56 = linkedListTestDriver48.iterator();
        java.lang.Object[] objArray57 = linkedListTestDriver48.toArray();
        linkedListTestDriver48.addFirst((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver61 = new experiment.util.LinkedListTestDriver();
        int int62 = linkedListTestDriver61.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver63 = new experiment.util.LinkedListTestDriver();
        int int64 = linkedListTestDriver63.size();
        linkedListTestDriver61.addFirst((java.lang.Object) int64);
        boolean boolean66 = linkedListTestDriver61.isEmpty();
        boolean boolean68 = linkedListTestDriver61.equals_CUT((java.lang.Object) 10.0d);
        java.lang.Object obj69 = linkedListTestDriver61.removeFirst();
        linkedListTestDriver48.add(1, (java.lang.Object) linkedListTestDriver61);
        linkedListTestDriver19.addLast((java.lang.Object) linkedListTestDriver48);
        boolean boolean72 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver19);
        experiment.util.LinkedListTestDriver linkedListTestDriver73 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray74 = linkedListTestDriver73.toArray();
        linkedListTestDriver73.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj78 = linkedListTestDriver73.remove((int) (short) 0);
        java.lang.Class<?> wildcardClass79 = linkedListTestDriver73.getClass();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver73);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) 10 + "'", obj10, (byte) 10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 1.0d + "'", obj18, 1.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[]");
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + false + "'", obj44, false);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + 0 + "'", obj46, 0);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertEquals(obj47.toString(), "class [Ljava.lang.Object;");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj47), "class [Ljava.lang.Object;");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj47), "class [Ljava.lang.Object;");
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray49), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray49), "[]");
        org.junit.Assert.assertEquals("'" + obj53 + "' != '" + (byte) 10 + "'", obj53, (byte) 10);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(iterator56);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray57), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray57), "[]");
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertEquals("'" + obj69 + "' != '" + 0 + "'", obj69, 0);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(objArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray74), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray74), "[]");
        org.junit.Assert.assertEquals("'" + obj78 + "' != '" + (byte) 10 + "'", obj78, (byte) 10);
        org.junit.Assert.assertNotNull(wildcardClass79);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test193");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        int int1 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver2 = new experiment.util.LinkedListTestDriver();
        int int3 = linkedListTestDriver2.size();
        linkedListTestDriver0.addFirst((java.lang.Object) int3);
        experiment.util.ListIterator listIterator6 = linkedListTestDriver0.listIterator(1);
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        boolean boolean10 = linkedListTestDriver8.contains((java.lang.Object) 1.0f);
        boolean boolean12 = linkedListTestDriver8.equals_CUT((java.lang.Object) 1.0d);
        boolean boolean14 = linkedListTestDriver8.remove((java.lang.Object) '4');
        linkedListTestDriver0.add(1, (java.lang.Object) '4');
        experiment.util.LinkedListTestDriver linkedListTestDriver16 = new experiment.util.LinkedListTestDriver();
        experiment.util.Iterator iterator17 = linkedListTestDriver16.iterator();
        boolean boolean18 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver16);
        experiment.util.LinkedListTestDriver linkedListTestDriver20 = new experiment.util.LinkedListTestDriver();
        int int21 = linkedListTestDriver20.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver22 = new experiment.util.LinkedListTestDriver();
        int int23 = linkedListTestDriver22.size();
        linkedListTestDriver20.addFirst((java.lang.Object) int23);
        boolean boolean25 = linkedListTestDriver20.isEmpty();
        boolean boolean27 = linkedListTestDriver20.equals_CUT((java.lang.Object) 10.0d);
        experiment.util.Iterator iterator28 = linkedListTestDriver20.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver29 = new experiment.util.LinkedListTestDriver();
        int int30 = linkedListTestDriver29.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver31 = new experiment.util.LinkedListTestDriver();
        int int32 = linkedListTestDriver31.size();
        linkedListTestDriver29.addFirst((java.lang.Object) int32);
        experiment.util.ListIterator listIterator35 = linkedListTestDriver29.listIterator(1);
        boolean boolean36 = linkedListTestDriver20.add((java.lang.Object) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver37 = new experiment.util.LinkedListTestDriver();
        int int38 = linkedListTestDriver37.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver39 = new experiment.util.LinkedListTestDriver();
        int int40 = linkedListTestDriver39.size();
        linkedListTestDriver37.addFirst((java.lang.Object) int40);
        boolean boolean42 = linkedListTestDriver37.isEmpty();
        boolean boolean44 = linkedListTestDriver37.equals_CUT((java.lang.Object) 10.0d);
        experiment.util.Iterator iterator45 = linkedListTestDriver37.iterator();
        linkedListTestDriver20.addFirst((java.lang.Object) iterator45);
        boolean boolean47 = linkedListTestDriver20.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver48 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray49 = linkedListTestDriver48.toArray();
        linkedListTestDriver48.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj53 = linkedListTestDriver48.remove((int) (short) 0);
        linkedListTestDriver48.clear();
        int int55 = linkedListTestDriver48.size();
        experiment.util.Iterator iterator56 = linkedListTestDriver48.iterator();
        java.lang.Object[] objArray57 = linkedListTestDriver48.toArray();
        linkedListTestDriver48.addFirst((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver61 = new experiment.util.LinkedListTestDriver();
        int int62 = linkedListTestDriver61.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver63 = new experiment.util.LinkedListTestDriver();
        int int64 = linkedListTestDriver63.size();
        linkedListTestDriver61.addFirst((java.lang.Object) int64);
        boolean boolean66 = linkedListTestDriver61.isEmpty();
        boolean boolean68 = linkedListTestDriver61.equals_CUT((java.lang.Object) 10.0d);
        java.lang.Object obj69 = linkedListTestDriver61.removeFirst();
        linkedListTestDriver48.add(1, (java.lang.Object) linkedListTestDriver61);
        java.lang.Object[] objArray71 = linkedListTestDriver61.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver72 = new experiment.util.LinkedListTestDriver();
        boolean boolean74 = linkedListTestDriver72.contains((java.lang.Object) 1.0f);
        boolean boolean76 = linkedListTestDriver72.equals_CUT((java.lang.Object) 1.0d);
        experiment.util.LinkedListTestDriver linkedListTestDriver77 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray78 = linkedListTestDriver77.toArray();
        linkedListTestDriver77.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj82 = linkedListTestDriver77.remove((int) (short) 0);
        java.lang.Class<?> wildcardClass83 = linkedListTestDriver77.getClass();
        linkedListTestDriver72.addLast((java.lang.Object) linkedListTestDriver77);
        linkedListTestDriver72.addFirst((java.lang.Object) 1.0d);
        boolean boolean88 = linkedListTestDriver72.remove((java.lang.Object) (short) 10);
        java.lang.Object[] objArray89 = linkedListTestDriver72.toArray();
        experiment.util.Iterator iterator90 = linkedListTestDriver72.iterator();
        boolean boolean91 = linkedListTestDriver61.equals_CUT((java.lang.Object) linkedListTestDriver72);
        boolean boolean92 = linkedListTestDriver20.remove((java.lang.Object) linkedListTestDriver72);
        java.lang.Object obj93 = linkedListTestDriver20.removeFirst();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj94 = linkedListTestDriver0.set((int) ' ', obj93);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(listIterator6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(iterator28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(listIterator35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(iterator45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray49), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray49), "[]");
        org.junit.Assert.assertEquals("'" + obj53 + "' != '" + (byte) 10 + "'", obj53, (byte) 10);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(iterator56);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray57), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray57), "[]");
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertEquals("'" + obj69 + "' != '" + 0 + "'", obj69, 0);
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray71), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray71), "[]");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(objArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray78), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray78), "[]");
        org.junit.Assert.assertEquals("'" + obj82 + "' != '" + (byte) 10 + "'", obj82, (byte) 10);
        org.junit.Assert.assertNotNull(wildcardClass83);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(objArray89);
        org.junit.Assert.assertNotNull(iterator90);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertNotNull(obj93);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test194");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray1 = linkedListTestDriver0.toArray();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.addLast((java.lang.Object) 100.0d);
        java.lang.Object obj6 = linkedListTestDriver0.removeLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray8 = linkedListTestDriver7.toArray();
        linkedListTestDriver7.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj12 = linkedListTestDriver7.remove((int) (short) 0);
        int int13 = linkedListTestDriver7.size();
        java.lang.Object[] objArray14 = linkedListTestDriver7.toArray();
        boolean boolean15 = linkedListTestDriver0.add((java.lang.Object) objArray14);
        experiment.util.LinkedListTestDriver linkedListTestDriver16 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray17 = linkedListTestDriver16.toArray();
        linkedListTestDriver16.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj21 = linkedListTestDriver16.remove((int) (short) 0);
        linkedListTestDriver0.addFirst((java.lang.Object) (short) 0);
        boolean boolean23 = linkedListTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = linkedListTestDriver0.remove((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 100.0d + "'", obj6, 100.0d);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) 10 + "'", obj12, (byte) 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (byte) 10 + "'", obj21, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test195");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray1 = linkedListTestDriver0.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver3 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray4 = linkedListTestDriver3.toArray();
        linkedListTestDriver3.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver3.addLast((java.lang.Object) 100.0d);
        java.lang.Object obj9 = linkedListTestDriver3.removeLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray11 = linkedListTestDriver10.toArray();
        linkedListTestDriver10.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj15 = linkedListTestDriver10.remove((int) (short) 0);
        int int16 = linkedListTestDriver10.size();
        java.lang.Object[] objArray17 = linkedListTestDriver10.toArray();
        boolean boolean18 = linkedListTestDriver3.add((java.lang.Object) objArray17);
        experiment.util.LinkedListTestDriver linkedListTestDriver19 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray20 = linkedListTestDriver19.toArray();
        linkedListTestDriver19.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj24 = linkedListTestDriver19.remove((int) (short) 0);
        linkedListTestDriver3.addFirst((java.lang.Object) (short) 0);
        boolean boolean26 = linkedListTestDriver3.isEmpty();
        java.lang.Object obj27 = linkedListTestDriver3.removeFirst();
        java.lang.Object obj29 = linkedListTestDriver3.remove(1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj30 = linkedListTestDriver0.set((int) (byte) 100, obj29);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 100.0d + "'", obj9, 100.0d);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (byte) 10 + "'", obj15, (byte) 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (byte) 10 + "'", obj24, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + (short) 0 + "'", obj27, (short) 0);
        org.junit.Assert.assertNotNull(obj29);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test196");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) 1.0f);
        boolean boolean4 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1.0d);
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray6 = linkedListTestDriver5.toArray();
        linkedListTestDriver5.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj10 = linkedListTestDriver5.remove((int) (short) 0);
        java.lang.Class<?> wildcardClass11 = linkedListTestDriver5.getClass();
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver5);
        linkedListTestDriver0.addFirst((java.lang.Object) 1.0d);
        boolean boolean16 = linkedListTestDriver0.remove((java.lang.Object) (short) 10);
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray18 = linkedListTestDriver17.toArray();
        linkedListTestDriver17.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj22 = linkedListTestDriver17.remove((int) (short) 0);
        linkedListTestDriver17.clear();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver17);
        experiment.util.LinkedListTestDriver linkedListTestDriver25 = new experiment.util.LinkedListTestDriver();
        int int26 = linkedListTestDriver25.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver27 = new experiment.util.LinkedListTestDriver();
        int int28 = linkedListTestDriver27.size();
        linkedListTestDriver25.addFirst((java.lang.Object) int28);
        boolean boolean30 = linkedListTestDriver25.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver31 = new experiment.util.LinkedListTestDriver();
        boolean boolean33 = linkedListTestDriver31.contains((java.lang.Object) 1.0f);
        boolean boolean35 = linkedListTestDriver31.equals_CUT((java.lang.Object) 1.0d);
        experiment.util.LinkedListTestDriver linkedListTestDriver36 = new experiment.util.LinkedListTestDriver();
        boolean boolean38 = linkedListTestDriver36.contains((java.lang.Object) 1.0f);
        boolean boolean40 = linkedListTestDriver36.equals_CUT((java.lang.Object) 1.0d);
        boolean boolean41 = linkedListTestDriver31.remove((java.lang.Object) linkedListTestDriver36);
        linkedListTestDriver25.addFirst((java.lang.Object) boolean41);
        experiment.util.LinkedListTestDriver linkedListTestDriver43 = new experiment.util.LinkedListTestDriver();
        boolean boolean45 = linkedListTestDriver43.contains((java.lang.Object) 1.0f);
        boolean boolean46 = linkedListTestDriver43.isEmpty();
        java.lang.Object[] objArray47 = linkedListTestDriver43.toArray();
        java.lang.Class<?> wildcardClass48 = objArray47.getClass();
        linkedListTestDriver25.addLast((java.lang.Object) wildcardClass48);
        linkedListTestDriver17.addFirst((java.lang.Object) linkedListTestDriver25);
        linkedListTestDriver17.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj52 = linkedListTestDriver17.removeFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) 10 + "'", obj10, (byte) 10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (byte) 10 + "'", obj22, (byte) 10);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[]");
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test197");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray1 = linkedListTestDriver0.toArray();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.addFirst((java.lang.Object) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = linkedListTestDriver0.remove((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test198");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray1 = linkedListTestDriver0.toArray();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        boolean boolean6 = linkedListTestDriver4.contains((java.lang.Object) 1.0f);
        boolean boolean7 = linkedListTestDriver4.isEmpty();
        java.lang.Object[] objArray8 = linkedListTestDriver4.toArray();
        boolean boolean9 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver4);
        boolean boolean11 = linkedListTestDriver0.equals_CUT((java.lang.Object) '4');
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray13 = linkedListTestDriver12.toArray();
        linkedListTestDriver12.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj17 = linkedListTestDriver12.remove((int) (short) 0);
        linkedListTestDriver12.clear();
        linkedListTestDriver12.clear();
        boolean boolean20 = linkedListTestDriver0.equals_CUT((java.lang.Object) linkedListTestDriver12);
        int int21 = linkedListTestDriver12.size();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator23 = linkedListTestDriver12.listIterator((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 1; size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) 10 + "'", obj17, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test199");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray1 = linkedListTestDriver0.toArray();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj5 = linkedListTestDriver0.remove((int) (short) 0);
        linkedListTestDriver0.clear();
        int int7 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        int int9 = linkedListTestDriver8.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        int int11 = linkedListTestDriver10.size();
        linkedListTestDriver8.addFirst((java.lang.Object) int11);
        boolean boolean13 = linkedListTestDriver8.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver14 = new experiment.util.LinkedListTestDriver();
        boolean boolean16 = linkedListTestDriver14.contains((java.lang.Object) 1.0f);
        boolean boolean18 = linkedListTestDriver14.equals_CUT((java.lang.Object) 1.0d);
        experiment.util.LinkedListTestDriver linkedListTestDriver19 = new experiment.util.LinkedListTestDriver();
        boolean boolean21 = linkedListTestDriver19.contains((java.lang.Object) 1.0f);
        boolean boolean23 = linkedListTestDriver19.equals_CUT((java.lang.Object) 1.0d);
        boolean boolean24 = linkedListTestDriver14.remove((java.lang.Object) linkedListTestDriver19);
        linkedListTestDriver8.addFirst((java.lang.Object) boolean24);
        linkedListTestDriver0.addFirst((java.lang.Object) boolean24);
        java.lang.Object obj27 = linkedListTestDriver0.removeFirst();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) 10 + "'", obj5, (byte) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + false + "'", obj27, false);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test200");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        int int1 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver2 = new experiment.util.LinkedListTestDriver();
        int int3 = linkedListTestDriver2.size();
        linkedListTestDriver0.addFirst((java.lang.Object) int3);
        boolean boolean5 = linkedListTestDriver0.isEmpty();
        boolean boolean7 = linkedListTestDriver0.remove((java.lang.Object) 10);
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        boolean boolean11 = linkedListTestDriver9.contains((java.lang.Object) 1.0f);
        boolean boolean13 = linkedListTestDriver9.equals_CUT((java.lang.Object) 1.0d);
        experiment.util.LinkedListTestDriver linkedListTestDriver14 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray15 = linkedListTestDriver14.toArray();
        linkedListTestDriver14.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj19 = linkedListTestDriver14.remove((int) (short) 0);
        java.lang.Class<?> wildcardClass20 = linkedListTestDriver14.getClass();
        linkedListTestDriver9.addLast((java.lang.Object) linkedListTestDriver14);
        linkedListTestDriver9.addFirst((java.lang.Object) 1.0d);
        boolean boolean25 = linkedListTestDriver9.remove((java.lang.Object) (short) 10);
        boolean boolean27 = linkedListTestDriver9.remove((java.lang.Object) (short) 100);
        java.lang.Object obj28 = linkedListTestDriver9.getLast();
        linkedListTestDriver0.add(1, obj28);
        java.lang.Class<?> wildcardClass30 = linkedListTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (byte) 10 + "'", obj19, (byte) 10);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test201");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        int int1 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver2 = new experiment.util.LinkedListTestDriver();
        int int3 = linkedListTestDriver2.size();
        linkedListTestDriver0.addFirst((java.lang.Object) int3);
        boolean boolean5 = linkedListTestDriver0.isEmpty();
        boolean boolean7 = linkedListTestDriver0.equals_CUT((java.lang.Object) 10.0d);
        experiment.util.Iterator iterator8 = linkedListTestDriver0.iterator();
        boolean boolean9 = linkedListTestDriver0.isEmpty();
        java.lang.Object obj10 = linkedListTestDriver0.getFirst();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 0 + "'", obj10, 0);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test202");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) 1.0f);
        boolean boolean4 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1.0d);
        boolean boolean6 = linkedListTestDriver0.remove((java.lang.Object) '4');
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray8 = linkedListTestDriver7.toArray();
        linkedListTestDriver7.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver7.addLast((java.lang.Object) 100.0d);
        java.lang.Object obj13 = linkedListTestDriver7.removeLast();
        boolean boolean14 = linkedListTestDriver0.contains(obj13);
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 100);
        java.lang.Object[] objArray17 = linkedListTestDriver0.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver18 = new experiment.util.LinkedListTestDriver();
        boolean boolean20 = linkedListTestDriver18.contains((java.lang.Object) 1.0f);
        boolean boolean22 = linkedListTestDriver18.equals_CUT((java.lang.Object) 1.0d);
        experiment.util.LinkedListTestDriver linkedListTestDriver23 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray24 = linkedListTestDriver23.toArray();
        linkedListTestDriver23.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj28 = linkedListTestDriver23.remove((int) (short) 0);
        java.lang.Class<?> wildcardClass29 = linkedListTestDriver23.getClass();
        linkedListTestDriver18.addLast((java.lang.Object) linkedListTestDriver23);
        linkedListTestDriver18.addFirst((java.lang.Object) 1.0d);
        boolean boolean34 = linkedListTestDriver18.remove((java.lang.Object) (short) 10);
        boolean boolean36 = linkedListTestDriver18.remove((java.lang.Object) (short) 100);
        java.lang.Object obj37 = linkedListTestDriver18.getLast();
        experiment.util.Iterator iterator38 = linkedListTestDriver18.iterator();
        boolean boolean39 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver18);
        experiment.util.LinkedListTestDriver linkedListTestDriver40 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray41 = linkedListTestDriver40.toArray();
        linkedListTestDriver40.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver40.addLast((java.lang.Object) 100.0d);
        linkedListTestDriver40.clear();
        int int47 = linkedListTestDriver40.size();
        experiment.util.Iterator iterator48 = linkedListTestDriver40.iterator();
        boolean boolean49 = linkedListTestDriver18.equals_CUT((java.lang.Object) linkedListTestDriver40);
        java.lang.Object obj51 = null;
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver18.add((int) (byte) -1, obj51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100.0d + "'", obj13, 100.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[100]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + (byte) 10 + "'", obj28, (byte) 10);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertNotNull(iterator38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[]");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(iterator48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test203");
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
        experiment.util.LinkedListTestDriver linkedListTestDriver18 = new experiment.util.LinkedListTestDriver();
        boolean boolean20 = linkedListTestDriver18.contains((java.lang.Object) 1.0f);
        boolean boolean21 = linkedListTestDriver18.isEmpty();
        java.lang.Object[] objArray22 = linkedListTestDriver18.toArray();
        java.lang.Class<?> wildcardClass23 = objArray22.getClass();
        linkedListTestDriver0.addLast((java.lang.Object) wildcardClass23);
        java.lang.Object obj25 = linkedListTestDriver0.removeFirst();
        java.lang.Object obj27 = linkedListTestDriver0.remove(0);
        experiment.util.Iterator iterator28 = linkedListTestDriver0.iterator();
        experiment.util.Iterator iterator29 = linkedListTestDriver0.iterator();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + false + "'", obj25, false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 0 + "'", obj27, 0);
        org.junit.Assert.assertNotNull(iterator28);
        org.junit.Assert.assertNotNull(iterator29);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test204");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray1 = linkedListTestDriver0.toArray();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        boolean boolean6 = linkedListTestDriver4.contains((java.lang.Object) 1.0f);
        boolean boolean7 = linkedListTestDriver4.isEmpty();
        java.lang.Object[] objArray8 = linkedListTestDriver4.toArray();
        boolean boolean9 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver4);
        boolean boolean11 = linkedListTestDriver0.equals_CUT((java.lang.Object) '4');
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray13 = linkedListTestDriver12.toArray();
        linkedListTestDriver12.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj17 = linkedListTestDriver12.remove((int) (short) 0);
        linkedListTestDriver12.clear();
        linkedListTestDriver12.clear();
        boolean boolean20 = linkedListTestDriver0.equals_CUT((java.lang.Object) linkedListTestDriver12);
        boolean boolean22 = linkedListTestDriver0.remove((java.lang.Object) (short) 0);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) 10 + "'", obj17, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test205");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) 1.0f);
        boolean boolean4 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1.0d);
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray6 = linkedListTestDriver5.toArray();
        linkedListTestDriver5.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj10 = linkedListTestDriver5.remove((int) (short) 0);
        java.lang.Class<?> wildcardClass11 = linkedListTestDriver5.getClass();
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver5);
        linkedListTestDriver0.addFirst((java.lang.Object) 1.0d);
        boolean boolean16 = linkedListTestDriver0.remove((java.lang.Object) (short) 10);
        boolean boolean18 = linkedListTestDriver0.remove((java.lang.Object) (short) 100);
        java.lang.Object obj19 = linkedListTestDriver0.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver21 = new experiment.util.LinkedListTestDriver();
        boolean boolean23 = linkedListTestDriver21.contains((java.lang.Object) 1.0f);
        boolean boolean25 = linkedListTestDriver21.equals_CUT((java.lang.Object) 1.0d);
        experiment.util.LinkedListTestDriver linkedListTestDriver26 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray27 = linkedListTestDriver26.toArray();
        linkedListTestDriver26.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj31 = linkedListTestDriver26.remove((int) (short) 0);
        java.lang.Class<?> wildcardClass32 = linkedListTestDriver26.getClass();
        linkedListTestDriver21.addLast((java.lang.Object) linkedListTestDriver26);
        linkedListTestDriver21.addFirst((java.lang.Object) 1.0d);
        boolean boolean37 = linkedListTestDriver21.remove((java.lang.Object) (short) 10);
        java.lang.Object obj39 = linkedListTestDriver21.remove(0);
        experiment.util.LinkedListTestDriver linkedListTestDriver40 = new experiment.util.LinkedListTestDriver();
        int int41 = linkedListTestDriver40.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver42 = new experiment.util.LinkedListTestDriver();
        int int43 = linkedListTestDriver42.size();
        linkedListTestDriver40.addFirst((java.lang.Object) int43);
        boolean boolean45 = linkedListTestDriver40.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver46 = new experiment.util.LinkedListTestDriver();
        boolean boolean48 = linkedListTestDriver46.contains((java.lang.Object) 1.0f);
        boolean boolean50 = linkedListTestDriver46.equals_CUT((java.lang.Object) 1.0d);
        experiment.util.LinkedListTestDriver linkedListTestDriver51 = new experiment.util.LinkedListTestDriver();
        boolean boolean53 = linkedListTestDriver51.contains((java.lang.Object) 1.0f);
        boolean boolean55 = linkedListTestDriver51.equals_CUT((java.lang.Object) 1.0d);
        boolean boolean56 = linkedListTestDriver46.remove((java.lang.Object) linkedListTestDriver51);
        linkedListTestDriver40.addFirst((java.lang.Object) boolean56);
        experiment.util.LinkedListTestDriver linkedListTestDriver58 = new experiment.util.LinkedListTestDriver();
        boolean boolean60 = linkedListTestDriver58.contains((java.lang.Object) 1.0f);
        boolean boolean61 = linkedListTestDriver58.isEmpty();
        java.lang.Object[] objArray62 = linkedListTestDriver58.toArray();
        java.lang.Class<?> wildcardClass63 = objArray62.getClass();
        linkedListTestDriver40.addLast((java.lang.Object) wildcardClass63);
        java.lang.Object obj65 = linkedListTestDriver40.removeFirst();
        java.lang.Object obj67 = linkedListTestDriver40.remove(0);
        java.lang.Object obj68 = linkedListTestDriver40.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver69 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray70 = linkedListTestDriver69.toArray();
        linkedListTestDriver69.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj74 = linkedListTestDriver69.remove((int) (short) 0);
        linkedListTestDriver69.clear();
        int int76 = linkedListTestDriver69.size();
        experiment.util.Iterator iterator77 = linkedListTestDriver69.iterator();
        java.lang.Object[] objArray78 = linkedListTestDriver69.toArray();
        linkedListTestDriver69.addFirst((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver82 = new experiment.util.LinkedListTestDriver();
        int int83 = linkedListTestDriver82.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver84 = new experiment.util.LinkedListTestDriver();
        int int85 = linkedListTestDriver84.size();
        linkedListTestDriver82.addFirst((java.lang.Object) int85);
        boolean boolean87 = linkedListTestDriver82.isEmpty();
        boolean boolean89 = linkedListTestDriver82.equals_CUT((java.lang.Object) 10.0d);
        java.lang.Object obj90 = linkedListTestDriver82.removeFirst();
        linkedListTestDriver69.add(1, (java.lang.Object) linkedListTestDriver82);
        linkedListTestDriver40.addLast((java.lang.Object) linkedListTestDriver69);
        boolean boolean93 = linkedListTestDriver21.contains((java.lang.Object) linkedListTestDriver40);
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.add((int) (short) 10, (java.lang.Object) linkedListTestDriver40);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 10; size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) 10 + "'", obj10, (byte) 10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + (byte) 10 + "'", obj31, (byte) 10);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + 1.0d + "'", obj39, 1.0d);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray62), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray62), "[]");
        org.junit.Assert.assertNotNull(wildcardClass63);
        org.junit.Assert.assertEquals("'" + obj65 + "' != '" + false + "'", obj65, false);
        org.junit.Assert.assertEquals("'" + obj67 + "' != '" + 0 + "'", obj67, 0);
        org.junit.Assert.assertNotNull(obj68);
        org.junit.Assert.assertEquals(obj68.toString(), "class [Ljava.lang.Object;");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj68), "class [Ljava.lang.Object;");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj68), "class [Ljava.lang.Object;");
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray70), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray70), "[]");
        org.junit.Assert.assertEquals("'" + obj74 + "' != '" + (byte) 10 + "'", obj74, (byte) 10);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertNotNull(iterator77);
        org.junit.Assert.assertNotNull(objArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray78), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray78), "[]");
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertEquals("'" + obj90 + "' != '" + 0 + "'", obj90, 0);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test206");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) 1.0f);
        boolean boolean4 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1.0d);
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray6 = linkedListTestDriver5.toArray();
        linkedListTestDriver5.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj10 = linkedListTestDriver5.remove((int) (short) 0);
        java.lang.Class<?> wildcardClass11 = linkedListTestDriver5.getClass();
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver5);
        linkedListTestDriver0.addFirst((java.lang.Object) 1.0d);
        boolean boolean16 = linkedListTestDriver0.remove((java.lang.Object) (short) 10);
        java.lang.Object obj18 = linkedListTestDriver0.remove(0);
        int int19 = linkedListTestDriver0.size();
        java.lang.Object obj20 = linkedListTestDriver0.getFirst();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) 10 + "'", obj10, (byte) 10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 1.0d + "'", obj18, 1.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(obj20);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test207");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray1 = linkedListTestDriver0.toArray();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj5 = linkedListTestDriver0.remove((int) (short) 0);
        int int6 = linkedListTestDriver0.size();
        java.lang.Object[] objArray7 = linkedListTestDriver0.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray9 = linkedListTestDriver8.toArray();
        linkedListTestDriver8.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver8.addLast((java.lang.Object) 100.0d);
        linkedListTestDriver8.clear();
        boolean boolean15 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver8);
        experiment.util.LinkedListTestDriver linkedListTestDriver16 = new experiment.util.LinkedListTestDriver();
        int int17 = linkedListTestDriver16.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver18 = new experiment.util.LinkedListTestDriver();
        int int19 = linkedListTestDriver18.size();
        linkedListTestDriver16.addFirst((java.lang.Object) int19);
        experiment.util.Iterator iterator21 = linkedListTestDriver16.iterator();
        boolean boolean22 = linkedListTestDriver16.isEmpty();
        boolean boolean23 = linkedListTestDriver0.remove((java.lang.Object) boolean22);
        experiment.util.Iterator iterator24 = linkedListTestDriver0.iterator();
        java.lang.Class<?> wildcardClass25 = iterator24.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) 10 + "'", obj5, (byte) 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(iterator24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test208");
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
        experiment.util.LinkedListTestDriver linkedListTestDriver18 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray19 = linkedListTestDriver18.toArray();
        linkedListTestDriver18.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj23 = linkedListTestDriver18.remove((int) (short) 0);
        linkedListTestDriver18.clear();
        int int25 = linkedListTestDriver18.size();
        experiment.util.Iterator iterator26 = linkedListTestDriver18.iterator();
        java.lang.Object[] objArray27 = linkedListTestDriver18.toArray();
        linkedListTestDriver18.addFirst((java.lang.Object) '#');
        linkedListTestDriver0.addLast((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver31 = new experiment.util.LinkedListTestDriver();
        boolean boolean33 = linkedListTestDriver31.contains((java.lang.Object) 1.0f);
        boolean boolean35 = linkedListTestDriver31.equals_CUT((java.lang.Object) 1.0d);
        linkedListTestDriver31.addFirst((java.lang.Object) 0.0f);
        linkedListTestDriver0.addFirst((java.lang.Object) 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj40 = linkedListTestDriver0.remove((int) (short) 10);
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
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (byte) 10 + "'", obj23, (byte) 10);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test209");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) 1.0f);
        boolean boolean4 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1.0d);
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray6 = linkedListTestDriver5.toArray();
        linkedListTestDriver5.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj10 = linkedListTestDriver5.remove((int) (short) 0);
        java.lang.Class<?> wildcardClass11 = linkedListTestDriver5.getClass();
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver5);
        linkedListTestDriver0.addFirst((java.lang.Object) 1.0d);
        boolean boolean16 = linkedListTestDriver0.remove((java.lang.Object) (short) 10);
        java.lang.Object obj18 = linkedListTestDriver0.remove(0);
        experiment.util.LinkedListTestDriver linkedListTestDriver19 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray20 = linkedListTestDriver19.toArray();
        linkedListTestDriver19.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver19.addLast((java.lang.Object) 100.0d);
        linkedListTestDriver19.clear();
        boolean boolean26 = linkedListTestDriver0.equals_CUT((java.lang.Object) linkedListTestDriver19);
        java.lang.Object[] objArray27 = linkedListTestDriver19.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver29 = new experiment.util.LinkedListTestDriver();
        int int30 = linkedListTestDriver29.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver32 = new experiment.util.LinkedListTestDriver();
        boolean boolean34 = linkedListTestDriver32.contains((java.lang.Object) 1.0f);
        boolean boolean36 = linkedListTestDriver32.equals_CUT((java.lang.Object) 1.0d);
        experiment.util.LinkedListTestDriver linkedListTestDriver37 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray38 = linkedListTestDriver37.toArray();
        linkedListTestDriver37.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj42 = linkedListTestDriver37.remove((int) (short) 0);
        java.lang.Class<?> wildcardClass43 = linkedListTestDriver37.getClass();
        linkedListTestDriver32.addLast((java.lang.Object) linkedListTestDriver37);
        linkedListTestDriver32.addFirst((java.lang.Object) 1.0d);
        boolean boolean48 = linkedListTestDriver32.remove((java.lang.Object) (short) 10);
        experiment.util.LinkedListTestDriver linkedListTestDriver49 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray50 = linkedListTestDriver49.toArray();
        linkedListTestDriver49.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj54 = linkedListTestDriver49.remove((int) (short) 0);
        linkedListTestDriver49.clear();
        linkedListTestDriver32.addFirst((java.lang.Object) linkedListTestDriver49);
        linkedListTestDriver29.add((int) (short) 0, (java.lang.Object) linkedListTestDriver32);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj58 = linkedListTestDriver19.set((int) (byte) 100, (java.lang.Object) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) 10 + "'", obj10, (byte) 10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 1.0d + "'", obj18, 1.0d);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[]");
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + (byte) 10 + "'", obj42, (byte) 10);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray50), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray50), "[]");
        org.junit.Assert.assertEquals("'" + obj54 + "' != '" + (byte) 10 + "'", obj54, (byte) 10);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test210");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        int int1 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver2 = new experiment.util.LinkedListTestDriver();
        int int3 = linkedListTestDriver2.size();
        linkedListTestDriver0.addFirst((java.lang.Object) int3);
        boolean boolean5 = linkedListTestDriver0.isEmpty();
        boolean boolean7 = linkedListTestDriver0.equals_CUT((java.lang.Object) 10.0d);
        java.lang.Object obj8 = linkedListTestDriver0.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray10 = linkedListTestDriver9.toArray();
        linkedListTestDriver9.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj14 = linkedListTestDriver9.remove((int) (short) 0);
        linkedListTestDriver9.clear();
        int int16 = linkedListTestDriver9.size();
        experiment.util.Iterator iterator17 = linkedListTestDriver9.iterator();
        java.lang.Object[] objArray18 = linkedListTestDriver9.toArray();
        boolean boolean19 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = linkedListTestDriver0.removeLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0 + "'", obj8, 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (byte) 10 + "'", obj14, (byte) 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test211");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        int int1 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver2 = new experiment.util.LinkedListTestDriver();
        int int3 = linkedListTestDriver2.size();
        linkedListTestDriver0.addFirst((java.lang.Object) int3);
        boolean boolean5 = linkedListTestDriver0.isEmpty();
        boolean boolean7 = linkedListTestDriver0.equals_CUT((java.lang.Object) 10.0d);
        java.lang.Object obj8 = linkedListTestDriver0.removeFirst();
        java.lang.Object[] objArray9 = linkedListTestDriver0.toArray();
        linkedListTestDriver0.addFirst((java.lang.Object) ' ');
        linkedListTestDriver0.addLast((java.lang.Object) 10.0f);
        java.lang.Object obj14 = linkedListTestDriver0.removeLast();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator16 = linkedListTestDriver0.listIterator((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: -1; size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0 + "'", obj8, 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 10.0f + "'", obj14, 10.0f);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test212");
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
        experiment.util.LinkedListTestDriver linkedListTestDriver18 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray19 = linkedListTestDriver18.toArray();
        linkedListTestDriver18.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj23 = linkedListTestDriver18.remove((int) (short) 0);
        linkedListTestDriver18.clear();
        int int25 = linkedListTestDriver18.size();
        experiment.util.Iterator iterator26 = linkedListTestDriver18.iterator();
        java.lang.Object[] objArray27 = linkedListTestDriver18.toArray();
        linkedListTestDriver18.addFirst((java.lang.Object) '#');
        linkedListTestDriver0.addLast((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver31 = new experiment.util.LinkedListTestDriver();
        boolean boolean33 = linkedListTestDriver31.contains((java.lang.Object) 1.0f);
        boolean boolean35 = linkedListTestDriver31.equals_CUT((java.lang.Object) 1.0d);
        linkedListTestDriver31.addFirst((java.lang.Object) 0.0f);
        linkedListTestDriver0.addFirst((java.lang.Object) 0.0f);
        java.lang.Object obj40 = linkedListTestDriver0.remove(1);
        java.lang.Object obj41 = linkedListTestDriver0.getFirst();
        linkedListTestDriver0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (byte) 10 + "'", obj23, (byte) 10);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + false + "'", obj40, false);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + 0.0f + "'", obj41, 0.0f);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test213");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        int int1 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver2 = new experiment.util.LinkedListTestDriver();
        int int3 = linkedListTestDriver2.size();
        linkedListTestDriver0.addFirst((java.lang.Object) int3);
        boolean boolean5 = linkedListTestDriver0.isEmpty();
        boolean boolean7 = linkedListTestDriver0.equals_CUT((java.lang.Object) 10.0d);
        experiment.util.Iterator iterator8 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        int int10 = linkedListTestDriver9.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        int int12 = linkedListTestDriver11.size();
        linkedListTestDriver9.addFirst((java.lang.Object) int12);
        experiment.util.ListIterator listIterator15 = linkedListTestDriver9.listIterator(1);
        boolean boolean16 = linkedListTestDriver0.add((java.lang.Object) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        int int18 = linkedListTestDriver17.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver19 = new experiment.util.LinkedListTestDriver();
        int int20 = linkedListTestDriver19.size();
        linkedListTestDriver17.addFirst((java.lang.Object) int20);
        boolean boolean22 = linkedListTestDriver17.isEmpty();
        boolean boolean24 = linkedListTestDriver17.equals_CUT((java.lang.Object) 10.0d);
        experiment.util.Iterator iterator25 = linkedListTestDriver17.iterator();
        linkedListTestDriver0.addFirst((java.lang.Object) iterator25);
        boolean boolean27 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver28 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray29 = linkedListTestDriver28.toArray();
        linkedListTestDriver28.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj33 = linkedListTestDriver28.remove((int) (short) 0);
        linkedListTestDriver28.clear();
        int int35 = linkedListTestDriver28.size();
        experiment.util.Iterator iterator36 = linkedListTestDriver28.iterator();
        java.lang.Object[] objArray37 = linkedListTestDriver28.toArray();
        linkedListTestDriver28.addFirst((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver41 = new experiment.util.LinkedListTestDriver();
        int int42 = linkedListTestDriver41.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver43 = new experiment.util.LinkedListTestDriver();
        int int44 = linkedListTestDriver43.size();
        linkedListTestDriver41.addFirst((java.lang.Object) int44);
        boolean boolean46 = linkedListTestDriver41.isEmpty();
        boolean boolean48 = linkedListTestDriver41.equals_CUT((java.lang.Object) 10.0d);
        java.lang.Object obj49 = linkedListTestDriver41.removeFirst();
        linkedListTestDriver28.add(1, (java.lang.Object) linkedListTestDriver41);
        java.lang.Object[] objArray51 = linkedListTestDriver41.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver52 = new experiment.util.LinkedListTestDriver();
        boolean boolean54 = linkedListTestDriver52.contains((java.lang.Object) 1.0f);
        boolean boolean56 = linkedListTestDriver52.equals_CUT((java.lang.Object) 1.0d);
        experiment.util.LinkedListTestDriver linkedListTestDriver57 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray58 = linkedListTestDriver57.toArray();
        linkedListTestDriver57.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj62 = linkedListTestDriver57.remove((int) (short) 0);
        java.lang.Class<?> wildcardClass63 = linkedListTestDriver57.getClass();
        linkedListTestDriver52.addLast((java.lang.Object) linkedListTestDriver57);
        linkedListTestDriver52.addFirst((java.lang.Object) 1.0d);
        boolean boolean68 = linkedListTestDriver52.remove((java.lang.Object) (short) 10);
        java.lang.Object[] objArray69 = linkedListTestDriver52.toArray();
        experiment.util.Iterator iterator70 = linkedListTestDriver52.iterator();
        boolean boolean71 = linkedListTestDriver41.equals_CUT((java.lang.Object) linkedListTestDriver52);
        boolean boolean72 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver52);
        java.lang.Object obj73 = linkedListTestDriver0.removeFirst();
        java.lang.Class<?> wildcardClass74 = obj73.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(listIterator15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(iterator25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[]");
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + (byte) 10 + "'", obj33, (byte) 10);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(iterator36);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[]");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + 0 + "'", obj49, 0);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray51), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray51), "[]");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray58), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray58), "[]");
        org.junit.Assert.assertEquals("'" + obj62 + "' != '" + (byte) 10 + "'", obj62, (byte) 10);
        org.junit.Assert.assertNotNull(wildcardClass63);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertNotNull(iterator70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(obj73);
        org.junit.Assert.assertNotNull(wildcardClass74);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test214");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        int int1 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver2 = new experiment.util.LinkedListTestDriver();
        int int3 = linkedListTestDriver2.size();
        linkedListTestDriver0.addFirst((java.lang.Object) int3);
        boolean boolean5 = linkedListTestDriver0.isEmpty();
        boolean boolean7 = linkedListTestDriver0.equals_CUT((java.lang.Object) 10.0d);
        java.lang.Object obj8 = linkedListTestDriver0.getFirst();
        java.lang.Object obj9 = linkedListTestDriver0.getFirst();
        int int10 = linkedListTestDriver0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0 + "'", obj8, 0);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0 + "'", obj9, 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test215");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray1 = linkedListTestDriver0.toArray();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.addLast((java.lang.Object) 100.0d);
        boolean boolean7 = linkedListTestDriver0.add((java.lang.Object) ' ');
        java.lang.Object obj8 = linkedListTestDriver0.getLast();
        java.lang.Object obj9 = linkedListTestDriver0.removeLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        int int12 = linkedListTestDriver11.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        int int14 = linkedListTestDriver13.size();
        linkedListTestDriver11.addFirst((java.lang.Object) int14);
        boolean boolean16 = linkedListTestDriver11.isEmpty();
        boolean boolean18 = linkedListTestDriver11.equals_CUT((java.lang.Object) 10.0d);
        experiment.util.Iterator iterator19 = linkedListTestDriver11.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver20 = new experiment.util.LinkedListTestDriver();
        int int21 = linkedListTestDriver20.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver22 = new experiment.util.LinkedListTestDriver();
        int int23 = linkedListTestDriver22.size();
        linkedListTestDriver20.addFirst((java.lang.Object) int23);
        experiment.util.ListIterator listIterator26 = linkedListTestDriver20.listIterator(1);
        boolean boolean27 = linkedListTestDriver11.add((java.lang.Object) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver28 = new experiment.util.LinkedListTestDriver();
        boolean boolean30 = linkedListTestDriver28.contains((java.lang.Object) 1.0f);
        boolean boolean32 = linkedListTestDriver28.equals_CUT((java.lang.Object) 1.0d);
        linkedListTestDriver28.addFirst((java.lang.Object) 0.0f);
        linkedListTestDriver11.addFirst((java.lang.Object) 0.0f);
        java.lang.Object obj36 = linkedListTestDriver11.getLast();
        java.lang.Object obj37 = linkedListTestDriver11.getFirst();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj38 = linkedListTestDriver0.set((int) '#', obj37);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + ' ' + "'", obj8, ' ');
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + ' ' + "'", obj9, ' ');
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(listIterator26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + 1 + "'", obj36, 1);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + 0.0f + "'", obj37, 0.0f);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test216");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray1 = linkedListTestDriver0.toArray();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.addLast((java.lang.Object) 100.0d);
        linkedListTestDriver0.clear();
        java.lang.Object obj8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = linkedListTestDriver0.set(0, obj8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test217");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray1 = linkedListTestDriver0.toArray();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.addLast((java.lang.Object) 100.0d);
        linkedListTestDriver0.clear();
        java.lang.Object[] objArray7 = linkedListTestDriver0.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = linkedListTestDriver0.remove((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test218");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray1 = linkedListTestDriver0.toArray();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.addLast((java.lang.Object) 100.0d);
        linkedListTestDriver0.clear();
        int int7 = linkedListTestDriver0.size();
        int int8 = linkedListTestDriver0.size();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test219");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) 1.0f);
        boolean boolean4 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1.0d);
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        boolean boolean7 = linkedListTestDriver5.contains((java.lang.Object) 1.0f);
        boolean boolean9 = linkedListTestDriver5.equals_CUT((java.lang.Object) 1.0d);
        boolean boolean10 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver5);
        experiment.util.Iterator iterator11 = linkedListTestDriver0.iterator();
        int int12 = linkedListTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = linkedListTestDriver0.getFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test220");
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
        experiment.util.LinkedListTestDriver linkedListTestDriver18 = new experiment.util.LinkedListTestDriver();
        boolean boolean20 = linkedListTestDriver18.contains((java.lang.Object) 1.0f);
        boolean boolean21 = linkedListTestDriver18.isEmpty();
        java.lang.Object[] objArray22 = linkedListTestDriver18.toArray();
        java.lang.Class<?> wildcardClass23 = objArray22.getClass();
        linkedListTestDriver0.addLast((java.lang.Object) wildcardClass23);
        java.lang.Object obj25 = linkedListTestDriver0.removeFirst();
        java.lang.Object obj27 = linkedListTestDriver0.remove(0);
        java.lang.Object obj28 = linkedListTestDriver0.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver29 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray30 = linkedListTestDriver29.toArray();
        linkedListTestDriver29.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj34 = linkedListTestDriver29.remove((int) (short) 0);
        linkedListTestDriver29.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver36 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray37 = linkedListTestDriver36.toArray();
        linkedListTestDriver36.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj41 = linkedListTestDriver36.remove((int) (short) 0);
        linkedListTestDriver36.clear();
        int int43 = linkedListTestDriver36.size();
        experiment.util.Iterator iterator44 = linkedListTestDriver36.iterator();
        boolean boolean45 = linkedListTestDriver29.remove((java.lang.Object) linkedListTestDriver36);
        experiment.util.LinkedListTestDriver linkedListTestDriver46 = new experiment.util.LinkedListTestDriver();
        boolean boolean48 = linkedListTestDriver46.contains((java.lang.Object) 1.0f);
        boolean boolean50 = linkedListTestDriver46.remove((java.lang.Object) 1.0f);
        boolean boolean51 = linkedListTestDriver46.isEmpty();
        java.lang.Object[] objArray52 = linkedListTestDriver46.toArray();
        boolean boolean53 = linkedListTestDriver36.equals_CUT((java.lang.Object) objArray52);
        boolean boolean54 = linkedListTestDriver0.remove((java.lang.Object) objArray52);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + false + "'", obj25, false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 0 + "'", obj27, 0);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertEquals(obj28.toString(), "class [Ljava.lang.Object;");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj28), "class [Ljava.lang.Object;");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj28), "class [Ljava.lang.Object;");
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[]");
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + (byte) 10 + "'", obj34, (byte) 10);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[]");
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + (byte) 10 + "'", obj41, (byte) 10);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(iterator44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray52), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray52), "[]");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test221");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        int int1 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver2 = new experiment.util.LinkedListTestDriver();
        int int3 = linkedListTestDriver2.size();
        linkedListTestDriver0.addFirst((java.lang.Object) int3);
        boolean boolean5 = linkedListTestDriver0.isEmpty();
        boolean boolean7 = linkedListTestDriver0.equals_CUT((java.lang.Object) 10.0d);
        java.lang.Object obj8 = linkedListTestDriver0.getFirst();
        java.lang.Object obj9 = linkedListTestDriver0.getFirst();
        java.lang.Object obj10 = linkedListTestDriver0.removeFirst();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0 + "'", obj8, 0);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0 + "'", obj9, 0);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 0 + "'", obj10, 0);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test222");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        int int1 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver2 = new experiment.util.LinkedListTestDriver();
        int int3 = linkedListTestDriver2.size();
        linkedListTestDriver0.addFirst((java.lang.Object) int3);
        boolean boolean5 = linkedListTestDriver0.isEmpty();
        boolean boolean7 = linkedListTestDriver0.equals_CUT((java.lang.Object) 10.0d);
        experiment.util.Iterator iterator8 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        int int10 = linkedListTestDriver9.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        int int12 = linkedListTestDriver11.size();
        linkedListTestDriver9.addFirst((java.lang.Object) int12);
        experiment.util.ListIterator listIterator15 = linkedListTestDriver9.listIterator(1);
        boolean boolean16 = linkedListTestDriver0.add((java.lang.Object) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray18 = linkedListTestDriver17.toArray();
        linkedListTestDriver17.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj22 = linkedListTestDriver17.remove((int) (short) 0);
        int int23 = linkedListTestDriver17.size();
        java.lang.Object[] objArray24 = linkedListTestDriver17.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver25 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray26 = linkedListTestDriver25.toArray();
        linkedListTestDriver25.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver25.addLast((java.lang.Object) 100.0d);
        linkedListTestDriver25.clear();
        boolean boolean32 = linkedListTestDriver17.contains((java.lang.Object) linkedListTestDriver25);
        boolean boolean33 = linkedListTestDriver0.remove((java.lang.Object) boolean32);
        java.lang.Object obj34 = linkedListTestDriver0.removeFirst();
        int int35 = linkedListTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj37 = linkedListTestDriver0.get((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(listIterator15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (byte) 10 + "'", obj22, (byte) 10);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + 0 + "'", obj34, 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test223");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        boolean boolean6 = linkedListTestDriver4.contains((java.lang.Object) 1.0f);
        boolean boolean8 = linkedListTestDriver4.equals_CUT((java.lang.Object) 1.0d);
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray10 = linkedListTestDriver9.toArray();
        linkedListTestDriver9.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj14 = linkedListTestDriver9.remove((int) (short) 0);
        java.lang.Class<?> wildcardClass15 = linkedListTestDriver9.getClass();
        linkedListTestDriver4.addLast((java.lang.Object) linkedListTestDriver9);
        linkedListTestDriver4.addFirst((java.lang.Object) 1.0d);
        boolean boolean20 = linkedListTestDriver4.remove((java.lang.Object) (short) 10);
        boolean boolean22 = linkedListTestDriver4.remove((java.lang.Object) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.add((int) (short) 100, (java.lang.Object) linkedListTestDriver4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 100; size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (byte) 10 + "'", obj14, (byte) 10);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test224");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) 1.0f);
        boolean boolean4 = linkedListTestDriver0.remove((java.lang.Object) 1.0f);
        int int5 = linkedListTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = linkedListTestDriver0.get((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test225");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray1 = linkedListTestDriver0.toArray();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj5 = linkedListTestDriver0.remove((int) (short) 0);
        linkedListTestDriver0.clear();
        int int7 = linkedListTestDriver0.size();
        experiment.util.Iterator iterator8 = linkedListTestDriver0.iterator();
        java.lang.Object[] objArray9 = linkedListTestDriver0.toArray();
        linkedListTestDriver0.addFirst((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        int int14 = linkedListTestDriver13.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver15 = new experiment.util.LinkedListTestDriver();
        int int16 = linkedListTestDriver15.size();
        linkedListTestDriver13.addFirst((java.lang.Object) int16);
        boolean boolean18 = linkedListTestDriver13.isEmpty();
        boolean boolean20 = linkedListTestDriver13.equals_CUT((java.lang.Object) 10.0d);
        java.lang.Object obj21 = linkedListTestDriver13.removeFirst();
        linkedListTestDriver0.add(1, (java.lang.Object) linkedListTestDriver13);
        java.lang.Object[] objArray23 = linkedListTestDriver13.toArray();
        experiment.util.Iterator iterator24 = linkedListTestDriver13.iterator();
        experiment.util.Iterator iterator25 = linkedListTestDriver13.iterator();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) 10 + "'", obj5, (byte) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 0 + "'", obj21, 0);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
        org.junit.Assert.assertNotNull(iterator24);
        org.junit.Assert.assertNotNull(iterator25);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test226");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        int int1 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver2 = new experiment.util.LinkedListTestDriver();
        int int3 = linkedListTestDriver2.size();
        linkedListTestDriver0.addFirst((java.lang.Object) int3);
        boolean boolean5 = linkedListTestDriver0.isEmpty();
        boolean boolean7 = linkedListTestDriver0.equals_CUT((java.lang.Object) 10.0d);
        java.lang.Object obj8 = linkedListTestDriver0.removeFirst();
        java.lang.Object[] objArray9 = linkedListTestDriver0.toArray();
        int int10 = linkedListTestDriver0.size();
        java.lang.Object obj11 = null;
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.addLast(obj11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0 + "'", obj8, 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test227");
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
        experiment.util.LinkedListTestDriver linkedListTestDriver18 = new experiment.util.LinkedListTestDriver();
        boolean boolean20 = linkedListTestDriver18.contains((java.lang.Object) 1.0f);
        boolean boolean21 = linkedListTestDriver18.isEmpty();
        java.lang.Object[] objArray22 = linkedListTestDriver18.toArray();
        java.lang.Class<?> wildcardClass23 = objArray22.getClass();
        linkedListTestDriver0.addLast((java.lang.Object) wildcardClass23);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = linkedListTestDriver0.get(3);
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test228");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) 1.0f);
        boolean boolean4 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1.0d);
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        boolean boolean7 = linkedListTestDriver5.contains((java.lang.Object) 1.0f);
        boolean boolean9 = linkedListTestDriver5.equals_CUT((java.lang.Object) 1.0d);
        boolean boolean10 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver5);
        linkedListTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = linkedListTestDriver0.get((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test229");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) 1.0f);
        boolean boolean4 = linkedListTestDriver0.remove((java.lang.Object) 1.0f);
        boolean boolean5 = linkedListTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = linkedListTestDriver0.remove((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test230");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        int int1 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver2 = new experiment.util.LinkedListTestDriver();
        int int3 = linkedListTestDriver2.size();
        linkedListTestDriver0.addFirst((java.lang.Object) int3);
        experiment.util.ListIterator listIterator6 = linkedListTestDriver0.listIterator(1);
        int int7 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        int int10 = linkedListTestDriver9.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        int int12 = linkedListTestDriver11.size();
        linkedListTestDriver9.addFirst((java.lang.Object) int12);
        boolean boolean14 = linkedListTestDriver9.isEmpty();
        boolean boolean16 = linkedListTestDriver9.equals_CUT((java.lang.Object) 10.0d);
        java.lang.Object obj17 = linkedListTestDriver9.removeFirst();
        linkedListTestDriver0.add((int) (short) 1, obj17);
        experiment.util.LinkedListTestDriver linkedListTestDriver19 = new experiment.util.LinkedListTestDriver();
        boolean boolean21 = linkedListTestDriver19.contains((java.lang.Object) 1.0f);
        boolean boolean23 = linkedListTestDriver19.remove((java.lang.Object) 1.0f);
        int int24 = linkedListTestDriver19.size();
        boolean boolean25 = linkedListTestDriver0.equals_CUT((java.lang.Object) int24);
        experiment.util.LinkedListTestDriver linkedListTestDriver26 = new experiment.util.LinkedListTestDriver();
        int int27 = linkedListTestDriver26.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver28 = new experiment.util.LinkedListTestDriver();
        int int29 = linkedListTestDriver28.size();
        linkedListTestDriver26.addFirst((java.lang.Object) int29);
        boolean boolean31 = linkedListTestDriver26.isEmpty();
        boolean boolean33 = linkedListTestDriver26.equals_CUT((java.lang.Object) 10.0d);
        java.lang.Object obj34 = linkedListTestDriver26.getFirst();
        java.lang.Object obj35 = linkedListTestDriver26.getFirst();
        java.lang.Object obj36 = linkedListTestDriver26.getLast();
        boolean boolean37 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver26);
        experiment.util.LinkedListTestDriver linkedListTestDriver38 = new experiment.util.LinkedListTestDriver();
        int int39 = linkedListTestDriver38.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver40 = new experiment.util.LinkedListTestDriver();
        int int41 = linkedListTestDriver40.size();
        linkedListTestDriver38.addFirst((java.lang.Object) int41);
        experiment.util.ListIterator listIterator44 = linkedListTestDriver38.listIterator(1);
        boolean boolean45 = linkedListTestDriver0.equals_CUT((java.lang.Object) linkedListTestDriver38);
        int int46 = linkedListTestDriver0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(listIterator6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 0 + "'", obj17, 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + 0 + "'", obj34, 0);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 0 + "'", obj35, 0);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + 0 + "'", obj36, 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(listIterator44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 3 + "'", int46 == 3);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test231");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        int int1 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver2 = new experiment.util.LinkedListTestDriver();
        int int3 = linkedListTestDriver2.size();
        linkedListTestDriver0.addFirst((java.lang.Object) int3);
        boolean boolean5 = linkedListTestDriver0.isEmpty();
        boolean boolean7 = linkedListTestDriver0.equals_CUT((java.lang.Object) 10.0d);
        experiment.util.Iterator iterator8 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        int int10 = linkedListTestDriver9.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        int int12 = linkedListTestDriver11.size();
        linkedListTestDriver9.addFirst((java.lang.Object) int12);
        experiment.util.ListIterator listIterator15 = linkedListTestDriver9.listIterator(1);
        boolean boolean16 = linkedListTestDriver0.add((java.lang.Object) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray18 = linkedListTestDriver17.toArray();
        linkedListTestDriver17.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj22 = linkedListTestDriver17.remove((int) (short) 0);
        int int23 = linkedListTestDriver17.size();
        java.lang.Object[] objArray24 = linkedListTestDriver17.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver25 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray26 = linkedListTestDriver25.toArray();
        linkedListTestDriver25.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver25.addLast((java.lang.Object) 100.0d);
        linkedListTestDriver25.clear();
        boolean boolean32 = linkedListTestDriver17.contains((java.lang.Object) linkedListTestDriver25);
        boolean boolean33 = linkedListTestDriver0.remove((java.lang.Object) boolean32);
        java.lang.Object obj34 = linkedListTestDriver0.removeFirst();
        int int35 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver36 = new experiment.util.LinkedListTestDriver();
        int int37 = linkedListTestDriver36.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver38 = new experiment.util.LinkedListTestDriver();
        int int39 = linkedListTestDriver38.size();
        linkedListTestDriver36.addFirst((java.lang.Object) int39);
        boolean boolean41 = linkedListTestDriver36.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver42 = new experiment.util.LinkedListTestDriver();
        boolean boolean44 = linkedListTestDriver42.contains((java.lang.Object) 1.0f);
        boolean boolean46 = linkedListTestDriver42.equals_CUT((java.lang.Object) 1.0d);
        experiment.util.LinkedListTestDriver linkedListTestDriver47 = new experiment.util.LinkedListTestDriver();
        boolean boolean49 = linkedListTestDriver47.contains((java.lang.Object) 1.0f);
        boolean boolean51 = linkedListTestDriver47.equals_CUT((java.lang.Object) 1.0d);
        boolean boolean52 = linkedListTestDriver42.remove((java.lang.Object) linkedListTestDriver47);
        linkedListTestDriver36.addFirst((java.lang.Object) boolean52);
        experiment.util.LinkedListTestDriver linkedListTestDriver54 = new experiment.util.LinkedListTestDriver();
        boolean boolean56 = linkedListTestDriver54.contains((java.lang.Object) 1.0f);
        boolean boolean57 = linkedListTestDriver54.isEmpty();
        java.lang.Object[] objArray58 = linkedListTestDriver54.toArray();
        java.lang.Class<?> wildcardClass59 = objArray58.getClass();
        linkedListTestDriver36.addLast((java.lang.Object) wildcardClass59);
        java.lang.Object obj61 = linkedListTestDriver36.removeFirst();
        java.lang.Object obj63 = linkedListTestDriver36.remove(0);
        experiment.util.LinkedListTestDriver linkedListTestDriver64 = new experiment.util.LinkedListTestDriver();
        int int65 = linkedListTestDriver64.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver66 = new experiment.util.LinkedListTestDriver();
        int int67 = linkedListTestDriver66.size();
        linkedListTestDriver64.addFirst((java.lang.Object) int67);
        boolean boolean69 = linkedListTestDriver64.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver70 = new experiment.util.LinkedListTestDriver();
        boolean boolean72 = linkedListTestDriver70.contains((java.lang.Object) 1.0f);
        boolean boolean74 = linkedListTestDriver70.equals_CUT((java.lang.Object) 1.0d);
        boolean boolean75 = linkedListTestDriver64.contains((java.lang.Object) boolean74);
        experiment.util.Iterator iterator76 = linkedListTestDriver64.iterator();
        boolean boolean77 = linkedListTestDriver36.equals_CUT((java.lang.Object) iterator76);
        boolean boolean78 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver36);
        experiment.util.LinkedListTestDriver linkedListTestDriver79 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray80 = linkedListTestDriver79.toArray();
        linkedListTestDriver79.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver79.addLast((java.lang.Object) 100.0d);
        boolean boolean86 = linkedListTestDriver79.add((java.lang.Object) ' ');
        boolean boolean87 = linkedListTestDriver79.isEmpty();
        linkedListTestDriver0.addLast((java.lang.Object) boolean87);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(listIterator15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (byte) 10 + "'", obj22, (byte) 10);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + 0 + "'", obj34, 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray58), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray58), "[]");
        org.junit.Assert.assertNotNull(wildcardClass59);
        org.junit.Assert.assertEquals("'" + obj61 + "' != '" + false + "'", obj61, false);
        org.junit.Assert.assertEquals("'" + obj63 + "' != '" + 0 + "'", obj63, 0);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(iterator76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(objArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray80), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray80), "[]");
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test232");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        int int1 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver2 = new experiment.util.LinkedListTestDriver();
        int int3 = linkedListTestDriver2.size();
        linkedListTestDriver0.addFirst((java.lang.Object) int3);
        experiment.util.ListIterator listIterator6 = linkedListTestDriver0.listIterator(1);
        int int7 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        int int10 = linkedListTestDriver9.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        int int12 = linkedListTestDriver11.size();
        linkedListTestDriver9.addFirst((java.lang.Object) int12);
        boolean boolean14 = linkedListTestDriver9.isEmpty();
        boolean boolean16 = linkedListTestDriver9.equals_CUT((java.lang.Object) 10.0d);
        java.lang.Object obj17 = linkedListTestDriver9.removeFirst();
        linkedListTestDriver0.add((int) (short) 1, obj17);
        experiment.util.LinkedListTestDriver linkedListTestDriver19 = new experiment.util.LinkedListTestDriver();
        boolean boolean21 = linkedListTestDriver19.contains((java.lang.Object) 1.0f);
        boolean boolean23 = linkedListTestDriver19.remove((java.lang.Object) 1.0f);
        int int24 = linkedListTestDriver19.size();
        boolean boolean25 = linkedListTestDriver0.equals_CUT((java.lang.Object) int24);
        experiment.util.LinkedListTestDriver linkedListTestDriver26 = new experiment.util.LinkedListTestDriver();
        int int27 = linkedListTestDriver26.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver28 = new experiment.util.LinkedListTestDriver();
        int int29 = linkedListTestDriver28.size();
        linkedListTestDriver26.addFirst((java.lang.Object) int29);
        boolean boolean31 = linkedListTestDriver26.isEmpty();
        boolean boolean33 = linkedListTestDriver26.equals_CUT((java.lang.Object) 10.0d);
        java.lang.Object obj34 = linkedListTestDriver26.getFirst();
        java.lang.Object obj35 = linkedListTestDriver26.getFirst();
        java.lang.Object obj36 = linkedListTestDriver26.getLast();
        boolean boolean37 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver26);
        experiment.util.Iterator iterator38 = linkedListTestDriver26.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver39 = new experiment.util.LinkedListTestDriver();
        int int40 = linkedListTestDriver39.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver41 = new experiment.util.LinkedListTestDriver();
        int int42 = linkedListTestDriver41.size();
        linkedListTestDriver39.addFirst((java.lang.Object) int42);
        boolean boolean44 = linkedListTestDriver39.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver45 = new experiment.util.LinkedListTestDriver();
        boolean boolean47 = linkedListTestDriver45.contains((java.lang.Object) 1.0f);
        boolean boolean49 = linkedListTestDriver45.equals_CUT((java.lang.Object) 1.0d);
        experiment.util.LinkedListTestDriver linkedListTestDriver50 = new experiment.util.LinkedListTestDriver();
        boolean boolean52 = linkedListTestDriver50.contains((java.lang.Object) 1.0f);
        boolean boolean54 = linkedListTestDriver50.equals_CUT((java.lang.Object) 1.0d);
        boolean boolean55 = linkedListTestDriver45.remove((java.lang.Object) linkedListTestDriver50);
        linkedListTestDriver39.addFirst((java.lang.Object) boolean55);
        experiment.util.LinkedListTestDriver linkedListTestDriver57 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray58 = linkedListTestDriver57.toArray();
        linkedListTestDriver57.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj62 = linkedListTestDriver57.remove((int) (short) 0);
        linkedListTestDriver57.clear();
        int int64 = linkedListTestDriver57.size();
        experiment.util.Iterator iterator65 = linkedListTestDriver57.iterator();
        java.lang.Object[] objArray66 = linkedListTestDriver57.toArray();
        linkedListTestDriver57.addFirst((java.lang.Object) '#');
        linkedListTestDriver39.addLast((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver70 = new experiment.util.LinkedListTestDriver();
        boolean boolean72 = linkedListTestDriver70.contains((java.lang.Object) 1.0f);
        boolean boolean74 = linkedListTestDriver70.equals_CUT((java.lang.Object) 1.0d);
        linkedListTestDriver70.addFirst((java.lang.Object) 0.0f);
        linkedListTestDriver39.addFirst((java.lang.Object) 0.0f);
        java.lang.Object obj78 = linkedListTestDriver39.removeFirst();
        boolean boolean79 = linkedListTestDriver26.remove(obj78);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(listIterator6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 0 + "'", obj17, 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + 0 + "'", obj34, 0);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 0 + "'", obj35, 0);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + 0 + "'", obj36, 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(iterator38);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray58), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray58), "[]");
        org.junit.Assert.assertEquals("'" + obj62 + "' != '" + (byte) 10 + "'", obj62, (byte) 10);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertNotNull(iterator65);
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray66), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray66), "[]");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertEquals("'" + obj78 + "' != '" + 0.0f + "'", obj78, 0.0f);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test233");
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
        experiment.util.LinkedListTestDriver linkedListTestDriver18 = new experiment.util.LinkedListTestDriver();
        boolean boolean20 = linkedListTestDriver18.contains((java.lang.Object) 1.0f);
        boolean boolean21 = linkedListTestDriver18.isEmpty();
        java.lang.Object[] objArray22 = linkedListTestDriver18.toArray();
        java.lang.Class<?> wildcardClass23 = objArray22.getClass();
        linkedListTestDriver0.addLast((java.lang.Object) wildcardClass23);
        java.lang.Object obj25 = linkedListTestDriver0.removeFirst();
        java.lang.Object obj27 = linkedListTestDriver0.remove(0);
        java.lang.Object obj28 = linkedListTestDriver0.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver29 = new experiment.util.LinkedListTestDriver();
        int int30 = linkedListTestDriver29.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver31 = new experiment.util.LinkedListTestDriver();
        int int32 = linkedListTestDriver31.size();
        linkedListTestDriver29.addFirst((java.lang.Object) int32);
        boolean boolean34 = linkedListTestDriver29.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver35 = new experiment.util.LinkedListTestDriver();
        boolean boolean37 = linkedListTestDriver35.contains((java.lang.Object) 1.0f);
        boolean boolean39 = linkedListTestDriver35.equals_CUT((java.lang.Object) 1.0d);
        experiment.util.LinkedListTestDriver linkedListTestDriver40 = new experiment.util.LinkedListTestDriver();
        boolean boolean42 = linkedListTestDriver40.contains((java.lang.Object) 1.0f);
        boolean boolean44 = linkedListTestDriver40.equals_CUT((java.lang.Object) 1.0d);
        boolean boolean45 = linkedListTestDriver35.remove((java.lang.Object) linkedListTestDriver40);
        linkedListTestDriver29.addFirst((java.lang.Object) boolean45);
        boolean boolean47 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver29);
        experiment.util.LinkedListTestDriver linkedListTestDriver48 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray49 = linkedListTestDriver48.toArray();
        linkedListTestDriver48.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver48.addLast((java.lang.Object) 100.0d);
        linkedListTestDriver48.clear();
        int int55 = linkedListTestDriver48.size();
        experiment.util.Iterator iterator56 = linkedListTestDriver48.iterator();
        boolean boolean57 = linkedListTestDriver0.contains((java.lang.Object) iterator56);
        boolean boolean59 = linkedListTestDriver0.remove((java.lang.Object) (-1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + false + "'", obj25, false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 0 + "'", obj27, 0);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertEquals(obj28.toString(), "class [Ljava.lang.Object;");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj28), "class [Ljava.lang.Object;");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj28), "class [Ljava.lang.Object;");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray49), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray49), "[]");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(iterator56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test234");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        int int1 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver2 = new experiment.util.LinkedListTestDriver();
        int int3 = linkedListTestDriver2.size();
        linkedListTestDriver0.addFirst((java.lang.Object) int3);
        experiment.util.ListIterator listIterator6 = linkedListTestDriver0.listIterator(1);
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        boolean boolean10 = linkedListTestDriver8.contains((java.lang.Object) 1.0f);
        boolean boolean12 = linkedListTestDriver8.equals_CUT((java.lang.Object) 1.0d);
        boolean boolean14 = linkedListTestDriver8.remove((java.lang.Object) '4');
        linkedListTestDriver0.add(1, (java.lang.Object) '4');
        java.lang.Object[] objArray16 = linkedListTestDriver0.toArray();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(listIterator6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[0, 4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[0, 4]");
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test235");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        int int1 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver2 = new experiment.util.LinkedListTestDriver();
        int int3 = linkedListTestDriver2.size();
        linkedListTestDriver0.addFirst((java.lang.Object) int3);
        boolean boolean5 = linkedListTestDriver0.isEmpty();
        boolean boolean7 = linkedListTestDriver0.equals_CUT((java.lang.Object) 10.0d);
        experiment.util.Iterator iterator8 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        int int10 = linkedListTestDriver9.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        int int12 = linkedListTestDriver11.size();
        linkedListTestDriver9.addFirst((java.lang.Object) int12);
        experiment.util.ListIterator listIterator15 = linkedListTestDriver9.listIterator(1);
        boolean boolean16 = linkedListTestDriver0.add((java.lang.Object) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        int int18 = linkedListTestDriver17.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver19 = new experiment.util.LinkedListTestDriver();
        int int20 = linkedListTestDriver19.size();
        linkedListTestDriver17.addFirst((java.lang.Object) int20);
        boolean boolean22 = linkedListTestDriver17.isEmpty();
        boolean boolean24 = linkedListTestDriver17.equals_CUT((java.lang.Object) 10.0d);
        experiment.util.Iterator iterator25 = linkedListTestDriver17.iterator();
        linkedListTestDriver0.addFirst((java.lang.Object) iterator25);
        boolean boolean27 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver28 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray29 = linkedListTestDriver28.toArray();
        linkedListTestDriver28.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj33 = linkedListTestDriver28.remove((int) (short) 0);
        linkedListTestDriver28.clear();
        int int35 = linkedListTestDriver28.size();
        experiment.util.Iterator iterator36 = linkedListTestDriver28.iterator();
        java.lang.Object[] objArray37 = linkedListTestDriver28.toArray();
        linkedListTestDriver28.addFirst((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver41 = new experiment.util.LinkedListTestDriver();
        int int42 = linkedListTestDriver41.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver43 = new experiment.util.LinkedListTestDriver();
        int int44 = linkedListTestDriver43.size();
        linkedListTestDriver41.addFirst((java.lang.Object) int44);
        boolean boolean46 = linkedListTestDriver41.isEmpty();
        boolean boolean48 = linkedListTestDriver41.equals_CUT((java.lang.Object) 10.0d);
        java.lang.Object obj49 = linkedListTestDriver41.removeFirst();
        linkedListTestDriver28.add(1, (java.lang.Object) linkedListTestDriver41);
        java.lang.Object[] objArray51 = linkedListTestDriver41.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver52 = new experiment.util.LinkedListTestDriver();
        boolean boolean54 = linkedListTestDriver52.contains((java.lang.Object) 1.0f);
        boolean boolean56 = linkedListTestDriver52.equals_CUT((java.lang.Object) 1.0d);
        experiment.util.LinkedListTestDriver linkedListTestDriver57 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray58 = linkedListTestDriver57.toArray();
        linkedListTestDriver57.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj62 = linkedListTestDriver57.remove((int) (short) 0);
        java.lang.Class<?> wildcardClass63 = linkedListTestDriver57.getClass();
        linkedListTestDriver52.addLast((java.lang.Object) linkedListTestDriver57);
        linkedListTestDriver52.addFirst((java.lang.Object) 1.0d);
        boolean boolean68 = linkedListTestDriver52.remove((java.lang.Object) (short) 10);
        java.lang.Object[] objArray69 = linkedListTestDriver52.toArray();
        experiment.util.Iterator iterator70 = linkedListTestDriver52.iterator();
        boolean boolean71 = linkedListTestDriver41.equals_CUT((java.lang.Object) linkedListTestDriver52);
        boolean boolean72 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver52);
        java.lang.Object obj73 = linkedListTestDriver0.removeFirst();
        experiment.util.ListIterator listIterator75 = linkedListTestDriver0.listIterator((int) (short) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver76 = new experiment.util.LinkedListTestDriver();
        boolean boolean78 = linkedListTestDriver76.contains((java.lang.Object) 1.0f);
        boolean boolean80 = linkedListTestDriver76.equals_CUT((java.lang.Object) 1.0d);
        experiment.util.LinkedListTestDriver linkedListTestDriver81 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray82 = linkedListTestDriver81.toArray();
        linkedListTestDriver81.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj86 = linkedListTestDriver81.remove((int) (short) 0);
        java.lang.Class<?> wildcardClass87 = linkedListTestDriver81.getClass();
        linkedListTestDriver76.addLast((java.lang.Object) linkedListTestDriver81);
        linkedListTestDriver76.addFirst((java.lang.Object) 1.0d);
        boolean boolean92 = linkedListTestDriver76.remove((java.lang.Object) (short) 10);
        java.lang.Object[] objArray93 = linkedListTestDriver76.toArray();
        experiment.util.Iterator iterator94 = linkedListTestDriver76.iterator();
        boolean boolean95 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver76);
        boolean boolean96 = linkedListTestDriver0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(listIterator15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(iterator25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[]");
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + (byte) 10 + "'", obj33, (byte) 10);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(iterator36);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[]");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + 0 + "'", obj49, 0);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray51), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray51), "[]");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray58), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray58), "[]");
        org.junit.Assert.assertEquals("'" + obj62 + "' != '" + (byte) 10 + "'", obj62, (byte) 10);
        org.junit.Assert.assertNotNull(wildcardClass63);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertNotNull(iterator70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(obj73);
        org.junit.Assert.assertNotNull(listIterator75);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(objArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray82), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray82), "[]");
        org.junit.Assert.assertEquals("'" + obj86 + "' != '" + (byte) 10 + "'", obj86, (byte) 10);
        org.junit.Assert.assertNotNull(wildcardClass87);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertNotNull(objArray93);
        org.junit.Assert.assertNotNull(iterator94);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test236");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray1 = linkedListTestDriver0.toArray();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj5 = linkedListTestDriver0.remove((int) (short) 0);
        int int6 = linkedListTestDriver0.size();
        java.lang.Object[] objArray7 = linkedListTestDriver0.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        int int9 = linkedListTestDriver8.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        int int11 = linkedListTestDriver10.size();
        linkedListTestDriver8.addFirst((java.lang.Object) int11);
        boolean boolean13 = linkedListTestDriver8.isEmpty();
        boolean boolean15 = linkedListTestDriver8.remove((java.lang.Object) 10);
        linkedListTestDriver0.addFirst((java.lang.Object) 10);
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray18 = linkedListTestDriver17.toArray();
        linkedListTestDriver17.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj22 = linkedListTestDriver17.remove((int) (short) 0);
        int int23 = linkedListTestDriver17.size();
        java.lang.Object[] objArray24 = linkedListTestDriver17.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver25 = new experiment.util.LinkedListTestDriver();
        int int26 = linkedListTestDriver25.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver27 = new experiment.util.LinkedListTestDriver();
        int int28 = linkedListTestDriver27.size();
        linkedListTestDriver25.addFirst((java.lang.Object) int28);
        boolean boolean30 = linkedListTestDriver25.isEmpty();
        boolean boolean32 = linkedListTestDriver25.remove((java.lang.Object) 10);
        linkedListTestDriver17.addFirst((java.lang.Object) 10);
        boolean boolean34 = linkedListTestDriver0.contains((java.lang.Object) 10);
        experiment.util.LinkedListTestDriver linkedListTestDriver35 = new experiment.util.LinkedListTestDriver();
        int int36 = linkedListTestDriver35.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver37 = new experiment.util.LinkedListTestDriver();
        int int38 = linkedListTestDriver37.size();
        linkedListTestDriver35.addFirst((java.lang.Object) int38);
        boolean boolean40 = linkedListTestDriver35.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver41 = new experiment.util.LinkedListTestDriver();
        boolean boolean43 = linkedListTestDriver41.contains((java.lang.Object) 1.0f);
        boolean boolean45 = linkedListTestDriver41.equals_CUT((java.lang.Object) 1.0d);
        experiment.util.LinkedListTestDriver linkedListTestDriver46 = new experiment.util.LinkedListTestDriver();
        boolean boolean48 = linkedListTestDriver46.contains((java.lang.Object) 1.0f);
        boolean boolean50 = linkedListTestDriver46.equals_CUT((java.lang.Object) 1.0d);
        boolean boolean51 = linkedListTestDriver41.remove((java.lang.Object) linkedListTestDriver46);
        linkedListTestDriver35.addFirst((java.lang.Object) boolean51);
        experiment.util.LinkedListTestDriver linkedListTestDriver53 = new experiment.util.LinkedListTestDriver();
        boolean boolean55 = linkedListTestDriver53.contains((java.lang.Object) 1.0f);
        boolean boolean56 = linkedListTestDriver53.isEmpty();
        java.lang.Object[] objArray57 = linkedListTestDriver53.toArray();
        java.lang.Class<?> wildcardClass58 = objArray57.getClass();
        linkedListTestDriver35.addLast((java.lang.Object) wildcardClass58);
        java.lang.Object obj60 = linkedListTestDriver35.removeFirst();
        java.lang.Object obj62 = linkedListTestDriver35.remove(0);
        java.lang.Object obj63 = linkedListTestDriver35.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver64 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray65 = linkedListTestDriver64.toArray();
        linkedListTestDriver64.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj69 = linkedListTestDriver64.remove((int) (short) 0);
        linkedListTestDriver64.clear();
        int int71 = linkedListTestDriver64.size();
        experiment.util.Iterator iterator72 = linkedListTestDriver64.iterator();
        java.lang.Object[] objArray73 = linkedListTestDriver64.toArray();
        linkedListTestDriver64.addFirst((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver77 = new experiment.util.LinkedListTestDriver();
        int int78 = linkedListTestDriver77.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver79 = new experiment.util.LinkedListTestDriver();
        int int80 = linkedListTestDriver79.size();
        linkedListTestDriver77.addFirst((java.lang.Object) int80);
        boolean boolean82 = linkedListTestDriver77.isEmpty();
        boolean boolean84 = linkedListTestDriver77.equals_CUT((java.lang.Object) 10.0d);
        java.lang.Object obj85 = linkedListTestDriver77.removeFirst();
        linkedListTestDriver64.add(1, (java.lang.Object) linkedListTestDriver77);
        linkedListTestDriver35.addLast((java.lang.Object) linkedListTestDriver64);
        experiment.util.Iterator iterator88 = linkedListTestDriver35.iterator();
        boolean boolean89 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver35);
        int int90 = linkedListTestDriver0.size();
        linkedListTestDriver0.clear();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) 10 + "'", obj5, (byte) 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (byte) 10 + "'", obj22, (byte) 10);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray57), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray57), "[]");
        org.junit.Assert.assertNotNull(wildcardClass58);
        org.junit.Assert.assertEquals("'" + obj60 + "' != '" + false + "'", obj60, false);
        org.junit.Assert.assertEquals("'" + obj62 + "' != '" + 0 + "'", obj62, 0);
        org.junit.Assert.assertNotNull(obj63);
        org.junit.Assert.assertEquals(obj63.toString(), "class [Ljava.lang.Object;");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj63), "class [Ljava.lang.Object;");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj63), "class [Ljava.lang.Object;");
        org.junit.Assert.assertNotNull(objArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray65), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray65), "[]");
        org.junit.Assert.assertEquals("'" + obj69 + "' != '" + (byte) 10 + "'", obj69, (byte) 10);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertNotNull(iterator72);
        org.junit.Assert.assertNotNull(objArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray73), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray73), "[]");
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertEquals("'" + obj85 + "' != '" + 0 + "'", obj85, 0);
        org.junit.Assert.assertNotNull(iterator88);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 1 + "'", int90 == 1);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test237");
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
        experiment.util.LinkedListTestDriver linkedListTestDriver18 = new experiment.util.LinkedListTestDriver();
        boolean boolean20 = linkedListTestDriver18.contains((java.lang.Object) 1.0f);
        boolean boolean21 = linkedListTestDriver18.isEmpty();
        java.lang.Object[] objArray22 = linkedListTestDriver18.toArray();
        java.lang.Class<?> wildcardClass23 = objArray22.getClass();
        linkedListTestDriver0.addLast((java.lang.Object) wildcardClass23);
        java.lang.Object obj25 = linkedListTestDriver0.removeFirst();
        java.lang.Object obj27 = linkedListTestDriver0.remove(0);
        java.lang.Object obj28 = linkedListTestDriver0.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver29 = new experiment.util.LinkedListTestDriver();
        int int30 = linkedListTestDriver29.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver31 = new experiment.util.LinkedListTestDriver();
        int int32 = linkedListTestDriver31.size();
        linkedListTestDriver29.addFirst((java.lang.Object) int32);
        boolean boolean34 = linkedListTestDriver29.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver35 = new experiment.util.LinkedListTestDriver();
        boolean boolean37 = linkedListTestDriver35.contains((java.lang.Object) 1.0f);
        boolean boolean39 = linkedListTestDriver35.equals_CUT((java.lang.Object) 1.0d);
        experiment.util.LinkedListTestDriver linkedListTestDriver40 = new experiment.util.LinkedListTestDriver();
        boolean boolean42 = linkedListTestDriver40.contains((java.lang.Object) 1.0f);
        boolean boolean44 = linkedListTestDriver40.equals_CUT((java.lang.Object) 1.0d);
        boolean boolean45 = linkedListTestDriver35.remove((java.lang.Object) linkedListTestDriver40);
        linkedListTestDriver29.addFirst((java.lang.Object) boolean45);
        boolean boolean47 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver29);
        experiment.util.LinkedListTestDriver linkedListTestDriver48 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray49 = linkedListTestDriver48.toArray();
        linkedListTestDriver48.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver48.addLast((java.lang.Object) 100.0d);
        linkedListTestDriver48.clear();
        int int55 = linkedListTestDriver48.size();
        experiment.util.Iterator iterator56 = linkedListTestDriver48.iterator();
        boolean boolean57 = linkedListTestDriver0.contains((java.lang.Object) iterator56);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj59 = linkedListTestDriver0.get(3);
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + false + "'", obj25, false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 0 + "'", obj27, 0);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertEquals(obj28.toString(), "class [Ljava.lang.Object;");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj28), "class [Ljava.lang.Object;");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj28), "class [Ljava.lang.Object;");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray49), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray49), "[]");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(iterator56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test238");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray1 = linkedListTestDriver0.toArray();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj5 = linkedListTestDriver0.remove((int) (short) 0);
        linkedListTestDriver0.clear();
        int int7 = linkedListTestDriver0.size();
        experiment.util.Iterator iterator8 = linkedListTestDriver0.iterator();
        java.lang.Object[] objArray9 = linkedListTestDriver0.toArray();
        linkedListTestDriver0.addFirst((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        int int14 = linkedListTestDriver13.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver15 = new experiment.util.LinkedListTestDriver();
        int int16 = linkedListTestDriver15.size();
        linkedListTestDriver13.addFirst((java.lang.Object) int16);
        boolean boolean18 = linkedListTestDriver13.isEmpty();
        boolean boolean20 = linkedListTestDriver13.equals_CUT((java.lang.Object) 10.0d);
        java.lang.Object obj21 = linkedListTestDriver13.removeFirst();
        linkedListTestDriver0.add(1, (java.lang.Object) linkedListTestDriver13);
        linkedListTestDriver13.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver24 = new experiment.util.LinkedListTestDriver();
        boolean boolean26 = linkedListTestDriver24.contains((java.lang.Object) 1.0f);
        boolean boolean27 = linkedListTestDriver24.isEmpty();
        java.lang.Object[] objArray28 = linkedListTestDriver24.toArray();
        boolean boolean29 = linkedListTestDriver13.add((java.lang.Object) objArray28);
        experiment.util.LinkedListTestDriver linkedListTestDriver31 = new experiment.util.LinkedListTestDriver();
        boolean boolean33 = linkedListTestDriver31.contains((java.lang.Object) 1.0f);
        boolean boolean35 = linkedListTestDriver31.equals_CUT((java.lang.Object) 1.0d);
        boolean boolean37 = linkedListTestDriver31.remove((java.lang.Object) '4');
        experiment.util.LinkedListTestDriver linkedListTestDriver38 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray39 = linkedListTestDriver38.toArray();
        linkedListTestDriver38.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver38.addLast((java.lang.Object) 100.0d);
        java.lang.Object obj44 = linkedListTestDriver38.removeLast();
        boolean boolean45 = linkedListTestDriver31.contains(obj44);
        linkedListTestDriver31.addFirst((java.lang.Object) (byte) 100);
        java.lang.Object[] objArray48 = linkedListTestDriver31.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver49 = new experiment.util.LinkedListTestDriver();
        boolean boolean51 = linkedListTestDriver49.contains((java.lang.Object) 1.0f);
        boolean boolean53 = linkedListTestDriver49.equals_CUT((java.lang.Object) 1.0d);
        experiment.util.LinkedListTestDriver linkedListTestDriver54 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray55 = linkedListTestDriver54.toArray();
        linkedListTestDriver54.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj59 = linkedListTestDriver54.remove((int) (short) 0);
        java.lang.Class<?> wildcardClass60 = linkedListTestDriver54.getClass();
        linkedListTestDriver49.addLast((java.lang.Object) linkedListTestDriver54);
        linkedListTestDriver49.addFirst((java.lang.Object) 1.0d);
        boolean boolean65 = linkedListTestDriver49.remove((java.lang.Object) (short) 10);
        boolean boolean67 = linkedListTestDriver49.remove((java.lang.Object) (short) 100);
        java.lang.Object obj68 = linkedListTestDriver49.getLast();
        experiment.util.Iterator iterator69 = linkedListTestDriver49.iterator();
        boolean boolean70 = linkedListTestDriver31.add((java.lang.Object) linkedListTestDriver49);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj71 = linkedListTestDriver13.set((int) ' ', (java.lang.Object) linkedListTestDriver49);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) 10 + "'", obj5, (byte) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 0 + "'", obj21, 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[]");
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + 100.0d + "'", obj44, 100.0d);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray48), "[100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray48), "[100]");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray55), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray55), "[]");
        org.junit.Assert.assertEquals("'" + obj59 + "' != '" + (byte) 10 + "'", obj59, (byte) 10);
        org.junit.Assert.assertNotNull(wildcardClass60);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(obj68);
        org.junit.Assert.assertNotNull(iterator69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test239");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        int int1 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver2 = new experiment.util.LinkedListTestDriver();
        int int3 = linkedListTestDriver2.size();
        linkedListTestDriver0.addFirst((java.lang.Object) int3);
        boolean boolean5 = linkedListTestDriver0.isEmpty();
        boolean boolean7 = linkedListTestDriver0.equals_CUT((java.lang.Object) 10.0d);
        experiment.util.Iterator iterator8 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        int int10 = linkedListTestDriver9.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        int int12 = linkedListTestDriver11.size();
        linkedListTestDriver9.addFirst((java.lang.Object) int12);
        experiment.util.ListIterator listIterator15 = linkedListTestDriver9.listIterator(1);
        boolean boolean16 = linkedListTestDriver0.add((java.lang.Object) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray18 = linkedListTestDriver17.toArray();
        linkedListTestDriver17.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj22 = linkedListTestDriver17.remove((int) (short) 0);
        int int23 = linkedListTestDriver17.size();
        java.lang.Object[] objArray24 = linkedListTestDriver17.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver25 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray26 = linkedListTestDriver25.toArray();
        linkedListTestDriver25.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver25.addLast((java.lang.Object) 100.0d);
        linkedListTestDriver25.clear();
        boolean boolean32 = linkedListTestDriver17.contains((java.lang.Object) linkedListTestDriver25);
        boolean boolean33 = linkedListTestDriver0.remove((java.lang.Object) boolean32);
        java.lang.Object obj34 = linkedListTestDriver0.removeFirst();
        int int35 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver36 = new experiment.util.LinkedListTestDriver();
        int int37 = linkedListTestDriver36.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver38 = new experiment.util.LinkedListTestDriver();
        int int39 = linkedListTestDriver38.size();
        linkedListTestDriver36.addFirst((java.lang.Object) int39);
        boolean boolean41 = linkedListTestDriver36.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver42 = new experiment.util.LinkedListTestDriver();
        boolean boolean44 = linkedListTestDriver42.contains((java.lang.Object) 1.0f);
        boolean boolean46 = linkedListTestDriver42.equals_CUT((java.lang.Object) 1.0d);
        experiment.util.LinkedListTestDriver linkedListTestDriver47 = new experiment.util.LinkedListTestDriver();
        boolean boolean49 = linkedListTestDriver47.contains((java.lang.Object) 1.0f);
        boolean boolean51 = linkedListTestDriver47.equals_CUT((java.lang.Object) 1.0d);
        boolean boolean52 = linkedListTestDriver42.remove((java.lang.Object) linkedListTestDriver47);
        linkedListTestDriver36.addFirst((java.lang.Object) boolean52);
        experiment.util.LinkedListTestDriver linkedListTestDriver54 = new experiment.util.LinkedListTestDriver();
        boolean boolean56 = linkedListTestDriver54.contains((java.lang.Object) 1.0f);
        boolean boolean57 = linkedListTestDriver54.isEmpty();
        java.lang.Object[] objArray58 = linkedListTestDriver54.toArray();
        java.lang.Class<?> wildcardClass59 = objArray58.getClass();
        linkedListTestDriver36.addLast((java.lang.Object) wildcardClass59);
        java.lang.Object obj61 = linkedListTestDriver36.removeFirst();
        java.lang.Object obj63 = linkedListTestDriver36.remove(0);
        experiment.util.LinkedListTestDriver linkedListTestDriver64 = new experiment.util.LinkedListTestDriver();
        int int65 = linkedListTestDriver64.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver66 = new experiment.util.LinkedListTestDriver();
        int int67 = linkedListTestDriver66.size();
        linkedListTestDriver64.addFirst((java.lang.Object) int67);
        boolean boolean69 = linkedListTestDriver64.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver70 = new experiment.util.LinkedListTestDriver();
        boolean boolean72 = linkedListTestDriver70.contains((java.lang.Object) 1.0f);
        boolean boolean74 = linkedListTestDriver70.equals_CUT((java.lang.Object) 1.0d);
        boolean boolean75 = linkedListTestDriver64.contains((java.lang.Object) boolean74);
        experiment.util.Iterator iterator76 = linkedListTestDriver64.iterator();
        boolean boolean77 = linkedListTestDriver36.equals_CUT((java.lang.Object) iterator76);
        boolean boolean78 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver36);
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator80 = linkedListTestDriver0.listIterator((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 52; size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(listIterator15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (byte) 10 + "'", obj22, (byte) 10);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + 0 + "'", obj34, 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray58), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray58), "[]");
        org.junit.Assert.assertNotNull(wildcardClass59);
        org.junit.Assert.assertEquals("'" + obj61 + "' != '" + false + "'", obj61, false);
        org.junit.Assert.assertEquals("'" + obj63 + "' != '" + 0 + "'", obj63, 0);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(iterator76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test240");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        int int1 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver2 = new experiment.util.LinkedListTestDriver();
        int int3 = linkedListTestDriver2.size();
        linkedListTestDriver0.addFirst((java.lang.Object) int3);
        boolean boolean5 = linkedListTestDriver0.isEmpty();
        boolean boolean7 = linkedListTestDriver0.equals_CUT((java.lang.Object) 10.0d);
        experiment.util.Iterator iterator8 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        int int10 = linkedListTestDriver9.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        int int12 = linkedListTestDriver11.size();
        linkedListTestDriver9.addFirst((java.lang.Object) int12);
        experiment.util.ListIterator listIterator15 = linkedListTestDriver9.listIterator(1);
        boolean boolean16 = linkedListTestDriver0.add((java.lang.Object) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        boolean boolean19 = linkedListTestDriver17.contains((java.lang.Object) 1.0f);
        boolean boolean21 = linkedListTestDriver17.equals_CUT((java.lang.Object) 1.0d);
        linkedListTestDriver17.addFirst((java.lang.Object) 0.0f);
        linkedListTestDriver0.addFirst((java.lang.Object) 0.0f);
        java.lang.Object obj25 = linkedListTestDriver0.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver27 = new experiment.util.LinkedListTestDriver();
        boolean boolean29 = linkedListTestDriver27.contains((java.lang.Object) 1.0f);
        boolean boolean31 = linkedListTestDriver27.equals_CUT((java.lang.Object) 1.0d);
        linkedListTestDriver27.addFirst((java.lang.Object) 0.0f);
        linkedListTestDriver0.add(0, (java.lang.Object) linkedListTestDriver27);
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator36 = linkedListTestDriver0.listIterator(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 10; size: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(listIterator15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 1 + "'", obj25, 1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test241");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) 1.0f);
        boolean boolean3 = linkedListTestDriver0.isEmpty();
        boolean boolean4 = linkedListTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = linkedListTestDriver0.remove((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test242");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray1 = linkedListTestDriver0.toArray();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj5 = linkedListTestDriver0.remove((int) (short) 0);
        linkedListTestDriver0.clear();
        int int7 = linkedListTestDriver0.size();
        experiment.util.Iterator iterator8 = linkedListTestDriver0.iterator();
        java.lang.Object[] objArray9 = linkedListTestDriver0.toArray();
        linkedListTestDriver0.addFirst((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        int int14 = linkedListTestDriver13.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver15 = new experiment.util.LinkedListTestDriver();
        int int16 = linkedListTestDriver15.size();
        linkedListTestDriver13.addFirst((java.lang.Object) int16);
        boolean boolean18 = linkedListTestDriver13.isEmpty();
        boolean boolean20 = linkedListTestDriver13.equals_CUT((java.lang.Object) 10.0d);
        java.lang.Object obj21 = linkedListTestDriver13.removeFirst();
        linkedListTestDriver0.add(1, (java.lang.Object) linkedListTestDriver13);
        java.lang.Object[] objArray23 = linkedListTestDriver13.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver24 = new experiment.util.LinkedListTestDriver();
        boolean boolean26 = linkedListTestDriver24.contains((java.lang.Object) 1.0f);
        boolean boolean28 = linkedListTestDriver24.equals_CUT((java.lang.Object) 1.0d);
        experiment.util.LinkedListTestDriver linkedListTestDriver29 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray30 = linkedListTestDriver29.toArray();
        linkedListTestDriver29.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj34 = linkedListTestDriver29.remove((int) (short) 0);
        java.lang.Class<?> wildcardClass35 = linkedListTestDriver29.getClass();
        linkedListTestDriver24.addLast((java.lang.Object) linkedListTestDriver29);
        linkedListTestDriver24.addFirst((java.lang.Object) 1.0d);
        boolean boolean40 = linkedListTestDriver24.remove((java.lang.Object) (short) 10);
        java.lang.Object[] objArray41 = linkedListTestDriver24.toArray();
        experiment.util.Iterator iterator42 = linkedListTestDriver24.iterator();
        boolean boolean43 = linkedListTestDriver13.equals_CUT((java.lang.Object) linkedListTestDriver24);
        experiment.util.LinkedListTestDriver linkedListTestDriver45 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray46 = linkedListTestDriver45.toArray();
        linkedListTestDriver45.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver45.addLast((java.lang.Object) 100.0d);
        linkedListTestDriver45.clear();
        java.lang.Object obj52 = linkedListTestDriver24.set(0, (java.lang.Object) linkedListTestDriver45);
        experiment.util.LinkedListTestDriver linkedListTestDriver53 = new experiment.util.LinkedListTestDriver();
        boolean boolean55 = linkedListTestDriver53.contains((java.lang.Object) 1.0f);
        boolean boolean56 = linkedListTestDriver53.isEmpty();
        boolean boolean57 = linkedListTestDriver53.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver58 = new experiment.util.LinkedListTestDriver();
        int int59 = linkedListTestDriver58.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver60 = new experiment.util.LinkedListTestDriver();
        int int61 = linkedListTestDriver60.size();
        linkedListTestDriver58.addFirst((java.lang.Object) int61);
        boolean boolean63 = linkedListTestDriver58.isEmpty();
        boolean boolean65 = linkedListTestDriver58.equals_CUT((java.lang.Object) 10.0d);
        java.lang.Object obj66 = linkedListTestDriver58.getFirst();
        java.lang.Object obj67 = linkedListTestDriver58.removeLast();
        int int68 = linkedListTestDriver58.size();
        boolean boolean69 = linkedListTestDriver53.add((java.lang.Object) int68);
        boolean boolean70 = linkedListTestDriver45.equals_CUT((java.lang.Object) boolean69);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) 10 + "'", obj5, (byte) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 0 + "'", obj21, 0);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[]");
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + (byte) 10 + "'", obj34, (byte) 10);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(iterator42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray46), "[]");
        org.junit.Assert.assertEquals("'" + obj52 + "' != '" + 1.0d + "'", obj52, 1.0d);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertEquals("'" + obj66 + "' != '" + 0 + "'", obj66, 0);
        org.junit.Assert.assertEquals("'" + obj67 + "' != '" + 0 + "'", obj67, 0);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test243");
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
        experiment.util.LinkedListTestDriver linkedListTestDriver18 = new experiment.util.LinkedListTestDriver();
        boolean boolean20 = linkedListTestDriver18.contains((java.lang.Object) 1.0f);
        boolean boolean21 = linkedListTestDriver18.isEmpty();
        java.lang.Object[] objArray22 = linkedListTestDriver18.toArray();
        java.lang.Class<?> wildcardClass23 = objArray22.getClass();
        linkedListTestDriver0.addLast((java.lang.Object) wildcardClass23);
        java.lang.Object obj25 = linkedListTestDriver0.removeFirst();
        java.lang.Object obj27 = linkedListTestDriver0.remove(0);
        java.lang.Object obj28 = linkedListTestDriver0.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver29 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray30 = linkedListTestDriver29.toArray();
        linkedListTestDriver29.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj34 = linkedListTestDriver29.remove((int) (short) 0);
        linkedListTestDriver29.clear();
        int int36 = linkedListTestDriver29.size();
        experiment.util.Iterator iterator37 = linkedListTestDriver29.iterator();
        java.lang.Object[] objArray38 = linkedListTestDriver29.toArray();
        linkedListTestDriver29.addFirst((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver42 = new experiment.util.LinkedListTestDriver();
        int int43 = linkedListTestDriver42.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver44 = new experiment.util.LinkedListTestDriver();
        int int45 = linkedListTestDriver44.size();
        linkedListTestDriver42.addFirst((java.lang.Object) int45);
        boolean boolean47 = linkedListTestDriver42.isEmpty();
        boolean boolean49 = linkedListTestDriver42.equals_CUT((java.lang.Object) 10.0d);
        java.lang.Object obj50 = linkedListTestDriver42.removeFirst();
        linkedListTestDriver29.add(1, (java.lang.Object) linkedListTestDriver42);
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver29);
        java.lang.Object obj54 = linkedListTestDriver0.get((int) (byte) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver56 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray57 = linkedListTestDriver56.toArray();
        linkedListTestDriver56.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver56.addFirst((java.lang.Object) (short) -1);
        java.lang.Object obj62 = linkedListTestDriver0.set((int) (short) 0, (java.lang.Object) linkedListTestDriver56);
        java.lang.Object obj63 = linkedListTestDriver56.removeFirst();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + false + "'", obj25, false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 0 + "'", obj27, 0);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertEquals(obj28.toString(), "class [Ljava.lang.Object;");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj28), "class [Ljava.lang.Object;");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj28), "class [Ljava.lang.Object;");
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[]");
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + (byte) 10 + "'", obj34, (byte) 10);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(iterator37);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[]");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + 0 + "'", obj50, 0);
        org.junit.Assert.assertNotNull(obj54);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray57), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray57), "[]");
        org.junit.Assert.assertNotNull(obj62);
        org.junit.Assert.assertEquals(obj62.toString(), "class [Ljava.lang.Object;");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj62), "class [Ljava.lang.Object;");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj62), "class [Ljava.lang.Object;");
        org.junit.Assert.assertEquals("'" + obj63 + "' != '" + (short) -1 + "'", obj63, (short) -1);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test244");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        int int1 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver2 = new experiment.util.LinkedListTestDriver();
        int int3 = linkedListTestDriver2.size();
        linkedListTestDriver0.addFirst((java.lang.Object) int3);
        boolean boolean5 = linkedListTestDriver0.isEmpty();
        boolean boolean7 = linkedListTestDriver0.remove((java.lang.Object) 10);
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        boolean boolean11 = linkedListTestDriver9.contains((java.lang.Object) 1.0f);
        boolean boolean13 = linkedListTestDriver9.equals_CUT((java.lang.Object) 1.0d);
        experiment.util.LinkedListTestDriver linkedListTestDriver14 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray15 = linkedListTestDriver14.toArray();
        linkedListTestDriver14.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj19 = linkedListTestDriver14.remove((int) (short) 0);
        java.lang.Class<?> wildcardClass20 = linkedListTestDriver14.getClass();
        linkedListTestDriver9.addLast((java.lang.Object) linkedListTestDriver14);
        linkedListTestDriver9.addFirst((java.lang.Object) 1.0d);
        boolean boolean25 = linkedListTestDriver9.remove((java.lang.Object) (short) 10);
        boolean boolean27 = linkedListTestDriver9.remove((java.lang.Object) (short) 100);
        java.lang.Object obj28 = linkedListTestDriver9.getLast();
        linkedListTestDriver0.add(1, obj28);
        java.lang.Object obj30 = linkedListTestDriver0.getFirst();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (byte) 10 + "'", obj19, (byte) 10);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + 0 + "'", obj30, 0);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test245");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        int int1 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver2 = new experiment.util.LinkedListTestDriver();
        int int3 = linkedListTestDriver2.size();
        linkedListTestDriver0.addFirst((java.lang.Object) int3);
        boolean boolean5 = linkedListTestDriver0.isEmpty();
        boolean boolean7 = linkedListTestDriver0.equals_CUT((java.lang.Object) 10.0d);
        experiment.util.Iterator iterator8 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        int int10 = linkedListTestDriver9.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        int int12 = linkedListTestDriver11.size();
        linkedListTestDriver9.addFirst((java.lang.Object) int12);
        experiment.util.ListIterator listIterator15 = linkedListTestDriver9.listIterator(1);
        boolean boolean16 = linkedListTestDriver0.add((java.lang.Object) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        int int18 = linkedListTestDriver17.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver19 = new experiment.util.LinkedListTestDriver();
        int int20 = linkedListTestDriver19.size();
        linkedListTestDriver17.addFirst((java.lang.Object) int20);
        boolean boolean22 = linkedListTestDriver17.isEmpty();
        boolean boolean24 = linkedListTestDriver17.equals_CUT((java.lang.Object) 10.0d);
        experiment.util.Iterator iterator25 = linkedListTestDriver17.iterator();
        linkedListTestDriver0.addFirst((java.lang.Object) iterator25);
        boolean boolean27 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver28 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray29 = linkedListTestDriver28.toArray();
        linkedListTestDriver28.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj33 = linkedListTestDriver28.remove((int) (short) 0);
        linkedListTestDriver28.clear();
        int int35 = linkedListTestDriver28.size();
        experiment.util.Iterator iterator36 = linkedListTestDriver28.iterator();
        java.lang.Object[] objArray37 = linkedListTestDriver28.toArray();
        linkedListTestDriver28.addFirst((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver41 = new experiment.util.LinkedListTestDriver();
        int int42 = linkedListTestDriver41.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver43 = new experiment.util.LinkedListTestDriver();
        int int44 = linkedListTestDriver43.size();
        linkedListTestDriver41.addFirst((java.lang.Object) int44);
        boolean boolean46 = linkedListTestDriver41.isEmpty();
        boolean boolean48 = linkedListTestDriver41.equals_CUT((java.lang.Object) 10.0d);
        java.lang.Object obj49 = linkedListTestDriver41.removeFirst();
        linkedListTestDriver28.add(1, (java.lang.Object) linkedListTestDriver41);
        java.lang.Object[] objArray51 = linkedListTestDriver41.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver52 = new experiment.util.LinkedListTestDriver();
        boolean boolean54 = linkedListTestDriver52.contains((java.lang.Object) 1.0f);
        boolean boolean56 = linkedListTestDriver52.equals_CUT((java.lang.Object) 1.0d);
        experiment.util.LinkedListTestDriver linkedListTestDriver57 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray58 = linkedListTestDriver57.toArray();
        linkedListTestDriver57.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj62 = linkedListTestDriver57.remove((int) (short) 0);
        java.lang.Class<?> wildcardClass63 = linkedListTestDriver57.getClass();
        linkedListTestDriver52.addLast((java.lang.Object) linkedListTestDriver57);
        linkedListTestDriver52.addFirst((java.lang.Object) 1.0d);
        boolean boolean68 = linkedListTestDriver52.remove((java.lang.Object) (short) 10);
        java.lang.Object[] objArray69 = linkedListTestDriver52.toArray();
        experiment.util.Iterator iterator70 = linkedListTestDriver52.iterator();
        boolean boolean71 = linkedListTestDriver41.equals_CUT((java.lang.Object) linkedListTestDriver52);
        boolean boolean72 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver52);
        java.lang.Object obj73 = linkedListTestDriver0.removeFirst();
        experiment.util.ListIterator listIterator75 = linkedListTestDriver0.listIterator((int) (short) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver76 = new experiment.util.LinkedListTestDriver();
        boolean boolean78 = linkedListTestDriver76.contains((java.lang.Object) 1.0f);
        boolean boolean80 = linkedListTestDriver76.equals_CUT((java.lang.Object) 1.0d);
        experiment.util.LinkedListTestDriver linkedListTestDriver81 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray82 = linkedListTestDriver81.toArray();
        linkedListTestDriver81.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj86 = linkedListTestDriver81.remove((int) (short) 0);
        java.lang.Class<?> wildcardClass87 = linkedListTestDriver81.getClass();
        linkedListTestDriver76.addLast((java.lang.Object) linkedListTestDriver81);
        linkedListTestDriver76.addFirst((java.lang.Object) 1.0d);
        boolean boolean92 = linkedListTestDriver76.remove((java.lang.Object) (short) 10);
        java.lang.Object[] objArray93 = linkedListTestDriver76.toArray();
        experiment.util.Iterator iterator94 = linkedListTestDriver76.iterator();
        boolean boolean95 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver76);
        java.lang.Object obj96 = null;
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.addFirst(obj96);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(listIterator15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(iterator25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[]");
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + (byte) 10 + "'", obj33, (byte) 10);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(iterator36);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[]");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + 0 + "'", obj49, 0);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray51), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray51), "[]");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray58), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray58), "[]");
        org.junit.Assert.assertEquals("'" + obj62 + "' != '" + (byte) 10 + "'", obj62, (byte) 10);
        org.junit.Assert.assertNotNull(wildcardClass63);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertNotNull(iterator70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(obj73);
        org.junit.Assert.assertNotNull(listIterator75);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(objArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray82), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray82), "[]");
        org.junit.Assert.assertEquals("'" + obj86 + "' != '" + (byte) 10 + "'", obj86, (byte) 10);
        org.junit.Assert.assertNotNull(wildcardClass87);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertNotNull(objArray93);
        org.junit.Assert.assertNotNull(iterator94);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test246");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray1 = linkedListTestDriver0.toArray();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj5 = linkedListTestDriver0.remove((int) (short) 0);
        linkedListTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = linkedListTestDriver0.get(0);
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
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test247");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        int int1 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver2 = new experiment.util.LinkedListTestDriver();
        int int3 = linkedListTestDriver2.size();
        linkedListTestDriver0.addFirst((java.lang.Object) int3);
        experiment.util.ListIterator listIterator6 = linkedListTestDriver0.listIterator(1);
        int int7 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        int int10 = linkedListTestDriver9.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        int int12 = linkedListTestDriver11.size();
        linkedListTestDriver9.addFirst((java.lang.Object) int12);
        boolean boolean14 = linkedListTestDriver9.isEmpty();
        boolean boolean16 = linkedListTestDriver9.equals_CUT((java.lang.Object) 10.0d);
        java.lang.Object obj17 = linkedListTestDriver9.removeFirst();
        linkedListTestDriver0.add((int) (short) 1, obj17);
        experiment.util.LinkedListTestDriver linkedListTestDriver19 = new experiment.util.LinkedListTestDriver();
        boolean boolean21 = linkedListTestDriver19.contains((java.lang.Object) 1.0f);
        boolean boolean23 = linkedListTestDriver19.remove((java.lang.Object) 1.0f);
        int int24 = linkedListTestDriver19.size();
        boolean boolean25 = linkedListTestDriver0.equals_CUT((java.lang.Object) int24);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj27 = linkedListTestDriver0.get((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(listIterator6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 0 + "'", obj17, 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test248");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) 1.0f);
        boolean boolean4 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1.0d);
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray6 = linkedListTestDriver5.toArray();
        linkedListTestDriver5.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj10 = linkedListTestDriver5.remove((int) (short) 0);
        java.lang.Class<?> wildcardClass11 = linkedListTestDriver5.getClass();
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver5);
        linkedListTestDriver0.addFirst((java.lang.Object) 1.0d);
        linkedListTestDriver0.clear();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) 10 + "'", obj10, (byte) 10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test249");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) 1.0f);
        boolean boolean4 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1.0d);
        boolean boolean6 = linkedListTestDriver0.remove((java.lang.Object) '4');
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray8 = linkedListTestDriver7.toArray();
        linkedListTestDriver7.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver7.addLast((java.lang.Object) 100.0d);
        java.lang.Object obj13 = linkedListTestDriver7.removeLast();
        boolean boolean14 = linkedListTestDriver0.contains(obj13);
        boolean boolean15 = linkedListTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator17 = linkedListTestDriver0.listIterator((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 100; size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100.0d + "'", obj13, 100.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test250");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        int int1 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver2 = new experiment.util.LinkedListTestDriver();
        int int3 = linkedListTestDriver2.size();
        linkedListTestDriver0.addFirst((java.lang.Object) int3);
        experiment.util.Iterator iterator5 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        boolean boolean8 = linkedListTestDriver6.contains((java.lang.Object) 1.0f);
        boolean boolean10 = linkedListTestDriver6.equals_CUT((java.lang.Object) 1.0d);
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray12 = linkedListTestDriver11.toArray();
        linkedListTestDriver11.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj16 = linkedListTestDriver11.remove((int) (short) 0);
        java.lang.Class<?> wildcardClass17 = linkedListTestDriver11.getClass();
        linkedListTestDriver6.addLast((java.lang.Object) linkedListTestDriver11);
        linkedListTestDriver6.addFirst((java.lang.Object) 1.0d);
        boolean boolean22 = linkedListTestDriver6.remove((java.lang.Object) (short) 10);
        linkedListTestDriver0.addFirst((java.lang.Object) boolean22);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (byte) 10 + "'", obj16, (byte) 10);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test251");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) 1.0f);
        boolean boolean4 = linkedListTestDriver0.equals_CUT((java.lang.Object) 1.0d);
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray6 = linkedListTestDriver5.toArray();
        linkedListTestDriver5.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj10 = linkedListTestDriver5.remove((int) (short) 0);
        java.lang.Class<?> wildcardClass11 = linkedListTestDriver5.getClass();
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver5);
        linkedListTestDriver0.addFirst((java.lang.Object) 1.0d);
        boolean boolean16 = linkedListTestDriver0.remove((java.lang.Object) (short) 10);
        java.lang.Object obj18 = linkedListTestDriver0.remove(0);
        experiment.util.LinkedListTestDriver linkedListTestDriver19 = new experiment.util.LinkedListTestDriver();
        int int20 = linkedListTestDriver19.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver21 = new experiment.util.LinkedListTestDriver();
        int int22 = linkedListTestDriver21.size();
        linkedListTestDriver19.addFirst((java.lang.Object) int22);
        boolean boolean24 = linkedListTestDriver19.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver25 = new experiment.util.LinkedListTestDriver();
        boolean boolean27 = linkedListTestDriver25.contains((java.lang.Object) 1.0f);
        boolean boolean29 = linkedListTestDriver25.equals_CUT((java.lang.Object) 1.0d);
        experiment.util.LinkedListTestDriver linkedListTestDriver30 = new experiment.util.LinkedListTestDriver();
        boolean boolean32 = linkedListTestDriver30.contains((java.lang.Object) 1.0f);
        boolean boolean34 = linkedListTestDriver30.equals_CUT((java.lang.Object) 1.0d);
        boolean boolean35 = linkedListTestDriver25.remove((java.lang.Object) linkedListTestDriver30);
        linkedListTestDriver19.addFirst((java.lang.Object) boolean35);
        experiment.util.LinkedListTestDriver linkedListTestDriver37 = new experiment.util.LinkedListTestDriver();
        boolean boolean39 = linkedListTestDriver37.contains((java.lang.Object) 1.0f);
        boolean boolean40 = linkedListTestDriver37.isEmpty();
        java.lang.Object[] objArray41 = linkedListTestDriver37.toArray();
        java.lang.Class<?> wildcardClass42 = objArray41.getClass();
        linkedListTestDriver19.addLast((java.lang.Object) wildcardClass42);
        java.lang.Object obj44 = linkedListTestDriver19.removeFirst();
        java.lang.Object obj46 = linkedListTestDriver19.remove(0);
        java.lang.Object obj47 = linkedListTestDriver19.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver48 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray49 = linkedListTestDriver48.toArray();
        linkedListTestDriver48.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj53 = linkedListTestDriver48.remove((int) (short) 0);
        linkedListTestDriver48.clear();
        int int55 = linkedListTestDriver48.size();
        experiment.util.Iterator iterator56 = linkedListTestDriver48.iterator();
        java.lang.Object[] objArray57 = linkedListTestDriver48.toArray();
        linkedListTestDriver48.addFirst((java.lang.Object) '#');
        experiment.util.LinkedListTestDriver linkedListTestDriver61 = new experiment.util.LinkedListTestDriver();
        int int62 = linkedListTestDriver61.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver63 = new experiment.util.LinkedListTestDriver();
        int int64 = linkedListTestDriver63.size();
        linkedListTestDriver61.addFirst((java.lang.Object) int64);
        boolean boolean66 = linkedListTestDriver61.isEmpty();
        boolean boolean68 = linkedListTestDriver61.equals_CUT((java.lang.Object) 10.0d);
        java.lang.Object obj69 = linkedListTestDriver61.removeFirst();
        linkedListTestDriver48.add(1, (java.lang.Object) linkedListTestDriver61);
        linkedListTestDriver19.addLast((java.lang.Object) linkedListTestDriver48);
        boolean boolean72 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver19);
        java.lang.Object obj73 = linkedListTestDriver0.removeFirst();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) 10 + "'", obj10, (byte) 10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 1.0d + "'", obj18, 1.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[]");
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + false + "'", obj44, false);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + 0 + "'", obj46, 0);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertEquals(obj47.toString(), "class [Ljava.lang.Object;");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj47), "class [Ljava.lang.Object;");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj47), "class [Ljava.lang.Object;");
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray49), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray49), "[]");
        org.junit.Assert.assertEquals("'" + obj53 + "' != '" + (byte) 10 + "'", obj53, (byte) 10);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(iterator56);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray57), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray57), "[]");
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertEquals("'" + obj69 + "' != '" + 0 + "'", obj69, 0);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(obj73);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test252");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray1 = linkedListTestDriver0.toArray();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.addLast((java.lang.Object) 100.0d);
        java.lang.Object obj6 = linkedListTestDriver0.removeLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray8 = linkedListTestDriver7.toArray();
        linkedListTestDriver7.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj12 = linkedListTestDriver7.remove((int) (short) 0);
        int int13 = linkedListTestDriver7.size();
        java.lang.Object[] objArray14 = linkedListTestDriver7.toArray();
        boolean boolean15 = linkedListTestDriver0.add((java.lang.Object) objArray14);
        experiment.util.LinkedListTestDriver linkedListTestDriver16 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray17 = linkedListTestDriver16.toArray();
        linkedListTestDriver16.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj21 = linkedListTestDriver16.remove((int) (short) 0);
        linkedListTestDriver16.clear();
        linkedListTestDriver16.clear();
        boolean boolean24 = linkedListTestDriver0.equals_CUT((java.lang.Object) linkedListTestDriver16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = linkedListTestDriver0.get((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 100.0d + "'", obj6, 100.0d);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) 10 + "'", obj12, (byte) 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (byte) 10 + "'", obj21, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test253");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        int int1 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver2 = new experiment.util.LinkedListTestDriver();
        int int3 = linkedListTestDriver2.size();
        linkedListTestDriver0.addFirst((java.lang.Object) int3);
        boolean boolean5 = linkedListTestDriver0.isEmpty();
        boolean boolean7 = linkedListTestDriver0.equals_CUT((java.lang.Object) 10.0d);
        experiment.util.Iterator iterator8 = linkedListTestDriver0.iterator();
        boolean boolean9 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        boolean boolean12 = linkedListTestDriver10.contains((java.lang.Object) 1.0f);
        boolean boolean14 = linkedListTestDriver10.equals_CUT((java.lang.Object) 1.0d);
        experiment.util.LinkedListTestDriver linkedListTestDriver15 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray16 = linkedListTestDriver15.toArray();
        linkedListTestDriver15.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj20 = linkedListTestDriver15.remove((int) (short) 0);
        java.lang.Class<?> wildcardClass21 = linkedListTestDriver15.getClass();
        linkedListTestDriver10.addLast((java.lang.Object) linkedListTestDriver15);
        linkedListTestDriver10.addFirst((java.lang.Object) 1.0d);
        boolean boolean26 = linkedListTestDriver10.remove((java.lang.Object) (short) 10);
        linkedListTestDriver10.addLast((java.lang.Object) (short) 1);
        boolean boolean29 = linkedListTestDriver0.add((java.lang.Object) (short) 1);
        java.lang.Object obj30 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean31 = linkedListTestDriver0.equals_CUT(obj30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (byte) 10 + "'", obj20, (byte) 10);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test254");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.contains((java.lang.Object) 1.0f);
        boolean boolean4 = linkedListTestDriver0.remove((java.lang.Object) 1.0f);
        boolean boolean5 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray7 = linkedListTestDriver6.toArray();
        linkedListTestDriver6.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver6.addLast((java.lang.Object) 100.0d);
        java.lang.Object obj12 = linkedListTestDriver6.removeLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray14 = linkedListTestDriver13.toArray();
        linkedListTestDriver13.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj18 = linkedListTestDriver13.remove((int) (short) 0);
        int int19 = linkedListTestDriver13.size();
        java.lang.Object[] objArray20 = linkedListTestDriver13.toArray();
        boolean boolean21 = linkedListTestDriver6.add((java.lang.Object) objArray20);
        experiment.util.LinkedListTestDriver linkedListTestDriver22 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray23 = linkedListTestDriver22.toArray();
        linkedListTestDriver22.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj27 = linkedListTestDriver22.remove((int) (short) 0);
        linkedListTestDriver6.addFirst((java.lang.Object) (short) 0);
        boolean boolean29 = linkedListTestDriver6.isEmpty();
        java.lang.Object obj30 = linkedListTestDriver6.removeLast();
        java.lang.Object[] objArray31 = linkedListTestDriver6.toArray();
        boolean boolean32 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver6);
        experiment.util.LinkedListTestDriver linkedListTestDriver33 = new experiment.util.LinkedListTestDriver();
        int int34 = linkedListTestDriver33.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver35 = new experiment.util.LinkedListTestDriver();
        int int36 = linkedListTestDriver35.size();
        linkedListTestDriver33.addFirst((java.lang.Object) int36);
        experiment.util.Iterator iterator38 = linkedListTestDriver33.iterator();
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver33);
        experiment.util.LinkedListTestDriver linkedListTestDriver40 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray41 = linkedListTestDriver40.toArray();
        java.lang.Class<?> wildcardClass42 = objArray41.getClass();
        boolean boolean43 = linkedListTestDriver33.contains((java.lang.Object) wildcardClass42);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0d + "'", obj12, 100.0d);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (byte) 10 + "'", obj18, (byte) 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + (byte) 10 + "'", obj27, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[0, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[0, 10]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(iterator38);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[]");
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test255");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray1 = linkedListTestDriver0.toArray();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        boolean boolean6 = linkedListTestDriver4.contains((java.lang.Object) 1.0f);
        boolean boolean7 = linkedListTestDriver4.isEmpty();
        java.lang.Object[] objArray8 = linkedListTestDriver4.toArray();
        boolean boolean9 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver4);
        java.lang.Class<?> wildcardClass10 = linkedListTestDriver4.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_54676380_1024_0.test256");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        int int1 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver2 = new experiment.util.LinkedListTestDriver();
        int int3 = linkedListTestDriver2.size();
        linkedListTestDriver0.addFirst((java.lang.Object) int3);
        experiment.util.ListIterator listIterator6 = linkedListTestDriver0.listIterator(1);
        int int7 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        int int10 = linkedListTestDriver9.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        int int12 = linkedListTestDriver11.size();
        linkedListTestDriver9.addFirst((java.lang.Object) int12);
        boolean boolean14 = linkedListTestDriver9.isEmpty();
        boolean boolean16 = linkedListTestDriver9.equals_CUT((java.lang.Object) 10.0d);
        java.lang.Object obj17 = linkedListTestDriver9.removeFirst();
        linkedListTestDriver0.add((int) (short) 1, obj17);
        experiment.util.LinkedListTestDriver linkedListTestDriver19 = new experiment.util.LinkedListTestDriver();
        boolean boolean21 = linkedListTestDriver19.contains((java.lang.Object) 1.0f);
        boolean boolean23 = linkedListTestDriver19.remove((java.lang.Object) 1.0f);
        int int24 = linkedListTestDriver19.size();
        boolean boolean25 = linkedListTestDriver0.equals_CUT((java.lang.Object) int24);
        experiment.util.LinkedListTestDriver linkedListTestDriver26 = new experiment.util.LinkedListTestDriver();
        int int27 = linkedListTestDriver26.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver28 = new experiment.util.LinkedListTestDriver();
        int int29 = linkedListTestDriver28.size();
        linkedListTestDriver26.addFirst((java.lang.Object) int29);
        boolean boolean31 = linkedListTestDriver26.isEmpty();
        boolean boolean33 = linkedListTestDriver26.equals_CUT((java.lang.Object) 10.0d);
        java.lang.Object obj34 = linkedListTestDriver26.getFirst();
        java.lang.Object obj35 = linkedListTestDriver26.getFirst();
        java.lang.Object obj36 = linkedListTestDriver26.getLast();
        boolean boolean37 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver26);
        experiment.util.LinkedListTestDriver linkedListTestDriver38 = new experiment.util.LinkedListTestDriver();
        int int39 = linkedListTestDriver38.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver40 = new experiment.util.LinkedListTestDriver();
        int int41 = linkedListTestDriver40.size();
        linkedListTestDriver38.addFirst((java.lang.Object) int41);
        experiment.util.ListIterator listIterator44 = linkedListTestDriver38.listIterator(1);
        boolean boolean45 = linkedListTestDriver0.equals_CUT((java.lang.Object) linkedListTestDriver38);
        boolean boolean47 = linkedListTestDriver0.remove((java.lang.Object) (byte) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(listIterator6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 0 + "'", obj17, 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + 0 + "'", obj34, 0);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 0 + "'", obj35, 0);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + 0 + "'", obj36, 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(listIterator44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

}
