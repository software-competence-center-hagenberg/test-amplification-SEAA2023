package experiment.util.test;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Regression_LinkedListTest_1264048269_256_s {

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
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test001");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = linkedListTestDriver0.remove((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test002");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.add((int) (short) 100, (java.lang.Object) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 100; size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test003");
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
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test004");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj3 = linkedListTestDriver0.getFirst();
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.add((int) '#', (java.lang.Object) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 35; size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 10 + "'", obj3, (byte) 10);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test005");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = linkedListTestDriver0.set(10, (java.lang.Object) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test006");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = linkedListTestDriver0.get(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test007");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = linkedListTestDriver0.get((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test008");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj3 = linkedListTestDriver0.removeFirst();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator5 = linkedListTestDriver0.listIterator((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: -1; size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 10 + "'", obj3, (byte) 10);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test009");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.addLast((java.lang.Object) 1.0f);
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver6.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver6.clear();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = linkedListTestDriver6.getLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test010");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.addLast((java.lang.Object) 1.0f);
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver7.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver7.clear();
        linkedListTestDriver7.addLast((java.lang.Object) 1.0f);
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver13.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver13.clear();
        linkedListTestDriver7.addFirst((java.lang.Object) linkedListTestDriver13);
        java.lang.Class<?> wildcardClass18 = linkedListTestDriver7.getClass();
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.add((-1), (java.lang.Object) wildcardClass18);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: -1; size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test011");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.addLast((java.lang.Object) 1.0f);
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver6.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver6.clear();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = linkedListTestDriver6.removeFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test012");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.add(10, (java.lang.Object) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 10; size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test013");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.add((int) (short) -1, (java.lang.Object) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: -1; size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test014");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj3 = linkedListTestDriver0.getFirst();
        boolean boolean4 = linkedListTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = linkedListTestDriver0.remove((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 10 + "'", obj3, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test015");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.clear();
        java.lang.Object obj4 = null;
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.addLast(obj4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test016");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj3 = linkedListTestDriver0.getFirst();
        java.lang.Object obj5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = linkedListTestDriver0.set((int) (short) 0, obj5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 10 + "'", obj3, (byte) 10);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test017");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj3 = linkedListTestDriver0.removeLast();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = linkedListTestDriver0.remove((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 10 + "'", obj3, (byte) 10);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test018");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.addLast((java.lang.Object) 1.0f);
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver6.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver6.clear();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver6);
        java.lang.Object obj11 = linkedListTestDriver0.getFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver13.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj16 = linkedListTestDriver13.removeLast();
        experiment.util.Iterator iterator17 = linkedListTestDriver13.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = linkedListTestDriver0.set((int) ' ', (java.lang.Object) iterator17);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (byte) 10 + "'", obj16, (byte) 10);
        org.junit.Assert.assertNotNull(iterator17);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test019");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = linkedListTestDriver0.set((int) (short) -1, (java.lang.Object) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test020");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.addLast((java.lang.Object) 1.0f);
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver6.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver6.clear();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = linkedListTestDriver6.remove((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test021");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj3 = linkedListTestDriver0.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver4.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver4.clear();
        linkedListTestDriver4.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj10 = linkedListTestDriver4.getLast();
        linkedListTestDriver4.clear();
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver4);
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator14 = linkedListTestDriver4.listIterator((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 97; size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 10 + "'", obj3, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 1.0f + "'", obj10, 1.0f);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test022");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.clear();
        boolean boolean3 = linkedListTestDriver0.contains((java.lang.Object) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator5 = linkedListTestDriver0.listIterator(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 10; size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test023");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj3 = linkedListTestDriver0.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver4.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver4.clear();
        linkedListTestDriver4.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj10 = linkedListTestDriver4.getLast();
        linkedListTestDriver4.clear();
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = linkedListTestDriver4.removeLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 10 + "'", obj3, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 1.0f + "'", obj10, 1.0f);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test024");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj3 = linkedListTestDriver0.removeLast();
        experiment.util.Iterator iterator4 = linkedListTestDriver0.iterator();
        linkedListTestDriver0.clear();
        experiment.util.Iterator iterator6 = linkedListTestDriver0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator8 = linkedListTestDriver0.listIterator((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 10; size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 10 + "'", obj3, (byte) 10);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertNotNull(iterator6);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test025");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj3 = linkedListTestDriver0.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver4.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver4.clear();
        linkedListTestDriver4.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj10 = linkedListTestDriver4.getLast();
        linkedListTestDriver4.clear();
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = linkedListTestDriver4.remove(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 10 + "'", obj3, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 1.0f + "'", obj10, 1.0f);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test026");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj3 = linkedListTestDriver0.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver4.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver4.clear();
        linkedListTestDriver4.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj10 = linkedListTestDriver4.getLast();
        linkedListTestDriver4.clear();
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver4);
        experiment.util.LinkedListTestDriver linkedListTestDriver14 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver14.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver14.clear();
        linkedListTestDriver14.addLast((java.lang.Object) 1.0f);
        experiment.util.LinkedListTestDriver linkedListTestDriver20 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver20.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver20.clear();
        linkedListTestDriver14.addFirst((java.lang.Object) linkedListTestDriver20);
        experiment.util.LinkedListTestDriver linkedListTestDriver25 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver25.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj28 = linkedListTestDriver25.removeLast();
        experiment.util.Iterator iterator29 = linkedListTestDriver25.iterator();
        linkedListTestDriver25.clear();
        experiment.util.Iterator iterator31 = linkedListTestDriver25.iterator();
        boolean boolean32 = linkedListTestDriver20.remove((java.lang.Object) iterator31);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj33 = linkedListTestDriver4.set((int) '#', (java.lang.Object) boolean32);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 10 + "'", obj3, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 1.0f + "'", obj10, 1.0f);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + (byte) 10 + "'", obj28, (byte) 10);
        org.junit.Assert.assertNotNull(iterator29);
        org.junit.Assert.assertNotNull(iterator31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test027");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj6 = linkedListTestDriver0.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver7.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver7.addFirst((java.lang.Object) 10);
        boolean boolean12 = linkedListTestDriver0.contains((java.lang.Object) 10);
        java.lang.Object obj13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = linkedListTestDriver0.remove(obj13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0f + "'", obj6, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test028");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj6 = linkedListTestDriver0.getLast();
        linkedListTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = linkedListTestDriver0.removeLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0f + "'", obj6, 1.0f);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test029");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj7 = linkedListTestDriver0.remove(0);
        boolean boolean9 = linkedListTestDriver0.remove((java.lang.Object) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = linkedListTestDriver0.get((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1.0f + "'", obj7, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test030");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.addLast((java.lang.Object) 1.0f);
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver6.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver6.clear();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver6);
        java.lang.Object obj11 = linkedListTestDriver0.getFirst();
        java.lang.Class<?> wildcardClass12 = obj11.getClass();
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test031");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj3 = linkedListTestDriver0.removeLast();
        experiment.util.Iterator iterator4 = linkedListTestDriver0.iterator();
        linkedListTestDriver0.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver7.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj10 = linkedListTestDriver7.getFirst();
        boolean boolean12 = linkedListTestDriver7.remove((java.lang.Object) 1);
        java.lang.Class<?> wildcardClass13 = linkedListTestDriver7.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = linkedListTestDriver0.set(0, (java.lang.Object) wildcardClass13);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 10 + "'", obj3, (byte) 10);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) 10 + "'", obj10, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test032");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = linkedListTestDriver0.get(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test033");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj7 = linkedListTestDriver0.remove(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = linkedListTestDriver0.removeLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1.0f + "'", obj7, 1.0f);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test034");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.addLast((java.lang.Object) 1.0f);
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver6.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver6.clear();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver6);
        java.lang.Object obj11 = linkedListTestDriver0.getFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver13.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver13.clear();
        linkedListTestDriver13.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj20 = linkedListTestDriver13.remove(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = linkedListTestDriver0.set((int) (byte) 100, (java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 1.0f + "'", obj20, 1.0f);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test035");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj3 = linkedListTestDriver0.getFirst();
        boolean boolean5 = linkedListTestDriver0.remove((java.lang.Object) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver6.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver6.clear();
        linkedListTestDriver6.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj12 = linkedListTestDriver6.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver13.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver13.addFirst((java.lang.Object) 10);
        boolean boolean18 = linkedListTestDriver6.contains((java.lang.Object) 10);
        linkedListTestDriver0.addLast((java.lang.Object) 10);
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator21 = linkedListTestDriver0.listIterator((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: -1; size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 10 + "'", obj3, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 1.0f + "'", obj12, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test036");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.addLast((java.lang.Object) 1.0f);
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver6.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver6.clear();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver6);
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver11.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj14 = linkedListTestDriver11.removeLast();
        experiment.util.Iterator iterator15 = linkedListTestDriver11.iterator();
        linkedListTestDriver11.clear();
        experiment.util.Iterator iterator17 = linkedListTestDriver11.iterator();
        boolean boolean18 = linkedListTestDriver6.remove((java.lang.Object) iterator17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = linkedListTestDriver6.removeFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (byte) 10 + "'", obj14, (byte) 10);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test037");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj6 = linkedListTestDriver0.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver7.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj10 = linkedListTestDriver7.getFirst();
        boolean boolean12 = linkedListTestDriver7.remove((java.lang.Object) 1);
        boolean boolean13 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver7);
        experiment.util.LinkedListTestDriver linkedListTestDriver15 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver15.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver15.clear();
        linkedListTestDriver15.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj21 = linkedListTestDriver15.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver22 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver22.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver22.addFirst((java.lang.Object) 10);
        boolean boolean27 = linkedListTestDriver15.contains((java.lang.Object) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj28 = linkedListTestDriver0.set(1, (java.lang.Object) linkedListTestDriver15);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0f + "'", obj6, 1.0f);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) 10 + "'", obj10, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 1.0f + "'", obj21, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test038");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj7 = linkedListTestDriver0.remove(0);
        boolean boolean9 = linkedListTestDriver0.remove((java.lang.Object) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = linkedListTestDriver0.getLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1.0f + "'", obj7, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test039");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj7 = linkedListTestDriver0.remove(0);
        boolean boolean9 = linkedListTestDriver0.remove((java.lang.Object) (short) 100);
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver10.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver10.clear();
        linkedListTestDriver10.addLast((java.lang.Object) 1.0f);
        experiment.util.LinkedListTestDriver linkedListTestDriver16 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver16.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver16.clear();
        linkedListTestDriver10.addFirst((java.lang.Object) linkedListTestDriver16);
        java.lang.Object obj21 = linkedListTestDriver10.getFirst();
        boolean boolean22 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = linkedListTestDriver0.remove((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1.0f + "'", obj7, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test040");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj3 = linkedListTestDriver0.removeLast();
        experiment.util.Iterator iterator4 = linkedListTestDriver0.iterator();
        boolean boolean6 = linkedListTestDriver0.contains((java.lang.Object) 10.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = linkedListTestDriver0.getLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 10 + "'", obj3, (byte) 10);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test041");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj3 = linkedListTestDriver0.removeLast();
        experiment.util.Iterator iterator4 = linkedListTestDriver0.iterator();
        boolean boolean6 = linkedListTestDriver0.contains((java.lang.Object) 10.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = linkedListTestDriver0.remove((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 10 + "'", obj3, (byte) 10);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test042");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj6 = linkedListTestDriver0.getLast();
        linkedListTestDriver0.clear();
        linkedListTestDriver0.addFirst((java.lang.Object) 100.0f);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0f + "'", obj6, 1.0f);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test043");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj3 = linkedListTestDriver0.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver4.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver4.clear();
        linkedListTestDriver4.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj10 = linkedListTestDriver4.getLast();
        linkedListTestDriver4.clear();
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver4);
        experiment.util.LinkedListTestDriver linkedListTestDriver14 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver14.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj17 = linkedListTestDriver14.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver18 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver18.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver18.clear();
        linkedListTestDriver18.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj24 = linkedListTestDriver18.getLast();
        linkedListTestDriver18.clear();
        linkedListTestDriver14.addLast((java.lang.Object) linkedListTestDriver18);
        boolean boolean28 = linkedListTestDriver14.add((java.lang.Object) 0L);
        java.lang.Object obj29 = linkedListTestDriver14.getFirst();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj30 = linkedListTestDriver0.set((int) (short) -1, (java.lang.Object) linkedListTestDriver14);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 10 + "'", obj3, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 1.0f + "'", obj10, 1.0f);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) 10 + "'", obj17, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 1.0f + "'", obj24, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(obj29);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test044");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj3 = linkedListTestDriver0.removeFirst();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = linkedListTestDriver0.removeFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 10 + "'", obj3, (byte) 10);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test045");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.addLast((java.lang.Object) 1.0f);
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver6.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver6.clear();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver6);
        java.lang.Object obj13 = linkedListTestDriver0.set((int) (byte) 1, (java.lang.Object) 100.0d);
        java.lang.Object obj15 = null;
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.add((int) (short) 10, obj15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 1.0f + "'", obj13, 1.0f);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test046");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj3 = linkedListTestDriver0.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver4.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver4.clear();
        linkedListTestDriver4.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj10 = linkedListTestDriver4.getLast();
        linkedListTestDriver4.clear();
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver4);
        boolean boolean14 = linkedListTestDriver0.add((java.lang.Object) 0L);
        experiment.util.Iterator iterator15 = linkedListTestDriver0.iterator();
        java.lang.Object obj16 = linkedListTestDriver0.removeLast();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator18 = linkedListTestDriver0.listIterator((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: -1; size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 10 + "'", obj3, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 1.0f + "'", obj10, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0L + "'", obj16, 0L);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test047");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj7 = linkedListTestDriver0.remove(0);
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator9 = linkedListTestDriver0.listIterator(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 2; size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1.0f + "'", obj7, 1.0f);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test048");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj6 = linkedListTestDriver0.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver7.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver7.addFirst((java.lang.Object) 10);
        boolean boolean12 = linkedListTestDriver0.contains((java.lang.Object) 10);
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.add((int) '4', (java.lang.Object) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 52; size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0f + "'", obj6, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test049");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj6 = linkedListTestDriver0.getLast();
        java.lang.Object obj7 = linkedListTestDriver0.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver8.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj11 = linkedListTestDriver8.removeFirst();
        boolean boolean12 = linkedListTestDriver0.equals_CUT((java.lang.Object) linkedListTestDriver8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = linkedListTestDriver0.remove((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0f + "'", obj6, 1.0f);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1.0f + "'", obj7, 1.0f);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 10 + "'", obj11, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test050");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj6 = linkedListTestDriver0.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver7.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver7.addFirst((java.lang.Object) 10);
        boolean boolean12 = linkedListTestDriver0.contains((java.lang.Object) 10);
        java.lang.Object obj13 = linkedListTestDriver0.getLast();
        java.lang.Object obj14 = linkedListTestDriver0.removeFirst();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = linkedListTestDriver0.removeFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0f + "'", obj6, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 1.0f + "'", obj13, 1.0f);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 1.0f + "'", obj14, 1.0f);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test051");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.addLast((java.lang.Object) 1.0f);
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver6.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver6.clear();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = linkedListTestDriver6.set((int) (byte) 10, (java.lang.Object) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test052");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj1 = linkedListTestDriver0.getFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test053");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj3 = linkedListTestDriver0.removeLast();
        experiment.util.Iterator iterator4 = linkedListTestDriver0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = linkedListTestDriver0.removeFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 10 + "'", obj3, (byte) 10);
        org.junit.Assert.assertNotNull(iterator4);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test054");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj6 = linkedListTestDriver0.getLast();
        experiment.util.Iterator iterator7 = linkedListTestDriver0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = linkedListTestDriver0.set(1, (java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0f + "'", obj6, 1.0f);
        org.junit.Assert.assertNotNull(iterator7);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test055");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj6 = linkedListTestDriver0.getLast();
        experiment.util.Iterator iterator7 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver8.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj11 = linkedListTestDriver8.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver12.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver12.clear();
        linkedListTestDriver12.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj18 = linkedListTestDriver12.getLast();
        linkedListTestDriver12.clear();
        linkedListTestDriver8.addLast((java.lang.Object) linkedListTestDriver12);
        boolean boolean21 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver8);
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator23 = linkedListTestDriver0.listIterator((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 100; size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0f + "'", obj6, 1.0f);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 10 + "'", obj11, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 1.0f + "'", obj18, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test056");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj3 = linkedListTestDriver0.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver4.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver4.clear();
        linkedListTestDriver4.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj10 = linkedListTestDriver4.getLast();
        linkedListTestDriver4.clear();
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = linkedListTestDriver4.getLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 10 + "'", obj3, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 1.0f + "'", obj10, 1.0f);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test057");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = linkedListTestDriver0.get(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test058");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj3 = linkedListTestDriver0.getFirst();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator5 = linkedListTestDriver0.listIterator((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: -1; size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 10 + "'", obj3, (byte) 10);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test059");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj6 = linkedListTestDriver0.getLast();
        experiment.util.Iterator iterator7 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver8.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj11 = linkedListTestDriver8.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver12.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver12.clear();
        linkedListTestDriver12.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj18 = linkedListTestDriver12.getLast();
        linkedListTestDriver12.clear();
        linkedListTestDriver8.addLast((java.lang.Object) linkedListTestDriver12);
        boolean boolean21 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver8);
        experiment.util.LinkedListTestDriver linkedListTestDriver22 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver22.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver22.clear();
        linkedListTestDriver22.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj28 = linkedListTestDriver22.getLast();
        experiment.util.Iterator iterator29 = linkedListTestDriver22.iterator();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver22);
        experiment.util.ListIterator listIterator32 = linkedListTestDriver22.listIterator((int) (byte) 0);
        experiment.util.LinkedListTestDriver linkedListTestDriver34 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver34.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj37 = linkedListTestDriver34.removeLast();
        experiment.util.Iterator iterator38 = linkedListTestDriver34.iterator();
        linkedListTestDriver34.clear();
        experiment.util.Iterator iterator40 = linkedListTestDriver34.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj41 = linkedListTestDriver22.set((int) (byte) 100, (java.lang.Object) linkedListTestDriver34);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0f + "'", obj6, 1.0f);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 10 + "'", obj11, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 1.0f + "'", obj18, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + 1.0f + "'", obj28, 1.0f);
        org.junit.Assert.assertNotNull(iterator29);
        org.junit.Assert.assertNotNull(listIterator32);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + (byte) 10 + "'", obj37, (byte) 10);
        org.junit.Assert.assertNotNull(iterator38);
        org.junit.Assert.assertNotNull(iterator40);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test060");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver6.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj9 = linkedListTestDriver6.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver10.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver10.clear();
        linkedListTestDriver10.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj16 = linkedListTestDriver10.getLast();
        linkedListTestDriver10.clear();
        linkedListTestDriver6.addLast((java.lang.Object) linkedListTestDriver10);
        boolean boolean20 = linkedListTestDriver6.add((java.lang.Object) 0L);
        experiment.util.Iterator iterator21 = linkedListTestDriver6.iterator();
        java.lang.Object obj22 = linkedListTestDriver6.removeLast();
        java.lang.Object obj23 = linkedListTestDriver6.getLast();
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.add((int) 'a', (java.lang.Object) linkedListTestDriver6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 97; size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) 10 + "'", obj9, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 1.0f + "'", obj16, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 0L + "'", obj22, 0L);
        org.junit.Assert.assertNotNull(obj23);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test061");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj6 = linkedListTestDriver0.getLast();
        experiment.util.Iterator iterator7 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver8.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj11 = linkedListTestDriver8.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver12.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver12.clear();
        linkedListTestDriver12.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj18 = linkedListTestDriver12.getLast();
        linkedListTestDriver12.clear();
        linkedListTestDriver8.addLast((java.lang.Object) linkedListTestDriver12);
        boolean boolean21 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver8);
        experiment.util.LinkedListTestDriver linkedListTestDriver22 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver22.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver22.clear();
        linkedListTestDriver22.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj28 = linkedListTestDriver22.getLast();
        experiment.util.Iterator iterator29 = linkedListTestDriver22.iterator();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver22);
        experiment.util.ListIterator listIterator32 = linkedListTestDriver22.listIterator((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj34 = linkedListTestDriver22.remove((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0f + "'", obj6, 1.0f);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 10 + "'", obj11, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 1.0f + "'", obj18, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + 1.0f + "'", obj28, 1.0f);
        org.junit.Assert.assertNotNull(iterator29);
        org.junit.Assert.assertNotNull(listIterator32);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test062");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj3 = linkedListTestDriver0.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver4.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver4.clear();
        linkedListTestDriver4.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj10 = linkedListTestDriver4.getLast();
        linkedListTestDriver4.clear();
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver4);
        boolean boolean14 = linkedListTestDriver0.add((java.lang.Object) 0L);
        experiment.util.Iterator iterator15 = linkedListTestDriver0.iterator();
        java.lang.Object obj16 = linkedListTestDriver0.removeLast();
        boolean boolean17 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver18 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver18.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver18.clear();
        linkedListTestDriver18.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj24 = linkedListTestDriver18.getLast();
        linkedListTestDriver18.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver26 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver26.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj29 = linkedListTestDriver26.getFirst();
        boolean boolean31 = linkedListTestDriver26.remove((java.lang.Object) 1);
        boolean boolean32 = linkedListTestDriver18.remove((java.lang.Object) 1);
        boolean boolean33 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver18);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj35 = linkedListTestDriver0.get((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 10 + "'", obj3, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 1.0f + "'", obj10, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0L + "'", obj16, 0L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 1.0f + "'", obj24, 1.0f);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + (byte) 10 + "'", obj29, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test063");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj3 = linkedListTestDriver0.getFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver4.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver4.clear();
        linkedListTestDriver4.addLast((java.lang.Object) 1.0f);
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver10.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver10.clear();
        linkedListTestDriver4.addFirst((java.lang.Object) linkedListTestDriver10);
        int int15 = linkedListTestDriver4.size();
        linkedListTestDriver0.addFirst((java.lang.Object) int15);
        experiment.util.LinkedListTestDriver linkedListTestDriver18 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver18.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj21 = linkedListTestDriver18.removeLast();
        experiment.util.Iterator iterator22 = linkedListTestDriver18.iterator();
        linkedListTestDriver18.clear();
        experiment.util.Iterator iterator24 = linkedListTestDriver18.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = linkedListTestDriver0.set((int) '4', (java.lang.Object) linkedListTestDriver18);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 10 + "'", obj3, (byte) 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (byte) 10 + "'", obj21, (byte) 10);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertNotNull(iterator24);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test064");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj6 = linkedListTestDriver0.getLast();
        experiment.util.Iterator iterator7 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver8.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj11 = linkedListTestDriver8.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver12.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver12.clear();
        linkedListTestDriver12.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj18 = linkedListTestDriver12.getLast();
        linkedListTestDriver12.clear();
        linkedListTestDriver8.addLast((java.lang.Object) linkedListTestDriver12);
        boolean boolean21 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver8);
        experiment.util.ListIterator listIterator23 = linkedListTestDriver0.listIterator((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator25 = linkedListTestDriver0.listIterator((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 52; size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0f + "'", obj6, 1.0f);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 10 + "'", obj11, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 1.0f + "'", obj18, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(listIterator23);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test065");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj3 = linkedListTestDriver0.removeLast();
        experiment.util.Iterator iterator4 = linkedListTestDriver0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = linkedListTestDriver0.getFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 10 + "'", obj3, (byte) 10);
        org.junit.Assert.assertNotNull(iterator4);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test066");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj7 = linkedListTestDriver0.remove(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = linkedListTestDriver0.getFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1.0f + "'", obj7, 1.0f);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test067");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj3 = linkedListTestDriver0.removeLast();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 10 + "'", obj3, (byte) 10);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test068");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj6 = linkedListTestDriver0.getLast();
        experiment.util.Iterator iterator7 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver8.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj11 = linkedListTestDriver8.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver12.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver12.clear();
        linkedListTestDriver12.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj18 = linkedListTestDriver12.getLast();
        linkedListTestDriver12.clear();
        linkedListTestDriver8.addLast((java.lang.Object) linkedListTestDriver12);
        boolean boolean21 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver8);
        experiment.util.LinkedListTestDriver linkedListTestDriver22 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver22.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj25 = linkedListTestDriver22.removeLast();
        experiment.util.Iterator iterator26 = linkedListTestDriver22.iterator();
        linkedListTestDriver22.clear();
        experiment.util.Iterator iterator28 = linkedListTestDriver22.iterator();
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver22);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj30 = linkedListTestDriver22.getFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0f + "'", obj6, 1.0f);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 10 + "'", obj11, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 1.0f + "'", obj18, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (byte) 10 + "'", obj25, (byte) 10);
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertNotNull(iterator28);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test069");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj6 = linkedListTestDriver0.getLast();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = linkedListTestDriver0.get((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0f + "'", obj6, 1.0f);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test070");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj6 = linkedListTestDriver0.getLast();
        java.lang.Object obj7 = linkedListTestDriver0.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver8.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj11 = linkedListTestDriver8.removeFirst();
        boolean boolean12 = linkedListTestDriver0.equals_CUT((java.lang.Object) linkedListTestDriver8);
        java.lang.Object obj13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = linkedListTestDriver8.contains(obj13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0f + "'", obj6, 1.0f);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1.0f + "'", obj7, 1.0f);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 10 + "'", obj11, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test071");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj3 = linkedListTestDriver0.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver4.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver4.clear();
        linkedListTestDriver4.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj10 = linkedListTestDriver4.getLast();
        linkedListTestDriver4.clear();
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver4);
        boolean boolean14 = linkedListTestDriver0.add((java.lang.Object) 0L);
        experiment.util.Iterator iterator15 = linkedListTestDriver0.iterator();
        java.lang.Object obj16 = linkedListTestDriver0.removeLast();
        boolean boolean17 = linkedListTestDriver0.isEmpty();
        linkedListTestDriver0.clear();
        java.lang.Object obj19 = null;
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.addLast(obj19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 10 + "'", obj3, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 1.0f + "'", obj10, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0L + "'", obj16, 0L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test072");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj6 = linkedListTestDriver0.getLast();
        experiment.util.Iterator iterator7 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver8.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj11 = linkedListTestDriver8.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver12.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver12.clear();
        linkedListTestDriver12.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj18 = linkedListTestDriver12.getLast();
        linkedListTestDriver12.clear();
        linkedListTestDriver8.addLast((java.lang.Object) linkedListTestDriver12);
        boolean boolean21 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver8);
        experiment.util.LinkedListTestDriver linkedListTestDriver22 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver22.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj25 = linkedListTestDriver22.removeLast();
        experiment.util.Iterator iterator26 = linkedListTestDriver22.iterator();
        linkedListTestDriver22.clear();
        experiment.util.Iterator iterator28 = linkedListTestDriver22.iterator();
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver22);
        int int30 = linkedListTestDriver0.size();
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0f + "'", obj6, 1.0f);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 10 + "'", obj11, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 1.0f + "'", obj18, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (byte) 10 + "'", obj25, (byte) 10);
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertNotNull(iterator28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test073");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj3 = linkedListTestDriver0.getFirst();
        boolean boolean5 = linkedListTestDriver0.remove((java.lang.Object) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver6.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver6.clear();
        linkedListTestDriver6.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj12 = linkedListTestDriver6.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver13.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver13.addFirst((java.lang.Object) 10);
        boolean boolean18 = linkedListTestDriver6.contains((java.lang.Object) 10);
        linkedListTestDriver0.addLast((java.lang.Object) 10);
        experiment.util.Iterator iterator20 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver21 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver21.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver21.clear();
        linkedListTestDriver21.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj28 = linkedListTestDriver21.remove(0);
        boolean boolean30 = linkedListTestDriver21.remove((java.lang.Object) (short) 100);
        experiment.util.LinkedListTestDriver linkedListTestDriver31 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver31.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver31.clear();
        linkedListTestDriver31.addLast((java.lang.Object) 1.0f);
        experiment.util.LinkedListTestDriver linkedListTestDriver37 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver37.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver37.clear();
        linkedListTestDriver31.addFirst((java.lang.Object) linkedListTestDriver37);
        java.lang.Object obj42 = linkedListTestDriver31.getFirst();
        boolean boolean43 = linkedListTestDriver21.contains((java.lang.Object) linkedListTestDriver31);
        experiment.util.LinkedListTestDriver linkedListTestDriver44 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver44.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver44.clear();
        linkedListTestDriver44.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj51 = linkedListTestDriver44.remove(0);
        boolean boolean53 = linkedListTestDriver44.remove((java.lang.Object) (short) 100);
        experiment.util.LinkedListTestDriver linkedListTestDriver54 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver54.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver54.clear();
        linkedListTestDriver54.addLast((java.lang.Object) 1.0f);
        experiment.util.LinkedListTestDriver linkedListTestDriver60 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver60.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver60.clear();
        linkedListTestDriver54.addFirst((java.lang.Object) linkedListTestDriver60);
        java.lang.Object obj65 = linkedListTestDriver54.getFirst();
        boolean boolean66 = linkedListTestDriver44.contains((java.lang.Object) linkedListTestDriver54);
        java.lang.Object[] objArray67 = linkedListTestDriver54.toArray();
        linkedListTestDriver21.addLast((java.lang.Object) linkedListTestDriver54);
        java.lang.Object obj69 = linkedListTestDriver54.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver70 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver70.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj73 = linkedListTestDriver70.removeLast();
        experiment.util.Iterator iterator74 = linkedListTestDriver70.iterator();
        linkedListTestDriver70.clear();
        experiment.util.Iterator iterator76 = linkedListTestDriver70.iterator();
        boolean boolean77 = linkedListTestDriver54.remove((java.lang.Object) linkedListTestDriver70);
        boolean boolean78 = linkedListTestDriver0.remove((java.lang.Object) boolean77);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 10 + "'", obj3, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 1.0f + "'", obj12, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + 1.0f + "'", obj28, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + obj51 + "' != '" + 1.0f + "'", obj51, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(obj65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertNotNull(obj69);
        org.junit.Assert.assertEquals("'" + obj73 + "' != '" + (byte) 10 + "'", obj73, (byte) 10);
        org.junit.Assert.assertNotNull(iterator74);
        org.junit.Assert.assertNotNull(iterator76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test074");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver5.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj8 = linkedListTestDriver5.removeLast();
        boolean boolean9 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = linkedListTestDriver0.set((int) (byte) 100, (java.lang.Object) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) 10 + "'", obj8, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test075");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj3 = linkedListTestDriver0.getFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver4.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver4.clear();
        linkedListTestDriver4.addLast((java.lang.Object) 1.0f);
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver10.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver10.clear();
        linkedListTestDriver4.addFirst((java.lang.Object) linkedListTestDriver10);
        int int15 = linkedListTestDriver4.size();
        linkedListTestDriver0.addFirst((java.lang.Object) int15);
        linkedListTestDriver0.clear();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 10 + "'", obj3, (byte) 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test076");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj3 = linkedListTestDriver0.getFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver4.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver4.clear();
        linkedListTestDriver4.addLast((java.lang.Object) 1.0f);
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver10.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver10.clear();
        linkedListTestDriver4.addFirst((java.lang.Object) linkedListTestDriver10);
        int int15 = linkedListTestDriver4.size();
        linkedListTestDriver0.addFirst((java.lang.Object) int15);
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver17.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj20 = linkedListTestDriver17.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver21 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver21.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver21.clear();
        linkedListTestDriver21.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj27 = linkedListTestDriver21.getLast();
        linkedListTestDriver21.clear();
        linkedListTestDriver17.addLast((java.lang.Object) linkedListTestDriver21);
        boolean boolean31 = linkedListTestDriver17.add((java.lang.Object) 0L);
        experiment.util.Iterator iterator32 = linkedListTestDriver17.iterator();
        java.lang.Object obj33 = linkedListTestDriver17.removeLast();
        java.lang.Object obj34 = linkedListTestDriver17.getLast();
        java.lang.Object obj35 = linkedListTestDriver17.removeFirst();
        boolean boolean36 = linkedListTestDriver0.remove(obj35);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 10 + "'", obj3, (byte) 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (byte) 10 + "'", obj20, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 1.0f + "'", obj27, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(iterator32);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + 0L + "'", obj33, 0L);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test077");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj6 = linkedListTestDriver0.getLast();
        java.lang.Object obj7 = linkedListTestDriver0.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver8.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj11 = linkedListTestDriver8.removeFirst();
        boolean boolean12 = linkedListTestDriver0.equals_CUT((java.lang.Object) linkedListTestDriver8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = linkedListTestDriver0.get((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0f + "'", obj6, 1.0f);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1.0f + "'", obj7, 1.0f);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 10 + "'", obj11, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test078");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj7 = linkedListTestDriver0.remove(0);
        boolean boolean9 = linkedListTestDriver0.remove((java.lang.Object) (short) 100);
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver10.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver10.clear();
        linkedListTestDriver10.addLast((java.lang.Object) 1.0f);
        experiment.util.LinkedListTestDriver linkedListTestDriver16 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver16.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver16.clear();
        linkedListTestDriver10.addFirst((java.lang.Object) linkedListTestDriver16);
        java.lang.Object obj21 = linkedListTestDriver10.getFirst();
        boolean boolean22 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver10);
        experiment.util.LinkedListTestDriver linkedListTestDriver23 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver23.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver23.clear();
        linkedListTestDriver23.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj30 = linkedListTestDriver23.remove(0);
        boolean boolean32 = linkedListTestDriver23.remove((java.lang.Object) (short) 100);
        experiment.util.LinkedListTestDriver linkedListTestDriver33 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver33.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver33.clear();
        linkedListTestDriver33.addLast((java.lang.Object) 1.0f);
        experiment.util.LinkedListTestDriver linkedListTestDriver39 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver39.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver39.clear();
        linkedListTestDriver33.addFirst((java.lang.Object) linkedListTestDriver39);
        java.lang.Object obj44 = linkedListTestDriver33.getFirst();
        boolean boolean45 = linkedListTestDriver23.contains((java.lang.Object) linkedListTestDriver33);
        java.lang.Object[] objArray46 = linkedListTestDriver33.toArray();
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver33);
        java.lang.Object obj48 = linkedListTestDriver33.removeFirst();
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver33.add((-1), (java.lang.Object) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: -1; size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1.0f + "'", obj7, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + 1.0f + "'", obj30, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(obj48);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test079");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj3 = linkedListTestDriver0.removeLast();
        experiment.util.Iterator iterator4 = linkedListTestDriver0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = linkedListTestDriver0.removeLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 10 + "'", obj3, (byte) 10);
        org.junit.Assert.assertNotNull(iterator4);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test080");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj7 = linkedListTestDriver0.remove(0);
        boolean boolean9 = linkedListTestDriver0.remove((java.lang.Object) (short) 100);
        java.lang.Class<?> wildcardClass10 = linkedListTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1.0f + "'", obj7, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test081");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj3 = linkedListTestDriver0.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver4.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver4.clear();
        linkedListTestDriver4.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj10 = linkedListTestDriver4.getLast();
        linkedListTestDriver4.clear();
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver4);
        boolean boolean14 = linkedListTestDriver0.add((java.lang.Object) 0L);
        java.lang.Object obj15 = linkedListTestDriver0.getFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver17.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver17.clear();
        linkedListTestDriver17.addLast((java.lang.Object) 1.0f);
        experiment.util.LinkedListTestDriver linkedListTestDriver23 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver23.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver23.clear();
        linkedListTestDriver17.addFirst((java.lang.Object) linkedListTestDriver23);
        java.lang.Object obj28 = linkedListTestDriver17.getFirst();
        java.lang.Class<?> wildcardClass29 = linkedListTestDriver17.getClass();
        linkedListTestDriver0.add((int) (byte) 0, (java.lang.Object) wildcardClass29);
        experiment.util.LinkedListTestDriver linkedListTestDriver32 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver32.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj35 = linkedListTestDriver32.getFirst();
        boolean boolean37 = linkedListTestDriver32.remove((java.lang.Object) 1);
        java.lang.Object obj39 = linkedListTestDriver32.get((int) (short) 0);
        java.lang.Object obj40 = linkedListTestDriver32.getFirst();
        boolean boolean41 = linkedListTestDriver32.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.add(10, (java.lang.Object) boolean41);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 10; size: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 10 + "'", obj3, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 1.0f + "'", obj10, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + (byte) 10 + "'", obj35, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + (byte) 10 + "'", obj39, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + (byte) 10 + "'", obj40, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test082");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj7 = linkedListTestDriver0.remove(0);
        boolean boolean9 = linkedListTestDriver0.remove((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator10 = linkedListTestDriver0.iterator();
        int int11 = linkedListTestDriver0.size();
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1.0f + "'", obj7, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test083");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj6 = linkedListTestDriver0.getLast();
        java.lang.Object obj7 = linkedListTestDriver0.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver8.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj11 = linkedListTestDriver8.removeFirst();
        boolean boolean12 = linkedListTestDriver0.equals_CUT((java.lang.Object) linkedListTestDriver8);
        int int13 = linkedListTestDriver8.size();
        java.lang.Object obj14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = linkedListTestDriver8.remove(obj14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0f + "'", obj6, 1.0f);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1.0f + "'", obj7, 1.0f);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 10 + "'", obj11, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test084");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj7 = linkedListTestDriver0.remove(0);
        boolean boolean9 = linkedListTestDriver0.remove((java.lang.Object) (short) 100);
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver10.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver10.clear();
        linkedListTestDriver10.addLast((java.lang.Object) 1.0f);
        experiment.util.LinkedListTestDriver linkedListTestDriver16 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver16.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver16.clear();
        linkedListTestDriver10.addFirst((java.lang.Object) linkedListTestDriver16);
        java.lang.Object obj21 = linkedListTestDriver10.getFirst();
        boolean boolean22 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver10);
        java.lang.Object[] objArray23 = linkedListTestDriver10.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver24 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver24.clear();
        boolean boolean26 = linkedListTestDriver10.contains((java.lang.Object) linkedListTestDriver24);
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator28 = linkedListTestDriver10.listIterator((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 32; size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1.0f + "'", obj7, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test085");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver1 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver1.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj4 = linkedListTestDriver1.removeLast();
        experiment.util.Iterator iterator5 = linkedListTestDriver1.iterator();
        linkedListTestDriver0.addLast((java.lang.Object) iterator5);
        int int7 = linkedListTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = linkedListTestDriver0.get((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 10 + "'", obj4, (byte) 10);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test086");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj7 = linkedListTestDriver0.remove(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = linkedListTestDriver0.remove(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1.0f + "'", obj7, 1.0f);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test087");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj6 = linkedListTestDriver0.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver7.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver7.addFirst((java.lang.Object) 10);
        boolean boolean12 = linkedListTestDriver0.contains((java.lang.Object) 10);
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver14 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver14.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj17 = linkedListTestDriver14.removeLast();
        experiment.util.Iterator iterator18 = linkedListTestDriver14.iterator();
        linkedListTestDriver13.addLast((java.lang.Object) iterator18);
        boolean boolean20 = linkedListTestDriver0.remove((java.lang.Object) iterator18);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = linkedListTestDriver0.remove((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0f + "'", obj6, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) 10 + "'", obj17, (byte) 10);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test088");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj3 = linkedListTestDriver0.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver4.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver4.clear();
        linkedListTestDriver4.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj10 = linkedListTestDriver4.getLast();
        linkedListTestDriver4.clear();
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver4);
        boolean boolean14 = linkedListTestDriver0.add((java.lang.Object) 0L);
        experiment.util.Iterator iterator15 = linkedListTestDriver0.iterator();
        java.lang.Object obj16 = linkedListTestDriver0.removeLast();
        java.lang.Object obj17 = linkedListTestDriver0.getLast();
        java.lang.Object obj18 = linkedListTestDriver0.removeFirst();
        boolean boolean20 = linkedListTestDriver0.add((java.lang.Object) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = linkedListTestDriver0.set((int) (short) 1, (java.lang.Object) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 10 + "'", obj3, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 1.0f + "'", obj10, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0L + "'", obj16, 0L);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test089");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj3 = linkedListTestDriver0.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver4.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver4.clear();
        linkedListTestDriver4.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj10 = linkedListTestDriver4.getLast();
        linkedListTestDriver4.clear();
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = linkedListTestDriver4.remove(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 10 + "'", obj3, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 1.0f + "'", obj10, 1.0f);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test090");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj6 = linkedListTestDriver0.getLast();
        experiment.util.Iterator iterator7 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver8.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj11 = linkedListTestDriver8.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver12.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver12.clear();
        linkedListTestDriver12.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj18 = linkedListTestDriver12.getLast();
        linkedListTestDriver12.clear();
        linkedListTestDriver8.addLast((java.lang.Object) linkedListTestDriver12);
        boolean boolean21 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver8);
        experiment.util.LinkedListTestDriver linkedListTestDriver22 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver22.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj25 = linkedListTestDriver22.removeLast();
        experiment.util.Iterator iterator26 = linkedListTestDriver22.iterator();
        linkedListTestDriver22.clear();
        experiment.util.Iterator iterator28 = linkedListTestDriver22.iterator();
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver22);
        int int30 = linkedListTestDriver22.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj32 = linkedListTestDriver22.remove(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0f + "'", obj6, 1.0f);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 10 + "'", obj11, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 1.0f + "'", obj18, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (byte) 10 + "'", obj25, (byte) 10);
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertNotNull(iterator28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test091");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj7 = linkedListTestDriver0.remove(0);
        boolean boolean9 = linkedListTestDriver0.remove((java.lang.Object) (short) 100);
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver10.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver10.clear();
        linkedListTestDriver10.addLast((java.lang.Object) 1.0f);
        experiment.util.LinkedListTestDriver linkedListTestDriver16 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver16.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver16.clear();
        linkedListTestDriver10.addFirst((java.lang.Object) linkedListTestDriver16);
        java.lang.Object obj21 = linkedListTestDriver10.getFirst();
        boolean boolean22 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver10);
        java.lang.Object[] objArray23 = linkedListTestDriver10.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver24 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver24.clear();
        boolean boolean26 = linkedListTestDriver10.contains((java.lang.Object) linkedListTestDriver24);
        experiment.util.LinkedListTestDriver linkedListTestDriver27 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver27.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver27.clear();
        linkedListTestDriver27.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj34 = linkedListTestDriver27.remove(0);
        boolean boolean36 = linkedListTestDriver27.remove((java.lang.Object) (short) 100);
        experiment.util.LinkedListTestDriver linkedListTestDriver37 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver37.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver37.clear();
        linkedListTestDriver37.addLast((java.lang.Object) 1.0f);
        experiment.util.LinkedListTestDriver linkedListTestDriver43 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver43.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver43.clear();
        linkedListTestDriver37.addFirst((java.lang.Object) linkedListTestDriver43);
        java.lang.Object obj48 = linkedListTestDriver37.getFirst();
        boolean boolean49 = linkedListTestDriver27.contains((java.lang.Object) linkedListTestDriver37);
        experiment.util.LinkedListTestDriver linkedListTestDriver50 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver50.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver50.clear();
        linkedListTestDriver50.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj57 = linkedListTestDriver50.remove(0);
        boolean boolean59 = linkedListTestDriver50.remove((java.lang.Object) (short) 100);
        experiment.util.LinkedListTestDriver linkedListTestDriver60 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver60.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver60.clear();
        linkedListTestDriver60.addLast((java.lang.Object) 1.0f);
        experiment.util.LinkedListTestDriver linkedListTestDriver66 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver66.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver66.clear();
        linkedListTestDriver60.addFirst((java.lang.Object) linkedListTestDriver66);
        java.lang.Object obj71 = linkedListTestDriver60.getFirst();
        boolean boolean72 = linkedListTestDriver50.contains((java.lang.Object) linkedListTestDriver60);
        java.lang.Object[] objArray73 = linkedListTestDriver60.toArray();
        linkedListTestDriver27.addLast((java.lang.Object) linkedListTestDriver60);
        linkedListTestDriver60.addFirst((java.lang.Object) (byte) 10);
        boolean boolean77 = linkedListTestDriver10.add((java.lang.Object) linkedListTestDriver60);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj79 = linkedListTestDriver10.remove((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1.0f + "'", obj7, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + 1.0f + "'", obj34, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + obj57 + "' != '" + 1.0f + "'", obj57, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(obj71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(objArray73);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test092");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj7 = linkedListTestDriver0.remove(0);
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator9 = linkedListTestDriver0.listIterator((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: -1; size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1.0f + "'", obj7, 1.0f);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test093");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj3 = linkedListTestDriver0.getFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver4.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver4.clear();
        linkedListTestDriver4.addLast((java.lang.Object) 1.0f);
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver10.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver10.clear();
        linkedListTestDriver4.addFirst((java.lang.Object) linkedListTestDriver10);
        int int15 = linkedListTestDriver4.size();
        linkedListTestDriver0.addFirst((java.lang.Object) int15);
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver17.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver17.clear();
        linkedListTestDriver17.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj23 = linkedListTestDriver17.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver24 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver24.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver24.addFirst((java.lang.Object) 10);
        boolean boolean29 = linkedListTestDriver17.contains((java.lang.Object) 10);
        boolean boolean30 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj32 = linkedListTestDriver17.remove(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 10 + "'", obj3, (byte) 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 1.0f + "'", obj23, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test094");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.addLast((java.lang.Object) 1.0f);
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver6.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver6.clear();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver6);
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver11.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj14 = linkedListTestDriver11.removeLast();
        experiment.util.Iterator iterator15 = linkedListTestDriver11.iterator();
        linkedListTestDriver11.clear();
        experiment.util.Iterator iterator17 = linkedListTestDriver11.iterator();
        boolean boolean18 = linkedListTestDriver6.remove((java.lang.Object) iterator17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = linkedListTestDriver6.remove((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (byte) 10 + "'", obj14, (byte) 10);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test095");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj3 = linkedListTestDriver0.getFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver4.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver4.clear();
        linkedListTestDriver4.addLast((java.lang.Object) 1.0f);
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver10.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver10.clear();
        linkedListTestDriver4.addFirst((java.lang.Object) linkedListTestDriver10);
        int int15 = linkedListTestDriver4.size();
        linkedListTestDriver0.addFirst((java.lang.Object) int15);
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver17.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver17.clear();
        linkedListTestDriver17.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj23 = linkedListTestDriver17.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver24 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver24.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver24.addFirst((java.lang.Object) 10);
        boolean boolean29 = linkedListTestDriver17.contains((java.lang.Object) 10);
        boolean boolean30 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver17);
        experiment.util.LinkedListTestDriver linkedListTestDriver31 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver32 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver32.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj35 = linkedListTestDriver32.removeLast();
        experiment.util.Iterator iterator36 = linkedListTestDriver32.iterator();
        linkedListTestDriver31.addLast((java.lang.Object) iterator36);
        linkedListTestDriver17.addFirst((java.lang.Object) iterator36);
        experiment.util.LinkedListTestDriver linkedListTestDriver39 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver39.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj42 = linkedListTestDriver39.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver43 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver43.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver43.clear();
        linkedListTestDriver43.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj49 = linkedListTestDriver43.getLast();
        linkedListTestDriver43.clear();
        linkedListTestDriver39.addLast((java.lang.Object) linkedListTestDriver43);
        boolean boolean53 = linkedListTestDriver39.add((java.lang.Object) 0L);
        experiment.util.Iterator iterator54 = linkedListTestDriver39.iterator();
        java.lang.Object obj55 = linkedListTestDriver39.removeLast();
        linkedListTestDriver17.addLast(obj55);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 10 + "'", obj3, (byte) 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 1.0f + "'", obj23, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + (byte) 10 + "'", obj35, (byte) 10);
        org.junit.Assert.assertNotNull(iterator36);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + (byte) 10 + "'", obj42, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + 1.0f + "'", obj49, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(iterator54);
        org.junit.Assert.assertEquals("'" + obj55 + "' != '" + 0L + "'", obj55, 0L);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test096");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj3 = linkedListTestDriver0.getFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver4.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver4.clear();
        linkedListTestDriver4.addLast((java.lang.Object) 1.0f);
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver10.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver10.clear();
        linkedListTestDriver4.addFirst((java.lang.Object) linkedListTestDriver10);
        int int15 = linkedListTestDriver4.size();
        linkedListTestDriver0.addFirst((java.lang.Object) int15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = linkedListTestDriver0.remove((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 10 + "'", obj3, (byte) 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test097");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj3 = linkedListTestDriver0.removeLast();
        experiment.util.Iterator iterator4 = linkedListTestDriver0.iterator();
        linkedListTestDriver0.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver6.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver6.clear();
        linkedListTestDriver6.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj12 = linkedListTestDriver6.getLast();
        java.lang.Object obj13 = new java.lang.Object();
        linkedListTestDriver6.addLast(obj13);
        boolean boolean15 = linkedListTestDriver0.add(obj13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = linkedListTestDriver0.remove(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 10 + "'", obj3, (byte) 10);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 1.0f + "'", obj12, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test098");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj3 = linkedListTestDriver0.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver4.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver4.clear();
        linkedListTestDriver4.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj10 = linkedListTestDriver4.getLast();
        linkedListTestDriver4.clear();
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver4);
        boolean boolean14 = linkedListTestDriver0.add((java.lang.Object) 0L);
        experiment.util.Iterator iterator15 = linkedListTestDriver0.iterator();
        java.lang.Object obj16 = linkedListTestDriver0.removeLast();
        linkedListTestDriver0.clear();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 10 + "'", obj3, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 1.0f + "'", obj10, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0L + "'", obj16, 0L);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test099");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj3 = linkedListTestDriver0.removeLast();
        experiment.util.Iterator iterator4 = linkedListTestDriver0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = linkedListTestDriver0.get((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 10 + "'", obj3, (byte) 10);
        org.junit.Assert.assertNotNull(iterator4);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test100");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj3 = linkedListTestDriver0.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver4.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver4.clear();
        linkedListTestDriver4.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj10 = linkedListTestDriver4.getLast();
        linkedListTestDriver4.clear();
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver4);
        experiment.util.Iterator iterator13 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver15 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver15.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver15.clear();
        linkedListTestDriver15.addLast((java.lang.Object) 1.0f);
        experiment.util.LinkedListTestDriver linkedListTestDriver21 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver21.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver21.clear();
        linkedListTestDriver15.addFirst((java.lang.Object) linkedListTestDriver21);
        java.lang.Object obj26 = linkedListTestDriver15.getFirst();
        java.lang.Object[] objArray27 = linkedListTestDriver15.toArray();
        java.lang.Object obj28 = linkedListTestDriver15.getLast();
        java.lang.Object obj29 = linkedListTestDriver15.getFirst();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj30 = linkedListTestDriver0.set((int) '4', (java.lang.Object) linkedListTestDriver15);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 10 + "'", obj3, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 1.0f + "'", obj10, 1.0f);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + 1.0f + "'", obj28, 1.0f);
        org.junit.Assert.assertNotNull(obj29);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test101");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj3 = linkedListTestDriver0.removeLast();
        experiment.util.Iterator iterator4 = linkedListTestDriver0.iterator();
        boolean boolean6 = linkedListTestDriver0.contains((java.lang.Object) 10.0d);
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver7.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver7.clear();
        linkedListTestDriver7.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj14 = linkedListTestDriver7.remove(0);
        boolean boolean16 = linkedListTestDriver7.remove((java.lang.Object) (short) 100);
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver17.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver17.clear();
        linkedListTestDriver17.addLast((java.lang.Object) 1.0f);
        experiment.util.LinkedListTestDriver linkedListTestDriver23 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver23.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver23.clear();
        linkedListTestDriver17.addFirst((java.lang.Object) linkedListTestDriver23);
        java.lang.Object obj28 = linkedListTestDriver17.getFirst();
        boolean boolean29 = linkedListTestDriver7.contains((java.lang.Object) linkedListTestDriver17);
        java.lang.Object[] objArray30 = linkedListTestDriver17.toArray();
        boolean boolean31 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj34 = linkedListTestDriver0.set((int) (short) -1, (java.lang.Object) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 10 + "'", obj3, (byte) 10);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 1.0f + "'", obj14, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test102");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj6 = linkedListTestDriver0.getLast();
        java.lang.Object obj7 = linkedListTestDriver0.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver8.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj11 = linkedListTestDriver8.removeFirst();
        boolean boolean12 = linkedListTestDriver0.equals_CUT((java.lang.Object) linkedListTestDriver8);
        linkedListTestDriver8.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver14 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver14.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver14.clear();
        linkedListTestDriver14.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj21 = linkedListTestDriver14.remove(0);
        boolean boolean23 = linkedListTestDriver14.remove((java.lang.Object) (short) 100);
        experiment.util.LinkedListTestDriver linkedListTestDriver24 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver24.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver24.clear();
        linkedListTestDriver24.addLast((java.lang.Object) 1.0f);
        experiment.util.LinkedListTestDriver linkedListTestDriver30 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver30.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver30.clear();
        linkedListTestDriver24.addFirst((java.lang.Object) linkedListTestDriver30);
        java.lang.Object obj35 = linkedListTestDriver24.getFirst();
        boolean boolean36 = linkedListTestDriver14.contains((java.lang.Object) linkedListTestDriver24);
        java.lang.Object[] objArray37 = linkedListTestDriver24.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver38 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver38.clear();
        boolean boolean40 = linkedListTestDriver24.contains((java.lang.Object) linkedListTestDriver38);
        experiment.util.LinkedListTestDriver linkedListTestDriver41 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver41.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver41.clear();
        linkedListTestDriver41.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj48 = linkedListTestDriver41.remove(0);
        boolean boolean50 = linkedListTestDriver41.remove((java.lang.Object) (short) 100);
        experiment.util.LinkedListTestDriver linkedListTestDriver51 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver51.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver51.clear();
        linkedListTestDriver51.addLast((java.lang.Object) 1.0f);
        experiment.util.LinkedListTestDriver linkedListTestDriver57 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver57.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver57.clear();
        linkedListTestDriver51.addFirst((java.lang.Object) linkedListTestDriver57);
        java.lang.Object obj62 = linkedListTestDriver51.getFirst();
        boolean boolean63 = linkedListTestDriver41.contains((java.lang.Object) linkedListTestDriver51);
        experiment.util.LinkedListTestDriver linkedListTestDriver64 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver64.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver64.clear();
        linkedListTestDriver64.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj71 = linkedListTestDriver64.remove(0);
        boolean boolean73 = linkedListTestDriver64.remove((java.lang.Object) (short) 100);
        experiment.util.LinkedListTestDriver linkedListTestDriver74 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver74.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver74.clear();
        linkedListTestDriver74.addLast((java.lang.Object) 1.0f);
        experiment.util.LinkedListTestDriver linkedListTestDriver80 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver80.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver80.clear();
        linkedListTestDriver74.addFirst((java.lang.Object) linkedListTestDriver80);
        java.lang.Object obj85 = linkedListTestDriver74.getFirst();
        boolean boolean86 = linkedListTestDriver64.contains((java.lang.Object) linkedListTestDriver74);
        java.lang.Object[] objArray87 = linkedListTestDriver74.toArray();
        linkedListTestDriver41.addLast((java.lang.Object) linkedListTestDriver74);
        linkedListTestDriver74.addFirst((java.lang.Object) (byte) 10);
        boolean boolean91 = linkedListTestDriver24.add((java.lang.Object) linkedListTestDriver74);
        boolean boolean92 = linkedListTestDriver8.equals_CUT((java.lang.Object) linkedListTestDriver24);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj93 = linkedListTestDriver8.getLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0f + "'", obj6, 1.0f);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1.0f + "'", obj7, 1.0f);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 10 + "'", obj11, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 1.0f + "'", obj21, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + 1.0f + "'", obj48, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(obj62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertEquals("'" + obj71 + "' != '" + 1.0f + "'", obj71, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(obj85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(objArray87);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test103");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj3 = linkedListTestDriver0.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver4.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver4.clear();
        linkedListTestDriver4.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj10 = linkedListTestDriver4.getLast();
        linkedListTestDriver4.clear();
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver4);
        boolean boolean14 = linkedListTestDriver0.add((java.lang.Object) 0L);
        experiment.util.Iterator iterator15 = linkedListTestDriver0.iterator();
        boolean boolean16 = linkedListTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator18 = linkedListTestDriver0.listIterator((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: -1; size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 10 + "'", obj3, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 1.0f + "'", obj10, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test104");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj3 = linkedListTestDriver0.getFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver4.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver4.clear();
        linkedListTestDriver4.addLast((java.lang.Object) 1.0f);
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver10.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver10.clear();
        linkedListTestDriver4.addFirst((java.lang.Object) linkedListTestDriver10);
        int int15 = linkedListTestDriver4.size();
        linkedListTestDriver0.addFirst((java.lang.Object) int15);
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver17.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver17.clear();
        linkedListTestDriver17.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj23 = linkedListTestDriver17.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver24 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver24.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver24.addFirst((java.lang.Object) 10);
        boolean boolean29 = linkedListTestDriver17.contains((java.lang.Object) 10);
        boolean boolean30 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver17);
        java.lang.Object obj31 = linkedListTestDriver17.getFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver32 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver32.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver32.clear();
        linkedListTestDriver32.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj38 = linkedListTestDriver32.getLast();
        experiment.util.Iterator iterator39 = linkedListTestDriver32.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver40 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver40.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj43 = linkedListTestDriver40.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver44 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver44.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver44.clear();
        linkedListTestDriver44.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj50 = linkedListTestDriver44.getLast();
        linkedListTestDriver44.clear();
        linkedListTestDriver40.addLast((java.lang.Object) linkedListTestDriver44);
        boolean boolean53 = linkedListTestDriver32.add((java.lang.Object) linkedListTestDriver40);
        experiment.util.LinkedListTestDriver linkedListTestDriver54 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver54.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj57 = linkedListTestDriver54.removeLast();
        experiment.util.Iterator iterator58 = linkedListTestDriver54.iterator();
        linkedListTestDriver54.clear();
        experiment.util.Iterator iterator60 = linkedListTestDriver54.iterator();
        linkedListTestDriver32.addLast((java.lang.Object) linkedListTestDriver54);
        int int62 = linkedListTestDriver54.size();
        boolean boolean63 = linkedListTestDriver17.remove((java.lang.Object) linkedListTestDriver54);
        java.lang.Class<?> wildcardClass64 = linkedListTestDriver54.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 10 + "'", obj3, (byte) 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 1.0f + "'", obj23, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 1.0f + "'", obj31, 1.0f);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + 1.0f + "'", obj38, 1.0f);
        org.junit.Assert.assertNotNull(iterator39);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + (byte) 10 + "'", obj43, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + 1.0f + "'", obj50, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertEquals("'" + obj57 + "' != '" + (byte) 10 + "'", obj57, (byte) 10);
        org.junit.Assert.assertNotNull(iterator58);
        org.junit.Assert.assertNotNull(iterator60);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(wildcardClass64);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test105");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj6 = linkedListTestDriver0.getLast();
        experiment.util.Iterator iterator7 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver8.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj11 = linkedListTestDriver8.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver12.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver12.clear();
        linkedListTestDriver12.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj18 = linkedListTestDriver12.getLast();
        linkedListTestDriver12.clear();
        linkedListTestDriver8.addLast((java.lang.Object) linkedListTestDriver12);
        boolean boolean21 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver8);
        experiment.util.LinkedListTestDriver linkedListTestDriver22 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver22.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj25 = linkedListTestDriver22.removeLast();
        experiment.util.Iterator iterator26 = linkedListTestDriver22.iterator();
        linkedListTestDriver22.clear();
        experiment.util.Iterator iterator28 = linkedListTestDriver22.iterator();
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver22);
        java.lang.Class<?> wildcardClass30 = linkedListTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0f + "'", obj6, 1.0f);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 10 + "'", obj11, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 1.0f + "'", obj18, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (byte) 10 + "'", obj25, (byte) 10);
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertNotNull(iterator28);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test106");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver5.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver5.clear();
        linkedListTestDriver5.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj11 = linkedListTestDriver5.getLast();
        linkedListTestDriver5.clear();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver5);
        experiment.util.LinkedListTestDriver linkedListTestDriver14 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver14.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj17 = linkedListTestDriver14.removeLast();
        experiment.util.Iterator iterator18 = linkedListTestDriver14.iterator();
        linkedListTestDriver14.clear();
        boolean boolean20 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = linkedListTestDriver14.set(100, (java.lang.Object) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 1.0f + "'", obj11, 1.0f);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) 10 + "'", obj17, (byte) 10);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test107");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj3 = linkedListTestDriver0.getFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver4.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver4.clear();
        linkedListTestDriver4.addLast((java.lang.Object) 1.0f);
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver10.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver10.clear();
        linkedListTestDriver4.addFirst((java.lang.Object) linkedListTestDriver10);
        int int15 = linkedListTestDriver4.size();
        linkedListTestDriver0.addFirst((java.lang.Object) int15);
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver17.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver17.clear();
        linkedListTestDriver17.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj23 = linkedListTestDriver17.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver24 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver24.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver24.addFirst((java.lang.Object) 10);
        boolean boolean29 = linkedListTestDriver17.contains((java.lang.Object) 10);
        boolean boolean30 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj32 = linkedListTestDriver17.remove(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 10 + "'", obj3, (byte) 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 1.0f + "'", obj23, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test108");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj3 = linkedListTestDriver0.removeLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver4.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver4.clear();
        linkedListTestDriver4.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj10 = linkedListTestDriver4.getLast();
        java.lang.Object obj11 = linkedListTestDriver4.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver12.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj15 = linkedListTestDriver12.removeFirst();
        boolean boolean16 = linkedListTestDriver4.equals_CUT((java.lang.Object) linkedListTestDriver12);
        int int17 = linkedListTestDriver12.size();
        boolean boolean18 = linkedListTestDriver0.add((java.lang.Object) int17);
        java.lang.Object obj19 = linkedListTestDriver0.getFirst();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 10 + "'", obj3, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 1.0f + "'", obj10, 1.0f);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 1.0f + "'", obj11, 1.0f);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (byte) 10 + "'", obj15, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 0 + "'", obj19, 0);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test109");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj3 = linkedListTestDriver0.getFirst();
        boolean boolean5 = linkedListTestDriver0.remove((java.lang.Object) 1);
        java.lang.Object obj7 = linkedListTestDriver0.get((int) (short) 0);
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver8.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver8.clear();
        linkedListTestDriver8.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj14 = linkedListTestDriver8.getLast();
        experiment.util.Iterator iterator15 = linkedListTestDriver8.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver16 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver16.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj19 = linkedListTestDriver16.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver20 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver20.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver20.clear();
        linkedListTestDriver20.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj26 = linkedListTestDriver20.getLast();
        linkedListTestDriver20.clear();
        linkedListTestDriver16.addLast((java.lang.Object) linkedListTestDriver20);
        boolean boolean29 = linkedListTestDriver8.add((java.lang.Object) linkedListTestDriver16);
        experiment.util.ListIterator listIterator31 = linkedListTestDriver8.listIterator((int) (byte) 1);
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver8);
        experiment.util.LinkedListTestDriver linkedListTestDriver34 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver34.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver34.clear();
        linkedListTestDriver34.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj41 = linkedListTestDriver34.remove(0);
        boolean boolean43 = linkedListTestDriver34.remove((java.lang.Object) (short) 100);
        experiment.util.LinkedListTestDriver linkedListTestDriver44 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver44.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver44.clear();
        linkedListTestDriver44.addLast((java.lang.Object) 1.0f);
        experiment.util.LinkedListTestDriver linkedListTestDriver50 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver50.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver50.clear();
        linkedListTestDriver44.addFirst((java.lang.Object) linkedListTestDriver50);
        java.lang.Object obj55 = linkedListTestDriver44.getFirst();
        boolean boolean56 = linkedListTestDriver34.contains((java.lang.Object) linkedListTestDriver44);
        experiment.util.LinkedListTestDriver linkedListTestDriver57 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver57.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver57.clear();
        linkedListTestDriver57.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj64 = linkedListTestDriver57.remove(0);
        boolean boolean66 = linkedListTestDriver57.remove((java.lang.Object) (short) 100);
        experiment.util.LinkedListTestDriver linkedListTestDriver67 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver67.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver67.clear();
        linkedListTestDriver67.addLast((java.lang.Object) 1.0f);
        experiment.util.LinkedListTestDriver linkedListTestDriver73 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver73.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver73.clear();
        linkedListTestDriver67.addFirst((java.lang.Object) linkedListTestDriver73);
        java.lang.Object obj78 = linkedListTestDriver67.getFirst();
        boolean boolean79 = linkedListTestDriver57.contains((java.lang.Object) linkedListTestDriver67);
        java.lang.Object[] objArray80 = linkedListTestDriver67.toArray();
        linkedListTestDriver34.addLast((java.lang.Object) linkedListTestDriver67);
        java.lang.Object obj82 = linkedListTestDriver67.removeLast();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj83 = linkedListTestDriver0.set((int) 'a', obj82);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 10 + "'", obj3, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 10 + "'", obj7, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 1.0f + "'", obj14, 1.0f);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (byte) 10 + "'", obj19, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 1.0f + "'", obj26, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(listIterator31);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + 1.0f + "'", obj41, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(obj55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertEquals("'" + obj64 + "' != '" + 1.0f + "'", obj64, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(obj78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(objArray80);
        org.junit.Assert.assertEquals("'" + obj82 + "' != '" + 1.0f + "'", obj82, 1.0f);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test110");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver5.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver5.clear();
        linkedListTestDriver5.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj11 = linkedListTestDriver5.getLast();
        linkedListTestDriver5.clear();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver5);
        experiment.util.LinkedListTestDriver linkedListTestDriver14 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver14.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj17 = linkedListTestDriver14.removeLast();
        experiment.util.Iterator iterator18 = linkedListTestDriver14.iterator();
        linkedListTestDriver14.clear();
        boolean boolean20 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = linkedListTestDriver14.getLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 1.0f + "'", obj11, 1.0f);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) 10 + "'", obj17, (byte) 10);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test111");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj3 = linkedListTestDriver0.removeLast();
        experiment.util.Iterator iterator4 = linkedListTestDriver0.iterator();
        boolean boolean6 = linkedListTestDriver0.contains((java.lang.Object) "hi!");
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver7.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj10 = linkedListTestDriver7.removeLast();
        experiment.util.Iterator iterator11 = linkedListTestDriver7.iterator();
        linkedListTestDriver7.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver13.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver13.clear();
        linkedListTestDriver13.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj19 = linkedListTestDriver13.getLast();
        java.lang.Object obj20 = new java.lang.Object();
        linkedListTestDriver13.addLast(obj20);
        boolean boolean22 = linkedListTestDriver7.add(obj20);
        boolean boolean23 = linkedListTestDriver0.remove((java.lang.Object) boolean22);
        java.lang.Object[] objArray24 = linkedListTestDriver0.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = linkedListTestDriver0.getLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 10 + "'", obj3, (byte) 10);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) 10 + "'", obj10, (byte) 10);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 1.0f + "'", obj19, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test112");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj7 = linkedListTestDriver0.remove(0);
        boolean boolean9 = linkedListTestDriver0.remove((java.lang.Object) (short) 100);
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver10.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver10.clear();
        linkedListTestDriver10.addLast((java.lang.Object) 1.0f);
        experiment.util.LinkedListTestDriver linkedListTestDriver16 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver16.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver16.clear();
        linkedListTestDriver10.addFirst((java.lang.Object) linkedListTestDriver16);
        java.lang.Object obj21 = linkedListTestDriver10.getFirst();
        boolean boolean22 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver10);
        experiment.util.LinkedListTestDriver linkedListTestDriver23 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver23.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver23.clear();
        linkedListTestDriver23.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj30 = linkedListTestDriver23.remove(0);
        boolean boolean32 = linkedListTestDriver23.remove((java.lang.Object) (short) 100);
        experiment.util.LinkedListTestDriver linkedListTestDriver33 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver33.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver33.clear();
        linkedListTestDriver33.addLast((java.lang.Object) 1.0f);
        experiment.util.LinkedListTestDriver linkedListTestDriver39 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver39.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver39.clear();
        linkedListTestDriver33.addFirst((java.lang.Object) linkedListTestDriver39);
        java.lang.Object obj44 = linkedListTestDriver33.getFirst();
        boolean boolean45 = linkedListTestDriver23.contains((java.lang.Object) linkedListTestDriver33);
        java.lang.Object[] objArray46 = linkedListTestDriver33.toArray();
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver33);
        java.lang.Object obj48 = linkedListTestDriver33.removeLast();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator50 = linkedListTestDriver33.listIterator((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 32; size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1.0f + "'", obj7, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + 1.0f + "'", obj30, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + 1.0f + "'", obj48, 1.0f);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test113");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj3 = linkedListTestDriver0.removeLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver4.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver4.clear();
        linkedListTestDriver4.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj10 = linkedListTestDriver4.getLast();
        java.lang.Object obj11 = linkedListTestDriver4.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver12.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj15 = linkedListTestDriver12.removeFirst();
        boolean boolean16 = linkedListTestDriver4.equals_CUT((java.lang.Object) linkedListTestDriver12);
        int int17 = linkedListTestDriver12.size();
        boolean boolean18 = linkedListTestDriver0.add((java.lang.Object) int17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = linkedListTestDriver0.get(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 10 + "'", obj3, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 1.0f + "'", obj10, 1.0f);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 1.0f + "'", obj11, 1.0f);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (byte) 10 + "'", obj15, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test114");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj6 = linkedListTestDriver0.getLast();
        experiment.util.Iterator iterator7 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver8.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj11 = linkedListTestDriver8.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver12.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver12.clear();
        linkedListTestDriver12.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj18 = linkedListTestDriver12.getLast();
        linkedListTestDriver12.clear();
        linkedListTestDriver8.addLast((java.lang.Object) linkedListTestDriver12);
        boolean boolean21 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver8);
        experiment.util.LinkedListTestDriver linkedListTestDriver22 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver22.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver22.clear();
        linkedListTestDriver22.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj28 = linkedListTestDriver22.getLast();
        experiment.util.Iterator iterator29 = linkedListTestDriver22.iterator();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver22);
        experiment.util.ListIterator listIterator32 = linkedListTestDriver22.listIterator((int) (byte) 0);
        java.lang.Object obj33 = linkedListTestDriver22.getLast();
        boolean boolean35 = linkedListTestDriver22.remove((java.lang.Object) (short) 10);
        experiment.util.LinkedListTestDriver linkedListTestDriver36 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver36.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver36.clear();
        linkedListTestDriver36.addLast((java.lang.Object) 1.0f);
        experiment.util.LinkedListTestDriver linkedListTestDriver42 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver42.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver42.clear();
        linkedListTestDriver36.addFirst((java.lang.Object) linkedListTestDriver42);
        java.lang.Object obj47 = linkedListTestDriver36.getFirst();
        java.lang.Object[] objArray48 = linkedListTestDriver36.toArray();
        java.lang.Object obj49 = linkedListTestDriver36.getLast();
        java.lang.Object obj50 = linkedListTestDriver36.getFirst();
        boolean boolean51 = linkedListTestDriver22.equals_CUT(obj50);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0f + "'", obj6, 1.0f);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 10 + "'", obj11, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 1.0f + "'", obj18, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + 1.0f + "'", obj28, 1.0f);
        org.junit.Assert.assertNotNull(iterator29);
        org.junit.Assert.assertNotNull(listIterator32);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + 1.0f + "'", obj33, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + 1.0f + "'", obj49, 1.0f);
        org.junit.Assert.assertNotNull(obj50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test115");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver5.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver5.clear();
        linkedListTestDriver5.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj11 = linkedListTestDriver5.getLast();
        linkedListTestDriver5.clear();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver5);
        experiment.util.LinkedListTestDriver linkedListTestDriver14 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver14.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj17 = linkedListTestDriver14.removeLast();
        experiment.util.Iterator iterator18 = linkedListTestDriver14.iterator();
        linkedListTestDriver14.clear();
        boolean boolean20 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver14);
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator22 = linkedListTestDriver14.listIterator((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: -1; size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 1.0f + "'", obj11, 1.0f);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) 10 + "'", obj17, (byte) 10);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test116");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj3 = linkedListTestDriver0.removeLast();
        experiment.util.Iterator iterator4 = linkedListTestDriver0.iterator();
        boolean boolean6 = linkedListTestDriver0.contains((java.lang.Object) "hi!");
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver7.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj10 = linkedListTestDriver7.removeLast();
        experiment.util.Iterator iterator11 = linkedListTestDriver7.iterator();
        linkedListTestDriver7.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver13.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver13.clear();
        linkedListTestDriver13.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj19 = linkedListTestDriver13.getLast();
        java.lang.Object obj20 = new java.lang.Object();
        linkedListTestDriver13.addLast(obj20);
        boolean boolean22 = linkedListTestDriver7.add(obj20);
        boolean boolean23 = linkedListTestDriver0.remove((java.lang.Object) boolean22);
        experiment.util.LinkedListTestDriver linkedListTestDriver24 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver24.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj27 = linkedListTestDriver24.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver28 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver28.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver28.clear();
        linkedListTestDriver28.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj34 = linkedListTestDriver28.getLast();
        linkedListTestDriver28.clear();
        linkedListTestDriver24.addLast((java.lang.Object) linkedListTestDriver28);
        boolean boolean38 = linkedListTestDriver24.add((java.lang.Object) 0L);
        experiment.util.Iterator iterator39 = linkedListTestDriver24.iterator();
        java.lang.Object obj40 = linkedListTestDriver24.removeLast();
        boolean boolean41 = linkedListTestDriver24.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver42 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver42.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver42.clear();
        linkedListTestDriver42.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj48 = linkedListTestDriver42.getLast();
        linkedListTestDriver42.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver50 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver50.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj53 = linkedListTestDriver50.getFirst();
        boolean boolean55 = linkedListTestDriver50.remove((java.lang.Object) 1);
        boolean boolean56 = linkedListTestDriver42.remove((java.lang.Object) 1);
        boolean boolean57 = linkedListTestDriver24.contains((java.lang.Object) linkedListTestDriver42);
        linkedListTestDriver0.addFirst((java.lang.Object) boolean57);
        java.lang.Object[] objArray59 = linkedListTestDriver0.toArray();
        experiment.util.Iterator iterator60 = linkedListTestDriver0.iterator();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 10 + "'", obj3, (byte) 10);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) 10 + "'", obj10, (byte) 10);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 1.0f + "'", obj19, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + (byte) 10 + "'", obj27, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + 1.0f + "'", obj34, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(iterator39);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + 0L + "'", obj40, 0L);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + 1.0f + "'", obj48, 1.0f);
        org.junit.Assert.assertEquals("'" + obj53 + "' != '" + (byte) 10 + "'", obj53, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray59), "[false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray59), "[false]");
        org.junit.Assert.assertNotNull(iterator60);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test117");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj6 = linkedListTestDriver0.getLast();
        experiment.util.Iterator iterator7 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver8.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj11 = linkedListTestDriver8.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver12.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver12.clear();
        linkedListTestDriver12.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj18 = linkedListTestDriver12.getLast();
        linkedListTestDriver12.clear();
        linkedListTestDriver8.addLast((java.lang.Object) linkedListTestDriver12);
        boolean boolean21 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver8);
        experiment.util.LinkedListTestDriver linkedListTestDriver22 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver22.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver22.clear();
        linkedListTestDriver22.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj28 = linkedListTestDriver22.getLast();
        experiment.util.Iterator iterator29 = linkedListTestDriver22.iterator();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver22);
        linkedListTestDriver0.addLast((java.lang.Object) 1.0f);
        java.lang.Class<?> wildcardClass33 = linkedListTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0f + "'", obj6, 1.0f);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 10 + "'", obj11, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 1.0f + "'", obj18, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + 1.0f + "'", obj28, 1.0f);
        org.junit.Assert.assertNotNull(iterator29);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test118");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj3 = linkedListTestDriver0.getFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver4.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver4.clear();
        linkedListTestDriver4.addLast((java.lang.Object) 1.0f);
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver10.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver10.clear();
        linkedListTestDriver4.addFirst((java.lang.Object) linkedListTestDriver10);
        int int15 = linkedListTestDriver4.size();
        linkedListTestDriver0.addFirst((java.lang.Object) int15);
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver17.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver17.clear();
        linkedListTestDriver17.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj23 = linkedListTestDriver17.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver24 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver24.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver24.addFirst((java.lang.Object) 10);
        boolean boolean29 = linkedListTestDriver17.contains((java.lang.Object) 10);
        boolean boolean30 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver17);
        java.lang.Object obj31 = linkedListTestDriver17.getFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver32 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver32.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver32.clear();
        linkedListTestDriver32.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj38 = linkedListTestDriver32.getLast();
        experiment.util.Iterator iterator39 = linkedListTestDriver32.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver40 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver40.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj43 = linkedListTestDriver40.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver44 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver44.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver44.clear();
        linkedListTestDriver44.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj50 = linkedListTestDriver44.getLast();
        linkedListTestDriver44.clear();
        linkedListTestDriver40.addLast((java.lang.Object) linkedListTestDriver44);
        boolean boolean53 = linkedListTestDriver32.add((java.lang.Object) linkedListTestDriver40);
        experiment.util.LinkedListTestDriver linkedListTestDriver54 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver54.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj57 = linkedListTestDriver54.removeLast();
        experiment.util.Iterator iterator58 = linkedListTestDriver54.iterator();
        linkedListTestDriver54.clear();
        experiment.util.Iterator iterator60 = linkedListTestDriver54.iterator();
        linkedListTestDriver32.addLast((java.lang.Object) linkedListTestDriver54);
        int int62 = linkedListTestDriver54.size();
        boolean boolean63 = linkedListTestDriver17.remove((java.lang.Object) linkedListTestDriver54);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj64 = linkedListTestDriver54.getLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 10 + "'", obj3, (byte) 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 1.0f + "'", obj23, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 1.0f + "'", obj31, 1.0f);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + 1.0f + "'", obj38, 1.0f);
        org.junit.Assert.assertNotNull(iterator39);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + (byte) 10 + "'", obj43, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + 1.0f + "'", obj50, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertEquals("'" + obj57 + "' != '" + (byte) 10 + "'", obj57, (byte) 10);
        org.junit.Assert.assertNotNull(iterator58);
        org.junit.Assert.assertNotNull(iterator60);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test119");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        experiment.util.LinkedListTestDriver linkedListTestDriver3 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver3.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj6 = linkedListTestDriver3.removeLast();
        experiment.util.Iterator iterator7 = linkedListTestDriver3.iterator();
        linkedListTestDriver3.clear();
        experiment.util.Iterator iterator9 = linkedListTestDriver3.iterator();
        java.lang.Class<?> wildcardClass10 = iterator9.getClass();
        linkedListTestDriver0.addLast((java.lang.Object) iterator9);
        java.lang.Object obj12 = linkedListTestDriver0.removeLast();
        boolean boolean14 = linkedListTestDriver0.remove((java.lang.Object) 100.0f);
        java.lang.Object obj15 = linkedListTestDriver0.removeFirst();
        boolean boolean17 = linkedListTestDriver0.add((java.lang.Object) 10);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 10 + "'", obj6, (byte) 10);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (byte) 10 + "'", obj15, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test120");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver5.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver5.clear();
        linkedListTestDriver5.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj11 = linkedListTestDriver5.getLast();
        linkedListTestDriver5.clear();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver5);
        linkedListTestDriver5.clear();
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 1.0f + "'", obj11, 1.0f);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test121");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        experiment.util.LinkedListTestDriver linkedListTestDriver3 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver3.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj6 = linkedListTestDriver3.removeLast();
        experiment.util.Iterator iterator7 = linkedListTestDriver3.iterator();
        linkedListTestDriver3.clear();
        experiment.util.Iterator iterator9 = linkedListTestDriver3.iterator();
        java.lang.Class<?> wildcardClass10 = iterator9.getClass();
        linkedListTestDriver0.addLast((java.lang.Object) iterator9);
        java.lang.Object obj12 = linkedListTestDriver0.removeLast();
        boolean boolean14 = linkedListTestDriver0.remove((java.lang.Object) 100.0f);
        experiment.util.LinkedListTestDriver linkedListTestDriver16 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver17.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj20 = linkedListTestDriver17.removeLast();
        experiment.util.Iterator iterator21 = linkedListTestDriver17.iterator();
        linkedListTestDriver16.addLast((java.lang.Object) iterator21);
        boolean boolean24 = linkedListTestDriver16.contains((java.lang.Object) (byte) 10);
        java.lang.Object obj25 = linkedListTestDriver16.removeLast();
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.add((int) (byte) 10, obj25);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 10; size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 10 + "'", obj6, (byte) 10);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (byte) 10 + "'", obj20, (byte) 10);
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(obj25);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test122");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj3 = linkedListTestDriver0.getFirst();
        boolean boolean5 = linkedListTestDriver0.remove((java.lang.Object) 1);
        java.lang.Object obj7 = linkedListTestDriver0.get((int) (short) 0);
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver8.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver8.clear();
        linkedListTestDriver8.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj14 = linkedListTestDriver8.getLast();
        experiment.util.Iterator iterator15 = linkedListTestDriver8.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver16 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver16.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj19 = linkedListTestDriver16.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver20 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver20.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver20.clear();
        linkedListTestDriver20.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj26 = linkedListTestDriver20.getLast();
        linkedListTestDriver20.clear();
        linkedListTestDriver16.addLast((java.lang.Object) linkedListTestDriver20);
        boolean boolean29 = linkedListTestDriver8.add((java.lang.Object) linkedListTestDriver16);
        experiment.util.ListIterator listIterator31 = linkedListTestDriver8.listIterator((int) (byte) 1);
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver8);
        experiment.util.LinkedListTestDriver linkedListTestDriver34 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver34.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver34.clear();
        linkedListTestDriver34.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj40 = linkedListTestDriver34.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver41 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver41.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj44 = linkedListTestDriver41.getFirst();
        boolean boolean46 = linkedListTestDriver41.remove((java.lang.Object) 1);
        boolean boolean47 = linkedListTestDriver34.remove((java.lang.Object) linkedListTestDriver41);
        experiment.util.LinkedListTestDriver linkedListTestDriver48 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver48.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver48.clear();
        linkedListTestDriver48.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj54 = linkedListTestDriver48.getLast();
        experiment.util.Iterator iterator55 = linkedListTestDriver48.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver56 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver56.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj59 = linkedListTestDriver56.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver60 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver60.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver60.clear();
        linkedListTestDriver60.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj66 = linkedListTestDriver60.getLast();
        linkedListTestDriver60.clear();
        linkedListTestDriver56.addLast((java.lang.Object) linkedListTestDriver60);
        boolean boolean69 = linkedListTestDriver48.add((java.lang.Object) linkedListTestDriver56);
        int int70 = linkedListTestDriver48.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver71 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver71.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver71.clear();
        linkedListTestDriver71.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj77 = linkedListTestDriver71.getLast();
        experiment.util.Iterator iterator78 = linkedListTestDriver71.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver79 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver79.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj82 = linkedListTestDriver79.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver83 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver83.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver83.clear();
        linkedListTestDriver83.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj89 = linkedListTestDriver83.getLast();
        linkedListTestDriver83.clear();
        linkedListTestDriver79.addLast((java.lang.Object) linkedListTestDriver83);
        boolean boolean92 = linkedListTestDriver71.add((java.lang.Object) linkedListTestDriver79);
        java.lang.Class<?> wildcardClass93 = linkedListTestDriver79.getClass();
        linkedListTestDriver48.addLast((java.lang.Object) wildcardClass93);
        linkedListTestDriver41.addFirst((java.lang.Object) wildcardClass93);
        java.lang.Object obj96 = linkedListTestDriver0.set((int) (short) 1, (java.lang.Object) wildcardClass93);
        java.lang.Object obj97 = null;
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.addLast(obj97);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 10 + "'", obj3, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 10 + "'", obj7, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 1.0f + "'", obj14, 1.0f);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (byte) 10 + "'", obj19, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 1.0f + "'", obj26, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(listIterator31);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + 1.0f + "'", obj40, 1.0f);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + (byte) 10 + "'", obj44, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + obj54 + "' != '" + 1.0f + "'", obj54, 1.0f);
        org.junit.Assert.assertNotNull(iterator55);
        org.junit.Assert.assertEquals("'" + obj59 + "' != '" + (byte) 10 + "'", obj59, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj66 + "' != '" + 1.0f + "'", obj66, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 2 + "'", int70 == 2);
        org.junit.Assert.assertEquals("'" + obj77 + "' != '" + 1.0f + "'", obj77, 1.0f);
        org.junit.Assert.assertNotNull(iterator78);
        org.junit.Assert.assertEquals("'" + obj82 + "' != '" + (byte) 10 + "'", obj82, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj89 + "' != '" + 1.0f + "'", obj89, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertNotNull(wildcardClass93);
        org.junit.Assert.assertNotNull(obj96);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test123");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj3 = linkedListTestDriver0.getFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver4.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver4.clear();
        linkedListTestDriver4.addLast((java.lang.Object) 1.0f);
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver10.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver10.clear();
        linkedListTestDriver4.addFirst((java.lang.Object) linkedListTestDriver10);
        int int15 = linkedListTestDriver4.size();
        linkedListTestDriver0.addFirst((java.lang.Object) int15);
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver17.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver17.clear();
        linkedListTestDriver17.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj23 = linkedListTestDriver17.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver24 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver24.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver24.addFirst((java.lang.Object) 10);
        boolean boolean29 = linkedListTestDriver17.contains((java.lang.Object) 10);
        boolean boolean30 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver17);
        java.lang.Object obj31 = linkedListTestDriver0.removeLast();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 10 + "'", obj3, (byte) 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 1.0f + "'", obj23, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + (byte) 10 + "'", obj31, (byte) 10);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test124");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj3 = linkedListTestDriver0.removeLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver5.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj8 = linkedListTestDriver5.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver9.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver9.clear();
        linkedListTestDriver9.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj15 = linkedListTestDriver9.getLast();
        linkedListTestDriver9.clear();
        linkedListTestDriver5.addLast((java.lang.Object) linkedListTestDriver9);
        boolean boolean19 = linkedListTestDriver5.add((java.lang.Object) 0L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = linkedListTestDriver0.set((int) (byte) 0, (java.lang.Object) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 10 + "'", obj3, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) 10 + "'", obj8, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 1.0f + "'", obj15, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test125");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj3 = linkedListTestDriver0.removeLast();
        experiment.util.Iterator iterator4 = linkedListTestDriver0.iterator();
        boolean boolean6 = linkedListTestDriver0.contains((java.lang.Object) "hi!");
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver7.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj10 = linkedListTestDriver7.removeLast();
        experiment.util.Iterator iterator11 = linkedListTestDriver7.iterator();
        linkedListTestDriver7.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver13.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver13.clear();
        linkedListTestDriver13.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj19 = linkedListTestDriver13.getLast();
        java.lang.Object obj20 = new java.lang.Object();
        linkedListTestDriver13.addLast(obj20);
        boolean boolean22 = linkedListTestDriver7.add(obj20);
        boolean boolean23 = linkedListTestDriver0.remove((java.lang.Object) boolean22);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = linkedListTestDriver0.get((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 10 + "'", obj3, (byte) 10);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) 10 + "'", obj10, (byte) 10);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 1.0f + "'", obj19, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test126");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj7 = linkedListTestDriver0.remove(0);
        boolean boolean9 = linkedListTestDriver0.remove((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator10 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver11.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver11.clear();
        linkedListTestDriver11.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj17 = linkedListTestDriver11.getLast();
        linkedListTestDriver11.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver19 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver19.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj22 = linkedListTestDriver19.getFirst();
        boolean boolean24 = linkedListTestDriver19.remove((java.lang.Object) 1);
        boolean boolean25 = linkedListTestDriver11.remove((java.lang.Object) 1);
        boolean boolean26 = linkedListTestDriver0.remove((java.lang.Object) boolean25);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj28 = linkedListTestDriver0.get((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1.0f + "'", obj7, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 1.0f + "'", obj17, 1.0f);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (byte) 10 + "'", obj22, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test127");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj7 = linkedListTestDriver0.remove(0);
        boolean boolean9 = linkedListTestDriver0.remove((java.lang.Object) (short) 100);
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver10.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver10.clear();
        linkedListTestDriver10.addLast((java.lang.Object) 1.0f);
        experiment.util.LinkedListTestDriver linkedListTestDriver16 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver16.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver16.clear();
        linkedListTestDriver10.addFirst((java.lang.Object) linkedListTestDriver16);
        java.lang.Object obj21 = linkedListTestDriver10.getFirst();
        boolean boolean22 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver10);
        experiment.util.LinkedListTestDriver linkedListTestDriver23 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver23.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver23.clear();
        linkedListTestDriver23.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj30 = linkedListTestDriver23.remove(0);
        boolean boolean32 = linkedListTestDriver23.remove((java.lang.Object) (short) 100);
        experiment.util.LinkedListTestDriver linkedListTestDriver33 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver33.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver33.clear();
        linkedListTestDriver33.addLast((java.lang.Object) 1.0f);
        experiment.util.LinkedListTestDriver linkedListTestDriver39 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver39.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver39.clear();
        linkedListTestDriver33.addFirst((java.lang.Object) linkedListTestDriver39);
        java.lang.Object obj44 = linkedListTestDriver33.getFirst();
        boolean boolean45 = linkedListTestDriver23.contains((java.lang.Object) linkedListTestDriver33);
        java.lang.Object[] objArray46 = linkedListTestDriver33.toArray();
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver33);
        java.lang.Object obj48 = linkedListTestDriver33.removeLast();
        java.lang.Object obj49 = linkedListTestDriver33.removeLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver51 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver52 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver52.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj55 = linkedListTestDriver52.removeLast();
        experiment.util.Iterator iterator56 = linkedListTestDriver52.iterator();
        linkedListTestDriver51.addLast((java.lang.Object) iterator56);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj58 = linkedListTestDriver33.set((int) (byte) -1, (java.lang.Object) iterator56);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1.0f + "'", obj7, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + 1.0f + "'", obj30, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + 1.0f + "'", obj48, 1.0f);
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertEquals("'" + obj55 + "' != '" + (byte) 10 + "'", obj55, (byte) 10);
        org.junit.Assert.assertNotNull(iterator56);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test128");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj6 = linkedListTestDriver0.getLast();
        experiment.util.Iterator iterator7 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver8.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj11 = linkedListTestDriver8.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver12.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver12.clear();
        linkedListTestDriver12.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj18 = linkedListTestDriver12.getLast();
        linkedListTestDriver12.clear();
        linkedListTestDriver8.addLast((java.lang.Object) linkedListTestDriver12);
        boolean boolean21 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver8);
        boolean boolean22 = linkedListTestDriver0.isEmpty();
        experiment.util.Iterator iterator23 = linkedListTestDriver0.iterator();
        java.lang.Class<?> wildcardClass24 = linkedListTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0f + "'", obj6, 1.0f);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 10 + "'", obj11, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 1.0f + "'", obj18, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(iterator23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test129");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj7 = linkedListTestDriver0.remove(0);
        boolean boolean9 = linkedListTestDriver0.remove((java.lang.Object) (short) 100);
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver10.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver10.clear();
        linkedListTestDriver10.addLast((java.lang.Object) 1.0f);
        experiment.util.LinkedListTestDriver linkedListTestDriver16 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver16.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver16.clear();
        linkedListTestDriver10.addFirst((java.lang.Object) linkedListTestDriver16);
        java.lang.Object obj21 = linkedListTestDriver10.getFirst();
        boolean boolean22 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver10);
        experiment.util.LinkedListTestDriver linkedListTestDriver23 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver23.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver23.clear();
        linkedListTestDriver23.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj30 = linkedListTestDriver23.remove(0);
        boolean boolean32 = linkedListTestDriver23.remove((java.lang.Object) (short) 100);
        experiment.util.LinkedListTestDriver linkedListTestDriver33 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver33.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver33.clear();
        linkedListTestDriver33.addLast((java.lang.Object) 1.0f);
        experiment.util.LinkedListTestDriver linkedListTestDriver39 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver39.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver39.clear();
        linkedListTestDriver33.addFirst((java.lang.Object) linkedListTestDriver39);
        java.lang.Object obj44 = linkedListTestDriver33.getFirst();
        boolean boolean45 = linkedListTestDriver23.contains((java.lang.Object) linkedListTestDriver33);
        java.lang.Object[] objArray46 = linkedListTestDriver33.toArray();
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver33);
        java.lang.Object obj48 = linkedListTestDriver33.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver49 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver50 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver50.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj53 = linkedListTestDriver50.removeLast();
        experiment.util.Iterator iterator54 = linkedListTestDriver50.iterator();
        linkedListTestDriver49.addLast((java.lang.Object) iterator54);
        boolean boolean57 = linkedListTestDriver49.contains((java.lang.Object) (byte) 10);
        linkedListTestDriver33.addLast((java.lang.Object) linkedListTestDriver49);
        linkedListTestDriver33.addLast((java.lang.Object) 10.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj62 = linkedListTestDriver33.get((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1.0f + "'", obj7, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + 1.0f + "'", obj30, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertEquals("'" + obj53 + "' != '" + (byte) 10 + "'", obj53, (byte) 10);
        org.junit.Assert.assertNotNull(iterator54);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test130");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj7 = linkedListTestDriver0.remove(0);
        boolean boolean9 = linkedListTestDriver0.remove((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator10 = linkedListTestDriver0.iterator();
        java.lang.Class<?> wildcardClass11 = iterator10.getClass();
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1.0f + "'", obj7, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test131");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj3 = linkedListTestDriver0.removeLast();
        experiment.util.Iterator iterator4 = linkedListTestDriver0.iterator();
        boolean boolean6 = linkedListTestDriver0.contains((java.lang.Object) "hi!");
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver7.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj10 = linkedListTestDriver7.removeLast();
        experiment.util.Iterator iterator11 = linkedListTestDriver7.iterator();
        linkedListTestDriver7.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver13.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver13.clear();
        linkedListTestDriver13.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj19 = linkedListTestDriver13.getLast();
        java.lang.Object obj20 = new java.lang.Object();
        linkedListTestDriver13.addLast(obj20);
        boolean boolean22 = linkedListTestDriver7.add(obj20);
        boolean boolean23 = linkedListTestDriver0.remove((java.lang.Object) boolean22);
        experiment.util.LinkedListTestDriver linkedListTestDriver24 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver24.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj27 = linkedListTestDriver24.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver28 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver28.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver28.clear();
        linkedListTestDriver28.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj34 = linkedListTestDriver28.getLast();
        linkedListTestDriver28.clear();
        linkedListTestDriver24.addLast((java.lang.Object) linkedListTestDriver28);
        boolean boolean38 = linkedListTestDriver24.add((java.lang.Object) 0L);
        experiment.util.Iterator iterator39 = linkedListTestDriver24.iterator();
        java.lang.Object obj40 = linkedListTestDriver24.removeLast();
        boolean boolean41 = linkedListTestDriver24.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver42 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver42.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver42.clear();
        linkedListTestDriver42.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj48 = linkedListTestDriver42.getLast();
        linkedListTestDriver42.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver50 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver50.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj53 = linkedListTestDriver50.getFirst();
        boolean boolean55 = linkedListTestDriver50.remove((java.lang.Object) 1);
        boolean boolean56 = linkedListTestDriver42.remove((java.lang.Object) 1);
        boolean boolean57 = linkedListTestDriver24.contains((java.lang.Object) linkedListTestDriver42);
        linkedListTestDriver0.addFirst((java.lang.Object) boolean57);
        java.lang.Object[] objArray59 = linkedListTestDriver0.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver61 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver61.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver61.clear();
        linkedListTestDriver61.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj67 = linkedListTestDriver61.getLast();
        java.lang.Object obj68 = linkedListTestDriver61.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver69 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver69.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj72 = linkedListTestDriver69.removeFirst();
        boolean boolean73 = linkedListTestDriver61.equals_CUT((java.lang.Object) linkedListTestDriver69);
        linkedListTestDriver69.clear();
        experiment.util.Iterator iterator75 = linkedListTestDriver69.iterator();
        linkedListTestDriver0.add((int) (byte) 1, (java.lang.Object) linkedListTestDriver69);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 10 + "'", obj3, (byte) 10);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) 10 + "'", obj10, (byte) 10);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 1.0f + "'", obj19, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + (byte) 10 + "'", obj27, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + 1.0f + "'", obj34, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(iterator39);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + 0L + "'", obj40, 0L);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + 1.0f + "'", obj48, 1.0f);
        org.junit.Assert.assertEquals("'" + obj53 + "' != '" + (byte) 10 + "'", obj53, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray59), "[false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray59), "[false]");
        org.junit.Assert.assertEquals("'" + obj67 + "' != '" + 1.0f + "'", obj67, 1.0f);
        org.junit.Assert.assertEquals("'" + obj68 + "' != '" + 1.0f + "'", obj68, 1.0f);
        org.junit.Assert.assertEquals("'" + obj72 + "' != '" + (byte) 10 + "'", obj72, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(iterator75);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test132");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj6 = linkedListTestDriver0.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver7.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver7.addFirst((java.lang.Object) 10);
        boolean boolean12 = linkedListTestDriver0.contains((java.lang.Object) 10);
        java.lang.Object obj13 = linkedListTestDriver0.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver14 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver14.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver14.clear();
        linkedListTestDriver14.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj20 = linkedListTestDriver14.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver21 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver21.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj24 = linkedListTestDriver21.getFirst();
        boolean boolean26 = linkedListTestDriver21.remove((java.lang.Object) 1);
        boolean boolean27 = linkedListTestDriver14.remove((java.lang.Object) linkedListTestDriver21);
        experiment.util.LinkedListTestDriver linkedListTestDriver28 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver28.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver28.clear();
        linkedListTestDriver28.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj34 = linkedListTestDriver28.getLast();
        experiment.util.Iterator iterator35 = linkedListTestDriver28.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver36 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver36.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj39 = linkedListTestDriver36.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver40 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver40.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver40.clear();
        linkedListTestDriver40.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj46 = linkedListTestDriver40.getLast();
        linkedListTestDriver40.clear();
        linkedListTestDriver36.addLast((java.lang.Object) linkedListTestDriver40);
        boolean boolean49 = linkedListTestDriver28.add((java.lang.Object) linkedListTestDriver36);
        int int50 = linkedListTestDriver28.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver51 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver51.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver51.clear();
        linkedListTestDriver51.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj57 = linkedListTestDriver51.getLast();
        experiment.util.Iterator iterator58 = linkedListTestDriver51.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver59 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver59.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj62 = linkedListTestDriver59.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver63 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver63.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver63.clear();
        linkedListTestDriver63.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj69 = linkedListTestDriver63.getLast();
        linkedListTestDriver63.clear();
        linkedListTestDriver59.addLast((java.lang.Object) linkedListTestDriver63);
        boolean boolean72 = linkedListTestDriver51.add((java.lang.Object) linkedListTestDriver59);
        java.lang.Class<?> wildcardClass73 = linkedListTestDriver59.getClass();
        linkedListTestDriver28.addLast((java.lang.Object) wildcardClass73);
        linkedListTestDriver21.addFirst((java.lang.Object) wildcardClass73);
        experiment.util.LinkedListTestDriver linkedListTestDriver76 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver76.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj79 = linkedListTestDriver76.getFirst();
        boolean boolean81 = linkedListTestDriver76.remove((java.lang.Object) 1);
        boolean boolean82 = linkedListTestDriver21.equals_CUT((java.lang.Object) boolean81);
        boolean boolean83 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver21);
        experiment.util.LinkedListTestDriver linkedListTestDriver84 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver84.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj87 = linkedListTestDriver84.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver88 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver88.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver88.clear();
        linkedListTestDriver88.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj94 = linkedListTestDriver88.getLast();
        linkedListTestDriver88.clear();
        linkedListTestDriver84.addLast((java.lang.Object) linkedListTestDriver88);
        experiment.util.Iterator iterator97 = linkedListTestDriver84.iterator();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver84);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0f + "'", obj6, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 1.0f + "'", obj13, 1.0f);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 1.0f + "'", obj20, 1.0f);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (byte) 10 + "'", obj24, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + 1.0f + "'", obj34, 1.0f);
        org.junit.Assert.assertNotNull(iterator35);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + (byte) 10 + "'", obj39, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + 1.0f + "'", obj46, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 2 + "'", int50 == 2);
        org.junit.Assert.assertEquals("'" + obj57 + "' != '" + 1.0f + "'", obj57, 1.0f);
        org.junit.Assert.assertNotNull(iterator58);
        org.junit.Assert.assertEquals("'" + obj62 + "' != '" + (byte) 10 + "'", obj62, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj69 + "' != '" + 1.0f + "'", obj69, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(wildcardClass73);
        org.junit.Assert.assertEquals("'" + obj79 + "' != '" + (byte) 10 + "'", obj79, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertEquals("'" + obj87 + "' != '" + (byte) 10 + "'", obj87, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj94 + "' != '" + 1.0f + "'", obj94, 1.0f);
        org.junit.Assert.assertNotNull(iterator97);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test133");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj3 = linkedListTestDriver0.removeLast();
        experiment.util.Iterator iterator4 = linkedListTestDriver0.iterator();
        linkedListTestDriver0.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver6.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver6.clear();
        linkedListTestDriver6.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj12 = linkedListTestDriver6.getLast();
        java.lang.Object obj13 = new java.lang.Object();
        linkedListTestDriver6.addLast(obj13);
        boolean boolean15 = linkedListTestDriver0.add(obj13);
        int int16 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver18 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver18.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj21 = linkedListTestDriver18.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver22 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver22.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver22.clear();
        linkedListTestDriver22.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj28 = linkedListTestDriver22.getLast();
        linkedListTestDriver22.clear();
        linkedListTestDriver18.addLast((java.lang.Object) linkedListTestDriver22);
        boolean boolean32 = linkedListTestDriver18.add((java.lang.Object) 0L);
        experiment.util.Iterator iterator33 = linkedListTestDriver18.iterator();
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.add((int) (short) -1, (java.lang.Object) linkedListTestDriver18);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: -1; size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 10 + "'", obj3, (byte) 10);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 1.0f + "'", obj12, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (byte) 10 + "'", obj21, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + 1.0f + "'", obj28, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(iterator33);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test134");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.addLast((java.lang.Object) 1.0f);
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver6.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver6.clear();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver6);
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver12.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver12.clear();
        linkedListTestDriver12.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj18 = linkedListTestDriver12.getLast();
        java.lang.Object obj19 = linkedListTestDriver12.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver20 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver20.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj23 = linkedListTestDriver20.removeFirst();
        boolean boolean24 = linkedListTestDriver12.equals_CUT((java.lang.Object) linkedListTestDriver20);
        linkedListTestDriver20.clear();
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver6.add((int) (short) 1, (java.lang.Object) linkedListTestDriver20);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 1; size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 1.0f + "'", obj18, 1.0f);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 1.0f + "'", obj19, 1.0f);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (byte) 10 + "'", obj23, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test135");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.addLast((java.lang.Object) 1.0f);
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver6.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver6.clear();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver6);
        java.lang.Object obj11 = linkedListTestDriver0.getFirst();
        java.lang.Object[] objArray12 = linkedListTestDriver0.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = linkedListTestDriver0.get((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(objArray12);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test136");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver2 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver2.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj5 = linkedListTestDriver2.getFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver6.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver6.clear();
        linkedListTestDriver6.addLast((java.lang.Object) 1.0f);
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver12.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver12.clear();
        linkedListTestDriver6.addFirst((java.lang.Object) linkedListTestDriver12);
        int int17 = linkedListTestDriver6.size();
        linkedListTestDriver2.addFirst((java.lang.Object) int17);
        experiment.util.LinkedListTestDriver linkedListTestDriver19 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver19.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver19.clear();
        linkedListTestDriver19.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj25 = linkedListTestDriver19.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver26 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver26.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver26.addFirst((java.lang.Object) 10);
        boolean boolean31 = linkedListTestDriver19.contains((java.lang.Object) 10);
        boolean boolean32 = linkedListTestDriver2.remove((java.lang.Object) linkedListTestDriver19);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj33 = linkedListTestDriver0.set((int) (short) 10, (java.lang.Object) linkedListTestDriver19);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) 10 + "'", obj5, (byte) 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 1.0f + "'", obj25, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test137");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver5.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver5.clear();
        linkedListTestDriver5.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj11 = linkedListTestDriver5.getLast();
        linkedListTestDriver5.clear();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver5);
        experiment.util.LinkedListTestDriver linkedListTestDriver14 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver14.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj17 = linkedListTestDriver14.removeLast();
        experiment.util.Iterator iterator18 = linkedListTestDriver14.iterator();
        linkedListTestDriver14.clear();
        boolean boolean20 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver14);
        java.lang.Object obj21 = linkedListTestDriver0.getLast();
        java.lang.Object obj22 = linkedListTestDriver0.removeLast();
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 1.0f + "'", obj11, 1.0f);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) 10 + "'", obj17, (byte) 10);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(obj22);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test138");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj6 = linkedListTestDriver0.getLast();
        experiment.util.Iterator iterator7 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver8.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj11 = linkedListTestDriver8.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver12.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver12.clear();
        linkedListTestDriver12.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj18 = linkedListTestDriver12.getLast();
        linkedListTestDriver12.clear();
        linkedListTestDriver8.addLast((java.lang.Object) linkedListTestDriver12);
        boolean boolean21 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver8);
        experiment.util.LinkedListTestDriver linkedListTestDriver22 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver22.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver22.clear();
        linkedListTestDriver22.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj28 = linkedListTestDriver22.getLast();
        experiment.util.Iterator iterator29 = linkedListTestDriver22.iterator();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver22);
        experiment.util.ListIterator listIterator32 = linkedListTestDriver22.listIterator((int) (byte) 0);
        java.lang.Object obj33 = linkedListTestDriver22.getLast();
        boolean boolean35 = linkedListTestDriver22.add((java.lang.Object) (-1.0d));
        java.lang.Class<?> wildcardClass36 = linkedListTestDriver22.getClass();
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0f + "'", obj6, 1.0f);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 10 + "'", obj11, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 1.0f + "'", obj18, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + 1.0f + "'", obj28, 1.0f);
        org.junit.Assert.assertNotNull(iterator29);
        org.junit.Assert.assertNotNull(listIterator32);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + 1.0f + "'", obj33, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test139");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj7 = linkedListTestDriver0.remove(0);
        boolean boolean9 = linkedListTestDriver0.remove((java.lang.Object) (short) 100);
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver10.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver10.clear();
        linkedListTestDriver10.addLast((java.lang.Object) 1.0f);
        experiment.util.LinkedListTestDriver linkedListTestDriver16 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver16.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver16.clear();
        linkedListTestDriver10.addFirst((java.lang.Object) linkedListTestDriver16);
        java.lang.Object obj21 = linkedListTestDriver10.getFirst();
        boolean boolean22 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver10);
        experiment.util.LinkedListTestDriver linkedListTestDriver23 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver23.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver23.clear();
        linkedListTestDriver23.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj30 = linkedListTestDriver23.remove(0);
        boolean boolean32 = linkedListTestDriver23.remove((java.lang.Object) (short) 100);
        experiment.util.LinkedListTestDriver linkedListTestDriver33 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver33.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver33.clear();
        linkedListTestDriver33.addLast((java.lang.Object) 1.0f);
        experiment.util.LinkedListTestDriver linkedListTestDriver39 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver39.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver39.clear();
        linkedListTestDriver33.addFirst((java.lang.Object) linkedListTestDriver39);
        java.lang.Object obj44 = linkedListTestDriver33.getFirst();
        boolean boolean45 = linkedListTestDriver23.contains((java.lang.Object) linkedListTestDriver33);
        java.lang.Object[] objArray46 = linkedListTestDriver33.toArray();
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver33);
        int int48 = linkedListTestDriver33.size();
        java.lang.Class<?> wildcardClass49 = linkedListTestDriver33.getClass();
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1.0f + "'", obj7, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + 1.0f + "'", obj30, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 2 + "'", int48 == 2);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test140");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj6 = linkedListTestDriver0.getLast();
        experiment.util.Iterator iterator7 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver8.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj11 = linkedListTestDriver8.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver12.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver12.clear();
        linkedListTestDriver12.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj18 = linkedListTestDriver12.getLast();
        linkedListTestDriver12.clear();
        linkedListTestDriver8.addLast((java.lang.Object) linkedListTestDriver12);
        boolean boolean21 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver8);
        experiment.util.LinkedListTestDriver linkedListTestDriver22 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver22.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj25 = linkedListTestDriver22.removeLast();
        experiment.util.Iterator iterator26 = linkedListTestDriver22.iterator();
        linkedListTestDriver22.clear();
        experiment.util.Iterator iterator28 = linkedListTestDriver22.iterator();
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver22);
        experiment.util.LinkedListTestDriver linkedListTestDriver30 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver30.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj33 = linkedListTestDriver30.getFirst();
        boolean boolean35 = linkedListTestDriver30.remove((java.lang.Object) 1);
        java.lang.Object obj37 = linkedListTestDriver30.get((int) (short) 0);
        experiment.util.LinkedListTestDriver linkedListTestDriver38 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver38.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver38.clear();
        linkedListTestDriver38.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj44 = linkedListTestDriver38.getLast();
        experiment.util.Iterator iterator45 = linkedListTestDriver38.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver46 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver46.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj49 = linkedListTestDriver46.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver50 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver50.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver50.clear();
        linkedListTestDriver50.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj56 = linkedListTestDriver50.getLast();
        linkedListTestDriver50.clear();
        linkedListTestDriver46.addLast((java.lang.Object) linkedListTestDriver50);
        boolean boolean59 = linkedListTestDriver38.add((java.lang.Object) linkedListTestDriver46);
        experiment.util.ListIterator listIterator61 = linkedListTestDriver38.listIterator((int) (byte) 1);
        linkedListTestDriver30.addLast((java.lang.Object) linkedListTestDriver38);
        linkedListTestDriver22.addLast((java.lang.Object) linkedListTestDriver38);
        int int64 = linkedListTestDriver38.size();
        linkedListTestDriver38.clear();
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0f + "'", obj6, 1.0f);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 10 + "'", obj11, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 1.0f + "'", obj18, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (byte) 10 + "'", obj25, (byte) 10);
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertNotNull(iterator28);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + (byte) 10 + "'", obj33, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + (byte) 10 + "'", obj37, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + 1.0f + "'", obj44, 1.0f);
        org.junit.Assert.assertNotNull(iterator45);
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + (byte) 10 + "'", obj49, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj56 + "' != '" + 1.0f + "'", obj56, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(listIterator61);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 2 + "'", int64 == 2);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test141");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj7 = linkedListTestDriver0.remove(0);
        boolean boolean9 = linkedListTestDriver0.remove((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator10 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver11.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver11.clear();
        linkedListTestDriver11.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj17 = linkedListTestDriver11.getLast();
        linkedListTestDriver11.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver19 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver19.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj22 = linkedListTestDriver19.getFirst();
        boolean boolean24 = linkedListTestDriver19.remove((java.lang.Object) 1);
        boolean boolean25 = linkedListTestDriver11.remove((java.lang.Object) 1);
        boolean boolean26 = linkedListTestDriver0.remove((java.lang.Object) boolean25);
        experiment.util.LinkedListTestDriver linkedListTestDriver27 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver27.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj30 = linkedListTestDriver27.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver31 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver31.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver31.clear();
        linkedListTestDriver31.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj37 = linkedListTestDriver31.getLast();
        linkedListTestDriver31.clear();
        linkedListTestDriver27.addLast((java.lang.Object) linkedListTestDriver31);
        boolean boolean41 = linkedListTestDriver27.add((java.lang.Object) 0L);
        java.lang.Object obj42 = linkedListTestDriver27.getFirst();
        boolean boolean43 = linkedListTestDriver0.add(obj42);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1.0f + "'", obj7, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 1.0f + "'", obj17, 1.0f);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (byte) 10 + "'", obj22, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + (byte) 10 + "'", obj30, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + 1.0f + "'", obj37, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test142");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj3 = linkedListTestDriver0.removeLast();
        experiment.util.Iterator iterator4 = linkedListTestDriver0.iterator();
        boolean boolean6 = linkedListTestDriver0.contains((java.lang.Object) "hi!");
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver7.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj10 = linkedListTestDriver7.removeLast();
        experiment.util.Iterator iterator11 = linkedListTestDriver7.iterator();
        linkedListTestDriver7.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver13.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver13.clear();
        linkedListTestDriver13.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj19 = linkedListTestDriver13.getLast();
        java.lang.Object obj20 = new java.lang.Object();
        linkedListTestDriver13.addLast(obj20);
        boolean boolean22 = linkedListTestDriver7.add(obj20);
        boolean boolean23 = linkedListTestDriver0.remove((java.lang.Object) boolean22);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = linkedListTestDriver0.getLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 10 + "'", obj3, (byte) 10);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) 10 + "'", obj10, (byte) 10);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 1.0f + "'", obj19, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test143");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj6 = linkedListTestDriver0.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver7.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver7.addFirst((java.lang.Object) 10);
        boolean boolean12 = linkedListTestDriver0.contains((java.lang.Object) 10);
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver13.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj16 = linkedListTestDriver13.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver17.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver17.clear();
        linkedListTestDriver17.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj23 = linkedListTestDriver17.getLast();
        linkedListTestDriver17.clear();
        linkedListTestDriver13.addLast((java.lang.Object) linkedListTestDriver17);
        experiment.util.Iterator iterator26 = linkedListTestDriver13.iterator();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver13);
        boolean boolean28 = linkedListTestDriver0.isEmpty();
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0f + "'", obj6, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (byte) 10 + "'", obj16, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 1.0f + "'", obj23, 1.0f);
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test144");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj6 = linkedListTestDriver0.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver7.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver7.addFirst((java.lang.Object) 10);
        boolean boolean12 = linkedListTestDriver0.contains((java.lang.Object) 10);
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator14 = linkedListTestDriver0.listIterator((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: -1; size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0f + "'", obj6, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test145");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj6 = linkedListTestDriver0.getLast();
        experiment.util.Iterator iterator7 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver8.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj11 = linkedListTestDriver8.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver12.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver12.clear();
        linkedListTestDriver12.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj18 = linkedListTestDriver12.getLast();
        linkedListTestDriver12.clear();
        linkedListTestDriver8.addLast((java.lang.Object) linkedListTestDriver12);
        boolean boolean21 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver8);
        experiment.util.LinkedListTestDriver linkedListTestDriver22 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver22.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj25 = linkedListTestDriver22.removeLast();
        experiment.util.Iterator iterator26 = linkedListTestDriver22.iterator();
        linkedListTestDriver22.clear();
        experiment.util.Iterator iterator28 = linkedListTestDriver22.iterator();
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver22);
        experiment.util.LinkedListTestDriver linkedListTestDriver30 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver30.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver30.clear();
        linkedListTestDriver30.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj36 = linkedListTestDriver30.getLast();
        experiment.util.Iterator iterator37 = linkedListTestDriver30.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver38 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver38.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj41 = linkedListTestDriver38.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver42 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver42.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver42.clear();
        linkedListTestDriver42.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj48 = linkedListTestDriver42.getLast();
        linkedListTestDriver42.clear();
        linkedListTestDriver38.addLast((java.lang.Object) linkedListTestDriver42);
        boolean boolean51 = linkedListTestDriver30.add((java.lang.Object) linkedListTestDriver38);
        experiment.util.ListIterator listIterator53 = linkedListTestDriver30.listIterator((int) (byte) 1);
        experiment.util.ListIterator listIterator55 = linkedListTestDriver30.listIterator((int) (byte) 1);
        boolean boolean56 = linkedListTestDriver22.add((java.lang.Object) (byte) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver57 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver57.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver57.clear();
        linkedListTestDriver57.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj63 = linkedListTestDriver57.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver64 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver64.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver64.addFirst((java.lang.Object) 10);
        boolean boolean69 = linkedListTestDriver57.contains((java.lang.Object) 10);
        experiment.util.LinkedListTestDriver linkedListTestDriver70 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver71 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver71.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj74 = linkedListTestDriver71.removeLast();
        experiment.util.Iterator iterator75 = linkedListTestDriver71.iterator();
        linkedListTestDriver70.addLast((java.lang.Object) iterator75);
        boolean boolean77 = linkedListTestDriver57.remove((java.lang.Object) iterator75);
        experiment.util.LinkedListTestDriver linkedListTestDriver78 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver78.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj81 = linkedListTestDriver78.removeLast();
        experiment.util.Iterator iterator82 = linkedListTestDriver78.iterator();
        boolean boolean84 = linkedListTestDriver78.contains((java.lang.Object) "hi!");
        boolean boolean85 = linkedListTestDriver57.contains((java.lang.Object) linkedListTestDriver78);
        linkedListTestDriver22.addLast((java.lang.Object) linkedListTestDriver78);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj88 = linkedListTestDriver78.get(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0f + "'", obj6, 1.0f);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 10 + "'", obj11, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 1.0f + "'", obj18, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (byte) 10 + "'", obj25, (byte) 10);
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertNotNull(iterator28);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + 1.0f + "'", obj36, 1.0f);
        org.junit.Assert.assertNotNull(iterator37);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + (byte) 10 + "'", obj41, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + 1.0f + "'", obj48, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(listIterator53);
        org.junit.Assert.assertNotNull(listIterator55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertEquals("'" + obj63 + "' != '" + 1.0f + "'", obj63, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertEquals("'" + obj74 + "' != '" + (byte) 10 + "'", obj74, (byte) 10);
        org.junit.Assert.assertNotNull(iterator75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertEquals("'" + obj81 + "' != '" + (byte) 10 + "'", obj81, (byte) 10);
        org.junit.Assert.assertNotNull(iterator82);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test146");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj3 = linkedListTestDriver0.getFirst();
        boolean boolean5 = linkedListTestDriver0.remove((java.lang.Object) 1);
        java.lang.Object obj7 = linkedListTestDriver0.get((int) (short) 0);
        java.lang.Object obj8 = linkedListTestDriver0.getFirst();
        boolean boolean9 = linkedListTestDriver0.isEmpty();
        java.lang.Class<?> wildcardClass10 = linkedListTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 10 + "'", obj3, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 10 + "'", obj7, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) 10 + "'", obj8, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test147");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj6 = linkedListTestDriver0.getLast();
        java.lang.Object obj7 = new java.lang.Object();
        linkedListTestDriver0.addLast(obj7);
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver9.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver9.clear();
        linkedListTestDriver9.addLast((java.lang.Object) 1.0f);
        experiment.util.LinkedListTestDriver linkedListTestDriver15 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver15.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver15.clear();
        linkedListTestDriver9.addFirst((java.lang.Object) linkedListTestDriver15);
        experiment.util.LinkedListTestDriver linkedListTestDriver20 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver20.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj23 = linkedListTestDriver20.removeLast();
        experiment.util.Iterator iterator24 = linkedListTestDriver20.iterator();
        linkedListTestDriver20.clear();
        experiment.util.Iterator iterator26 = linkedListTestDriver20.iterator();
        boolean boolean27 = linkedListTestDriver15.remove((java.lang.Object) iterator26);
        experiment.util.Iterator iterator28 = linkedListTestDriver15.iterator();
        java.lang.Object[] objArray29 = linkedListTestDriver15.toArray();
        boolean boolean30 = linkedListTestDriver0.remove((java.lang.Object) objArray29);
        java.lang.Class<?> wildcardClass31 = linkedListTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0f + "'", obj6, 1.0f);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (byte) 10 + "'", obj23, (byte) 10);
        org.junit.Assert.assertNotNull(iterator24);
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(iterator28);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test148");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.addLast((java.lang.Object) 1.0f);
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver6.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver6.clear();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver6);
        boolean boolean11 = linkedListTestDriver6.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test149");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj3 = linkedListTestDriver0.getFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver4.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver4.clear();
        linkedListTestDriver4.addLast((java.lang.Object) 1.0f);
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver10.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver10.clear();
        linkedListTestDriver4.addFirst((java.lang.Object) linkedListTestDriver10);
        int int15 = linkedListTestDriver4.size();
        linkedListTestDriver0.addFirst((java.lang.Object) int15);
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver17.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver17.clear();
        linkedListTestDriver17.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj23 = linkedListTestDriver17.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver24 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver24.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver24.addFirst((java.lang.Object) 10);
        boolean boolean29 = linkedListTestDriver17.contains((java.lang.Object) 10);
        boolean boolean30 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver17);
        experiment.util.LinkedListTestDriver linkedListTestDriver31 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver32 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver32.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj35 = linkedListTestDriver32.removeLast();
        experiment.util.Iterator iterator36 = linkedListTestDriver32.iterator();
        linkedListTestDriver31.addLast((java.lang.Object) iterator36);
        linkedListTestDriver17.addFirst((java.lang.Object) iterator36);
        linkedListTestDriver17.addLast((java.lang.Object) 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj42 = linkedListTestDriver17.get((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 10 + "'", obj3, (byte) 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 1.0f + "'", obj23, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + (byte) 10 + "'", obj35, (byte) 10);
        org.junit.Assert.assertNotNull(iterator36);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test150");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj3 = linkedListTestDriver0.getFirst();
        boolean boolean5 = linkedListTestDriver0.remove((java.lang.Object) 1);
        java.lang.Object obj7 = linkedListTestDriver0.get((int) (short) 0);
        java.lang.Object obj8 = linkedListTestDriver0.getFirst();
        boolean boolean9 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver11.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj14 = linkedListTestDriver11.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver15 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver15.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver15.clear();
        linkedListTestDriver15.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj21 = linkedListTestDriver15.getLast();
        linkedListTestDriver15.clear();
        linkedListTestDriver11.addLast((java.lang.Object) linkedListTestDriver15);
        boolean boolean25 = linkedListTestDriver11.add((java.lang.Object) 0L);
        experiment.util.Iterator iterator26 = linkedListTestDriver11.iterator();
        java.lang.Object obj27 = linkedListTestDriver11.removeLast();
        boolean boolean28 = linkedListTestDriver11.isEmpty();
        java.lang.Object[] objArray29 = linkedListTestDriver11.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj30 = linkedListTestDriver0.set((-1), (java.lang.Object) linkedListTestDriver11);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 10 + "'", obj3, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 10 + "'", obj7, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) 10 + "'", obj8, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (byte) 10 + "'", obj14, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 1.0f + "'", obj21, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 0L + "'", obj27, 0L);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(objArray29);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test151");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj3 = linkedListTestDriver0.getFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver4.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver4.clear();
        linkedListTestDriver4.addLast((java.lang.Object) 1.0f);
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver10.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver10.clear();
        linkedListTestDriver4.addFirst((java.lang.Object) linkedListTestDriver10);
        int int15 = linkedListTestDriver4.size();
        linkedListTestDriver0.addFirst((java.lang.Object) int15);
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver17.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver17.clear();
        linkedListTestDriver17.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj23 = linkedListTestDriver17.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver24 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver24.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver24.addFirst((java.lang.Object) 10);
        boolean boolean29 = linkedListTestDriver17.contains((java.lang.Object) 10);
        boolean boolean30 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver17);
        java.lang.Object obj31 = linkedListTestDriver17.getFirst();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj33 = linkedListTestDriver17.remove((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 10 + "'", obj3, (byte) 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 1.0f + "'", obj23, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 1.0f + "'", obj31, 1.0f);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test152");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj6 = linkedListTestDriver0.getLast();
        experiment.util.Iterator iterator7 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver8.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj11 = linkedListTestDriver8.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver12.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver12.clear();
        linkedListTestDriver12.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj18 = linkedListTestDriver12.getLast();
        linkedListTestDriver12.clear();
        linkedListTestDriver8.addLast((java.lang.Object) linkedListTestDriver12);
        boolean boolean21 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver8);
        boolean boolean22 = linkedListTestDriver0.isEmpty();
        java.lang.Object obj23 = linkedListTestDriver0.removeFirst();
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0f + "'", obj6, 1.0f);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 10 + "'", obj11, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 1.0f + "'", obj18, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 1.0f + "'", obj23, 1.0f);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test153");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj6 = linkedListTestDriver0.getLast();
        experiment.util.Iterator iterator7 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver8.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj11 = linkedListTestDriver8.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver12.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver12.clear();
        linkedListTestDriver12.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj18 = linkedListTestDriver12.getLast();
        linkedListTestDriver12.clear();
        linkedListTestDriver8.addLast((java.lang.Object) linkedListTestDriver12);
        boolean boolean21 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver8);
        experiment.util.LinkedListTestDriver linkedListTestDriver22 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver22.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj25 = linkedListTestDriver22.removeLast();
        experiment.util.Iterator iterator26 = linkedListTestDriver22.iterator();
        linkedListTestDriver22.clear();
        experiment.util.Iterator iterator28 = linkedListTestDriver22.iterator();
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver22);
        experiment.util.LinkedListTestDriver linkedListTestDriver31 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver31.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj34 = linkedListTestDriver31.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver35 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver35.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver35.clear();
        linkedListTestDriver35.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj41 = linkedListTestDriver35.getLast();
        linkedListTestDriver35.clear();
        linkedListTestDriver31.addLast((java.lang.Object) linkedListTestDriver35);
        boolean boolean45 = linkedListTestDriver31.add((java.lang.Object) 0L);
        java.lang.Object obj47 = linkedListTestDriver31.remove((int) (short) 0);
        java.lang.Object obj48 = linkedListTestDriver0.set((int) (byte) 0, (java.lang.Object) (short) 0);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0f + "'", obj6, 1.0f);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 10 + "'", obj11, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 1.0f + "'", obj18, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (byte) 10 + "'", obj25, (byte) 10);
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertNotNull(iterator28);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + (byte) 10 + "'", obj34, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + 1.0f + "'", obj41, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + 1.0f + "'", obj48, 1.0f);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test154");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj3 = linkedListTestDriver0.getFirst();
        boolean boolean5 = linkedListTestDriver0.remove((java.lang.Object) 1);
        java.lang.Object obj7 = linkedListTestDriver0.get((int) (short) 0);
        java.lang.Object obj8 = linkedListTestDriver0.removeLast();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = linkedListTestDriver0.get(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 10 + "'", obj3, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 10 + "'", obj7, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) 10 + "'", obj8, (byte) 10);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test155");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj6 = linkedListTestDriver0.getLast();
        experiment.util.Iterator iterator7 = linkedListTestDriver0.iterator();
        boolean boolean9 = linkedListTestDriver0.contains((java.lang.Object) true);
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver10.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj13 = linkedListTestDriver10.getFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver14 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver14.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver14.clear();
        linkedListTestDriver14.addLast((java.lang.Object) 1.0f);
        experiment.util.LinkedListTestDriver linkedListTestDriver20 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver20.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver20.clear();
        linkedListTestDriver14.addFirst((java.lang.Object) linkedListTestDriver20);
        int int25 = linkedListTestDriver14.size();
        linkedListTestDriver10.addFirst((java.lang.Object) int25);
        experiment.util.LinkedListTestDriver linkedListTestDriver27 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver27.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver27.clear();
        linkedListTestDriver27.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj33 = linkedListTestDriver27.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver34 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver34.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver34.addFirst((java.lang.Object) 10);
        boolean boolean39 = linkedListTestDriver27.contains((java.lang.Object) 10);
        boolean boolean40 = linkedListTestDriver10.remove((java.lang.Object) linkedListTestDriver27);
        java.lang.Object obj41 = linkedListTestDriver27.getLast();
        java.lang.Object obj42 = linkedListTestDriver27.removeLast();
        boolean boolean43 = linkedListTestDriver0.contains(obj42);
        experiment.util.LinkedListTestDriver linkedListTestDriver44 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver44.addFirst((java.lang.Object) (byte) 10);
        experiment.util.LinkedListTestDriver linkedListTestDriver47 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver47.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj50 = linkedListTestDriver47.removeLast();
        experiment.util.Iterator iterator51 = linkedListTestDriver47.iterator();
        linkedListTestDriver47.clear();
        experiment.util.Iterator iterator53 = linkedListTestDriver47.iterator();
        java.lang.Class<?> wildcardClass54 = iterator53.getClass();
        linkedListTestDriver44.addLast((java.lang.Object) iterator53);
        java.lang.Class<?> wildcardClass56 = iterator53.getClass();
        boolean boolean57 = linkedListTestDriver0.contains((java.lang.Object) iterator53);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0f + "'", obj6, 1.0f);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (byte) 10 + "'", obj13, (byte) 10);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + 1.0f + "'", obj33, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + 1.0f + "'", obj41, 1.0f);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + 1.0f + "'", obj42, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + (byte) 10 + "'", obj50, (byte) 10);
        org.junit.Assert.assertNotNull(iterator51);
        org.junit.Assert.assertNotNull(iterator53);
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertNotNull(wildcardClass56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test156");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj6 = linkedListTestDriver0.getLast();
        experiment.util.Iterator iterator7 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver8.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj11 = linkedListTestDriver8.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver12.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver12.clear();
        linkedListTestDriver12.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj18 = linkedListTestDriver12.getLast();
        linkedListTestDriver12.clear();
        linkedListTestDriver8.addLast((java.lang.Object) linkedListTestDriver12);
        boolean boolean21 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver8);
        experiment.util.LinkedListTestDriver linkedListTestDriver22 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver22.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj25 = linkedListTestDriver22.removeLast();
        experiment.util.Iterator iterator26 = linkedListTestDriver22.iterator();
        linkedListTestDriver22.clear();
        experiment.util.Iterator iterator28 = linkedListTestDriver22.iterator();
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver22);
        experiment.util.LinkedListTestDriver linkedListTestDriver30 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver30.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj33 = linkedListTestDriver30.getFirst();
        boolean boolean35 = linkedListTestDriver30.remove((java.lang.Object) 1);
        java.lang.Object obj37 = linkedListTestDriver30.get((int) (short) 0);
        experiment.util.LinkedListTestDriver linkedListTestDriver38 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver38.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver38.clear();
        linkedListTestDriver38.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj44 = linkedListTestDriver38.getLast();
        experiment.util.Iterator iterator45 = linkedListTestDriver38.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver46 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver46.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj49 = linkedListTestDriver46.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver50 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver50.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver50.clear();
        linkedListTestDriver50.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj56 = linkedListTestDriver50.getLast();
        linkedListTestDriver50.clear();
        linkedListTestDriver46.addLast((java.lang.Object) linkedListTestDriver50);
        boolean boolean59 = linkedListTestDriver38.add((java.lang.Object) linkedListTestDriver46);
        experiment.util.ListIterator listIterator61 = linkedListTestDriver38.listIterator((int) (byte) 1);
        linkedListTestDriver30.addLast((java.lang.Object) linkedListTestDriver38);
        linkedListTestDriver22.addLast((java.lang.Object) linkedListTestDriver38);
        int int64 = linkedListTestDriver38.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver65 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver65.addFirst((java.lang.Object) (byte) 10);
        experiment.util.LinkedListTestDriver linkedListTestDriver68 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver68.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj71 = linkedListTestDriver68.removeLast();
        experiment.util.Iterator iterator72 = linkedListTestDriver68.iterator();
        linkedListTestDriver68.clear();
        experiment.util.Iterator iterator74 = linkedListTestDriver68.iterator();
        java.lang.Class<?> wildcardClass75 = iterator74.getClass();
        linkedListTestDriver65.addLast((java.lang.Object) iterator74);
        java.lang.Object[] objArray77 = linkedListTestDriver65.toArray();
        linkedListTestDriver38.addFirst((java.lang.Object) linkedListTestDriver65);
        linkedListTestDriver65.clear();
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0f + "'", obj6, 1.0f);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 10 + "'", obj11, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 1.0f + "'", obj18, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (byte) 10 + "'", obj25, (byte) 10);
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertNotNull(iterator28);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + (byte) 10 + "'", obj33, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + (byte) 10 + "'", obj37, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + 1.0f + "'", obj44, 1.0f);
        org.junit.Assert.assertNotNull(iterator45);
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + (byte) 10 + "'", obj49, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj56 + "' != '" + 1.0f + "'", obj56, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(listIterator61);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 2 + "'", int64 == 2);
        org.junit.Assert.assertEquals("'" + obj71 + "' != '" + (byte) 10 + "'", obj71, (byte) 10);
        org.junit.Assert.assertNotNull(iterator72);
        org.junit.Assert.assertNotNull(iterator74);
        org.junit.Assert.assertNotNull(wildcardClass75);
        org.junit.Assert.assertNotNull(objArray77);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test157");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver5.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver5.clear();
        linkedListTestDriver5.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj11 = linkedListTestDriver5.getLast();
        linkedListTestDriver5.clear();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver5);
        experiment.util.LinkedListTestDriver linkedListTestDriver14 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver14.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj17 = linkedListTestDriver14.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver18 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver18.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver18.clear();
        linkedListTestDriver18.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj24 = linkedListTestDriver18.getLast();
        linkedListTestDriver18.clear();
        linkedListTestDriver14.addLast((java.lang.Object) linkedListTestDriver18);
        boolean boolean28 = linkedListTestDriver14.add((java.lang.Object) 0L);
        java.lang.Object obj30 = linkedListTestDriver14.remove((int) (short) 0);
        boolean boolean31 = linkedListTestDriver0.contains(obj30);
        java.lang.Object[] objArray32 = linkedListTestDriver0.toArray();
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 1.0f + "'", obj11, 1.0f);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) 10 + "'", obj17, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 1.0f + "'", obj24, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(objArray32);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test158");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj3 = linkedListTestDriver0.removeLast();
        experiment.util.Iterator iterator4 = linkedListTestDriver0.iterator();
        linkedListTestDriver0.clear();
        java.lang.Object[] objArray6 = linkedListTestDriver0.toArray();
        java.lang.Class<?> wildcardClass7 = linkedListTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 10 + "'", obj3, (byte) 10);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test159");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj6 = linkedListTestDriver0.getLast();
        java.lang.Object obj7 = linkedListTestDriver0.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver8.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj11 = linkedListTestDriver8.removeFirst();
        boolean boolean12 = linkedListTestDriver0.equals_CUT((java.lang.Object) linkedListTestDriver8);
        experiment.util.LinkedListTestDriver linkedListTestDriver14 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver14.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver14.clear();
        linkedListTestDriver14.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj21 = linkedListTestDriver14.remove(0);
        boolean boolean23 = linkedListTestDriver14.remove((java.lang.Object) (short) 100);
        experiment.util.LinkedListTestDriver linkedListTestDriver24 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver24.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver24.clear();
        linkedListTestDriver24.addLast((java.lang.Object) 1.0f);
        experiment.util.LinkedListTestDriver linkedListTestDriver30 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver30.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver30.clear();
        linkedListTestDriver24.addFirst((java.lang.Object) linkedListTestDriver30);
        java.lang.Object obj35 = linkedListTestDriver24.getFirst();
        boolean boolean36 = linkedListTestDriver14.contains((java.lang.Object) linkedListTestDriver24);
        experiment.util.LinkedListTestDriver linkedListTestDriver37 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver37.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver37.clear();
        linkedListTestDriver37.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj44 = linkedListTestDriver37.remove(0);
        boolean boolean46 = linkedListTestDriver37.remove((java.lang.Object) (short) 100);
        experiment.util.LinkedListTestDriver linkedListTestDriver47 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver47.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver47.clear();
        linkedListTestDriver47.addLast((java.lang.Object) 1.0f);
        experiment.util.LinkedListTestDriver linkedListTestDriver53 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver53.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver53.clear();
        linkedListTestDriver47.addFirst((java.lang.Object) linkedListTestDriver53);
        java.lang.Object obj58 = linkedListTestDriver47.getFirst();
        boolean boolean59 = linkedListTestDriver37.contains((java.lang.Object) linkedListTestDriver47);
        java.lang.Object[] objArray60 = linkedListTestDriver47.toArray();
        linkedListTestDriver14.addLast((java.lang.Object) linkedListTestDriver47);
        java.lang.Object obj62 = linkedListTestDriver47.removeFirst();
        java.lang.Object obj63 = linkedListTestDriver0.set(0, (java.lang.Object) linkedListTestDriver47);
        experiment.util.LinkedListTestDriver linkedListTestDriver65 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver65.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver65.clear();
        linkedListTestDriver65.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj71 = linkedListTestDriver65.getLast();
        java.lang.Object obj72 = new java.lang.Object();
        linkedListTestDriver65.addLast(obj72);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj74 = linkedListTestDriver47.set((int) (byte) -1, (java.lang.Object) linkedListTestDriver65);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0f + "'", obj6, 1.0f);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1.0f + "'", obj7, 1.0f);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 10 + "'", obj11, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 1.0f + "'", obj21, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + 1.0f + "'", obj44, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(obj58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertNotNull(obj62);
        org.junit.Assert.assertEquals("'" + obj63 + "' != '" + 1.0f + "'", obj63, 1.0f);
        org.junit.Assert.assertEquals("'" + obj71 + "' != '" + 1.0f + "'", obj71, 1.0f);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test160");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj3 = linkedListTestDriver0.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver4.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver4.clear();
        linkedListTestDriver4.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj10 = linkedListTestDriver4.getLast();
        linkedListTestDriver4.clear();
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver4);
        boolean boolean14 = linkedListTestDriver0.add((java.lang.Object) 0L);
        experiment.util.Iterator iterator15 = linkedListTestDriver0.iterator();
        java.lang.Object obj16 = linkedListTestDriver0.removeLast();
        boolean boolean17 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver18 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver18.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver18.clear();
        linkedListTestDriver18.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj24 = linkedListTestDriver18.getLast();
        linkedListTestDriver18.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver26 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver26.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj29 = linkedListTestDriver26.getFirst();
        boolean boolean31 = linkedListTestDriver26.remove((java.lang.Object) 1);
        boolean boolean32 = linkedListTestDriver18.remove((java.lang.Object) 1);
        boolean boolean33 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver18);
        java.lang.Object obj34 = linkedListTestDriver0.getFirst();
        java.lang.Object obj35 = linkedListTestDriver0.removeFirst();
        java.lang.Object[] objArray36 = linkedListTestDriver0.toArray();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 10 + "'", obj3, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 1.0f + "'", obj10, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0L + "'", obj16, 0L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 1.0f + "'", obj24, 1.0f);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + (byte) 10 + "'", obj29, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[]");
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test161");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.addLast((java.lang.Object) 1.0f);
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver6.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver6.clear();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver6);
        int int11 = linkedListTestDriver0.size();
        linkedListTestDriver0.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver14 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver14.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver14.clear();
        linkedListTestDriver14.addLast((java.lang.Object) 1.0f);
        experiment.util.LinkedListTestDriver linkedListTestDriver20 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver20.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver20.clear();
        linkedListTestDriver14.addFirst((java.lang.Object) linkedListTestDriver20);
        java.lang.Object obj25 = linkedListTestDriver14.getFirst();
        java.lang.Class<?> wildcardClass26 = linkedListTestDriver14.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj27 = linkedListTestDriver0.set((int) (byte) 0, (java.lang.Object) linkedListTestDriver14);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test162");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj6 = linkedListTestDriver0.getLast();
        experiment.util.Iterator iterator7 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver8.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj11 = linkedListTestDriver8.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver12.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver12.clear();
        linkedListTestDriver12.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj18 = linkedListTestDriver12.getLast();
        linkedListTestDriver12.clear();
        linkedListTestDriver8.addLast((java.lang.Object) linkedListTestDriver12);
        boolean boolean21 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver8);
        experiment.util.LinkedListTestDriver linkedListTestDriver22 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver22.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj25 = linkedListTestDriver22.removeLast();
        experiment.util.Iterator iterator26 = linkedListTestDriver22.iterator();
        linkedListTestDriver22.clear();
        experiment.util.Iterator iterator28 = linkedListTestDriver22.iterator();
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver22);
        java.lang.Object obj30 = linkedListTestDriver0.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver31 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver31.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver31.clear();
        linkedListTestDriver31.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj37 = linkedListTestDriver31.getLast();
        java.lang.Object obj38 = new java.lang.Object();
        linkedListTestDriver31.addLast(obj38);
        experiment.util.LinkedListTestDriver linkedListTestDriver40 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver40.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj43 = linkedListTestDriver40.removeLast();
        experiment.util.Iterator iterator44 = linkedListTestDriver40.iterator();
        boolean boolean46 = linkedListTestDriver40.contains((java.lang.Object) 10.0d);
        linkedListTestDriver31.addLast((java.lang.Object) linkedListTestDriver40);
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver40);
        experiment.util.LinkedListTestDriver linkedListTestDriver50 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver50.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver50.clear();
        linkedListTestDriver50.addLast((java.lang.Object) 1.0f);
        experiment.util.LinkedListTestDriver linkedListTestDriver56 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver56.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver56.clear();
        linkedListTestDriver50.addFirst((java.lang.Object) linkedListTestDriver56);
        java.lang.Class<?> wildcardClass61 = linkedListTestDriver56.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj62 = linkedListTestDriver0.set((int) (short) 100, (java.lang.Object) linkedListTestDriver56);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0f + "'", obj6, 1.0f);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 10 + "'", obj11, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 1.0f + "'", obj18, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (byte) 10 + "'", obj25, (byte) 10);
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertNotNull(iterator28);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + 1.0f + "'", obj37, 1.0f);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + (byte) 10 + "'", obj43, (byte) 10);
        org.junit.Assert.assertNotNull(iterator44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(wildcardClass61);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test163");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj3 = linkedListTestDriver0.removeLast();
        experiment.util.Iterator iterator4 = linkedListTestDriver0.iterator();
        boolean boolean6 = linkedListTestDriver0.contains((java.lang.Object) "hi!");
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver8.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver8.clear();
        linkedListTestDriver8.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj14 = linkedListTestDriver8.getLast();
        experiment.util.Iterator iterator15 = linkedListTestDriver8.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver16 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver16.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj19 = linkedListTestDriver16.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver20 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver20.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver20.clear();
        linkedListTestDriver20.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj26 = linkedListTestDriver20.getLast();
        linkedListTestDriver20.clear();
        linkedListTestDriver16.addLast((java.lang.Object) linkedListTestDriver20);
        boolean boolean29 = linkedListTestDriver8.add((java.lang.Object) linkedListTestDriver16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj30 = linkedListTestDriver0.set(1, (java.lang.Object) linkedListTestDriver8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 10 + "'", obj3, (byte) 10);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 1.0f + "'", obj14, 1.0f);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (byte) 10 + "'", obj19, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 1.0f + "'", obj26, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test164");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj3 = linkedListTestDriver0.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver4.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver4.clear();
        linkedListTestDriver4.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj10 = linkedListTestDriver4.getLast();
        linkedListTestDriver4.clear();
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver4);
        boolean boolean14 = linkedListTestDriver0.add((java.lang.Object) 0L);
        experiment.util.Iterator iterator15 = linkedListTestDriver0.iterator();
        java.lang.Object obj16 = linkedListTestDriver0.removeLast();
        boolean boolean17 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver18 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver18.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver18.clear();
        linkedListTestDriver18.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj24 = linkedListTestDriver18.getLast();
        linkedListTestDriver18.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver26 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver26.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj29 = linkedListTestDriver26.getFirst();
        boolean boolean31 = linkedListTestDriver26.remove((java.lang.Object) 1);
        boolean boolean32 = linkedListTestDriver18.remove((java.lang.Object) 1);
        boolean boolean33 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver18);
        experiment.util.LinkedListTestDriver linkedListTestDriver35 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver35.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver35.clear();
        linkedListTestDriver35.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj41 = linkedListTestDriver35.getLast();
        experiment.util.Iterator iterator42 = linkedListTestDriver35.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver43 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver43.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj46 = linkedListTestDriver43.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver47 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver47.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver47.clear();
        linkedListTestDriver47.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj53 = linkedListTestDriver47.getLast();
        linkedListTestDriver47.clear();
        linkedListTestDriver43.addLast((java.lang.Object) linkedListTestDriver47);
        boolean boolean56 = linkedListTestDriver35.add((java.lang.Object) linkedListTestDriver43);
        java.lang.Object obj58 = linkedListTestDriver43.remove((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj59 = linkedListTestDriver18.set((int) (short) 10, (java.lang.Object) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 10 + "'", obj3, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 1.0f + "'", obj10, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0L + "'", obj16, 0L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 1.0f + "'", obj24, 1.0f);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + (byte) 10 + "'", obj29, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + 1.0f + "'", obj41, 1.0f);
        org.junit.Assert.assertNotNull(iterator42);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + (byte) 10 + "'", obj46, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj53 + "' != '" + 1.0f + "'", obj53, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(obj58);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test165");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.addLast((java.lang.Object) 1.0f);
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver6.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver6.clear();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver6);
        int int11 = linkedListTestDriver0.size();
        linkedListTestDriver0.clear();
        boolean boolean14 = linkedListTestDriver0.add((java.lang.Object) '4');
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test166");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj7 = linkedListTestDriver0.remove(0);
        boolean boolean9 = linkedListTestDriver0.remove((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator10 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver11.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver11.clear();
        linkedListTestDriver11.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj17 = linkedListTestDriver11.getLast();
        linkedListTestDriver11.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver19 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver19.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj22 = linkedListTestDriver19.getFirst();
        boolean boolean24 = linkedListTestDriver19.remove((java.lang.Object) 1);
        boolean boolean25 = linkedListTestDriver11.remove((java.lang.Object) 1);
        boolean boolean26 = linkedListTestDriver0.remove((java.lang.Object) boolean25);
        linkedListTestDriver0.clear();
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1.0f + "'", obj7, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 1.0f + "'", obj17, 1.0f);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (byte) 10 + "'", obj22, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test167");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        experiment.util.LinkedListTestDriver linkedListTestDriver3 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver3.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj6 = linkedListTestDriver3.removeLast();
        experiment.util.Iterator iterator7 = linkedListTestDriver3.iterator();
        linkedListTestDriver3.clear();
        experiment.util.Iterator iterator9 = linkedListTestDriver3.iterator();
        java.lang.Class<?> wildcardClass10 = iterator9.getClass();
        linkedListTestDriver0.addLast((java.lang.Object) iterator9);
        java.lang.Object obj12 = linkedListTestDriver0.removeLast();
        java.lang.Object obj13 = linkedListTestDriver0.removeLast();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator15 = linkedListTestDriver0.listIterator(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 1; size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 10 + "'", obj6, (byte) 10);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (byte) 10 + "'", obj13, (byte) 10);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test168");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj3 = linkedListTestDriver0.removeLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver4.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver4.clear();
        linkedListTestDriver4.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj10 = linkedListTestDriver4.getLast();
        java.lang.Object obj11 = linkedListTestDriver4.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver12.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj15 = linkedListTestDriver12.removeFirst();
        boolean boolean16 = linkedListTestDriver4.equals_CUT((java.lang.Object) linkedListTestDriver12);
        int int17 = linkedListTestDriver12.size();
        boolean boolean18 = linkedListTestDriver0.add((java.lang.Object) int17);
        linkedListTestDriver0.addFirst((java.lang.Object) 0.0d);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 10 + "'", obj3, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 1.0f + "'", obj10, 1.0f);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 1.0f + "'", obj11, 1.0f);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (byte) 10 + "'", obj15, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test169");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj3 = linkedListTestDriver0.getFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver4.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver4.clear();
        linkedListTestDriver4.addLast((java.lang.Object) 1.0f);
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver10.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver10.clear();
        linkedListTestDriver4.addFirst((java.lang.Object) linkedListTestDriver10);
        int int15 = linkedListTestDriver4.size();
        linkedListTestDriver0.addFirst((java.lang.Object) int15);
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver17.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver17.clear();
        linkedListTestDriver17.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj23 = linkedListTestDriver17.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver24 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver24.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver24.addFirst((java.lang.Object) 10);
        boolean boolean29 = linkedListTestDriver17.contains((java.lang.Object) 10);
        boolean boolean30 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver17);
        java.lang.Object obj31 = linkedListTestDriver17.getLast();
        java.lang.Object obj32 = linkedListTestDriver17.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver34 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver34.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver34.clear();
        linkedListTestDriver34.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj41 = linkedListTestDriver34.remove(0);
        boolean boolean43 = linkedListTestDriver34.remove((java.lang.Object) (short) 100);
        experiment.util.Iterator iterator44 = linkedListTestDriver34.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver45 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver45.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver45.clear();
        linkedListTestDriver45.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj51 = linkedListTestDriver45.getLast();
        linkedListTestDriver45.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver53 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver53.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj56 = linkedListTestDriver53.getFirst();
        boolean boolean58 = linkedListTestDriver53.remove((java.lang.Object) 1);
        boolean boolean59 = linkedListTestDriver45.remove((java.lang.Object) 1);
        boolean boolean60 = linkedListTestDriver34.remove((java.lang.Object) boolean59);
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver17.add((int) (short) 10, (java.lang.Object) boolean60);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 10; size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 10 + "'", obj3, (byte) 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 1.0f + "'", obj23, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 1.0f + "'", obj31, 1.0f);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 1.0f + "'", obj32, 1.0f);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + 1.0f + "'", obj41, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(iterator44);
        org.junit.Assert.assertEquals("'" + obj51 + "' != '" + 1.0f + "'", obj51, 1.0f);
        org.junit.Assert.assertEquals("'" + obj56 + "' != '" + (byte) 10 + "'", obj56, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test170");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.addLast((java.lang.Object) 1.0f);
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver6.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver6.clear();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver6);
        java.lang.Object obj11 = linkedListTestDriver0.getFirst();
        java.lang.Object[] objArray12 = linkedListTestDriver0.toArray();
        java.lang.Object obj13 = linkedListTestDriver0.getLast();
        java.lang.Object obj14 = linkedListTestDriver0.getFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver15 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver15.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj18 = linkedListTestDriver15.getFirst();
        boolean boolean20 = linkedListTestDriver15.remove((java.lang.Object) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver21 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver21.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver21.clear();
        linkedListTestDriver21.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj27 = linkedListTestDriver21.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver28 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver28.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver28.addFirst((java.lang.Object) 10);
        boolean boolean33 = linkedListTestDriver21.contains((java.lang.Object) 10);
        linkedListTestDriver15.addLast((java.lang.Object) 10);
        boolean boolean35 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver15);
        java.lang.Object obj36 = linkedListTestDriver15.removeFirst();
        experiment.util.Iterator iterator37 = linkedListTestDriver15.iterator();
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 1.0f + "'", obj13, 1.0f);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (byte) 10 + "'", obj18, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 1.0f + "'", obj27, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + (byte) 10 + "'", obj36, (byte) 10);
        org.junit.Assert.assertNotNull(iterator37);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test171");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj7 = linkedListTestDriver0.remove(0);
        boolean boolean9 = linkedListTestDriver0.remove((java.lang.Object) (short) 100);
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver10.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver10.clear();
        linkedListTestDriver10.addLast((java.lang.Object) 1.0f);
        experiment.util.LinkedListTestDriver linkedListTestDriver16 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver16.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver16.clear();
        linkedListTestDriver10.addFirst((java.lang.Object) linkedListTestDriver16);
        java.lang.Object obj21 = linkedListTestDriver10.getFirst();
        boolean boolean22 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver10);
        java.lang.Object[] objArray23 = linkedListTestDriver10.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver24 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver24.clear();
        boolean boolean26 = linkedListTestDriver10.contains((java.lang.Object) linkedListTestDriver24);
        experiment.util.LinkedListTestDriver linkedListTestDriver27 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver27.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver27.clear();
        linkedListTestDriver27.addLast((java.lang.Object) 1.0f);
        experiment.util.LinkedListTestDriver linkedListTestDriver33 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver33.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver33.clear();
        linkedListTestDriver27.addFirst((java.lang.Object) linkedListTestDriver33);
        java.lang.Object obj40 = linkedListTestDriver27.set((int) (byte) 1, (java.lang.Object) 100.0d);
        linkedListTestDriver10.addFirst((java.lang.Object) linkedListTestDriver27);
        java.lang.Object[] objArray42 = linkedListTestDriver27.toArray();
        java.lang.Class<?> wildcardClass43 = objArray42.getClass();
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1.0f + "'", obj7, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + 1.0f + "'", obj40, 1.0f);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test172");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj6 = linkedListTestDriver0.getLast();
        experiment.util.Iterator iterator7 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver8.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj11 = linkedListTestDriver8.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver12.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver12.clear();
        linkedListTestDriver12.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj18 = linkedListTestDriver12.getLast();
        linkedListTestDriver12.clear();
        linkedListTestDriver8.addLast((java.lang.Object) linkedListTestDriver12);
        boolean boolean21 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver8);
        experiment.util.LinkedListTestDriver linkedListTestDriver22 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver22.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver22.clear();
        linkedListTestDriver22.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj28 = linkedListTestDriver22.getLast();
        experiment.util.Iterator iterator29 = linkedListTestDriver22.iterator();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver22);
        linkedListTestDriver22.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver32 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver32.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver32.clear();
        linkedListTestDriver32.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj38 = linkedListTestDriver32.getLast();
        java.lang.Object obj39 = linkedListTestDriver32.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver40 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver40.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj43 = linkedListTestDriver40.removeFirst();
        boolean boolean44 = linkedListTestDriver32.equals_CUT((java.lang.Object) linkedListTestDriver40);
        linkedListTestDriver40.clear();
        boolean boolean46 = linkedListTestDriver22.add((java.lang.Object) linkedListTestDriver40);
        java.lang.Object obj47 = linkedListTestDriver22.removeFirst();
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0f + "'", obj6, 1.0f);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 10 + "'", obj11, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 1.0f + "'", obj18, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + 1.0f + "'", obj28, 1.0f);
        org.junit.Assert.assertNotNull(iterator29);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + 1.0f + "'", obj38, 1.0f);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + 1.0f + "'", obj39, 1.0f);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + (byte) 10 + "'", obj43, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(obj47);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test173");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj6 = linkedListTestDriver0.getLast();
        experiment.util.Iterator iterator7 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver8.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj11 = linkedListTestDriver8.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver12.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver12.clear();
        linkedListTestDriver12.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj18 = linkedListTestDriver12.getLast();
        linkedListTestDriver12.clear();
        linkedListTestDriver8.addLast((java.lang.Object) linkedListTestDriver12);
        boolean boolean21 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver8);
        experiment.util.LinkedListTestDriver linkedListTestDriver22 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver22.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver22.clear();
        linkedListTestDriver22.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj28 = linkedListTestDriver22.getLast();
        experiment.util.Iterator iterator29 = linkedListTestDriver22.iterator();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver22);
        experiment.util.ListIterator listIterator32 = linkedListTestDriver22.listIterator((int) (byte) 0);
        java.lang.Object obj33 = linkedListTestDriver22.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver34 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver34.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj37 = linkedListTestDriver34.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver38 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver38.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver38.clear();
        linkedListTestDriver38.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj44 = linkedListTestDriver38.getLast();
        linkedListTestDriver38.clear();
        linkedListTestDriver34.addLast((java.lang.Object) linkedListTestDriver38);
        experiment.util.Iterator iterator47 = linkedListTestDriver34.iterator();
        java.lang.Object obj48 = linkedListTestDriver34.getFirst();
        boolean boolean49 = linkedListTestDriver22.add((java.lang.Object) linkedListTestDriver34);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0f + "'", obj6, 1.0f);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 10 + "'", obj11, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 1.0f + "'", obj18, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + 1.0f + "'", obj28, 1.0f);
        org.junit.Assert.assertNotNull(iterator29);
        org.junit.Assert.assertNotNull(listIterator32);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + 1.0f + "'", obj33, 1.0f);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + (byte) 10 + "'", obj37, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + 1.0f + "'", obj44, 1.0f);
        org.junit.Assert.assertNotNull(iterator47);
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test174");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj6 = linkedListTestDriver0.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver7.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver7.addFirst((java.lang.Object) 10);
        boolean boolean12 = linkedListTestDriver0.contains((java.lang.Object) 10);
        java.lang.Class<?> wildcardClass13 = linkedListTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0f + "'", obj6, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test175");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj7 = linkedListTestDriver0.remove(0);
        boolean boolean9 = linkedListTestDriver0.remove((java.lang.Object) (short) 100);
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver10.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver10.clear();
        linkedListTestDriver10.addLast((java.lang.Object) 1.0f);
        experiment.util.LinkedListTestDriver linkedListTestDriver16 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver16.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver16.clear();
        linkedListTestDriver10.addFirst((java.lang.Object) linkedListTestDriver16);
        java.lang.Object obj21 = linkedListTestDriver10.getFirst();
        boolean boolean22 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver10);
        experiment.util.LinkedListTestDriver linkedListTestDriver23 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver23.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver23.clear();
        linkedListTestDriver23.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj30 = linkedListTestDriver23.remove(0);
        boolean boolean32 = linkedListTestDriver23.remove((java.lang.Object) (short) 100);
        experiment.util.LinkedListTestDriver linkedListTestDriver33 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver33.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver33.clear();
        linkedListTestDriver33.addLast((java.lang.Object) 1.0f);
        experiment.util.LinkedListTestDriver linkedListTestDriver39 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver39.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver39.clear();
        linkedListTestDriver33.addFirst((java.lang.Object) linkedListTestDriver39);
        java.lang.Object obj44 = linkedListTestDriver33.getFirst();
        boolean boolean45 = linkedListTestDriver23.contains((java.lang.Object) linkedListTestDriver33);
        java.lang.Object[] objArray46 = linkedListTestDriver33.toArray();
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver33);
        java.lang.Object obj48 = linkedListTestDriver33.removeLast();
        linkedListTestDriver33.clear();
        boolean boolean51 = linkedListTestDriver33.contains((java.lang.Object) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj52 = linkedListTestDriver33.getFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1.0f + "'", obj7, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + 1.0f + "'", obj30, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + 1.0f + "'", obj48, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test176");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver1 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver1.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj4 = linkedListTestDriver1.removeLast();
        experiment.util.Iterator iterator5 = linkedListTestDriver1.iterator();
        linkedListTestDriver0.addLast((java.lang.Object) iterator5);
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver8.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj11 = linkedListTestDriver8.getFirst();
        boolean boolean12 = linkedListTestDriver8.isEmpty();
        experiment.util.Iterator iterator13 = linkedListTestDriver8.iterator();
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.add((int) (short) -1, (java.lang.Object) linkedListTestDriver8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: -1; size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 10 + "'", obj4, (byte) 10);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 10 + "'", obj11, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(iterator13);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test177");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.addLast((java.lang.Object) 1.0f);
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver6.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver6.clear();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver6);
        java.lang.Object obj11 = linkedListTestDriver0.getFirst();
        java.lang.Object[] objArray12 = linkedListTestDriver0.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver13.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj16 = linkedListTestDriver13.removeLast();
        experiment.util.Iterator iterator17 = linkedListTestDriver13.iterator();
        linkedListTestDriver13.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver19 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver19.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver19.clear();
        linkedListTestDriver19.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj25 = linkedListTestDriver19.getLast();
        java.lang.Object obj26 = new java.lang.Object();
        linkedListTestDriver19.addLast(obj26);
        boolean boolean28 = linkedListTestDriver13.add(obj26);
        int int29 = linkedListTestDriver13.size();
        linkedListTestDriver0.addLast((java.lang.Object) int29);
        java.lang.Object obj31 = linkedListTestDriver0.removeLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver32 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver32.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver32.clear();
        linkedListTestDriver32.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj39 = linkedListTestDriver32.remove(0);
        boolean boolean41 = linkedListTestDriver32.remove((java.lang.Object) (short) 100);
        experiment.util.LinkedListTestDriver linkedListTestDriver42 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver42.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver42.clear();
        linkedListTestDriver42.addLast((java.lang.Object) 1.0f);
        experiment.util.LinkedListTestDriver linkedListTestDriver48 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver48.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver48.clear();
        linkedListTestDriver42.addFirst((java.lang.Object) linkedListTestDriver48);
        java.lang.Object obj53 = linkedListTestDriver42.getFirst();
        boolean boolean54 = linkedListTestDriver32.contains((java.lang.Object) linkedListTestDriver42);
        experiment.util.LinkedListTestDriver linkedListTestDriver55 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver55.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver55.clear();
        linkedListTestDriver55.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj62 = linkedListTestDriver55.remove(0);
        boolean boolean64 = linkedListTestDriver55.remove((java.lang.Object) (short) 100);
        experiment.util.LinkedListTestDriver linkedListTestDriver65 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver65.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver65.clear();
        linkedListTestDriver65.addLast((java.lang.Object) 1.0f);
        experiment.util.LinkedListTestDriver linkedListTestDriver71 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver71.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver71.clear();
        linkedListTestDriver65.addFirst((java.lang.Object) linkedListTestDriver71);
        java.lang.Object obj76 = linkedListTestDriver65.getFirst();
        boolean boolean77 = linkedListTestDriver55.contains((java.lang.Object) linkedListTestDriver65);
        java.lang.Object[] objArray78 = linkedListTestDriver65.toArray();
        linkedListTestDriver32.addLast((java.lang.Object) linkedListTestDriver65);
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver65);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj82 = linkedListTestDriver0.get((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (byte) 10 + "'", obj16, (byte) 10);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 1.0f + "'", obj25, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 1 + "'", obj31, 1);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + 1.0f + "'", obj39, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(obj53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + obj62 + "' != '" + 1.0f + "'", obj62, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(obj76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(objArray78);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test178");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj6 = linkedListTestDriver0.getLast();
        experiment.util.Iterator iterator7 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver8.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj11 = linkedListTestDriver8.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver12.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver12.clear();
        linkedListTestDriver12.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj18 = linkedListTestDriver12.getLast();
        linkedListTestDriver12.clear();
        linkedListTestDriver8.addLast((java.lang.Object) linkedListTestDriver12);
        boolean boolean21 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver8);
        experiment.util.ListIterator listIterator23 = linkedListTestDriver0.listIterator((int) (byte) 1);
        experiment.util.ListIterator listIterator25 = linkedListTestDriver0.listIterator((int) (byte) 1);
        java.lang.Object[] objArray26 = linkedListTestDriver0.toArray();
        java.lang.Object obj27 = linkedListTestDriver0.removeLast();
        java.lang.Object obj28 = linkedListTestDriver0.getFirst();
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0f + "'", obj6, 1.0f);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 10 + "'", obj11, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 1.0f + "'", obj18, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(listIterator23);
        org.junit.Assert.assertNotNull(listIterator25);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + 1.0f + "'", obj28, 1.0f);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test179");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj3 = linkedListTestDriver0.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver4.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver4.clear();
        linkedListTestDriver4.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj10 = linkedListTestDriver4.getLast();
        linkedListTestDriver4.clear();
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver4);
        boolean boolean14 = linkedListTestDriver0.add((java.lang.Object) 0L);
        experiment.util.Iterator iterator15 = linkedListTestDriver0.iterator();
        java.lang.Object obj16 = linkedListTestDriver0.removeLast();
        boolean boolean17 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver18 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver18.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver18.clear();
        linkedListTestDriver18.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj24 = linkedListTestDriver18.getLast();
        linkedListTestDriver18.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver26 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver26.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj29 = linkedListTestDriver26.getFirst();
        boolean boolean31 = linkedListTestDriver26.remove((java.lang.Object) 1);
        boolean boolean32 = linkedListTestDriver18.remove((java.lang.Object) 1);
        boolean boolean33 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver18);
        java.lang.Object obj34 = linkedListTestDriver0.getFirst();
        java.lang.Object obj35 = linkedListTestDriver0.removeFirst();
        java.lang.Object obj37 = null;
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.add(3, obj37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 10 + "'", obj3, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 1.0f + "'", obj10, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0L + "'", obj16, 0L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 1.0f + "'", obj24, 1.0f);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + (byte) 10 + "'", obj29, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertNotNull(obj35);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test180");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj3 = linkedListTestDriver0.removeLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver4.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver4.clear();
        linkedListTestDriver4.addLast((java.lang.Object) 1.0f);
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver10.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver10.clear();
        linkedListTestDriver4.addFirst((java.lang.Object) linkedListTestDriver10);
        int int15 = linkedListTestDriver4.size();
        linkedListTestDriver4.clear();
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver4);
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator19 = linkedListTestDriver4.listIterator((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 1; size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 10 + "'", obj3, (byte) 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test181");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj7 = linkedListTestDriver0.remove(0);
        boolean boolean9 = linkedListTestDriver0.remove((java.lang.Object) (short) 100);
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver10.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver10.clear();
        linkedListTestDriver10.addLast((java.lang.Object) 1.0f);
        experiment.util.LinkedListTestDriver linkedListTestDriver16 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver16.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver16.clear();
        linkedListTestDriver10.addFirst((java.lang.Object) linkedListTestDriver16);
        java.lang.Object obj21 = linkedListTestDriver10.getFirst();
        boolean boolean22 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver10);
        java.lang.Object[] objArray23 = linkedListTestDriver10.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver24 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver24.clear();
        boolean boolean26 = linkedListTestDriver10.contains((java.lang.Object) linkedListTestDriver24);
        experiment.util.LinkedListTestDriver linkedListTestDriver27 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver27.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver27.clear();
        linkedListTestDriver27.addLast((java.lang.Object) 1.0f);
        experiment.util.LinkedListTestDriver linkedListTestDriver33 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver33.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver33.clear();
        linkedListTestDriver27.addFirst((java.lang.Object) linkedListTestDriver33);
        java.lang.Object obj40 = linkedListTestDriver27.set((int) (byte) 1, (java.lang.Object) 100.0d);
        linkedListTestDriver10.addFirst((java.lang.Object) linkedListTestDriver27);
        experiment.util.LinkedListTestDriver linkedListTestDriver42 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver42.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver42.clear();
        linkedListTestDriver42.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj48 = linkedListTestDriver42.getLast();
        experiment.util.Iterator iterator49 = linkedListTestDriver42.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver50 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver50.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj53 = linkedListTestDriver50.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver54 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver54.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver54.clear();
        linkedListTestDriver54.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj60 = linkedListTestDriver54.getLast();
        linkedListTestDriver54.clear();
        linkedListTestDriver50.addLast((java.lang.Object) linkedListTestDriver54);
        boolean boolean63 = linkedListTestDriver42.add((java.lang.Object) linkedListTestDriver50);
        experiment.util.LinkedListTestDriver linkedListTestDriver64 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver64.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver64.clear();
        linkedListTestDriver64.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj70 = linkedListTestDriver64.getLast();
        experiment.util.Iterator iterator71 = linkedListTestDriver64.iterator();
        linkedListTestDriver42.addFirst((java.lang.Object) linkedListTestDriver64);
        experiment.util.ListIterator listIterator74 = linkedListTestDriver64.listIterator((int) (byte) 0);
        java.lang.Object obj75 = linkedListTestDriver64.getLast();
        boolean boolean77 = linkedListTestDriver64.add((java.lang.Object) (-1.0d));
        linkedListTestDriver10.addFirst((java.lang.Object) (-1.0d));
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1.0f + "'", obj7, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + 1.0f + "'", obj40, 1.0f);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + 1.0f + "'", obj48, 1.0f);
        org.junit.Assert.assertNotNull(iterator49);
        org.junit.Assert.assertEquals("'" + obj53 + "' != '" + (byte) 10 + "'", obj53, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj60 + "' != '" + 1.0f + "'", obj60, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertEquals("'" + obj70 + "' != '" + 1.0f + "'", obj70, 1.0f);
        org.junit.Assert.assertNotNull(iterator71);
        org.junit.Assert.assertNotNull(listIterator74);
        org.junit.Assert.assertEquals("'" + obj75 + "' != '" + 1.0f + "'", obj75, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test182");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj7 = linkedListTestDriver0.remove(0);
        boolean boolean9 = linkedListTestDriver0.remove((java.lang.Object) (short) 100);
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver10.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver10.clear();
        linkedListTestDriver10.addLast((java.lang.Object) 1.0f);
        experiment.util.LinkedListTestDriver linkedListTestDriver16 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver16.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver16.clear();
        linkedListTestDriver10.addFirst((java.lang.Object) linkedListTestDriver16);
        java.lang.Object obj21 = linkedListTestDriver10.getFirst();
        boolean boolean22 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver10);
        java.lang.Object[] objArray23 = linkedListTestDriver10.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver24 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver24.clear();
        boolean boolean26 = linkedListTestDriver10.contains((java.lang.Object) linkedListTestDriver24);
        experiment.util.LinkedListTestDriver linkedListTestDriver27 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver27.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver27.clear();
        linkedListTestDriver27.addLast((java.lang.Object) 1.0f);
        experiment.util.LinkedListTestDriver linkedListTestDriver33 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver33.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver33.clear();
        linkedListTestDriver27.addFirst((java.lang.Object) linkedListTestDriver33);
        java.lang.Object obj40 = linkedListTestDriver27.set((int) (byte) 1, (java.lang.Object) 100.0d);
        linkedListTestDriver10.addFirst((java.lang.Object) linkedListTestDriver27);
        java.lang.Object obj42 = linkedListTestDriver10.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver43 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver43.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver43.clear();
        linkedListTestDriver43.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj50 = linkedListTestDriver43.remove(0);
        boolean boolean52 = linkedListTestDriver43.remove((java.lang.Object) (short) 100);
        experiment.util.LinkedListTestDriver linkedListTestDriver53 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver53.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver53.clear();
        linkedListTestDriver53.addLast((java.lang.Object) 1.0f);
        experiment.util.LinkedListTestDriver linkedListTestDriver59 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver59.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver59.clear();
        linkedListTestDriver53.addFirst((java.lang.Object) linkedListTestDriver59);
        java.lang.Object obj64 = linkedListTestDriver53.getFirst();
        boolean boolean65 = linkedListTestDriver43.contains((java.lang.Object) linkedListTestDriver53);
        java.lang.Object[] objArray66 = linkedListTestDriver53.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver67 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver67.clear();
        boolean boolean69 = linkedListTestDriver53.contains((java.lang.Object) linkedListTestDriver67);
        experiment.util.LinkedListTestDriver linkedListTestDriver70 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver70.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver70.clear();
        linkedListTestDriver70.addLast((java.lang.Object) 1.0f);
        experiment.util.LinkedListTestDriver linkedListTestDriver76 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver76.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver76.clear();
        linkedListTestDriver70.addFirst((java.lang.Object) linkedListTestDriver76);
        java.lang.Object obj83 = linkedListTestDriver70.set((int) (byte) 1, (java.lang.Object) 100.0d);
        linkedListTestDriver53.addFirst((java.lang.Object) linkedListTestDriver70);
        java.lang.Object[] objArray85 = linkedListTestDriver70.toArray();
        linkedListTestDriver10.addLast((java.lang.Object) linkedListTestDriver70);
        java.lang.Object obj87 = null;
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver10.addLast(obj87);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1.0f + "'", obj7, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + 1.0f + "'", obj40, 1.0f);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + 1.0f + "'", obj42, 1.0f);
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + 1.0f + "'", obj50, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(obj64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertEquals("'" + obj83 + "' != '" + 1.0f + "'", obj83, 1.0f);
        org.junit.Assert.assertNotNull(objArray85);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test183");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj7 = linkedListTestDriver0.remove(0);
        boolean boolean9 = linkedListTestDriver0.remove((java.lang.Object) (short) 100);
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver10.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver10.clear();
        linkedListTestDriver10.addLast((java.lang.Object) 1.0f);
        experiment.util.LinkedListTestDriver linkedListTestDriver16 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver16.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver16.clear();
        linkedListTestDriver10.addFirst((java.lang.Object) linkedListTestDriver16);
        java.lang.Object obj21 = linkedListTestDriver10.getFirst();
        boolean boolean22 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver10);
        experiment.util.LinkedListTestDriver linkedListTestDriver23 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver23.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver23.clear();
        linkedListTestDriver23.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj30 = linkedListTestDriver23.remove(0);
        boolean boolean32 = linkedListTestDriver23.remove((java.lang.Object) (short) 100);
        experiment.util.LinkedListTestDriver linkedListTestDriver33 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver33.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver33.clear();
        linkedListTestDriver33.addLast((java.lang.Object) 1.0f);
        experiment.util.LinkedListTestDriver linkedListTestDriver39 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver39.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver39.clear();
        linkedListTestDriver33.addFirst((java.lang.Object) linkedListTestDriver39);
        java.lang.Object obj44 = linkedListTestDriver33.getFirst();
        boolean boolean45 = linkedListTestDriver23.contains((java.lang.Object) linkedListTestDriver33);
        java.lang.Object[] objArray46 = linkedListTestDriver33.toArray();
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver33);
        java.lang.Object obj48 = linkedListTestDriver33.removeLast();
        linkedListTestDriver33.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver50 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver50.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver50.clear();
        linkedListTestDriver50.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj56 = linkedListTestDriver50.getLast();
        linkedListTestDriver50.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver58 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver58.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj61 = linkedListTestDriver58.getFirst();
        boolean boolean63 = linkedListTestDriver58.remove((java.lang.Object) 1);
        boolean boolean64 = linkedListTestDriver50.remove((java.lang.Object) 1);
        boolean boolean65 = linkedListTestDriver33.equals_CUT((java.lang.Object) boolean64);
        experiment.util.LinkedListTestDriver linkedListTestDriver66 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver66.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver66.clear();
        linkedListTestDriver66.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj72 = linkedListTestDriver66.getLast();
        java.lang.Object obj73 = linkedListTestDriver66.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver74 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver74.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj77 = linkedListTestDriver74.removeFirst();
        boolean boolean78 = linkedListTestDriver66.equals_CUT((java.lang.Object) linkedListTestDriver74);
        linkedListTestDriver74.clear();
        boolean boolean80 = linkedListTestDriver33.remove((java.lang.Object) linkedListTestDriver74);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj81 = linkedListTestDriver74.removeLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1.0f + "'", obj7, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + 1.0f + "'", obj30, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + 1.0f + "'", obj48, 1.0f);
        org.junit.Assert.assertEquals("'" + obj56 + "' != '" + 1.0f + "'", obj56, 1.0f);
        org.junit.Assert.assertEquals("'" + obj61 + "' != '" + (byte) 10 + "'", obj61, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertEquals("'" + obj72 + "' != '" + 1.0f + "'", obj72, 1.0f);
        org.junit.Assert.assertEquals("'" + obj73 + "' != '" + 1.0f + "'", obj73, 1.0f);
        org.junit.Assert.assertEquals("'" + obj77 + "' != '" + (byte) 10 + "'", obj77, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test184");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj3 = linkedListTestDriver0.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver4.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver4.clear();
        linkedListTestDriver4.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj10 = linkedListTestDriver4.getLast();
        linkedListTestDriver4.clear();
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver4);
        boolean boolean14 = linkedListTestDriver0.add((java.lang.Object) 0L);
        java.lang.Object obj16 = linkedListTestDriver0.remove((int) (short) 0);
        int int17 = linkedListTestDriver0.size();
        java.lang.Object[] objArray18 = linkedListTestDriver0.toArray();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator20 = linkedListTestDriver0.listIterator((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 97; size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 10 + "'", obj3, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 1.0f + "'", obj10, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[0]");
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test185");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj7 = linkedListTestDriver0.remove(0);
        linkedListTestDriver0.addFirst((java.lang.Object) (short) 0);
        boolean boolean10 = linkedListTestDriver0.isEmpty();
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1.0f + "'", obj7, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test186");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj3 = linkedListTestDriver0.removeLast();
        experiment.util.Iterator iterator4 = linkedListTestDriver0.iterator();
        linkedListTestDriver0.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver6.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver6.clear();
        linkedListTestDriver6.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj12 = linkedListTestDriver6.getLast();
        java.lang.Object obj13 = new java.lang.Object();
        linkedListTestDriver6.addLast(obj13);
        boolean boolean15 = linkedListTestDriver0.add(obj13);
        experiment.util.LinkedListTestDriver linkedListTestDriver16 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver16.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj19 = linkedListTestDriver16.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver20 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver20.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver20.clear();
        linkedListTestDriver20.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj26 = linkedListTestDriver20.getLast();
        linkedListTestDriver20.clear();
        linkedListTestDriver16.addLast((java.lang.Object) linkedListTestDriver20);
        boolean boolean30 = linkedListTestDriver16.add((java.lang.Object) 0L);
        boolean boolean31 = linkedListTestDriver0.equals_CUT((java.lang.Object) 0L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj33 = linkedListTestDriver0.get(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 10 + "'", obj3, (byte) 10);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 1.0f + "'", obj12, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (byte) 10 + "'", obj19, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 1.0f + "'", obj26, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test187");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj6 = linkedListTestDriver0.getLast();
        experiment.util.Iterator iterator7 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver8.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj11 = linkedListTestDriver8.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver12.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver12.clear();
        linkedListTestDriver12.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj18 = linkedListTestDriver12.getLast();
        linkedListTestDriver12.clear();
        linkedListTestDriver8.addLast((java.lang.Object) linkedListTestDriver12);
        boolean boolean21 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver8);
        boolean boolean22 = linkedListTestDriver0.isEmpty();
        int int23 = linkedListTestDriver0.size();
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0f + "'", obj6, 1.0f);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 10 + "'", obj11, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 1.0f + "'", obj18, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test188");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj3 = linkedListTestDriver0.removeLast();
        experiment.util.Iterator iterator4 = linkedListTestDriver0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = linkedListTestDriver0.remove(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 10 + "'", obj3, (byte) 10);
        org.junit.Assert.assertNotNull(iterator4);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test189");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.clear();
        linkedListTestDriver0.clear();
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test190");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj3 = linkedListTestDriver0.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver4.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver4.clear();
        linkedListTestDriver4.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj10 = linkedListTestDriver4.getLast();
        linkedListTestDriver4.clear();
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver4);
        boolean boolean14 = linkedListTestDriver0.add((java.lang.Object) 0L);
        java.lang.Object obj15 = linkedListTestDriver0.getFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver17.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver17.clear();
        linkedListTestDriver17.addLast((java.lang.Object) 1.0f);
        experiment.util.LinkedListTestDriver linkedListTestDriver23 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver23.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver23.clear();
        linkedListTestDriver17.addFirst((java.lang.Object) linkedListTestDriver23);
        java.lang.Object obj28 = linkedListTestDriver17.getFirst();
        java.lang.Class<?> wildcardClass29 = linkedListTestDriver17.getClass();
        linkedListTestDriver0.add((int) (byte) 0, (java.lang.Object) wildcardClass29);
        java.lang.Object obj31 = linkedListTestDriver0.removeLast();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 10 + "'", obj3, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 1.0f + "'", obj10, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 0L + "'", obj31, 0L);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test191");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj6 = linkedListTestDriver0.getLast();
        experiment.util.Iterator iterator7 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver8.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj11 = linkedListTestDriver8.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver12.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver12.clear();
        linkedListTestDriver12.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj18 = linkedListTestDriver12.getLast();
        linkedListTestDriver12.clear();
        linkedListTestDriver8.addLast((java.lang.Object) linkedListTestDriver12);
        boolean boolean21 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver8);
        experiment.util.LinkedListTestDriver linkedListTestDriver22 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver22.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj25 = linkedListTestDriver22.removeLast();
        experiment.util.Iterator iterator26 = linkedListTestDriver22.iterator();
        linkedListTestDriver22.clear();
        experiment.util.Iterator iterator28 = linkedListTestDriver22.iterator();
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver22);
        experiment.util.LinkedListTestDriver linkedListTestDriver30 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver30.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver30.clear();
        linkedListTestDriver30.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj36 = linkedListTestDriver30.getLast();
        experiment.util.Iterator iterator37 = linkedListTestDriver30.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver38 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver38.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj41 = linkedListTestDriver38.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver42 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver42.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver42.clear();
        linkedListTestDriver42.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj48 = linkedListTestDriver42.getLast();
        linkedListTestDriver42.clear();
        linkedListTestDriver38.addLast((java.lang.Object) linkedListTestDriver42);
        boolean boolean51 = linkedListTestDriver30.add((java.lang.Object) linkedListTestDriver38);
        experiment.util.ListIterator listIterator53 = linkedListTestDriver30.listIterator((int) (byte) 1);
        experiment.util.ListIterator listIterator55 = linkedListTestDriver30.listIterator((int) (byte) 1);
        boolean boolean56 = linkedListTestDriver22.add((java.lang.Object) (byte) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver57 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver57.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver57.clear();
        linkedListTestDriver57.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj63 = linkedListTestDriver57.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver64 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver64.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver64.addFirst((java.lang.Object) 10);
        boolean boolean69 = linkedListTestDriver57.contains((java.lang.Object) 10);
        experiment.util.LinkedListTestDriver linkedListTestDriver70 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver71 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver71.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj74 = linkedListTestDriver71.removeLast();
        experiment.util.Iterator iterator75 = linkedListTestDriver71.iterator();
        linkedListTestDriver70.addLast((java.lang.Object) iterator75);
        boolean boolean77 = linkedListTestDriver57.remove((java.lang.Object) iterator75);
        experiment.util.LinkedListTestDriver linkedListTestDriver78 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver78.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj81 = linkedListTestDriver78.removeLast();
        experiment.util.Iterator iterator82 = linkedListTestDriver78.iterator();
        boolean boolean84 = linkedListTestDriver78.contains((java.lang.Object) "hi!");
        boolean boolean85 = linkedListTestDriver57.contains((java.lang.Object) linkedListTestDriver78);
        linkedListTestDriver22.addLast((java.lang.Object) linkedListTestDriver78);
        java.lang.Object obj87 = linkedListTestDriver22.getFirst();
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0f + "'", obj6, 1.0f);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 10 + "'", obj11, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 1.0f + "'", obj18, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (byte) 10 + "'", obj25, (byte) 10);
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertNotNull(iterator28);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + 1.0f + "'", obj36, 1.0f);
        org.junit.Assert.assertNotNull(iterator37);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + (byte) 10 + "'", obj41, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + 1.0f + "'", obj48, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(listIterator53);
        org.junit.Assert.assertNotNull(listIterator55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertEquals("'" + obj63 + "' != '" + 1.0f + "'", obj63, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertEquals("'" + obj74 + "' != '" + (byte) 10 + "'", obj74, (byte) 10);
        org.junit.Assert.assertNotNull(iterator75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertEquals("'" + obj81 + "' != '" + (byte) 10 + "'", obj81, (byte) 10);
        org.junit.Assert.assertNotNull(iterator82);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertEquals("'" + obj87 + "' != '" + (byte) 1 + "'", obj87, (byte) 1);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test192");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj3 = linkedListTestDriver0.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver4.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver4.clear();
        linkedListTestDriver4.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj10 = linkedListTestDriver4.getLast();
        linkedListTestDriver4.clear();
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver4);
        boolean boolean14 = linkedListTestDriver0.add((java.lang.Object) 0L);
        experiment.util.Iterator iterator15 = linkedListTestDriver0.iterator();
        experiment.util.Iterator iterator16 = linkedListTestDriver0.iterator();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 10 + "'", obj3, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 1.0f + "'", obj10, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertNotNull(iterator16);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test193");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver1 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver1.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj4 = linkedListTestDriver1.removeLast();
        experiment.util.Iterator iterator5 = linkedListTestDriver1.iterator();
        linkedListTestDriver0.addLast((java.lang.Object) iterator5);
        boolean boolean8 = linkedListTestDriver0.contains((java.lang.Object) (byte) 10);
        java.lang.Object obj9 = linkedListTestDriver0.removeLast();
        java.lang.Object obj10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = linkedListTestDriver0.equals_CUT(obj10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 10 + "'", obj4, (byte) 10);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test194");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver1 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver1.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj4 = linkedListTestDriver1.removeLast();
        experiment.util.Iterator iterator5 = linkedListTestDriver1.iterator();
        linkedListTestDriver0.addLast((java.lang.Object) iterator5);
        int int7 = linkedListTestDriver0.size();
        linkedListTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = linkedListTestDriver0.removeFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 10 + "'", obj4, (byte) 10);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test195");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver5.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver5.clear();
        linkedListTestDriver5.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj12 = linkedListTestDriver5.remove(0);
        boolean boolean14 = linkedListTestDriver5.remove((java.lang.Object) (short) 100);
        experiment.util.LinkedListTestDriver linkedListTestDriver15 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver15.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver15.clear();
        linkedListTestDriver15.addLast((java.lang.Object) 1.0f);
        experiment.util.LinkedListTestDriver linkedListTestDriver21 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver21.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver21.clear();
        linkedListTestDriver15.addFirst((java.lang.Object) linkedListTestDriver21);
        java.lang.Object obj26 = linkedListTestDriver15.getFirst();
        boolean boolean27 = linkedListTestDriver5.contains((java.lang.Object) linkedListTestDriver15);
        linkedListTestDriver0.addFirst((java.lang.Object) boolean27);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 1.0f + "'", obj12, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test196");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.addLast((java.lang.Object) 1.0f);
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver6.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver6.clear();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver6);
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver11.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj14 = linkedListTestDriver11.removeLast();
        experiment.util.Iterator iterator15 = linkedListTestDriver11.iterator();
        linkedListTestDriver11.clear();
        experiment.util.Iterator iterator17 = linkedListTestDriver11.iterator();
        boolean boolean18 = linkedListTestDriver6.remove((java.lang.Object) iterator17);
        linkedListTestDriver6.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver21 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver21.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver21.clear();
        linkedListTestDriver21.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj28 = linkedListTestDriver21.remove(0);
        boolean boolean30 = linkedListTestDriver21.remove((java.lang.Object) (short) 100);
        experiment.util.LinkedListTestDriver linkedListTestDriver31 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver31.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver31.clear();
        linkedListTestDriver31.addLast((java.lang.Object) 1.0f);
        experiment.util.LinkedListTestDriver linkedListTestDriver37 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver37.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver37.clear();
        linkedListTestDriver31.addFirst((java.lang.Object) linkedListTestDriver37);
        java.lang.Object obj42 = linkedListTestDriver31.getFirst();
        boolean boolean43 = linkedListTestDriver21.contains((java.lang.Object) linkedListTestDriver31);
        java.lang.Object[] objArray44 = linkedListTestDriver31.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver45 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver45.clear();
        boolean boolean47 = linkedListTestDriver31.contains((java.lang.Object) linkedListTestDriver45);
        experiment.util.LinkedListTestDriver linkedListTestDriver48 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver48.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver48.clear();
        linkedListTestDriver48.addLast((java.lang.Object) 1.0f);
        experiment.util.LinkedListTestDriver linkedListTestDriver54 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver54.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver54.clear();
        linkedListTestDriver48.addFirst((java.lang.Object) linkedListTestDriver54);
        java.lang.Object obj61 = linkedListTestDriver48.set((int) (byte) 1, (java.lang.Object) 100.0d);
        linkedListTestDriver31.addFirst((java.lang.Object) linkedListTestDriver48);
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver6.add((int) '#', (java.lang.Object) linkedListTestDriver48);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 35; size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (byte) 10 + "'", obj14, (byte) 10);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + 1.0f + "'", obj28, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + obj61 + "' != '" + 1.0f + "'", obj61, 1.0f);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test197");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj3 = linkedListTestDriver0.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver4.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver4.clear();
        linkedListTestDriver4.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj10 = linkedListTestDriver4.getLast();
        linkedListTestDriver4.clear();
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver4);
        boolean boolean14 = linkedListTestDriver0.add((java.lang.Object) 0L);
        java.lang.Object obj16 = linkedListTestDriver0.remove((int) (short) 0);
        int int17 = linkedListTestDriver0.size();
        int int18 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver19 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver19.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver19.clear();
        linkedListTestDriver19.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj25 = linkedListTestDriver19.getLast();
        experiment.util.Iterator iterator26 = linkedListTestDriver19.iterator();
        boolean boolean28 = linkedListTestDriver19.contains((java.lang.Object) true);
        experiment.util.LinkedListTestDriver linkedListTestDriver29 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver29.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver29.clear();
        linkedListTestDriver29.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj35 = linkedListTestDriver29.getLast();
        experiment.util.Iterator iterator36 = linkedListTestDriver29.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver37 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver37.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj40 = linkedListTestDriver37.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver41 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver41.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver41.clear();
        linkedListTestDriver41.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj47 = linkedListTestDriver41.getLast();
        linkedListTestDriver41.clear();
        linkedListTestDriver37.addLast((java.lang.Object) linkedListTestDriver41);
        boolean boolean50 = linkedListTestDriver29.add((java.lang.Object) linkedListTestDriver37);
        boolean boolean51 = linkedListTestDriver29.isEmpty();
        boolean boolean52 = linkedListTestDriver19.add((java.lang.Object) linkedListTestDriver29);
        boolean boolean53 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver29);
        experiment.util.LinkedListTestDriver linkedListTestDriver55 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver55.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj58 = linkedListTestDriver55.removeLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver59 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver59.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver59.clear();
        linkedListTestDriver59.addLast((java.lang.Object) 1.0f);
        experiment.util.LinkedListTestDriver linkedListTestDriver65 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver65.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver65.clear();
        linkedListTestDriver59.addFirst((java.lang.Object) linkedListTestDriver65);
        int int70 = linkedListTestDriver59.size();
        linkedListTestDriver59.clear();
        linkedListTestDriver55.addLast((java.lang.Object) linkedListTestDriver59);
        experiment.util.LinkedListTestDriver linkedListTestDriver73 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver73.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj76 = linkedListTestDriver73.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver77 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver77.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver77.clear();
        linkedListTestDriver77.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj83 = linkedListTestDriver77.getLast();
        linkedListTestDriver77.clear();
        linkedListTestDriver73.addLast((java.lang.Object) linkedListTestDriver77);
        boolean boolean87 = linkedListTestDriver73.add((java.lang.Object) 0L);
        java.lang.Object obj88 = linkedListTestDriver73.getFirst();
        boolean boolean89 = linkedListTestDriver59.remove(obj88);
        linkedListTestDriver29.add((int) (byte) 1, obj88);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 10 + "'", obj3, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 1.0f + "'", obj10, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 1.0f + "'", obj25, 1.0f);
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 1.0f + "'", obj35, 1.0f);
        org.junit.Assert.assertNotNull(iterator36);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + (byte) 10 + "'", obj40, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + 1.0f + "'", obj47, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertEquals("'" + obj58 + "' != '" + (byte) 10 + "'", obj58, (byte) 10);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 2 + "'", int70 == 2);
        org.junit.Assert.assertEquals("'" + obj76 + "' != '" + (byte) 10 + "'", obj76, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj83 + "' != '" + 1.0f + "'", obj83, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertNotNull(obj88);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test198");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.addLast((java.lang.Object) 1.0f);
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver6.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver6.clear();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver6);
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver11.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj14 = linkedListTestDriver11.removeLast();
        experiment.util.Iterator iterator15 = linkedListTestDriver11.iterator();
        linkedListTestDriver11.clear();
        experiment.util.Iterator iterator17 = linkedListTestDriver11.iterator();
        boolean boolean18 = linkedListTestDriver6.remove((java.lang.Object) iterator17);
        linkedListTestDriver6.clear();
        java.lang.Object obj20 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = linkedListTestDriver6.contains(obj20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (byte) 10 + "'", obj14, (byte) 10);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test199");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj3 = linkedListTestDriver0.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver4.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver4.clear();
        linkedListTestDriver4.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj10 = linkedListTestDriver4.getLast();
        linkedListTestDriver4.clear();
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver4);
        boolean boolean14 = linkedListTestDriver0.add((java.lang.Object) 0L);
        java.lang.Object obj16 = linkedListTestDriver0.remove((int) (short) 0);
        int int17 = linkedListTestDriver0.size();
        int int18 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver19 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver19.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver19.clear();
        linkedListTestDriver19.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj25 = linkedListTestDriver19.getLast();
        experiment.util.Iterator iterator26 = linkedListTestDriver19.iterator();
        boolean boolean28 = linkedListTestDriver19.contains((java.lang.Object) true);
        experiment.util.LinkedListTestDriver linkedListTestDriver29 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver29.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver29.clear();
        linkedListTestDriver29.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj35 = linkedListTestDriver29.getLast();
        experiment.util.Iterator iterator36 = linkedListTestDriver29.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver37 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver37.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj40 = linkedListTestDriver37.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver41 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver41.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver41.clear();
        linkedListTestDriver41.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj47 = linkedListTestDriver41.getLast();
        linkedListTestDriver41.clear();
        linkedListTestDriver37.addLast((java.lang.Object) linkedListTestDriver41);
        boolean boolean50 = linkedListTestDriver29.add((java.lang.Object) linkedListTestDriver37);
        boolean boolean51 = linkedListTestDriver29.isEmpty();
        boolean boolean52 = linkedListTestDriver19.add((java.lang.Object) linkedListTestDriver29);
        boolean boolean53 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver29);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj55 = linkedListTestDriver0.remove((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 10 + "'", obj3, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 1.0f + "'", obj10, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 1.0f + "'", obj25, 1.0f);
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 1.0f + "'", obj35, 1.0f);
        org.junit.Assert.assertNotNull(iterator36);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + (byte) 10 + "'", obj40, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + 1.0f + "'", obj47, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test200");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.addLast((java.lang.Object) 1.0f);
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver6.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver6.clear();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver6);
        java.lang.Object obj11 = linkedListTestDriver0.getFirst();
        java.lang.Object[] objArray12 = linkedListTestDriver0.toArray();
        java.lang.Object obj13 = linkedListTestDriver0.getLast();
        java.lang.Object obj14 = linkedListTestDriver0.getFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver15 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver15.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj18 = linkedListTestDriver15.getFirst();
        boolean boolean20 = linkedListTestDriver15.remove((java.lang.Object) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver21 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver21.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver21.clear();
        linkedListTestDriver21.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj27 = linkedListTestDriver21.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver28 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver28.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver28.addFirst((java.lang.Object) 10);
        boolean boolean33 = linkedListTestDriver21.contains((java.lang.Object) 10);
        linkedListTestDriver15.addLast((java.lang.Object) 10);
        boolean boolean35 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver15);
        java.lang.Object obj36 = linkedListTestDriver15.removeFirst();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj38 = linkedListTestDriver15.get((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 1.0f + "'", obj13, 1.0f);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (byte) 10 + "'", obj18, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 1.0f + "'", obj27, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + (byte) 10 + "'", obj36, (byte) 10);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test201");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj6 = linkedListTestDriver0.getLast();
        experiment.util.Iterator iterator7 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver8.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj11 = linkedListTestDriver8.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver12.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver12.clear();
        linkedListTestDriver12.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj18 = linkedListTestDriver12.getLast();
        linkedListTestDriver12.clear();
        linkedListTestDriver8.addLast((java.lang.Object) linkedListTestDriver12);
        boolean boolean21 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver8);
        experiment.util.LinkedListTestDriver linkedListTestDriver22 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver22.addFirst((java.lang.Object) (byte) 10);
        experiment.util.LinkedListTestDriver linkedListTestDriver25 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver25.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj28 = linkedListTestDriver25.removeLast();
        experiment.util.Iterator iterator29 = linkedListTestDriver25.iterator();
        linkedListTestDriver25.clear();
        experiment.util.Iterator iterator31 = linkedListTestDriver25.iterator();
        java.lang.Class<?> wildcardClass32 = iterator31.getClass();
        linkedListTestDriver22.addLast((java.lang.Object) iterator31);
        experiment.util.LinkedListTestDriver linkedListTestDriver34 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver34.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver34.clear();
        linkedListTestDriver34.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj41 = linkedListTestDriver34.remove(0);
        boolean boolean43 = linkedListTestDriver34.remove((java.lang.Object) (short) 100);
        boolean boolean44 = linkedListTestDriver22.equals_CUT((java.lang.Object) (short) 100);
        boolean boolean45 = linkedListTestDriver8.contains((java.lang.Object) linkedListTestDriver22);
        java.lang.Object[] objArray46 = linkedListTestDriver22.toArray();
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0f + "'", obj6, 1.0f);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 10 + "'", obj11, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 1.0f + "'", obj18, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + (byte) 10 + "'", obj28, (byte) 10);
        org.junit.Assert.assertNotNull(iterator29);
        org.junit.Assert.assertNotNull(iterator31);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + 1.0f + "'", obj41, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(objArray46);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test202");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj7 = linkedListTestDriver0.remove(0);
        boolean boolean9 = linkedListTestDriver0.remove((java.lang.Object) (short) 100);
        linkedListTestDriver0.clear();
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1.0f + "'", obj7, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test203");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj6 = linkedListTestDriver0.getLast();
        experiment.util.Iterator iterator7 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver8.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj11 = linkedListTestDriver8.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver12.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver12.clear();
        linkedListTestDriver12.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj18 = linkedListTestDriver12.getLast();
        linkedListTestDriver12.clear();
        linkedListTestDriver8.addLast((java.lang.Object) linkedListTestDriver12);
        boolean boolean21 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver8);
        experiment.util.LinkedListTestDriver linkedListTestDriver22 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver22.addFirst((java.lang.Object) (byte) 10);
        experiment.util.LinkedListTestDriver linkedListTestDriver25 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver25.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj28 = linkedListTestDriver25.removeLast();
        experiment.util.Iterator iterator29 = linkedListTestDriver25.iterator();
        linkedListTestDriver25.clear();
        experiment.util.Iterator iterator31 = linkedListTestDriver25.iterator();
        java.lang.Class<?> wildcardClass32 = iterator31.getClass();
        linkedListTestDriver22.addLast((java.lang.Object) iterator31);
        experiment.util.LinkedListTestDriver linkedListTestDriver34 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver34.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver34.clear();
        linkedListTestDriver34.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj41 = linkedListTestDriver34.remove(0);
        boolean boolean43 = linkedListTestDriver34.remove((java.lang.Object) (short) 100);
        boolean boolean44 = linkedListTestDriver22.equals_CUT((java.lang.Object) (short) 100);
        boolean boolean45 = linkedListTestDriver8.contains((java.lang.Object) linkedListTestDriver22);
        experiment.util.LinkedListTestDriver linkedListTestDriver46 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver46.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj49 = linkedListTestDriver46.removeLast();
        experiment.util.Iterator iterator50 = linkedListTestDriver46.iterator();
        linkedListTestDriver46.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver52 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver52.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver52.clear();
        linkedListTestDriver52.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj58 = linkedListTestDriver52.getLast();
        java.lang.Object obj59 = new java.lang.Object();
        linkedListTestDriver52.addLast(obj59);
        boolean boolean61 = linkedListTestDriver46.add(obj59);
        linkedListTestDriver46.clear();
        boolean boolean63 = linkedListTestDriver8.remove((java.lang.Object) linkedListTestDriver46);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0f + "'", obj6, 1.0f);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 10 + "'", obj11, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 1.0f + "'", obj18, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + (byte) 10 + "'", obj28, (byte) 10);
        org.junit.Assert.assertNotNull(iterator29);
        org.junit.Assert.assertNotNull(iterator31);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + 1.0f + "'", obj41, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + (byte) 10 + "'", obj49, (byte) 10);
        org.junit.Assert.assertNotNull(iterator50);
        org.junit.Assert.assertEquals("'" + obj58 + "' != '" + 1.0f + "'", obj58, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test204");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj3 = linkedListTestDriver0.removeFirst();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = linkedListTestDriver0.getFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 10 + "'", obj3, (byte) 10);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test205");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver5.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver5.clear();
        linkedListTestDriver5.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj11 = linkedListTestDriver5.getLast();
        linkedListTestDriver5.clear();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver5);
        experiment.util.LinkedListTestDriver linkedListTestDriver14 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver14.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj17 = linkedListTestDriver14.removeLast();
        experiment.util.Iterator iterator18 = linkedListTestDriver14.iterator();
        linkedListTestDriver14.clear();
        boolean boolean20 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver14);
        java.lang.Object obj21 = linkedListTestDriver0.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver22 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver22.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj25 = linkedListTestDriver22.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver26 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver26.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver26.clear();
        linkedListTestDriver26.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj32 = linkedListTestDriver26.getLast();
        linkedListTestDriver26.clear();
        linkedListTestDriver22.addLast((java.lang.Object) linkedListTestDriver26);
        boolean boolean36 = linkedListTestDriver22.add((java.lang.Object) 0L);
        java.lang.Object obj38 = linkedListTestDriver22.remove((int) (short) 0);
        int int39 = linkedListTestDriver22.size();
        java.lang.Object[] objArray40 = linkedListTestDriver22.toArray();
        linkedListTestDriver0.addLast((java.lang.Object) objArray40);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 1.0f + "'", obj11, 1.0f);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) 10 + "'", obj17, (byte) 10);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (byte) 10 + "'", obj25, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 1.0f + "'", obj32, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[0]");
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test206");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj3 = linkedListTestDriver0.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver4.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver4.clear();
        linkedListTestDriver4.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj10 = linkedListTestDriver4.getLast();
        linkedListTestDriver4.clear();
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver4);
        boolean boolean14 = linkedListTestDriver0.add((java.lang.Object) 0L);
        experiment.util.Iterator iterator15 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver16 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver16.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver16.clear();
        linkedListTestDriver16.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj23 = linkedListTestDriver16.remove(0);
        boolean boolean25 = linkedListTestDriver16.remove((java.lang.Object) (short) 100);
        experiment.util.LinkedListTestDriver linkedListTestDriver26 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver26.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver26.clear();
        linkedListTestDriver26.addLast((java.lang.Object) 1.0f);
        experiment.util.LinkedListTestDriver linkedListTestDriver32 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver32.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver32.clear();
        linkedListTestDriver26.addFirst((java.lang.Object) linkedListTestDriver32);
        java.lang.Object obj37 = linkedListTestDriver26.getFirst();
        boolean boolean38 = linkedListTestDriver16.contains((java.lang.Object) linkedListTestDriver26);
        java.lang.Object[] objArray39 = linkedListTestDriver26.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver40 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver40.clear();
        boolean boolean42 = linkedListTestDriver26.contains((java.lang.Object) linkedListTestDriver40);
        experiment.util.LinkedListTestDriver linkedListTestDriver43 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver43.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver43.clear();
        linkedListTestDriver43.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj50 = linkedListTestDriver43.remove(0);
        boolean boolean52 = linkedListTestDriver43.remove((java.lang.Object) (short) 100);
        experiment.util.LinkedListTestDriver linkedListTestDriver53 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver53.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver53.clear();
        linkedListTestDriver53.addLast((java.lang.Object) 1.0f);
        experiment.util.LinkedListTestDriver linkedListTestDriver59 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver59.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver59.clear();
        linkedListTestDriver53.addFirst((java.lang.Object) linkedListTestDriver59);
        java.lang.Object obj64 = linkedListTestDriver53.getFirst();
        boolean boolean65 = linkedListTestDriver43.contains((java.lang.Object) linkedListTestDriver53);
        experiment.util.LinkedListTestDriver linkedListTestDriver66 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver66.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver66.clear();
        linkedListTestDriver66.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj73 = linkedListTestDriver66.remove(0);
        boolean boolean75 = linkedListTestDriver66.remove((java.lang.Object) (short) 100);
        experiment.util.LinkedListTestDriver linkedListTestDriver76 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver76.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver76.clear();
        linkedListTestDriver76.addLast((java.lang.Object) 1.0f);
        experiment.util.LinkedListTestDriver linkedListTestDriver82 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver82.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver82.clear();
        linkedListTestDriver76.addFirst((java.lang.Object) linkedListTestDriver82);
        java.lang.Object obj87 = linkedListTestDriver76.getFirst();
        boolean boolean88 = linkedListTestDriver66.contains((java.lang.Object) linkedListTestDriver76);
        java.lang.Object[] objArray89 = linkedListTestDriver76.toArray();
        linkedListTestDriver43.addLast((java.lang.Object) linkedListTestDriver76);
        linkedListTestDriver76.addFirst((java.lang.Object) (byte) 10);
        boolean boolean93 = linkedListTestDriver26.add((java.lang.Object) linkedListTestDriver76);
        linkedListTestDriver0.addLast((java.lang.Object) boolean93);
        boolean boolean95 = linkedListTestDriver0.isEmpty();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 10 + "'", obj3, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 1.0f + "'", obj10, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 1.0f + "'", obj23, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + 1.0f + "'", obj50, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(obj64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertEquals("'" + obj73 + "' != '" + 1.0f + "'", obj73, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(obj87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(objArray89);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test207");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj6 = linkedListTestDriver0.getLast();
        experiment.util.Iterator iterator7 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver8.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj11 = linkedListTestDriver8.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver12.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver12.clear();
        linkedListTestDriver12.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj18 = linkedListTestDriver12.getLast();
        linkedListTestDriver12.clear();
        linkedListTestDriver8.addLast((java.lang.Object) linkedListTestDriver12);
        boolean boolean21 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver8);
        experiment.util.LinkedListTestDriver linkedListTestDriver22 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver22.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver22.clear();
        linkedListTestDriver22.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj28 = linkedListTestDriver22.getLast();
        experiment.util.Iterator iterator29 = linkedListTestDriver22.iterator();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver22);
        linkedListTestDriver22.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj32 = linkedListTestDriver22.getLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0f + "'", obj6, 1.0f);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 10 + "'", obj11, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 1.0f + "'", obj18, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + 1.0f + "'", obj28, 1.0f);
        org.junit.Assert.assertNotNull(iterator29);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test208");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj7 = linkedListTestDriver0.remove(0);
        boolean boolean9 = linkedListTestDriver0.remove((java.lang.Object) (short) 100);
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver10.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver10.clear();
        linkedListTestDriver10.addLast((java.lang.Object) 1.0f);
        experiment.util.LinkedListTestDriver linkedListTestDriver16 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver16.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver16.clear();
        linkedListTestDriver10.addFirst((java.lang.Object) linkedListTestDriver16);
        java.lang.Object obj21 = linkedListTestDriver10.getFirst();
        boolean boolean22 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver10);
        experiment.util.LinkedListTestDriver linkedListTestDriver23 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver23.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver23.clear();
        linkedListTestDriver23.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj30 = linkedListTestDriver23.remove(0);
        boolean boolean32 = linkedListTestDriver23.remove((java.lang.Object) (short) 100);
        experiment.util.LinkedListTestDriver linkedListTestDriver33 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver33.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver33.clear();
        linkedListTestDriver33.addLast((java.lang.Object) 1.0f);
        experiment.util.LinkedListTestDriver linkedListTestDriver39 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver39.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver39.clear();
        linkedListTestDriver33.addFirst((java.lang.Object) linkedListTestDriver39);
        java.lang.Object obj44 = linkedListTestDriver33.getFirst();
        boolean boolean45 = linkedListTestDriver23.contains((java.lang.Object) linkedListTestDriver33);
        java.lang.Object[] objArray46 = linkedListTestDriver33.toArray();
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver33);
        java.lang.Object obj48 = linkedListTestDriver33.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver49 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver50 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver50.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj53 = linkedListTestDriver50.removeLast();
        experiment.util.Iterator iterator54 = linkedListTestDriver50.iterator();
        linkedListTestDriver49.addLast((java.lang.Object) iterator54);
        boolean boolean57 = linkedListTestDriver49.contains((java.lang.Object) (byte) 10);
        linkedListTestDriver33.addLast((java.lang.Object) linkedListTestDriver49);
        experiment.util.LinkedListTestDriver linkedListTestDriver59 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver59.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj62 = linkedListTestDriver59.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver63 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver63.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver63.clear();
        linkedListTestDriver63.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj69 = linkedListTestDriver63.getLast();
        linkedListTestDriver63.clear();
        linkedListTestDriver59.addLast((java.lang.Object) linkedListTestDriver63);
        boolean boolean73 = linkedListTestDriver59.add((java.lang.Object) 0L);
        java.lang.Object obj75 = linkedListTestDriver59.remove((int) (short) 0);
        java.lang.Class<?> wildcardClass76 = linkedListTestDriver59.getClass();
        linkedListTestDriver33.addLast((java.lang.Object) linkedListTestDriver59);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1.0f + "'", obj7, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + 1.0f + "'", obj30, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertEquals("'" + obj53 + "' != '" + (byte) 10 + "'", obj53, (byte) 10);
        org.junit.Assert.assertNotNull(iterator54);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertEquals("'" + obj62 + "' != '" + (byte) 10 + "'", obj62, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj69 + "' != '" + 1.0f + "'", obj69, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(obj75);
        org.junit.Assert.assertNotNull(wildcardClass76);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test209");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj7 = linkedListTestDriver0.remove(0);
        boolean boolean9 = linkedListTestDriver0.remove((java.lang.Object) (short) 100);
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver10.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver10.clear();
        linkedListTestDriver10.addLast((java.lang.Object) 1.0f);
        experiment.util.LinkedListTestDriver linkedListTestDriver16 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver16.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver16.clear();
        linkedListTestDriver10.addFirst((java.lang.Object) linkedListTestDriver16);
        java.lang.Object obj21 = linkedListTestDriver10.getFirst();
        boolean boolean22 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver10);
        experiment.util.LinkedListTestDriver linkedListTestDriver23 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver23.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver23.clear();
        linkedListTestDriver23.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj30 = linkedListTestDriver23.remove(0);
        boolean boolean32 = linkedListTestDriver23.remove((java.lang.Object) (short) 100);
        experiment.util.LinkedListTestDriver linkedListTestDriver33 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver33.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver33.clear();
        linkedListTestDriver33.addLast((java.lang.Object) 1.0f);
        experiment.util.LinkedListTestDriver linkedListTestDriver39 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver39.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver39.clear();
        linkedListTestDriver33.addFirst((java.lang.Object) linkedListTestDriver39);
        java.lang.Object obj44 = linkedListTestDriver33.getFirst();
        boolean boolean45 = linkedListTestDriver23.contains((java.lang.Object) linkedListTestDriver33);
        java.lang.Object[] objArray46 = linkedListTestDriver33.toArray();
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver33);
        java.lang.Object obj48 = linkedListTestDriver33.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver49 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver49.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj52 = linkedListTestDriver49.removeLast();
        experiment.util.Iterator iterator53 = linkedListTestDriver49.iterator();
        linkedListTestDriver49.clear();
        experiment.util.Iterator iterator55 = linkedListTestDriver49.iterator();
        boolean boolean56 = linkedListTestDriver33.remove((java.lang.Object) linkedListTestDriver49);
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator58 = linkedListTestDriver33.listIterator((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 35; size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1.0f + "'", obj7, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + 1.0f + "'", obj30, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertEquals("'" + obj52 + "' != '" + (byte) 10 + "'", obj52, (byte) 10);
        org.junit.Assert.assertNotNull(iterator53);
        org.junit.Assert.assertNotNull(iterator55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test210");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj7 = linkedListTestDriver0.remove(0);
        boolean boolean9 = linkedListTestDriver0.remove((java.lang.Object) (short) 100);
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver10.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver10.clear();
        linkedListTestDriver10.addLast((java.lang.Object) 1.0f);
        experiment.util.LinkedListTestDriver linkedListTestDriver16 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver16.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver16.clear();
        linkedListTestDriver10.addFirst((java.lang.Object) linkedListTestDriver16);
        java.lang.Object obj21 = linkedListTestDriver10.getFirst();
        boolean boolean22 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver10);
        java.lang.Object[] objArray23 = linkedListTestDriver10.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver24 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver24.clear();
        boolean boolean26 = linkedListTestDriver10.contains((java.lang.Object) linkedListTestDriver24);
        experiment.util.LinkedListTestDriver linkedListTestDriver27 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver27.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver27.clear();
        linkedListTestDriver27.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj34 = linkedListTestDriver27.remove(0);
        boolean boolean36 = linkedListTestDriver27.remove((java.lang.Object) (short) 100);
        experiment.util.LinkedListTestDriver linkedListTestDriver37 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver37.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver37.clear();
        linkedListTestDriver37.addLast((java.lang.Object) 1.0f);
        experiment.util.LinkedListTestDriver linkedListTestDriver43 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver43.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver43.clear();
        linkedListTestDriver37.addFirst((java.lang.Object) linkedListTestDriver43);
        java.lang.Object obj48 = linkedListTestDriver37.getFirst();
        boolean boolean49 = linkedListTestDriver27.contains((java.lang.Object) linkedListTestDriver37);
        experiment.util.LinkedListTestDriver linkedListTestDriver50 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver50.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver50.clear();
        linkedListTestDriver50.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj57 = linkedListTestDriver50.remove(0);
        boolean boolean59 = linkedListTestDriver50.remove((java.lang.Object) (short) 100);
        experiment.util.LinkedListTestDriver linkedListTestDriver60 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver60.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver60.clear();
        linkedListTestDriver60.addLast((java.lang.Object) 1.0f);
        experiment.util.LinkedListTestDriver linkedListTestDriver66 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver66.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver66.clear();
        linkedListTestDriver60.addFirst((java.lang.Object) linkedListTestDriver66);
        java.lang.Object obj71 = linkedListTestDriver60.getFirst();
        boolean boolean72 = linkedListTestDriver50.contains((java.lang.Object) linkedListTestDriver60);
        java.lang.Object[] objArray73 = linkedListTestDriver60.toArray();
        linkedListTestDriver27.addLast((java.lang.Object) linkedListTestDriver60);
        linkedListTestDriver60.addFirst((java.lang.Object) (byte) 10);
        boolean boolean77 = linkedListTestDriver10.add((java.lang.Object) linkedListTestDriver60);
        linkedListTestDriver60.clear();
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1.0f + "'", obj7, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + 1.0f + "'", obj34, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + obj57 + "' != '" + 1.0f + "'", obj57, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(obj71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(objArray73);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test211");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj3 = linkedListTestDriver0.getFirst();
        boolean boolean5 = linkedListTestDriver0.remove((java.lang.Object) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver6.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver6.clear();
        linkedListTestDriver6.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj12 = linkedListTestDriver6.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver13.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver13.addFirst((java.lang.Object) 10);
        boolean boolean18 = linkedListTestDriver6.contains((java.lang.Object) 10);
        linkedListTestDriver0.addLast((java.lang.Object) 10);
        experiment.util.LinkedListTestDriver linkedListTestDriver21 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver21.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver21.clear();
        linkedListTestDriver21.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver26 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver26.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj29 = linkedListTestDriver26.removeLast();
        boolean boolean30 = linkedListTestDriver21.add((java.lang.Object) linkedListTestDriver26);
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.add((int) (short) -1, (java.lang.Object) linkedListTestDriver21);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: -1; size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 10 + "'", obj3, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 1.0f + "'", obj12, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + (byte) 10 + "'", obj29, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test212");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        experiment.util.LinkedListTestDriver linkedListTestDriver3 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver3.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj6 = linkedListTestDriver3.removeLast();
        experiment.util.Iterator iterator7 = linkedListTestDriver3.iterator();
        linkedListTestDriver3.clear();
        experiment.util.Iterator iterator9 = linkedListTestDriver3.iterator();
        java.lang.Class<?> wildcardClass10 = iterator9.getClass();
        linkedListTestDriver0.addLast((java.lang.Object) iterator9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = linkedListTestDriver0.get((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 10 + "'", obj6, (byte) 10);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test213");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj3 = linkedListTestDriver0.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver4.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver4.clear();
        linkedListTestDriver4.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj10 = linkedListTestDriver4.getLast();
        linkedListTestDriver4.clear();
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver4);
        boolean boolean14 = linkedListTestDriver0.add((java.lang.Object) 0L);
        experiment.util.Iterator iterator15 = linkedListTestDriver0.iterator();
        java.lang.Object obj16 = linkedListTestDriver0.removeLast();
        boolean boolean17 = linkedListTestDriver0.isEmpty();
        linkedListTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = linkedListTestDriver0.get(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 10 + "'", obj3, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 1.0f + "'", obj10, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0L + "'", obj16, 0L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test214");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj6 = linkedListTestDriver0.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver7.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj10 = linkedListTestDriver7.getFirst();
        boolean boolean12 = linkedListTestDriver7.remove((java.lang.Object) 1);
        boolean boolean13 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver7);
        boolean boolean14 = linkedListTestDriver7.isEmpty();
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0f + "'", obj6, 1.0f);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) 10 + "'", obj10, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test215");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.addLast((java.lang.Object) 1.0f);
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver6.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver6.clear();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver6);
        java.lang.Object obj11 = linkedListTestDriver0.getFirst();
        java.lang.Object[] objArray12 = linkedListTestDriver0.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver13.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj16 = linkedListTestDriver13.removeLast();
        experiment.util.Iterator iterator17 = linkedListTestDriver13.iterator();
        linkedListTestDriver13.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver19 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver19.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver19.clear();
        linkedListTestDriver19.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj25 = linkedListTestDriver19.getLast();
        java.lang.Object obj26 = new java.lang.Object();
        linkedListTestDriver19.addLast(obj26);
        boolean boolean28 = linkedListTestDriver13.add(obj26);
        int int29 = linkedListTestDriver13.size();
        linkedListTestDriver0.addLast((java.lang.Object) int29);
        java.lang.Object obj31 = linkedListTestDriver0.removeLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver32 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver32.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver32.clear();
        linkedListTestDriver32.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj39 = linkedListTestDriver32.remove(0);
        boolean boolean41 = linkedListTestDriver32.remove((java.lang.Object) (short) 100);
        experiment.util.LinkedListTestDriver linkedListTestDriver42 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver42.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver42.clear();
        linkedListTestDriver42.addLast((java.lang.Object) 1.0f);
        experiment.util.LinkedListTestDriver linkedListTestDriver48 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver48.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver48.clear();
        linkedListTestDriver42.addFirst((java.lang.Object) linkedListTestDriver48);
        java.lang.Object obj53 = linkedListTestDriver42.getFirst();
        boolean boolean54 = linkedListTestDriver32.contains((java.lang.Object) linkedListTestDriver42);
        experiment.util.LinkedListTestDriver linkedListTestDriver55 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver55.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver55.clear();
        linkedListTestDriver55.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj62 = linkedListTestDriver55.remove(0);
        boolean boolean64 = linkedListTestDriver55.remove((java.lang.Object) (short) 100);
        experiment.util.LinkedListTestDriver linkedListTestDriver65 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver65.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver65.clear();
        linkedListTestDriver65.addLast((java.lang.Object) 1.0f);
        experiment.util.LinkedListTestDriver linkedListTestDriver71 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver71.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver71.clear();
        linkedListTestDriver65.addFirst((java.lang.Object) linkedListTestDriver71);
        java.lang.Object obj76 = linkedListTestDriver65.getFirst();
        boolean boolean77 = linkedListTestDriver55.contains((java.lang.Object) linkedListTestDriver65);
        java.lang.Object[] objArray78 = linkedListTestDriver65.toArray();
        linkedListTestDriver32.addLast((java.lang.Object) linkedListTestDriver65);
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver65);
        java.lang.Object obj81 = linkedListTestDriver65.getLast();
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (byte) 10 + "'", obj16, (byte) 10);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 1.0f + "'", obj25, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 1 + "'", obj31, 1);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + 1.0f + "'", obj39, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(obj53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + obj62 + "' != '" + 1.0f + "'", obj62, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(obj76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(objArray78);
        org.junit.Assert.assertEquals("'" + obj81 + "' != '" + 1.0f + "'", obj81, 1.0f);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test216");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj6 = linkedListTestDriver0.getLast();
        experiment.util.Iterator iterator7 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver8.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj11 = linkedListTestDriver8.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver12.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver12.clear();
        linkedListTestDriver12.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj18 = linkedListTestDriver12.getLast();
        linkedListTestDriver12.clear();
        linkedListTestDriver8.addLast((java.lang.Object) linkedListTestDriver12);
        boolean boolean21 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver8);
        experiment.util.LinkedListTestDriver linkedListTestDriver22 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver22.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver22.clear();
        linkedListTestDriver22.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj28 = linkedListTestDriver22.getLast();
        experiment.util.Iterator iterator29 = linkedListTestDriver22.iterator();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver22);
        linkedListTestDriver22.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver32 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver32.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver32.clear();
        linkedListTestDriver32.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj38 = linkedListTestDriver32.getLast();
        java.lang.Object obj39 = linkedListTestDriver32.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver40 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver40.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj43 = linkedListTestDriver40.removeFirst();
        boolean boolean44 = linkedListTestDriver32.equals_CUT((java.lang.Object) linkedListTestDriver40);
        linkedListTestDriver40.clear();
        boolean boolean46 = linkedListTestDriver22.add((java.lang.Object) linkedListTestDriver40);
        experiment.util.Iterator iterator47 = linkedListTestDriver22.iterator();
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0f + "'", obj6, 1.0f);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 10 + "'", obj11, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 1.0f + "'", obj18, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + 1.0f + "'", obj28, 1.0f);
        org.junit.Assert.assertNotNull(iterator29);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + 1.0f + "'", obj38, 1.0f);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + 1.0f + "'", obj39, 1.0f);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + (byte) 10 + "'", obj43, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(iterator47);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test217");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver5.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver5.clear();
        linkedListTestDriver5.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj11 = linkedListTestDriver5.getLast();
        linkedListTestDriver5.clear();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver5);
        experiment.util.LinkedListTestDriver linkedListTestDriver14 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver14.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj17 = linkedListTestDriver14.removeLast();
        experiment.util.Iterator iterator18 = linkedListTestDriver14.iterator();
        linkedListTestDriver14.clear();
        boolean boolean20 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver14);
        experiment.util.ListIterator listIterator22 = linkedListTestDriver0.listIterator((int) (short) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver24 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver24.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver24.clear();
        linkedListTestDriver24.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj30 = linkedListTestDriver24.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver31 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver31.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver31.addFirst((java.lang.Object) 10);
        boolean boolean36 = linkedListTestDriver24.contains((java.lang.Object) 10);
        java.lang.Object obj37 = linkedListTestDriver24.getLast();
        java.lang.Class<?> wildcardClass38 = obj37.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj39 = linkedListTestDriver0.set((-1), obj37);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 1.0f + "'", obj11, 1.0f);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) 10 + "'", obj17, (byte) 10);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(listIterator22);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + 1.0f + "'", obj30, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + 1.0f + "'", obj37, 1.0f);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test218");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.addLast((java.lang.Object) 1.0f);
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver6.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver6.clear();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver6);
        java.lang.Object obj13 = linkedListTestDriver0.set((int) (byte) 1, (java.lang.Object) 100.0d);
        java.lang.Object[] objArray14 = linkedListTestDriver0.toArray();
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 1.0f + "'", obj13, 1.0f);
        org.junit.Assert.assertNotNull(objArray14);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test219");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj6 = linkedListTestDriver0.getLast();
        experiment.util.Iterator iterator7 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver8.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj11 = linkedListTestDriver8.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver12.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver12.clear();
        linkedListTestDriver12.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj18 = linkedListTestDriver12.getLast();
        linkedListTestDriver12.clear();
        linkedListTestDriver8.addLast((java.lang.Object) linkedListTestDriver12);
        boolean boolean21 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver8);
        experiment.util.LinkedListTestDriver linkedListTestDriver22 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver22.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver22.clear();
        linkedListTestDriver22.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj28 = linkedListTestDriver22.getLast();
        experiment.util.Iterator iterator29 = linkedListTestDriver22.iterator();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver22);
        linkedListTestDriver22.addLast((java.lang.Object) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj34 = linkedListTestDriver22.remove((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0f + "'", obj6, 1.0f);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 10 + "'", obj11, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 1.0f + "'", obj18, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + 1.0f + "'", obj28, 1.0f);
        org.junit.Assert.assertNotNull(iterator29);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test220");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj7 = linkedListTestDriver0.remove(0);
        boolean boolean9 = linkedListTestDriver0.remove((java.lang.Object) (short) 100);
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver10.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver10.clear();
        linkedListTestDriver10.addLast((java.lang.Object) 1.0f);
        experiment.util.LinkedListTestDriver linkedListTestDriver16 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver16.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver16.clear();
        linkedListTestDriver10.addFirst((java.lang.Object) linkedListTestDriver16);
        java.lang.Object obj21 = linkedListTestDriver10.getFirst();
        boolean boolean22 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver10);
        experiment.util.LinkedListTestDriver linkedListTestDriver23 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver23.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver23.clear();
        linkedListTestDriver23.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj30 = linkedListTestDriver23.remove(0);
        boolean boolean32 = linkedListTestDriver23.remove((java.lang.Object) (short) 100);
        experiment.util.LinkedListTestDriver linkedListTestDriver33 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver33.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver33.clear();
        linkedListTestDriver33.addLast((java.lang.Object) 1.0f);
        experiment.util.LinkedListTestDriver linkedListTestDriver39 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver39.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver39.clear();
        linkedListTestDriver33.addFirst((java.lang.Object) linkedListTestDriver39);
        java.lang.Object obj44 = linkedListTestDriver33.getFirst();
        boolean boolean45 = linkedListTestDriver23.contains((java.lang.Object) linkedListTestDriver33);
        java.lang.Object[] objArray46 = linkedListTestDriver33.toArray();
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver33);
        java.lang.Object obj48 = linkedListTestDriver33.removeLast();
        linkedListTestDriver33.clear();
        boolean boolean51 = linkedListTestDriver33.contains((java.lang.Object) (short) 0);
        linkedListTestDriver33.clear();
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1.0f + "'", obj7, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + 1.0f + "'", obj30, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + 1.0f + "'", obj48, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test221");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj3 = linkedListTestDriver0.removeLast();
        experiment.util.Iterator iterator4 = linkedListTestDriver0.iterator();
        boolean boolean6 = linkedListTestDriver0.contains((java.lang.Object) "hi!");
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver7.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj10 = linkedListTestDriver7.removeLast();
        experiment.util.Iterator iterator11 = linkedListTestDriver7.iterator();
        linkedListTestDriver7.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver13.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver13.clear();
        linkedListTestDriver13.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj19 = linkedListTestDriver13.getLast();
        java.lang.Object obj20 = new java.lang.Object();
        linkedListTestDriver13.addLast(obj20);
        boolean boolean22 = linkedListTestDriver7.add(obj20);
        boolean boolean23 = linkedListTestDriver0.remove((java.lang.Object) boolean22);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = linkedListTestDriver0.removeLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 10 + "'", obj3, (byte) 10);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) 10 + "'", obj10, (byte) 10);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 1.0f + "'", obj19, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test222");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj6 = linkedListTestDriver0.getLast();
        java.lang.Object obj7 = linkedListTestDriver0.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver8.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj11 = linkedListTestDriver8.removeFirst();
        boolean boolean12 = linkedListTestDriver0.equals_CUT((java.lang.Object) linkedListTestDriver8);
        linkedListTestDriver8.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = linkedListTestDriver8.remove((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0f + "'", obj6, 1.0f);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1.0f + "'", obj7, 1.0f);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 10 + "'", obj11, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test223");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj7 = linkedListTestDriver0.remove(0);
        boolean boolean9 = linkedListTestDriver0.remove((java.lang.Object) (short) 100);
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver10.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver10.clear();
        linkedListTestDriver10.addLast((java.lang.Object) 1.0f);
        experiment.util.LinkedListTestDriver linkedListTestDriver16 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver16.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver16.clear();
        linkedListTestDriver10.addFirst((java.lang.Object) linkedListTestDriver16);
        java.lang.Object obj21 = linkedListTestDriver10.getFirst();
        boolean boolean22 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver10);
        experiment.util.LinkedListTestDriver linkedListTestDriver23 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver23.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver23.clear();
        linkedListTestDriver23.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj30 = linkedListTestDriver23.remove(0);
        boolean boolean32 = linkedListTestDriver23.remove((java.lang.Object) (short) 100);
        experiment.util.LinkedListTestDriver linkedListTestDriver33 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver33.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver33.clear();
        linkedListTestDriver33.addLast((java.lang.Object) 1.0f);
        experiment.util.LinkedListTestDriver linkedListTestDriver39 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver39.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver39.clear();
        linkedListTestDriver33.addFirst((java.lang.Object) linkedListTestDriver39);
        java.lang.Object obj44 = linkedListTestDriver33.getFirst();
        boolean boolean45 = linkedListTestDriver23.contains((java.lang.Object) linkedListTestDriver33);
        java.lang.Object[] objArray46 = linkedListTestDriver33.toArray();
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver33);
        linkedListTestDriver0.clear();
        java.lang.Class<?> wildcardClass49 = linkedListTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1.0f + "'", obj7, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + 1.0f + "'", obj30, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test224");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver5.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver5.clear();
        linkedListTestDriver5.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj11 = linkedListTestDriver5.getLast();
        linkedListTestDriver5.clear();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver5);
        experiment.util.LinkedListTestDriver linkedListTestDriver14 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver14.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj17 = linkedListTestDriver14.removeLast();
        experiment.util.Iterator iterator18 = linkedListTestDriver14.iterator();
        linkedListTestDriver14.clear();
        boolean boolean20 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = linkedListTestDriver14.getFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 1.0f + "'", obj11, 1.0f);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) 10 + "'", obj17, (byte) 10);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test225");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj3 = linkedListTestDriver0.removeLast();
        experiment.util.Iterator iterator4 = linkedListTestDriver0.iterator();
        boolean boolean6 = linkedListTestDriver0.contains((java.lang.Object) "hi!");
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver7.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj10 = linkedListTestDriver7.removeLast();
        experiment.util.Iterator iterator11 = linkedListTestDriver7.iterator();
        linkedListTestDriver7.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver13.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver13.clear();
        linkedListTestDriver13.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj19 = linkedListTestDriver13.getLast();
        java.lang.Object obj20 = new java.lang.Object();
        linkedListTestDriver13.addLast(obj20);
        boolean boolean22 = linkedListTestDriver7.add(obj20);
        boolean boolean23 = linkedListTestDriver0.remove((java.lang.Object) boolean22);
        experiment.util.LinkedListTestDriver linkedListTestDriver24 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver24.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj27 = linkedListTestDriver24.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver28 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver28.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver28.clear();
        linkedListTestDriver28.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj34 = linkedListTestDriver28.getLast();
        linkedListTestDriver28.clear();
        linkedListTestDriver24.addLast((java.lang.Object) linkedListTestDriver28);
        boolean boolean38 = linkedListTestDriver24.add((java.lang.Object) 0L);
        experiment.util.Iterator iterator39 = linkedListTestDriver24.iterator();
        java.lang.Object obj40 = linkedListTestDriver24.removeLast();
        boolean boolean41 = linkedListTestDriver24.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver42 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver42.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver42.clear();
        linkedListTestDriver42.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj48 = linkedListTestDriver42.getLast();
        linkedListTestDriver42.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver50 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver50.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj53 = linkedListTestDriver50.getFirst();
        boolean boolean55 = linkedListTestDriver50.remove((java.lang.Object) 1);
        boolean boolean56 = linkedListTestDriver42.remove((java.lang.Object) 1);
        boolean boolean57 = linkedListTestDriver24.contains((java.lang.Object) linkedListTestDriver42);
        linkedListTestDriver0.addFirst((java.lang.Object) boolean57);
        experiment.util.LinkedListTestDriver linkedListTestDriver59 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver59.addFirst((java.lang.Object) (byte) 10);
        experiment.util.LinkedListTestDriver linkedListTestDriver62 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver62.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj65 = linkedListTestDriver62.removeLast();
        experiment.util.Iterator iterator66 = linkedListTestDriver62.iterator();
        linkedListTestDriver62.clear();
        experiment.util.Iterator iterator68 = linkedListTestDriver62.iterator();
        java.lang.Class<?> wildcardClass69 = iterator68.getClass();
        linkedListTestDriver59.addLast((java.lang.Object) iterator68);
        java.lang.Object[] objArray71 = linkedListTestDriver59.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver72 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver72.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver72.clear();
        linkedListTestDriver72.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj78 = linkedListTestDriver72.getLast();
        linkedListTestDriver72.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver80 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver80.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj83 = linkedListTestDriver80.getFirst();
        boolean boolean85 = linkedListTestDriver80.remove((java.lang.Object) 1);
        boolean boolean86 = linkedListTestDriver72.remove((java.lang.Object) 1);
        boolean boolean87 = linkedListTestDriver59.add((java.lang.Object) linkedListTestDriver72);
        linkedListTestDriver0.addLast((java.lang.Object) boolean87);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 10 + "'", obj3, (byte) 10);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) 10 + "'", obj10, (byte) 10);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 1.0f + "'", obj19, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + (byte) 10 + "'", obj27, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + 1.0f + "'", obj34, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(iterator39);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + 0L + "'", obj40, 0L);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + 1.0f + "'", obj48, 1.0f);
        org.junit.Assert.assertEquals("'" + obj53 + "' != '" + (byte) 10 + "'", obj53, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertEquals("'" + obj65 + "' != '" + (byte) 10 + "'", obj65, (byte) 10);
        org.junit.Assert.assertNotNull(iterator66);
        org.junit.Assert.assertNotNull(iterator68);
        org.junit.Assert.assertNotNull(wildcardClass69);
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertEquals("'" + obj78 + "' != '" + 1.0f + "'", obj78, 1.0f);
        org.junit.Assert.assertEquals("'" + obj83 + "' != '" + (byte) 10 + "'", obj83, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test226");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj3 = linkedListTestDriver0.removeLast();
        experiment.util.Iterator iterator4 = linkedListTestDriver0.iterator();
        linkedListTestDriver0.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver6.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver6.clear();
        linkedListTestDriver6.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj12 = linkedListTestDriver6.getLast();
        java.lang.Object obj13 = new java.lang.Object();
        linkedListTestDriver6.addLast(obj13);
        boolean boolean15 = linkedListTestDriver0.add(obj13);
        java.lang.Object obj16 = null;
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.addFirst(obj16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 10 + "'", obj3, (byte) 10);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 1.0f + "'", obj12, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test227");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj7 = linkedListTestDriver0.remove(0);
        boolean boolean9 = linkedListTestDriver0.remove((java.lang.Object) (short) 100);
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver10.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver10.clear();
        linkedListTestDriver10.addLast((java.lang.Object) 1.0f);
        experiment.util.LinkedListTestDriver linkedListTestDriver16 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver16.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver16.clear();
        linkedListTestDriver10.addFirst((java.lang.Object) linkedListTestDriver16);
        java.lang.Object obj21 = linkedListTestDriver10.getFirst();
        boolean boolean22 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver10);
        experiment.util.LinkedListTestDriver linkedListTestDriver23 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver23.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver23.clear();
        linkedListTestDriver23.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj30 = linkedListTestDriver23.remove(0);
        boolean boolean32 = linkedListTestDriver23.remove((java.lang.Object) (short) 100);
        experiment.util.LinkedListTestDriver linkedListTestDriver33 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver33.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver33.clear();
        linkedListTestDriver33.addLast((java.lang.Object) 1.0f);
        experiment.util.LinkedListTestDriver linkedListTestDriver39 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver39.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver39.clear();
        linkedListTestDriver33.addFirst((java.lang.Object) linkedListTestDriver39);
        java.lang.Object obj44 = linkedListTestDriver33.getFirst();
        boolean boolean45 = linkedListTestDriver23.contains((java.lang.Object) linkedListTestDriver33);
        java.lang.Object[] objArray46 = linkedListTestDriver33.toArray();
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver33);
        java.lang.Object obj48 = linkedListTestDriver33.removeLast();
        java.lang.Object obj49 = linkedListTestDriver33.removeLast();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj51 = linkedListTestDriver33.get(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1.0f + "'", obj7, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + 1.0f + "'", obj30, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + 1.0f + "'", obj48, 1.0f);
        org.junit.Assert.assertNotNull(obj49);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test228");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj3 = linkedListTestDriver0.getFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver4.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver4.clear();
        linkedListTestDriver4.addLast((java.lang.Object) 1.0f);
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver10.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver10.clear();
        linkedListTestDriver4.addFirst((java.lang.Object) linkedListTestDriver10);
        int int15 = linkedListTestDriver4.size();
        linkedListTestDriver0.addFirst((java.lang.Object) int15);
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver17.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver17.clear();
        linkedListTestDriver17.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj23 = linkedListTestDriver17.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver24 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver24.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver24.addFirst((java.lang.Object) 10);
        boolean boolean29 = linkedListTestDriver17.contains((java.lang.Object) 10);
        boolean boolean30 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver17);
        experiment.util.LinkedListTestDriver linkedListTestDriver31 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver32 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver32.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj35 = linkedListTestDriver32.removeLast();
        experiment.util.Iterator iterator36 = linkedListTestDriver32.iterator();
        linkedListTestDriver31.addLast((java.lang.Object) iterator36);
        linkedListTestDriver17.addFirst((java.lang.Object) iterator36);
        linkedListTestDriver17.addLast((java.lang.Object) 0.0d);
        experiment.util.LinkedListTestDriver linkedListTestDriver42 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver42.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver42.clear();
        linkedListTestDriver42.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver47 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver47.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver47.clear();
        linkedListTestDriver47.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj53 = linkedListTestDriver47.getLast();
        linkedListTestDriver47.clear();
        linkedListTestDriver42.addFirst((java.lang.Object) linkedListTestDriver47);
        experiment.util.LinkedListTestDriver linkedListTestDriver56 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver56.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj59 = linkedListTestDriver56.removeLast();
        experiment.util.Iterator iterator60 = linkedListTestDriver56.iterator();
        linkedListTestDriver56.clear();
        boolean boolean62 = linkedListTestDriver42.remove((java.lang.Object) linkedListTestDriver56);
        experiment.util.ListIterator listIterator64 = linkedListTestDriver42.listIterator((int) (short) 1);
        linkedListTestDriver17.add(1, (java.lang.Object) (short) 1);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 10 + "'", obj3, (byte) 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 1.0f + "'", obj23, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + (byte) 10 + "'", obj35, (byte) 10);
        org.junit.Assert.assertNotNull(iterator36);
        org.junit.Assert.assertEquals("'" + obj53 + "' != '" + 1.0f + "'", obj53, 1.0f);
        org.junit.Assert.assertEquals("'" + obj59 + "' != '" + (byte) 10 + "'", obj59, (byte) 10);
        org.junit.Assert.assertNotNull(iterator60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(listIterator64);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test229");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj6 = linkedListTestDriver0.getLast();
        java.lang.Object obj7 = linkedListTestDriver0.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver8.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj11 = linkedListTestDriver8.removeFirst();
        boolean boolean12 = linkedListTestDriver0.equals_CUT((java.lang.Object) linkedListTestDriver8);
        linkedListTestDriver8.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver14 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver14.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver14.clear();
        linkedListTestDriver14.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj21 = linkedListTestDriver14.remove(0);
        boolean boolean23 = linkedListTestDriver14.remove((java.lang.Object) (short) 100);
        experiment.util.LinkedListTestDriver linkedListTestDriver24 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver24.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver24.clear();
        linkedListTestDriver24.addLast((java.lang.Object) 1.0f);
        experiment.util.LinkedListTestDriver linkedListTestDriver30 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver30.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver30.clear();
        linkedListTestDriver24.addFirst((java.lang.Object) linkedListTestDriver30);
        java.lang.Object obj35 = linkedListTestDriver24.getFirst();
        boolean boolean36 = linkedListTestDriver14.contains((java.lang.Object) linkedListTestDriver24);
        java.lang.Object[] objArray37 = linkedListTestDriver24.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver38 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver38.clear();
        boolean boolean40 = linkedListTestDriver24.contains((java.lang.Object) linkedListTestDriver38);
        experiment.util.LinkedListTestDriver linkedListTestDriver41 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver41.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver41.clear();
        linkedListTestDriver41.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj48 = linkedListTestDriver41.remove(0);
        boolean boolean50 = linkedListTestDriver41.remove((java.lang.Object) (short) 100);
        experiment.util.LinkedListTestDriver linkedListTestDriver51 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver51.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver51.clear();
        linkedListTestDriver51.addLast((java.lang.Object) 1.0f);
        experiment.util.LinkedListTestDriver linkedListTestDriver57 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver57.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver57.clear();
        linkedListTestDriver51.addFirst((java.lang.Object) linkedListTestDriver57);
        java.lang.Object obj62 = linkedListTestDriver51.getFirst();
        boolean boolean63 = linkedListTestDriver41.contains((java.lang.Object) linkedListTestDriver51);
        experiment.util.LinkedListTestDriver linkedListTestDriver64 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver64.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver64.clear();
        linkedListTestDriver64.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj71 = linkedListTestDriver64.remove(0);
        boolean boolean73 = linkedListTestDriver64.remove((java.lang.Object) (short) 100);
        experiment.util.LinkedListTestDriver linkedListTestDriver74 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver74.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver74.clear();
        linkedListTestDriver74.addLast((java.lang.Object) 1.0f);
        experiment.util.LinkedListTestDriver linkedListTestDriver80 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver80.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver80.clear();
        linkedListTestDriver74.addFirst((java.lang.Object) linkedListTestDriver80);
        java.lang.Object obj85 = linkedListTestDriver74.getFirst();
        boolean boolean86 = linkedListTestDriver64.contains((java.lang.Object) linkedListTestDriver74);
        java.lang.Object[] objArray87 = linkedListTestDriver74.toArray();
        linkedListTestDriver41.addLast((java.lang.Object) linkedListTestDriver74);
        linkedListTestDriver74.addFirst((java.lang.Object) (byte) 10);
        boolean boolean91 = linkedListTestDriver24.add((java.lang.Object) linkedListTestDriver74);
        boolean boolean92 = linkedListTestDriver8.equals_CUT((java.lang.Object) linkedListTestDriver24);
        experiment.util.ListIterator listIterator94 = linkedListTestDriver8.listIterator(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj95 = linkedListTestDriver8.getLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0f + "'", obj6, 1.0f);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1.0f + "'", obj7, 1.0f);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 10 + "'", obj11, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 1.0f + "'", obj21, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + 1.0f + "'", obj48, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(obj62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertEquals("'" + obj71 + "' != '" + 1.0f + "'", obj71, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(obj85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(objArray87);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertNotNull(listIterator94);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test230");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj6 = linkedListTestDriver0.getLast();
        java.lang.Object obj7 = new java.lang.Object();
        linkedListTestDriver0.addLast(obj7);
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver9.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj12 = linkedListTestDriver9.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver13.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver13.clear();
        linkedListTestDriver13.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj19 = linkedListTestDriver13.getLast();
        linkedListTestDriver13.clear();
        linkedListTestDriver9.addLast((java.lang.Object) linkedListTestDriver13);
        boolean boolean23 = linkedListTestDriver9.add((java.lang.Object) 0L);
        java.lang.Object obj25 = linkedListTestDriver9.remove((int) (short) 0);
        int int26 = linkedListTestDriver9.size();
        int int27 = linkedListTestDriver9.size();
        boolean boolean28 = linkedListTestDriver0.contains((java.lang.Object) int27);
        java.lang.Object obj29 = linkedListTestDriver0.removeFirst();
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0f + "'", obj6, 1.0f);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) 10 + "'", obj12, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 1.0f + "'", obj19, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 1.0f + "'", obj29, 1.0f);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test231");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj7 = linkedListTestDriver0.remove(0);
        boolean boolean9 = linkedListTestDriver0.remove((java.lang.Object) (short) 100);
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver10.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver10.clear();
        linkedListTestDriver10.addLast((java.lang.Object) 1.0f);
        experiment.util.LinkedListTestDriver linkedListTestDriver16 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver16.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver16.clear();
        linkedListTestDriver10.addFirst((java.lang.Object) linkedListTestDriver16);
        java.lang.Object obj21 = linkedListTestDriver10.getFirst();
        boolean boolean22 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver10);
        experiment.util.LinkedListTestDriver linkedListTestDriver23 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver23.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver23.clear();
        linkedListTestDriver23.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj30 = linkedListTestDriver23.remove(0);
        boolean boolean32 = linkedListTestDriver23.remove((java.lang.Object) (short) 100);
        experiment.util.LinkedListTestDriver linkedListTestDriver33 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver33.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver33.clear();
        linkedListTestDriver33.addLast((java.lang.Object) 1.0f);
        experiment.util.LinkedListTestDriver linkedListTestDriver39 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver39.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver39.clear();
        linkedListTestDriver33.addFirst((java.lang.Object) linkedListTestDriver39);
        java.lang.Object obj44 = linkedListTestDriver33.getFirst();
        boolean boolean45 = linkedListTestDriver23.contains((java.lang.Object) linkedListTestDriver33);
        java.lang.Object[] objArray46 = linkedListTestDriver33.toArray();
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver33);
        experiment.util.LinkedListTestDriver linkedListTestDriver48 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver48.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver48.clear();
        linkedListTestDriver48.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj54 = linkedListTestDriver48.getLast();
        experiment.util.Iterator iterator55 = linkedListTestDriver48.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver56 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver56.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj59 = linkedListTestDriver56.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver60 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver60.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver60.clear();
        linkedListTestDriver60.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj66 = linkedListTestDriver60.getLast();
        linkedListTestDriver60.clear();
        linkedListTestDriver56.addLast((java.lang.Object) linkedListTestDriver60);
        boolean boolean69 = linkedListTestDriver48.add((java.lang.Object) linkedListTestDriver56);
        boolean boolean70 = linkedListTestDriver48.isEmpty();
        experiment.util.Iterator iterator71 = linkedListTestDriver48.iterator();
        linkedListTestDriver0.addLast((java.lang.Object) iterator71);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1.0f + "'", obj7, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + 1.0f + "'", obj30, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals("'" + obj54 + "' != '" + 1.0f + "'", obj54, 1.0f);
        org.junit.Assert.assertNotNull(iterator55);
        org.junit.Assert.assertEquals("'" + obj59 + "' != '" + (byte) 10 + "'", obj59, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj66 + "' != '" + 1.0f + "'", obj66, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(iterator71);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test232");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj6 = linkedListTestDriver0.getLast();
        java.lang.Object obj7 = new java.lang.Object();
        linkedListTestDriver0.addLast(obj7);
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver9.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj12 = linkedListTestDriver9.removeLast();
        experiment.util.Iterator iterator13 = linkedListTestDriver9.iterator();
        boolean boolean15 = linkedListTestDriver9.contains((java.lang.Object) 10.0d);
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver9);
        java.lang.Object obj17 = linkedListTestDriver0.getFirst();
        experiment.util.Iterator iterator18 = linkedListTestDriver0.iterator();
        linkedListTestDriver0.clear();
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0f + "'", obj6, 1.0f);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) 10 + "'", obj12, (byte) 10);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 1.0f + "'", obj17, 1.0f);
        org.junit.Assert.assertNotNull(iterator18);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test233");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj6 = linkedListTestDriver0.getLast();
        experiment.util.Iterator iterator7 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver8.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj11 = linkedListTestDriver8.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver12.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver12.clear();
        linkedListTestDriver12.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj18 = linkedListTestDriver12.getLast();
        linkedListTestDriver12.clear();
        linkedListTestDriver8.addLast((java.lang.Object) linkedListTestDriver12);
        boolean boolean21 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver8);
        experiment.util.LinkedListTestDriver linkedListTestDriver22 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver22.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver22.clear();
        linkedListTestDriver22.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj28 = linkedListTestDriver22.getLast();
        experiment.util.Iterator iterator29 = linkedListTestDriver22.iterator();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver22);
        experiment.util.ListIterator listIterator32 = linkedListTestDriver22.listIterator((int) (byte) 0);
        java.lang.Object obj33 = linkedListTestDriver22.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver34 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver34.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver34.clear();
        linkedListTestDriver34.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj40 = linkedListTestDriver34.getLast();
        experiment.util.Iterator iterator41 = linkedListTestDriver34.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver42 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver42.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj45 = linkedListTestDriver42.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver46 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver46.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver46.clear();
        linkedListTestDriver46.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj52 = linkedListTestDriver46.getLast();
        linkedListTestDriver46.clear();
        linkedListTestDriver42.addLast((java.lang.Object) linkedListTestDriver46);
        boolean boolean55 = linkedListTestDriver34.add((java.lang.Object) linkedListTestDriver42);
        experiment.util.LinkedListTestDriver linkedListTestDriver56 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver56.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj59 = linkedListTestDriver56.removeLast();
        experiment.util.Iterator iterator60 = linkedListTestDriver56.iterator();
        linkedListTestDriver56.clear();
        experiment.util.Iterator iterator62 = linkedListTestDriver56.iterator();
        linkedListTestDriver34.addLast((java.lang.Object) linkedListTestDriver56);
        linkedListTestDriver22.addLast((java.lang.Object) linkedListTestDriver56);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj66 = linkedListTestDriver56.remove((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0f + "'", obj6, 1.0f);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 10 + "'", obj11, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 1.0f + "'", obj18, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + 1.0f + "'", obj28, 1.0f);
        org.junit.Assert.assertNotNull(iterator29);
        org.junit.Assert.assertNotNull(listIterator32);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + 1.0f + "'", obj33, 1.0f);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + 1.0f + "'", obj40, 1.0f);
        org.junit.Assert.assertNotNull(iterator41);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + (byte) 10 + "'", obj45, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj52 + "' != '" + 1.0f + "'", obj52, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertEquals("'" + obj59 + "' != '" + (byte) 10 + "'", obj59, (byte) 10);
        org.junit.Assert.assertNotNull(iterator60);
        org.junit.Assert.assertNotNull(iterator62);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test234");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj3 = linkedListTestDriver0.removeLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver4.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver4.clear();
        linkedListTestDriver4.addLast((java.lang.Object) 1.0f);
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver10.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver10.clear();
        linkedListTestDriver4.addFirst((java.lang.Object) linkedListTestDriver10);
        int int15 = linkedListTestDriver4.size();
        linkedListTestDriver4.clear();
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver4);
        experiment.util.LinkedListTestDriver linkedListTestDriver18 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver18.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj21 = linkedListTestDriver18.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver22 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver22.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver22.clear();
        linkedListTestDriver22.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj28 = linkedListTestDriver22.getLast();
        linkedListTestDriver22.clear();
        linkedListTestDriver18.addLast((java.lang.Object) linkedListTestDriver22);
        boolean boolean32 = linkedListTestDriver18.add((java.lang.Object) 0L);
        java.lang.Object obj33 = linkedListTestDriver18.getFirst();
        boolean boolean34 = linkedListTestDriver4.remove(obj33);
        int int35 = linkedListTestDriver4.size();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 10 + "'", obj3, (byte) 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (byte) 10 + "'", obj21, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + 1.0f + "'", obj28, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test235");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.addLast((java.lang.Object) 1.0f);
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver6.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver6.clear();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver6);
        java.lang.Object obj11 = linkedListTestDriver0.getFirst();
        java.lang.Object[] objArray12 = linkedListTestDriver0.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver13.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj16 = linkedListTestDriver13.removeLast();
        experiment.util.Iterator iterator17 = linkedListTestDriver13.iterator();
        linkedListTestDriver13.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver19 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver19.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver19.clear();
        linkedListTestDriver19.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj25 = linkedListTestDriver19.getLast();
        java.lang.Object obj26 = new java.lang.Object();
        linkedListTestDriver19.addLast(obj26);
        boolean boolean28 = linkedListTestDriver13.add(obj26);
        int int29 = linkedListTestDriver13.size();
        linkedListTestDriver0.addLast((java.lang.Object) int29);
        java.lang.Object obj31 = linkedListTestDriver0.removeLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver32 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver32.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver32.clear();
        linkedListTestDriver32.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj39 = linkedListTestDriver32.remove(0);
        boolean boolean41 = linkedListTestDriver32.remove((java.lang.Object) (short) 100);
        experiment.util.LinkedListTestDriver linkedListTestDriver42 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver42.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver42.clear();
        linkedListTestDriver42.addLast((java.lang.Object) 1.0f);
        experiment.util.LinkedListTestDriver linkedListTestDriver48 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver48.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver48.clear();
        linkedListTestDriver42.addFirst((java.lang.Object) linkedListTestDriver48);
        java.lang.Object obj53 = linkedListTestDriver42.getFirst();
        boolean boolean54 = linkedListTestDriver32.contains((java.lang.Object) linkedListTestDriver42);
        experiment.util.LinkedListTestDriver linkedListTestDriver55 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver55.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver55.clear();
        linkedListTestDriver55.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj62 = linkedListTestDriver55.remove(0);
        boolean boolean64 = linkedListTestDriver55.remove((java.lang.Object) (short) 100);
        experiment.util.LinkedListTestDriver linkedListTestDriver65 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver65.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver65.clear();
        linkedListTestDriver65.addLast((java.lang.Object) 1.0f);
        experiment.util.LinkedListTestDriver linkedListTestDriver71 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver71.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver71.clear();
        linkedListTestDriver65.addFirst((java.lang.Object) linkedListTestDriver71);
        java.lang.Object obj76 = linkedListTestDriver65.getFirst();
        boolean boolean77 = linkedListTestDriver55.contains((java.lang.Object) linkedListTestDriver65);
        java.lang.Object[] objArray78 = linkedListTestDriver65.toArray();
        linkedListTestDriver32.addLast((java.lang.Object) linkedListTestDriver65);
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver65);
        experiment.util.LinkedListTestDriver linkedListTestDriver81 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver82 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver82.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj85 = linkedListTestDriver82.removeLast();
        experiment.util.Iterator iterator86 = linkedListTestDriver82.iterator();
        linkedListTestDriver81.addLast((java.lang.Object) iterator86);
        int int88 = linkedListTestDriver81.size();
        linkedListTestDriver81.clear();
        linkedListTestDriver81.clear();
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver81);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (byte) 10 + "'", obj16, (byte) 10);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 1.0f + "'", obj25, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 1 + "'", obj31, 1);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + 1.0f + "'", obj39, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(obj53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + obj62 + "' != '" + 1.0f + "'", obj62, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(obj76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(objArray78);
        org.junit.Assert.assertEquals("'" + obj85 + "' != '" + (byte) 10 + "'", obj85, (byte) 10);
        org.junit.Assert.assertNotNull(iterator86);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 1 + "'", int88 == 1);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test236");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj3 = linkedListTestDriver0.removeLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver4.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver4.clear();
        linkedListTestDriver4.addLast((java.lang.Object) 1.0f);
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver10.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver10.clear();
        linkedListTestDriver4.addFirst((java.lang.Object) linkedListTestDriver10);
        int int15 = linkedListTestDriver4.size();
        linkedListTestDriver4.clear();
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver4);
        experiment.util.LinkedListTestDriver linkedListTestDriver18 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver18.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver18.clear();
        linkedListTestDriver18.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj24 = linkedListTestDriver18.getLast();
        experiment.util.Iterator iterator25 = linkedListTestDriver18.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver26 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver26.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj29 = linkedListTestDriver26.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver30 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver30.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver30.clear();
        linkedListTestDriver30.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj36 = linkedListTestDriver30.getLast();
        linkedListTestDriver30.clear();
        linkedListTestDriver26.addLast((java.lang.Object) linkedListTestDriver30);
        boolean boolean39 = linkedListTestDriver18.add((java.lang.Object) linkedListTestDriver26);
        experiment.util.LinkedListTestDriver linkedListTestDriver40 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver40.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj43 = linkedListTestDriver40.removeLast();
        experiment.util.Iterator iterator44 = linkedListTestDriver40.iterator();
        linkedListTestDriver40.clear();
        experiment.util.Iterator iterator46 = linkedListTestDriver40.iterator();
        linkedListTestDriver18.addLast((java.lang.Object) linkedListTestDriver40);
        java.lang.Object obj48 = linkedListTestDriver18.getLast();
        linkedListTestDriver4.addLast((java.lang.Object) linkedListTestDriver18);
        java.lang.Object obj50 = linkedListTestDriver18.removeFirst();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 10 + "'", obj3, (byte) 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 1.0f + "'", obj24, 1.0f);
        org.junit.Assert.assertNotNull(iterator25);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + (byte) 10 + "'", obj29, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + 1.0f + "'", obj36, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + (byte) 10 + "'", obj43, (byte) 10);
        org.junit.Assert.assertNotNull(iterator44);
        org.junit.Assert.assertNotNull(iterator46);
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + 1.0f + "'", obj50, 1.0f);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test237");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj3 = linkedListTestDriver0.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver4.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver4.clear();
        linkedListTestDriver4.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj10 = linkedListTestDriver4.getLast();
        linkedListTestDriver4.clear();
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver4);
        boolean boolean14 = linkedListTestDriver0.add((java.lang.Object) 0L);
        experiment.util.Iterator iterator15 = linkedListTestDriver0.iterator();
        java.lang.Object obj16 = linkedListTestDriver0.removeLast();
        boolean boolean17 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver18 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver18.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver18.clear();
        linkedListTestDriver18.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj24 = linkedListTestDriver18.getLast();
        linkedListTestDriver18.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver26 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver26.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj29 = linkedListTestDriver26.getFirst();
        boolean boolean31 = linkedListTestDriver26.remove((java.lang.Object) 1);
        boolean boolean32 = linkedListTestDriver18.remove((java.lang.Object) 1);
        boolean boolean33 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver18);
        java.lang.Object obj34 = linkedListTestDriver0.getFirst();
        java.lang.Object obj35 = linkedListTestDriver0.removeFirst();
        linkedListTestDriver0.clear();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 10 + "'", obj3, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 1.0f + "'", obj10, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0L + "'", obj16, 0L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 1.0f + "'", obj24, 1.0f);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + (byte) 10 + "'", obj29, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertNotNull(obj35);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test238");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        experiment.util.LinkedListTestDriver linkedListTestDriver3 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver3.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj6 = linkedListTestDriver3.removeLast();
        experiment.util.Iterator iterator7 = linkedListTestDriver3.iterator();
        linkedListTestDriver3.clear();
        experiment.util.Iterator iterator9 = linkedListTestDriver3.iterator();
        java.lang.Class<?> wildcardClass10 = iterator9.getClass();
        linkedListTestDriver0.addLast((java.lang.Object) iterator9);
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver12.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver12.clear();
        linkedListTestDriver12.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj19 = linkedListTestDriver12.remove(0);
        boolean boolean21 = linkedListTestDriver12.remove((java.lang.Object) (short) 100);
        boolean boolean22 = linkedListTestDriver0.equals_CUT((java.lang.Object) (short) 100);
        java.lang.Object obj25 = linkedListTestDriver0.set((int) (byte) 0, (java.lang.Object) 'a');
        boolean boolean26 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver27 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver27.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj30 = linkedListTestDriver27.removeLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver31 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver31.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver31.clear();
        linkedListTestDriver31.addLast((java.lang.Object) 1.0f);
        experiment.util.LinkedListTestDriver linkedListTestDriver37 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver37.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver37.clear();
        linkedListTestDriver31.addFirst((java.lang.Object) linkedListTestDriver37);
        int int42 = linkedListTestDriver31.size();
        linkedListTestDriver31.clear();
        linkedListTestDriver27.addLast((java.lang.Object) linkedListTestDriver31);
        experiment.util.LinkedListTestDriver linkedListTestDriver45 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver45.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj48 = linkedListTestDriver45.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver49 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver49.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver49.clear();
        linkedListTestDriver49.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj55 = linkedListTestDriver49.getLast();
        linkedListTestDriver49.clear();
        linkedListTestDriver45.addLast((java.lang.Object) linkedListTestDriver49);
        boolean boolean59 = linkedListTestDriver45.add((java.lang.Object) 0L);
        java.lang.Object obj60 = linkedListTestDriver45.getFirst();
        boolean boolean61 = linkedListTestDriver31.remove(obj60);
        experiment.util.LinkedListTestDriver linkedListTestDriver62 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver62.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj65 = linkedListTestDriver62.removeLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver66 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver66.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver66.clear();
        linkedListTestDriver66.addLast((java.lang.Object) 1.0f);
        experiment.util.LinkedListTestDriver linkedListTestDriver72 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver72.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver72.clear();
        linkedListTestDriver66.addFirst((java.lang.Object) linkedListTestDriver72);
        int int77 = linkedListTestDriver66.size();
        linkedListTestDriver66.clear();
        linkedListTestDriver62.addLast((java.lang.Object) linkedListTestDriver66);
        experiment.util.LinkedListTestDriver linkedListTestDriver80 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver80.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj83 = linkedListTestDriver80.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver84 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver84.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver84.clear();
        linkedListTestDriver84.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj90 = linkedListTestDriver84.getLast();
        linkedListTestDriver84.clear();
        linkedListTestDriver80.addLast((java.lang.Object) linkedListTestDriver84);
        boolean boolean94 = linkedListTestDriver80.add((java.lang.Object) 0L);
        java.lang.Object obj95 = linkedListTestDriver80.getFirst();
        boolean boolean96 = linkedListTestDriver66.remove(obj95);
        boolean boolean97 = linkedListTestDriver31.add((java.lang.Object) linkedListTestDriver66);
        boolean boolean98 = linkedListTestDriver0.contains((java.lang.Object) boolean97);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 10 + "'", obj6, (byte) 10);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 1.0f + "'", obj19, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (byte) 10 + "'", obj25, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + (byte) 10 + "'", obj30, (byte) 10);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 2 + "'", int42 == 2);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + (byte) 10 + "'", obj48, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj55 + "' != '" + 1.0f + "'", obj55, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(obj60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertEquals("'" + obj65 + "' != '" + (byte) 10 + "'", obj65, (byte) 10);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 2 + "'", int77 == 2);
        org.junit.Assert.assertEquals("'" + obj83 + "' != '" + (byte) 10 + "'", obj83, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj90 + "' != '" + 1.0f + "'", obj90, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
        org.junit.Assert.assertNotNull(obj95);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + true + "'", boolean97 == true);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test239");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        experiment.util.LinkedListTestDriver linkedListTestDriver3 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver3.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj6 = linkedListTestDriver3.removeLast();
        experiment.util.Iterator iterator7 = linkedListTestDriver3.iterator();
        linkedListTestDriver3.clear();
        experiment.util.Iterator iterator9 = linkedListTestDriver3.iterator();
        java.lang.Class<?> wildcardClass10 = iterator9.getClass();
        linkedListTestDriver0.addLast((java.lang.Object) iterator9);
        java.lang.Object[] objArray12 = linkedListTestDriver0.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver13.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver13.clear();
        linkedListTestDriver13.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj19 = linkedListTestDriver13.getLast();
        linkedListTestDriver13.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver21 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver21.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj24 = linkedListTestDriver21.getFirst();
        boolean boolean26 = linkedListTestDriver21.remove((java.lang.Object) 1);
        boolean boolean27 = linkedListTestDriver13.remove((java.lang.Object) 1);
        boolean boolean28 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver13);
        experiment.util.LinkedListTestDriver linkedListTestDriver29 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver29.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver29.clear();
        linkedListTestDriver29.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj35 = linkedListTestDriver29.getLast();
        experiment.util.Iterator iterator36 = linkedListTestDriver29.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver37 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver37.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj40 = linkedListTestDriver37.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver41 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver41.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver41.clear();
        linkedListTestDriver41.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj47 = linkedListTestDriver41.getLast();
        linkedListTestDriver41.clear();
        linkedListTestDriver37.addLast((java.lang.Object) linkedListTestDriver41);
        boolean boolean50 = linkedListTestDriver29.add((java.lang.Object) linkedListTestDriver37);
        experiment.util.LinkedListTestDriver linkedListTestDriver51 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver51.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver51.clear();
        linkedListTestDriver51.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj57 = linkedListTestDriver51.getLast();
        experiment.util.Iterator iterator58 = linkedListTestDriver51.iterator();
        linkedListTestDriver29.addFirst((java.lang.Object) linkedListTestDriver51);
        linkedListTestDriver51.addLast((java.lang.Object) (byte) 100);
        boolean boolean62 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver51);
        experiment.util.LinkedListTestDriver linkedListTestDriver63 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver63.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver63.clear();
        linkedListTestDriver63.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver68 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver68.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver68.clear();
        linkedListTestDriver68.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj74 = linkedListTestDriver68.getLast();
        linkedListTestDriver68.clear();
        linkedListTestDriver63.addFirst((java.lang.Object) linkedListTestDriver68);
        experiment.util.LinkedListTestDriver linkedListTestDriver77 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver77.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj80 = linkedListTestDriver77.removeLast();
        experiment.util.Iterator iterator81 = linkedListTestDriver77.iterator();
        linkedListTestDriver77.clear();
        boolean boolean83 = linkedListTestDriver63.remove((java.lang.Object) linkedListTestDriver77);
        java.lang.Object obj84 = linkedListTestDriver63.getLast();
        java.lang.Object obj85 = linkedListTestDriver63.removeFirst();
        boolean boolean86 = linkedListTestDriver51.add((java.lang.Object) linkedListTestDriver63);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj87 = linkedListTestDriver63.removeFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 10 + "'", obj6, (byte) 10);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 1.0f + "'", obj19, 1.0f);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (byte) 10 + "'", obj24, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 1.0f + "'", obj35, 1.0f);
        org.junit.Assert.assertNotNull(iterator36);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + (byte) 10 + "'", obj40, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + 1.0f + "'", obj47, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertEquals("'" + obj57 + "' != '" + 1.0f + "'", obj57, 1.0f);
        org.junit.Assert.assertNotNull(iterator58);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertEquals("'" + obj74 + "' != '" + 1.0f + "'", obj74, 1.0f);
        org.junit.Assert.assertEquals("'" + obj80 + "' != '" + (byte) 10 + "'", obj80, (byte) 10);
        org.junit.Assert.assertNotNull(iterator81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(obj84);
        org.junit.Assert.assertNotNull(obj85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test240");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj3 = linkedListTestDriver0.removeLast();
        experiment.util.Iterator iterator4 = linkedListTestDriver0.iterator();
        linkedListTestDriver0.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver6.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver6.clear();
        linkedListTestDriver6.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj12 = linkedListTestDriver6.getLast();
        java.lang.Object obj13 = new java.lang.Object();
        linkedListTestDriver6.addLast(obj13);
        boolean boolean15 = linkedListTestDriver0.add(obj13);
        java.lang.Class<?> wildcardClass16 = linkedListTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 10 + "'", obj3, (byte) 10);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 1.0f + "'", obj12, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test241");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj7 = linkedListTestDriver0.remove(0);
        boolean boolean9 = linkedListTestDriver0.remove((java.lang.Object) (short) 100);
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver10.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver10.clear();
        linkedListTestDriver10.addLast((java.lang.Object) 1.0f);
        experiment.util.LinkedListTestDriver linkedListTestDriver16 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver16.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver16.clear();
        linkedListTestDriver10.addFirst((java.lang.Object) linkedListTestDriver16);
        java.lang.Object obj21 = linkedListTestDriver10.getFirst();
        boolean boolean22 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver10);
        int int23 = linkedListTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = linkedListTestDriver0.removeFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1.0f + "'", obj7, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test242");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.addLast((java.lang.Object) 1.0f);
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver6.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver6.clear();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver6);
        java.lang.Object obj11 = linkedListTestDriver0.getFirst();
        boolean boolean13 = linkedListTestDriver0.remove((java.lang.Object) 0.0f);
        int int14 = linkedListTestDriver0.size();
        java.lang.Object obj16 = linkedListTestDriver0.remove((int) (byte) 0);
        java.lang.Class<?> wildcardClass17 = linkedListTestDriver0.getClass();
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test243");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj6 = linkedListTestDriver0.getLast();
        experiment.util.Iterator iterator7 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver8.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj11 = linkedListTestDriver8.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver12.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver12.clear();
        linkedListTestDriver12.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj18 = linkedListTestDriver12.getLast();
        linkedListTestDriver12.clear();
        linkedListTestDriver8.addLast((java.lang.Object) linkedListTestDriver12);
        boolean boolean21 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver8);
        int int22 = linkedListTestDriver0.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver23 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver23.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver23.clear();
        linkedListTestDriver23.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj29 = linkedListTestDriver23.getLast();
        experiment.util.Iterator iterator30 = linkedListTestDriver23.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver31 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver31.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj34 = linkedListTestDriver31.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver35 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver35.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver35.clear();
        linkedListTestDriver35.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj41 = linkedListTestDriver35.getLast();
        linkedListTestDriver35.clear();
        linkedListTestDriver31.addLast((java.lang.Object) linkedListTestDriver35);
        boolean boolean44 = linkedListTestDriver23.add((java.lang.Object) linkedListTestDriver31);
        java.lang.Class<?> wildcardClass45 = linkedListTestDriver31.getClass();
        linkedListTestDriver0.addLast((java.lang.Object) wildcardClass45);
        experiment.util.ListIterator listIterator48 = linkedListTestDriver0.listIterator(1);
        java.lang.Object obj49 = linkedListTestDriver0.getFirst();
        java.lang.Object obj50 = linkedListTestDriver0.removeLast();
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0f + "'", obj6, 1.0f);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 10 + "'", obj11, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 1.0f + "'", obj18, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 1.0f + "'", obj29, 1.0f);
        org.junit.Assert.assertNotNull(iterator30);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + (byte) 10 + "'", obj34, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + 1.0f + "'", obj41, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertNotNull(listIterator48);
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + 1.0f + "'", obj49, 1.0f);
        org.junit.Assert.assertNotNull(obj50);
        org.junit.Assert.assertEquals(obj50.toString(), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj50), "class experiment.util.LinkedListTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj50), "class experiment.util.LinkedListTestDriver");
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test244");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj3 = linkedListTestDriver0.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver4.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver4.clear();
        linkedListTestDriver4.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj10 = linkedListTestDriver4.getLast();
        linkedListTestDriver4.clear();
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver4);
        boolean boolean14 = linkedListTestDriver0.add((java.lang.Object) 0L);
        experiment.util.Iterator iterator15 = linkedListTestDriver0.iterator();
        java.lang.Object obj16 = linkedListTestDriver0.removeLast();
        boolean boolean17 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver18 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver18.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver18.clear();
        linkedListTestDriver18.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj24 = linkedListTestDriver18.getLast();
        linkedListTestDriver18.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver26 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver26.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj29 = linkedListTestDriver26.getFirst();
        boolean boolean31 = linkedListTestDriver26.remove((java.lang.Object) 1);
        boolean boolean32 = linkedListTestDriver18.remove((java.lang.Object) 1);
        boolean boolean33 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver18);
        java.lang.Object obj35 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj36 = linkedListTestDriver18.set((int) (byte) -1, obj35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 10 + "'", obj3, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 1.0f + "'", obj10, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0L + "'", obj16, 0L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 1.0f + "'", obj24, 1.0f);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + (byte) 10 + "'", obj29, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test245");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj7 = linkedListTestDriver0.remove(0);
        boolean boolean9 = linkedListTestDriver0.remove((java.lang.Object) (short) 100);
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver10.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver10.clear();
        linkedListTestDriver10.addLast((java.lang.Object) 1.0f);
        experiment.util.LinkedListTestDriver linkedListTestDriver16 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver16.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver16.clear();
        linkedListTestDriver10.addFirst((java.lang.Object) linkedListTestDriver16);
        java.lang.Object obj21 = linkedListTestDriver10.getFirst();
        boolean boolean22 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver10);
        experiment.util.LinkedListTestDriver linkedListTestDriver23 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver23.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver23.clear();
        linkedListTestDriver23.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj30 = linkedListTestDriver23.remove(0);
        boolean boolean32 = linkedListTestDriver23.remove((java.lang.Object) (short) 100);
        experiment.util.LinkedListTestDriver linkedListTestDriver33 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver33.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver33.clear();
        linkedListTestDriver33.addLast((java.lang.Object) 1.0f);
        experiment.util.LinkedListTestDriver linkedListTestDriver39 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver39.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver39.clear();
        linkedListTestDriver33.addFirst((java.lang.Object) linkedListTestDriver39);
        java.lang.Object obj44 = linkedListTestDriver33.getFirst();
        boolean boolean45 = linkedListTestDriver23.contains((java.lang.Object) linkedListTestDriver33);
        java.lang.Object[] objArray46 = linkedListTestDriver33.toArray();
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver33);
        java.lang.Object obj48 = linkedListTestDriver33.removeFirst();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj50 = linkedListTestDriver33.get(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1.0f + "'", obj7, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + 1.0f + "'", obj30, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(obj48);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test246");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj3 = linkedListTestDriver0.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver4.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver4.clear();
        linkedListTestDriver4.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj10 = linkedListTestDriver4.getLast();
        linkedListTestDriver4.clear();
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver4);
        boolean boolean14 = linkedListTestDriver0.add((java.lang.Object) 0L);
        experiment.util.Iterator iterator15 = linkedListTestDriver0.iterator();
        java.lang.Object obj16 = linkedListTestDriver0.removeLast();
        boolean boolean17 = linkedListTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = linkedListTestDriver0.get((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 10 + "'", obj3, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 1.0f + "'", obj10, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0L + "'", obj16, 0L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test247");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj3 = linkedListTestDriver0.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver4.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver4.clear();
        linkedListTestDriver4.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj10 = linkedListTestDriver4.getLast();
        linkedListTestDriver4.clear();
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver4);
        boolean boolean14 = linkedListTestDriver0.add((java.lang.Object) 0L);
        experiment.util.Iterator iterator15 = linkedListTestDriver0.iterator();
        java.lang.Object obj16 = linkedListTestDriver0.removeLast();
        java.lang.Object obj17 = linkedListTestDriver0.getLast();
        java.lang.Object obj18 = linkedListTestDriver0.removeFirst();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = linkedListTestDriver0.getFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 10 + "'", obj3, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 1.0f + "'", obj10, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0L + "'", obj16, 0L);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNotNull(obj18);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test248");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        experiment.util.LinkedListTestDriver linkedListTestDriver3 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver3.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj6 = linkedListTestDriver3.removeLast();
        experiment.util.Iterator iterator7 = linkedListTestDriver3.iterator();
        linkedListTestDriver3.clear();
        experiment.util.Iterator iterator9 = linkedListTestDriver3.iterator();
        java.lang.Class<?> wildcardClass10 = iterator9.getClass();
        linkedListTestDriver0.addLast((java.lang.Object) iterator9);
        java.lang.Object obj12 = linkedListTestDriver0.removeLast();
        boolean boolean14 = linkedListTestDriver0.remove((java.lang.Object) 100.0f);
        experiment.util.LinkedListTestDriver linkedListTestDriver16 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver17.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj20 = linkedListTestDriver17.removeLast();
        experiment.util.Iterator iterator21 = linkedListTestDriver17.iterator();
        linkedListTestDriver16.addLast((java.lang.Object) iterator21);
        boolean boolean24 = linkedListTestDriver16.contains((java.lang.Object) (byte) 10);
        java.lang.Object obj25 = linkedListTestDriver16.removeLast();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = linkedListTestDriver0.set((int) '4', obj25);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 10 + "'", obj6, (byte) 10);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (byte) 10 + "'", obj20, (byte) 10);
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(obj25);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test249");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj6 = linkedListTestDriver0.getLast();
        experiment.util.Iterator iterator7 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver8.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj11 = linkedListTestDriver8.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver12.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver12.clear();
        linkedListTestDriver12.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj18 = linkedListTestDriver12.getLast();
        linkedListTestDriver12.clear();
        linkedListTestDriver8.addLast((java.lang.Object) linkedListTestDriver12);
        boolean boolean21 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver8);
        experiment.util.LinkedListTestDriver linkedListTestDriver22 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver22.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver22.clear();
        linkedListTestDriver22.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj28 = linkedListTestDriver22.getLast();
        experiment.util.Iterator iterator29 = linkedListTestDriver22.iterator();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver22);
        linkedListTestDriver22.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver32 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver32.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver32.clear();
        linkedListTestDriver32.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj38 = linkedListTestDriver32.getLast();
        java.lang.Object obj39 = linkedListTestDriver32.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver40 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver40.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj43 = linkedListTestDriver40.removeFirst();
        boolean boolean44 = linkedListTestDriver32.equals_CUT((java.lang.Object) linkedListTestDriver40);
        linkedListTestDriver40.clear();
        boolean boolean46 = linkedListTestDriver22.add((java.lang.Object) linkedListTestDriver40);
        boolean boolean47 = linkedListTestDriver22.isEmpty();
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0f + "'", obj6, 1.0f);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 10 + "'", obj11, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 1.0f + "'", obj18, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + 1.0f + "'", obj28, 1.0f);
        org.junit.Assert.assertNotNull(iterator29);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + 1.0f + "'", obj38, 1.0f);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + 1.0f + "'", obj39, 1.0f);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + (byte) 10 + "'", obj43, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test250");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj6 = linkedListTestDriver0.getLast();
        experiment.util.Iterator iterator7 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver8.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj11 = linkedListTestDriver8.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver12.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver12.clear();
        linkedListTestDriver12.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj18 = linkedListTestDriver12.getLast();
        linkedListTestDriver12.clear();
        linkedListTestDriver8.addLast((java.lang.Object) linkedListTestDriver12);
        boolean boolean21 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver8);
        experiment.util.LinkedListTestDriver linkedListTestDriver22 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver22.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj25 = linkedListTestDriver22.removeLast();
        experiment.util.Iterator iterator26 = linkedListTestDriver22.iterator();
        linkedListTestDriver22.clear();
        experiment.util.Iterator iterator28 = linkedListTestDriver22.iterator();
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver22);
        java.lang.Object obj30 = linkedListTestDriver0.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver31 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver31.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver31.clear();
        linkedListTestDriver31.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj37 = linkedListTestDriver31.getLast();
        java.lang.Object obj38 = new java.lang.Object();
        linkedListTestDriver31.addLast(obj38);
        experiment.util.LinkedListTestDriver linkedListTestDriver40 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver40.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj43 = linkedListTestDriver40.removeLast();
        experiment.util.Iterator iterator44 = linkedListTestDriver40.iterator();
        boolean boolean46 = linkedListTestDriver40.contains((java.lang.Object) 10.0d);
        linkedListTestDriver31.addLast((java.lang.Object) linkedListTestDriver40);
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver40);
        java.lang.Object obj49 = linkedListTestDriver0.getLast();
        java.lang.Class<?> wildcardClass50 = obj49.getClass();
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0f + "'", obj6, 1.0f);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 10 + "'", obj11, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 1.0f + "'", obj18, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (byte) 10 + "'", obj25, (byte) 10);
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertNotNull(iterator28);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + 1.0f + "'", obj37, 1.0f);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + (byte) 10 + "'", obj43, (byte) 10);
        org.junit.Assert.assertNotNull(iterator44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test251");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj3 = linkedListTestDriver0.getFirst();
        boolean boolean5 = linkedListTestDriver0.remove((java.lang.Object) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver7.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj10 = linkedListTestDriver7.removeLast();
        experiment.util.Iterator iterator11 = linkedListTestDriver7.iterator();
        linkedListTestDriver6.addLast((java.lang.Object) iterator11);
        int int13 = linkedListTestDriver6.size();
        boolean boolean14 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver6);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 10 + "'", obj3, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) 10 + "'", obj10, (byte) 10);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test252");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj6 = linkedListTestDriver0.getLast();
        experiment.util.Iterator iterator7 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver8.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj11 = linkedListTestDriver8.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver12.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver12.clear();
        linkedListTestDriver12.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj18 = linkedListTestDriver12.getLast();
        linkedListTestDriver12.clear();
        linkedListTestDriver8.addLast((java.lang.Object) linkedListTestDriver12);
        boolean boolean21 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver8);
        experiment.util.LinkedListTestDriver linkedListTestDriver22 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver22.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj25 = linkedListTestDriver22.removeLast();
        experiment.util.Iterator iterator26 = linkedListTestDriver22.iterator();
        linkedListTestDriver22.clear();
        experiment.util.Iterator iterator28 = linkedListTestDriver22.iterator();
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver22);
        experiment.util.ListIterator listIterator31 = linkedListTestDriver0.listIterator((int) (short) 1);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0f + "'", obj6, 1.0f);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 10 + "'", obj11, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 1.0f + "'", obj18, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (byte) 10 + "'", obj25, (byte) 10);
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertNotNull(iterator28);
        org.junit.Assert.assertNotNull(listIterator31);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test253");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj3 = linkedListTestDriver0.getFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver4 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver4.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver4.clear();
        linkedListTestDriver4.addLast((java.lang.Object) 1.0f);
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver10.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver10.clear();
        linkedListTestDriver4.addFirst((java.lang.Object) linkedListTestDriver10);
        int int15 = linkedListTestDriver4.size();
        linkedListTestDriver0.addFirst((java.lang.Object) int15);
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver17.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver17.clear();
        linkedListTestDriver17.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj23 = linkedListTestDriver17.getLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver24 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver24.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver24.addFirst((java.lang.Object) 10);
        boolean boolean29 = linkedListTestDriver17.contains((java.lang.Object) 10);
        boolean boolean30 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver17);
        java.lang.Object obj31 = linkedListTestDriver17.getFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver32 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver32.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver32.clear();
        linkedListTestDriver32.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj38 = linkedListTestDriver32.getLast();
        experiment.util.Iterator iterator39 = linkedListTestDriver32.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver40 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver40.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj43 = linkedListTestDriver40.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver44 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver44.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver44.clear();
        linkedListTestDriver44.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj50 = linkedListTestDriver44.getLast();
        linkedListTestDriver44.clear();
        linkedListTestDriver40.addLast((java.lang.Object) linkedListTestDriver44);
        boolean boolean53 = linkedListTestDriver32.add((java.lang.Object) linkedListTestDriver40);
        experiment.util.LinkedListTestDriver linkedListTestDriver54 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver54.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj57 = linkedListTestDriver54.removeLast();
        experiment.util.Iterator iterator58 = linkedListTestDriver54.iterator();
        linkedListTestDriver54.clear();
        experiment.util.Iterator iterator60 = linkedListTestDriver54.iterator();
        linkedListTestDriver32.addLast((java.lang.Object) linkedListTestDriver54);
        int int62 = linkedListTestDriver54.size();
        boolean boolean63 = linkedListTestDriver17.remove((java.lang.Object) linkedListTestDriver54);
        int int64 = linkedListTestDriver17.size();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 10 + "'", obj3, (byte) 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 1.0f + "'", obj23, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 1.0f + "'", obj31, 1.0f);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + 1.0f + "'", obj38, 1.0f);
        org.junit.Assert.assertNotNull(iterator39);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + (byte) 10 + "'", obj43, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + 1.0f + "'", obj50, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertEquals("'" + obj57 + "' != '" + (byte) 10 + "'", obj57, (byte) 10);
        org.junit.Assert.assertNotNull(iterator58);
        org.junit.Assert.assertNotNull(iterator60);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 1 + "'", int64 == 1);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test254");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj6 = linkedListTestDriver0.getLast();
        experiment.util.Iterator iterator7 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver8.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj11 = linkedListTestDriver8.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver12.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver12.clear();
        linkedListTestDriver12.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj18 = linkedListTestDriver12.getLast();
        linkedListTestDriver12.clear();
        linkedListTestDriver8.addLast((java.lang.Object) linkedListTestDriver12);
        boolean boolean21 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver8);
        experiment.util.LinkedListTestDriver linkedListTestDriver22 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver22.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj25 = linkedListTestDriver22.removeLast();
        experiment.util.Iterator iterator26 = linkedListTestDriver22.iterator();
        linkedListTestDriver22.clear();
        experiment.util.Iterator iterator28 = linkedListTestDriver22.iterator();
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver22);
        experiment.util.LinkedListTestDriver linkedListTestDriver30 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver30.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj33 = linkedListTestDriver30.getFirst();
        boolean boolean35 = linkedListTestDriver30.remove((java.lang.Object) 1);
        java.lang.Object obj37 = linkedListTestDriver30.get((int) (short) 0);
        experiment.util.LinkedListTestDriver linkedListTestDriver38 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver38.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver38.clear();
        linkedListTestDriver38.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj44 = linkedListTestDriver38.getLast();
        experiment.util.Iterator iterator45 = linkedListTestDriver38.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver46 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver46.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj49 = linkedListTestDriver46.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver50 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver50.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver50.clear();
        linkedListTestDriver50.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj56 = linkedListTestDriver50.getLast();
        linkedListTestDriver50.clear();
        linkedListTestDriver46.addLast((java.lang.Object) linkedListTestDriver50);
        boolean boolean59 = linkedListTestDriver38.add((java.lang.Object) linkedListTestDriver46);
        experiment.util.ListIterator listIterator61 = linkedListTestDriver38.listIterator((int) (byte) 1);
        linkedListTestDriver30.addLast((java.lang.Object) linkedListTestDriver38);
        linkedListTestDriver22.addLast((java.lang.Object) linkedListTestDriver38);
        int int64 = linkedListTestDriver38.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver65 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver65.addFirst((java.lang.Object) (byte) 10);
        experiment.util.LinkedListTestDriver linkedListTestDriver68 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver68.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj71 = linkedListTestDriver68.removeLast();
        experiment.util.Iterator iterator72 = linkedListTestDriver68.iterator();
        linkedListTestDriver68.clear();
        experiment.util.Iterator iterator74 = linkedListTestDriver68.iterator();
        java.lang.Class<?> wildcardClass75 = iterator74.getClass();
        linkedListTestDriver65.addLast((java.lang.Object) iterator74);
        java.lang.Object[] objArray77 = linkedListTestDriver65.toArray();
        linkedListTestDriver38.addFirst((java.lang.Object) linkedListTestDriver65);
        experiment.util.LinkedListTestDriver linkedListTestDriver79 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver79.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver79.clear();
        linkedListTestDriver79.addLast((java.lang.Object) 1.0f);
        java.lang.Object[] objArray85 = linkedListTestDriver79.toArray();
        boolean boolean86 = linkedListTestDriver38.equals_CUT((java.lang.Object) objArray85);
        java.lang.Object obj87 = linkedListTestDriver38.getLast();
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0f + "'", obj6, 1.0f);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 10 + "'", obj11, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 1.0f + "'", obj18, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (byte) 10 + "'", obj25, (byte) 10);
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertNotNull(iterator28);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + (byte) 10 + "'", obj33, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + (byte) 10 + "'", obj37, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + 1.0f + "'", obj44, 1.0f);
        org.junit.Assert.assertNotNull(iterator45);
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + (byte) 10 + "'", obj49, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj56 + "' != '" + 1.0f + "'", obj56, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(listIterator61);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 2 + "'", int64 == 2);
        org.junit.Assert.assertEquals("'" + obj71 + "' != '" + (byte) 10 + "'", obj71, (byte) 10);
        org.junit.Assert.assertNotNull(iterator72);
        org.junit.Assert.assertNotNull(iterator74);
        org.junit.Assert.assertNotNull(wildcardClass75);
        org.junit.Assert.assertNotNull(objArray77);
        org.junit.Assert.assertNotNull(objArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray85), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray85), "[1.0]");
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(obj87);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test255");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj6 = linkedListTestDriver0.getLast();
        experiment.util.Iterator iterator7 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver8.addFirst((java.lang.Object) (byte) 10);
        java.lang.Object obj11 = linkedListTestDriver8.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver12.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver12.clear();
        linkedListTestDriver12.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj18 = linkedListTestDriver12.getLast();
        linkedListTestDriver12.clear();
        linkedListTestDriver8.addLast((java.lang.Object) linkedListTestDriver12);
        boolean boolean21 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver8);
        experiment.util.ListIterator listIterator23 = linkedListTestDriver0.listIterator((int) (byte) 1);
        experiment.util.ListIterator listIterator25 = linkedListTestDriver0.listIterator((int) (byte) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver27 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver27.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver27.clear();
        linkedListTestDriver27.addLast((java.lang.Object) 1.0f);
        experiment.util.LinkedListTestDriver linkedListTestDriver33 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver33.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver33.clear();
        linkedListTestDriver27.addFirst((java.lang.Object) linkedListTestDriver33);
        java.lang.Object obj38 = linkedListTestDriver27.getFirst();
        java.lang.Object[] objArray39 = linkedListTestDriver27.toArray();
        boolean boolean41 = linkedListTestDriver27.equals_CUT((java.lang.Object) 10.0f);
        java.lang.Object obj42 = linkedListTestDriver27.removeFirst();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj43 = linkedListTestDriver0.set((-1), obj42);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0f + "'", obj6, 1.0f);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 10 + "'", obj11, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 1.0f + "'", obj18, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(listIterator23);
        org.junit.Assert.assertNotNull(listIterator25);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(obj42);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1264048269_1024_0.test256");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver5 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver5.addFirst((java.lang.Object) (byte) 10);
        linkedListTestDriver5.clear();
        linkedListTestDriver5.addLast((java.lang.Object) 1.0f);
        java.lang.Object obj11 = linkedListTestDriver5.getLast();
        linkedListTestDriver5.clear();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver5);
        java.lang.Object obj14 = null;
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver5.addFirst(obj14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 1.0f + "'", obj11, 1.0f);
    }

}
