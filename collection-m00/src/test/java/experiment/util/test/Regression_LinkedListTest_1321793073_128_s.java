package experiment.util.test;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Regression_LinkedListTest_1321793073_128_s {

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
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test001");
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
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test002");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.add((int) (byte) -1, (java.lang.Object) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: -1; size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test003");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.add((int) 'a', (java.lang.Object) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 97; size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test004");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean5 = linkedListTestDriver0.equals_CUT((java.lang.Object) 10);
        java.lang.Object obj6 = linkedListTestDriver0.removeFirst();
        java.lang.Object[] objArray7 = linkedListTestDriver0.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = linkedListTestDriver0.get((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0 + "'", obj6, 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test005");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = linkedListTestDriver0.remove(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test006");
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
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test007");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        java.lang.Object obj4 = linkedListTestDriver0.removeFirst();
        linkedListTestDriver0.clear();
        boolean boolean6 = linkedListTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator8 = linkedListTestDriver0.listIterator((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: -1; size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0 + "'", obj4, 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test008");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        java.lang.Object obj4 = linkedListTestDriver0.removeFirst();
        linkedListTestDriver0.clear();
        boolean boolean6 = linkedListTestDriver0.isEmpty();
        boolean boolean8 = linkedListTestDriver0.equals_CUT((java.lang.Object) 10L);
        boolean boolean10 = linkedListTestDriver0.add((java.lang.Object) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = linkedListTestDriver0.get((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0 + "'", obj4, 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test009");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        java.lang.Object obj4 = linkedListTestDriver0.removeFirst();
        linkedListTestDriver0.clear();
        boolean boolean6 = linkedListTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = linkedListTestDriver0.get((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0 + "'", obj4, 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test010");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        java.lang.Object obj4 = linkedListTestDriver0.removeFirst();
        linkedListTestDriver0.clear();
        boolean boolean6 = linkedListTestDriver0.isEmpty();
        boolean boolean8 = linkedListTestDriver0.equals_CUT((java.lang.Object) 10L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = linkedListTestDriver0.getLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0 + "'", obj4, 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test011");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean5 = linkedListTestDriver0.equals_CUT((java.lang.Object) 10);
        java.lang.Object obj6 = linkedListTestDriver0.removeFirst();
        linkedListTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = linkedListTestDriver0.getFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0 + "'", obj6, 0);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test012");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean5 = linkedListTestDriver0.equals_CUT((java.lang.Object) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = linkedListTestDriver0.remove((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test013");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean5 = linkedListTestDriver0.equals_CUT((java.lang.Object) 10);
        java.lang.Object obj6 = linkedListTestDriver0.removeFirst();
        java.lang.Object[] objArray7 = linkedListTestDriver0.toArray();
        experiment.util.Iterator iterator8 = linkedListTestDriver0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = linkedListTestDriver0.getFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0 + "'", obj6, 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(iterator8);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test014");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean5 = linkedListTestDriver0.equals_CUT((java.lang.Object) 10);
        java.lang.Object obj6 = linkedListTestDriver0.removeFirst();
        linkedListTestDriver0.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver9.add((int) (short) 0, (java.lang.Object) 0);
        linkedListTestDriver9.addFirst((java.lang.Object) 'a');
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.add((int) '#', (java.lang.Object) linkedListTestDriver9);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 35; size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0 + "'", obj6, 0);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test015");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean5 = linkedListTestDriver0.equals_CUT((java.lang.Object) 10);
        java.lang.Object obj6 = linkedListTestDriver0.removeFirst();
        boolean boolean7 = linkedListTestDriver0.isEmpty();
        boolean boolean8 = linkedListTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = linkedListTestDriver0.set((int) (byte) 0, (java.lang.Object) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0 + "'", obj6, 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test016");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean5 = linkedListTestDriver0.equals_CUT((java.lang.Object) 10);
        java.lang.Object obj6 = linkedListTestDriver0.removeFirst();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator8 = linkedListTestDriver0.listIterator((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: -1; size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0 + "'", obj6, 0);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test017");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        java.lang.Object obj4 = linkedListTestDriver0.removeFirst();
        linkedListTestDriver0.clear();
        java.lang.Class<?> wildcardClass6 = linkedListTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0 + "'", obj4, 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test018");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean5 = linkedListTestDriver0.equals_CUT((java.lang.Object) 10);
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver6.add((int) (short) 0, (java.lang.Object) 0);
        java.lang.Object obj10 = linkedListTestDriver6.removeFirst();
        linkedListTestDriver6.clear();
        boolean boolean12 = linkedListTestDriver6.isEmpty();
        boolean boolean14 = linkedListTestDriver6.equals_CUT((java.lang.Object) 10L);
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = linkedListTestDriver0.remove(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 0 + "'", obj10, 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test019");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) 1.0f);
        java.lang.Object obj6 = linkedListTestDriver0.removeLast();
        java.lang.Object obj7 = linkedListTestDriver0.removeLast();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0f + "'", obj6, 1.0f);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0 + "'", obj7, 0);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test020");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = linkedListTestDriver0.get((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test021");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean5 = linkedListTestDriver0.equals_CUT((java.lang.Object) 10);
        experiment.util.Iterator iterator6 = linkedListTestDriver0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = linkedListTestDriver0.remove((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(iterator6);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test022");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        java.lang.Object obj4 = linkedListTestDriver0.removeFirst();
        linkedListTestDriver0.clear();
        boolean boolean6 = linkedListTestDriver0.isEmpty();
        boolean boolean8 = linkedListTestDriver0.equals_CUT((java.lang.Object) 10L);
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver9.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean14 = linkedListTestDriver9.equals_CUT((java.lang.Object) 10);
        java.lang.Object obj15 = linkedListTestDriver9.removeFirst();
        java.lang.Object[] objArray16 = linkedListTestDriver9.toArray();
        experiment.util.Iterator iterator17 = linkedListTestDriver9.iterator();
        boolean boolean18 = linkedListTestDriver0.add((java.lang.Object) iterator17);
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator20 = linkedListTestDriver0.listIterator((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: -1; size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0 + "'", obj4, 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 0 + "'", obj15, 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test023");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) (short) 0);
        boolean boolean4 = linkedListTestDriver0.contains((java.lang.Object) 0.0d);
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.add((int) (byte) 10, obj6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 10; size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test024");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean5 = linkedListTestDriver0.equals_CUT((java.lang.Object) 10);
        experiment.util.Iterator iterator6 = linkedListTestDriver0.iterator();
        java.lang.Object[] objArray7 = linkedListTestDriver0.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver10.add((int) (short) 0, (java.lang.Object) 0);
        linkedListTestDriver10.addFirst((java.lang.Object) 'a');
        boolean boolean16 = linkedListTestDriver9.remove((java.lang.Object) linkedListTestDriver10);
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.add(100, (java.lang.Object) linkedListTestDriver10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 100; size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[0]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test025");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) (short) 0);
        boolean boolean4 = linkedListTestDriver0.contains((java.lang.Object) 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = linkedListTestDriver0.get(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test026");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        java.lang.Object obj4 = linkedListTestDriver0.removeFirst();
        linkedListTestDriver0.clear();
        boolean boolean6 = linkedListTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = linkedListTestDriver0.get(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0 + "'", obj4, 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test027");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) 1.0f);
        java.lang.Object obj6 = linkedListTestDriver0.removeLast();
        experiment.util.ListIterator listIterator8 = linkedListTestDriver0.listIterator(1);
        java.lang.Object obj9 = linkedListTestDriver0.removeLast();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = linkedListTestDriver0.get((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0f + "'", obj6, 1.0f);
        org.junit.Assert.assertNotNull(listIterator8);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0 + "'", obj9, 0);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test028");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        java.lang.Object obj4 = linkedListTestDriver0.removeFirst();
        linkedListTestDriver0.clear();
        boolean boolean6 = linkedListTestDriver0.isEmpty();
        boolean boolean8 = linkedListTestDriver0.equals_CUT((java.lang.Object) (-1));
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver10.add((int) (short) 0, (java.lang.Object) 0);
        java.lang.Object obj14 = linkedListTestDriver10.removeFirst();
        linkedListTestDriver10.clear();
        boolean boolean16 = linkedListTestDriver10.isEmpty();
        boolean boolean18 = linkedListTestDriver10.equals_CUT((java.lang.Object) 10L);
        experiment.util.LinkedListTestDriver linkedListTestDriver19 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver19.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean24 = linkedListTestDriver19.equals_CUT((java.lang.Object) 10);
        java.lang.Object obj25 = linkedListTestDriver19.removeFirst();
        java.lang.Object[] objArray26 = linkedListTestDriver19.toArray();
        experiment.util.Iterator iterator27 = linkedListTestDriver19.iterator();
        boolean boolean28 = linkedListTestDriver10.add((java.lang.Object) iterator27);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj29 = linkedListTestDriver0.set((int) (byte) -1, (java.lang.Object) boolean28);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0 + "'", obj4, 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 0 + "'", obj14, 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 0 + "'", obj25, 0);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[]");
        org.junit.Assert.assertNotNull(iterator27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test029");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        java.lang.Object obj4 = linkedListTestDriver0.removeFirst();
        linkedListTestDriver0.clear();
        boolean boolean6 = linkedListTestDriver0.isEmpty();
        boolean boolean8 = linkedListTestDriver0.equals_CUT((java.lang.Object) 10L);
        boolean boolean10 = linkedListTestDriver0.add((java.lang.Object) (short) -1);
        java.lang.Object obj11 = linkedListTestDriver0.removeLast();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = linkedListTestDriver0.get(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0 + "'", obj4, 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (short) -1 + "'", obj11, (short) -1);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test030");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        java.lang.Object obj4 = linkedListTestDriver0.removeFirst();
        boolean boolean6 = linkedListTestDriver0.add((java.lang.Object) 100L);
        java.lang.Object obj8 = linkedListTestDriver0.remove((int) (short) 0);
        java.lang.Class<?> wildcardClass9 = linkedListTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0 + "'", obj4, 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 100L + "'", obj8, 100L);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test031");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        java.lang.Object obj4 = linkedListTestDriver0.removeFirst();
        linkedListTestDriver0.clear();
        boolean boolean6 = linkedListTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = linkedListTestDriver0.remove((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0 + "'", obj4, 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test032");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        java.lang.Object obj4 = linkedListTestDriver0.removeFirst();
        linkedListTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.add(10, (java.lang.Object) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 10; size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0 + "'", obj4, 0);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test033");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) (short) 10);
        linkedListTestDriver0.clear();
        boolean boolean8 = linkedListTestDriver0.equals_CUT((java.lang.Object) 100.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = linkedListTestDriver0.get((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test034");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        java.lang.Object obj5 = linkedListTestDriver0.get(0);
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator7 = linkedListTestDriver0.listIterator((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 32; size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 0 + "'", obj5, 0);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test035");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver1 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver1.add((int) (short) 0, (java.lang.Object) 0);
        linkedListTestDriver1.addFirst((java.lang.Object) 'a');
        boolean boolean7 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver1);
        java.lang.Object obj8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = linkedListTestDriver1.contains(obj8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test036");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) (short) 0);
        boolean boolean4 = linkedListTestDriver0.contains((java.lang.Object) 0.0d);
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
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test037");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean5 = linkedListTestDriver0.equals_CUT((java.lang.Object) 10);
        java.lang.Object obj6 = linkedListTestDriver0.removeFirst();
        linkedListTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = linkedListTestDriver0.get((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0 + "'", obj6, 0);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test038");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) 1.0f);
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver7.add((int) (short) 0, (java.lang.Object) 0);
        linkedListTestDriver7.addFirst((java.lang.Object) 'a');
        experiment.util.Iterator iterator13 = linkedListTestDriver7.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = linkedListTestDriver0.set((int) (byte) -1, (java.lang.Object) iterator13);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(iterator13);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test039");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) 1.0f);
        java.lang.Object obj6 = linkedListTestDriver0.removeLast();
        experiment.util.ListIterator listIterator8 = linkedListTestDriver0.listIterator(1);
        java.lang.Object obj9 = linkedListTestDriver0.removeLast();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = linkedListTestDriver0.remove((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0f + "'", obj6, 1.0f);
        org.junit.Assert.assertNotNull(listIterator8);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0 + "'", obj9, 0);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test040");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) 1.0f);
        java.lang.Object obj6 = linkedListTestDriver0.removeLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver7.add((int) (short) 0, (java.lang.Object) 0);
        linkedListTestDriver7.addFirst((java.lang.Object) 'a');
        experiment.util.Iterator iterator13 = linkedListTestDriver7.iterator();
        linkedListTestDriver0.addFirst((java.lang.Object) iterator13);
        experiment.util.Iterator iterator15 = linkedListTestDriver0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator17 = linkedListTestDriver0.listIterator((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: -1; size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0f + "'", obj6, 1.0f);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertNotNull(iterator15);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test041");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        java.lang.Object obj4 = linkedListTestDriver0.removeFirst();
        linkedListTestDriver0.clear();
        boolean boolean6 = linkedListTestDriver0.isEmpty();
        boolean boolean8 = linkedListTestDriver0.equals_CUT((java.lang.Object) 10L);
        boolean boolean10 = linkedListTestDriver0.add((java.lang.Object) (short) -1);
        java.lang.Object[] objArray11 = linkedListTestDriver0.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = linkedListTestDriver0.remove((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0 + "'", obj4, 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[-1]");
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test042");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) 1.0f);
        java.lang.Object obj6 = linkedListTestDriver0.removeLast();
        boolean boolean7 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver9.add((int) (short) 0, (java.lang.Object) 0);
        linkedListTestDriver9.addFirst((java.lang.Object) 'a');
        java.lang.Object obj15 = linkedListTestDriver9.getLast();
        linkedListTestDriver9.clear();
        boolean boolean18 = linkedListTestDriver9.contains((java.lang.Object) 10.0d);
        java.lang.Class<?> wildcardClass19 = linkedListTestDriver9.getClass();
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.add((int) '#', (java.lang.Object) linkedListTestDriver9);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 35; size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0f + "'", obj6, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 0 + "'", obj15, 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test043");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        linkedListTestDriver0.addFirst((java.lang.Object) 'a');
        experiment.util.Iterator iterator6 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver7.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean12 = linkedListTestDriver7.equals_CUT((java.lang.Object) 10);
        java.lang.Object obj13 = linkedListTestDriver7.removeFirst();
        boolean boolean14 = linkedListTestDriver7.isEmpty();
        boolean boolean15 = linkedListTestDriver7.isEmpty();
        boolean boolean16 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver7);
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray18 = linkedListTestDriver17.toArray();
        boolean boolean19 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = linkedListTestDriver17.get(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 0 + "'", obj13, 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test044");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        java.lang.Object obj4 = linkedListTestDriver0.removeFirst();
        linkedListTestDriver0.clear();
        boolean boolean7 = linkedListTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver9.add((int) (short) 0, (java.lang.Object) 0);
        linkedListTestDriver9.addFirst((java.lang.Object) 'a');
        java.lang.Object obj15 = linkedListTestDriver9.getFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver17.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean22 = linkedListTestDriver17.add((java.lang.Object) 1.0f);
        java.lang.Object obj23 = linkedListTestDriver17.removeLast();
        java.lang.Object obj24 = linkedListTestDriver17.getFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver25 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver25.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean30 = linkedListTestDriver25.add((java.lang.Object) 1.0f);
        java.lang.Object obj31 = linkedListTestDriver25.removeLast();
        java.lang.Object obj32 = linkedListTestDriver25.getFirst();
        linkedListTestDriver17.addFirst((java.lang.Object) linkedListTestDriver25);
        linkedListTestDriver9.add(2, (java.lang.Object) linkedListTestDriver25);
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.add(2, (java.lang.Object) 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 2; size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0 + "'", obj4, 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 'a' + "'", obj15, 'a');
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 1.0f + "'", obj23, 1.0f);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 0 + "'", obj24, 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 1.0f + "'", obj31, 1.0f);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 0 + "'", obj32, 0);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test045");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        java.lang.Object obj4 = linkedListTestDriver0.removeFirst();
        boolean boolean6 = linkedListTestDriver0.add((java.lang.Object) 100L);
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver8.add((int) (short) 0, (java.lang.Object) 0);
        linkedListTestDriver8.addFirst((java.lang.Object) 'a');
        java.lang.Object obj14 = linkedListTestDriver8.getFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver16 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver16.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean21 = linkedListTestDriver16.add((java.lang.Object) 1.0f);
        java.lang.Object obj22 = linkedListTestDriver16.removeLast();
        java.lang.Object obj23 = linkedListTestDriver16.getFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver24 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver24.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean29 = linkedListTestDriver24.add((java.lang.Object) 1.0f);
        java.lang.Object obj30 = linkedListTestDriver24.removeLast();
        java.lang.Object obj31 = linkedListTestDriver24.getFirst();
        linkedListTestDriver16.addFirst((java.lang.Object) linkedListTestDriver24);
        linkedListTestDriver8.add(2, (java.lang.Object) linkedListTestDriver24);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj34 = linkedListTestDriver0.set((int) (short) -1, (java.lang.Object) 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0 + "'", obj4, 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 'a' + "'", obj14, 'a');
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 1.0f + "'", obj22, 1.0f);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 0 + "'", obj23, 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + 1.0f + "'", obj30, 1.0f);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 0 + "'", obj31, 0);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test046");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        java.lang.Object obj4 = linkedListTestDriver0.removeFirst();
        linkedListTestDriver0.clear();
        boolean boolean7 = linkedListTestDriver0.remove((java.lang.Object) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = linkedListTestDriver0.getFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0 + "'", obj4, 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test047");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        linkedListTestDriver0.addFirst((java.lang.Object) 'a');
        experiment.util.Iterator iterator6 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver7.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean12 = linkedListTestDriver7.equals_CUT((java.lang.Object) 10);
        java.lang.Object obj13 = linkedListTestDriver7.removeFirst();
        boolean boolean14 = linkedListTestDriver7.isEmpty();
        boolean boolean15 = linkedListTestDriver7.isEmpty();
        boolean boolean16 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = linkedListTestDriver7.get((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 0 + "'", obj13, 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test048");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) (short) 0);
        boolean boolean4 = linkedListTestDriver0.contains((java.lang.Object) 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = linkedListTestDriver0.remove(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test049");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        java.lang.Object obj4 = linkedListTestDriver0.removeFirst();
        boolean boolean6 = linkedListTestDriver0.add((java.lang.Object) 100L);
        java.lang.Object obj8 = linkedListTestDriver0.remove((int) (short) 0);
        linkedListTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator11 = linkedListTestDriver0.listIterator((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: -1; size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0 + "'", obj4, 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 100L + "'", obj8, 100L);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test050");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) 1.0f);
        java.lang.Object obj6 = linkedListTestDriver0.removeLast();
        experiment.util.ListIterator listIterator8 = linkedListTestDriver0.listIterator(1);
        java.lang.Object obj9 = linkedListTestDriver0.removeLast();
        boolean boolean10 = linkedListTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = linkedListTestDriver0.removeLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0f + "'", obj6, 1.0f);
        org.junit.Assert.assertNotNull(listIterator8);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0 + "'", obj9, 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test051");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        linkedListTestDriver0.addFirst((java.lang.Object) 'a');
        java.lang.Object obj6 = linkedListTestDriver0.getLast();
        linkedListTestDriver0.addLast((java.lang.Object) (short) -1);
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver10.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean15 = linkedListTestDriver10.add((java.lang.Object) 1.0f);
        boolean boolean17 = linkedListTestDriver10.equals_CUT((java.lang.Object) 10.0f);
        experiment.util.ListIterator listIterator19 = linkedListTestDriver10.listIterator((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = linkedListTestDriver0.set(100, (java.lang.Object) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0 + "'", obj6, 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(listIterator19);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test052");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        linkedListTestDriver0.addFirst((java.lang.Object) 'a');
        experiment.util.Iterator iterator6 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver7.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean12 = linkedListTestDriver7.equals_CUT((java.lang.Object) 10);
        java.lang.Object obj13 = linkedListTestDriver7.removeFirst();
        boolean boolean14 = linkedListTestDriver7.isEmpty();
        boolean boolean15 = linkedListTestDriver7.isEmpty();
        boolean boolean16 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver7);
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray18 = linkedListTestDriver17.toArray();
        boolean boolean19 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = linkedListTestDriver17.removeFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 0 + "'", obj13, 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test053");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        linkedListTestDriver0.addFirst((java.lang.Object) 'a');
        experiment.util.Iterator iterator6 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver7.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean12 = linkedListTestDriver7.equals_CUT((java.lang.Object) 10);
        java.lang.Object obj13 = linkedListTestDriver7.removeFirst();
        boolean boolean14 = linkedListTestDriver7.isEmpty();
        boolean boolean15 = linkedListTestDriver7.isEmpty();
        boolean boolean16 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver7);
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray18 = linkedListTestDriver17.toArray();
        boolean boolean19 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = linkedListTestDriver17.removeLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 0 + "'", obj13, 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test054");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray1 = linkedListTestDriver0.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver3 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver3.add((int) (short) 0, (java.lang.Object) 0);
        linkedListTestDriver3.addFirst((java.lang.Object) 'a');
        experiment.util.Iterator iterator9 = linkedListTestDriver3.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver10.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean15 = linkedListTestDriver10.equals_CUT((java.lang.Object) 10);
        java.lang.Object obj16 = linkedListTestDriver10.removeFirst();
        boolean boolean17 = linkedListTestDriver10.isEmpty();
        boolean boolean18 = linkedListTestDriver10.isEmpty();
        boolean boolean19 = linkedListTestDriver3.contains((java.lang.Object) linkedListTestDriver10);
        int int20 = linkedListTestDriver3.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = linkedListTestDriver0.set(0, (java.lang.Object) int20);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0 + "'", obj16, 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test055");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        linkedListTestDriver0.addFirst((java.lang.Object) 'a');
        java.lang.Object obj6 = linkedListTestDriver0.getLast();
        java.lang.Object obj7 = linkedListTestDriver0.getFirst();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = linkedListTestDriver0.remove((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0 + "'", obj6, 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 'a' + "'", obj7, 'a');
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test056");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) 1.0f);
        java.lang.Object obj6 = linkedListTestDriver0.removeLast();
        boolean boolean7 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray9 = linkedListTestDriver8.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver10.add((int) (short) 0, (java.lang.Object) 0);
        linkedListTestDriver10.addFirst((java.lang.Object) 'a');
        experiment.util.Iterator iterator16 = linkedListTestDriver10.iterator();
        boolean boolean17 = linkedListTestDriver8.contains((java.lang.Object) iterator16);
        boolean boolean18 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver8);
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator20 = linkedListTestDriver8.listIterator(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 10; size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0f + "'", obj6, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test057");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean5 = linkedListTestDriver0.equals_CUT((java.lang.Object) 10);
        java.lang.Object obj6 = linkedListTestDriver0.removeFirst();
        experiment.util.Iterator iterator7 = linkedListTestDriver0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = linkedListTestDriver0.removeFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0 + "'", obj6, 0);
        org.junit.Assert.assertNotNull(iterator7);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test058");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean5 = linkedListTestDriver0.equals_CUT((java.lang.Object) 10);
        boolean boolean7 = linkedListTestDriver0.add((java.lang.Object) (short) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver8.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean13 = linkedListTestDriver8.equals_CUT((java.lang.Object) 10);
        boolean boolean15 = linkedListTestDriver8.add((java.lang.Object) (short) 1);
        linkedListTestDriver8.clear();
        boolean boolean17 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver8);
        experiment.util.LinkedListTestDriver linkedListTestDriver19 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver19.add((int) (short) 0, (java.lang.Object) 0);
        linkedListTestDriver19.addFirst((java.lang.Object) 'a');
        java.lang.Object obj25 = linkedListTestDriver19.getFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver27 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver27.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean32 = linkedListTestDriver27.add((java.lang.Object) 1.0f);
        java.lang.Object obj33 = linkedListTestDriver27.removeLast();
        java.lang.Object obj34 = linkedListTestDriver27.getFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver35 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver35.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean40 = linkedListTestDriver35.add((java.lang.Object) 1.0f);
        java.lang.Object obj41 = linkedListTestDriver35.removeLast();
        java.lang.Object obj42 = linkedListTestDriver35.getFirst();
        linkedListTestDriver27.addFirst((java.lang.Object) linkedListTestDriver35);
        linkedListTestDriver19.add(2, (java.lang.Object) linkedListTestDriver35);
        linkedListTestDriver35.clear();
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver8.add((int) (short) 1, (java.lang.Object) linkedListTestDriver35);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 1; size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 'a' + "'", obj25, 'a');
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + 1.0f + "'", obj33, 1.0f);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + 0 + "'", obj34, 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + 1.0f + "'", obj41, 1.0f);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + 0 + "'", obj42, 0);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test059");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        linkedListTestDriver0.addFirst((java.lang.Object) 'a');
        java.lang.Object obj6 = linkedListTestDriver0.getFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver7.add((int) (short) 0, (java.lang.Object) 0);
        java.lang.Object obj11 = linkedListTestDriver7.removeFirst();
        boolean boolean13 = linkedListTestDriver7.add((java.lang.Object) 100L);
        java.lang.Object obj15 = linkedListTestDriver7.remove((int) (short) 0);
        linkedListTestDriver7.clear();
        int int17 = linkedListTestDriver7.size();
        linkedListTestDriver0.addLast((java.lang.Object) int17);
        experiment.util.LinkedListTestDriver linkedListTestDriver20 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver20.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean25 = linkedListTestDriver20.add((java.lang.Object) 1.0f);
        java.lang.Object obj26 = linkedListTestDriver20.removeLast();
        experiment.util.ListIterator listIterator28 = linkedListTestDriver20.listIterator(1);
        java.lang.Object obj29 = linkedListTestDriver20.removeLast();
        boolean boolean30 = linkedListTestDriver20.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver31 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver31.add((int) (short) 0, (java.lang.Object) 0);
        java.lang.Object obj35 = linkedListTestDriver31.removeFirst();
        linkedListTestDriver31.clear();
        boolean boolean37 = linkedListTestDriver31.isEmpty();
        boolean boolean39 = linkedListTestDriver31.equals_CUT((java.lang.Object) 10L);
        boolean boolean41 = linkedListTestDriver31.add((java.lang.Object) (short) -1);
        java.lang.Object obj42 = linkedListTestDriver31.removeLast();
        java.lang.Object[] objArray43 = linkedListTestDriver31.toArray();
        boolean boolean44 = linkedListTestDriver20.remove((java.lang.Object) linkedListTestDriver31);
        experiment.util.LinkedListTestDriver linkedListTestDriver45 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver45.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean50 = linkedListTestDriver45.equals_CUT((java.lang.Object) 10);
        boolean boolean52 = linkedListTestDriver45.add((java.lang.Object) (short) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver53 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver53.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean58 = linkedListTestDriver53.equals_CUT((java.lang.Object) 10);
        boolean boolean60 = linkedListTestDriver53.add((java.lang.Object) (short) 1);
        linkedListTestDriver53.clear();
        boolean boolean62 = linkedListTestDriver45.add((java.lang.Object) linkedListTestDriver53);
        boolean boolean63 = linkedListTestDriver20.contains((java.lang.Object) linkedListTestDriver45);
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.add((int) (short) -1, (java.lang.Object) linkedListTestDriver45);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: -1; size: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 'a' + "'", obj6, 'a');
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 0 + "'", obj11, 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 100L + "'", obj15, 100L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 1.0f + "'", obj26, 1.0f);
        org.junit.Assert.assertNotNull(listIterator28);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 0 + "'", obj29, 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 0 + "'", obj35, 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + (short) -1 + "'", obj42, (short) -1);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray43), "[]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test060");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) 1.0f);
        java.lang.Object obj6 = linkedListTestDriver0.removeLast();
        experiment.util.ListIterator listIterator8 = linkedListTestDriver0.listIterator(1);
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator10 = linkedListTestDriver0.listIterator((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 100; size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0f + "'", obj6, 1.0f);
        org.junit.Assert.assertNotNull(listIterator8);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test061");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean5 = linkedListTestDriver0.equals_CUT((java.lang.Object) 10);
        java.lang.Object obj6 = linkedListTestDriver0.removeFirst();
        experiment.util.Iterator iterator7 = linkedListTestDriver0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = linkedListTestDriver0.remove((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0 + "'", obj6, 0);
        org.junit.Assert.assertNotNull(iterator7);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test062");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) 1.0f);
        java.lang.Object obj6 = linkedListTestDriver0.removeLast();
        boolean boolean7 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray9 = linkedListTestDriver8.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver10.add((int) (short) 0, (java.lang.Object) 0);
        linkedListTestDriver10.addFirst((java.lang.Object) 'a');
        experiment.util.Iterator iterator16 = linkedListTestDriver10.iterator();
        boolean boolean17 = linkedListTestDriver8.contains((java.lang.Object) iterator16);
        boolean boolean18 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver8);
        java.lang.Object obj20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = linkedListTestDriver0.set((int) (byte) 0, obj20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0f + "'", obj6, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test063");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        linkedListTestDriver0.addFirst((java.lang.Object) 'a');
        experiment.util.Iterator iterator6 = linkedListTestDriver0.iterator();
        experiment.util.Iterator iterator7 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver9.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean14 = linkedListTestDriver9.equals_CUT((java.lang.Object) 10);
        java.lang.Object obj15 = linkedListTestDriver9.removeFirst();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = linkedListTestDriver0.set((int) (byte) -1, obj15);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 0 + "'", obj15, 0);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test064");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        java.lang.Object obj4 = linkedListTestDriver0.removeFirst();
        boolean boolean6 = linkedListTestDriver0.add((java.lang.Object) 100L);
        java.lang.Object obj8 = linkedListTestDriver0.remove((int) (short) 0);
        linkedListTestDriver0.clear();
        linkedListTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = linkedListTestDriver0.remove((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0 + "'", obj4, 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 100L + "'", obj8, 100L);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test065");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) 1.0f);
        boolean boolean7 = linkedListTestDriver0.equals_CUT((java.lang.Object) 10.0f);
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver8.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean13 = linkedListTestDriver8.equals_CUT((java.lang.Object) 10);
        experiment.util.LinkedListTestDriver linkedListTestDriver14 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver14.add((int) (short) 0, (java.lang.Object) 0);
        java.lang.Object obj18 = linkedListTestDriver14.removeFirst();
        linkedListTestDriver14.clear();
        boolean boolean20 = linkedListTestDriver14.isEmpty();
        boolean boolean22 = linkedListTestDriver14.equals_CUT((java.lang.Object) 10L);
        linkedListTestDriver8.addFirst((java.lang.Object) linkedListTestDriver14);
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = linkedListTestDriver8.get((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 0 + "'", obj18, 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test066");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        java.lang.Object obj5 = linkedListTestDriver0.get(0);
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator7 = linkedListTestDriver0.listIterator((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: -1; size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 0 + "'", obj5, 0);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test067");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        linkedListTestDriver0.addFirst((java.lang.Object) 'a');
        java.lang.Object obj6 = linkedListTestDriver0.getFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver8.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean13 = linkedListTestDriver8.add((java.lang.Object) 1.0f);
        java.lang.Object obj14 = linkedListTestDriver8.removeLast();
        java.lang.Object obj15 = linkedListTestDriver8.getFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver16 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver16.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean21 = linkedListTestDriver16.add((java.lang.Object) 1.0f);
        java.lang.Object obj22 = linkedListTestDriver16.removeLast();
        java.lang.Object obj23 = linkedListTestDriver16.getFirst();
        linkedListTestDriver8.addFirst((java.lang.Object) linkedListTestDriver16);
        linkedListTestDriver0.add(2, (java.lang.Object) linkedListTestDriver16);
        linkedListTestDriver16.clear();
        experiment.util.Iterator iterator27 = linkedListTestDriver16.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj28 = linkedListTestDriver16.removeFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 'a' + "'", obj6, 'a');
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 1.0f + "'", obj14, 1.0f);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 0 + "'", obj15, 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 1.0f + "'", obj22, 1.0f);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 0 + "'", obj23, 0);
        org.junit.Assert.assertNotNull(iterator27);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test068");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        linkedListTestDriver0.addFirst((java.lang.Object) 'a');
        experiment.util.Iterator iterator6 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver7.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean12 = linkedListTestDriver7.equals_CUT((java.lang.Object) 10);
        java.lang.Object obj13 = linkedListTestDriver7.removeFirst();
        boolean boolean14 = linkedListTestDriver7.isEmpty();
        boolean boolean15 = linkedListTestDriver7.isEmpty();
        boolean boolean16 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver7);
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver17.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean22 = linkedListTestDriver17.add((java.lang.Object) (short) 10);
        linkedListTestDriver17.clear();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver17);
        java.lang.Object obj25 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = linkedListTestDriver0.add(obj25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 0 + "'", obj13, 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test069");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver1 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver1.add((int) (short) 0, (java.lang.Object) 0);
        linkedListTestDriver1.addFirst((java.lang.Object) 'a');
        boolean boolean7 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = linkedListTestDriver0.getLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test070");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        boolean boolean2 = linkedListTestDriver0.remove((java.lang.Object) (short) 0);
        boolean boolean4 = linkedListTestDriver0.contains((java.lang.Object) 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator6 = linkedListTestDriver0.listIterator((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: -1; size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test071");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) 1.0f);
        java.lang.Object obj6 = linkedListTestDriver0.removeLast();
        java.lang.Object[] objArray7 = linkedListTestDriver0.toArray();
        java.lang.Class<?> wildcardClass8 = linkedListTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0f + "'", obj6, 1.0f);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[0]");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test072");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        java.lang.Object obj4 = linkedListTestDriver0.removeFirst();
        linkedListTestDriver0.clear();
        boolean boolean6 = linkedListTestDriver0.isEmpty();
        boolean boolean8 = linkedListTestDriver0.equals_CUT((java.lang.Object) 10L);
        boolean boolean10 = linkedListTestDriver0.add((java.lang.Object) (short) -1);
        java.lang.Object obj11 = linkedListTestDriver0.removeLast();
        java.lang.Object[] objArray12 = linkedListTestDriver0.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver13 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver13.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean18 = linkedListTestDriver13.add((java.lang.Object) 1.0f);
        java.lang.Object obj19 = linkedListTestDriver13.removeLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver20 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver20.add((int) (short) 0, (java.lang.Object) 0);
        linkedListTestDriver20.addFirst((java.lang.Object) 'a');
        experiment.util.Iterator iterator26 = linkedListTestDriver20.iterator();
        linkedListTestDriver13.addFirst((java.lang.Object) iterator26);
        experiment.util.Iterator iterator28 = linkedListTestDriver13.iterator();
        boolean boolean29 = linkedListTestDriver0.equals_CUT((java.lang.Object) iterator28);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0 + "'", obj4, 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (short) -1 + "'", obj11, (short) -1);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 1.0f + "'", obj19, 1.0f);
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertNotNull(iterator28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test073");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        java.lang.Object[] objArray4 = linkedListTestDriver0.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = linkedListTestDriver0.remove((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0]");
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test074");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean5 = linkedListTestDriver0.equals_CUT((java.lang.Object) 10);
        boolean boolean7 = linkedListTestDriver0.add((java.lang.Object) (short) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver8.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean13 = linkedListTestDriver8.equals_CUT((java.lang.Object) 10);
        boolean boolean15 = linkedListTestDriver8.add((java.lang.Object) (short) 1);
        linkedListTestDriver8.clear();
        boolean boolean17 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver8);
        experiment.util.LinkedListTestDriver linkedListTestDriver18 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver18.add((int) (short) 0, (java.lang.Object) 0);
        linkedListTestDriver18.addFirst((java.lang.Object) 'a');
        experiment.util.Iterator iterator24 = linkedListTestDriver18.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver25 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver25.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean30 = linkedListTestDriver25.equals_CUT((java.lang.Object) 10);
        java.lang.Object obj31 = linkedListTestDriver25.removeFirst();
        boolean boolean32 = linkedListTestDriver25.isEmpty();
        boolean boolean33 = linkedListTestDriver25.isEmpty();
        boolean boolean34 = linkedListTestDriver18.contains((java.lang.Object) linkedListTestDriver25);
        experiment.util.LinkedListTestDriver linkedListTestDriver35 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver35.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean40 = linkedListTestDriver35.add((java.lang.Object) (short) 10);
        linkedListTestDriver35.clear();
        linkedListTestDriver18.addFirst((java.lang.Object) linkedListTestDriver35);
        java.lang.Object obj44 = linkedListTestDriver18.remove(1);
        boolean boolean45 = linkedListTestDriver8.equals_CUT(obj44);
        java.lang.Class<?> wildcardClass46 = obj44.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(iterator24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 0 + "'", obj31, 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + 'a' + "'", obj44, 'a');
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test075");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver1 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver1.add((int) (short) 0, (java.lang.Object) 0);
        linkedListTestDriver1.addFirst((java.lang.Object) 'a');
        boolean boolean7 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver1);
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver9.add((int) (short) 0, (java.lang.Object) 0);
        linkedListTestDriver9.addFirst((java.lang.Object) 'a');
        experiment.util.Iterator iterator15 = linkedListTestDriver9.iterator();
        experiment.util.Iterator iterator16 = linkedListTestDriver9.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver17.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean22 = linkedListTestDriver17.add((java.lang.Object) (short) 10);
        linkedListTestDriver17.clear();
        boolean boolean25 = linkedListTestDriver17.equals_CUT((java.lang.Object) 100.0f);
        boolean boolean26 = linkedListTestDriver9.add((java.lang.Object) linkedListTestDriver17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj27 = linkedListTestDriver0.set((int) (byte) 10, (java.lang.Object) linkedListTestDriver17);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test076");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        linkedListTestDriver0.addFirst((java.lang.Object) 'a');
        experiment.util.Iterator iterator6 = linkedListTestDriver0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = linkedListTestDriver0.remove((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator6);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test077");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        java.lang.Object obj5 = linkedListTestDriver0.get(0);
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver6.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean11 = linkedListTestDriver6.add((java.lang.Object) 1.0f);
        java.lang.Object obj12 = linkedListTestDriver6.removeLast();
        java.lang.Object obj13 = linkedListTestDriver6.getFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver14 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver14.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean19 = linkedListTestDriver14.add((java.lang.Object) 1.0f);
        java.lang.Object obj20 = linkedListTestDriver14.removeLast();
        java.lang.Object obj21 = linkedListTestDriver14.getFirst();
        linkedListTestDriver6.addFirst((java.lang.Object) linkedListTestDriver14);
        experiment.util.LinkedListTestDriver linkedListTestDriver23 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver23.add((int) (short) 0, (java.lang.Object) 0);
        linkedListTestDriver23.addFirst((java.lang.Object) 'a');
        java.lang.Object obj29 = linkedListTestDriver23.getLast();
        linkedListTestDriver23.clear();
        boolean boolean32 = linkedListTestDriver23.contains((java.lang.Object) 10.0d);
        boolean boolean33 = linkedListTestDriver14.equals_CUT((java.lang.Object) boolean32);
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver14);
        experiment.util.LinkedListTestDriver linkedListTestDriver35 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver35.add((int) (short) 0, (java.lang.Object) 0);
        java.lang.Object obj40 = linkedListTestDriver35.get(0);
        experiment.util.LinkedListTestDriver linkedListTestDriver41 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver41.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean46 = linkedListTestDriver41.add((java.lang.Object) 1.0f);
        java.lang.Object obj47 = linkedListTestDriver41.removeLast();
        java.lang.Object obj48 = linkedListTestDriver41.getFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver49 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver49.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean54 = linkedListTestDriver49.add((java.lang.Object) 1.0f);
        java.lang.Object obj55 = linkedListTestDriver49.removeLast();
        java.lang.Object obj56 = linkedListTestDriver49.getFirst();
        linkedListTestDriver41.addFirst((java.lang.Object) linkedListTestDriver49);
        experiment.util.LinkedListTestDriver linkedListTestDriver58 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver58.add((int) (short) 0, (java.lang.Object) 0);
        linkedListTestDriver58.addFirst((java.lang.Object) 'a');
        java.lang.Object obj64 = linkedListTestDriver58.getLast();
        linkedListTestDriver58.clear();
        boolean boolean67 = linkedListTestDriver58.contains((java.lang.Object) 10.0d);
        boolean boolean68 = linkedListTestDriver49.equals_CUT((java.lang.Object) boolean67);
        linkedListTestDriver35.addLast((java.lang.Object) linkedListTestDriver49);
        boolean boolean70 = linkedListTestDriver14.contains((java.lang.Object) linkedListTestDriver35);
        experiment.util.LinkedListTestDriver linkedListTestDriver71 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver72 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver72.add((int) (short) 0, (java.lang.Object) 0);
        linkedListTestDriver72.addFirst((java.lang.Object) 'a');
        boolean boolean78 = linkedListTestDriver71.remove((java.lang.Object) linkedListTestDriver72);
        boolean boolean79 = linkedListTestDriver35.equals_CUT((java.lang.Object) boolean78);
        java.lang.Object[] objArray80 = linkedListTestDriver35.toArray();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 0 + "'", obj5, 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 1.0f + "'", obj12, 1.0f);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 0 + "'", obj13, 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 1.0f + "'", obj20, 1.0f);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 0 + "'", obj21, 0);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 0 + "'", obj29, 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + 0 + "'", obj40, 0);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + 1.0f + "'", obj47, 1.0f);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + 0 + "'", obj48, 0);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertEquals("'" + obj55 + "' != '" + 1.0f + "'", obj55, 1.0f);
        org.junit.Assert.assertEquals("'" + obj56 + "' != '" + 0 + "'", obj56, 0);
        org.junit.Assert.assertEquals("'" + obj64 + "' != '" + 0 + "'", obj64, 0);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(objArray80);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test078");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) (short) 10);
        linkedListTestDriver0.clear();
        boolean boolean8 = linkedListTestDriver0.equals_CUT((java.lang.Object) 100.0f);
        linkedListTestDriver0.addFirst((java.lang.Object) 0.0f);
        java.lang.Object obj11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = linkedListTestDriver0.remove(obj11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test079");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) 1.0f);
        java.lang.Object obj6 = linkedListTestDriver0.removeLast();
        experiment.util.ListIterator listIterator8 = linkedListTestDriver0.listIterator(1);
        java.lang.Object obj9 = linkedListTestDriver0.removeLast();
        boolean boolean10 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver11.add((int) (short) 0, (java.lang.Object) 0);
        java.lang.Object obj15 = linkedListTestDriver11.removeFirst();
        linkedListTestDriver11.clear();
        boolean boolean17 = linkedListTestDriver11.isEmpty();
        boolean boolean19 = linkedListTestDriver11.equals_CUT((java.lang.Object) 10L);
        boolean boolean21 = linkedListTestDriver11.add((java.lang.Object) (short) -1);
        java.lang.Object obj22 = linkedListTestDriver11.removeLast();
        java.lang.Object[] objArray23 = linkedListTestDriver11.toArray();
        boolean boolean24 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver11);
        experiment.util.LinkedListTestDriver linkedListTestDriver26 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver26.add((int) (short) 0, (java.lang.Object) 0);
        java.lang.Object obj30 = linkedListTestDriver26.removeFirst();
        boolean boolean32 = linkedListTestDriver26.add((java.lang.Object) 100L);
        java.lang.Object obj34 = linkedListTestDriver26.remove((int) (short) 0);
        linkedListTestDriver26.clear();
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver11.add((int) 'a', (java.lang.Object) linkedListTestDriver26);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 97; size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0f + "'", obj6, 1.0f);
        org.junit.Assert.assertNotNull(listIterator8);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0 + "'", obj9, 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 0 + "'", obj15, 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (short) -1 + "'", obj22, (short) -1);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + 0 + "'", obj30, 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + 100L + "'", obj34, 100L);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test080");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        linkedListTestDriver0.addFirst((java.lang.Object) 'a');
        java.lang.Object obj6 = linkedListTestDriver0.getLast();
        linkedListTestDriver0.clear();
        boolean boolean9 = linkedListTestDriver0.contains((java.lang.Object) 10.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = linkedListTestDriver0.removeFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0 + "'", obj6, 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test081");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        java.lang.Object obj5 = linkedListTestDriver0.get(0);
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver6.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean11 = linkedListTestDriver6.add((java.lang.Object) 1.0f);
        java.lang.Object obj12 = linkedListTestDriver6.removeLast();
        java.lang.Object obj13 = linkedListTestDriver6.getFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver14 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver14.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean19 = linkedListTestDriver14.add((java.lang.Object) 1.0f);
        java.lang.Object obj20 = linkedListTestDriver14.removeLast();
        java.lang.Object obj21 = linkedListTestDriver14.getFirst();
        linkedListTestDriver6.addFirst((java.lang.Object) linkedListTestDriver14);
        experiment.util.LinkedListTestDriver linkedListTestDriver23 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver23.add((int) (short) 0, (java.lang.Object) 0);
        linkedListTestDriver23.addFirst((java.lang.Object) 'a');
        java.lang.Object obj29 = linkedListTestDriver23.getLast();
        linkedListTestDriver23.clear();
        boolean boolean32 = linkedListTestDriver23.contains((java.lang.Object) 10.0d);
        boolean boolean33 = linkedListTestDriver14.equals_CUT((java.lang.Object) boolean32);
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver14);
        experiment.util.LinkedListTestDriver linkedListTestDriver35 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver35.add((int) (short) 0, (java.lang.Object) 0);
        java.lang.Object obj40 = linkedListTestDriver35.get(0);
        experiment.util.LinkedListTestDriver linkedListTestDriver41 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver41.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean46 = linkedListTestDriver41.add((java.lang.Object) 1.0f);
        java.lang.Object obj47 = linkedListTestDriver41.removeLast();
        java.lang.Object obj48 = linkedListTestDriver41.getFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver49 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver49.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean54 = linkedListTestDriver49.add((java.lang.Object) 1.0f);
        java.lang.Object obj55 = linkedListTestDriver49.removeLast();
        java.lang.Object obj56 = linkedListTestDriver49.getFirst();
        linkedListTestDriver41.addFirst((java.lang.Object) linkedListTestDriver49);
        experiment.util.LinkedListTestDriver linkedListTestDriver58 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver58.add((int) (short) 0, (java.lang.Object) 0);
        linkedListTestDriver58.addFirst((java.lang.Object) 'a');
        java.lang.Object obj64 = linkedListTestDriver58.getLast();
        linkedListTestDriver58.clear();
        boolean boolean67 = linkedListTestDriver58.contains((java.lang.Object) 10.0d);
        boolean boolean68 = linkedListTestDriver49.equals_CUT((java.lang.Object) boolean67);
        linkedListTestDriver35.addLast((java.lang.Object) linkedListTestDriver49);
        boolean boolean70 = linkedListTestDriver14.contains((java.lang.Object) linkedListTestDriver35);
        experiment.util.LinkedListTestDriver linkedListTestDriver72 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver72.add((int) (short) 0, (java.lang.Object) 0);
        linkedListTestDriver72.addFirst((java.lang.Object) 'a');
        java.lang.Object obj78 = linkedListTestDriver72.getFirst();
        java.lang.Object obj79 = linkedListTestDriver72.removeFirst();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj80 = linkedListTestDriver35.set(2, (java.lang.Object) linkedListTestDriver72);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 0 + "'", obj5, 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 1.0f + "'", obj12, 1.0f);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 0 + "'", obj13, 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 1.0f + "'", obj20, 1.0f);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 0 + "'", obj21, 0);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 0 + "'", obj29, 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + 0 + "'", obj40, 0);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + 1.0f + "'", obj47, 1.0f);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + 0 + "'", obj48, 0);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertEquals("'" + obj55 + "' != '" + 1.0f + "'", obj55, 1.0f);
        org.junit.Assert.assertEquals("'" + obj56 + "' != '" + 0 + "'", obj56, 0);
        org.junit.Assert.assertEquals("'" + obj64 + "' != '" + 0 + "'", obj64, 0);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertEquals("'" + obj78 + "' != '" + 'a' + "'", obj78, 'a');
        org.junit.Assert.assertEquals("'" + obj79 + "' != '" + 'a' + "'", obj79, 'a');
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test082");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver1 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver1.add((int) (short) 0, (java.lang.Object) 0);
        linkedListTestDriver1.addFirst((java.lang.Object) 'a');
        boolean boolean7 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver1);
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver8.add((int) (short) 0, (java.lang.Object) 0);
        java.lang.Object obj12 = linkedListTestDriver8.removeFirst();
        linkedListTestDriver8.clear();
        boolean boolean15 = linkedListTestDriver8.remove((java.lang.Object) (byte) -1);
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver8);
        int int17 = linkedListTestDriver8.size();
        experiment.util.LinkedListTestDriver linkedListTestDriver19 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver19.add((int) (short) 0, (java.lang.Object) 0);
        linkedListTestDriver19.addFirst((java.lang.Object) 'a');
        java.lang.Object obj25 = linkedListTestDriver19.getLast();
        java.lang.Object[] objArray26 = linkedListTestDriver19.toArray();
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver8.add((int) (short) -1, (java.lang.Object) linkedListTestDriver19);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: -1; size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 0 + "'", obj12, 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 0 + "'", obj25, 0);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[a, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[a, 0]");
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test083");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray1 = linkedListTestDriver0.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver2 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver2.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean7 = linkedListTestDriver2.equals_CUT((java.lang.Object) 10);
        experiment.util.Iterator iterator8 = linkedListTestDriver2.iterator();
        java.lang.Object[] objArray9 = linkedListTestDriver2.toArray();
        boolean boolean10 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = linkedListTestDriver0.remove((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test084");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        linkedListTestDriver0.addFirst((java.lang.Object) 'a');
        experiment.util.Iterator iterator6 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver7.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean12 = linkedListTestDriver7.equals_CUT((java.lang.Object) 10);
        java.lang.Object obj13 = linkedListTestDriver7.removeFirst();
        boolean boolean14 = linkedListTestDriver7.isEmpty();
        boolean boolean15 = linkedListTestDriver7.isEmpty();
        boolean boolean16 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver7);
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver17.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean22 = linkedListTestDriver17.add((java.lang.Object) (short) 10);
        linkedListTestDriver17.clear();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver17);
        experiment.util.Iterator iterator25 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver26 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver26.add((int) (short) 0, (java.lang.Object) 0);
        linkedListTestDriver26.addFirst((java.lang.Object) 'a');
        experiment.util.Iterator iterator32 = linkedListTestDriver26.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver33 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver33.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean38 = linkedListTestDriver33.equals_CUT((java.lang.Object) 10);
        java.lang.Object obj39 = linkedListTestDriver33.removeFirst();
        boolean boolean40 = linkedListTestDriver33.isEmpty();
        boolean boolean41 = linkedListTestDriver33.isEmpty();
        boolean boolean42 = linkedListTestDriver26.contains((java.lang.Object) linkedListTestDriver33);
        experiment.util.LinkedListTestDriver linkedListTestDriver43 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver43.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean48 = linkedListTestDriver43.add((java.lang.Object) (short) 10);
        linkedListTestDriver43.clear();
        linkedListTestDriver26.addFirst((java.lang.Object) linkedListTestDriver43);
        boolean boolean51 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver43);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj53 = linkedListTestDriver43.get((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 0 + "'", obj13, 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(iterator25);
        org.junit.Assert.assertNotNull(iterator32);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + 0 + "'", obj39, 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test085");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        linkedListTestDriver0.addFirst((java.lang.Object) 'a');
        java.lang.Object obj6 = linkedListTestDriver0.getFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver7 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver7.add((int) (short) 0, (java.lang.Object) 0);
        java.lang.Object obj11 = linkedListTestDriver7.removeFirst();
        boolean boolean13 = linkedListTestDriver7.add((java.lang.Object) 100L);
        java.lang.Object obj15 = linkedListTestDriver7.remove((int) (short) 0);
        linkedListTestDriver7.clear();
        int int17 = linkedListTestDriver7.size();
        linkedListTestDriver0.addLast((java.lang.Object) int17);
        java.lang.Object obj19 = linkedListTestDriver0.getFirst();
        java.lang.Object obj20 = linkedListTestDriver0.removeLast();
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 'a' + "'", obj6, 'a');
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 0 + "'", obj11, 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 100L + "'", obj15, 100L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 'a' + "'", obj19, 'a');
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 0 + "'", obj20, 0);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test086");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean5 = linkedListTestDriver0.equals_CUT((java.lang.Object) 10);
        experiment.util.LinkedListTestDriver linkedListTestDriver6 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver6.add((int) (short) 0, (java.lang.Object) 0);
        java.lang.Object obj10 = linkedListTestDriver6.removeFirst();
        linkedListTestDriver6.clear();
        boolean boolean12 = linkedListTestDriver6.isEmpty();
        boolean boolean14 = linkedListTestDriver6.equals_CUT((java.lang.Object) 10L);
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver6);
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver17.add((int) (short) 0, (java.lang.Object) 0);
        java.lang.Object obj21 = linkedListTestDriver17.removeFirst();
        linkedListTestDriver17.clear();
        boolean boolean23 = linkedListTestDriver17.isEmpty();
        boolean boolean25 = linkedListTestDriver17.equals_CUT((java.lang.Object) 10L);
        experiment.util.LinkedListTestDriver linkedListTestDriver26 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver26.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean31 = linkedListTestDriver26.equals_CUT((java.lang.Object) 10);
        java.lang.Object obj32 = linkedListTestDriver26.removeFirst();
        java.lang.Object[] objArray33 = linkedListTestDriver26.toArray();
        experiment.util.Iterator iterator34 = linkedListTestDriver26.iterator();
        boolean boolean35 = linkedListTestDriver17.add((java.lang.Object) iterator34);
        java.lang.Class<?> wildcardClass36 = linkedListTestDriver17.getClass();
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.add((int) (byte) 100, (java.lang.Object) wildcardClass36);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 100; size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 0 + "'", obj10, 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 0 + "'", obj21, 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 0 + "'", obj32, 0);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[]");
        org.junit.Assert.assertNotNull(iterator34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test087");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray1 = linkedListTestDriver0.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver2 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver2.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean7 = linkedListTestDriver2.equals_CUT((java.lang.Object) 10);
        experiment.util.Iterator iterator8 = linkedListTestDriver2.iterator();
        java.lang.Object[] objArray9 = linkedListTestDriver2.toArray();
        boolean boolean10 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver2);
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver12.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean17 = linkedListTestDriver12.add((java.lang.Object) 1.0f);
        java.lang.Object obj18 = linkedListTestDriver12.removeLast();
        boolean boolean19 = linkedListTestDriver12.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver20 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray21 = linkedListTestDriver20.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver22 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver22.add((int) (short) 0, (java.lang.Object) 0);
        linkedListTestDriver22.addFirst((java.lang.Object) 'a');
        experiment.util.Iterator iterator28 = linkedListTestDriver22.iterator();
        boolean boolean29 = linkedListTestDriver20.contains((java.lang.Object) iterator28);
        boolean boolean30 = linkedListTestDriver12.contains((java.lang.Object) linkedListTestDriver20);
        experiment.util.LinkedListTestDriver linkedListTestDriver31 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver31.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean36 = linkedListTestDriver31.equals_CUT((java.lang.Object) 10);
        java.lang.Object obj37 = linkedListTestDriver31.removeFirst();
        linkedListTestDriver31.clear();
        boolean boolean39 = linkedListTestDriver12.remove((java.lang.Object) linkedListTestDriver31);
        experiment.util.Iterator iterator40 = linkedListTestDriver12.iterator();
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.add(100, (java.lang.Object) iterator40);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 100; size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 1.0f + "'", obj18, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertNotNull(iterator28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + 0 + "'", obj37, 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(iterator40);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test088");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) 1.0f);
        java.lang.Object obj6 = linkedListTestDriver0.removeLast();
        experiment.util.ListIterator listIterator8 = linkedListTestDriver0.listIterator(1);
        java.lang.Object obj9 = linkedListTestDriver0.removeLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver10.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean15 = linkedListTestDriver10.equals_CUT((java.lang.Object) 10);
        experiment.util.Iterator iterator16 = linkedListTestDriver10.iterator();
        java.lang.Object[] objArray17 = linkedListTestDriver10.toArray();
        linkedListTestDriver0.addFirst((java.lang.Object) objArray17);
        boolean boolean19 = linkedListTestDriver0.isEmpty();
        java.lang.Object obj21 = null;
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver0.add((int) (byte) 10, obj21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0f + "'", obj6, 1.0f);
        org.junit.Assert.assertNotNull(listIterator8);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0 + "'", obj9, 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test089");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        linkedListTestDriver0.addFirst((java.lang.Object) 'a');
        java.lang.Object obj6 = linkedListTestDriver0.getLast();
        int int7 = linkedListTestDriver0.size();
        java.lang.Object obj8 = linkedListTestDriver0.removeLast();
        linkedListTestDriver0.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver11.add((int) (short) 0, (java.lang.Object) 0);
        linkedListTestDriver11.addFirst((java.lang.Object) 'a');
        boolean boolean17 = linkedListTestDriver10.remove((java.lang.Object) linkedListTestDriver11);
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = linkedListTestDriver10.removeLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0 + "'", obj6, 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0 + "'", obj8, 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test090");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        linkedListTestDriver0.addFirst((java.lang.Object) 'a');
        java.lang.Object obj6 = linkedListTestDriver0.getLast();
        int int7 = linkedListTestDriver0.size();
        java.lang.Object obj8 = linkedListTestDriver0.removeLast();
        linkedListTestDriver0.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver11.add((int) (short) 0, (java.lang.Object) 0);
        linkedListTestDriver11.addFirst((java.lang.Object) 'a');
        boolean boolean17 = linkedListTestDriver10.remove((java.lang.Object) linkedListTestDriver11);
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = linkedListTestDriver10.removeFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0 + "'", obj6, 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0 + "'", obj8, 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test091");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) 1.0f);
        java.lang.Object obj6 = linkedListTestDriver0.removeLast();
        boolean boolean7 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray9 = linkedListTestDriver8.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver10.add((int) (short) 0, (java.lang.Object) 0);
        linkedListTestDriver10.addFirst((java.lang.Object) 'a');
        experiment.util.Iterator iterator16 = linkedListTestDriver10.iterator();
        boolean boolean17 = linkedListTestDriver8.contains((java.lang.Object) iterator16);
        boolean boolean18 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = linkedListTestDriver0.remove((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0f + "'", obj6, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test092");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean5 = linkedListTestDriver0.equals_CUT((java.lang.Object) 10);
        java.lang.Object obj6 = linkedListTestDriver0.removeFirst();
        java.lang.Object[] objArray7 = linkedListTestDriver0.toArray();
        experiment.util.Iterator iterator8 = linkedListTestDriver0.iterator();
        linkedListTestDriver0.addLast((java.lang.Object) 100.0d);
        boolean boolean11 = linkedListTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = linkedListTestDriver0.get((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0 + "'", obj6, 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test093");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean5 = linkedListTestDriver0.equals_CUT((java.lang.Object) 10);
        experiment.util.Iterator iterator6 = linkedListTestDriver0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator8 = linkedListTestDriver0.listIterator((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 52; size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(iterator6);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test094");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver1 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver1.add((int) (short) 0, (java.lang.Object) 0);
        linkedListTestDriver1.addFirst((java.lang.Object) 'a');
        boolean boolean7 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver1);
        java.lang.Object[] objArray8 = linkedListTestDriver1.toArray();
        java.lang.Object[] objArray9 = linkedListTestDriver1.toArray();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[a, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[a, 0]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[a, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[a, 0]");
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test095");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean5 = linkedListTestDriver0.equals_CUT((java.lang.Object) 10);
        java.lang.Object obj6 = linkedListTestDriver0.removeFirst();
        boolean boolean7 = linkedListTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = linkedListTestDriver0.get((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0 + "'", obj6, 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test096");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) 1.0f);
        java.lang.Object obj6 = linkedListTestDriver0.removeLast();
        boolean boolean7 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray9 = linkedListTestDriver8.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver10.add((int) (short) 0, (java.lang.Object) 0);
        linkedListTestDriver10.addFirst((java.lang.Object) 'a');
        experiment.util.Iterator iterator16 = linkedListTestDriver10.iterator();
        boolean boolean17 = linkedListTestDriver8.contains((java.lang.Object) iterator16);
        boolean boolean18 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver8);
        experiment.util.LinkedListTestDriver linkedListTestDriver19 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver19.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean24 = linkedListTestDriver19.equals_CUT((java.lang.Object) 10);
        java.lang.Object obj25 = linkedListTestDriver19.removeFirst();
        linkedListTestDriver19.clear();
        boolean boolean27 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver19);
        boolean boolean28 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver29 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver29.add((int) (short) 0, (java.lang.Object) 0);
        linkedListTestDriver29.addFirst((java.lang.Object) 'a');
        experiment.util.Iterator iterator35 = linkedListTestDriver29.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver36 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver36.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean41 = linkedListTestDriver36.equals_CUT((java.lang.Object) 10);
        java.lang.Object obj42 = linkedListTestDriver36.removeFirst();
        boolean boolean43 = linkedListTestDriver36.isEmpty();
        boolean boolean44 = linkedListTestDriver36.isEmpty();
        boolean boolean45 = linkedListTestDriver29.contains((java.lang.Object) linkedListTestDriver36);
        experiment.util.LinkedListTestDriver linkedListTestDriver46 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver46.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean51 = linkedListTestDriver46.add((java.lang.Object) 1.0f);
        java.lang.Object obj52 = linkedListTestDriver46.removeLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver53 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver53.add((int) (short) 0, (java.lang.Object) 0);
        linkedListTestDriver53.addFirst((java.lang.Object) 'a');
        experiment.util.Iterator iterator59 = linkedListTestDriver53.iterator();
        linkedListTestDriver46.addFirst((java.lang.Object) iterator59);
        experiment.util.Iterator iterator61 = linkedListTestDriver46.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver62 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver62.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean67 = linkedListTestDriver62.equals_CUT((java.lang.Object) 10);
        experiment.util.Iterator iterator68 = linkedListTestDriver62.iterator();
        java.lang.Object[] objArray69 = linkedListTestDriver62.toArray();
        linkedListTestDriver46.addFirst((java.lang.Object) objArray69);
        boolean boolean71 = linkedListTestDriver29.remove((java.lang.Object) linkedListTestDriver46);
        linkedListTestDriver0.addLast((java.lang.Object) boolean71);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0f + "'", obj6, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 0 + "'", obj25, 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(iterator35);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + 0 + "'", obj42, 0);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertEquals("'" + obj52 + "' != '" + 1.0f + "'", obj52, 1.0f);
        org.junit.Assert.assertNotNull(iterator59);
        org.junit.Assert.assertNotNull(iterator61);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(iterator68);
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray69), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray69), "[0]");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test097");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        linkedListTestDriver0.addFirst((java.lang.Object) 'a');
        java.lang.Object obj6 = linkedListTestDriver0.getLast();
        linkedListTestDriver0.addLast((java.lang.Object) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = linkedListTestDriver0.get((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0 + "'", obj6, 0);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test098");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        java.lang.Object obj4 = linkedListTestDriver0.removeFirst();
        linkedListTestDriver0.clear();
        boolean boolean7 = linkedListTestDriver0.remove((java.lang.Object) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = linkedListTestDriver0.get((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0 + "'", obj4, 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test099");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean5 = linkedListTestDriver0.equals_CUT((java.lang.Object) 10);
        java.lang.Object obj6 = linkedListTestDriver0.removeFirst();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = linkedListTestDriver0.get((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0 + "'", obj6, 0);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test100");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) 1.0f);
        boolean boolean7 = linkedListTestDriver0.equals_CUT((java.lang.Object) 10.0f);
        experiment.util.ListIterator listIterator9 = linkedListTestDriver0.listIterator((int) (short) 1);
        linkedListTestDriver0.clear();
        int int11 = linkedListTestDriver0.size();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(listIterator9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test101");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray1 = linkedListTestDriver0.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver2 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver2.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean7 = linkedListTestDriver2.add((java.lang.Object) 1.0f);
        java.lang.Object obj8 = linkedListTestDriver2.removeLast();
        boolean boolean9 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver2);
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver10.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean15 = linkedListTestDriver10.equals_CUT((java.lang.Object) 10);
        java.lang.Object obj16 = linkedListTestDriver10.removeFirst();
        java.lang.Object[] objArray17 = linkedListTestDriver10.toArray();
        experiment.util.Iterator iterator18 = linkedListTestDriver10.iterator();
        boolean boolean19 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver10);
        experiment.util.LinkedListTestDriver linkedListTestDriver20 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver20.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean25 = linkedListTestDriver20.equals_CUT((java.lang.Object) 10);
        boolean boolean27 = linkedListTestDriver20.add((java.lang.Object) (short) 1);
        experiment.util.LinkedListTestDriver linkedListTestDriver28 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver28.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean33 = linkedListTestDriver28.equals_CUT((java.lang.Object) 10);
        boolean boolean35 = linkedListTestDriver28.add((java.lang.Object) (short) 1);
        linkedListTestDriver28.clear();
        boolean boolean37 = linkedListTestDriver20.add((java.lang.Object) linkedListTestDriver28);
        boolean boolean38 = linkedListTestDriver10.contains((java.lang.Object) linkedListTestDriver28);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 1.0f + "'", obj8, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0 + "'", obj16, 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test102");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        linkedListTestDriver0.addFirst((java.lang.Object) 'a');
        java.lang.Object obj6 = linkedListTestDriver0.getLast();
        int int7 = linkedListTestDriver0.size();
        java.lang.Object obj8 = linkedListTestDriver0.removeLast();
        linkedListTestDriver0.clear();
        experiment.util.Iterator iterator10 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver11.add((int) (short) 0, (java.lang.Object) 0);
        java.lang.Object obj16 = linkedListTestDriver11.get(0);
        experiment.util.LinkedListTestDriver linkedListTestDriver17 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver17.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean22 = linkedListTestDriver17.add((java.lang.Object) 1.0f);
        java.lang.Object obj23 = linkedListTestDriver17.removeLast();
        java.lang.Object obj24 = linkedListTestDriver17.getFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver25 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver25.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean30 = linkedListTestDriver25.add((java.lang.Object) 1.0f);
        java.lang.Object obj31 = linkedListTestDriver25.removeLast();
        java.lang.Object obj32 = linkedListTestDriver25.getFirst();
        linkedListTestDriver17.addFirst((java.lang.Object) linkedListTestDriver25);
        experiment.util.LinkedListTestDriver linkedListTestDriver34 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver34.add((int) (short) 0, (java.lang.Object) 0);
        linkedListTestDriver34.addFirst((java.lang.Object) 'a');
        java.lang.Object obj40 = linkedListTestDriver34.getLast();
        linkedListTestDriver34.clear();
        boolean boolean43 = linkedListTestDriver34.contains((java.lang.Object) 10.0d);
        boolean boolean44 = linkedListTestDriver25.equals_CUT((java.lang.Object) boolean43);
        linkedListTestDriver11.addLast((java.lang.Object) linkedListTestDriver25);
        experiment.util.LinkedListTestDriver linkedListTestDriver46 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver46.add((int) (short) 0, (java.lang.Object) 0);
        java.lang.Object obj51 = linkedListTestDriver46.get(0);
        experiment.util.LinkedListTestDriver linkedListTestDriver52 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver52.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean57 = linkedListTestDriver52.add((java.lang.Object) 1.0f);
        java.lang.Object obj58 = linkedListTestDriver52.removeLast();
        java.lang.Object obj59 = linkedListTestDriver52.getFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver60 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver60.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean65 = linkedListTestDriver60.add((java.lang.Object) 1.0f);
        java.lang.Object obj66 = linkedListTestDriver60.removeLast();
        java.lang.Object obj67 = linkedListTestDriver60.getFirst();
        linkedListTestDriver52.addFirst((java.lang.Object) linkedListTestDriver60);
        experiment.util.LinkedListTestDriver linkedListTestDriver69 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver69.add((int) (short) 0, (java.lang.Object) 0);
        linkedListTestDriver69.addFirst((java.lang.Object) 'a');
        java.lang.Object obj75 = linkedListTestDriver69.getLast();
        linkedListTestDriver69.clear();
        boolean boolean78 = linkedListTestDriver69.contains((java.lang.Object) 10.0d);
        boolean boolean79 = linkedListTestDriver60.equals_CUT((java.lang.Object) boolean78);
        linkedListTestDriver46.addLast((java.lang.Object) linkedListTestDriver60);
        boolean boolean81 = linkedListTestDriver25.contains((java.lang.Object) linkedListTestDriver46);
        experiment.util.LinkedListTestDriver linkedListTestDriver82 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver82.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean87 = linkedListTestDriver82.add((java.lang.Object) 1.0f);
        java.lang.Object obj88 = linkedListTestDriver82.removeLast();
        experiment.util.ListIterator listIterator90 = linkedListTestDriver82.listIterator(1);
        java.lang.Object obj91 = linkedListTestDriver82.removeLast();
        experiment.util.Iterator iterator92 = linkedListTestDriver82.iterator();
        linkedListTestDriver25.addFirst((java.lang.Object) iterator92);
        boolean boolean94 = linkedListTestDriver0.equals_CUT((java.lang.Object) linkedListTestDriver25);
        int int95 = linkedListTestDriver25.size();
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0 + "'", obj6, 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0 + "'", obj8, 0);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0 + "'", obj16, 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 1.0f + "'", obj23, 1.0f);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 0 + "'", obj24, 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 1.0f + "'", obj31, 1.0f);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 0 + "'", obj32, 0);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + 0 + "'", obj40, 0);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + obj51 + "' != '" + 0 + "'", obj51, 0);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertEquals("'" + obj58 + "' != '" + 1.0f + "'", obj58, 1.0f);
        org.junit.Assert.assertEquals("'" + obj59 + "' != '" + 0 + "'", obj59, 0);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertEquals("'" + obj66 + "' != '" + 1.0f + "'", obj66, 1.0f);
        org.junit.Assert.assertEquals("'" + obj67 + "' != '" + 0 + "'", obj67, 0);
        org.junit.Assert.assertEquals("'" + obj75 + "' != '" + 0 + "'", obj75, 0);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertEquals("'" + obj88 + "' != '" + 1.0f + "'", obj88, 1.0f);
        org.junit.Assert.assertNotNull(listIterator90);
        org.junit.Assert.assertEquals("'" + obj91 + "' != '" + 0 + "'", obj91, 0);
        org.junit.Assert.assertNotNull(iterator92);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + 2 + "'", int95 == 2);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test103");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) 1.0f);
        java.lang.Object obj6 = linkedListTestDriver0.removeLast();
        experiment.util.ListIterator listIterator8 = linkedListTestDriver0.listIterator(1);
        java.lang.Object obj9 = linkedListTestDriver0.removeLast();
        boolean boolean10 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver11.add((int) (short) 0, (java.lang.Object) 0);
        java.lang.Object obj15 = linkedListTestDriver11.removeFirst();
        linkedListTestDriver11.clear();
        boolean boolean17 = linkedListTestDriver11.isEmpty();
        boolean boolean19 = linkedListTestDriver11.equals_CUT((java.lang.Object) 10L);
        boolean boolean21 = linkedListTestDriver11.add((java.lang.Object) (short) -1);
        java.lang.Object obj22 = linkedListTestDriver11.removeLast();
        java.lang.Object[] objArray23 = linkedListTestDriver11.toArray();
        boolean boolean24 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = linkedListTestDriver0.removeLast();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0f + "'", obj6, 1.0f);
        org.junit.Assert.assertNotNull(listIterator8);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0 + "'", obj9, 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 0 + "'", obj15, 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (short) -1 + "'", obj22, (short) -1);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test104");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) 1.0f);
        boolean boolean7 = linkedListTestDriver0.equals_CUT((java.lang.Object) 10.0f);
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver8.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean13 = linkedListTestDriver8.equals_CUT((java.lang.Object) 10);
        experiment.util.LinkedListTestDriver linkedListTestDriver14 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver14.add((int) (short) 0, (java.lang.Object) 0);
        java.lang.Object obj18 = linkedListTestDriver14.removeFirst();
        linkedListTestDriver14.clear();
        boolean boolean20 = linkedListTestDriver14.isEmpty();
        boolean boolean22 = linkedListTestDriver14.equals_CUT((java.lang.Object) 10L);
        linkedListTestDriver8.addFirst((java.lang.Object) linkedListTestDriver14);
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver8);
        java.lang.Object obj25 = linkedListTestDriver0.removeFirst();
        linkedListTestDriver0.clear();
        java.lang.Object obj28 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj29 = linkedListTestDriver0.set((int) (byte) 100, obj28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 0 + "'", obj18, 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(obj25);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test105");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        linkedListTestDriver0.addFirst((java.lang.Object) 'a');
        java.lang.Object obj6 = linkedListTestDriver0.getFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver8.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean13 = linkedListTestDriver8.add((java.lang.Object) 1.0f);
        java.lang.Object obj14 = linkedListTestDriver8.removeLast();
        java.lang.Object obj15 = linkedListTestDriver8.getFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver16 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver16.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean21 = linkedListTestDriver16.add((java.lang.Object) 1.0f);
        java.lang.Object obj22 = linkedListTestDriver16.removeLast();
        java.lang.Object obj23 = linkedListTestDriver16.getFirst();
        linkedListTestDriver8.addFirst((java.lang.Object) linkedListTestDriver16);
        linkedListTestDriver0.add(2, (java.lang.Object) linkedListTestDriver16);
        linkedListTestDriver16.clear();
        experiment.util.Iterator iterator27 = linkedListTestDriver16.iterator();
        boolean boolean28 = linkedListTestDriver16.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver29 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver29.add((int) (short) 0, (java.lang.Object) 0);
        java.lang.Object obj33 = linkedListTestDriver29.removeFirst();
        linkedListTestDriver29.clear();
        boolean boolean36 = linkedListTestDriver29.remove((java.lang.Object) (byte) -1);
        linkedListTestDriver29.clear();
        boolean boolean38 = linkedListTestDriver16.contains((java.lang.Object) linkedListTestDriver29);
        experiment.util.LinkedListTestDriver linkedListTestDriver40 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver40.add((int) (short) 0, (java.lang.Object) 0);
        experiment.util.LinkedListTestDriver linkedListTestDriver44 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver44.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean49 = linkedListTestDriver44.add((java.lang.Object) 1.0f);
        java.lang.Object obj50 = linkedListTestDriver44.removeLast();
        java.lang.Object obj51 = linkedListTestDriver44.getFirst();
        experiment.util.Iterator iterator52 = linkedListTestDriver44.iterator();
        boolean boolean53 = linkedListTestDriver40.add((java.lang.Object) iterator52);
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver29.add((int) (short) -1, (java.lang.Object) boolean53);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: -1; size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 'a' + "'", obj6, 'a');
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 1.0f + "'", obj14, 1.0f);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 0 + "'", obj15, 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 1.0f + "'", obj22, 1.0f);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 0 + "'", obj23, 0);
        org.junit.Assert.assertNotNull(iterator27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + 0 + "'", obj33, 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + 1.0f + "'", obj50, 1.0f);
        org.junit.Assert.assertEquals("'" + obj51 + "' != '" + 0 + "'", obj51, 0);
        org.junit.Assert.assertNotNull(iterator52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test106");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) 1.0f);
        java.lang.Object obj6 = linkedListTestDriver0.removeLast();
        boolean boolean7 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray9 = linkedListTestDriver8.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver10.add((int) (short) 0, (java.lang.Object) 0);
        linkedListTestDriver10.addFirst((java.lang.Object) 'a');
        experiment.util.Iterator iterator16 = linkedListTestDriver10.iterator();
        boolean boolean17 = linkedListTestDriver8.contains((java.lang.Object) iterator16);
        boolean boolean18 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver8);
        experiment.util.LinkedListTestDriver linkedListTestDriver19 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver19.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean24 = linkedListTestDriver19.equals_CUT((java.lang.Object) 10);
        java.lang.Object obj25 = linkedListTestDriver19.removeFirst();
        linkedListTestDriver19.clear();
        boolean boolean27 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver19);
        boolean boolean28 = linkedListTestDriver0.isEmpty();
        java.lang.Object obj29 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean30 = linkedListTestDriver0.remove(obj29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0f + "'", obj6, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 0 + "'", obj25, 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test107");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) 1.0f);
        java.lang.Object obj6 = linkedListTestDriver0.removeLast();
        java.lang.Object obj7 = linkedListTestDriver0.getFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver8.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean13 = linkedListTestDriver8.add((java.lang.Object) 1.0f);
        java.lang.Object obj14 = linkedListTestDriver8.removeLast();
        java.lang.Object obj15 = linkedListTestDriver8.getFirst();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver8);
        boolean boolean17 = linkedListTestDriver0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0f + "'", obj6, 1.0f);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0 + "'", obj7, 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 1.0f + "'", obj14, 1.0f);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 0 + "'", obj15, 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test108");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean5 = linkedListTestDriver0.equals_CUT((java.lang.Object) 10);
        experiment.util.Iterator iterator6 = linkedListTestDriver0.iterator();
        java.lang.Object[] objArray7 = linkedListTestDriver0.toArray();
        int int8 = linkedListTestDriver0.size();
        linkedListTestDriver0.clear();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test109");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        java.lang.Object obj4 = linkedListTestDriver0.removeFirst();
        boolean boolean6 = linkedListTestDriver0.contains((java.lang.Object) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = linkedListTestDriver0.get((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0 + "'", obj4, 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test110");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean5 = linkedListTestDriver0.equals_CUT((java.lang.Object) 10);
        java.lang.Object obj6 = linkedListTestDriver0.removeFirst();
        java.lang.Object[] objArray7 = linkedListTestDriver0.toArray();
        experiment.util.Iterator iterator8 = linkedListTestDriver0.iterator();
        linkedListTestDriver0.addLast((java.lang.Object) 100.0d);
        experiment.util.LinkedListTestDriver linkedListTestDriver11 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver11.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean16 = linkedListTestDriver11.equals_CUT((java.lang.Object) 10);
        java.lang.Object obj17 = linkedListTestDriver11.removeFirst();
        boolean boolean18 = linkedListTestDriver11.isEmpty();
        boolean boolean19 = linkedListTestDriver11.isEmpty();
        boolean boolean20 = linkedListTestDriver0.equals_CUT((java.lang.Object) boolean19);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0 + "'", obj6, 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 0 + "'", obj17, 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test111");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        linkedListTestDriver0.addFirst((java.lang.Object) 'a');
        java.lang.Object obj6 = linkedListTestDriver0.getFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver8.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean13 = linkedListTestDriver8.add((java.lang.Object) 1.0f);
        java.lang.Object obj14 = linkedListTestDriver8.removeLast();
        java.lang.Object obj15 = linkedListTestDriver8.getFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver16 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver16.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean21 = linkedListTestDriver16.add((java.lang.Object) 1.0f);
        java.lang.Object obj22 = linkedListTestDriver16.removeLast();
        java.lang.Object obj23 = linkedListTestDriver16.getFirst();
        linkedListTestDriver8.addFirst((java.lang.Object) linkedListTestDriver16);
        linkedListTestDriver0.add(2, (java.lang.Object) linkedListTestDriver16);
        linkedListTestDriver16.clear();
        experiment.util.Iterator iterator27 = linkedListTestDriver16.iterator();
        boolean boolean28 = linkedListTestDriver16.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver29 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver29.add((int) (short) 0, (java.lang.Object) 0);
        java.lang.Object obj33 = linkedListTestDriver29.removeFirst();
        linkedListTestDriver29.clear();
        boolean boolean36 = linkedListTestDriver29.remove((java.lang.Object) (byte) -1);
        linkedListTestDriver29.clear();
        boolean boolean38 = linkedListTestDriver16.contains((java.lang.Object) linkedListTestDriver29);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj39 = linkedListTestDriver29.getFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 'a' + "'", obj6, 'a');
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 1.0f + "'", obj14, 1.0f);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 0 + "'", obj15, 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 1.0f + "'", obj22, 1.0f);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 0 + "'", obj23, 0);
        org.junit.Assert.assertNotNull(iterator27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + 0 + "'", obj33, 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test112");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean5 = linkedListTestDriver0.equals_CUT((java.lang.Object) 10);
        experiment.util.Iterator iterator6 = linkedListTestDriver0.iterator();
        java.lang.Object[] objArray7 = linkedListTestDriver0.toArray();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator9 = linkedListTestDriver0.listIterator((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 97; size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[0]");
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test113");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        linkedListTestDriver0.addFirst((java.lang.Object) 'a');
        java.lang.Object obj6 = linkedListTestDriver0.getLast();
        int int7 = linkedListTestDriver0.size();
        java.lang.Object obj8 = linkedListTestDriver0.removeLast();
        linkedListTestDriver0.clear();
        experiment.util.Iterator iterator10 = linkedListTestDriver0.iterator();
        java.lang.Class<?> wildcardClass11 = linkedListTestDriver0.getClass();
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0 + "'", obj6, 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0 + "'", obj8, 0);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test114");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean5 = linkedListTestDriver0.equals_CUT((java.lang.Object) 10);
        boolean boolean6 = linkedListTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = linkedListTestDriver0.remove((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test115");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) 1.0f);
        java.lang.Object obj6 = linkedListTestDriver0.removeLast();
        java.lang.Object[] objArray7 = linkedListTestDriver0.toArray();
        java.lang.Object obj8 = linkedListTestDriver0.getLast();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0f + "'", obj6, 1.0f);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[0]");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0 + "'", obj8, 0);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test116");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        linkedListTestDriver0.addFirst((java.lang.Object) 'a');
        experiment.util.Iterator iterator6 = linkedListTestDriver0.iterator();
        java.lang.Object[] objArray7 = linkedListTestDriver0.toArray();
        java.lang.Object obj8 = linkedListTestDriver0.removeFirst();
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[a, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[a, 0]");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 'a' + "'", obj8, 'a');
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test117");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        experiment.util.LinkedListTestDriver linkedListTestDriver1 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver1.add((int) (short) 0, (java.lang.Object) 0);
        linkedListTestDriver1.addFirst((java.lang.Object) 'a');
        boolean boolean7 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver1);
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver8.add((int) (short) 0, (java.lang.Object) 0);
        java.lang.Object obj12 = linkedListTestDriver8.removeFirst();
        linkedListTestDriver8.clear();
        boolean boolean15 = linkedListTestDriver8.remove((java.lang.Object) (byte) -1);
        linkedListTestDriver0.addLast((java.lang.Object) linkedListTestDriver8);
        java.lang.Object obj17 = linkedListTestDriver0.removeLast();
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 0 + "'", obj12, 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test118");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) 1.0f);
        java.lang.Object obj6 = linkedListTestDriver0.removeLast();
        boolean boolean7 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray9 = linkedListTestDriver8.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver10.add((int) (short) 0, (java.lang.Object) 0);
        linkedListTestDriver10.addFirst((java.lang.Object) 'a');
        experiment.util.Iterator iterator16 = linkedListTestDriver10.iterator();
        boolean boolean17 = linkedListTestDriver8.contains((java.lang.Object) iterator16);
        boolean boolean18 = linkedListTestDriver0.contains((java.lang.Object) linkedListTestDriver8);
        experiment.util.LinkedListTestDriver linkedListTestDriver19 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver19.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean24 = linkedListTestDriver19.equals_CUT((java.lang.Object) 10);
        java.lang.Object obj25 = linkedListTestDriver19.removeFirst();
        linkedListTestDriver19.clear();
        boolean boolean27 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver19);
        experiment.util.LinkedListTestDriver linkedListTestDriver29 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver29.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean34 = linkedListTestDriver29.add((java.lang.Object) 1.0f);
        java.lang.Object obj35 = linkedListTestDriver29.removeLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver36 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver36.add((int) (short) 0, (java.lang.Object) 0);
        linkedListTestDriver36.addFirst((java.lang.Object) 'a');
        experiment.util.Iterator iterator42 = linkedListTestDriver36.iterator();
        linkedListTestDriver29.addFirst((java.lang.Object) iterator42);
        experiment.util.Iterator iterator44 = linkedListTestDriver29.iterator();
        java.lang.Object obj45 = linkedListTestDriver29.getLast();
        experiment.util.ListIterator listIterator47 = linkedListTestDriver29.listIterator((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            linkedListTestDriver19.add((int) (short) 10, (java.lang.Object) listIterator47);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 10; size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0f + "'", obj6, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 0 + "'", obj25, 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 1.0f + "'", obj35, 1.0f);
        org.junit.Assert.assertNotNull(iterator42);
        org.junit.Assert.assertNotNull(iterator44);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + 0 + "'", obj45, 0);
        org.junit.Assert.assertNotNull(listIterator47);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test119");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean5 = linkedListTestDriver0.equals_CUT((java.lang.Object) 10);
        experiment.util.Iterator iterator6 = linkedListTestDriver0.iterator();
        java.lang.Object[] objArray7 = linkedListTestDriver0.toArray();
        java.lang.Object obj8 = linkedListTestDriver0.getFirst();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[0]");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0 + "'", obj8, 0);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test120");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        linkedListTestDriver0.addFirst((java.lang.Object) 'a');
        java.lang.Object obj6 = linkedListTestDriver0.getFirst();
        java.lang.Object obj7 = linkedListTestDriver0.removeFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver9.add((int) (short) 0, (java.lang.Object) 0);
        java.lang.Object obj14 = linkedListTestDriver9.get(0);
        java.lang.Object obj15 = linkedListTestDriver0.set((int) (byte) 0, obj14);
        experiment.util.LinkedListTestDriver linkedListTestDriver16 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver16.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean21 = linkedListTestDriver16.add((java.lang.Object) 1.0f);
        java.lang.Object obj22 = linkedListTestDriver16.removeLast();
        experiment.util.LinkedListTestDriver linkedListTestDriver23 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver23.add((int) (short) 0, (java.lang.Object) 0);
        linkedListTestDriver23.addFirst((java.lang.Object) 'a');
        experiment.util.Iterator iterator29 = linkedListTestDriver23.iterator();
        linkedListTestDriver16.addFirst((java.lang.Object) iterator29);
        experiment.util.Iterator iterator31 = linkedListTestDriver16.iterator();
        java.lang.Object obj32 = linkedListTestDriver16.getLast();
        boolean boolean33 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver16);
        java.lang.Object obj35 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj36 = linkedListTestDriver0.set(3, obj35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 'a' + "'", obj6, 'a');
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 'a' + "'", obj7, 'a');
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 0 + "'", obj14, 0);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 0 + "'", obj15, 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 1.0f + "'", obj22, 1.0f);
        org.junit.Assert.assertNotNull(iterator29);
        org.junit.Assert.assertNotNull(iterator31);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 0 + "'", obj32, 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test121");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean5 = linkedListTestDriver0.equals_CUT((java.lang.Object) 10);
        java.lang.Object obj6 = linkedListTestDriver0.removeFirst();
        java.lang.Object[] objArray7 = linkedListTestDriver0.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver9 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver9.add((int) (short) 0, (java.lang.Object) 0);
        linkedListTestDriver9.addFirst((java.lang.Object) 'a');
        experiment.util.Iterator iterator15 = linkedListTestDriver9.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver16 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver16.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean21 = linkedListTestDriver16.equals_CUT((java.lang.Object) 10);
        java.lang.Object obj22 = linkedListTestDriver16.removeFirst();
        boolean boolean23 = linkedListTestDriver16.isEmpty();
        boolean boolean24 = linkedListTestDriver16.isEmpty();
        boolean boolean25 = linkedListTestDriver9.contains((java.lang.Object) linkedListTestDriver16);
        experiment.util.LinkedListTestDriver linkedListTestDriver26 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver26.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean31 = linkedListTestDriver26.add((java.lang.Object) (short) 10);
        linkedListTestDriver26.clear();
        linkedListTestDriver9.addFirst((java.lang.Object) linkedListTestDriver26);
        java.lang.Object obj35 = linkedListTestDriver9.remove(1);
        java.lang.Object obj36 = linkedListTestDriver9.getLast();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj37 = linkedListTestDriver0.set((int) (byte) -1, obj36);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0 + "'", obj6, 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 0 + "'", obj22, 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 'a' + "'", obj35, 'a');
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + 0 + "'", obj36, 0);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test122");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        linkedListTestDriver0.addFirst((java.lang.Object) 'a');
        experiment.util.Iterator iterator6 = linkedListTestDriver0.iterator();
        experiment.util.Iterator iterator7 = linkedListTestDriver0.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver8.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean13 = linkedListTestDriver8.add((java.lang.Object) (short) 10);
        linkedListTestDriver8.clear();
        boolean boolean16 = linkedListTestDriver8.equals_CUT((java.lang.Object) 100.0f);
        boolean boolean17 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = linkedListTestDriver8.getFirst();
            org.junit.Assert.fail("Expected exception of type experiment.util.NoSuchElementException; message: null");
        } catch (experiment.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test123");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray1 = linkedListTestDriver0.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver2 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver2.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean7 = linkedListTestDriver2.add((java.lang.Object) 1.0f);
        java.lang.Object obj8 = linkedListTestDriver2.removeLast();
        boolean boolean9 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver2);
        java.lang.Object obj10 = linkedListTestDriver0.getLast();
        java.lang.Object obj11 = linkedListTestDriver0.removeLast();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator13 = linkedListTestDriver0.listIterator(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: getNode index: 2; size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 1.0f + "'", obj8, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test124");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray1 = linkedListTestDriver0.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver2 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver2.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean7 = linkedListTestDriver2.add((java.lang.Object) 1.0f);
        java.lang.Object obj8 = linkedListTestDriver2.removeLast();
        boolean boolean9 = linkedListTestDriver0.add((java.lang.Object) linkedListTestDriver2);
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver10.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean15 = linkedListTestDriver10.equals_CUT((java.lang.Object) 10);
        java.lang.Object obj16 = linkedListTestDriver10.removeFirst();
        java.lang.Object[] objArray17 = linkedListTestDriver10.toArray();
        experiment.util.Iterator iterator18 = linkedListTestDriver10.iterator();
        boolean boolean19 = linkedListTestDriver0.remove((java.lang.Object) linkedListTestDriver10);
        experiment.util.LinkedListTestDriver linkedListTestDriver20 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver20.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean25 = linkedListTestDriver20.add((java.lang.Object) 1.0f);
        java.lang.Object obj26 = linkedListTestDriver20.removeLast();
        java.lang.Object obj27 = linkedListTestDriver20.getFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver28 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver28.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean33 = linkedListTestDriver28.add((java.lang.Object) 1.0f);
        java.lang.Object obj34 = linkedListTestDriver28.removeLast();
        java.lang.Object obj35 = linkedListTestDriver28.getFirst();
        linkedListTestDriver20.addFirst((java.lang.Object) linkedListTestDriver28);
        linkedListTestDriver10.addFirst((java.lang.Object) linkedListTestDriver20);
        boolean boolean39 = linkedListTestDriver20.add((java.lang.Object) true);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 1.0f + "'", obj8, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0 + "'", obj16, 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 1.0f + "'", obj26, 1.0f);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 0 + "'", obj27, 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + 1.0f + "'", obj34, 1.0f);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 0 + "'", obj35, 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test125");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) 1.0f);
        java.lang.Object obj6 = linkedListTestDriver0.removeLast();
        java.lang.Object obj7 = linkedListTestDriver0.getFirst();
        experiment.util.Iterator iterator8 = linkedListTestDriver0.iterator();
        boolean boolean9 = linkedListTestDriver0.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray11 = linkedListTestDriver10.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver12 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver12.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean17 = linkedListTestDriver12.add((java.lang.Object) 1.0f);
        java.lang.Object obj18 = linkedListTestDriver12.removeLast();
        boolean boolean19 = linkedListTestDriver10.add((java.lang.Object) linkedListTestDriver12);
        experiment.util.LinkedListTestDriver linkedListTestDriver20 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver20.add((int) (short) 0, (java.lang.Object) 0);
        java.lang.Object obj25 = linkedListTestDriver20.get(0);
        experiment.util.LinkedListTestDriver linkedListTestDriver26 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver26.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean31 = linkedListTestDriver26.add((java.lang.Object) 1.0f);
        java.lang.Object obj32 = linkedListTestDriver26.removeLast();
        java.lang.Object obj33 = linkedListTestDriver26.getFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver34 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver34.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean39 = linkedListTestDriver34.add((java.lang.Object) 1.0f);
        java.lang.Object obj40 = linkedListTestDriver34.removeLast();
        java.lang.Object obj41 = linkedListTestDriver34.getFirst();
        linkedListTestDriver26.addFirst((java.lang.Object) linkedListTestDriver34);
        experiment.util.LinkedListTestDriver linkedListTestDriver43 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver43.add((int) (short) 0, (java.lang.Object) 0);
        linkedListTestDriver43.addFirst((java.lang.Object) 'a');
        java.lang.Object obj49 = linkedListTestDriver43.getLast();
        linkedListTestDriver43.clear();
        boolean boolean52 = linkedListTestDriver43.contains((java.lang.Object) 10.0d);
        boolean boolean53 = linkedListTestDriver34.equals_CUT((java.lang.Object) boolean52);
        linkedListTestDriver20.addLast((java.lang.Object) linkedListTestDriver34);
        boolean boolean55 = linkedListTestDriver12.add((java.lang.Object) linkedListTestDriver34);
        linkedListTestDriver0.addFirst((java.lang.Object) boolean55);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0f + "'", obj6, 1.0f);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0 + "'", obj7, 0);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 1.0f + "'", obj18, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 0 + "'", obj25, 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 1.0f + "'", obj32, 1.0f);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + 0 + "'", obj33, 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + 1.0f + "'", obj40, 1.0f);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + 0 + "'", obj41, 0);
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + 0 + "'", obj49, 0);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test126");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) 1.0f);
        boolean boolean7 = linkedListTestDriver0.equals_CUT((java.lang.Object) 10.0f);
        experiment.util.LinkedListTestDriver linkedListTestDriver8 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver8.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean13 = linkedListTestDriver8.equals_CUT((java.lang.Object) 10);
        experiment.util.LinkedListTestDriver linkedListTestDriver14 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver14.add((int) (short) 0, (java.lang.Object) 0);
        java.lang.Object obj18 = linkedListTestDriver14.removeFirst();
        linkedListTestDriver14.clear();
        boolean boolean20 = linkedListTestDriver14.isEmpty();
        boolean boolean22 = linkedListTestDriver14.equals_CUT((java.lang.Object) 10L);
        linkedListTestDriver8.addFirst((java.lang.Object) linkedListTestDriver14);
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver8);
        java.lang.Object obj25 = linkedListTestDriver0.removeFirst();
        linkedListTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj28 = linkedListTestDriver0.get((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 0 + "'", obj18, 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(obj25);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test127");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean5 = linkedListTestDriver0.add((java.lang.Object) 1.0f);
        java.lang.Object obj6 = linkedListTestDriver0.removeLast();
        experiment.util.ListIterator listIterator8 = linkedListTestDriver0.listIterator(1);
        java.lang.Object obj9 = linkedListTestDriver0.removeLast();
        experiment.util.Iterator iterator10 = linkedListTestDriver0.iterator();
        java.lang.Object[] objArray11 = linkedListTestDriver0.toArray();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0f + "'", obj6, 1.0f);
        org.junit.Assert.assertNotNull(listIterator8);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0 + "'", obj9, 0);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_LinkedListTest_1321793073_1024_0.test128");
        experiment.util.LinkedListTestDriver linkedListTestDriver0 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver0.add((int) (short) 0, (java.lang.Object) 0);
        java.lang.Object obj4 = linkedListTestDriver0.removeFirst();
        boolean boolean6 = linkedListTestDriver0.add((java.lang.Object) 100L);
        java.lang.Object obj8 = linkedListTestDriver0.remove((int) (short) 0);
        linkedListTestDriver0.clear();
        experiment.util.LinkedListTestDriver linkedListTestDriver10 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver10.add((int) (short) 0, (java.lang.Object) 0);
        linkedListTestDriver10.addFirst((java.lang.Object) 'a');
        java.lang.Object obj16 = linkedListTestDriver10.getFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver18 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver18.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean23 = linkedListTestDriver18.add((java.lang.Object) 1.0f);
        java.lang.Object obj24 = linkedListTestDriver18.removeLast();
        java.lang.Object obj25 = linkedListTestDriver18.getFirst();
        experiment.util.LinkedListTestDriver linkedListTestDriver26 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver26.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean31 = linkedListTestDriver26.add((java.lang.Object) 1.0f);
        java.lang.Object obj32 = linkedListTestDriver26.removeLast();
        java.lang.Object obj33 = linkedListTestDriver26.getFirst();
        linkedListTestDriver18.addFirst((java.lang.Object) linkedListTestDriver26);
        linkedListTestDriver10.add(2, (java.lang.Object) linkedListTestDriver26);
        linkedListTestDriver26.clear();
        experiment.util.Iterator iterator37 = linkedListTestDriver26.iterator();
        experiment.util.LinkedListTestDriver linkedListTestDriver39 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver39.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean44 = linkedListTestDriver39.add((java.lang.Object) 1.0f);
        java.lang.Object obj45 = linkedListTestDriver39.removeLast();
        boolean boolean46 = linkedListTestDriver39.isEmpty();
        experiment.util.LinkedListTestDriver linkedListTestDriver47 = new experiment.util.LinkedListTestDriver();
        java.lang.Object[] objArray48 = linkedListTestDriver47.toArray();
        experiment.util.LinkedListTestDriver linkedListTestDriver49 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver49.add((int) (short) 0, (java.lang.Object) 0);
        linkedListTestDriver49.addFirst((java.lang.Object) 'a');
        experiment.util.Iterator iterator55 = linkedListTestDriver49.iterator();
        boolean boolean56 = linkedListTestDriver47.contains((java.lang.Object) iterator55);
        boolean boolean57 = linkedListTestDriver39.contains((java.lang.Object) linkedListTestDriver47);
        experiment.util.LinkedListTestDriver linkedListTestDriver58 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver58.add((int) (short) 0, (java.lang.Object) 0);
        boolean boolean63 = linkedListTestDriver58.equals_CUT((java.lang.Object) 10);
        java.lang.Object obj64 = linkedListTestDriver58.removeFirst();
        linkedListTestDriver58.clear();
        boolean boolean66 = linkedListTestDriver39.remove((java.lang.Object) linkedListTestDriver58);
        linkedListTestDriver26.add(0, (java.lang.Object) linkedListTestDriver39);
        boolean boolean68 = linkedListTestDriver0.equals_CUT((java.lang.Object) linkedListTestDriver26);
        experiment.util.LinkedListTestDriver linkedListTestDriver69 = new experiment.util.LinkedListTestDriver();
        linkedListTestDriver69.add((int) (short) 0, (java.lang.Object) 0);
        java.lang.Object obj73 = linkedListTestDriver69.removeFirst();
        boolean boolean75 = linkedListTestDriver69.add((java.lang.Object) 100L);
        java.lang.Object obj77 = linkedListTestDriver69.remove((int) (short) 0);
        linkedListTestDriver69.clear();
        int int79 = linkedListTestDriver69.size();
        linkedListTestDriver0.addFirst((java.lang.Object) linkedListTestDriver69);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 0 + "'", obj4, 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 100L + "'", obj8, 100L);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 'a' + "'", obj16, 'a');
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 1.0f + "'", obj24, 1.0f);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 0 + "'", obj25, 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 1.0f + "'", obj32, 1.0f);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + 0 + "'", obj33, 0);
        org.junit.Assert.assertNotNull(iterator37);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + 1.0f + "'", obj45, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray48), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray48), "[]");
        org.junit.Assert.assertNotNull(iterator55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertEquals("'" + obj64 + "' != '" + 0 + "'", obj64, 0);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertEquals("'" + obj73 + "' != '" + 0 + "'", obj73, 0);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertEquals("'" + obj77 + "' != '" + 100L + "'", obj77, 100L);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
    }

}
