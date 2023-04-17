package experiment.util.test;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Regression_LinkedListTest_1264048269_64_s {

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

}
